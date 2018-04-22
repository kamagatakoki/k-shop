package jp.co.jreast.common.data.no1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * 料金曜日データクラス。.
 * 機能概要    ：  料金_平日・休日・休前日のデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author s31109
 * @version 0.1 2009/12/02
 */
public class No1ChargeDayData extends PlanAnsBaseData{
	
	/**
	 * 平日・休日・休前日.
	 */
	private String weekDay_Holiday;

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
	 * @return 平日・休日・休前日
	 */
	public String getWeekDay_Holiday() {
		return weekDay_Holiday;
	}

	/**
	 * @param weekDay_Holiday 平日・休日・休前日
	 */
	public void setWeekDay_Holiday(String weekDay_Holiday) {
		this.weekDay_Holiday = weekDay_Holiday;
	}

}
