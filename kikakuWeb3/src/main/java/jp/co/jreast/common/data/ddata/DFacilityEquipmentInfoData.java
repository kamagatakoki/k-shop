package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.EquipmentKind;

/**
 * [DP/RM]施設_設備 データ
 * 
 * <pre>
 *   機能概要 ：  施設付帯情報単位の全件分の情報を保持します。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityEquipmentInfoData {

    /** 館内にコンビニ有り */
    private DFacilityEquipmentHistory convenience;

    /** フィットネス施設有り */
    private DFacilityEquipmentHistory fitness;

    /** ゲームコーナー有り */
    private DFacilityEquipmentHistory gameCorner;

    /** 館内に売店あり */
    private DFacilityEquipmentHistory inHouseStand;

    /** インターネット接続ｻｰﾋﾞｽ有り */
    private DFacilityEquipmentHistory internet;

    /** カラオケBOX有り */
    private DFacilityEquipmentHistory karaokeBox;

    /** ランドリーサービス */
    private DFacilityEquipmentHistory laundryService;

    /** マッサージサービス */
    private DFacilityEquipmentHistory massageService;

    /** 部屋に新聞サービス有り */
    private DFacilityEquipmentHistory news;

    /** 駐車場（無料）有り */
    private DFacilityEquipmentHistory parkFree;

    /** 駐車場（有料）有り */
    private DFacilityEquipmentHistory parkPay;

    /** プール有り（屋内） */
    private DFacilityEquipmentHistory poolIndoor;

    /** プール有り（屋外） */
    private DFacilityEquipmentHistory poolOutside;

    /** 加湿器貸し出し */
    private DFacilityEquipmentHistory rentalHumidifier;

    /** 電気スタンド貸し出し */
    private DFacilityEquipmentHistory rentalLamp;

    /** 飲食施設 */
    private DFacilityEquipmentHistory restaurant;

    /** ルームサービス */
    private DFacilityEquipmentHistory roomService;

    /** SUICA利用可能施設有り */
    private DFacilityEquipmentHistory suica;

    /** 卓球台有り */
    private DFacilityEquipmentHistory tableTennis;

    /** 貴館専用テニスコート有り */
    private DFacilityEquipmentHistory tennisCourt;

    /** ズボンプレッサー有り */
    private DFacilityEquipmentHistory trouserPress;

    /**
     * コンストラクタ
     */
    public DFacilityEquipmentInfoData() {
        super();
        this.karaokeBox = new DFacilityEquipmentHistory(
                EquipmentKind.KARAOKE_BOX.code());
        this.gameCorner = new DFacilityEquipmentHistory(
                EquipmentKind.GAME_CORNER.code());
        this.tennisCourt = new DFacilityEquipmentHistory(
                EquipmentKind.TENNIS_COURT.code());
        this.tableTennis = new DFacilityEquipmentHistory(
                EquipmentKind.TABLE_TENNIS.code());
        this.poolOutside = new DFacilityEquipmentHistory(
                EquipmentKind.POOL_OUTSIDE.code());
        this.poolIndoor = new DFacilityEquipmentHistory(
                EquipmentKind.POOL_INDOOR.code());
        this.fitness = new DFacilityEquipmentHistory(
                EquipmentKind.FITNESS.code());
        this.news = new DFacilityEquipmentHistory(EquipmentKind.NEWS.code());
        this.parkFree = new DFacilityEquipmentHistory(
                EquipmentKind.PARK_FREE.code());
        this.parkPay = new DFacilityEquipmentHistory(
                EquipmentKind.PARK_PAY.code());

        this.convenience = new DFacilityEquipmentHistory(
                EquipmentKind.CONVENIENCE.code());
        this.trouserPress = new DFacilityEquipmentHistory(
                EquipmentKind.TROUSER_PRESS.code());
        this.suica = new DFacilityEquipmentHistory(EquipmentKind.SUICA.code());
        this.internet = new DFacilityEquipmentHistory(
                EquipmentKind.INTERNET.code());
        this.inHouseStand = new DFacilityEquipmentHistory(
                EquipmentKind.IN_HOUSE_STAND.code());
        this.restaurant = new DFacilityEquipmentHistory(
                EquipmentKind.RESTAURANT.code());
        this.laundryService = new DFacilityEquipmentHistory(
                EquipmentKind.LAUNDRY_SERVICE.code());
        this.roomService = new DFacilityEquipmentHistory(
                EquipmentKind.ROOM_SERVICE.code());

        this.massageService = new DFacilityEquipmentHistory(
                EquipmentKind.MASSAGE_SERVICE.code());
        this.rentalHumidifier = new DFacilityEquipmentHistory(
                EquipmentKind.RENTAL_HUMIDIFIER.code());
        this.rentalLamp = new DFacilityEquipmentHistory(
                EquipmentKind.RENTAL_LAMP.code());
    }

    /**
     * 館内にコンビニ有りを取得します。
     * 
     * @return 館内にコンビニ有り
     */
    public DFacilityEquipmentHistory getConvenience() {
        return convenience;
    }

    /**
     * 「設備種別」から施設_設備を取得します。
     * 
     * <pre></pre>
     * 
     * @param equipmentKind
     *            設備種別
     * @return 施設_設備
     */
    public DFacilityEquipmentHistory getEquipment(int equipmentKind) {

        EquipmentKind enm = EquipmentKind.codeOf(equipmentKind);

        if (enm == null) {
            return new DFacilityEquipmentHistory(equipmentKind);
        }

        switch (enm) {
        case KARAOKE_BOX:
            return getKaraokeBox();
        case GAME_CORNER:
            return getGameCorner();
        case TENNIS_COURT:
            return getTennisCourt();
        case TABLE_TENNIS:
            return getTableTennis();
        case POOL_OUTSIDE:
            return getPoolOutside();
        case POOL_INDOOR:
            return getPoolIndoor();
        case FITNESS:
            return getFitness();
        case NEWS:
            return getNews();
        case PARK_FREE:
            return getParkFree();
        case PARK_PAY:
            return getParkPay();

        case CONVENIENCE:
            return getConvenience();
        case TROUSER_PRESS:
            return getTrouserPress();
        case SUICA:
            return getSuica();
        case INTERNET:
            return getInternet();
        case IN_HOUSE_STAND:
            return getInHouseStand();
        case RESTAURANT:
            return getRestaurant();
        case LAUNDRY_SERVICE:
            return getLaundryService();
        case ROOM_SERVICE:
            return getRoomService();

        case MASSAGE_SERVICE:
            return getMassageService();
        case RENTAL_HUMIDIFIER:
            return getRentalHumidifier();
        case RENTAL_LAMP:
            return getRentalLamp();

        default:
            return new DFacilityEquipmentHistory(enm.code());
        }

    }

    /**
     * フィットネス施設有りを取得します。
     * 
     * @return フィットネス施設有り
     */
    public DFacilityEquipmentHistory getFitness() {
        return fitness;
    }

    /**
     * ゲームコーナー有りを取得します。
     * 
     * @return ゲームコーナー有り
     */
    public DFacilityEquipmentHistory getGameCorner() {
        return gameCorner;
    }

    /**
     * 館内に売店ありを取得します。
     * 
     * @return 館内に売店あり
     */
    public DFacilityEquipmentHistory getInHouseStand() {
        return inHouseStand;
    }

    /**
     * インターネット接続ｻｰﾋﾞｽ有りを取得します。
     * 
     * @return インターネット接続ｻｰﾋﾞｽ有り
     */
    public DFacilityEquipmentHistory getInternet() {
        return internet;
    }

    /**
     * カラオケBOX有りを取得します。
     * 
     * @return カラオケBOX有り
     */
    public DFacilityEquipmentHistory getKaraokeBox() {
        return karaokeBox;
    }

    /**
     * ランドリーサービスを取得します。
     * 
     * @return ランドリーサービス
     */
    public DFacilityEquipmentHistory getLaundryService() {
        return laundryService;
    }

    /**
     * マッサージサービスを取得します。
     * 
     * @return マッサージサービス
     */
    public DFacilityEquipmentHistory getMassageService() {
        return massageService;
    }

    /**
     * 部屋に新聞サービス有りを取得します。
     * 
     * @return 部屋に新聞サービス有り
     */
    public DFacilityEquipmentHistory getNews() {
        return news;
    }

    /**
     * 駐車場（無料）有りを取得します。
     * 
     * @return 駐車場（無料）有り
     */
    public DFacilityEquipmentHistory getParkFree() {
        return parkFree;
    }

    /**
     * 駐車場（有料）有りを取得します。
     * 
     * @return 駐車場（有料）有り
     */
    public DFacilityEquipmentHistory getParkPay() {
        return parkPay;
    }

    /**
     * プール有り（屋内）を取得します。
     * 
     * @return プール有り（屋内）
     */
    public DFacilityEquipmentHistory getPoolIndoor() {
        return poolIndoor;
    }

    /**
     * プール有り（屋外）を取得します。
     * 
     * @return プール有り（屋外）
     */
    public DFacilityEquipmentHistory getPoolOutside() {
        return poolOutside;
    }

    /**
     * 加湿器貸し出しを取得します。
     * 
     * @return 加湿器貸し出し
     */
    public DFacilityEquipmentHistory getRentalHumidifier() {
        return rentalHumidifier;
    }

    /**
     * 電気スタンド貸し出しを取得します。
     * 
     * @return 電気スタンド貸し出し
     */
    public DFacilityEquipmentHistory getRentalLamp() {
        return rentalLamp;
    }

    /**
     * 飲食施設を取得します。
     * 
     * @return 飲食施設
     */
    public DFacilityEquipmentHistory getRestaurant() {
        return restaurant;
    }

    /**
     * ルームサービスを取得します。
     * 
     * @return ルームサービス
     */
    public DFacilityEquipmentHistory getRoomService() {
        return roomService;
    }

    /**
     * SUICA利用可能施設有りを取得します。
     * 
     * @return SUICA利用可能施設有り
     */
    public DFacilityEquipmentHistory getSuica() {
        return suica;
    }

    /**
     * 卓球台有りを取得します。
     * 
     * @return 卓球台有り
     */
    public DFacilityEquipmentHistory getTableTennis() {
        return tableTennis;
    }

    /**
     * 貴館専用テニスコート有りを取得します。
     * 
     * @return 貴館専用テニスコート有り
     */
    public DFacilityEquipmentHistory getTennisCourt() {
        return tennisCourt;
    }

    /**
     * ズボンプレッサー有りを取得します。
     * 
     * @return ズボンプレッサー有り
     */
    public DFacilityEquipmentHistory getTrouserPress() {
        return trouserPress;
    }

    /**
     * 館内にコンビニ有りを設定します。
     * 
     * @param convenience
     *            館内にコンビニ有り
     */
    public void setConvenience(DFacilityEquipmentHistory convenience) {
        this.convenience = convenience;
    }

    /**
     * フィットネス施設有りを設定します。
     * 
     * @param fitness
     *            フィットネス施設有り
     */
    public void setFitness(DFacilityEquipmentHistory fitness) {
        this.fitness = fitness;
    }

    /**
     * ゲームコーナー有りを設定します。
     * 
     * @param gameCorner
     *            ゲームコーナー有り
     */
    public void setGameCorner(DFacilityEquipmentHistory gameCorner) {
        this.gameCorner = gameCorner;
    }

    /**
     * 館内に売店ありを設定します。
     * 
     * @param inHouseStand
     *            館内に売店あり
     */
    public void setInHouseStand(DFacilityEquipmentHistory inHouseStand) {
        this.inHouseStand = inHouseStand;
    }

    /**
     * インターネット接続ｻｰﾋﾞｽ有りを設定します。
     * 
     * @param internet
     *            インターネット接続ｻｰﾋﾞｽ有り
     */
    public void setInternet(DFacilityEquipmentHistory internet) {
        this.internet = internet;
    }

    /**
     * カラオケBOX有りを設定します。
     * 
     * @param karaokeBox
     *            カラオケBOX有り
     */
    public void setKaraokeBox(DFacilityEquipmentHistory karaokeBox) {
        this.karaokeBox = karaokeBox;
    }

    /**
     * ランドリーサービスを設定します。
     * 
     * @param laundryService
     *            ランドリーサービス
     */
    public void setLaundryService(DFacilityEquipmentHistory laundryService) {
        this.laundryService = laundryService;
    }

    /**
     * マッサージサービスを設定します。
     * 
     * @param massageService
     *            マッサージサービス
     */
    public void setMassageService(DFacilityEquipmentHistory massageService) {
        this.massageService = massageService;
    }

    /**
     * 部屋に新聞サービス有りを設定します。
     * 
     * @param news
     *            部屋に新聞サービス有り
     */
    public void setNews(DFacilityEquipmentHistory news) {
        this.news = news;
    }

    /**
     * 駐車場（無料）有りを設定します。
     * 
     * @param parkFree
     *            駐車場（無料）有り
     */
    public void setParkFree(DFacilityEquipmentHistory parkFree) {
        this.parkFree = parkFree;
    }

    /**
     * 駐車場（有料）有りを設定します。
     * 
     * @param parkPay
     *            駐車場（有料）有り
     */
    public void setParkPay(DFacilityEquipmentHistory parkPay) {
        this.parkPay = parkPay;
    }

    /**
     * プール有り（屋内）を設定します。
     * 
     * @param poolIndoor
     *            プール有り（屋内）
     */
    public void setPoolIndoor(DFacilityEquipmentHistory poolIndoor) {
        this.poolIndoor = poolIndoor;
    }

    /**
     * プール有り（屋外）を設定します。
     * 
     * @param poolOutside
     *            プール有り（屋外）
     */
    public void setPoolOutside(DFacilityEquipmentHistory poolOutside) {
        this.poolOutside = poolOutside;
    }

    /**
     * 加湿器貸し出しを設定します。
     * 
     * @param rentalHumidifier
     *            加湿器貸し出し
     */
    public void setRentalHumidifier(DFacilityEquipmentHistory rentalHumidifier) {
        this.rentalHumidifier = rentalHumidifier;
    }

    /**
     * 電気スタンド貸し出しを設定します。
     * 
     * @param rentalLamp
     *            電気スタンド貸し出し
     */
    public void setRentalLamp(DFacilityEquipmentHistory rentalLamp) {
        this.rentalLamp = rentalLamp;
    }

    /**
     * 飲食施設を設定します。
     * 
     * @param restaurant
     *            飲食施設
     */
    public void setRestaurant(DFacilityEquipmentHistory restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * ルームサービスを設定します。
     * 
     * @param roomService
     *            ルームサービス
     */
    public void setRoomService(DFacilityEquipmentHistory roomService) {
        this.roomService = roomService;
    }

    /**
     * SUICA利用可能施設有りを設定します。
     * 
     * @param suica
     *            SUICA利用可能施設有り
     */
    public void setSuica(DFacilityEquipmentHistory suica) {
        this.suica = suica;
    }

    /**
     * 卓球台有りを設定します。
     * 
     * @param tableTennis
     *            卓球台有り
     */
    public void setTableTennis(DFacilityEquipmentHistory tableTennis) {
        this.tableTennis = tableTennis;
    }

    /**
     * 貴館専用テニスコート有りを設定します。
     * 
     * @param tennisCourt
     *            貴館専用テニスコート有り
     */
    public void setTennisCourt(DFacilityEquipmentHistory tennisCourt) {
        this.tennisCourt = tennisCourt;
    }

    /**
     * ズボンプレッサー有りを設定します。
     * 
     * @param trouserPress
     *            ズボンプレッサー有り
     */
    public void setTrouserPress(DFacilityEquipmentHistory trouserPress) {
        this.trouserPress = trouserPress;
    }

    /**
     * 施設_設備 データをListとして取得します。
     * 
     * <pre></pre>
     * 
     * @return 施設_設備リスト
     */
    public List<DFacilityEquipmentHistory> toList() {
        List<DFacilityEquipmentHistory> list = new ArrayList<DFacilityEquipmentHistory>();

        list.add(karaokeBox);
        list.add(gameCorner);
        list.add(tennisCourt);
        list.add(tableTennis);
        list.add(poolOutside);
        list.add(poolIndoor);
        list.add(fitness);
        list.add(news);
        list.add(parkFree);
        list.add(parkPay);

        list.add(convenience);
        list.add(trouserPress);
        list.add(suica);
        list.add(internet);
        list.add(inHouseStand);
        list.add(restaurant);
        list.add(laundryService);
        list.add(roomService);

        list.add(massageService);
        list.add(rentalHumidifier);
        list.add(rentalLamp);

        return list;
    }

}
