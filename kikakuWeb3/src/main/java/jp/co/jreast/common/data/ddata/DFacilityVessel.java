package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.interfaces.FacilityManageBodyKey;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Thu Sep 18 11:09:21 JST 2014
 */

/**
 * D_facility_vesselVo.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/09/18 keiken Generated.
 */
public class DFacilityVessel implements FacilityManageBodyKey {

    /**
     * 面積
     */
    private String area;

    /**
     * 面積単位
     */
    private String areaUnit;

    /**
     * バス有無
     */
    private String bathFlg;

    /**
     * バスローブ有無
     */
    private String bathrobeFlg;

    /**
     * バスタオル有無
     */
    private String bathTowelFlg;

    /**
     * ベッド幅
     */
    private String bedWidth;

    /**
     * ボディソープ有無
     */
    private String bodySoapFlg;

    /**
     * 建物区分
     */
    private String buildingDiv;

    /**
     * 建物区分名称
     */
    private String buildingDivNm;

    /**
     * 建物・部屋タイプ名
     */
    private String buildingRoomNm;

    /**
     * 店員１
     */
    private String capacityFrom;

    /**
     * 店員２
     */
    private String capacityTo;

    /**
     * 子供用寝具コメント
     */
    private String childBeddingCmt;

    /**
     * 子供用寝具有無
     */
    private String childBeddingFlg;

    /**
     * くし・ブラシ有無
     */
    private String combFlg;

    /**
     * ドライヤー有無
     */
    private String dryerFlg;

    /**
     * エキストラベッド有無
     */
    private String extraBedFlg;

    /**
     * エキストラベッド人数
     */
    private String extraBedNum;

    /**
     * エキストラベッド幅
     */
    private String extraBedWidth;

    /**
     * 施設コード <Primary Key>
     */
    private String facilityCd;

    /**
     * 施設パターン <Primary Key>
     */
    private String facilityPattern;

    /**
     * 階層指定
     */
    private String floorAssign;

    /**
     * 種別 <Primary Key>
     */
    private String kindFlg;

    /**
     * 備考
     */
    private String memo;

    /**
     * ナイトウェア有無
     */
    private String nightWearFlg;

    /**
     * パジャマ有無
     */
    private String pajamasFlg;

    /**
     * 部屋タイプ <Primary Key>
     */
    private Integer roomType;

    /**
     * セールスポイント
     */
    private String salesPoint;

    /**
     * シャンプー・リンス有無
     */
    private String shampooRinseFlg;

    /**
     * シャワーブース有無
     */
    private String showerBoothFlg;

    /**
     * シャワーキャップ有無
     */
    private String showerCapFlg;

    /**
     * ソファーベッド有無
     */
    private String sofaBedFlg;

    /**
     * ソファーベッド人数
     */
    private String sofaBedNum;

    /**
     * ソファーベッド幅
     */
    private String sofaBedWidth;

    /**
     * スタッキングベッド有無
     */
    private String stackingBedFlg;

    /**
     * スタッキングベッド人数
     */
    private String stackingBedNum;

    /**
     * スタッキングベッド幅
     */
    private String stackingBedWidth;

    /**
     * 様式区分
     */
    private String styleDiv;

    /**
     * トイレ有無
     */
    private String toiletFlg;

    /**
     * 眺望
     */
    private String viewCd;

    /**
     * ウォシュレット有無
     */
    private String washletFlg;

    /**
     * 洗面具有無
     */
    private String washToolFlg;

    /**
     * ゆかた有無
     */
    private String yukataFlg;

    /**
     * Constractor
     */
    public DFacilityVessel() {
    }

    /**
     * Constractor
     * 
     * @param facilityCd
     *            施設コード
     * @param kindFlg
     *            種別
     * @param facilityPattern
     *            施設パターン
     * @param roomType
     *            部屋タイプ
     */
    public DFacilityVessel(String facilityCd, String kindFlg,
            String facilityPattern, Integer roomType) {
        this.facilityCd = facilityCd;
        this.kindFlg = kindFlg;
        this.facilityPattern = facilityPattern;
        this.roomType = roomType;
    }

