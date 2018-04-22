package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * NO5_��ʏ��f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class GeneralInfoData {
											
											
	/**
	 * ���񓚘A�� .							
	 */
	private Long planAnsNo;

	/**
	 * ����ԍ� .							
	 */
	private Integer careerNo;

	/**
	 * �Z�[���X�|�C���g .
	 */
	private String salesPoint;

	/**
	 * �q�������L�� .
	 */
	private String childFreeFlg;

	/**
	 * �q�������N�� .
	 *//*
	private String childFreeAge;*/
	
	
	/**
	 * �q�������L��(�J�n�N��) .
	 */
	private String childFreeAgeFrom;
	/**
	 * �q�������L��(�I���N��) .
	 */
	private String childFreeAgeTo;
	/**
	 * �q�������L��(����) .
	 */
	private String childFreeAgeCond;
	/**
	 * �q�������L��(�J�n�N��) .
	 */
	private String childPayAgeFrom;
	/**
	 * �q�������L��(�I���N��) .
	 */
	private String childPayAgeTo;
	/**
	 * �q�������L��(����) .
	 */
	private String childPayAgeCond;
/*	*//**
	 * �q���L���N�� .
	 *//*
	private String childPayAge;*/

	/**
	 * �q������ .
	 */
	private String childFees;

	/**
	 * �q�������R�����g .
	 */
	private String childFeesCmt;

	/**
	 * �q�w�ʂ������ߗL�� .
	 */
	private String customerFlg;

	/**
	 * �������ߋq�w .
	 */
	private String customerDiv;

	/**
	 * �������߃R�����g .
	 */
	private String suggestionCmt;

	/**
	 * �����}�b�T�[�W�@�L�� .
	 */
	private String massagerFlg;

	/**
	 * �����}�b�T�[�W�@�䐔 .
	 */
	private String massagerNum;

	/**
	 * �����}�b�T�[�W�@�ݒu�ꏊ .
	 */
	private String massagerLocation;

	/**
	 * �����}�b�T�[�W�@�L���L�� .
	 */
	private String massagerPayFlg;

	/**
	 * �����}�b�T�[�W�@���p���� .
	 */
	private String massagerUseTime;

	/**
	 * �����}�b�T�[�W�@���p���z .
	 */
	private String massagerUseAmt;

	/**
	 * �Ԉ֎q����L�� .
	 */
	private String wheelchairFlg;

	/**
	 * �Ԉ֎q����䐔 .
	 */
	private String wheelchairNum;

	/**
	 * �G���x�[�^�[�L�� .
	 */
	private String elevatorFlg;

	/**
	 * �����܂Ńy�b�g�L�� .
	 */
	private String roomPetFlg;

	/**
	 * �����܂Ńy�b�g���� .
	 */
	private String roomPetCond;

	/**
	 * �����܂Ŗӓ����L�� .
	 */
	private String roomGuideDogFlg;

	/**
	 * ��b�̏o����t�����g�W�L�� .
	 */
	private String signLangFrontFlg;

	/**
	 * ��b�S���敪 .
	 */
	private Integer signLangAllDiv;

	/**
	 * ��b���ԋ敪 .
	 */
	private String signLangTimeDiv;

	/**
	 * ��b�J�n����:���� .
	 */
	private String signLangBeginHour;
	
	/**
	 * ��b�J�n����:�� .
	 */
	private String signLangBeginMinute;

	/**
	 * ��b�I�����ԁF���� .
	 */
	private String signLangEndHour;
	
	/**
	 * ��b�I�����ԁF�� .
	 */
	private String signLangEndMinute;
	
	/**
	 * �p��̏o����t�����g�W�L�� .
	 */
	private String engFrontFlg;

	/**
	 * �p��S���敪 .
	 */
	private Integer engAllDiv;

	/**
	 * �p�ꎞ�ԋ敪 .
	 */
	private String engTimeDiv;

	/**
	 * �p��J�n���ԁF���� .
	 */
	private String engTimeBeginHour;
	
	/**
	 * �p��J�n���ԁF�� .
	 */
	private String engTimeBeginMinute;

	/** 
	 * �p��I�����ԁF���� .	
	 */
	private String engTimeEndHour;

	/**
	 * �p��I�����ԁF�� .
	 */
	private String engTimeEndMinute;
	/**
	 * �z���N�L�� .
	 */
	private String buildingYearsFlg;

	/**
	 * �{�ٔN�� .
	 */
	private String mainBuildingYears;

	/**
	 * �ʊٔN�� .
	 */
	private String annexYears;

	/**
	 * �V�ٔN�� .
	 */
	private String newBuildingYears;

	/**
	 * ���̑��R�����g . 	
	 */
	private String othersCmt;

	/**
	 * ���q�����L�� .
	 */
	private String totalRoomFlg;

	/**
	 * ���q���� .
	 */
	private String totalRoomNum;

	/** 
	 * ���l .
	 */
	private String memo;

	/**
	 * @return �ʊٔN��
	 */
	public String getAnnexYears() {
		return annexYears;
	}

	/**
	 * @param annexYears �ʊٔN��
	 */
	public void setAnnexYears(String annexYears) {
		this.annexYears = StringUtil.toHalf(annexYears);
	}

	/**
	 * @return �z���N�L��
	 */
	public String getBuildingYearsFlg() {
		return buildingYearsFlg;
	}

	/**
	 * @param buildingYearsFlg �z���N�L��
	 */
	public void setBuildingYearsFlg(String buildingYearsFlg) {
		this.buildingYearsFlg = buildingYearsFlg;
	}

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
	 * @return �q������
	 */
	public String getChildFees() {
		return childFees;
	}

	/**
	 * @param childFees �q������
	 */
	public void setChildFees(String childFees) {
		this.childFees = StringUtil.toHalf(childFees);
	}

	/**
	 * @return �q�������R�����g
	 */
	public String getChildFeesCmt() {
		return childFeesCmt;
	}

	/**
	 * @param childFeesCmt �q�������R�����g
	 */
	public void setChildFeesCmt(String childFeesCmt) {
		this.childFeesCmt = childFeesCmt;
	}

/*	*//**
	 * @return �q�������N��
	 *//*
	public String getChildFreeAge() {
		return childFreeAge;
	}

	*//**
	 * @param childFreeAge �q�������N��
	 *//*
	public void setChildFreeAge(String childFreeAge) {
		this.childFreeAge = StringUtil.toHalf(childFreeAge);
	}*/

	/**
	 * @return �q�������L��
	 */
	public String getChildFreeFlg() {
		return childFreeFlg;
	}

	/**
	 * @param childFreeFlg �q�������L��
	 */
	public void setChildFreeFlg(String childFreeFlg) {
		this.childFreeFlg = childFreeFlg;
	}

/*	*//**
	 * @return �q���L���N��
	 *//*
	public String getChildPayAge() {
		return childPayAge;
	}

	*//**
	 * @param childPayAge �q���L���N��
	 *//*
	public void setChildPayAge(String childPayAge) {
		this.childPayAge = StringUtil.toHalf(childPayAge);
	}*/

	/**
	 * @return �������ߋq�w
	 */
	public String getCustomerDiv() {
		return customerDiv;
	}

	/**
	 * @param customerDiv �������ߋq�w
	 */
	public void setCustomerDiv(String customerDiv) {
		this.customerDiv = customerDiv;
	}

	/**
	 * @return �q�w�ʂ������ߗL��
	 */
	public String getCustomerFlg() {
		return customerFlg;
	}

	/**
	 * @param customerFlg �q�w�ʂ������ߗL��
	 */
	public void setCustomerFlg(String customerFlg) {
		this.customerFlg = customerFlg;
	}

	/**
	 * @return �G���x�[�^�[�L��
	 */
	public String getElevatorFlg() {
		return elevatorFlg;
	}

	/**
	 * @param elevatorFlg �G���x�[�^�[�L��
	 */
	public void setElevatorFlg(String elevatorFlg) {
		this.elevatorFlg = elevatorFlg;
	}

	/**
	 * @return �p��S���敪
	 */
	public Integer getEngAllDiv() {
		return engAllDiv;
	}

	/**
	 * @param engAllDiv �p��S���敪
	 */
	public void setEngAllDiv(Integer engAllDiv) {
		this.engAllDiv = engAllDiv;
	}

	/**
	 * @return �p��̏o����t�����g�W�L��
	 */
	public String getEngFrontFlg() {
		return engFrontFlg;
	}

	/**
	 * @param engFrontFlg �p��̏o����t�����g�W�L��
	 */
	public void setEngFrontFlg(String engFrontFlg) {
		this.engFrontFlg = engFrontFlg;
	}

	/**
	 * @return �p��J�n����
	 */
	public String getEngTimeBegin() {
		
		return KikakuWebUtil.buildTime(engTimeBeginHour, engTimeBeginMinute);
	}

	/**
	 * 
	 * @param engTimeBegin �p��J�n����
	 */
	public void setEngTimeBegin(String engTimeBegin) {

		setEngTimeBeginHour(KikakuWebUtil.getHourFormTime(engTimeBegin));
		setEngTimeBeginMinute(KikakuWebUtil.getMinuteFromTime(engTimeBegin));
	}
	/**
	 * @return �p�ꎞ�ԋ敪
	 */
	public String getEngTimeDiv() {
		return engTimeDiv;
	}

	/**
	 * @param engTimeDiv �p�ꎞ�ԋ敪
	 */
	public void setEngTimeDiv(String engTimeDiv) {
		this.engTimeDiv = engTimeDiv;
	}

	/**
	 * @return �p��I������
	 */
	public String getEngTimeEnd() {
		
		return KikakuWebUtil.buildTime(engTimeEndHour, engTimeEndMinute);
	}
	
	/**
	 * 
	 * @param engTimeEnd �p��I������
	 */
	public void setEngTimeEnd(String engTimeEnd) {

		setEngTimeEndHour(KikakuWebUtil.getHourFormTime(engTimeEnd));
		setEngTimeEndMinute(KikakuWebUtil.getMinuteFromTime(engTimeEnd));
	}
	

	/**
	 * @return �{�ٔN��
	 */
	public String getMainBuildingYears() {
		return mainBuildingYears;
	}

	/**
	 * @param mainBuildingYears �{�ٔN��
	 */
	public void setMainBuildingYears(String mainBuildingYears) {
		this.mainBuildingYears = StringUtil.toHalf(mainBuildingYears);
	}

	/**
	 * @return �����}�b�T�[�W�@�L��
	 */
	public String getMassagerFlg() {
		return massagerFlg;
	}

	/**
	 * @param massagerFlg �����}�b�T�[�W�@�L��
	 */
	public void setMassagerFlg(String massagerFlg) {
		this.massagerFlg = massagerFlg;
	}

	/**
	 * @return �����}�b�T�[�W�@�ݒu�ꏊ
	 */
	public String getMassagerLocation() {
		return massagerLocation;
	}

	/**
	 * @param massagerLocation �����}�b�T�[�W�@�ݒu�ꏊ
	 */
	public void setMassagerLocation(String massagerLocation) {
		this.massagerLocation = massagerLocation;
	}

	/**
	 * @return �����}�b�T�[�W�@�䐔
	 */
	public String getMassagerNum() {
		return massagerNum;
	}

	/**
	 * @param massagerNum �����}�b�T�[�W�@�䐔
	 */
	public void setMassagerNum(String massagerNum) {
		this.massagerNum = StringUtil.toHalf(massagerNum);
	}

	/**
	 * @return �����}�b�T�[�W�@�L���L��
	 */
	public String getMassagerPayFlg() {
		return massagerPayFlg;
	}

	/**
	 * @param massagerPayFlg �����}�b�T�[�W�@�L���L��
	 */
	public void setMassagerPayFlg(String massagerPayFlg) {
		this.massagerPayFlg = massagerPayFlg;
	}

	/**
	 * @return �����}�b�T�[�W�@���p���z
	 */
	public String getMassagerUseAmt() {
		return massagerUseAmt;
	}

	/**
	 * @param massagerUseAmt �����}�b�T�[�W�@���p���z
	 */
	public void setMassagerUseAmt(String massagerUseAmt) {
		this.massagerUseAmt = StringUtil.toHalf(massagerUseAmt);
	}

	/**
	 * @return �����}�b�T�[�W�@���p����
	 */
	public String getMassagerUseTime() {
		return massagerUseTime;
	}

	/**
	 * @param massagerUseTime �����}�b�T�[�W�@���p����
	 */
	public void setMassagerUseTime(String massagerUseTime) {
		this.massagerUseTime = StringUtil.toHalf(massagerUseTime);
	}

	/**
	 * @return ���l
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo ���l
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return �V�ٔN��
	 */
	public String getNewBuildingYears() {
		return newBuildingYears;
	}

	/**
	 * @param newBuildingYears �V�ٔN��
	 */
	public void setNewBuildingYears(String newBuildingYears) {
		this.newBuildingYears = StringUtil.toHalf(newBuildingYears);
	}

	/**
	 * @return ���̑��R�����g
	 */
	public String getOthersCmt() {
		return othersCmt;
	}

	/**
	 * @param othersCmt ���̑��R�����g
	 */
	public void setOthersCmt(String othersCmt) {
		this.othersCmt = othersCmt;
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
	 * @return �����܂Ŗӓ����L��
	 */
	public String getRoomGuideDogFlg() {
		return roomGuideDogFlg;
	}

	/**
	 * @param roomGuideDogFlg �����܂Ŗӓ����L��
	 */
	public void setRoomGuideDogFlg(String roomGuideDogFlg) {
		this.roomGuideDogFlg = roomGuideDogFlg;
	}

	/**
	 * @return �����܂Ńy�b�g����
	 */
	public String getRoomPetCond() {
		return roomPetCond;
	}

	/**
	 * @param roomPetCond �����܂Ńy�b�g����
	 */
	public void setRoomPetCond(String roomPetCond) {
		this.roomPetCond = roomPetCond;
	}

	/**
	 * @return �����܂Ńy�b�g�L��
	 */
	public String getRoomPetFlg() {
		return roomPetFlg;
	}

	/**
	 * @param roomPetFlg �����܂Ńy�b�g�L��
	 */
	public void setRoomPetFlg(String roomPetFlg) {
		this.roomPetFlg = roomPetFlg;
	}

	/**
	 * @return �Z�[���X�|�C���g
	 */
	public String getSalesPoint() {
		return salesPoint;
	}

	/**
	 * @param salesPoint �Z�[���X�|�C���g
	 */
	public void setSalesPoint(String salesPoint) {
		this.salesPoint = salesPoint;
	}

	/**
	 * @return ��b�S���敪
	 */
	public Integer getSignLangAllDiv() {
		return signLangAllDiv;
	}

	/**
	 * @param signLangAllDiv ��b�S���敪
	 */
	public void setSignLangAllDiv(Integer signLangAllDiv) {
		this.signLangAllDiv = signLangAllDiv;
	}

	/**
	 * @return ��b�J�n����
	 */
	public String getSignLangBegin() {

		return KikakuWebUtil.buildTime(signLangBeginHour, signLangBeginMinute);
	}

	/**
	 * 
	 * @param signLangBegin ��b�J�n����
	 */
	public void setSignLangBegin(String signLangBegin) {
		
		setSignLangBeginHour(KikakuWebUtil.getHourFormTime(signLangBegin));
		setSignLangBeginMinute(KikakuWebUtil.getMinuteFromTime(signLangBegin));
	}
	/**
	 * @return ��b�I������
	 */
	public String getSignLangEnd() {
		
		return KikakuWebUtil.buildTime(signLangEndHour, signLangEndMinute);
	}

	/**
	 * 
	 * @param signLangEnd ��b�I������
	 */
	public void setSignLangEnd(String signLangEnd) {

		setSignLangEndHour(KikakuWebUtil.getHourFormTime(signLangEnd));
		setSignLangEndMinute(KikakuWebUtil.getMinuteFromTime(signLangEnd));
	}

	/**
	 * @return ��b�̏o����t�����g�W�L��
	 */
	public String getSignLangFrontFlg() {
		return signLangFrontFlg;
	}

	/**
	 * @param signLangFrontFlg ��b�̏o����t�����g�W�L��
	 */
	public void setSignLangFrontFlg(String signLangFrontFlg) {
		this.signLangFrontFlg = signLangFrontFlg;
	}

	/**
	 * @return ��b���ԋ敪
	 */
	public String getSignLangTimeDiv() {
		return signLangTimeDiv;
	}

	/**
	 * @param signLangTimeDiv ��b���ԋ敪
	 */
	public void setSignLangTimeDiv(String signLangTimeDiv) {
		this.signLangTimeDiv = signLangTimeDiv;
	}

	/**
	 * @return �������߃R�����g
	 */
	public String getSuggestionCmt() {
		return suggestionCmt;
	}

	/**
	 * @param suggestionCmt �������߃R�����g
	 */
	public void setSuggestionCmt(String suggestionCmt) {
		this.suggestionCmt = suggestionCmt;
	}

	/**
	 * @return ���q�����L��
	 */
	public String getTotalRoomFlg() {
		return totalRoomFlg;
	}

	/**
	 * @param totalRoomFlg ���q�����L��
	 */
	public void setTotalRoomFlg(String totalRoomFlg) {
		this.totalRoomFlg = totalRoomFlg;
	}

	/**
	 * @return ���q����
	 */
	public String getTotalRoomNum() {
		return totalRoomNum;
	}

	/**
	 * @param totalRoomNum ���q����
	 */
	public void setTotalRoomNum(String totalRoomNum) {
		this.totalRoomNum = StringUtil.toHalf(totalRoomNum);
	}

	/**
	 * @return �Ԉ֎q����L��	
	 */
	public String getWheelchairFlg() {
		return wheelchairFlg;
	}

	/**
	 * @param wheelchairFlg �Ԉ֎q����L��	
	 */
	public void setWheelchairFlg(String wheelchairFlg) {
		this.wheelchairFlg = wheelchairFlg;
	}

	/**
	 * @return �Ԉ֎q����䐔
	 */
	public String getWheelchairNum() {
		return wheelchairNum;
	}

	/**
	 * @param wheelchairNum �Ԉ֎q����䐔
	 */
	public void setWheelchairNum(String wheelchairNum) {
		this.wheelchairNum = StringUtil.toHalf(wheelchairNum);
	}

	/**
	 * @return signLangBeginHour ��b�J�n����:����
	 */
	public String getSignLangBeginHour() {
		return signLangBeginHour;
	}

	/**
	 * @param signLangBeginHour ��b�J�n����:����
	 */
	public void setSignLangBeginHour(String signLangBeginHour) {
		this.signLangBeginHour = StringUtil.toHalf(signLangBeginHour);
	}

	/**
	 * @return signLangBeginMinute ��b�J�n����:��
	 */
	public String getSignLangBeginMinute() {
		return signLangBeginMinute;
	}

	/**
	 * @param signLangBeginMinute ��b�J�n����:��
	 */
	public void setSignLangBeginMinute(String signLangBeginMinute) {
		this.signLangBeginMinute = StringUtil.toHalf(signLangBeginMinute);
	}

	/**
	 * @return signLangEndHour ��b�I�����ԁF����
	 */
	public String getSignLangEndHour() {
		return signLangEndHour;
	}

	/**
	 * @param signLangEndHour ��b�I�����ԁF����
	 */
	public void setSignLangEndHour(String signLangEndHour) {
		this.signLangEndHour = StringUtil.toHalf(signLangEndHour);
	}

	/**
	 * @return signLangEndMinute ��b�I�����ԁF��
	 */
	public String getSignLangEndMinute() {
		return signLangEndMinute;
	}

	/**
	 * @param signLangEndMinute ��b�I�����ԁF��
	 */
	public void setSignLangEndMinute(String signLangEndMinute) {
		this.signLangEndMinute = StringUtil.toHalf(signLangEndMinute);
	}

	/**
	 * @return engTimeBeginHour �p��J�n���ԁF����
	 */
	public String getEngTimeBeginHour() {
		return engTimeBeginHour;
	}
	
	/**
	 * @param engTimeBeginHour �p��J�n���ԁF����
	 */
	public void setEngTimeBeginHour(String engTimeBeginHour) {
		this.engTimeBeginHour = StringUtil.toHalf(engTimeBeginHour);
	}

	/**
	 * @return engTimeBeginMinute �p��J�n���ԁF��
	 */
	public String getEngTimeBeginMinute() {
		return engTimeBeginMinute;
	}

	/**
	 * @param engTimeBeginMinute �p��J�n���ԁF��
	 */
	public void setEngTimeBeginMinute(String engTimeBeginMinute) {
		this.engTimeBeginMinute = StringUtil.toHalf(engTimeBeginMinute);
	}

	/**
	 * @return engTimeEndHour �p��I�����ԁF����
	 */
	public String getEngTimeEndHour() {
		return engTimeEndHour;
	}

	/**
	 * @param engTimeEndHour �p��I�����ԁF����
	 */
	public void setEngTimeEndHour(String engTimeEndHour) {
		this.engTimeEndHour = StringUtil.toHalf(engTimeEndHour);
	}

	/**
	 * @return engTimeEndMinute �p��I�����ԁF��
	 */
	public String getEngTimeEndMinute() {
		return engTimeEndMinute;
	}

	/**
	 * @param engTimeEndMinute �p��I�����ԁF��
	 */
	public void setEngTimeEndMinute(String engTimeEndMinute) {
		this.engTimeEndMinute = StringUtil.toHalf(engTimeEndMinute);
	}
	/**
	 * 
	 * @return �q��������(����) .
	 */
	public String getChildFreeAgeCond() {
		return childFreeAgeCond;
	}
	/**
	 * 	 * @param childFreeAgeCond �q��������(����)
	 */
	public void setChildFreeAgeCond(String childFreeAgeCond) {
		this.childFreeAgeCond = childFreeAgeCond;
	}
	/**
	 * 
	 * @return �q��������(�J�n�N��) .
	 */
	public String getChildFreeAgeFrom() {
		return childFreeAgeFrom;
	}
	/**
	 * 
	 * @param childFreeAgeFrom �q��������(�J�n�N��)
	 */
	public void setChildFreeAgeFrom(String childFreeAgeFrom) {
		this.childFreeAgeFrom = childFreeAgeFrom;
	}
	/**
	 * 
	 * @return �q��������(�I���N��) .
	 */
	public String getChildFreeAgeTo() {
		return childFreeAgeTo;
	}
	/**
	 * 
	 * @param childFreeAgeTo �q��������(�I���N��)
	 */
	public void setChildFreeAgeTo(String childFreeAgeTo) {
		this.childFreeAgeTo = childFreeAgeTo;
	}
	/**
	 * 
	 * @return �q�������L(����) .
	 */
	public String getChildPayAgeCond() {
		return childPayAgeCond;
	}
	/**
	 * 
	 * @param childPayAgeCond �q�������L(����)
	 */
	public void setChildPayAgeCond(String childPayAgeCond) {
		this.childPayAgeCond = childPayAgeCond;
	}
	/**
	 * 
	 * @return �q�������L(�J�n�N��) .
	 */
	public String getChildPayAgeFrom() {
		return childPayAgeFrom;
	}
	/**
	 * 
	 * @param childPayAgeFrom �q�������L(�J�n�N��)
	 */
	public void setChildPayAgeFrom(String childPayAgeFrom) {
		this.childPayAgeFrom = childPayAgeFrom;
	}
	/**
	 * 
	 * @return �q��������(�I���N��) .
	 */
	public String getChildPayAgeTo() {
		return childPayAgeTo;
	}
	/**
	 * 
	 * @param childPayAgeTo �q��������(�I���N��)
	 */
	public void setChildPayAgeTo(String childPayAgeTo) {
		this.childPayAgeTo = childPayAgeTo;
	}
	
}
