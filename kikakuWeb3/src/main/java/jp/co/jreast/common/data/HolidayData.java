package jp.co.jreast.common.data;

/**
 * <pre>
 * �j���}�X�^�f�[�^�N���X�B.
 * �@�\�T�v    �F  �j���}�X�^�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/10/27
 */
public class HolidayData {
	/**
	 * �j���N����.
	 */
	private String holiday;
	
	/**
	 * �j������.
	 */
	private String holidayNm;

	/**
	 * @return �j���N����
	 */
	public String getHoliday() {
		return holiday;
	}

	/**
	 * @param holiday �j���N����
	 */
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	/**
	 * @return �j������
	 */
	public String getHolidayNm() {
		return holidayNm;
	}

	/**
	 * @param holidayNm �j������
	 */
	public void setHolidayNm(String holidayNm) {
		this.holidayNm = holidayNm;
	}
}
