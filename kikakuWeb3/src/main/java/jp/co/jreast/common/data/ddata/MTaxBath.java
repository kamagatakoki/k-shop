package jp.co.jreast.common.data.ddata;

/**
 * �����Ń}�X�^ �G���e�B�e�B
 * 
 * <pre>
 *   �@�\�T�v �F 
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/12/11
 * @author ITG
 */
public class MTaxBath {

    /** �����ŒP���i��l�j */
    private String bathTaxAdult;

    /** �����ŒP���i���l�j */
    private String bathTaxChild;

    /** �쐬�N���� */
    private String createYmd;

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �S���҂h�c */
    private String personInChargeId;

    /** �ݒ���Ԃe�q�n�l */
    private String termFrom;

    /** �ݒ���Ԃs�n */
    private String termTo;

    /** �X�V�N���� */
    private String upYmd;

    /**
     * �����ŒP���i��l�j���擾���܂��B
     * 
     * @return �����ŒP���i��l�j
     */
    public String getBathTaxAdult() {
        return bathTaxAdult;
    }

    /**
     * �����ŒP���i���l�j���擾���܂��B
     * 
     * @return �����ŒP���i���l�j
     */
    public String getBathTaxChild() {
        return bathTaxChild;
    }

    /**
     * �쐬�N�������擾���܂��B
     * 
     * @return �쐬�N����
     */
    public String getCreateYmd() {
        return createYmd;
    }

    /**
     * �{�݃R�[�h���擾���܂��B
     * 
     * @return �{�݃R�[�h
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * �S���҂h�c���擾���܂��B
     * 
     * @return �S���҂h�c
     */
    public String getPersonInChargeId() {
        return personInChargeId;
    }

    /**
     * �ݒ���Ԃe�q�n�l���擾���܂��B
     * 
     * @return �ݒ���Ԃe�q�n�l
     */
    public String getTermFrom() {
        return termFrom;
    }

    /**
     * �ݒ���Ԃs�n���擾���܂��B
     * 
     * @return �ݒ���Ԃs�n
     */
    public String getTermTo() {
        return termTo;
    }

    /**
     * �X�V�N�������擾���܂��B
     * 
     * @return �X�V�N����
     */
    public String getUpYmd() {
        return upYmd;
    }

    /**
     * �����ŒP���i��l�j��ݒ肵�܂��B
     * 
     * @param bathTaxAdult
     *            �����ŒP���i��l�j
     */
    public void setBathTaxAdult(String bathTaxAdult) {
        this.bathTaxAdult = bathTaxAdult;
    }

    /**
     * �����ŒP���i���l�j��ݒ肵�܂��B
     * 
     * @param bathTaxChild
     *            �����ŒP���i���l�j
     */
    public void setBathTaxChild(String bathTaxChild) {
        this.bathTaxChild = bathTaxChild;
    }

    /**
     * �쐬�N������ݒ肵�܂��B
     * 
     * @param createYmd
     *            �쐬�N����
     */
    public void setCreateYmd(String createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * �{�݃R�[�h��ݒ肵�܂��B
     * 
     * @param facilityCd
     *            �{�݃R�[�h
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �S���҂h�c��ݒ肵�܂��B
     * 
     * @param personInChargeId
     *            �S���҂h�c
     */
    public void setPersonInChargeId(String personInChargeId) {
        this.personInChargeId = personInChargeId;
    }

    /**
     * �ݒ���Ԃe�q�n�l��ݒ肵�܂��B
     * 
     * @param termFrom
     *            �ݒ���Ԃe�q�n�l
     */
    public void setTermFrom(String termFrom) {
        this.termFrom = termFrom;
    }

    /**
     * �ݒ���Ԃs�n��ݒ肵�܂��B
     * 
     * @param termTo
     *            �ݒ���Ԃs�n
     */
    public void setTermTo(String termTo) {
        this.termTo = termTo;
    }

    /**
     * �X�V�N������ݒ肵�܂��B
     * 
     * @param upYmd
     *            �X�V�N����
     */
    public void setUpYmd(String upYmd) {
        this.upYmd = upYmd;
    }
}
