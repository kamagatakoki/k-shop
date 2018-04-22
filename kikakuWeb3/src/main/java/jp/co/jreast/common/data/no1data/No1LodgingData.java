package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;

import jp.co.jreast.common.data.PlanAnsBaseData;


/**
 * <pre>
 *  NO1_宿泊データクラス。.
 *  機能概要    ：  NO1_宿泊データを格納する。
 *  特記事項    ：  無し
 * </pre>
 * 
 * @author hu
 * @version 0.1 2006/10/27
 */
public class No1LodgingData extends PlanAnsBaseData implements INo1CommonData {
	
	/**
	 * @return 手数料の表示形式を取得.
	 */
	public String getDealFeeDisplay() {
		
		return null;
	}
	/**
	 * 商品区分 .
	 */
	private Integer goodsDiv;

	/**
	 * 施設郵便番号 .
	 */
	private String facilityPostCd;

	/**
	 * 施設住所 .
	 */
	private String facilityAddr;

	/**
	 * 施設電話 .
	 */
	private String facilityTel;

	/**
	 * 施設ファックス .
	 */
	private String facilityFax;

	/**
	 * パソコン .
	 */
	private String terminalNo;

	/**
	 * 提供期間開始年月日 .
	 */
	private String termFromYmd;

	/**
	 * 提供期間終了年月日 .
	 */
	private String termEndYmd;

	/**
	 * 手仕舞日 .
	 */
	private String liquidateDay;

	/**
	 * 連泊割引金額（大人） .
	 */
	private String stayDisCountAdlt;

	/**
	 * 連泊割引金額（小人） .
	 */
	private String stayDisCountChild;

	/**
	 * 東京都宿泊税有無 .
	 */
	private Integer tyoStayTaxFlg;

	/**
	 * 料金条件コード .
	 */
	private Integer feeCondCd;

	/**
	 * 食事条件コード .
	 */
	private Integer mealCondCd;

	/**
	 * 入湯税有無 .
	 */
	private String spaTaxFlg;

	/**
	 * 入湯税（大人） .
	 */
	private String spaTaxAdlt;

	/**
	 * 入湯税（小人） .
	 */
	private String spaTaxChild;

	/**
	 * 販売手数料 .
	 */
	private String saleTax;

	/**
	 * 備考 .
	 */
	private String memo;

	/**
	 * 除外日 .
	 */
	private String exceptDate;

	/**
	 * チェックイン時間 .
	 */
	private String checkIn;

	/**
	 * チェックアウト時間 .
	 */
	private String checkOut;

	/**
	 * チェックイン時間（通常） .
	 */
	private String checkInNor;

	/**
	 * チェックアウト時間（通常） .
	 */
	private String checkOutNor;

	/**
	 * 緊急連絡先会社名称（平日） .
	 */
	private String emenComOrd;

	/**
	 * 緊急連絡先担当者（平日） .
	 */
	private String emenPersonOrd;

	/**
	 * 緊急連絡先電話番号（平日） .
	 */
	private String emenTelOrd;

	/**
	 * 緊急連絡先会社名称（土日） .
	 */
	private String emenComWk;

	/**
	 * 緊急連絡先担当者（土日） .
	 */
	private String emenPersonWk;

	/**
	 * 緊急連絡先電話番号（土日） .
	 */
	private String emenTelWk;

	/**
	 * 緊急連絡先備考 .
	 */
	private String emenAddrMemo;

	/**
	 * チェックイン時間 時 .
	 */
	private String checkInH;

	/**
	 * チェックイン時間 分 .
	 */
	private String checkInM;

	/**
	 * チェックイン時間（通常） 時 .
	 */
	private String checkInNorH;

	/**
	 * チェックイン時間（通常） 分 .
	 */
	private String checkInNorM;

	/**
	 * チェックアウト時間 時 .
	 */
	private String checkOutH;

	/**
	 * チェックアウト時間 分 .
	 */
	private String checkOutM;

	/**
	 * チェックアウト時間（通常） 時 .
	 */
	private String checkOutNorH;

	/**
	 * チェックアウト時間（通常） 分 .
	 */
	private String checkOutNorM;

	/**
	 * 提供期間終了日 .
	 */
	private String termEndD;

	/**
	 * 提供期間終了月 .
	 */
	private String termEndM;

	/**
	 * 提供期間終了年 .
	 */
	private String termEndY;

	/**
	 * 提供期間開始日 .
	 */
	private String termFromD;

	/**
	 * 提供期間開始月 .
	 */
	private String termFromM;

	/**
	 * 提供期間開始年 .
	 */
	private String termFromY;

	/**
	 * @return チェックイン時間.
	 */
	public String getCheckIn() {
		return checkIn;
	}

