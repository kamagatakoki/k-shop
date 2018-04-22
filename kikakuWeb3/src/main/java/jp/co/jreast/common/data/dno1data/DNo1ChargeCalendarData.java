package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_�����J�����_�[�f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1_�����J�����_�[�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1ChargeCalendarData extends PlanAnsBaseData {
	/**
	 * ���t.
	 */
	private String date;

	/**
	 * �p�^�[�����.
	 */
	private String pattern;

	/**
	 * @return ���t.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date ���t.
	 */
	public void setDate(final String date) {
		this.date = date;
	}

	/**
	 * @return �p�^�[�����.
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern �p�^�[�����.
	 */
	public void setPattern(final String pattern) {
		this.pattern = pattern;
	}
}
