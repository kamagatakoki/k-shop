package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Dec 17 10:56:55 JST 2014
 */

/**
 * DNo4StockH.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/12/17 keiken Generated.
 */
public class DNo4StockH {

    /**
     * テーブル名
     */
    public static final String TABLE = "D_NO4_STOCK_H";

    /**
     * 地区名称（カナ）
     */
    private String areaKana;

    /**
     * 地区名称
     */
    private String areaNm;

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * 在庫名称（カナ）
     */
    private String stockKana;

    /**
     * 在庫名称（漢字）
     */
    private String stockKanj;

    /**
     * 在庫番号（宿泊の場合、室タイプ）
     */
    private String stockNo;

    /**
     * 在庫単位
     */
    private String stockUnit;

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
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 企画回答連番を取得します。
     * 
     * @return 企画回答連番
     */
    public long getPlanAnsNo() {
        return planAnsNo;
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
     * 在庫番号（宿泊の場合、室タイプ）を取得します。
     * 
     * @return 在庫番号（宿泊の場合、室タイプ）
     */
    public String getStockNo() {
        return stockNo;
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
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * 企画回答連番を設定します。
     * 
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
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
     * 在庫番号（宿泊の場合、室タイプ）を設定します。
     * 
     * @param stockNo
     *            在庫番号（宿泊の場合、室タイプ）
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
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

}
