package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 *  NO1船車データクラス。.
 *  機能概要    ：  NO1船車データを格納する。
 *  特記事項    ：  無し
 * </pre>
 */
public class DNo1TrafficData extends PlanAnsBaseData implements IDNo1CommonData {

    /**
     * エリアコード
     */
    private String areaCd;

    /**
     * 手配有無 .
     */
    private String arrangementFlg;

    /**
     * 予約開始日 .
     */
    private String bookBeginDate;

    /**
     * 予約開始日 日 .
     */
    private String bookBeginDateD;

    /**
     * 予約開始日 月 .
     */
    private String bookBeginDateM;

    /**
     * 予約開始相対日
     */
    private String bookBeginRelativeDate;

    /**
     * 予約開始相対区分
     */
    private String bookBeginRelativeDiv;

    /**
     * 予約開始相対月
     */
    private String bookBeginRelativeMonth;

    /**
     * 用途 .
     */
    private String bookPurpose;

    /**
     * 取消料金説明 .
     */
    private String cancelFeeCmt;

    /**
     * 料金単位区分
     */
    private String chargeDiv;

    /**
     * 子供年齢From
     */
    private String childAgeFrom;

    /**
     * 子供年齢To
     */
    private String childAgeTo;

    /**
     * 会員券コース名(カナ） .
     */
    private String courseNmKana;

    /**
     * 会員券コース名(漢字） .
     */
    private String courseNmKanji;

    /**
     * 取扱手数料 .
     */
    private String dealFee;

    /**
     * 取扱手数料種別 .
     */
    private String dealFeeType;

    /**
     * 除外日 .
     */
    private String exceptDate;

    /**
     * 施設住所 .
     */
    private String facilityAddr;

    /**
     * 施設ファックス .
     */
    private String facilityFax;

    /**
     * 施設郵便番号 .
     */
    private String facilityPostCd;

    /**
     * 施設電話 .
     */
    private String facilityTel;

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
     * 等級
     */
    private String grade;

    /**
     * 通知先地区名
     */
    private String informAreaNm;

    /**
     * 通知先ファックス .
     */
    private String informFax;

    /**
     * 通知先名
     */
    private String informNm;

    /**
     * 取扱手数料存在するフラグ .
     */
    private String isDealFeeExist;

    /**
     * 手仕舞日 .
     */
    private String liquidateDay;

    /**
     * 手仕舞通知方法用否 .
     */
    private String liquidateInformFlg;

    /**
     * 手仕舞時刻（当日設定時）
     */
    private String liquidateTime;

    /**
     * 手仕舞時刻（当日設定時）（時）
     */
    private String liquidateTimeHour;

    /**
     * 手仕舞時刻（当日設定時）（分）
     */
    private String liquidateTimeMinute;

    /**
     * 提供料金人数上限 .
     */
    private String maxCapaPattern;

    /**
     * 備考 .
     */
    private String memo;

    /**
     * 複数料金パターンフラグ
     */
    private String multiFeePatternFlg;

    /**
     * 新規区分 .
     */
    private String newDiv;

    /**
     * 記事 .
     */
    private String news;

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
     * 代表者名 .
     */
    private String ownerNm;

    /**
     * 個札券出力指定有無 .
     */
    private String personalTicketPrintFlg;

    /**
     * 企画有無 .
     */
    private String planFlg;

    /**
     * 都道府県コード
     */
    private String prefecturesCd;

    /**
     * 地域コード
     */
    private String regionCd;

    /**
     * 予約通知方法用否 .
     */
    private String reserveInformWay;

    /**
     * シニア年齢From
     */
    private String seniorAgeFrom;

    /**
     * 特典 .
     */
    private String special;

    /**
     * 住所（在庫）
     */
    private String stockAddr;

    /**
     * 在庫制限フラグ .
     */
    private String stockControlFlg;

    /**
     * 在庫名称（カナ）
     */
    private String stockKana;

    /**
     * 在庫名称（漢字）
     */
    private String stockKanj;

