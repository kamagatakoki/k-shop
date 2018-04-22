package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]施設_交通手段_スキー エンティティ
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
public class DFacilityTrafficSki implements FacilityManageBodyKey {

    /** アクセス１_車時間 */
    private String acCarTime1;

    /** アクセス２_車時間 */
    private String acCarTime2;

    /** アクセス３_車時間 */
    private String acCarTime3;

    /** アクセス１_迎え時間終了（時間） */
    private String acMeetTimeEnd1Hour;

    /** アクセス１_迎え時間終了（分） */
    private String acMeetTimeEnd1Minute;

    /** アクセス２_迎え時間終了（時間） */
    private String acMeetTimeEnd2Hour;

    /** アクセス２_迎え時間終了（分） */
    private String acMeetTimeEnd2Minute;

    /** アクセス３_迎え時間終了（時間） */
    private String acMeetTimeEnd3Hour;

    /** アクセス３_迎え時間終了（分） */
    private String acMeetTimeEnd3Minute;

    /** アクセス１_迎え時間有無 */
    private String acMeetTimeFlg1;

    /** アクセス２_迎え時間有無 */
    private String acMeetTimeFlg2;

    /** アクセス３_迎え時間有無 */
    private String acMeetTimeFlg3;

    /** アクセス１_迎え時間開始（時間） */
    private String acMeetTimeStart1Hour;

    /** アクセス１_迎え時間開始（分） */
    private String acMeetTimeStart1Minute;

    /** アクセス２_迎え時間開始（時間） */
    private String acMeetTimeStart2Hour;

    /** アクセス２_迎え時間開始（分） */
    private String acMeetTimeStart2Minute;

    /** アクセス３_迎え時間開始（時間） */
    private String acMeetTimeStart3Hour;

    /** アクセス３_迎え時間開始（分） */
    private String acMeetTimeStart3Minute;

    /** アクセス１_送迎区分 */
    private String acMsDiv1;

    /** アクセス２_送迎区分 */
    private String acMsDiv2;

    /** アクセス３_送迎区分 */
    private String acMsDiv3;

    /** アクセス１_送迎予約 */
    private String acMsReserve1;

    /** アクセス２_送迎予約 */
    private String acMsReserve2;

    /** アクセス３_送迎予約 */
    private String acMsReserve3;

    /** アクセス１_送迎予約その他 */
    private String acMsReserveCmt1;

    /** アクセス２_送迎予約その他 */
    private String acMsReserveCmt2;

    /** アクセス３_送迎予約その他 */
    private String acMsReserveCmt3;

    /** アクセス１_その他コメント */
    private String acOthersCmt1;

    /** アクセス２_その他コメント */
    private String acOthersCmt2;

    /** アクセス３_その他コメント */
    private String acOthersCmt3;

    /** アクセス１_その他有無 */
    private String acOthersFlg1;

    /** アクセス２_その他有無 */
    private String acOthersFlg2;

    /** アクセス３_その他有無 */
    private String acOthersFlg3;

    /** アクセス１_その他 */
    private String acOtherTimeCmt1;

    /** アクセス２_その他 */
    private String acOtherTimeCmt2;

    /** アクセス３_その他 */
    private String acOtherTimeCmt3;

    /** アクセス１_送り時間終了（時間） */
    private String acSendTimeEnd1Hour;

    /** アクセス１_送り時間終了（分） */
    private String acSendTimeEnd1Minute;

    /** アクセス２_送り時間終了（時間） */
    private String acSendTimeEnd2Hour;

    /** アクセス２_送り時間終了（分） */
    private String acSendTimeEnd2Minute;

    /** アクセス３_送り時間終了（時間） */
    private String acSendTimeEnd3Hour;

    /** アクセス３_送り時間終了（分） */
    private String acSendTimeEnd3Minute;

    /** アクセス１_送り時間有無 */
    private String acSendTimeFlg1;

    /** アクセス２_送り時間有無 */
    private String acSendTimeFlg2;

    /** アクセス３_送り時間有無 */
    private String acSendTimeFlg3;

    /** アクセス１_送り時間開始（時間） */
    private String acSendTimeStart1Hour;

    /** アクセス１_送り時間開始（分） */
    private String acSendTimeStart1Minute;

    /** アクセス２_送り時間開始（時間） */
    private String acSendTimeStart2Hour;

    /** アクセス２_送り時間開始（分） */
    private String acSendTimeStart2Minute;

    /** アクセス３_送り時間開始（時間） */
    private String acSendTimeStart3Hour;

    /** アクセス３_送り時間開始（分） */
    private String acSendTimeStart3Minute;

    /** アクセス１_送迎シャトルバス有無 */
    private String acShuttleBusFlg1;

    /** アクセス２_送迎シャトルバス有無 */
    private String acShuttleBusFlg2;

    /** アクセス３_送迎シャトルバス有無 */
    private String acShuttleBusFlg3;

    /** アクセス１_スキー場 */
    private String acSkiNm1;

    /** アクセス２_スキー場 */
    private String acSkiNm2;

    /** アクセス３_スキー場 */
    private String acSkiNm3;

    /** アクセス１_徒歩時間 */
    private String acWalkTime1;

    /** アクセス２_徒歩時間 */
    private String acWalkTime2;

    /** アクセス３_徒歩時間 */
    private String acWalkTime3;

    /** 施設コード */
    private String facilityCd;

    /** 施設パターン */
    private String facilityPattern;

    /** 回答書種別 */
    private String kindFlg;

    /**
     * アクセス１_車時間を取得します。
     * 
     * @return アクセス１_車時間
     */
    public String getAcCarTime1() {
        return acCarTime1;
    }

