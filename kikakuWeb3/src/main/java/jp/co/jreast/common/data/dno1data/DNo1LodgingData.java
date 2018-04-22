package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * <pre>
 *  NO1_宿泊データクラス。
 *  機能概要    ：  NO1_宿泊データを格納する。
 *  特記事項    ：  無し
 * </pre>
 */
public class DNo1LodgingData extends PlanAnsBaseData implements IDNo1CommonData {
    //TODO : Dテーブルが確定していない為、Insertが必要な項目のみを設定している

    /**
     * 地区略称名（カナ）
     */
    private String areaAbbrNmKana;

    /**
     * 地区略称名（漢字）
     */
    private String areaAbbrNmKanji;

    /**
     * 地区名（カナ）
     */
    private String areaNmKana;

    /**
     * 地区名（漢字）
     */
    private String areaNmKanji;

    /**
     * チェックイン時間from
     */
    private String checkInFrom;

    /**
     * チェックイン時間From時
     */
    private String checkInFromH;

    /**
     * チェックイン時間From分
     */
    private String checkInFromM;

    /**
     * チェックイン時間（通常）
     */
    private String checkInNor;

    /**
     * チェックイン時間（通常）時
     */
    private String checkInNorH;

    /**
     * チェックイン時間（通常）分
     */
    private String checkInNorM;

    /**
     * チェックイン時間to
     */
    private String checkInTo;

    /**
     * チェックイン時間To時
     */
    private String checkInToH;

    /**
     * チェックイン時間To分
     */
    private String checkInToM;

    /**
     * チェックアウト時間
     */
    private String checkOut;

    /**
     * チェックアウト時間時
     */
    private String checkOutH;

    /**
     * チェックアウト時間分
     */
    private String checkOutM;

    /**
     * チェックアウト時間（通常）
     */
    private String checkOutNor;

    /**
     * チェックアウト時間（通常）時
     */
    private String checkOutNorH;

    /**
     * チェックアウト時間（通常）分
     */
    private String checkOutNorM;

    /**
     * 緊急連絡先備考
     */
    private String emenAddrMemo;

    /**
     * 緊急連絡先会社名称（平日）
     */
    private String emenComOrd;

    /**
     * 緊急連絡先会社名称（土日）
     */
    private String emenComWk;

    /**
     * 緊急連絡先担当者（平日）
     */
    private String emenPersonOrd;

    /**
     * 緊急連絡先担当者（土日）
     */
    private String emenPersonWk;

    /**
     * 緊急連絡先電話番号（平日）
     */
    private String emenTelOrd;

    /**
     * 緊急連絡先電話番号（土日）
     */
    private String emenTelWk;

    /**
     * 除外日
     */
    private String exceptDate;

    /**
     * 施設住所
     */
    private String facilityAddr;

    /**
     * 施設ファックス
     */
    private String facilityFax;

    /**
     * 施設郵便番号
     */
    private String facilityPostCd;

    /**
     * 施設電話
     */
    private String facilityTel;

    /**
     * 施設URL
     */
    private String facilityUrl;

    /**
     * 料金条件コード
     */
    private Integer feeCondCd;

    /**
     * 商品区分
     */
    private Integer goodsDiv;

    /**
     * 分類コード
     */
    private String goodsKindCd;

    /**
     * 手仕舞日
     */
    private String liquidateDay;

    /**
     * 手仕舞時刻（当日設定時）
     */
    private String liquidateTime;

    /**
     * 手仕舞時刻（当日設定時）時
     */
    private String liquidateTimeH;

    /**
     * 手仕舞時刻（当日設定時）分
     */
    private String liquidateTimeM;

    /**
     * 食事条件コード
     */
    private Integer mealCondCd;

    /**
     * 備考
     */
    private String memo;

    /**
     * 送迎要予約選択フラグ1
     */
    private String msReserveFlg1;

    /**
     * 送迎要予約選択フラグ2
     */
    private String msReserveFlg2;

    /**
     * 販売手数料
     */
    private String saleTax;

    /**
     * 販売手数料区分
     */
    private String saleTaxType;

    /**
     * 入湯税（大人）
     */
    private String spaTaxAdlt;

    /**
     * 入湯税（小人）
     */
    private String spaTaxChild;

    /**
     * 入湯税有無
     */
    private String spaTaxFlg;

    /**
     * 連泊割引金額２泊以降一律（大人）
     */
    private String stayDiscountAdlt;

    /**
     * 連泊割引金額１泊（大人）
     */
    private String stayDiscountAdlt1;

    /**
     * 連泊割引金額２泊（大人）
     */
    private String stayDiscountAdlt2;

