package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 *  NO1観光データクラス。.
 *  機能概要    ：  NO1観光データを格納する。
 *  特記事項    ：  無し
 * </pre>
 * 
 * @author zzy
 * @version 0.1 2006/11/17
 */
public class No1TravelData extends PlanAnsBaseData implements INo1CommonData {
	/**
	 * @return 手数料の表示形式の取得.
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
	 * 手配 .
	 */
	private String arrangementFlg;

	/**
	 * 企画 .
	 */
	private String planFlg;

	/**
	 * 新規区分 .
	 */
	private String newDiv;

	/**
	 * コピー元商品コード .
	 */
	private String originalGoodsCd;

	/**
	 * コピー元商品コード1 .
	 */
	private String originalGoodsCd1;

	/**
	 * コピー元商品コード2 .
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
	 * 商品コード1 .
	 */
	private String goodsCd1;

	/**
	 * 商品コード2 .
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
	 * 地区名（カナ） .
	 */
	private String areaNmKana;

	/**
	 * 地区名（漢字） .
	 */
	private String areaNmKanji;

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
	 * 予約種別 .
	 */
	private String bookKind;

	/**
	 * 用途 .
	 */
	private String bookPurpose;

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
	 * 食事場所 .
	 */
	private String mealSite;

	/**
	 * 休憩場所 .
	 */
	private String restSite;

	/**
	 * 浴室清掃開始 .
	 */
	private String bathCleanBegin;

	/**
	 * 浴室清掃終了 .
	 */
	private String bathCleanEnd;

	/**
	 * 浴室清掃開始 時 .
	 */
	private String bathCleanBeginH;

	/**
	 * 浴室清掃開始 分 .
	 */
	private String bathCleanBeginM;

	/**
	 * 浴室清掃終了 時 .
	 */
	private String bathCleanEndH;

	/**
	 * 浴室清掃終了 分 .
	 */
	private String bathCleanEndM;

	/**
	 * 予備項目１ .
	 */
	private String otherItem1;

	/**
	 * 予備項目１開始 .
	 */
	private String otherItem1Begin;

	/**
	 * 予備項目１終了 .
	 */
	private String otherItem1End;

	/**
	 * 予備項目２ .
	 */
	private String otherItem2;

	/**
	 * 予備項目２開始 .
	 */
	private String otherItem2Begin;

	/**
	 * 予備項目２終了 .
	 */
	private String otherItem2End;

	/**
	 * 予備項目３ .
	 */
	private String otherItem3;

	/**
	 * 予備項目３開始 .
	 */
	private String otherItem3Begin;

	/**
	 * 予備項目３終了 .
	 */
	private String otherItem3End;

	/**
	 * 予備項目１開始 時 .
	 */
	private String otherItem1BeginH;

	/**
	 * 予備項目１開始 分 .
	 */
	private String otherItem1BeginM;

	/**
	 * 予備項目２開始 時 .
	 */
	private String otherItem2BeginH;

	/**
	 * 予備項目２開始 分 .
	 */
	private String otherItem2BeginM;

	/**
	 * 予備項目３開始 時 .
	 */
	private String otherItem3BeginH;

	/**
	 * 予備項目３開始 分 .
	 */
	private String otherItem3BeginM;

	/**
	 * 予備項目１終了 時 .
	 */
	private String otherItem1EndH;

	/**
	 * 予備項目１終了 分 .
	 */
	private String otherItem1EndM;

	/**
	 * 予備項目２終了 時 .
	 */
	private String otherItem2EndH;

	/**
	 * 予備項目２終了 分 .
	 */
	private String otherItem2EndM;

	/**
	 * 予備項目３終了 時 .
	 */
	private String otherItem3EndH;

	/**
	 * 予備項目３終了 分 .
	 */
	private String otherItem3EndM;

	/**
	 * 付加サービス１ .
	 */
	private String additionalService1;

	/**
	 * 付加サービス２ .
	 */
	private String additionalService2;

	/**
	 * 付加サービス３ .
	 */
	private String additionalService3;

	/**
	 * 自由入力欄 .
	 */
	private String freelyColumn;

	/**
	 * 提供料金人数上限 .
	 */
	private String maxCapaPattern;

	/**
	 * @return .
	 */
	public String getAdditionalService1() {
		return additionalService1;
	}

	/**
	 * @param additionalService1 .
	 */
	public void setAdditionalService1(String additionalService1) {
		this.additionalService1 = additionalService1;
	}

	/**
	 * @return 付加サービス２ .
	 */
	public String getAdditionalService2() {
		return additionalService2;
	}

	/**
	 * @param additionalService2 .
	 */
	public void setAdditionalService2(String additionalService2) {
		this.additionalService2 = additionalService2;
	}

	/**
	 * @return 付加サービス３.
	 */
	public String getAdditionalService3() {
		return additionalService3;
	}

