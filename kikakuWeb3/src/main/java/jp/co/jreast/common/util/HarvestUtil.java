package jp.co.jreast.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.intage.framework.exception.BusinessException;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.AnsSearchData;

/**
 * <pre>
 * データベースを捜索用ツール。.
 * 機能概要    ：  無し
 * 特記事項    ：  無し
 * </pre>
 * @author Xbl
 *
 */
public class HarvestUtil {
	/**
	 *
	 * @param tableName table name
	 * @param conditions condition collection
	 * @return stat result
	 */
	public static Long getCount(String tableName, Map conditions) {
		return getStatResult(tableName, "Count", null, conditions);
	}

	/**
	 * このfieldの最大値を取得 .
	 * @param tableName table name
	 * @param field field name
	 * @param conditions condition collection
	 * @return max value
	 */
	public static Long getMax(String tableName, String field, Map conditions) {

		return getStatResult(tableName, "Max", field, conditions);
	}

	/**
	 *
	 * @param param stat paramter
	 * @return max value
	 * @throws BusinessException business exception
	 */
	public static Long getMax(StatParamter param) throws BusinessException {
		param.setFunction("MAX");
		return getStatResult(param);
	}

	/**
	 * 最小データの取得.
	 * @param param 状態
	 * @return	最小値
	 * @throws BusinessException 業務例外
	 */
	public static Long getMin(StatParamter param) throws BusinessException {
		param.setFunction("MIN");
		return getStatResult(param);
	}

	/**
	 *
	 * @param param stat paramter
	 * @return count
	 */
	public static long getCount(StatParamter param) {
		param.setFunction("COUNT");
		return getStatResult(param).longValue();
	}

	/**
	 *
	 * @param planNo plan_no
	 * @return max career_no
	 */
	public static Long getMaxCareer(long planNo) {
		HashMap con = new HashMap();
		con.put("PLAN_ANS_NO", Long.toString(planNo));
		return getMax("A_PLAN_ANS", "CAREER_NO", con);
	}

	/**
	 *
	 * @param tableName table name
	 * @param function stat function
	 * @param field field name
	 * @param conditions condition collection
	 * @return stat result
	 */
	public static Long getStatResult(String tableName, String function,
			String field, Map conditions) {
		StatParamter paramter = new StatParamter(tableName, function,
				conditions);
		paramter.setField(field);
		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		SimpleData data = (SimpleData) dao.queryForObject("Stat", paramter);
		return data.getLongValue();
	}

	/**
	 *
	 * @param para stat paramter
	 * @return stat result
	 */
	public static Long getStatResult(StatParamter para) {

		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		SimpleData data = (SimpleData) dao.queryForObject("Stat", para);
		return data.getLongValue();
	}

	/**
	 *
	 * @param tableName table name
	 * @param function stat function
	 * @param field field name
	 * @param conditions condition collection
	 * @return stat result
	 */
	public static String getStatStringResult(String tableName, String function,
			String field, Map conditions) {
		StatParamter paramter = new StatParamter(tableName, function,
				conditions);
		paramter.setField(field);
		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		SimpleData data = (SimpleData) dao.queryForObject("StringStat",
				paramter);
		return data.getStringValue();
	}

	/**
	 *
	 * @param para stat paramter
	 * @return stat result
	 */
	public static String getStatStringResult(StatParamter para) {

		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		SimpleData data = (SimpleData) dao.queryForObject("StringStat", para);
		return data.getStringValue();
	}

	/**
	 *
	 * @param conditions condition collection
	 * @return plan_no
	 * @throws BusinessException business exception
	 */
	public static String getIdentPlanNo(Map conditions) throws BusinessException {

		String result = getStatStringResult("A_PLAN_NO", "MAX", "PLAN_NO",
				conditions);
		return identPlanNo(result);
	}

	/**
	 *
	 * @param kindFlg kind_flg
	 * @param facilityNo acility_no
	 * @param branchCd branch_cd
	 * @param yearNo year_no
	 * @param seasonDiv season_div
	 * @param planAnsNo plan_ans_no
	 * @return plan_no
	 * @throws BusinessException business exception
	 */
	public static String getIdentPlanNo(String kindFlg, String facilityNo,
			String branchCd, String yearNo, String seasonDiv, String planAnsNo)
			throws BusinessException {

		Map conditions = new HashMap();
		conditions.put("KIND_FLG", kindFlg);
		conditions.put("FACILITY_CD", facilityNo);
		conditions.put("BRANCH_NO", branchCd);
		conditions.put("YEAR_NO", yearNo);
		conditions.put("SEASON_DIV", seasonDiv);
		conditions.put("PLAN_ANS_NO", planAnsNo);
		return getIdentPlanNo(conditions);
	}

	/**
	 * 手前の企画通番 .
	 * @param param paramter data
	 * @return a_plan_no plan_no + 1
	 */
	public static String getIdentPlanNo(AnsSearchData param) {
		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		SimpleData data = (SimpleData) dao
				.queryForObject("IndentPlanNo", param);
		String rs = data.getStringValue();
		boolean bInfo = rs.length() >= 7;
		int iRs = new Integer(rs.substring(4, 6)).intValue();
		String result = null;
		if (iRs < 9) {
			result = rs.substring(0, 4) + "0" + (++iRs);
		} else {
			result = rs.substring(0, 4) + (++iRs);
		}
		result = bInfo ? result + '1' : result;
		return result;
	}

	/**
	 *
	 * @param planNo plan_no
	 * @return plan_no + 1
	 * @throws BusinessException business exception
	 */
	static String identPlanNo(String planNo) throws BusinessException {
		int intPlanNo = Integer.parseInt(planNo);
		if (intPlanNo >= 99) {
			throw new BusinessException("planNo");
		}
		if (intPlanNo < 10) {
			return "0" + Integer.toString(++intPlanNo);
		}
		return Integer.toString(++intPlanNo);
	}

	/**
	 *
	 * @param planNo plan_ans_no
	 * @return is done
	 */
	public static boolean isDonePlan(long planNo) {

		StatParamter param = new StatParamter("A_PLAN_ANS", "*");
		List conSet = new ArrayList();
		conSet.add(new Condition("PLAN_ANS_NO", new Long(planNo)));
		conSet.add(new Condition("STATUS", JreConstants.STATUS_FM_FINISH));
		conSet.add(new Condition("NO2_STATUS", JreConstants.STATUS_APPROVE));
		conSet.add(new Condition("NO3_STATUS", JreConstants.STATUS_APPROVE));
		conSet.add(new Condition("NO5_STATUS", JreConstants.STATUS_APPROVE));
		param.setConSet(conSet);
		return getCount(param) > 0;
	}

}
