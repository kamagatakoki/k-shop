package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 *  NO1_リフトデータクラス。.
 *  機能概要    ：  NO1_リフトデータクラス
 *  特記事項    ：  無し
 * </pre>
 * 
 * @author 忻 兆君
 * @version 0.1 2006/11/27
 */
public class No1LiftData extends PlanAnsBaseData implements INo1CommonData {
	/**
	 * 手数料の表示数字を取得.
	 * @return 手数料(かんまつき)
	 */
	public String getDealFeeDisplay() {
		if (!StringUtil.isEmpty(dealFee) 
				&& !StringUtil.isEmpty(getDealFeeType())
				&& JreConstants.DEAL_FEE_YEN_VALUE.equals(getDealFeeType())) {
			return KikakuWebUtil.formatCharge(dealFee);
		}
		return dealFee;
	}
	/**
	 * 在庫番号 .
	 */
	private String stockNo;

	/**
	 * 代表者名 .
	 */
	private String ownerNm;

	/**
	 * 郵便番号 .
	 */
	private String postcode;

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
	 * 提供期間開始年 .
	 */
	private String termFromY;
	
	/**
	 * 提供期間開始月 .
	 */
	private String termFromM;
	
	/**
	 * 提供期間開始日 .
	 */
	private String termFromD;

	/**
	 * 提供期間終了年 .
	 */
	private String termEndY;
	
	/**
	 * 提供期間終了月 .
	 */
	private String termEndM;
	
	/**
	 * 提供期間終了日 .
	 */
	private String termEndD;
	
	/**
	 * 手仕舞日 .
	 */
	private String liquidateDay;

	/**
	 * 有効期間 .
	 */
	private String validPeriod;

	/**
	 * 手仕舞通知方法用否 .
	 */
	private String liquidateInformFlg;

	/**
	 * 予約通知方法用否 .
	 */
	private String bookInformWayFlg;

	/**
	 * 通知先ファックス .
	 */
	private String informFax;
	
	/**
	 * リフト券利用終了時間（平日） 時間 . 
	 */
	private String liftTicketEndOdrHour;
	
	/**
	 * リフト券利用終了時間（平日）　分 .
	 */
	private String liftTicketEndOdrMinutes;
	
	/**
	 * リフト券利用開始時間（平日） 時間 .
	 */
	private String liftTicketBeginOdrHour;
	
	/**
	 * リフト券利用開始時間（平日）　分 .
	 */
	private String liftTicketBeginOdrMinutes;
	
	/**
	 * リフト券利用開始時間（休日） 時間 .
	 */
	private String liftTicketBeginHolHour;
	
	/**
	 * リフト券利用開始時間（休日）　分 .
	 */
	private String liftTicketBeginHolMinutes;
	
	/**
	 * リフト券利用終了時間（休日） 時間 .
	 */
	private String liftTicketEndHolHour;
	
	/**
	 * リフト券利用終了時間（休日）　分 .
	 */
	private String liftTicketEndHolMinutes;
	

	/**
	 * 取扱手数料 .
	 */
	private String dealFee;

	/**
	 * 取扱手数料種別 .
	 */
	private String dealFeeType;

	/**
	 * 個札券出力指定有無 .
	 */
	private String personalTicketPrintFlg = JreConstants.FLG_FALSE;

	/**
	 * 備考 .
	 */
	private String memo;

	/**
	 * 券面タイトル(カナ） .
	 */
	private String ticketTitleKana;

	/**
	 * 券面タイトル（漢字） .
	 */
	private String ticketTitleKanji;

	/**
	 * バウチャー券案内文(カナ） .
	 */
	private String voucherIntroKana;

	/**
	 * バウチャー券案内文（漢字） .
	 */
	private String voucherIntroKanji;

	/**
	 * 除外日 .
	 */
	private String exceptDate;
	
	/**
	 * 営業時間開始（通常）時間 .
	 */
	private String salesTimeBeginNorHour;
	
	/**
	 * 営業時間開始（通常）分 .
	 */
	private String salesTimeBeginNorMinutes;
	
	/**
	 * 営業時間終了（通常）時間 .
	 */
	private String salesTimeEndNorHour;

	/**
	 * 営業時間終了（通常）分 .
	 */
	private String salesTimeEndNorMinutes;
	
	/**
	 * 営業時間備考（通常） .
	 */
	private String salesTimeMemoNor;
	
	/**
	 * 営業時間開始（ナイター）時間 .
	 */
	private String salesTimeBeginNightHour;
	
	/**
	 * 営業時間開始（ナイター）分 .
	 */
	private String salesTimeBeginNightMinutes;
	
	/**
	 * 営業時間終了（ナイター）時間 .
	 */
	private String salesTimeEndNightHour;
	
	/**
	 * 営業時間終了（ナイター）分 .
	 */
	private String salesTimeEndNightMinutes;

	/**
	 * 営業時間備考（ナイター） .
	 */
	private String salesTimeMemoNight;

	/**
	 * 営業時間その他 .
	 */
	private String salesTimeOthers;

	/**
	 * 宅配受取サービス有無 .
	 */
	private String homeDeliveryServiceFlg;

	/**
	 * 送付先スキー場有無 .
	 */
	private String sendAddrSkiAreasFlg = JreConstants.FLG_FALSE;

