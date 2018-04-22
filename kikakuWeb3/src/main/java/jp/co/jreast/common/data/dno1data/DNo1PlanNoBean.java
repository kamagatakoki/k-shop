package jp.co.jreast.common.data.dno1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.ur00400.data.SendCmtData;

/**
 * <pre>
 * FM���M�p�f�[�^�N���X�B.
 * �@�\�T�v    �F  FM���M�p�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author hu
 * @version 0.1 2006/10/27
 */
public final class DNo1PlanNoBean extends PlanAnsBaseData implements InData {
    /**
     * ���t��.
     */
    private String ansSendAddr;

    /**
     * �{�݃R�[�h .
     */
    private String facilityCd;

    /**
     * �e�l�����A�g .
     */
    private Integer fmCostRelateDiv;

    /**
     * 6�Ѓ^�C�v��.
     */
    private boolean isJr6RoomType = false;

    /**
     * �єԃt���O���X�g .
     * Boolean
     */
    private List isSaibanList;

    /**
     * ��ށ@.
     */
    private Character kind;

    /**
     * ���ʔԁi�U�Ёj
     */
    private String planNo6Off;

    /**
     * ���ʔԁi�����{�j
     */
    private String planNoEJp;

    /**
     * ���[���R�����g�f�[�^ .
     */
    private SendCmtData sendCmtData;

    /**
     * ���t�敪.
     */
    private Integer sendDiv;

    /**
     * ���
     */
    private Integer status;

    /**
     * ���[�UID .
     */
    private String userId;

    /**
     * ���[�U���� .
     */
    private String userNm;

    /**
     * @return ���t��.
     */
    public String getAnsSendAddr() {
        return ansSendAddr;
    }

    /**
     * �{�݃R�[�h .���擾���܂��B
     * 
     * @return �{�݃R�[�h .
     */
    public final String getFacilityCd() {
        return facilityCd;
    }

    /**
     * �e�l�����A�g .���擾���܂��B
     * 
     * @return �e�l�����A�g .
     */
    public final Integer getFmCostRelateDiv() {
        return fmCostRelateDiv;
    }

    /**
     * �єԃt���O���X�g .���擾���܂��B
     * 
     * @return �єԃt���O���X�g .
     */
    public List getIsSaibanList() {
        return isSaibanList;
    }

    /**
     * @return the kind
     */
    public final Character getKind() {
        return kind;
    }

    /**
     * ���ʔԁi�U�Ёj���擾���܂��B
     * 
     * @return ���ʔԁi�U�Ёj
     */
    public String getPlanNo6Off() {
        return planNo6Off;
    }

    /**
     * ���ʔԁi�����{�j���擾���܂��B
     * 
     * @return ���ʔԁi�����{�j
     */
    public String getPlanNoEJp() {
        return planNoEJp;
    }

    /**
     * ���[���R�����g�f�[�^ .���擾���܂��B
     * 
     * @return ���[���R�����g�f�[�^ .
     */
    public SendCmtData getSendCmtData() {
        return sendCmtData;
    }

    /**
     * @return ���t�敪.
     */
    public Integer getSendDiv() {
        return sendDiv;
    }

    /**
     * ��Ԃ��擾���܂��B
     * 
     * @return ���
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ���[�UID .���擾���܂��B
     * 
     * @return ���[�UID .
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�U���� .���擾���܂��B
     * 
     * @return ���[�U���� .
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * 6�Ѓ^�C�v��.���擾���܂��B
     * 
     * @return 6�Ѓ^�C�v��.
     */
    public final boolean isJr6RoomType() {
        return isJr6RoomType;
    }

    /**
     * @param ansSendAddr
     *            ���t��
     */
    public void setAnsSendAddr(String ansSendAddr) {
        this.ansSendAddr = ansSendAddr;
    }

    /**
     * �{�݃R�[�h .��ݒ肵�܂��B
     * 
     * @param facilityCd
     *            �{�݃R�[�h .
     */
    public final void setFacilityCd(final String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �e�l�����A�g .��ݒ肵�܂��B
     * 
     * @param fmCostRelateDiv
     *            �e�l�����A�g .
     */
    public final void setFmCostRelateDiv(final Integer fmCostRelateDiv) {
        this.fmCostRelateDiv = fmCostRelateDiv;
    }

    /**
     * �єԃt���O���X�g .��ݒ肵�܂��B
     * 
     * @param isSaibanList
     *            �єԃt���O���X�g .
     */
    public void setIsSaibanList(List isSaibanList) {
        this.isSaibanList = isSaibanList;
    }

    /**
     * 6�Ѓ^�C�v��.��ݒ肵�܂��B
     * 
     * @param isJr6RoomType
     *            6�Ѓ^�C�v��.
     */
    public final void setJr6RoomType(final boolean isJr6RoomType) {
        this.isJr6RoomType = isJr6RoomType;
    }

    /**
     * @param kind
     *            the kind to set
     */
    public final void setKind(final Character kind) {
        this.kind = kind;
    }

    /**
     * ���ʔԁi�U�Ёj��ݒ肵�܂��B
     * 
     * @param planNo6Off
     *            ���ʔԁi�U�Ёj
     */
    public void setPlanNo6Off(String planNo6Off) {
        this.planNo6Off = planNo6Off;
    }

    /**
     * ���ʔԁi�����{�j��ݒ肵�܂��B
     * 
     * @param planNoEJp
     *            ���ʔԁi�����{�j
     */
    public void setPlanNoEJp(String planNoEJp) {
        this.planNoEJp = planNoEJp;
    }

    /**
     * ���[���R�����g�f�[�^ .��ݒ肵�܂��B
     * 
     * @param sendCmtData
     *            ���[���R�����g�f�[�^ .
     */
    public void setSendCmtData(SendCmtData sendCmtData) {
        this.sendCmtData = sendCmtData;
    }

    /**
     * @param sendDiv
     *            .
     */
    public void setSendDiv(Integer sendDiv) {
        this.sendDiv = sendDiv;
    }

    /**
     * ��Ԃ�ݒ肵�܂��B
     * 
     * @param status
     *            ���
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ���[�UID .��ݒ肵�܂��B
     * 
     * @param userId
     *            ���[�UID .
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ���[�U���� .��ݒ肵�܂��B
     * 
     * @param userNm
     *            ���[�U���� .
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    /**
     * Returns a string containing the characters in this sequence in the same
     * order as this sequence. The length of the string will be the length of
     * this sequence.
     * 
     * @return a string consisting of exactly this sequence of characters
     */
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer(128);

        s.append("planAnsNo=").append(getPlanAnsNo()).append(";");
        s.append("careerNo=").append(getCareerNo()).append(";");
        s.append("fmCostRelateDiv=").append(fmCostRelateDiv).append(";");
        s.append("kind=").append(kind).append(";");
        s.append("facilityCd=").append(facilityCd).append(";");

        return s.toString();
    }

}