	/**
	 * @param checkIn
	 *            チェックイン時間.
	 */
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	/**
	 * @return チェックイン時間（通常）.
	 */
	public String getCheckInNor() {
		return checkInNor;
	}

	/**
	 * @param checkInNor
	 *            チェックイン時間（通常）.
	 */
	public void setCheckInNor(String checkInNor) {
		this.checkInNor = checkInNor;
	}

	/**
	 * @return チェックアウト時間.
	 */
	public String getCheckOut() {
		return checkOut;
	}

	/**
	 * @param checkOut
	 *            チェックアウト時間.
	 */
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	/**
	 * @return チェックアウト時間（通常）.
	 */
	public String getCheckOutNor() {
		return checkOutNor;
	}

	/**
	 * @param checkOutNor
	 *            チェックアウト時間（通常）.
	 */
	public void setCheckOutNor(String checkOutNor) {
		this.checkOutNor = checkOutNor;
	}

	/**
	 * @return 緊急連絡先備考.
	 */
	public String getEmenAddrMemo() {
		return emenAddrMemo;
	}

	/**
	 * @param emenAddrMemo
	 *            緊急連絡先備考.
	 */
	public void setEmenAddrMemo(String emenAddrMemo) {
		this.emenAddrMemo = emenAddrMemo;
	}

	/**
	 * @return 緊急連絡先会社名称（平日）.
	 */
	public String getEmenComOrd() {
		return emenComOrd;
	}

	/**
	 * @param emenComOrd
	 *            緊急連絡先会社名称（平日）.
	 */
	public void setEmenComOrd(String emenComOrd) {
		this.emenComOrd = emenComOrd;
	}

	/**
	 * @return 緊急連絡先会社名称（土日）.
	 */
	public String getEmenComWk() {
		return emenComWk;
	}

	/**
	 * @param emenComWk
	 *            緊急連絡先会社名称（土日）.
	 */
	public void setEmenComWk(String emenComWk) {
		this.emenComWk = emenComWk;
	}

	/**
	 * @return 緊急連絡先担当者（平日）.
	 */
	public String getEmenPersonOrd() {
		return emenPersonOrd;
	}

	/**
	 * @param emenPersonOrd
	 *            緊急連絡先担当者（平日）.
	 */
	public void setEmenPersonOrd(String emenPersonOrd) {
		this.emenPersonOrd = emenPersonOrd;
	}

	/**
	 * @return 緊急連絡先担当者（土日）.
	 */
	public String getEmenPersonWk() {
		return emenPersonWk;
	}

	/**
	 * @param emenPersonWk
	 *            緊急連絡先担当者（土日）.
	 */
	public void setEmenPersonWk(String emenPersonWk) {
		this.emenPersonWk = emenPersonWk;
	}

	/**
	 * @return 緊急連絡先電話番号（平日）.
	 */
	public String getEmenTelOrd() {
		return emenTelOrd;
	}

	/**
	 * @param emenTelOrd
	 *            緊急連絡先電話番号（平日）.
	 */
	public void setEmenTelOrd(String emenTelOrd) {
		this.emenTelOrd = emenTelOrd;
	}

	/**
	 * @return 緊急連絡先電話番号（土日）.
	 */
	public String getEmenTelWk() {
		return emenTelWk;
	}

	/**
	 * @param emenTelWk
	 *            緊急連絡先電話番号（土日）.
	 */
	public void setEmenTelWk(String emenTelWk) {
		this.emenTelWk = emenTelWk;
	}

	/**
	 * @return 除外日.
	 */
	public String getExceptDate() {
		return exceptDate;
	}

	/**
	 * @param exceptDate
	 *            除外日.
	 */
	public void setExceptDate(String exceptDate) {
		this.exceptDate = exceptDate;
	}

	/**
	 * @return 施設住所.
	 */
	public String getFacilityAddr() {
		return facilityAddr;
	}

	/**
	 * @param facilityAddr
	 *            施設住所.
	 */
	public void setFacilityAddr(String facilityAddr) {
		this.facilityAddr = facilityAddr;
	}

	/**
	 * @return 施設ファックス.
	 */
	public String getFacilityFax() {
		return facilityFax == null ? "" : facilityFax.trim();
	}

	/**
	 * @param facilityFax
	 *            施設ファックス.
	 */
	public void setFacilityFax(String facilityFax) {
		this.facilityFax = facilityFax;
	}

	/**
	 * @return 施設郵便番号.
	 */
	public String getFacilityPostCd() {
		return facilityPostCd;
	}

	/**
	 * @param facilityPostCd
	 *            施設郵便番号.
	 */
	public void setFacilityPostCd(String facilityPostCd) {
		this.facilityPostCd = facilityPostCd;
	}

