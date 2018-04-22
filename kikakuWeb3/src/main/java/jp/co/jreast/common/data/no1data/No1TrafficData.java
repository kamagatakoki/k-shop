package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 *  NO1船車データクラス。.
 *  機能概要    ：  NO1船車データを格納する。
 *  特記事項    ：  無し
 * </pre>
 * 
 * @author zhouch
 * @version 0.1 2006/11/17
 */
public class No1TrafficData extends PlanAnsBaseData implements INo1CommonData {
	/**
	 * 手数料の表示数字を取得.
	 * @return かんま付き手数料
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
	 * 手配有無 .
	 */
	private String arrangementFlg;

	/**
	 * 企画有無 .
	 */
	private String planFlg;

	/**
	 * 運輸区分 .
	 */
	private String trafficDiv;

	/**
	 * 新規区分 .
	 */
	private String newDiv;

	/**
	 * コピー元商品コード .
	 */
	private String originalGoodsCd;

	/**
	 * コピー元商品コード8桁 .
	 */
	private String originalGoodsCd1;

	/**
	 * コピー元商品コード2桁 .
	 */
	private String originalGoodsCd2;

	/**
	 * 予約開始日 .
	 */
	private String bookBeginDate;

	/**
	 * 予約開始日 月 .
	 */
	private String bookBeginDateM;

	/**
	 * 予約開始日 日 .
	 */
	private String bookBeginDateD;

	/**
	 * 商品コード .
	 */
	private String goodsCd;

	/**
	 * 商品コード8桁 .
	 */
	private String goodsCd1;

	/**
	 * 商品コード2桁 .
	 */
	private String goodsCd2;

	/**
	 * 分類コード .
	 */
	private String goodsKindCd;

	/**
	 * 会員券コース名(カナ） .
	 */
	private String courseNmKana;

	/**
	 * 会員券コース名(漢字） .
	 */
	private String courseNmKanji;

	/**
	 * 代表者名 .
	 */
	private String ownerNm;

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
	 * 提供期間開始年月日 .
	 */
	private String termFromYmd;

	/**
	 * 提供期間終了年月日 .
	 */
	private String termEndYmd;

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
	 * 個札券出力指定有無 .
	 */
	private String personalTicketPrintFlg;

	/**
	 * 通知先ファックス .
	 */
	private String informFax;

	/**
	 * 用途 .
	 */
	private String bookPurpose;

	/**
	 * 出発時間 .
	 */
	private String departureTime;

	/**
	 * 出発時間の時 .
	 */
	private String departureTimeH;

	/**
	 * 出発時間の分 .
	 */
	private String departureTimeM;

	/**
	 * 取扱手数料存在するフラグ .
	 */
	private String isDealFeeExist;

	/**
	 * 取扱手数料 .
	 */
	private String dealFee;

	/**
	 * 取扱手数料種別 .
	 */
	private String dealFeeType;

	/**
	 * 在庫制限フラグ .
	 */
	private String stockControlFlg;

	/**
	 * 台数・組数管理フラグ .
	 */
	private String unitManageFlg;

	/**
	 * 在庫番号 .
	 */
	private String stockNo;

	/**
	 * 備考 .
	 */
	private String memo;

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
	 * 記事 .
	 */
	private String news;

	/**
	 * 取消料金説明 .
	 */
	private String cancelFeeCmt;

	/**
	 * 特典 .
	 */
	private String special;

	/**
	 * 提供料金人数上限 .
	 */
	private String maxCapaPattern;

	/**
	 * @return .
	 */
	public String getArrangementFlg() {
		return arrangementFlg;
	}

	/**
	 * @param arrangementFlg .
	 */
	public void setArrangementFlg(String arrangementFlg) {
		this.arrangementFlg = arrangementFlg;
	}

	/**
	 * @return 予約開始日.
	 */
	public String getBookBeginDate() {
		return bookBeginDate;
	}

	/**
	 * @param bookBeginDate .
	 */
	public void setBookBeginDate(String bookBeginDate) {
		this.bookBeginDate = bookBeginDate;
	}

	/**
	 * @return 予約開始日 日.
	 */
	public String getBookBeginDateD() {
		return bookBeginDateD;
	}

