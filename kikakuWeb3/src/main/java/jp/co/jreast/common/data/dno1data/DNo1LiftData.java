package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 *  NO1_リフトデータクラス。.
 *  機能概要    ：  NO1_リフトデータクラス
 *  特記事項    ：  無し
 * </pre>
 */
public class DNo1LiftData extends PlanAnsBaseData implements IDNo1CommonData {

    /**
     * エリアコード
     */
    private String areaCd;

    /**
     * ボード専用エリア有無 .
     */
    private String areaForBoardFlg = JreConstants.FLG_FALSE;

    /**
     * キッズ専用エリア有無 .
     */
    private String areaForKidsFlg = JreConstants.FLG_FALSE;

    /**
     * モーグル専用エリア有無 .
     */
    private String areaForMogulFlg = JreConstants.FLG_FALSE;

    /**
     * 地区名称（カナ）
     */
    private String areaKana;

    /**
     * 地区名称
     */
    private String areaNm;

    /**
     * 浴場料金有無 .
     */
    private String bathroomFeeFlg;

    /**
     * 浴場有無 .
     */
    private String bathroomFlg = JreConstants.FLG_FALSE;

    /**
     * 料金単位区分
     */
    private String chargeDiv;

    /**
     * 子供年齢from
     */
    private String childAgeFrom;

    /**
     * 子供年齢to
     */
    private String childAgeTo;

    /**
     * 託児サービス料金（有無）.
     */
    private String dayCareChargeEFlg;

    /**
     * 託児所サービス有無 .
     */
    private String dayCareServiceFlg = JreConstants.FLG_FALSE;

    /**
     * 取扱手数料 .
     */
    private String dealFee;

    /**
     * 取扱手数料種別 .
     */
    private String dealFeeType;

    /**
     * 更衣室有無 .
     */
    private String dressingRoomFlg = JreConstants.FLG_FALSE;

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
     * ファミリーゲレンデ有無 .
     */
    private String familyGelandeFlg = JreConstants.FLG_FALSE;

    /**
     * 自由入力欄 .
     */
    private String freelyColumn;

    /**
     * 分類コード
     */
    private String goodsKindCd;

    /**
     * ハーフパイプ有無 .
     */
    private String halfpipeFlg = JreConstants.FLG_FALSE;

    /**
     * 宅配受取サービス有無 .
     */
    private String homeDeliveryServiceFlg;

    /**
     * 通知先ファックス .
     */
    private String informFax;

    /**
     * 通知先名称
     */
    private String informNm;

    /**
     * 取扱手数料存在するフラグ .
     */
    private String isDealFeeExist;

    /**
     * リフト券利用開始時間（休日） 時間 .
     */
    private String liftTicketBeginHolHour;

    /**
     * リフト券利用開始時間（休日）　分 .
     */
    private String liftTicketBeginHolMinutes;

    /**
     * リフト券利用開始時間（平日） 時間 .
     */
    private String liftTicketBeginOdrHour;

    /**
     * リフト券利用開始時間（平日）　分 .
     */
    private String liftTicketBeginOdrMinutes;

    /**
     * リフト券利用終了時間（休日） 時間 .
     */
    private String liftTicketEndHolHour;

    /**
     * リフト券利用終了時間（休日）　分 .
     */
    private String liftTicketEndHolMinutes;

    /**
     * リフト券利用終了時間（平日） 時間 .
     */
    private String liftTicketEndOdrHour;

    /**
     * リフト券利用終了時間（平日）　分 .
     */
    private String liftTicketEndOdrMinutes;

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
     * 手仕舞時刻（当日設定時）：時
     */
    private String liquidateTimeHour;

    /**
     * 手仕舞時刻（当日設定時）：分
     */
    private String liquidateTimeMinute;

    /**
     * ロッカー料金有無 .
     */
    private String lockerFeeFlg;

    /**
     * ロッカー有無 .
     */
    private String lockerFlg = JreConstants.FLG_FALSE;

    /**
     * 備考 .
     */
    private String memo;

    /**
     * ワンメイク有無 .
     */
    private String oneMakeFlg = JreConstants.FLG_FALSE;

    /**
     * 代表者名 .
     */
    private String ownerNm;

    /**
     * 個札券出力指定有無 .
     */
    private String personalTicketPrintFlg;

    /**
     * 都道府県コード
     */
    private String prefecturesCd;

    /**
     * 受取箇所 .
     */
    private String receiptPart;

    /**
     * 地域コード
     */
    private String regionCd;

    /**
     * 予約通知方法要非 .
     */
    // private String bookInformWayFlg;
    private String reserveInformWay;

    /**
     * 営業時間開始（ナイター）時間 .
     */
    private String salesTimeBeginNightHour;

    /**
     * 営業時間開始（ナイター）分 .
     */
    private String salesTimeBeginNightMinutes;

