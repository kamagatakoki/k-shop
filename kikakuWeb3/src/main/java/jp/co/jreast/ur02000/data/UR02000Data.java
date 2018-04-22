package jp.co.jreast.ur02000.data;

import java.util.List;
import java.util.Map;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.no1data.No1InitData;

/**
 * <pre>
 * カレンダーのデータクラス.
 * 機能概要    ：  
 * 特記事項    ：  
 * </pre>  
 * @author zangzy
 *
 */
public class UR02000Data implements InData, OutData{

	/**.
	 * 検索条件のデータ
	 */
	private AnsSearchData ansSearchData;
	
	/**.
	 * 画面条件のデータ
	 */
	private UR02000ConditionInData conditionData;
	
	/**.
	 * 期間（開始）
	 */
	private String periodStart;

	/**.
	 * 期間（終了）
	 */
	private String periodEnd;
	
	/**.
	 * 現在のページ
	 */
	private int currentPage;
	
	/**.
	 * 総ページ
	 */
	private int totalPage;
	
	/**.
	 * 次へボタンの無効フラグ
	 */
	private String isNextBtnDisabled;
	
	/**.
	 * 前へボタンの無効フラグ
	 */
	private String isPreviousBtnDisabled;
	
	/**.
	 * 除外日
	 */
	private String exceptDate;
	
	/**.
	 * 月データのマップ
	 */
	private Map yearMonthMap;

	/**.
	 * ページの月リスト
	 */
	private List pageYearMonthList;
	
	/**.
	 * 料金パタンのリスト
	 */
	private List patternLVList;
	
	/**.
	 * 期間リスト
	 */
	private List periodLVList;
	
	/**.
	 * 日のリスト
	 */
	private List dayList;
	
	/**.
	 * 月の配列
	 */
	private int[] yearMonthArr;
	
	/**.
	 * 料金曜日リスト
	 */
	private List chargeWeekList;
	
	/**.
	 * 料金カレンダーリスト
	 */
	private List chargeCalendarList;
	
	/**.
	 * NO1状態
	 */
	private Integer no1Status;
	
	/**
	 * 誇示するフラグ　.
	 */
	private boolean isDisplay;
	
	/**
	 * NO1初期化データ .
	 */
	private No1InitData no1InitData;
	
	/**.
	 * 料金_平日・休日・休前日リスト
	 * 課題NO18：カレンダー設定（平日・休日・休前日）追加対応　2009/12/02 add by s31109
	 */
	private List chargeDayList;
	
	/**
	 * 
	 * @return .
	 */
	public boolean isDisplay() {
		return isDisplay;
	}

	/**
	 * 
	 * @param isDisplay .
	 */
	public void setDisplay(boolean isDisplay) {
		this.isDisplay = isDisplay;
	}

	/**
	 * 
	 * @return NO1状態
	 */
	public Integer getNo1Status() {
		return no1Status;
	}
	
	/**
	 * 送付区分 .
	 */
	private Integer sendDiv;
	
	/**
	 * 
	 * @return 送付区分
	 */
	public Integer getSendDiv() {
		return sendDiv;
	}

	/**
	 * 
	 * @param sendDiv 送付区分
	 */
	public void setSendDiv(Integer sendDiv) {
		this.sendDiv = sendDiv;
	}

	/**
	 * 
	 * @param no1Status NO1状態
	 */
	public void setNo1Status(Integer no1Status) {
		this.no1Status = no1Status;
	}

	/**
	 * @return 期間（開始）
	 */
	public String getPeriodStart() {
		return periodStart;
	}

	/**
	 * @param periodStart 期間（開始）
	 */
	public void setPeriodStart(String periodStart) {
		this.periodStart = periodStart;
	}

	/**
	 * @return 期間（終了）
	 */
	public String getPeriodEnd() {
		return periodEnd;
	}

	/**
	 * @param peroidEnd 期間（終了）
	 */
	public void setPeriodEnd(String peroidEnd) {
		this.periodEnd = peroidEnd;
	}
	
	/**
	 * @return 月データのマップ
	 */
	public Map getYearMonthMap() {
		return yearMonthMap;
	}

	/**
	 * @param yearMonthMap 月データのマップ
	 */
	public void setYearMonthMap(Map yearMonthMap) {
		this.yearMonthMap = yearMonthMap;
	}

	/**
	 * @return ページの月リスト
	 */
	public List getPageYearMonthList() {
		return pageYearMonthList;
	}

