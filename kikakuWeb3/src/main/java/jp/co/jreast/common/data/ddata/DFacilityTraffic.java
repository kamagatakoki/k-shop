package jp.co.jreast.common.data.ddata; // SUPPRESS CHECKSTYLE (列数が多いため行数削減不可)

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]施設_交通手段 エンティティ
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
public class DFacilityTraffic implements FacilityManageBodyKey {

    /** 車利用高速道路IC1 */
    private String accessIc1;

    /** 車利用時間1 */
    private String accessTime1;

    /** タクシー料金年度1 */
    private String annualTaxiFee1;

    /** タクシー料金年度2 */
    private String annualTaxiFee2;

    /** 車利用自動車道1 */
    private String autoRoadway1;

    /** 車利用距離1 */
    private String availableDistance1;

    /** バス行き先1 */
    private String busDestination1;

    /** バス行き先2 */
    private String busDestination2;

    /** バス停名1 */
    private String busStation1;

    /** バス停名2 */
    private String busStation2;

    /** バス利用時間1 */
    private String busTimetable1;

    /** バス利用時間2 */
    private String busTimetable2;

    /** 車利用方面1 */
    private String carDirection1;

    /** 車利用目標物1 */
    private String carTarget1;

    /** 駅到着要連絡有無1 */
    private String contactFlg1;

    /** 駅到着要連絡有無2 */
    private String contactFlg2;

    /** 車利用県道1 */
    private String countyRoadway1;

    /** 出口情報1 */
    private String exitInfo1;

    /** 出口情報2 */
    private String exitInfo2;

    /** 施設コード */
    private String facilityCd;

    /** 施設パターン */
    private String facilityPattern;

    /** 車利用普通道路1 */
    private String genreralRoadway1;

    /** 車利用高速道路1 */
    private String highway1;

    /** 回答書種別 */
    private String kindFlg;

    /** 迎え可能時間開始1（時間） */
    private String meetTimeBegin1Hour;

    /** 迎え可能時間開始1（分） */
    private String meetTimeBegin1Minute;

    /** 迎え可能時間開始2（時間） */
    private String meetTimeBegin2Hour;

    /** 迎え可能時間開始2（分） */
    private String meetTimeBegin2Minute;

    /** 迎え可能時間終了1（時間） */
    private String meetTimeEnd1Hour;

    /** 迎え可能時間終了1（分） */
    private String meetTimeEnd1Minute;

    /** 迎え可能時間終了2（時間） */
    private String meetTimeEnd2Hour;

    /** 迎え可能時間終了2（分） */
    private String meetTimeEnd2Minute;

    /** 迎え可能時間有無1 */
    private String meetTimeFlg1;

    /** 迎え可能時間有無2 */
    private String meetTimeFlg2;

    /** タクシー料金月1 */
    private String monthlyTaxiFee1;

    /** タクシー料金月2 */
    private String monthlyTaxiFee2;

    /** 送迎バス1 */
    private String msBus1;

    /** 送迎バス2 */
    private String msBus2;

    /** 送迎バス有無1 */
    private String msBusFlg1;

    /** 送迎バス有無2 */
    private String msBusFlg2;

    /** 送迎区分1 */
    private String msDiv1;

    /** 送迎区分2 */
    private String msDiv2;

    /** 送迎有無1 */
    private String msFlg1;

    /** 送迎有無2 */
    private String msFlg2;

    /** 送迎駅1 */
    private String msStation1;

    /** 送迎駅2 */
    private String msStation2;

    /** 送迎駅有無1 */
    private String msStationFlg1;

    /** 送迎駅有無2 */
    private String msStationFlg2;

    /** 車利用国道1 */
    private String nationalRoadway1;

    /** ＪＲ・私鉄最寄駅1 */
    private String nearestStation1;

    /** ＪＲ・私鉄最寄駅2 */
    private String nearestStation2;

    /** 私鉄最寄JR駅1 */
    private String nearestStationPrivate1;

    /** 私鉄最寄JR駅2 */
    private String nearestStationPrivate2;

    /** 予約不要有無1 */
    private String noReserveFlg1;

    /** 予約不要有無2 */
    private String noReserveFlg2;

    /** 私鉄会社名路線名1 */
    private String privateLineNm1;

    /** 私鉄会社名路線名2 */
    private String privateLineNm2;

    /** 要予約コメント1 */
    private String reserveCmt1;

    /** 要予約コメント2 */
    private String reserveCmt2;

    /** 要予約区分1 */
    private String reserveDiv1;

    /** 要予約区分2 */
    private String reserveDiv2;

    /** 要予約有無1 */
    private String reserveFlg1;

    /** 要予約有無2 */
    private String reserveFlg2;

    /** 送り可能時間開始1（時間） */
    private String sendTimeBegin1Hour;

    /** 送り可能時間開始1（分） */
    private String sendTimeBegin1Minute;

    /** 送り可能時間開始2（時間） */
    private String sendTimeBegin2Hour;

    /** 送り可能時間開始2（分） */
    private String sendTimeBegin2Minute;

    /** 送り可能時間終了1（時間） */
    private String sendTimeEnd1Hour;

    /** 送り可能時間終了1（分） */
    private String sendTimeEnd1Minute;

    /** 送り可能時間終了2（時間） */
    private String sendTimeEnd2Hour;

    /** 送り可能時間終了2（分） */
    private String sendTimeEnd2Minute;

    /** 送り可能時間有無1 */
    private String sendTimeFlg1;

    /** 送り可能時間有無2 */
    private String sendTimeFlg2;

    /** 送迎シャトルバス有無1 */
    private String shuttleBusFlg1;

    /** 送迎シャトルバス有無2 */
    private String shuttleBusFlg2;

    /** シャトルバス運行時刻_迎え1 */
    private String shuttleBusMeet1;

    /** シャトルバス運行時刻_迎え2 */
    private String shuttleBusMeet2;

    /** シャトルバス備考1 */
    private String shuttleBusMemo1;

    /** シャトルバス備考2 */
    private String shuttleBusMemo2;

    /** シャトルバス運行時刻_送り1 */
    private String shuttleBusSend1;

    /** シャトルバス運行時刻_送り2 */
    private String shuttleBusSend2;

    /** 送迎シャトルバス（最寄駅発）1 */
    private String shuttleBusStation1;

    /** 送迎シャトルバス（最寄駅発）2 */
    private String shuttleBusStation2;

    /** シャトルバス運行時刻_備考1 */
    private String shuttleBusTimeMemo1;

    /** シャトルバス運行時刻_備考2 */
    private String shuttleBusTimeMemo2;

    /** ＪＲ・私鉄区分1 */
    private String stationDiv1;

    /** ＪＲ・私鉄区分2 */
    private String stationDiv2;

    /** タクシー利用料金1 */
    private String taxiFee1;

    /** タクシー利用料金2 */
    private String taxiFee2;

    /** タクシー時間1 */
    private String taxiTime1;