    /**
     * 面積を取得します。
     * 
     * @return 面積
     */
    public String getArea() {
        return area;
    }

    /**
     * 面積単位を取得します。
     * 
     * @return 面積単位
     */
    public String getAreaUnit() {
        return areaUnit;
    }

    /**
     * バス有無を取得します。
     * 
     * @return バス有無
     */
    public String getBathFlg() {
        return bathFlg;
    }

    /**
     * バスローブ有無を取得します。
     * 
     * @return バスローブ有無
     */
    public String getBathrobeFlg() {
        return bathrobeFlg;
    }

    /**
     * バスタオル有無を取得します。
     * 
     * @return バスタオル有無
     */
    public String getBathTowelFlg() {
        return bathTowelFlg;
    }

    /**
     * ベッド幅を取得します。
     * 
     * @return ベッド幅
     */
    public String getBedWidth() {
        return bedWidth;
    }

    /**
     * ボディソープ有無を取得します。
     * 
     * @return ボディソープ有無
     */
    public String getBodySoapFlg() {
        return bodySoapFlg;
    }

    /**
     * 建物区分を取得します。
     * 
     * @return 建物区分
     */
    public String getBuildingDiv() {
        return buildingDiv;
    }

    /**
     * 建物区分名称を取得します。
     * 
     * @return 建物区分名称
     */
    public String getBuildingDivNm() {
        return buildingDivNm;
    }

    /**
     * 建物・部屋タイプ名を取得します。
     * 
     * @return 建物・部屋タイプ名
     */
    public String getBuildingRoomNm() {
        return buildingRoomNm;
    }

    /**
     * 店員１を取得します。
     * 
     * @return 店員１
     */
    public String getCapacityFrom() {
        return capacityFrom;
    }

    /**
     * 店員２を取得します。
     * 
     * @return 店員２
     */
    public String getCapacityTo() {
        return capacityTo;
    }

    /**
     * 子供用寝具コメントを取得します。
     * 
     * @return 子供用寝具コメント
     */
    public String getChildBeddingCmt() {
        return childBeddingCmt;
    }

    /**
     * 子供用寝具有無を取得します。
     * 
     * @return 子供用寝具有無
     */
    public String getChildBeddingFlg() {
        return childBeddingFlg;
    }

    /**
     * くし・ブラシ有無を取得します。
     * 
     * @return くし・ブラシ有無
     */
    public String getCombFlg() {
        return combFlg;
    }

    /**
     * ドライヤー有無を取得します。
     * 
     * @return ドライヤー有無
     */
    public String getDryerFlg() {
        return dryerFlg;
    }

    /**
     * エキストラベッド有無を取得します。
     * 
     * @return エキストラベッド有無
     */
    public String getExtraBedFlg() {
        return extraBedFlg;
    }

    /**
     * エキストラベッド人数を取得します。
     * 
     * @return エキストラベッド人数
     */
    public String getExtraBedNum() {
        return extraBedNum;
    }

    /**
     * エキストラベッド幅を取得します。
     * 
     * @return エキストラベッド幅
     */
    public String getExtraBedWidth() {
        return extraBedWidth;
    }

    /**
     * 施設コード <Primary Key>を取得します。
     * 
     * @return 施設コード <Primary Key>
     */
    @Override
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設パターン <Primary Key>を取得します。
     * 
     * @return 施設パターン <Primary Key>
     */
    @Override
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * 階層指定を取得します。
     * 
     * @return 階層指定
     */
    public String getFloorAssign() {
        return floorAssign;
    }

    /**
     * 種別 <Primary Key>を取得します。
     * 
     * @return 種別 <Primary Key>
     */
    @Override
    public String getKindFlg() {
        return kindFlg;
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
     * ナイトウェア有無を取得します。
     * 
     * @return ナイトウェア有無
     */
    public String getNightWearFlg() {
        return nightWearFlg;
    }

    /**
     * パジャマ有無を取得します。
     * 
     * @return パジャマ有無
     */
    public String getPajamasFlg() {
        return pajamasFlg;
    }

    /**
     * 部屋タイプ <Primary Key>を取得します。
     * 
     * @return 部屋タイプ <Primary Key>
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * 部屋タイプ名を取得します。
     * 
     * @return 部屋タイプ名
     */
    public String getRoomTypeNm() {
        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                String.valueOf(getRoomType()));
    }

