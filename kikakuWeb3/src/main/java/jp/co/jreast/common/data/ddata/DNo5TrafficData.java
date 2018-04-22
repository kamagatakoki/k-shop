package jp.co.jreast.common.data.ddata;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * <pre>
 * ��ʃf�[�^�N���X�B
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 */

public class DNo5TrafficData {
    /**
     * �ԗ��p�������HIC .
     */
    private String accessIc;

    /**
     * �ԗ��p���� .
     */
    private String accessTime;

    /**
     * �^�N�V�[�����N�x .
     */
    private String annualTaxiFee;

    /**
     * �ԗ��p�����ԓ�
     */
    private String autoRoadway;

    /**
     * �ԗ��p����
     */
    private String availableDistance;

    /**
     * �o�X�s���� .
     */
    private String busDestination;

    /**
     * �o�X�▼ .
     */
    private String busStation;

    /**
     * �o�X���p���� .
     */
    private String busTimetable;

    /**
     * �ԗ��p����
     */
    private String carDirection;

    /**
     * ����ԍ� .
     */
    private Integer careerNo;

    /**
     * �ԗ��p�ڕW��
     */
    private String carTarget;

    /**
     * �w�����v�A���L�� .
     */
    private String contactFlg = "";

    /**
     * �ԗ��p����
     */
    private String countyRoadway;

    /**
     * �o�����.
     */
    private String exitInfo;

    /**
     * �{�݃R�[�h
     */
    private String facilityCd;

    /**
     * �{�݃p�^�[��
     */
    private String facilityPattern;

    /**
     * �ԗ��p���ʓ��H
     */
    private String genreralRoadway;

    /**
     * �ԗ��p�������H .
     */
    private String highway;

    /**
     * ���
     */
    private String kindFlg;

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
     * �}���\���ԗL�� .
     */
    private String meetTimeFlg = "";

    /**
     * �^�N�V�[������ .
     */
    private String monthlyTaxiFee;

    /**
     * ���}�o�X .
     */
    private String msBus;

    /**
     * ���}�o�X�L�� .
     */
    private String msBusFlg = "";

    /**
     * ���}�敪 .
     */
    private Integer msDiv;

    /**
     * ���}�L�� .
     */
    private String msFlg;

    /**
     * ���}�w .
     */
    private String msStation;

    /**
     * ���}�w�L�� .
     */
    private String msStationFlg = "";

    /**
     * �ԗ��p����
     */
    private String nationalRoadway;

    /**
     * �i�q�E���S�Ċ�w .
     */
    private String nearestStation;

    /**
     * �\��s�v�L�� .
     */
    private String noReserveFlg = "";

    /**
     * ���̑��R�����g .
     */
    private String othersCmt;

    /**
     * ���񓚘A�� .
     */
    private Long planAnsNo;

    /**
     * �v�\��R�����g .
     */
    private String reserveCmt;

    /**
     * �v�\��L�� .
     */
    private String reserveFlg = "";

    /**
     * �\��ʒm���@
     */
    private String reserveInformWay;

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
     * ����\���ԗL�� .
     */
    private String sendTimeFlg = "";

    /**
     * ���}�V���g���o�X�L�� .
     */
    private String shuttleBusFlg = "";

    /**
     * �V���g���o�X�^�s�@.
     */
    private String shuttleBusService;

    /**
     * ���}�V���g���o�X�i�Ŋ�w���j .
     */
    private String shuttleBusStation;

    /**
     * JR�Ǝ��S�̋敪.
     */
    private String stationDiv;

    /**
     * �^�N�V�[���p���� .
     */
    private String taxiFee;

    /**
     * �^�N�V�[���� .
     */
    private String taxiTime;

    private String tempFacilityPattern;

    /**
     * �o�X����k������ .
     */
    private String toBusStaTime;

    /**
     * �w���k������ .
     */
    private String toStationWalktime;

    /**
     * ��ʎ�i�L�� .
     */

    private String trafficFlg;

    /**
     * @return accessIc �ԗ��p�������HIC
     */
    public String getAccessIc() {
        return accessIc;
    }

    /**
     * @return �ԗ��p����
     */
    public String getAccessTime() {
        return accessTime;
    }

    /**
     * @return �^�N�V�[�����N�x
     */
    public String getAnnualTaxiFee() {
        return annualTaxiFee;
    }

    /**
     * @return autoRoadway
     */
    public String getAutoRoadway() {
        return autoRoadway;
    }

    /**
     * @return availableDistance
     */
    public String getAvailableDistance() {
        return availableDistance;
    }

    /**
     * @return �o�X�s����
     */
    public String getBusDestination() {
        return busDestination;
    }

    /**
     * @return �o�X�▼
     */
    public String getBusStation() {
        return busStation;
    }

    /**
     * @return �o�X���p����
     */
    public String getBusTimetable() {
        return busTimetable;
    }

    /**
     * @return carDirection
     */
    public String getCarDirection() {
        return carDirection;
    }

    /**
     * ����ԍ� .���擾���܂��B
     * 
     * @return ����ԍ� .
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * @return carTarget
     */
    public String getCarTarget() {
        return carTarget;
    }

    /**
     * @return �w�����v�A���L��
     */
    public String getContactFlg() {
        return contactFlg;
    }

    /**
     * @return countyRoadway
     */
    public String getCountyRoadway() {
        return countyRoadway;
    }

    /**
     * @return �o�����
     */
    public String getExitInfo() {
        return exitInfo;
    }

    /**
     * @return facilityCd
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * @return facilityPattern
     */
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * @return genreralRoadway
     */
    public String getGenreralRoadway() {
        return genreralRoadway;
    }

    /**
     * @return �ԗ��p�������H
     */
    public String getHighway() {
        return highway;
    }

    /**
     * @return kindFlg
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * @return �}���\���ԊJ�n
     */
    public String getMeetTimeBegin() {
        return DKikakuWebUtil.buildTime(meetTimeBeginHour, meetTimeBeginMinute);
    }

    /**
     * @return meetTimeBeginHour �}���\���ԊJ�n�F����
     */
    public String getMeetTimeBeginHour() {
        return meetTimeBeginHour;
    }

    /**
     * @return meetTimeBeginMinute �}���\���ԊJ�n�F��
     */
    public String getMeetTimeBeginMinute() {
        return meetTimeBeginMinute;
    }

    /**
     * @return �}���\���ԏI��
     */
    public String getMeetTimeEnd() {
        return DKikakuWebUtil.buildTime(meetTimeEndHour, meetTimeEndMinute);
    }

    /**
     * @return meetTimeEndHour �}���\���ԏI���F����
     */
    public String getMeetTimeEndHour() {
        return meetTimeEndHour;
    }

    /**
     * @return meetTimeEndMinute �}���\���ԏI���F��
     */
    public String getMeetTimeEndMinute() {
        return meetTimeEndMinute;
    }

    /**
     * @return �}���\���ԗL��
     */
    public String getMeetTimeFlg() {
        return meetTimeFlg;
    }

    /**
     * @return �^�N�V�[������
     */
    public String getMonthlyTaxiFee() {
        return monthlyTaxiFee;
    }

    /**
     * @return ���}�o�X
     */
    public String getMsBus() {
        return msBus;
    }

    /**
     * @return ���}�o�X�L��
     */
    public String getMsBusFlg() {
        return msBusFlg;
    }

    /**
     * @return ���}�敪
     */
    public Integer getMsDiv() {
        return msDiv;
    }

    /**
     * @return ���}�L��
     */
    public String getMsFlg() {
        return msFlg;
    }

    /**
     * @return ���}�w
     */
    public String getMsStation() {
        return msStation;
    }

    /**
     * @return ���}�w�L��
     */
    public String getMsStationFlg() {
        return msStationFlg;
    }

    /**
     * @return nationalRoadway
     */
    public String getNationalRoadway() {
        return nationalRoadway;
    }

    /**
     * @return �i�q�E���S�Ċ�w
     */
    public String getNearestStation() {
        return nearestStation;
    }

    /**
     * @return �\��s�v�L��
     */
    public String getNoReserveFlg() {
        return noReserveFlg;
    }

    /**
     * @return ���̑��R�����g
     */
    public String getOthersCmt() {
        return othersCmt;
    }

    /**
     * ���񓚘A�� .���擾���܂��B
     * 
     * @return ���񓚘A�� .
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * @return �v�\��R�����g
     */
    public String getReserveCmt() {
        return reserveCmt;
    }

    /**
     * @return �v�\��L��
     */
    public String getReserveFlg() {
        return reserveFlg;
    }

    /**
     * �\��ʒm���@���擾���܂��B
     * 
     * @return �\��ʒm���@
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * @return ����\���ԊJ�n
     */
    public String getSendTimeBegin() {
        return DKikakuWebUtil.buildTime(sendTimeBeginHour, sendTimeBeginMinute);
    }

    /**
     * @return sendTimeBeginHour ����\���ԊJ�n�F����
     */
    public String getSendTimeBeginHour() {
        return sendTimeBeginHour;
    }

    /**
     * @return sendTimeBeginMinute ����\���ԊJ�n�F��
     */
    public String getSendTimeBeginMinute() {
        return sendTimeBeginMinute;
    }

    /**
     * @return ����\���ԏI��
     */
    public String getSendTimeEnd() {

        return DKikakuWebUtil.buildTime(sendTimeEndHour, sendTimeEndMinute);
    }

    /**
     * @return sendTimeEndHour�@����\���ԏI��:����
     */
    public String getSendTimeEndHour() {
        return sendTimeEndHour;
    }

    /**
     * @return sendTimeEndMinute�@����\���ԏI��:��
     */
    public String getSendTimeEndMinute() {
        return sendTimeEndMinute;
    }

    /**
     * @return ����\���ԗL��
     */
    public String getSendTimeFlg() {
        return sendTimeFlg;
    }

    /**
     * @return ���}�V���g���o�X�L��
     */
    public String getShuttleBusFlg() {
        return shuttleBusFlg;
    }

    /**
     * @return shuttleBusService
     */
    public String getShuttleBusService() {
        return shuttleBusService;
    }

    /**
     * @return ���}�V���g���o�X�i�Ŋ�w���j
     */
    public String getShuttleBusStation() {
        return shuttleBusStation;
    }

    /**
     * @return JR�Ǝ��S�̋敪
     */
    public String getStationDiv() {
        return stationDiv;
    }

    /**
     * @return �^�N�V�[���p����
     */
    public String getTaxiFee() {
        return taxiFee;
    }

    /**
     * @return �^�N�V�[����
     */
    public String getTaxiTime() {
        return taxiTime;
    }

    /**
     * @return tempFacilityPattern
     */
    public String getTempFacilityPattern() {
        return tempFacilityPattern;
    }

    /**
     * @return �o�X����k������
     */
    public String getToBusStaTime() {
        return toBusStaTime;
    }

    /**
     * @return �w���k������
     */
    public String getToStationWalktime() {
        return toStationWalktime;
    }

    /**
     * @return ��ʎ�i�L��
     */
    public String getTrafficFlg() {
        return trafficFlg;
    }

    /**
     * @param accessIc
     *            �ԗ��p�������HIC
     */
    public void setAccessIc(String accessIc) {
        this.accessIc = accessIc;
    }

    /**
     * @param accessTime
     *            �ԗ��p����
     */
    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * @param annualTaxiFee
     *            �^�N�V�[�����N�x
     */
    public void setAnnualTaxiFee(String annualTaxiFee) {
        this.annualTaxiFee = StringUtil.toHalf(annualTaxiFee);
    }

    /**
     * @param autoRoadway
     *            �ݒ肷�� autoRoadway
     */
    public void setAutoRoadway(String autoRoadway) {
        this.autoRoadway = autoRoadway;
    }

    /**
     * @param availableDistance
     *            �ݒ肷�� availableDistance
     */
    public void setAvailableDistance(String availableDistance) {
        this.availableDistance = availableDistance;
    }

    /**
     * @param busDestination
     *            �o�X�s����
     */
    public void setBusDestination(String busDestination) {
        this.busDestination = StringUtil.toHalf(busDestination);
    }

    /**
     * �o�X�▼.
     * 
     * @param busStation
     *            �o�X��
     */
    public void setBusStation(String busStation) {
        this.busStation = busStation;
    }

    /**
     * @param busTimetable
     *            �o�X���p����
     */
    public void setBusTimetable(String busTimetable) {
        this.busTimetable = StringUtil.toHalf(busTimetable);
    }

    /**
     * @param carDirection
     *            �ݒ肷�� carDirection
     */
    public void setCarDirection(String carDirection) {
        this.carDirection = carDirection;
    }

    /**
     * ����ԍ� .��ݒ肵�܂��B
     * 
     * @param careerNo
     *            ����ԍ� .
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * @param carTarget
     *            �ݒ肷�� carTarget
     */
    public void setCarTarget(String carTarget) {
        this.carTarget = carTarget;
    }

    /**
     * @param contactFlg
     *            �w�����v�A���L��
     */
    public void setContactFlg(String contactFlg) {
        this.contactFlg = contactFlg;
    }

    /**
     * @param countyRoadway
     *            �ݒ肷�� countyRoadway
     */
    public void setCountyRoadway(String countyRoadway) {
        this.countyRoadway = countyRoadway;
    }

    /**
     * @param exitInfo
     *            �o�����
     */
    public void setExitInfo(String exitInfo) {
        this.exitInfo = exitInfo;
    }

    /**
     * @param facilityCd
     *            �ݒ肷�� facilityCd
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * @param facilityPattern
     *            �ݒ肷�� facilityPattern
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * @param genreralRoadway
     *            �ݒ肷�� genreralRoadway
     */
    public void setGenreralRoadway(String genreralRoadway) {
        this.genreralRoadway = genreralRoadway;
    }

    /**
     * @param highway
     *            �ԗ��p�������H
     */
    public void setHighway(String highway) {
        this.highway = highway;
    }

    /**
     * @param kindFlg
     *            �ݒ肷�� kindFlg
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * @param meetTimeBegin
     *            �}���\���ԊJ�n
     */
    public void setMeetTimeBegin(String meetTimeBegin) {

        setMeetTimeBeginHour(DKikakuWebUtil.getHourFormTime(meetTimeBegin));
        setMeetTimeBeginMinute(DKikakuWebUtil.getMinuteFromTime(meetTimeBegin));
    }

    /**
     * @param meetTimeBeginHour
     *            �}���\���ԊJ�n�F����
     */
    public void setMeetTimeBeginHour(String meetTimeBeginHour) {
        this.meetTimeBeginHour = StringUtil.toHalf(meetTimeBeginHour);
    }

    /**
     * @param meetTimeBeginMinute
     *            �}���\���ԊJ�n�F��
     */
    public void setMeetTimeBeginMinute(String meetTimeBeginMinute) {
        this.meetTimeBeginMinute = StringUtil.toHalf(meetTimeBeginMinute);
    }

    /**
     * @param meetTimeEnd
     *            �}���\���ԏI��
     */
    public void setMeetTimeEnd(String meetTimeEnd) {

        setMeetTimeEndHour(DKikakuWebUtil.getHourFormTime(meetTimeEnd));
        setMeetTimeEndMinute(DKikakuWebUtil.getMinuteFromTime(meetTimeEnd));
    }

    /**
     * @param meetTimeEndHour
     *            �}���\���ԏI���F����
     */
    public void setMeetTimeEndHour(String meetTimeEndHour) {
        this.meetTimeEndHour = StringUtil.toHalf(meetTimeEndHour);
    }

    /**
     * @param meetTimeEndMinute
     *            �}���\���ԏI���F��
     */
    public void setMeetTimeEndMinute(String meetTimeEndMinute) {
        this.meetTimeEndMinute = StringUtil.toHalf(meetTimeEndMinute);
    }

    /**
     * @param meetTimeFlg
     *            �}���\���ԗL��
     */
    public void setMeetTimeFlg(String meetTimeFlg) {
        this.meetTimeFlg = meetTimeFlg;
    }

    /**
     * @param monthlyTaxiFee
     *            �^�N�V�[������
     */
    public void setMonthlyTaxiFee(String monthlyTaxiFee) {
        this.monthlyTaxiFee = StringUtil.toHalf(monthlyTaxiFee);
    }

    /**
     * @param msBus
     *            ���}�o�X
     */
    public void setMsBus(String msBus) {
        this.msBus = msBus;
    }

    /**
     * @param msBusFlg
     *            ���}�o�X�L��
     */
    public void setMsBusFlg(String msBusFlg) {
        this.msBusFlg = msBusFlg;
    }

    /**
     * @param msDiv
     *            ���}�敪
     */
    public void setMsDiv(Integer msDiv) {
        this.msDiv = msDiv;
    }

    /**
     * @param msFlg
     *            ���}�L��
     */
    public void setMsFlg(String msFlg) {
        this.msFlg = msFlg;
    }

    /**
     * @param msStation
     *            ���}�w
     */
    public void setMsStation(String msStation) {
        this.msStation = msStation;
    }

    /**
     * @param msStationFlg
     *            ���}�w�L��
     */
    public void setMsStationFlg(String msStationFlg) {
        this.msStationFlg = msStationFlg;
    }

    /**
     * @param nationalRoadway
     *            �ݒ肷�� nationalRoadway
     */
    public void setNationalRoadway(String nationalRoadway) {
        this.nationalRoadway = nationalRoadway;
    }

    /**
     * @param nearestStation
     *            �i�q�E���S�Ċ�w
     */
    public void setNearestStation(String nearestStation) {
        this.nearestStation = nearestStation;
    }

    /**
     * @param noReserveFlg
     *            �\��s�v�L��
     */
    public void setNoReserveFlg(String noReserveFlg) {
        this.noReserveFlg = noReserveFlg;
    }

    /**
     * @param othersCmt
     *            ���̑��R�����g
     */
    public void setOthersCmt(String othersCmt) {
        this.othersCmt = othersCmt;
    }

    /**
     * ���񓚘A�� .��ݒ肵�܂��B
     * 
     * @param planAnsNo
     *            ���񓚘A�� .
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * @param reserveCmt
     *            �v�\��R�����g
     */
    public void setReserveCmt(String reserveCmt) {
        this.reserveCmt = StringUtil.toHalf(reserveCmt);
    }

    /**
     * @param reserveFlg
     *            �v�\��L��
     */
    public void setReserveFlg(String reserveFlg) {
        this.reserveFlg = reserveFlg;
    }

    /**
     * �\��ʒm���@��ݒ肵�܂��B
     * 
     * @param reserveInformWay
     *            �\��ʒm���@
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * @param sendTimeBegin
     *            ����\���ԊJ�n
     */
    public void setSendTimeBegin(String sendTimeBegin) {

        setSendTimeBeginHour(DKikakuWebUtil.getHourFormTime(sendTimeBegin));
        setSendTimeBeginMinute(DKikakuWebUtil.getMinuteFromTime(sendTimeBegin));
    }

    /**
     * @param sendTimeBeginHour
     *            ����\���ԊJ�n�F����
     */
    public void setSendTimeBeginHour(String sendTimeBeginHour) {
        this.sendTimeBeginHour = StringUtil.toHalf(sendTimeBeginHour);
    }

    /**
     * @param sendTimeBeginMinute
     *            ����\���ԊJ�n�F��
     */
    public void setSendTimeBeginMinute(String sendTimeBeginMinute) {
        this.sendTimeBeginMinute = StringUtil.toHalf(sendTimeBeginMinute);
    }

    /**
     * @param sendTimeEnd
     *            ����\���ԏI��
     */
    public void setSendTimeEnd(String sendTimeEnd) {

        setSendTimeEndHour(DKikakuWebUtil.getHourFormTime(sendTimeEnd));
        setSendTimeEndMinute(DKikakuWebUtil.getMinuteFromTime(sendTimeEnd));
    }

    /**
     * @param sendTimeEndHour
     *            ����\���ԏI��:����
     */
    public void setSendTimeEndHour(String sendTimeEndHour) {
        this.sendTimeEndHour = StringUtil.toHalf(sendTimeEndHour);
    }

    /**
     * @param sendTimeEndMinute
     *            ����\���ԏI��:��
     */
    public void setSendTimeEndMinute(String sendTimeEndMinute) {
        this.sendTimeEndMinute = StringUtil.toHalf(sendTimeEndMinute);
    }

    /**
     * @param sendTimeFlg
     *            ����\���ԗL��
     */
    public void setSendTimeFlg(String sendTimeFlg) {
        this.sendTimeFlg = sendTimeFlg;
    }

    /**
     * @param shuttleBusFlg
     *            ���}�V���g���o�X�L��
     */
    public void setShuttleBusFlg(String shuttleBusFlg) {
        this.shuttleBusFlg = shuttleBusFlg;
    }

    /**
     * @param shuttleBusService
     *            �ݒ肷�� shuttleBusService
     */
    public void setShuttleBusService(String shuttleBusService) {
        this.shuttleBusService = shuttleBusService;
    }

    /**
     * @param shuttleBusStation
     *            ���}�V���g���o�X�i�Ŋ�w���j
     */
    public void setShuttleBusStation(String shuttleBusStation) {
        this.shuttleBusStation = shuttleBusStation;
    }

    /**
     * @param stationDiv
     *            JR�Ǝ��S�̋敪
     */
    public void setStationDiv(String stationDiv) {
        this.stationDiv = stationDiv;
    }

    /**
     * @param taxiFee
     *            �^�N�V�[���p����
     */
    public void setTaxiFee(String taxiFee) {
        this.taxiFee = StringUtil.toHalf(taxiFee);
    }

    /**
     * @param taxiTime
     *            �^�N�V�[����
     */
    public void setTaxiTime(String taxiTime) {
        this.taxiTime = StringUtil.toHalf(taxiTime);
    }

    /**
     * @param tempFacilityPattern
     *            �ݒ肷�� tempFacilityPattern
     */
    public void setTempFacilityPattern(String tempFacilityPattern) {
        this.tempFacilityPattern = tempFacilityPattern;
    }

    /**
     * @param toBusStaTime
     *            �o�X����k������
     */
    public void setToBusStaTime(String toBusStaTime) {
        this.toBusStaTime = StringUtil.toHalf(toBusStaTime);
    }

    /**
     * @param toStationWalktime
     *            �w���k������
     */
    public void setToStationWalktime(String toStationWalktime) {
        this.toStationWalktime = StringUtil.toHalf(toStationWalktime);
    }

    /**
     * @param trafficFlg
     *            ��ʎ�i�L��
     */
    public void setTrafficFlg(String trafficFlg) {
        this.trafficFlg = trafficFlg;
    }

}