	/**
	 * 送付先その他有無 .
	 */
	private String sendAddrOthersFlg = JreConstants.FLG_FALSE;

	/**
	 * 送付先コメント .
	 */
	private String sendAddrCmt;

	/**
	 * 受取箇所 .
	 */
	private String receiptPart;

	/**
	 * 更衣室有無 .
	 */
	private String dressingRoomFlg = JreConstants.FLG_FALSE;

	/**
	 * シャワー有無 .
	 */
	private String showerFlg = JreConstants.FLG_FALSE;

	/**
	 * シャワー料金有無 .
	 */
	private String showerFeeFlg;

	/**
	 * ロッカー有無 .
	 */
	private String lockerFlg = JreConstants.FLG_FALSE;

	/**
	 * ロッカー料金有無 .
	 */
	private String lockerFeeFlg;

	/**
	 * 浴場有無 .
	 */
	private String bathroomFlg = JreConstants.FLG_FALSE;

	/**
	 * 浴場料金有無 .
	 */
	private String bathroomFeeFlg;

	/**
	 * ハーフパイプ有無 .
	 */
	private String halfpipeFlg = JreConstants.FLG_FALSE;

	/**
	 * ワンメイク有無 .
	 */
	private String oneMakeFlg = JreConstants.FLG_FALSE;

	/**
	 * ボード専用エリア有無 .
	 */
	private String areaForBoardFlg = JreConstants.FLG_FALSE;

	/**
	 * モーグル専用エリア有無 .
	 */
	private String areaForMogulFlg = JreConstants.FLG_FALSE;

	/**
	 * ファミリーゲレンデ有無 .
	 */
	private String familyGelandeFlg = JreConstants.FLG_FALSE;

	/**
	 * キッズ専用エリア有無 .
	 */
	private String areaForKidsFlg = JreConstants.FLG_FALSE;

	/**
	 * 託児所サービス有無 .
	 */
	private String dayCareServiceFlg = JreConstants.FLG_FALSE;
	/**
	 * 託児サービス料金（有無）.
	 */
	private String dayCareChargeEFlg;
	/**
	 * 特記事項 .
	 */
	private String specialItem;

	/**
	 * 自由入力欄 .
	 */
	private String freelyColumn;

	/**
	 * @return Returns the areaForBoardFlg.
	 */
	public String getAreaForBoardFlg() {
		return areaForBoardFlg;
	}

	/**
	 * @param areaForBoardFlg The areaForBoardFlg to set.
	 */
	public void setAreaForBoardFlg(String areaForBoardFlg) {
		this.areaForBoardFlg = areaForBoardFlg;
	}

	/**
	 * @return Returns the areaForKidsFlg.
	 */
	public String getAreaForKidsFlg() {
		return areaForKidsFlg;
	}

	/**
	 * @param areaForKidsFlg The areaForKidsFlg to set.
	 */
	public void setAreaForKidsFlg(String areaForKidsFlg) {
		this.areaForKidsFlg = areaForKidsFlg;
	}

	/**
	 * @return Returns the areaForMogulFlg.
	 */
	public String getAreaForMogulFlg() {
		return areaForMogulFlg;
	}

	/**
	 * @param areaForMogulFlg The areaForMogulFlg to set.
	 */
	public void setAreaForMogulFlg(String areaForMogulFlg) {
		this.areaForMogulFlg = areaForMogulFlg;
	}

	/**
	 * @return Returns the bathroomFeeFlg.
	 */
	public String getBathroomFeeFlg() {
		return bathroomFeeFlg;
	}

	/**
	 * @param bathroomFeeFlg The bathroomFeeFlg to set.
	 */
	public void setBathroomFeeFlg(String bathroomFeeFlg) {
		this.bathroomFeeFlg = bathroomFeeFlg;
	}

	/**
	 * @return Returns the bathroomFlg.
	 */
	public String getBathroomFlg() {
		return bathroomFlg;
	}

	/**
	 * @param bathroomFlg The bathroomFlg to set.
	 */
	public void setBathroomFlg(String bathroomFlg) {
		this.bathroomFlg = bathroomFlg;
	}

	/**
	 * @return Returns the bookInformWayFlg.
	 */
	public String getBookInformWayFlg() {
		return bookInformWayFlg;
	}

	/**
	 * @param bookInformWayFlg The bookInformWayFlg to set.
	 */
	public void setBookInformWayFlg(String bookInformWayFlg) {
		this.bookInformWayFlg = bookInformWayFlg;
	}

	/**
	 * @return Returns the dayCareServiceFlg.
	 */
	public String getDayCareServiceFlg() {
		return dayCareServiceFlg;
	}

	/**
	 * @param dayCareServiceFlg The dayCareServiceFlg to set.
	 */
	public void setDayCareServiceFlg(String dayCareServiceFlg) {
		this.dayCareServiceFlg = dayCareServiceFlg;
	}