	/**
	 * @param bookBeginDateD .
	 */
	public void setBookBeginDateD(String bookBeginDateD) {
		this.bookBeginDateD = bookBeginDateD;
	}

	/**
	 * @return 予約開始日 月.
	 */
	public String getBookBeginDateM() {
		return bookBeginDateM;
	}

	/**
	 * @param bookBeginDateM .
	 */
	public void setBookBeginDateM(String bookBeginDateM) {
		this.bookBeginDateM = bookBeginDateM;
	}

	/**
	 * @return 予約通知方法用否 .
	 */
	public String getBookInformWayFlg() {
		return bookInformWayFlg;
	}

	/**
	 * @param bookInformWayFlg .
	 */
	public void setBookInformWayFlg(String bookInformWayFlg) {
		this.bookInformWayFlg = bookInformWayFlg;
	}

	/**
	 * @return 用途 .
	 */
	public String getBookPurpose() {
		return bookPurpose;
	}

	/**
	 * @param bookPurpose .
	 */
	public void setBookPurpose(String bookPurpose) {
		this.bookPurpose = bookPurpose;
	}

	/**
	 * @return 取消料金説明.
	 */
	public String getCancelFeeCmt() {
		return cancelFeeCmt;
	}

	/**
	 * @param cancelFeeCmt .
	 */
	public void setCancelFeeCmt(String cancelFeeCmt) {
		this.cancelFeeCmt = cancelFeeCmt;
	}

	/**
	 * @return 会員券コース名(カナ）.
	 */
	public String getCourseNmKana() {
		return courseNmKana;
	}

	/**
	 * @param courseNmKana .
	 */
	public void setCourseNmKana(String courseNmKana) {
		this.courseNmKana = courseNmKana;
	}

	/**
	 * @return 会員券コース名(漢字）.
	 */
	public String getCourseNmKanji() {
		return courseNmKanji;
	}

	/**
	 * @param courseNmKanji .
	 */
	public void setCourseNmKanji(String courseNmKanji) {
		this.courseNmKanji = courseNmKanji;
	}

