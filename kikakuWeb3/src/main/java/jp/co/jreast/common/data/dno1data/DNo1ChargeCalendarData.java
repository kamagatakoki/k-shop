package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_料金カレンダーデータクラス。.
 * 機能概要    ：  NO1_料金カレンダーデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1ChargeCalendarData extends PlanAnsBaseData {
	/**
	 * 日付.
	 */
	private String date;

	/**
	 * パターン種別.
	 */
	private String pattern;

	/**
	 * @return 日付.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date 日付.
	 */
	public void setDate(final String date) {
		this.date = date;
	}

	/**
	 * @return パターン種別.
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern パターン種別.
	 */
	public void setPattern(final String pattern) {
		this.pattern = pattern;
	}
}
