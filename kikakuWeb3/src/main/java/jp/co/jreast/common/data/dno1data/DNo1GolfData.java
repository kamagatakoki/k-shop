package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 * NO1_ゴルフデータクラス。.
 * 機能概要    ：   NO1_ゴルフデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 */

public class DNo1GolfData extends PlanAnsBaseData implements IDNo1CommonData {

    /** 車利用高速道路IC . */
    private String accessIc;

    /** 車利用時間 . */
    private String accessTime;

    /** エリアコード . */
    private String areaCd;

    /** 地区大分類 */
    private String areaDaiCd;

    /** 地区名称(カナ) */
    private String areaKana;

    /** 地区名称 */
    private String areaNm;

    /** 地区小分類 */
    private String areaShoCd;

    /** 車利用自動車道 . */
    private String autoRoadway;

    /** 車利用距離 . */
    private String availableDistance;

    /** 予約種別 . */
    private String bookKind = "61";

    /** 用途 . */
    private String bookPurpose = "3";

    /** バス行き先 . */
    private String busDestination;

    /** バス停名称 . */
    private String busStation;

    /** バス利用時間 . */
    private String busTimetable;

    /** キャディ料金２B_土曜休日 . */
    private String caddieCharge2bHoliday;

    /** キャディ料金２B_平日 . */
    private String caddieCharge2bWeekday;

    /** キャディ料金３B_土曜休日 . */
    private String caddieCharge3bHoliday;

    /** キャディ料金３B_平日 . */
    private String caddieCharge3bWeekday;

    /** キャディ料金４B_土曜休日 . */
    private String caddieCharge4bHoliday;

    /** キャディ料金４B_平日 . */
    private String caddieCharge4bWeekday;

    /** キャディ料金区分 . */
    private String caddieChargeDiv = JreConstants.CADDIE_CHARGE_DIV_1;

    /** 料金単位区分 . */
    /**
     * ToDo: ラベル表示（１名料金の入力で制御する）
     */
    private String chargeDiv;

    /** 駅到着要連絡有無 . */
    private String contactFlg = JreConstants.FLG_FALSE;

    /** 車利用県道 . */
    private String countyRoadway;

    /** コース距離（ヤード）１ . */
    private String courseDistance1;

    /** コース距離（ヤード）２ . */
    private String courseDistance2;

    /** コース距離（ヤード）３ . */
    private String courseDistance3;

    /** コース距離（ヤード）４ . */
    private String courseDistance4;

    /** コースホール１ . */
    private String courseHole1;

    /** コースホール２ . */
    private String courseHole2;

    /** コースホール３ . */
    private String courseHole3;

    /** コースホール４ . */
    private String courseHole4;

    /** コース名１ . */
    private String courseName1;

    /** コース名２ . */
    private String courseName2;

    /** コース名３ . */
    private String courseName3;

    /** コース名４ . */
    private String courseName4;

    /** コースバー１ . */
    private String coursePar1;

    /** コースバー２ . */
    private String coursePar2;

    /** コースバー３ . */
    private String coursePar3;

    /** コースバー４ . */
    private String coursePar4;

    /** 客送迎有無 . */
    private String customerMsFlg = JreConstants.FLG_FALSE;

    /** 取扱手数料 . */
    private String dealFee;

    /** 取扱手数料Flag . */
    private String dealFeeFlg;

    /** 取扱手数料種別 . */
    private String dealFeeType;

    /** 除外日 . */
    private String exceptDate;

    /** 施設住所 . */
    private String facilityAddr;

    /** 施設ファックス . */
    private String facilityFax;

    /** 施設郵便番号 . */
    private String facilityPostCd;

    /** 施設電話 . */
    private String facilityTel;

    /** 自由入力欄 . */
    private String freelyColumn;

    /** 車利用普通道路 . */
    private String genreralRoadway;

    /** シャトルバスゴルフ場発時刻１ . */
    private String golfSpotDepart1;

    /** シャトルバスゴルフ場発時刻２ . */
    private String golfSpotDepart2;

    /** シャトルバスゴルフ場発時刻３ . */
    private String golfSpotDepart3;

    /** シャトルバスゴルフ場発時刻１ . */
    private String golfSpotDepartH1;

    /** シャトルバスゴルフ場発時刻２ . */
    private String golfSpotDepartH2;

    /** シャトルバスゴルフ場発時刻３ . */
    private String golfSpotDepartH3;

    /** シャトルバスゴルフ場発時刻１ . */
    private String golfSpotDepartM1;

    /** シャトルバスゴルフ場発時刻２ . */
    private String golfSpotDepartM2;

    /** シャトルバスゴルフ場発時刻３ . */
    private String golfSpotDepartM3;

    /** 分類コード . */
    private String goodsKindCd;

    /** 車利用高速道路 . */
    private String highway;

    /**
     * 通知先地区名
     */
    private String informAreaNm;

    /** 通知先ファックス . */
    private String informFax;

    /**
     * 通知先名
     */
    private String informNm;

    /** カート料金２B_土曜休日 . */
    private String kartCharge2bHoliday;

    /** カート料金２B_平日 . */
    private String kartCharge2bWeekday;

    /** カート料金３B_土曜休日 . */
    private String kartCharge3bHoliday;

    /** カート料金３B_平日 . */
    private String kartCharge3bWeekday;

    /** カート料金４B_土曜休日 . */
    private String kartCharge4bHoliday;

    /** カート料金４B_平日 . */
    private String kartCharge4bWeekday;

    /** カート料金区分 . */
    private String kartChargeDiv = JreConstants.CADDIE_CHARGE_DIV_1;

    /** 手仕舞日 . */
    private String liquidateDay;

    /** 手仕舞通知方法用否 . */
    private String liquidateInformFlg = JreConstants.FLG_TRUE;

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

    /** 迎え可能時間開始 . */
    private String meetTimeBegin;

    /** 迎え可能時間開始 . */
    private String meetTimeBeginH;

    /** 迎え可能時間開始時 . */
    private String meetTimeBeginM;

    /** 迎え可能時間終了分 . */
    private String meetTimeEnd;

    /** 迎え可能時間終了時 . */
    private String meetTimeEndH;

    /** 迎え可能時間終了分 . */
    private String meetTimeEndM;

    /** 迎え可能時間有無 . */
    private String meetTimeFlg = JreConstants.FLG_FALSE;

    /** 備考 */
    private String memo;

    /** 送迎区分 . */
    private String msDiv = JreConstants.CADDIE_CHARGE_DIV_1;

    /** 送迎有無 . */
    private String msFlg = JreConstants.FLG_TRUE;

    /** 送迎備考 . */
    private String msMemo;

    /** 送迎の条件 . */
    private String msTerm;

    /** 車利用国道 . */
    private String nationalRoadway;

    /** ＪＲ・私鉄再寄線路 . */
    private String nearestRoute;

    /** ＪＲ・私鉄再寄駅 . */
    private String nearestStation;

    /** シャトルバス最寄駅発時刻１ . */
    private String nearestStationDepart1;

    /** シャトルバス最寄駅発時刻２ . */
    private String nearestStationDepart2;

    /** シャトルバス最寄駅発時刻３ . */
    private String nearestStationDepart3;

    /** シャトルバス最寄駅発時刻1 . */
    private String nearestStationDepartH1;

    /** シャトルバス最寄駅発時刻２ . */
    private String nearestStationDepartH2;

    /** シャトルバス最寄駅発時刻３ . */
    private String nearestStationDepartH3;

    /** シャトルバス最寄駅発時刻１ . */
    private String nearestStationDepartM1;

    /** シャトルバス最寄駅発時刻２ . */
    private String nearestStationDepartM2;

    /** シャトルバス最寄駅発時刻３ . */
    private String nearestStationDepartM3;

    /**
     * 1名料金フラグ.
     */
    private String onePersonFlg;

    /** 代表者名 . */
    private String ownerNm;

    /**
     * 個札券出力指定有無 .
     */
    private String personalTicketPrintFlg;

    /** キャディ付プレー可否 . */
    private String playWithCaddieFlg = JreConstants.FLG_TRUE;

    /** 都道府県コード . */
    private String prefecturesCd;

    /** 地域コード . */
    private String regionCd;

    /** 要予約コメント . */
    private String reserveCmt;

    /** 要予約有無 . */
    private String reserveFlg = JreConstants.FLG_FALSE;

    /** 予約通知方法用否 . */
    private String reserveInformWay = JreConstants.FLG_TRUE;

    /** セールスポイント . */
    private String salesPoint;

    /** セルフプレー２B . */
    private String selfPlay2b;

    /** セルフプレー３B . */
    private String selfPlay3b;

    /** セルフプレー４B . */
    private String selfPlay4b;

    /** セルフプレー区分 . */
    private String selfPlayDiv;

    /** セルフプレー可否 . */
    private String selfPlayFlg = JreConstants.FLG_TRUE;

