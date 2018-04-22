package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;

/**
 * <pre>
 * 提供期間データクラス。.
 * 機能概要    ：  提供期間データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/12/05
 */
public class DNo1TermDateData {
	
	/**提供期間終了年月日 . */
	private String  termEndYmd;
	/**提供期間開始年月日 . */
	private String  termFromYmd;
	
	/**
	 * @return Returns the termFromYmd.
	 */
	public String getTermFromYmd() {
		return termFromYmd;
	}
	/**
	 * @param termFromYmd The termFromYmd to set.
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
	}
	/**
	 * @return Returns the termEndYmd.
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}
	/**
	 * @param termEndYmd The termEndYmd to set.
	 */
	public void setTermEndYmd(String termEndYmd) {
		this.termEndYmd = termEndYmd;
	}
	
	/**
	 * 提供期間はNULLかどうか.
	 * 
	 * @return boolean
	 */
	public boolean isBlankDate() {
		return StringUtil.isEmpty(getTermEndYmd())
				&& StringUtil.isEmpty(getTermFromYmd());
	}
}