    /** タクシー時間2 */
    private String taxiTime2;

    /** バス停より徒歩時間1 */
    private String toBusStaTime1;

    /** バス停より徒歩時間2 */
    private String toBusStaTime2;

    /** 駅より徒歩時間1 */
    private String toStationWalktime1;

    /** 駅より徒歩時間2 */
    private String toStationWalktime2;

    /** 交通手段有無 */
    private String trafficFlg;

    /**
     * 車利用高速道路IC1を取得します。
     * 
     * @return 車利用高速道路IC1
     */
    public String getAccessIc1() {
        return accessIc1;
    }

    /**
     * 車利用時間1を取得します。
     * 
     * @return 車利用時間1
     */
    public String getAccessTime1() {
        return accessTime1;
    }

    /**
     * タクシー料金年度1を取得します。
     * 
     * @return タクシー料金年度1
     */
    public String getAnnualTaxiFee1() {
        return annualTaxiFee1;
    }

    /**
     * タクシー料金年度2を取得します。
     * 
     * @return タクシー料金年度2
     */
    public String getAnnualTaxiFee2() {
        return annualTaxiFee2;
    }

    /**
     * 車利用自動車道1を取得します。
     * 
     * @return 車利用自動車道1
     */
    public String getAutoRoadway1() {
        return autoRoadway1;
    }

    /**
     * 車利用距離1を取得します。
     * 
     * @return 車利用距離1
     */
    public String getAvailableDistance1() {
        return availableDistance1;
    }

    /**
     * バス行き先1を取得します。
     * 
     * @return バス行き先1
     */
    public String getBusDestination1() {
        return busDestination1;
    }

    /**
     * バス行き先2を取得します。
     * 
     * @return バス行き先2
     */
    public String getBusDestination2() {
        return busDestination2;
    }

    /**
     * バス停名1を取得します。
     * 
     * @return バス停名1
     */
    public String getBusStation1() {
        return busStation1;
    }

    /**
     * バス停名2を取得します。
     * 
     * @return バス停名2
     */
    public String getBusStation2() {
        return busStation2;
    }

    /**
     * バス利用時間1を取得します。
     * 
     * @return バス利用時間1
     */
    public String getBusTimetable1() {
        return busTimetable1;
    }

    /**
     * バス利用時間2を取得します。
     * 
     * @return バス利用時間2
     */
    public String getBusTimetable2() {
        return busTimetable2;
    }

    /**
     * 車利用方面1を取得します。
     * 
     * @return 車利用方面1
     */
    public String getCarDirection1() {
        return carDirection1;
    }

    /**
     * 車利用目標物1を取得します。
     * 
     * @return 車利用目標物1
     */
    public String getCarTarget1() {
        return carTarget1;
    }

    /**
     * 駅到着要連絡有無1を取得します。
     * 
     * @return 駅到着要連絡有無1
     */
    public String getContactFlg1() {
        return contactFlg1;
    }

    /**
     * 駅到着要連絡有無2を取得します。
     * 
     * @return 駅到着要連絡有無2
     */
    public String getContactFlg2() {
        return contactFlg2;
    }

    /**
     * 車利用県道1を取得します。
     * 
     * @return 車利用県道1
     */
    public String getCountyRoadway1() {
        return countyRoadway1;
    }

    /**
     * 出口情報1を取得します。
     * 
     * @return 出口情報1
     */
    public String getExitInfo1() {
        return exitInfo1;
    }