	/**
	 * @return 取扱手数料.
	 */
	public String getDealFee() {

		// 取扱手数料種別は円の場合、小数を切り捨てる
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
	 * @param dealFee .
	 */
	public void setDealFee(String dealFee) {
		this.dealFee = StringUtil.toHalf(dealFee);
	}

	/**
	 * @return 取扱手数料種別.
	 */
	public String getDealFeeType() {
		return dealFeeType;
	}

	/**
	 * @param dealFeeType .
	 */
	public void setDealFeeType(String dealFeeType) {
		this.dealFeeType = dealFeeType;
	}

	/**
	 * @return 出発時間.
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime .
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return 出発時間の時.
	 */
	public String getDepartureTimeH() {
		return departureTimeH;
	}

	/**
	 * @param departureTimeH .
	 */
	public void setDepartureTimeH(String departureTimeH) {
		this.departureTimeH = departureTimeH;
	}

	/**
	 * @return 出発時間の分.
	 */
	public String getDepartureTimeM() {
		return departureTimeM;
	}

	/**
	 * @param departureTimeM .
	 */
	public void setDepartureTimeM(String departureTimeM) {
		this.departureTimeM = departureTimeM;
	}

	/**
	 * @return 除外日 .
	 */
	public String getExceptDate() {
		return exceptDate;
	}

	/**
	 * @param exceptDate .
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
	 * @param facilityAddr .
	 */
	public void setFacilityAddr(String facilityAddr) {
		this.facilityAddr = facilityAddr;
	}

	/**
	 * @return 施設ファックス .
	 */
	public String getFacilityFax() {
		return facilityFax == null ? "" : facilityFax.trim();
	}

	/**
	 * @param facilityFax .
	 */
	public void setFacilityFax(String facilityFax) {
		this.facilityFax = facilityFax;
	}

	/**
	 * @return 施設郵便番号 .
	 */
	public String getFacilityPostCd() {
		return facilityPostCd;
	}

	/**
	 * @param facilityPostCd .
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
	 * @param facilityTel .
	 */
	public void setFacilityTel(String facilityTel) {
		this.facilityTel = facilityTel;
	}

	/**
	 * @return 商品コード.
	 */
	public String getGoodsCd() {
		return goodsCd;
	}

	/**
	 * @param goodsCd .
	 */
	public void setGoodsCd(String goodsCd) {
		this.goodsCd = goodsCd;
	}

	/**
	 * @return 商品コード8bit.
	 */
	public String getGoodsCd1() {
		return goodsCd1;
	}

	/**
	 * @param goodsCd1 .
	 */
	public void setGoodsCd1(String goodsCd1) {
		this.goodsCd1 = goodsCd1;
	}

	/**
	 * @return 商品コード2bit.
	 */
	public String getGoodsCd2() {
		return goodsCd2;
	}

	/**
	 * @param goodsCd2 .
	 */
	public void setGoodsCd2(String goodsCd2) {
		this.goodsCd2 = goodsCd2;
	}

	/**
	 * @return 分類コード.
	 */
	public String getGoodsKindCd() {
		return goodsKindCd;
	}

	/**
	 * @param goodsKindCd .
	 */
	public void setGoodsKindCd(String goodsKindCd) {
		this.goodsKindCd = goodsKindCd;
	}

	/**
	 * @return 通知先ファックス.
	 */
	public String getInformFax() {
		return informFax;
	}

	/**
	 * @param informFax .
	 */
	public void setInformFax(String informFax) {
		this.informFax = informFax;
	}

	/**
	 * @return 手仕舞日.
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}

	/**
	 * @param liquidateDay .
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = StringUtil.toHalf(liquidateDay);
	}

	/**
	 * @return 手仕舞通知方法用否.
	 */
	public String getLiquidateInformFlg() {
		return liquidateInformFlg;
	}

	/**
	 * @param liquidateInformFlg .
	 */
	public void setLiquidateInformFlg(String liquidateInformFlg) {
		this.liquidateInformFlg = liquidateInformFlg;
	}

	/**
	 * @return 備考.
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo .
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return 新規区分.
	 */
	public String getNewDiv() {
		return newDiv;
	}

	/**
	 * @param newDiv .
	 */
	public void setNewDiv(String newDiv) {
		this.newDiv = newDiv;
	}

	/**
	 * @return 記事.
	 */
	public String getNews() {
		return news;
	}

	/**
	 * @param news .
	 */
	public void setNews(String news) {
		this.news = news;
	}

	/**
	 * @return コピー元商品コード .
	 */
	public String getOriginalGoodsCd() {
		return originalGoodsCd;
	}

	/**
	 * @param originalGoodsCd .
	 */
	public void setOriginalGoodsCd(String originalGoodsCd) {
		this.originalGoodsCd = originalGoodsCd;
	}

	/**
	 * @return コピー元商品コード8bit.
	 */
	public String getOriginalGoodsCd1() {
		return originalGoodsCd1;
	}

	/**
	 * @param originalGoodsCd1 .
	 */
	public void setOriginalGoodsCd1(String originalGoodsCd1) {
		this.originalGoodsCd1 = originalGoodsCd1;
	}

	/**
	 * @return コピー元商品コード2bit.
	 */
	public String getOriginalGoodsCd2() {
		return originalGoodsCd2;
	}

	/**
	 * @param originalGoodsCd2 .
	 */
	public void setOriginalGoodsCd2(String originalGoodsCd2) {
		this.originalGoodsCd2 = originalGoodsCd2;
	}

	/**
	 * @return 代表者名 .
	 */
	public String getOwnerNm() {
		return ownerNm;
	}

	/**
	 * @param ownerNm .
	 */
	public void setOwnerNm(String ownerNm) {
		this.ownerNm = ownerNm;
	}

	/**
	 * @return 個札券出力指定有無.
	 */
	public String getPersonalTicketPrintFlg() {
		return personalTicketPrintFlg;
	}

	/**
	 * @param personalTicketPrintFlg .
	 */
	public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
		this.personalTicketPrintFlg = personalTicketPrintFlg;
	}

	/**
	 * @return 企画有無 .
	 */
	public String getPlanFlg() {
		return planFlg;
	}

	/**
	 * @param planFlg .
	 */
	public void setPlanFlg(String planFlg) {
		this.planFlg = planFlg;
	}

	/**
	 * @return 特典.
	 */
	public String getSpecial() {
		return special;
	}

	/**
	 * @param special .
	 */
	public void setSpecial(String special) {
		this.special = special;
	}

