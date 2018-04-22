package jp.co.jreast.common.data.no1data;

import java.util.List;
import java.util.Map;

/**
 * <pre>
 * ビジネスチェックデータクラス。.
 * 機能概要    ：  ビジネスチェックデータを格納する。
 * 特記事項    ：  カレンダーとページの提供期限は一致かをチェックする用
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/11/17
 */
public class No1BusinessCheckBean {
	/**
	 * 料金カレンダー 提供期間開始年月日.
	 */
	private String calendarTermFromYmd;
	
	/**
	 * 料金カレンダー 提供期間終了年月日.
	 */
	private String calendarTermEndYmd;
	
	/**
	 * 料金カレンダー パタン種類.
	 */
	private List calendarPatternKindList;
	
	/**
	 * No1 提供期間開始年月日.
	 */
	private String no1TermFromYmd;
	
	/**
	 * No1 提供期間終了年月日.
	 */
	private String no1TermEndYmd;
	
	/**
	 * No1 パタン種類.
	 */
	private Map no1PatternKindMap;

	/**
	 * @return 料金カレンダー パタン種類.
	 */
	public List getCalendarPatternKindList() {
		return calendarPatternKindList;
	}

	/**
	 * @param calendarPatternKindList 料金カレンダー パタン種類
	 */
	public void setCalendarPatternKindList(List calendarPatternKindList) {
		this.calendarPatternKindList = calendarPatternKindList;
	}

	/**
	 * @return 料金カレンダー 提供期間終了年月日.
	 */
	public String getCalendarTermEndYmd() {
		return calendarTermEndYmd;
	}

	/**
	 * @param calendarTermEndYmd 料金カレンダー 提供期間終了年月日.
	 */
	public void setCalendarTermEndYmd(String calendarTermEndYmd) {
		this.calendarTermEndYmd = calendarTermEndYmd;
	}

	/**
	 * @return 料金カレンダー 提供期間開始年月日.
	 */
	public String getCalendarTermFromYmd() {
		return calendarTermFromYmd;
	}

	/**
	 * @param calendarTermFromYmd 料金カレンダー 提供期間開始年月日.
	 */
	public void setCalendarTermFromYmd(String calendarTermFromYmd) {
		this.calendarTermFromYmd = calendarTermFromYmd;
	}

	/**
	 * @return No1 パタン種類
	 */
	public Map getNo1PatternKindMap() {
		return no1PatternKindMap;
	}

	/**
	 * @param no1PatternKindMap No1 パタン種類
	 */
	public void setNo1PatternKindMap(Map no1PatternKindMap) {
		this.no1PatternKindMap = no1PatternKindMap;
	}

	/**
	 * @return No1 提供期間終了年月日.
	 */
	public String getNo1TermEndYmd() {
		return no1TermEndYmd;
	}

	/**
	 * @param no1TermEndYmd No1 提供期間終了年月日.
	 */
	public void setNo1TermEndYmd(String no1TermEndYmd) {
		this.no1TermEndYmd = no1TermEndYmd;
	}

	/**
	 * @return No1 提供期間開始年月日.
	 */
	public String getNo1TermFromYmd() {
		return no1TermFromYmd;
	}

	/**
	 * @param no1TermFromYmd No1 提供期間開始年月日.
	 */
	public void setNo1TermFromYmd(String no1TermFromYmd) {
		this.no1TermFromYmd = no1TermFromYmd;
	}

	
}