    /**
     * 出口情報2を取得します。
     * 
     * @return 出口情報2
     */
    public String getExitInfo2() {
        return exitInfo2;
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
     * 車利用普通道路1を取得します。
     * 
     * @return 車利用普通道路1
     */
    public String getGenreralRoadway1() {
        return genreralRoadway1;
    }

    /**
     * 車利用高速道路1を取得します。
     * 
     * @return 車利用高速道路1
     */
    public String getHighway1() {
        return highway1;
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
     * 迎え可能時間開始1を取得します。
     * 
     * @return 迎え可能時間開始1
     */
    public String getMeetTimeBegin1() {
        return DKikakuWebUtil.buildTime(getMeetTimeBegin1Hour(),
                getMeetTimeBegin1Minute());
    }

    /**
     * 迎え可能時間開始1（時間）を取得します。
     * 
     * @return 迎え可能時間開始1（時間）
     */
    public String getMeetTimeBegin1Hour() {
        return meetTimeBegin1Hour;
    }

    /**
     * 迎え可能時間開始1（分）を取得します。
     * 
     * @return 迎え可能時間開始1（分）
     */
    public String getMeetTimeBegin1Minute() {
        return meetTimeBegin1Minute;
    }

    /**
     * 迎え可能時間開始2を取得します。
     * 
     * @return 迎え可能時間開始2
     */
    public String getMeetTimeBegin2() {
        return DKikakuWebUtil.buildTime(getMeetTimeBegin2Hour(),
                getMeetTimeBegin2Minute());
    }

    /**
     * 迎え可能時間開始2（時間）を取得します。
     * 
     * @return 迎え可能時間開始2（時間）
     */
    public String getMeetTimeBegin2Hour() {
        return meetTimeBegin2Hour;
    }

    /**
     * 迎え可能時間開始2（分）を取得します。
     * 
     * @return 迎え可能時間開始2（分）
     */
    public String getMeetTimeBegin2Minute() {
        return meetTimeBegin2Minute;
    }

    /**
     * 迎え可能時間終了1を取得します。
     * 
     * @return 迎え可能時間終了1
     */
    public String getMeetTimeEnd1() {
        return DKikakuWebUtil.buildTime(getMeetTimeEnd1Hour(),
                getMeetTimeEnd1Minute());
    }

    /**
     * 迎え可能時間終了1（時間）を取得します。
     * 
     * @return 迎え可能時間終了1（時間）
     */
    public String getMeetTimeEnd1Hour() {
        return meetTimeEnd1Hour;
    }

    /**
     * 迎え可能時間終了1（分）を取得します。
     * 
     * @return 迎え可能時間終了1（分）
     */
    public String getMeetTimeEnd1Minute() {
        return meetTimeEnd1Minute;
    }

    /**
     * 迎え可能時間終了2を取得します。
     * 
     * @return 迎え可能時間終了2
     */
    public String getMeetTimeEnd2() {
        return DKikakuWebUtil.buildTime(getMeetTimeEnd2Hour(),
                getMeetTimeEnd2Minute());
    }

    /**
     * 迎え可能時間終了2（時間）を取得します。
     * 
     * @return 迎え可能時間終了2（時間）
     */
    public String getMeetTimeEnd2Hour() {
        return meetTimeEnd2Hour;
    }

    /**
     * 迎え可能時間終了2（分）を取得します。
     * 
     * @return 迎え可能時間終了2（分）
     */
    public String getMeetTimeEnd2Minute() {
        return meetTimeEnd2Minute;
    }

    /**
     * 迎え可能時間有無1を取得します。
     * 
     * @return 迎え可能時間有無1
     */
    public String getMeetTimeFlg1() {
        return meetTimeFlg1;
    }

    /**
     * 迎え可能時間有無2を取得します。
     * 
     * @return 迎え可能時間有無2
     */
    public String getMeetTimeFlg2() {
        return meetTimeFlg2;
    }

    /**
     * タクシー料金月1を取得します。
     * 
     * @return タクシー料金月1
     */
    public String getMonthlyTaxiFee1() {
        return monthlyTaxiFee1;
    }

    /**
     * タクシー料金月2を取得します。
     * 
     * @return タクシー料金月2
     */
    public String getMonthlyTaxiFee2() {
        return monthlyTaxiFee2;
    }

    /**
     * 送迎バス1を取得します。
     * 
     * @return 送迎バス1
     */
    public String getMsBus1() {
        return msBus1;
    }

    /**
     * 送迎バス2を取得します。
     * 
     * @return 送迎バス2
     */
    public String getMsBus2() {
        return msBus2;
    }

    /**
     * 送迎バス有無1を取得します。
     * 
     * @return 送迎バス有無1
     */
    public String getMsBusFlg1() {
        return msBusFlg1;
    }

    /**
     * 送迎バス有無2を取得します。
     * 
     * @return 送迎バス有無2
     */
    public String getMsBusFlg2() {
        return msBusFlg2;
    }

    /**
     * 送迎区分1を取得します。
     * 
     * @return 送迎区分1
     */
    public String getMsDiv1() {
        return msDiv1;
    }

    /**
     * 送迎区分2を取得します。
     * 
     * @return 送迎区分2
     */
    public String getMsDiv2() {
        return msDiv2;
    }

    /**
     * 送迎有無1を取得します。
     * 
     * @return 送迎有無1
     */
    public String getMsFlg1() {
        return msFlg1;
    }

    /**
     * 送迎有無2を取得します。
     * 
     * @return 送迎有無2
     */
    public String getMsFlg2() {
        return msFlg2;
    }

    /**
     * 送迎駅1を取得します。
     * 
     * @return 送迎駅1
     */
    public String getMsStation1() {
        return msStation1;
    }

    /**
     * 送迎駅2を取得します。
     * 
     * @return 送迎駅2
     */
    public String getMsStation2() {
        return msStation2;
    }

    /**
     * 送迎駅有無1を取得します。
     * 
     * @return 送迎駅有無1
     */
    public String getMsStationFlg1() {
        return msStationFlg1;
    }

    /**
     * 送迎駅有無2を取得します。
     * 
     * @return 送迎駅有無2
     */
    public String getMsStationFlg2() {
        return msStationFlg2;
    }

    /**
     * 車利用国道1を取得します。
     * 
     * @return 車利用国道1
     */
    public String getNationalRoadway1() {
        return nationalRoadway1;
    }

    /**
     * ＪＲ・私鉄最寄駅1を取得します。
     * 
     * @return ＪＲ・私鉄最寄駅1
     */
    public String getNearestStation1() {
        return nearestStation1;
    }

    /**
     * ＪＲ・私鉄最寄駅2を取得します。
     * 
     * @return ＪＲ・私鉄最寄駅2
     */
    public String getNearestStation2() {
        return nearestStation2;
    }

    /**
     * 私鉄最寄JR駅1を取得します。
     * 
     * @return 私鉄最寄JR駅1
     */
    public String getNearestStationPrivate1() {
        return nearestStationPrivate1;
    }

    /**
     * 私鉄最寄JR駅2を取得します。
     * 
     * @return 私鉄最寄JR駅2
     */
    public String getNearestStationPrivate2() {
        return nearestStationPrivate2;
    }

    /**
     * 予約不要有無1を取得します。
     * 
     * @return 予約不要有無1
     */
    public String getNoReserveFlg1() {
        return noReserveFlg1;
    }

    /**
     * 予約不要有無2を取得します。
     * 
     * @return 予約不要有無2
     */
    public String getNoReserveFlg2() {
        return noReserveFlg2;
    }

    /**
     * 私鉄会社名路線名1を取得します。
     * 
     * @return 私鉄会社名路線名1
     */
    public String getPrivateLineNm1() {
        return privateLineNm1;
    }

    /**
     * 私鉄会社名路線名2を取得します。
     * 
     * @return 私鉄会社名路線名2
     */
    public String getPrivateLineNm2() {
        return privateLineNm2;
    }

    /**
     * 要予約コメント1を取得します。
     * 
     * @return 要予約コメント1
     */
    public String getReserveCmt1() {
        return reserveCmt1;
    }

    /**
     * 要予約コメント2を取得します。
     * 
     * @return 要予約コメント2
     */
    public String getReserveCmt2() {
        return reserveCmt2;
    }

    /**
     * 要予約区分1を取得します。
     * 
     * @return 要予約区分1
     */
    public String getReserveDiv1() {
        return reserveDiv1;
    }

    /**
     * 要予約区分2を取得します。
     * 
     * @return 要予約区分2
     */
    public String getReserveDiv2() {
        return reserveDiv2;
    }

    /**
     * 要予約有無1を取得します。
     * 
     * @return 要予約有無1
     */
    public String getReserveFlg1() {
        return reserveFlg1;
    }

    /**
     * 要予約有無2を取得します。
     * 
     * @return 要予約有無2
     */
    public String getReserveFlg2() {
        return reserveFlg2;
    }

    /**
     * 送り可能時間開始1を取得します。
     * 
     * @return 送り可能時間開始1
     */
    public String getSendTimeBegin1() {
        return DKikakuWebUtil.buildTime(getSendTimeBegin1Hour(),
                getSendTimeBegin1Minute());
    }

    /**
     * 送り可能時間開始1（時間）を取得します。
     * 
     * @return 送り可能時間開始1（時間）
     */
    public String getSendTimeBegin1Hour() {
        return sendTimeBegin1Hour;
    }

    /**
     * 送り可能時間開始1（分）を取得します。
     * 
     * @return 送り可能時間開始1（分）
     */
    public String getSendTimeBegin1Minute() {
        return sendTimeBegin1Minute;
    }

    /**
     * 送り可能時間開始2を取得します。
     * 
     * @return 送り可能時間開始2
     */
    public String getSendTimeBegin2() {
        return DKikakuWebUtil.buildTime(getSendTimeBegin2Hour(),
                getSendTimeBegin2Minute());
    }

    /**
     * 送り可能時間開始2（時間）を取得します。
     * 
     * @return 送り可能時間開始2（時間）
     */
    public String getSendTimeBegin2Hour() {
        return sendTimeBegin2Hour;
    }

    /**
     * 送り可能時間開始2（分）を取得します。
     * 
     * @return 送り可能時間開始2（分）
     */
    public String getSendTimeBegin2Minute() {
        return sendTimeBegin2Minute;
    }

    /**
     * 送り可能時間終了1を取得します。
     * 
     * @return 送り可能時間終了1
     */
    public String getSendTimeEnd1() {
        return DKikakuWebUtil.buildTime(getSendTimeEnd1Hour(),
                getSendTimeEnd1Minute());
    }

    /**
     * 送り可能時間終了1（時間）を取得します。
     * 
     * @return 送り可能時間終了1（時間）
     */
    public String getSendTimeEnd1Hour() {
        return sendTimeEnd1Hour;
    }

    /**
     * 送り可能時間終了1（分）を取得します。
     * 
     * @return 送り可能時間終了1（分）
     */
    public String getSendTimeEnd1Minute() {
        return sendTimeEnd1Minute;
    }

    /**
     * 送り可能時間終了2を取得します。
     * 
     * @return 送り可能時間終了2
     */
    public String getSendTimeEnd2() {
        return DKikakuWebUtil.buildTime(getSendTimeEnd2Hour(),
                getSendTimeEnd2Minute());
    }

    /**
     * 送り可能時間終了2（時間）を取得します。
     * 
     * @return 送り可能時間終了2（時間）
     */
    public String getSendTimeEnd2Hour() {
        return sendTimeEnd2Hour;
    }

    /**
     * 送り可能時間終了2（分）を取得します。
     * 
     * @return 送り可能時間終了2（分）
     */
    public String getSendTimeEnd2Minute() {
        return sendTimeEnd2Minute;
    }

    /**
     * 送り可能時間有無1を取得します。
     * 
     * @return 送り可能時間有無1
     */
    public String getSendTimeFlg1() {
        return sendTimeFlg1;
    }

    /**
     * 送り可能時間有無2を取得します。
     * 
     * @return 送り可能時間有無2
     */
    public String getSendTimeFlg2() {
        return sendTimeFlg2;
    }

    /**
     * 送迎シャトルバス有無1を取得します。
     * 
     * @return 送迎シャトルバス有無1
     */
    public String getShuttleBusFlg1() {
        return shuttleBusFlg1;
    }

    /**
     * 送迎シャトルバス有無2を取得します。
     * 
     * @return 送迎シャトルバス有無2
     */
    public String getShuttleBusFlg2() {
        return shuttleBusFlg2;
    }

    /**
     * シャトルバス運行時刻_迎え1を取得します。
     * 
     * @return シャトルバス運行時刻_迎え1
     */
    public String getShuttleBusMeet1() {
        return shuttleBusMeet1;
    }

    /**
     * シャトルバス運行時刻_迎え2を取得します。
     * 
     * @return シャトルバス運行時刻_迎え2
     */
    public String getShuttleBusMeet2() {
        return shuttleBusMeet2;
    }

    /**
     * シャトルバス備考1を取得します。
     * 
     * @return シャトルバス備考1
     */
    public String getShuttleBusMemo1() {
        return shuttleBusMemo1;
    }

    /**
     * シャトルバス備考2を取得します。
     * 
     * @return シャトルバス備考2
     */
    public String getShuttleBusMemo2() {
        return shuttleBusMemo2;
    }

    /**
     * シャトルバス運行時刻_送り1を取得します。
     * 
     * @return シャトルバス運行時刻_送り1
     */
    public String getShuttleBusSend1() {
        return shuttleBusSend1;
    }

    /**
     * シャトルバス運行時刻_送り2を取得します。
     * 
     * @return シャトルバス運行時刻_送り2
     */
    public String getShuttleBusSend2() {
        return shuttleBusSend2;
    }

    /**
     * 送迎シャトルバス（最寄駅発）1を取得します。
     * 
     * @return 送迎シャトルバス（最寄駅発）1
     */
    public String getShuttleBusStation1() {
        return shuttleBusStation1;
    }

    /**
     * 送迎シャトルバス（最寄駅発）2を取得します。
     * 
     * @return 送迎シャトルバス（最寄駅発）2
     */
    public String getShuttleBusStation2() {
        return shuttleBusStation2;
    }

    /**
     * シャトルバス運行時刻_備考1を取得します。
     * 
     * @return シャトルバス運行時刻_備考1
     */
    public String getShuttleBusTimeMemo1() {
        return shuttleBusTimeMemo1;
    }

    /**
     * シャトルバス運行時刻_備考2を取得します。
     * 
     * @return シャトルバス運行時刻_備考2
     */
    public String getShuttleBusTimeMemo2() {
        return shuttleBusTimeMemo2;
    }

    /**
     * ＪＲ・私鉄区分1を取得します。
     * 
     * @return ＪＲ・私鉄区分1
     */
    public String getStationDiv1() {
        return stationDiv1;
    }

    /**
     * ＪＲ・私鉄区分2を取得します。
     * 
     * @return ＪＲ・私鉄区分2
     */
    public String getStationDiv2() {
        return stationDiv2;
    }

    /**
     * タクシー利用料金1を取得します。
     * 
     * @return タクシー利用料金1
     */
    public String getTaxiFee1() {
        return taxiFee1;
    }

    /**
     * タクシー利用料金2を取得します。
     * 
     * @return タクシー利用料金2
     */
    public String getTaxiFee2() {
        return taxiFee2;
    }

    /**
     * タクシー時間1を取得します。
     * 
     * @return タクシー時間1
     */
    public String getTaxiTime1() {
        return taxiTime1;
    }

    /**
     * タクシー時間2を取得します。
     * 
     * @return タクシー時間2
     */
    public String getTaxiTime2() {
        return taxiTime2;
    }

    /**
     * バス停より徒歩時間1を取得します。
     * 
     * @return バス停より徒歩時間1
     */
    public String getToBusStaTime1() {
        return toBusStaTime1;
    }

    /**
     * バス停より徒歩時間2を取得します。
     * 
     * @return バス停より徒歩時間2
     */
    public String getToBusStaTime2() {
        return toBusStaTime2;
    }

    /**
     * 駅より徒歩時間1を取得します。
     * 
     * @return 駅より徒歩時間1
     */
    public String getToStationWalktime1() {
        return toStationWalktime1;
    }

    /**
     * 駅より徒歩時間2を取得します。
     * 
     * @return 駅より徒歩時間2
     */
    public String getToStationWalktime2() {
        return toStationWalktime2;
    }

    /**
     * 交通手段有無を取得します。
     * 
     * @return 交通手段有無
     */
    public String getTrafficFlg() {
        return trafficFlg;
    }

    /**
     * 車利用高速道路IC1を設定します。
     * 
     * @param accessIc1
     *            車利用高速道路IC1
     */
    public void setAccessIc1(String accessIc1) {
        this.accessIc1 = accessIc1;
    }

    /**
     * 車利用時間1を設定します。
     * 
     * @param accessTime1
     *            車利用時間1
     */
    public void setAccessTime1(String accessTime1) {
        this.accessTime1 = accessTime1;
    }

    /**
     * タクシー料金年度1を設定します。
     * 
     * @param annualTaxiFee1
     *            タクシー料金年度1
     */
    public void setAnnualTaxiFee1(String annualTaxiFee1) {
        this.annualTaxiFee1 = annualTaxiFee1;
    }

    /**
     * タクシー料金年度2を設定します。
     * 
     * @param annualTaxiFee2
     *            タクシー料金年度2
     */
    public void setAnnualTaxiFee2(String annualTaxiFee2) {
        this.annualTaxiFee2 = annualTaxiFee2;
    }

    /**
     * 車利用自動車道1を設定します。
     * 
     * @param autoRoadway1
     *            車利用自動車道1
     */
    public void setAutoRoadway1(String autoRoadway1) {
        this.autoRoadway1 = autoRoadway1;
    }

    /**
     * 車利用距離1を設定します。
     * 
     * @param availableDistance1
     *            車利用距離1
     */
    public void setAvailableDistance1(String availableDistance1) {
        this.availableDistance1 = availableDistance1;
    }

    /**
     * バス行き先1を設定します。
     * 
     * @param busDestination1
     *            バス行き先1
     */
    public void setBusDestination1(String busDestination1) {
        this.busDestination1 = busDestination1;
    }

    /**
     * バス行き先2を設定します。
     * 
     * @param busDestination2
     *            バス行き先2
     */
    public void setBusDestination2(String busDestination2) {
        this.busDestination2 = busDestination2;
    }

    /**
     * バス停名1を設定します。
     * 
     * @param busStation1
     *            バス停名1
     */
    public void setBusStation1(String busStation1) {
        this.busStation1 = busStation1;
    }

    /**
     * バス停名2を設定します。
     * 
     * @param busStation2
     *            バス停名2
     */
    public void setBusStation2(String busStation2) {
        this.busStation2 = busStation2;
    }

    /**
     * バス利用時間1を設定します。
     * 
     * @param busTimetable1
     *            バス利用時間1
     */
    public void setBusTimetable1(String busTimetable1) {
        this.busTimetable1 = busTimetable1;
    }

    /**
     * バス利用時間2を設定します。
     * 
     * @param busTimetable2
     *            バス利用時間2
     */
    public void setBusTimetable2(String busTimetable2) {
        this.busTimetable2 = busTimetable2;
    }

    /**
     * 車利用方面1を設定します。
     * 
     * @param carDirection1
     *            車利用方面1
     */
    public void setCarDirection1(String carDirection1) {
        this.carDirection1 = carDirection1;
    }

    /**
     * 車利用目標物1を設定します。
     * 
     * @param carTarget1
     *            車利用目標物1
     */
    public void setCarTarget1(String carTarget1) {
        this.carTarget1 = carTarget1;
    }

    /**
     * 駅到着要連絡有無1を設定します。
     * 
     * @param contactFlg1
     *            駅到着要連絡有無1
     */
    public void setContactFlg1(String contactFlg1) {
        this.contactFlg1 = contactFlg1;
    }

    /**
     * 駅到着要連絡有無2を設定します。
     * 
     * @param contactFlg2
     *            駅到着要連絡有無2
     */
    public void setContactFlg2(String contactFlg2) {
        this.contactFlg2 = contactFlg2;
    }

    /**
     * 車利用県道1を設定します。
     * 
     * @param countyRoadway1
     *            車利用県道1
     */
    public void setCountyRoadway1(String countyRoadway1) {
        this.countyRoadway1 = countyRoadway1;
    }

    /**
     * 出口情報1を設定します。
     * 
     * @param exitInfo1
     *            出口情報1
     */
    public void setExitInfo1(String exitInfo1) {
        this.exitInfo1 = exitInfo1;
    }

    /**
     * 出口情報2を設定します。
     * 
     * @param exitInfo2
     *            出口情報2
     */
    public void setExitInfo2(String exitInfo2) {
        this.exitInfo2 = exitInfo2;
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
     * 車利用普通道路1を設定します。
     * 
     * @param genreralRoadway1
     *            車利用普通道路1
     */
    public void setGenreralRoadway1(String genreralRoadway1) {
        this.genreralRoadway1 = genreralRoadway1;
    }

    /**
     * 車利用高速道路1を設定します。
     * 
     * @param highway1
     *            車利用高速道路1
     */
    public void setHighway1(String highway1) {
        this.highway1 = highway1;
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
     * 迎え可能時間開始1を設定します。
     * 
     * @param meetTimeBegin1
     *            迎え可能時間開始1
     */
    public void setMeetTimeBegin1(String meetTimeBegin1) {
        setMeetTimeBegin1Hour(DKikakuWebUtil.getHourFormTime(meetTimeBegin1));
        setMeetTimeBegin1Minute(DKikakuWebUtil
                .getMinuteFromTime(meetTimeBegin1));
    }

    /**
     * 迎え可能時間開始1（時間）を設定します。
     * 
     * @param meetTimeBegin1Hour
     *            迎え可能時間開始1（時間）
     */
    public void setMeetTimeBegin1Hour(String meetTimeBegin1Hour) {
        this.meetTimeBegin1Hour = meetTimeBegin1Hour;
    }

    /**
     * 迎え可能時間開始1（分）を設定します。
     * 
     * @param meetTimeBegin1Minute
     *            迎え可能時間開始1（分）
     */
    public void setMeetTimeBegin1Minute(String meetTimeBegin1Minute) {
        this.meetTimeBegin1Minute = meetTimeBegin1Minute;
    }

    /**
     * 迎え可能時間開始2を設定します。
     * 
     * @param meetTimeBegin2
     *            迎え可能時間開始2
     */
    public void setMeetTimeBegin2(String meetTimeBegin2) {
        setMeetTimeBegin2Hour(DKikakuWebUtil.getHourFormTime(meetTimeBegin2));
        setMeetTimeBegin2Minute(DKikakuWebUtil
                .getMinuteFromTime(meetTimeBegin2));
    }

    /**
     * 迎え可能時間開始2（時間）を設定します。
     * 
     * @param meetTimeBegin2Hour
     *            迎え可能時間開始2（時間）
     */
    public void setMeetTimeBegin2Hour(String meetTimeBegin2Hour) {
        this.meetTimeBegin2Hour = meetTimeBegin2Hour;
    }

    /**
     * 迎え可能時間開始2（分）を設定します。
     * 
     * @param meetTimeBegin2Minute
     *            迎え可能時間開始2（分）
     */
    public void setMeetTimeBegin2Minute(String meetTimeBegin2Minute) {
        this.meetTimeBegin2Minute = meetTimeBegin2Minute;
    }

    /**
     * 迎え可能時間終了1を設定します。
     * 
     * @param meetTimeEnd1
     *            迎え可能時間終了1
     */
    public void setMeetTimeEnd1(String meetTimeEnd1) {
        setMeetTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(meetTimeEnd1));
        setMeetTimeEnd1Minute(DKikakuWebUtil.getMinuteFromTime(meetTimeEnd1));
    }

    /**
     * 迎え可能時間終了1（時間）を設定します。
     * 
     * @param meetTimeEnd1Hour
     *            迎え可能時間終了1（時間）
     */
    public void setMeetTimeEnd1Hour(String meetTimeEnd1Hour) {
        this.meetTimeEnd1Hour = meetTimeEnd1Hour;
    }

    /**
     * 迎え可能時間終了1（分）を設定します。
     * 
     * @param meetTimeEnd1Minute
     *            迎え可能時間終了1（分）
     */
    public void setMeetTimeEnd1Minute(String meetTimeEnd1Minute) {
        this.meetTimeEnd1Minute = meetTimeEnd1Minute;
    }

    /**
     * 迎え可能時間終了2を設定します。
     * 
     * @param meetTimeEnd2
     *            迎え可能時間終了2
     */
    public void setMeetTimeEnd2(String meetTimeEnd2) {
        setMeetTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(meetTimeEnd2));
        setMeetTimeEnd2Minute(DKikakuWebUtil.getMinuteFromTime(meetTimeEnd2));
    }

    /**
     * 迎え可能時間終了2（時間）を設定します。
     * 
     * @param meetTimeEnd2Hour
     *            迎え可能時間終了2（時間）
     */
    public void setMeetTimeEnd2Hour(String meetTimeEnd2Hour) {
        this.meetTimeEnd2Hour = meetTimeEnd2Hour;
    }

    /**
     * 迎え可能時間終了2（分）を設定します。
     * 
     * @param meetTimeEnd2Minute
     *            迎え可能時間終了2（分）
     */
    public void setMeetTimeEnd2Minute(String meetTimeEnd2Minute) {
        this.meetTimeEnd2Minute = meetTimeEnd2Minute;
    }

    /**
     * 迎え可能時間有無1を設定します。
     * 
     * @param meetTimeFlg1
     *            迎え可能時間有無1
     */
    public void setMeetTimeFlg1(String meetTimeFlg1) {
        this.meetTimeFlg1 = meetTimeFlg1;
    }

    /**
     * 迎え可能時間有無2を設定します。
     * 
     * @param meetTimeFlg2
     *            迎え可能時間有無2
     */
    public void setMeetTimeFlg2(String meetTimeFlg2) {
        this.meetTimeFlg2 = meetTimeFlg2;
    }

    /**
     * タクシー料金月1を設定します。
     * 
     * @param monthlyTaxiFee1
     *            タクシー料金月1
     */
    public void setMonthlyTaxiFee1(String monthlyTaxiFee1) {
        this.monthlyTaxiFee1 = monthlyTaxiFee1;
    }

    /**
     * タクシー料金月2を設定します。
     * 
     * @param monthlyTaxiFee2
     *            タクシー料金月2
     */
    public void setMonthlyTaxiFee2(String monthlyTaxiFee2) {
        this.monthlyTaxiFee2 = monthlyTaxiFee2;
    }

    /**
     * 送迎バス1を設定します。
     * 
     * @param msBus1
     *            送迎バス1
     */
    public void setMsBus1(String msBus1) {
        this.msBus1 = msBus1;
    }

    /**
     * 送迎バス2を設定します。
     * 
     * @param msBus2
     *            送迎バス2
     */
    public void setMsBus2(String msBus2) {
        this.msBus2 = msBus2;
    }

    /**
     * 送迎バス有無1を設定します。
     * 
     * @param msBusFlg1
     *            送迎バス有無1
     */
    public void setMsBusFlg1(String msBusFlg1) {
        this.msBusFlg1 = msBusFlg1;
    }

    /**
     * 送迎バス有無2を設定します。
     * 
     * @param msBusFlg2
     *            送迎バス有無2
     */
    public void setMsBusFlg2(String msBusFlg2) {
        this.msBusFlg2 = msBusFlg2;
    }

    /**
     * 送迎区分1を設定します。
     * 
     * @param msDiv1
     *            送迎区分1
     */
    public void setMsDiv1(String msDiv1) {
        this.msDiv1 = msDiv1;
    }

    /**
     * 送迎区分2を設定します。
     * 
     * @param msDiv2
     *            送迎区分2
     */
    public void setMsDiv2(String msDiv2) {
        this.msDiv2 = msDiv2;
    }

    /**
     * 送迎有無1を設定します。
     * 
     * @param msFlg1
     *            送迎有無1
     */
    public void setMsFlg1(String msFlg1) {
        this.msFlg1 = msFlg1;
    }

    /**
     * 送迎有無2を設定します。
     * 
     * @param msFlg2
     *            送迎有無2
     */
    public void setMsFlg2(String msFlg2) {
        this.msFlg2 = msFlg2;
    }

    /**
     * 送迎駅1を設定します。
     * 
     * @param msStation1
     *            送迎駅1
     */
    public void setMsStation1(String msStation1) {
        this.msStation1 = msStation1;
    }

    /**
     * 送迎駅2を設定します。
     * 
     * @param msStation2
     *            送迎駅2
     */
    public void setMsStation2(String msStation2) {
        this.msStation2 = msStation2;
    }

    /**
     * 送迎駅有無1を設定します。
     * 
     * @param msStationFlg1
     *            送迎駅有無1
     */
    public void setMsStationFlg1(String msStationFlg1) {
        this.msStationFlg1 = msStationFlg1;
    }

    /**
     * 送迎駅有無2を設定します。
     * 
     * @param msStationFlg2
     *            送迎駅有無2
     */
    public void setMsStationFlg2(String msStationFlg2) {
        this.msStationFlg2 = msStationFlg2;
    }

    /**
     * 車利用国道1を設定します。
     * 
     * @param nationalRoadway1
     *            車利用国道1
     */
    public void setNationalRoadway1(String nationalRoadway1) {
        this.nationalRoadway1 = nationalRoadway1;
    }

    /**
     * ＪＲ・私鉄最寄駅1を設定します。
     * 
     * @param nearestStation1
     *            ＪＲ・私鉄最寄駅1
     */
    public void setNearestStation1(String nearestStation1) {
        this.nearestStation1 = nearestStation1;
    }

    /**
     * ＪＲ・私鉄最寄駅2を設定します。
     * 
     * @param nearestStation2
     *            ＪＲ・私鉄最寄駅2
     */
    public void setNearestStation2(String nearestStation2) {
        this.nearestStation2 = nearestStation2;
    }

    /**
     * 私鉄最寄JR駅1を設定します。
     * 
     * @param nearestStationPrivate1
     *            私鉄最寄JR駅1
     */
    public void setNearestStationPrivate1(String nearestStationPrivate1) {
        this.nearestStationPrivate1 = nearestStationPrivate1;
    }

    /**
     * 私鉄最寄JR駅2を設定します。
     * 
     * @param nearestStationPrivate2
     *            私鉄最寄JR駅2
     */
    public void setNearestStationPrivate2(String nearestStationPrivate2) {
        this.nearestStationPrivate2 = nearestStationPrivate2;
    }

    /**
     * 予約不要有無1を設定します。
     * 
     * @param noReserveFlg1
     *            予約不要有無1
     */
    public void setNoReserveFlg1(String noReserveFlg1) {
        this.noReserveFlg1 = noReserveFlg1;
    }

    /**
     * 予約不要有無2を設定します。
     * 
     * @param noReserveFlg2
     *            予約不要有無2
     */
    public void setNoReserveFlg2(String noReserveFlg2) {
        this.noReserveFlg2 = noReserveFlg2;
    }

    /**
     * 私鉄会社名路線名1を設定します。
     * 
     * @param privateLineNm1
     *            私鉄会社名路線名1
     */
    public void setPrivateLineNm1(String privateLineNm1) {
        this.privateLineNm1 = privateLineNm1;
    }

    /**
     * 私鉄会社名路線名2を設定します。
     * 
     * @param privateLineNm2
     *            私鉄会社名路線名2
     */
    public void setPrivateLineNm2(String privateLineNm2) {
        this.privateLineNm2 = privateLineNm2;
    }

    /**
     * 要予約コメント1を設定します。
     * 
     * @param reserveCmt1
     *            要予約コメント1
     */
    public void setReserveCmt1(String reserveCmt1) {
        this.reserveCmt1 = reserveCmt1;
    }

    /**
     * 要予約コメント2を設定します。
     * 
     * @param reserveCmt2
     *            要予約コメント2
     */
    public void setReserveCmt2(String reserveCmt2) {
        this.reserveCmt2 = reserveCmt2;
    }

    /**
     * 要予約区分1を設定します。
     * 
     * @param reserveDiv1
     *            要予約区分1
     */
    public void setReserveDiv1(String reserveDiv1) {
        this.reserveDiv1 = reserveDiv1;
    }

    /**
     * 要予約区分2を設定します。
     * 
     * @param reserveDiv2
     *            要予約区分2
     */
    public void setReserveDiv2(String reserveDiv2) {
        this.reserveDiv2 = reserveDiv2;
    }

    /**
     * 要予約有無1を設定します。
     * 
     * @param reserveFlg1
     *            要予約有無1
     */
    public void setReserveFlg1(String reserveFlg1) {
        this.reserveFlg1 = reserveFlg1;
    }

    /**
     * 要予約有無2を設定します。
     * 
     * @param reserveFlg2
     *            要予約有無2
     */
    public void setReserveFlg2(String reserveFlg2) {
        this.reserveFlg2 = reserveFlg2;
    }

    /**
     * 送り可能時間開始1を設定します。
     * 
     * @param sendTimeBegin1
     *            送り可能時間開始1
     */
    public void setSendTimeBegin1(String sendTimeBegin1) {
        setSendTimeBegin1Hour(DKikakuWebUtil.getHourFormTime(sendTimeBegin1));
        setSendTimeBegin1Minute(DKikakuWebUtil
                .getMinuteFromTime(sendTimeBegin1));
    }

    /**
     * 送り可能時間開始1（時間）を設定します。
     * 
     * @param sendTimeBegin1Hour
     *            送り可能時間開始1（時間）
     */
    public void setSendTimeBegin1Hour(String sendTimeBegin1Hour) {
        this.sendTimeBegin1Hour = sendTimeBegin1Hour;
    }

    /**
     * 送り可能時間開始1（分）を設定します。
     * 
     * @param sendTimeBegin1Minute
     *            送り可能時間開始1（分）
     */
    public void setSendTimeBegin1Minute(String sendTimeBegin1Minute) {
        this.sendTimeBegin1Minute = sendTimeBegin1Minute;
    }

    /**
     * 送り可能時間開始2を設定します。
     * 
     * @param sendTimeBegin2
     *            送り可能時間開始2
     */
    public void setSendTimeBegin2(String sendTimeBegin2) {
        setSendTimeBegin2Hour(DKikakuWebUtil.getHourFormTime(sendTimeBegin2));
        setSendTimeBegin2Minute(DKikakuWebUtil
                .getMinuteFromTime(sendTimeBegin2));
    }

    /**
     * 送り可能時間開始2（時間）を設定します。
     * 
     * @param sendTimeBegin2Hour
     *            送り可能時間開始2（時間）
     */
    public void setSendTimeBegin2Hour(String sendTimeBegin2Hour) {
        this.sendTimeBegin2Hour = sendTimeBegin2Hour;
    }

    /**
     * 送り可能時間開始2（分）を設定します。
     * 
     * @param sendTimeBegin2Minute
     *            送り可能時間開始2（分）
     */
    public void setSendTimeBegin2Minute(String sendTimeBegin2Minute) {
        this.sendTimeBegin2Minute = sendTimeBegin2Minute;
    }

    /**
     * 送り可能時間終了1を設定します。
     * 
     * @param sendTimeEnd1
     *            送り可能時間終了1
     */
    public void setSendTimeEnd1(String sendTimeEnd1) {
        setSendTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(sendTimeEnd1));
        setSendTimeEnd1Minute(DKikakuWebUtil.getMinuteFromTime(sendTimeEnd1));
    }

    /**
     * 送り可能時間終了1（時間）を設定します。
     * 
     * @param sendTimeEnd1Hour
     *            送り可能時間終了1（時間）
     */
    public void setSendTimeEnd1Hour(String sendTimeEnd1Hour) {
        this.sendTimeEnd1Hour = sendTimeEnd1Hour;
    }

    /**
     * 送り可能時間終了1（分）を設定します。
     * 
     * @param sendTimeEnd1Minute
     *            送り可能時間終了1（分）
     */
    public void setSendTimeEnd1Minute(String sendTimeEnd1Minute) {
        this.sendTimeEnd1Minute = sendTimeEnd1Minute;
    }

    /**
     * 送り可能時間終了2を設定します。
     * 
     * @param sendTimeEnd2
     *            送り可能時間終了2
     */
    public void setSendTimeEnd2(String sendTimeEnd2) {
        setSendTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(sendTimeEnd2));
        setSendTimeEnd2Minute(DKikakuWebUtil.getMinuteFromTime(sendTimeEnd2));
    }