	/**
	 * @param pageYearMonthList ページの月リスト
	 */
	public void setPageYearMonthList(List pageYearMonthList) {
		this.pageYearMonthList = pageYearMonthList;
	}
	
	/**
	 * @param month 月
	 * @return 月データ
	 */
	public UR02000MonthData getMonth(int month) {
		return (UR02000MonthData) yearMonthMap.get(month + "");
	}

	/**
	 * @return 料金パタンのリスト
	 */
	public List getPatternLVList() {
		return patternLVList;
	}

	/**
	 * @param patternLVList 料金パタンのリスト
	 */
	public void setPatternLVList(List patternLVList) {
		this.patternLVList = patternLVList;
	}
	
	/**
	 * @return 期間リスト
	 */
	public List getPeriodLVList() {
		return periodLVList;
	}

	/**
	 * @param periodLVList 期間リスト
	 */
	public void setPeriodLVList(List periodLVList) {
		this.periodLVList = periodLVList;
	}

	/**
	 * @return 現在のページ
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage 現在のページ
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return 前へボタンの無効フラグ
	 */
	public String getIsPreviousBtnDisabled() {
		return isPreviousBtnDisabled;
	}

	/**
	 * @param inPreviousBtnEnable 前へボタンの無効フラグ
	 */
	public void setIsPreviousBtnDisabled(String inPreviousBtnEnable) {
		this.isPreviousBtnDisabled = inPreviousBtnEnable;
	}

	/**
	 * @return 次へボタンの無効フラグ
	 */
	public String getIsNextBtnDisabled() {
		return isNextBtnDisabled;
	}

	/**
	 * @param isNextBtnEnable 次へボタンの無効フラグ
	 */
	public void setIsNextBtnDisabled(String isNextBtnEnable) {
		this.isNextBtnDisabled = isNextBtnEnable;
	}

	/**
	 * @return 月の配列
	 */
	public int[] getYearMonthArr() {
		return yearMonthArr;
	}

	/**
	 * @param yearMonthArr 月の配列
	 */
	public void setYearMonthArr(int[] yearMonthArr) {
		this.yearMonthArr = yearMonthArr;
	}

	/**
	 * @return 画面条件のデータ
	 */
	public UR02000ConditionInData getConditionData() {
		return conditionData;
	}

	/**
	 * @param inData 画面条件のデータ
	 */
	public void setConditionData(UR02000ConditionInData inData) {
		this.conditionData = inData;
	}

	/**
	 * @return 総ページ
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage 総ページ
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return 検索条件のデータ
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData 検索条件のデータ
	 */
	public void setAnsSearchData(AnsSearchData ansSearchData) {
		this.ansSearchData = ansSearchData;
	}

	/**
	 * @return 日のリスト
	 */
	public List getDayList() {
		return dayList;
	}

	/**
	 * @param dayList 日のリスト
	 */
	public void setDayList(List dayList) {
		this.dayList = dayList;
	}

	/**
	 * 
	 * @return 除外日
	 */
	public String getExceptDate() {
		return exceptDate;
	}

	/**
	 * 
	 * @param exceptDate 除外日
	 */
	public void setExceptDate(String exceptDate) {
		this.exceptDate = exceptDate;
	}

	/**
	 * 
	 * @return 料金カレンダーリスト
	 */
	public List getChargeCalendarList() {
		return chargeCalendarList;
	}

	/**
	 * 
	 * @param chargeCalendarList 料金カレンダーリスト
	 */
	public void setChargeCalendarList(List chargeCalendarList) {
		this.chargeCalendarList = chargeCalendarList;
	}

	/**
	 * 
	 * @return 料金曜日リスト
	 */
	public List getChargeWeekList() {
		return chargeWeekList;
	}

	/**
	 * 
	 * @param chargeWeekList 料金曜日リスト
	 */
	public void setChargeWeekList(List chargeWeekList) {
		this.chargeWeekList = chargeWeekList;
	}

	/**
	 * 
	 * @return .
	 */
	public No1InitData getNo1InitData() {
		return no1InitData;
	}

	/**
	 * 
	 * @param no1InitData .
	 */ 
	public void setNo1InitData(No1InitData no1InitData) {
		this.no1InitData = no1InitData;
	}
	
	/**
	 * 
	 * @return 料金_平日・休日・休前日リスト
	 */
	public List getChargeDayList() {
		return chargeDayList;
	}

	/**
	 * 
	 * @param chargeDayList 料金_平日・休日・休前日リスト
	 */
	public void setChargeDayList(List chargeDayList) {
		this.chargeDayList = chargeDayList;
	}
}