    /**
     * 連泊割引金額３泊（大人）
     */
    private String stayDiscountAdlt3;

    /**
     * 連泊割引金額４泊（大人）
     */
    private String stayDiscountAdlt4;

    /**
     * 連泊割引金額５泊以上（大人）
     */
    private String stayDiscountAdlt5;

    /**
     * 連泊割引金額２泊以降一律（小人）
     */
    private String stayDiscountChild;

    /**
     * 連泊割引金額１泊（小人）
     */
    private String stayDiscountChild1;

    /**
     * 連泊割引金額２泊（小人）
     */
    private String stayDiscountChild2;

    /**
     * 連泊割引金額３泊（小人）
     */
    private String stayDiscountChild3;

    /**
     * 連泊割引金額４泊（小人）
     */
    private String stayDiscountChild4;

    /**
     * 連泊割引金額５泊以上（小人）
     */
    private String stayDiscountChild5;

    /**
     * 連泊割引区分
     */
    private String stayDiscountDiv;

    /**
     * 連泊割引有無
     */
    private String stayDiscountFlg;

    /**
     * 提供期間終了日
     */
    private String termEndD;

    /**
     * 提供期間終了月
     */
    private String termEndM;

    /**
     * 提供期間終了年
     */
    private String termEndY;

    /**
     * 提供期間終了年月日
     */
    private String termEndYmd;

    /**
     * 提供期間開始日
     */
    private String termFromD;

    /**
     * 提供期間開始月
     */
    private String termFromM;

    /**
     * 提供期間開始年
     */
    private String termFromY;

    /**
     * 提供期間開始年月日
     */
    private String termFromYmd;

    /**
     * パソコン
     */
    private String terminalNo;

    /**
     * 東京都宿泊税有無
     */
    private Integer tyoStayTaxFlg;

    /**
     * 地区略称名（カナ）を取得します。
     * 
     * @return 地区略称名（カナ）
     */
    public String getAreaAbbrNmKana() {
        return areaAbbrNmKana;
    }

    /**
     * 地区略称名（漢字）を取得します。
     * 
     * @return 地区略称名（漢字）
     */
    public String getAreaAbbrNmKanji() {
        return areaAbbrNmKanji;
    }

    /**
     * 地区名（カナ）を取得します。
     * 
     * @return 地区名（カナ）
     */
    public String getAreaNmKana() {
        return areaNmKana;
    }

    /**
     * 地区名（漢字）を取得します。
     * 
     * @return 地区名（漢字）
     */
    public String getAreaNmKanji() {
        return areaNmKanji;
    }

    /**
     * チェックイン時間fromを取得します。
     * 
     * @return チェックイン時間from
     */
    public String getCheckInFrom() {
        return checkInFrom;
    }

    /**
     * チェックイン時間From時を取得します。
     * 
     * @return チェックイン時間From時
     */
    public String getCheckInFromH() {
        return checkInFromH;
    }

    /**
     * チェックイン時間From分を取得します。
     * 
     * @return チェックイン時間From分
     */
    public String getCheckInFromM() {
        return checkInFromM;
    }

    /**
     * チェックイン時間（通常）を取得します。
     * 
     * @return チェックイン時間（通常）
     */
    public String getCheckInNor() {
        return checkInNor;
    }

    /**
     * チェックイン時間（通常）時を取得します。
     * 
     * @return チェックイン時間（通常）時
     */
    public String getCheckInNorH() {
        return checkInNorH;
    }

    /**
     * チェックイン時間（通常）分を取得します。
     * 
     * @return チェックイン時間（通常）分
     */
    public String getCheckInNorM() {
        return checkInNorM;
    }

    /**
     * チェックイン時間toを取得します。
     * 
     * @return チェックイン時間to
     */
    public String getCheckInTo() {
        return checkInTo;
    }

    /**
     * チェックイン時間To時を取得します。
     * 
     * @return チェックイン時間To時
     */
    public String getCheckInToH() {
        return checkInToH;
    }

    /**
     * チェックイン時間To分を取得します。
     * 
     * @return チェックイン時間To分
     */
    public String getCheckInToM() {
        return checkInToM;
    }

    /**
     * チェックアウト時間を取得します。
     * 
     * @return チェックアウト時間
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * チェックアウト時間時を取得します。
     * 
     * @return チェックアウト時間時
     */
    public String getCheckOutH() {
        return checkOutH;
    }

    /**
     * チェックアウト時間分を取得します。
     * 
     * @return チェックアウト時間分
     */
    public String getCheckOutM() {
        return checkOutM;
    }

    /**
     * チェックアウト時間（通常）を取得します。
     * 
     * @return チェックアウト時間（通常）
     */
    public String getCheckOutNor() {
        return checkOutNor;
    }

