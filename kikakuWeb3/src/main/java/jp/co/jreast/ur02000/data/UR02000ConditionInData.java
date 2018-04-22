package jp.co.jreast.ur02000.data;

import jp.co.intage.framework.data.InData;

/**
 * <pre>
 * �J�����_�[�̍쐬�����f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  
 * </pre>  
 * @author zangzy
 * 
 */
public class UR02000ConditionInData implements InData {

	/**.
	 * �K�p�Ώ�
	 */
	private String applyBy;

	/**.
	 * ���ԁi�J�n�j �j������
	 */
	private String periodStartByweek;

	/**.
	 * ���ԁi�I���j �j������
	 */
	private String periodEndByWeek;

	/**.
	 * �����p�^���@���j��
	 */
	private String week1Pattern;

	/**.
	 * �����p�^���@���j��
	 */
	private String week2Pattern;

	/**.
	 * �����p�^���@�Ηj��
	 */
	private String week3Pattern;

	/**.
	 * �����p�^���@���j��
	 */
	private String week4Pattern;

	/**.
	 * �����p�^���@�ؗj��
	 */
	private String week5Pattern;

	/**.
	 * �����p�^���@���j��
	 */
	private String week6Pattern;

	/**.
	 * �����p�^���@�y�j��
	 */
	private String week7Pattern;

	/**.
	 * ���ԁi�J�n�N���j�@���Ԏw��
	 */
	private String periodStartMonthBySpecify;

	/**.
	 * ���ԁi�I���N���j�@���Ԏw��
	 */
	private String periodEndMonthBySpecify;

	/**.
	 * ���ԁi�J�n���j�@���Ԏw��
	 */
	private String periodStartDayBySpecify;

	/**.
	 * ���ԁi�I�����j�@���Ԏw��
	 */
	private String periodEndDayBySpecify;

	/**.
	 * �����p�^���@���Ԏw��
	 */
	private String specifyPattern;
	
	/**.
	 * ���ԁi�J�n�N���j�@�����E�x���E�x�O��		�ۑ�NO18:�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή� 2009/12/02 add by s31109
	 */
	private String periodStartMonthByDay;

	/**.
	 * ���ԁi�I���N���j�@�����E�x���E�x�O��		�ۑ�NO18:�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή� 2009/12/02 add by s31109
	 */
	private String periodEndMonthByDay;

	/**.
	 * ���ԁi�J�n���j�@�����E�x���E�x�O��		�ۑ�NO18:�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή� 2009/12/02 add by s31109
	 */
	private String periodStartDayByDay;

	/**.
	 * ���ԁi�I�����j�@�����E�x���E�x�O��		�ۑ�NO18:�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή� 2009/12/02 add by s31109
	 */
	private String periodEndDayByDay;

	/**.
	 * �����p�^���@����		�ۑ�NO18:�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή� 2009/12/02 add by s31109
	 */
	private String dayPattern1;
	
	/**.
	 * �����p�^���@�x��		�ۑ�NO18:�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή� 2009/12/02 add by s31109
	 */
	private String dayPattern2;
	
	/**.
	 * �����p�^���@�x�O��		�ۑ�NO18:�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή� 2009/12/02 add by s31109
	 */
	private String dayPattern3;

	/**
	 * @return �����p�^���@���Ԏw��
	 */
	public String getSpecifyPattern() {
		return specifyPattern;
	}

	/**
	 * @param specifyPattern �����p�^���@���Ԏw��
	 */
	public void setSpecifyPattern(String specifyPattern) {
		this.specifyPattern = specifyPattern;
	}

	/**
	 * @return ���ԁi�I�����j�@���Ԏw��
	 */
	public String getPeriodEndDayBySpecify() {
		return periodEndDayBySpecify;
	}

	/**
	 * @param periodEndDayBySpecify ���ԁi�I�����j�@���Ԏw��
	 */
	public void setPeriodEndDayBySpecify(String periodEndDayBySpecify) {
		this.periodEndDayBySpecify = periodEndDayBySpecify;
	}

	/**
	 * @return ���ԁi�J�n���j�@���Ԏw��
	 */
	public String getPeriodStartDayBySpecify() {
		return periodStartDayBySpecify;
	}

