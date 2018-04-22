package jp.co.jreast.common.data.ddata;


/**
 * DNo4StockDPeriod.
 * DNo4StockDより期間の開始と終了を保持
 */
public class DNo4StockDPeriod {

    /**
     * 施設CD
     */
    private String facilityCd;

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * 在庫番号（宿泊の場合、室タイプ）
     */
    private String stockNo;

    /**
     * 開始日
     */
    private String periodStart;

    /**
     * 終了日
     */
    private String periodEnd;

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
     * 在庫番号（宿泊の場合、室タイプ）を取得します。
     * 
     * @return 在庫番号（宿泊の場合、室タイプ）
     */
    public String getStockNo() {
        return stockNo;
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
     * 在庫番号（宿泊の場合、室タイプ）を設定します。
     * 
     * @param stockNo
     *            在庫番号（宿泊の場合、室タイプ）
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    /**
     * 施設コード
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設コード
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 在庫開始日
     */
    public String getPeriodStart() {
        return periodStart;
    }

    /**
     * 在庫開始日
     */
    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    /**
     * 在庫終了日
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    /**
     * 在庫終了日
     */
    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }


}
