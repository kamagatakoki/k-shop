package jp.co.jreast.ur02000.data;

import jp.co.jreast.common.JreConstants;


/**
 * <pre>
 * �J�����_�[�̓��̃f�[�^�N���X.
 * �@�\�T�v    �F  
 * ���L����    �F  
 * </pre>  
 * @author zangzy
 * 
 */
public class UR02000DayData {

	/**.
     * �R���X�g���N�^�[�B
     */
	public UR02000DayData() {
		bgcolor = JreConstants.UR02000_DAY_BGCOLOR_DEFAULT;
	}

	/**.
	 * �R���X�g���N�^�[�B
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
	 * ���t
	 */
	private String date;

	/**.
	 * �w�i�F
	 */
	private String bgcolor;
	/**
	 * selectCollection�̔w�i�F.
	 */
	private String dropDownBG;
	/**.
	 * ��
	 */
	private String day;

	/**.
	 * �p�^��
	 */
	private String pattern;

	/**.
	 * �����t���O
	 */
	private boolean isDisabled;

	/**
	 * @return �w�i�F
	 */
	public String getBgcolor() {
		return bgcolor;
	}

	/**
	 * @param bgcolor �w�i�F
	 */
	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}

	/**
	 * @return ��
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @param day ��
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * @return �p�^��
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern �p�^��
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	/**
	 * @return �����t���O
	 */
	public boolean getIsDisabled() {
		return isDisabled;
	}

	/**
	 * @param isDisabled �����t���O
	 */
	public void setIsDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	/**
	 * @return ���t
	 */
	public String getDate() {
		return date;
	}
	/**
	 * 
	 * @return selectCollection�̔w�i�F
	 */
	public String getDropDownBG() {
		return dropDownBG;
	}
	/**
	 * 
	 * @param dropDownBG selectCollection�̔w�i�F
	 */
	public void setDropDownBG(String dropDownBG) {
		this.dropDownBG = dropDownBG;
	}
	/**
	 * �j���̈�.
	 */
	private boolean isHoliDay;
	/**
	 * 
	 * @return �j���̈� 2007/4/5 jijhuashi
	 */
	public boolean isHoliDay() {
		return isHoliDay;
	}
	/**
	 * 
	 * @param isHoliDay �j���̈� 2007/4/5 jinhuashi
	 */
	public void setIsHoliDay(boolean isHoliDay) {
		this.isHoliDay = isHoliDay;
	}
	
	
	
}
