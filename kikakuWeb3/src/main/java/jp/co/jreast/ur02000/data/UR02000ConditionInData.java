package jp.co.jreast.ur02000.data;

import jp.co.intage.framework.data.InData;

/**
 * <pre>
 * カレンダーの作成条件データクラス。.
 * 機能概要    ：  
 * 特記事項    ：  
 * </pre>  
 * @author zangzy
 * 
 */
public class UR02000ConditionInData implements InData {

	/**.
	 * 適用対象
	 */
	private String applyBy;

	/**.
	 * 期間（開始） 曜日ごと
	 */
	private String periodStartByweek;

	/**.
	 * 期間（終了） 曜日ごと
	 */
	private String periodEndByWeek;

	/**.
	 * 料金パタン　日曜日
	 */
	private String week1Pattern;

	/**.
	 * 料金パタン　月曜日
	 */
	private String week2Pattern;

	/**.
	 * 料金パタン　火曜日
	 */
	private String week3Pattern;

	/**.
	 * 料金パタン　水曜日
	 */
	private String week4Pattern;

	/**.
	 * 料金パタン　木曜日
	 */
	private String week5Pattern;

	/**.
	 * 料金パタン　金曜日
	 */
	private String week6Pattern;

	/**.
	 * 料金パタン　土曜日
	 */
	private String week7Pattern;

	/**.
	 * 期間（開始年月）　期間指定
	 */
	private String periodStartMonthBySpecify;

	/**.
	 * 期間（終了年月）　期間指定
	 */
	private String periodEndMonthBySpecify;

	/**.
	 * 期間（開始日）　期間指定
	 */
	private String periodStartDayBySpecify;

	/**.
	 * 期間（終了日）　期間指定
	 */
	private String periodEndDayBySpecify;

	/**.
	 * 料金パタン　期間指定
	 */
	private String specifyPattern;
	
	/**.
	 * 期間（開始年月）　平日・休日・休前日		課題NO18:カレンダー設定（平日・休日・休前日）追加対応 2009/12/02 add by s31109
	 */
	private String periodStartMonthByDay;

	/**.
	 * 期間（終了年月）　平日・休日・休前日		課題NO18:カレンダー設定（平日・休日・休前日）追加対応 2009/12/02 add by s31109
	 */
	private String periodEndMonthByDay;

	/**.
	 * 期間（開始日）　平日・休日・休前日		課題NO18:カレンダー設定（平日・休日・休前日）追加対応 2009/12/02 add by s31109
	 */
	private String periodStartDayByDay;

	/**.
	 * 期間（終了日）　平日・休日・休前日		課題NO18:カレンダー設定（平日・休日・休前日）追加対応 2009/12/02 add by s31109
	 */
	private String periodEndDayByDay;

	/**.
	 * 料金パタン　平日		課題NO18:カレンダー設定（平日・休日・休前日）追加対応 2009/12/02 add by s31109
	 */
	private String dayPattern1;
	
	/**.
	 * 料金パタン　休日		課題NO18:カレンダー設定（平日・休日・休前日）追加対応 2009/12/02 add by s31109
	 */
	private String dayPattern2;
	
	/**.
	 * 料金パタン　休前日		課題NO18:カレンダー設定（平日・休日・休前日）追加対応 2009/12/02 add by s31109
	 */
	private String dayPattern3;

	/**
	 * @return 料金パタン　期間指定
	 */
	public String getSpecifyPattern() {
		return specifyPattern;
	}

	/**
	 * @param specifyPattern 料金パタン　期間指定
	 */
	public void setSpecifyPattern(String specifyPattern) {
		this.specifyPattern = specifyPattern;
	}

	/**
	 * @return 期間（終了日）　期間指定
	 */
	public String getPeriodEndDayBySpecify() {
		return periodEndDayBySpecify;
	}

	/**
	 * @param periodEndDayBySpecify 期間（終了日）　期間指定
	 */
	public void setPeriodEndDayBySpecify(String periodEndDayBySpecify) {
		this.periodEndDayBySpecify = periodEndDayBySpecify;
	}

