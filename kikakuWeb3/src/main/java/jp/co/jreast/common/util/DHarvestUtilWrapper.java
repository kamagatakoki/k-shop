package jp.co.jreast.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jp.co.jreast.common.JreConstants;

/**
 * D画面用HarvestUtilラッパークラス
 *
 * <pre>
 *   機能概要 ：
 *   特記事項 ： D画面により既存実装をオーバーライドする場合はここに実装する。
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public abstract class DHarvestUtilWrapper extends HarvestUtil {

	//    /**
	//     * TODO
	//     *
	//     * <pre></pre>
	//     *
	//     * @param conditions
	//     *            抽出条件。実際の型はMap<String, Object>で、キーに列名（DB列物理名）、値に条件値を指定する。
	//     *            {@link StatParamter#StatParamter(String, String, Map)} AND 列名
	//     *            = 条件値 で条件が追加される。複数指定可能。
	//     * @return TODO
	//     * @throws BusinessException
	//     *             業務例外
	//     */
	//    public static String getIdentPlanNo(Map<?, ?> conditions)
	//            throws BusinessException {
	//
	//        String result = getStatStringResult("D_PLAN_NO", "MAX", "PLAN_NO",
	//                conditions);
	//        return identPlanNo(result);
	//    }

	/**
	 * TODO
	 *
	 * <pre></pre>
	 *
	 * @param planAnsNo
	 *            企画回答連番
	 * @return TODO
	 */
	public static Long getMaxCareer(long planAnsNo) {
		HashMap<String, String> con = new HashMap<>();
		con.put("PLAN_ANS_NO", Long.toString(planAnsNo));
		return getMax("D_PLAN_ANS", "CAREER_NO", con);
	}

	/**
	 * TODO
	 *
	 * <pre></pre>
	 *
	 * @param planAnsNo
	 *            企画回答連番
	 * @return TODO
	 */
	public static boolean isDonePlan(long planAnsNo) {

		StatParamter param = new StatParamter("D_PLAN_ANS", "*");
		List<Condition> conSet = new ArrayList<>();
		conSet.add(new Condition("PLAN_ANS_NO", new Long(planAnsNo)));
		conSet.add(new Condition("STATUS", JreConstants.STATUS_FM_FINISH));
		conSet.add(new Condition("NO2_STATUS", JreConstants.STATUS_APPROVE));
		conSet.add(new Condition("NO3_STATUS", JreConstants.STATUS_APPROVE));
		conSet.add(new Condition("NO5_STATUS", JreConstants.STATUS_APPROVE));
		param.setConSet(conSet);
		return getCount(param) > 0;
	}

}
