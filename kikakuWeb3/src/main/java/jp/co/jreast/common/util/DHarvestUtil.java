package jp.co.jreast.common.util;

import org.apache.commons.lang3.StringUtils;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.jreast.common.data.AnsSearchData;

/**
 * D画面用HarvestUtilラッパークラス
 *
 * <pre>
 *   機能概要 ：
 *   特記事項 ： D画面により追加となる動作はここに実装する。
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public final class DHarvestUtil extends DHarvestUtilWrapper {

	/**
	 * 企画通番から支社コードを取得.
	 *
	 * <pre></pre>
	 *
	 * @param planNo
	 *            企画通番
	 * @return 支社コード
	 */
	public static String getBranchCd(String planNo) {
		String prefixCd = planNo.substring(0, 2);
		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		String data = (String) dao.queryForObject("dGetBranchCd", prefixCd);
		String rs = StringUtils.EMPTY;
		if (!StringUtils.isBlank(data)) {
			rs = data.trim();
		}
		return rs;
	}

	/**
	 * 手前の企画通番 .
	 *
	 * @param param
	 *            paramter data
	 * @return a_plan_no plan_no + 1
	 */
	public static String getIdentPlanNo(AnsSearchData param) {
		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		SimpleData data = (SimpleData) dao.queryForObject("d_IndentPlanNo",
				param);
		String rs = data.getStringValue();

		boolean bInfo = rs.length() >= 7;
		int iRs = new Integer(rs.substring(4, 6)).intValue();
		String result = null;
		if (iRs < 9) {
			result = rs.substring(0, 4) + "0" + (++iRs);
		} else if (iRs == 99) {
			result = rs.substring(0, 4) + "01";
		} else {
			result = rs.substring(0, 4) + (++iRs);
		}
		result = bInfo ? result + '1' : result;
		return result;
	}

	/**
	 * コンストラクタ
	 */
	private DHarvestUtil() {
	}

}