    /**
     * 送り可能時間終了2（時間）を設定します。
     * 
     * @param sendTimeEnd2Hour
     *            送り可能時間終了2（時間）
     */
    public void setSendTimeEnd2Hour(String sendTimeEnd2Hour) {
        this.sendTimeEnd2Hour = sendTimeEnd2Hour;
    }

    /**
     * 送り可能時間終了2（分）を設定します。
     * 
     * @param sendTimeEnd2Minute
     *            送り可能時間終了2（分）
     */
    public void setSendTimeEnd2Minute(String sendTimeEnd2Minute) {
        this.sendTimeEnd2Minute = sendTimeEnd2Minute;
    }

    /**
     * 送り可能時間有無1を設定します。
     * 
     * @param sendTimeFlg1
     *            送り可能時間有無1
     */
    public void setSendTimeFlg1(String sendTimeFlg1) {
        this.sendTimeFlg1 = sendTimeFlg1;
    }

    /**
     * 送り可能時間有無2を設定します。
     * 
     * @param sendTimeFlg2
     *            送り可能時間有無2
     */
    public void setSendTimeFlg2(String sendTimeFlg2) {
        this.sendTimeFlg2 = sendTimeFlg2;
    }

    /**
     * 送迎シャトルバス有無1を設定します。
     * 
     * @param shuttleBusFlg1
     *            送迎シャトルバス有無1
     */
    public void setShuttleBusFlg1(String shuttleBusFlg1) {
        this.shuttleBusFlg1 = shuttleBusFlg1;
    }

