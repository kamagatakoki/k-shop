package jp.co.jreast.common.data.ddata;

/**
 * FAX��ԊǗ� �G���e�B�e�B
 * 
 * <pre>
 *   �@�\�T�v �F 
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class BFaxStatus {

    /** ���M�R�����g */
    private String cmtTmpl;

    /** �t�я��{�݃R�[�h */
    private String facilityCd;

    /** �t�я��L�[���� */
    private String facilityKey;

    /** FAX�ԍ� */
    private String faxNo;

    /** �W���uID */
    private Long jobId;

    /** �񓚏��t�@�C���p�X */
    private String planAnsFilePath;

    /** ���񓚘A�� */
    private Long planAnsNo;

    /** ��揑�t�@�C���p�X */
    private String planFilePath;

    /** ���M���� */
    private String sendTimestamp;

    /** �S���� */
    private String tantousya;

    /**
     * ���M�R�����g���擾���܂��B
     * 
     * @return ���M�R�����g
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * �t�я��{�݃R�[�h���擾���܂��B
     * 
     * @return �t�я��{�݃R�[�h
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * �t�я��L�[���ڂ��擾���܂��B
     * 
     * @return �t�я��L�[����
     */
    public String getFacilityKey() {
        return facilityKey;
    }

    /**
     * FAX�ԍ����擾���܂��B
     * 
     * @return FAX�ԍ�
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * �W���uID���擾���܂��B
     * 
     * @return �W���uID
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * �񓚏��t�@�C���p�X���擾���܂��B
     * 
     * @return �񓚏��t�@�C���p�X
     */
    public String getPlanAnsFilePath() {
        return planAnsFilePath;
    }

    /**
     * ���񓚘A�Ԃ��擾���܂��B
     * 
     * @return ���񓚘A��
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * ��揑�t�@�C���p�X���擾���܂��B
     * 
     * @return ��揑�t�@�C���p�X
     */
    public String getPlanFilePath() {
        return planFilePath;
    }

    /**
     * ���M�������擾���܂��B
     * 
     * @return ���M����
     */
    public String getSendTimestamp() {
        return sendTimestamp;
    }

    /**
     * �S���҂��擾���܂��B
     * 
     * @return �S����
     */
    public String getTantousya() {
        return tantousya;
    }

    /**
     * ���M�R�����g��ݒ肵�܂��B
     * 
     * @param cmtTmpl
     *            ���M�R�����g
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * �t�я��{�݃R�[�h��ݒ肵�܂��B
     * 
     * @param facilityCd
     *            �t�я��{�݃R�[�h
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �t�я��L�[���ڂ�ݒ肵�܂��B
     * 
     * @param facilityKey
     *            �t�я��L�[����
     */
    public void setFacilityKey(String facilityKey) {
        this.facilityKey = facilityKey;
    }

    /**
     * FAX�ԍ���ݒ肵�܂��B
     * 
     * @param faxNo
     *            FAX�ԍ�
     */
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    /**
     * �W���uID��ݒ肵�܂��B
     * 
     * @param jobId
     *            �W���uID
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * �񓚏��t�@�C���p�X��ݒ肵�܂��B
     * 
     * @param planAnsFilePath
     *            �񓚏��t�@�C���p�X
     */
    public void setPlanAnsFilePath(String planAnsFilePath) {
        this.planAnsFilePath = planAnsFilePath;
    }

    /**
     * ���񓚘A�Ԃ�ݒ肵�܂��B
     * 
     * @param planAnsNo
     *            ���񓚘A��
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * ��揑�t�@�C���p�X��ݒ肵�܂��B
     * 
     * @param planFilePath
     *            ��揑�t�@�C���p�X
     */
    public void setPlanFilePath(String planFilePath) {
        this.planFilePath = planFilePath;
    }

    /**
     * ���M������ݒ肵�܂��B
     * 
     * @param sendTimestamp
     *            ���M����
     */
    public void setSendTimestamp(String sendTimestamp) {
        this.sendTimestamp = sendTimestamp;
    }

    /**
     * �S���҂�ݒ肵�܂��B
     * 
     * @param tantousya
     *            �S����
     */
    public void setTantousya(String tantousya) {
        this.tantousya = tantousya;
    }

}
