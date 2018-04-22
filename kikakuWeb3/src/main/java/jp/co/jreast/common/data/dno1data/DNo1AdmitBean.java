package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.data.ddata.DPlanAnsFacility;
import jp.co.jreast.common.data.no1data.No1BusinessCheckBean;

/**
 * <pre>
 * [DP/RM]NO1_���F���̓f�[�^�N���X�B.
 * �@�\�T�v    �F  [DP/RM]NO1_���F���̓f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1AdmitBean implements InData {

    /**
     * NO1_���F��(Fax�̏ꍇ�A�{�݂̏��F��).
     */
    private DNo1AckInfoData ackInfoFacilityData;

    /**
     * .
     * ��������.
     */
    private AnsSearchData ansSearchData;

    /**
     * �`�F�b�Nbean.
     */
    private No1BusinessCheckBean businessCheckBean;

    /**
     * �����P�ʋ敪
     */
    private String chargeDiv;

    /**
     * ���񓚏�_�{�ݏ��
     */
    private DPlanAnsFacility dPlanAnsFacility;

    /**
     * .
     * ���񓚏��f�[�^.
     */
    private DNo1FormBean formData;

    /**
     * ���l.
     */
    private MemoData memo;

    /**
     * NO1_���F��.
     */
    private DNo1AckInfoData no1AckInfoData;

    /**
     * NO2���
     */
    private Integer no2Status;

    /**
     * .
     * �A����Fax
     */
    private String senderFax;

    /**
     * ���t�S���Җ�.(�`�F�b�N��)
     */
    private String senderNm;

    /**
     * ���t�A����d�b.
     */
    private String senderTel;

    /**
     * ���.
     */
    private Integer status;

    /**
     * ���[�U�f�[�^.
     */
    private UserData userData;

    /**
     * @return NO1_���F��(Fax�̏ꍇ�A�{�݂̏��F��).
     */
    public DNo1AckInfoData getAckInfoFacilityData() {
        return ackInfoFacilityData;
    }

    /**
     * @return ��������
     */
    public AnsSearchData getAnsSearchData() {
        return ansSearchData;
    }

    /**
     * @return businessCheckBean
     */
    public No1BusinessCheckBean getBusinessCheckBean() {
        return businessCheckBean;
    }

    /**
     * ���񓚏�_�{�ݏ����擾���܂��B
     * 
     * @return ���񓚏�_�{�ݏ��
     */
    public DPlanAnsFacility getDPlanAnsFacility() {
        return dPlanAnsFacility;
    }

    /**
     * �����P�ʋ敪���擾���܂��B
     * @return �����P�ʋ敪
     */
    public String getChargeDiv() {
        return chargeDiv;
    }

    /**
     * �����P�ʋ敪��ݒ肵�܂��B
     * @param chargeDiv �����P�ʋ敪
     */
    public void setChargeDiv(String chargeDiv) {
        this.chargeDiv = chargeDiv;
    }

    /**
     * @return [DP/RM]���񓚏��f�[�^.
     */
    public final DNo1FormBean getFormData() {
        return formData;
    }

    /**
     * @return ���
     */
    public String getKindFlg() {
        return this.getAnsSearchData().getKindFlg();
    }

    /**
     * @return the memo
     */
    public final MemoData getMemo() {
        return memo;
    }

    /**
     * @return NO1_���F��.
     */
    public final DNo1AckInfoData getNo1AckInfoData() {
        return no1AckInfoData;
    }

    /**
     * NO2��Ԃ��擾���܂��B
     * 
     * @return NO2���
     */
    public Integer getNo2Status() {
        return no2Status;
    }

    /**
     * @return �A����Fax
     */
    public String getSenderFax() {
        return senderFax;
    }

    /**
     * @return ���t�S���Җ�(�`�F�b�N��)
     */
    public String getSenderNm() {
        return senderNm;
    }

    /**
     * @return ���t�A����d�b
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * @return the status
     */
    public final Integer getStatus() {
        return status;
    }

    /**
     * @return the userData
     */
    public final UserData getUserData() {
        return userData;
    }

    /**
     * @param ackInfoFacilityData
     *            NO1_���F��(Fax�̏ꍇ�A�{�݂̏��F��).
     */
    public void setAckInfoFacilityData(DNo1AckInfoData ackInfoFacilityData) {
        this.ackInfoFacilityData = ackInfoFacilityData;
    }

    /**
     * @param ansSearchData
     *            ��������
     */
    public void setAnsSearchData(final AnsSearchData ansSearchData) {
        this.ansSearchData = ansSearchData;
    }

    /**
     * @param businessCheckBean
     *            businessCheckBean
     */
    public void setBusinessCheckBean(No1BusinessCheckBean businessCheckBean) {
        this.businessCheckBean = businessCheckBean;
    }

    /**
     * ���񓚏�_�{�ݏ���ݒ肵�܂��B
     * 
     * @param dPlanAnsFacility
     *            ���񓚏�_�{�ݏ��
     */
    public void setDPlanAnsFacility(DPlanAnsFacility dPlanAnsFacility) {
        this.dPlanAnsFacility = dPlanAnsFacility;
    }

    /**
     * @param formData
     *            [DP/RM]���񓚏��f�[�^.
     */
    public final void setFormData(final DNo1FormBean formData) {
        this.formData = formData;
    }

    /**
     * @param memo
     *            the memo to set
     */
    public final void setMemo(final MemoData memo) {
        this.memo = memo;
    }

    /**
     * @param no1AckInfoData
     *            NO1_���F��.
     */
    public final void setNo1AckInfoData(final DNo1AckInfoData no1AckInfoData) {
        this.no1AckInfoData = no1AckInfoData;
    }

    /**
     * NO2��Ԃ�ݒ肵�܂��B
     * 
     * @param no2Status
     *            NO2���
     */
    public void setNo2Status(Integer no2Status) {
        this.no2Status = no2Status;
    }

    /**
     * @param senderFax
     *            �A����Fax
     */
    public void setSenderFax(String senderFax) {
        this.senderFax = senderFax;
    }

    /**
     * @param senderNm
     *            ���t�S���Җ�(�`�F�b�N��)
     */
    public void setSenderNm(String senderNm) {
        this.senderNm = senderNm;
    }

    /**
     * @param senderTel
     *            ���t�A����d�b
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    /**
     * @param status
     *            the status to set
     */
    public final void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @param userData
     *            the userData to set
     */
    public final void setUserData(final UserData userData) {
        this.userData = userData;
    }
}
