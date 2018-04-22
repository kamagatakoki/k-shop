package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * NO5_施設データクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class EquipmentData {
	
	/**
	 * 企画回答連番 .
	 */
	private Long planAnsNo;

	/**
	 * 履歴番号 .
	 */
	private Integer careerNo;

	/**
	 * 設備種別 .
	 */
	private Integer equipmentKind;

	/**
	 * 設備有無 .
	 */
	private String equipmentFlg;

	/**
	 * 料金有無 .
	 */
	private String chargeFlg;

	/**
	 * 利用時間 .
	 */
	private String useTime;

	/**
	 * 利用料金 .
	 */
	private String useFee;

	/**
	 * 設備数量 .
	 */
	private String facilityNum;

	/**
	 * 利用可能期間開始月 .
	 */
	private String periodBeginM;

	/**
	 * 利用可能期間開始日 .
	 */
	private String periodBeginD;

	/**
	 * 利用可能期間終了月 .
	 */
	private String periodEndM;

	/**
	 * 利用可能期間終了日 .
	 */
	private String periodEndD;

	/**
	 * 新聞サービス区分 .
	 */
	private Integer newspaperServiceDiv;

	/**
	 * 駐車場利用台数 .
	 */
	private String parkAvailableNum;

	/**
	 * 駐車場一泊金額 .
	 */
	private String parkCharge;

	/**
	 * 再寄コンビニ徒歩時間 .
	 */
	private String nearStoreWalktime;
	
	/**
	 * コンビにー営業開始時間（時） 2009/11/12 add by s31109 .
	 */
	private String storeBeginHour;
	
	/**
	 * コンビにー営業開始時間（分） 2009/11/12 add by s31109 .
	 */
	private String storeBeginMinute;
	
	/**
	 * コンビにー営業終了時間（時） 2009/11/12 add by s31109 .
	 */
	private String storeEndHour;
	
	/**
	 * コンビにー営業終了時間（分） 2009/11/12 add by s31109 .
	 */
	private String storeEndMinute;

	/**
	 * @return 履歴番号
	 */
	public Integer getCareerNo() {
		return careerNo;
	}

	/**
	 * @param careerNo 履歴番号
	 */
	public void setCareerNo(Integer careerNo) {
		this.careerNo = careerNo;
	}

	/**
	 * @return 料金有無
	 */
	public String getChargeFlg() {
		return chargeFlg;
	}

	/**
	 * @param chargeFlg 料金有無
	 */
	public void setChargeFlg(String chargeFlg) {
		this.chargeFlg = chargeFlg;
	}

	/**
	 * @return 設備有無
	 */
	public String getEquipmentFlg() {
		return equipmentFlg;
	}

	/**
	 * @param equipmentFlg 設備有無
	 */
	public void setEquipmentFlg(String equipmentFlg) {
		this.equipmentFlg = equipmentFlg;
	}

	/**
	 * @return 設備種別
	 */
	public Integer getEquipmentKind() {
		return equipmentKind;
	}

	/**
	 * @param equipmentKind 設備種別
	 */
	public void setEquipmentKind(Integer equipmentKind) {
		this.equipmentKind = equipmentKind;
	}

	/**
	 * @return 設備数量
	 */
	public String getFacilityNum() {
		return facilityNum;
	}

	/**
	 * @param facilityNum 設備数量
	 */
	public void setFacilityNum(String facilityNum) {
		this.facilityNum = StringUtil.toHalf(facilityNum);
	}

	/**
	 * @return 再寄コンビニ徒歩時間
	 */
	public String getNearStoreWalktime() {
		return nearStoreWalktime;
	}

	/**
	 * @param nearStoreWalktime 再寄コンビニ徒歩時間
	 */
	public void setNearStoreWalktime(String nearStoreWalktime) {
		this.nearStoreWalktime = StringUtil.toHalf(nearStoreWalktime);
	}

	/**
	 * @return 新聞サービス区分
	 */
	public Integer getNewspaperServiceDiv() {
		return newspaperServiceDiv;
	}

	/**
	 * @param newspaperServiceDiv 新聞サービス区分
	 */
	public void setNewspaperServiceDiv(Integer newspaperServiceDiv) {
		this.newspaperServiceDiv = newspaperServiceDiv;
	}

	/**
	 * @return 駐車場利用台数
	 */
	public String getParkAvailableNum() {
		return parkAvailableNum;
	}

	/**
	 * @param parkAvailableNum 駐車場利用台数
	 */
	public void setParkAvailableNum(String parkAvailableNum) {
		this.parkAvailableNum = StringUtil.toHalf(parkAvailableNum);
	}

	/**
	 * @return 駐車場一泊金額
	 */
	public String getParkCharge() {
		return parkCharge;
	}

	/**
	 * @param parkCharge 駐車場一泊金額
	 */
	public void setParkCharge(String parkCharge) {

		String str = StringUtil.toHalf(parkCharge);
		/*if (!StringUtil.isEmpty(parkCharge)) {
			str = str.replaceAll(",", "");
		}*/
		this.parkCharge = str;
	}

	/**
	 * @return 利用可能期間開始日
	 */
	public String getPeriodBeginD() {
		return periodBeginD;
	}

	/**
	 * @param periodBeginD 利用可能期間開始日
	 */
	public void setPeriodBeginD(String periodBeginD) {
		this.periodBeginD = StringUtil.toHalf(periodBeginD);
	}

	/**
	 * @return 利用可能期間開始月
	 */
	public String getPeriodBeginM() {
		return periodBeginM;
	}

	/**
	 * @param periodBeginM 利用可能期間開始月
	 */
	public void setPeriodBeginM(String periodBeginM) {
		this.periodBeginM = StringUtil.toHalf(periodBeginM);
	}

	/**
	 * @return 利用可能期間終了日
	 */
	public String getPeriodEndD() {
		return periodEndD;
	}

	/**
	 * @param periodEndD 利用可能期間終了日
	 */
	public void setPeriodEndD(String periodEndD) {
		this.periodEndD = StringUtil.toHalf(periodEndD);
	}

	/**
	 * @return 利用可能期間終了月
	 */
	public String getPeriodEndM() {
		return periodEndM;
	}

	/**
	 * @param periodEndM 利用可能期間終了月
	 */
	public void setPeriodEndM(String periodEndM) {
		this.periodEndM = StringUtil.toHalf(periodEndM);
	}

	/**
	 * @return 企画回答連番
	 */
	public Long getPlanAnsNo() {
		return planAnsNo;
	}

	/**
	 * @param planAnsNo 企画回答連番
	 */
	public void setPlanAnsNo(Long planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

	/**
	 * @return 利用料金
	 */
	public String getUseFee() {
		return useFee;
	}

	/**
	 * @param useFee 利用料金
	 */
	public void setUseFee(String useFee) {
		this.useFee = StringUtil.toHalf(useFee);
	}

	/**
	 * @return 利用時間
	 */
	public String getUseTime() {
		return useTime;
	}

	/**
	 * @param useTime 利用時間
	 */
	public void setUseTime(String useTime) {
		this.useTime = StringUtil.toHalf(useTime);
	}
	
	/**
	 * @return コンビにー営業開始時間（時）
	 */
	public String getStoreBeginHour() {
		return storeBeginHour;
	}

	/**
	 * @param コンビにー営業開始時間（時）
	 */
	public void setStoreBeginHour(String storeBeginHour) {
		this.storeBeginHour = storeBeginHour;
	}
	
	/**
	 * @return コンビにー営業開始時間（分）
	 */
	public String getStoreBeginMinute() {
		return storeBeginMinute;
	}

	/**
	 * @param コンビにー営業開始時間（分）
	 */
	public void setStoreBeginMinute(String storeBeginMinute) {
		this.storeBeginMinute = storeBeginMinute;
	}
	
	/**
	 * @return コンビにー営業終了時間（時）
	 */
	public String getStoreEndHour() {
		return storeEndHour;
	}

	/**
	 * @param コンビにー営業終了時間（時）
	 */
	public void setStoreEndHour(String storeEndHour) {
		this.storeEndHour = storeEndHour;
	}
	
	/**
	 * @return コンビにー営業終了時間（分）
	 */
	public String getStoreEndMinute() {
		return storeEndMinute;
	}

	/**
	 * @param コンビにー営業終了時間（分）
	 */
	public void setStoreEndMinute(String storeEndMinute) {
		this.storeEndMinute = storeEndMinute;
	}
	
	/**
	 * @return コンビにー営業開始時間
	 */
	public String getStoreBegin() {
		return KikakuWebUtil.buildTime(storeBeginHour, storeBeginMinute);
	}

	/**
	 * @param コンビにー営業開始時間
	 */
	public void setStoreBegin(String storeBegin) {
		setStoreBeginHour(KikakuWebUtil.getHourFormTime(storeBegin));
		setStoreBeginMinute(KikakuWebUtil.getMinuteFromTime(storeBegin));
	}
	
	/**
	 * @return コンビにー営業終了時間
	 */
	public String getStoreEnd() {
		return KikakuWebUtil.buildTime(storeEndHour, storeEndMinute);
	}

	/**
	 * @param コンビにー営業終了時間
	 */
	public void setStoreEnd(String storeEnd) {
		setStoreEndHour(KikakuWebUtil.getHourFormTime(storeEnd));
		setStoreEndMinute(KikakuWebUtil.getMinuteFromTime(storeEnd));
	}
	
}
