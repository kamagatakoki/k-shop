package jp.co.jreast.common.data.ddata; // SUPPRESS CHECKSTYLE (列数が多いため行数削減不可)

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]施設_リフト_スキー エンティティ
 * 
 * <pre>
 *   機能概要 ： 
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityLiftSki implements FacilityManageBodyKey {

    /** 施設コード */
    private String facilityCd;

    /** 施設パターン */
    private String facilityPattern;

    /** 回答書種別 */
    private String kindFlg;

    /** リフト券注意事項 */
    private String liftAttentionContent;

    /** リフト営業_早朝_営業日 */
    private String liftBsMorningDay;

    /** リフト営業_早朝_終了時間（時間） */
    private String liftBsMorningEndHour;

    /** リフト営業_早朝_終了時間（分） */
    private String liftBsMorningEndMinute;

    /** リフト営業_早朝_有無 */
    private String liftBsMorningFlg;

    /** リフト営業_早朝_開始時間（時間） */
    private String liftBsMorningStartHour;

    /** リフト営業_早朝_開始時間（分） */
    private String liftBsMorningStartMinute;

    /** リフト営業_ナイター_営業日 */
    private String liftBsNightDay;

    /** リフト営業_ナイター_終了時間（時間） */
    private String liftBsNightEndHour;

    /** リフト営業_ナイター_終了時間（分） */
    private String liftBsNightEndMinute;

    /** リフト営業_ナイター_有無 */
    private String liftBsNightFlg;

    /** リフト営業_ナイター_開始時間（時間） */
    private String liftBsNightStartHour;

    /** リフト営業_ナイター_開始時間（分） */
    private String liftBsNightStartMinute;

    /** リフト営業_通常_終了時間（時間） */
    private String liftBsNomalEndHour;

    /** リフト営業_通常_終了時間（分） */
    private String liftBsNomalEndMinute;

    /** リフト営業_通常_開始時間（時間） */
    private String liftBsNomalStartHour;

    /** リフト営業_通常_開始時間（分） */
    private String liftBsNomalStartMinute;

    /** リフト営業_スキー場名 */
    private String liftBsSkiNm;

    /** リフト券引換え_方法 */
    private String liftChWayFlg;

    /** リフト券引換え_その他内容 */
    private String liftChWayOtherContent;

    /** リフト券販売_大人_びゅう割引額１ */
    private String liftSlAdultByu1;

    /** リフト券販売_大人_びゅう割引額２ */
    private String liftSlAdultByu2;

    /** リフト券販売_大人_割引額１ */
    private String liftSlAdultDiscount1;

    /** リフト券販売_大人_割引額２ */
    private String liftSlAdultDiscount2;

    /** リフト券販売_大人_券種１ */
    private String liftSlAdultKind1;

    /** リフト券販売_大人_券種２ */
    private String liftSlAdultKind2;

    /** リフト券販売_大人_通常額１ */
    private String liftSlAdultNomal1;

    /** リフト券販売_大人_通常額２ */
    private String liftSlAdultNomal2;

    /** リフト券販売_小人_びゅう割引額１ */
    private String liftSlChildByu1;

    /** リフト券販売_小人_びゅう割引額２ */
    private String liftSlChildByu2;

    /** リフト券販売_小人_割引額１ */
    private String liftSlChildDiscount1;

    /** リフト券販売_小人_割引額２ */
    private String liftSlChildDiscount2;

    /** リフト券販売_小人_券種１ */
    private String liftSlChildKind1;

    /** リフト券販売_小人_券種２ */
    private String liftSlChildKind2;

    /** リフト券販売_小人_通常額１ */
    private String liftSlChildNomal1;

    /** リフト券販売_小人_通常額２ */
    private String liftSlChildNomal2;

    /** リフト券販売_スキー場名 */
    private String liftSlSkiNm;

    /** リフト券代含む_有無 */
    private String liftTkContainFlg;

    /** リフト券種 */
    private String liftTkKind;

    /** リフト券種_その他内容 */
    private String liftTkOtherContent;

    /** リフト券代含む_スキー場名 */
    private String liftTkSkiNm;

    /** リフト券有効_帰着日ナイター */
    private String liftYkBackNight;

    /** リフト券有効_ロープウェイ */
    private String liftYkCable;

    /** リフト券有効_ゴンドラ */
    private String liftYkGondola;

    /** リフト券有効_早朝 */
    private String liftYkMorning;

    /** リフト券有効_その他 */
    private String liftYkOther;

    /** リフト券有効_その他内容 */
    private String liftYkOtherContent;

    /** リフト券有効_宿泊日ナイター */
    private String liftYkStayNight;

    /** レンタルスノーボード_１日_大人_割引前 */
    private String rentBdDayAdult1;

    /** レンタルスノーボード_１日_大人_割引後 */
    private String rentBdDayAdult2;

    /** レンタルスノーボード_１日_小人_割引前 */
    private String rentBdDayChild1;

    /** レンタルスノーボード_１日_小人_割引後 */
    private String rentBdDayChild2;

    /** レンタルスノーボード_割引有無 */
    private String rentBdDiscountFlg;

    /** レンタルスノーボード_半日_大人_割引前 */
    private String rentBdHalfAdult1;

    /** レンタルスノーボード_半日_大人_割引後 */
    private String rentBdHalfAdult2;

    /** レンタルスノーボード_半日_小人_割引前 */
    private String rentBdHalfChild1;

    /** レンタルスノーボード_半日_小人_割引後 */
    private String rentBdHalfChild2;

    /** レンタルスノーボード_特定_大人_割引前 */
    private String rentBdSpAdult1;

    /** レンタルスノーボード_特定_大人_割引後 */
    private String rentBdSpAdult2;

    /** レンタルスノーボード_特定_小人_割引前 */
    private String rentBdSpChild1;

    /** レンタルスノーボード_特定_小人_割引後 */
    private String rentBdSpChild2;

    /** レンタルスノーボード_特定券種 */
    private String rentBdSpKind;

    /** レンタルスノーボード_在庫有無 */
    private String rentBdStockFlg;

    /** レンタルボードウェア_１日_大人_割引前 */
    private String rentBdwDayAdult1;

    /** レンタルボードウェア_１日_大人_割引後 */
    private String rentBdwDayAdult2;

    /** レンタルボードウェア_１日_小人_割引前 */
    private String rentBdwDayChild1;

    /** レンタルボードウェア_１日_小人_割引後 */
    private String rentBdwDayChild2;

    /** レンタルボードウェア_割引有無 */
    private String rentBdwDiscountFlg;

    /** レンタルボードウェア_半日_大人_割引前 */
    private String rentBdwHalfAdult1;

    /** レンタルボードウェア_半日_大人_割引後 */
    private String rentBdwHalfAdult2;

    /** レンタルボードウェア_半日_小人_割引前 */
    private String rentBdwHalfChild1;

    /** レンタルボードウェア_半日_小人_割引後 */
    private String rentBdwHalfChild2;

    /** レンタルボードウェア_特定_大人_割引前 */
    private String rentBdwSpAdult1;

    /** レンタルボードウェア_特定_大人_割引後 */
    private String rentBdwSpAdult2;

    /** レンタルボードウェア_特定_小人_割引前 */
    private String rentBdwSpChild1;

    /** レンタルボードウェア_特定_小人_割引後 */
    private String rentBdwSpChild2;

    /** レンタルボードウェア_特定券種 */
    private String rentBdwSpKind;

    /** レンタルボードウェア_在庫有無 */
    private String rentBdwStockFlg;

    /** レンタル交換有無 */
    private String rentChageFlg;

    /** レンタルカービング_１日_大人_割引前 */
    private String rentCvDayAdult1;

    /** レンタルカービング_１日_大人_割引後 */
    private String rentCvDayAdult2;

    /** レンタルカービング_１日_小人_割引前 */
    private String rentCvDayChild1;

    /** レンタルカービング_１日_小人_割引後 */
    private String rentCvDayChild2;

    /** レンタルカービング_割引有無 */
    private String rentCvDiscountFlg;

    /** レンタルカービング_半日_大人_割引前 */
    private String rentCvHalfAdult1;

    /** レンタルカービング_半日_大人_割引後 */
    private String rentCvHalfAdult2;

    /** レンタルカービング_半日_小人_割引前 */
    private String rentCvHalfChild1;

    /** レンタルカービング_半日_小人_割引後 */
    private String rentCvHalfChild2;

    /** レンタルカービング_特定_大人_割引前 */
    private String rentCvSpAdult1;

    /** レンタルカービング_特定_大人_割引後 */
    private String rentCvSpAdult2;

    /** レンタルカービング_特定_小人_割引前 */
    private String rentCvSpChild1;

    /** レンタルカービング_特定_小人_割引後 */
    private String rentCvSpChild2;

    /** レンタルカービング_特定券種 */
    private String rentCvSpKind;

    /** レンタルカービング_在庫有無 */
    private String rentCvStockFlg;

    /** ファンスキーレンタル料金帯 */
    private String rentFsChargeFlg;

    /** ファンスキーレンタル有無 */
    private String rentFsFlg;

    /** レンタル_申込方法 */
    private String rentRequestWay;

    /** レンタルスキー_１日_大人_割引前 */
    private String rentSkiDayAdult1;

    /** レンタルスキー_１日_大人_割引後 */
    private String rentSkiDayAdult2;

    /** レンタルスキー_１日_小人_割引前 */
    private String rentSkiDayChild1;

    /** レンタルスキー_１日_小人_割引後 */
    private String rentSkiDayChild2;

    /** レンタルスキー_割引有無 */
    private String rentSkiDiscountFlg;

    /** レンタルスキー_半日_大人_割引前 */
    private String rentSkiHalfAdult1;

    /** レンタルスキー_半日_大人_割引後 */
    private String rentSkiHalfAdult2;

    /** レンタルスキー_半日_小人_割引前 */
    private String rentSkiHalfChild1;

    /** レンタルスキー_半日_小人_割引後 */
    private String rentSkiHalfChild2;

    /** レンタル料金_備考 */
    private String rentSkiPriceMemo;

    /** レンタルスキー_特定_大人_割引前 */
    private String rentSkiSpAdult1;

    /** レンタルスキー_特定_大人_割引後 */
    private String rentSkiSpAdult2;

    /** レンタルスキー_特定_小人_割引前 */
    private String rentSkiSpChild1;

    /** レンタルスキー_特定_小人_割引後 */
    private String rentSkiSpChild2;

    /** レンタルスキー_特定券種 */
    private String rentSkiSpKind;

    /** レンタルスキー_在庫有無 */
    private String rentSkiStockFlg;

    /** レンタルスキーウェア_１日_大人_割引前 */
    private String rentSkiwDayAdult1;

    /** レンタルスキーウェア_１日_大人_割引後 */
    private String rentSkiwDayAdult2;

    /** レンタルスキーウェア_１日_小人_割引前 */
    private String rentSkiwDayChild1;

    /** レンタルスキーウェア_１日_小人_割引後 */
    private String rentSkiwDayChild2;

    /** レンタルスキーウェア_割引有無 */
    private String rentSkiwDiscountFlg;

    /** レンタルスキーウェア_半日_大人_割引前 */
    private String rentSkiwHalfAdult1;

    /** レンタルスキーウェア_半日_大人_割引後 */
    private String rentSkiwHalfAdult2;

    /** レンタルスキーウェア_半日_小人_割引前 */
    private String rentSkiwHalfChild1;

    /** レンタルスキーウェア_半日_小人_割引後 */
    private String rentSkiwHalfChild2;

    /** レンタルスキーウェア_特定_大人_割引前 */
    private String rentSkiwSpAdult1;

    /** レンタルスキーウェア_特定_大人_割引後 */
    private String rentSkiwSpAdult2;

    /** レンタルスキーウェア_特定_小人_割引前 */
    private String rentSkiwSpChild1;

    /** レンタルスキーウェア_特定_小人_割引後 */
    private String rentSkiwSpChild2;

    /** レンタルスキーウェア_特定券種 */
    private String rentSkiwSpKind;

    /** レンタルスキーウェア_在庫有無 */
    private String rentSkiwStockFlg;

    /** スクールボード_１日_大人_割引前 */
    private String schoolBdDayAdult1;

    /** スクールボード_１日_大人_割引後 */
    private String schoolBdDayAdult2;

    /** スクールボード_１日_小人_割引前 */
    private String schoolBdDayChild1;

    /** スクールボード_１日_小人_割引後 */
    private String schoolBdDayChild2;

    /** スクールボード_割引有無 */
    private String schoolBdDiscountFlg;

    /** スクールボード_半日_大人_割引前 */
    private String schoolBdHalfAdult1;

    /** スクールボード_半日_大人_割引後 */
    private String schoolBdHalfAdult2;

    /** スクールボード_半日_小人_割引前 */
    private String schoolBdHalfChild1;

    /** スクールボード_半日_小人_割引後 */
    private String schoolBdHalfChild2;

    /** スクールボード_特定１_大人_割引前 */
    private String schoolBdTime1Adult1;

    /** スクールボード_特定１_大人_割引後 */
    private String schoolBdTime1Adult2;

    /** スクールボード_特定１_小人_割引前 */
    private String schoolBdTime1Child1;

    /** スクールボード_特定１_小人_割引後 */
    private String schoolBdTime1Child2;

    /** スクールボード_特定１_時間 */
    private String schoolBdTime1Hh;

    /** スクールボード_特定１_分 */
    private String schoolBdTime1Mm;

    /** スクールボード_特定２_大人_割引前 */
    private String schoolBdTime2Adult1;

    /** スクールボード_特定２_大人_割引後 */
    private String schoolBdTime2Adult2;

    /** スクールボード_特定２_小人_割引前 */
    private String schoolBdTime2Child1;

    /** スクールボード_特定２_小人_割引後 */
    private String schoolBdTime2Child2;

    /** スクールボード_特定２_時間 */
    private String schoolBdTime2Hh;

    /** スクールボード_特定２_分 */
    private String schoolBdTime2Mm;

    /** スクール_その他内容 */
    private String schoolOtherContent;

    /** スクール料金_備考 */
    private String schoolPriceMemo;

    /** スクール_申込方法 */
    private String schoolRequestWay;

    /** スクールスキー_１日_大人_割引前 */
    private String schoolSkiDayAdult1;

    /** スクールスキー_１日_大人_割引後 */
    private String schoolSkiDayAdult2;

    /** スクールスキー_１日_小人_割引前 */
    private String schoolSkiDayChild1;

    /** スクールスキー_１日_小人_割引後 */
    private String schoolSkiDayChild2;

    /** スクールスキー_割引有無 */
    private String schoolSkiDiscountFlg;

    /** スクールスキー_半日_大人_割引前 */
    private String schoolSkiHalfAdult1;

    /** スクールスキー_半日_大人_割引後 */
    private String schoolSkiHalfAdult2;

    /** スクールスキー_半日_小人_割引前 */
    private String schoolSkiHalfChild1;

    /** スクールスキー_半日_小人_割引後 */
    private String schoolSkiHalfChild2;

    /** スクールスキー_特定１_大人_割引前 */
    private String schoolSkiTime1Adult1;

    /** スクールスキー_特定１_大人_割引後 */
    private String schoolSkiTime1Adult2;

    /** スクールスキー_特定１_小人_割引前 */
    private String schoolSkiTime1Child1;

    /** スクールスキー_特定１_小人_割引後 */
    private String schoolSkiTime1Child2;

    /** スクールスキー_特定１_時間 */
    private String schoolSkiTime1Hh;

    /** スクールスキー_特定１_分 */
    private String schoolSkiTime1Mm;

    /** スクールスキー_特定２_大人_割引前 */
    private String schoolSkiTime2Adult1;

    /** スクールスキー_特定２_大人_割引後 */
    private String schoolSkiTime2Adult2;

    /** スクールスキー_特定２_小人_割引前 */
    private String schoolSkiTime2Child1;

    /** スクールスキー_特定２_小人_割引後 */
    private String schoolSkiTime2Child2;

    /** スクールスキー_特定２_時間 */
    private String schoolSkiTime2Hh;

    /** スクールスキー_特定２_分 */
    private String schoolSkiTime2Mm;

    /** スキーキャッチコピー */
    private String skiCatchcopy;

    /**
     * 施設コードを取得します。
     * 
     * @return 施設コード
     */
    @Override
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設パターンを取得します。
     * 
     * @return 施設パターン
     */
    @Override
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * 回答書種別を取得します。
     * 
     * @return 回答書種別
     */
    @Override
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * リフト券注意事項を取得します。
     * 
     * @return リフト券注意事項
     */
    public String getLiftAttentionContent() {
        return liftAttentionContent;
    }

    /**
     * リフト営業_早朝_営業日を取得します。
     * 
     * @return リフト営業_早朝_営業日
     */
    public String getLiftBsMorningDay() {
        return liftBsMorningDay;
    }

    /**
     * リフト営業_早朝_終了時間を取得します。
     * 
     * @return リフト営業_早朝_終了時間
     */
    public String getLiftBsMorningEnd() {
        return DKikakuWebUtil.buildTime(getLiftBsMorningEndHour(),
                getLiftBsMorningEndMinute());
    }

    /**
     * リフト営業_早朝_終了時間（時間）を取得します。
     * 
     * @return リフト営業_早朝_終了時間（時間）
     */
    public String getLiftBsMorningEndHour() {
        return liftBsMorningEndHour;
    }

    /**
     * リフト営業_早朝_終了時間（分）を取得します。
     * 
     * @return リフト営業_早朝_終了時間（分）
     */
    public String getLiftBsMorningEndMinute() {
        return liftBsMorningEndMinute;
    }

    /**
     * リフト営業_早朝_有無を取得します。
     * 
     * @return リフト営業_早朝_有無
     */
    public String getLiftBsMorningFlg() {
        return liftBsMorningFlg;
    }

    /**
     * リフト営業_早朝_開始時間を取得します。
     * 
     * @return リフト営業_早朝_開始時間
     */
    public String getLiftBsMorningStart() {
        return DKikakuWebUtil.buildTime(getLiftBsMorningStartHour(),
                getLiftBsMorningStartMinute());
    }

    /**
     * リフト営業_早朝_開始時間（時間）を取得します。
     * 
     * @return リフト営業_早朝_開始時間（時間）
     */
    public String getLiftBsMorningStartHour() {
        return liftBsMorningStartHour;
    }

    /**
     * リフト営業_早朝_開始時間（分）を取得します。
     * 
     * @return リフト営業_早朝_開始時間（分）
     */
    public String getLiftBsMorningStartMinute() {
        return liftBsMorningStartMinute;
    }

    /**
     * リフト営業_ナイター_営業日を取得します。
     * 
     * @return リフト営業_ナイター_営業日
     */
    public String getLiftBsNightDay() {
        return liftBsNightDay;
    }

    /**
     * リフト営業_ナイター_終了時間を取得します。
     * 
     * @return リフト営業_ナイター_終了時間
     */
    public String getLiftBsNightEnd() {
        return DKikakuWebUtil.buildTime(getLiftBsNightEndHour(),
                getLiftBsNightEndMinute());
    }

    /**
     * リフト営業_ナイター_終了時間（時間）を取得します。
     * 
     * @return リフト営業_ナイター_終了時間（時間）
     */
    public String getLiftBsNightEndHour() {
        return liftBsNightEndHour;
    }

    /**
     * リフト営業_ナイター_終了時間（分）を取得します。
     * 
     * @return リフト営業_ナイター_終了時間（分）
     */
    public String getLiftBsNightEndMinute() {
        return liftBsNightEndMinute;
    }

    /**
     * リフト営業_ナイター_有無を取得します。
     * 
     * @return リフト営業_ナイター_有無
     */
    public String getLiftBsNightFlg() {
        return liftBsNightFlg;
    }

    /**
     * リフト営業_ナイター_開始時間を取得します。
     * 
     * @return リフト営業_ナイター_開始時間
     */
    public String getLiftBsNightStart() {
        return DKikakuWebUtil.buildTime(getLiftBsNightStartHour(),
                getLiftBsNightStartMinute());
    }

    /**
     * リフト営業_ナイター_開始時間（時間）を取得します。
     * 
     * @return リフト営業_ナイター_開始時間（時間）
     */
    public String getLiftBsNightStartHour() {
        return liftBsNightStartHour;
    }

    /**
     * リフト営業_ナイター_開始時間（分）を取得します。
     * 
     * @return リフト営業_ナイター_開始時間（分）
     */
    public String getLiftBsNightStartMinute() {
        return liftBsNightStartMinute;
    }

    /**
     * リフト営業_通常_終了時間を取得します。
     * 
     * @return リフト営業_通常_終了時間
     */
    public String getLiftBsNomalEnd() {
        return DKikakuWebUtil.buildTime(getLiftBsNomalEndHour(),
                getLiftBsNomalEndMinute());
    }

    /**
     * リフト営業_通常_終了時間（時間）を取得します。
     * 
     * @return リフト営業_通常_終了時間（時間）
     */
    public String getLiftBsNomalEndHour() {
        return liftBsNomalEndHour;
    }

    /**
     * リフト営業_通常_終了時間（分）を取得します。
     * 
     * @return リフト営業_通常_終了時間（分）
     */
    public String getLiftBsNomalEndMinute() {
        return liftBsNomalEndMinute;
    }

    /**
     * リフト営業_通常_開始時間を取得します。
     * 
     * @return リフト営業_通常_開始時間
     */
    public String getLiftBsNomalStart() {
        return DKikakuWebUtil.buildTime(getLiftBsNomalStartHour(),
                getLiftBsNomalStartMinute());
    }

    /**
     * リフト営業_通常_開始時間（時間）を取得します。
     * 
     * @return リフト営業_通常_開始時間（時間）
     */
    public String getLiftBsNomalStartHour() {
        return liftBsNomalStartHour;
    }

    /**
     * リフト営業_通常_開始時間（分）を取得します。
     * 
     * @return リフト営業_通常_開始時間（分）
     */
    public String getLiftBsNomalStartMinute() {
        return liftBsNomalStartMinute;
    }

    /**
     * リフト営業_スキー場名を取得します。
     * 
     * @return リフト営業_スキー場名
     */
    public String getLiftBsSkiNm() {
        return liftBsSkiNm;
    }

    /**
     * リフト券引換え_方法を取得します。
     * 
     * @return リフト券引換え_方法
     */
    public String getLiftChWayFlg() {
        return liftChWayFlg;
    }

    /**
     * リフト券引換え_その他内容を取得します。
     * 
     * @return リフト券引換え_その他内容
     */
    public String getLiftChWayOtherContent() {
        return liftChWayOtherContent;
    }

    /**
     * リフト券販売_大人_びゅう割引額１を取得します。
     * 
     * @return リフト券販売_大人_びゅう割引額１
     */
    public String getLiftSlAdultByu1() {
        return liftSlAdultByu1;
    }

    /**
     * リフト券販売_大人_びゅう割引額２を取得します。
     * 
     * @return リフト券販売_大人_びゅう割引額２
     */
    public String getLiftSlAdultByu2() {
        return liftSlAdultByu2;
    }

    /**
     * リフト券販売_大人_割引額１を取得します。
     * 
     * @return リフト券販売_大人_割引額１
     */
    public String getLiftSlAdultDiscount1() {
        return liftSlAdultDiscount1;
    }

    /**
     * リフト券販売_大人_割引額２を取得します。
     * 
     * @return リフト券販売_大人_割引額２
     */
    public String getLiftSlAdultDiscount2() {
        return liftSlAdultDiscount2;
    }

    /**
     * リフト券販売_大人_券種１を取得します。
     * 
     * @return リフト券販売_大人_券種１
     */
    public String getLiftSlAdultKind1() {
        return liftSlAdultKind1;
    }

    /**
     * リフト券販売_大人_券種２を取得します。
     * 
     * @return リフト券販売_大人_券種２
     */
    public String getLiftSlAdultKind2() {
        return liftSlAdultKind2;
    }

    /**
     * リフト券販売_大人_通常額１を取得します。
     * 
     * @return リフト券販売_大人_通常額１
     */
    public String getLiftSlAdultNomal1() {
        return liftSlAdultNomal1;
    }

    /**
     * リフト券販売_大人_通常額２を取得します。
     * 
     * @return リフト券販売_大人_通常額２
     */
    public String getLiftSlAdultNomal2() {
        return liftSlAdultNomal2;
    }

    /**
     * リフト券販売_小人_びゅう割引額１を取得します。
     * 
     * @return リフト券販売_小人_びゅう割引額１
     */
    public String getLiftSlChildByu1() {
        return liftSlChildByu1;
    }

    /**
     * リフト券販売_小人_びゅう割引額２を取得します。
     * 
     * @return リフト券販売_小人_びゅう割引額２
     */
    public String getLiftSlChildByu2() {
        return liftSlChildByu2;
    }

    /**
     * リフト券販売_小人_割引額１を取得します。
     * 
     * @return リフト券販売_小人_割引額１
     */
    public String getLiftSlChildDiscount1() {
        return liftSlChildDiscount1;
    }

    /**
     * リフト券販売_小人_割引額２を取得します。
     * 
     * @return リフト券販売_小人_割引額２
     */
    public String getLiftSlChildDiscount2() {
        return liftSlChildDiscount2;
    }

    /**
     * リフト券販売_小人_券種１を取得します。
     * 
     * @return リフト券販売_小人_券種１
     */
    public String getLiftSlChildKind1() {
        return liftSlChildKind1;
    }

    /**
     * リフト券販売_小人_券種２を取得します。
     * 
     * @return リフト券販売_小人_券種２
     */
    public String getLiftSlChildKind2() {
        return liftSlChildKind2;
    }

    /**
     * リフト券販売_小人_通常額１を取得します。
     * 
     * @return リフト券販売_小人_通常額１
     */
    public String getLiftSlChildNomal1() {
        return liftSlChildNomal1;
    }

    /**
     * リフト券販売_小人_通常額２を取得します。
     * 
     * @return リフト券販売_小人_通常額２
     */
    public String getLiftSlChildNomal2() {
        return liftSlChildNomal2;
    }

    /**
     * リフト券販売_スキー場名を取得します。
     * 
     * @return リフト券販売_スキー場名
     */
    public String getLiftSlSkiNm() {
        return liftSlSkiNm;
    }

    /**
     * リフト券代含む_有無を取得します。
     * 
     * @return リフト券代含む_有無
     */
    public String getLiftTkContainFlg() {
        return liftTkContainFlg;
    }

    /**
     * リフト券種を取得します。
     * 
     * @return リフト券種
     */
    public String getLiftTkKind() {
        return liftTkKind;
    }

    /**
     * リフト券種_その他内容を取得します。
     * 
     * @return リフト券種_その他内容
     */
    public String getLiftTkOtherContent() {
        return liftTkOtherContent;
    }

    /**
     * リフト券代含む_スキー場名を取得します。
     * 
     * @return リフト券代含む_スキー場名
     */
    public String getLiftTkSkiNm() {
        return liftTkSkiNm;
    }

    /**
     * リフト券有効_帰着日ナイターを取得します。
     * 
     * @return リフト券有効_帰着日ナイター
     */
    public String getLiftYkBackNight() {
        return liftYkBackNight;
    }

    /**
     * リフト券有効_ロープウェイを取得します。
     * 
     * @return リフト券有効_ロープウェイ
     */
    public String getLiftYkCable() {
        return liftYkCable;
    }

    /**
     * リフト券有効_ゴンドラを取得します。
     * 
     * @return リフト券有効_ゴンドラ
     */
    public String getLiftYkGondola() {
        return liftYkGondola;
    }

    /**
     * リフト券有効_早朝を取得します。
     * 
     * @return リフト券有効_早朝
     */
    public String getLiftYkMorning() {
        return liftYkMorning;
    }

    /**
     * リフト券有効_その他を取得します。
     * 
     * @return リフト券有効_その他
     */
    public String getLiftYkOther() {
        return liftYkOther;
    }

    /**
     * リフト券有効_その他内容を取得します。
     * 
     * @return リフト券有効_その他内容
     */
    public String getLiftYkOtherContent() {
        return liftYkOtherContent;
    }

    /**
     * リフト券有効_宿泊日ナイターを取得します。
     * 
     * @return リフト券有効_宿泊日ナイター
     */
    public String getLiftYkStayNight() {
        return liftYkStayNight;
    }

    /**
     * レンタルスノーボード_１日_大人_割引前を取得します。
     * 
     * @return レンタルスノーボード_１日_大人_割引前
     */
    public String getRentBdDayAdult1() {
        return rentBdDayAdult1;
    }

    /**
     * レンタルスノーボード_１日_大人_割引後を取得します。
     * 
     * @return レンタルスノーボード_１日_大人_割引後
     */
    public String getRentBdDayAdult2() {
        return rentBdDayAdult2;
    }

    /**
     * レンタルスノーボード_１日_小人_割引前を取得します。
     * 
     * @return レンタルスノーボード_１日_小人_割引前
     */
    public String getRentBdDayChild1() {
        return rentBdDayChild1;
    }

    /**
     * レンタルスノーボード_１日_小人_割引後を取得します。
     * 
     * @return レンタルスノーボード_１日_小人_割引後
     */
    public String getRentBdDayChild2() {
        return rentBdDayChild2;
    }

    /**
     * レンタルスノーボード_割引有無を取得します。
     * 
     * @return レンタルスノーボード_割引有無
     */
    public String getRentBdDiscountFlg() {
        return rentBdDiscountFlg;
    }

    /**
     * レンタルスノーボード_半日_大人_割引前を取得します。
     * 
     * @return レンタルスノーボード_半日_大人_割引前
     */
    public String getRentBdHalfAdult1() {
        return rentBdHalfAdult1;
    }

    /**
     * レンタルスノーボード_半日_大人_割引後を取得します。
     * 
     * @return レンタルスノーボード_半日_大人_割引後
     */
    public String getRentBdHalfAdult2() {
        return rentBdHalfAdult2;
    }

    /**
     * レンタルスノーボード_半日_小人_割引前を取得します。
     * 
     * @return レンタルスノーボード_半日_小人_割引前
     */
    public String getRentBdHalfChild1() {
        return rentBdHalfChild1;
    }

    /**
     * レンタルスノーボード_半日_小人_割引後を取得します。
     * 
     * @return レンタルスノーボード_半日_小人_割引後
     */
    public String getRentBdHalfChild2() {
        return rentBdHalfChild2;
    }

    /**
     * レンタルスノーボード_特定_大人_割引前を取得します。
     * 
     * @return レンタルスノーボード_特定_大人_割引前
     */
    public String getRentBdSpAdult1() {
        return rentBdSpAdult1;
    }

    /**
     * レンタルスノーボード_特定_大人_割引後を取得します。
     * 
     * @return レンタルスノーボード_特定_大人_割引後
     */
    public String getRentBdSpAdult2() {
        return rentBdSpAdult2;
    }

    /**
     * レンタルスノーボード_特定_小人_割引前を取得します。
     * 
     * @return レンタルスノーボード_特定_小人_割引前
     */
    public String getRentBdSpChild1() {
        return rentBdSpChild1;
    }

    /**
     * レンタルスノーボード_特定_小人_割引後を取得します。
     * 
     * @return レンタルスノーボード_特定_小人_割引後
     */
    public String getRentBdSpChild2() {
        return rentBdSpChild2;
    }

    /**
     * レンタルスノーボード_特定券種を取得します。
     * 
     * @return レンタルスノーボード_特定券種
     */
    public String getRentBdSpKind() {
        return rentBdSpKind;
    }

    /**
     * レンタルスノーボード_在庫有無を取得します。
     * 
     * @return レンタルスノーボード_在庫有無
     */
    public String getRentBdStockFlg() {
        return rentBdStockFlg;
    }

    /**
     * レンタルボードウェア_１日_大人_割引前を取得します。
     * 
     * @return レンタルボードウェア_１日_大人_割引前
     */
    public String getRentBdwDayAdult1() {
        return rentBdwDayAdult1;
    }

    /**
     * レンタルボードウェア_１日_大人_割引後を取得します。
     * 
     * @return レンタルボードウェア_１日_大人_割引後
     */
    public String getRentBdwDayAdult2() {
        return rentBdwDayAdult2;
    }

    /**
     * レンタルボードウェア_１日_小人_割引前を取得します。
     * 
     * @return レンタルボードウェア_１日_小人_割引前
     */
    public String getRentBdwDayChild1() {
        return rentBdwDayChild1;
    }

    /**
     * レンタルボードウェア_１日_小人_割引後を取得します。
     * 
     * @return レンタルボードウェア_１日_小人_割引後
     */
    public String getRentBdwDayChild2() {
        return rentBdwDayChild2;
    }

    /**
     * レンタルボードウェア_割引有無を取得します。
     * 
     * @return レンタルボードウェア_割引有無
     */
    public String getRentBdwDiscountFlg() {
        return rentBdwDiscountFlg;
    }

    /**
     * レンタルボードウェア_半日_大人_割引前を取得します。
     * 
     * @return レンタルボードウェア_半日_大人_割引前
     */
    public String getRentBdwHalfAdult1() {
        return rentBdwHalfAdult1;
    }

    /**
     * レンタルボードウェア_半日_大人_割引後を取得します。
     * 
     * @return レンタルボードウェア_半日_大人_割引後
     */
    public String getRentBdwHalfAdult2() {
        return rentBdwHalfAdult2;
    }

    /**
     * レンタルボードウェア_半日_小人_割引前を取得します。
     * 
     * @return レンタルボードウェア_半日_小人_割引前
     */
    public String getRentBdwHalfChild1() {
        return rentBdwHalfChild1;
    }

    /**
     * レンタルボードウェア_半日_小人_割引後を取得します。
     * 
     * @return レンタルボードウェア_半日_小人_割引後
     */
    public String getRentBdwHalfChild2() {
        return rentBdwHalfChild2;
    }

    /**
     * レンタルボードウェア_特定_大人_割引前を取得します。
     * 
     * @return レンタルボードウェア_特定_大人_割引前
     */
    public String getRentBdwSpAdult1() {
        return rentBdwSpAdult1;
    }

    /**
     * レンタルボードウェア_特定_大人_割引後を取得します。
     * 
     * @return レンタルボードウェア_特定_大人_割引後
     */
    public String getRentBdwSpAdult2() {
        return rentBdwSpAdult2;
    }

    /**
     * レンタルボードウェア_特定_小人_割引前を取得します。
     * 
     * @return レンタルボードウェア_特定_小人_割引前
     */
    public String getRentBdwSpChild1() {
        return rentBdwSpChild1;
    }

    /**
     * レンタルボードウェア_特定_小人_割引後を取得します。
     * 
     * @return レンタルボードウェア_特定_小人_割引後
     */
    public String getRentBdwSpChild2() {
        return rentBdwSpChild2;
    }

    /**
     * レンタルボードウェア_特定券種を取得します。
     * 
     * @return レンタルボードウェア_特定券種
     */
    public String getRentBdwSpKind() {
        return rentBdwSpKind;
    }

    /**
     * レンタルボードウェア_在庫有無を取得します。
     * 
     * @return レンタルボードウェア_在庫有無
     */
    public String getRentBdwStockFlg() {
        return rentBdwStockFlg;
    }

    /**
     * レンタル交換有無を取得します。
     * 
     * @return レンタル交換有無
     */
    public String getRentChageFlg() {
        return rentChageFlg;
    }

    /**
     * レンタルカービング_１日_大人_割引前を取得します。
     * 
     * @return レンタルカービング_１日_大人_割引前
     */
    public String getRentCvDayAdult1() {
        return rentCvDayAdult1;
    }

    /**
     * レンタルカービング_１日_大人_割引後を取得します。
     * 
     * @return レンタルカービング_１日_大人_割引後
     */
    public String getRentCvDayAdult2() {
        return rentCvDayAdult2;
    }

    /**
     * レンタルカービング_１日_小人_割引前を取得します。
     * 
     * @return レンタルカービング_１日_小人_割引前
     */
    public String getRentCvDayChild1() {
        return rentCvDayChild1;
    }

    /**
     * レンタルカービング_１日_小人_割引後を取得します。
     * 
     * @return レンタルカービング_１日_小人_割引後
     */
    public String getRentCvDayChild2() {
        return rentCvDayChild2;
    }

    /**
     * レンタルカービング_割引有無を取得します。
     * 
     * @return レンタルカービング_割引有無
     */
    public String getRentCvDiscountFlg() {
        return rentCvDiscountFlg;
    }

    /**
     * レンタルカービング_半日_大人_割引前を取得します。
     * 
     * @return レンタルカービング_半日_大人_割引前
     */
    public String getRentCvHalfAdult1() {
        return rentCvHalfAdult1;
    }

    /**
     * レンタルカービング_半日_大人_割引後を取得します。
     * 
     * @return レンタルカービング_半日_大人_割引後
     */
    public String getRentCvHalfAdult2() {
        return rentCvHalfAdult2;
    }

    /**
     * レンタルカービング_半日_小人_割引前を取得します。
     * 
     * @return レンタルカービング_半日_小人_割引前
     */
    public String getRentCvHalfChild1() {
        return rentCvHalfChild1;
    }

    /**
     * レンタルカービング_半日_小人_割引後を取得します。
     * 
     * @return レンタルカービング_半日_小人_割引後
     */
    public String getRentCvHalfChild2() {
        return rentCvHalfChild2;
    }

    /**
     * レンタルカービング_特定_大人_割引前を取得します。
     * 
     * @return レンタルカービング_特定_大人_割引前
     */
    public String getRentCvSpAdult1() {
        return rentCvSpAdult1;
    }

    /**
     * レンタルカービング_特定_大人_割引後を取得します。
     * 
     * @return レンタルカービング_特定_大人_割引後
     */
    public String getRentCvSpAdult2() {
        return rentCvSpAdult2;
    }

    /**
     * レンタルカービング_特定_小人_割引前を取得します。
     * 
     * @return レンタルカービング_特定_小人_割引前
     */
    public String getRentCvSpChild1() {
        return rentCvSpChild1;
    }

    /**
     * レンタルカービング_特定_小人_割引後を取得します。
     * 
     * @return レンタルカービング_特定_小人_割引後
     */
    public String getRentCvSpChild2() {
        return rentCvSpChild2;
    }

    /**
     * レンタルカービング_特定券種を取得します。
     * 
     * @return レンタルカービング_特定券種
     */
    public String getRentCvSpKind() {
        return rentCvSpKind;
    }

    /**
     * レンタルカービング_在庫有無を取得します。
     * 
     * @return レンタルカービング_在庫有無
     */
    public String getRentCvStockFlg() {
        return rentCvStockFlg;
    }

    /**
     * ファンスキーレンタル料金帯を取得します。
     * 
     * @return ファンスキーレンタル料金帯
     */
    public String getRentFsChargeFlg() {
        return rentFsChargeFlg;
    }

    /**
     * ファンスキーレンタル有無を取得します。
     * 
     * @return ファンスキーレンタル有無
     */
    public String getRentFsFlg() {
        return rentFsFlg;
    }

    /**
     * レンタル_申込方法を取得します。
     * 
     * @return レンタル_申込方法
     */
    public String getRentRequestWay() {
        return rentRequestWay;
    }

    /**
     * レンタルスキー_１日_大人_割引前を取得します。
     * 
     * @return レンタルスキー_１日_大人_割引前
     */
    public String getRentSkiDayAdult1() {
        return rentSkiDayAdult1;
    }

    /**
     * レンタルスキー_１日_大人_割引後を取得します。
     * 
     * @return レンタルスキー_１日_大人_割引後
     */
    public String getRentSkiDayAdult2() {
        return rentSkiDayAdult2;
    }

    /**
     * レンタルスキー_１日_小人_割引前を取得します。
     * 
     * @return レンタルスキー_１日_小人_割引前
     */
    public String getRentSkiDayChild1() {
        return rentSkiDayChild1;
    }

    /**
     * レンタルスキー_１日_小人_割引後を取得します。
     * 
     * @return レンタルスキー_１日_小人_割引後
     */
    public String getRentSkiDayChild2() {
        return rentSkiDayChild2;
    }

    /**
     * レンタルスキー_割引有無を取得します。
     * 
     * @return レンタルスキー_割引有無
     */
    public String getRentSkiDiscountFlg() {
        return rentSkiDiscountFlg;
    }

    /**
     * レンタルスキー_半日_大人_割引前を取得します。
     * 
     * @return レンタルスキー_半日_大人_割引前
     */
    public String getRentSkiHalfAdult1() {
        return rentSkiHalfAdult1;
    }

    /**
     * レンタルスキー_半日_大人_割引後を取得します。
     * 
     * @return レンタルスキー_半日_大人_割引後
     */
    public String getRentSkiHalfAdult2() {
        return rentSkiHalfAdult2;
    }

    /**
     * レンタルスキー_半日_小人_割引前を取得します。
     * 
     * @return レンタルスキー_半日_小人_割引前
     */
    public String getRentSkiHalfChild1() {
        return rentSkiHalfChild1;
    }

    /**
     * レンタルスキー_半日_小人_割引後を取得します。
     * 
     * @return レンタルスキー_半日_小人_割引後
     */
    public String getRentSkiHalfChild2() {
        return rentSkiHalfChild2;
    }

    /**
     * レンタル料金_備考を取得します。
     * 
     * @return レンタル料金_備考
     */
    public String getRentSkiPriceMemo() {
        return rentSkiPriceMemo;
    }

    /**
     * レンタルスキー_特定_大人_割引前を取得します。
     * 
     * @return レンタルスキー_特定_大人_割引前
     */
    public String getRentSkiSpAdult1() {
        return rentSkiSpAdult1;
    }

    /**
     * レンタルスキー_特定_大人_割引後を取得します。
     * 
     * @return レンタルスキー_特定_大人_割引後
     */
    public String getRentSkiSpAdult2() {
        return rentSkiSpAdult2;
    }

    /**
     * レンタルスキー_特定_小人_割引前を取得します。
     * 
     * @return レンタルスキー_特定_小人_割引前
     */
    public String getRentSkiSpChild1() {
        return rentSkiSpChild1;
    }

    /**
     * レンタルスキー_特定_小人_割引後を取得します。
     * 
     * @return レンタルスキー_特定_小人_割引後
     */
    public String getRentSkiSpChild2() {
        return rentSkiSpChild2;
    }

    /**
     * レンタルスキー_特定券種を取得します。
     * 
     * @return レンタルスキー_特定券種
     */
    public String getRentSkiSpKind() {
        return rentSkiSpKind;
    }

    /**
     * レンタルスキー_在庫有無を取得します。
     * 
     * @return レンタルスキー_在庫有無
     */
    public String getRentSkiStockFlg() {
        return rentSkiStockFlg;
    }

    /**
     * レンタルスキーウェア_１日_大人_割引前を取得します。
     * 
     * @return レンタルスキーウェア_１日_大人_割引前
     */
    public String getRentSkiwDayAdult1() {
        return rentSkiwDayAdult1;
    }

    /**
     * レンタルスキーウェア_１日_大人_割引後を取得します。
     * 
     * @return レンタルスキーウェア_１日_大人_割引後
     */
    public String getRentSkiwDayAdult2() {
        return rentSkiwDayAdult2;
    }

    /**
     * レンタルスキーウェア_１日_小人_割引前を取得します。
     * 
     * @return レンタルスキーウェア_１日_小人_割引前
     */
    public String getRentSkiwDayChild1() {
        return rentSkiwDayChild1;
    }

    /**
     * レンタルスキーウェア_１日_小人_割引後を取得します。
     * 
     * @return レンタルスキーウェア_１日_小人_割引後
     */
    public String getRentSkiwDayChild2() {
        return rentSkiwDayChild2;
    }

    /**
     * レンタルスキーウェア_割引有無を取得します。
     * 
     * @return レンタルスキーウェア_割引有無
     */
    public String getRentSkiwDiscountFlg() {
        return rentSkiwDiscountFlg;
    }

    /**
     * レンタルスキーウェア_半日_大人_割引前を取得します。
     * 
     * @return レンタルスキーウェア_半日_大人_割引前
     */
    public String getRentSkiwHalfAdult1() {
        return rentSkiwHalfAdult1;
    }

    /**
     * レンタルスキーウェア_半日_大人_割引後を取得します。
     * 
     * @return レンタルスキーウェア_半日_大人_割引後
     */
    public String getRentSkiwHalfAdult2() {
        return rentSkiwHalfAdult2;
    }

    /**
     * レンタルスキーウェア_半日_小人_割引前を取得します。
     * 
     * @return レンタルスキーウェア_半日_小人_割引前
     */
    public String getRentSkiwHalfChild1() {
        return rentSkiwHalfChild1;
    }

    /**
     * レンタルスキーウェア_半日_小人_割引後を取得します。
     * 
     * @return レンタルスキーウェア_半日_小人_割引後
     */
    public String getRentSkiwHalfChild2() {
        return rentSkiwHalfChild2;
    }

    /**
     * レンタルスキーウェア_特定_大人_割引前を取得します。
     * 
     * @return レンタルスキーウェア_特定_大人_割引前
     */
    public String getRentSkiwSpAdult1() {
        return rentSkiwSpAdult1;
    }

    /**
     * レンタルスキーウェア_特定_大人_割引後を取得します。
     * 
     * @return レンタルスキーウェア_特定_大人_割引後
     */
    public String getRentSkiwSpAdult2() {
        return rentSkiwSpAdult2;
    }

    /**
     * レンタルスキーウェア_特定_小人_割引前を取得します。
     * 
     * @return レンタルスキーウェア_特定_小人_割引前
     */
    public String getRentSkiwSpChild1() {
        return rentSkiwSpChild1;
    }

    /**
     * レンタルスキーウェア_特定_小人_割引後を取得します。
     * 
     * @return レンタルスキーウェア_特定_小人_割引後
     */
    public String getRentSkiwSpChild2() {
        return rentSkiwSpChild2;
    }

    /**
     * レンタルスキーウェア_特定券種を取得します。
     * 
     * @return レンタルスキーウェア_特定券種
     */
    public String getRentSkiwSpKind() {
        return rentSkiwSpKind;
    }

    /**
     * レンタルスキーウェア_在庫有無を取得します。
     * 
     * @return レンタルスキーウェア_在庫有無
     */
    public String getRentSkiwStockFlg() {
        return rentSkiwStockFlg;
    }

    /**
     * スクールボード_１日_大人_割引前を取得します。
     * 
     * @return スクールボード_１日_大人_割引前
     */
    public String getSchoolBdDayAdult1() {
        return schoolBdDayAdult1;
    }

    /**
     * スクールボード_１日_大人_割引後を取得します。
     * 
     * @return スクールボード_１日_大人_割引後
     */
    public String getSchoolBdDayAdult2() {
        return schoolBdDayAdult2;
    }

    /**
     * スクールボード_１日_小人_割引前を取得します。
     * 
     * @return スクールボード_１日_小人_割引前
     */
    public String getSchoolBdDayChild1() {
        return schoolBdDayChild1;
    }

    /**
     * スクールボード_１日_小人_割引後を取得します。
     * 
     * @return スクールボード_１日_小人_割引後
     */
    public String getSchoolBdDayChild2() {
        return schoolBdDayChild2;
    }

    /**
     * スクールボード_割引有無を取得します。
     * 
     * @return スクールボード_割引有無
     */
    public String getSchoolBdDiscountFlg() {
        return schoolBdDiscountFlg;
    }

    /**
     * スクールボード_半日_大人_割引前を取得します。
     * 
     * @return スクールボード_半日_大人_割引前
     */
    public String getSchoolBdHalfAdult1() {
        return schoolBdHalfAdult1;
    }

    /**
     * スクールボード_半日_大人_割引後を取得します。
     * 
     * @return スクールボード_半日_大人_割引後
     */
    public String getSchoolBdHalfAdult2() {
        return schoolBdHalfAdult2;
    }

    /**
     * スクールボード_半日_小人_割引前を取得します。
     * 
     * @return スクールボード_半日_小人_割引前
     */
    public String getSchoolBdHalfChild1() {
        return schoolBdHalfChild1;
    }

    /**
     * スクールボード_半日_小人_割引後を取得します。
     * 
     * @return スクールボード_半日_小人_割引後
     */
    public String getSchoolBdHalfChild2() {
        return schoolBdHalfChild2;
    }

    /**
     * スクールボード_特定１_大人_割引前を取得します。
     * 
     * @return スクールボード_特定１_大人_割引前
     */
    public String getSchoolBdTime1Adult1() {
        return schoolBdTime1Adult1;
    }

    /**
     * スクールボード_特定１_大人_割引後を取得します。
     * 
     * @return スクールボード_特定１_大人_割引後
     */
    public String getSchoolBdTime1Adult2() {
        return schoolBdTime1Adult2;
    }

    /**
     * スクールボード_特定１_小人_割引前を取得します。
     * 
     * @return スクールボード_特定１_小人_割引前
     */
    public String getSchoolBdTime1Child1() {
        return schoolBdTime1Child1;
    }

    /**
     * スクールボード_特定１_小人_割引後を取得します。
     * 
     * @return スクールボード_特定１_小人_割引後
     */
    public String getSchoolBdTime1Child2() {
        return schoolBdTime1Child2;
    }

    /**
     * スクールボード_特定１_時間を取得します。
     * 
     * @return スクールボード_特定１_時間
     */
    public String getSchoolBdTime1Hh() {
        return schoolBdTime1Hh;
    }

    /**
     * スクールボード_特定１_分を取得します。
     * 
     * @return スクールボード_特定１_分
     */
    public String getSchoolBdTime1Mm() {
        return schoolBdTime1Mm;
    }

    /**
     * スクールボード_特定２_大人_割引前を取得します。
     * 
     * @return スクールボード_特定２_大人_割引前
     */
    public String getSchoolBdTime2Adult1() {
        return schoolBdTime2Adult1;
    }

    /**
     * スクールボード_特定２_大人_割引後を取得します。
     * 
     * @return スクールボード_特定２_大人_割引後
     */
    public String getSchoolBdTime2Adult2() {
        return schoolBdTime2Adult2;
    }

    /**
     * スクールボード_特定２_小人_割引前を取得します。
     * 
     * @return スクールボード_特定２_小人_割引前
     */
    public String getSchoolBdTime2Child1() {
        return schoolBdTime2Child1;
    }

    /**
     * スクールボード_特定２_小人_割引後を取得します。
     * 
     * @return スクールボード_特定２_小人_割引後
     */
    public String getSchoolBdTime2Child2() {
        return schoolBdTime2Child2;
    }

    /**
     * スクールボード_特定２_時間を取得します。
     * 
     * @return スクールボード_特定２_時間
     */
    public String getSchoolBdTime2Hh() {
        return schoolBdTime2Hh;
    }

    /**
     * スクールボード_特定２_分を取得します。
     * 
     * @return スクールボード_特定２_分
     */
    public String getSchoolBdTime2Mm() {
        return schoolBdTime2Mm;
    }

    /**
     * スクール_その他内容を取得します。
     * 
     * @return スクール_その他内容
     */
    public String getSchoolOtherContent() {
        return schoolOtherContent;
    }

    /**
     * スクール料金_備考を取得します。
     * 
     * @return スクール料金_備考
     */
    public String getSchoolPriceMemo() {
        return schoolPriceMemo;
    }

    /**
     * スクール_申込方法を取得します。
     * 
     * @return スクール_申込方法
     */
    public String getSchoolRequestWay() {
        return schoolRequestWay;
    }

    /**
     * スクールスキー_１日_大人_割引前を取得します。
     * 
     * @return スクールスキー_１日_大人_割引前
     */
    public String getSchoolSkiDayAdult1() {
        return schoolSkiDayAdult1;
    }

    /**
     * スクールスキー_１日_大人_割引後を取得します。
     * 
     * @return スクールスキー_１日_大人_割引後
     */
    public String getSchoolSkiDayAdult2() {
        return schoolSkiDayAdult2;
    }

    /**
     * スクールスキー_１日_小人_割引前を取得します。
     * 
     * @return スクールスキー_１日_小人_割引前
     */
    public String getSchoolSkiDayChild1() {
        return schoolSkiDayChild1;
    }

    /**
     * スクールスキー_１日_小人_割引後を取得します。
     * 
     * @return スクールスキー_１日_小人_割引後
     */
    public String getSchoolSkiDayChild2() {
        return schoolSkiDayChild2;
    }

    /**
     * スクールスキー_割引有無を取得します。
     * 
     * @return スクールスキー_割引有無
     */
    public String getSchoolSkiDiscountFlg() {
        return schoolSkiDiscountFlg;
    }

    /**
     * スクールスキー_半日_大人_割引前を取得します。
     * 
     * @return スクールスキー_半日_大人_割引前
     */
    public String getSchoolSkiHalfAdult1() {
        return schoolSkiHalfAdult1;
    }

    /**
     * スクールスキー_半日_大人_割引後を取得します。
     * 
     * @return スクールスキー_半日_大人_割引後
     */
    public String getSchoolSkiHalfAdult2() {
        return schoolSkiHalfAdult2;
    }

    /**
     * スクールスキー_半日_小人_割引前を取得します。
     * 
     * @return スクールスキー_半日_小人_割引前
     */
    public String getSchoolSkiHalfChild1() {
        return schoolSkiHalfChild1;
    }

    /**
     * スクールスキー_半日_小人_割引後を取得します。
     * 
     * @return スクールスキー_半日_小人_割引後
     */
    public String getSchoolSkiHalfChild2() {
        return schoolSkiHalfChild2;
    }

    /**
     * スクールスキー_特定１_大人_割引前を取得します。
     * 
     * @return スクールスキー_特定１_大人_割引前
     */
    public String getSchoolSkiTime1Adult1() {
        return schoolSkiTime1Adult1;
    }

    /**
     * スクールスキー_特定１_大人_割引後を取得します。
     * 
     * @return スクールスキー_特定１_大人_割引後
     */
    public String getSchoolSkiTime1Adult2() {
        return schoolSkiTime1Adult2;
    }

    /**
     * スクールスキー_特定１_小人_割引前を取得します。
     * 
     * @return スクールスキー_特定１_小人_割引前
     */
    public String getSchoolSkiTime1Child1() {
        return schoolSkiTime1Child1;
    }

    /**
     * スクールスキー_特定１_小人_割引後を取得します。
     * 
     * @return スクールスキー_特定１_小人_割引後
     */
    public String getSchoolSkiTime1Child2() {
        return schoolSkiTime1Child2;
    }

    /**
     * スクールスキー_特定１_時間を取得します。
     * 
     * @return スクールスキー_特定１_時間
     */
    public String getSchoolSkiTime1Hh() {
        return schoolSkiTime1Hh;
    }

    /**
     * スクールスキー_特定１_分を取得します。
     * 
     * @return スクールスキー_特定１_分
     */
    public String getSchoolSkiTime1Mm() {
        return schoolSkiTime1Mm;
    }

    /**
     * スクールスキー_特定２_大人_割引前を取得します。
     * 
     * @return スクールスキー_特定２_大人_割引前
     */
    public String getSchoolSkiTime2Adult1() {
        return schoolSkiTime2Adult1;
    }

    /**
     * スクールスキー_特定２_大人_割引後を取得します。
     * 
     * @return スクールスキー_特定２_大人_割引後
     */
    public String getSchoolSkiTime2Adult2() {
        return schoolSkiTime2Adult2;
    }

    /**
     * スクールスキー_特定２_小人_割引前を取得します。
     * 
     * @return スクールスキー_特定２_小人_割引前
     */
    public String getSchoolSkiTime2Child1() {
        return schoolSkiTime2Child1;
    }

    /**
     * スクールスキー_特定２_小人_割引後を取得します。
     * 
     * @return スクールスキー_特定２_小人_割引後
     */
    public String getSchoolSkiTime2Child2() {
        return schoolSkiTime2Child2;
    }

    /**
     * スクールスキー_特定２_時間を取得します。
     * 
     * @return スクールスキー_特定２_時間
     */
    public String getSchoolSkiTime2Hh() {
        return schoolSkiTime2Hh;
    }

    /**
     * スクールスキー_特定２_分を取得します。
     * 
     * @return スクールスキー_特定２_分
     */
    public String getSchoolSkiTime2Mm() {
        return schoolSkiTime2Mm;
    }

    /**
     * スキーキャッチコピーを取得します。
     * 
     * @return スキーキャッチコピー
     */
    public String getSkiCatchcopy() {
        return skiCatchcopy;
    }

    /**
     * 施設コードを設定します。
     * 
     * @param facilityCd
     *            施設コード
     */
    @Override
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 施設パターンを設定します。
     * 
     * @param facilityPattern
     *            施設パターン
     */
    @Override
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * 回答書種別を設定します。
     * 
     * @param kindFlg
     *            回答書種別
     */
    @Override
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * リフト券注意事項を設定します。
     * 
     * @param liftAttentionContent
     *            リフト券注意事項
     */
    public void setLiftAttentionContent(String liftAttentionContent) {
        this.liftAttentionContent = liftAttentionContent;
    }

    /**
     * リフト営業_早朝_営業日を設定します。
     * 
     * @param liftBsMorningDay
     *            リフト営業_早朝_営業日
     */
    public void setLiftBsMorningDay(String liftBsMorningDay) {
        this.liftBsMorningDay = liftBsMorningDay;
    }

    /**
     * リフト営業_早朝_終了時間を設定します。
     * 
     * @param liftBsMorningEnd
     *            リフト営業_早朝_終了時間
     */
    public void setLiftBsMorningEnd(String liftBsMorningEnd) {
        setLiftBsMorningEndHour(DKikakuWebUtil
                .getHourFormTime(liftBsMorningEnd));
        setLiftBsMorningEndMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsMorningEnd));
    }

    /**
     * リフト営業_早朝_終了時間（時間）を設定します。
     * 
     * @param liftBsMorningEndHour
     *            リフト営業_早朝_終了時間（時間）
     */
    public void setLiftBsMorningEndHour(String liftBsMorningEndHour) {
        this.liftBsMorningEndHour = liftBsMorningEndHour;
    }

    /**
     * リフト営業_早朝_終了時間（分）を設定します。
     * 
     * @param liftBsMorningEndMinute
     *            リフト営業_早朝_終了時間（分）
     */
    public void setLiftBsMorningEndMinute(String liftBsMorningEndMinute) {
        this.liftBsMorningEndMinute = liftBsMorningEndMinute;
    }

    /**
     * リフト営業_早朝_有無を設定します。
     * 
     * @param liftBsMorningFlg
     *            リフト営業_早朝_有無
     */
    public void setLiftBsMorningFlg(String liftBsMorningFlg) {
        this.liftBsMorningFlg = liftBsMorningFlg;
    }

    /**
     * リフト営業_早朝_開始時間を設定します。
     * 
     * @param liftBsMorningStart
     *            リフト営業_早朝_開始時間
     */
    public void setLiftBsMorningStart(String liftBsMorningStart) {
        setLiftBsMorningStartHour(DKikakuWebUtil
                .getHourFormTime(liftBsMorningStart));
        setLiftBsMorningStartMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsMorningStart));
    }

    /**
     * リフト営業_早朝_開始時間（時間）を設定します。
     * 
     * @param liftBsMorningStartHour
     *            リフト営業_早朝_開始時間（時間）
     */
    public void setLiftBsMorningStartHour(String liftBsMorningStartHour) {
        this.liftBsMorningStartHour = liftBsMorningStartHour;
    }

    /**
     * リフト営業_早朝_開始時間（分）を設定します。
     * 
     * @param liftBsMorningStartMinute
     *            リフト営業_早朝_開始時間（分）
     */
    public void setLiftBsMorningStartMinute(String liftBsMorningStartMinute) {
        this.liftBsMorningStartMinute = liftBsMorningStartMinute;
    }

    /**
     * リフト営業_ナイター_営業日を設定します。
     * 
     * @param liftBsNightDay
     *            リフト営業_ナイター_営業日
     */
    public void setLiftBsNightDay(String liftBsNightDay) {
        this.liftBsNightDay = liftBsNightDay;
    }

    /**
     * リフト営業_ナイター_終了時間を設定します。
     * 
     * @param liftBsNightEnd
     *            リフト営業_ナイター_終了時間
     */
    public void setLiftBsNightEnd(String liftBsNightEnd) {
        setLiftBsNightEndHour(DKikakuWebUtil.getHourFormTime(liftBsNightEnd));
        setLiftBsNightEndMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNightEnd));
    }

    /**
     * リフト営業_ナイター_終了時間（時間）を設定します。
     * 
     * @param liftBsNightEndHour
     *            リフト営業_ナイター_終了時間（時間）
     */
    public void setLiftBsNightEndHour(String liftBsNightEndHour) {
        this.liftBsNightEndHour = liftBsNightEndHour;
    }

    /**
     * リフト営業_ナイター_終了時間（分）を設定します。
     * 
     * @param liftBsNightEndMinute
     *            リフト営業_ナイター_終了時間（分）
     */
    public void setLiftBsNightEndMinute(String liftBsNightEndMinute) {
        this.liftBsNightEndMinute = liftBsNightEndMinute;
    }

    /**
     * リフト営業_ナイター_有無を設定します。
     * 
     * @param liftBsNightFlg
     *            リフト営業_ナイター_有無
     */
    public void setLiftBsNightFlg(String liftBsNightFlg) {
        this.liftBsNightFlg = liftBsNightFlg;
    }

    /**
     * リフト営業_ナイター_開始時間を設定します。
     * 
     * @param liftBsNightStart
     *            リフト営業_ナイター_開始時間
     */
    public void setLiftBsNightStart(String liftBsNightStart) {
        setLiftBsNightStartHour(DKikakuWebUtil
                .getHourFormTime(liftBsNightStart));
        setLiftBsNightStartMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNightStart));
    }

    /**
     * リフト営業_ナイター_開始時間（時間）を設定します。
     * 
     * @param liftBsNightStartHour
     *            リフト営業_ナイター_開始時間（時間）
     */
    public void setLiftBsNightStartHour(String liftBsNightStartHour) {
        this.liftBsNightStartHour = liftBsNightStartHour;
    }

    /**
     * リフト営業_ナイター_開始時間（分）を設定します。
     * 
     * @param liftBsNightStartMinute
     *            リフト営業_ナイター_開始時間（分）
     */
    public void setLiftBsNightStartMinute(String liftBsNightStartMinute) {
        this.liftBsNightStartMinute = liftBsNightStartMinute;
    }

    /**
     * リフト営業_通常_終了時間を設定します。
     * 
     * @param liftBsNomalEnd
     *            リフト営業_通常_終了時間
     */
    public void setLiftBsNomalEnd(String liftBsNomalEnd) {
        setLiftBsNomalEndHour(DKikakuWebUtil.getHourFormTime(liftBsNomalEnd));
        setLiftBsNomalEndMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNomalEnd));
    }

    /**
     * リフト営業_通常_終了時間（時間）を設定します。
     * 
     * @param liftBsNomalEndHour
     *            リフト営業_通常_終了時間（時間）
     */
    public void setLiftBsNomalEndHour(String liftBsNomalEndHour) {
        this.liftBsNomalEndHour = liftBsNomalEndHour;
    }

    /**
     * リフト営業_通常_終了時間（分）を設定します。
     * 
     * @param liftBsNomalEndMinute
     *            リフト営業_通常_終了時間（分）
     */
    public void setLiftBsNomalEndMinute(String liftBsNomalEndMinute) {
        this.liftBsNomalEndMinute = liftBsNomalEndMinute;
    }

    /**
     * リフト営業_通常_開始時間を設定します。
     * 
     * @param liftBsNomalStart
     *            リフト営業_通常_開始時間
     */
    public void setLiftBsNomalStart(String liftBsNomalStart) {
        setLiftBsNomalStartHour(DKikakuWebUtil
                .getHourFormTime(liftBsNomalStart));
        setLiftBsNomalStartMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNomalStart));
    }

    /**
     * リフト営業_通常_開始時間（時間）を設定します。
     * 
     * @param liftBsNomalStartHour
     *            リフト営業_通常_開始時間（時間）
     */
    public void setLiftBsNomalStartHour(String liftBsNomalStartHour) {
        this.liftBsNomalStartHour = liftBsNomalStartHour;
    }

    /**
     * リフト営業_通常_開始時間（分）を設定します。
     * 
     * @param liftBsNomalStartMinute
     *            リフト営業_通常_開始時間（分）
     */
    public void setLiftBsNomalStartMinute(String liftBsNomalStartMinute) {
        this.liftBsNomalStartMinute = liftBsNomalStartMinute;
    }

    /**
     * リフト営業_スキー場名を設定します。
     * 
     * @param liftBsSkiNm
     *            リフト営業_スキー場名
     */
    public void setLiftBsSkiNm(String liftBsSkiNm) {
        this.liftBsSkiNm = liftBsSkiNm;
    }

    /**
     * リフト券引換え_方法を設定します。
     * 
     * @param liftChWayFlg
     *            リフト券引換え_方法
     */
    public void setLiftChWayFlg(String liftChWayFlg) {
        this.liftChWayFlg = liftChWayFlg;
    }

    /**
     * リフト券引換え_その他内容を設定します。
     * 
     * @param liftChWayOtherContent
     *            リフト券引換え_その他内容
     */
    public void setLiftChWayOtherContent(String liftChWayOtherContent) {
        this.liftChWayOtherContent = liftChWayOtherContent;
    }

    /**
     * リフト券販売_大人_びゅう割引額１を設定します。
     * 
     * @param liftSlAdultByu1
     *            リフト券販売_大人_びゅう割引額１
     */
    public void setLiftSlAdultByu1(String liftSlAdultByu1) {
        this.liftSlAdultByu1 = liftSlAdultByu1;
    }

    /**
     * リフト券販売_大人_びゅう割引額２を設定します。
     * 
     * @param liftSlAdultByu2
     *            リフト券販売_大人_びゅう割引額２
     */
    public void setLiftSlAdultByu2(String liftSlAdultByu2) {
        this.liftSlAdultByu2 = liftSlAdultByu2;
    }

    /**
     * リフト券販売_大人_割引額１を設定します。
     * 
     * @param liftSlAdultDiscount1
     *            リフト券販売_大人_割引額１
     */
    public void setLiftSlAdultDiscount1(String liftSlAdultDiscount1) {
        this.liftSlAdultDiscount1 = liftSlAdultDiscount1;
    }

    /**
     * リフト券販売_大人_割引額２を設定します。
     * 
     * @param liftSlAdultDiscount2
     *            リフト券販売_大人_割引額２
     */
    public void setLiftSlAdultDiscount2(String liftSlAdultDiscount2) {
        this.liftSlAdultDiscount2 = liftSlAdultDiscount2;
    }

    /**
     * リフト券販売_大人_券種１を設定します。
     * 
     * @param liftSlAdultKind1
     *            リフト券販売_大人_券種１
     */
    public void setLiftSlAdultKind1(String liftSlAdultKind1) {
        this.liftSlAdultKind1 = liftSlAdultKind1;
    }

    /**
     * リフト券販売_大人_券種２を設定します。
     * 
     * @param liftSlAdultKind2
     *            リフト券販売_大人_券種２
     */
    public void setLiftSlAdultKind2(String liftSlAdultKind2) {
        this.liftSlAdultKind2 = liftSlAdultKind2;
    }

    /**
     * リフト券販売_大人_通常額１を設定します。
     * 
     * @param liftSlAdultNomal1
     *            リフト券販売_大人_通常額１
     */
    public void setLiftSlAdultNomal1(String liftSlAdultNomal1) {
        this.liftSlAdultNomal1 = liftSlAdultNomal1;
    }

    /**
     * リフト券販売_大人_通常額２を設定します。
     * 
     * @param liftSlAdultNomal2
     *            リフト券販売_大人_通常額２
     */
    public void setLiftSlAdultNomal2(String liftSlAdultNomal2) {
        this.liftSlAdultNomal2 = liftSlAdultNomal2;
    }

    /**
     * リフト券販売_小人_びゅう割引額１を設定します。
     * 
     * @param liftSlChildByu1
     *            リフト券販売_小人_びゅう割引額１
     */
    public void setLiftSlChildByu1(String liftSlChildByu1) {
        this.liftSlChildByu1 = liftSlChildByu1;
    }

    /**
     * リフト券販売_小人_びゅう割引額２を設定します。
     * 
     * @param liftSlChildByu2
     *            リフト券販売_小人_びゅう割引額２
     */
    public void setLiftSlChildByu2(String liftSlChildByu2) {
        this.liftSlChildByu2 = liftSlChildByu2;
    }

    /**
     * リフト券販売_小人_割引額１を設定します。
     * 
     * @param liftSlChildDiscount1
     *            リフト券販売_小人_割引額１
     */
    public void setLiftSlChildDiscount1(String liftSlChildDiscount1) {
        this.liftSlChildDiscount1 = liftSlChildDiscount1;
    }

    /**
     * リフト券販売_小人_割引額２を設定します。
     * 
     * @param liftSlChildDiscount2
     *            リフト券販売_小人_割引額２
     */
    public void setLiftSlChildDiscount2(String liftSlChildDiscount2) {
        this.liftSlChildDiscount2 = liftSlChildDiscount2;
    }

    /**
     * リフト券販売_小人_券種１を設定します。
     * 
     * @param liftSlChildKind1
     *            リフト券販売_小人_券種１
     */
    public void setLiftSlChildKind1(String liftSlChildKind1) {
        this.liftSlChildKind1 = liftSlChildKind1;
    }

    /**
     * リフト券販売_小人_券種２を設定します。
     * 
     * @param liftSlChildKind2
     *            リフト券販売_小人_券種２
     */
    public void setLiftSlChildKind2(String liftSlChildKind2) {
        this.liftSlChildKind2 = liftSlChildKind2;
    }

    /**
     * リフト券販売_小人_通常額１を設定します。
     * 
     * @param liftSlChildNomal1
     *            リフト券販売_小人_通常額１
     */
    public void setLiftSlChildNomal1(String liftSlChildNomal1) {
        this.liftSlChildNomal1 = liftSlChildNomal1;
    }

    /**
     * リフト券販売_小人_通常額２を設定します。
     * 
     * @param liftSlChildNomal2
     *            リフト券販売_小人_通常額２
     */
    public void setLiftSlChildNomal2(String liftSlChildNomal2) {
        this.liftSlChildNomal2 = liftSlChildNomal2;
    }

    /**
     * リフト券販売_スキー場名を設定します。
     * 
     * @param liftSlSkiNm
     *            リフト券販売_スキー場名
     */
    public void setLiftSlSkiNm(String liftSlSkiNm) {
        this.liftSlSkiNm = liftSlSkiNm;
    }

    /**
     * リフト券代含む_有無を設定します。
     * 
     * @param liftTkContainFlg
     *            リフト券代含む_有無
     */
    public void setLiftTkContainFlg(String liftTkContainFlg) {
        this.liftTkContainFlg = liftTkContainFlg;
    }

    /**
     * リフト券種を設定します。
     * 
     * @param liftTkKind
     *            リフト券種
     */
    public void setLiftTkKind(String liftTkKind) {
        this.liftTkKind = liftTkKind;
    }

    /**
     * リフト券種_その他内容を設定します。
     * 
     * @param liftTkOtherContent
     *            リフト券種_その他内容
     */
    public void setLiftTkOtherContent(String liftTkOtherContent) {
        this.liftTkOtherContent = liftTkOtherContent;
    }

    /**
     * リフト券代含む_スキー場名を設定します。
     * 
     * @param liftTkSkiNm
     *            リフト券代含む_スキー場名
     */
    public void setLiftTkSkiNm(String liftTkSkiNm) {
        this.liftTkSkiNm = liftTkSkiNm;
    }

    /**
     * リフト券有効_帰着日ナイターを設定します。
     * 
     * @param liftYkBackNight
     *            リフト券有効_帰着日ナイター
     */
    public void setLiftYkBackNight(String liftYkBackNight) {
        this.liftYkBackNight = liftYkBackNight;
    }

    /**
     * リフト券有効_ロープウェイを設定します。
     * 
     * @param liftYkCable
     *            リフト券有効_ロープウェイ
     */
    public void setLiftYkCable(String liftYkCable) {
        this.liftYkCable = liftYkCable;
    }

    /**
     * リフト券有効_ゴンドラを設定します。
     * 
     * @param liftYkGondola
     *            リフト券有効_ゴンドラ
     */
    public void setLiftYkGondola(String liftYkGondola) {
        this.liftYkGondola = liftYkGondola;
    }

    /**
     * リフト券有効_早朝を設定します。
     * 
     * @param liftYkMorning
     *            リフト券有効_早朝
     */
    public void setLiftYkMorning(String liftYkMorning) {
        this.liftYkMorning = liftYkMorning;
    }

    /**
     * リフト券有効_その他を設定します。
     * 
     * @param liftYkOther
     *            リフト券有効_その他
     */
    public void setLiftYkOther(String liftYkOther) {
        this.liftYkOther = liftYkOther;
    }

    /**
     * リフト券有効_その他内容を設定します。
     * 
     * @param liftYkOtherContent
     *            リフト券有効_その他内容
     */
    public void setLiftYkOtherContent(String liftYkOtherContent) {
        this.liftYkOtherContent = liftYkOtherContent;
    }

    /**
     * リフト券有効_宿泊日ナイターを設定します。
     * 
     * @param liftYkStayNight
     *            リフト券有効_宿泊日ナイター
     */
    public void setLiftYkStayNight(String liftYkStayNight) {
        this.liftYkStayNight = liftYkStayNight;
    }

    /**
     * レンタルスノーボード_１日_大人_割引前を設定します。
     * 
     * @param rentBdDayAdult1
     *            レンタルスノーボード_１日_大人_割引前
     */
    public void setRentBdDayAdult1(String rentBdDayAdult1) {
        this.rentBdDayAdult1 = rentBdDayAdult1;
    }

    /**
     * レンタルスノーボード_１日_大人_割引後を設定します。
     * 
     * @param rentBdDayAdult2
     *            レンタルスノーボード_１日_大人_割引後
     */
    public void setRentBdDayAdult2(String rentBdDayAdult2) {
        this.rentBdDayAdult2 = rentBdDayAdult2;
    }

    /**
     * レンタルスノーボード_１日_小人_割引前を設定します。
     * 
     * @param rentBdDayChild1
     *            レンタルスノーボード_１日_小人_割引前
     */
    public void setRentBdDayChild1(String rentBdDayChild1) {
        this.rentBdDayChild1 = rentBdDayChild1;
    }

    /**
     * レンタルスノーボード_１日_小人_割引後を設定します。
     * 
     * @param rentBdDayChild2
     *            レンタルスノーボード_１日_小人_割引後
     */
    public void setRentBdDayChild2(String rentBdDayChild2) {
        this.rentBdDayChild2 = rentBdDayChild2;
    }

    /**
     * レンタルスノーボード_割引有無を設定します。
     * 
     * @param rentBdDiscountFlg
     *            レンタルスノーボード_割引有無
     */
    public void setRentBdDiscountFlg(String rentBdDiscountFlg) {
        this.rentBdDiscountFlg = rentBdDiscountFlg;
    }

    /**
     * レンタルスノーボード_半日_大人_割引前を設定します。
     * 
     * @param rentBdHalfAdult1
     *            レンタルスノーボード_半日_大人_割引前
     */
    public void setRentBdHalfAdult1(String rentBdHalfAdult1) {
        this.rentBdHalfAdult1 = rentBdHalfAdult1;
    }

    /**
     * レンタルスノーボード_半日_大人_割引後を設定します。
     * 
     * @param rentBdHalfAdult2
     *            レンタルスノーボード_半日_大人_割引後
     */
    public void setRentBdHalfAdult2(String rentBdHalfAdult2) {
        this.rentBdHalfAdult2 = rentBdHalfAdult2;
    }

    /**
     * レンタルスノーボード_半日_小人_割引前を設定します。
     * 
     * @param rentBdHalfChild1
     *            レンタルスノーボード_半日_小人_割引前
     */
    public void setRentBdHalfChild1(String rentBdHalfChild1) {
        this.rentBdHalfChild1 = rentBdHalfChild1;
    }

    /**
     * レンタルスノーボード_半日_小人_割引後を設定します。
     * 
     * @param rentBdHalfChild2
     *            レンタルスノーボード_半日_小人_割引後
     */
    public void setRentBdHalfChild2(String rentBdHalfChild2) {
        this.rentBdHalfChild2 = rentBdHalfChild2;
    }

    /**
     * レンタルスノーボード_特定_大人_割引前を設定します。
     * 
     * @param rentBdSpAdult1
     *            レンタルスノーボード_特定_大人_割引前
     */
    public void setRentBdSpAdult1(String rentBdSpAdult1) {
        this.rentBdSpAdult1 = rentBdSpAdult1;
    }

    /**
     * レンタルスノーボード_特定_大人_割引後を設定します。
     * 
     * @param rentBdSpAdult2
     *            レンタルスノーボード_特定_大人_割引後
     */
    public void setRentBdSpAdult2(String rentBdSpAdult2) {
        this.rentBdSpAdult2 = rentBdSpAdult2;
    }

    /**
     * レンタルスノーボード_特定_小人_割引前を設定します。
     * 
     * @param rentBdSpChild1
     *            レンタルスノーボード_特定_小人_割引前
     */
    public void setRentBdSpChild1(String rentBdSpChild1) {
        this.rentBdSpChild1 = rentBdSpChild1;
    }

    /**
     * レンタルスノーボード_特定_小人_割引後を設定します。
     * 
     * @param rentBdSpChild2
     *            レンタルスノーボード_特定_小人_割引後
     */
    public void setRentBdSpChild2(String rentBdSpChild2) {
        this.rentBdSpChild2 = rentBdSpChild2;
    }

    /**
     * レンタルスノーボード_特定券種を設定します。
     * 
     * @param rentBdSpKind
     *            レンタルスノーボード_特定券種
     */
    public void setRentBdSpKind(String rentBdSpKind) {
        this.rentBdSpKind = rentBdSpKind;
    }

    /**
     * レンタルスノーボード_在庫有無を設定します。
     * 
     * @param rentBdStockFlg
     *            レンタルスノーボード_在庫有無
     */
    public void setRentBdStockFlg(String rentBdStockFlg) {
        this.rentBdStockFlg = rentBdStockFlg;
    }

    /**
     * レンタルボードウェア_１日_大人_割引前を設定します。
     * 
     * @param rentBdwDayAdult1
     *            レンタルボードウェア_１日_大人_割引前
     */
    public void setRentBdwDayAdult1(String rentBdwDayAdult1) {
        this.rentBdwDayAdult1 = rentBdwDayAdult1;
    }

    /**
     * レンタルボードウェア_１日_大人_割引後を設定します。
     * 
     * @param rentBdwDayAdult2
     *            レンタルボードウェア_１日_大人_割引後
     */
    public void setRentBdwDayAdult2(String rentBdwDayAdult2) {
        this.rentBdwDayAdult2 = rentBdwDayAdult2;
    }

    /**
     * レンタルボードウェア_１日_小人_割引前を設定します。
     * 
     * @param rentBdwDayChild1
     *            レンタルボードウェア_１日_小人_割引前
     */
    public void setRentBdwDayChild1(String rentBdwDayChild1) {
        this.rentBdwDayChild1 = rentBdwDayChild1;
    }

    /**
     * レンタルボードウェア_１日_小人_割引後を設定します。
     * 
     * @param rentBdwDayChild2
     *            レンタルボードウェア_１日_小人_割引後
     */
    public void setRentBdwDayChild2(String rentBdwDayChild2) {
        this.rentBdwDayChild2 = rentBdwDayChild2;
    }

    /**
     * レンタルボードウェア_割引有無を設定します。
     * 
     * @param rentBdwDiscountFlg
     *            レンタルボードウェア_割引有無
     */
    public void setRentBdwDiscountFlg(String rentBdwDiscountFlg) {
        this.rentBdwDiscountFlg = rentBdwDiscountFlg;
    }

    /**
     * レンタルボードウェア_半日_大人_割引前を設定します。
     * 
     * @param rentBdwHalfAdult1
     *            レンタルボードウェア_半日_大人_割引前
     */
    public void setRentBdwHalfAdult1(String rentBdwHalfAdult1) {
        this.rentBdwHalfAdult1 = rentBdwHalfAdult1;
    }

    /**
     * レンタルボードウェア_半日_大人_割引後を設定します。
     * 
     * @param rentBdwHalfAdult2
     *            レンタルボードウェア_半日_大人_割引後
     */
    public void setRentBdwHalfAdult2(String rentBdwHalfAdult2) {
        this.rentBdwHalfAdult2 = rentBdwHalfAdult2;
    }

    /**
     * レンタルボードウェア_半日_小人_割引前を設定します。
     * 
     * @param rentBdwHalfChild1
     *            レンタルボードウェア_半日_小人_割引前
     */
    public void setRentBdwHalfChild1(String rentBdwHalfChild1) {
        this.rentBdwHalfChild1 = rentBdwHalfChild1;
    }

    /**
     * レンタルボードウェア_半日_小人_割引後を設定します。
     * 
     * @param rentBdwHalfChild2
     *            レンタルボードウェア_半日_小人_割引後
     */
    public void setRentBdwHalfChild2(String rentBdwHalfChild2) {
        this.rentBdwHalfChild2 = rentBdwHalfChild2;
    }

    /**
     * レンタルボードウェア_特定_大人_割引前を設定します。
     * 
     * @param rentBdwSpAdult1
     *            レンタルボードウェア_特定_大人_割引前
     */
    public void setRentBdwSpAdult1(String rentBdwSpAdult1) {
        this.rentBdwSpAdult1 = rentBdwSpAdult1;
    }

    /**
     * レンタルボードウェア_特定_大人_割引後を設定します。
     * 
     * @param rentBdwSpAdult2
     *            レンタルボードウェア_特定_大人_割引後
     */
    public void setRentBdwSpAdult2(String rentBdwSpAdult2) {
        this.rentBdwSpAdult2 = rentBdwSpAdult2;
    }

    /**
     * レンタルボードウェア_特定_小人_割引前を設定します。
     * 
     * @param rentBdwSpChild1
     *            レンタルボードウェア_特定_小人_割引前
     */
    public void setRentBdwSpChild1(String rentBdwSpChild1) {
        this.rentBdwSpChild1 = rentBdwSpChild1;
    }

    /**
     * レンタルボードウェア_特定_小人_割引後を設定します。
     * 
     * @param rentBdwSpChild2
     *            レンタルボードウェア_特定_小人_割引後
     */
    public void setRentBdwSpChild2(String rentBdwSpChild2) {
        this.rentBdwSpChild2 = rentBdwSpChild2;
    }

    /**
     * レンタルボードウェア_特定券種を設定します。
     * 
     * @param rentBdwSpKind
     *            レンタルボードウェア_特定券種
     */
    public void setRentBdwSpKind(String rentBdwSpKind) {
        this.rentBdwSpKind = rentBdwSpKind;
    }

    /**
     * レンタルボードウェア_在庫有無を設定します。
     * 
     * @param rentBdwStockFlg
     *            レンタルボードウェア_在庫有無
     */
    public void setRentBdwStockFlg(String rentBdwStockFlg) {
        this.rentBdwStockFlg = rentBdwStockFlg;
    }

    /**
     * レンタル交換有無を設定します。
     * 
     * @param rentChageFlg
     *            レンタル交換有無
     */
    public void setRentChageFlg(String rentChageFlg) {
        this.rentChageFlg = rentChageFlg;
    }

    /**
     * レンタルカービング_１日_大人_割引前を設定します。
     * 
     * @param rentCvDayAdult1
     *            レンタルカービング_１日_大人_割引前
     */
    public void setRentCvDayAdult1(String rentCvDayAdult1) {
        this.rentCvDayAdult1 = rentCvDayAdult1;
    }

    /**
     * レンタルカービング_１日_大人_割引後を設定します。
     * 
     * @param rentCvDayAdult2
     *            レンタルカービング_１日_大人_割引後
     */
    public void setRentCvDayAdult2(String rentCvDayAdult2) {
        this.rentCvDayAdult2 = rentCvDayAdult2;
    }

    /**
     * レンタルカービング_１日_小人_割引前を設定します。
     * 
     * @param rentCvDayChild1
     *            レンタルカービング_１日_小人_割引前
     */
    public void setRentCvDayChild1(String rentCvDayChild1) {
        this.rentCvDayChild1 = rentCvDayChild1;
    }

    /**
     * レンタルカービング_１日_小人_割引後を設定します。
     * 
     * @param rentCvDayChild2
     *            レンタルカービング_１日_小人_割引後
     */
    public void setRentCvDayChild2(String rentCvDayChild2) {
        this.rentCvDayChild2 = rentCvDayChild2;
    }

    /**
     * レンタルカービング_割引有無を設定します。
     * 
     * @param rentCvDiscountFlg
     *            レンタルカービング_割引有無
     */
    public void setRentCvDiscountFlg(String rentCvDiscountFlg) {
        this.rentCvDiscountFlg = rentCvDiscountFlg;
    }

    /**
     * レンタルカービング_半日_大人_割引前を設定します。
     * 
     * @param rentCvHalfAdult1
     *            レンタルカービング_半日_大人_割引前
     */
    public void setRentCvHalfAdult1(String rentCvHalfAdult1) {
        this.rentCvHalfAdult1 = rentCvHalfAdult1;
    }

    /**
     * レンタルカービング_半日_大人_割引後を設定します。
     * 
     * @param rentCvHalfAdult2
     *            レンタルカービング_半日_大人_割引後
     */
    public void setRentCvHalfAdult2(String rentCvHalfAdult2) {
        this.rentCvHalfAdult2 = rentCvHalfAdult2;
    }

    /**
     * レンタルカービング_半日_小人_割引前を設定します。
     * 
     * @param rentCvHalfChild1
     *            レンタルカービング_半日_小人_割引前
     */
    public void setRentCvHalfChild1(String rentCvHalfChild1) {
        this.rentCvHalfChild1 = rentCvHalfChild1;
    }

    /**
     * レンタルカービング_半日_小人_割引後を設定します。
     * 
     * @param rentCvHalfChild2
     *            レンタルカービング_半日_小人_割引後
     */
    public void setRentCvHalfChild2(String rentCvHalfChild2) {
        this.rentCvHalfChild2 = rentCvHalfChild2;
    }

    /**
     * レンタルカービング_特定_大人_割引前を設定します。
     * 
     * @param rentCvSpAdult1
     *            レンタルカービング_特定_大人_割引前
     */
    public void setRentCvSpAdult1(String rentCvSpAdult1) {
        this.rentCvSpAdult1 = rentCvSpAdult1;
    }

    /**
     * レンタルカービング_特定_大人_割引後を設定します。
     * 
     * @param rentCvSpAdult2
     *            レンタルカービング_特定_大人_割引後
     */
    public void setRentCvSpAdult2(String rentCvSpAdult2) {
        this.rentCvSpAdult2 = rentCvSpAdult2;
    }

    /**
     * レンタルカービング_特定_小人_割引前を設定します。
     * 
     * @param rentCvSpChild1
     *            レンタルカービング_特定_小人_割引前
     */
    public void setRentCvSpChild1(String rentCvSpChild1) {
        this.rentCvSpChild1 = rentCvSpChild1;
    }

    /**
     * レンタルカービング_特定_小人_割引後を設定します。
     * 
     * @param rentCvSpChild2
     *            レンタルカービング_特定_小人_割引後
     */
    public void setRentCvSpChild2(String rentCvSpChild2) {
        this.rentCvSpChild2 = rentCvSpChild2;
    }

    /**
     * レンタルカービング_特定券種を設定します。
     * 
     * @param rentCvSpKind
     *            レンタルカービング_特定券種
     */
    public void setRentCvSpKind(String rentCvSpKind) {
        this.rentCvSpKind = rentCvSpKind;
    }

    /**
     * レンタルカービング_在庫有無を設定します。
     * 
     * @param rentCvStockFlg
     *            レンタルカービング_在庫有無
     */
    public void setRentCvStockFlg(String rentCvStockFlg) {
        this.rentCvStockFlg = rentCvStockFlg;
    }

    /**
     * ファンスキーレンタル料金帯を設定します。
     * 
     * @param rentFsChargeFlg
     *            ファンスキーレンタル料金帯
     */
    public void setRentFsChargeFlg(String rentFsChargeFlg) {
        this.rentFsChargeFlg = rentFsChargeFlg;
    }

    /**
     * ファンスキーレンタル有無を設定します。
     * 
     * @param rentFsFlg
     *            ファンスキーレンタル有無
     */
    public void setRentFsFlg(String rentFsFlg) {
        this.rentFsFlg = rentFsFlg;
    }

    /**
     * レンタル_申込方法を設定します。
     * 
     * @param rentRequestWay
     *            レンタル_申込方法
     */
    public void setRentRequestWay(String rentRequestWay) {
        this.rentRequestWay = rentRequestWay;
    }

    /**
     * レンタルスキー_１日_大人_割引前を設定します。
     * 
     * @param rentSkiDayAdult1
     *            レンタルスキー_１日_大人_割引前
     */
    public void setRentSkiDayAdult1(String rentSkiDayAdult1) {
        this.rentSkiDayAdult1 = rentSkiDayAdult1;
    }

    /**
     * レンタルスキー_１日_大人_割引後を設定します。
     * 
     * @param rentSkiDayAdult2
     *            レンタルスキー_１日_大人_割引後
     */
    public void setRentSkiDayAdult2(String rentSkiDayAdult2) {
        this.rentSkiDayAdult2 = rentSkiDayAdult2;
    }

    /**
     * レンタルスキー_１日_小人_割引前を設定します。
     * 
     * @param rentSkiDayChild1
     *            レンタルスキー_１日_小人_割引前
     */
    public void setRentSkiDayChild1(String rentSkiDayChild1) {
        this.rentSkiDayChild1 = rentSkiDayChild1;
    }

    /**
     * レンタルスキー_１日_小人_割引後を設定します。
     * 
     * @param rentSkiDayChild2
     *            レンタルスキー_１日_小人_割引後
     */
    public void setRentSkiDayChild2(String rentSkiDayChild2) {
        this.rentSkiDayChild2 = rentSkiDayChild2;
    }

    /**
     * レンタルスキー_割引有無を設定します。
     * 
     * @param rentSkiDiscountFlg
     *            レンタルスキー_割引有無
     */
    public void setRentSkiDiscountFlg(String rentSkiDiscountFlg) {
        this.rentSkiDiscountFlg = rentSkiDiscountFlg;
    }

    /**
     * レンタルスキー_半日_大人_割引前を設定します。
     * 
     * @param rentSkiHalfAdult1
     *            レンタルスキー_半日_大人_割引前
     */
    public void setRentSkiHalfAdult1(String rentSkiHalfAdult1) {
        this.rentSkiHalfAdult1 = rentSkiHalfAdult1;
    }

    /**
     * レンタルスキー_半日_大人_割引後を設定します。
     * 
     * @param rentSkiHalfAdult2
     *            レンタルスキー_半日_大人_割引後
     */
    public void setRentSkiHalfAdult2(String rentSkiHalfAdult2) {
        this.rentSkiHalfAdult2 = rentSkiHalfAdult2;
    }

    /**
     * レンタルスキー_半日_小人_割引前を設定します。
     * 
     * @param rentSkiHalfChild1
     *            レンタルスキー_半日_小人_割引前
     */
    public void setRentSkiHalfChild1(String rentSkiHalfChild1) {
        this.rentSkiHalfChild1 = rentSkiHalfChild1;
    }

    /**
     * レンタルスキー_半日_小人_割引後を設定します。
     * 
     * @param rentSkiHalfChild2
     *            レンタルスキー_半日_小人_割引後
     */
    public void setRentSkiHalfChild2(String rentSkiHalfChild2) {
        this.rentSkiHalfChild2 = rentSkiHalfChild2;
    }

    /**
     * レンタル料金_備考を設定します。
     * 
     * @param rentSkiPriceMemo
     *            レンタル料金_備考
     */
    public void setRentSkiPriceMemo(String rentSkiPriceMemo) {
        this.rentSkiPriceMemo = rentSkiPriceMemo;
    }

    /**
     * レンタルスキー_特定_大人_割引前を設定します。
     * 
     * @param rentSkiSpAdult1
     *            レンタルスキー_特定_大人_割引前
     */
    public void setRentSkiSpAdult1(String rentSkiSpAdult1) {
        this.rentSkiSpAdult1 = rentSkiSpAdult1;
    }

    /**
     * レンタルスキー_特定_大人_割引後を設定します。
     * 
     * @param rentSkiSpAdult2
     *            レンタルスキー_特定_大人_割引後
     */
    public void setRentSkiSpAdult2(String rentSkiSpAdult2) {
        this.rentSkiSpAdult2 = rentSkiSpAdult2;
    }

    /**
     * レンタルスキー_特定_小人_割引前を設定します。
     * 
     * @param rentSkiSpChild1
     *            レンタルスキー_特定_小人_割引前
     */
    public void setRentSkiSpChild1(String rentSkiSpChild1) {
        this.rentSkiSpChild1 = rentSkiSpChild1;
    }

    /**
     * レンタルスキー_特定_小人_割引後を設定します。
     * 
     * @param rentSkiSpChild2
     *            レンタルスキー_特定_小人_割引後
     */
    public void setRentSkiSpChild2(String rentSkiSpChild2) {
        this.rentSkiSpChild2 = rentSkiSpChild2;
    }

    /**
     * レンタルスキー_特定券種を設定します。
     * 
     * @param rentSkiSpKind
     *            レンタルスキー_特定券種
     */
    public void setRentSkiSpKind(String rentSkiSpKind) {
        this.rentSkiSpKind = rentSkiSpKind;
    }

    /**
     * レンタルスキー_在庫有無を設定します。
     * 
     * @param rentSkiStockFlg
     *            レンタルスキー_在庫有無
     */
    public void setRentSkiStockFlg(String rentSkiStockFlg) {
        this.rentSkiStockFlg = rentSkiStockFlg;
    }

    /**
     * レンタルスキーウェア_１日_大人_割引前を設定します。
     * 
     * @param rentSkiwDayAdult1
     *            レンタルスキーウェア_１日_大人_割引前
     */
    public void setRentSkiwDayAdult1(String rentSkiwDayAdult1) {
        this.rentSkiwDayAdult1 = rentSkiwDayAdult1;
    }

    /**
     * レンタルスキーウェア_１日_大人_割引後を設定します。
     * 
     * @param rentSkiwDayAdult2
     *            レンタルスキーウェア_１日_大人_割引後
     */
    public void setRentSkiwDayAdult2(String rentSkiwDayAdult2) {
        this.rentSkiwDayAdult2 = rentSkiwDayAdult2;
    }

    /**
     * レンタルスキーウェア_１日_小人_割引前を設定します。
     * 
     * @param rentSkiwDayChild1
     *            レンタルスキーウェア_１日_小人_割引前
     */
    public void setRentSkiwDayChild1(String rentSkiwDayChild1) {
        this.rentSkiwDayChild1 = rentSkiwDayChild1;
    }

    /**
     * レンタルスキーウェア_１日_小人_割引後を設定します。
     * 
     * @param rentSkiwDayChild2
     *            レンタルスキーウェア_１日_小人_割引後
     */
    public void setRentSkiwDayChild2(String rentSkiwDayChild2) {
        this.rentSkiwDayChild2 = rentSkiwDayChild2;
    }

    /**
     * レンタルスキーウェア_割引有無を設定します。
     * 
     * @param rentSkiwDiscountFlg
     *            レンタルスキーウェア_割引有無
     */
    public void setRentSkiwDiscountFlg(String rentSkiwDiscountFlg) {
        this.rentSkiwDiscountFlg = rentSkiwDiscountFlg;
    }

    /**
     * レンタルスキーウェア_半日_大人_割引前を設定します。
     * 
     * @param rentSkiwHalfAdult1
     *            レンタルスキーウェア_半日_大人_割引前
     */
    public void setRentSkiwHalfAdult1(String rentSkiwHalfAdult1) {
        this.rentSkiwHalfAdult1 = rentSkiwHalfAdult1;
    }

    /**
     * レンタルスキーウェア_半日_大人_割引後を設定します。
     * 
     * @param rentSkiwHalfAdult2
     *            レンタルスキーウェア_半日_大人_割引後
     */
    public void setRentSkiwHalfAdult2(String rentSkiwHalfAdult2) {
        this.rentSkiwHalfAdult2 = rentSkiwHalfAdult2;
    }

    /**
     * レンタルスキーウェア_半日_小人_割引前を設定します。
     * 
     * @param rentSkiwHalfChild1
     *            レンタルスキーウェア_半日_小人_割引前
     */
    public void setRentSkiwHalfChild1(String rentSkiwHalfChild1) {
        this.rentSkiwHalfChild1 = rentSkiwHalfChild1;
    }

    /**
     * レンタルスキーウェア_半日_小人_割引後を設定します。
     * 
     * @param rentSkiwHalfChild2
     *            レンタルスキーウェア_半日_小人_割引後
     */
    public void setRentSkiwHalfChild2(String rentSkiwHalfChild2) {
        this.rentSkiwHalfChild2 = rentSkiwHalfChild2;
    }

    /**
     * レンタルスキーウェア_特定_大人_割引前を設定します。
     * 
     * @param rentSkiwSpAdult1
     *            レンタルスキーウェア_特定_大人_割引前
     */
    public void setRentSkiwSpAdult1(String rentSkiwSpAdult1) {
        this.rentSkiwSpAdult1 = rentSkiwSpAdult1;
    }

    /**
     * レンタルスキーウェア_特定_大人_割引後を設定します。
     * 
     * @param rentSkiwSpAdult2
     *            レンタルスキーウェア_特定_大人_割引後
     */
    public void setRentSkiwSpAdult2(String rentSkiwSpAdult2) {
        this.rentSkiwSpAdult2 = rentSkiwSpAdult2;
    }

    /**
     * レンタルスキーウェア_特定_小人_割引前を設定します。
     * 
     * @param rentSkiwSpChild1
     *            レンタルスキーウェア_特定_小人_割引前
     */
    public void setRentSkiwSpChild1(String rentSkiwSpChild1) {
        this.rentSkiwSpChild1 = rentSkiwSpChild1;
    }

    /**
     * レンタルスキーウェア_特定_小人_割引後を設定します。
     * 
     * @param rentSkiwSpChild2
     *            レンタルスキーウェア_特定_小人_割引後
     */
    public void setRentSkiwSpChild2(String rentSkiwSpChild2) {
        this.rentSkiwSpChild2 = rentSkiwSpChild2;
    }

    /**
     * レンタルスキーウェア_特定券種を設定します。
     * 
     * @param rentSkiwSpKind
     *            レンタルスキーウェア_特定券種
     */
    public void setRentSkiwSpKind(String rentSkiwSpKind) {
        this.rentSkiwSpKind = rentSkiwSpKind;
    }

    /**
     * レンタルスキーウェア_在庫有無を設定します。
     * 
     * @param rentSkiwStockFlg
     *            レンタルスキーウェア_在庫有無
     */
    public void setRentSkiwStockFlg(String rentSkiwStockFlg) {
        this.rentSkiwStockFlg = rentSkiwStockFlg;
    }

    /**
     * スクールボード_１日_大人_割引前を設定します。
     * 
     * @param schoolBdDayAdult1
     *            スクールボード_１日_大人_割引前
     */
    public void setSchoolBdDayAdult1(String schoolBdDayAdult1) {
        this.schoolBdDayAdult1 = schoolBdDayAdult1;
    }

    /**
     * スクールボード_１日_大人_割引後を設定します。
     * 
     * @param schoolBdDayAdult2
     *            スクールボード_１日_大人_割引後
     */
    public void setSchoolBdDayAdult2(String schoolBdDayAdult2) {
        this.schoolBdDayAdult2 = schoolBdDayAdult2;
    }

    /**
     * スクールボード_１日_小人_割引前を設定します。
     * 
     * @param schoolBdDayChild1
     *            スクールボード_１日_小人_割引前
     */
    public void setSchoolBdDayChild1(String schoolBdDayChild1) {
        this.schoolBdDayChild1 = schoolBdDayChild1;
    }

    /**
     * スクールボード_１日_小人_割引後を設定します。
     * 
     * @param schoolBdDayChild2
     *            スクールボード_１日_小人_割引後
     */
    public void setSchoolBdDayChild2(String schoolBdDayChild2) {
        this.schoolBdDayChild2 = schoolBdDayChild2;
    }

    /**
     * スクールボード_割引有無を設定します。
     * 
     * @param schoolBdDiscountFlg
     *            スクールボード_割引有無
     */
    public void setSchoolBdDiscountFlg(String schoolBdDiscountFlg) {
        this.schoolBdDiscountFlg = schoolBdDiscountFlg;
    }

    /**
     * スクールボード_半日_大人_割引前を設定します。
     * 
     * @param schoolBdHalfAdult1
     *            スクールボード_半日_大人_割引前
     */
    public void setSchoolBdHalfAdult1(String schoolBdHalfAdult1) {
        this.schoolBdHalfAdult1 = schoolBdHalfAdult1;
    }

    /**
     * スクールボード_半日_大人_割引後を設定します。
     * 
     * @param schoolBdHalfAdult2
     *            スクールボード_半日_大人_割引後
     */
    public void setSchoolBdHalfAdult2(String schoolBdHalfAdult2) {
        this.schoolBdHalfAdult2 = schoolBdHalfAdult2;
    }

    /**
     * スクールボード_半日_小人_割引前を設定します。
     * 
     * @param schoolBdHalfChild1
     *            スクールボード_半日_小人_割引前
     */
    public void setSchoolBdHalfChild1(String schoolBdHalfChild1) {
        this.schoolBdHalfChild1 = schoolBdHalfChild1;
    }

    /**
     * スクールボード_半日_小人_割引後を設定します。
     * 
     * @param schoolBdHalfChild2
     *            スクールボード_半日_小人_割引後
     */
    public void setSchoolBdHalfChild2(String schoolBdHalfChild2) {
        this.schoolBdHalfChild2 = schoolBdHalfChild2;
    }

    /**
     * スクールボード_特定１_大人_割引前を設定します。
     * 
     * @param schoolBdTime1Adult1
     *            スクールボード_特定１_大人_割引前
     */
    public void setSchoolBdTime1Adult1(String schoolBdTime1Adult1) {
        this.schoolBdTime1Adult1 = schoolBdTime1Adult1;
    }

    /**
     * スクールボード_特定１_大人_割引後を設定します。
     * 
     * @param schoolBdTime1Adult2
     *            スクールボード_特定１_大人_割引後
     */
    public void setSchoolBdTime1Adult2(String schoolBdTime1Adult2) {
        this.schoolBdTime1Adult2 = schoolBdTime1Adult2;
    }

    /**
     * スクールボード_特定１_小人_割引前を設定します。
     * 
     * @param schoolBdTime1Child1
     *            スクールボード_特定１_小人_割引前
     */
    public void setSchoolBdTime1Child1(String schoolBdTime1Child1) {
        this.schoolBdTime1Child1 = schoolBdTime1Child1;
    }

    /**
     * スクールボード_特定１_小人_割引後を設定します。
     * 
     * @param schoolBdTime1Child2
     *            スクールボード_特定１_小人_割引後
     */
    public void setSchoolBdTime1Child2(String schoolBdTime1Child2) {
        this.schoolBdTime1Child2 = schoolBdTime1Child2;
    }

    /**
     * スクールボード_特定１_時間を設定します。
     * 
     * @param schoolBdTime1Hh
     *            スクールボード_特定１_時間
     */
    public void setSchoolBdTime1Hh(String schoolBdTime1Hh) {
        this.schoolBdTime1Hh = schoolBdTime1Hh;
    }

    /**
     * スクールボード_特定１_分を設定します。
     * 
     * @param schoolBdTime1Mm
     *            スクールボード_特定１_分
     */
    public void setSchoolBdTime1Mm(String schoolBdTime1Mm) {
        this.schoolBdTime1Mm = schoolBdTime1Mm;
    }

    /**
     * スクールボード_特定２_大人_割引前を設定します。
     * 
     * @param schoolBdTime2Adult1
     *            スクールボード_特定２_大人_割引前
     */
    public void setSchoolBdTime2Adult1(String schoolBdTime2Adult1) {
        this.schoolBdTime2Adult1 = schoolBdTime2Adult1;
    }

    /**
     * スクールボード_特定２_大人_割引後を設定します。
     * 
     * @param schoolBdTime2Adult2
     *            スクールボード_特定２_大人_割引後
     */
    public void setSchoolBdTime2Adult2(String schoolBdTime2Adult2) {
        this.schoolBdTime2Adult2 = schoolBdTime2Adult2;
    }

    /**
     * スクールボード_特定２_小人_割引前を設定します。
     * 
     * @param schoolBdTime2Child1
     *            スクールボード_特定２_小人_割引前
     */
    public void setSchoolBdTime2Child1(String schoolBdTime2Child1) {
        this.schoolBdTime2Child1 = schoolBdTime2Child1;
    }

    /**
     * スクールボード_特定２_小人_割引後を設定します。
     * 
     * @param schoolBdTime2Child2
     *            スクールボード_特定２_小人_割引後
     */
    public void setSchoolBdTime2Child2(String schoolBdTime2Child2) {
        this.schoolBdTime2Child2 = schoolBdTime2Child2;
    }

    /**
     * スクールボード_特定２_時間を設定します。
     * 
     * @param schoolBdTime2Hh
     *            スクールボード_特定２_時間
     */
    public void setSchoolBdTime2Hh(String schoolBdTime2Hh) {
        this.schoolBdTime2Hh = schoolBdTime2Hh;
    }

    /**
     * スクールボード_特定２_分を設定します。
     * 
     * @param schoolBdTime2Mm
     *            スクールボード_特定２_分
     */
    public void setSchoolBdTime2Mm(String schoolBdTime2Mm) {
        this.schoolBdTime2Mm = schoolBdTime2Mm;
    }

    /**
     * スクール_その他内容を設定します。
     * 
     * @param schoolOtherContent
     *            スクール_その他内容
     */
    public void setSchoolOtherContent(String schoolOtherContent) {
        this.schoolOtherContent = schoolOtherContent;
    }

    /**
     * スクール料金_備考を設定します。
     * 
     * @param schoolPriceMemo
     *            スクール料金_備考
     */
    public void setSchoolPriceMemo(String schoolPriceMemo) {
        this.schoolPriceMemo = schoolPriceMemo;
    }

    /**
     * スクール_申込方法を設定します。
     * 
     * @param schoolRequestWay
     *            スクール_申込方法
     */
    public void setSchoolRequestWay(String schoolRequestWay) {
        this.schoolRequestWay = schoolRequestWay;
    }

    /**
     * スクールスキー_１日_大人_割引前を設定します。
     * 
     * @param schoolSkiDayAdult1
     *            スクールスキー_１日_大人_割引前
     */
    public void setSchoolSkiDayAdult1(String schoolSkiDayAdult1) {
        this.schoolSkiDayAdult1 = schoolSkiDayAdult1;
    }

    /**
     * スクールスキー_１日_大人_割引後を設定します。
     * 
     * @param schoolSkiDayAdult2
     *            スクールスキー_１日_大人_割引後
     */
    public void setSchoolSkiDayAdult2(String schoolSkiDayAdult2) {
        this.schoolSkiDayAdult2 = schoolSkiDayAdult2;
    }

    /**
     * スクールスキー_１日_小人_割引前を設定します。
     * 
     * @param schoolSkiDayChild1
     *            スクールスキー_１日_小人_割引前
     */
    public void setSchoolSkiDayChild1(String schoolSkiDayChild1) {
        this.schoolSkiDayChild1 = schoolSkiDayChild1;
    }

    /**
     * スクールスキー_１日_小人_割引後を設定します。
     * 
     * @param schoolSkiDayChild2
     *            スクールスキー_１日_小人_割引後
     */
    public void setSchoolSkiDayChild2(String schoolSkiDayChild2) {
        this.schoolSkiDayChild2 = schoolSkiDayChild2;
    }

    /**
     * スクールスキー_割引有無を設定します。
     * 
     * @param schoolSkiDiscountFlg
     *            スクールスキー_割引有無
     */
    public void setSchoolSkiDiscountFlg(String schoolSkiDiscountFlg) {
        this.schoolSkiDiscountFlg = schoolSkiDiscountFlg;
    }

    /**
     * スクールスキー_半日_大人_割引前を設定します。
     * 
     * @param schoolSkiHalfAdult1
     *            スクールスキー_半日_大人_割引前
     */
    public void setSchoolSkiHalfAdult1(String schoolSkiHalfAdult1) {
        this.schoolSkiHalfAdult1 = schoolSkiHalfAdult1;
    }

    /**
     * スクールスキー_半日_大人_割引後を設定します。
     * 
     * @param schoolSkiHalfAdult2
     *            スクールスキー_半日_大人_割引後
     */
    public void setSchoolSkiHalfAdult2(String schoolSkiHalfAdult2) {
        this.schoolSkiHalfAdult2 = schoolSkiHalfAdult2;
    }

    /**
     * スクールスキー_半日_小人_割引前を設定します。
     * 
     * @param schoolSkiHalfChild1
     *            スクールスキー_半日_小人_割引前
     */
    public void setSchoolSkiHalfChild1(String schoolSkiHalfChild1) {
        this.schoolSkiHalfChild1 = schoolSkiHalfChild1;
    }

    /**
     * スクールスキー_半日_小人_割引後を設定します。
     * 
     * @param schoolSkiHalfChild2
     *            スクールスキー_半日_小人_割引後
     */
    public void setSchoolSkiHalfChild2(String schoolSkiHalfChild2) {
        this.schoolSkiHalfChild2 = schoolSkiHalfChild2;
    }

    /**
     * スクールスキー_特定１_大人_割引前を設定します。
     * 
     * @param schoolSkiTime1Adult1
     *            スクールスキー_特定１_大人_割引前
     */
    public void setSchoolSkiTime1Adult1(String schoolSkiTime1Adult1) {
        this.schoolSkiTime1Adult1 = schoolSkiTime1Adult1;
    }

    /**
     * スクールスキー_特定１_大人_割引後を設定します。
     * 
     * @param schoolSkiTime1Adult2
     *            スクールスキー_特定１_大人_割引後
     */
    public void setSchoolSkiTime1Adult2(String schoolSkiTime1Adult2) {
        this.schoolSkiTime1Adult2 = schoolSkiTime1Adult2;
    }

    /**
     * スクールスキー_特定１_小人_割引前を設定します。
     * 
     * @param schoolSkiTime1Child1
     *            スクールスキー_特定１_小人_割引前
     */
    public void setSchoolSkiTime1Child1(String schoolSkiTime1Child1) {
        this.schoolSkiTime1Child1 = schoolSkiTime1Child1;
    }

    /**
     * スクールスキー_特定１_小人_割引後を設定します。
     * 
     * @param schoolSkiTime1Child2
     *            スクールスキー_特定１_小人_割引後
     */
    public void setSchoolSkiTime1Child2(String schoolSkiTime1Child2) {
        this.schoolSkiTime1Child2 = schoolSkiTime1Child2;
    }

    /**
     * スクールスキー_特定１_時間を設定します。
     * 
     * @param schoolSkiTime1Hh
     *            スクールスキー_特定１_時間
     */
    public void setSchoolSkiTime1Hh(String schoolSkiTime1Hh) {
        this.schoolSkiTime1Hh = schoolSkiTime1Hh;
    }

    /**
     * スクールスキー_特定１_分を設定します。
     * 
     * @param schoolSkiTime1Mm
     *            スクールスキー_特定１_分
     */
    public void setSchoolSkiTime1Mm(String schoolSkiTime1Mm) {
        this.schoolSkiTime1Mm = schoolSkiTime1Mm;
    }

    /**
     * スクールスキー_特定２_大人_割引前を設定します。
     * 
     * @param schoolSkiTime2Adult1
     *            スクールスキー_特定２_大人_割引前
     */
    public void setSchoolSkiTime2Adult1(String schoolSkiTime2Adult1) {
        this.schoolSkiTime2Adult1 = schoolSkiTime2Adult1;
    }

    /**
     * スクールスキー_特定２_大人_割引後を設定します。
     * 
     * @param schoolSkiTime2Adult2
     *            スクールスキー_特定２_大人_割引後
     */
    public void setSchoolSkiTime2Adult2(String schoolSkiTime2Adult2) {
        this.schoolSkiTime2Adult2 = schoolSkiTime2Adult2;
    }

    /**
     * スクールスキー_特定２_小人_割引前を設定します。
     * 
     * @param schoolSkiTime2Child1
     *            スクールスキー_特定２_小人_割引前
     */
    public void setSchoolSkiTime2Child1(String schoolSkiTime2Child1) {
        this.schoolSkiTime2Child1 = schoolSkiTime2Child1;
    }

    /**
     * スクールスキー_特定２_小人_割引後を設定します。
     * 
     * @param schoolSkiTime2Child2
     *            スクールスキー_特定２_小人_割引後
     */
    public void setSchoolSkiTime2Child2(String schoolSkiTime2Child2) {
        this.schoolSkiTime2Child2 = schoolSkiTime2Child2;
    }

    /**
     * スクールスキー_特定２_時間を設定します。
     * 
     * @param schoolSkiTime2Hh
     *            スクールスキー_特定２_時間
     */
    public void setSchoolSkiTime2Hh(String schoolSkiTime2Hh) {
        this.schoolSkiTime2Hh = schoolSkiTime2Hh;
    }

    /**
     * スクールスキー_特定２_分を設定します。
     * 
     * @param schoolSkiTime2Mm
     *            スクールスキー_特定２_分
     */
    public void setSchoolSkiTime2Mm(String schoolSkiTime2Mm) {
        this.schoolSkiTime2Mm = schoolSkiTime2Mm;
    }

    /**
     * スキーキャッチコピーを設定します。
     * 
     * @param skiCatchcopy
     *            スキーキャッチコピー
     */
    public void setSkiCatchcopy(String skiCatchcopy) {
        this.skiCatchcopy = skiCatchcopy;
    }

}