	/**
	 * @param periodStartDayBySpecify ���ԁi�J�n���j�@���Ԏw��
	 */
	public void setPeriodStartDayBySpecify(String periodStartDayBySpecify) {
		this.periodStartDayBySpecify = periodStartDayBySpecify;
	}

	/**
	 * @return ���ԁi�I���N���j�@���Ԏw��
	 */
	public String getPeriodEndMonthBySpecify() {
		return periodEndMonthBySpecify;
	}

	/**
	 * @param periodEndMonthBySpecify ���ԁi�I���N���j�@���Ԏw��
	 */
	public void setPeriodEndMonthBySpecify(String periodEndMonthBySpecify) {
		this.periodEndMonthBySpecify = periodEndMonthBySpecify;
	}

	/**
	 * @return ���ԁi�J�n�N���j�@���Ԏw��
	 */
	public String getPeriodStartMonthBySpecify() {
		return periodStartMonthBySpecify;
	}

	/**
	 * @param periodStartMonthBySpecify ���ԁi�J�n�N���j�@���Ԏw��
	 */
	public void setPeriodStartMonthBySpecify(String periodStartMonthBySpecify) {
		this.periodStartMonthBySpecify = periodStartMonthBySpecify;
	}

	/**
	 * @return �����p�^���@���j��
	 */
	public String getWeek1Pattern() {
		return week1Pattern;
	}

	/**
	 * @param week1Pattern �����p�^���@���j��
	 */
	public void setWeek1Pattern(String week1Pattern) {
		this.week1Pattern = week1Pattern;
	}

	/**
	 * @return �����p�^���@���j��
	 */
	public String getWeek2Pattern() {
		return week2Pattern;
	}

	/**
	 * @param week2Pattern �����p�^���@���j��
	 */
	public void setWeek2Pattern(String week2Pattern) {
		this.week2Pattern = week2Pattern;
	}

	/**
	 * @return �����p�^���@�Ηj��
	 */
	public String getWeek3Pattern() {
		return week3Pattern;
	}

	/**
	 * @param week3Pattern �����p�^���@�Ηj��
	 */
	public void setWeek3Pattern(String week3Pattern) {
		this.week3Pattern = week3Pattern;
	}

	/**
	 * @return �����p�^���@���j��
	 */
	public String getWeek4Pattern() {
		return week4Pattern;
	}

	/**
	 * @param week4Pattern �����p�^���@���j��
	 */
	public void setWeek4Pattern(String week4Pattern) {
		this.week4Pattern = week4Pattern;
	}

	/**
	 * @return �����p�^���@�ؗj��
	 */
	public String getWeek5Pattern() {
		return week5Pattern;
	}

	/**
	 * @param week5Pattern �����p�^���@�ؗj��
	 */
	public void setWeek5Pattern(String week5Pattern) {
		this.week5Pattern = week5Pattern;
	}

	/**
	 * @return �����p�^���@���j��
	 */
	public String getWeek6Pattern() {
		return week6Pattern;
	}

	/**
	 * @param week6Pattern �����p�^���@���j��
	 */
	public void setWeek6Pattern(String week6Pattern) {
		this.week6Pattern = week6Pattern;
	}

	/**
	 * @return �����p�^���@�y�j��
	 */
	public String getWeek7Pattern() {
		return week7Pattern;
	}

	/**
	 * @param week7Pattern �����p�^���@�y�j��
	 */
	public void setWeek7Pattern(String week7Pattern) {
		this.week7Pattern = week7Pattern;
	}

	/**
	 * @return ���ԁi�J�n�j �j������
	 */
	public String getPeriodStartByweek() {
		return periodStartByweek;
	}

	/**
	 * @param periodStartByweek ���ԁi�J�n�j �j������
	 */
	public void setPeriodStartByweek(String periodStartByweek) {
		this.periodStartByweek = periodStartByweek;
	}

	/**
	 * @return ���ԁi�I���j �j������
	 */
	public String getPeriodEndByWeek() {
		return periodEndByWeek;
	}

	/**
	 * @param weekPeriodEnd ���ԁi�I���j �j������
	 */
	public void setPeriodEndByWeek(String weekPeriodEnd) {
		this.periodEndByWeek = weekPeriodEnd;
	}