	/**
	 * @return 施設電話.
	 */
	public String getFacilityTel() {
		return facilityTel == null ? "" : facilityTel.trim();
	}

	/**
	 * @param facilityTel
	 *            施設電話.
	 */
	public void setFacilityTel(String facilityTel) {
		this.facilityTel = facilityTel;
	}

	/**
	 * @return 料金条件コード.
	 */
	public Integer getFeeCondCd() {
		return feeCondCd;
	}

	/**
	 * @param feeCondCd
	 *            料金条件コード.
	 */
	public void setFeeCondCd(Integer feeCondCd) {
		this.feeCondCd = feeCondCd;
	}

	/**
	 * @return 商品区分.
	 */
	public Integer getGoodsDiv() {
		return goodsDiv;
	}

	/**
	 * @param goodsDiv
	 *            商品区分.
	 */
	public void setGoodsDiv(Integer goodsDiv) {
		this.goodsDiv = goodsDiv;
	}

	/**
	 * @return 手仕舞日.
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}

	/**
	 * @param liquidateDay
	 *            手仕舞日.
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = StringUtil.toHalf(liquidateDay);
	}

	/**
	 * @return 食事条件コード.
	 */
	public Integer getMealCondCd() {
		return mealCondCd;
	}

	/**
	 * @param mealCondCd
	 *            食事条件コード.
	 */
	public void setMealCondCd(Integer mealCondCd) {
		this.mealCondCd = mealCondCd;
	}

	/**
	 * @return 備考.
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo
	 *            備考.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return 販売手数料.
	 */
	public String getSaleTax() {
		return saleTax;
	}

	/**
	 * @param saleTax
	 *            販売手数料.
	 */
	public void setSaleTax(String saleTax) {
		this.saleTax = saleTax;
	}

	/**
	 * @return 入湯税（大人）.
	 */
	public String getSpaTaxAdlt() {
		return spaTaxAdlt;
	}

	/**
	 * @param spaTaxAdlt
	 *            入湯税（大人）.
	 */
	public void setSpaTaxAdlt(String spaTaxAdlt) {
		this.spaTaxAdlt = spaTaxAdlt;
	}

	/**
	 * @return 入湯税（小人）.
	 */
	public String getSpaTaxChild() {
		return spaTaxChild;
	}

	/**
	 * @param spaTaxChild
	 *            入湯税（小人）.
	 */
	public void setSpaTaxChild(String spaTaxChild) {
		this.spaTaxChild = spaTaxChild;
	}

	/**
	 * @return 入湯税有無.
	 */
	public String getSpaTaxFlg() {
		return spaTaxFlg;
	}

	/**
	 * @param spaTaxFlg
	 *            入湯税有無.
	 */
	public void setSpaTaxFlg(String spaTaxFlg) {
		this.spaTaxFlg = spaTaxFlg;
	}

	/**
	 * @return 連泊割引金額（大人）.
	 */
	public String getStayDisCountAdlt() {
		return stayDisCountAdlt;
	}

	/**
	 * @param stayDisCountAdlt
	 *            連泊割引金額（大人）.
	 */
	public void setStayDisCountAdlt(String stayDisCountAdlt) {
		this.stayDisCountAdlt = StringUtil.toHalf(stayDisCountAdlt);
	}

	/**
	 * @return 連泊割引金額（小人）.
	 */
	public String getStayDisCountChild() {
		return stayDisCountChild;
	}

	/**
	 * @param stayDisCountChild
	 *            連泊割引金額（小人）.
	 */
	public void setStayDisCountChild(String stayDisCountChild) {
		this.stayDisCountChild = StringUtil.toHalf(stayDisCountChild);
	}

	/**
	 * @return 提供期間終了年月日.
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}

	/**
	 * @param termEndYmd
	 *            提供期間終了年月日.
	 */
	public void setTermEndYmd(String termEndYmd) {
		this.termEndYmd = termEndYmd;
	}

	/**
	 * @return 提供期間開始年月日.
	 */
	public String getTermFromYmd() {
		return termFromYmd;
	}

	/**
	 * @param termFromYmd
	 *            提供期間開始年月日.
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
	}

	/**
	 * @return パソコン.
	 */
	public String getTerminalNo() {
		return terminalNo;
	}