    /**
     * 営業時間開始（通常）時間 .
     */
    private String salesTimeBeginNorHour;

    /**
     * 営業時間開始（通常）分 .
     */
    private String salesTimeBeginNorMinutes;

    /**
     * 営業時間終了（ナイター）時間 .
     */
    private String salesTimeEndNightHour;

    /**
     * 営業時間終了（ナイター）分 .
     */
    private String salesTimeEndNightMinutes;

    /**
     * 営業時間終了（通常）時間 .
     */
    private String salesTimeEndNorHour;

    /**
     * 営業時間終了（通常）分 .
     */
    private String salesTimeEndNorMinutes;

    /**
     * 営業時間備考（ナイター） .
     */
    private String salesTimeMemoNight;

    /**
     * 営業時間備考（通常） .
     */
    private String salesTimeMemoNor;

    /**
     * 営業時間その他 .
     */
    private String salesTimeOthers;

    /**
     * 送付先コメント .
     */
    private String sendAddrCmt;

    /**
     * 送付先その他有無 .
     */
    private String sendAddrOthersFlg = JreConstants.FLG_FALSE;

    /**
     * 送付先スキー場有無 .
     */
    private String sendAddrSkiAreasFlg = JreConstants.FLG_FALSE;

    /**
     * シニア年齢From
     */

    private String seniorAgeFrom;

    /**
     * シャワー料金有無 .
     */
    private String showerFeeFlg;

    /**
     * シャワー有無 .
     */
    private String showerFlg = JreConstants.FLG_FALSE;

    /**
     * 特記事項（荒天時）
     */
    private String specialItem;

    /**
     * 特記事項（設備・宅配サービス）
     */
    private String specialItem2;

    /**
     * 住所（在庫）
     */
    private String stockAddr;

    /**
     * 在庫管理方法 制限あり/制限なし
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
     * 券面タイトル(カナ） .
     */
    private String ticketTitleKana;

    /**
     * 券面タイトル（漢字） .
     */
    private String ticketTitleKanji;

    /**
     * 有効期間 .
     */
    private String validPeriod;

    /**
     * バウチャーレス可否
     */
    private String voucherFlg = JreConstants.FLG_FALSE;

    /**
     * バウチャー券案内文（漢字） .
     */
    private String voucherIntroKanji;

    /**
     * エリアコードを取得します。
     * 
     * @return エリアコード
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * @return Returns the areaForBoardFlg.
     */
    public String getAreaForBoardFlg() {
        return areaForBoardFlg;
    }

    /**
     * @return Returns the areaForKidsFlg.
     */
    public String getAreaForKidsFlg() {
        return areaForKidsFlg;
    }

    /**
     * @return Returns the areaForMogulFlg.
     */
    public String getAreaForMogulFlg() {
        return areaForMogulFlg;
    }

    /**
     * 地区名称（カナ）を取得します。
     * 
     * @return 地区名称（カナ）
     */
    public String getAreaKana() {
        return areaKana;
    }

    /**
     * 地区名称を取得します。
     * 
     * @return 地区名称
     */
    public String getAreaNm() {
        return areaNm;
    }

    /**
     * @return Returns the bathroomFeeFlg.
     */
    public String getBathroomFeeFlg() {
        return bathroomFeeFlg;
    }