	/**
	 * @return 期間（開始日）　期間指定
	 */
	public String getPeriodStartDayBySpecify() {
		return periodStartDayBySpecify;
	}

	/**
	 * @param periodStartDayBySpecify 期間（開始日）　期間指定
	 */
	public void setPeriodStartDayBySpecify(String periodStartDayBySpecify) {
		this.periodStartDayBySpecify = periodStartDayBySpecify;
	}

	/**
	 * @return 期間（終了年月）　期間指定
	 */
	public String getPeriodEndMonthBySpecify() {
		return periodEndMonthBySpecify;
	}

	/**
	 * @param periodEndMonthBySpecify 期間（終了年月）　期間指定
	 */
	public void setPeriodEndMonthBySpecify(String periodEndMonthBySpecify) {
		this.periodEndMonthBySpecify = periodEndMonthBySpecify;
	}

	/**
	 * @return 期間（開始年月）　期間指定
	 */
	public String getPeriodStartMonthBySpecify() {
		return periodStartMonthBySpecify;
	}

	/**
	 * @param periodStartMonthBySpecify 期間（開始年月）　期間指定
	 */
	public void setPeriodStartMonthBySpecify(String periodStartMonthBySpecify) {
		this.periodStartMonthBySpecify = periodStartMonthBySpecify;
	}

	/**
	 * @return 料金パタン　日曜日
	 */
	public String getWeek1Pattern() {
		return week1Pattern;
	}

	/**
	 * @param week1Pattern 料金パタン　日曜日
	 */
	public void setWeek1Pattern(String week1Pattern) {
		this.week1Pattern = week1Pattern;
	}

	/**
	 * @return 料金パタン　月曜日
	 */
	public String getWeek2Pattern() {
		return week2Pattern;
	}

	/**
	 * @param week2Pattern 料金パタン　月曜日
	 */
	public void setWeek2Pattern(String week2Pattern) {
		this.week2Pattern = week2Pattern;
	}

	/**
	 * @return 料金パタン　火曜日
	 */
	public String getWeek3Pattern() {
		return week3Pattern;
	}

	/**
	 * @param week3Pattern 料金パタン　火曜日
	 */
	public void setWeek3Pattern(String week3Pattern) {
		this.week3Pattern = week3Pattern;
	}

	/**
	 * @return 料金パタン　水曜日
	 */
	public String getWeek4Pattern() {
		return week4Pattern;
	}

	/**
	 * @param week4Pattern 料金パタン　水曜日
	 */
	public void setWeek4Pattern(String week4Pattern) {
		this.week4Pattern = week4Pattern;
	}

	/**
	 * @return 料金パタン　木曜日
	 */
	public String getWeek5Pattern() {
		return week5Pattern;
	}

	/**
	 * @param week5Pattern 料金パタン　木曜日
	 */
	public void setWeek5Pattern(String week5Pattern) {
		this.week5Pattern = week5Pattern;
	}

	/**
	 * @return 料金パタン　金曜日
	 */
	public String getWeek6Pattern() {
		return week6Pattern;
	}

	/**
	 * @param week6Pattern 料金パタン　金曜日
	 */
	public void setWeek6Pattern(String week6Pattern) {
		this.week6Pattern = week6Pattern;
	}

	/**
	 * @return 料金パタン　土曜日
	 */
	public String getWeek7Pattern() {
		return week7Pattern;
	}

	/**
	 * @param week7Pattern 料金パタン　土曜日
	 */
	public void setWeek7Pattern(String week7Pattern) {
		this.week7Pattern = week7Pattern;
	}

	/**
	 * @return 期間（開始） 曜日ごと
	 */
	public String getPeriodStartByweek() {
		return periodStartByweek;
	}

	/**
	 * @param periodStartByweek 期間（開始） 曜日ごと
	 */
	public void setPeriodStartByweek(String periodStartByweek) {
		this.periodStartByweek = periodStartByweek;
	}

	/**
	 * @return 期間（終了） 曜日ごと
	 */
	public String getPeriodEndByWeek() {
		return periodEndByWeek;
	}