	/**
	 * @param terminalNo
	 *            パソコン.
	 */
	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
	}

	/**
	 * @return 東京都宿泊税有無.
	 */
	public Integer getTyoStayTaxFlg() {
		return tyoStayTaxFlg;
	}

	/**
	 * @param tyoStayTaxFlg
	 *            東京都宿泊税有無.
	 */
	public void setTyoStayTaxFlg(Integer tyoStayTaxFlg) {
		this.tyoStayTaxFlg = tyoStayTaxFlg;
	}

	/**
	 * @return チェックイン時間 時
	 */
	public String getCheckInH() {
		return checkInH;
	}

	/**
	 * @return チェックイン時間 分
	 */
	public String getCheckInM() {
		return checkInM;
	}

	/**
	 * @return チェックイン時間（通常） 時
	 */
	public String getCheckInNorH() {
		return checkInNorH;
	}

	/**
	 * @return チェックイン時間（通常） 分
	 */
	public String getCheckInNorM() {
		return checkInNorM;
	}

	/**
	 * @return チェックアウト時間 時
	 */
	public String getCheckOutH() {
		return checkOutH;
	}

	/**
	 * @return チェックアウト時間 分
	 */
	public String getCheckOutM() {
		return checkOutM;
	}

	/**
	 * @return チェックアウト時間（通常） 時
	 */
	public String getCheckOutNorH() {
		return checkOutNorH;
	}

	/**
	 * @return チェックアウト時間（通常） 分
	 */
	public String getCheckOutNorM() {
		return checkOutNorM;
	}

	/**
	 * @return 提供期間終了日
	 */
	public String getTermEndD() {
		return termEndD;
	}

	/**
	 * @return 提供期間終了月
	 */
	public String getTermEndM() {
		return termEndM;
	}

	/**
	 * @return 提供期間終了年
	 */
	public String getTermEndY() {
		return termEndY;
	}

	/**
	 * @return 提供期間開始日
	 */
	public String getTermFromD() {
		return termFromD;
	}

	/**
	 * @return 提供期間開始月
	 */
	public String getTermFromM() {
		return termFromM;
	}

	/**
	 * @return 提供期間開始年
	 */
	public String getTermFromY() {
		return termFromY;
	}

	/**
	 * @param checkInH
	 *            チェックイン時間 時
	 */
	public void setCheckInH(String checkInH) {
		this.checkInH = StringUtil.toHalf(checkInH);
	}

	/**
	 * @param checkInM
	 *            チェックイン時間 分
	 */
	public void setCheckInM(String checkInM) {
		this.checkInM = StringUtil.toHalf(checkInM);
	}

	/**
	 * @param checkInNorH
	 *            チェックイン時間（通常） 時
	 */
	public void setCheckInNorH(String checkInNorH) {
		this.checkInNorH = StringUtil.toHalf(checkInNorH);
	}

	/**
	 * @param checkInNorM
	 *            チェックイン時間（通常） 分
	 */
	public void setCheckInNorM(String checkInNorM) {
		this.checkInNorM = StringUtil.toHalf(checkInNorM);
	}

	/**
	 * @param checkOutH
	 *            チェックアウト時間 時
	 */
	public void setCheckOutH(String checkOutH) {
		this.checkOutH = StringUtil.toHalf(checkOutH);
	}

	/**
	 * @param checkOutM
	 *            チェックアウト時間 分
	 */
	public void setCheckOutM(String checkOutM) {
		this.checkOutM = StringUtil.toHalf(checkOutM);
	}

	/**
	 * @param checkOutNorH
	 *            チェックアウト時間（通常） 時
	 */
	public void setCheckOutNorH(String checkOutNorH) {
		this.checkOutNorH = StringUtil.toHalf(checkOutNorH);
	}

	/**
	 * @param checkOutNorM
	 *            チェックアウト時間（通常） 分
	 */
	public void setCheckOutNorM(String checkOutNorM) {
		this.checkOutNorM = StringUtil.toHalf(checkOutNorM);
	}

	/**
	 * @param termEndD
	 *            提供期間終了日
	 */
	public void setTermEndD(String termEndD) {
		this.termEndD = StringUtil.toHalf(termEndD);
	}

	/**
	 * @param termEndM
	 *            提供期間終了月
	 */
	public void setTermEndM(String termEndM) {
		this.termEndM = StringUtil.toHalf(termEndM);
	}

	/**
	 * @param termEndY
	 *            提供期間終了年
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = StringUtil.toHalf(termEndY);
	}

	/**
	 * @param termFromD
	 *            提供期間開始日
	 */
	public void setTermFromD(String termFromD) {
		this.termFromD = StringUtil.toHalf(termFromD);
	}

	/**
	 * @param termFromM
	 *            提供期間開始月
	 */
	public void setTermFromM(String termFromM) {
		this.termFromM = StringUtil.toHalf(termFromM);
	}

	/**
	 * @param termFromY
	 *            提供期間開始年
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = StringUtil.toHalf(termFromY);
	}

}
