package jp.co.jreast.ur00400.data;

import java.util.Date;

/**
 * ���[���R�����g�f�[�^�N���X�B.
 * 
 * <pre>
 *  �@�\�T�v�@�F�Ȃ�
 *  ���L�����@�F�Ȃ�
 * </pre>
 * 
 * @author �v���N
 */
public class SendCmtData {

    /**
     * �񓚏����t�� .
     */
    private String ansSendAddr;

    /**
     * ���M�R�����g .
     */
    private String cmtTmpl;

    /**
     * �쐬�N���� .
     */
    private Date createYmd;

    /**
     * �񓚏��t�@�C���p�X .
     */
    private String planAnsFilePath;

    /**
     * ���񓚘A�� .
     */
    private Long planAnsNo;

    /**
     * ��揑�t�@�C���p�X .
     */
    private String planFilePath;

    /**
     * �S���� .
     */
    private String tantousya;

    /**
     * FAXNO�̒�������.
     * 
     * @param faxNo
     *            FAXNO
     * @return FAX NO
     */
    private String faxNoForBatch(String faxNo) {
        String newFaxNo = faxNo.trim();
        if (newFaxNo.length() > 15) {
            newFaxNo = newFaxNo.substring(0, 15);
        }
        return newFaxNo;
    }

    /**
     * @return �񓚏����t�� .
     */
    public String getAnsSendAddr() {
        return ansSendAddr;
    }

    /**
     * @return ���M�R�����g
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * @return �쐬�N���� .
     */
    public Date getCreateYmd() {
        return createYmd;
    }

    /**
     * @return �񓚏��t�@�C���p�X .
     */
    public String getPlanAnsFilePath() {
        return planAnsFilePath;
    }

    /**
     * @return ���񓚘A��
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * @return ��揑�t�@�C���p�X .
     */
    public String getPlanFilePath() {
        return planFilePath;
    }

    /**
     * @return �S���� .
     */
    public String getTantousya() {
        return tantousya;
    }

    /**
     * @param ansSendAddr
     *            �񓚏����t�� .
     */
    public void setAnsSendAddr(String ansSendAddr) {
        this.ansSendAddr = faxNoForBatch(ansSendAddr);
    }

    /**
     * @param cmtTmpl
     *            ���M�R�����g
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * @param createYmd
     *            �쐬�N���� .
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * @param planAnsFilePath
     *            �񓚏��t�@�C���p�X .
     */
    public void setPlanAnsFilePath(String planAnsFilePath) {

        this.planAnsFilePath = planAnsFilePath;
    }

    /**
     * @param planAnsNo
     *            ���񓚘A��
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * @param planFilePath
     *            ��揑�t�@�C���p�X .
     */
    public void setPlanFilePath(String planFilePath) {
        this.planFilePath = planFilePath;
    }

    /**
     * @param tantousya
     *            �S���� .
     */
    public void setTantousya(String tantousya) {
        this.tantousya = tantousya;
    }
}
