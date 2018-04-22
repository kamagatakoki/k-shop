package jp.co.jreast.common.data.ddata;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * <pre>
 * 交通データクラス。
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 */

public class DNo5TrafficData {
    /**
     * 車利用高速道路IC .
     */
    private String accessIc;

    /**
     * 車利用時間 .
     */
    private String accessTime;

    /**
     * タクシー料金年度 .
     */
    private String annualTaxiFee;

    /**
     * 車利用自動車道
     */
    private String autoRoadway;

    /**
     * 車利用距離
     */
    private String availableDistance;

    /**
     * バス行き先 .
     */
    private String busDestination;

    /**
     * バス停名 .
     */
    private String busStation;

    /**
     * バス利用時間 .
     */
    private String busTimetable;

    /**
     * 車利用方面
     */
    private String carDirection;

    /**
     * 履歴番号 .
     */
    private Integer careerNo;

    /**
     * 車利用目標物
     */
    private String carTarget;

    /**
     * 駅到着要連絡有無 .
     */
    private String contactFlg = "";

    /**
     * 車利用県道
     */
    private String countyRoadway;

    /**
     * 出口情報.
     */
    private String exitInfo;

    /**
     * 施設コード
     */
    private String facilityCd;

    /**
     * 施設パターン
     */
    private String facilityPattern;

    /**
     * 車利用普通道路
     */
    private String genreralRoadway;

    /**
     * 車利用高速道路 .
     */
    private String highway;

    /**
     * 種別
     */
    private String kindFlg;

    /**
     * 迎え可能時間開始：時間 .
     */
    private String meetTimeBeginHour;

    /**
     * 迎え可能時間開始：分 .
     */
    private String meetTimeBeginMinute;

    /**
     * 迎え可能時間終了：時間 .
     */
    private String meetTimeEndHour;

    /**
     * 迎え可能時間終了：分 .
     */
    private String meetTimeEndMinute;

    /**
     * 迎え可能時間有無 .
     */
    private String meetTimeFlg = "";

    /**
     * タクシー料金月 .
     */
    private String monthlyTaxiFee;

    /**
     * 送迎バス .
     */
    private String msBus;

    /**
     * 送迎バス有無 .
     */
    private String msBusFlg = "";

    /**
     * 送迎区分 .
     */
    private Integer msDiv;

    /**
     * 送迎有無 .
     */
    private String msFlg;

    /**
     * 送迎駅 .
     */
    private String msStation;

    /**
     * 送迎駅有無 .
     */
    private String msStationFlg = "";

    /**
     * 車利用国道
     */
    private String nationalRoadway;

    /**
     * ＪＲ・私鉄再寄駅 .
     */
    private String nearestStation;

    /**
     * 予約不要有無 .
     */
    private String noReserveFlg = "";

    /**
     * その他コメント .
     */
    private String othersCmt;

    /**
     * 企画回答連番 .
     */
    private Long planAnsNo;

    /**
     * 要予約コメント .
     */
    private String reserveCmt;

    /**
     * 要予約有無 .
     */
    private String reserveFlg = "";

    /**
     * 予約通知方法
     */
    private String reserveInformWay;

    /**
     * 送り可能時間開始：時間 .
     */
    private String sendTimeBeginHour;

    /**
     * 送り可能時間開始：分 .
     */
    private String sendTimeBeginMinute;

    /**
     * 送り可能時間終了：時間 .
     */
    private String sendTimeEndHour;

    /**
     * 送り可能時間終了:分 .
     */
    private String sendTimeEndMinute;

    /**
     * 送り可能時間有無 .
     */
    private String sendTimeFlg = "";

    /**
     * 送迎シャトルバス有無 .
     */
    private String shuttleBusFlg = "";

    /**
     * シャトルバス運行　.
     */
    private String shuttleBusService;

    /**
     * 送迎シャトルバス（最寄駅発） .
     */
    private String shuttleBusStation;

    /**
     * JRと私鉄の区分.
     */
    private String stationDiv;

    /**
     * タクシー利用料金 .
     */
    private String taxiFee;

    /**
     * タクシー時間 .
     */
    private String taxiTime;

    private String tempFacilityPattern;

    /**
     * バス停より徒歩時間 .
     */
    private String toBusStaTime;