    /**
     * セールスポイントを取得します。
     * 
     * @return セールスポイント
     */
    public String getSalesPoint() {
        return salesPoint;
    }

    /**
     * シャンプー・リンス有無を取得します。
     * 
     * @return シャンプー・リンス有無
     */
    public String getShampooRinseFlg() {
        return shampooRinseFlg;
    }

    /**
     * シャワーブース有無を取得します。
     * 
     * @return シャワーブース有無
     */
    public String getShowerBoothFlg() {
        return showerBoothFlg;
    }

    /**
     * シャワーキャップ有無を取得します。
     * 
     * @return シャワーキャップ有無
     */
    public String getShowerCapFlg() {
        return showerCapFlg;
    }

    /**
     * ソファーベッド有無を取得します。
     * 
     * @return ソファーベッド有無
     */
    public String getSofaBedFlg() {
        return sofaBedFlg;
    }

    /**
     * ソファーベッド人数を取得します。
     * 
     * @return ソファーベッド人数
     */
    public String getSofaBedNum() {
        return sofaBedNum;
    }

    /**
     * ソファーベッド幅を取得します。
     * 
     * @return ソファーベッド幅
     */
    public String getSofaBedWidth() {
        return sofaBedWidth;
    }

    /**
     * スタッキングベッド有無を取得します。
     * 
     * @return スタッキングベッド有無
     */
    public String getStackingBedFlg() {
        return stackingBedFlg;
    }

    /**
     * スタッキングベッド人数を取得します。
     * 
     * @return スタッキングベッド人数
     */
    public String getStackingBedNum() {
        return stackingBedNum;
    }

    /**
     * スタッキングベッド幅を取得します。
     * 
     * @return スタッキングベッド幅
     */
    public String getStackingBedWidth() {
        return stackingBedWidth;
    }

    /**
     * 様式区分を取得します。
     * 
     * @return 様式区分
     */
    public String getStyleDiv() {
        return styleDiv;
    }

    /**
     * トイレ有無を取得します。
     * 
     * @return トイレ有無
     */
    public String getToiletFlg() {
        return toiletFlg;
    }

    /**
     * 眺望を取得します。
     * 
     * @return 眺望
     */
    public String getViewCd() {
        return viewCd;
    }

    /**
     * ウォシュレット有無を取得します。
     * 
     * @return ウォシュレット有無
     */
    public String getWashletFlg() {
        return washletFlg;
    }

    /**
     * 洗面具有無を取得します。
     * 
     * @return 洗面具有無
     */
    public String getWashToolFlg() {
        return washToolFlg;
    }

    /**
     * ゆかた有無を取得します。
     * 
     * @return ゆかた有無
     */
    public String getYukataFlg() {
        return yukataFlg;
    }

    /**
     * 面積を設定します。
     * 
     * @param area
     *            面積
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 面積単位を設定します。
     * 
     * @param areaUnit
     *            面積単位
     */
    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    /**
     * バス有無を設定します。
     * 
     * @param bathFlg
     *            バス有無
     */
    public void setBathFlg(String bathFlg) {
        this.bathFlg = bathFlg;
    }

    /**
     * バスローブ有無を設定します。
     * 
     * @param bathrobeFlg
     *            バスローブ有無
     */
    public void setBathrobeFlg(String bathrobeFlg) {
        this.bathrobeFlg = bathrobeFlg;
    }

    /**
     * バスタオル有無を設定します。
     * 
     * @param bathTowelFlg
     *            バスタオル有無
     */
    public void setBathTowelFlg(String bathTowelFlg) {
        this.bathTowelFlg = bathTowelFlg;
    }

    /**
     * ベッド幅を設定します。
     * 
     * @param bedWidth
     *            ベッド幅
     */
    public void setBedWidth(String bedWidth) {
        this.bedWidth = bedWidth;
    }

