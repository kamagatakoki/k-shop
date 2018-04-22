package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 *  [DP/RM]NO1_観光データクラス。
 *  機能概要    ：  [DP/RM]NO1_観光データを格納する。
 *  特記事項    ：  無し
 * </pre>
 */
public class DNo1TravelData extends PlanAnsBaseData implements IDNo1CommonData {

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
     * エリアコード
     */
    private String areaCd;

    /**
     * 地区名（カナ） .
     */
    private String areaNmKana;

    /**
     * 地区名（漢字） .
     */
    private String areaNmKanji;

    /**
     * 手配 .
     */
    private String arrangementFlg;

    /**
     * 浴室清掃開始 .
     */
    private String bathCleanBegin;

    /**
     * 浴室清掃開始 時 .
     */
    private String bathCleanBeginH;

    /**
     * 浴室清掃開始 分 .
     */
    private String bathCleanBeginM;

    /**
     * 浴室清掃終了 .
     */
    private String bathCleanEnd;

    /**
     * 浴室清掃終了 時 .
     */
    private String bathCleanEndH;

    /**
     * 浴室清掃終了 分 .
     */
    private String bathCleanEndM;

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
     * 予約種別 .
     */
    private String bookKind;

    /**
     * 用途 .
     */
    private String bookPurpose;

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
     * 自由入力欄 .
     */
    private String freelyColumn;

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
     * 食事場所 .
     */
    private String mealSite;

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
     * 予備項目１ .
     */
    private String otherItem1;

    /**
     * 予備項目１開始 .
     */
    private String otherItem1Begin;

    /**
     * 予備項目１開始 時 .
     */
    private String otherItem1BeginH;

    /**
     * 予備項目１開始 分 .
     */
    private String otherItem1BeginM;

    /**
     * 予備項目１終了 .
     */
    private String otherItem1End;

    /**
     * 予備項目１終了 時 .
     */
    private String otherItem1EndH;

    /**
     * 予備項目１終了 分 .
     */
    private String otherItem1EndM;

    /**
     * 予備項目２ .
     */
    private String otherItem2;

    /**
     * 予備項目２開始 .
     */
    private String otherItem2Begin;

    /**
     * 予備項目２開始 時 .
     */
    private String otherItem2BeginH;

    /**
     * 予備項目２開始 分 .
     */
    private String otherItem2BeginM;

    /**
     * 予備項目２終了 .
     */
    private String otherItem2End;

    /**
     * 予備項目２終了 時 .
     */
    private String otherItem2EndH;

    /**
     * 予備項目２終了 分 .
     */
    private String otherItem2EndM;

    /**
     * 予備項目３ .
     */
    private String otherItem3;

    /**
     * 予備項目３開始 .
     */
    private String otherItem3Begin;

    /**
     * 予備項目３開始 時 .
     */
    private String otherItem3BeginH;

    /**
     * 予備項目３開始 分 .
     */
    private String otherItem3BeginM;

    /**
     * 予備項目３終了 .
     */
    private String otherItem3End;

    /**
     * 予備項目３終了 時 .
     */
    private String otherItem3EndH;

    /**
     * 予備項目３終了 分 .
     */
    private String otherItem3EndM;

    /**
     * 代表者名 .
     */
    private String ownerNm;

    /**
     * 指定パーク名
     */
    private String parkFlg;

    /**
     * 個札券出力指定有無
     */
    private String personalTicketPrintFlg;

    /**
     * 企画 .
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
     * 休憩場所 .
     */
    private String restSite;

    /**
     * シニア年齢From
     */
    private String seniorAgeFrom;

    /**
     * 住所
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
     * 在庫管理方法
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
     * 台数・組数管理フラグ .
     */
    private String unitManageFlg;

    /**
     * 有効期間 .
     */
    private String validPeriod;

    /**
     * バウチャーレス可否
     */
    private String voucherFlg;

    /**
     * @return .
     */
    public String getAdditionalService1() {
        return additionalService1;
    }

    /**
     * @return 付加サービス２ .
     */
    public String getAdditionalService2() {
        return additionalService2;
    }

    /**
     * @return 付加サービス３.
     */
    public String getAdditionalService3() {
        return additionalService3;
    }

    /**
     * エリアコードを取得します。
     * 
     * @return エリアコード
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * @return 地区名（カナ）.
     */
    public String getAreaNmKana() {
        return areaNmKana;
    }

    /**
     * @return 地区名（漢字）.
     */
    public String getAreaNmKanji() {
        return areaNmKanji;
    }

    /**
     * @return arrangementFlg
     */
    public String getArrangementFlg() {
        return arrangementFlg;
    }

    /**
     * @return 浴室清掃開始 .
     */
    public String getBathCleanBegin() {
        return bathCleanBegin;
    }