    /** 送り可能時間開始 . */
    private String sendTimeBegin;

    /** 送り可能時間開始時 . */
    private String sendTimeBeginH;

    /** 送り可能時間開始分 . */
    private String sendTimeBeginM;

    /** 送り可能時間終了 . */
    private String sendTimeEnd;

    /** 送り可能時間終了時 . */
    private String sendTimeEndH;

    /** 送り可能時間終了分 . */
    private String sendTimeEndM;

    /** 送り可能時間有無 . */
    private String sendTimeFlg = JreConstants.FLG_FALSE;

    /**
     * シニア年齢From .
     */
    private String seniorAgeFrom;

    /** シャトルバス予約コメント . */
    private String shuttleBusBookCmt;

    /** シャトルバス予約有無 . */
    private String shuttleBusBookFlg = JreConstants.FLG_FALSE;

    /** シャトルバス有無 . */
    private String shuttleBusFlg = JreConstants.FLG_FALSE;

    /** シャトルバス運行備考 . */
    private String shuttleBusMemo;

    /** スタートコース . */
    private String startCourse;

    /** スタート時間 . */
    private String startTime;

    /** スタート時 . */
    private String startTimeH;

    /** スタート分　. */
    private String startTimeM;

    /**
     * JRと私鉄の区分.
     */
    private String stationDiv;

    /** 住所（在庫） */
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

    /** 在庫番号 . */
    private String stockNo;

    /** 郵便番号（在庫） */
    private String stockPostCd;

    /** 電話番号（在庫） */
    private String stockTel;

    /**
     * 在庫単位
     */
    private String stockUnit;

    /** タクシー時間 . */
    private String taxiTime;

    /** 提供期間終了日 . */
    private String termEndD;

    /** 提供期間終了月 . */
    private String termEndM;

    /** 提供期間終了年 . */
    private String termEndY;

    /** 提供期間終了年月日 . */
    private String termEndYmd;

    /** 提供期間開始日 . */
    private String termFromD;

    /** 提供期間開始月 . */
    private String termFromM;

    /** 提供期間開始年 . */
    private String termFromY;

    /** 提供期間開始年月日 . */
    private String termFromYmd;

    /** バス停より徒歩時間 . */
    private String toBusStaTime;

    /** 駅より徒歩時間 . */
    private String toStationWalktime;

    /** 有効期間 . */
    private String validPeriod;

    /** バウチャーレス可否 . */
    private String voucherFlg = JreConstants.FLG_TRUE;

    /**
     * バウチャー券案内文（漢字） .
     */
    private String voucherIntroKanji;

    /**
     * 車利用高速道路IC .を取得します。
     * 
     * @return 車利用高速道路IC .
     */
    public String getAccessIc() {
        return accessIc;
    }

    /**
     * 車利用時間 .を取得します。
     * 
     * @return 車利用時間 .
     */
    public String getAccessTime() {
        return accessTime;
    }

    /**
     * エリアコード .を取得します。
     * 
     * @return エリアコード .
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * 地区大分類を取得します。
     * 
     * @return 地区大分類
     */
    public String getAreaDaiCd() {
        return areaDaiCd;
    }

    /**
     * 地区名称(カナ)を取得します。
     * 
     * @return 地区名称(カナ)
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
     * 地区小分類を取得します。
     * 
     * @return 地区小分類
     */
    public String getAreaShoCd() {
        return areaShoCd;
    }

    /**
     * 車利用自動車道 .を取得します。
     * 
     * @return 車利用自動車道 .
     */
    public String getAutoRoadway() {
        return autoRoadway;
    }

    /**
     * 車利用距離 .を取得します。
     * 
     * @return 車利用距離 .
     */
    public String getAvailableDistance() {
        return availableDistance;
    }

    /**
     * 予約種別 .を取得します。
     * 
     * @return 予約種別 .
     */
    public String getBookKind() {
        return bookKind;
    }

    /**
     * 用途 .を取得します。
     * 
     * @return 用途 .
     */
    public String getBookPurpose() {
        return bookPurpose;
    }

    /**
     * バス行き先 .を取得します。
     * 
     * @return バス行き先 .
     */
    public String getBusDestination() {
        return busDestination;
    }

    /**
     * バス停名称 .を取得します。
     * 
     * @return バス停名称 .
     */
    public String getBusStation() {
        return busStation;
    }

    /**
     * バス利用時間 .を取得します。
     * 
     * @return バス利用時間 .
     */
    public String getBusTimetable() {
        return busTimetable;
    }

    /**
     * キャディ料金２B_土曜休日 .を取得します。
     * 
     * @return キャディ料金２B_土曜休日 .
     */
    public String getCaddieCharge2bHoliday() {
        return caddieCharge2bHoliday;
    }

    /**
     * キャディ料金２B_平日 .を取得します。
     * 
     * @return キャディ料金２B_平日 .
     */
    public String getCaddieCharge2bWeekday() {
        return caddieCharge2bWeekday;
    }

    /**
     * キャディ料金３B_土曜休日 .を取得します。
     * 
     * @return キャディ料金３B_土曜休日 .
     */
    public String getCaddieCharge3bHoliday() {
        return caddieCharge3bHoliday;
    }

    /**
     * キャディ料金３B_平日 .を取得します。
     * 
     * @return キャディ料金３B_平日 .
     */
    public String getCaddieCharge3bWeekday() {
        return caddieCharge3bWeekday;
    }

    /**
     * キャディ料金４B_土曜休日 .を取得します。
     * 
     * @return キャディ料金４B_土曜休日 .
     */
    public String getCaddieCharge4bHoliday() {
        return caddieCharge4bHoliday;
    }

    /**
     * キャディ料金４B_平日 .を取得します。
     * 
     * @return キャディ料金４B_平日 .
     */
    public String getCaddieCharge4bWeekday() {
        return caddieCharge4bWeekday;
    }

    /**
     * キャディ料金区分 .を取得します。
     * 
     * @return キャディ料金区分 .
     */
    public String getCaddieChargeDiv() {
        return caddieChargeDiv;
    }

    /**
     * 料金単位区分 .を取得します。
     * 
     * @return 料金単位区分 .
     */
    public String getChargeDiv() {
        return chargeDiv;
    }

    /**
     * 駅到着要連絡有無 .を取得します。
     * 
     * @return 駅到着要連絡有無 .
     */
    public String getContactFlg() {
        return contactFlg;
    }

    /**
     * 車利用県道 .を取得します。
     * 
     * @return 車利用県道 .
     */
    public String getCountyRoadway() {
        return countyRoadway;
    }

    /**
     * コース距離（ヤード）１ .を取得します。
     * 
     * @return コース距離（ヤード）１ .
     */
    public String getCourseDistance1() {
        return courseDistance1;
    }

    /**
     * コース距離（ヤード）２ .を取得します。
     * 
     * @return コース距離（ヤード）２ .
     */
    public String getCourseDistance2() {
        return courseDistance2;
    }

    /**
     * コース距離（ヤード）３ .を取得します。
     * 
     * @return コース距離（ヤード）３ .
     */
    public String getCourseDistance3() {
        return courseDistance3;
    }

    /**
     * コース距離（ヤード）４ .を取得します。
     * 
     * @return コース距離（ヤード）４ .
     */
    public String getCourseDistance4() {
        return courseDistance4;
    }

    /**
     * コースホール１ .を取得します。
     * 
     * @return コースホール１ .
     */
    public String getCourseHole1() {
        return courseHole1;
    }

    /**
     * コースホール２ .を取得します。
     * 
     * @return コースホール２ .
     */
    public String getCourseHole2() {
        return courseHole2;
    }

    /**
     * コースホール３ .を取得します。
     * 
     * @return コースホール３ .
     */
    public String getCourseHole3() {
        return courseHole3;
    }

    /**
     * コースホール４ .を取得します。
     * 
     * @return コースホール４ .
     */
    public String getCourseHole4() {
        return courseHole4;
    }

    /**
     * コース名１ .を取得します。
     * 
     * @return コース名１ .
     */
    public String getCourseName1() {
        return courseName1;
    }

    /**
     * コース名２ .を取得します。
     * 
     * @return コース名２ .
     */
    public String getCourseName2() {
        return courseName2;
    }

    /**
     * コース名３ .を取得します。
     * 
     * @return コース名３ .
     */
    public String getCourseName3() {
        return courseName3;
    }

    /**
     * コース名４ .を取得します。
     * 
     * @return コース名４ .
     */
    public String getCourseName4() {
        return courseName4;
    }

    /**
     * コースバー１ .を取得します。
     * 
     * @return コースバー１ .
     */
    public String getCoursePar1() {
        return coursePar1;
    }

    /**
     * コースバー２ .を取得します。
     * 
     * @return コースバー２ .
     */
    public String getCoursePar2() {
        return coursePar2;
    }

    /**
     * コースバー３ .を取得します。
     * 
     * @return コースバー３ .
     */
    public String getCoursePar3() {
        return coursePar3;
    }