	/**
	 * @return Returns the dealFee.
	 */
	public String getDealFee() {
		//取扱手数料種別は円の場合、小数を切り捨てる
		if (JreConstants.EnTypeFlg.equals(getDealFeeType())) {
			//数字ではないの場合、そのまま返す. jinhuashi 720501
			if (!KikakuWebUtil.isNumber(dealFee) && !KikakuWebUtil.isFloat(dealFee)) {
				return dealFee;
			}
			if (!StringUtil.isEmpty(dealFee) && dealFee.length() > 0) {
				int dealFeeValue = Float.valueOf(dealFee).intValue();
				dealFee = String.valueOf(dealFeeValue);
			}
			
			return dealFee;
		} else {
			return dealFee;
		}
	}

	/**
	 * @param dealFee The dealFee to set.
	 */
	public void setDealFee(String dealFee) {
		this.dealFee = dealFee;
	}

	/**
	 * @return Returns the dealFeeType.
	 */
	public String getDealFeeType() {
		return dealFeeType;
	}

	/**
	 * @param dealFeeType The dealFeeType to set.
	 */
	public void setDealFeeType(String dealFeeType) {
		this.dealFeeType = dealFeeType;
	}

	/**
	 * @return Returns the dressingRoomFlg.
	 */
	public String getDressingRoomFlg() {
		return dressingRoomFlg;
	}

	/**
	 * @param dressingRoomFlg The dressingRoomFlg to set.
	 */
	public void setDressingRoomFlg(String dressingRoomFlg) {
		this.dressingRoomFlg = dressingRoomFlg;
	}

	/**
	 * @return Returns the exceptDate.
	 */
	public String getExceptDate() {
		return exceptDate;
	}

	/**
	 * @param exceptDate The exceptDate to set.
	 */
	public void setExceptDate(String exceptDate) {
		this.exceptDate = exceptDate;
	}

	/**
	 * @return Returns the facilityAddr.
	 */
	public String getFacilityAddr() {
		return facilityAddr;
	}

	/**
	 * @param facilityAddr The facilityAddr to set.
	 */
	public void setFacilityAddr(String facilityAddr) {
		this.facilityAddr = facilityAddr;
	}

	/**
	 * @return Returns the facilityFax.
	 */
	public String getFacilityFax() {
		return facilityFax == null ? "" : facilityFax.trim();
	}

	/**
	 * @param facilityFax The facilityFax to set.
	 */
	public void setFacilityFax(String facilityFax) {
		this.facilityFax = facilityFax;
	}

	/**
	 * @return Returns the facilityTel.
	 */
	public String getFacilityTel() {
		return facilityTel == null ? "" : facilityTel.trim();
	}

	/**
	 * @param facilityTel The facilityTel to set.
	 */
	public void setFacilityTel(String facilityTel) {
		this.facilityTel = facilityTel;
	}

	/**
	 * @return Returns the familyGelandeFlg.
	 */
	public String getFamilyGelandeFlg() {
		return familyGelandeFlg;
	}

	/**
	 * @param familyGelandeFlg The familyGelandeFlg to set.
	 */
	public void setFamilyGelandeFlg(String familyGelandeFlg) {
		this.familyGelandeFlg = familyGelandeFlg;
	}

	/**
	 * @return Returns the freelyColumn.
	 */
	public String getFreelyColumn() {
		return freelyColumn;
	}

	/**
	 * @param freelyColumn The freelyColumn to set.
	 */
	public void setFreelyColumn(String freelyColumn) {
		this.freelyColumn = freelyColumn;
	}

	/**
	 * @return Returns the halfpipeFlg.
	 */
	public String getHalfpipeFlg() {
		return halfpipeFlg;
	}

	/**
	 * @param halfpipeFlg The halfpipeFlg to set.
	 */
	public void setHalfpipeFlg(String halfpipeFlg) {
		this.halfpipeFlg = halfpipeFlg;
	}

	/**
	 * @return Returns the homeDeliveryServiceFlg.
	 */
	public String getHomeDeliveryServiceFlg() {
		return homeDeliveryServiceFlg;
	}

	/**
	 * @param homeDeliveryServiceFlg The homeDeliveryServiceFlg to set.
	 */
	public void setHomeDeliveryServiceFlg(String homeDeliveryServiceFlg) {
		this.homeDeliveryServiceFlg = homeDeliveryServiceFlg;
	}

	/**
	 * @return Returns the liftTicketBeginHol.
	 */
	public String getLiftTicketBeginHol() {
		
		return KikakuWebUtil.buildTime(getLiftTicketBeginHolHour(),
				getLiftTicketBeginHolMinutes());
		
	}
	
	/**
	 * @param liftTicketBeginHol the liftTicketBeginHol to set.
	 */
	public void setLiftTicketBeginHol(String liftTicketBeginHol) {
		if (!StringUtil.isEmpty(liftTicketBeginHol)) {
			this.liftTicketBeginHolHour = liftTicketBeginHol.substring(0, 2);
			this.liftTicketBeginHolMinutes = liftTicketBeginHol.substring(2, 4);
		} else {
			this.liftTicketBeginHolHour = "";
			this.liftTicketBeginHolMinutes = "";
		}
	}

	/**
	 * @return Returns the liftTicketEndHol.
	 */
	public String getLiftTicketEndHol() {

		return KikakuWebUtil.buildTime(getLiftTicketEndHolHour(),
				getLiftTicketEndHolMinutes());
	}

