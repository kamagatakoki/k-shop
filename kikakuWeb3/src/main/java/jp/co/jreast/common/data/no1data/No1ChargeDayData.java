package jp.co.jreast.common.data.no1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * �����j���f�[�^�N���X�B.
 * �@�\�T�v    �F  ����_�����E�x���E�x�O���̃f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author s31109
 * @version 0.1 2009/12/02
 */
public class No1ChargeDayData extends PlanAnsBaseData{
	
	/**
	 * �����E�x���E�x�O��.
	 */
	private String weekDay_Holiday;

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
	 * @return �����E�x���E�x�O��
	 */
	public String getWeekDay_Holiday() {
		return weekDay_Holiday;
	}

	/**
	 * @param weekDay_Holiday �����E�x���E�x�O��
	 */
	public void setWeekDay_Holiday(String weekDay_Holiday) {
		this.weekDay_Holiday = weekDay_Holiday;
	}

}
