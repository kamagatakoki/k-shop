package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * 交通データクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class TrafficData {

	/**
	 * 企画回答連番 .
	 */
	private Long planAnsNo;

	/**
	 * 履歴番号 .
	 */
	private Integer careerNo;

	/**
	 * 交通手段有無 .	
	 */

	private String trafficFlg;

	/**
	 * ＪＲ・私鉄再寄駅 .
	 */
	private String nearestStation;

	/**
	 * 駅より徒歩時間 .
	 */
	private String toStationWalktime;

	/**
	 * タクシー時間	 .
	 */
	private String taxiTime;

	/**
	 * タクシー料金年度 .
	 */
	private String annualTaxiFee;

	/**
	 * タクシー料金月 .
	 */
	private String monthlyTaxiFee;

	/**
	 * タクシー利用料金 .
	 */
	private String taxiFee;

	/**
	 * バス行き先 .
	 */
	private String busDestination;

	/**
	 * バス利用時間 .
	 */
	private String busTimetable;

	/**
	 * バス停名 .
	 */
	private String busStation;
	
	/**
	 * バス停より徒歩時間 .
	 */
	private String toBusStaTime;

	/**
	 * 車利用高速道路 .
	 */
	private String highway;

	/**
	 * 車利用時間 .
	 */
	private String accessTime;

	/**
	 * 送迎有無 .
	 */
	private String msFlg;

	/**
	 * 送迎駅有無 .
	 */
	private String msStationFlg;

	/**
	 * 送迎駅 .
	 */
	private String msStation;

	/**
	 * 送迎バス有無 .
	 */
	private String msBusFlg;

	/**
	 * 送迎バス .
	 */
	private String msBus;

	/**
	 * 送迎区分 .
	 */
	private Integer msDiv;

	/**
	 * 迎え可能時間有無 .
	 */
	private String meetTimeFlg;

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
	 * 送り可能時間有無 . 
	 */
	private String sendTimeFlg;

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
	 * 送迎シャトルバス有無 .
	 */
	private String shuttleBusFlg;

	/**
	 * 送迎シャトルバス（最寄駅発） .
	 */
	private String shuttleBusStation;

	/**
	 * その他コメント .
	 */
	private String othersCmt;

	/**
	 * 要予約有無 .
	 */
	private String reserveFlg;

	/**
	 * 要予約コメント .
	 */
	private String reserveCmt;

	/**
	 * 駅到着要連絡有無 .
	 */
	private String contactFlg;

	/**
	 * 予約不要有無 .	
	 */
	private String noReserveFlg;
	
	/**
	 * 車利用高速道路IC .
	 */
	private String accessIc;
	/**
	 * JRと私鉄の区分.
	 */
	private String stationDiv;
	/**
	 * 出口情報.
	 */
	private String exitInfo;

	/**
	 * 
	 * @return 車利用時間
	 */
	public String getAccessTime() {
		return accessTime;
	}
	
	/**
	 * 
	 * @param accessTime 車利用時間
	 */
	public void setAccessTime(String accessTime) {
		this.accessTime = accessTime;
	}
	
	/**
	 * 
	 * @return タクシー料金年度
	 */
	public String getAnnualTaxiFee() {
		return annualTaxiFee;
	}
	
	/**
	 * 
	 * @param annualTaxiFee タクシー料金年度
	 */
	public void setAnnualTaxiFee(String annualTaxiFee) {
		this.annualTaxiFee = StringUtil.toHalf(annualTaxiFee);
	}
	
	/**
	 * 
	 * @return バス行き先
	 */
	public String getBusDestination() {
		return busDestination;
	}

	/**
	 * 
	 * @param busDestination バス行き先
	 */
	public void setBusDestination(String busDestination) {
		this.busDestination = StringUtil.toHalf(busDestination);
	}

	/**
	 * 
	 * @return バス利用時間
	 */
	public String getBusTimetable() {
		return busTimetable;
	}

	/**
	 * 
	 * @param busTimetable バス利用時間
	 */
	public void setBusTimetable(String busTimetable) {
		this.busTimetable = StringUtil.toHalf(busTimetable);
	}

	/**
	 * 
	 * @return 履歴番号
	 */
	public Integer getCareerNo() {
		return careerNo;
	}

	/**
	 * 
	 * @param careerNo 履歴番号
	 */
	public void setCareerNo(Integer careerNo) {
		this.careerNo = careerNo;
	}

	/**
	 * 
	 * @return 駅到着要連絡有無
	 */
	public String getContactFlg() {
		return contactFlg;
	}

	/**
	 * 
	 * @param contactFlg 駅到着要連絡有無
	 */
	public void setContactFlg(String contactFlg) {
		this.contactFlg = contactFlg;
	}

	/**
	 * 
	 * @return 車利用高速道路
	 */
	public String getHighway() {
		return highway;
	}

	
	/**
	 * 
	 * @param highway 車利用高速道路
	 */
	public void setHighway(String highway) {
		this.highway = highway;
	}

	/**
	 * 
	 * @return 迎え可能時間開始
	 */
	public String getMeetTimeBegin() {
		return KikakuWebUtil.buildTime(meetTimeBeginHour, meetTimeBeginMinute);
	}

	/**
	 * 
	 * @param meetTimeBegin 迎え可能時間開始
	 */
	public void setMeetTimeBegin(String meetTimeBegin) {

		setMeetTimeBeginHour(KikakuWebUtil.getHourFormTime(meetTimeBegin));
		setMeetTimeBeginMinute(KikakuWebUtil.getMinuteFromTime(meetTimeBegin));
	}
	

	/**
	 * 
	 * @return 迎え可能時間終了
	 */
	public String getMeetTimeEnd() {
		return KikakuWebUtil.buildTime(meetTimeEndHour, meetTimeEndMinute);
	}
	
	/**
	 * 
	 * @param meetTimeEnd 迎え可能時間終了
	 */
	public void setMeetTimeEnd(String meetTimeEnd) {

		setMeetTimeEndHour(KikakuWebUtil.getHourFormTime(meetTimeEnd));
		setMeetTimeEndMinute(KikakuWebUtil.getMinuteFromTime(meetTimeEnd));
	}
	

	/**
	 * 
	 * @return 迎え可能時間有無
	 */
	public String getMeetTimeFlg() {
		return meetTimeFlg;
	}

	/**
	 * 
	 * @param meetTimeFlg 迎え可能時間有無
	 */
	public void setMeetTimeFlg(String meetTimeFlg) {
		this.meetTimeFlg = meetTimeFlg;
	}

	/**
	 * 
	 * @return タクシー料金月
	 */
	public String getMonthlyTaxiFee() {
		return monthlyTaxiFee;
	}

	/**
	 * 
	 * @param monthlyTaxiFee タクシー料金月
	 */
	public void setMonthlyTaxiFee(String monthlyTaxiFee) {
		this.monthlyTaxiFee = StringUtil.toHalf(monthlyTaxiFee);
	}

	/**
	 * 
	 * @return 送迎バス
	 */
	public String getMsBus() {
		return msBus;
	}

	/**
	 * 
	 * @param msBus 送迎バス
	 */
	public void setMsBus(String msBus) {
		this.msBus = msBus;
	}

	/**
	 * 
	 * @return 送迎バス有無
	 */
	public String getMsBusFlg() {
		return msBusFlg;
	}

	/**
	 * 
	 * @param msBusFlg 送迎バス有無
	 */
	public void setMsBusFlg(String msBusFlg) {
		this.msBusFlg = msBusFlg;
	}

	/**
	 * 
	 * @return 送迎区分
	 */
	public Integer getMsDiv() {
		return msDiv;
	}

	/**
	 * 
	 * @param msDiv 送迎区分
	 */
	public void setMsDiv(Integer msDiv) {
		this.msDiv = msDiv;
	}

	/**
	 * 
	 * @return 送迎有無
	 */
	public String getMsFlg() {
		return msFlg;
	}

	/**
	 * 
	 * @param msFlg 送迎有無
	 */
	public void setMsFlg(String msFlg) {
		this.msFlg = msFlg;
	}

	/**
	 * 
	 * @return 送迎駅
	 */
	public String getMsStation() {
		return msStation;
	}

	/**
	 * 
	 * @param msStation 送迎駅
	 */
	public void setMsStation(String msStation) {
		this.msStation = msStation;
	}

	/**
	 * 
	 * @return 送迎駅有無
	 */
	public String getMsStationFlg() {
		return msStationFlg;
	}

	/**
	 * 
	 * @param msStationFlg 送迎駅有無
	 */
	public void setMsStationFlg(String msStationFlg) {
		this.msStationFlg = msStationFlg;
	}

	/**
	 * 
	 * @return ＪＲ・私鉄再寄駅
	 */
	public String getNearestStation() {
		return nearestStation;
	}

	/**
	 * 
	 * @param nearestStation ＪＲ・私鉄再寄駅
	 */
	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	/**
	 * 
	 * @return 予約不要有無
	 */
	public String getNoReserveFlg() {
		return noReserveFlg;
	}

	/**
	 * 
	 * @param noReserveFlg 予約不要有無
	 */
	public void setNoReserveFlg(String noReserveFlg) {
		this.noReserveFlg = noReserveFlg;
	}

	/**
	 * 
	 * @return その他コメント
	 */
	public String getOthersCmt() {
		return othersCmt;
	}

	/**
	 * 
	 * @param othersCmt その他コメント
	 */
	public void setOthersCmt(String othersCmt) {
		this.othersCmt = othersCmt;
	}

	/**
	 * 
	 * @return 企画回答連番
	 */
	public Long getPlanAnsNo() {
		return planAnsNo;
	}

	/**
	 * 
	 * @param planAnsNo 企画回答連番
	 */
	public void setPlanAnsNo(Long planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

	/**
	 * 
	 * @return 要予約コメント
	 */
	public String getReserveCmt() {
		return reserveCmt;
	}

	/**
	 * 
	 * @param reserveCmt 要予約コメント
	 */
	public void setReserveCmt(String reserveCmt) {
		this.reserveCmt = StringUtil.toHalf(reserveCmt);
	}

	/**
	 * 
	 * @return 要予約有無
	 */
	public String getReserveFlg() {
		return reserveFlg;
	}

	/**
	 * 
	 * @param reserveFlg 要予約有無
	 */
	public void setReserveFlg(String reserveFlg) {
		this.reserveFlg = reserveFlg;
	}

	/**
	 * 
	 * @return 送り可能時間開始
	 */
	public String getSendTimeBegin() {
		return KikakuWebUtil.buildTime(sendTimeBeginHour, sendTimeBeginMinute);
	}

	/**
	 * 
	 * @param sendTimeBegin 送り可能時間開始
	 */
	public void setSendTimeBegin(String sendTimeBegin) {

		setSendTimeBeginHour(KikakuWebUtil.getHourFormTime(sendTimeBegin));
		setSendTimeBeginMinute(KikakuWebUtil.getMinuteFromTime(sendTimeBegin));
	}
	
	/**
	 * 
	 * @return 送り可能時間終了
	 */
	public String getSendTimeEnd() {
		
		return KikakuWebUtil.buildTime(sendTimeEndHour, sendTimeEndMinute);
	}
	
	/**
	 * 
	 * @param sendTimeEnd 送り可能時間終了
	 */
	public void setSendTimeEnd(String sendTimeEnd) {

		setSendTimeEndHour(KikakuWebUtil.getHourFormTime(sendTimeEnd));
		setSendTimeEndMinute(KikakuWebUtil.getMinuteFromTime(sendTimeEnd));
	}

	/**
	 * 
	 * @return 送り可能時間有無
	 */
	public String getSendTimeFlg() {
		return sendTimeFlg;
	}

	/**
	 * 
	 * @param sendTimeFlg 送り可能時間有無
	 */
	public void setSendTimeFlg(String sendTimeFlg) {
		this.sendTimeFlg = sendTimeFlg;
	}

	/**
	 * 
	 * @return 送迎シャトルバス有無
	 */
	public String getShuttleBusFlg() {
		return shuttleBusFlg;
	}

	/**
	 * 
	 * @param shuttleBusFlg 送迎シャトルバス有無
	 */
	public void setShuttleBusFlg(String shuttleBusFlg) {
		this.shuttleBusFlg = shuttleBusFlg;
	}

	/**
	 * 
	 * @return 送迎シャトルバス（最寄駅発）
	 */
	public String getShuttleBusStation() {
		return shuttleBusStation;
	}

	/**
	 * 
	 * @param shuttleBusStation 送迎シャトルバス（最寄駅発）
	 */
	public void setShuttleBusStation(String shuttleBusStation) {
		this.shuttleBusStation = shuttleBusStation;
	}

	/**
	 * 
	 * @return タクシー利用料金
	 */
	public String getTaxiFee() {
		return taxiFee;
	}

	/**
	 * 
	 * @param taxiFee タクシー利用料金
	 */
	public void setTaxiFee(String taxiFee) {
		this.taxiFee = StringUtil.toHalf(taxiFee);
	}

	/**
	 * 
	 * @return タクシー時間	
	 */
	public String getTaxiTime() {
		return taxiTime;
	}

	/**
	 * 
	 * @param taxiTime タクシー時間	
	 */
	public void setTaxiTime(String taxiTime) {
		this.taxiTime = StringUtil.toHalf(taxiTime);
	}

	/**
	 * 
	 * @return バス停名
	 */
	public String getBusStation() {
		return busStation;
	}

	/**
	 * バス停名.
	 * @param busStation バス停
	 */
	public void setBusStation(String busStation) {
		this.busStation = busStation;
	}
	
	/**
	 * 
	 * @return バス停より徒歩時間
	 */
	public String getToBusStaTime() {
		return toBusStaTime;
	}

	/**
	 * 
	 * @param toBusStaTime バス停より徒歩時間
	 */
	public void setToBusStaTime(String toBusStaTime) {
		this.toBusStaTime = StringUtil.toHalf(toBusStaTime);
	}

	/**
	 * 
	 * @return 駅より徒歩時間
	 */
	public String getToStationWalktime() {
		return toStationWalktime;
	}

	/**
	 * 
	 * @param toStationWalktime 駅より徒歩時間
	 */
	public void setToStationWalktime(String toStationWalktime) {
		this.toStationWalktime = StringUtil.toHalf(toStationWalktime);
	}

	/**
	 * 
	 * @return 交通手段有無
	 */
	public String getTrafficFlg() {
		return trafficFlg;
	}

	/**
	 * 
	 * @param trafficFlg 交通手段有無
	 */
	public void setTrafficFlg(String trafficFlg) {
		this.trafficFlg = trafficFlg;
	}

	/**
	 * @return meetTimeBeginHour 迎え可能時間開始：時間
	 */
	public String getMeetTimeBeginHour() {
		return meetTimeBeginHour;
	}

	/**
	 * @param meetTimeBeginHour 迎え可能時間開始：時間
	 */
	public void setMeetTimeBeginHour(String meetTimeBeginHour) {
		this.meetTimeBeginHour = StringUtil.toHalf(meetTimeBeginHour);
	}

	/**
	 * @return meetTimeBeginMinute 迎え可能時間開始：分
	 */
	public String getMeetTimeBeginMinute() {
		return meetTimeBeginMinute;
	}

	/**
	 * @param meetTimeBeginMinute 迎え可能時間開始：分
	 */
	public void setMeetTimeBeginMinute(String meetTimeBeginMinute) {
		this.meetTimeBeginMinute = StringUtil.toHalf(meetTimeBeginMinute);
	}
	
	/**
	 * @return meetTimeEndHour 迎え可能時間終了：時間
	 */
	public String getMeetTimeEndHour() {
		return meetTimeEndHour;
	}

	/**
	 * @param meetTimeEndHour 迎え可能時間終了：時間
	 */
	public void setMeetTimeEndHour(String meetTimeEndHour) {
		this.meetTimeEndHour = StringUtil.toHalf(meetTimeEndHour);
	}

	/**
	 * @return meetTimeEndMinute 迎え可能時間終了：分
	 */
	public String getMeetTimeEndMinute() {
		return meetTimeEndMinute;
	}

	/**
	 * @param meetTimeEndMinute 迎え可能時間終了：分
	 */
	public void setMeetTimeEndMinute(String meetTimeEndMinute) {
		this.meetTimeEndMinute = StringUtil.toHalf(meetTimeEndMinute);
	}

	/**
	 * @return sendTimeBeginHour 送り可能時間開始：時間
	 */
	public String getSendTimeBeginHour() {
		return sendTimeBeginHour;
	}

	/**
	 * @param sendTimeBeginHour 送り可能時間開始：時間
	 */
	public void setSendTimeBeginHour(String sendTimeBeginHour) {
		this.sendTimeBeginHour = StringUtil.toHalf(sendTimeBeginHour);
	}

	/**
	 * @return sendTimeBeginMinute 送り可能時間開始：分
	 */
	public String getSendTimeBeginMinute() {
		return sendTimeBeginMinute;
	}

	/**
	 * @param sendTimeBeginMinute 送り可能時間開始：分
	 */
	public void setSendTimeBeginMinute(String sendTimeBeginMinute) {
		this.sendTimeBeginMinute = StringUtil.toHalf(sendTimeBeginMinute);
	}

	/**
	 * @return sendTimeEndHour　送り可能時間終了:時間
	 */
	public String getSendTimeEndHour() {
		return sendTimeEndHour;
	}

	/**
	 * @param sendTimeEndHour 送り可能時間終了:時間
	 */
	public void setSendTimeEndHour(String sendTimeEndHour) {
		this.sendTimeEndHour = StringUtil.toHalf(sendTimeEndHour);
	}

	/**
	 * @return sendTimeEndMinute　送り可能時間終了:分
	 */
	public String getSendTimeEndMinute() {
		return sendTimeEndMinute;
	}

	/**
	 * @param sendTimeEndMinute 送り可能時間終了:分
	 */
	public void setSendTimeEndMinute(String sendTimeEndMinute) {
		this.sendTimeEndMinute = StringUtil.toHalf(sendTimeEndMinute);
	}

	/**
	 * @return accessIc 車利用高速道路IC
	 */
	public String getAccessIc() {
		return accessIc;
	}

	/**
	 * @param accessIc 車利用高速道路IC
	 */
	public void setAccessIc(String accessIc) {
		this.accessIc = accessIc;
	}
	/**
	 * 
	 * @return JRと私鉄の区分
	 */
	public String getStationDiv() {
		return stationDiv;
	}
	/**
	 * 
	 * @param stationDiv JRと私鉄の区分
	 */
	public void setStationDiv(String stationDiv) {
		this.stationDiv = stationDiv;
	}
	/**
	 * 
	 * @return 出口情報
	 */
	public String getExitInfo() {
		return exitInfo;
	}
	/**
	 * 
	 * @param exitInfo 出口情報
	 */
	public void setExitInfo(String exitInfo) {
		this.exitInfo = exitInfo;
	}

}
									
