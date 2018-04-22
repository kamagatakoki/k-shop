package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;

/**
 * [DP/RM]施設_ファミリー施設_スキー エンティティ
 * 
 * <pre>
 *   機能概要 ： 
 *              ゲレンデ設備１ ： そり滑り可能 (sledgeData)
 *              ゲレンデ設備２ ： スキー滑走可能 (skiData)
 *              ゲレンデ設備３ ： スノーエスカレーター (snowEscalator)
 *              ゲレンデ設備４ ： スノーチュービング (snowChu)
 *              ゲレンデ設備５ ： 滑り台（用具を使わない） (slideData)
 *              ゲレンデ設備６ ： ふわふわ（大型の玩具） (bigPlaything)
 *              ゲレンデ設備７ ： 雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等) (snowGoods)
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityFamilySki implements FacilityManageBodyKey {

    /** キッズ専用エリア有無 */
    private String areaForKidsFlg;

    /** 入場料_有料_大人_年齢 */
    private String entranceFeeAdultAge;

    /** 入場料_有料_大人_料金 */
    private String entranceFeeAdultCharge;

    /** 入場料_有料_大人 */
    private String entranceFeeAdultPay;

    /** 入場料_有料_小人_料金 */
    private String entranceFeeChildCharge;

    /** 入場料_有料_小人_年齢From */
    private String entranceFeeChildFrom;

    /** 入場料_有料_小人 */
    private String entranceFeeChildPay;

    /** 入場料_有料_小人_年齢To */
    private String entranceFeeChildTo;

    /** 入場料_有無 */
    private String entranceFeeFlg;

    /** 入場料_無料種類 */
    private String entranceFeeFree;

    /** 入場料_有料_時間 */
    private String entranceFeeHhPay;

    /** 入場料_有料_分 */
    private String entranceFeeMmPay;

    /** 入場料_有料種類 */
    private String entranceFeePay;

    /** 施設コード */
    private String facilityCd;

    /** 施設パターン */
    private String facilityPattern;

    /** ゲレンデ設備１_大人料金 （そり滑り可能） */
    private String gelandeChargeAdult1;

    /** ゲレンデ設備２_大人料金 （スキー滑走可能） */
    private String gelandeChargeAdult2;

    /** ゲレンデ設備３_大人料金 （スノーエスカレーター） */
    private String gelandeChargeAdult3;

    /** ゲレンデ設備４_大人料金 （スノーチュービング） */
    private String gelandeChargeAdult4;

    /** ゲレンデ設備５_大人料金 （滑り台（用具を使わない）） */
    private String gelandeChargeAdult5;

    /** ゲレンデ設備６_大人料金 （ふわふわ（大型の玩具）） */
    private String gelandeChargeAdult6;

    /** ゲレンデ設備７_大人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)） */
    private String gelandeChargeAdult7;

    /** ゲレンデ設備１_小人料金 （そり滑り可能） */
    private String gelandeChargeChild1;

    /** ゲレンデ設備２_小人料金 （スキー滑走可能） */
    private String gelandeChargeChild2;

    /** ゲレンデ設備３_小人料金 （スノーエスカレーター） */
    private String gelandeChargeChild3;

    /** ゲレンデ設備４_小人料金 （スノーチュービング） */
    private String gelandeChargeChild4;

    /** ゲレンデ設備５_小人料金 （滑り台（用具を使わない）） */
    private String gelandeChargeChild5;

    /** ゲレンデ設備６_小人料金 （ふわふわ（大型の玩具）） */
    private String gelandeChargeChild6;

    /** ゲレンデ設備７_小人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)） */
    private String gelandeChargeChild7;

    /** ゲレンデ設備１_料金有無 （そり滑り可能） */
    private String gelandeChargeFlg1;

    /** ゲレンデ設備２_料金有無 （スキー滑走可能） */
    private String gelandeChargeFlg2;

    /** ゲレンデ設備３_料金有無 （スノーエスカレーター） */
    private String gelandeChargeFlg3;

    /** ゲレンデ設備４_料金有無 （スノーチュービング） */
    private String gelandeChargeFlg4;

    /** ゲレンデ設備５_料金有無 （滑り台（用具を使わない）） */
    private String gelandeChargeFlg5;

    /** ゲレンデ設備６_料金有無 （ふわふわ（大型の玩具）） */
    private String gelandeChargeFlg6;

    /** ゲレンデ設備７_料金有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)） */
    private String gelandeChargeFlg7;

    /** ゲレンデ設備１_有無 （そり滑り可能） */
    private String gelandeFlg1;

    /** ゲレンデ設備２_有無 （スキー滑走可能） */
    private String gelandeFlg2;

    /** ゲレンデ設備３_有無 （スノーエスカレーター） */
    private String gelandeFlg3;

    /** ゲレンデ設備４_有無 （スノーチュービング） */
    private String gelandeFlg4;

    /** ゲレンデ設備５_有無 （滑り台（用具を使わない）） */
    private String gelandeFlg5;

    /** ゲレンデ設備６_有無 （ふわふわ（大型の玩具）） */
    private String gelandeFlg6;

    /** ゲレンデ設備７_有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)） */
    private String gelandeFlg7;

    /** 回答書種別 */
    private String kindFlg;

    /** その他設備１ */
    private String otherFacility1;

    /** その他設備２ */
    private String otherFacility2;

    /** その他設備３ */
    private String otherFacility3;

    /** その他設備４ */
    private String otherFacility4;

    /** その他特記事項 */
    private String otherSpCmt;

    /**
     * キッズ専用エリア有無を取得します。
     * 
     * @return キッズ専用エリア有無
     */
    public String getAreaForKidsFlg() {
        return areaForKidsFlg;
    }

    /**
     * 入場料_有料_大人_年齢を取得します。
     * 
     * @return 入場料_有料_大人_年齢
     */
    public String getEntranceFeeAdultAge() {
        return entranceFeeAdultAge;
    }

    /**
     * 入場料_有料_大人_料金を取得します。
     * 
     * @return 入場料_有料_大人_料金
     */
    public String getEntranceFeeAdultCharge() {
        return entranceFeeAdultCharge;
    }

    /**
     * 入場料_有料_大人を取得します。
     * 
     * @return 入場料_有料_大人
     */
    public String getEntranceFeeAdultPay() {
        return entranceFeeAdultPay;
    }

    /**
     * 入場料_有料_小人_料金を取得します。
     * 
     * @return 入場料_有料_小人_料金
     */
    public String getEntranceFeeChildCharge() {
        return entranceFeeChildCharge;
    }

    /**
     * 入場料_有料_小人_年齢Fromを取得します。
     * 
     * @return 入場料_有料_小人_年齢From
     */
    public String getEntranceFeeChildFrom() {
        return entranceFeeChildFrom;
    }

    /**
     * 入場料_有料_小人を取得します。
     * 
     * @return 入場料_有料_小人
     */
    public String getEntranceFeeChildPay() {
        return entranceFeeChildPay;
    }

    /**
     * 入場料_有料_小人_年齢Toを取得します。
     * 
     * @return 入場料_有料_小人_年齢To
     */
    public String getEntranceFeeChildTo() {
        return entranceFeeChildTo;
    }

    /**
     * 入場料_有無を取得します。
     * 
     * @return 入場料_有無
     */
    public String getEntranceFeeFlg() {
        return entranceFeeFlg;
    }

    /**
     * 入場料_無料種類を取得します。
     * 
     * @return 入場料_無料種類
     */
    public String getEntranceFeeFree() {
        return entranceFeeFree;
    }

    /**
     * 入場料_有料_時間を取得します。
     * 
     * @return 入場料_有料_時間
     */
    public String getEntranceFeeHhPay() {
        return entranceFeeHhPay;
    }

    /**
     * 入場料_有料_分を取得します。
     * 
     * @return 入場料_有料_分
     */
    public String getEntranceFeeMmPay() {
        return entranceFeeMmPay;
    }

    /**
     * 入場料_有料種類を取得します。
     * 
     * @return 入場料_有料種類
     */
    public String getEntranceFeePay() {
        return entranceFeePay;
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
     * ゲレンデ設備１_大人料金 （そり滑り可能）を取得します。
     * 
     * @return ゲレンデ設備１_大人料金 （そり滑り可能）
     */
    public String getGelandeChargeAdult1() {
        return gelandeChargeAdult1;
    }

    /**
     * ゲレンデ設備２_大人料金 （スキー滑走可能）を取得します。
     * 
     * @return ゲレンデ設備２_大人料金 （スキー滑走可能）
     */
    public String getGelandeChargeAdult2() {
        return gelandeChargeAdult2;
    }

    /**
     * ゲレンデ設備３_大人料金 （スノーエスカレーター）を取得します。
     * 
     * @return ゲレンデ設備３_大人料金 （スノーエスカレーター）
     */
    public String getGelandeChargeAdult3() {
        return gelandeChargeAdult3;
    }

    /**
     * ゲレンデ設備４_大人料金 （スノーチュービング）を取得します。
     * 
     * @return ゲレンデ設備４_大人料金 （スノーチュービング）
     */
    public String getGelandeChargeAdult4() {
        return gelandeChargeAdult4;
    }

    /**
     * ゲレンデ設備５_大人料金 （滑り台（用具を使わない））を取得します。
     * 
     * @return ゲレンデ設備５_大人料金 （滑り台（用具を使わない））
     */
    public String getGelandeChargeAdult5() {
        return gelandeChargeAdult5;
    }

    /**
     * ゲレンデ設備６_大人料金 （ふわふわ（大型の玩具））を取得します。
     * 
     * @return ゲレンデ設備６_大人料金 （ふわふわ（大型の玩具））
     */
    public String getGelandeChargeAdult6() {
        return gelandeChargeAdult6;
    }

    /**
     * ゲレンデ設備７_大人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を取得します。
     * 
     * @return ゲレンデ設備７_大人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public String getGelandeChargeAdult7() {
        return gelandeChargeAdult7;
    }

    /**
     * ゲレンデ設備１_小人料金 （そり滑り可能）を取得します。
     * 
     * @return ゲレンデ設備１_小人料金 （そり滑り可能）
     */
    public String getGelandeChargeChild1() {
        return gelandeChargeChild1;
    }

    /**
     * ゲレンデ設備２_小人料金 （スキー滑走可能）を取得します。
     * 
     * @return ゲレンデ設備２_小人料金 （スキー滑走可能）
     */
    public String getGelandeChargeChild2() {
        return gelandeChargeChild2;
    }

    /**
     * ゲレンデ設備３_小人料金 （スノーエスカレーター）を取得します。
     * 
     * @return ゲレンデ設備３_小人料金 （スノーエスカレーター）
     */
    public String getGelandeChargeChild3() {
        return gelandeChargeChild3;
    }

    /**
     * ゲレンデ設備４_小人料金 （スノーチュービング）を取得します。
     * 
     * @return ゲレンデ設備４_小人料金 （スノーチュービング）
     */
    public String getGelandeChargeChild4() {
        return gelandeChargeChild4;
    }

    /**
     * ゲレンデ設備５_小人料金 （滑り台（用具を使わない））を取得します。
     * 
     * @return ゲレンデ設備５_小人料金 （滑り台（用具を使わない））
     */
    public String getGelandeChargeChild5() {
        return gelandeChargeChild5;
    }

    /**
     * ゲレンデ設備６_小人料金 （ふわふわ（大型の玩具））を取得します。
     * 
     * @return ゲレンデ設備６_小人料金 （ふわふわ（大型の玩具））
     */
    public String getGelandeChargeChild6() {
        return gelandeChargeChild6;
    }

    /**
     * ゲレンデ設備７_小人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を取得します。
     * 
     * @return ゲレンデ設備７_小人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public String getGelandeChargeChild7() {
        return gelandeChargeChild7;
    }

    /**
     * ゲレンデ設備１_料金有無 （そり滑り可能）を取得します。
     * 
     * @return ゲレンデ設備１_料金有無 （そり滑り可能）
     */
    public String getGelandeChargeFlg1() {
        return gelandeChargeFlg1;
    }

    /**
     * ゲレンデ設備２_料金有無 （スキー滑走可能）を取得します。
     * 
     * @return ゲレンデ設備２_料金有無 （スキー滑走可能）
     */
    public String getGelandeChargeFlg2() {
        return gelandeChargeFlg2;
    }

    /**
     * ゲレンデ設備３_料金有無 （スノーエスカレーター）を取得します。
     * 
     * @return ゲレンデ設備３_料金有無 （スノーエスカレーター）
     */
    public String getGelandeChargeFlg3() {
        return gelandeChargeFlg3;
    }

    /**
     * ゲレンデ設備４_料金有無 （スノーチュービング）を取得します。
     * 
     * @return ゲレンデ設備４_料金有無 （スノーチュービング）
     */
    public String getGelandeChargeFlg4() {
        return gelandeChargeFlg4;
    }

    /**
     * ゲレンデ設備５_料金有無 （滑り台（用具を使わない））を取得します。
     * 
     * @return ゲレンデ設備５_料金有無 （滑り台（用具を使わない））
     */
    public String getGelandeChargeFlg5() {
        return gelandeChargeFlg5;
    }

    /**
     * ゲレンデ設備６_料金有無 （ふわふわ（大型の玩具））を取得します。
     * 
     * @return ゲレンデ設備６_料金有無 （ふわふわ（大型の玩具））
     */
    public String getGelandeChargeFlg6() {
        return gelandeChargeFlg6;
    }

    /**
     * ゲレンデ設備７_料金有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を取得します。
     * 
     * @return ゲレンデ設備７_料金有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public String getGelandeChargeFlg7() {
        return gelandeChargeFlg7;
    }

    /**
     * ゲレンデ設備１_有無 （そり滑り可能）を取得します。
     * 
     * @return ゲレンデ設備１_有無 （そり滑り可能）
     */
    public String getGelandeFlg1() {
        return gelandeFlg1;
    }

    /**
     * ゲレンデ設備２_有無 （スキー滑走可能）を取得します。
     * 
     * @return ゲレンデ設備２_有無 （スキー滑走可能）
     */
    public String getGelandeFlg2() {
        return gelandeFlg2;
    }

    /**
     * ゲレンデ設備３_有無 （スノーエスカレーター）を取得します。
     * 
     * @return ゲレンデ設備３_有無 （スノーエスカレーター）
     */
    public String getGelandeFlg3() {
        return gelandeFlg3;
    }

    /**
     * ゲレンデ設備４_有無 （スノーチュービング）を取得します。
     * 
     * @return ゲレンデ設備４_有無 （スノーチュービング）
     */
    public String getGelandeFlg4() {
        return gelandeFlg4;
    }

    /**
     * ゲレンデ設備５_有無 （滑り台（用具を使わない））を取得します。
     * 
     * @return ゲレンデ設備５_有無 （滑り台（用具を使わない））
     */
    public String getGelandeFlg5() {
        return gelandeFlg5;
    }

    /**
     * ゲレンデ設備６_有無 （ふわふわ（大型の玩具））を取得します。
     * 
     * @return ゲレンデ設備６_有無 （ふわふわ（大型の玩具））
     */
    public String getGelandeFlg6() {
        return gelandeFlg6;
    }

    /**
     * ゲレンデ設備７_有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を取得します。
     * 
     * @return ゲレンデ設備７_有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public String getGelandeFlg7() {
        return gelandeFlg7;
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
     * その他設備１を取得します。
     * 
     * @return その他設備１
     */
    public String getOtherFacility1() {
        return otherFacility1;
    }

    /**
     * その他設備２を取得します。
     * 
     * @return その他設備２
     */
    public String getOtherFacility2() {
        return otherFacility2;
    }

    /**
     * その他設備３を取得します。
     * 
     * @return その他設備３
     */
    public String getOtherFacility3() {
        return otherFacility3;
    }

    /**
     * その他設備４を取得します。
     * 
     * @return その他設備４
     */
    public String getOtherFacility4() {
        return otherFacility4;
    }

    /**
     * その他特記事項を取得します。
     * 
     * @return その他特記事項
     */
    public String getOtherSpCmt() {
        return otherSpCmt;
    }

    /**
     * キッズ専用エリア有無を設定します。
     * 
     * @param areaForKidsFlg
     *            キッズ専用エリア有無
     */
    public void setAreaForKidsFlg(String areaForKidsFlg) {
        this.areaForKidsFlg = areaForKidsFlg;
    }

    /**
     * 入場料_有料_大人_年齢を設定します。
     * 
     * @param entranceFeeAdultAge
     *            入場料_有料_大人_年齢
     */
    public void setEntranceFeeAdultAge(String entranceFeeAdultAge) {
        this.entranceFeeAdultAge = entranceFeeAdultAge;
    }

    /**
     * 入場料_有料_大人_料金を設定します。
     * 
     * @param entranceFeeAdultCharge
     *            入場料_有料_大人_料金
     */
    public void setEntranceFeeAdultCharge(String entranceFeeAdultCharge) {
        this.entranceFeeAdultCharge = entranceFeeAdultCharge;
    }

    /**
     * 入場料_有料_大人を設定します。
     * 
     * @param entranceFeeAdultPay
     *            入場料_有料_大人
     */
    public void setEntranceFeeAdultPay(String entranceFeeAdultPay) {
        this.entranceFeeAdultPay = entranceFeeAdultPay;
    }

    /**
     * 入場料_有料_小人_料金を設定します。
     * 
     * @param entranceFeeChildCharge
     *            入場料_有料_小人_料金
     */
    public void setEntranceFeeChildCharge(String entranceFeeChildCharge) {
        this.entranceFeeChildCharge = entranceFeeChildCharge;
    }

    /**
     * 入場料_有料_小人_年齢Fromを設定します。
     * 
     * @param entranceFeeChildFrom
     *            入場料_有料_小人_年齢From
     */
    public void setEntranceFeeChildFrom(String entranceFeeChildFrom) {
        this.entranceFeeChildFrom = entranceFeeChildFrom;
    }

    /**
     * 入場料_有料_小人を設定します。
     * 
     * @param entranceFeeChildPay
     *            入場料_有料_小人
     */
    public void setEntranceFeeChildPay(String entranceFeeChildPay) {
        this.entranceFeeChildPay = entranceFeeChildPay;
    }

    /**
     * 入場料_有料_小人_年齢Toを設定します。
     * 
     * @param entranceFeeChildTo
     *            入場料_有料_小人_年齢To
     */
    public void setEntranceFeeChildTo(String entranceFeeChildTo) {
        this.entranceFeeChildTo = entranceFeeChildTo;
    }

    /**
     * 入場料_有無を設定します。
     * 
     * @param entranceFeeFlg
     *            入場料_有無
     */
    public void setEntranceFeeFlg(String entranceFeeFlg) {
        this.entranceFeeFlg = entranceFeeFlg;
    }

    /**
     * 入場料_無料種類を設定します。
     * 
     * @param entranceFeeFree
     *            入場料_無料種類
     */
    public void setEntranceFeeFree(String entranceFeeFree) {
        this.entranceFeeFree = entranceFeeFree;
    }

    /**
     * 入場料_有料_時間を設定します。
     * 
     * @param entranceFeeHhPay
     *            入場料_有料_時間
     */
    public void setEntranceFeeHhPay(String entranceFeeHhPay) {
        this.entranceFeeHhPay = entranceFeeHhPay;
    }

    /**
     * 入場料_有料_分を設定します。
     * 
     * @param entranceFeeMmPay
     *            入場料_有料_分
     */
    public void setEntranceFeeMmPay(String entranceFeeMmPay) {
        this.entranceFeeMmPay = entranceFeeMmPay;
    }

    /**
     * 入場料_有料種類を設定します。
     * 
     * @param entranceFeePay
     *            入場料_有料種類
     */
    public void setEntranceFeePay(String entranceFeePay) {
        this.entranceFeePay = entranceFeePay;
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
     * ゲレンデ設備１_大人料金 （そり滑り可能）を設定します。
     * 
     * @param gelandeChargeAdult1
     *            ゲレンデ設備１_大人料金 （そり滑り可能）
     */
    public void setGelandeChargeAdult1(String gelandeChargeAdult1) {
        this.gelandeChargeAdult1 = gelandeChargeAdult1;
    }

    /**
     * ゲレンデ設備２_大人料金 （スキー滑走可能）を設定します。
     * 
     * @param gelandeChargeAdult2
     *            ゲレンデ設備２_大人料金 （スキー滑走可能）
     */
    public void setGelandeChargeAdult2(String gelandeChargeAdult2) {
        this.gelandeChargeAdult2 = gelandeChargeAdult2;
    }

    /**
     * ゲレンデ設備３_大人料金 （スノーエスカレーター）を設定します。
     * 
     * @param gelandeChargeAdult3
     *            ゲレンデ設備３_大人料金 （スノーエスカレーター）
     */
    public void setGelandeChargeAdult3(String gelandeChargeAdult3) {
        this.gelandeChargeAdult3 = gelandeChargeAdult3;
    }

    /**
     * ゲレンデ設備４_大人料金 （スノーチュービング）を設定します。
     * 
     * @param gelandeChargeAdult4
     *            ゲレンデ設備４_大人料金 （スノーチュービング）
     */
    public void setGelandeChargeAdult4(String gelandeChargeAdult4) {
        this.gelandeChargeAdult4 = gelandeChargeAdult4;
    }

    /**
     * ゲレンデ設備５_大人料金 （滑り台（用具を使わない））を設定します。
     * 
     * @param gelandeChargeAdult5
     *            ゲレンデ設備５_大人料金 （滑り台（用具を使わない））
     */
    public void setGelandeChargeAdult5(String gelandeChargeAdult5) {
        this.gelandeChargeAdult5 = gelandeChargeAdult5;
    }

    /**
     * ゲレンデ設備６_大人料金 （ふわふわ（大型の玩具））を設定します。
     * 
     * @param gelandeChargeAdult6
     *            ゲレンデ設備６_大人料金 （ふわふわ（大型の玩具））
     */
    public void setGelandeChargeAdult6(String gelandeChargeAdult6) {
        this.gelandeChargeAdult6 = gelandeChargeAdult6;
    }

    /**
     * ゲレンデ設備７_大人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を設定します。
     * 
     * @param gelandeChargeAdult7
     *            ゲレンデ設備７_大人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public void setGelandeChargeAdult7(String gelandeChargeAdult7) {
        this.gelandeChargeAdult7 = gelandeChargeAdult7;
    }

    /**
     * ゲレンデ設備１_小人料金 （そり滑り可能）を設定します。
     * 
     * @param gelandeChargeChild1
     *            ゲレンデ設備１_小人料金 （そり滑り可能）
     */
    public void setGelandeChargeChild1(String gelandeChargeChild1) {
        this.gelandeChargeChild1 = gelandeChargeChild1;
    }

    /**
     * ゲレンデ設備２_小人料金 （スキー滑走可能）を設定します。
     * 
     * @param gelandeChargeChild2
     *            ゲレンデ設備２_小人料金 （スキー滑走可能）
     */
    public void setGelandeChargeChild2(String gelandeChargeChild2) {
        this.gelandeChargeChild2 = gelandeChargeChild2;
    }

    /**
     * ゲレンデ設備３_小人料金 （スノーエスカレーター）を設定します。
     * 
     * @param gelandeChargeChild3
     *            ゲレンデ設備３_小人料金 （スノーエスカレーター）
     */
    public void setGelandeChargeChild3(String gelandeChargeChild3) {
        this.gelandeChargeChild3 = gelandeChargeChild3;
    }

    /**
     * ゲレンデ設備４_小人料金 （スノーチュービング）を設定します。
     * 
     * @param gelandeChargeChild4
     *            ゲレンデ設備４_小人料金 （スノーチュービング）
     */
    public void setGelandeChargeChild4(String gelandeChargeChild4) {
        this.gelandeChargeChild4 = gelandeChargeChild4;
    }

    /**
     * ゲレンデ設備５_小人料金 （滑り台（用具を使わない））を設定します。
     * 
     * @param gelandeChargeChild5
     *            ゲレンデ設備５_小人料金 （滑り台（用具を使わない））
     */
    public void setGelandeChargeChild5(String gelandeChargeChild5) {
        this.gelandeChargeChild5 = gelandeChargeChild5;
    }

    /**
     * ゲレンデ設備６_小人料金 （ふわふわ（大型の玩具））を設定します。
     * 
     * @param gelandeChargeChild6
     *            ゲレンデ設備６_小人料金 （ふわふわ（大型の玩具））
     */
    public void setGelandeChargeChild6(String gelandeChargeChild6) {
        this.gelandeChargeChild6 = gelandeChargeChild6;
    }

    /**
     * ゲレンデ設備７_小人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を設定します。
     * 
     * @param gelandeChargeChild7
     *            ゲレンデ設備７_小人料金 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public void setGelandeChargeChild7(String gelandeChargeChild7) {
        this.gelandeChargeChild7 = gelandeChargeChild7;
    }

    /**
     * ゲレンデ設備１_料金有無 （そり滑り可能）を設定します。
     * 
     * @param gelandeChargeFlg1
     *            ゲレンデ設備１_料金有無 （そり滑り可能）
     */
    public void setGelandeChargeFlg1(String gelandeChargeFlg1) {
        this.gelandeChargeFlg1 = gelandeChargeFlg1;
    }

    /**
     * ゲレンデ設備２_料金有無 （スキー滑走可能）を設定します。
     * 
     * @param gelandeChargeFlg2
     *            ゲレンデ設備２_料金有無 （スキー滑走可能）
     */
    public void setGelandeChargeFlg2(String gelandeChargeFlg2) {
        this.gelandeChargeFlg2 = gelandeChargeFlg2;
    }

    /**
     * ゲレンデ設備３_料金有無 （スノーエスカレーター）を設定します。
     * 
     * @param gelandeChargeFlg3
     *            ゲレンデ設備３_料金有無 （スノーエスカレーター）
     */
    public void setGelandeChargeFlg3(String gelandeChargeFlg3) {
        this.gelandeChargeFlg3 = gelandeChargeFlg3;
    }

    /**
     * ゲレンデ設備４_料金有無 （スノーチュービング）を設定します。
     * 
     * @param gelandeChargeFlg4
     *            ゲレンデ設備４_料金有無 （スノーチュービング）
     */
    public void setGelandeChargeFlg4(String gelandeChargeFlg4) {
        this.gelandeChargeFlg4 = gelandeChargeFlg4;
    }

    /**
     * ゲレンデ設備５_料金有無 （滑り台（用具を使わない））を設定します。
     * 
     * @param gelandeChargeFlg5
     *            ゲレンデ設備５_料金有無 （滑り台（用具を使わない））
     */
    public void setGelandeChargeFlg5(String gelandeChargeFlg5) {
        this.gelandeChargeFlg5 = gelandeChargeFlg5;
    }

    /**
     * ゲレンデ設備６_料金有無 （ふわふわ（大型の玩具））を設定します。
     * 
     * @param gelandeChargeFlg6
     *            ゲレンデ設備６_料金有無 （ふわふわ（大型の玩具））
     */
    public void setGelandeChargeFlg6(String gelandeChargeFlg6) {
        this.gelandeChargeFlg6 = gelandeChargeFlg6;
    }

    /**
     * ゲレンデ設備７_料金有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を設定します。
     * 
     * @param gelandeChargeFlg7
     *            ゲレンデ設備７_料金有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public void setGelandeChargeFlg7(String gelandeChargeFlg7) {
        this.gelandeChargeFlg7 = gelandeChargeFlg7;
    }

    /**
     * ゲレンデ設備１_有無 （そり滑り可能）を設定します。
     * 
     * @param gelandeFlg1
     *            ゲレンデ設備１_有無 （そり滑り可能）
     */
    public void setGelandeFlg1(String gelandeFlg1) {
        this.gelandeFlg1 = gelandeFlg1;
    }

    /**
     * ゲレンデ設備２_有無 （スキー滑走可能）を設定します。
     * 
     * @param gelandeFlg2
     *            ゲレンデ設備２_有無 （スキー滑走可能）
     */
    public void setGelandeFlg2(String gelandeFlg2) {
        this.gelandeFlg2 = gelandeFlg2;
    }

    /**
     * ゲレンデ設備３_有無 （スノーエスカレーター）を設定します。
     * 
     * @param gelandeFlg3
     *            ゲレンデ設備３_有無 （スノーエスカレーター）
     */
    public void setGelandeFlg3(String gelandeFlg3) {
        this.gelandeFlg3 = gelandeFlg3;
    }

    /**
     * ゲレンデ設備４_有無 （スノーチュービング）を設定します。
     * 
     * @param gelandeFlg4
     *            ゲレンデ設備４_有無 （スノーチュービング）
     */
    public void setGelandeFlg4(String gelandeFlg4) {
        this.gelandeFlg4 = gelandeFlg4;
    }

    /**
     * ゲレンデ設備５_有無 （滑り台（用具を使わない））を設定します。
     * 
     * @param gelandeFlg5
     *            ゲレンデ設備５_有無 （滑り台（用具を使わない））
     */
    public void setGelandeFlg5(String gelandeFlg5) {
        this.gelandeFlg5 = gelandeFlg5;
    }

    /**
     * ゲレンデ設備６_有無 （ふわふわ（大型の玩具））を設定します。
     * 
     * @param gelandeFlg6
     *            ゲレンデ設備６_有無 （ふわふわ（大型の玩具））
     */
    public void setGelandeFlg6(String gelandeFlg6) {
        this.gelandeFlg6 = gelandeFlg6;
    }

    /**
     * ゲレンデ設備７_有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）を設定します。
     * 
     * @param gelandeFlg7
     *            ゲレンデ設備７_有無 （雪遊びグッズ（ﾊﾞｹﾂ・ｼｬﾍﾞﾙ等)）
     */
    public void setGelandeFlg7(String gelandeFlg7) {
        this.gelandeFlg7 = gelandeFlg7;
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
     * その他設備１を設定します。
     * 
     * @param otherFacility1
     *            その他設備１
     */
    public void setOtherFacility1(String otherFacility1) {
        this.otherFacility1 = otherFacility1;
    }

    /**
     * その他設備２を設定します。
     * 
     * @param otherFacility2
     *            その他設備２
     */
    public void setOtherFacility2(String otherFacility2) {
        this.otherFacility2 = otherFacility2;
    }

    /**
     * その他設備３を設定します。
     * 
     * @param otherFacility3
     *            その他設備３
     */
    public void setOtherFacility3(String otherFacility3) {
        this.otherFacility3 = otherFacility3;
    }

    /**
     * その他設備４を設定します。
     * 
     * @param otherFacility4
     *            その他設備４
     */
    public void setOtherFacility4(String otherFacility4) {
        this.otherFacility4 = otherFacility4;
    }

    /**
     * その他特記事項を設定します。
     * 
     * @param otherSpCmt
     *            その他特記事項
     */
    public void setOtherSpCmt(String otherSpCmt) {
        this.otherSpCmt = otherSpCmt;
    }

}