    /**
     * @return 浴室清掃開始 時.
     */
    public String getBathCleanBeginH() {
        return bathCleanBeginH;
    }

    /**
     * @return 浴室清掃開始 分.
     */
    public String getBathCleanBeginM() {
        return bathCleanBeginM;
    }

    /**
     * @return 浴室清掃終了.
     */
    public String getBathCleanEnd() {
        return bathCleanEnd;
    }

    /**
     * @return 浴室清掃終了 時 .
     */
    public String getBathCleanEndH() {
        return bathCleanEndH;
    }

    /**
     * @return 浴室清掃終了 分.
     */
    public String getBathCleanEndM() {
        return bathCleanEndM;
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
     * @return 予約開始日 月 .
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
     * @return 予約種別.
     */
    public String getBookKind() {
        return bookKind;
    }

    /**
     * @return 用途.
     */
    public String getBookPurpose() {
        return bookPurpose;
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
     * @return 手数料の表示形式の取得.
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
     * @return 取扱手数料種別 .
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * @return 除外日.
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
     * @return 施設ファックス.
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * @return 施設郵便番号.
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
     * @return 自由入力欄.
     */
    public String getFreelyColumn() {
        return freelyColumn;
    }

    /**
     * @return 商品コード.
     */
    public String getGoodsCd() {
        return goodsCd;
    }

    /**
     * @return 商品コード1.
     */
    public String getGoodsCd1() {
        return goodsCd1;
    }

    /**
     * @return 商品コード2.
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
     * @return 食事場所.
     */
    public String getMealSite() {
        return mealSite;
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
     * @return コピー元商品コード.
     */
    public String getOriginalGoodsCd() {
        return originalGoodsCd;
    }

    /**
     * @return コピー元商品コード1.
     */
    public String getOriginalGoodsCd1() {
        return originalGoodsCd1;
    }

    /**
     * @return コピー元商品コード2.
     */
    public String getOriginalGoodsCd2() {
        return originalGoodsCd2;
    }

    /**
     * @return 予備項目１ .
     */
    public String getOtherItem1() {
        return otherItem1;
    }

    /**
     * @return 予備項目１開始.
     */
    public String getOtherItem1Begin() {
        return otherItem1Begin;
    }

    /**
     * @return 予備項目１開始 時.
     */
    public String getOtherItem1BeginH() {
        return otherItem1BeginH;
    }

    /**
     * @return 予備項目１開始 分.
     */
    public String getOtherItem1BeginM() {
        return otherItem1BeginM;
    }

    /**
     * @return 予備項目１終了.
     */
    public String getOtherItem1End() {
        return otherItem1End;
    }

    /**
     * @return 予備項目１終了 時.
     */
    public String getOtherItem1EndH() {
        return otherItem1EndH;
    }

    /**
     * @return 予備項目１終了 分.
     */
    public String getOtherItem1EndM() {
        return otherItem1EndM;
    }

    /**
     * @return 予備項目２ .
     */
    public String getOtherItem2() {
        return otherItem2;
    }

    /**
     * @return 予備項目２開始.
     */
    public String getOtherItem2Begin() {
        return otherItem2Begin;
    }

    /**
     * @return 予備項目２開始 時 .
     */
    public String getOtherItem2BeginH() {
        return otherItem2BeginH;
    }

    /**
     * @return 予備項目２開始 分.
     */
    public String getOtherItem2BeginM() {
        return otherItem2BeginM;
    }

    /**
     * @return 予備項目２終了.
     */
    public String getOtherItem2End() {
        return otherItem2End;
    }

    /**
     * @return 予備項目２終了 時.
     */
    public String getOtherItem2EndH() {
        return otherItem2EndH;
    }

    /**
     * @return 予備項目２終了 分.
     */
    public String getOtherItem2EndM() {
        return otherItem2EndM;
    }

    /**
     * @return 予備項目３.
     */
    public String getOtherItem3() {
        return otherItem3;
    }

    /**
     * @return 予備項目３開始.
     */
    public String getOtherItem3Begin() {
        return otherItem3Begin;
    }

    /**
     * @return 予備項目３開始 時.
     */
    public String getOtherItem3BeginH() {
        return otherItem3BeginH;
    }

    /**
     * @return 予備項目３開始 分.
     */
    public String getOtherItem3BeginM() {
        return otherItem3BeginM;
    }

    /**
     * @return 予備項目３終了.
     */
    public String getOtherItem3End() {
        return otherItem3End;
    }

    /**
     * @return 予備項目３終了 時 .
     */
    public String getOtherItem3EndH() {
        return otherItem3EndH;
    }

    /**
     * @return 予備項目３終了 分.
     */
    public String getOtherItem3EndM() {
        return otherItem3EndM;
    }

    /**
     * @return 代表者名.
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * 指定パーク名を取得します。
     * 
     * @return 指定パーク名
     */
    public String getParkFlg() {
        return parkFlg;
    }

    /**
     * 個札券出力指定有無を取得します。
     * 
     * @return 個札券出力指定有無
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
    }

    /**
     * @return planFlg
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
     * @return 予約通知方法用否 .
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * @return 休憩場所.
     */
    public String getRestSite() {
        return restSite;
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
     * 住所を取得します。
     * 
     * @return 住所
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
     * 在庫管理方法を取得します。
     * 
     * @return 在庫管理方法
     */
    public String getStockManagement() {
        return stockManagement;
    }

    /**
     * @return 在庫番号 .
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
     * @return 提供期間終了日.
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
     * @return 提供期間終了年月日.
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * @return 提供期間開始日.
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * @return 提供期間開始月 .
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * @return 提供期間開始年.
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
     * @return 台数・組数管理フラグ.
     */
    public String getUnitManageFlg() {
        return unitManageFlg;
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
     * @param additionalService1
     *            .
     */
    public void setAdditionalService1(String additionalService1) {
        this.additionalService1 = additionalService1;
    }

    /**
     * @param additionalService2
     *            .
     */
    public void setAdditionalService2(String additionalService2) {
        this.additionalService2 = additionalService2;
    }

    /**
     * @param additionalService3
     *            .
     */
    public void setAdditionalService3(String additionalService3) {
        this.additionalService3 = additionalService3;
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
     * @param areaNmKana
     *            .
     */
    public void setAreaNmKana(String areaNmKana) {
        this.areaNmKana = areaNmKana;
    }

    /**
     * @param areaNmKanji
     *            .
     */
    public void setAreaNmKanji(String areaNmKanji) {
        this.areaNmKanji = areaNmKanji;
    }

    /**
     * @param arrangementFlg
     *            arrangementFlg
     */
    public void setArrangementFlg(String arrangementFlg) {
        this.arrangementFlg = arrangementFlg;
    }

    /**
     * @param bathCleanBegin
     *            .
     */
    public void setBathCleanBegin(String bathCleanBegin) {
        this.bathCleanBegin = bathCleanBegin;
    }

    /**
     * @param bathCleanBeginH
     *            .
     */
    public void setBathCleanBeginH(String bathCleanBeginH) {
        this.bathCleanBeginH = bathCleanBeginH;
    }

    /**
     * @param bathCleanBeginM
     *            .
     */
    public void setBathCleanBeginM(String bathCleanBeginM) {
        this.bathCleanBeginM = bathCleanBeginM;
    }

    /**
     * @param bathCleanEnd
     *            .
     */
    public void setBathCleanEnd(String bathCleanEnd) {
        this.bathCleanEnd = bathCleanEnd;
    }

    /**
     * @param bathCleanEndH
     *            .
     */
    public void setBathCleanEndH(String bathCleanEndH) {
        this.bathCleanEndH = bathCleanEndH;
    }

    /**
     * @param bathCleanEndM
     *            .
     */
    public void setBathCleanEndM(String bathCleanEndM) {
        this.bathCleanEndM = bathCleanEndM;
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
     * @param bookKind
     *            .
     */
    public void setBookKind(String bookKind) {
        this.bookKind = bookKind;
    }

    /**
     * @param bookPurpose
     *            .
     */
    public void setBookPurpose(String bookPurpose) {
        this.bookPurpose = bookPurpose;
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
     * @param freelyColumn
     *            .
     */
    public void setFreelyColumn(String freelyColumn) {
        this.freelyColumn = freelyColumn;
    }

    /**
     * @param goodsCd
     *            .
     */
    public void setGoodsCd(String goodsCd) {
        this.goodsCd = goodsCd;
    }

    /**
     * @param goodsCd1
     *            .
     */
    public void setGoodsCd1(String goodsCd1) {
        this.goodsCd1 = goodsCd1;
    }

    /**
     * @param goodsCd2
     *            .
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
     * @param mealSite
     *            .
     */
    public void setMealSite(String mealSite) {
        this.mealSite = mealSite;
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
     * @param originalGoodsCd
     *            .
     */
    public void setOriginalGoodsCd(String originalGoodsCd) {
        this.originalGoodsCd = originalGoodsCd;
    }

    /**
     * @param originalGoodsCd1
     *            .
     */
    public void setOriginalGoodsCd1(String originalGoodsCd1) {
        this.originalGoodsCd1 = originalGoodsCd1;
    }

    /**
     * @param originalGoodsCd2
     *            .
     */
    public void setOriginalGoodsCd2(String originalGoodsCd2) {
        this.originalGoodsCd2 = originalGoodsCd2;
    }

    /**
     * @param otherItem1
     *            .
     */
    public void setOtherItem1(String otherItem1) {
        this.otherItem1 = otherItem1;
    }

    /**
     * @param otherItem1Begin
     *            .
     */
    public void setOtherItem1Begin(String otherItem1Begin) {
        this.otherItem1Begin = otherItem1Begin;
    }

    /**
     * @param otherItem1BeginH
     *            .
     */
    public void setOtherItem1BeginH(String otherItem1BeginH) {
        this.otherItem1BeginH = otherItem1BeginH;
    }

    /**
     * @param otherItem1BeginM
     *            .
     */
    public void setOtherItem1BeginM(String otherItem1BeginM) {
        this.otherItem1BeginM = otherItem1BeginM;
    }

    /**
     * @param otherItem1End
     *            .
     */
    public void setOtherItem1End(String otherItem1End) {
        this.otherItem1End = otherItem1End;
    }

    /**
     * @param otherItem1EndH
     *            .
     */
    public void setOtherItem1EndH(String otherItem1EndH) {
        this.otherItem1EndH = otherItem1EndH;
    }

    /**
     * @param otherItem1EndM
     *            .
     */
    public void setOtherItem1EndM(String otherItem1EndM) {
        this.otherItem1EndM = otherItem1EndM;
    }

    /**
     * @param otherItem2
     *            .
     */
    public void setOtherItem2(String otherItem2) {
        this.otherItem2 = otherItem2;
    }

    /**
     * @param otherItem2Begin
     *            .
     */
    public void setOtherItem2Begin(String otherItem2Begin) {
        this.otherItem2Begin = otherItem2Begin;
    }

    /**
     * @param otherItem2BeginH
     *            .
     */
    public void setOtherItem2BeginH(String otherItem2BeginH) {
        this.otherItem2BeginH = otherItem2BeginH;
    }

    /**
     * @param otherItem2BeginM
     *            .
     */
    public void setOtherItem2BeginM(String otherItem2BeginM) {
        this.otherItem2BeginM = otherItem2BeginM;
    }

    /**
     * @param otherItem2End
     *            .
     */
    public void setOtherItem2End(String otherItem2End) {
        this.otherItem2End = otherItem2End;
    }

    /**
     * @param otherItem2EndH
     *            .
     */
    public void setOtherItem2EndH(String otherItem2EndH) {
        this.otherItem2EndH = otherItem2EndH;
    }

    /**
     * @param otherItem2EndM
     *            .
     */
    public void setOtherItem2EndM(String otherItem2EndM) {
        this.otherItem2EndM = otherItem2EndM;
    }

    /**
     * @param otherItem3
     *            .
     */
    public void setOtherItem3(String otherItem3) {
        this.otherItem3 = otherItem3;
    }

    /**
     * @param otherItem3Begin
     *            .
     */
    public void setOtherItem3Begin(String otherItem3Begin) {
        this.otherItem3Begin = otherItem3Begin;
    }

    /**
     * @param otherItem3BeginH
     *            .
     */
    public void setOtherItem3BeginH(String otherItem3BeginH) {
        this.otherItem3BeginH = otherItem3BeginH;
    }

    /**
     * @param otherItem3BeginM
     *            .
     */
    public void setOtherItem3BeginM(String otherItem3BeginM) {
        this.otherItem3BeginM = otherItem3BeginM;
    }

    /**
     * @param otherItem3End
     *            .
     */
    public void setOtherItem3End(String otherItem3End) {
        this.otherItem3End = otherItem3End;
    }

    /**
     * @param otherItem3EndH
     *            .
     */
    public void setOtherItem3EndH(String otherItem3EndH) {
        this.otherItem3EndH = otherItem3EndH;
    }

    /**
     * @param otherItem3EndM
     *            .
     */
    public void setOtherItem3EndM(String otherItem3EndM) {
        this.otherItem3EndM = otherItem3EndM;
    }

    /**
     * @param ownerNm
     *            .
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * 指定パーク名を設定します。
     * 
     * @param parkFlg
     *            指定パーク名
     */
    public void setParkFlg(String parkFlg) {
        this.parkFlg = parkFlg;
    }

    /**
     * 個札券出力指定有無を設定します。
     * 
     * @param personalTicketPrintFlg
     *            個札券出力指定有無
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
    }

    /**
     * @param planFlg
     *            planFlg
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
     * @param reserveInformWay
     *            .
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * @param restSite
     *            .
     */
    public void setRestSite(String restSite) {
        this.restSite = restSite;
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
     * 住所を設定します。
     * 
     * @param address
     *            住所
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
     * 在庫管理方法を設定します。
     * 
     * @param stockManagement
     *            在庫管理方法
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
     * 郵便番号を設定します。
     * 
     * @param stockPostCd
     *            郵便番号
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
     * @param unitManageFlg
     *            .
     */
    public void setUnitManageFlg(String unitManageFlg) {
        this.unitManageFlg = unitManageFlg;
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
