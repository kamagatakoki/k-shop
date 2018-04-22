package jp.co.jreast.common.data.no1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_宿泊、観光、船車データインタフェースクラス。.
 * 機能概要    ：  NO1_宿泊、観光、船車データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/11/17
 */
public interface INo1CommonData {
	/**
	 * 企画回答連番と履歴番号をセットする .
	 * 
	 * @param from fromデータ
	 */
	public void setPlanNoAndCareerNo(PlanAnsBaseData from);	
	/**
	 * 
	 * @return 提供期間終了日.
	 */
	abstract String getTermEndD();
	/**
	 * 
	 * @param termEndD 提供期間終了日.
	 */
	public void setTermEndD(String termEndD); 
		
	/**
	 * 
	 * @return 提供期間終了月.
	 */
	public String getTermEndM();
	/**
	 * 
	 * @param termEndM 提供期間終了月.
	 */
	public void setTermEndM(String termEndM);
	/**
	 * 
	 * @return 提供期間終了年度.
	 */
	public String getTermEndY();
	/**
	 * 
	 * @param termEndY 提供期間終了年度　.
	 */
	public void setTermEndY(String termEndY);
	/**
	 * 
	 * @return 提供期間開始日.
	 */
	public String getTermFromD();
	/**
	 * 
	 * @param termFromD 提供期間開始日.
	 */
	public void setTermFromD(String termFromD);
	/**
	 * 
	 * @return 提供期間開始月.
	 */
	public String getTermFromM();
	/**
	 * 
	 * @param termFromM 提供期間開始月.
	 */
	public void setTermFromM(String termFromM);
	/**
	 * 
	 * @return termFromY 提供期間開始年度.
	 */
	public String getTermFromY();
	/**
	 * 
	 * @param termFromY 提供期間開始年度.
	 */
	public void setTermFromY(String termFromY);
	/**
	 * @return かんま付き手数料の取得
	 */
	public String getDealFeeDisplay();
}