    /**
     * コースバー４ .を取得します。
     * 
     * @return コースバー４ .
     */
    public String getCoursePar4() {
        return coursePar4;
    }

    /**
     * 客送迎有無 .を取得します。
     * 
     * @return 客送迎有無 .
     */
    public String getCustomerMsFlg() {
        return customerMsFlg;
    }

    /**
     * 取扱手数料 .を取得します。
     * 
     * @return 取扱手数料 .
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
     * @return 手数料(カンマ付き）
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
     * 取扱手数料Flag .を取得します。
     * 
     * @return 取扱手数料Flag .
     */
    public String getDealFeeFlg() {
        return dealFeeFlg;
    }

    /**
     * 取扱手数料種別 .を取得します。
     * 
     * @return 取扱手数料種別 .
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * 除外日 .を取得します。
     * 
     * @return 除外日 .
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * 施設住所 .を取得します。
     * 
     * @return 施設住所 .
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * 施設ファックス .を取得します。
     * 
     * @return 施設ファックス .
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * 施設郵便番号 .を取得します。
     * 
     * @return 施設郵便番号 .
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * 施設電話 .を取得します。
     * 
     * @return 施設電話 .
     */
    public String getFacilityTel() {
        return facilityTel == null ? "" : facilityTel.trim();
    }

    /**
     * 自由入力欄 .を取得します。
     * 
     * @return 自由入力欄 .
     */
    public String getFreelyColumn() {
        return freelyColumn;
    }

    /**
     * 車利用普通道路 .を取得します。
     * 
     * @return 車利用普通道路 .
     */
    public String getGenreralRoadway() {
        return genreralRoadway;
    }

    /**
     * シャトルバスゴルフ場発時刻１ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻１ .
     */
    public String getGolfSpotDepart1() {
        return golfSpotDepart1;
    }

    /**
     * シャトルバスゴルフ場発時刻２ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻２ .
     */
    public String getGolfSpotDepart2() {
        return golfSpotDepart2;
    }

    /**
     * シャトルバスゴルフ場発時刻３ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻３ .
     */
    public String getGolfSpotDepart3() {
        return golfSpotDepart3;
    }

    /**
     * シャトルバスゴルフ場発時刻１ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻１ .
     */
    public String getGolfSpotDepartH1() {
        return golfSpotDepartH1;
    }

    /**
     * シャトルバスゴルフ場発時刻２ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻２ .
     */
    public String getGolfSpotDepartH2() {
        return golfSpotDepartH2;
    }

    /**
     * シャトルバスゴルフ場発時刻３ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻３ .
     */
    public String getGolfSpotDepartH3() {
        return golfSpotDepartH3;
    }

    /**
     * シャトルバスゴルフ場発時刻１ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻１ .
     */
    public String getGolfSpotDepartM1() {
        return golfSpotDepartM1;
    }

    /**
     * シャトルバスゴルフ場発時刻２ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻２ .
     */
    public String getGolfSpotDepartM2() {
        return golfSpotDepartM2;
    }

    /**
     * シャトルバスゴルフ場発時刻３ .を取得します。
     * 
     * @return シャトルバスゴルフ場発時刻３ .
     */
    public String getGolfSpotDepartM3() {
        return golfSpotDepartM3;
    }

    /**
     * 分類コード .を取得します。
     * 
     * @return 分類コード .
     */
    public String getGoodsKindCd() {
        return goodsKindCd;
    }

