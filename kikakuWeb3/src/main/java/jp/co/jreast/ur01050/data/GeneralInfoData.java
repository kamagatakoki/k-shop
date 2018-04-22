package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * NO5_一般情報データクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class GeneralInfoData {
											
											
	/**
	 * 企画回答連番 .							
	 */
	private Long planAnsNo;

	/**
	 * 履歴番号 .							
	 */
	private Integer careerNo;

	/**
	 * セールスポイント .
	 */
	private String salesPoint;

	/**
	 * 子供料金有無 .
	 */
	private String childFreeFlg;

	/**
	 * 子供無料年齢 .
	 *//*
	private String childFreeAge;*/
	
	
	/**
	 * 子供料金有無(開始年齢) .
	 */
	private String childFreeAgeFrom;
	/**
	 * 子供料金有無(終了年齢) .
	 */
	private String childFreeAgeTo;
	/**
	 * 子供料金有無(条件) .
	 */
	private String childFreeAgeCond;
	/**
	 * 子供料金有無(開始年齢) .
	 */
	private String childPayAgeFrom;
	/**
	 * 子供料金有無(終了年齢) .
	 */
	private String childPayAgeTo;
	/**
	 * 子供料金有無(条件) .
	 */
	private String childPayAgeCond;
/*	*//**
	 * 子供有料年齢 .
	 *//*
	private String childPayAge;*/

	/**
	 * 子供料金 .
	 */
	private String childFees;

	/**
	 * 子供料金コメント .
	 */
	private String childFeesCmt;

	/**
	 * 客層別おすすめ有無 .
	 */
	private String customerFlg;

	/**
	 * おすすめ客層 .
	 */
	private String customerDiv;

	/**
	 * おすすめコメント .
	 */
	private String suggestionCmt;

	/**
	 * 自動マッサージ機有無 .
	 */
	private String massagerFlg;

	/**
	 * 自動マッサージ機台数 .
	 */
	private String massagerNum;

	/**
	 * 自動マッサージ機設置場所 .
	 */
	private String massagerLocation;

	/**
	 * 自動マッサージ機有料有無 .
	 */
	private String massagerPayFlg;

	/**
	 * 自動マッサージ機利用時間 .
	 */
	private String massagerUseTime;

	/**
	 * 自動マッサージ機利用金額 .
	 */
	private String massagerUseAmt;

	/**
	 * 車椅子常備有無 .
	 */
	private String wheelchairFlg;

	/**
	 * 車椅子常備台数 .
	 */
	private String wheelchairNum;

	/**
	 * エレベーター有無 .
	 */
	private String elevatorFlg;

	/**
	 * 部屋までペット有無 .
	 */
	private String roomPetFlg;

	/**
	 * 部屋までペット条件 .
	 */
	private String roomPetCond;

	/**
	 * 部屋まで盲導犬有無 .
	 */
	private String roomGuideDogFlg;

	/**
	 * 手話の出来るフロント係有無 .
	 */
	private String signLangFrontFlg;

	/**
	 * 手話全員区分 .
	 */
	private Integer signLangAllDiv;

	/**
	 * 手話時間区分 .
	 */
	private String signLangTimeDiv;

	/**
	 * 手話開始時間:時間 .
	 */
	private String signLangBeginHour;
	
	/**
	 * 手話開始時間:分 .
	 */
	private String signLangBeginMinute;

	/**
	 * 手話終了時間：時間 .
	 */
	private String signLangEndHour;
	
	/**
	 * 手話終了時間：分 .
	 */
	private String signLangEndMinute;
	
	/**
	 * 英語の出来るフロント係有無 .
	 */
	private String engFrontFlg;

	/**
	 * 英語全員区分 .
	 */
	private Integer engAllDiv;

	/**
	 * 英語時間区分 .
	 */
	private String engTimeDiv;

	/**
	 * 英語開始時間：時間 .
	 */
	private String engTimeBeginHour;
	
	/**
	 * 英語開始時間：分 .
	 */
	private String engTimeBeginMinute;

	/** 
	 * 英語終了時間：時間 .	
	 */
	private String engTimeEndHour;

	/**
	 * 英語終了時間：分 .
	 */
	private String engTimeEndMinute;
	/**
	 * 築何年有無 .
	 */
	private String buildingYearsFlg;

	/**
	 * 本館年数 .
	 */
	private String mainBuildingYears;

	/**
	 * 別館年数 .
	 */
	private String annexYears;

	/**
	 * 新館年数 .
	 */
	private String newBuildingYears;

	/**
	 * その他コメント . 	
	 */
	private String othersCmt;

	/**
	 * 総客室数有無 .
	 */
	private String totalRoomFlg;

	/**
	 * 総客室数 .
	 */
	private String totalRoomNum;

	/** 
	 * 備考 .
	 */
	private String memo;

	/**
	 * @return 別館年数
	 */
	public String getAnnexYears() {
		return annexYears;
	}

	/**
	 * @param annexYears 別館年数
	 */
	public void setAnnexYears(String annexYears) {
		this.annexYears = StringUtil.toHalf(annexYears);
	}

	/**
	 * @return 築何年有無
	 */
	public String getBuildingYearsFlg() {
		return buildingYearsFlg;
	}

	/**
	 * @param buildingYearsFlg 築何年有無
	 */
	public void setBuildingYearsFlg(String buildingYearsFlg) {
		this.buildingYearsFlg = buildingYearsFlg;
	}

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
	 * @return 子供料金
	 */
	public String getChildFees() {
		return childFees;
	}

	/**
	 * @param childFees 子供料金
	 */
	public void setChildFees(String childFees) {
		this.childFees = StringUtil.toHalf(childFees);
	}

	/**
	 * @return 子供料金コメント
	 */
	public String getChildFeesCmt() {
		return childFeesCmt;
	}

	/**
	 * @param childFeesCmt 子供料金コメント
	 */
	public void setChildFeesCmt(String childFeesCmt) {
		this.childFeesCmt = childFeesCmt;
	}

/*	*//**
	 * @return 子供無料年齢
	 *//*
	public String getChildFreeAge() {
		return childFreeAge;
	}

	*//**
	 * @param childFreeAge 子供無料年齢
	 *//*
	public void setChildFreeAge(String childFreeAge) {
		this.childFreeAge = StringUtil.toHalf(childFreeAge);
	}*/

	/**
	 * @return 子供料金有無
	 */
	public String getChildFreeFlg() {
		return childFreeFlg;
	}

	/**
	 * @param childFreeFlg 子供料金有無
	 */
	public void setChildFreeFlg(String childFreeFlg) {
		this.childFreeFlg = childFreeFlg;
	}

/*	*//**
	 * @return 子供有料年齢
	 *//*
	public String getChildPayAge() {
		return childPayAge;
	}

	*//**
	 * @param childPayAge 子供有料年齢
	 *//*
	public void setChildPayAge(String childPayAge) {
		this.childPayAge = StringUtil.toHalf(childPayAge);
	}*/

	/**
	 * @return おすすめ客層
	 */
	public String getCustomerDiv() {
		return customerDiv;
	}

	/**
	 * @param customerDiv おすすめ客層
	 */
	public void setCustomerDiv(String customerDiv) {
		this.customerDiv = customerDiv;
	}

	/**
	 * @return 客層別おすすめ有無
	 */
	public String getCustomerFlg() {
		return customerFlg;
	}

	/**
	 * @param customerFlg 客層別おすすめ有無
	 */
	public void setCustomerFlg(String customerFlg) {
		this.customerFlg = customerFlg;
	}

	/**
	 * @return エレベーター有無
	 */
	public String getElevatorFlg() {
		return elevatorFlg;
	}

	/**
	 * @param elevatorFlg エレベーター有無
	 */
	public void setElevatorFlg(String elevatorFlg) {
		this.elevatorFlg = elevatorFlg;
	}

	/**
	 * @return 英語全員区分
	 */
	public Integer getEngAllDiv() {
		return engAllDiv;
	}

	/**
	 * @param engAllDiv 英語全員区分
	 */
	public void setEngAllDiv(Integer engAllDiv) {
		this.engAllDiv = engAllDiv;
	}

	/**
	 * @return 英語の出来るフロント係有無
	 */
	public String getEngFrontFlg() {
		return engFrontFlg;
	}

	/**
	 * @param engFrontFlg 英語の出来るフロント係有無
	 */
	public void setEngFrontFlg(String engFrontFlg) {
		this.engFrontFlg = engFrontFlg;
	}

	/**
	 * @return 英語開始時間
	 */
	public String getEngTimeBegin() {
		
		return KikakuWebUtil.buildTime(engTimeBeginHour, engTimeBeginMinute);
	}

	/**
	 * 
	 * @param engTimeBegin 英語開始時間
	 */
	public void setEngTimeBegin(String engTimeBegin) {

		setEngTimeBeginHour(KikakuWebUtil.getHourFormTime(engTimeBegin));
		setEngTimeBeginMinute(KikakuWebUtil.getMinuteFromTime(engTimeBegin));
	}
	/**
	 * @return 英語時間区分
	 */
	public String getEngTimeDiv() {
		return engTimeDiv;
	}

	/**
	 * @param engTimeDiv 英語時間区分
	 */
	public void setEngTimeDiv(String engTimeDiv) {
		this.engTimeDiv = engTimeDiv;
	}

	/**
	 * @return 英語終了時間
	 */
	public String getEngTimeEnd() {
		
		return KikakuWebUtil.buildTime(engTimeEndHour, engTimeEndMinute);
	}
	
	/**
	 * 
	 * @param engTimeEnd 英語終了時間
	 */
	public void setEngTimeEnd(String engTimeEnd) {

		setEngTimeEndHour(KikakuWebUtil.getHourFormTime(engTimeEnd));
		setEngTimeEndMinute(KikakuWebUtil.getMinuteFromTime(engTimeEnd));
	}
	

	/**
	 * @return 本館年数
	 */
	public String getMainBuildingYears() {
		return mainBuildingYears;
	}

	/**
	 * @param mainBuildingYears 本館年数
	 */
	public void setMainBuildingYears(String mainBuildingYears) {
		this.mainBuildingYears = StringUtil.toHalf(mainBuildingYears);
	}

	/**
	 * @return 自動マッサージ機有無
	 */
	public String getMassagerFlg() {
		return massagerFlg;
	}

	/**
	 * @param massagerFlg 自動マッサージ機有無
	 */
	public void setMassagerFlg(String massagerFlg) {
		this.massagerFlg = massagerFlg;
	}

	/**
	 * @return 自動マッサージ機設置場所
	 */
	public String getMassagerLocation() {
		return massagerLocation;
	}

	/**
	 * @param massagerLocation 自動マッサージ機設置場所
	 */
	public void setMassagerLocation(String massagerLocation) {
		this.massagerLocation = massagerLocation;
	}

	/**
	 * @return 自動マッサージ機台数
	 */
	public String getMassagerNum() {
		return massagerNum;
	}

	/**
	 * @param massagerNum 自動マッサージ機台数
	 */
	public void setMassagerNum(String massagerNum) {
		this.massagerNum = StringUtil.toHalf(massagerNum);
	}

	/**
	 * @return 自動マッサージ機有料有無
	 */
	public String getMassagerPayFlg() {
		return massagerPayFlg;
	}

	/**
	 * @param massagerPayFlg 自動マッサージ機有料有無
	 */
	public void setMassagerPayFlg(String massagerPayFlg) {
		this.massagerPayFlg = massagerPayFlg;
	}

	/**
	 * @return 自動マッサージ機利用金額
	 */
	public String getMassagerUseAmt() {
		return massagerUseAmt;
	}

	/**
	 * @param massagerUseAmt 自動マッサージ機利用金額
	 */
	public void setMassagerUseAmt(String massagerUseAmt) {
		this.massagerUseAmt = StringUtil.toHalf(massagerUseAmt);
	}

	/**
	 * @return 自動マッサージ機利用時間
	 */
	public String getMassagerUseTime() {
		return massagerUseTime;
	}

	/**
	 * @param massagerUseTime 自動マッサージ機利用時間
	 */
	public void setMassagerUseTime(String massagerUseTime) {
		this.massagerUseTime = StringUtil.toHalf(massagerUseTime);
	}

	/**
	 * @return 備考
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo 備考
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return 新館年数
	 */
	public String getNewBuildingYears() {
		return newBuildingYears;
	}

	/**
	 * @param newBuildingYears 新館年数
	 */
	public void setNewBuildingYears(String newBuildingYears) {
		this.newBuildingYears = StringUtil.toHalf(newBuildingYears);
	}

	/**
	 * @return その他コメント
	 */
	public String getOthersCmt() {
		return othersCmt;
	}

	/**
	 * @param othersCmt その他コメント
	 */
	public void setOthersCmt(String othersCmt) {
		this.othersCmt = othersCmt;
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
	 * @return 部屋まで盲導犬有無
	 */
	public String getRoomGuideDogFlg() {
		return roomGuideDogFlg;
	}

	/**
	 * @param roomGuideDogFlg 部屋まで盲導犬有無
	 */
	public void setRoomGuideDogFlg(String roomGuideDogFlg) {
		this.roomGuideDogFlg = roomGuideDogFlg;
	}

	/**
	 * @return 部屋までペット条件
	 */
	public String getRoomPetCond() {
		return roomPetCond;
	}

	/**
	 * @param roomPetCond 部屋までペット条件
	 */
	public void setRoomPetCond(String roomPetCond) {
		this.roomPetCond = roomPetCond;
	}

	/**
	 * @return 部屋までペット有無
	 */
	public String getRoomPetFlg() {
		return roomPetFlg;
	}

	/**
	 * @param roomPetFlg 部屋までペット有無
	 */
	public void setRoomPetFlg(String roomPetFlg) {
		this.roomPetFlg = roomPetFlg;
	}

	/**
	 * @return セールスポイント
	 */
	public String getSalesPoint() {
		return salesPoint;
	}

	/**
	 * @param salesPoint セールスポイント
	 */
	public void setSalesPoint(String salesPoint) {
		this.salesPoint = salesPoint;
	}

	/**
	 * @return 手話全員区分
	 */
	public Integer getSignLangAllDiv() {
		return signLangAllDiv;
	}

	/**
	 * @param signLangAllDiv 手話全員区分
	 */
	public void setSignLangAllDiv(Integer signLangAllDiv) {
		this.signLangAllDiv = signLangAllDiv;
	}

	/**
	 * @return 手話開始時間
	 */
	public String getSignLangBegin() {

		return KikakuWebUtil.buildTime(signLangBeginHour, signLangBeginMinute);
	}

	/**
	 * 
	 * @param signLangBegin 手話開始時間
	 */
	public void setSignLangBegin(String signLangBegin) {
		
		setSignLangBeginHour(KikakuWebUtil.getHourFormTime(signLangBegin));
		setSignLangBeginMinute(KikakuWebUtil.getMinuteFromTime(signLangBegin));
	}
	/**
	 * @return 手話終了時間
	 */
	public String getSignLangEnd() {
		
		return KikakuWebUtil.buildTime(signLangEndHour, signLangEndMinute);
	}

	/**
	 * 
	 * @param signLangEnd 手話終了時間
	 */
	public void setSignLangEnd(String signLangEnd) {

		setSignLangEndHour(KikakuWebUtil.getHourFormTime(signLangEnd));
		setSignLangEndMinute(KikakuWebUtil.getMinuteFromTime(signLangEnd));
	}

	/**
	 * @return 手話の出来るフロント係有無
	 */
	public String getSignLangFrontFlg() {
		return signLangFrontFlg;
	}

	/**
	 * @param signLangFrontFlg 手話の出来るフロント係有無
	 */
	public void setSignLangFrontFlg(String signLangFrontFlg) {
		this.signLangFrontFlg = signLangFrontFlg;
	}

	/**
	 * @return 手話時間区分
	 */
	public String getSignLangTimeDiv() {
		return signLangTimeDiv;
	}

	/**
	 * @param signLangTimeDiv 手話時間区分
	 */
	public void setSignLangTimeDiv(String signLangTimeDiv) {
		this.signLangTimeDiv = signLangTimeDiv;
	}

	/**
	 * @return おすすめコメント
	 */
	public String getSuggestionCmt() {
		return suggestionCmt;
	}

	/**
	 * @param suggestionCmt おすすめコメント
	 */
	public void setSuggestionCmt(String suggestionCmt) {
		this.suggestionCmt = suggestionCmt;
	}

	/**
	 * @return 総客室数有無
	 */
	public String getTotalRoomFlg() {
		return totalRoomFlg;
	}

	/**
	 * @param totalRoomFlg 総客室数有無
	 */
	public void setTotalRoomFlg(String totalRoomFlg) {
		this.totalRoomFlg = totalRoomFlg;
	}

	/**
	 * @return 総客室数
	 */
	public String getTotalRoomNum() {
		return totalRoomNum;
	}

	/**
	 * @param totalRoomNum 総客室数
	 */
	public void setTotalRoomNum(String totalRoomNum) {
		this.totalRoomNum = StringUtil.toHalf(totalRoomNum);
	}

	/**
	 * @return 車椅子常備有無	
	 */
	public String getWheelchairFlg() {
		return wheelchairFlg;
	}

	/**
	 * @param wheelchairFlg 車椅子常備有無	
	 */
	public void setWheelchairFlg(String wheelchairFlg) {
		this.wheelchairFlg = wheelchairFlg;
	}

	/**
	 * @return 車椅子常備台数
	 */
	public String getWheelchairNum() {
		return wheelchairNum;
	}

	/**
	 * @param wheelchairNum 車椅子常備台数
	 */
	public void setWheelchairNum(String wheelchairNum) {
		this.wheelchairNum = StringUtil.toHalf(wheelchairNum);
	}

	/**
	 * @return signLangBeginHour 手話開始時間:時間
	 */
	public String getSignLangBeginHour() {
		return signLangBeginHour;
	}

	/**
	 * @param signLangBeginHour 手話開始時間:時間
	 */
	public void setSignLangBeginHour(String signLangBeginHour) {
		this.signLangBeginHour = StringUtil.toHalf(signLangBeginHour);
	}

	/**
	 * @return signLangBeginMinute 手話開始時間:分
	 */
	public String getSignLangBeginMinute() {
		return signLangBeginMinute;
	}

	/**
	 * @param signLangBeginMinute 手話開始時間:分
	 */
	public void setSignLangBeginMinute(String signLangBeginMinute) {
		this.signLangBeginMinute = StringUtil.toHalf(signLangBeginMinute);
	}

	/**
	 * @return signLangEndHour 手話終了時間：時間
	 */
	public String getSignLangEndHour() {
		return signLangEndHour;
	}

	/**
	 * @param signLangEndHour 手話終了時間：時間
	 */
	public void setSignLangEndHour(String signLangEndHour) {
		this.signLangEndHour = StringUtil.toHalf(signLangEndHour);
	}

	/**
	 * @return signLangEndMinute 手話終了時間：分
	 */
	public String getSignLangEndMinute() {
		return signLangEndMinute;
	}

	/**
	 * @param signLangEndMinute 手話終了時間：分
	 */
	public void setSignLangEndMinute(String signLangEndMinute) {
		this.signLangEndMinute = StringUtil.toHalf(signLangEndMinute);
	}

	/**
	 * @return engTimeBeginHour 英語開始時間：時間
	 */
	public String getEngTimeBeginHour() {
		return engTimeBeginHour;
	}
	
	/**
	 * @param engTimeBeginHour 英語開始時間：時間
	 */
	public void setEngTimeBeginHour(String engTimeBeginHour) {
		this.engTimeBeginHour = StringUtil.toHalf(engTimeBeginHour);
	}

	/**
	 * @return engTimeBeginMinute 英語開始時間：分
	 */
	public String getEngTimeBeginMinute() {
		return engTimeBeginMinute;
	}

	/**
	 * @param engTimeBeginMinute 英語開始時間：分
	 */
	public void setEngTimeBeginMinute(String engTimeBeginMinute) {
		this.engTimeBeginMinute = StringUtil.toHalf(engTimeBeginMinute);
	}

	/**
	 * @return engTimeEndHour 英語終了時間：時間
	 */
	public String getEngTimeEndHour() {
		return engTimeEndHour;
	}

	/**
	 * @param engTimeEndHour 英語終了時間：時間
	 */
	public void setEngTimeEndHour(String engTimeEndHour) {
		this.engTimeEndHour = StringUtil.toHalf(engTimeEndHour);
	}

	/**
	 * @return engTimeEndMinute 英語終了時間：分
	 */
	public String getEngTimeEndMinute() {
		return engTimeEndMinute;
	}

	/**
	 * @param engTimeEndMinute 英語終了時間：分
	 */
	public void setEngTimeEndMinute(String engTimeEndMinute) {
		this.engTimeEndMinute = StringUtil.toHalf(engTimeEndMinute);
	}
	/**
	 * 
	 * @return 子供料金無(条件) .
	 */
	public String getChildFreeAgeCond() {
		return childFreeAgeCond;
	}
	/**
	 * 	 * @param childFreeAgeCond 子供料金無(条件)
	 */
	public void setChildFreeAgeCond(String childFreeAgeCond) {
		this.childFreeAgeCond = childFreeAgeCond;
	}
	/**
	 * 
	 * @return 子供料金無(開始年齢) .
	 */
	public String getChildFreeAgeFrom() {
		return childFreeAgeFrom;
	}
	/**
	 * 
	 * @param childFreeAgeFrom 子供料金無(開始年齢)
	 */
	public void setChildFreeAgeFrom(String childFreeAgeFrom) {
		this.childFreeAgeFrom = childFreeAgeFrom;
	}
	/**
	 * 
	 * @return 子供料金無(終了年齢) .
	 */
	public String getChildFreeAgeTo() {
		return childFreeAgeTo;
	}
	/**
	 * 
	 * @param childFreeAgeTo 子供料金無(終了年齢)
	 */
	public void setChildFreeAgeTo(String childFreeAgeTo) {
		this.childFreeAgeTo = childFreeAgeTo;
	}
	/**
	 * 
	 * @return 子供料金有(条件) .
	 */
	public String getChildPayAgeCond() {
		return childPayAgeCond;
	}
	/**
	 * 
	 * @param childPayAgeCond 子供料金有(条件)
	 */
	public void setChildPayAgeCond(String childPayAgeCond) {
		this.childPayAgeCond = childPayAgeCond;
	}
	/**
	 * 
	 * @return 子供料金有(開始年齢) .
	 */
	public String getChildPayAgeFrom() {
		return childPayAgeFrom;
	}
	/**
	 * 
	 * @param childPayAgeFrom 子供料金有(開始年齢)
	 */
	public void setChildPayAgeFrom(String childPayAgeFrom) {
		this.childPayAgeFrom = childPayAgeFrom;
	}
	/**
	 * 
	 * @return 子供料金無(終了年齢) .
	 */
	public String getChildPayAgeTo() {
		return childPayAgeTo;
	}
	/**
	 * 
	 * @param childPayAgeTo 子供料金無(終了年齢)
	 */
	public void setChildPayAgeTo(String childPayAgeTo) {
		this.childPayAgeTo = childPayAgeTo;
	}
	
}