    /**
     * チェックアウト時間（通常）時を取得します。
     * 
     * @return チェックアウト時間（通常）時
     */
    public String getCheckOutNorH() {
        return checkOutNorH;
    }

    /**
     * チェックアウト時間（通常）分を取得します。
     * 
     * @return チェックアウト時間（通常）分
     */
    public String getCheckOutNorM() {
        return checkOutNorM;
    }

    /**
     * 手数料の表示数字を取得.
     * 
     * @return 手数料(カンマ付き)
     */
    @Override
    public String getDealFeeDisplay() {
        if (!StringUtil.isEmpty(saleTax)
                && !StringUtil.isEmpty(getSaleTaxType())
                && JreConstants.DEAL_FEE_YEN_VALUE.equals(getSaleTaxType())) {
            return DKikakuWebUtil.formatCharge(saleTax);
        }
        return saleTax;
    }

    /**
     * 緊急連絡先備考を取得します。
     * 
     * @return 緊急連絡先備考
     */
    public String getEmenAddrMemo() {
        return emenAddrMemo;
    }

    /**
     * 緊急連絡先会社名称（平日）を取得します。
     * 
     * @return 緊急連絡先会社名称（平日）
     */
    public String getEmenComOrd() {
        return emenComOrd;
    }

    /**
     * 緊急連絡先会社名称（土日）を取得します。
     * 
     * @return 緊急連絡先会社名称（土日）
     */
    public String getEmenComWk() {
        return emenComWk;
    }

    /**
     * 緊急連絡先担当者（平日）を取得します。
     * 
     * @return 緊急連絡先担当者（平日）
     */
    public String getEmenPersonOrd() {
        return emenPersonOrd;
    }

    /**
     * 緊急連絡先担当者（土日）を取得します。
     * 
     * @return 緊急連絡先担当者（土日）
     */
    public String getEmenPersonWk() {
        return emenPersonWk;
    }

    /**
     * 緊急連絡先電話番号（平日）を取得します。
     * 
     * @return 緊急連絡先電話番号（平日）
     */
    public String getEmenTelOrd() {
        return emenTelOrd;
    }

    /**
     * 緊急連絡先電話番号（土日）を取得します。
     * 
     * @return 緊急連絡先電話番号（土日）
     */
    public String getEmenTelWk() {
        return emenTelWk;
    }

    /**
     * 除外日を取得します。
     * 
     * @return 除外日
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * 施設住所を取得します。
     * 
     * @return 施設住所
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * 施設ファックスを取得します。
     * 
     * @return 施設ファックス
     */
    public String getFacilityFax() {
        return facilityFax;
    }

    /**
     * 施設郵便番号を取得します。
     * 
     * @return 施設郵便番号
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * 施設電話を取得します。
     * 
     * @return 施設電話
     */
    public String getFacilityTel() {
        return facilityTel;
    }

    /**
     * 施設URLを取得します。
     * 
     * @return 施設URL
     */
    public String getFacilityUrl() {
        return facilityUrl;
    }

    /**
     * 料金条件コードを取得します。
     * 
     * @return 料金条件コード
     */
    public Integer getFeeCondCd() {
        return feeCondCd;
    }

