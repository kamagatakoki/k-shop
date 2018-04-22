package jp.co.jreast.common.data;

/**
 * <pre>
 * 祝日マスタデータクラス。.
 * 機能概要    ：  祝日マスタデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/10/27
 */
public class HolidayData {
	/**
	 * 祝日年月日.
	 */
	private String holiday;
	
	/**
	 * 祝日名称.
	 */
	private String holidayNm;

	/**
	 * @return 祝日年月日
	 */
	public String getHoliday() {
		return holiday;
	}

	/**
	 * @param holiday 祝日年月日
	 */
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	/**
	 * @return 祝日名称
	 */
	public String getHolidayNm() {
		return holidayNm;
	}

	/**
	 * @param holidayNm 祝日名称
	 */
	public void setHolidayNm(String holidayNm) {
		this.holidayNm = holidayNm;
	}
}