    /**
     * 駅より徒歩時間 .
     */
    private String toStationWalktime;

    /**
     * 交通手段有無 .
     */

    private String trafficFlg;

    /**
     * @return accessIc 車利用高速道路IC
     */
    public String getAccessIc() {
        return accessIc;
    }

    /**
     * @return 車利用時間
     */
    public String getAccessTime() {
        return accessTime;
    }

    /**
     * @return タクシー料金年度
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
     * @return バス行き先
     */
    public String getBusDestination() {
        return busDestination;
    }

    /**
     * @return バス停名
     */
    public String getBusStation() {
        return busStation;
    }

    /**
     * @return バス利用時間
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
     * 履歴番号 .を取得します。
     * 
     * @return 履歴番号 .
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
     * @return 駅到着要連絡有無
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
     * @return 出口情報
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
     * @return 車利用高速道路
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
     * @return 迎え可能時間開始
     */
    public String getMeetTimeBegin() {
        return DKikakuWebUtil.buildTime(meetTimeBeginHour, meetTimeBeginMinute);
    }

    /**
     * @return meetTimeBeginHour 迎え可能時間開始：時間
     */
    public String getMeetTimeBeginHour() {
        return meetTimeBeginHour;
    }

    /**
     * @return meetTimeBeginMinute 迎え可能時間開始：分
     */
    public String getMeetTimeBeginMinute() {
        return meetTimeBeginMinute;
    }

    /**
     * @return 迎え可能時間終了
     */
    public String getMeetTimeEnd() {
        return DKikakuWebUtil.buildTime(meetTimeEndHour, meetTimeEndMinute);
    }

    /**
     * @return meetTimeEndHour 迎え可能時間終了：時間
     */
    public String getMeetTimeEndHour() {
        return meetTimeEndHour;
    }

    /**
     * @return meetTimeEndMinute 迎え可能時間終了：分
     */
    public String getMeetTimeEndMinute() {
        return meetTimeEndMinute;
    }

    /**
     * @return 迎え可能時間有無
     */
    public String getMeetTimeFlg() {
        return meetTimeFlg;
    }

    /**
     * @return タクシー料金月
     */
    public String getMonthlyTaxiFee() {
        return monthlyTaxiFee;
    }

    /**
     * @return 送迎バス
     */
    public String getMsBus() {
        return msBus;
    }

    /**
     * @return 送迎バス有無
     */
    public String getMsBusFlg() {
        return msBusFlg;
    }

    /**
     * @return 送迎区分
     */
    public Integer getMsDiv() {
        return msDiv;
    }

    /**
     * @return 送迎有無
     */
    public String getMsFlg() {
        return msFlg;
    }

    /**
     * @return 送迎駅
     */
    public String getMsStation() {
        return msStation;
    }

    /**
     * @return 送迎駅有無
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
     * @return ＪＲ・私鉄再寄駅
     */
    public String getNearestStation() {
        return nearestStation;
    }

    /**
     * @return 予約不要有無
     */
    public String getNoReserveFlg() {
        return noReserveFlg;
    }

    /**
     * @return その他コメント
     */
    public String getOthersCmt() {
        return othersCmt;
    }

    /**
     * 企画回答連番 .を取得します。
     * 
     * @return 企画回答連番 .
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * @return 要予約コメント
     */
    public String getReserveCmt() {
        return reserveCmt;
    }

    /**
     * @return 要予約有無
     */
    public String getReserveFlg() {
        return reserveFlg;
    }

    /**
     * 予約通知方法を取得します。
     * 
     * @return 予約通知方法
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * @return 送り可能時間開始
     */
    public String getSendTimeBegin() {
        return DKikakuWebUtil.buildTime(sendTimeBeginHour, sendTimeBeginMinute);
    }

    /**
     * @return sendTimeBeginHour 送り可能時間開始：時間
     */
    public String getSendTimeBeginHour() {
        return sendTimeBeginHour;
    }

    /**
     * @return sendTimeBeginMinute 送り可能時間開始：分
     */
    public String getSendTimeBeginMinute() {
        return sendTimeBeginMinute;
    }

    /**
     * @return 送り可能時間終了
     */
    public String getSendTimeEnd() {

        return DKikakuWebUtil.buildTime(sendTimeEndHour, sendTimeEndMinute);
    }