    /**
     * @return Returns the bathroomFlg.
     */
    public String getBathroomFlg() {
        return bathroomFlg;
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
     * @return Returns the bookInformWayFlg.
     */
    //    public String getBookInformWayFlg() {
    //        return bookInformWayFlg;
    //    }

    /**
     * 子供年齢fromを取得します。
     * 
     * @return 子供年齢from
     */
    public String getChildAgeFrom() {
        return childAgeFrom;
    }

    /**
     * 子供年齢toを取得します。
     * 
     * @return 子供年齢to
     */
    public String getChildAgeTo() {
        return childAgeTo;
    }

    /**
     * @return 託児サービス料金
     */
    public String getDayCareChargeEFlg() {
        return dayCareChargeEFlg;
    }

    /**
     * @return Returns the dayCareServiceFlg.
     */
    public String getDayCareServiceFlg() {
        return dayCareServiceFlg;
    }

    /**
     * @return Returns the dealFee.
     */
    public String getDealFee() {
        //取扱手数料種別は円の場合、小数を切り捨てる
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
     * @return 手数料(かんまつき)
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
     * @return Returns the dealFeeType.
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * @return Returns the dressingRoomFlg.
     */
    public String getDressingRoomFlg() {
        return dressingRoomFlg;
    }

    /**
     * @return Returns the exceptDate.
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * @return Returns the facilityAddr.
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * @return Returns the facilityFax.
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * @return Returns the facilityPostCd.
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * @return Returns the facilityTel.
     */
    public String getFacilityTel() {
        return facilityTel == null ? "" : facilityTel.trim();
    }

    /**
     * @return Returns the familyGelandeFlg.
     */
    public String getFamilyGelandeFlg() {
        return familyGelandeFlg;
    }

    /**
     * @return Returns the freelyColumn.
     */
    public String getFreelyColumn() {
        return freelyColumn;
    }

    /**
     * 分類コードを取得します。
     * 
     * @return 分類コード
     */
    public String getGoodsKindCd() {
        return goodsKindCd;
    }

    /**
     * @return Returns the halfpipeFlg.
     */
    public String getHalfpipeFlg() {
        return halfpipeFlg;
    }

    /**
     * @return Returns the homeDeliveryServiceFlg.
     */
    public String getHomeDeliveryServiceFlg() {
        return homeDeliveryServiceFlg;
    }

    /**
     * @return Returns the informFax.
     */
    public String getInformFax() {
        return StringUtils.trim(informFax);
    }

    /**
     * 通知先名称を取得します。
     * 
     * @return 通知先名称
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
     * @return Returns the liftTicketBeginHol.
     */
    public String getLiftTicketBeginHol() {

        return DKikakuWebUtil.buildTime(getLiftTicketBeginHolHour(),
                getLiftTicketBeginHolMinutes());

    }

    /**
     * @return Returns the liftTicketBeginHolHour.
     */
    public String getLiftTicketBeginHolHour() {
        return liftTicketBeginHolHour;
    }

    /**
     * @return Returns the liftTicketBeginHolMinutes.
     */
    public String getLiftTicketBeginHolMinutes() {
        return liftTicketBeginHolMinutes;
    }

    /**
     * @return Returns the liftTicketBeginOdr.
     */
    public String getLiftTicketBeginOdr() {

        return DKikakuWebUtil.buildTime(getLiftTicketBeginOdrHour(),
                getLiftTicketBeginOdrMinutes());
    }

    /**
     * @return Returns the liftTicketBeginOdrHour.
     */
    public String getLiftTicketBeginOdrHour() {
        return liftTicketBeginOdrHour;
    }

    /**
     * @return Returns the liftTicketBeginOdrMinutes.
     */
    public String getLiftTicketBeginOdrMinutes() {
        return liftTicketBeginOdrMinutes;
    }

    /**
     * @return Returns the liftTicketEndHol.
     */
    public String getLiftTicketEndHol() {

        return DKikakuWebUtil.buildTime(getLiftTicketEndHolHour(),
                getLiftTicketEndHolMinutes());
    }

    /**
     * @return Returns the liftTicketEndHolHour.
     */
    public String getLiftTicketEndHolHour() {
        return liftTicketEndHolHour;
    }

    /**
     * @return Returns the liftTicketEndHolMinutes.
     */
    public String getLiftTicketEndHolMinutes() {
        return liftTicketEndHolMinutes;
    }

    /**
     * @return Returns the liftTicketEndOdr.
     */
    public String getLiftTicketEndOdr() {

        return DKikakuWebUtil.buildTime(getLiftTicketEndOdrHour(),
                getLiftTicketEndOdrMinutes());
    }

    /**
     * @return Returns the liftTicketEndOdrHour.
     */
    public String getLiftTicketEndOdrHour() {
        return liftTicketEndOdrHour;
    }

    /**
     * @return Returns the liftTicketEndOdrMinutes.
     */
    public String getLiftTicketEndOdrMinutes() {
        return liftTicketEndOdrMinutes;
    }

    /**
     * @return Returns the liquidateDay.
     */
    public String getLiquidateDay() {
        return liquidateDay;
    }

    /**
     * @return Returns the liquidateInformFlg.
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
     * 手仕舞時刻（当日設定時）：時を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）：時
     */
    public String getLiquidateTimeHour() {
        return liquidateTimeHour;
    }

    /**
     * 手仕舞時刻（当日設定時）：分を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）：分
     */
    public String getLiquidateTimeMinute() {
        return liquidateTimeMinute;
    }

    /**
     * @return Returns the lockerFeeFlg.
     */
    public String getLockerFeeFlg() {
        return lockerFeeFlg;
    }

    /**
     * @return Returns the lockerFlg.
     */
    public String getLockerFlg() {
        return lockerFlg;
    }

    /**
     * @return Returns the memo.
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @return Returns the oneMakeFlg.
     */
    public String getOneMakeFlg() {
        return oneMakeFlg;
    }

    /**
     * @return Returns the ownerNm.
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * @return Returns the personalTicketPrintFlg.
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
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
     * @return Returns the receiptPart.
     */
    public String getReceiptPart() {
        return receiptPart;
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
     * 予約通知方法要非 .を取得します。
     * 
     * @return 予約通知方法要非 .
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * @return Returns the salesTimeBeginNight.
     */
    public String getSalesTimeBeginNight() {

        return DKikakuWebUtil.buildTime(getSalesTimeBeginNightHour(),
                getSalesTimeBeginNightMinutes());
    }

    /**
     * @return Returns the salesTimeBeginNightHour.
     */
    public String getSalesTimeBeginNightHour() {
        return salesTimeBeginNightHour;
    }

    /**
     * @return Returns the salesTimeBeginNightMinutes.
     */
    public String getSalesTimeBeginNightMinutes() {
        return salesTimeBeginNightMinutes;
    }

    /**
     * @return Returns the salesTimeBeginNor.
     */
    public String getSalesTimeBeginNor() {

        return DKikakuWebUtil.buildTime(getSalesTimeBeginNorHour(),
                getSalesTimeBeginNorMinutes());
    }

    /**
     * @return Returns the salesTimeBeginNorHour.
     */
    public String getSalesTimeBeginNorHour() {
        return salesTimeBeginNorHour;
    }

    /**
     * @return Returns the salesTimeBeginNorMinutes.
     */
    public String getSalesTimeBeginNorMinutes() {
        return salesTimeBeginNorMinutes;
    }

    /**
     * @return Returns the salesTimeEndNight.
     */
    public String getSalesTimeEndNight() {

        return DKikakuWebUtil.buildTime(getSalesTimeEndNightHour(),
                getSalesTimeEndNightMinutes());
    }

    /**
     * @return Returns the salesTimeEndNightHour.
     */
    public String getSalesTimeEndNightHour() {
        return salesTimeEndNightHour;
    }

    /**
     * @return Returns the salesTimeEndNightMinutes.
     */
    public String getSalesTimeEndNightMinutes() {
        return salesTimeEndNightMinutes;
    }

    /**
     * @return Returns the salesTimeEndNor.
     */
    public String getSalesTimeEndNor() {

        return DKikakuWebUtil.buildTime(getSalesTimeEndNorHour(),
                getSalesTimeEndNorMinutes());
    }

    /**
     * @return Returns the salesTimeEndNorHour.
     */
    public String getSalesTimeEndNorHour() {
        return salesTimeEndNorHour;
    }

    /**
     * @return Returns the salesTimeEndNorMinutes.
     */
    public String getSalesTimeEndNorMinutes() {
        return salesTimeEndNorMinutes;
    }

    /**
     * @return Returns the salesTimeMemoNight.
     */
    public String getSalesTimeMemoNight() {
        return salesTimeMemoNight;
    }

    /**
     * @return Returns the salesTimeMemoNor.
     */
    public String getSalesTimeMemoNor() {
        return salesTimeMemoNor;
    }

    /**
     * @return Returns the salesTimeOthers.
     */
    public String getSalesTimeOthers() {
        return salesTimeOthers;
    }

    /**
     * @return Returns the sendAddrCmt.
     */
    public String getSendAddrCmt() {
        return sendAddrCmt;
    }

    /**
     * @return Returns the sendAddrOthersFlg.
     */
    public String getSendAddrOthersFlg() {
        return sendAddrOthersFlg;
    }

    /**
     * @return Returns the sendAddrSkiAreasFlg.
     */
    public String getSendAddrSkiAreasFlg() {
        return sendAddrSkiAreasFlg;
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
     * @return Returns the showerFeeFlg.
     */
    public String getShowerFeeFlg() {
        return showerFeeFlg;
    }

    /**
     * @return Returns the showerFlg.
     */
    public String getShowerFlg() {
        return showerFlg;
    }

    /**
     * @return Returns the specialItem.
     */
    public String getSpecialItem() {
        return specialItem;
    }

    /**
     * 特記事項（設備・宅配サービス）を取得します。
     * 
     * @return 特記事項（設備・宅配サービス）
     */
    public String getSpecialItem2() {
        return specialItem2;
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
     * 在庫管理方法 制限あり/制限なしを取得します。
     * 
     * @return 在庫管理方法 制限あり/制限なし
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
     * @return Returns the stockNo.
     */
    public String getStockNo() {

        return StringUtil.trim(stockNo);
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
        return StringUtil.trim(stockTel);
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
     * @return Returns the termEndD.
     */
    @Override
    public String getTermEndD() {
        if (termEndD != null && DKikakuWebUtil.isNumber(termEndD)) {
            if (termEndD.length() == 1) {
                termEndD = "0" + termEndD;
            }

        }
        return termEndD;
    }

    /**
     * @return Returns the termEndM.
     */
    @Override
    public String getTermEndM() {
        if (termEndM != null && DKikakuWebUtil.isNumber(termEndD)) {
            if (termEndM.length() == 1) {
                termEndM = "0" + termEndM;
            }
        }
        return termEndM;
    }

    /**
     * @return Returns the termEndY.
     */
    @Override
    public String getTermEndY() {
        return termEndY;
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
     * @return Returns the termFromD.
     */
    @Override
    public String getTermFromD() {

        if (termFromD != null && DKikakuWebUtil.isNumber(termFromD)) {
            if (termFromD.length() == 1) {
                termFromD = "0" + termFromD;
            }
        }
        return termFromD;
    }

    /**
     * @return Returns the termFromM.
     */
    @Override
    public String getTermFromM() {
        if (termFromM != null && DKikakuWebUtil.isNumber(termFromM)) {
            if (termFromM.length() == 1) {
                termFromM = "0" + termFromM;
            }
        }
        return termFromM;
    }

    /**
     * @return Returns the termFromY.
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * @return termFromYmd 提供期間開始年月日
     */
    public String getTermFromYmd() {
        if (StringUtil.isEmpty(termFromY) || StringUtil.isEmpty(termFromM)
                || StringUtil.isEmpty(termFromD)) {
            return "";
        }
        return getTermFromY() + getTermFromM() + getTermFromD();
    }

    /**
     * @return Returns the ticketTitleKana.
     */
    public String getTicketTitleKana() {
        return ticketTitleKana;
    }

    /**
     * @return Returns the ticketTitleKanji.
     */
    public String getTicketTitleKanji() {
        return ticketTitleKanji;
    }

    /**
     * @return Returns the validPeriod.
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
     * @return Returns the voucherIntroIanji.
     */
    public String getVoucherIntroKanji() {
        return voucherIntroKanji;
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
     * @param areaForBoardFlg
     *            The areaForBoardFlg to set.
     */
    public void setAreaForBoardFlg(String areaForBoardFlg) {
        this.areaForBoardFlg = areaForBoardFlg;
    }

    /**
     * @param areaForKidsFlg
     *            The areaForKidsFlg to set.
     */
    public void setAreaForKidsFlg(String areaForKidsFlg) {
        this.areaForKidsFlg = areaForKidsFlg;
    }

    /**
     * @param areaForMogulFlg
     *            The areaForMogulFlg to set.
     */
    public void setAreaForMogulFlg(String areaForMogulFlg) {
        this.areaForMogulFlg = areaForMogulFlg;
    }

    /**
     * 地区名称（カナ）を設定します。
     * 
     * @param areaKana
     *            地区名称（カナ）
     */
    public void setAreaKana(String areaKana) {
        this.areaKana = areaKana;
    }

    /**
     * 地区名称を設定します。
     * 
     * @param areaNm
     *            地区名称
     */
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    /**
     * @param bathroomFeeFlg
     *            The bathroomFeeFlg to set.
     */
    public void setBathroomFeeFlg(String bathroomFeeFlg) {
        this.bathroomFeeFlg = bathroomFeeFlg;
    }

    /**
     * @param bathroomFlg
     *            The bathroomFlg to set.
     */
    public void setBathroomFlg(String bathroomFlg) {
        this.bathroomFlg = bathroomFlg;
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
     * 子供年齢fromを設定します。
     * 
     * @param childAgeFrom
     *            子供年齢from
     */
    public void setChildAgeFrom(String childAgeFrom) {
        this.childAgeFrom = childAgeFrom;
    }

    /**
     * 子供年齢toを設定します。
     * 
     * @param childAgeTo
     *            子供年齢to
     */
    public void setChildAgeTo(String childAgeTo) {
        this.childAgeTo = childAgeTo;
    }

    /**
     * @param dayCareChargeEFlg
     *            託児サービス料金
     */
    public void setDayCareChargeEFlg(String dayCareChargeEFlg) {
        this.dayCareChargeEFlg = dayCareChargeEFlg;
    }

    /**
     * @param dayCareServiceFlg
     *            The dayCareServiceFlg to set.
     */
    public void setDayCareServiceFlg(String dayCareServiceFlg) {
        this.dayCareServiceFlg = dayCareServiceFlg;
    }

    /**
     * @param dealFee
     *            The dealFee to set.
     */
    public void setDealFee(String dealFee) {
        this.dealFee = dealFee;
    }

    /**
     * @param bookInformWayFlg
     *            The bookInformWayFlg to set.
     */
    //    public void setBookInformWayFlg(String bookInformWayFlg) {
    //        this.bookInformWayFlg = bookInformWayFlg;
    //    }

    /**
     * @param dealFeeType
     *            The dealFeeType to set.
     */
    public void setDealFeeType(String dealFeeType) {
        this.dealFeeType = dealFeeType;
    }

    /**
     * @param dressingRoomFlg
     *            The dressingRoomFlg to set.
     */
    public void setDressingRoomFlg(String dressingRoomFlg) {
        this.dressingRoomFlg = dressingRoomFlg;
    }

    /**
     * @param exceptDate
     *            The exceptDate to set.
     */
    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    /**
     * @param facilityAddr
     *            The facilityAddr to set.
     */
    public void setFacilityAddr(String facilityAddr) {
        this.facilityAddr = facilityAddr;
    }

    /**
     * @param facilityFax
     *            The facilityFax to set.
     */
    public void setFacilityFax(String facilityFax) {
        this.facilityFax = facilityFax;
    }

    /**
     * @param facilityPostCd
     *            The facilityPostCd to set.
     */
    public void setFacilityPostCd(String facilityPostCd) {
        this.facilityPostCd = facilityPostCd;
    }

    /**
     * @param facilityTel
     *            The facilityTel to set.
     */
    public void setFacilityTel(String facilityTel) {
        this.facilityTel = facilityTel;
    }

    /**
     * @param familyGelandeFlg
     *            The familyGelandeFlg to set.
     */
    public void setFamilyGelandeFlg(String familyGelandeFlg) {
        this.familyGelandeFlg = familyGelandeFlg;
    }

    /**
     * @param freelyColumn
     *            The freelyColumn to set.
     */
    public void setFreelyColumn(String freelyColumn) {
        this.freelyColumn = freelyColumn;
    }

    /**
     * 分類コードを設定します。
     * 
     * @param goodsKindCd
     *            分類コード
     */
    public void setGoodsKindCd(String goodsKindCd) {
        this.goodsKindCd = goodsKindCd;
    }

    /**
     * @param halfpipeFlg
     *            The halfpipeFlg to set.
     */
    public void setHalfpipeFlg(String halfpipeFlg) {
        this.halfpipeFlg = halfpipeFlg;
    }

    /**
     * @param homeDeliveryServiceFlg
     *            The homeDeliveryServiceFlg to set.
     */
    public void setHomeDeliveryServiceFlg(String homeDeliveryServiceFlg) {
        this.homeDeliveryServiceFlg = homeDeliveryServiceFlg;
    }

    /**
     * @param informFax
     *            The informFax to set.
     */
    public void setInformFax(String informFax) {
        this.informFax = informFax;
    }

    /**
     * 通知先名称を設定します。
     * 
     * @param informNm
     *            通知先名称
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
     * @param liftTicketBeginHol
     *            the liftTicketBeginHol to set.
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
     * @param liftTicketBeginHolHour
     *            The liftTicketBeginHolHour to set.
     */
    public void setLiftTicketBeginHolHour(String liftTicketBeginHolHour) {
        this.liftTicketBeginHolHour = liftTicketBeginHolHour;
    }

    /**
     * @param liftTicketBeginHolMinutes
     *            The liftTicketBeginHolMinutes to set.
     */
    public void setLiftTicketBeginHolMinutes(String liftTicketBeginHolMinutes) {
        this.liftTicketBeginHolMinutes = liftTicketBeginHolMinutes;
    }

    /**
     * @param liftTicketBeginOdr
     *            the liftTicketBeginOdr to set.
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
     * @param liftTicketBeginOdrHour
     *            The liftTicketBeginOdrHour to set.
     */
    public void setLiftTicketBeginOdrHour(String liftTicketBeginOdrHour) {
        this.liftTicketBeginOdrHour = liftTicketBeginOdrHour;
    }

    /**
     * @param liftTicketBeginOdrMinutes
     *            The liftTicketBeginOdrMinutes to set.
     */
    public void setLiftTicketBeginOdrMinutes(String liftTicketBeginOdrMinutes) {
        this.liftTicketBeginOdrMinutes = liftTicketBeginOdrMinutes;
    }

    /**
     * @param liftTicketEndHol
     *            the liftTicketEndHol to set.
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
     * @param liftTicketEndHolHour
     *            The liftTicketEndHolHour to set.
     */
    public void setLiftTicketEndHolHour(String liftTicketEndHolHour) {
        this.liftTicketEndHolHour = liftTicketEndHolHour;
    }

    /**
     * @param liftTicketEndHolMinutes
     *            The liftTicketEndHolMinutes to set.
     */
    public void setLiftTicketEndHolMinutes(String liftTicketEndHolMinutes) {
        this.liftTicketEndHolMinutes = liftTicketEndHolMinutes;
    }

    /**
     * @param liftTicketEndOdr
     *            the liftTicketEndOdr to set.
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
     * @param liftTicketEndOdrHour
     *            The liftTicketEndOdrHour to set.
     */
    public void setLiftTicketEndOdrHour(String liftTicketEndOdrHour) {
        this.liftTicketEndOdrHour = liftTicketEndOdrHour;
    }

    /**
     * @param liftTicketEndOdrMinutes
     *            The liftTicketEndOdrMinutes to set.
     */
    public void setLiftTicketEndOdrMinutes(String liftTicketEndOdrMinutes) {
        this.liftTicketEndOdrMinutes = liftTicketEndOdrMinutes;
    }

    /**
     * @param liquidateDay
     *            The liquidateDay to set.
     */
    public void setLiquidateDay(String liquidateDay) {
        this.liquidateDay = StringUtil.toHalf(liquidateDay);
    }

    /**
     * @param liquidateInformFlg
     *            The liquidateInformFlg to set.
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
     * 手仕舞時刻（当日設定時）：時を設定します。
     * 
     * @param liquidateTimeHour
     *            手仕舞時刻（当日設定時）：時
     */
    public void setLiquidateTimeHour(String liquidateTimeHour) {
        this.liquidateTimeHour = liquidateTimeHour;
    }

    /**
     * 手仕舞時刻（当日設定時）：分を設定します。
     * 
     * @param liquidateTimeMinute
     *            手仕舞時刻（当日設定時）：分
     */
    public void setLiquidateTimeMinute(String liquidateTimeMinute) {
        this.liquidateTimeMinute = liquidateTimeMinute;
    }

    /**
     * @param lockerFeeFlg
     *            The lockerFeeFlg to set.
     */
    public void setLockerFeeFlg(String lockerFeeFlg) {
        this.lockerFeeFlg = lockerFeeFlg;
    }

    /**
     * @param lockerFlg
     *            The lockerFlg to set.
     */
    public void setLockerFlg(String lockerFlg) {
        this.lockerFlg = lockerFlg;
    }

    /**
     * @param memo
     *            The memo to set.
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @param oneMakeFlg
     *            The oneMakeFlg to set.
     */
    public void setOneMakeFlg(String oneMakeFlg) {
        this.oneMakeFlg = oneMakeFlg;
    }

    /**
     * @param ownerNm
     *            The ownerNm to set.
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * @param personalTicketPrintFlg
     *            The personalTicketPrintFlg to set.
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
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
     * @param receiptPart
     *            The receiptPart to set.
     */
    public void setReceiptPart(String receiptPart) {
        this.receiptPart = receiptPart;
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
     * 予約通知方法要非 .を設定します。
     * 
     * @param reserveInformWay
     *            予約通知方法要非 .
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * @param salesTimeBeginNight
     *            the salesTimeBeginNight to set.
     */
    public void setSalesTimeBeginNight(String salesTimeBeginNight) {
        if (!StringUtil.isEmpty(salesTimeBeginNight)) {
            this.salesTimeBeginNightHour = salesTimeBeginNight.substring(0, 2);
            this.salesTimeBeginNightMinutes = salesTimeBeginNight.substring(2,
                    4);
        } else {
            this.salesTimeBeginNightHour = "";
            this.salesTimeBeginNightMinutes = "";
        }
    }

    /**
     * @param salesTimeBeginNightHour
     *            The salesTimeBeginNightHour to set.
     */
    public void setSalesTimeBeginNightHour(String salesTimeBeginNightHour) {
        this.salesTimeBeginNightHour = salesTimeBeginNightHour;
    }

    /**
     * @param salesTimeBeginNightMinutes
     *            The salesTimeBeginNightMinutes to set.
     */
    public void setSalesTimeBeginNightMinutes(String salesTimeBeginNightMinutes) {
        this.salesTimeBeginNightMinutes = salesTimeBeginNightMinutes;
    }

    /**
     * @param salesTimeBeginNor
     *            the salesTimeBeginNor to set.
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
     * @param salesTimeBeginNorHour
     *            The salesTimeBeginNorHour to set.
     */
    public void setSalesTimeBeginNorHour(String salesTimeBeginNorHour) {
        this.salesTimeBeginNorHour = salesTimeBeginNorHour;
    }

    /**
     * @param salesTimeBeginNorMinutes
     *            The salesTimeBeginNorMinutes to set.
     */
    public void setSalesTimeBeginNorMinutes(String salesTimeBeginNorMinutes) {
        this.salesTimeBeginNorMinutes = salesTimeBeginNorMinutes;
    }

    /**
     * @param salesTimeEndNight
     *            the salesTimeEndNight to set.
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
     * @param salesTimeEndNightHour
     *            The salesTimeEndNightHour to set.
     */
    public void setSalesTimeEndNightHour(String salesTimeEndNightHour) {
        this.salesTimeEndNightHour = salesTimeEndNightHour;
    }

    /**
     * @param salesTimeEndNightMinutes
     *            The salesTimeEndNightMinutes to set.
     */
    public void setSalesTimeEndNightMinutes(String salesTimeEndNightMinutes) {
        this.salesTimeEndNightMinutes = salesTimeEndNightMinutes;
    }

    /**
     * @param salesTimeEndNor
     *            the salesTimeEndNor to set.
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
     * @param salesTimeEndNorHour
     *            The salesTimeEndNorHour to set.
     */
    public void setSalesTimeEndNorHour(String salesTimeEndNorHour) {
        this.salesTimeEndNorHour = salesTimeEndNorHour;
    }

    /**
     * @param salesTimeEndNorMinutes
     *            The salesTimeEndNorMinutes to set.
     */
    public void setSalesTimeEndNorMinutes(String salesTimeEndNorMinutes) {
        this.salesTimeEndNorMinutes = salesTimeEndNorMinutes;
    }

    /**
     * @param salesTimeMemoNight
     *            The salesTimeMemoNight to set.
     */
    public void setSalesTimeMemoNight(String salesTimeMemoNight) {
        this.salesTimeMemoNight = salesTimeMemoNight;
    }

    /**
     * @param salesTimeMemoNor
     *            The salesTimeMemoNor to set.
     */
    public void setSalesTimeMemoNor(String salesTimeMemoNor) {
        this.salesTimeMemoNor = salesTimeMemoNor;
    }

    /**
     * @param salesTimeOthers
     *            The salesTimeOthers to set.
     */
    public void setSalesTimeOthers(String salesTimeOthers) {
        this.salesTimeOthers = salesTimeOthers;
    }

    /**
     * @param sendAddrCmt
     *            The sendAddrCmt to set.
     */
    public void setSendAddrCmt(String sendAddrCmt) {
        this.sendAddrCmt = sendAddrCmt;
    }

    /**
     * @param sendAddrOthersFlg
     *            The sendAddrOthersFlg to set.
     */
    public void setSendAddrOthersFlg(String sendAddrOthersFlg) {
        this.sendAddrOthersFlg = sendAddrOthersFlg;
    }

    /**
     * @param sendAddrSkiAreasFlg
     *            The sendAddrSkiAreasFlg to set.
     */
    public void setSendAddrSkiAreasFlg(String sendAddrSkiAreasFlg) {
        this.sendAddrSkiAreasFlg = sendAddrSkiAreasFlg;
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
     * @param showerFeeFlg
     *            The showerFeeFlg to set.
     */
    public void setShowerFeeFlg(String showerFeeFlg) {
        this.showerFeeFlg = showerFeeFlg;
    }

    /**
     * @param showerFlg
     *            The showerFlg to set.
     */
    public void setShowerFlg(String showerFlg) {
        this.showerFlg = showerFlg;
    }

    /**
     * @param specialItem
     *            The specialItem to set.
     */
    public void setSpecialItem(String specialItem) {
        this.specialItem = specialItem;
    }

    /**
     * 特記事項（設備・宅配サービス）を設定します。
     * 
     * @param specialItem2
     *            特記事項（設備・宅配サービス）
     */
    public void setSpecialItem2(String specialItem2) {
        this.specialItem2 = specialItem2;
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
     * 在庫管理方法 制限あり/制限なしを設定します。
     * 
     * @param stockControlFlg
     *            在庫管理方法 制限あり/制限なし
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
     * @param stockNo
     *            The stockNo to set.
     */
    public void setStockNo(String stockNo) {
        this.stockNo = StringUtil.toHalf(stockNo);
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
     *            The termEndD to set.
     */
    @Override
    public void setTermEndD(String termEndD) {
        this.termEndD = termEndD;
    }

    /**
     * @param termEndM
     *            The termEndM to set.
     */
    @Override
    public void setTermEndM(String termEndM) {
        this.termEndM = termEndM;
    }

    /**
     * @param termEndY
     *            The termEndY to set.
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = termEndY;
    }

    /**
     * @param termEndYmd
     *            the termEndYmd to set.
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
     * @param termFromD
     *            The termFromD to set.
     */
    @Override
    public void setTermFromD(String termFromD) {
        this.termFromD = termFromD;
    }

    /**
     * @param termFromM
     *            The termFromM to set.
     */
    @Override
    public void setTermFromM(String termFromM) {
        this.termFromM = termFromM;
    }

    /**
     * @param termFromY
     *            The termFromY to set.
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = termFromY;
    }

    /**
     * @param termFromYmd
     *            the termFromYmd to set.
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
     * @param ticketTitleKana
     *            The ticketTitleKana to set.
     */
    public void setTicketTitleKana(String ticketTitleKana) {
        this.ticketTitleKana = ticketTitleKana;
    }

    /**
     * @param ticketTitleKanji
     *            The ticketTitleKanji to set.
     */
    public void setTicketTitleKanji(String ticketTitleKanji) {
        this.ticketTitleKanji = ticketTitleKanji;
    }

    /**
     * @param validPeriod
     *            The validPeriod to set.
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

    /**
     * @param voucherIntroKanji
     *            The voucherIntroKanji to set.
     */
    public void setVoucherIntroKanji(String voucherIntroKanji) {
        this.voucherIntroKanji = voucherIntroKanji;
    }
}
