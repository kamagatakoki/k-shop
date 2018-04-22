package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * NO5_�{�݃f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class EquipmentData {
	
	/**
	 * ���񓚘A�� .
	 */
	private Long planAnsNo;

	/**
	 * ����ԍ� .
	 */
	private Integer careerNo;

	/**
	 * �ݔ���� .
	 */
	private Integer equipmentKind;

	/**
	 * �ݔ��L�� .
	 */
	private String equipmentFlg;

	/**
	 * �����L�� .
	 */
	private String chargeFlg;

	/**
	 * ���p���� .
	 */
	private String useTime;

	/**
	 * ���p���� .
	 */
	private String useFee;

	/**
	 * �ݔ����� .
	 */
	private String facilityNum;

	/**
	 * ���p�\���ԊJ�n�� .
	 */
	private String periodBeginM;

	/**
	 * ���p�\���ԊJ�n�� .
	 */
	private String periodBeginD;

	/**
	 * ���p�\���ԏI���� .
	 */
	private String periodEndM;

	/**
	 * ���p�\���ԏI���� .
	 */
	private String periodEndD;

	/**
	 * �V���T�[�r�X�敪 .
	 */
	private Integer newspaperServiceDiv;

	/**
	 * ���ԏꗘ�p�䐔 .
	 */
	private String parkAvailableNum;

	/**
	 * ���ԏ�ꔑ���z .
	 */
	private String parkCharge;

	/**
	 * �Ċ�R���r�j�k������ .
	 */
	private String nearStoreWalktime;
	
	/**
	 * �R���r�Ɂ[�c�ƊJ�n���ԁi���j 2009/11/12 add by s31109 .
	 */
	private String storeBeginHour;
	
	/**
	 * �R���r�Ɂ[�c�ƊJ�n���ԁi���j 2009/11/12 add by s31109 .
	 */
	private String storeBeginMinute;
	
	/**
	 * �R���r�Ɂ[�c�ƏI�����ԁi���j 2009/11/12 add by s31109 .
	 */
	private String storeEndHour;
	
	/**
	 * �R���r�Ɂ[�c�ƏI�����ԁi���j 2009/11/12 add by s31109 .
	 */
	private String storeEndMinute;

	/**
	 * @return ����ԍ�
	 */
	public Integer getCareerNo() {
		return careerNo;
	}

	/**
	 * @param careerNo ����ԍ�
	 */
	public void setCareerNo(Integer careerNo) {
		this.careerNo = careerNo;
	}

	/**
	 * @return �����L��
	 */
	public String getChargeFlg() {
		return chargeFlg;
	}

	/**
	 * @param chargeFlg �����L��
	 */
	public void setChargeFlg(String chargeFlg) {
		this.chargeFlg = chargeFlg;
	}

	/**
	 * @return �ݔ��L��
	 */
	public String getEquipmentFlg() {
		return equipmentFlg;
	}

	/**
	 * @param equipmentFlg �ݔ��L��
	 */
	public void setEquipmentFlg(String equipmentFlg) {
		this.equipmentFlg = equipmentFlg;
	}

	/**
	 * @return �ݔ����
	 */
	public Integer getEquipmentKind() {
		return equipmentKind;
	}

	/**
	 * @param equipmentKind �ݔ����
	 */
	public void setEquipmentKind(Integer equipmentKind) {
		this.equipmentKind = equipmentKind;
	}

	/**
	 * @return �ݔ�����
	 */
	public String getFacilityNum() {
		return facilityNum;
	}

	/**
	 * @param facilityNum �ݔ�����
	 */
	public void setFacilityNum(String facilityNum) {
		this.facilityNum = StringUtil.toHalf(facilityNum);
	}

	/**
	 * @return �Ċ�R���r�j�k������
	 */
	public String getNearStoreWalktime() {
		return nearStoreWalktime;
	}

	/**
	 * @param nearStoreWalktime �Ċ�R���r�j�k������
	 */
	public void setNearStoreWalktime(String nearStoreWalktime) {
		this.nearStoreWalktime = StringUtil.toHalf(nearStoreWalktime);
	}

	/**
	 * @return �V���T�[�r�X�敪
	 */
	public Integer getNewspaperServiceDiv() {
		return newspaperServiceDiv;
	}

	/**
	 * @param newspaperServiceDiv �V���T�[�r�X�敪
	 */
	public void setNewspaperServiceDiv(Integer newspaperServiceDiv) {
		this.newspaperServiceDiv = newspaperServiceDiv;
	}

	/**
	 * @return ���ԏꗘ�p�䐔
	 */
	public String getParkAvailableNum() {
		return parkAvailableNum;
	}

	/**
	 * @param parkAvailableNum ���ԏꗘ�p�䐔
	 */
	public void setParkAvailableNum(String parkAvailableNum) {
		this.parkAvailableNum = StringUtil.toHalf(parkAvailableNum);
	}

	/**
	 * @return ���ԏ�ꔑ���z
	 */
	public String getParkCharge() {
		return parkCharge;
	}

	/**
	 * @param parkCharge ���ԏ�ꔑ���z
	 */
	public void setParkCharge(String parkCharge) {

		String str = StringUtil.toHalf(parkCharge);
		/*if (!StringUtil.isEmpty(parkCharge)) {
			str = str.replaceAll(",", "");
		}*/
		this.parkCharge = str;
	}

	/**
	 * @return ���p�\���ԊJ�n��
	 */
	public String getPeriodBeginD() {
		return periodBeginD;
	}

	/**
	 * @param periodBeginD ���p�\���ԊJ�n��
	 */
	public void setPeriodBeginD(String periodBeginD) {
		this.periodBeginD = StringUtil.toHalf(periodBeginD);
	}

	/**
	 * @return ���p�\���ԊJ�n��
	 */
	public String getPeriodBeginM() {
		return periodBeginM;
	}

	/**
	 * @param periodBeginM ���p�\���ԊJ�n��
	 */
	public void setPeriodBeginM(String periodBeginM) {
		this.periodBeginM = StringUtil.toHalf(periodBeginM);
	}

	/**
	 * @return ���p�\���ԏI����
	 */
	public String getPeriodEndD() {
		return periodEndD;
	}

	/**
	 * @param periodEndD ���p�\���ԏI����
	 */
	public void setPeriodEndD(String periodEndD) {
		this.periodEndD = StringUtil.toHalf(periodEndD);
	}

	/**
	 * @return ���p�\���ԏI����
	 */
	public String getPeriodEndM() {
		return periodEndM;
	}

	/**
	 * @param periodEndM ���p�\���ԏI����
	 */
	public void setPeriodEndM(String periodEndM) {
		this.periodEndM = StringUtil.toHalf(periodEndM);
	}

	/**
	 * @return ���񓚘A��
	 */
	public Long getPlanAnsNo() {
		return planAnsNo;
	}

	/**
	 * @param planAnsNo ���񓚘A��
	 */
	public void setPlanAnsNo(Long planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

	/**
	 * @return ���p����
	 */
	public String getUseFee() {
		return useFee;
	}

	/**
	 * @param useFee ���p����
	 */
	public void setUseFee(String useFee) {
		this.useFee = StringUtil.toHalf(useFee);
	}

	/**
	 * @return ���p����
	 */
	public String getUseTime() {
		return useTime;
	}

	/**
	 * @param useTime ���p����
	 */
	public void setUseTime(String useTime) {
		this.useTime = StringUtil.toHalf(useTime);
	}
	
	/**
	 * @return �R���r�Ɂ[�c�ƊJ�n���ԁi���j
	 */
	public String getStoreBeginHour() {
		return storeBeginHour;
	}

	/**
	 * @param �R���r�Ɂ[�c�ƊJ�n���ԁi���j
	 */
	public void setStoreBeginHour(String storeBeginHour) {
		this.storeBeginHour = storeBeginHour;
	}
	
	/**
	 * @return �R���r�Ɂ[�c�ƊJ�n���ԁi���j
	 */
	public String getStoreBeginMinute() {
		return storeBeginMinute;
	}

	/**
	 * @param �R���r�Ɂ[�c�ƊJ�n���ԁi���j
	 */
	public void setStoreBeginMinute(String storeBeginMinute) {
		this.storeBeginMinute = storeBeginMinute;
	}
	
	/**
	 * @return �R���r�Ɂ[�c�ƏI�����ԁi���j
	 */
	public String getStoreEndHour() {
		return storeEndHour;
	}

	/**
	 * @param �R���r�Ɂ[�c�ƏI�����ԁi���j
	 */
	public void setStoreEndHour(String storeEndHour) {
		this.storeEndHour = storeEndHour;
	}
	
	/**
	 * @return �R���r�Ɂ[�c�ƏI�����ԁi���j
	 */
	public String getStoreEndMinute() {
		return storeEndMinute;
	}

	/**
	 * @param �R���r�Ɂ[�c�ƏI�����ԁi���j
	 */
	public void setStoreEndMinute(String storeEndMinute) {
		this.storeEndMinute = storeEndMinute;
	}
	
	/**
	 * @return �R���r�Ɂ[�c�ƊJ�n����
	 */
	public String getStoreBegin() {
		return KikakuWebUtil.buildTime(storeBeginHour, storeBeginMinute);
	}

	/**
	 * @param �R���r�Ɂ[�c�ƊJ�n����
	 */
	public void setStoreBegin(String storeBegin) {
		setStoreBeginHour(KikakuWebUtil.getHourFormTime(storeBegin));
		setStoreBeginMinute(KikakuWebUtil.getMinuteFromTime(storeBegin));
	}
	
	/**
	 * @return �R���r�Ɂ[�c�ƏI������
	 */
	public String getStoreEnd() {
		return KikakuWebUtil.buildTime(storeEndHour, storeEndMinute);
	}

	/**
	 * @param �R���r�Ɂ[�c�ƏI������
	 */
	public void setStoreEnd(String storeEnd) {
		setStoreEndHour(KikakuWebUtil.getHourFormTime(storeEnd));
		setStoreEndMinute(KikakuWebUtil.getMinuteFromTime(storeEnd));
	}
	
}