    /**
     * 送迎シャトルバス有無2を設定します。
     * 
     * @param shuttleBusFlg2
     *            送迎シャトルバス有無2
     */
    public void setShuttleBusFlg2(String shuttleBusFlg2) {
        this.shuttleBusFlg2 = shuttleBusFlg2;
    }

    /**
     * シャトルバス運行時刻_迎え1を設定します。
     * 
     * @param shuttleBusMeet1
     *            シャトルバス運行時刻_迎え1
     */
    public void setShuttleBusMeet1(String shuttleBusMeet1) {
        this.shuttleBusMeet1 = shuttleBusMeet1;
    }

    /**
     * シャトルバス運行時刻_迎え2を設定します。
     * 
     * @param shuttleBusMeet2
     *            シャトルバス運行時刻_迎え2
     */
    public void setShuttleBusMeet2(String shuttleBusMeet2) {
        this.shuttleBusMeet2 = shuttleBusMeet2;
    }

    /**
     * シャトルバス備考1を設定します。
     * 
     * @param shuttleBusMemo1
     *            シャトルバス備考1
     */
    public void setShuttleBusMemo1(String shuttleBusMemo1) {
        this.shuttleBusMemo1 = shuttleBusMemo1;
    }

    /**
     * シャトルバス備考2を設定します。
     * 
     * @param shuttleBusMemo2
     *            シャトルバス備考2
     */
    public void setShuttleBusMemo2(String shuttleBusMemo2) {
        this.shuttleBusMemo2 = shuttleBusMemo2;
    }