	/**
	 * @param liftTicketEndHol the liftTicketEndHol to set.
	 */
	public void setLiftTicketEndHol(String liftTicketEndHol) {
		if (!StringUtil.isEmpty(liftTicketEndHol)) {
			this.liftTicketEndHolHour = liftTicketEndHol.substring(0, 2);
			this.liftTicketEndHolMinutes = liftTicketEndHol.substring(2, 4);
		} else {
			this.liftTicketEndHolHour = "";
			this.liftTicketEndHolMinutes = "";
		}
	}
	
	/**
	 * @return Returns the liquidateDay.
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}

	/**
	 * @param liquidateDay The liquidateDay to set.
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = StringUtil.toHalf(liquidateDay);
	}

	/**
	 * @return Returns the liquidateInformFlg.
	 */
	public String getLiquidateInformFlg() {
		return liquidateInformFlg;
	}

	/**
	 * @param liquidateInformFlg The liquidateInformFlg to set.
	 */
	public void setLiquidateInformFlg(String liquidateInformFlg) {
		this.liquidateInformFlg = liquidateInformFlg;
	}

	/**
	 * @return Returns the lockerFeeFlg.
	 */
	public String getLockerFeeFlg() {
		return lockerFeeFlg;
	}

	/**
	 * @param lockerFeeFlg The lockerFeeFlg to set.
	 */
	public void setLockerFeeFlg(String lockerFeeFlg) {
		this.lockerFeeFlg = lockerFeeFlg;
	}

	/**
	 * @return Returns the lockerFlg.
	 */
	public String getLockerFlg() {
		return lockerFlg;
	}

	/**
	 * @param lockerFlg The lockerFlg to set.
	 */
	public void setLockerFlg(String lockerFlg) {
		this.lockerFlg = lockerFlg;
	}

	/**
	 * @return Returns the memo.
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo The memo to set.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return Returns the oneMakeFlg.
	 */
	public String getOneMakeFlg() {
		return oneMakeFlg;
	}

	/**
	 * @param oneMakeFlg The oneMakeFlg to set.
	 */
	public void setOneMakeFlg(String oneMakeFlg) {
		this.oneMakeFlg = oneMakeFlg;
	}

	/**
	 * @return Returns the ownerNm.
	 */
	public String getOwnerNm() {
		return ownerNm;
	}

	/**
	 * @param ownerNm The ownerNm to set.
	 */
	public void setOwnerNm(String ownerNm) {
		this.ownerNm = ownerNm;
	}

	/**
	 * @return Returns the personalTicketPrintFlg.
	 */
	public String getPersonalTicketPrintFlg() {
		return personalTicketPrintFlg;
	}