	/**
	 * @param additionalService3 .
	 */
	public void setAdditionalService3(String additionalService3) {
		this.additionalService3 = additionalService3;
	}

	/**
	 * @return 地区名（カナ）.
	 */
	public String getAreaNmKana() {
		return areaNmKana;
	}

	/**
	 * @param areaNmKana .
	 */
	public void setAreaNmKana(String areaNmKana) {
		this.areaNmKana = areaNmKana;
	}

	/**
	 * @return 地区名（漢字）.
	 */
	public String getAreaNmKanji() {
		return areaNmKanji;
	}

	/**
	 * @param areaNmKanji .
	 */
	public void setAreaNmKanji(String areaNmKanji) {
		this.areaNmKanji = areaNmKanji;
	}

	/**
	 * @return 浴室清掃開始 .
	 */
	public String getBathCleanBegin() {
		return bathCleanBegin;
	}

	/**
	 * @param bathCleanBegin .
	 */
	public void setBathCleanBegin(String bathCleanBegin) {
		this.bathCleanBegin = bathCleanBegin;
	}

	/**
	 * @return 浴室清掃終了.
	 */
	public String getBathCleanEnd() {
		return bathCleanEnd;
	}

	/**
	 * @param bathCleanEnd .
	 */
	public void setBathCleanEnd(String bathCleanEnd) {
		this.bathCleanEnd = bathCleanEnd;
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
	 * @return 予約種別.
	 */
	public String getBookKind() {
		return bookKind;
	}

	/**
	 * @param bookKind .
	 */
	public void setBookKind(String bookKind) {
		this.bookKind = bookKind;
	}

	/**
	 * @return 用途.
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
	 * @return 取扱手数料種別 .
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
	 * @return 除外日.
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
	 * @return 施設ファックス.
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
	 * @return 施設郵便番号.
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
	 * @return 自由入力欄.
	 */
	public String getFreelyColumn() {
		return freelyColumn;
	}

	/**
	 * @param freelyColumn .
	 */
	public void setFreelyColumn(String freelyColumn) {
		this.freelyColumn = freelyColumn;
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
	 * @return 食事場所.
	 */
	public String getMealSite() {
		return mealSite;
	}

	/**
	 * @param mealSite .
	 */
	public void setMealSite(String mealSite) {
		this.mealSite = mealSite;
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
	 * @return コピー元商品コード.
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
	 * @return 予備項目１ .
	 */
	public String getOtherItem1() {
		return otherItem1;
	}

	/**
	 * @param otherItem1 .
	 */
	public void setOtherItem1(String otherItem1) {
		this.otherItem1 = otherItem1;
	}

	/**
	 * @return 予備項目１開始.
	 */
	public String getOtherItem1Begin() {
		return otherItem1Begin;
	}

	/**
	 * @param otherItem1Begin .
	 */
	public void setOtherItem1Begin(String otherItem1Begin) {
		this.otherItem1Begin = otherItem1Begin;
	}

	/**
	 * @return 予備項目１終了.
	 */
	public String getOtherItem1End() {
		return otherItem1End;
	}

	/**
	 * @param otherItem1End .
	 */
	public void setOtherItem1End(String otherItem1End) {
		this.otherItem1End = otherItem1End;
	}

	/**
	 * @return 予備項目２ .
	 */
	public String getOtherItem2() {
		return otherItem2;
	}

	/**
	 * @param otherItem2 .
	 */
	public void setOtherItem2(String otherItem2) {
		this.otherItem2 = otherItem2;
	}

	/**
	 * @return 予備項目２開始.
	 */
	public String getOtherItem2Begin() {
		return otherItem2Begin;
	}

	/**
	 * @param otherItem2Begin .
	 */
	public void setOtherItem2Begin(String otherItem2Begin) {
		this.otherItem2Begin = otherItem2Begin;
	}

	/**
	 * @return 予備項目２終了.
	 */
	public String getOtherItem2End() {
		return otherItem2End;
	}

	/**
	 * @param otherItem2End .
	 */
	public void setOtherItem2End(String otherItem2End) {
		this.otherItem2End = otherItem2End;
	}

	/**
	 * @return 予備項目３.
	 */
	public String getOtherItem3() {
		return otherItem3;
	}

	/**
	 * @param otherItem3 .
	 */
	public void setOtherItem3(String otherItem3) {
		this.otherItem3 = otherItem3;
	}

	/**
	 * @return 予備項目３開始.
	 */
	public String getOtherItem3Begin() {
		return otherItem3Begin;
	}

	/**
	 * @param otherItem3Begin .
	 */
	public void setOtherItem3Begin(String otherItem3Begin) {
		this.otherItem3Begin = otherItem3Begin;
	}

	/**
	 * @return 予備項目３終了.
	 */
	public String getOtherItem3End() {
		return otherItem3End;
	}

	/**
	 * @param otherItem3End .
	 */
	public void setOtherItem3End(String otherItem3End) {
		this.otherItem3End = otherItem3End;
	}

	/**
	 * @return 代表者名.
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
	 * @return 休憩場所.
	 */
	public String getRestSite() {
		return restSite;
	}

	/**
	 * @param restSite .
	 */
	public void setRestSite(String restSite) {
		this.restSite = restSite;
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
	 * @return 在庫番号 .
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
	 * @return 提供期間終了年月日.
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}

	/**
	 * @param termEndYmd .
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
	 * @param termFromYmd .
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
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
	 * @return コピー元商品コード1.
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
	 * @return コピー元商品コード2.
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
	 * 
	 * @return 商品コード1.
	 */
	public String getGoodsCd1() {
		return goodsCd1;
	}

	/**
	 * 
	 * @param goodsCd1 .
	 */
	public void setGoodsCd1(String goodsCd1) {
		this.goodsCd1 = goodsCd1;
	}

	/**
	 * 
	 * @return 商品コード2.
	 */
	public String getGoodsCd2() {
		return goodsCd2;
	}

	/**
	 * 
	 * @param goodsCd2 .
	 */
	public void setGoodsCd2(String goodsCd2) {
		this.goodsCd2 = goodsCd2;
	}

	/**
	 * 
	 * @return 予約開始日 月 .
	 */
	public String getBookBeginDateM() {
		return bookBeginDateM;
	}

	/**
	 * 
	 * @param bookBeginDateM .
	 */
	public void setBookBeginDateM(String bookBeginDateM) {
		this.bookBeginDateM = bookBeginDateM;
	}

	/**
	 * 
	 * @return 予約開始日 日.
	 */
	public String getBookBeginDateD() {
		return bookBeginDateD;
	}

	/**
	 * 
	 * @param bookBeginDateD .
	 */
	public void setBookBeginDateD(String bookBeginDateD) {
		this.bookBeginDateD = bookBeginDateD;
	}

	/**
	 * @return 提供期間終了日.
	 */
	public String getTermEndD() {
		return termEndD;
	}

	/**
	 * @return 提供期間終了月.
	 */
	public String getTermEndM() {
		return termEndM;
	}

	/**
	 * @return 提供期間終了年.
	 */
	public String getTermEndY() {
		return termEndY;
	}

	/**
	 * @return 提供期間開始日.
	 */
	public String getTermFromD() {
		return termFromD;
	}

	/**
	 * @return 提供期間開始月 .
	 */
	public String getTermFromM() {
		return termFromM;
	}

	/**
	 * @return 提供期間開始年.
	 */
	public String getTermFromY() {
		return termFromY;
	}

	/**
	 * @param termEndD .
	 */
	public void setTermEndD(String termEndD) {
		this.termEndD = StringUtil.toHalf(termEndD);
	}

	/**
	 * @param termEndM .
	 */
	public void setTermEndM(String termEndM) {
		this.termEndM = StringUtil.toHalf(termEndM);
	}

	/**
	 * @param termEndY .
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = StringUtil.toHalf(termEndY);
	}

	/**
	 * @param termFromD .
	 */
	public void setTermFromD(String termFromD) {
		this.termFromD = StringUtil.toHalf(termFromD);
	}

	/**
	 * @param termFromM .
	 */
	public void setTermFromM(String termFromM) {
		this.termFromM = StringUtil.toHalf(termFromM);
	}

	/**
	 * @param termFromY .
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = StringUtil.toHalf(termFromY);
	}

	/**
	 * @return 浴室清掃開始 時.
	 */
	public String getBathCleanBeginH() {
		return bathCleanBeginH;
	}

	/**
	 * @param bathCleanBeginH .
	 */
	public void setBathCleanBeginH(String bathCleanBeginH) {
		this.bathCleanBeginH = bathCleanBeginH;
	}

	/**
	 * @return 浴室清掃開始 分.
	 */
	public String getBathCleanBeginM() {
		return bathCleanBeginM;
	}

	/**
	 * @param bathCleanBeginM .
	 */
	public void setBathCleanBeginM(String bathCleanBeginM) {
		this.bathCleanBeginM = bathCleanBeginM;
	}

	/**
	 * @return 浴室清掃終了 時 .
	 */
	public String getBathCleanEndH() {
		return bathCleanEndH;
	}

	/**
	 * @param bathCleanEndH .
	 */
	public void setBathCleanEndH(String bathCleanEndH) {
		this.bathCleanEndH = bathCleanEndH;
	}

	/**
	 * @return 浴室清掃終了 分.
	 */
	public String getBathCleanEndM() {
		return bathCleanEndM;
	}

	/**
	 * @param bathCleanEndM .
	 */
	public void setBathCleanEndM(String bathCleanEndM) {
		this.bathCleanEndM = bathCleanEndM;
	}

	/**
	 * @return 予備項目１開始 時.
	 */
	public String getOtherItem1BeginH() {
		return otherItem1BeginH;
	}

	/**
	 * @param otherItem1BeginH .
	 */
	public void setOtherItem1BeginH(String otherItem1BeginH) {
		this.otherItem1BeginH = otherItem1BeginH;
	}

	/**
	 * @return 予備項目１開始 分.
	 */
	public String getOtherItem1BeginM() {
		return otherItem1BeginM;
	}

	/**
	 * @param otherItem1BeginM .
	 */
	public void setOtherItem1BeginM(String otherItem1BeginM) {
		this.otherItem1BeginM = otherItem1BeginM;
	}

	/**
	 * @return 予備項目１終了 時.
	 */
	public String getOtherItem1EndH() {
		return otherItem1EndH;
	}

	/**
	 * @param otherItem1EndH .
	 */
	public void setOtherItem1EndH(String otherItem1EndH) {
		this.otherItem1EndH = otherItem1EndH;
	}

	/**
	 * @return 予備項目１終了 分.
	 */
	public String getOtherItem1EndM() {
		return otherItem1EndM;
	}

	/**
	 * @param otherItem1EndM .
	 */
	public void setOtherItem1EndM(String otherItem1EndM) {
		this.otherItem1EndM = otherItem1EndM;
	}

	/**
	 * @return 予備項目２開始 時 .
	 */
	public String getOtherItem2BeginH() {
		return otherItem2BeginH;
	}

	/**
	 * @param otherItem2BeginH .
	 */
	public void setOtherItem2BeginH(String otherItem2BeginH) {
		this.otherItem2BeginH = otherItem2BeginH;
	}

	/**
	 * @return 予備項目２開始 分.
	 */
	public String getOtherItem2BeginM() {
		return otherItem2BeginM;
	}

	/**
	 * @param otherItem2BeginM .
	 */
	public void setOtherItem2BeginM(String otherItem2BeginM) {
		this.otherItem2BeginM = otherItem2BeginM;
	}

	/**
	 * @return 予備項目２終了 時.
	 */
	public String getOtherItem2EndH() {
		return otherItem2EndH;
	}

	/**
	 * @param otherItem2EndH .
	 */
	public void setOtherItem2EndH(String otherItem2EndH) {
		this.otherItem2EndH = otherItem2EndH;
	}

	/**
	 * @return 予備項目２終了 分.
	 */
	public String getOtherItem2EndM() {
		return otherItem2EndM;
	}

	/**
	 * @param otherItem2EndM .
	 */
	public void setOtherItem2EndM(String otherItem2EndM) {
		this.otherItem2EndM = otherItem2EndM;
	}

	/**
	 * @return 予備項目３開始 時.
	 */
	public String getOtherItem3BeginH() {
		return otherItem3BeginH;
	}

	/**
	 * @param otherItem3BeginH .
	 */
	public void setOtherItem3BeginH(String otherItem3BeginH) {
		this.otherItem3BeginH = otherItem3BeginH;
	}

	/**
	 * @return 予備項目３開始 分.
	 */
	public String getOtherItem3BeginM() {
		return otherItem3BeginM;
	}

	/**
	 * @param otherItem3BeginM .
	 */
	public void setOtherItem3BeginM(String otherItem3BeginM) {
		this.otherItem3BeginM = otherItem3BeginM;
	}

	/**
	 * @return 予備項目３終了 時 .
	 */
	public String getOtherItem3EndH() {
		return otherItem3EndH;
	}

	/**
	 * @param otherItem3EndH .
	 */
	public void setOtherItem3EndH(String otherItem3EndH) {
		this.otherItem3EndH = otherItem3EndH;
	}

	/**
	 * @return 予備項目３終了 分.
	 */
	public String getOtherItem3EndM() {
		return otherItem3EndM;
	}

	/**
	 * @param otherItem3EndM .
	 */
	public void setOtherItem3EndM(String otherItem3EndM) {
		this.otherItem3EndM = otherItem3EndM;
	}

	/**
	 * 
	 * @return arrangementFlg
	 */
	public String getArrangementFlg() {
		return arrangementFlg;
	}

	/**
	 * 
	 * @param arrangementFlg
	 *            arrangementFlg
	 */
	public void setArrangementFlg(String arrangementFlg) {
		this.arrangementFlg = arrangementFlg;
	}

	/**
	 * 
	 * @return planFlg
	 */
	public String getPlanFlg() {
		return planFlg;
	}

	/**
	 * 
	 * @param planFlg
	 *            planFlg
	 */
	public void setPlanFlg(String planFlg) {
		this.planFlg = planFlg;
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