    /**
     * @return sendTimeEndHour　送り可能時間終了:時間
     */
    public String getSendTimeEndHour() {
        return sendTimeEndHour;
    }

    /**
     * @return sendTimeEndMinute　送り可能時間終了:分
     */
    public String getSendTimeEndMinute() {
        return sendTimeEndMinute;
    }

    /**
     * @return 送り可能時間有無
     */
    public String getSendTimeFlg() {
        return sendTimeFlg;
    }

    /**
     * @return 送迎シャトルバス有無
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
     * @return 送迎シャトルバス（最寄駅発）
     */
    public String getShuttleBusStation() {
        return shuttleBusStation;
    }

    /**
     * @return JRと私鉄の区分
     */
    public String getStationDiv() {
        return stationDiv;
    }

    /**
     * @return タクシー利用料金
     */
    public String getTaxiFee() {
        return taxiFee;
    }

    /**
     * @return タクシー時間
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
     * @return バス停より徒歩時間
     */
    public String getToBusStaTime() {
        return toBusStaTime;
    }

    /**
     * @return 駅より徒歩時間
     */
    public String getToStationWalktime() {
        return toStationWalktime;
    }

    /**
     * @return 交通手段有無
     */
    public String getTrafficFlg() {
        return trafficFlg;
    }

    /**
     * @param accessIc
     *            車利用高速道路IC
     */
    public void setAccessIc(String accessIc) {
        this.accessIc = accessIc;
    }

    /**
     * @param accessTime
     *            車利用時間
     */
    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * @param annualTaxiFee
     *            タクシー料金年度
     */
    public void setAnnualTaxiFee(String annualTaxiFee) {
        this.annualTaxiFee = StringUtil.toHalf(annualTaxiFee);
    }

    /**
     * @param autoRoadway
     *            設定する autoRoadway
     */
    public void setAutoRoadway(String autoRoadway) {
        this.autoRoadway = autoRoadway;
    }

    /**
     * @param availableDistance
     *            設定する availableDistance
     */
    public void setAvailableDistance(String availableDistance) {
        this.availableDistance = availableDistance;
    }

    /**
     * @param busDestination
     *            バス行き先
     */
    public void setBusDestination(String busDestination) {
        this.busDestination = StringUtil.toHalf(busDestination);
    }

    /**
     * バス停名.
     * 
     * @param busStation
     *            バス停
     */
    public void setBusStation(String busStation) {
        this.busStation = busStation;
    }

    /**
     * @param busTimetable
     *            バス利用時間
     */
    public void setBusTimetable(String busTimetable) {
        this.busTimetable = StringUtil.toHalf(busTimetable);
    }

    /**
     * @param carDirection
     *            設定する carDirection
     */
    public void setCarDirection(String carDirection) {
        this.carDirection = carDirection;
    }

    /**
     * 履歴番号 .を設定します。
     * 
     * @param careerNo
     *            履歴番号 .
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * @param carTarget
     *            設定する carTarget
     */
    public void setCarTarget(String carTarget) {
        this.carTarget = carTarget;
    }

    /**
     * @param contactFlg
     *            駅到着要連絡有無
     */
    public void setContactFlg(String contactFlg) {
        this.contactFlg = contactFlg;
    }

    /**
     * @param countyRoadway
     *            設定する countyRoadway
     */
    public void setCountyRoadway(String countyRoadway) {
        this.countyRoadway = countyRoadway;
    }

    /**
     * @param exitInfo
     *            出口情報
     */
    public void setExitInfo(String exitInfo) {
        this.exitInfo = exitInfo;
    }

    /**
     * @param facilityCd
     *            設定する facilityCd
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * @param facilityPattern
     *            設定する facilityPattern
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * @param genreralRoadway
     *            設定する genreralRoadway
     */
    public void setGenreralRoadway(String genreralRoadway) {
        this.genreralRoadway = genreralRoadway;
    }

    /**
     * @param highway
     *            車利用高速道路
     */
    public void setHighway(String highway) {
        this.highway = highway;
    }