    /**
     * シャトルバス運行時刻_送り1を設定します。
     * 
     * @param shuttleBusSend1
     *            シャトルバス運行時刻_送り1
     */
    public void setShuttleBusSend1(String shuttleBusSend1) {
        this.shuttleBusSend1 = shuttleBusSend1;
    }

    /**
     * シャトルバス運行時刻_送り2を設定します。
     * 
     * @param shuttleBusSend2
     *            シャトルバス運行時刻_送り2
     */
    public void setShuttleBusSend2(String shuttleBusSend2) {
        this.shuttleBusSend2 = shuttleBusSend2;
    }

    /**
     * 送迎シャトルバス（最寄駅発）1を設定します。
     * 
     * @param shuttleBusStation1
     *            送迎シャトルバス（最寄駅発）1
     */
    public void setShuttleBusStation1(String shuttleBusStation1) {
        this.shuttleBusStation1 = shuttleBusStation1;
    }

    /**
     * 送迎シャトルバス（最寄駅発）2を設定します。
     * 
     * @param shuttleBusStation2
     *            送迎シャトルバス（最寄駅発）2
     */
    public void setShuttleBusStation2(String shuttleBusStation2) {
        this.shuttleBusStation2 = shuttleBusStation2;
    }

    /**
     * シャトルバス運行時刻_備考1を設定します。
     * 
     * @param shuttleBusTimeMemo1
     *            シャトルバス運行時刻_備考1
     */
    public void setShuttleBusTimeMemo1(String shuttleBusTimeMemo1) {
        this.shuttleBusTimeMemo1 = shuttleBusTimeMemo1;
    }