	/**
	 * @param weekPeriodEnd 期間（終了） 曜日ごと
	 */
	public void setPeriodEndByWeek(String weekPeriodEnd) {
		this.periodEndByWeek = weekPeriodEnd;
	}

	/**
	 * @return 適用対象
	 */
	public String getApplyBy() {
		return applyBy;
	}

	/**
	 * @param applyBy 適用対象
	 */
	public void setApplyBy(String applyBy) {
		this.applyBy = applyBy;
	}
	
	/**
	 * 週間の期間（開始日）.
	 */
	private String periodStartDayByweek;
	/**
	 * .
	 * @return 週間の期間（開始日）
	 */
	public String getPeriodStartDayByweek() {
		return periodStartDayByweek;
	}
	/**
	 * .
	 * @param periodStartDayByweek 週間の期間（開始日）
	 */
	public void setPeriodStartDayByweek(String periodStartDayByweek) {
		this.periodStartDayByweek = periodStartDayByweek;
	}
	/**
	 * 週間の期間（終了日）.
	 */
	private String periodEndDayByweek;
	/**
	 * .
	 * @return 週間の期間（終了日）
	 */
	public String getPeriodEndDayByweek() {
		return periodEndDayByweek;
	}
	/**
	 * .
	 * @param periodEndDayByweek 週間の期間（終了日）
	 */
	public void setPeriodEndDayByweek(String periodEndDayByweek) {
		this.periodEndDayByweek = periodEndDayByweek;
	}
	
	
	/**
	 * @return 期間（開始年月）　平日・休日・休前日
	 */
	public String getPeriodStartMonthByDay() {
		return periodStartMonthByDay;
	}

	/**
	 * @param periodStartMonthByDay 期間（開始年月）　平日・休日・休前日
	 */
	public void setPeriodStartMonthByDay(String periodStartMonthByDay) {
		this.periodStartMonthByDay = periodStartMonthByDay;
	}
	
	/**
	 * @return 期間（終了年月）　平日・休日・休前日
	 */
	public String getPeriodEndMonthByDay() {
		return periodEndMonthByDay;
	}

	/**
	 * @param periodEndMonthByDay 期間（終了年月）　平日・休日・休前日
	 */
	public void setPeriodEndMonthByDay(String periodEndMonthByDay) {
		this.periodEndMonthByDay = periodEndMonthByDay;
	}
	
	/**
	 * @return 期間（開始日）　平日・休日・休前日
	 */
	public String getPeriodStartDayByDay() {
		return periodStartDayByDay;
	}

	/**
	 * @param periodStartDayByDay 期間（開始日）　平日・休日・休前日
	 */
	public void setPeriodStartDayByDay(String periodStartDayByDay) {
		this.periodStartDayByDay = periodStartDayByDay;
	}
	
	/**
	 * @return 期間（終了日）　平日・休日・休前日
	 */
	public String getPeriodEndDayByDay() {
		return periodEndDayByDay;
	}

	/**
	 * @param periodEndDayByDay 期間（終了日）　平日・休日・休前日
	 */
	public void setPeriodEndDayByDay(String periodEndDayByDay) {
		this.periodEndDayByDay = periodEndDayByDay;
	}
	
	/**
	 * @return 料金パタン　平日
	 */
	public String getDayPattern1() {
		return dayPattern1;
	}

	/**
	 * @param dayPattern1 料金パタン　平日
	 */
	public void setDayPattern1(String dayPattern1) {
		this.dayPattern1 = dayPattern1;
	}
	
	/**
	 * @return 料金パタン　休日
	 */
	public String getDayPattern2() {
		return dayPattern2;
	}

	/**
	 * @param dayPattern2 料金パタン　休日
	 */
	public void setDayPattern2(String dayPattern2) {
		this.dayPattern2 = dayPattern2;
	}
	
	/**
	 * @return 料金パタン　休前日
	 */
	public String getDayPattern3() {
		return dayPattern3;
	}

	/**
	 * @param dayPattern3 料金パタン　休前日
	 */
	public void setDayPattern3(String dayPattern3) {
		this.dayPattern3 = dayPattern3;
	}
}
