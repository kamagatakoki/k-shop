package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Fri Oct 17 13:25:13 JST 2014
 */
import java.io.Serializable;
import java.util.Date;

/**
 * D_facility_manageVo.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/17 keiken Generated.
 */
public class DFacilityManage implements Serializable {

    /**
     * �V���A���i���o�[
     */
    private static final long serialVersionUID = 1L;

    /**
     * �e�[�u����
     */
    public static final String TABLE = "D_FACILITY_MANAGE";

    /**
     * �{�̗���ԍ�
     */
    private Integer bodyCareerNo;

    /**
     * ����ԍ�
     */
    private Integer careerNo;

    /**
     * �쐬�N����
     */
    private Date createYmd;

    /**
     * �{�݃R�[�h
     */
    private String facilityCd;

    /**
     * �{�݊m��t���O
     */
    private String facilityDecisionFlg;

    /**
     * �{�݃p�^�[��
     */
    private String facilityPattern;

    /**
     * �{�݃p�^�[������
     */
    private String facilityPatternNm;

    /**
     * �t�я�񑗕t��
     */
    private String facilitySendAddr;

    /**
     * �{�ݕt�ю��
     */
    private String facilitySorts;

    /**
     * �{�݃^�C�v
     */
    private String facilityType;

    /**
     * �{�݃p�^�[�����
     */
    private Integer fpStatus;

    /**
     * ���
     */
    private String kindFlg;

    /**
     * �ŐV�t���O
     */
    private String newFlg;

    /**
     * ���t�敪
     */
    private Integer sendDiv;

    /**
     * ���t�A����e�`�w
     */
    private String senderFax;

    /**
     * ���t�S���Җ�
     */
    private String senderNm;

    /**
     * ���t�A����d�b
     */
    private String senderTel;

    /**
     * ���M���
     */
    private String sendStatus;

    /**
     * �X�V�N����
     */
    private Date upYmd;

    /**
     * ���[�U�[ID
     */
    private String userId;

    /**
     * �A�g��
     */
    private Integer zouseiRelateCnt;

    /**
     * Constractor
     */
    public DFacilityManage() {
    }

    /**
     * �R���X�g���N�^
     * 
     * @param facilityCd
     *            �{�݃R�[�h
     * @param kindFlg
     *            ���
     * @param facilitySorts
     *            �{�ݕt�ю��
     * @param facilityPattern
     *            �{�݃p�^�[��
     * @param careerNo
     *            ����ԍ�
     */
    public DFacilityManage(String facilityCd, String kindFlg,
            String facilitySorts, String facilityPattern, Integer careerNo) {
        this.facilityCd = facilityCd;
        this.kindFlg = kindFlg;
        this.facilitySorts = facilitySorts;
        this.facilityPattern = facilityPattern;
        this.careerNo = careerNo;
    }

    /**
     * �{�̗���ԍ����擾���܂��B
     * 
     * @return �{�̗���ԍ�
     */
    public Integer getBodyCareerNo() {
        return bodyCareerNo;
    }