    /**
     * シャトルバス運行時刻_備考2を設定します。
     * 
     * @param shuttleBusTimeMemo2
     *            シャトルバス運行時刻_備考2
     */
    public void setShuttleBusTimeMemo2(String shuttleBusTimeMemo2) {
        this.shuttleBusTimeMemo2 = shuttleBusTimeMemo2;
    }

    /**
     * ＪＲ・私鉄区分1を設定します。
     * 
     * @param stationDiv1
     *            ＪＲ・私鉄区分1
     */
    public void setStationDiv1(String stationDiv1) {
        this.stationDiv1 = stationDiv1;
    }

    /**
     * ＪＲ・私鉄区分2を設定します。
     * 
     * @param stationDiv2
     *            ＪＲ・私鉄区分2
     */
    public void setStationDiv2(String stationDiv2) {
        this.stationDiv2 = stationDiv2;
    }

    /**
     * タクシー利用料金1を設定します。
     * 
     * @param taxiFee1
     *            タクシー利用料金1
     */
    public void setTaxiFee1(String taxiFee1) {
        this.taxiFee1 = taxiFee1;
    }

    /**
     * タクシー利用料金2を設定します。
     * 
     * @param taxiFee2
     *            タクシー利用料金2
     */
    public void setTaxiFee2(String taxiFee2) {
        this.taxiFee2 = taxiFee2;
    }

