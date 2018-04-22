package jp.co.jreast.common.data.ddata;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * [DP/RM]�{��_�ݔ�_�X�L�[ �G���e�B�e�B
 *
 * <pre>
 *   �@�\�T�v �F
 *   ���L���� �F
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityEquipmentSki implements FacilityManageBodyKey {

	/** �嗁��E���p_���l */
	private String bigbathMemo;

	/** ���p_��㐧_�I�����ԁi���ԁj */
	private String commonbathChangeEndHour;

	/** ���p_��㐧_�I�����ԁi���j */
	private String commonbathChangeEndMinute;

	/** ���p_��㐧_�ӏ��� */
	private String commonbathChangeNum;

	/** ���p_��㐧_�J�n���ԁi���ԁj */
	private String commonbathChangeStartHour;

	/** ���p_��㐧_�J�n���ԁi���j */
	private String commonbathChangeStartMinute;

	/** ���p_�L�� */
	private String commonbathFlg;

	/** ���p_��_�ӏ��� */
	private String commonbathLadyNum;

	/** ���p_�j_�ӏ��� */
	private String commonbathManNum;

	/** ���p_�j��_�ӏ��� */
	private String commonbathMlNum;

	/** ������_�N��From */
	private String daycareAgeFrom;

	/** ������_�N��To */
	private String daycareAgeTo;

	/** ������_���� */
	private String daycareCharge;

	/** ������_����_�L�� */
	private String daycareChargeFlg;

	/** ������_�L�� */
	private String daycareFlg;

	/** ������_���� */
	private String daycareTime;

	/** ������_�c�Ǝ��ԂP_�I���i���ԁj */
	private String daycareTimeEnd1Hour;

	/** ������_�c�Ǝ��ԂP_�I���i���j */
	private String daycareTimeEnd1Minute;

	/** ������_�c�Ǝ��ԂQ_�I���i���ԁj */
	private String daycareTimeEnd2Hour;

	/** ������_�c�Ǝ��ԂQ_�I���i���j */
	private String daycareTimeEnd2Minute;

	/** ������_�c�Ǝ���_���l */
	private String daycareTimeMemo;

	/** ������_�c�Ǝ��ԂP_�J�n�i���ԁj */
	private String daycareTimeStart1Hour;

	/** ������_�c�Ǝ��ԂP_�J�n�i���j */
	private String daycareTimeStart1Minute;

	/** ������_�c�Ǝ��ԂQ_�J�n�i���ԁj */
	private String daycareTimeStart2Hour;

	/** ������_�c�Ǝ��ԂQ_�J�n�i���j */
	private String daycareTimeStart2Minute;

	/** �X�ߎ�_�敪 */
	private String dressingRoomDiv;

	/** �X�ߎ�_���̑����e */
	private String dressingRoomOthers;

	/** �{�݃R�[�h */
	private String facilityCd;

	/** �{�݃p�^�[�� */
	private String facilityPattern;

	/** �񓚏���� */
	private String kindFlg;

	/** �X�ߎ�_�L�� */
	private String lockerroomFlg;

	/**
	 * �嗁��E���p_���l���擾���܂��B
	 *
	 * @return �嗁��E���p_���l
	 */
	public String getBigbathMemo() {
		return bigbathMemo;
	}

	/**
	 * ���p_��㐧_�I�����Ԃ��擾���܂��B
	 *
	 * @return ���p_��㐧_�I������
	 */
	public String getCommonbathChangeEnd() {
		return KikakuWebUtil.buildTime(getCommonbathChangeEndHour(),
				getCommonbathChangeEndMinute());
	}

	/**
	 * ���p_��㐧_�I�����ԁi���ԁj���擾���܂��B
	 *
	 * @return ���p_��㐧_�I�����ԁi���ԁj
	 */
	public String getCommonbathChangeEndHour() {
		return commonbathChangeEndHour;
	}

	/**
	 * ���p_��㐧_�I�����ԁi���j���擾���܂��B
	 *
	 * @return ���p_��㐧_�I�����ԁi���j
	 */
	public String getCommonbathChangeEndMinute() {
		return commonbathChangeEndMinute;
	}

	/**
	 * ���p_��㐧_�ӏ������擾���܂��B
	 *
	 * @return ���p_��㐧_�ӏ���
	 */
	public String getCommonbathChangeNum() {
		return commonbathChangeNum;
	}

	/**
	 * ���p_��㐧_�J�n���Ԃ��擾���܂��B
	 *
	 * @return ���p_��㐧_�J�n����
	 */
	public String getCommonbathChangeStart() {
		return KikakuWebUtil.buildTime(getCommonbathChangeStartHour(),
				getCommonbathChangeStartMinute());
	}

	/**
	 * ���p_��㐧_�J�n���ԁi���ԁj���擾���܂��B
	 *
	 * @return ���p_��㐧_�J�n���ԁi���ԁj
	 */
	public String getCommonbathChangeStartHour() {
		return commonbathChangeStartHour;
	}

	/**
	 * ���p_��㐧_�J�n���ԁi���j���擾���܂��B
	 *
	 * @return ���p_��㐧_�J�n���ԁi���j
	 */
	public String getCommonbathChangeStartMinute() {
		return commonbathChangeStartMinute;
	}

	/**
	 * ���p_�L�����擾���܂��B
	 *
	 * @return ���p_�L��
	 */
	public String getCommonbathFlg() {
		return commonbathFlg;
	}

	/**
	 * ���p_��_�ӏ������擾���܂��B
	 *
	 * @return ���p_��_�ӏ���
	 */
	public String getCommonbathLadyNum() {
		return commonbathLadyNum;
	}

	/**
	 * ���p_�j_�ӏ������擾���܂��B
	 *
	 * @return ���p_�j_�ӏ���
	 */
	public String getCommonbathManNum() {
		return commonbathManNum;
	}

	/**
	 * ���p_�j��_�ӏ������擾���܂��B
	 *
	 * @return ���p_�j��_�ӏ���
	 */
	public String getCommonbathMlNum() {
		return commonbathMlNum;
	}

	/**
	 * ������_�N��From���擾���܂��B
	 *
	 * @return ������_�N��From
	 */
	public String getDaycareAgeFrom() {
		return daycareAgeFrom;
	}

	/**
	 * ������_�N��To���擾���܂��B
	 *
	 * @return ������_�N��To
	 */
	public String getDaycareAgeTo() {
		return daycareAgeTo;
	}

	/**
	 * ������_�������擾���܂��B
	 *
	 * @return ������_����
	 */
	public String getDaycareCharge() {
		return daycareCharge;
	}

	/**
	 * ������_����_�L�����擾���܂��B
	 *
	 * @return ������_����_�L��
	 */
	public String getDaycareChargeFlg() {
		return daycareChargeFlg;
	}

	/**
	 * ������_�L�����擾���܂��B
	 *
	 * @return ������_�L��
	 */
	public String getDaycareFlg() {
		return daycareFlg;
	}

	/**
	 * ������_���Ԃ��擾���܂��B
	 *
	 * @return ������_����
	 */
	public String getDaycareTime() {
		return daycareTime;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�I�����擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂP_�I��
	 */
	public String getDaycareTimeEnd1() {
		return KikakuWebUtil.buildTime(getDaycareTimeEnd1Hour(),
				getDaycareTimeEnd1Minute());
	}

	/**
	 * ������_�c�Ǝ��ԂP_�I���i���ԁj���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂP_�I���i���ԁj
	 */
	public String getDaycareTimeEnd1Hour() {
		return daycareTimeEnd1Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�I���i���j���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂP_�I���i���j
	 */
	public String getDaycareTimeEnd1Minute() {
		return daycareTimeEnd1Minute;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�I�����擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂQ_�I��
	 */
	public String getDaycareTimeEnd2() {
		return KikakuWebUtil.buildTime(getDaycareTimeEnd2Hour(),
				getDaycareTimeEnd2Minute());
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�I���i���ԁj���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂQ_�I���i���ԁj
	 */
	public String getDaycareTimeEnd2Hour() {
		return daycareTimeEnd2Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�I���i���j���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂQ_�I���i���j
	 */
	public String getDaycareTimeEnd2Minute() {
		return daycareTimeEnd2Minute;
	}

	/**
	 * ������_�c�Ǝ���_���l���擾���܂��B
	 *
	 * @return ������_�c�Ǝ���_���l
	 */
	public String getDaycareTimeMemo() {
		return daycareTimeMemo;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�J�n���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂP_�J�n
	 */
	public String getDaycareTimeStart1() {
		return KikakuWebUtil.buildTime(getDaycareTimeStart1Hour(),
				getDaycareTimeStart1Minute());
	}

	/**
	 * ������_�c�Ǝ��ԂP_�J�n�i���ԁj���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂP_�J�n�i���ԁj
	 */
	public String getDaycareTimeStart1Hour() {
		return daycareTimeStart1Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�J�n�i���j���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂP_�J�n�i���j
	 */
	public String getDaycareTimeStart1Minute() {
		return daycareTimeStart1Minute;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�J�n���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂQ_�J�n
	 */
	public String getDaycareTimeStart2() {
		return KikakuWebUtil.buildTime(getDaycareTimeStart2Hour(),
				getDaycareTimeStart2Minute());
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�J�n�i���ԁj���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂQ_�J�n�i���ԁj
	 */
	public String getDaycareTimeStart2Hour() {
		return daycareTimeStart2Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�J�n�i���j���擾���܂��B
	 *
	 * @return ������_�c�Ǝ��ԂQ_�J�n�i���j
	 */
	public String getDaycareTimeStart2Minute() {
		return daycareTimeStart2Minute;
	}

	/**
	 * �X�ߎ�_�敪���擾���܂��B
	 *
	 * @return �X�ߎ�_�敪
	 */
	public String getDressingRoomDiv() {
		return dressingRoomDiv;
	}

	/**
	 * �X�ߎ�_���̑����e���擾���܂��B
	 *
	 * @return �X�ߎ�_���̑����e
	 */
	public String getDressingRoomOthers() {
		return dressingRoomOthers;
	}

	/**
	 * �{�݃R�[�h���擾���܂��B
	 *
	 * @return �{�݃R�[�h
	 */
	@Override
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * �{�݃p�^�[�����擾���܂��B
	 *
	 * @return �{�݃p�^�[��
	 */
	@Override
	public String getFacilityPattern() {
		return facilityPattern;
	}

	/**
	 * �񓚏���ʂ��擾���܂��B
	 *
	 * @return �񓚏����
	 */
	@Override
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * �X�ߎ�_�L�����擾���܂��B
	 *
	 * @return �X�ߎ�_�L��
	 */
	public String getLockerroomFlg() {
		return lockerroomFlg;
	}

	/**
	 * �嗁��E���p_���l��ݒ肵�܂��B
	 *
	 * @param bigbathMemo
	 *            �嗁��E���p_���l
	 */
	public void setBigbathMemo(String bigbathMemo) {
		this.bigbathMemo = bigbathMemo;
	}

	/**
	 * ���p_��㐧_�I�����Ԃ�ݒ肵�܂��B
	 *
	 * @param commonbathChangeEnd
	 *            ���p_��㐧_�I������
	 */
	public void setCommonbathChangeEnd(String commonbathChangeEnd) {
		setCommonbathChangeEndHour(KikakuWebUtil
				.getHourFormTime(commonbathChangeEnd));
		setCommonbathChangeEndMinute(KikakuWebUtil
				.getMinuteFromTime(commonbathChangeEnd));
	}

	/**
	 * ���p_��㐧_�I�����ԁi���ԁj��ݒ肵�܂��B
	 *
	 * @param commonbathChangeEndHour
	 *            ���p_��㐧_�I�����ԁi���ԁj
	 */
	public void setCommonbathChangeEndHour(String commonbathChangeEndHour) {
		this.commonbathChangeEndHour = commonbathChangeEndHour;
	}

	/**
	 * ���p_��㐧_�I�����ԁi���j��ݒ肵�܂��B
	 *
	 * @param commonbathChangeEndMinute
	 *            ���p_��㐧_�I�����ԁi���j
	 */
	public void setCommonbathChangeEndMinute(String commonbathChangeEndMinute) {
		this.commonbathChangeEndMinute = commonbathChangeEndMinute;
	}

	/**
	 * ���p_��㐧_�ӏ�����ݒ肵�܂��B
	 *
	 * @param commonbathChangeNum
	 *            ���p_��㐧_�ӏ���
	 */
	public void setCommonbathChangeNum(String commonbathChangeNum) {
		this.commonbathChangeNum = commonbathChangeNum;
	}

	/**
	 * ���p_��㐧_�J�n���Ԃ�ݒ肵�܂��B
	 *
	 * @param commonbathChangeStart
	 *            ���p_��㐧_�J�n����
	 */
	public void setCommonbathChangeStart(String commonbathChangeStart) {
		setCommonbathChangeStartHour(KikakuWebUtil
				.getHourFormTime(commonbathChangeStart));
		setCommonbathChangeStartMinute(KikakuWebUtil
				.getMinuteFromTime(commonbathChangeStart));
	}

	/**
	 * ���p_��㐧_�J�n���ԁi���ԁj��ݒ肵�܂��B
	 *
	 * @param commonbathChangeStartHour
	 *            ���p_��㐧_�J�n���ԁi���ԁj
	 */
	public void setCommonbathChangeStartHour(String commonbathChangeStartHour) {
		this.commonbathChangeStartHour = commonbathChangeStartHour;
	}

	/**
	 * ���p_��㐧_�J�n���ԁi���j��ݒ肵�܂��B
	 *
	 * @param commonbathChangeStartMinute
	 *            ���p_��㐧_�J�n���ԁi���j
	 */
	public void setCommonbathChangeStartMinute(
			String commonbathChangeStartMinute) {
		this.commonbathChangeStartMinute = commonbathChangeStartMinute;
	}

	/**
	 * ���p_�L����ݒ肵�܂��B
	 *
	 * @param commonbathFlg
	 *            ���p_�L��
	 */
	public void setCommonbathFlg(String commonbathFlg) {
		this.commonbathFlg = commonbathFlg;
	}

	/**
	 * ���p_��_�ӏ�����ݒ肵�܂��B
	 *
	 * @param commonbathLadyNum
	 *            ���p_��_�ӏ���
	 */
	public void setCommonbathLadyNum(String commonbathLadyNum) {
		this.commonbathLadyNum = commonbathLadyNum;
	}

	/**
	 * ���p_�j_�ӏ�����ݒ肵�܂��B
	 *
	 * @param commonbathManNum
	 *            ���p_�j_�ӏ���
	 */
	public void setCommonbathManNum(String commonbathManNum) {
		this.commonbathManNum = commonbathManNum;
	}

	/**
	 * ���p_�j��_�ӏ�����ݒ肵�܂��B
	 *
	 * @param commonbathMlNum
	 *            ���p_�j��_�ӏ���
	 */
	public void setCommonbathMlNum(String commonbathMlNum) {
		this.commonbathMlNum = commonbathMlNum;
	}

	/**
	 * ������_�N��From��ݒ肵�܂��B
	 *
	 * @param daycareAgeFrom
	 *            ������_�N��From
	 */
	public void setDaycareAgeFrom(String daycareAgeFrom) {
		this.daycareAgeFrom = StringUtils.trimToEmpty(daycareAgeFrom);
	}

	/**
	 * ������_�N��To��ݒ肵�܂��B
	 *
	 * @param daycareAgeTo
	 *            ������_�N��To
	 */
	public void setDaycareAgeTo(String daycareAgeTo) {
		this.daycareAgeTo = StringUtils.trimToEmpty(daycareAgeTo);
	}

	/**
	 * ������_������ݒ肵�܂��B
	 *
	 * @param daycareCharge
	 *            ������_����
	 */
	public void setDaycareCharge(String daycareCharge) {
		this.daycareCharge = daycareCharge;
	}

	/**
	 * ������_����_�L����ݒ肵�܂��B
	 *
	 * @param daycareChargeFlg
	 *            ������_����_�L��
	 */
	public void setDaycareChargeFlg(String daycareChargeFlg) {
		this.daycareChargeFlg = daycareChargeFlg;
	}

	/**
	 * ������_�L����ݒ肵�܂��B
	 *
	 * @param daycareFlg
	 *            ������_�L��
	 */
	public void setDaycareFlg(String daycareFlg) {
		this.daycareFlg = daycareFlg;
	}

	/**
	 * ������_���Ԃ�ݒ肵�܂��B
	 *
	 * @param daycareTime
	 *            ������_����
	 */
	public void setDaycareTime(String daycareTime) {
		this.daycareTime = daycareTime;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�I����ݒ肵�܂��B
	 *
	 * @param daycareTimeEnd1
	 *            ������_�c�Ǝ��ԂP_�I��
	 */
	public void setDaycareTimeEnd1(String daycareTimeEnd1) {
		setDaycareTimeEnd1Hour(KikakuWebUtil.getHourFormTime(daycareTimeEnd1));
		setDaycareTimeEnd1Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeEnd1));
	}

	/**
	 * ������_�c�Ǝ��ԂP_�I���i���ԁj��ݒ肵�܂��B
	 *
	 * @param daycareTimeEnd1Hour
	 *            ������_�c�Ǝ��ԂP_�I���i���ԁj
	 */
	public void setDaycareTimeEnd1Hour(String daycareTimeEnd1Hour) {
		this.daycareTimeEnd1Hour = daycareTimeEnd1Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�I���i���j��ݒ肵�܂��B
	 *
	 * @param daycareTimeEnd1Minute
	 *            ������_�c�Ǝ��ԂP_�I���i���j
	 */
	public void setDaycareTimeEnd1Minute(String daycareTimeEnd1Minute) {
		this.daycareTimeEnd1Minute = daycareTimeEnd1Minute;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�I����ݒ肵�܂��B
	 *
	 * @param daycareTimeEnd2
	 *            ������_�c�Ǝ��ԂQ_�I��
	 */
	public void setDaycareTimeEnd2(String daycareTimeEnd2) {
		setDaycareTimeEnd2Hour(KikakuWebUtil.getHourFormTime(daycareTimeEnd2));
		setDaycareTimeEnd2Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeEnd2));
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�I���i���ԁj��ݒ肵�܂��B
	 *
	 * @param daycareTimeEnd2Hour
	 *            ������_�c�Ǝ��ԂQ_�I���i���ԁj
	 */
	public void setDaycareTimeEnd2Hour(String daycareTimeEnd2Hour) {
		this.daycareTimeEnd2Hour = daycareTimeEnd2Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�I���i���j��ݒ肵�܂��B
	 *
	 * @param daycareTimeEnd2Minute
	 *            ������_�c�Ǝ��ԂQ_�I���i���j
	 */
	public void setDaycareTimeEnd2Minute(String daycareTimeEnd2Minute) {
		this.daycareTimeEnd2Minute = daycareTimeEnd2Minute;
	}

	/**
	 * ������_�c�Ǝ���_���l��ݒ肵�܂��B
	 *
	 * @param daycareTimeMemo
	 *            ������_�c�Ǝ���_���l
	 */
	public void setDaycareTimeMemo(String daycareTimeMemo) {
		this.daycareTimeMemo = daycareTimeMemo;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�J�n��ݒ肵�܂��B
	 *
	 * @param daycareTimeStart1
	 *            ������_�c�Ǝ��ԂP_�J�n
	 */
	public void setDaycareTimeStart1(String daycareTimeStart1) {
		setDaycareTimeStart1Hour(KikakuWebUtil
				.getHourFormTime(daycareTimeStart1));
		setDaycareTimeStart1Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeStart1));
	}

	/**
	 * ������_�c�Ǝ��ԂP_�J�n�i���ԁj��ݒ肵�܂��B
	 *
	 * @param daycareTimeStart1Hour
	 *            ������_�c�Ǝ��ԂP_�J�n�i���ԁj
	 */
	public void setDaycareTimeStart1Hour(String daycareTimeStart1Hour) {
		this.daycareTimeStart1Hour = daycareTimeStart1Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂP_�J�n�i���j��ݒ肵�܂��B
	 *
	 * @param daycareTimeStart1Minute
	 *            ������_�c�Ǝ��ԂP_�J�n�i���j
	 */
	public void setDaycareTimeStart1Minute(String daycareTimeStart1Minute) {
		this.daycareTimeStart1Minute = daycareTimeStart1Minute;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�J�n��ݒ肵�܂��B
	 *
	 * @param daycareTimeStart2
	 *            ������_�c�Ǝ��ԂQ_�J�n
	 */
	public void setDaycareTimeStart2(String daycareTimeStart2) {
		setDaycareTimeStart2Hour(KikakuWebUtil
				.getHourFormTime(daycareTimeStart2));
		setDaycareTimeStart2Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeStart2));
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�J�n�i���ԁj��ݒ肵�܂��B
	 *
	 * @param daycareTimeStart2Hour
	 *            ������_�c�Ǝ��ԂQ_�J�n�i���ԁj
	 */
	public void setDaycareTimeStart2Hour(String daycareTimeStart2Hour) {
		this.daycareTimeStart2Hour = daycareTimeStart2Hour;
	}

	/**
	 * ������_�c�Ǝ��ԂQ_�J�n�i���j��ݒ肵�܂��B
	 *
	 * @param daycareTimeStart2Minute
	 *            ������_�c�Ǝ��ԂQ_�J�n�i���j
	 */
	public void setDaycareTimeStart2Minute(String daycareTimeStart2Minute) {
		this.daycareTimeStart2Minute = daycareTimeStart2Minute;
	}

	/**
	 * �X�ߎ�_�敪��ݒ肵�܂��B
	 *
	 * @param dressingRoomDiv
	 *            �X�ߎ�_�敪
	 */
	public void setDressingRoomDiv(String dressingRoomDiv) {
		this.dressingRoomDiv = dressingRoomDiv;
	}

	/**
	 * �X�ߎ�_���̑����e��ݒ肵�܂��B
	 *
	 * @param dressingRoomOthers
	 *            �X�ߎ�_���̑����e
	 */
	public void setDressingRoomOthers(String dressingRoomOthers) {
		this.dressingRoomOthers = dressingRoomOthers;
	}

	/**
	 * �{�݃R�[�h��ݒ肵�܂��B
	 *
	 * @param facilityCd
	 *            �{�݃R�[�h
	 */
	@Override
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * �{�݃p�^�[����ݒ肵�܂��B
	 *
	 * @param facilityPattern
	 *            �{�݃p�^�[��
	 */
	@Override
	public void setFacilityPattern(String facilityPattern) {
		this.facilityPattern = facilityPattern;
	}

	/**
	 * �񓚏���ʂ�ݒ肵�܂��B
	 *
	 * @param kindFlg
	 *            �񓚏����
	 */
	@Override
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}

	/**
	 * �X�ߎ�_�L����ݒ肵�܂��B
	 *
	 * @param lockerroomFlg
	 *            �X�ߎ�_�L��
	 */
	public void setLockerroomFlg(String lockerroomFlg) {
		this.lockerroomFlg = lockerroomFlg;
	}

}