    /**
     * 台数・組数管理フラグ .
     */
    private String stockManagement;

    /**
     * 在庫番号 .
     */
    private String stockNo;

    /**
     * 郵便番号（在庫）
     */
    private String stockPostCd;

    /**
     * 電話番号（在庫）
     */
    private String stockTel;

    /**
     * 在庫単位
     */
    private String stockUnit;

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
     * 提供期間終了年月日 .
     */
    private String termEndYmd;

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
     * 提供期間開始年月日 .
     */
    private String termFromYmd;

    /**
     * 運輸区分 .
     */
    private String trafficDiv;

    /**
     * 有効期間 .
     */
    private String validPeriod;

    /**
     * バウチャーレス可否
     */
    private String voucherFlg;

    /**
     * エリアコードを取得します。
     * 
     * @return エリアコード
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * @return .
     */
    public String getArrangementFlg() {
        return arrangementFlg;
    }

    /**
     * @return 予約開始日.
     */
    public String getBookBeginDate() {
        return bookBeginDate;
    }

    /**
     * @return 予約開始日 日.
     */
    public String getBookBeginDateD() {
        return bookBeginDateD;
    }

    /**
     * @return 予約開始日 月.
     */
    public String getBookBeginDateM() {
        return bookBeginDateM;
    }

    /**
     * 予約開始相対日を取得します。
     * 
     * @return 予約開始相対日
     */
    public String getBookBeginRelativeDate() {
        return bookBeginRelativeDate;
    }

    /**
     * 予約開始相対区分を取得します。
     * 
     * @return 予約開始相対区分
     */
    public String getBookBeginRelativeDiv() {
        return bookBeginRelativeDiv;
    }

    /**
     * 予約開始相対月を取得します。
     * 
     * @return 予約開始相対月
     */
    public String getBookBeginRelativeMonth() {
        return bookBeginRelativeMonth;
    }

    /**
     * @return 用途 .
     */
    public String getBookPurpose() {
        return bookPurpose;
    }

    /**
     * @return 取消料金説明.
     */
    public String getCancelFeeCmt() {
        return cancelFeeCmt;
    }

    /**
     * 料金単位区分を取得します。
     * 
     * @return 料金単位区分
     */
    public String getChargeDiv() {
        return chargeDiv;
    }

    /**
     * 子供年齢Fromを取得します。
     * 
     * @return 子供年齢From
     */
    public String getChildAgeFrom() {
        return childAgeFrom;
    }

    /**
     * 子供年齢Toを取得します。
     * 
     * @return 子供年齢To
     */
    public String getChildAgeTo() {
        return childAgeTo;
    }

    /**
     * @return 会員券コース名(カナ）.
     */
    public String getCourseNmKana() {
        return courseNmKana;
    }

    /**
     * @return 会員券コース名(漢字）.
     */
    public String getCourseNmKanji() {
        return courseNmKanji;
    }