	/**
	 * @param personalTicketPrintFlg The personalTicketPrintFlg to set.
	 */
	public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
		this.personalTicketPrintFlg = personalTicketPrintFlg;
	}

	/**
	 * @return Returns the postcode.
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode The postcode to set.
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * @return Returns the receiptPart.
	 */
	public String getReceiptPart() {
		return receiptPart;
	}

	/**
	 * @param receiptPart The receiptPart to set.
	 */
	public void setReceiptPart(String receiptPart) {
		this.receiptPart = receiptPart;
	}

	/**
	 * @return Returns the salesTimeBeginNight.
	 */
	public String getSalesTimeBeginNight() {
		
		return KikakuWebUtil.buildTime(getSalesTimeBeginNightHour(),
				getSalesTimeBeginNightMinutes());
	}

	/**
	 * @param salesTimeBeginNight the salesTimeBeginNight to set.
	 */
	public void setSalesTimeBeginNight(String salesTimeBeginNight) {
		if (!StringUtil.isEmpty(salesTimeBeginNight)) {
			this.salesTimeBeginNightHour = salesTimeBeginNight.substring(0, 2);
			this.salesTimeBeginNightMinutes = salesTimeBeginNight.substring(2, 4);
		} else {
			this.salesTimeBeginNightHour = "";
			this.salesTimeBeginNightMinutes = "";
		}
	}
	
	/**
	 * @return Returns the salesTimeBeginNor.
	 */
	public String getSalesTimeBeginNor() {

		return KikakuWebUtil.buildTime(getSalesTimeBeginNorHour(),
				getSalesTimeBeginNorMinutes());
	}

	/**
	 * @param salesTimeBeginNor the salesTimeBeginNor to set.
	 */
	public void setSalesTimeBeginNor(String salesTimeBeginNor) {
		if (!StringUtil.isEmpty(salesTimeBeginNor)) {
			this.salesTimeBeginNorHour = salesTimeBeginNor.substring(0, 2);
			this.salesTimeBeginNorMinutes = salesTimeBeginNor.substring(2, 4);
		} else {
			this.salesTimeBeginNorHour = "";
			this.salesTimeBeginNorMinutes = "";
		}
	}
	
	/**
	 * @return Returns the salesTimeEndNight.
	 */
	public String getSalesTimeEndNight() {
		
		return KikakuWebUtil.buildTime(getSalesTimeEndNightHour(),
				getSalesTimeEndNightMinutes());
	}
	
	/**
	 * @param salesTimeEndNight the salesTimeEndNight to set.
	 */
	public void setSalesTimeEndNight(String salesTimeEndNight) {
		if (!StringUtil.isEmpty(salesTimeEndNight)) {
			this.salesTimeEndNightHour = salesTimeEndNight.substring(0, 2);
			this.salesTimeEndNightMinutes = salesTimeEndNight.substring(2, 4);
		} else {
			this.salesTimeEndNightHour = "";
			this.salesTimeEndNightMinutes = "";
		}
	}
	
	/**
	 * @return Returns the salesTimeEndNor.
	 */
	public String getSalesTimeEndNor() {
		
		return KikakuWebUtil.buildTime(getSalesTimeEndNorHour(),
				getSalesTimeEndNorMinutes());
	}

	/**
	 * @param salesTimeEndNor the salesTimeEndNor to set.
	 */
	public void setSalesTimeEndNor(String salesTimeEndNor) {
		if (!StringUtil.isEmpty(salesTimeEndNor)) {
			this.salesTimeEndNorHour = salesTimeEndNor.substring(0, 2);
			this.salesTimeEndNorMinutes = salesTimeEndNor.substring(2, 4);
		} else {
			this.salesTimeEndNorHour = "";
			this.salesTimeEndNorMinutes = "";
		}
	}
	
	/**
	 * @return Returns the salesTimeMemoNight.
	 */
	public String getSalesTimeMemoNight() {
		return salesTimeMemoNight;
	}

	/**
	 * @param salesTimeMemoNight The salesTimeMemoNight to set.
	 */
	public void setSalesTimeMemoNight(String salesTimeMemoNight) {
		this.salesTimeMemoNight = salesTimeMemoNight;
	}

	/**
	 * @return Returns the salesTimeMemoNor.
	 */
	public String getSalesTimeMemoNor() {
		return salesTimeMemoNor;
	}

	/**
	 * @param salesTimeMemoNor The salesTimeMemoNor to set.
	 */
	public void setSalesTimeMemoNor(String salesTimeMemoNor) {
		this.salesTimeMemoNor = salesTimeMemoNor;
	}

	/**
	 * @return Returns the salesTimeOthers.
	 */
	public String getSalesTimeOthers() {
		return salesTimeOthers;
	}

	/**
	 * @param salesTimeOthers The salesTimeOthers to set.
	 */
	public void setSalesTimeOthers(String salesTimeOthers) {
		this.salesTimeOthers = salesTimeOthers;
	}

	/**
	 * @return Returns the sendAddrCmt.
	 */
	public String getSendAddrCmt() {
		return sendAddrCmt;
	}

	/**
	 * @param sendAddrCmt The sendAddrCmt to set.
	 */
	public void setSendAddrCmt(String sendAddrCmt) {
		this.sendAddrCmt = sendAddrCmt;
	}

	/**
	 * @return Returns the sendAddrOthersFlg.
	 */
	public String getSendAddrOthersFlg() {
		return sendAddrOthersFlg;
	}

	/**
	 * @param sendAddrOthersFlg The sendAddrOthersFlg to set.
	 */
	public void setSendAddrOthersFlg(String sendAddrOthersFlg) {
		this.sendAddrOthersFlg = sendAddrOthersFlg;
	}

	/**
	 * @return Returns the sendAddrSkiAreasFlg.
	 */
	public String getSendAddrSkiAreasFlg() {
		return sendAddrSkiAreasFlg;
	}

	/**
	 * @param sendAddrSkiAreasFlg The sendAddrSkiAreasFlg to set.
	 */
	public void setSendAddrSkiAreasFlg(String sendAddrSkiAreasFlg) {
		this.sendAddrSkiAreasFlg = sendAddrSkiAreasFlg;
	}

	/**
	 * @return Returns the showerFeeFlg.
	 */
	public String getShowerFeeFlg() {
		return showerFeeFlg;
	}

	/**
	 * @param showerFeeFlg The showerFeeFlg to set.
	 */
	public void setShowerFeeFlg(String showerFeeFlg) {
		this.showerFeeFlg = showerFeeFlg;
	}

	/**
	 * @return Returns the showerFlg.
	 */
	public String getShowerFlg() {
		return showerFlg;
	}

	/**
	 * @param showerFlg The showerFlg to set.
	 */
	public void setShowerFlg(String showerFlg) {
		this.showerFlg = showerFlg;
	}

	/**
	 * @return Returns the specialItem.
	 */
	public String getSpecialItem() {
		return specialItem;
	}

	/**
	 * @param specialItem The specialItem to set.
	 */
	public void setSpecialItem(String specialItem) {
		this.specialItem = specialItem;
	}

	/**
	 * @return Returns the stockNo.
	 */
	public String getStockNo() {
		
		return StringUtil.trim(stockNo);
	}

	/**
	 * @param stockNo The stockNo to set.
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = StringUtil.toHalf(stockNo);
	}

	/**
	 * @return Returns the termEndYmd.
	 */
	public String getTermEndYmd() {
		if (StringUtil.isEmpty(getTermEndY())
				|| StringUtil.isEmpty(getTermEndM())
				|| StringUtil.isEmpty(getTermEndD())) {
			return "";
		}
		return getTermEndY() + getTermEndM() + getTermEndD();
	}
	
	/**
	 * @param termEndYmd the termEndYmd to set.
	 */
	public void setTermEndYmd(String termEndYmd) {
		if (!StringUtil.isEmpty(termEndYmd)) {
			if (termEndYmd.length() == JreConstants.TERM_YMD) {
				this.termEndY = termEndYmd.substring(0, 4);
				this.termEndM = termEndYmd.substring(4, 6);
				this.termEndD = termEndYmd.substring(6, 8);
			} else {
				this.termEndY = "";
				this.termEndM = "";
				this.termEndD = "";
			}
		} else {
			this.termEndY = "";
			this.termEndM = "";
			this.termEndD = "";
		}
	}
	
	/**
	 * @return termFromYmd 提供期間開始年月日
	 */
	public String getTermFromYmd() {
		if (StringUtil.isEmpty(termFromY) 
				|| StringUtil.isEmpty(termFromM) 
				|| StringUtil.isEmpty(termFromD)) {
			return "";
		}
		return getTermFromY() + getTermFromM() + getTermFromD();
	}

	/**
	 * @param termFromYmd the termFromYmd to set.
	 */
	public void setTermFromYmd(String termFromYmd) {
		if (!StringUtil.isEmpty(termFromYmd)) {
			if (termFromYmd.length() == JreConstants.TERM_YMD) {
				this.termFromY = termFromYmd.substring(0, 4);
				this.termFromM = termFromYmd.substring(4, 6);
				this.termFromD = termFromYmd.substring(6, 8);
			} else {
				this.termFromY = "";
				this.termFromM = "";
				this.termFromD = "";
			}
		} else {
			this.termFromY = "";
			this.termFromM = "";
			this.termFromD = "";
		}
	}
	
	/**
	 * @return Returns the ticketTitleKana.
	 */
	public String getTicketTitleKana() {
		return ticketTitleKana;
	}

	/**
	 * @param ticketTitleKana The ticketTitleKana to set.
	 */
	public void setTicketTitleKana(String ticketTitleKana) {
		this.ticketTitleKana = ticketTitleKana;
	}

	/**
	 * @return Returns the ticketTitleKanji.
	 */
	public String getTicketTitleKanji() {
		return ticketTitleKanji;
	}

	/**
	 * @param ticketTitleKanji The ticketTitleKanji to set.
	 */
	public void setTicketTitleKanji(String ticketTitleKanji) {
		this.ticketTitleKanji = ticketTitleKanji;
	}

	/**
	 * @return Returns the validPeriod.
	 */
	public String getValidPeriod() {
		return validPeriod;
	}

	/**
	 * @param validPeriod The validPeriod to set.
	 */
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = StringUtil.toHalf(validPeriod);
	}

	/**
	 * @return Returns the voucherIntroIanji.
	 */
	public String getVoucherIntroKanji() {
		return voucherIntroKanji;
	}

	/**
	 * @param voucherIntroKanji The voucherIntroKanji to set.
	 */
	public void setVoucherIntroKanji(String voucherIntroKanji) {
		this.voucherIntroKanji = voucherIntroKanji;
	}

	/**
	 * @return Returns the voucherIntroKana.
	 */
	public String getVoucherIntroKana() {
		return voucherIntroKana;
	}

	/**
	 * @param voucherIntroKana The voucherIntroKana to set.
	 */
	public void setVoucherIntroKana(String voucherIntroKana) {
		this.voucherIntroKana = voucherIntroKana;
	}

	/**
	 * @return Returns the informFax.
	 */
	public String getInformFax() {
		return informFax;
	}

	/**
	 * @param informFax The informFax to set.
	 */
	public void setInformFax(String informFax) {
		this.informFax = informFax;
	}

	/**
	 * @return Returns the termFromD.
	 */
	public String getTermFromD() {
	
		if (termFromD != null && KikakuWebUtil.isNumber(termFromD)) {
			if (termFromD.length() == 1) {
				termFromD = "0" + termFromD;
			}
		}
		return termFromD;
	}

	/**
	 * @param termFromD The termFromD to set.
	 */
	public void setTermFromD(String termFromD) {
		this.termFromD = termFromD;
	}

	/**
	 * @return Returns the termFromM.
	 */
	public String getTermFromM() {
		if (termFromM != null && KikakuWebUtil.isNumber(termFromM)) {
			if (termFromM.length() == 1) {
				termFromM = "0" + termFromM;
			}
		}
		return termFromM;
	}

	/**
	 * @param termFromM The termFromM to set.
	 */
	public void setTermFromM(String termFromM) {
		this.termFromM = termFromM;
	}

	/**
	 * @return Returns the termFromY.
	 */
	public String getTermFromY() {
		return termFromY;
	}

	/**
	 * @param termFromY The termFromY to set.
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = termFromY;
	}

	/**
	 * @return Returns the termEndD.
	 */
	public String getTermEndD() {
		if (termEndD != null && KikakuWebUtil.isNumber(termEndD)) {
			if (termEndD.length() == 1) {
				termEndD = "0" + termEndD;
			}

		}
		return termEndD;
	}

	/**
	 * @param termEndD The termEndD to set.
	 */
	public void setTermEndD(String termEndD) {
		this.termEndD = termEndD;
	}

	/**
	 * @return Returns the termEndM.
	 */
	public String getTermEndM() {
		if (termEndM != null && KikakuWebUtil.isNumber(termEndD)) {
			if (termEndM.length() == 1) {
				termEndM = "0" + termEndM;
			}
		}
		return termEndM;
	}

	/**
	 * @param termEndM The termEndM to set.
	 */
	public void setTermEndM(String termEndM) {
		this.termEndM = termEndM;
	}

	/**
	 * @return Returns the termEndY.
	 */
	public String getTermEndY() {
		return termEndY;
	}

	/**
	 * @param termEndY The termEndY to set.
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = termEndY;
	}

	/**
	 * @return Returns the liftTicketBeginOdr.
	 */
	public String getLiftTicketBeginOdr() {

		return KikakuWebUtil.buildTime(getLiftTicketBeginOdrHour(),
				getLiftTicketBeginOdrMinutes());
	}

	/**
	 * @param liftTicketBeginOdr the liftTicketBeginOdr to set.
	 */
	public void setLiftTicketBeginOdr(String liftTicketBeginOdr) {
		if (!StringUtil.isEmpty(liftTicketBeginOdr)) {
			this.liftTicketBeginOdrHour = liftTicketBeginOdr.substring(0, 2);
			this.liftTicketBeginOdrMinutes = liftTicketBeginOdr.substring(2, 4);
		} else {
			this.liftTicketBeginOdrHour = "";
			this.liftTicketBeginOdrMinutes = "";
		}
	}

	/**
	 * @return Returns the liftTicketEndOdr.
	 */
	public String getLiftTicketEndOdr() {
		
		return KikakuWebUtil.buildTime(getLiftTicketEndOdrHour(),
				getLiftTicketEndOdrMinutes());
	}
	
	/**
	 * @param liftTicketEndOdr the liftTicketEndOdr to set.
	 */
	public void setLiftTicketEndOdr(String liftTicketEndOdr) {
		if (!StringUtil.isEmpty(liftTicketEndOdr)) {
			this.liftTicketEndOdrHour = liftTicketEndOdr.substring(0, 2);
			this.liftTicketEndOdrMinutes = liftTicketEndOdr.substring(2, 4);
		} else {
			this.liftTicketEndOdrHour = "";
			this.liftTicketEndOdrMinutes = "";
		}
	}
	
	/**
	 * @return Returns the liftTicketBeginOdrHour.
	 */
	public String getLiftTicketBeginOdrHour() {
		return liftTicketBeginOdrHour;
	}

	/**
	 * @param liftTicketBeginOdrHour The liftTicketBeginOdrHour to set.
	 */
	public void setLiftTicketBeginOdrHour(String liftTicketBeginOdrHour) {
		this.liftTicketBeginOdrHour = liftTicketBeginOdrHour;
	}

	/**
	 * @return Returns the liftTicketBeginOdrMinutes.
	 */
	public String getLiftTicketBeginOdrMinutes() {
		return liftTicketBeginOdrMinutes;
	}

	/**
	 * @param liftTicketBeginOdrMinutes The liftTicketBeginOdrMinutes to set.
	 */
	public void setLiftTicketBeginOdrMinutes(String liftTicketBeginOdrMinutes) {
		this.liftTicketBeginOdrMinutes = liftTicketBeginOdrMinutes;
	}

	/**
	 * @return Returns the liftTicketEndOdrHour.
	 */
	public String getLiftTicketEndOdrHour() {
		return liftTicketEndOdrHour;
	}

	/**
	 * @param liftTicketEndOdrHour The liftTicketEndOdrHour to set.
	 */
	public void setLiftTicketEndOdrHour(String liftTicketEndOdrHour) {
		this.liftTicketEndOdrHour = liftTicketEndOdrHour;
	}

	/**
	 * @return Returns the liftTicketEndOdrMinutes.
	 */
	public String getLiftTicketEndOdrMinutes() {
		return liftTicketEndOdrMinutes;
	}

	/**
	 * @param liftTicketEndOdrMinutes The liftTicketEndOdrMinutes to set.
	 */
	public void setLiftTicketEndOdrMinutes(String liftTicketEndOdrMinutes) {
		this.liftTicketEndOdrMinutes = liftTicketEndOdrMinutes;
	}

	/**
	 * @return Returns the liftTicketBeginHolHour.
	 */
	public String getLiftTicketBeginHolHour() {
		return liftTicketBeginHolHour;
	}

	/**
	 * @param liftTicketBeginHolHour The liftTicketBeginHolHour to set.
	 */
	public void setLiftTicketBeginHolHour(String liftTicketBeginHolHour) {
		this.liftTicketBeginHolHour = liftTicketBeginHolHour;
	}

	/**
	 * @return Returns the liftTicketBeginHolMinutes.
	 */
	public String getLiftTicketBeginHolMinutes() {
		return liftTicketBeginHolMinutes;
	}

	/**
	 * @param liftTicketBeginHolMinutes The liftTicketBeginHolMinutes to set.
	 */
	public void setLiftTicketBeginHolMinutes(String liftTicketBeginHolMinutes) {
		this.liftTicketBeginHolMinutes = liftTicketBeginHolMinutes;
	}

	/**
	 * @return Returns the liftTicketEndHolHour.
	 */
	public String getLiftTicketEndHolHour() {
		return liftTicketEndHolHour;
	}

	/**
	 * @param liftTicketEndHolHour The liftTicketEndHolHour to set.
	 */
	public void setLiftTicketEndHolHour(String liftTicketEndHolHour) {
		this.liftTicketEndHolHour = liftTicketEndHolHour;
	}

	/**
	 * @return Returns the liftTicketEndHolMinutes.
	 */
	public String getLiftTicketEndHolMinutes() {
		return liftTicketEndHolMinutes;
	}

	/**
	 * @param liftTicketEndHolMinutes The liftTicketEndHolMinutes to set.
	 */
	public void setLiftTicketEndHolMinutes(String liftTicketEndHolMinutes) {
		this.liftTicketEndHolMinutes = liftTicketEndHolMinutes;
	}

	/**
	 * @return Returns the salesTimeBeginNorHour.
	 */
	public String getSalesTimeBeginNorHour() {
		return salesTimeBeginNorHour;
	}

	/**
	 * @param salesTimeBeginNorHour The salesTimeBeginNorHour to set.
	 */
	public void setSalesTimeBeginNorHour(String salesTimeBeginNorHour) {
		this.salesTimeBeginNorHour = salesTimeBeginNorHour;
	}

	/**
	 * @return Returns the salesTimeBeginNorMinutes.
	 */
	public String getSalesTimeBeginNorMinutes() {
		return salesTimeBeginNorMinutes;
	}

	/**
	 * @param salesTimeBeginNorMinutes The salesTimeBeginNorMinutes to set.
	 */
	public void setSalesTimeBeginNorMinutes(String salesTimeBeginNorMinutes) {
		this.salesTimeBeginNorMinutes = salesTimeBeginNorMinutes;
	}

	/**
	 * @return Returns the salesTimeEndNorHour.
	 */
	public String getSalesTimeEndNorHour() {
		return salesTimeEndNorHour;
	}

	/**
	 * @param salesTimeEndNorHour The salesTimeEndNorHour to set.
	 */
	public void setSalesTimeEndNorHour(String salesTimeEndNorHour) {
		this.salesTimeEndNorHour = salesTimeEndNorHour;
	}

	/**
	 * @return Returns the salesTimeEndNorMinutes.
	 */
	public String getSalesTimeEndNorMinutes() {
		return salesTimeEndNorMinutes;
	}

	/**
	 * @param salesTimeEndNorMinutes The salesTimeEndNorMinutes to set.
	 */
	public void setSalesTimeEndNorMinutes(String salesTimeEndNorMinutes) {
		this.salesTimeEndNorMinutes = salesTimeEndNorMinutes;
	}

	/**
	 * @return Returns the salesTimeBeginNightHour.
	 */
	public String getSalesTimeBeginNightHour() {
		return salesTimeBeginNightHour;
	}

	/**
	 * @param salesTimeBeginNightHour The salesTimeBeginNightHour to set.
	 */
	public void setSalesTimeBeginNightHour(String salesTimeBeginNightHour) {
		this.salesTimeBeginNightHour = salesTimeBeginNightHour;
	}

	/**
	 * @return Returns the salesTimeBeginNightMinutes.
	 */
	public String getSalesTimeBeginNightMinutes() {
		return salesTimeBeginNightMinutes;
	}

	/**
	 * @param salesTimeBeginNightMinutes The salesTimeBeginNightMinutes to set.
	 */
	public void setSalesTimeBeginNightMinutes(String salesTimeBeginNightMinutes) {
		this.salesTimeBeginNightMinutes = salesTimeBeginNightMinutes;
	}

	/**
	 * @return Returns the salesTimeEndNightHour.
	 */
	public String getSalesTimeEndNightHour() {
		return salesTimeEndNightHour;
	}

	/**
	 * @param salesTimeEndNightHour The salesTimeEndNightHour to set.
	 */
	public void setSalesTimeEndNightHour(String salesTimeEndNightHour) {
		this.salesTimeEndNightHour = salesTimeEndNightHour;
	}

	/**
	 * @return Returns the salesTimeEndNightMinutes.
	 */
	public String getSalesTimeEndNightMinutes() {
		return salesTimeEndNightMinutes;
	}

	/**
	 * @param salesTimeEndNightMinutes The salesTimeEndNightMinutes to set.
	 */
	public void setSalesTimeEndNightMinutes(String salesTimeEndNightMinutes) {
		this.salesTimeEndNightMinutes = salesTimeEndNightMinutes;
	}
	/**
	 * 
	 * @return 託児サービス料金
	 */
	public String getDayCareChargeEFlg() {
		return dayCareChargeEFlg;
	}
	/**
	 * 
	 * @param dayCareChargeEFlg 託児サービス料金
	 */
	public void setDayCareChargeEFlg(String dayCareChargeEFlg) {
		this.dayCareChargeEFlg = dayCareChargeEFlg;
	}
	/**
	 * 取扱手数料存在するフラグ .
	 */
	private String isDealFeeExist;
	/**
	 * 
	 * @return 取扱手数料存在するフラグ.
	 */
	public String getIsDealFeeExist() {
		return isDealFeeExist;
	}
	/**
	 * 
	 * @param isDealFeeExist .
	 */
	public void setIsDealFeeExist(String isDealFeeExist) {
		this.isDealFeeExist = isDealFeeExist;
	}
}