    /**
     * ボディソープ有無を設定します。
     * 
     * @param bodySoapFlg
     *            ボディソープ有無
     */
    public void setBodySoapFlg(String bodySoapFlg) {
        this.bodySoapFlg = bodySoapFlg;
    }

    /**
     * 建物区分を設定します。
     * 
     * @param buildingDiv
     *            建物区分
     */
    public void setBuildingDiv(String buildingDiv) {
        this.buildingDiv = buildingDiv;
    }

    /**
     * 建物区分名称を設定します。
     * 
     * @param buildingDivNm
     *            建物区分名称
     */
    public void setBuildingDivNm(String buildingDivNm) {
        this.buildingDivNm = buildingDivNm;
    }

    /**
     * 建物・部屋タイプ名を設定します。
     * 
     * @param buildingRoomNm
     *            建物・部屋タイプ名
     */
    public void setBuildingRoomNm(String buildingRoomNm) {
        this.buildingRoomNm = buildingRoomNm;
    }

    /**
     * 店員１を設定します。
     * 
     * @param capacityFrom
     *            店員１
     */
    public void setCapacityFrom(String capacityFrom) {
        this.capacityFrom = capacityFrom;
    }

    /**
     * 店員２を設定します。
     * 
     * @param capacityTo
     *            店員２
     */
    public void setCapacityTo(String capacityTo) {
        this.capacityTo = capacityTo;
    }

    /**
     * 子供用寝具コメントを設定します。
     * 
     * @param childBeddingCmt
     *            子供用寝具コメント
     */
    public void setChildBeddingCmt(String childBeddingCmt) {
        this.childBeddingCmt = childBeddingCmt;
    }

    /**
     * 子供用寝具有無を設定します。
     * 
     * @param childBeddingFlg
     *            子供用寝具有無
     */
    public void setChildBeddingFlg(String childBeddingFlg) {
        this.childBeddingFlg = childBeddingFlg;
    }

    /**
     * くし・ブラシ有無を設定します。
     * 
     * @param combFlg
     *            くし・ブラシ有無
     */
    public void setCombFlg(String combFlg) {
        this.combFlg = combFlg;
    }

    /**
     * ドライヤー有無を設定します。
     * 
     * @param dryerFlg
     *            ドライヤー有無
     */
    public void setDryerFlg(String dryerFlg) {
        this.dryerFlg = dryerFlg;
    }

    /**
     * エキストラベッド有無を設定します。
     * 
     * @param extraBedFlg
     *            エキストラベッド有無
     */
    public void setExtraBedFlg(String extraBedFlg) {
        this.extraBedFlg = extraBedFlg;
    }

    /**
     * エキストラベッド人数を設定します。
     * 
     * @param extraBedNum
     *            エキストラベッド人数
     */
    public void setExtraBedNum(String extraBedNum) {
        this.extraBedNum = extraBedNum;
    }

    /**
     * エキストラベッド幅を設定します。
     * 
     * @param extraBedWidth
     *            エキストラベッド幅
     */
    public void setExtraBedWidth(String extraBedWidth) {
        this.extraBedWidth = extraBedWidth;
    }

    /**
     * 施設コード <Primary Key>を設定します。
     * 
     * @param facilityCd
     *            施設コード <Primary Key>
     */
    @Override
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 施設パターン <Primary Key>を設定します。
     * 
     * @param facilityPattern
     *            施設パターン <Primary Key>
     */
    @Override
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * 階層指定を設定します。
     * 
     * @param floorAssign
     *            階層指定
     */
    public void setFloorAssign(String floorAssign) {
        this.floorAssign = floorAssign;
    }

    /**
     * 種別 <Primary Key>を設定します。
     * 
     * @param kindFlg
     *            種別 <Primary Key>
     */
    @Override
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
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
     * ナイトウェア有無を設定します。
     * 
     * @param nightWearFlg
     *            ナイトウェア有無
     */
    public void setNightWearFlg(String nightWearFlg) {
        this.nightWearFlg = nightWearFlg;
    }

    /**
     * パジャマ有無を設定します。
     * 
     * @param pajamasFlg
     *            パジャマ有無
     */
    public void setPajamasFlg(String pajamasFlg) {
        this.pajamasFlg = pajamasFlg;
    }