    /**
     * ����ԍ����擾���܂��B
     * 
     * @return ����ԍ�
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * �쐬�N�������擾���܂��B
     * 
     * @return �쐬�N����
     */
    public Date getCreateYmd() {
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
     * �{�݊m��t���O���擾���܂��B
     * 
     * @return �{�݊m��t���O
     */
    public String getFacilityDecisionFlg() {
        return facilityDecisionFlg;
    }

    /**
     * �{�݃p�^�[�����擾���܂��B
     * 
     * @return �{�݃p�^�[��
     */
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * �{�݃p�^�[�����̂��擾���܂��B
     * 
     * @return �{�݃p�^�[������
     */
    public String getFacilityPatternNm() {
        return facilityPatternNm;
    }

    /**
     * �t�я�񑗕t����擾���܂��B
     * 
     * @return �t�я�񑗕t��
     */
    public String getFacilitySendAddr() {
        return facilitySendAddr;
    }

    /**
     * �{�ݕt�ю�ނ��擾���܂��B
     * 
     * @return �{�ݕt�ю��
     */
    public String getFacilitySorts() {
        return facilitySorts;
    }

    /**
     * �{�݃^�C�v���擾���܂��B
     * 
     * @return �{�݃^�C�v
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * �{�݃p�^�[����Ԃ��擾���܂��B
     * 
     * @return �{�݃p�^�[�����
     */
    public Integer getFpStatus() {
        return fpStatus;
    }

    /**
     * ��ʂ��擾���܂��B
     * 
     * @return ���
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * �ŐV�t���O���擾���܂��B
     * 
     * @return �ŐV�t���O
     */
    public String getNewFlg() {
        return newFlg;
    }

    /**
     * ���t�敪���擾���܂��B
     * 
     * @return ���t�敪
     */
    public Integer getSendDiv() {
        return sendDiv;
    }

    /**
     * ���t�A����e�`�w���擾���܂��B
     * 
     * @return ���t�A����e�`�w
     */
    public String getSenderFax() {
        return senderFax;
    }

    /**
     * ���t�S���Җ����擾���܂��B
     * 
     * @return ���t�S���Җ�
     */
    public String getSenderNm() {
        return senderNm;
    }

    /**
     * ���t�A����d�b���擾���܂��B
     * 
     * @return ���t�A����d�b
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * ���M��Ԃ��擾���܂��B
     * 
     * @return ���M���
     */
    public String getSendStatus() {
        return sendStatus;
    }

    /**
     * �X�V�N�������擾���܂��B
     * 
     * @return �X�V�N����
     */
    public Date getUpYmd() {
        return upYmd;
    }

    /**
     * ���[�U�[ID���擾���܂��B
     * 
     * @return ���[�U�[ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �A�g�񐔂��擾���܂��B
     * 
     * @return �A�g��
     */
    public Integer getZouseiRelateCnt() {
        return zouseiRelateCnt;
    }

    /**
     * �{�̗���ԍ���ݒ肵�܂��B
     * 
     * @param bodyCareerNo
     *            �{�̗���ԍ�
     */
    public void setBodyCareerNo(Integer bodyCareerNo) {
        this.bodyCareerNo = bodyCareerNo;
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
     * �쐬�N������ݒ肵�܂��B
     * 
     * @param createYmd
     *            �쐬�N����
     */
    public void setCreateYmd(Date createYmd) {
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
     * �{�݊m��t���O��ݒ肵�܂��B
     * 
     * @param facilityDecisionFlg
     *            �{�݊m��t���O
     */
    public void setFacilityDecisionFlg(String facilityDecisionFlg) {
        this.facilityDecisionFlg = facilityDecisionFlg;
    }

    /**
     * �{�݃p�^�[����ݒ肵�܂��B
     * 
     * @param facilityPattern
     *            �{�݃p�^�[��
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * �{�݃p�^�[�����̂�ݒ肵�܂��B
     * 
     * @param facilityPatternNm
     *            �{�݃p�^�[������
     */
    public void setFacilityPatternNm(String facilityPatternNm) {
        this.facilityPatternNm = facilityPatternNm;
    }

    /**
     * �t�я�񑗕t���ݒ肵�܂��B
     * 
     * @param facilitySendAddr
     *            �t�я�񑗕t��
     */
    public void setFacilitySendAddr(String facilitySendAddr) {
        this.facilitySendAddr = facilitySendAddr;
    }

    /**
     * �{�ݕt�ю�ނ�ݒ肵�܂��B
     * 
     * @param facilitySorts
     *            �{�ݕt�ю��
     */
    public void setFacilitySorts(String facilitySorts) {
        this.facilitySorts = facilitySorts;
    }

    /**
     * �{�݃^�C�v��ݒ肵�܂��B
     * 
     * @param facilityType
     *            �{�݃^�C�v
     */
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    /**
     * �{�݃p�^�[����Ԃ�ݒ肵�܂��B
     * 
     * @param fpStatus
     *            �{�݃p�^�[�����
     */
    public void setFpStatus(Integer fpStatus) {
        this.fpStatus = fpStatus;
    }

    /**
     * ��ʂ�ݒ肵�܂��B
     * 
     * @param kindFlg
     *            ���
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * �ŐV�t���O��ݒ肵�܂��B
     * 
     * @param newFlg
     *            �ŐV�t���O
     */
    public void setNewFlg(String newFlg) {
        this.newFlg = newFlg;
    }

    /**
     * ���t�敪��ݒ肵�܂��B
     * 
     * @param sendDiv
     *            ���t�敪
     */
    public void setSendDiv(Integer sendDiv) {
        this.sendDiv = sendDiv;
    }

    /**
     * ���t�A����e�`�w��ݒ肵�܂��B
     * 
     * @param senderFax
     *            ���t�A����e�`�w
     */
    public void setSenderFax(String senderFax) {
        this.senderFax = senderFax;
    }

    /**
     * ���t�S���Җ���ݒ肵�܂��B
     * 
     * @param senderNm
     *            ���t�S���Җ�
     */
    public void setSenderNm(String senderNm) {
        this.senderNm = senderNm;
    }

    /**
     * ���t�A����d�b��ݒ肵�܂��B
     * 
     * @param senderTel
     *            ���t�A����d�b
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    /**
     * ���M��Ԃ�ݒ肵�܂��B
     * 
     * @param sendStatus
     *            ���M���
     */
    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * �X�V�N������ݒ肵�܂��B
     * 
     * @param upYmd
     *            �X�V�N����
     */
    public void setUpYmd(Date upYmd) {
        this.upYmd = upYmd;
    }

    /**
     * ���[�U�[ID��ݒ肵�܂��B
     * 
     * @param userId
     *            ���[�U�[ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * �A�g�񐔂�ݒ肵�܂��B
     * 
     * @param zouseiRelateCnt
     *            �A�g��
     */
    public void setZouseiRelateCnt(Integer zouseiRelateCnt) {
        this.zouseiRelateCnt = zouseiRelateCnt;
    }

}