    /**
     * 車利用高速道路 .を取得します。
     * 
     * @return 車利用高速道路 .
     */
    public String getHighway() {
        return highway;
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
     * 通知先ファックス .を取得します。
     * 
     * @return 通知先ファックス .
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
     * カート料金２B_土曜休日 .を取得します。
     * 
     * @return カート料金２B_土曜休日 .
     */
    public String getKartCharge2bHoliday() {
        return kartCharge2bHoliday;
    }

    /**
     * カート料金２B_平日 .を取得します。
     * 
     * @return カート料金２B_平日 .
     */
    public String getKartCharge2bWeekday() {
        return kartCharge2bWeekday;
    }

    /**
     * カート料金３B_土曜休日 .を取得します。
     * 
     * @return カート料金３B_土曜休日 .
     */
    public String getKartCharge3bHoliday() {
        return kartCharge3bHoliday;
    }

    /**
     * カート料金３B_平日 .を取得します。
     * 
     * @return カート料金３B_平日 .
     */
    public String getKartCharge3bWeekday() {
        return kartCharge3bWeekday;
    }

    /**
     * カート料金４B_土曜休日 .を取得します。
     * 
     * @return カート料金４B_土曜休日 .
     */
    public String getKartCharge4bHoliday() {
        return kartCharge4bHoliday;
    }

    /**
     * カート料金４B_平日 .を取得します。
     * 
     * @return カート料金４B_平日 .
     */
    public String getKartCharge4bWeekday() {
        return kartCharge4bWeekday;
    }

    /**
     * カート料金区分 .を取得します。
     * 
     * @return カート料金区分 .
     */
    public String getKartChargeDiv() {
        return kartChargeDiv;
    }

    /**
     * 手仕舞日 .を取得します。
     * 
     * @return 手仕舞日 .
     */
    public String getLiquidateDay() {
        return liquidateDay;
    }

    /**
     * 手仕舞通知方法用否 .を取得します。
     * 
     * @return 手仕舞通知方法用否 .
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
     * 迎え可能時間開始 .を取得します。
     * 
     * @return 迎え可能時間開始 .
     */
    public String getMeetTimeBegin() {
        return meetTimeBegin;
    }

    /**
     * 迎え可能時間開始 .を取得します。
     * 
     * @return 迎え可能時間開始 .
     */
    public String getMeetTimeBeginH() {
        return meetTimeBeginH;
    }

    /**
     * 迎え可能時間開始時 .を取得します。
     * 
     * @return 迎え可能時間開始時 .
     */
    public String getMeetTimeBeginM() {
        return meetTimeBeginM;
    }

    /**
     * 迎え可能時間終了分 .を取得します。
     * 
     * @return 迎え可能時間終了分 .
     */
    public String getMeetTimeEnd() {
        return meetTimeEnd;

    }

    /**
     * 迎え可能時間終了時 .を取得します。
     * 
     * @return 迎え可能時間終了時 .
     */
    public String getMeetTimeEndH() {
        return meetTimeEndH;
    }

    /**
     * 迎え可能時間終了分 .を取得します。
     * 
     * @return 迎え可能時間終了分 .
     */
    public String getMeetTimeEndM() {
        return meetTimeEndM;
    }

    /**
     * 迎え可能時間有無 .を取得します。
     * 
     * @return 迎え可能時間有無 .
     */
    public String getMeetTimeFlg() {
        return meetTimeFlg;
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
     * 送迎区分 .を取得します。
     * 
     * @return 送迎区分 .
     */
    public String getMsDiv() {
        return msDiv;
    }

    /**
     * 送迎有無 .を取得します。
     * 
     * @return 送迎有無 .
     */
    public String getMsFlg() {
        return msFlg;
    }

    /**
     * 送迎備考 .を取得します。
     * 
     * @return 送迎備考 .
     */
    public String getMsMemo() {
        return msMemo;
    }

    /**
     * 送迎の条件 .を取得します。
     * 
     * @return 送迎の条件 .
     */
    public String getMsTerm() {
        return msTerm;
    }

    /**
     * 車利用国道 .を取得します。
     * 
     * @return 車利用国道 .
     */
    public String getNationalRoadway() {
        return nationalRoadway;
    }

    /**
     * ＪＲ・私鉄再寄線路 .を取得します。
     * 
     * @return ＪＲ・私鉄再寄線路 .
     */
    public String getNearestRoute() {
        return nearestRoute;
    }

    /**
     * ＪＲ・私鉄再寄駅 .を取得します。
     * 
     * @return ＪＲ・私鉄再寄駅 .
     */
    public String getNearestStation() {
        return nearestStation;
    }

    /**
     * シャトルバス最寄駅発時刻１ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻１ .
     */
    public String getNearestStationDepart1() {
        return nearestStationDepart1;
    }

    /**
     * シャトルバス最寄駅発時刻２ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻２ .
     */
    public String getNearestStationDepart2() {
        return nearestStationDepart2;
    }

    /**
     * シャトルバス最寄駅発時刻３ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻３ .
     */
    public String getNearestStationDepart3() {
        return nearestStationDepart3;

    }

    /**
     * シャトルバス最寄駅発時刻1 .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻1 .
     */
    public String getNearestStationDepartH1() {
        return nearestStationDepartH1;
    }

    /**
     * シャトルバス最寄駅発時刻２ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻２ .
     */
    public String getNearestStationDepartH2() {
        return nearestStationDepartH2;
    }

    /**
     * シャトルバス最寄駅発時刻３ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻３ .
     */
    public String getNearestStationDepartH3() {
        return nearestStationDepartH3;

    }

    /**
     * シャトルバス最寄駅発時刻１ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻１ .
     */
    public String getNearestStationDepartM1() {
        return nearestStationDepartM1;
    }

    /**
     * シャトルバス最寄駅発時刻２ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻２ .
     */
    public String getNearestStationDepartM2() {
        return nearestStationDepartM2;
    }

    /**
     * シャトルバス最寄駅発時刻３ .を取得します。
     * 
     * @return シャトルバス最寄駅発時刻３ .
     */
    public String getNearestStationDepartM3() {
        return nearestStationDepartM3;
    }

    /**
     * 1名料金フラグ.を取得します。
     * 
     * @return 1名料金フラグ.
     */
    public String getOnePersonFlg() {
        return onePersonFlg;
    }

    /**
     * 代表者名 .を取得します。
     * 
     * @return 代表者名 .
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * 個札券出力指定有無 .を取得します。
     * 
     * @return 個札券出力指定有無 .
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
    }

    /**
     * キャディ付プレー可否 .を取得します。
     * 
     * @return キャディ付プレー可否 .
     */
    public String getPlayWithCaddieFlg() {
        return playWithCaddieFlg;
    }

    /**
     * 都道府県コード .を取得します。
     * 
     * @return 都道府県コード .
     */
    public String getPrefecturesCd() {
        return prefecturesCd;
    }

    /**
     * 地域コード .を取得します。
     * 
     * @return 地域コード .
     */
    public String getRegionCd() {
        return regionCd;
    }

    /**
     * 要予約コメント .を取得します。
     * 
     * @return 要予約コメント .
     */
    public String getReserveCmt() {
        return reserveCmt;
    }

    /**
     * 要予約有無 .を取得します。
     * 
     * @return 要予約有無 .
     */
    public String getReserveFlg() {
        return reserveFlg;
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
     * セールスポイント .を取得します。
     * 
     * @return セールスポイント .
     */
    public String getSalesPoint() {
        return salesPoint;
    }

    /**
     * セルフプレー２B .を取得します。
     * 
     * @return セルフプレー２B .
     */
    public String getSelfPlay2b() {
        return selfPlay2b;
    }

    /**
     * セルフプレー３B .を取得します。
     * 
     * @return セルフプレー３B .
     */
    public String getSelfPlay3b() {
        return selfPlay3b;
    }

    /**
     * セルフプレー４B .を取得します。
     * 
     * @return セルフプレー４B .
     */
    public String getSelfPlay4b() {
        return selfPlay4b;
    }

    /**
     * セルフプレー区分 .を取得します。
     * 
     * @return セルフプレー区分 .
     */
    public String getSelfPlayDiv() {
        return selfPlayDiv;
    }

    /**
     * セルフプレー可否 .を取得します。
     * 
     * @return セルフプレー可否 .
     */
    public String getSelfPlayFlg() {
        return selfPlayFlg;
    }

    /**
     * 送り可能時間開始 .を取得します。
     * 
     * @return 送り可能時間開始 .
     */
    public String getSendTimeBegin() {
        return sendTimeBegin;
    }

    /**
     * 送り可能時間開始時 .を取得します。
     * 
     * @return 送り可能時間開始時 .
     */
    public String getSendTimeBeginH() {
        return sendTimeBeginH;
    }

    /**
     * 送り可能時間開始分 .を取得します。
     * 
     * @return 送り可能時間開始分 .
     */
    public String getSendTimeBeginM() {
        return sendTimeBeginM;

    }

    /**
     * 送り可能時間終了 .を取得します。
     * 
     * @return 送り可能時間終了 .
     */
    public String getSendTimeEnd() {
        return sendTimeEnd;
    }

    /**
     * 送り可能時間終了時 .を取得します。
     * 
     * @return 送り可能時間終了時 .
     */
    public String getSendTimeEndH() {
        return sendTimeEndH;
    }

    /**
     * 送り可能時間終了分 .を取得します。
     * 
     * @return 送り可能時間終了分 .
     */
    public String getSendTimeEndM() {
        return sendTimeEndM;
    }

    /**
     * 送り可能時間有無 .を取得します。
     * 
     * @return 送り可能時間有無 .
     */
    public String getSendTimeFlg() {
        return sendTimeFlg;
    }

    /**
     * シニア年齢From .を取得します。
     * 
     * @return シニア年齢From .
     */
    public String getSeniorAgeFrom() {
        return seniorAgeFrom;
    }

    /**
     * シャトルバス予約コメント .を取得します。
     * 
     * @return シャトルバス予約コメント .
     */
    public String getShuttleBusBookCmt() {
        return shuttleBusBookCmt;
    }

    /**
     * シャトルバス予約有無 .を取得します。
     * 
     * @return シャトルバス予約有無 .
     */
    public String getShuttleBusBookFlg() {
        return shuttleBusBookFlg;
    }

    /**
     * シャトルバス有無 .を取得します。
     * 
     * @return シャトルバス有無 .
     */
    public String getShuttleBusFlg() {
        return shuttleBusFlg;
    }

    /**
     * シャトルバス運行備考 .を取得します。
     * 
     * @return シャトルバス運行備考 .
     */
    public String getShuttleBusMemo() {
        return shuttleBusMemo;
    }

    /**
     * スタートコース .を取得します。
     * 
     * @return スタートコース .
     */
    public String getStartCourse() {
        return startCourse;
    }

    /**
     * スタート時間 .を取得します。
     * 
     * @return スタート時間 .
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * スタート時 .を取得します。
     * 
     * @return スタート時 .
     */
    public String getStartTimeH() {
        return startTimeH;
    }

    /**
     * スタート分　.を取得します。
     * 
     * @return スタート分　.
     */
    public String getStartTimeM() {
        return startTimeM;
    }

    /**
     * JRと私鉄の区分.を取得します。
     * 
     * @return JRと私鉄の区分.
     */
    public String getStationDiv() {
        return stationDiv;
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
     * 在庫制限フラグ .を取得します。
     * 
     * @return 在庫制限フラグ .
     */
    public String getStockControlFlg() {
        return stockControlFlg;
    }

    /**
     * 在庫名称（カナ）を取得します。
     * 
     * @return stockKana 在庫名称（カナ）
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
     * 在庫番号 .を取得します。
     * 
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
     * タクシー時間 .を取得します。
     * 
     * @return タクシー時間 .
     */
    public String getTaxiTime() {
        return taxiTime;
    }

    /**
     * 提供期間終了日 .を取得します。
     * 
     * @return 提供期間終了日 .
     */
    @Override
    public String getTermEndD() {
        return termEndD;
    }

    /**
     * 提供期間終了月 .を取得します。
     * 
     * @return 提供期間終了月 .
     */
    @Override
    public String getTermEndM() {
        return termEndM;
    }

    /**
     * 提供期間終了年 .を取得します。
     * 
     * @return 提供期間終了年 .
     */
    @Override
    public String getTermEndY() {
        return termEndY;
    }

    /**
     * 提供期間終了年月日 .を取得します。
     * 
     * @return 提供期間終了年月日 .
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * 提供期間開始日 .を取得します。
     * 
     * @return 提供期間開始日 .
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * 提供期間開始月 .を取得します。
     * 
     * @return 提供期間開始月 .
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * 提供期間開始年 .を取得します。
     * 
     * @return 提供期間開始年 .
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * 提供期間開始年月日 .を取得します。
     * 
     * @return 提供期間開始年月日 .
     */
    public String getTermFromYmd() {
        return termFromYmd;
    }

    /**
     * バス停より徒歩時間 .を取得します。
     * 
     * @return バス停より徒歩時間 .
     */
    public String getToBusStaTime() {
        return toBusStaTime;
    }

    /**
     * 駅より徒歩時間 .を取得します。
     * 
     * @return 駅より徒歩時間 .
     */
    public String getToStationWalktime() {
        return toStationWalktime;
    }

    /**
     * 有効期間 .を取得します。
     * 
     * @return 有効期間 .
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * バウチャーレス可否 .を取得します。
     * 
     * @return バウチャーレス可否 .
     */
    public String getVoucherFlg() {
        return voucherFlg;
    }

    /**
     * バウチャー券案内文（漢字） .を取得します。
     * 
     * @return バウチャー券案内文（漢字） .
     */
    public String getVoucherIntroKanji() {
        return voucherIntroKanji;
    }

    /**
     * @param accessIc
     *            The accessIc to set.
     */
    public void setAccessIc(String accessIc) {
        this.accessIc = accessIc;
    }

    /**
     * @param accessTime
     *            The accessTime to set.
     */
    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * エリアコード .を設定します。
     * 
     * @param areaCd
     *            エリアコード .
     */
    public void setAreaCd(String areaCd) {
        this.areaCd = areaCd;
    }

    /**
     * 地区大分類を設定します。
     * 
     * @param areaDaiCd
     *            地区大分類
     */
    public void setAreaDaiCd(String areaDaiCd) {
        this.areaDaiCd = areaDaiCd;
    }

    /**
     * 地区名（カナ）を設定します。
     * 
     * @param areaKana
     *            地区名（カナ）
     */
    public void setAreaKana(String areaKana) {
        this.areaKana = areaKana;
    }

    /**
     * 地区名を設定します。
     * 
     * @param areaNm
     *            地区名
     */
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    /**
     * 地区小分類を設定します。
     * 
     * @param areaShoCd
     *            地区小分類
     */
    public void setAreaShoCd(String areaShoCd) {
        this.areaShoCd = areaShoCd;
    }

    /**
     * @param autoRoadway
     *            The autoRoadway to set.
     */
    public void setAutoRoadway(String autoRoadway) {
        this.autoRoadway = autoRoadway;
    }

    /**
     * @param availableDistance
     *            The availableDistance to set.
     */
    public void setAvailableDistance(String availableDistance) {
        this.availableDistance = availableDistance;
    }

    /**
     * @param bookKind
     *            The bookKind to set.
     */
    public void setBookKind(String bookKind) {
        this.bookKind = bookKind;
    }

    /**
     * @param bookPurpose
     *            The bookPurpose to set.
     */
    public void setBookPurpose(String bookPurpose) {
        this.bookPurpose = bookPurpose;
    }

    /**
     * @param busDestination
     *            The busDestination to set.
     */
    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    /**
     * @param bs
     *            The busStation to set.
     */
    public void setBusStation(String bs) {
        this.busStation = bs;
    }

    /**
     * @param busTimetable
     *            The busTimetable to set.
     */
    public void setBusTimetable(String busTimetable) {
        this.busTimetable = busTimetable;
    }

    /**
     * キャディ料金２B_土曜休日 .を設定します。
     * 
     * @param caddieCharge2bHoliday
     *            キャディ料金２B_土曜休日 .
     */
    public void setCaddieCharge2bHoliday(String caddieCharge2bHoliday) {
        this.caddieCharge2bHoliday = caddieCharge2bHoliday;
    }

    /**
     * キャディ料金２B_平日 .を設定します。
     * 
     * @param caddieCharge2bWeekday
     *            キャディ料金２B_平日 .
     */
    public void setCaddieCharge2bWeekday(String caddieCharge2bWeekday) {
        this.caddieCharge2bWeekday = caddieCharge2bWeekday;
    }

    /**
     * キャディ料金３B_土曜休日 .を設定します。
     * 
     * @param caddieCharge3bHoliday
     *            キャディ料金３B_土曜休日 .
     */
    public void setCaddieCharge3bHoliday(String caddieCharge3bHoliday) {
        this.caddieCharge3bHoliday = caddieCharge3bHoliday;
    }

    /**
     * キャディ料金３B_平日 .を設定します。
     * 
     * @param caddieCharge3bWeekday
     *            キャディ料金３B_平日 .
     */
    public void setCaddieCharge3bWeekday(String caddieCharge3bWeekday) {
        this.caddieCharge3bWeekday = caddieCharge3bWeekday;
    }

    /**
     * キャディ料金４B_土曜休日 .を設定します。
     * 
     * @param caddieCharge4bHoliday
     *            キャディ料金４B_土曜休日 .
     */
    public void setCaddieCharge4bHoliday(String caddieCharge4bHoliday) {
        this.caddieCharge4bHoliday = caddieCharge4bHoliday;
    }

    /**
     * キャディ料金４B_平日 .を設定します。
     * 
     * @param caddieCharge4bWeekday
     *            キャディ料金４B_平日 .
     */
    public void setCaddieCharge4bWeekday(String caddieCharge4bWeekday) {
        this.caddieCharge4bWeekday = caddieCharge4bWeekday;
    }

    /**
     * @param caddieChargeDiv
     *            The caddieChargeDiv to set.
     */
    public void setCaddieChargeDiv(String caddieChargeDiv) {
        this.caddieChargeDiv = caddieChargeDiv;
    }

    /**
     * 料金単位区分 .を設定します。
     * 
     * @param chargeDiv
     *            料金単位区分 .
     */
    public void setChargeDiv(String chargeDiv) {
        this.chargeDiv = chargeDiv;
    }

    /**
     * @param contactFlg
     *            The contactFlg to set.
     */
    public void setContactFlg(String contactFlg) {
        this.contactFlg = contactFlg;
    }

    /**
     * @param countyRoadway
     *            The countyRoadway to set.
     */
    public void setCountyRoadway(String countyRoadway) {
        this.countyRoadway = countyRoadway;
    }

    /**
     * @param courseDistance1
     *            The courseDistance1 to set.
     */
    public void setCourseDistance1(String courseDistance1) {
        this.courseDistance1 = courseDistance1;
    }

    /**
     * @param courseDistance2
     *            The courseDistance2 to set.
     */
    public void setCourseDistance2(String courseDistance2) {
        this.courseDistance2 = courseDistance2;
    }

    /**
     * @param courseDistance3
     *            The courseDistance3 to set.
     */
    public void setCourseDistance3(String courseDistance3) {
        this.courseDistance3 = courseDistance3;
    }

    /**
     * @param courseDistance4
     *            The courseDistance4 to set.
     */
    public void setCourseDistance4(String courseDistance4) {
        this.courseDistance4 = courseDistance4;
    }

    /**
     * @param courseHole1
     *            The courseHole1 to set.
     */
    public void setCourseHole1(String courseHole1) {
        this.courseHole1 = courseHole1;
    }

    /**
     * @param courseHole2
     *            The courseHole2 to set.
     */
    public void setCourseHole2(String courseHole2) {
        this.courseHole2 = courseHole2;
    }

    /**
     * @param courseHole3
     *            The courseHole3 to set.
     */
    public void setCourseHole3(String courseHole3) {
        this.courseHole3 = courseHole3;
    }

    /**
     * @param courseHole4
     *            The courseHole4 to set.
     */
    public void setCourseHole4(String courseHole4) {
        this.courseHole4 = courseHole4;
    }

    /**
     * @param courseName1
     *            The courseName1 to set.
     */
    public void setCourseName1(String courseName1) {
        this.courseName1 = courseName1;
    }

    /**
     * @param courseName2
     *            The courseName2 to set.
     */
    public void setCourseName2(String courseName2) {
        this.courseName2 = courseName2;
    }

    /**
     * @param courseName3
     *            The courseName3 to set.
     */
    public void setCourseName3(String courseName3) {
        this.courseName3 = courseName3;
    }

    /**
     * @param courseName4
     *            The courseName4 to set.
     */
    public void setCourseName4(String courseName4) {
        this.courseName4 = courseName4;
    }

    /**
     * @param coursePar1
     *            The coursePar1 to set.
     */
    public void setCoursePar1(String coursePar1) {
        this.coursePar1 = coursePar1;
    }

    /**
     * @param coursePar2
     *            The coursePar2 to set.
     */
    public void setCoursePar2(String coursePar2) {
        this.coursePar2 = coursePar2;
    }

    /**
     * @param coursePar3
     *            The coursePar3 to set.
     */
    public void setCoursePar3(String coursePar3) {
        this.coursePar3 = coursePar3;
    }

    /**
     * @param coursePar4
     *            The coursePar4 to set.
     */
    public void setCoursePar4(String coursePar4) {
        this.coursePar4 = coursePar4;
    }

    /**
     * @param customerMsFlg
     *            The customerMsFlg to set.
     */
    public void setCustomerMsFlg(String customerMsFlg) {
        this.customerMsFlg = customerMsFlg;
    }

    /**
     * @param dealFee
     *            The dealFee to set.
     */
    public void setDealFee(String dealFee) {
        this.dealFee = dealFee;
    }

    /**
     * @param dealFeeFlg
     *            The dealFeeFlg to set.
     */
    public void setDealFeeFlg(String dealFeeFlg) {
        this.dealFeeFlg = dealFeeFlg;
    }

    /**
     * @param dealFeeType
     *            The dealFeeType to set.
     */
    public void setDealFeeType(String dealFeeType) {
        this.dealFeeType = dealFeeType;
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
     * @param freelyColumn
     *            The freelyColumn to set.
     */
    public void setFreelyColumn(String freelyColumn) {
        this.freelyColumn = freelyColumn;
    }

    /**
     * @param genreralRoadway
     *            The genreralRoadway to set.
     */
    public void setGenreralRoadway(String genreralRoadway) {
        this.genreralRoadway = genreralRoadway;
    }

    /**
     * @param golfSpotDepart1
     *            The golfSpotDepart1 to set.
     */
    public void setGolfSpotDepart1(String golfSpotDepart1) {
        this.golfSpotDepart1 = golfSpotDepart1;
        if (!StringUtil.isEmpty(this.golfSpotDepart1)) {
            this.golfSpotDepartH1 = golfSpotDepart1.substring(0, 2);
            this.golfSpotDepartM1 = golfSpotDepart1.substring(2, 4);
        } else {
            this.golfSpotDepartH1 = "";
            this.golfSpotDepartM1 = "";
        }
    }

    /**
     * @param golfSpotDepart2
     *            The golfSpotDepart2 to set.
     */
    public void setGolfSpotDepart2(String golfSpotDepart2) {
        this.golfSpotDepart2 = golfSpotDepart2;
        if (!StringUtil.isEmpty(this.golfSpotDepart2)) {
            this.golfSpotDepartH2 = golfSpotDepart2.substring(0, 2);
            this.golfSpotDepartM2 = golfSpotDepart2.substring(2, 4);
        } else {
            this.golfSpotDepartH2 = "";
            this.golfSpotDepartM2 = "";
        }
    }

    /**
     * @param golfSpotDepart3
     *            The golfSpotDepart3 to set.
     */
    public void setGolfSpotDepart3(String golfSpotDepart3) {
        this.golfSpotDepart3 = golfSpotDepart3;
        if (!StringUtil.isEmpty(this.golfSpotDepart3)) {
            this.golfSpotDepartH3 = golfSpotDepart3.substring(0, 2);
            this.golfSpotDepartM3 = golfSpotDepart3.substring(2, 4);
        } else {
            this.golfSpotDepartH3 = "";
            this.golfSpotDepartM3 = "";
        }
    }

    /**
     * @param golfSpotDepartH1
     *            The golfSpotDepartH1 to set.
     */
    public void setGolfSpotDepartH1(String golfSpotDepartH1) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartH1)) {
            this.golfSpotDepartH1 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartH1).trim(), 2, '0');
        } else {
            this.golfSpotDepartH1 = golfSpotDepartH1;
        }

    }