    /**
     * アクセス２_車時間を取得します。
     * 
     * @return アクセス２_車時間
     */
    public String getAcCarTime2() {
        return acCarTime2;
    }

    /**
     * アクセス３_車時間を取得します。
     * 
     * @return アクセス３_車時間
     */
    public String getAcCarTime3() {
        return acCarTime3;
    }

    /**
     * アクセス１_迎え時間終了を取得します。
     * 
     * @return アクセス１_迎え時間終了
     */
    public String getAcMeetTimeEnd1() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeEnd1Hour(),
                getAcMeetTimeEnd1Minute());
    }

    /**
     * アクセス１_迎え時間終了（時間）を取得します。
     * 
     * @return アクセス１_迎え時間終了（時間）
     */
    public String getAcMeetTimeEnd1Hour() {
        return acMeetTimeEnd1Hour;
    }

    /**
     * アクセス１_迎え時間終了（分）を取得します。
     * 
     * @return アクセス１_迎え時間終了（分）
     */
    public String getAcMeetTimeEnd1Minute() {
        return acMeetTimeEnd1Minute;
    }

    /**
     * アクセス２_迎え時間終了を取得します。
     * 
     * @return アクセス２_迎え時間終了
     */
    public String getAcMeetTimeEnd2() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeEnd2Hour(),
                getAcMeetTimeEnd2Minute());
    }

    /**
     * アクセス２_迎え時間終了（時間）を取得します。
     * 
     * @return アクセス２_迎え時間終了（時間）
     */
    public String getAcMeetTimeEnd2Hour() {
        return acMeetTimeEnd2Hour;
    }

    /**
     * アクセス２_迎え時間終了（分）を取得します。
     * 
     * @return アクセス２_迎え時間終了（分）
     */
    public String getAcMeetTimeEnd2Minute() {
        return acMeetTimeEnd2Minute;
    }

    /**
     * アクセス３_迎え時間終了を取得します。
     * 
     * @return アクセス３_迎え時間終了
     */
    public String getAcMeetTimeEnd3() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeEnd3Hour(),
                getAcMeetTimeEnd3Minute());
    }

    /**
     * アクセス３_迎え時間終了（時間）を取得します。
     * 
     * @return アクセス３_迎え時間終了（時間）
     */
    public String getAcMeetTimeEnd3Hour() {
        return acMeetTimeEnd3Hour;
    }

    /**
     * アクセス３_迎え時間終了（分）を取得します。
     * 
     * @return アクセス３_迎え時間終了（分）
     */
    public String getAcMeetTimeEnd3Minute() {
        return acMeetTimeEnd3Minute;
    }

    /**
     * アクセス１_迎え時間有無を取得します。
     * 
     * @return アクセス１_迎え時間有無
     */
    public String getAcMeetTimeFlg1() {
        return acMeetTimeFlg1;
    }

    /**
     * アクセス２_迎え時間有無を取得します。
     * 
     * @return アクセス２_迎え時間有無
     */
    public String getAcMeetTimeFlg2() {
        return acMeetTimeFlg2;
    }

    /**
     * アクセス３_迎え時間有無を取得します。
     * 
     * @return アクセス３_迎え時間有無
     */
    public String getAcMeetTimeFlg3() {
        return acMeetTimeFlg3;
    }

    /**
     * アクセス１_迎え時間開始を取得します。
     * 
     * @return アクセス１_迎え時間開始
     */
    public String getAcMeetTimeStart1() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeStart1Hour(),
                getAcMeetTimeStart1Minute());
    }

    /**
     * アクセス１_迎え時間開始（時間）を取得します。
     * 
     * @return アクセス１_迎え時間開始（時間）
     */
    public String getAcMeetTimeStart1Hour() {
        return acMeetTimeStart1Hour;
    }

    /**
     * アクセス１_迎え時間開始（分）を取得します。
     * 
     * @return アクセス１_迎え時間開始（分）
     */
    public String getAcMeetTimeStart1Minute() {
        return acMeetTimeStart1Minute;
    }

    /**
     * アクセス２_迎え時間開始を取得します。
     * 
     * @return アクセス２_迎え時間開始
     */
    public String getAcMeetTimeStart2() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeStart2Hour(),
                getAcMeetTimeStart2Minute());
    }

    /**
     * アクセス２_迎え時間開始（時間）を取得します。
     * 
     * @return アクセス２_迎え時間開始（時間）
     */
    public String getAcMeetTimeStart2Hour() {
        return acMeetTimeStart2Hour;
    }

    /**
     * アクセス２_迎え時間開始（分）を取得します。
     * 
     * @return アクセス２_迎え時間開始（分）
     */
    public String getAcMeetTimeStart2Minute() {
        return acMeetTimeStart2Minute;
    }

    /**
     * アクセス３_迎え時間開始を取得します。
     * 
     * @return アクセス３_迎え時間開始
     */
    public String getAcMeetTimeStart3() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeStart3Hour(),
                getAcMeetTimeStart3Minute());
    }

    /**
     * アクセス３_迎え時間開始（時間）を取得します。
     * 
     * @return アクセス３_迎え時間開始（時間）
     */
    public String getAcMeetTimeStart3Hour() {
        return acMeetTimeStart3Hour;
    }

    /**
     * アクセス３_迎え時間開始（分）を取得します。
     * 
     * @return アクセス３_迎え時間開始（分）
     */
    public String getAcMeetTimeStart3Minute() {
        return acMeetTimeStart3Minute;
    }

    /**
     * アクセス１_送迎区分を取得します。
     * 
     * @return アクセス１_送迎区分
     */
    public String getAcMsDiv1() {
        return acMsDiv1;
    }

    /**
     * アクセス２_送迎区分を取得します。
     * 
     * @return アクセス２_送迎区分
     */
    public String getAcMsDiv2() {
        return acMsDiv2;
    }

    /**
     * アクセス３_送迎区分を取得します。
     * 
     * @return アクセス３_送迎区分
     */
    public String getAcMsDiv3() {
        return acMsDiv3;
    }

    /**
     * アクセス１_送迎予約を取得します。
     * 
     * @return アクセス１_送迎予約
     */
    public String getAcMsReserve1() {
        return acMsReserve1;
    }

    /**
     * アクセス２_送迎予約を取得します。
     * 
     * @return アクセス２_送迎予約
     */
    public String getAcMsReserve2() {
        return acMsReserve2;
    }

    /**
     * アクセス３_送迎予約を取得します。
     * 
     * @return アクセス３_送迎予約
     */
    public String getAcMsReserve3() {
        return acMsReserve3;
    }

    /**
     * アクセス１_送迎予約その他を取得します。
     * 
     * @return アクセス１_送迎予約その他
     */
    public String getAcMsReserveCmt1() {
        return acMsReserveCmt1;
    }

    /**
     * アクセス２_送迎予約その他を取得します。
     * 
     * @return アクセス２_送迎予約その他
     */
    public String getAcMsReserveCmt2() {
        return acMsReserveCmt2;
    }

    /**
     * アクセス３_送迎予約その他を取得します。
     * 
     * @return アクセス３_送迎予約その他
     */
    public String getAcMsReserveCmt3() {
        return acMsReserveCmt3;
    }

    /**
     * アクセス１_その他コメントを取得します。
     * 
     * @return アクセス１_その他コメント
     */
    public String getAcOthersCmt1() {
        return acOthersCmt1;
    }

    /**
     * アクセス２_その他コメントを取得します。
     * 
     * @return アクセス２_その他コメント
     */
    public String getAcOthersCmt2() {
        return acOthersCmt2;
    }

    /**
     * アクセス３_その他コメントを取得します。
     * 
     * @return アクセス３_その他コメント
     */
    public String getAcOthersCmt3() {
        return acOthersCmt3;
    }

    /**
     * アクセス１_その他有無を取得します。
     * 
     * @return アクセス１_その他有無
     */
    public String getAcOthersFlg1() {
        return acOthersFlg1;
    }

    /**
     * アクセス２_その他有無を取得します。
     * 
     * @return アクセス２_その他有無
     */
    public String getAcOthersFlg2() {
        return acOthersFlg2;
    }

    /**
     * アクセス３_その他有無を取得します。
     * 
     * @return アクセス３_その他有無
     */
    public String getAcOthersFlg3() {
        return acOthersFlg3;
    }

    /**
     * アクセス１_その他を取得します。
     * 
     * @return アクセス１_その他
     */
    public String getAcOtherTimeCmt1() {
        return acOtherTimeCmt1;
    }

    /**
     * アクセス２_その他を取得します。
     * 
     * @return アクセス２_その他
     */
    public String getAcOtherTimeCmt2() {
        return acOtherTimeCmt2;
    }

    /**
     * アクセス３_その他を取得します。
     * 
     * @return アクセス３_その他
     */
    public String getAcOtherTimeCmt3() {
        return acOtherTimeCmt3;
    }

    /**
     * アクセス１_送り時間終了を取得します。
     * 
     * @return アクセス１_送り時間終了
     */
    public String getAcSendTimeEnd1() {
        return DKikakuWebUtil.buildTime(getAcSendTimeEnd1Hour(),
                getAcSendTimeEnd1Minute());
    }

    /**
     * アクセス１_送り時間終了（時間）を取得します。
     * 
     * @return アクセス１_送り時間終了（時間）
     */
    public String getAcSendTimeEnd1Hour() {
        return acSendTimeEnd1Hour;
    }

    /**
     * アクセス１_送り時間終了（分）を取得します。
     * 
     * @return アクセス１_送り時間終了（分）
     */
    public String getAcSendTimeEnd1Minute() {
        return acSendTimeEnd1Minute;
    }

    /**
     * アクセス２_送り時間終了を取得します。
     * 
     * @return アクセス２_送り時間終了
     */
    public String getAcSendTimeEnd2() {
        return DKikakuWebUtil.buildTime(getAcSendTimeEnd2Hour(),
                getAcSendTimeEnd2Minute());
    }

    /**
     * アクセス２_送り時間終了（時間）を取得します。
     * 
     * @return アクセス２_送り時間終了（時間）
     */
    public String getAcSendTimeEnd2Hour() {
        return acSendTimeEnd2Hour;
    }

    /**
     * アクセス２_送り時間終了（分）を取得します。
     * 
     * @return アクセス２_送り時間終了（分）
     */
    public String getAcSendTimeEnd2Minute() {
        return acSendTimeEnd2Minute;
    }

    /**
     * アクセス３_送り時間終了を取得します。
     * 
     * @return アクセス３_送り時間終了
     */
    public String getAcSendTimeEnd3() {
        return DKikakuWebUtil.buildTime(getAcSendTimeEnd3Hour(),
                getAcSendTimeEnd3Minute());
    }

    /**
     * アクセス３_送り時間終了（時間）を取得します。
     * 
     * @return アクセス３_送り時間終了（時間）
     */
    public String getAcSendTimeEnd3Hour() {
        return acSendTimeEnd3Hour;
    }

    /**
     * アクセス３_送り時間終了（分）を取得します。
     * 
     * @return アクセス３_送り時間終了（分）
     */
    public String getAcSendTimeEnd3Minute() {
        return acSendTimeEnd3Minute;
    }

    /**
     * アクセス１_送り時間有無を取得します。
     * 
     * @return アクセス１_送り時間有無
     */
    public String getAcSendTimeFlg1() {
        return acSendTimeFlg1;
    }

    /**
     * アクセス２_送り時間有無を取得します。
     * 
     * @return アクセス２_送り時間有無
     */
    public String getAcSendTimeFlg2() {
        return acSendTimeFlg2;
    }

    /**
     * アクセス３_送り時間有無を取得します。
     * 
     * @return アクセス３_送り時間有無
     */
    public String getAcSendTimeFlg3() {
        return acSendTimeFlg3;
    }

    /**
     * アクセス１_送り時間開始を取得します。
     * 
     * @return アクセス１_送り時間開始
     */
    public String getAcSendTimeStart1() {
        return DKikakuWebUtil.buildTime(getAcSendTimeStart1Hour(),
                getAcSendTimeStart1Minute());
    }

    /**
     * アクセス１_送り時間開始（時間）を取得します。
     * 
     * @return アクセス１_送り時間開始（時間）
     */
    public String getAcSendTimeStart1Hour() {
        return acSendTimeStart1Hour;
    }

    /**
     * アクセス１_送り時間開始（分）を取得します。
     * 
     * @return アクセス１_送り時間開始（分）
     */
    public String getAcSendTimeStart1Minute() {
        return acSendTimeStart1Minute;
    }

    /**
     * アクセス２_送り時間開始を取得します。
     * 
     * @return アクセス２_送り時間開始
     */
    public String getAcSendTimeStart2() {
        return DKikakuWebUtil.buildTime(getAcSendTimeStart2Hour(),
                getAcSendTimeStart2Minute());
    }

    /**
     * アクセス２_送り時間開始（時間）を取得します。
     * 
     * @return アクセス２_送り時間開始（時間）
     */
    public String getAcSendTimeStart2Hour() {
        return acSendTimeStart2Hour;
    }

    /**
     * アクセス２_送り時間開始（分）を取得します。
     * 
     * @return アクセス２_送り時間開始（分）
     */
    public String getAcSendTimeStart2Minute() {
        return acSendTimeStart2Minute;
    }

    /**
     * アクセス３_送り時間開始を取得します。
     * 
     * @return アクセス３_送り時間開始
     */
    public String getAcSendTimeStart3() {
        return DKikakuWebUtil.buildTime(getAcSendTimeStart3Hour(),
                getAcSendTimeStart3Minute());
    }

    /**
     * アクセス３_送り時間開始（時間）を取得します。
     * 
     * @return アクセス３_送り時間開始（時間）
     */
    public String getAcSendTimeStart3Hour() {
        return acSendTimeStart3Hour;
    }

    /**
     * アクセス３_送り時間開始（分）を取得します。
     * 
     * @return アクセス３_送り時間開始（分）
     */
    public String getAcSendTimeStart3Minute() {
        return acSendTimeStart3Minute;
    }

    /**
     * アクセス１_送迎シャトルバス有無を取得します。
     * 
     * @return アクセス１_送迎シャトルバス有無
     */
    public String getAcShuttleBusFlg1() {
        return acShuttleBusFlg1;
    }

    /**
     * アクセス２_送迎シャトルバス有無を取得します。
     * 
     * @return アクセス２_送迎シャトルバス有無
     */
    public String getAcShuttleBusFlg2() {
        return acShuttleBusFlg2;
    }

    /**
     * アクセス３_送迎シャトルバス有無を取得します。
     * 
     * @return アクセス３_送迎シャトルバス有無
     */
    public String getAcShuttleBusFlg3() {
        return acShuttleBusFlg3;
    }

    /**
     * アクセス１_スキー場を取得します。
     * 
     * @return アクセス１_スキー場
     */
    public String getAcSkiNm1() {
        return acSkiNm1;
    }

    /**
     * アクセス２_スキー場を取得します。
     * 
     * @return アクセス２_スキー場
     */
    public String getAcSkiNm2() {
        return acSkiNm2;
    }

    /**
     * アクセス３_スキー場を取得します。
     * 
     * @return アクセス３_スキー場
     */
    public String getAcSkiNm3() {
        return acSkiNm3;
    }

    /**
     * アクセス１_徒歩時間を取得します。
     * 
     * @return アクセス１_徒歩時間
     */
    public String getAcWalkTime1() {
        return acWalkTime1;
    }

    /**
     * アクセス２_徒歩時間を取得します。
     * 
     * @return アクセス２_徒歩時間
     */
    public String getAcWalkTime2() {
        return acWalkTime2;
    }

    /**
     * アクセス３_徒歩時間を取得します。
     * 
     * @return アクセス３_徒歩時間
     */
    public String getAcWalkTime3() {
        return acWalkTime3;
    }

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
     * アクセス１_車時間を設定します。
     * 
     * @param acCarTime1
     *            アクセス１_車時間
     */
    public void setAcCarTime1(String acCarTime1) {
        this.acCarTime1 = acCarTime1;
    }

    /**
     * アクセス２_車時間を設定します。
     * 
     * @param acCarTime2
     *            アクセス２_車時間
     */
    public void setAcCarTime2(String acCarTime2) {
        this.acCarTime2 = acCarTime2;
    }

    /**
     * アクセス３_車時間を設定します。
     * 
     * @param acCarTime3
     *            アクセス３_車時間
     */
    public void setAcCarTime3(String acCarTime3) {
        this.acCarTime3 = acCarTime3;
    }

    /**
     * アクセス１_迎え時間終了を設定します。
     * 
     * @param acMeetTimeEnd1
     *            アクセス１_迎え時間終了
     */
    public void setAcMeetTimeEnd1(String acMeetTimeEnd1) {
        setAcMeetTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(acMeetTimeEnd1));
        setAcMeetTimeEnd1Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeEnd1));
    }

    /**
     * アクセス１_迎え時間終了（時間）を設定します。
     * 
     * @param acMeetTimeEnd1Hour
     *            アクセス１_迎え時間終了（時間）
     */
    public void setAcMeetTimeEnd1Hour(String acMeetTimeEnd1Hour) {
        this.acMeetTimeEnd1Hour = acMeetTimeEnd1Hour;
    }

    /**
     * アクセス１_迎え時間終了（分）を設定します。
     * 
     * @param acMeetTimeEnd1Minute
     *            アクセス１_迎え時間終了（分）
     */
    public void setAcMeetTimeEnd1Minute(String acMeetTimeEnd1Minute) {
        this.acMeetTimeEnd1Minute = acMeetTimeEnd1Minute;
    }

    /**
     * アクセス２_迎え時間終了を設定します。
     * 
     * @param acMeetTimeEnd2
     *            アクセス２_迎え時間終了
     */
    public void setAcMeetTimeEnd2(String acMeetTimeEnd2) {
        setAcMeetTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(acMeetTimeEnd2));
        setAcMeetTimeEnd2Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeEnd2));
    }

    /**
     * アクセス２_迎え時間終了（時間）を設定します。
     * 
     * @param acMeetTimeEnd2Hour
     *            アクセス２_迎え時間終了（時間）
     */
    public void setAcMeetTimeEnd2Hour(String acMeetTimeEnd2Hour) {
        this.acMeetTimeEnd2Hour = acMeetTimeEnd2Hour;
    }

    /**
     * アクセス２_迎え時間終了（分）を設定します。
     * 
     * @param acMeetTimeEnd2Minute
     *            アクセス２_迎え時間終了（分）
     */
    public void setAcMeetTimeEnd2Minute(String acMeetTimeEnd2Minute) {
        this.acMeetTimeEnd2Minute = acMeetTimeEnd2Minute;
    }

    /**
     * アクセス３_迎え時間終了を設定します。
     * 
     * @param acMeetTimeEnd3
     *            アクセス３_迎え時間終了
     */
    public void setAcMeetTimeEnd3(String acMeetTimeEnd3) {
        setAcMeetTimeEnd3Hour(DKikakuWebUtil.getHourFormTime(acMeetTimeEnd3));
        setAcMeetTimeEnd3Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeEnd3));
    }

    /**
     * アクセス３_迎え時間終了（時間）を設定します。
     * 
     * @param acMeetTimeEnd3Hour
     *            アクセス３_迎え時間終了（時間）
     */
    public void setAcMeetTimeEnd3Hour(String acMeetTimeEnd3Hour) {
        this.acMeetTimeEnd3Hour = acMeetTimeEnd3Hour;
    }

    /**
     * アクセス３_迎え時間終了（分）を設定します。
     * 
     * @param acMeetTimeEnd3Minute
     *            アクセス３_迎え時間終了（分）
     */
    public void setAcMeetTimeEnd3Minute(String acMeetTimeEnd3Minute) {
        this.acMeetTimeEnd3Minute = acMeetTimeEnd3Minute;
    }

    /**
     * アクセス１_迎え時間有無を設定します。
     * 
     * @param acMeetTimeFlg1
     *            アクセス１_迎え時間有無
     */
    public void setAcMeetTimeFlg1(String acMeetTimeFlg1) {
        this.acMeetTimeFlg1 = acMeetTimeFlg1;
    }

    /**
     * アクセス２_迎え時間有無を設定します。
     * 
     * @param acMeetTimeFlg2
     *            アクセス２_迎え時間有無
     */
    public void setAcMeetTimeFlg2(String acMeetTimeFlg2) {
        this.acMeetTimeFlg2 = acMeetTimeFlg2;
    }

    /**
     * アクセス３_迎え時間有無を設定します。
     * 
     * @param acMeetTimeFlg3
     *            アクセス３_迎え時間有無
     */
    public void setAcMeetTimeFlg3(String acMeetTimeFlg3) {
        this.acMeetTimeFlg3 = acMeetTimeFlg3;
    }

    /**
     * アクセス１_迎え時間開始を設定します。
     * 
     * @param acMeetTimeStart1
     *            アクセス１_迎え時間開始
     */
    public void setAcMeetTimeStart1(String acMeetTimeStart1) {
        setAcMeetTimeStart1Hour(DKikakuWebUtil
                .getHourFormTime(acMeetTimeStart1));
        setAcMeetTimeStart1Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeStart1));
    }

    /**
     * アクセス１_迎え時間開始（時間）を設定します。
     * 
     * @param acMeetTimeStart1Hour
     *            アクセス１_迎え時間開始（時間）
     */
    public void setAcMeetTimeStart1Hour(String acMeetTimeStart1Hour) {
        this.acMeetTimeStart1Hour = acMeetTimeStart1Hour;
    }

    /**
     * アクセス１_迎え時間開始（分）を設定します。
     * 
     * @param acMeetTimeStart1Minute
     *            アクセス１_迎え時間開始（分）
     */
    public void setAcMeetTimeStart1Minute(String acMeetTimeStart1Minute) {
        this.acMeetTimeStart1Minute = acMeetTimeStart1Minute;
    }

    /**
     * アクセス２_迎え時間開始を設定します。
     * 
     * @param acMeetTimeStart2
     *            アクセス２_迎え時間開始
     */
    public void setAcMeetTimeStart2(String acMeetTimeStart2) {
        setAcMeetTimeStart2Hour(DKikakuWebUtil
                .getHourFormTime(acMeetTimeStart2));
        setAcMeetTimeStart2Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeStart2));
    }

    /**
     * アクセス２_迎え時間開始（時間）を設定します。
     * 
     * @param acMeetTimeStart2Hour
     *            アクセス２_迎え時間開始（時間）
     */
    public void setAcMeetTimeStart2Hour(String acMeetTimeStart2Hour) {
        this.acMeetTimeStart2Hour = acMeetTimeStart2Hour;
    }

    /**
     * アクセス２_迎え時間開始（分）を設定します。
     * 
     * @param acMeetTimeStart2Minute
     *            アクセス２_迎え時間開始（分）
     */
    public void setAcMeetTimeStart2Minute(String acMeetTimeStart2Minute) {
        this.acMeetTimeStart2Minute = acMeetTimeStart2Minute;
    }

    /**
     * アクセス３_迎え時間開始を設定します。
     * 
     * @param acMeetTimeStart3
     *            アクセス３_迎え時間開始
     */
    public void setAcMeetTimeStart3(String acMeetTimeStart3) {
        setAcMeetTimeStart3Hour(DKikakuWebUtil
                .getHourFormTime(acMeetTimeStart3));
        setAcMeetTimeStart3Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeStart3));
    }

    /**
     * アクセス３_迎え時間開始（時間）を設定します。
     * 
     * @param acMeetTimeStart3Hour
     *            アクセス３_迎え時間開始（時間）
     */
    public void setAcMeetTimeStart3Hour(String acMeetTimeStart3Hour) {
        this.acMeetTimeStart3Hour = acMeetTimeStart3Hour;
    }

    /**
     * アクセス３_迎え時間開始（分）を設定します。
     * 
     * @param acMeetTimeStart3Minute
     *            アクセス３_迎え時間開始（分）
     */
    public void setAcMeetTimeStart3Minute(String acMeetTimeStart3Minute) {
        this.acMeetTimeStart3Minute = acMeetTimeStart3Minute;
    }

    /**
     * アクセス１_送迎区分を設定します。
     * 
     * @param acMsDiv1
     *            アクセス１_送迎区分
     */
    public void setAcMsDiv1(String acMsDiv1) {
        this.acMsDiv1 = acMsDiv1;
    }

    /**
     * アクセス２_送迎区分を設定します。
     * 
     * @param acMsDiv2
     *            アクセス２_送迎区分
     */
    public void setAcMsDiv2(String acMsDiv2) {
        this.acMsDiv2 = acMsDiv2;
    }

    /**
     * アクセス３_送迎区分を設定します。
     * 
     * @param acMsDiv3
     *            アクセス３_送迎区分
     */
    public void setAcMsDiv3(String acMsDiv3) {
        this.acMsDiv3 = acMsDiv3;
    }

    /**
     * アクセス１_送迎予約を設定します。
     * 
     * @param acMsReserve1
     *            アクセス１_送迎予約
     */
    public void setAcMsReserve1(String acMsReserve1) {
        this.acMsReserve1 = acMsReserve1;
    }

    /**
     * アクセス２_送迎予約を設定します。
     * 
     * @param acMsReserve2
     *            アクセス２_送迎予約
     */
    public void setAcMsReserve2(String acMsReserve2) {
        this.acMsReserve2 = acMsReserve2;
    }

    /**
     * アクセス３_送迎予約を設定します。
     * 
     * @param acMsReserve3
     *            アクセス３_送迎予約
     */
    public void setAcMsReserve3(String acMsReserve3) {
        this.acMsReserve3 = acMsReserve3;
    }

    /**
     * アクセス１_送迎予約その他を設定します。
     * 
     * @param acMsReserveCmt1
     *            アクセス１_送迎予約その他
     */
    public void setAcMsReserveCmt1(String acMsReserveCmt1) {
        this.acMsReserveCmt1 = acMsReserveCmt1;
    }

    /**
     * アクセス２_送迎予約その他を設定します。
     * 
     * @param acMsReserveCmt2
     *            アクセス２_送迎予約その他
     */
    public void setAcMsReserveCmt2(String acMsReserveCmt2) {
        this.acMsReserveCmt2 = acMsReserveCmt2;
    }

    /**
     * アクセス３_送迎予約その他を設定します。
     * 
     * @param acMsReserveCmt3
     *            アクセス３_送迎予約その他
     */
    public void setAcMsReserveCmt3(String acMsReserveCmt3) {
        this.acMsReserveCmt3 = acMsReserveCmt3;
    }

    /**
     * アクセス１_その他コメントを設定します。
     * 
     * @param acOthersCmt1
     *            アクセス１_その他コメント
     */
    public void setAcOthersCmt1(String acOthersCmt1) {
        this.acOthersCmt1 = acOthersCmt1;
    }

    /**
     * アクセス２_その他コメントを設定します。
     * 
     * @param acOthersCmt2
     *            アクセス２_その他コメント
     */
    public void setAcOthersCmt2(String acOthersCmt2) {
        this.acOthersCmt2 = acOthersCmt2;
    }

    /**
     * アクセス３_その他コメントを設定します。
     * 
     * @param acOthersCmt3
     *            アクセス３_その他コメント
     */
    public void setAcOthersCmt3(String acOthersCmt3) {
        this.acOthersCmt3 = acOthersCmt3;
    }

    /**
     * アクセス１_その他有無を設定します。
     * 
     * @param acOthersFlg1
     *            アクセス１_その他有無
     */
    public void setAcOthersFlg1(String acOthersFlg1) {
        this.acOthersFlg1 = acOthersFlg1;
    }

    /**
     * アクセス２_その他有無を設定します。
     * 
     * @param acOthersFlg2
     *            アクセス２_その他有無
     */
    public void setAcOthersFlg2(String acOthersFlg2) {
        this.acOthersFlg2 = acOthersFlg2;
    }

    /**
     * アクセス３_その他有無を設定します。
     * 
     * @param acOthersFlg3
     *            アクセス３_その他有無
     */
    public void setAcOthersFlg3(String acOthersFlg3) {
        this.acOthersFlg3 = acOthersFlg3;
    }

    /**
     * アクセス１_その他を設定します。
     * 
     * @param acOtherTimeCmt1
     *            アクセス１_その他
     */
    public void setAcOtherTimeCmt1(String acOtherTimeCmt1) {
        this.acOtherTimeCmt1 = acOtherTimeCmt1;
    }

    /**
     * アクセス２_その他を設定します。
     * 
     * @param acOtherTimeCmt2
     *            アクセス２_その他
     */
    public void setAcOtherTimeCmt2(String acOtherTimeCmt2) {
        this.acOtherTimeCmt2 = acOtherTimeCmt2;
    }

    /**
     * アクセス３_その他を設定します。
     * 
     * @param acOtherTimeCmt3
     *            アクセス３_その他
     */
    public void setAcOtherTimeCmt3(String acOtherTimeCmt3) {
        this.acOtherTimeCmt3 = acOtherTimeCmt3;
    }

    /**
     * アクセス１_送り時間終了を設定します。
     * 
     * @param acSendTimeEnd1
     *            アクセス１_送り時間終了
     */
    public void setAcSendTimeEnd1(String acSendTimeEnd1) {
        setAcSendTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(acSendTimeEnd1));
        setAcSendTimeEnd1Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeEnd1));
    }

    /**
     * アクセス１_送り時間終了（時間）を設定します。
     * 
     * @param acSendTimeEnd1Hour
     *            アクセス１_送り時間終了（時間）
     */
    public void setAcSendTimeEnd1Hour(String acSendTimeEnd1Hour) {
        this.acSendTimeEnd1Hour = acSendTimeEnd1Hour;
    }

    /**
     * アクセス１_送り時間終了（分）を設定します。
     * 
     * @param acSendTimeEnd1Minute
     *            アクセス１_送り時間終了（分）
     */
    public void setAcSendTimeEnd1Minute(String acSendTimeEnd1Minute) {
        this.acSendTimeEnd1Minute = acSendTimeEnd1Minute;
    }

    /**
     * アクセス２_送り時間終了を設定します。
     * 
     * @param acSendTimeEnd2
     *            アクセス２_送り時間終了
     */
    public void setAcSendTimeEnd2(String acSendTimeEnd2) {
        setAcSendTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(acSendTimeEnd2));
        setAcSendTimeEnd2Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeEnd2));
    }

    /**
     * アクセス２_送り時間終了（時間）を設定します。
     * 
     * @param acSendTimeEnd2Hour
     *            アクセス２_送り時間終了（時間）
     */
    public void setAcSendTimeEnd2Hour(String acSendTimeEnd2Hour) {
        this.acSendTimeEnd2Hour = acSendTimeEnd2Hour;
    }

    /**
     * アクセス２_送り時間終了（分）を設定します。
     * 
     * @param acSendTimeEnd2Minute
     *            アクセス２_送り時間終了（分）
     */
    public void setAcSendTimeEnd2Minute(String acSendTimeEnd2Minute) {
        this.acSendTimeEnd2Minute = acSendTimeEnd2Minute;
    }

    /**
     * アクセス３_送り時間終了を設定します。
     * 
     * @param acSendTimeEnd3
     *            アクセス３_送り時間終了
     */
    public void setAcSendTimeEnd3(String acSendTimeEnd3) {
        setAcSendTimeEnd3Hour(DKikakuWebUtil.getHourFormTime(acSendTimeEnd3));
        setAcSendTimeEnd3Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeEnd3));
    }

    /**
     * アクセス３_送り時間終了（時間）を設定します。
     * 
     * @param acSendTimeEnd3Hour
     *            アクセス３_送り時間終了（時間）
     */
    public void setAcSendTimeEnd3Hour(String acSendTimeEnd3Hour) {
        this.acSendTimeEnd3Hour = acSendTimeEnd3Hour;
    }

    /**
     * アクセス３_送り時間終了（分）を設定します。
     * 
     * @param acSendTimeEnd3Minute
     *            アクセス３_送り時間終了（分）
     */
    public void setAcSendTimeEnd3Minute(String acSendTimeEnd3Minute) {
        this.acSendTimeEnd3Minute = acSendTimeEnd3Minute;
    }

    /**
     * アクセス１_送り時間有無を設定します。
     * 
     * @param acSendTimeFlg1
     *            アクセス１_送り時間有無
     */
    public void setAcSendTimeFlg1(String acSendTimeFlg1) {
        this.acSendTimeFlg1 = acSendTimeFlg1;
    }

    /**
     * アクセス２_送り時間有無を設定します。
     * 
     * @param acSendTimeFlg2
     *            アクセス２_送り時間有無
     */
    public void setAcSendTimeFlg2(String acSendTimeFlg2) {
        this.acSendTimeFlg2 = acSendTimeFlg2;
    }

    /**
     * アクセス３_送り時間有無を設定します。
     * 
     * @param acSendTimeFlg3
     *            アクセス３_送り時間有無
     */
    public void setAcSendTimeFlg3(String acSendTimeFlg3) {
        this.acSendTimeFlg3 = acSendTimeFlg3;
    }

    /**
     * アクセス１_送り時間開始を設定します。
     * 
     * @param acSendTimeStart1
     *            アクセス１_送り時間開始
     */
    public void setAcSendTimeStart1(String acSendTimeStart1) {
        setAcSendTimeStart1Hour(DKikakuWebUtil
                .getHourFormTime(acSendTimeStart1));
        setAcSendTimeStart1Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeStart1));
    }

    /**
     * アクセス１_送り時間開始（時間）を設定します。
     * 
     * @param acSendTimeStart1Hour
     *            アクセス１_送り時間開始（時間）
     */
    public void setAcSendTimeStart1Hour(String acSendTimeStart1Hour) {
        this.acSendTimeStart1Hour = acSendTimeStart1Hour;
    }

    /**
     * アクセス１_送り時間開始（分）を設定します。
     * 
     * @param acSendTimeStart1Minute
     *            アクセス１_送り時間開始（分）
     */
    public void setAcSendTimeStart1Minute(String acSendTimeStart1Minute) {
        this.acSendTimeStart1Minute = acSendTimeStart1Minute;
    }

    /**
     * アクセス２_送り時間開始を設定します。
     * 
     * @param acSendTimeStart2
     *            アクセス２_送り時間開始
     */
    public void setAcSendTimeStart2(String acSendTimeStart2) {
        setAcSendTimeStart2Hour(DKikakuWebUtil
                .getHourFormTime(acSendTimeStart2));
        setAcSendTimeStart2Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeStart2));
    }

    /**
     * アクセス２_送り時間開始（時間）を設定します。
     * 
     * @param acSendTimeStart2Hour
     *            アクセス２_送り時間開始（時間）
     */
    public void setAcSendTimeStart2Hour(String acSendTimeStart2Hour) {
        this.acSendTimeStart2Hour = acSendTimeStart2Hour;
    }

    /**
     * アクセス２_送り時間開始（分）を設定します。
     * 
     * @param acSendTimeStart2Minute
     *            アクセス２_送り時間開始（分）
     */
    public void setAcSendTimeStart2Minute(String acSendTimeStart2Minute) {
        this.acSendTimeStart2Minute = acSendTimeStart2Minute;
    }

    /**
     * アクセス３_送り時間開始を設定します。
     * 
     * @param acSendTimeStart3
     *            アクセス３_送り時間開始
     */
    public void setAcSendTimeStart3(String acSendTimeStart3) {
        setAcSendTimeStart3Hour(DKikakuWebUtil
                .getHourFormTime(acSendTimeStart3));
        setAcSendTimeStart3Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeStart3));
    }

    /**
     * アクセス３_送り時間開始（時間）を設定します。
     * 
     * @param acSendTimeStart3Hour
     *            アクセス３_送り時間開始（時間）
     */
    public void setAcSendTimeStart3Hour(String acSendTimeStart3Hour) {
        this.acSendTimeStart3Hour = acSendTimeStart3Hour;
    }

    /**
     * アクセス３_送り時間開始（分）を設定します。
     * 
     * @param acSendTimeStart3Minute
     *            アクセス３_送り時間開始（分）
     */
    public void setAcSendTimeStart3Minute(String acSendTimeStart3Minute) {
        this.acSendTimeStart3Minute = acSendTimeStart3Minute;
    }

    /**
     * アクセス１_送迎シャトルバス有無を設定します。
     * 
     * @param acShuttleBusFlg1
     *            アクセス１_送迎シャトルバス有無
     */
    public void setAcShuttleBusFlg1(String acShuttleBusFlg1) {
        this.acShuttleBusFlg1 = acShuttleBusFlg1;
    }

    /**
     * アクセス２_送迎シャトルバス有無を設定します。
     * 
     * @param acShuttleBusFlg2
     *            アクセス２_送迎シャトルバス有無
     */
    public void setAcShuttleBusFlg2(String acShuttleBusFlg2) {
        this.acShuttleBusFlg2 = acShuttleBusFlg2;
    }

    /**
     * アクセス３_送迎シャトルバス有無を設定します。
     * 
     * @param acShuttleBusFlg3
     *            アクセス３_送迎シャトルバス有無
     */
    public void setAcShuttleBusFlg3(String acShuttleBusFlg3) {
        this.acShuttleBusFlg3 = acShuttleBusFlg3;
    }

    /**
     * アクセス１_スキー場を設定します。
     * 
     * @param acSkiNm1
     *            アクセス１_スキー場
     */
    public void setAcSkiNm1(String acSkiNm1) {
        this.acSkiNm1 = acSkiNm1;
    }

    /**
     * アクセス２_スキー場を設定します。
     * 
     * @param acSkiNm2
     *            アクセス２_スキー場
     */
    public void setAcSkiNm2(String acSkiNm2) {
        this.acSkiNm2 = acSkiNm2;
    }

    /**
     * アクセス３_スキー場を設定します。
     * 
     * @param acSkiNm3
     *            アクセス３_スキー場
     */
    public void setAcSkiNm3(String acSkiNm3) {
        this.acSkiNm3 = acSkiNm3;
    }

    /**
     * アクセス１_徒歩時間を設定します。
     * 
     * @param acWalkTime1
     *            アクセス１_徒歩時間
     */
    public void setAcWalkTime1(String acWalkTime1) {
        this.acWalkTime1 = acWalkTime1;
    }

    /**
     * アクセス２_徒歩時間を設定します。
     * 
     * @param acWalkTime2
     *            アクセス２_徒歩時間
     */
    public void setAcWalkTime2(String acWalkTime2) {
        this.acWalkTime2 = acWalkTime2;
    }

    /**
     * アクセス３_徒歩時間を設定します。
     * 
     * @param acWalkTime3
     *            アクセス３_徒歩時間
     */
    public void setAcWalkTime3(String acWalkTime3) {
        this.acWalkTime3 = acWalkTime3;
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

}
