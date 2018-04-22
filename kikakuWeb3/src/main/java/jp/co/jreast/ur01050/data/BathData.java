package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * お風呂情報データクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class BathData {
	
	/**
	 * 企画回答連番 .
	 */
	private Long planAnsNo;

	/**
	 * 履歴番号 .
	 */
	private Integer careerNo;

	/**
	 * 風呂区分 .
	 */
	private Integer bathDiv;

	/**
	 * 風呂種別 .
	 */
	private Integer bathKind;

	/**
	 * 風呂有無 .
	 */
	private String bathFlg;

	/**
	 * 天然温泉・その他 .
	 */
	private Integer naturalSpa;

	/**
	 * 泉質 .
	 */
	private String spaQuality;

	/**
	 * 源泉温度 .
	 */
	private String spaTemp;

	/**
	 * 自家源泉有無 .
	 */
	private String selfSpringFlg;

	/**
	 * 共同源泉有無 .
	 */
	private String shareSpringFlg;

	/**
	 * 共同源泉名 .
	 */
	private String shareSpringNm;

	/**
	 * その他源泉コメント .
	 */
	private String otherSpringCmt;

	/**
	 * 湧出状態 .
	 */
	private String pourStatus;

	/**
	 * 湧出状態コメント .
	 */
	private String pourStatusCmt;

	/**
	 * 源泉かけ流し有無 .
	 */
	private String spaFlowFlg;

	/**
	 * 温泉循環式有無 .
	 */
	private String recircleKindFlg;

	/**
	 * 温泉加温有り有無 .
	 */
	private String warmingFlg;

	/**
	 * 源泉消毒有り有無 .
	 */
	private String disinfectFlg;

	/**
	 * 浴槽への湯量コントロール有無 .
	 */
	private String waterControlFlg;

	/**
	 * 湯色 .
	 */
	private String colour;

	/**
	 * 湯色コメント .
	 */
	private String colourCmt;

	/**
	 * 効能 .
	 */
	private String effect;

	/**
	 * 男性箇所数量 .
	 */
	private String maleSiteNum;

	/**
	 * 男性箇所名称 .
	 */
	private String maleSiteNm;

	/**
	 * 男性時間区分 .
	 */
	private String maleTimeDiv;

	/**
	 * 男性開始時間1：時間 .
	 */
	private String maleTimeFrom1Hour;
	
	/**
	 * 男性開始時間1：分 .
	 */
	private String maleTimeFrom1Minute;


	/**
	 * 男性終了時間1:時間 .
	 */
	private String maleTimeTo1Hour;
	
	/**
	 * 男性終了時間1:分 .
	 */
	private String maleTimeTo1Minute;

	/**
	 * 男性開始時間2：時間 .
	 */
	private String maleTimeFrom2Hour;
	
	/**
	 * 男性開始時間2：分 .
	 */
	private String maleTimeFrom2Minute;


	/**
	 * 男性終了時間2:時間 .
	 */
	private String maleTimeTo2Hour;
	
	/**
	 * 男性終了時間2:分 .
	 */
	private String maleTimeTo2Minute;

	/**
	 * 男性開始時間3：時間 .
	 */
	private String maleTimeFrom3Hour;
	
	/**
	 * 男性開始時間3：分 .
	 */
	private String maleTimeFrom3Minute;


	/**
	 * 男性終了時間3:時間 .
	 */
	private String maleTimeTo3Hour;
	
	/**
	 * 男性終了時間3:分 .
	 */
	private String maleTimeTo3Minute;

	/**
	 * 女性箇所数量 .
	 */
	private String femaleSiteNum;

	/**
	 * 女性箇所名称 .
	 */
	private String femaleSiteNm;

	/**
	 * 女性時間区分 .
	 */
	private String femaleTimeDiv;
	
	/**
	 * 女性開始時間１：時間 .
	 */
	private String femaleTimeFrom1Hour;
	
	/**
	 * 女性開始時間１：分 .
	 */
	private String femaleTimeFrom1Minute;

	/**
	 * 女性終了時間1:時間 .
	 */
	private String femaleTimeTo1Hour;
	
	/**
	 * 女性終了時間1:分 .
	 */
	private String femaleTimeTo1Minute;	
	
	/**
	 * 女性開始時間2：時間 .
	 */
	private String femaleTimeFrom2Hour;
	
	/**
	 * 女性開始時間2：分 .
	 */
	private String femaleTimeFrom2Minute;


	/**
	 * 女性終了時間2:時間 .
	 */
	private String femaleTimeTo2Hour;
	
	/**
	 * 女性終了時間2:分 .
	 */
	private String femaleTimeTo2Minute;
	
	/**
	 * 女性開始時間3：時間 .
	 */
	private String femaleTimeFrom3Hour;
	
	/**
	 * 女性開始時間3：分 .
	 */
	private String femaleTimeFrom3Minute;


	/**
	 * 女性終了時間3:時間 .
	 */
	private String femaleTimeTo3Hour;
	
	/**
	 * 女性終了時間3:分 .
	 */
	private String femaleTimeTo3Minute;
	
	/**
	 * 女性専用有無 .
	 */
	private String femaleOnlyFlg;

	/**
	 * 入れ替制有無 .
	 */
	private Integer shiftFlg;

	/**
	 * 賃切箇所数量 .
	 */
	private String rentalSiteNum;

	/**
	 * 賃切有料有無 .
	 */
	private String rentalPayFlg;

	/**
	 * 賃切時間 .
	 */
	private String rentalTime;

	/**
	 * 賃切料金 .
	 */
	private String rentalFees;

	/**
	 * 賃切予約区分 .
	 */
	private Integer rentalReserveDiv;

	/**
	 * @return 風呂区分
	 */
	public Integer getBathDiv() {
		return bathDiv;
	}

	/**
	 * @param bathDiv 風呂区分
	 */
	public void setBathDiv(Integer bathDiv) {
		this.bathDiv = bathDiv;
	}

	/**
	 * @return 風呂有無
	 */
	public String getBathFlg() {
		return bathFlg;
	}

	/**
	 * @param bathFlg 風呂有無
	 */
	public void setBathFlg(String bathFlg) {
		this.bathFlg = bathFlg;
	}

	/**
	 * @return 風呂種別
	 */
	public Integer getBathKind() {
		return bathKind;
	}

	/**
	 * @param bathKind 風呂種別
	 */
	public void setBathKind(Integer bathKind) {
		this.bathKind = bathKind;
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
	 * @return 湯色
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour 湯色
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return 湯色コメント
	 */
	public String getColourCmt() {
		return colourCmt;
	}

	/**
	 * @param colourCmt 湯色コメント
	 */
	public void setColourCmt(String colourCmt) {
		this.colourCmt = colourCmt;
	}

	/**
	 * @return 源泉消毒有り有無
	 */
	public String getDisinfectFlg() {
		return disinfectFlg;
	}

	/**
	 * @param disinfectFlg 源泉消毒有り有無
	 */
	public void setDisinfectFlg(String disinfectFlg) {
		this.disinfectFlg = disinfectFlg;
	}

	/**
	 * @return 効能
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * @param effect 効能
	 */
	public void setEffect(String effect) {
		this.effect = effect;
	}

	/**
	 * @return 女性箇所名称
	 */
	public String getFemaleSiteNm() {
		return femaleSiteNm;
	}

	/**
	 * @param femaleSiteNm 女性箇所名称
	 */
	public void setFemaleSiteNm(String femaleSiteNm) {
		this.femaleSiteNm = femaleSiteNm;
	}

	/**
	 * @return 女性箇所数量
	 */
	public String getFemaleSiteNum() {
		return femaleSiteNum;
	}

	/**
	 * @param femaleSiteNum 女性箇所数量
	 */
	public void setFemaleSiteNum(String femaleSiteNum) {
		this.femaleSiteNum = StringUtil.toHalf(femaleSiteNum);
	}

	/**
	 * @return 女性時間区分
	 */
	public String getFemaleTimeDiv() {
		return femaleTimeDiv;
	}

	/**
	 * @param femaleTimeDiv 女性時間区分
	 */
	public void setFemaleTimeDiv(String femaleTimeDiv) {
		this.femaleTimeDiv = femaleTimeDiv;
	}

	/**
	 * @return 女性開始時間１
	 */
	public String getFemaleTimeFrom1() {
		
		return KikakuWebUtil.buildTime(femaleTimeFrom1Hour, femaleTimeFrom1Minute);
	}

	/**
	 * 
	 * @param femaleTimeFrom1 女性開始時間１
	 */
	public void setFemaleTimeFrom1(String femaleTimeFrom1) {

		setFemaleTimeFrom1Hour(KikakuWebUtil.getHourFormTime(femaleTimeFrom1));
		setFemaleTimeFrom1Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeFrom1));
		
	}

	/**
	 * 
	 * @param femaleTimeFrom2 女性開始時間１
	 */
	public void setFemaleTimeFrom2(String femaleTimeFrom2) {

		setFemaleTimeFrom2Hour(KikakuWebUtil.getHourFormTime(femaleTimeFrom2));
		setFemaleTimeFrom2Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeFrom2));
	}

	/**
	 * 
	 * @param femaleTimeFrom3 女性開始時間１
	 */
	public void setFemaleTimeFrom3(String femaleTimeFrom3) {

		setFemaleTimeFrom3Hour(KikakuWebUtil.getHourFormTime(femaleTimeFrom3));
		setFemaleTimeFrom3Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeFrom3));
	}
	/**
	 * @return 女性開始時間２
	 */
	public String getFemaleTimeFrom2() {
		
		return KikakuWebUtil.buildTime(femaleTimeFrom2Hour, femaleTimeFrom2Minute);
	}

	/**
	 * @return 女性開始時間３
	 */
	public String getFemaleTimeFrom3() {
		
		return KikakuWebUtil.buildTime(femaleTimeFrom3Hour, femaleTimeFrom3Minute);
	}

	/**
	 * @return 女性終了時間１
	 */
	public String getFemaleTimeTo1() {
		
		return KikakuWebUtil.buildTime(femaleTimeTo1Hour, femaleTimeTo1Minute);
	}

	/**
	 * @return 女性終了時間２
	 */
	public String getFemaleTimeTo2() {
		
		return KikakuWebUtil.buildTime(femaleTimeTo2Hour, femaleTimeTo2Minute);
	}

	/**
	 * @return 女性終了時間３
	 */
	public String getFemaleTimeTo3() {
		
		return KikakuWebUtil.buildTime(femaleTimeTo3Hour, femaleTimeTo3Minute);
	}

	/**
	 * 
	 * @param femaleTimeTo1 女性終了時間1
	 */
	public void setFemaleTimeTo1(String femaleTimeTo1) {

		setFemaleTimeTo1Hour(KikakuWebUtil.getHourFormTime(femaleTimeTo1));
		setFemaleTimeTo1Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeTo1));
	}

	/**
	 * 
	 * @param femaleTimeTo2 女性終了時間2
	 */
	public void setFemaleTimeTo2(String femaleTimeTo2) {

		setFemaleTimeTo2Hour(KikakuWebUtil.getHourFormTime(femaleTimeTo2));
		setFemaleTimeTo2Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeTo2));
	}

	/**
	 * 
	 * @param femaleTimeTo3 女性終了時間３
	 */
	public void setFemaleTimeTo3(String femaleTimeTo3) {

		setFemaleTimeTo3Hour(KikakuWebUtil.getHourFormTime(femaleTimeTo3));
		setFemaleTimeTo3Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeTo3));
	}

	
	/**
	 * @return 男性箇所名称
	 */
	public String getMaleSiteNm() {
		return maleSiteNm;
	}

	/**
	 * @param maleSiteNm 男性箇所名称	
	 */
	public void setMaleSiteNm(String maleSiteNm) {
		this.maleSiteNm = maleSiteNm;
	}

	/**
	 * @return 男性箇所数量
	 */
	public String getMaleSiteNum() {
		return maleSiteNum;
	}

	/**
	 * @param maleSiteNum 男性箇所数量
	 */
	public void setMaleSiteNum(String maleSiteNum) {
		this.maleSiteNum = StringUtil.toHalf(maleSiteNum);
	}

	/**
	 * @return 男性時間区分
	 */
	public String getMaleTimeDiv() {
		return maleTimeDiv;
	}

	/**
	 * @param maleTimeDiv 男性時間区分
	 */
	public void setMaleTimeDiv(String maleTimeDiv) {
		this.maleTimeDiv = maleTimeDiv;
	}

	/**
	 * @return 男性開始時間１
	 */
	public String getMaleTimeFrom1() {

		return KikakuWebUtil.buildTime(maleTimeFrom1Hour, maleTimeFrom1Minute);
	}
	
	/**
	 * 
	 * @param maleTimeFrom1 男性開始時間１
	 */
	public void setMaleTimeFrom1(String maleTimeFrom1) {

		setMaleTimeFrom1Hour(KikakuWebUtil.getHourFormTime(maleTimeFrom1));
		setMaleTimeFrom1Minute(KikakuWebUtil.getMinuteFromTime(maleTimeFrom1));
	}

	/**
	 * 
	 * @param maleTimeFrom2 男性開始時間2
	 */
	public void setMaleTimeFrom2(String maleTimeFrom2) {

		setMaleTimeFrom2Hour(KikakuWebUtil.getHourFormTime(maleTimeFrom2));
		setMaleTimeFrom2Minute(KikakuWebUtil.getMinuteFromTime(maleTimeFrom2));
	}

	/**
	 * 
	 * @param maleTimeFrom3 男性開始時間3
	 */
	public void setMaleTimeFrom3(String maleTimeFrom3) {

		setMaleTimeFrom3Hour(KikakuWebUtil.getHourFormTime(maleTimeFrom3));
		setMaleTimeFrom3Minute(KikakuWebUtil.getMinuteFromTime(maleTimeFrom3));
	}
	
	/**
	 * @return 男性開始時間２
	 */
	public String getMaleTimeFrom2() {

		return KikakuWebUtil.buildTime(maleTimeFrom2Hour, maleTimeFrom2Minute);
	}

	/**
	 * @return 男性開始時間３
	 */
	public String getMaleTimeFrom3() {
		
		return KikakuWebUtil.buildTime(maleTimeFrom3Hour, maleTimeFrom3Minute);
	}

	/**
	 * @return 男性終了時間１
	 */
	public String getMaleTimeTo1() {
		
		return KikakuWebUtil.buildTime(maleTimeTo1Hour, maleTimeTo1Minute);
	}
	
	/**
	 * @return 男性終了時間２
	 */
	public String getMaleTimeTo2() {
		
		return KikakuWebUtil.buildTime(maleTimeTo2Hour, maleTimeTo2Minute);
	}

	/**
	 * @return 男性終了時間３
	 */
	public String getMaleTimeTo3() {
		
		return KikakuWebUtil.buildTime(maleTimeTo3Hour, maleTimeTo3Minute);
	}

	/**
	 * 
	 * @param maleTimeTo1 男性終了時間1
	 */
	public void setMaleTimeTo1(String maleTimeTo1) {

		setMaleTimeTo1Hour(KikakuWebUtil.getHourFormTime(maleTimeTo1));
		setMaleTimeTo1Minute(KikakuWebUtil.getMinuteFromTime(maleTimeTo1));
	}
	
	/**
	 * 
	 * @param maleTimeTo2 男性終了時間2
	 */
	public void setMaleTimeTo2(String maleTimeTo2) {

		setMaleTimeTo2Hour(KikakuWebUtil.getHourFormTime(maleTimeTo2));
		setMaleTimeTo2Minute(KikakuWebUtil.getMinuteFromTime(maleTimeTo2));
	}

	/**
	 * 
	 * @param maleTimeTo3 男性終了時間3
	 */
	public void setMaleTimeTo3(String maleTimeTo3) {

		setMaleTimeTo3Hour(KikakuWebUtil.getHourFormTime(maleTimeTo3));
		setMaleTimeTo3Minute(KikakuWebUtil.getMinuteFromTime(maleTimeTo3));
	}
	
	/**
	 * @return 天然温泉・その他
	 */
	public Integer getNaturalSpa() {
		return naturalSpa;
	}

	/**
	 * @param naturalSpa 天然温泉・その他
	 */
	public void setNaturalSpa(Integer naturalSpa) {
		this.naturalSpa = naturalSpa;
	}

	/**
	 * @return その他源泉コメント
	 */
	public String getOtherSpringCmt() {
		return otherSpringCmt;
	}

	/**
	 * @param otherSpringCmt その他源泉コメント
	 */
	public void setOtherSpringCmt(String otherSpringCmt) {
		this.otherSpringCmt = otherSpringCmt;
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
	 * @return 湧出状態
	 */
	public String getPourStatus() {
		return pourStatus;
	}

	/**
	 * @param pourStatus 湧出状態
	 */
	public void setPourStatus(String pourStatus) {
		this.pourStatus = pourStatus;
	}

	/**
	 * @return 湧出状態コメント
	 */
	public String getPourStatusCmt() {
		return pourStatusCmt;
	}

	/**
	 * @param pourStatusCmt 湧出状態コメント
	 */
	public void setPourStatusCmt(String pourStatusCmt) {
		this.pourStatusCmt = pourStatusCmt;
	}

	/**
	 * @return 温泉循環式有無
	 */
	public String getRecircleKindFlg() {
		return recircleKindFlg;
	}

	/**
	 * @param recircleKindFlg 温泉循環式有無
	 */
	public void setRecircleKindFlg(String recircleKindFlg) {
		this.recircleKindFlg = recircleKindFlg;
	}

	/**
	 * @return 賃切料金
	 */
	public String getRentalFees() {
		return rentalFees;
	}

	/**
	 * @param rentalFees 賃切料金
	 */
	public void setRentalFees(String rentalFees) {
		this.rentalFees = StringUtil.toHalf(rentalFees);
	}

	/**
	 * @return 賃切有料有無	
	 */
	public String getRentalPayFlg() {
		return rentalPayFlg;
	}

	/**
	 * @param rentalPayFlg 賃切有料有無	
	 */
	public void setRentalPayFlg(String rentalPayFlg) {
		this.rentalPayFlg = rentalPayFlg;
	}

	/**
	 * @return 賃切予約区分
	 */
	public Integer getRentalReserveDiv() {
		return rentalReserveDiv;
	}

	/**
	 * @param rentalReserveDiv 賃切予約区分
	 */
	public void setRentalReserveDiv(Integer rentalReserveDiv) {
		this.rentalReserveDiv = rentalReserveDiv;
	}

	/**
	 * @return 賃切箇所数量
	 */
	public String getRentalSiteNum() {
		return rentalSiteNum;
	}

	/**
	 * @param rentalSiteNum 賃切箇所数量
	 */
	public void setRentalSiteNum(String rentalSiteNum) {
		this.rentalSiteNum = StringUtil.toHalf(rentalSiteNum);
	}

	/**
	 * @return 賃切時間
	 */
	public String getRentalTime() {
		return rentalTime;
	}

	/**
	 * @param rentalTime 賃切時間
	 */
	public void setRentalTime(String rentalTime) {
		this.rentalTime = StringUtil.toHalf(rentalTime);
	}

	/**
	 * @return 自家源泉有無
	 */
	public String getSelfSpringFlg() {
		return selfSpringFlg;
	}

	/**
	 * @param selfSpringFlg 自家源泉有無
	 */
	public void setSelfSpringFlg(String selfSpringFlg) {
		this.selfSpringFlg = selfSpringFlg;
	}

	/**
	 * @return 共同源泉有無
	 */
	public String getShareSpringFlg() {
		return shareSpringFlg;
	}

	/**
	 * @param shareSpringFlg 共同源泉有無
	 */
	public void setShareSpringFlg(String shareSpringFlg) {
		this.shareSpringFlg = shareSpringFlg;
	}

	/**
	 * @return 共同源泉名
	 */
	public String getShareSpringNm() {
		return shareSpringNm;
	}

	/**
	 * @param shareSpringNm 共同源泉名
	 */
	public void setShareSpringNm(String shareSpringNm) {
		this.shareSpringNm = shareSpringNm;
	}

	/**
	 * @return 入れ替制有無	
	 */
	public Integer getShiftFlg() {
		return shiftFlg;
	}

	/**
	 * @param shiftFlg 入れ替制有無	
	 */
	public void setShiftFlg(Integer shiftFlg) {
		this.shiftFlg = shiftFlg;
	}

	/**
	 * @return 源泉かけ流し有無
	 */
	public String getSpaFlowFlg() {
		return spaFlowFlg;
	}

	/**
	 * @param spaFlowFlg 源泉かけ流し有無
	 */
	public void setSpaFlowFlg(String spaFlowFlg) {
		this.spaFlowFlg = spaFlowFlg;
	}

	/**
	 * @return 泉質
	 */
	public String getSpaQuality() {
		return spaQuality;
	}

	/**
	 * @param spaQuality 泉質
	 */
	public void setSpaQuality(String spaQuality) {
		this.spaQuality = StringUtil.toHalf(spaQuality);
	}

	/**
	 * @return 源泉温度
	 */
	public String getSpaTemp() {
		return spaTemp;
	}

	/**
	 * @param spaTemp 源泉温度
	 */
	public void setSpaTemp(String spaTemp) {
		this.spaTemp = StringUtil.toHalf(spaTemp);
	}

	/**
	 * @return 温泉加温有り有無
	 */
	public String getWarmingFlg() {
		return warmingFlg;
	}

	/**
	 * @param warmingFlg 温泉加温有り有無
	 */
	public void setWarmingFlg(String warmingFlg) {
		this.warmingFlg = warmingFlg;
	}

	/**
	 * @return 浴槽への湯量コントロール有無
	 */
	public String getWaterControlFlg() {
		return waterControlFlg;
	}

	/**
	 * @param waterControlFlg 浴槽への湯量コントロール有無	
	 */
	public void setWaterControlFlg(String waterControlFlg) {
		this.waterControlFlg = waterControlFlg;
	}

	/**
	 * @return maleTimeFrom1Hour　男性開始時間1：時間
	 */
	public String getMaleTimeFrom1Hour() {
		return maleTimeFrom1Hour;
	}

	/**
	 * @param maleTimeFrom1Hour 男性開始時間1：時間
	 */
	public void setMaleTimeFrom1Hour(String maleTimeFrom1Hour) {
		this.maleTimeFrom1Hour = StringUtil.toHalf(maleTimeFrom1Hour);
	}

	/**
	 * @return maleTimeFrom1Minute 男性開始時間1：分
	 */
	public String getMaleTimeFrom1Minute() {
		return maleTimeFrom1Minute;
	}

	/**
	 * @param maleTimeFrom1Minute 男性開始時間1：分
	 */
	public void setMaleTimeFrom1Minute(String maleTimeFrom1Minute) {
		this.maleTimeFrom1Minute = StringUtil.toHalf(maleTimeFrom1Minute);
	}

	/**
	 * @return maleTimeTo1Hour 男性終了時間1:時間
	 */
	public String getMaleTimeTo1Hour() {
		return maleTimeTo1Hour;
	}

	/**
	 * @param maleTimeTo1Hour 男性終了時間1:時間
	 */
	public void setMaleTimeTo1Hour(String maleTimeTo1Hour) {
		this.maleTimeTo1Hour = StringUtil.toHalf(maleTimeTo1Hour);
	}

	/**
	 * @return maleTimeTo1Minute 男性終了時間1:分
	 */
	public String getMaleTimeTo1Minute() {
		return maleTimeTo1Minute;
	}

	/**
	 * @param maleTimeTo1Minute 男性終了時間1:分
	 */
	public void setMaleTimeTo1Minute(String maleTimeTo1Minute) {
		this.maleTimeTo1Minute = StringUtil.toHalf(maleTimeTo1Minute);
	}

	/**
	 * @return maleTimeFrom2Hour 男性開始時間2：時間
	 */
	public String getMaleTimeFrom2Hour() {
		return maleTimeFrom2Hour;
	}

	/**
	 * @param maleTimeFrom2Hour 男性開始時間2：時間
	 */
	public void setMaleTimeFrom2Hour(String maleTimeFrom2Hour) {
		this.maleTimeFrom2Hour = StringUtil.toHalf(maleTimeFrom2Hour);
	}

	/**
	 * @return maleTimeFrom2Minute 男性開始時間2：分
	 */
	public String getMaleTimeFrom2Minute() {
		return maleTimeFrom2Minute;
	}

	/**
	 * @param maleTimeFrom2Minute 男性開始時間2：分
	 */
	public void setMaleTimeFrom2Minute(String maleTimeFrom2Minute) {
		this.maleTimeFrom2Minute = StringUtil.toHalf(maleTimeFrom2Minute);
	}

	/**
	 * @return maleTimeTo2Hour 男性終了時間2:時間
	 */
	public String getMaleTimeTo2Hour() {
		return maleTimeTo2Hour;
	}

	/**
	 * @param maleTimeTo2Hour 男性終了時間2:時間
	 */
	public void setMaleTimeTo2Hour(String maleTimeTo2Hour) {
		this.maleTimeTo2Hour = StringUtil.toHalf(maleTimeTo2Hour);
	}

	/**
	 * @return maleTimeTo2Minute 男性終了時間2:分
	 */
	public String getMaleTimeTo2Minute() {
		return maleTimeTo2Minute;
	}

	/**
	 * @param maleTimeTo2Minute 男性終了時間2:分
	 */
	public void setMaleTimeTo2Minute(String maleTimeTo2Minute) {
		this.maleTimeTo2Minute = StringUtil.toHalf(maleTimeTo2Minute);
	}

	/**
	 * @return maleTimeFrom3Hour 男性開始時間3：時間
	 */
	public String getMaleTimeFrom3Hour() {
		return maleTimeFrom3Hour;
	}

	/**
	 * @param maleTimeFrom3Hour 男性開始時間3：時間
	 */
	public void setMaleTimeFrom3Hour(String maleTimeFrom3Hour) {
		this.maleTimeFrom3Hour = StringUtil.toHalf(maleTimeFrom3Hour);
	}

	/**
	 * @return maleTimeFrom3Minute 男性開始時間3：分
	 */
	public String getMaleTimeFrom3Minute() {
		return maleTimeFrom3Minute;
	}

	/**
	 * @param maleTimeFrom3Minute 男性開始時間3：分
	 */
	public void setMaleTimeFrom3Minute(String maleTimeFrom3Minute) {
		this.maleTimeFrom3Minute = StringUtil.toHalf(maleTimeFrom3Minute);
	}

	/**
	 * @return maleTimeTo3Hour 男性終了時間3:時間
	 */
	public String getMaleTimeTo3Hour() {
		return maleTimeTo3Hour;
	}

	/**
	 * @param maleTimeTo3Hour 男性終了時間3:時間
	 */
	public void setMaleTimeTo3Hour(String maleTimeTo3Hour) {
		this.maleTimeTo3Hour = StringUtil.toHalf(maleTimeTo3Hour);
	}

	/**
	 * @return maleTimeTo3Minute 男性終了時間3:分
	 */
	public String getMaleTimeTo3Minute() {
		return maleTimeTo3Minute;
	}

	/**
	 * @param maleTimeTo3Minute 男性終了時間3:分
	 */
	public void setMaleTimeTo3Minute(String maleTimeTo3Minute) {
		this.maleTimeTo3Minute = StringUtil.toHalf(maleTimeTo3Minute);
	}

	/**
	 * @return femaleTimeFrom1Hour Minute女性開始時間1：時間
	 */
	public String getFemaleTimeFrom1Hour() {
		return femaleTimeFrom1Hour;
	}

	/**
	 * @param femaleTimeFrom1Hour Minute女性開始時間1：時間
	 */
	public void setFemaleTimeFrom1Hour(String femaleTimeFrom1Hour) {
		this.femaleTimeFrom1Hour = StringUtil.toHalf(femaleTimeFrom1Hour);
	}

	/**
	 * @return femaleTimeFrom1Minute Minute女性開始時間1：分
	 */
	public String getFemaleTimeFrom1Minute() {
		return femaleTimeFrom1Minute;
	}

	/**
	 * @param femaleTimeFrom1Minute Minute女性開始時間1：分
	 */
	public void setFemaleTimeFrom1Minute(String femaleTimeFrom1Minute) {
		this.femaleTimeFrom1Minute = StringUtil.toHalf(femaleTimeFrom1Minute);
	}

	/**
	 * @return femaleTimeFrom2Hour 女性開始時間2：時間
	 */
	public String getFemaleTimeFrom2Hour() {
		return femaleTimeFrom2Hour;
	}

	/**
	 * @param femaleTimeFrom2Hour 女性開始時間2：時間
	 */
	public void setFemaleTimeFrom2Hour(String femaleTimeFrom2Hour) {
		this.femaleTimeFrom2Hour = StringUtil.toHalf(femaleTimeFrom2Hour);
	}

	/**
	 * @return femaleTimeFrom2 Minute女性開始時間2：分
	 */
	public String getFemaleTimeFrom2Minute() {
		return femaleTimeFrom2Minute;
	}

	/**
	 * @param femaleTimeFrom2Minute 女性開始時間2：分
	 */
	public void setFemaleTimeFrom2Minute(String femaleTimeFrom2Minute) {
		this.femaleTimeFrom2Minute = StringUtil.toHalf(femaleTimeFrom2Minute);
	}

	/**
	 * @return femaleTimeFrom3Hour 女性開始時間3：時間
	 */
	public String getFemaleTimeFrom3Hour() {
		return femaleTimeFrom3Hour;
	}

	/**
	 * @param femaleTimeFrom3Hour 女性開始時間3：時間
	 */
	public void setFemaleTimeFrom3Hour(String femaleTimeFrom3Hour) {
		this.femaleTimeFrom3Hour = StringUtil.toHalf(femaleTimeFrom3Hour);
	}

	/**
	 * @return RfemaleTimeFrom3Minute 女性開始時間3：分
	 */
	public String getFemaleTimeFrom3Minute() {
		return femaleTimeFrom3Minute;
	}

	/**
	 * @param femaleTimeFrom3Minute 女性開始時間3：分
	 */
	public void setFemaleTimeFrom3Minute(String femaleTimeFrom3Minute) {
		this.femaleTimeFrom3Minute = StringUtil.toHalf(femaleTimeFrom3Minute);
	}

	/**
	 * @return femaleTimeTo1Hour 女性終了時間1:時間
	 */
	public String getFemaleTimeTo1Hour() {
		return femaleTimeTo1Hour;
	}

	/**
	 * @param femaleTimeTo1Hour 女性終了時間1:時間
	 */
	public void setFemaleTimeTo1Hour(String femaleTimeTo1Hour) {
		this.femaleTimeTo1Hour = StringUtil.toHalf(femaleTimeTo1Hour);
	}

	/**
	 * @return femaleTimeTo1Minute 女性終了時間1:分
	 */
	public String getFemaleTimeTo1Minute() {
		return femaleTimeTo1Minute;
	}

	/**
	 * @param femaleTimeTo1Minute 女性終了時間1:分
	 */
	public void setFemaleTimeTo1Minute(String femaleTimeTo1Minute) {
		this.femaleTimeTo1Minute = StringUtil.toHalf(femaleTimeTo1Minute);
	}

	/**
	 * @return femaleTimeTo2Hour 女性終了時間2:時間
	 */
	public String getFemaleTimeTo2Hour() {
		return femaleTimeTo2Hour;
	}

	/**
	 * @param femaleTimeTo2Hour 女性終了時間2:時間
	 */
	public void setFemaleTimeTo2Hour(String femaleTimeTo2Hour) {
		this.femaleTimeTo2Hour = StringUtil.toHalf(femaleTimeTo2Hour);
	}

	/**
	 * @return femaleTimeTo2Minute 女性終了時間2:分
	 */
	public String getFemaleTimeTo2Minute() {
		return femaleTimeTo2Minute;
	}

	/**
	 * @param femaleTimeTo2Minute 女性終了時間2:分
	 */
	public void setFemaleTimeTo2Minute(String femaleTimeTo2Minute) {
		this.femaleTimeTo2Minute = StringUtil.toHalf(femaleTimeTo2Minute);
	}

	/**
	 * @return femaleTimeTo3Hour 女性終了時間3:時間
	 */
	public String getFemaleTimeTo3Hour() {
		return femaleTimeTo3Hour;
	}

	/**
	 * @param femaleTimeTo3Hour 女性終了時間3:時間
	 */
	public void setFemaleTimeTo3Hour(String femaleTimeTo3Hour) {
		this.femaleTimeTo3Hour = StringUtil.toHalf(femaleTimeTo3Hour);
	}

	/**
	 * @return femaleTimeTo3Minute　女性終了時間3:分
	 */
	public String getFemaleTimeTo3Minute() {
		return femaleTimeTo3Minute;
	}

	/**
	 * @param femaleTimeTo3Minute 女性終了時間3:分
	 */
	public void setFemaleTimeTo3Minute(String femaleTimeTo3Minute) {
		this.femaleTimeTo3Minute = StringUtil.toHalf(femaleTimeTo3Minute);
	}

	/**
	 * @return femaleOnlyFlg 女性専用有無
	 */
	public String getFemaleOnlyFlg() {
		return femaleOnlyFlg;
	}

	/**
	 * @param femaleOnlyFlg 女性専用有無
	 */
	public void setFemaleOnlyFlg(String femaleOnlyFlg) {
		this.femaleOnlyFlg = femaleOnlyFlg;
	}
}