    /**
     * タクシー時間1を設定します。
     * 
     * @param taxiTime1
     *            タクシー時間1
     */
    public void setTaxiTime1(String taxiTime1) {
        this.taxiTime1 = taxiTime1;
    }

    /**
     * タクシー時間2を設定します。
     * 
     * @param taxiTime2
     *            タクシー時間2
     */
    public void setTaxiTime2(String taxiTime2) {
        this.taxiTime2 = taxiTime2;
    }

    /**
     * バス停より徒歩時間1を設定します。
     * 
     * @param toBusStaTime1
     *            バス停より徒歩時間1
     */
    public void setToBusStaTime1(String toBusStaTime1) {
        this.toBusStaTime1 = toBusStaTime1;
    }

    /**
     * バス停より徒歩時間2を設定します。
     * 
     * @param toBusStaTime2
     *            バス停より徒歩時間2
     */
    public void setToBusStaTime2(String toBusStaTime2) {
        this.toBusStaTime2 = toBusStaTime2;
    }

    /**
     * 駅より徒歩時間1を設定します。
     * 
     * @param toStationWalktime1
     *            駅より徒歩時間1
     */
    public void setToStationWalktime1(String toStationWalktime1) {
        this.toStationWalktime1 = toStationWalktime1;
    }

    /**
     * 駅より徒歩時間2を設定します。
     * 
     * @param toStationWalktime2
     *            駅より徒歩時間2
     */
    public void setToStationWalktime2(String toStationWalktime2) {
        this.toStationWalktime2 = toStationWalktime2;
    }

    /**
     * 交通手段有無を設定します。
     * 
     * @param trafficFlg
     *            交通手段有無
     */
    public void setTrafficFlg(String trafficFlg) {
        this.trafficFlg = trafficFlg;
    }

}
