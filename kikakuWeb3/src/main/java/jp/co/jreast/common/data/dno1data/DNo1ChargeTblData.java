package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_�����\�f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1_�����\�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1ChargeTblData extends PlanAnsBaseData {
    /**
     * .
     * ���z�i�d���z�j .
     */
    private Integer amount;

    /**
     * .
     * ���z�i�̔��z�j.
     */
    private Integer amountHanbai;

    /**
     * .
     * �p�^�[����� .
     */
    private Integer capaPattern;

    /**
     * �����V�[�P���X .
     */
    private String chargeSequence;

    /**
     * .
     * �l����� .
     */
    private Integer manKind;

    /**
     * �񋟗���
     */
    private Integer offerCharge;

    /**
     * ��̗���
     */
    private Integer oneWayCharge;

    /**
     * �p�^�[����� .
     */
    private String pattern;

    /**
     * �����s�h����
     */
    private Integer tyoStayTax;

    /**
     * @return ���z
     */
    public Integer getAmount() {
        return amount;
    }

    //------ �̔��z�ǉ� ����-------------------------------
    /**
     * @return �̔��z
     */
    public Integer getAmountHanbai() {
        return amountHanbai;
    }

    /**
     * @return �p�^�[�����
     */
    public Integer getCapaPattern() {
        return capaPattern;
    }

    /**
     * @return �����V�[�P���X
     */
    public String getChargeSequence() {
        return chargeSequence;
    }

    /**
     * @return �l�����
     */
    public Integer getManKind() {
        return manKind;
    }

    /**
     * �񋟗������擾���܂��B
     * 
     * @return �񋟗���
     */
    public Integer getOfferCharge() {
        return offerCharge;
    }

    /**
     * ��̗������擾���܂��B
     * 
     * @return ��̗���
     */
    public Integer getOneWayCharge() {
        return oneWayCharge;
    }

    /**
     * @return �p�^�[�����
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * �����s�h���ł��擾���܂��B
     * 
     * @return �����s�h����
     */
    public Integer getTyoStayTax() {
        return tyoStayTax;
    }

    /**
     * @param amount
     *            ���z
     */
    public void setAmount(final Integer amount) {
        this.amount = amount;
    }

    /**
     * @param amountHanbai
     *            �̔��z
     */
    public void setAmountHanbai(Integer amountHanbai) {
        this.amountHanbai = amountHanbai;
    }

    /**
     * @param capaPattern
     *            �p�^�[�����
     */
    public void setCapaPattern(final Integer capaPattern) {
        this.capaPattern = capaPattern;
    }

    //-----------------------------------------------------

    /**
     * @param chargeSequence
     *            �����V�[�P���X
     */
    public void setChargeSequence(String chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    /**
     * @param manKind
     *            �l�����
     */
    public void setManKind(final Integer manKind) {
        this.manKind = manKind;
    }

    /**
     * �񋟗�����ݒ肵�܂��B
     * 
     * @param offerCharge
     *            �񋟗���
     */
    public void setOfferCharge(Integer offerCharge) {
        this.offerCharge = offerCharge;
    }

    /**
     * ��̗�����ݒ肵�܂��B
     * 
     * @param oneWayCharge
     *            ��̗���
     */
    public void setOneWayCharge(Integer oneWayCharge) {
        this.oneWayCharge = oneWayCharge;
    }

    /**
     * @param pattern
     *            �p�^�[�����
     */
    public void setPattern(final String pattern) {
        this.pattern = pattern;
    }

    /**
     * �����s�h���ł�ݒ肵�܂��B
     * 
     * @param tyoStayTax
     *            �����s�h����
     */
    public void setTyoStayTax(Integer tyoStayTax) {
        this.tyoStayTax = tyoStayTax;
    }

}