	/**
	 * @return 在庫制限フラグ.
	 */
	public String getStockControlFlg() {
		return stockControlFlg;
	}

	/**
	 * @param stockControlFlg .
	 */
	public void setStockControlFlg(String stockControlFlg) {
		this.stockControlFlg = stockControlFlg;
	}

	/**
	 * @return 在庫番号.
	 */
	public String getStockNo() {
		return stockNo;
	}

	/**
	 * @param stockNo .
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}

	/**
	 * @return 提供期間終了日 .
	 */
	public String getTermEndD() {
		return termEndD;
	}

	/**
	 * @param termEndD .
	 */
	public void setTermEndD(String termEndD) {
		this.termEndD = StringUtil.toHalf(termEndD);
	}

	/**
	 * @return 提供期間終了月.
	 */
	public String getTermEndM() {
		return termEndM;
	}

	/**
	 * @param termEndM .
	 */
	public void setTermEndM(String termEndM) {
		this.termEndM = StringUtil.toHalf(termEndM);
	}

	/**
	 * @return 提供期間終了年.
	 */
	public String getTermEndY() {
		return termEndY;
	}

	/**
	 * @param termEndY .
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = StringUtil.toHalf(termEndY);
	}

	/**
	 * @return 提供期間開始日 .
	 */
	public String getTermFromD() {
		return termFromD;
	}

	/**
	 * @param termFromD .
	 */
	public void setTermFromD(String termFromD) {
		this.termFromD = StringUtil.toHalf(termFromD);
	}

	/**
	 * @return 提供期間開始月.
	 */
	public String getTermFromM() {
		return termFromM;
	}

	/**
	 * @param termFromM .
	 */
	public void setTermFromM(String termFromM) {
		this.termFromM = StringUtil.toHalf(termFromM);
	}

	/**
	 * @return 提供期間開始年 .
	 */
	public String getTermFromY() {
		return termFromY;
	}

	/**
	 * @param termFromY .
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = StringUtil.toHalf(termFromY);
	}

	/**
	 * @return 運輸区分.
	 */
	public String getTrafficDiv() {
		return trafficDiv;
	}

	/**
	 * @param trafficDiv .
	 */
	public void setTrafficDiv(String trafficDiv) {
		this.trafficDiv = trafficDiv;
	}

	/**
	 * @return 台数・組数管理フラグ.
	 */
	public String getUnitManageFlg() {
		return unitManageFlg;
	}

	/**
	 * @param unitManageFlg .
	 */
	public void setUnitManageFlg(String unitManageFlg) {
		this.unitManageFlg = unitManageFlg;
	}

	/**
	 * @return 有効期間.
	 */
	public String getValidPeriod() {
		return validPeriod;
	}

	/**
	 * @param validPeriod .
	 */
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = StringUtil.toHalf(validPeriod);
	}

	/**
	 * @return バウチャー券案内文(カナ）.
	 */
	public String getVoucherIntroKana() {
		return voucherIntroKana;
	}

	/**
	 * @param voucherIntroKana .
	 */
	public void setVoucherIntroKana(String voucherIntroKana) {
		this.voucherIntroKana = voucherIntroKana;
	}

	/**
	 * @return バウチャー券案内文（漢字）.
	 */
	public String getVoucherIntroKanji() {
		return voucherIntroKanji;
	}

	/**
	 * @param voucherIntroKanji .
	 */
	public void setVoucherIntroKanji(String voucherIntroKanji) {
		this.voucherIntroKanji = voucherIntroKanji;
	}

	/**
	 * 
	 * @return 提供期間終了年月日 .
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}

	/**
	 * 
	 * @param termEndYmd .
	 */
	public void setTermEndYmd(String termEndYmd) {
		this.termEndYmd = termEndYmd;
	}

	/**
	 * 
	 * @return 提供期間開始年月日.
	 */
	public String getTermFromYmd() {
		return termFromYmd;
	}

	/**
	 * 
	 * @param termFromYmd .
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
	}

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

	/**
	 * 
	 * @return .
	 */
	public String getMaxCapaPattern() {
		return maxCapaPattern;
	}

	/**
	 * 
	 * @param maxCapaPattern .
	 */
	public void setMaxCapaPattern(String maxCapaPattern) {
		this.maxCapaPattern = maxCapaPattern;
	}

}
