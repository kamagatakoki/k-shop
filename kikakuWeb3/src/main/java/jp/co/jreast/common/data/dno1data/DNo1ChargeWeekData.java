package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * 料金曜日データクラス。.
 * 機能概要    ：  料金曜日データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public class DNo1ChargeWeekData extends PlanAnsBaseData {
	
	/**
	 * 曜日.
	 */
	private String weekDay;

	/**
	 * パターン種別.
	 */
	private String pattern;

	/**
	 * @return パターン種別
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern パターン種別
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	/**
	 * @return 曜日
	 */
	public String getWeekDay() {
		return weekDay;
	}

	/**
	 * @param weekDay 曜日
	 */
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
}
