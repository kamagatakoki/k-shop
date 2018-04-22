package jp.co.jreast.ur02000.data;

import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * カレンダーの月のデータクラス。.
 * 機能概要    ：  
 * 特記事項    ：  
 * </pre> 
 * @author zangzy
 *
 */
public class UR02000MonthData {
	/**.
	 * 月　yyyyMM
	 */
	String yearMonth;
	
	/**.
	 * 日のリスト
	 */
	List dayList;

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
	 * @return 月　yyyyMM
	 */
	public String getYearMonth() {
		return yearMonth;
	}

	/**
	 * @param month 月　yyyyMM
	 */
	public void setYearMonth(String month) {
		this.yearMonth = month;
	}
	
	/**
	 * 指定された日データと同じ日付のデータ(年月、前０ 無し)が存在するかどうか.
	 * @param day 日データ
	 * @return 存在するかどうか
	 */
	public boolean hasDay(UR02000DayData day) {
		for (Iterator it = getDayList().iterator(); it.hasNext();) {
			UR02000DayData nextDay = (UR02000DayData) it.next();
			if (nextDay.getDay().equals(day.getDay())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 指定された日データと同じ日付のデータ(年月、前０ 無し)を取得する.
	 * 指定された日付のデータが存在しない場合はnullを返す.
	 * @param day 日データ
	 * @return 日データ 存在しない場合はnull
	 */
	public UR02000DayData getDay(UR02000DayData day) {
		for (Iterator it = getDayList().iterator(); it.hasNext();) {
			UR02000DayData nextDay = (UR02000DayData) it.next();
			if (nextDay.getDay() != null 
					&& nextDay.getDay().equals(day.getDay())) {
				return nextDay;
			}
		}
		return null;
	}
}
