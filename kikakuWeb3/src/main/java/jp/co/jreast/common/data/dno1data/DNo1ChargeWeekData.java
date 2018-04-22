package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * �����j���f�[�^�N���X�B.
 * �@�\�T�v    �F  �����j���f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public class DNo1ChargeWeekData extends PlanAnsBaseData {
	
	/**
	 * �j��.
	 */
	private String weekDay;

	/**
	 * �p�^�[�����.
	 */
	private String pattern;

	/**
	 * @return �p�^�[�����
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern �p�^�[�����
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	/**
	 * @return �j��
	 */
	public String getWeekDay() {
		return weekDay;
	}

	/**
	 * @param weekDay �j��
	 */
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
}
