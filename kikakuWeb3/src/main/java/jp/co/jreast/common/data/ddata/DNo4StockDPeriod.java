package jp.co.jreast.common.data.ddata;


/**
 * DNo4StockDPeriod.
 * DNo4StockD�����Ԃ̊J�n�ƏI����ێ�
 */
public class DNo4StockDPeriod {

    /**
     * �{��CD
     */
    private String facilityCd;

    /**
     * ����ԍ�
     */
    private Integer careerNo;

    /**
     * ���񓚘A��
     */
    private long planAnsNo;

    /**
     * �݌ɔԍ��i�h���̏ꍇ�A���^�C�v�j
     */
    private String stockNo;

    /**
     * �J�n��
     */
    private String periodStart;

    /**
     * �I����
     */
    private String periodEnd;

    /**
     * ����ԍ����擾���܂��B
     * 
     * @return ����ԍ�
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * ���񓚘A�Ԃ��擾���܂��B
     * 
     * @return ���񓚘A��
     */
    public long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * �݌ɔԍ��i�h���̏ꍇ�A���^�C�v�j���擾���܂��B
     * 
     * @return �݌ɔԍ��i�h���̏ꍇ�A���^�C�v�j
     */
    public String getStockNo() {
        return stockNo;
    }

    /**
     * ����ԍ���ݒ肵�܂��B
     * 
     * @param careerNo
     *            ����ԍ�
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * ���񓚘A�Ԃ�ݒ肵�܂��B
     * 
     * @param planAnsNo
     *            ���񓚘A��
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * �݌ɔԍ��i�h���̏ꍇ�A���^�C�v�j��ݒ肵�܂��B
     * 
     * @param stockNo
     *            �݌ɔԍ��i�h���̏ꍇ�A���^�C�v�j
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    /**
     * �{�݃R�[�h
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * �{�݃R�[�h
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �݌ɊJ�n��
     */
    public String getPeriodStart() {
        return periodStart;
    }

    /**
     * �݌ɊJ�n��
     */
    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    /**
     * �݌ɏI����
     */
    public String getPeriodEnd() {
        return periodEnd;
    }

    /**
     * �݌ɏI����
     */
    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }


}