    /**
     * @param kindFlg
     *            設定する kindFlg
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * @param meetTimeBegin
     *            迎え可能時間開始
     */
    public void setMeetTimeBegin(String meetTimeBegin) {

        setMeetTimeBeginHour(DKikakuWebUtil.getHourFormTime(meetTimeBegin));
        setMeetTimeBeginMinute(DKikakuWebUtil.getMinuteFromTime(meetTimeBegin));
    }

    /**
     * @param meetTimeBeginHour
     *            迎え可能時間開始：時間
     */
    public void setMeetTimeBeginHour(String meetTimeBeginHour) {
        this.meetTimeBeginHour = StringUtil.toHalf(meetTimeBeginHour);
    }

    /**
     * @param meetTimeBeginMinute
     *            迎え可能時間開始：分
     */
    public void setMeetTimeBeginMinute(String meetTimeBeginMinute) {
        this.meetTimeBeginMinute = StringUtil.toHalf(meetTimeBeginMinute);
    }

    /**
     * @param meetTimeEnd
     *            迎え可能時間終了
     */
    public void setMeetTimeEnd(String meetTimeEnd) {

        setMeetTimeEndHour(DKikakuWebUtil.getHourFormTime(meetTimeEnd));
        setMeetTimeEndMinute(DKikakuWebUtil.getMinuteFromTime(meetTimeEnd));
    }

    /**
     * @param meetTimeEndHour
     *            迎え可能時間終了：時間
     */
    public void setMeetTimeEndHour(String meetTimeEndHour) {
        this.meetTimeEndHour = StringUtil.toHalf(meetTimeEndHour);
    }

    /**
     * @param meetTimeEndMinute
     *            迎え可能時間終了：分
     */
    public void setMeetTimeEndMinute(String meetTimeEndMinute) {
        this.meetTimeEndMinute = StringUtil.toHalf(meetTimeEndMinute);
    }

    /**
     * @param meetTimeFlg
     *            迎え可能時間有無
     */
    public void setMeetTimeFlg(String meetTimeFlg) {
        this.meetTimeFlg = meetTimeFlg;
    }

    /**
     * @param monthlyTaxiFee
     *            タクシー料金月
     */
    public void setMonthlyTaxiFee(String monthlyTaxiFee) {
        this.monthlyTaxiFee = StringUtil.toHalf(monthlyTaxiFee);
    }

    /**
     * @param msBus
     *            送迎バス
     */
    public void setMsBus(String msBus) {
        this.msBus = msBus;
    }

    /**
     * @param msBusFlg
     *            送迎バス有無
     */
    public void setMsBusFlg(String msBusFlg) {
        this.msBusFlg = msBusFlg;
    }

    /**
     * @param msDiv
     *            送迎区分
     */
    public void setMsDiv(Integer msDiv) {
        this.msDiv = msDiv;
    }

    /**
     * @param msFlg
     *            送迎有無
     */
    public void setMsFlg(String msFlg) {
        this.msFlg = msFlg;
    }

    /**
     * @param msStation
     *            送迎駅
     */
    public void setMsStation(String msStation) {
        this.msStation = msStation;
    }

    /**
     * @param msStationFlg
     *            送迎駅有無
     */
    public void setMsStationFlg(String msStationFlg) {
        this.msStationFlg = msStationFlg;
    }

    /**
     * @param nationalRoadway
     *            設定する nationalRoadway
     */
    public void setNationalRoadway(String nationalRoadway) {
        this.nationalRoadway = nationalRoadway;
    }

    /**
     * @param nearestStation
     *            ＪＲ・私鉄再寄駅
     */
    public void setNearestStation(String nearestStation) {
        this.nearestStation = nearestStation;
    }

    /**
     * @param noReserveFlg
     *            予約不要有無
     */
    public void setNoReserveFlg(String noReserveFlg) {
        this.noReserveFlg = noReserveFlg;
    }

    /**
     * @param othersCmt
     *            その他コメント
     */
    public void setOthersCmt(String othersCmt) {
        this.othersCmt = othersCmt;
    }

    /**
     * 企画回答連番 .を設定します。
     * 
     * @param planAnsNo
     *            企画回答連番 .
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * @param reserveCmt
     *            要予約コメント
     */
    public void setReserveCmt(String reserveCmt) {
        this.reserveCmt = StringUtil.toHalf(reserveCmt);
    }

    /**
     * @param reserveFlg
     *            要予約有無
     */
    public void setReserveFlg(String reserveFlg) {
        this.reserveFlg = reserveFlg;
    }

