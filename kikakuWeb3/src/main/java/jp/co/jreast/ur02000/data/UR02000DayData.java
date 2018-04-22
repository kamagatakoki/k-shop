package jp.co.jreast.ur02000.data;

import jp.co.jreast.common.JreConstants;


/**
 * <pre>
 * カレンダーの日のデータクラス.
 * 機能概要    ：  
 * 特記事項    ：  
 * </pre>  
 * @author zangzy
 * 
 */
public class UR02000DayData {

	/**.
     * コンストラクター。
     */
	public UR02000DayData() {
		bgcolor = JreConstants.UR02000_DAY_BGCOLOR_DEFAULT;
	}

	/**.
	 * コンストラクター。
	 * @param yearMonth yyyyMM
	 * @param day dd
	 */
	public UR02000DayData(int yearMonth, int day) {
		if (day < 10) {
			date = yearMonth + "0" + day;
		} else {
			date = yearMonth + "" + day;
		}
		this.day = day + "";
		bgcolor = JreConstants.UR02000_DAY_BGCOLOR_DEFAULT;
	}

	/**.
	 * 日付
	 */
	private String date;

	/**.
	 * 背景色
	 */
	private String bgcolor;
	/**
	 * selectCollectionの背景色.
	 */
	private String dropDownBG;
	/**.
	 * 日
	 */
	private String day;

	/**.
	 * パタン
	 */
	private String pattern;

	/**.
	 * 無効フラグ
	 */
	private boolean isDisabled;

	/**
	 * @return 背景色
	 */
	public String getBgcolor() {
		return bgcolor;
	}

	/**
	 * @param bgcolor 背景色
	 */
	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}

	/**
	 * @return 日
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @param day 日
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * @return パタン
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern パタン
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	/**
	 * @return 無効フラグ
	 */
	public boolean getIsDisabled() {
		return isDisabled;
	}

	/**
	 * @param isDisabled 無効フラグ
	 */
	public void setIsDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	/**
	 * @return 日付
	 */
	public String getDate() {
		return date;
	}
	/**
	 * 
	 * @return selectCollectionの背景色
	 */
	public String getDropDownBG() {
		return dropDownBG;
	}
	/**
	 * 
	 * @param dropDownBG selectCollectionの背景色
	 */
	public void setDropDownBG(String dropDownBG) {
		this.dropDownBG = dropDownBG;
	}
	/**
	 * 祝日の印.
	 */
	private boolean isHoliDay;
	/**
	 * 
	 * @return 祝日の印 2007/4/5 jijhuashi
	 */
	public boolean isHoliDay() {
		return isHoliDay;
	}
	/**
	 * 
	 * @param isHoliDay 祝日の印 2007/4/5 jinhuashi
	 */
	public void setIsHoliDay(boolean isHoliDay) {
		this.isHoliDay = isHoliDay;
	}
	
	
	
}