	/**
	 * @return �K�p�Ώ�
	 */
	public String getApplyBy() {
		return applyBy;
	}

	/**
	 * @param applyBy �K�p�Ώ�
	 */
	public void setApplyBy(String applyBy) {
		this.applyBy = applyBy;
	}
	
	/**
	 * �T�Ԃ̊��ԁi�J�n���j.
	 */
	private String periodStartDayByweek;
	/**
	 * .
	 * @return �T�Ԃ̊��ԁi�J�n���j
	 */
	public String getPeriodStartDayByweek() {
		return periodStartDayByweek;
	}
	/**
	 * .
	 * @param periodStartDayByweek �T�Ԃ̊��ԁi�J�n���j
	 */
	public void setPeriodStartDayByweek(String periodStartDayByweek) {
		this.periodStartDayByweek = periodStartDayByweek;
	}
	/**
	 * �T�Ԃ̊��ԁi�I�����j.
	 */
	private String periodEndDayByweek;
	/**
	 * .
	 * @return �T�Ԃ̊��ԁi�I�����j
	 */
	public String getPeriodEndDayByweek() {
		return periodEndDayByweek;
	}
	/**
	 * .
	 * @param periodEndDayByweek �T�Ԃ̊��ԁi�I�����j
	 */
	public void setPeriodEndDayByweek(String periodEndDayByweek) {
		this.periodEndDayByweek = periodEndDayByweek;
	}
	
	
	/**
	 * @return ���ԁi�J�n�N���j�@�����E�x���E�x�O��
	 */
	public String getPeriodStartMonthByDay() {
		return periodStartMonthByDay;
	}

	/**
	 * @param periodStartMonthByDay ���ԁi�J�n�N���j�@�����E�x���E�x�O��
	 */
	public void setPeriodStartMonthByDay(String periodStartMonthByDay) {
		this.periodStartMonthByDay = periodStartMonthByDay;
	}
	
	/**
	 * @return ���ԁi�I���N���j�@�����E�x���E�x�O��
	 */
	public String getPeriodEndMonthByDay() {
		return periodEndMonthByDay;
	}

	/**
	 * @param periodEndMonthByDay ���ԁi�I���N���j�@�����E�x���E�x�O��
	 */
	public void setPeriodEndMonthByDay(String periodEndMonthByDay) {
		this.periodEndMonthByDay = periodEndMonthByDay;
	}
	
	/**
	 * @return ���ԁi�J�n���j�@�����E�x���E�x�O��
	 */
	public String getPeriodStartDayByDay() {
		return periodStartDayByDay;
	}

	/**
	 * @param periodStartDayByDay ���ԁi�J�n���j�@�����E�x���E�x�O��
	 */
	public void setPeriodStartDayByDay(String periodStartDayByDay) {
		this.periodStartDayByDay = periodStartDayByDay;
	}
	
	/**
	 * @return ���ԁi�I�����j�@�����E�x���E�x�O��
	 */
	public String getPeriodEndDayByDay() {
		return periodEndDayByDay;
	}

	/**
	 * @param periodEndDayByDay ���ԁi�I�����j�@�����E�x���E�x�O��
	 */
	public void setPeriodEndDayByDay(String periodEndDayByDay) {
		this.periodEndDayByDay = periodEndDayByDay;
	}
	
	/**
	 * @return �����p�^���@����
	 */
	public String getDayPattern1() {
		return dayPattern1;
	}

	/**
	 * @param dayPattern1 �����p�^���@����
	 */
	public void setDayPattern1(String dayPattern1) {
		this.dayPattern1 = dayPattern1;
	}
	
	/**
	 * @return �����p�^���@�x��
	 */
	public String getDayPattern2() {
		return dayPattern2;
	}

	/**
	 * @param dayPattern2 �����p�^���@�x��
	 */
	public void setDayPattern2(String dayPattern2) {
		this.dayPattern2 = dayPattern2;
	}
	
	/**
	 * @return �����p�^���@�x�O��
	 */
	public String getDayPattern3() {
		return dayPattern3;
	}

	/**
	 * @param dayPattern3 �����p�^���@�x�O��
	 */
	public void setDayPattern3(String dayPattern3) {
		this.dayPattern3 = dayPattern3;
	}
}