    /**
     * 予約通知方法を設定します。
     * 
     * @param reserveInformWay
     *            予約通知方法
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * @param sendTimeBegin
     *            送り可能時間開始
     */
    public void setSendTimeBegin(String sendTimeBegin) {

        setSendTimeBeginHour(DKikakuWebUtil.getHourFormTime(sendTimeBegin));
        setSendTimeBeginMinute(DKikakuWebUtil.getMinuteFromTime(sendTimeBegin));
    }

    /**
     * @param sendTimeBeginHour
     *            送り可能時間開始：時間
     */
    public void setSendTimeBeginHour(String sendTimeBeginHour) {
        this.sendTimeBeginHour = StringUtil.toHalf(sendTimeBeginHour);
    }

    /**
     * @param sendTimeBeginMinute
     *            送り可能時間開始：分
     */
    public void setSendTimeBeginMinute(String sendTimeBeginMinute) {
        this.sendTimeBeginMinute = StringUtil.toHalf(sendTimeBeginMinute);
    }

    /**
     * @param sendTimeEnd
     *            送り可能時間終了
     */
    public void setSendTimeEnd(String sendTimeEnd) {

        setSendTimeEndHour(DKikakuWebUtil.getHourFormTime(sendTimeEnd));
        setSendTimeEndMinute(DKikakuWebUtil.getMinuteFromTime(sendTimeEnd));
    }

    /**
     * @param sendTimeEndHour
     *            送り可能時間終了:時間
     */
    public void setSendTimeEndHour(String sendTimeEndHour) {
        this.sendTimeEndHour = StringUtil.toHalf(sendTimeEndHour);
    }

    /**
     * @param sendTimeEndMinute
     *            送り可能時間終了:分
     */
    public void setSendTimeEndMinute(String sendTimeEndMinute) {
        this.sendTimeEndMinute = StringUtil.toHalf(sendTimeEndMinute);
    }

    /**
     * @param sendTimeFlg
     *            送り可能時間有無
     */
    public void setSendTimeFlg(String sendTimeFlg) {
        this.sendTimeFlg = sendTimeFlg;
    }

    /**
     * @param shuttleBusFlg
     *            送迎シャトルバス有無
     */
    public void setShuttleBusFlg(String shuttleBusFlg) {
        this.shuttleBusFlg = shuttleBusFlg;
    }

    /**
     * @param shuttleBusService
     *            設定する shuttleBusService
     */
    public void setShuttleBusService(String shuttleBusService) {
        this.shuttleBusService = shuttleBusService;
    }

    /**
     * @param shuttleBusStation
     *            送迎シャトルバス（最寄駅発）
     */
    public void setShuttleBusStation(String shuttleBusStation) {
        this.shuttleBusStation = shuttleBusStation;
    }

    /**
     * @param stationDiv
     *            JRと私鉄の区分
     */
    public void setStationDiv(String stationDiv) {
        this.stationDiv = stationDiv;
    }

    /**
     * @param taxiFee
     *            タクシー利用料金
     */
    public void setTaxiFee(String taxiFee) {
        this.taxiFee = StringUtil.toHalf(taxiFee);
    }

    /**
     * @param taxiTime
     *            タクシー時間
     */
    public void setTaxiTime(String taxiTime) {
        this.taxiTime = StringUtil.toHalf(taxiTime);
    }

    /**
     * @param tempFacilityPattern
     *            設定する tempFacilityPattern
     */
    public void setTempFacilityPattern(String tempFacilityPattern) {
        this.tempFacilityPattern = tempFacilityPattern;
    }

    /**
     * @param toBusStaTime
     *            バス停より徒歩時間
     */
    public void setToBusStaTime(String toBusStaTime) {
        this.toBusStaTime = StringUtil.toHalf(toBusStaTime);
    }

    /**
     * @param toStationWalktime
     *            駅より徒歩時間
     */
    public void setToStationWalktime(String toStationWalktime) {
        this.toStationWalktime = StringUtil.toHalf(toStationWalktime);
    }

    /**
     * @param trafficFlg
     *            交通手段有無
     */
    public void setTrafficFlg(String trafficFlg) {
        this.trafficFlg = trafficFlg;
    }

}
