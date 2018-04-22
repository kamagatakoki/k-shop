package jp.co.jreast.common.data;

/**
 * <pre>
 * No4FM送信用。.
 * 機能概要    ：  在庫日付と在庫番号を格納。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 金　化石	
 * @version 0.1 2007/06/17
 */
public class No4FMCheckData {
	/**
	 * No4室タイプがあるの日のリスト.
	 */
	private String dayList;
	/**
	 * 室タイプ.
	 */
	private String stockNo;
	/**
	 * @return dayList
	 */
	/**
	 * 検索企画回答書番号.
	 */
	private String planAnsNo;
	public String getDayList() {
		return dayList;
	}
	public String[] getDayListArr() {
		return dayList.split(",");
	}
	/**
	 * @param dayList 設定する dayList
	 */
	public void setDayList(String dayList) {
		this.dayList = dayList;
	}
	/**
	 * @return stockNo
	 */
	public String getStockNo() {
		return stockNo;
	}
	/**
	 * @param stockNo 設定する stockNo
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}
	/**
	 * @return planAnsNo
	 */
	public String getPlanAnsNo() {
		return planAnsNo;
	}
	/**
	 * @param planAnsNo 設定する planAnsNo
	 */
	public void setPlanAnsNo(String planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

}