    /**
     * @return 取扱手数料.
     */
    public String getDealFee() {

        // 取扱手数料種別は円の場合、小数を切り捨てる
        if (JreConstants.EnTypeFlg.equals(getDealFeeType())) {
            //数字ではないの場合、そのまま返す. jinhuashi 720501
            if (!DKikakuWebUtil.isNumber(dealFee)
                    && !DKikakuWebUtil.isFloat(dealFee)) {
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
     * 手数料の表示数字を取得.
     * 
     * @return かんま付き手数料
     */
    @Override
    public String getDealFeeDisplay() {
        if (!StringUtil.isEmpty(dealFee)
                && !StringUtil.isEmpty(getDealFeeType())
                && JreConstants.DEAL_FEE_YEN_VALUE.equals(getDealFeeType())) {
            return DKikakuWebUtil.formatCharge(dealFee);
        }
        return dealFee;
    }

    /**
     * @return 取扱手数料種別.
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * @return 除外日 .
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * @return 施設住所.
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * @return 施設ファックス .
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * @return 施設郵便番号 .
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * @return 施設電話.
     */
    public String getFacilityTel() {
        return facilityTel == null ? "" : facilityTel.trim();
    }

    /**
     * @return 商品コード.
     */
    public String getGoodsCd() {
        return goodsCd;
    }

    /**
     * 商品コード8桁 .を取得します。
     * 
     * @return 商品コード8桁 .
     */
    public String getGoodsCd1() {
        return goodsCd1;
    }

    /**
     * 商品コード2桁 .を取得します。
     * 
     * @return 商品コード2桁 .
     */
    public String getGoodsCd2() {
        return goodsCd2;
    }

    /**
     * @return 分類コード.
     */
    public String getGoodsKindCd() {
        return goodsKindCd;
    }

    /**
     * 等級を取得します。
     * 
     * @return 等級
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 通知先地区名を取得します。
     * 
     * @return 通知先地区名
     */
    public String getInformAreaNm() {
        return informAreaNm;
    }

    /**
     * @return 通知先ファックス.
     */
    public String getInformFax() {
        return StringUtils.trim(informFax);
    }

    /**
     * 通知先名を取得します。
     * 
     * @return 通知先名
     */
    public String getInformNm() {
        return informNm;
    }

    /**
     * @return 取扱手数料存在するフラグ.
     */
    public String getIsDealFeeExist() {
        return isDealFeeExist;
    }

    /**
     * @return 手仕舞日.
     */
    public String getLiquidateDay() {
        return liquidateDay;
    }

    /**
     * @return 手仕舞通知方法用否.
     */
    public String getLiquidateInformFlg() {
        return liquidateInformFlg;
    }

    /**
     * 手仕舞時刻（当日設定時）を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）
     */
    public String getLiquidateTime() {
        return liquidateTime;
    }

    /**
     * 手仕舞時刻（当日設定時）（時）を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）（時）
     */
    public String getLiquidateTimeHour() {
        return liquidateTimeHour;
    }

    /**
     * 手仕舞時刻（当日設定時）（分）を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）（分）
     */
    public String getLiquidateTimeMinute() {
        return liquidateTimeMinute;
    }

    /**
     * @return .
     */
    public String getMaxCapaPattern() {
        return maxCapaPattern;
    }

    /**
     * @return 備考.
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 複数料金パターンフラグを取得します。
     * 
     * @return 複数料金パターンフラグ
     */
    public String getMultiFeePatternFlg() {
        return multiFeePatternFlg;
    }

    /**
     * @return 新規区分.
     */
    public String getNewDiv() {
        return newDiv;
    }

    /**
     * @return 記事.
     */
    public String getNews() {
        return news;
    }

    /**
     * @return コピー元商品コード .
     */
    public String getOriginalGoodsCd() {
        return originalGoodsCd;
    }

    /**
     * コピー元商品コード8桁 .を取得します。
     * 
     * @return コピー元商品コード8桁 .
     */
    public String getOriginalGoodsCd1() {
        return originalGoodsCd1;
    }

    /**
     * コピー元商品コード2桁 .を取得します。
     * 
     * @return コピー元商品コード2桁 .
     */
    public String getOriginalGoodsCd2() {
        return originalGoodsCd2;
    }

    /**
     * @return 代表者名 .
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * @return 個札券出力指定有無.
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
    }

    /**
     * @return 企画有無 .
     */
    public String getPlanFlg() {
        return planFlg;
    }

    /**
     * 都道府県コードを取得します。
     * 
     * @return 都道府県コード
     */
    public String getPrefecturesCd() {
        return prefecturesCd;
    }

    /**
     * 地域コードを取得します。
     * 
     * @return 地域コード
     */
    public String getRegionCd() {
        return regionCd;
    }

    /**
     * 予約通知方法用否 .を取得します。
     * 
     * @return 予約通知方法用否 .
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * シニア年齢Fromを取得します。
     * 
     * @return シニア年齢From
     */
    public String getSeniorAgeFrom() {
        return seniorAgeFrom;
    }

    /**
     * @return 特典.
     */
    public String getSpecial() {
        return special;
    }

    /**
     * 住所（在庫）を取得します。
     * 
     * @return 住所（在庫）
     */
    public String getStockAddr() {
        return stockAddr;
    }

    /**
     * @return 在庫制限フラグ.
     */
    public String getStockControlFlg() {
        return stockControlFlg;
    }

    /**
     * 在庫名称（カナ）を取得します。
     * 
     * @return 在庫名称（カナ）
     */
    public String getStockKana() {
        return stockKana;
    }

    /**
     * 在庫名称（漢字）を取得します。
     * 
     * @return 在庫名称（漢字）
     */
    public String getStockKanj() {
        return stockKanj;
    }

    /**
     * @return 台数・組数管理フラグ.
     */
    public String getStockManagement() {
        return stockManagement;
    }

    /**
     * @return 在庫番号.
     */
    public String getStockNo() {
        return stockNo;
    }

    /**
     * 郵便番号（在庫）を取得します。
     * 
     * @return 郵便番号（在庫）
     */
    public String getStockPostCd() {
        return stockPostCd;
    }

    /**
     * 電話番号（在庫）を取得します。
     * 
     * @return 電話番号（在庫）
     */
    public String getStockTel() {
        return stockTel;
    }

    /**
     * 在庫単位を取得します。
     * 
     * @return 在庫単位
     */
    public String getStockUnit() {
        return stockUnit;
    }

    /**
     * @return 提供期間終了日 .
     */
    @Override
    public String getTermEndD() {
        return termEndD;
    }

    /**
     * @return 提供期間終了月.
     */
    @Override
    public String getTermEndM() {
        return termEndM;
    }

    /**
     * @return 提供期間終了年.
     */
    @Override
    public String getTermEndY() {
        return termEndY;
    }

    /**
     * @return 提供期間終了年月日 .
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * @return 提供期間開始日 .
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * @return 提供期間開始月.
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * @return 提供期間開始年 .
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * @return 提供期間開始年月日.
     */
    public String getTermFromYmd() {
        return termFromYmd;
    }

    /**
     * @return 運輸区分.
     */
    public String getTrafficDiv() {
        return trafficDiv;
    }

    /**
     * @return 有効期間.
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * バウチャーレス可否を取得します。
     * 
     * @return バウチャーレス可否
     */
    public String getVoucherFlg() {
        return voucherFlg;
    }

    /**
     * エリアコードを設定します。
     * 
     * @param areaCd
     *            エリアコード
     */
    public void setAreaCd(String areaCd) {
        this.areaCd = areaCd;
    }

    /**
     * @param arrangementFlg
     *            .
     */
    public void setArrangementFlg(String arrangementFlg) {
        this.arrangementFlg = arrangementFlg;
    }

    /**
     * @param bookBeginDate
     *            .
     */
    public void setBookBeginDate(String bookBeginDate) {
        this.bookBeginDate = bookBeginDate;
    }

    /**
     * @param bookBeginDateD
     *            .
     */
    public void setBookBeginDateD(String bookBeginDateD) {
        this.bookBeginDateD = bookBeginDateD;
    }

    /**
     * @param bookBeginDateM
     *            .
     */
    public void setBookBeginDateM(String bookBeginDateM) {
        this.bookBeginDateM = bookBeginDateM;
    }

    /**
     * 予約開始相対日を設定します。
     * 
     * @param bookBeginRelativeDate
     *            予約開始相対日
     */
    public void setBookBeginRelativeDate(String bookBeginRelativeDate) {
        this.bookBeginRelativeDate = bookBeginRelativeDate;
    }

    /**
     * 予約開始相対区分を設定します。
     * 
     * @param bookBeginRelativeDiv
     *            予約開始相対区分
     */
    public void setBookBeginRelativeDiv(String bookBeginRelativeDiv) {
        this.bookBeginRelativeDiv = bookBeginRelativeDiv;
    }

    /**
     * 予約開始相対月を設定します。
     * 
     * @param bookBeginRelativeMonth
     *            予約開始相対月
     */
    public void setBookBeginRelativeMonth(String bookBeginRelativeMonth) {
        this.bookBeginRelativeMonth = bookBeginRelativeMonth;
    }

    /**
     * @param bookPurpose
     *            .
     */
    public void setBookPurpose(String bookPurpose) {
        this.bookPurpose = bookPurpose;
    }

    /**
     * @param cancelFeeCmt
     *            .
     */
    public void setCancelFeeCmt(String cancelFeeCmt) {
        this.cancelFeeCmt = cancelFeeCmt;
    }

    /**
     * 料金単位区分を設定します。
     * 
     * @param chargeDiv
     *            料金単位区分
     */
    public void setChargeDiv(String chargeDiv) {
        this.chargeDiv = chargeDiv;
    }

    /**
     * 子供年齢Fromを設定します。
     * 
     * @param childAgeFrom
     *            子供年齢From
     */
    public void setChildAgeFrom(String childAgeFrom) {
        this.childAgeFrom = childAgeFrom;
    }

    /**
     * 子供年齢Toを設定します。
     * 
     * @param childAgeTo
     *            子供年齢To
     */
    public void setChildAgeTo(String childAgeTo) {
        this.childAgeTo = childAgeTo;
    }

    /**
     * @param courseNmKana
     *            .
     */
    public void setCourseNmKana(String courseNmKana) {
        this.courseNmKana = courseNmKana;
    }

    /**
     * @param courseNmKanji
     *            .
     */
    public void setCourseNmKanji(String courseNmKanji) {
        this.courseNmKanji = courseNmKanji;
    }

    /**
     * @param dealFee
     *            .
     */
    public void setDealFee(String dealFee) {
        this.dealFee = StringUtil.toHalf(dealFee);
    }

    /**
     * @param dealFeeType
     *            .
     */
    public void setDealFeeType(String dealFeeType) {
        this.dealFeeType = dealFeeType;
    }

    /**
     * @param exceptDate
     *            .
     */
    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    /**
     * @param facilityAddr
     *            .
     */
    public void setFacilityAddr(String facilityAddr) {
        this.facilityAddr = facilityAddr;
    }

    /**
     * @param facilityFax
     *            .
     */
    public void setFacilityFax(String facilityFax) {
        this.facilityFax = facilityFax;
    }

    /**
     * @param facilityPostCd
     *            .
     */
    public void setFacilityPostCd(String facilityPostCd) {
        this.facilityPostCd = facilityPostCd;
    }

    /**
     * @param facilityTel
     *            .
     */
    public void setFacilityTel(String facilityTel) {
        this.facilityTel = facilityTel;
    }

    /**
     * @param goodsCd
     *            .
     */
    public void setGoodsCd(String goodsCd) {
        this.goodsCd = goodsCd;
    }

    /**
     * 商品コード8桁 .を設定します。
     * 
     * @param goodsCd1
     *            商品コード8桁 .
     */
    public void setGoodsCd1(String goodsCd1) {
        this.goodsCd1 = goodsCd1;
    }

    /**
     * 商品コード2桁 .を設定します。
     * 
     * @param goodsCd2
     *            商品コード2桁 .
     */
    public void setGoodsCd2(String goodsCd2) {
        this.goodsCd2 = goodsCd2;
    }

    /**
     * @param goodsKindCd
     *            .
     */
    public void setGoodsKindCd(String goodsKindCd) {
        this.goodsKindCd = goodsKindCd;
    }

    /**
     * 等級を設定します。
     * 
     * @param grade
     *            等級
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 通知先地区名を設定します。
     * 
     * @param informAreaNm
     *            通知先地区名
     */
    public void setInformAreaNm(String informAreaNm) {
        this.informAreaNm = informAreaNm;
    }

    /**
     * @param informFax
     *            .
     */
    public void setInformFax(String informFax) {
        this.informFax = informFax;
    }

    /**
     * 通知先名を設定します。
     * 
     * @param informNm
     *            通知先名
     */
    public void setInformNm(String informNm) {
        this.informNm = informNm;
    }

    /**
     * @param isDealFeeExist
     *            .
     */
    public void setIsDealFeeExist(String isDealFeeExist) {
        this.isDealFeeExist = isDealFeeExist;
    }

    /**
     * @param liquidateDay
     *            .
     */
    public void setLiquidateDay(String liquidateDay) {
        this.liquidateDay = StringUtil.toHalf(liquidateDay);
    }

    /**
     * @param liquidateInformFlg
     *            .
     */
    public void setLiquidateInformFlg(String liquidateInformFlg) {
        this.liquidateInformFlg = liquidateInformFlg;
    }

    /**
     * 手仕舞時刻（当日設定時）を設定します。
     * 
     * @param liquidateTime
     *            手仕舞時刻（当日設定時）
     */
    public void setLiquidateTime(String liquidateTime) {
        this.liquidateTime = liquidateTime;
    }

    /**
     * 手仕舞時刻（当日設定時）（時）を設定します。
     * 
     * @param liquidateTimeHour
     *            手仕舞時刻（当日設定時）（時）
     */
    public void setLiquidateTimeHour(String liquidateTimeHour) {
        this.liquidateTimeHour = liquidateTimeHour;
    }

    /**
     * 手仕舞時刻（当日設定時）（分）を設定します。
     * 
     * @param liquidateTimeMinute
     *            手仕舞時刻（当日設定時）（分）
     */
    public void setLiquidateTimeMinute(String liquidateTimeMinute) {
        this.liquidateTimeMinute = liquidateTimeMinute;
    }

    /**
     * @param maxCapaPattern
     *            .
     */
    public void setMaxCapaPattern(String maxCapaPattern) {
        this.maxCapaPattern = maxCapaPattern;
    }

    /**
     * @param memo
     *            .
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 複数料金パターンフラグを設定します。
     * 
     * @param multiFeePatternFlg
     *            複数料金パターンフラグ
     */
    public void setMultiFeePatternFlg(String multiFeePatternFlg) {
        this.multiFeePatternFlg = multiFeePatternFlg;
    }

    /**
     * @param newDiv
     *            .
     */
    public void setNewDiv(String newDiv) {
        this.newDiv = newDiv;
    }

    /**
     * @param news
     *            .
     */
    public void setNews(String news) {
        this.news = news;
    }

    /**
     * @param originalGoodsCd
     *            .
     */
    public void setOriginalGoodsCd(String originalGoodsCd) {
        this.originalGoodsCd = originalGoodsCd;
    }

    /**
     * コピー元商品コード8桁 .を設定します。
     * 
     * @param originalGoodsCd1
     *            コピー元商品コード8桁 .
     */
    public void setOriginalGoodsCd1(String originalGoodsCd1) {
        this.originalGoodsCd1 = originalGoodsCd1;
    }

    /**
     * コピー元商品コード2桁 .を設定します。
     * 
     * @param originalGoodsCd2
     *            コピー元商品コード2桁 .
     */
    public void setOriginalGoodsCd2(String originalGoodsCd2) {
        this.originalGoodsCd2 = originalGoodsCd2;
    }

    /**
     * @param ownerNm
     *            .
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * @param personalTicketPrintFlg
     *            .
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
    }

    /**
     * @param planFlg
     *            .
     */
    public void setPlanFlg(String planFlg) {
        this.planFlg = planFlg;
    }

    /**
     * 都道府県コードを設定します。
     * 
     * @param prefecturesCd
     *            都道府県コード
     */
    public void setPrefecturesCd(String prefecturesCd) {
        this.prefecturesCd = prefecturesCd;
    }

    /**
     * 地域コードを設定します。
     * 
     * @param regionCd
     *            地域コード
     */
    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    /**
     * 予約通知方法用否 .を設定します。
     * 
     * @param reserveInformWay
     *            予約通知方法用否 .
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * シニア年齢Fromを設定します。
     * 
     * @param seniorAgeFrom
     *            シニア年齢From
     */
    public void setSeniorAgeFrom(String seniorAgeFrom) {
        this.seniorAgeFrom = seniorAgeFrom;
    }

    /**
     * @param special
     *            .
     */
    public void setSpecial(String special) {
        this.special = special;
    }

    /**
     * 住所（在庫）を設定します。
     * 
     * @param stockAddr
     *            住所（在庫）
     */
    public void setStockAddr(String stockAddr) {
        this.stockAddr = stockAddr;
    }

    /**
     * @param stockControlFlg
     *            .
     */
    public void setStockControlFlg(String stockControlFlg) {
        this.stockControlFlg = stockControlFlg;
    }

    /**
     * 在庫名称（カナ）を設定します。
     * 
     * @param stockKana
     *            在庫名称（カナ）
     */
    public void setStockKana(String stockKana) {
        this.stockKana = stockKana;
    }

    /**
     * 在庫名称（漢字）を設定します。
     * 
     * @param stockKanj
     *            在庫名称（漢字）
     */
    public void setStockKanj(String stockKanj) {
        this.stockKanj = stockKanj;
    }

    /**
     * @param stockManagement
     *            .
     */
    public void setStockManagement(String stockManagement) {
        this.stockManagement = stockManagement;
    }

    /**
     * @param stockNo
     *            .
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    /**
     * 郵便番号（在庫）を設定します。
     * 
     * @param stockPostCd
     *            郵便番号（在庫）
     */
    public void setStockPostCd(String stockPostCd) {
        this.stockPostCd = stockPostCd;
    }

    /**
     * 電話番号（在庫）を設定します。
     * 
     * @param stockTel
     *            電話番号（在庫）
     */
    public void setStockTel(String stockTel) {
        this.stockTel = stockTel;
    }

    /**
     * 在庫単位を設定します。
     * 
     * @param stockUnit
     *            在庫単位
     */
    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    /**
     * @param termEndD
     *            .
     */
    @Override
    public void setTermEndD(String termEndD) {
        this.termEndD = StringUtil.toHalf(termEndD);
    }

    /**
     * @param termEndM
     *            .
     */
    @Override
    public void setTermEndM(String termEndM) {
        this.termEndM = StringUtil.toHalf(termEndM);
    }

    /**
     * @param termEndY
     *            .
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = StringUtil.toHalf(termEndY);
    }

    /**
     * @param termEndYmd
     *            .
     */
    public void setTermEndYmd(String termEndYmd) {
        this.termEndYmd = termEndYmd;
    }

    /**
     * @param termFromD
     *            .
     */
    @Override
    public void setTermFromD(String termFromD) {
        this.termFromD = StringUtil.toHalf(termFromD);
    }

    /**
     * @param termFromM
     *            .
     */
    @Override
    public void setTermFromM(String termFromM) {
        this.termFromM = StringUtil.toHalf(termFromM);
    }

    /**
     * @param termFromY
     *            .
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = StringUtil.toHalf(termFromY);
    }

    /**
     * @param termFromYmd
     *            .
     */
    public void setTermFromYmd(String termFromYmd) {
        this.termFromYmd = termFromYmd;
    }

    /**
     * @param trafficDiv
     *            .
     */
    public void setTrafficDiv(String trafficDiv) {
        this.trafficDiv = trafficDiv;
    }

    /**
     * @param validPeriod
     *            .
     */
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = StringUtil.toHalf(validPeriod);
    }

    /**
     * バウチャーレス可否を設定します。
     * 
     * @param voucherFlg
     *            バウチャーレス可否
     */
    public void setVoucherFlg(String voucherFlg) {
        this.voucherFlg = voucherFlg;
    }

}
