package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 29 17:36:29 JST 2014
 */

/**
 * DNo3OtherItem.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/29 keiken Generated.
 */
public class DNo3OtherItem {

    /** �e�[�u�����F[DP/RM]NO3_���̑����T */
    public static final String TABLE = "D_NO3_OTHER_ITEM";

    /**
     * ����ԍ�
     */
    private Integer careerNo;

    /**
     * ���񓚘A��
     */
    private long planAnsNo;

    /**
     * �V�[�P���X
     */
    private Integer sequence;

    /**
     * �T�[�r�X���e
     */
    private String serviceContent;

    /**
     * ���T���e
     */
    private String specialContent;

    /**
     * ���T���L����
     */
    private String specialRecoItem;

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
     * �V�[�P���X���擾���܂��B
     * 
     * @return �V�[�P���X
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * �T�[�r�X���e���擾���܂��B
     * 
     * @return �T�[�r�X���e
     */
    public String getServiceContent() {
        return serviceContent;
    }

    /**
     * ���T���e���擾���܂��B
     * 
     * @return ���T���e
     */
    public String getSpecialContent() {
        return specialContent;
    }

    /**
     * ���T���L�������擾���܂��B
     * 
     * @return ���T���L����
     */
    public String getSpecialRecoItem() {
        return specialRecoItem;
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
     * �V�[�P���X��ݒ肵�܂��B
     * 
     * @param sequence
     *            �V�[�P���X
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * �T�[�r�X���e��ݒ肵�܂��B
     * 
     * @param serviceContent
     *            �T�[�r�X���e
     */
    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent;
    }

    /**
     * ���T���e��ݒ肵�܂��B
     * 
     * @param specialContent
     *            ���T���e
     */
    public void setSpecialContent(String specialContent) {
        this.specialContent = specialContent;
    }

    /**
     * ���T���L������ݒ肵�܂��B
     * 
     * @param specialRecoItem
     *            ���T���L����
     */
    public void setSpecialRecoItem(String specialRecoItem) {
        this.specialRecoItem = specialRecoItem;
    }

}