    /**
     * @param golfSpotDepartH2
     *            The golfSpotDepartH2 to set.
     */
    public void setGolfSpotDepartH2(String golfSpotDepartH2) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartH2)) {
            this.golfSpotDepartH2 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartH2).trim(), 2, '0');
        } else {
            this.golfSpotDepartH2 = golfSpotDepartH2;
        }
    }

    /**
     * @param golfSpotDepartH3
     *            The golfSpotDepartH3 to set.
     */
    public void setGolfSpotDepartH3(String golfSpotDepartH3) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartH3)) {
            this.golfSpotDepartH3 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartH3).trim(), 2, '0');
        } else {
            this.golfSpotDepartH3 = golfSpotDepartH3;
        }

    }

    /**
     * @param golfSpotDepartM1
     *            The golfSpotDepartM1 to set.
     */
    public void setGolfSpotDepartM1(String golfSpotDepartM1) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartM1)) {
            this.golfSpotDepartM1 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartM1).trim(), 2, '0');
        } else {
            this.golfSpotDepartM1 = golfSpotDepartM1;
        }

    }

    /**
     * @param golfSpotDepartM2
     *            The golfSpotDepartM2 to set.
     */
    public void setGolfSpotDepartM2(String golfSpotDepartM2) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartM2)) {
            this.golfSpotDepartM2 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartM2).trim(), 2, '0');
        } else {
            this.golfSpotDepartM2 = golfSpotDepartM2;
        }

    }

    /**
     * @param golfSpotDepartM3
     *            The golfSpotDepartM3 to set.
     */
    public void setGolfSpotDepartM3(String golfSpotDepartM3) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartM3)) {
            this.golfSpotDepartM3 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartM3).trim(), 2, '0');
        } else {
            this.golfSpotDepartM3 = golfSpotDepartM3;
        }

    }

    /**
     * 分類コード .を設定します。
     * 
     * @param goodsKindCd
     *            分類コード .
     */
    public void setGoodsKindCd(String goodsKindCd) {
        this.goodsKindCd = goodsKindCd;
    }

    /**
     * @param highway
     *            The highway to set.
     */
    public void setHighway(String highway) {
        this.highway = highway;
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
     *            The informFax to set.
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
     * カート料金２B_土曜休日 .を設定します。
     * 
     * @param kartCharge2bHoliday
     *            カート料金２B_土曜休日 .
     */
    public void setKartCharge2bHoliday(String kartCharge2bHoliday) {
        this.kartCharge2bHoliday = kartCharge2bHoliday;
    }

    /**
     * カート料金２B_平日 .を設定します。
     * 
     * @param kartCharge2bWeekday
     *            カート料金２B_平日 .
     */
    public void setKartCharge2bWeekday(String kartCharge2bWeekday) {
        this.kartCharge2bWeekday = kartCharge2bWeekday;
    }

    /**
     * カート料金３B_土曜休日 .を設定します。
     * 
     * @param kartCharge3bHoliday
     *            カート料金３B_土曜休日 .
     */
    public void setKartCharge3bHoliday(String kartCharge3bHoliday) {
        this.kartCharge3bHoliday = kartCharge3bHoliday;
    }

    /**
     * カート料金３B_平日 .を設定します。
     * 
     * @param kartCharge3bWeekday
     *            カート料金３B_平日 .
     */
    public void setKartCharge3bWeekday(String kartCharge3bWeekday) {
        this.kartCharge3bWeekday = kartCharge3bWeekday;
    }

    /**
     * カート料金４B_土曜休日 .を設定します。
     * 
     * @param kartCharge4bHoliday
     *            カート料金４B_土曜休日 .
     */
    public void setKartCharge4bHoliday(String kartCharge4bHoliday) {
        this.kartCharge4bHoliday = kartCharge4bHoliday;
    }

    /**
     * カート料金４B_平日 .を設定します。
     * 
     * @param kartCharge4bWeekday
     *            カート料金４B_平日 .
     */
    public void setKartCharge4bWeekday(String kartCharge4bWeekday) {
        this.kartCharge4bWeekday = kartCharge4bWeekday;
    }

    /**
     * カート料金区分 .を設定します。
     * 
     * @param kartChargeDiv
     *            カート料金区分 .
     */
    public void setKartChargeDiv(String kartChargeDiv) {
        this.kartChargeDiv = kartChargeDiv;
    }

    /**
     * @param liquidateDay
     *            The liquidateDay to set.
     */
    public void setLiquidateDay(String liquidateDay) {
        this.liquidateDay = liquidateDay;
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
     * @param meetTimeBegin
     *            The meetTimeBegin to set.
     */
    public void setMeetTimeBegin(String meetTimeBegin) {
        this.meetTimeBegin = meetTimeBegin;
        if (!StringUtil.isEmpty(this.meetTimeBegin)) {
            this.meetTimeBeginH = meetTimeBegin.substring(0, 2);
            this.meetTimeBeginM = meetTimeBegin.substring(2, 4);
        } else {
            this.meetTimeBeginH = "";
            this.meetTimeBeginM = "";
        }
    }

    /**
     * @param meetTimeBeginH
     *            The meetTimeBeginH to set.
     */
    public void setMeetTimeBeginH(String meetTimeBeginH) {
        if (DKikakuWebUtil.isNumber(meetTimeBeginH)) {
            this.meetTimeBeginH = StringUtil.lpad(
                    StringUtil.toHalf(meetTimeBeginH).trim(), 2, '0');
        } else {
            this.meetTimeBeginH = meetTimeBeginH;
        }

    }

    /**
     * @param meetTimeBeginM
     *            The meetTimeBeginM to set.
     */
    public void setMeetTimeBeginM(String meetTimeBeginM) {
        if (DKikakuWebUtil.isNumber(meetTimeBeginM)) {
            this.meetTimeBeginM = StringUtil.lpad(
                    StringUtil.toHalf(meetTimeBeginM).trim(), 2, '0');
        } else {
            this.meetTimeBeginM = meetTimeBeginM;
        }

    }

    /**
     * @param meetTimeEnd
     *            The meetTimeEnd to set.
     */
    public void setMeetTimeEnd(String meetTimeEnd) {
        this.meetTimeEnd = meetTimeEnd;
        if (!StringUtil.isEmpty(this.meetTimeEnd)) {
            this.meetTimeEndH = meetTimeEnd.substring(0, 2);
            this.meetTimeEndM = meetTimeEnd.substring(2, 4);
        } else {
            this.meetTimeEndH = "";
            this.meetTimeEndM = "";
        }
    }

    /**
     * @param meetTimeEndH
     *            The meetTimeEndH to set.
     */
    public void setMeetTimeEndH(String meetTimeEndH) {
        if (DKikakuWebUtil.isNumber(meetTimeEndH)) {
            this.meetTimeEndH = StringUtil.lpad(StringUtil.toHalf(meetTimeEndH)
                    .trim(), 2, '0');
        } else {
            this.meetTimeEndH = meetTimeEndH;
        }

    }

    /**
     * @param meetTimeEndM
     *            The meetTimeEndM to set.
     */
    public void setMeetTimeEndM(String meetTimeEndM) {
        if (DKikakuWebUtil.isNumber(meetTimeEndM)) {
            this.meetTimeEndM = StringUtil.lpad(StringUtil.toHalf(meetTimeEndM)
                    .trim(), 2, '0');
        } else {
            this.meetTimeEndM = meetTimeEndM;
        }

    }

    /**
     * @param meetTimeFlg
     *            The meetTimeFlg to set.
     */
    public void setMeetTimeFlg(String meetTimeFlg) {
        this.meetTimeFlg = meetTimeFlg;
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
     * @param msDiv
     *            The msDiv to set.
     */
    public void setMsDiv(String msDiv) {
        this.msDiv = msDiv;
    }

    /**
     * @param msFlg
     *            The msFlg to set.
     */
    public void setMsFlg(String msFlg) {
        this.msFlg = msFlg;
    }

    /**
     * @param msMemo
     *            The msMemo to set.
     */
    public void setMsMemo(String msMemo) {
        this.msMemo = msMemo;
    }

    /**
     * @param msTerm
     *            The msTerm to set.
     */
    public void setMsTerm(String msTerm) {
        this.msTerm = msTerm;
    }

    /**
     * @param nationalRoadway
     *            The nationalRoadway to set.
     */
    public void setNationalRoadway(String nationalRoadway) {
        this.nationalRoadway = nationalRoadway;
    }

    /**
     * @param nearestRoute
     *            The nearestRoute to set.
     */
    public void setNearestRoute(String nearestRoute) {
        this.nearestRoute = nearestRoute;
    }

    /**
     * @param nearestStation
     *            The nearestStation to set.
     */
    public void setNearestStation(String nearestStation) {
        this.nearestStation = nearestStation;
    }

    /**
     * @param nearestStationDepart1
     *            The nearestStationDepart1 to set.
     */
    public void setNearestStationDepart1(String nearestStationDepart1) {
        this.nearestStationDepart1 = nearestStationDepart1;
        if (!StringUtil.isEmpty(this.nearestStationDepart1)) {
            this.nearestStationDepartH1 = nearestStationDepart1.substring(0, 2);
            this.nearestStationDepartM1 = nearestStationDepart1.substring(2, 4);
        } else {
            this.nearestStationDepartH1 = "";
            this.nearestStationDepartM1 = "";
        }
    }

    /**
     * @param nearestStationDepart2
     *            The nearestStationDepart2 to set.
     */
    public void setNearestStationDepart2(String nearestStationDepart2) {
        this.nearestStationDepart2 = nearestStationDepart2;
        if (!StringUtil.isEmpty(this.nearestStationDepart2)) {
            this.nearestStationDepartH2 = nearestStationDepart2.substring(0, 2);
            this.nearestStationDepartM2 = nearestStationDepart2.substring(2, 4);
        } else {
            this.nearestStationDepartH2 = "";
            this.nearestStationDepartM2 = "";
        }
    }

    /**
     * @param nearestStationDepart3
     *            The nearestStationDepart3 to set.
     */
    public void setNearestStationDepart3(String nearestStationDepart3) {
        this.nearestStationDepart3 = nearestStationDepart3;
        if (!StringUtil.isEmpty(this.nearestStationDepart3)) {
            this.nearestStationDepartH3 = nearestStationDepart3.substring(0, 2);
            this.nearestStationDepartM3 = nearestStationDepart3.substring(2, 4);
        } else {
            this.nearestStationDepartH3 = "";
            this.nearestStationDepartM3 = "";
        }
    }

    /**
     * @param nearestStationDepartH1
     *            The nearestStationDepartH1 to set.
     */
    public void setNearestStationDepartH1(String nearestStationDepartH1) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartH1)) {
            this.nearestStationDepartH1 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartH1).trim(), 2, '0');
        } else {
            this.nearestStationDepartH1 = nearestStationDepartH1;
        }

    }

    /**
     * @param nearestStationDepartH2
     *            The nearestStationDepartH2 to set.
     */
    public void setNearestStationDepartH2(String nearestStationDepartH2) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartH2)) {
            this.nearestStationDepartH2 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartH2).trim(), 2, '0');
        } else {
            this.nearestStationDepartH2 = nearestStationDepartH2;
        }
    }

    /**
     * @param nearestStationDepartH3
     *            The nearestStationDepartH3 to set.
     */
    public void setNearestStationDepartH3(String nearestStationDepartH3) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartH3)) {
            this.nearestStationDepartH3 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartH3).trim(), 2, '0');
        } else {
            this.nearestStationDepartH3 = nearestStationDepartH3;
        }

    }

    /**
     * @param nearestStationDepartM1
     *            The nearestStationDepartM1 to set.
     */
    public void setNearestStationDepartM1(String nearestStationDepartM1) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartM1)) {
            this.nearestStationDepartM1 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartM1).trim(), 2, '0');
        } else {
            this.nearestStationDepartM1 = nearestStationDepartM1;
        }
    }

    /**
     * @param nearestStationDepartM2
     *            The nearestStationDepartM2 to set.
     */
    public void setNearestStationDepartM2(String nearestStationDepartM2) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartM2)) {
            this.nearestStationDepartM2 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartM2).trim(), 2, '0');
        } else {
            this.nearestStationDepartM2 = nearestStationDepartM2;
        }

    }

    /**
     * @param nearestStationDepartM3
     *            The nearestStationDepartM3 to set.
     */
    public void setNearestStationDepartM3(String nearestStationDepartM3) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartM3)) {
            this.nearestStationDepartM3 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartM3).trim(), 2, '0');
        } else {
            this.nearestStationDepartM3 = nearestStationDepartM3;
        }

    }

    /**
     * @param onePersonFlg
     *            1名料金フラグ.
     */
    public void setOnePersonFlg(String onePersonFlg) {
        this.onePersonFlg = onePersonFlg;
    }

    /**
     * @param ownerNm
     *            The ownerNm to set.
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * 個札券出力指定有無 .を設定します。
     * 
     * @param personalTicketPrintFlg
     *            個札券出力指定有無 .
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
    }

    /**
     * @param playWithCaddieFlg
     *            The playWithCaddieFlg to set.
     */
    public void setPlayWithCaddieFlg(String playWithCaddieFlg) {
        this.playWithCaddieFlg = playWithCaddieFlg;
    }

    /**
     * 都道府県コード .を設定します。
     * 
     * @param prefecturesCd
     *            都道府県コード .
     */
    public void setPrefecturesCd(String prefecturesCd) {
        this.prefecturesCd = prefecturesCd;
    }

    /**
     * 地域コード .を設定します。
     * 
     * @param regionCd
     *            地域コード .
     */
    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    /**
     * @param reserveCmt
     *            The reserveCmt to set.
     */
    public void setReserveCmt(String reserveCmt) {
        this.reserveCmt = reserveCmt;
    }

    /**
     * @param reserveFlg
     *            The reserveFlg to set.
     */
    public void setReserveFlg(String reserveFlg) {
        this.reserveFlg = reserveFlg;
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
     * @param salesPoint
     *            The salesPoint to set.
     */
    public void setSalesPoint(String salesPoint) {
        this.salesPoint = salesPoint;
    }

    /**
     * @param selfPlay2b
     *            The selfPlay2b to set.
     */
    public void setSelfPlay2b(String selfPlay2b) {
        this.selfPlay2b = selfPlay2b;
    }

    /**
     * @param selfPlay3b
     *            The selfPlay3b to set.
     */
    public void setSelfPlay3b(String selfPlay3b) {
        this.selfPlay3b = selfPlay3b;
    }

    /**
     * @param selfPlay4b
     *            The selfPlay4b to set.
     */
    public void setSelfPlay4b(String selfPlay4b) {
        this.selfPlay4b = selfPlay4b;
    }

    /**
     * @param selfPlayDiv
     *            The selfPlayDiv to set.
     */
    public void setSelfPlayDiv(String selfPlayDiv) {
        this.selfPlayDiv = selfPlayDiv;
    }

    /**
     * @param selfPlayFlg
     *            The selfPlayFlg to set.
     */
    public void setSelfPlayFlg(String selfPlayFlg) {
        this.selfPlayFlg = selfPlayFlg;
    }

    /**
     * @param sendTimeBegin
     *            The sendTimeBegin to set.
     */
    public void setSendTimeBegin(String sendTimeBegin) {
        this.sendTimeBegin = sendTimeBegin;
        if (!StringUtil.isEmpty(this.sendTimeBegin)) {
            this.sendTimeBeginH = sendTimeBegin.substring(0, 2);
            this.sendTimeBeginM = sendTimeBegin.substring(2, 4);
        } else {
            this.sendTimeBeginH = "";
            this.sendTimeBeginM = "";
        }
    }

    /**
     * @param sendTimeBeginH
     *            The sendTimeBeginH to set.
     */
    public void setSendTimeBeginH(String sendTimeBeginH) {
        if (DKikakuWebUtil.isNumber(sendTimeBeginH)) {
            this.sendTimeBeginH = StringUtil.lpad(
                    StringUtil.toHalf(sendTimeBeginH).trim(), 2, '0');
        } else {
            this.sendTimeBeginH = sendTimeBeginH;
        }

    }

    /**
     * @param sendTimeBeginM
     *            The sendTimeBeginM to set.
     */
    public void setSendTimeBeginM(String sendTimeBeginM) {
        if (DKikakuWebUtil.isNumber(sendTimeBeginM)) {
            this.sendTimeBeginM = StringUtil.lpad(
                    StringUtil.toHalf(sendTimeBeginM).trim(), 2, '0');
        } else {
            this.sendTimeBeginM = sendTimeBeginM;
        }

    }

    /**
     * @param sendTimeEnd
     *            The sendTimeEnd to set.
     */
    public void setSendTimeEnd(String sendTimeEnd) {
        this.sendTimeEnd = sendTimeEnd;
        if (!StringUtil.isEmpty(this.sendTimeEnd)) {
            this.sendTimeEndH = sendTimeEnd.substring(0, 2);
            this.sendTimeEndM = sendTimeEnd.substring(2, 4);
        } else {
            this.sendTimeEndH = "";
            this.sendTimeEndM = "";
        }
    }

    /**
     * @param sendTimeEndH
     *            The sendTimeEndH to set.
     */
    public void setSendTimeEndH(String sendTimeEndH) {
        if (DKikakuWebUtil.isNumber(sendTimeEndH)) {
            this.sendTimeEndH = StringUtil.lpad(StringUtil.toHalf(sendTimeEndH)
                    .trim(), 2, '0');
        } else {
            this.sendTimeEndH = sendTimeEndH;
        }

    }

    /**
     * @param sendTimeEndM
     *            The sendTimeEndM to set.
     */
    public void setSendTimeEndM(String sendTimeEndM) {
        if (DKikakuWebUtil.isNumber(sendTimeEndM)) {
            this.sendTimeEndM = StringUtil.lpad(StringUtil.toHalf(sendTimeEndM)
                    .trim(), 2, '0');
        } else {
            this.sendTimeEndM = sendTimeEndM;
        }

    }

    /**
     * @param sendTimeFlg
     *            The sendTimeFlg to set.
     */
    public void setSendTimeFlg(String sendTimeFlg) {
        this.sendTimeFlg = sendTimeFlg;
    }

    /**
     * シニア年齢From .を設定します。
     * 
     * @param seniorAgeFrom
     *            シニア年齢From .
     */
    public void setSeniorAgeFrom(String seniorAgeFrom) {
        this.seniorAgeFrom = seniorAgeFrom;
    }

    /**
     * @param shuttleBusBookCmt
     *            The shuttleBusBookCmt to set.
     */
    public void setShuttleBusBookCmt(String shuttleBusBookCmt) {
        this.shuttleBusBookCmt = shuttleBusBookCmt;
    }

    /**
     * @param shuttleBusBookFlg
     *            The shuttleBusBookFlg to set.
     */
    public void setShuttleBusBookFlg(String shuttleBusBookFlg) {
        this.shuttleBusBookFlg = shuttleBusBookFlg;
    }

    /**
     * @param shuttleBusFlg
     *            The shuttleBusFlg to set.
     */
    public void setShuttleBusFlg(String shuttleBusFlg) {
        this.shuttleBusFlg = shuttleBusFlg;
    }

    /**
     * @param shuttleBusMemo
     *            The shuttleBusMemo to set.
     */
    public void setShuttleBusMemo(String shuttleBusMemo) {
        this.shuttleBusMemo = shuttleBusMemo;
    }

    /**
     * @param startCourse
     *            The startCourse to set.
     */
    public void setStartCourse(String startCourse) {
        this.startCourse = startCourse;
    }

    /**
     * @param startTime
     *            The startTime to set.
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
        if (!StringUtil.isEmpty(this.startTime)) {
            this.startTimeH = startTime.substring(0, 2);
            this.startTimeM = startTime.substring(2, 4);
        } else {
            this.startTimeH = "";
            this.startTimeM = "";
        }
    }

    /**
     * @param startTimeH
     *            The startTimeH to set.
     */
    public void setStartTimeH(String startTimeH) {
        if (DKikakuWebUtil.isNumber(startTimeH)) {
            this.startTimeH = StringUtil.lpad(StringUtil.toHalf(startTimeH)
                    .trim(), 2, '0');
        } else {
            this.startTimeH = startTimeH;
        }
    }

    /**
     * @param startTimeM
     *            The startTimeM to set.
     */
    public void setStartTimeM(String startTimeM) {
        if (DKikakuWebUtil.isNumber(startTimeM)) {
            this.startTimeM = StringUtil.lpad(StringUtil.toHalf(startTimeM)
                    .trim(), 2, '0');
        } else {
            this.startTimeM = startTimeM;
        }
    }

    /**
     * @param stationDiv
     *            JRと私鉄の区分
     */
    public void setStationDiv(String stationDiv) {
        this.stationDiv = stationDiv;
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
     * 在庫制限フラグ .を設定します。
     * 
     * @param stockControlFlg
     *            在庫制限フラグ .
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
     *            The stockNo to set.
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
     * @param taxiTime
     *            The taxiTime to set.
     */
    public void setTaxiTime(String taxiTime) {
        this.taxiTime = taxiTime;
    }

    /**
     * @param termEndD
     *            The termEndD to set.
     */
    @Override
    public void setTermEndD(String termEndD) {
        if (DKikakuWebUtil.isNumber(termEndD)) {
            this.termEndD = StringUtil.lpad(StringUtil.toHalf(termEndD).trim(),
                    2, '0');
        } else {
            this.termEndD = termEndD;
        }

    }

    /**
     * @param termEndM
     *            The termEndM to set.
     */
    @Override
    public void setTermEndM(String termEndM) {
        if (DKikakuWebUtil.isNumber(termEndM)) {
            this.termEndM = StringUtil.lpad(StringUtil.toHalf(termEndM).trim(),
                    2, '0');
        } else {
            this.termEndM = termEndM;
        }
    }

    /**
     * @param termEndY
     *            The termEndY to set.
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = StringUtil.toHalf(termEndY);
    }

    /**
     * @param termEndYmd
     *            The termEndYmd to set.
     */
    public void setTermEndYmd(String termEndYmd) {
        this.termEndYmd = termEndYmd;
        if (!StringUtil.isEmpty(this.termEndYmd)) {
            this.termEndY = termEndYmd.substring(0, 4);
            this.termEndM = termEndYmd.substring(4, 6);
            this.termEndD = termEndYmd.substring(6, 8);
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
        if (DKikakuWebUtil.isNumber(termFromD)) {
            this.termFromD = StringUtil.lpad(StringUtil.toHalf(termFromD)
                    .trim(), 2, '0');
        } else {
            this.termFromD = termFromD;
        }
    }

    /**
     * @param termFromM
     *            The termFromM to set.
     */
    @Override
    public void setTermFromM(String termFromM) {
        if (DKikakuWebUtil.isNumber(termFromM)) {
            this.termFromM = StringUtil.lpad(StringUtil.toHalf(termFromM)
                    .trim(), 2, '0');
        } else {
            this.termFromM = termFromM;
        }
    }

    /**
     * @param termFromY
     *            The termFromY to set.
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = StringUtil.toHalf(termFromY);
    }

    /**
     * @param termFromYmd
     *            The termFromYmd to set.
     */
    public void setTermFromYmd(String termFromYmd) {
        this.termFromYmd = termFromYmd;

        if (!StringUtil.isEmpty(this.termFromYmd)) {
            this.termFromY = termFromYmd.substring(0, 4);
            this.termFromM = termFromYmd.substring(4, 6);
            this.termFromD = termFromYmd.substring(6, 8);
        } else {
            this.termFromY = "";
            this.termFromM = "";
            this.termFromD = "";
        }
    }

    /**
     * @param toBusStaTime
     *            The toBusStaTime to set.
     */
    public void setToBusStaTime(String toBusStaTime) {
        this.toBusStaTime = toBusStaTime;
    }

    /**
     * @param toStationWalktime
     *            The toStationWalktime to set.
     */
    public void setToStationWalktime(String toStationWalktime) {
        this.toStationWalktime = toStationWalktime;
    }

    /**
     * 有効期間 .を設定します。
     * 
     * @param validPeriod
     *            有効期間 .
     */
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    /**
     * バウチャーレス可否 .を設定します。
     * 
     * @param voucherFlg
     *            バウチャーレス可否 .
     */
    public void setVoucherFlg(String voucherFlg) {
        this.voucherFlg = voucherFlg;
    }

    /**
     * バウチャー券案内文（漢字） .を設定します。
     * 
     * @param voucherIntroKanji
     *            バウチャー券案内文（漢字） .
     */
    public void setVoucherIntroKanji(String voucherIntroKanji) {
        this.voucherIntroKanji = voucherIntroKanji;
    }
}