    /**
     * 部屋タイプ <Primary Key>を設定します。
     * 
     * @param roomType
     *            部屋タイプ <Primary Key>
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    /**
     * セールスポイントを設定します。
     * 
     * @param salesPoint
     *            セールスポイント
     */
    public void setSalesPoint(String salesPoint) {
        this.salesPoint = salesPoint;
    }

    /**
     * シャンプー・リンス有無を設定します。
     * 
     * @param shampooRinseFlg
     *            シャンプー・リンス有無
     */
    public void setShampooRinseFlg(String shampooRinseFlg) {
        this.shampooRinseFlg = shampooRinseFlg;
    }

    /**
     * シャワーブース有無を設定します。
     * 
     * @param showerBoothFlg
     *            シャワーブース有無
     */
    public void setShowerBoothFlg(String showerBoothFlg) {
        this.showerBoothFlg = showerBoothFlg;
    }

    /**
     * シャワーキャップ有無を設定します。
     * 
     * @param showerCapFlg
     *            シャワーキャップ有無
     */
    public void setShowerCapFlg(String showerCapFlg) {
        this.showerCapFlg = showerCapFlg;
    }

    /**
     * ソファーベッド有無を設定します。
     * 
     * @param sofaBedFlg
     *            ソファーベッド有無
     */
    public void setSofaBedFlg(String sofaBedFlg) {
        this.sofaBedFlg = sofaBedFlg;
    }

    /**
     * ソファーベッド人数を設定します。
     * 
     * @param sofaBedNum
     *            ソファーベッド人数
     */
    public void setSofaBedNum(String sofaBedNum) {
        this.sofaBedNum = sofaBedNum;
    }

    /**
     * ソファーベッド幅を設定します。
     * 
     * @param sofaBedWidth
     *            ソファーベッド幅
     */
    public void setSofaBedWidth(String sofaBedWidth) {
        this.sofaBedWidth = sofaBedWidth;
    }

    /**
     * スタッキングベッド有無を設定します。
     * 
     * @param stackingBedFlg
     *            スタッキングベッド有無
     */
    public void setStackingBedFlg(String stackingBedFlg) {
        this.stackingBedFlg = stackingBedFlg;
    }

    /**
     * スタッキングベッド人数を設定します。
     * 
     * @param stackingBedNum
     *            スタッキングベッド人数
     */
    public void setStackingBedNum(String stackingBedNum) {
        this.stackingBedNum = stackingBedNum;
    }

    /**
     * スタッキングベッド幅を設定します。
     * 
     * @param stackingBedWidth
     *            スタッキングベッド幅
     */
    public void setStackingBedWidth(String stackingBedWidth) {
        this.stackingBedWidth = stackingBedWidth;
    }

    /**
     * 様式区分を設定します。
     * 
     * @param styleDiv
     *            様式区分
     */
    public void setStyleDiv(String styleDiv) {
        this.styleDiv = styleDiv;
    }

    /**
     * トイレ有無を設定します。
     * 
     * @param toiletFlg
     *            トイレ有無
     */
    public void setToiletFlg(String toiletFlg) {
        this.toiletFlg = toiletFlg;
    }

    /**
     * 眺望を設定します。
     * 
     * @param viewCd
     *            眺望
     */
    public void setViewCd(String viewCd) {
        this.viewCd = viewCd;
    }

    /**
     * ウォシュレット有無を設定します。
     * 
     * @param washletFlg
     *            ウォシュレット有無
     */
    public void setWashletFlg(String washletFlg) {
        this.washletFlg = washletFlg;
    }

    /**
     * 洗面具有無を設定します。
     * 
     * @param washToolFlg
     *            洗面具有無
     */
    public void setWashToolFlg(String washToolFlg) {
        this.washToolFlg = washToolFlg;
    }

    /**
     * ゆかた有無を設定します。
     * 
     * @param yukataFlg
     *            ゆかた有無
     */
    public void setYukataFlg(String yukataFlg) {
        this.yukataFlg = yukataFlg;
    }

}
