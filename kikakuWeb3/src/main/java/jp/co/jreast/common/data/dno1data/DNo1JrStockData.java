package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_JR在庫データクラス。.
 * 機能概要    ：  NO1_JR在庫データを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1JrStockData extends PlanAnsBaseData {
    /**
     * 建物種別.
     */
    private String buildKind;

    /**
     * 定員１.
     */
    private String capacityFrom;

    /**
     * 定員２.
     */
    private String capacityTo;

    /**
     * 室タイプが既存か否か
     */
    private boolean existRoomType;

    /**
     * 他企画名称
     */
    private String otherPlanNam;

    /**
     * 部屋タイプ.
     */
    private Integer roomType;

    /**
     * 在庫区分.
     */
    private Integer stockDiv;

    /**
     * 在庫タイプ種別.
     */
    private String stockType;

    /**
     * 眺望コード.
     */
    private String viewCd;

    /**
     * 建物種別.を取得します。
     * 
     * @return 建物種別.
     */
    public String getBuildKind() {
        return buildKind;
    }

    /**
     * 定員１.を取得します。
     * 
     * @return 定員１.
     */
    public String getCapacityFrom() {
        return capacityFrom;
    }

    /**
     * 定員２.を取得します。
     * 
     * @return 定員２.
     */
    public String getCapacityTo() {
        return capacityTo;
    }

    /**
     * 室タイプが既存か否かを取得します。
     * @return 室タイプが既存か否か
     */
    public boolean isExistRoomType() {
        return existRoomType;
    }

    /**
     * 室タイプが既存か否かを設定します。
     * @param existRoomType 室タイプが既存か否か
     */
    public void setExistRoomType(boolean existRoomType) {
        this.existRoomType = existRoomType;
    }

    /**
     * 他企画名称を取得します。
     * 
     * @return 他企画名称
     */
    public String getOtherPlanNam() {
        return otherPlanNam;
    }

    /**
     * 部屋タイプ.を取得します。
     * 
     * @return 部屋タイプ.
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * 在庫区分.を取得します。
     * 
     * @return 在庫区分.
     */
    public Integer getStockDiv() {
        return stockDiv;
    }

    /**
     * 在庫タイプ種別.を取得します。
     * 
     * @return 在庫タイプ種別.
     */
    public String getStockType() {
        return stockType;
    }

    /**
     * 眺望コード.を取得します。
     * 
     * @return 眺望コード.
     */
    public String getViewCd() {
        return viewCd;
    }

    /**
     * 建物種別.を設定します。
     * 
     * @param buildKind
     *            建物種別.
     */
    public void setBuildKind(String buildKind) {
        this.buildKind = buildKind;
    }

    /**
     * 定員１.を設定します。
     * 
     * @param capacityFrom
     *            定員１.
     */
    public void setCapacityFrom(String capacityFrom) {
        this.capacityFrom = capacityFrom;
    }

    /**
     * 定員２.を設定します。
     * 
     * @param capacityTo
     *            定員２.
     */
    public void setCapacityTo(String capacityTo) {
        this.capacityTo = capacityTo;
    }

    /**
     * 他企画名称を設定します。
     * 
     * @param otherPlanNam
     *            他企画名称
     */
    public void setOtherPlanNam(String otherPlanNam) {
        this.otherPlanNam = otherPlanNam;
    }

    /**
     * 部屋タイプ.を設定します。
     * 
     * @param roomType
     *            部屋タイプ.
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    /**
     * 在庫区分.を設定します。
     * 
     * @param stockDiv
     *            在庫区分.
     */
    public void setStockDiv(Integer stockDiv) {
        this.stockDiv = stockDiv;
    }

    /**
     * 在庫タイプ種別.を設定します。
     * 
     * @param stockType
     *            在庫タイプ種別.
     */
    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    /**
     * 眺望コード.を設定します。
     * 
     * @param viewCd
     *            眺望コード.
     */
    public void setViewCd(String viewCd) {
        this.viewCd = viewCd;
    }

}
