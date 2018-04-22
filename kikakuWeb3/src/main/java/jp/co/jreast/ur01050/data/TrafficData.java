package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * ��ʃf�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class TrafficData {

	/**
	 * ���񓚘A�� .
	 */
	private Long planAnsNo;

	/**
	 * ����ԍ� .
	 */
	private Integer careerNo;

	/**
	 * ��ʎ�i�L�� .	
	 */

	private String trafficFlg;

	/**
	 * �i�q�E���S�Ċ�w .
	 */
	private String nearestStation;

	/**
	 * �w���k������ .
	 */
	private String toStationWalktime;

	/**
	 * �^�N�V�[����	 .
	 */
	private String taxiTime;

	/**
	 * �^�N�V�[�����N�x .
	 */
	private String annualTaxiFee;

	/**
	 * �^�N�V�[������ .
	 */
	private String monthlyTaxiFee;

	/**
	 * �^�N�V�[���p���� .
	 */
	private String taxiFee;

	/**
	 * �o�X�s���� .
	 */
	private String busDestination;

	/**
	 * �o�X���p���� .
	 */
	private String busTimetable;

	/**
	 * �o�X�▼ .
	 */
	private String busStation;
	
	/**
	 * �o�X����k������ .
	 */
	private String toBusStaTime;

	/**
	 * �ԗ��p�������H .
	 */
	private String highway;

	/**
	 * �ԗ��p���� .
	 */
	private String accessTime;

	/**
	 * ���}�L�� .
	 */
	private String msFlg;

	/**
	 * ���}�w�L�� .
	 */
	private String msStationFlg;

	/**
	 * ���}�w .
	 */
	private String msStation;

	/**
	 * ���}�o�X�L�� .
	 */
	private String msBusFlg;

	/**
	 * ���}�o�X .
	 */
	private String msBus;

	/**
	 * ���}�敪 .
	 */
	private Integer msDiv;

	/**
	 * �}���\���ԗL�� .
	 */
	private String meetTimeFlg;

	/**
	 * �}���\���ԊJ�n�F���� .
	 */
	private String meetTimeBeginHour;
	
	/**
	 * �}���\���ԊJ�n�F�� .
	 */
	private String meetTimeBeginMinute;

	/**
	 * �}���\���ԏI���F���� .
	 */
	private String meetTimeEndHour;
	
	/**
	 * �}���\���ԏI���F�� .
	 */
	private String meetTimeEndMinute;

	/**
	 * ����\���ԗL�� . 
	 */
	private String sendTimeFlg;

	/**
	 * ����\���ԊJ�n�F���� .
	 */
	private String sendTimeBeginHour;
	
	/**
	 * ����\���ԊJ�n�F�� .
	 */
	private String sendTimeBeginMinute;

	/**
	 * ����\���ԏI���F���� .
	 */
	private String sendTimeEndHour;
	
	/**
	 * ����\���ԏI��:�� .
	 */
	private String sendTimeEndMinute;

	/**
	 * ���}�V���g���o�X�L�� .
	 */
	private String shuttleBusFlg;

	/**
	 * ���}�V���g���o�X�i�Ŋ�w���j .
	 */
	private String shuttleBusStation;

	/**
	 * ���̑��R�����g .
	 */
	private String othersCmt;

	/**
	 * �v�\��L�� .
	 */
	private String reserveFlg;

	/**
	 * �v�\��R�����g .
	 */
	private String reserveCmt;

	/**
	 * �w�����v�A���L�� .
	 */
	private String contactFlg;

	/**
	 * �\��s�v�L�� .	
	 */
	private String noReserveFlg;
	
	/**
	 * �ԗ��p�������HIC .
	 */
	private String accessIc;
	/**
	 * JR�Ǝ��S�̋敪.
	 */
	private String stationDiv;
	/**
	 * �o�����.
	 */
	private String exitInfo;

	/**
	 * 
	 * @return �ԗ��p����
	 */
	public String getAccessTime() {
		return accessTime;
	}
	
	/**
	 * 
	 * @param accessTime �ԗ��p����
	 */
	public void setAccessTime(String accessTime) {
		this.accessTime = accessTime;
	}
	
	/**
	 * 
	 * @return �^�N�V�[�����N�x
	 */
	public String getAnnualTaxiFee() {
		return annualTaxiFee;
	}
	
	/**
	 * 
	 * @param annualTaxiFee �^�N�V�[�����N�x
	 */
	public void setAnnualTaxiFee(String annualTaxiFee) {
		this.annualTaxiFee = StringUtil.toHalf(annualTaxiFee);
	}
	
	/**
	 * 
	 * @return �o�X�s����
	 */
	public String getBusDestination() {
		return busDestination;
	}

	/**
	 * 
	 * @param busDestination �o�X�s����
	 */
	public void setBusDestination(String busDestination) {
		this.busDestination = StringUtil.toHalf(busDestination);
	}

	/**
	 * 
	 * @return �o�X���p����
	 */
	public String getBusTimetable() {
		return busTimetable;
	}

	/**
	 * 
	 * @param busTimetable �o�X���p����
	 */
	public void setBusTimetable(String busTimetable) {
		this.busTimetable = StringUtil.toHalf(busTimetable);
	}

	/**
	 * 
	 * @return ����ԍ�
	 */
	public Integer getCareerNo() {
		return careerNo;
	}

	/**
	 * 
	 * @param careerNo ����ԍ�
	 */
	public void setCareerNo(Integer careerNo) {
		this.careerNo = careerNo;
	}

	/**
	 * 
	 * @return �w�����v�A���L��
	 */
	public String getContactFlg() {
		return contactFlg;
	}

	/**
	 * 
	 * @param contactFlg �w�����v�A���L��
	 */
	public void setContactFlg(String contactFlg) {
		this.contactFlg = contactFlg;
	}

	/**
	 * 
	 * @return �ԗ��p�������H
	 */
	public String getHighway() {
		return highway;
	}

	
	/**
	 * 
	 * @param highway �ԗ��p�������H
	 */
	public void setHighway(String highway) {
		this.highway = highway;
	}

	/**
	 * 
	 * @return �}���\���ԊJ�n
	 */
	public String getMeetTimeBegin() {
		return KikakuWebUtil.buildTime(meetTimeBeginHour, meetTimeBeginMinute);
	}

	/**
	 * 
	 * @param meetTimeBegin �}���\���ԊJ�n
	 */
	public void setMeetTimeBegin(String meetTimeBegin) {

		setMeetTimeBeginHour(KikakuWebUtil.getHourFormTime(meetTimeBegin));
		setMeetTimeBeginMinute(KikakuWebUtil.getMinuteFromTime(meetTimeBegin));
	}
	

	/**
	 * 
	 * @return �}���\���ԏI��
	 */
	public String getMeetTimeEnd() {
		return KikakuWebUtil.buildTime(meetTimeEndHour, meetTimeEndMinute);
	}
	
	/**
	 * 
	 * @param meetTimeEnd �}���\���ԏI��
	 */
	public void setMeetTimeEnd(String meetTimeEnd) {

		setMeetTimeEndHour(KikakuWebUtil.getHourFormTime(meetTimeEnd));
		setMeetTimeEndMinute(KikakuWebUtil.getMinuteFromTime(meetTimeEnd));
	}
	

	/**
	 * 
	 * @return �}���\���ԗL��
	 */
	public String getMeetTimeFlg() {
		return meetTimeFlg;
	}

	/**
	 * 
	 * @param meetTimeFlg �}���\���ԗL��
	 */
	public void setMeetTimeFlg(String meetTimeFlg) {
		this.meetTimeFlg = meetTimeFlg;
	}

	/**
	 * 
	 * @return �^�N�V�[������
	 */
	public String getMonthlyTaxiFee() {
		return monthlyTaxiFee;
	}

	/**
	 * 
	 * @param monthlyTaxiFee �^�N�V�[������
	 */
	public void setMonthlyTaxiFee(String monthlyTaxiFee) {
		this.monthlyTaxiFee = StringUtil.toHalf(monthlyTaxiFee);
	}

	/**
	 * 
	 * @return ���}�o�X
	 */
	public String getMsBus() {
		return msBus;
	}

	/**
	 * 
	 * @param msBus ���}�o�X
	 */
	public void setMsBus(String msBus) {
		this.msBus = msBus;
	}

	/**
	 * 
	 * @return ���}�o�X�L��
	 */
	public String getMsBusFlg() {
		return msBusFlg;
	}

	/**
	 * 
	 * @param msBusFlg ���}�o�X�L��
	 */
	public void setMsBusFlg(String msBusFlg) {
		this.msBusFlg = msBusFlg;
	}

	/**
	 * 
	 * @return ���}�敪
	 */
	public Integer getMsDiv() {
		return msDiv;
	}

	/**
	 * 
	 * @param msDiv ���}�敪
	 */
	public void setMsDiv(Integer msDiv) {
		this.msDiv = msDiv;
	}

	/**
	 * 
	 * @return ���}�L��
	 */
	public String getMsFlg() {
		return msFlg;
	}

	/**
	 * 
	 * @param msFlg ���}�L��
	 */
	public void setMsFlg(String msFlg) {
		this.msFlg = msFlg;
	}

	/**
	 * 
	 * @return ���}�w
	 */
	public String getMsStation() {
		return msStation;
	}

	/**
	 * 
	 * @param msStation ���}�w
	 */
	public void setMsStation(String msStation) {
		this.msStation = msStation;
	}

	/**
	 * 
	 * @return ���}�w�L��
	 */
	public String getMsStationFlg() {
		return msStationFlg;
	}

	/**
	 * 
	 * @param msStationFlg ���}�w�L��
	 */
	public void setMsStationFlg(String msStationFlg) {
		this.msStationFlg = msStationFlg;
	}

	/**
	 * 
	 * @return �i�q�E���S�Ċ�w
	 */
	public String getNearestStation() {
		return nearestStation;
	}

	/**
	 * 
	 * @param nearestStation �i�q�E���S�Ċ�w
	 */
	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	/**
	 * 
	 * @return �\��s�v�L��
	 */
	public String getNoReserveFlg() {
		return noReserveFlg;
	}

	/**
	 * 
	 * @param noReserveFlg �\��s�v�L��
	 */
	public void setNoReserveFlg(String noReserveFlg) {
		this.noReserveFlg = noReserveFlg;
	}

	/**
	 * 
	 * @return ���̑��R�����g
	 */
	public String getOthersCmt() {
		return othersCmt;
	}

	/**
	 * 
	 * @param othersCmt ���̑��R�����g
	 */
	public void setOthersCmt(String othersCmt) {
		this.othersCmt = othersCmt;
	}

	/**
	 * 
	 * @return ���񓚘A��
	 */
	public Long getPlanAnsNo() {
		return planAnsNo;
	}

	/**
	 * 
	 * @param planAnsNo ���񓚘A��
	 */
	public void setPlanAnsNo(Long planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

	/**
	 * 
	 * @return �v�\��R�����g
	 */
	public String getReserveCmt() {
		return reserveCmt;
	}

	/**
	 * 
	 * @param reserveCmt �v�\��R�����g
	 */
	public void setReserveCmt(String reserveCmt) {
		this.reserveCmt = StringUtil.toHalf(reserveCmt);
	}

	/**
	 * 
	 * @return �v�\��L��
	 */
	public String getReserveFlg() {
		return reserveFlg;
	}

	/**
	 * 
	 * @param reserveFlg �v�\��L��
	 */
	public void setReserveFlg(String reserveFlg) {
		this.reserveFlg = reserveFlg;
	}

	/**
	 * 
	 * @return ����\���ԊJ�n
	 */
	public String getSendTimeBegin() {
		return KikakuWebUtil.buildTime(sendTimeBeginHour, sendTimeBeginMinute);
	}

	/**
	 * 
	 * @param sendTimeBegin ����\���ԊJ�n
	 */
	public void setSendTimeBegin(String sendTimeBegin) {

		setSendTimeBeginHour(KikakuWebUtil.getHourFormTime(sendTimeBegin));
		setSendTimeBeginMinute(KikakuWebUtil.getMinuteFromTime(sendTimeBegin));
	}
	
	/**
	 * 
	 * @return ����\���ԏI��
	 */
	public String getSendTimeEnd() {
		
		return KikakuWebUtil.buildTime(sendTimeEndHour, sendTimeEndMinute);
	}
	
	/**
	 * 
	 * @param sendTimeEnd ����\���ԏI��
	 */
	public void setSendTimeEnd(String sendTimeEnd) {

		setSendTimeEndHour(KikakuWebUtil.getHourFormTime(sendTimeEnd));
		setSendTimeEndMinute(KikakuWebUtil.getMinuteFromTime(sendTimeEnd));
	}

	/**
	 * 
	 * @return ����\���ԗL��
	 */
	public String getSendTimeFlg() {
		return sendTimeFlg;
	}

	/**
	 * 
	 * @param sendTimeFlg ����\���ԗL��
	 */
	public void setSendTimeFlg(String sendTimeFlg) {
		this.sendTimeFlg = sendTimeFlg;
	}

	/**
	 * 
	 * @return ���}�V���g���o�X�L��
	 */
	public String getShuttleBusFlg() {
		return shuttleBusFlg;
	}

	/**
	 * 
	 * @param shuttleBusFlg ���}�V���g���o�X�L��
	 */
	public void setShuttleBusFlg(String shuttleBusFlg) {
		this.shuttleBusFlg = shuttleBusFlg;
	}

	/**
	 * 
	 * @return ���}�V���g���o�X�i�Ŋ�w���j
	 */
	public String getShuttleBusStation() {
		return shuttleBusStation;
	}

	/**
	 * 
	 * @param shuttleBusStation ���}�V���g���o�X�i�Ŋ�w���j
	 */
	public void setShuttleBusStation(String shuttleBusStation) {
		this.shuttleBusStation = shuttleBusStation;
	}

	/**
	 * 
	 * @return �^�N�V�[���p����
	 */
	public String getTaxiFee() {
		return taxiFee;
	}

	/**
	 * 
	 * @param taxiFee �^�N�V�[���p����
	 */
	public void setTaxiFee(String taxiFee) {
		this.taxiFee = StringUtil.toHalf(taxiFee);
	}

	/**
	 * 
	 * @return �^�N�V�[����	
	 */
	public String getTaxiTime() {
		return taxiTime;
	}

	/**
	 * 
	 * @param taxiTime �^�N�V�[����	
	 */
	public void setTaxiTime(String taxiTime) {
		this.taxiTime = StringUtil.toHalf(taxiTime);
	}

	/**
	 * 
	 * @return �o�X�▼
	 */
	public String getBusStation() {
		return busStation;
	}

	/**
	 * �o�X�▼.
	 * @param busStation �o�X��
	 */
	public void setBusStation(String busStation) {
		this.busStation = busStation;
	}
	
	/**
	 * 
	 * @return �o�X����k������
	 */
	public String getToBusStaTime() {
		return toBusStaTime;
	}

	/**
	 * 
	 * @param toBusStaTime �o�X����k������
	 */
	public void setToBusStaTime(String toBusStaTime) {
		this.toBusStaTime = StringUtil.toHalf(toBusStaTime);
	}

	/**
	 * 
	 * @return �w���k������
	 */
	public String getToStationWalktime() {
		return toStationWalktime;
	}

	/**
	 * 
	 * @param toStationWalktime �w���k������
	 */
	public void setToStationWalktime(String toStationWalktime) {
		this.toStationWalktime = StringUtil.toHalf(toStationWalktime);
	}

	/**
	 * 
	 * @return ��ʎ�i�L��
	 */
	public String getTrafficFlg() {
		return trafficFlg;
	}

	/**
	 * 
	 * @param trafficFlg ��ʎ�i�L��
	 */
	public void setTrafficFlg(String trafficFlg) {
		this.trafficFlg = trafficFlg;
	}

	/**
	 * @return meetTimeBeginHour �}���\���ԊJ�n�F����
	 */
	public String getMeetTimeBeginHour() {
		return meetTimeBeginHour;
	}

	/**
	 * @param meetTimeBeginHour �}���\���ԊJ�n�F����
	 */
	public void setMeetTimeBeginHour(String meetTimeBeginHour) {
		this.meetTimeBeginHour = StringUtil.toHalf(meetTimeBeginHour);
	}

	/**
	 * @return meetTimeBeginMinute �}���\���ԊJ�n�F��
	 */
	public String getMeetTimeBeginMinute() {
		return meetTimeBeginMinute;
	}

	/**
	 * @param meetTimeBeginMinute �}���\���ԊJ�n�F��
	 */
	public void setMeetTimeBeginMinute(String meetTimeBeginMinute) {
		this.meetTimeBeginMinute = StringUtil.toHalf(meetTimeBeginMinute);
	}
	
	/**
	 * @return meetTimeEndHour �}���\���ԏI���F����
	 */
	public String getMeetTimeEndHour() {
		return meetTimeEndHour;
	}

	/**
	 * @param meetTimeEndHour �}���\���ԏI���F����
	 */
	public void setMeetTimeEndHour(String meetTimeEndHour) {
		this.meetTimeEndHour = StringUtil.toHalf(meetTimeEndHour);
	}

	/**
	 * @return meetTimeEndMinute �}���\���ԏI���F��
	 */
	public String getMeetTimeEndMinute() {
		return meetTimeEndMinute;
	}

	/**
	 * @param meetTimeEndMinute �}���\���ԏI���F��
	 */
	public void setMeetTimeEndMinute(String meetTimeEndMinute) {
		this.meetTimeEndMinute = StringUtil.toHalf(meetTimeEndMinute);
	}

	/**
	 * @return sendTimeBeginHour ����\���ԊJ�n�F����
	 */
	public String getSendTimeBeginHour() {
		return sendTimeBeginHour;
	}

	/**
	 * @param sendTimeBeginHour ����\���ԊJ�n�F����
	 */
	public void setSendTimeBeginHour(String sendTimeBeginHour) {
		this.sendTimeBeginHour = StringUtil.toHalf(sendTimeBeginHour);
	}

	/**
	 * @return sendTimeBeginMinute ����\���ԊJ�n�F��
	 */
	public String getSendTimeBeginMinute() {
		return sendTimeBeginMinute;
	}

	/**
	 * @param sendTimeBeginMinute ����\���ԊJ�n�F��
	 */
	public void setSendTimeBeginMinute(String sendTimeBeginMinute) {
		this.sendTimeBeginMinute = StringUtil.toHalf(sendTimeBeginMinute);
	}

	/**
	 * @return sendTimeEndHour�@����\���ԏI��:����
	 */
	public String getSendTimeEndHour() {
		return sendTimeEndHour;
	}

	/**
	 * @param sendTimeEndHour ����\���ԏI��:����
	 */
	public void setSendTimeEndHour(String sendTimeEndHour) {
		this.sendTimeEndHour = StringUtil.toHalf(sendTimeEndHour);
	}

	/**
	 * @return sendTimeEndMinute�@����\���ԏI��:��
	 */
	public String getSendTimeEndMinute() {
		return sendTimeEndMinute;
	}

	/**
	 * @param sendTimeEndMinute ����\���ԏI��:��
	 */
	public void setSendTimeEndMinute(String sendTimeEndMinute) {
		this.sendTimeEndMinute = StringUtil.toHalf(sendTimeEndMinute);
	}

	/**
	 * @return accessIc �ԗ��p�������HIC
	 */
	public String getAccessIc() {
		return accessIc;
	}

	/**
	 * @param accessIc �ԗ��p�������HIC
	 */
	public void setAccessIc(String accessIc) {
		this.accessIc = accessIc;
	}
	/**
	 * 
	 * @return JR�Ǝ��S�̋敪
	 */
	public String getStationDiv() {
		return stationDiv;
	}
	/**
	 * 
	 * @param stationDiv JR�Ǝ��S�̋敪
	 */
	public void setStationDiv(String stationDiv) {
		this.stationDiv = stationDiv;
	}
	/**
	 * 
	 * @return �o�����
	 */
	public String getExitInfo() {
		return exitInfo;
	}
	/**
	 * 
	 * @param exitInfo �o�����
	 */
	public void setExitInfo(String exitInfo) {
		this.exitInfo = exitInfo;
	}

}
									