    /**
     * 商品区分を取得します。
     * 
     * @return 商品区分
     */
    public Integer getGoodsDiv() {
        return goodsDiv;
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
     * 手仕舞日を取得します。
     * 
     * @return 手仕舞日
     */
    public String getLiquidateDay() {
        return liquidateDay;
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
     * 手仕舞時刻（当日設定時）時を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）時
     */
    public String getLiquidateTimeH() {
        return liquidateTimeH;
    }

    /**
     * 手仕舞時刻（当日設定時）分を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）分
     */
    public String getLiquidateTimeM() {
        return liquidateTimeM;
    }

    /**
     * 食事条件コードを取得します。
     * 
     * @return 食事条件コード
     */
    public Integer getMealCondCd() {
        return mealCondCd;
    }

    /**
     * 備考を取得します。
     * 
     * @return 備考
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 送迎要予約選択フラグ1を取得します。
     * 
     * @return 送迎要予約選択フラグ1
     */
    public String getMsReserveFlg1() {
        return msReserveFlg1;
    }

    /**
     * 送迎要予約選択フラグ2を取得します。
     * 
     * @return 送迎要予約選択フラグ2
     */
    public String getMsReserveFlg2() {
        return msReserveFlg2;
    }

    /**
     * 販売手数料を取得します。
     * 
     * @return 販売手数料
     */
    public String getSaleTax() {

        //取扱手数料種別は円の場合、小数を切り捨てる
        if (JreConstants.EnTypeFlg.equals(getSaleTaxType())) {
            //数字ではないの場合、そのまま返す. jinhuashi 720501
            if (!DKikakuWebUtil.isNumber(saleTax)
                    && !DKikakuWebUtil.isFloat(saleTax)) {
                return saleTax;
            }
            if (!StringUtil.isEmpty(saleTax) && saleTax.length() > 0) {
                int dealFeeValue = Float.valueOf(saleTax).intValue();
                saleTax = String.valueOf(dealFeeValue);
            }
            return saleTax;
        } else {
            return saleTax;
        }
    }

    /**
     * 販売手数料区分を取得します。
     * 
     * @return 販売手数料区分
     */
    public String getSaleTaxType() {
        return saleTaxType;
    }

    /**
     * 入湯税（大人）を取得します。
     * 
     * @return 入湯税（大人）
     */
    public String getSpaTaxAdlt() {
        return spaTaxAdlt;
    }

    /**
     * 入湯税（小人）を取得します。
     * 
     * @return 入湯税（小人）
     */
    public String getSpaTaxChild() {
        return spaTaxChild;
    }

    /**
     * 入湯税有無を取得します。
     * 
     * @return 入湯税有無
     */
    public String getSpaTaxFlg() {
        return spaTaxFlg;
    }

    /**
     * 連泊割引金額２泊以降一律（大人）を取得します。
     * 
     * @return 連泊割引金額２泊以降一律（大人）
     */
    public String getStayDiscountAdlt() {
        return stayDiscountAdlt;
    }

    /**
     * 連泊割引金額１泊（大人）を取得します。
     * 
     * @return 連泊割引金額１泊（大人）
     */
    public String getStayDiscountAdlt1() {
        return stayDiscountAdlt1;
    }

    /**
     * 連泊割引金額２泊（大人）を取得します。
     * 
     * @return 連泊割引金額２泊（大人）
     */
    public String getStayDiscountAdlt2() {
        return stayDiscountAdlt2;
    }

    /**
     * 連泊割引金額３泊（大人）を取得します。
     * 
     * @return 連泊割引金額３泊（大人）
     */
    public String getStayDiscountAdlt3() {
        return stayDiscountAdlt3;
    }

    /**
     * 連泊割引金額４泊（大人）を取得します。
     * 
     * @return 連泊割引金額４泊（大人）
     */
    public String getStayDiscountAdlt4() {
        return stayDiscountAdlt4;
    }

    /**
     * 連泊割引金額５泊以上（大人）を取得します。
     * 
     * @return 連泊割引金額５泊以上（大人）
     */
    public String getStayDiscountAdlt5() {
        return stayDiscountAdlt5;
    }

    /**
     * 連泊割引金額２泊以降一律（小人）を取得します。
     * 
     * @return 連泊割引金額２泊以降一律（小人）
     */
    public String getStayDiscountChild() {
        return stayDiscountChild;
    }

    /**
     * 連泊割引金額１泊（小人）を取得します。
     * 
     * @return 連泊割引金額１泊（小人）
     */
    public String getStayDiscountChild1() {
        return stayDiscountChild1;
    }

    /**
     * 連泊割引金額２泊（小人）を取得します。
     * 
     * @return 連泊割引金額２泊（小人）
     */
    public String getStayDiscountChild2() {
        return stayDiscountChild2;
    }

    /**
     * 連泊割引金額３泊（小人）を取得します。
     * 
     * @return 連泊割引金額３泊（小人）
     */
    public String getStayDiscountChild3() {
        return stayDiscountChild3;
    }

    /**
     * 連泊割引金額４泊（小人）を取得します。
     * 
     * @return 連泊割引金額４泊（小人）
     */
    public String getStayDiscountChild4() {
        return stayDiscountChild4;
    }

    /**
     * 連泊割引金額５泊以上（小人）を取得します。
     * 
     * @return 連泊割引金額５泊以上（小人）
     */
    public String getStayDiscountChild5() {
        return stayDiscountChild5;
    }

    /**
     * 連泊割引区分を取得します。
     * 
     * @return 連泊割引区分
     */
    public String getStayDiscountDiv() {
        return stayDiscountDiv;
    }

    /**
     * 連泊割引有無を取得します。
     * 
     * @return 連泊割引有無
     */
    public String getStayDiscountFlg() {
        return stayDiscountFlg;
    }

    /**
     * 提供期間終了日を取得します。
     * 
     * @return 提供期間終了日
     */
    @Override
    public String getTermEndD() {
        return termEndD;
    }

    /**
     * 提供期間終了月を取得します。
     * 
     * @return 提供期間終了月
     */
    @Override
    public String getTermEndM() {
        return termEndM;
    }

    /**
     * 提供期間終了年を取得します。
     * 
     * @return 提供期間終了年
     */
    @Override
    public String getTermEndY() {
        return termEndY;
    }

    /**
     * 提供期間終了年月日を取得します。
     * 
     * @return 提供期間終了年月日
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * 提供期間開始日を取得します。
     * 
     * @return 提供期間開始日
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * 提供期間開始月を取得します。
     * 
     * @return 提供期間開始月
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * 提供期間開始年を取得します。
     * 
     * @return 提供期間開始年
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * 提供期間開始年月日を取得します。
     * 
     * @return 提供期間開始年月日
     */
    public String getTermFromYmd() {
        return termFromYmd;
    }

    /**
     * パソコンを取得します。
     * 
     * @return パソコン
     */
    public String getTerminalNo() {
        return terminalNo;
    }

    /**
     * 東京都宿泊税有無を取得します。
     * 
     * @return 東京都宿泊税有無
     */
    public Integer getTyoStayTaxFlg() {
        return tyoStayTaxFlg;
    }

    /**
     * 地区略称名（カナ）を設定します。
     * 
     * @param areaAbbrNmKana
     *            地区略称名（カナ）
     */
    public void setAreaAbbrNmKana(String areaAbbrNmKana) {
        this.areaAbbrNmKana = areaAbbrNmKana;
    }

    /**
     * 地区略称名（漢字）を設定します。
     * 
     * @param areaAbbrNmKanji
     *            地区略称名（漢字）
     */
    public void setAreaAbbrNmKanji(String areaAbbrNmKanji) {
        this.areaAbbrNmKanji = areaAbbrNmKanji;
    }

    /**
     * 地区名（カナ）を設定します。
     * 
     * @param areaNmKana
     *            地区名（カナ）
     */
    public void setAreaNmKana(String areaNmKana) {
        this.areaNmKana = areaNmKana;
    }

    /**
     * 地区名（漢字）を設定します。
     * 
     * @param areaNmKanji
     *            地区名（漢字）
     */
    public void setAreaNmKanji(String areaNmKanji) {
        this.areaNmKanji = areaNmKanji;
    }

    /**
     * チェックイン時間fromを設定します。
     * 
     * @param checkInFrom
     *            チェックイン時間from
     */
    public void setCheckInFrom(String checkInFrom) {
        this.checkInFrom = checkInFrom;
    }

    /**
     * チェックイン時間fromHを設定します。
     * 
     * @param checkInFromH
     *            チェックイン時間from
     */
    public void setCheckInFromH(String checkInFromH) {
        this.checkInFromH = checkInFromH;
    }

    /**
     * チェックイン時間fromMを設定します。
     * 
     * @param checkInFromM
     *            チェックイン時間from
     */
    public void setCheckInFromM(String checkInFromM) {
        this.checkInFromM = checkInFromM;
    }

    /**
     * チェックイン時間（通常）を設定します。
     * 
     * @param checkInNor
     *            チェックイン時間（通常）
     */
    public void setCheckInNor(String checkInNor) {
        this.checkInNor = checkInNor;
    }

    /**
     * チェックイン時間（通常）時を設定します。
     * 
     * @param checkInNorH
     *            チェックイン時間（通常）時
     */
    public void setCheckInNorH(String checkInNorH) {
        this.checkInNorH = checkInNorH;
    }

    /**
     * チェックイン時間（通常）分を設定します。
     * 
     * @param checkInNorM
     *            チェックイン時間（通常）分
     */
    public void setCheckInNorM(String checkInNorM) {
        this.checkInNorM = checkInNorM;
    }

    /**
     * チェックイン時間toを設定します。
     * 
     * @param checkInTo
     *            チェックイン時間to
     */
    public void setCheckInTo(String checkInTo) {
        this.checkInTo = checkInTo;
    }

    /**
     * チェックイン時間toHを設定します。
     * 
     * @param checkInToH
     *            チェックイン時間toH
     */
    public void setCheckInToH(String checkInToH) {
        this.checkInToH = checkInToH;
    }

    /**
     * チェックイン時間toMを設定します。
     * 
     * @param checkInToM
     *            チェックイン時間toM
     */
    public void setCheckInToM(String checkInToM) {
        this.checkInToM = checkInToM;
    }

    /**
     * チェックアウト時間を設定します。
     * 
     * @param checkOut
     *            チェックアウト時間
     */
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    /**
     * チェックアウト時間時を設定します。
     * 
     * @param checkOutH
     *            チェックアウト時間時
     */
    public void setCheckOutH(String checkOutH) {
        this.checkOutH = checkOutH;
    }

    /**
     * チェックアウト時間分を設定します。
     * 
     * @param checkOutM
     *            チェックアウト時間分
     */
    public void setCheckOutM(String checkOutM) {
        this.checkOutM = checkOutM;
    }

    /**
     * チェックアウト時間（通常）を設定します。
     * 
     * @param checkOutNor
     *            チェックアウト時間（通常）
     */
    public void setCheckOutNor(String checkOutNor) {
        this.checkOutNor = checkOutNor;
    }

    /**
     * チェックアウト時間（通常）時を設定します。
     * 
     * @param checkOutNorH
     *            チェックアウト時間（通常）時
     */
    public void setCheckOutNorH(String checkOutNorH) {
        this.checkOutNorH = checkOutNorH;
    }

    /**
     * チェックアウト時間（通常）分を設定します。
     * 
     * @param checkOutNorM
     *            チェックアウト時間（通常）分
     */
    public void setCheckOutNorM(String checkOutNorM) {
        this.checkOutNorM = checkOutNorM;
    }

    /**
     * 緊急連絡先備考を設定します。
     * 
     * @param emenAddrMemo
     *            緊急連絡先備考
     */
    public void setEmenAddrMemo(String emenAddrMemo) {
        this.emenAddrMemo = emenAddrMemo;
    }

    /**
     * 緊急連絡先会社名称（平日）を設定します。
     * 
     * @param emenComOrd
     *            緊急連絡先会社名称（平日）
     */
    public void setEmenComOrd(String emenComOrd) {
        this.emenComOrd = emenComOrd;
    }

    /**
     * 緊急連絡先会社名称（土日）を設定します。
     * 
     * @param emenComWk
     *            緊急連絡先会社名称（土日）
     */
    public void setEmenComWk(String emenComWk) {
        this.emenComWk = emenComWk;
    }

    /**
     * 緊急連絡先担当者（平日）を設定します。
     * 
     * @param emenPersonOrd
     *            緊急連絡先担当者（平日）
     */
    public void setEmenPersonOrd(String emenPersonOrd) {
        this.emenPersonOrd = emenPersonOrd;
    }

    /**
     * 緊急連絡先担当者（土日）を設定します。
     * 
     * @param emenPersonWk
     *            緊急連絡先担当者（土日）
     */
    public void setEmenPersonWk(String emenPersonWk) {
        this.emenPersonWk = emenPersonWk;
    }

    /**
     * 緊急連絡先電話番号（平日）を設定します。
     * 
     * @param emenTelOrd
     *            緊急連絡先電話番号（平日）
     */
    public void setEmenTelOrd(String emenTelOrd) {
        this.emenTelOrd = emenTelOrd;
    }

    /**
     * 緊急連絡先電話番号（土日）を設定します。
     * 
     * @param emenTelWk
     *            緊急連絡先電話番号（土日）
     */
    public void setEmenTelWk(String emenTelWk) {
        this.emenTelWk = emenTelWk;
    }

    /**
     * 除外日を設定します。
     * 
     * @param exceptDate
     *            除外日
     */
    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    /**
     * 施設住所を設定します。
     * 
     * @param facilityAddr
     *            施設住所
     */
    public void setFacilityAddr(String facilityAddr) {
        this.facilityAddr = facilityAddr;
    }

    /**
     * 施設ファックスを設定します。
     * 
     * @param facilityFax
     *            施設ファックス
     */
    public void setFacilityFax(String facilityFax) {
        this.facilityFax = facilityFax;
    }

    /**
     * 施設郵便番号を設定します。
     * 
     * @param facilityPostCd
     *            施設郵便番号
     */
    public void setFacilityPostCd(String facilityPostCd) {
        this.facilityPostCd = facilityPostCd;
    }

    /**
     * 施設電話を設定します。
     * 
     * @param facilityTel
     *            施設電話
     */
    public void setFacilityTel(String facilityTel) {
        this.facilityTel = facilityTel;
    }

    /**
     * 施設URLを設定します。
     * 
     * @param facilityUrl
     *            施設URL
     */
    public void setFacilityUrl(String facilityUrl) {
        this.facilityUrl = facilityUrl;
    }

    /**
     * 料金条件コードを設定します。
     * 
     * @param feeCondCd
     *            料金条件コード
     */
    public void setFeeCondCd(Integer feeCondCd) {
        this.feeCondCd = feeCondCd;
    }

    /**
     * 商品区分を設定します。
     * 
     * @param goodsDiv
     *            商品区分
     */
    public void setGoodsDiv(Integer goodsDiv) {
        this.goodsDiv = goodsDiv;
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
     * 手仕舞日を設定します。
     * 
     * @param liquidateDay
     *            手仕舞日
     */
    public void setLiquidateDay(String liquidateDay) {
        this.liquidateDay = liquidateDay;
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
     * 手仕舞時刻（当日設定時）時を設定します。
     * 
     * @param liquidateTimeH
     *            手仕舞時刻（当日設定時）時
     */
    public void setLiquidateTimeH(String liquidateTimeH) {
        this.liquidateTimeH = liquidateTimeH;
    }

    /**
     * 手仕舞時刻（当日設定時）分を設定します。
     * 
     * @param liquidateTimeM
     *            手仕舞時刻（当日設定時）分
     */
    public void setLiquidateTimeM(String liquidateTimeM) {
        this.liquidateTimeM = liquidateTimeM;
    }

    /**
     * 食事条件コードを設定します。
     * 
     * @param mealCondCd
     *            食事条件コード
     */
    public void setMealCondCd(Integer mealCondCd) {
        this.mealCondCd = mealCondCd;
    }

    /**
     * 備考を設定します。
     * 
     * @param memo
     *            備考
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 送迎要予約選択フラグ1を設定します。
     * 
     * @param msReserveFlg1
     *            送迎要予約選択フラグ1
     */
    public void setMsReserveFlg1(String msReserveFlg1) {
        this.msReserveFlg1 = msReserveFlg1;
    }

    /**
     * 送迎要予約選択フラグ2を設定します。
     * 
     * @param msReserveFlg2
     *            送迎要予約選択フラグ2
     */
    public void setMsReserveFlg2(String msReserveFlg2) {
        this.msReserveFlg2 = msReserveFlg2;
    }

    /**
     * 販売手数料を設定します。
     * 
     * @param saleTax
     *            販売手数料
     */
    public void setSaleTax(String saleTax) {
        this.saleTax = saleTax;
    }

    /**
     * 販売手数料区分を設定します。
     * 
     * @param saleTaxType
     *            販売手数料区分
     */
    public void setSaleTaxType(String saleTaxType) {
        this.saleTaxType = saleTaxType;
    }

    /**
     * 入湯税（大人）を設定します。
     * 
     * @param spaTaxAdlt
     *            入湯税（大人）
     */
    public void setSpaTaxAdlt(String spaTaxAdlt) {
        this.spaTaxAdlt = spaTaxAdlt;
    }

    /**
     * 入湯税（小人）を設定します。
     * 
     * @param spaTaxChild
     *            入湯税（小人）
     */
    public void setSpaTaxChild(String spaTaxChild) {
        this.spaTaxChild = spaTaxChild;
    }

    /**
     * 入湯税有無を設定します。
     * 
     * @param spaTaxFlg
     *            入湯税有無
     */
    public void setSpaTaxFlg(String spaTaxFlg) {
        this.spaTaxFlg = spaTaxFlg;
    }

    /**
     * 連泊割引金額２泊以降一律（大人）を設定します。
     * 
     * @param stayDiscountAdlt
     *            連泊割引金額２泊以降一律（大人）
     */
    public void setStayDiscountAdlt(String stayDiscountAdlt) {
        this.stayDiscountAdlt = stayDiscountAdlt;
    }

    /**
     * 連泊割引金額１泊（大人）を設定します。
     * 
     * @param stayDiscountAdlt1
     *            連泊割引金額１泊（大人）
     */
    public void setStayDiscountAdlt1(String stayDiscountAdlt1) {
        this.stayDiscountAdlt1 = stayDiscountAdlt1;
    }

    /**
     * 連泊割引金額２泊（大人）を設定します。
     * 
     * @param stayDiscountAdlt2
     *            連泊割引金額２泊（大人）
     */
    public void setStayDiscountAdlt2(String stayDiscountAdlt2) {
        this.stayDiscountAdlt2 = stayDiscountAdlt2;
    }

    /**
     * 連泊割引金額３泊（大人）を設定します。
     * 
     * @param stayDiscountAdlt3
     *            連泊割引金額３泊（大人）
     */
    public void setStayDiscountAdlt3(String stayDiscountAdlt3) {
        this.stayDiscountAdlt3 = stayDiscountAdlt3;
    }

    /**
     * 連泊割引金額４泊（大人）を設定します。
     * 
     * @param stayDiscountAdlt4
     *            連泊割引金額４泊（大人）
     */
    public void setStayDiscountAdlt4(String stayDiscountAdlt4) {
        this.stayDiscountAdlt4 = stayDiscountAdlt4;
    }

    /**
     * 連泊割引金額５泊以上（大人）を設定します。
     * 
     * @param stayDiscountAdlt5
     *            連泊割引金額５泊以上（大人）
     */
    public void setStayDiscountAdlt5(String stayDiscountAdlt5) {
        this.stayDiscountAdlt5 = stayDiscountAdlt5;
    }

    /**
     * 連泊割引金額２泊以降一律（小人）を設定します。
     * 
     * @param stayDiscountChild
     *            連泊割引金額２泊以降一律（小人）
     */
    public void setStayDiscountChild(String stayDiscountChild) {
        this.stayDiscountChild = stayDiscountChild;
    }

    /**
     * 連泊割引金額１泊（小人）を設定します。
     * 
     * @param stayDiscountChild1
     *            連泊割引金額１泊（小人）
     */
    public void setStayDiscountChild1(String stayDiscountChild1) {
        this.stayDiscountChild1 = stayDiscountChild1;
    }

    /**
     * 連泊割引金額２泊（小人）を設定します。
     * 
     * @param stayDiscountChild2
     *            連泊割引金額２泊（小人）
     */
    public void setStayDiscountChild2(String stayDiscountChild2) {
        this.stayDiscountChild2 = stayDiscountChild2;
    }

    /**
     * 連泊割引金額３泊（小人）を設定します。
     * 
     * @param stayDiscountChild3
     *            連泊割引金額３泊（小人）
     */
    public void setStayDiscountChild3(String stayDiscountChild3) {
        this.stayDiscountChild3 = stayDiscountChild3;
    }

    /**
     * 連泊割引金額４泊（小人）を設定します。
     * 
     * @param stayDiscountChild4
     *            連泊割引金額４泊（小人）
     */
    public void setStayDiscountChild4(String stayDiscountChild4) {
        this.stayDiscountChild4 = stayDiscountChild4;
    }

    /**
     * 連泊割引金額５泊以上（小人）を設定します。
     * 
     * @param stayDiscountChild5
     *            連泊割引金額５泊以上（小人）
     */
    public void setStayDiscountChild5(String stayDiscountChild5) {
        this.stayDiscountChild5 = stayDiscountChild5;
    }

    /**
     * 連泊割引区分を設定します。
     * 
     * @param stayDiscountDiv
     *            連泊割引区分
     */
    public void setStayDiscountDiv(String stayDiscountDiv) {
        this.stayDiscountDiv = stayDiscountDiv;
    }

    /**
     * 連泊割引有無を設定します。
     * 
     * @param stayDiscountFlg
     *            連泊割引有無
     */
    public void setStayDiscountFlg(String stayDiscountFlg) {
        this.stayDiscountFlg = stayDiscountFlg;
    }

    /**
     * 提供期間終了日を設定します。
     * 
     * @param termEndD
     *            提供期間終了日
     */
    @Override
    public void setTermEndD(String termEndD) {
        this.termEndD = StringUtil.toHalf(termEndD);
    }

    /**
     * 提供期間終了月を設定します。
     * 
     * @param termEndM
     *            提供期間終了月
     */
    @Override
    public void setTermEndM(String termEndM) {
        this.termEndM = StringUtil.toHalf(termEndM);
    }

    /**
     * 提供期間終了年を設定します。
     * 
     * @param termEndY
     *            提供期間終了年
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = StringUtil.toHalf(termEndY);
    }

    /**
     * 提供期間終了年月日を設定します。
     * 
     * @param termEndYmd
     *            提供期間終了年月日
     */
    public void setTermEndYmd(String termEndYmd) {
        this.termEndYmd = termEndYmd;
    }

    /**
     * 提供期間開始日を設定します。
     * 
     * @param termFromD
     *            提供期間開始日
     */
    @Override
    public void setTermFromD(String termFromD) {
        this.termFromD = StringUtil.toHalf(termFromD);
    }

    /**
     * 提供期間開始月を設定します。
     * 
     * @param termFromM
     *            提供期間開始月
     */
    @Override
    public void setTermFromM(String termFromM) {
        this.termFromM = StringUtil.toHalf(termFromM);
    }

    /**
     * 提供期間開始年を設定します。
     * 
     * @param termFromY
     *            提供期間開始年
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = StringUtil.toHalf(termFromY);
    }

    /**
     * 提供期間開始年月日を設定します。
     * 
     * @param termFromYmd
     *            提供期間開始年月日
     */
    public void setTermFromYmd(String termFromYmd) {
        this.termFromYmd = termFromYmd;
    }

    /**
     * パソコンを設定します。
     * 
     * @param terminalNo
     *            パソコン
     */
    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    /**
     * 東京都宿泊税有無を設定します。
     * 
     * @param tyoStayTaxFlg
     *            東京都宿泊税有無
     */
    public void setTyoStayTaxFlg(Integer tyoStayTaxFlg) {
        this.tyoStayTaxFlg = tyoStayTaxFlg;
    }

}
