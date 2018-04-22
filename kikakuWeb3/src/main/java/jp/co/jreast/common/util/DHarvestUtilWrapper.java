package jp.co.jreast.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jp.co.jreast.common.JreConstants;

/**
 * D��ʗpHarvestUtil���b�p�[�N���X
 *
 * <pre>
 *   �@�\�T�v �F
 *   ���L���� �F D��ʂɂ������������I�[�o�[���C�h����ꍇ�͂����Ɏ�������B
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
	//     *            ���o�����B���ۂ̌^��Map<String, Object>�ŁA�L�[�ɗ񖼁iDB�񕨗����j�A�l�ɏ����l���w�肷��B
	//     *            {@link StatParamter#StatParamter(String, String, Map)} AND ��
	//     *            = �����l �ŏ������ǉ������B�����w��\�B
	//     * @return TODO
	//     * @throws BusinessException
	//     *             �Ɩ���O
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
	 *            ���񓚘A��
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
	 *            ���񓚘A��
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
