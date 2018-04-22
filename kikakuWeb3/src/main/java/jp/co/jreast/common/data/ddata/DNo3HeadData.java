package jp.co.jreast.common.data.ddata;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;

/**
 * <pre>
 * [DP/RM]NO3�w�b�_�N���X
 * �@�\�T�v �F[DP/RM]NO3�w�b�_�f�[�^���i�[����
 * ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DNo3HeadData {
    /**
     * �񓚏����t��.
     */
    private String ansSendAddr;

    /**
     * �x�ЃR�[�h.
     */
    private String branchCd;

    /**
     * ����ԍ�.
     */
    private Integer careerNo;

    /**
     * �{�݃R�[�h.
     */
    private String facilityCd;

    /**
     * �{�ݕt�я��
     */
    private String facilityDecisionFlg;

    /**
     * �{�ݖ���.
     */
    private String facilityNm;

    /**
     * �{�ݕt�уp�^�[��
     */
    private String facilityPattern;

    /**
     * �{�ݕt�уp�^�[������
     */
    private String facilityPatternNm;

    /**
     * �{�ݕt�ю��
     */
    private String facilitySorts;

    /**
     * �{�݃^�C�v
     */
    private String facilityType;

    /**
     * ��ԁi�{�݁j
     */
    private Integer fpStatus;

    /**
     * ���i����.
     */
    private String goodsNm;

    /**
     * ���.
     */
    private String kindFlg;

    /**
     * ���񓚘A��.
     */
    private Long planAnsNo;

    /**
     * ���ʔԁi�����{�j.
     */
    private String planNoEJp;

    /**
     * �V�[�Y���敪.
     */
    private String seasonDiv;

    /**
     * ���t�敪.
     */
    private Integer sendDiv;

    /**
     * ���.
     */
    private Integer status;

    /**
     * �{�ݕt�уp�^�[��(�ꎞ)
     */
    private String tempFacilityPattern;

    /**
     * �X�V���t
     */
    private String updateYmd;

    /**
     * �X�V��
     */
    private String upYmd;

    /**
     * ���[�UID
     */
    private String userId;

    /**
     * �N�x.
     */
    private String year;

    /**
     * �񓚏����t����擾���܂��B
     * 
     * @return �񓚏����t��
     */
    public String getAnsSendAddr() {
        return ansSendAddr;
    }

    /**
     * �x�ЃR�[�h���擾���܂��B
     * 
     * @return �x�ЃR�[�h
     */
    public String getBranchCd() {
        return branchCd;
    }

    /**
     * �x�Ж��̂��擾���܂��B
     * 
     * @return �x�Ж���
     */
    public String getBranchName() {

        return JreConstants.getListLabel(JreConstants.DIV_BRANCH, branchCd);
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
     * �w��ʒu�ɕ������擾����.
     * 
     * @param pos
     *            �ʒu
     * @param str
     *            ���͕�����
     * @return �w�肷�镶��
     */
    private String getCharAt(String str, int pos) {

        if (StringUtil.isEmpty(str)) {
            return "";
        }
        return "" + str.charAt(pos - 1);
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
     * �{�݃R�[�h�̂P�����ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̂P������
     */
    public String getFacilityCd1() {

        return getCharAt(facilityCd, 1);
    }

    /**
     * �{�݃R�[�h�̂Q�����ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̂Q������
     */
    public String getFacilityCd2() {

        return getCharAt(facilityCd, 2);
    }

    /**
     * �{�݃R�[�h�̂R�����ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̂R������
     */
    public String getFacilityCd3() {

        return getCharAt(facilityCd, 3);
    }

    /**
     * �{�݃R�[�h�̂S�����ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̂S������
     */
    public String getFacilityCd4() {

        return getCharAt(facilityCd, 4);
    }

    /**
     * �{�݃R�[�h�̂T�����ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̂T������
     */
    public String getFacilityCd5() {

        return getCharAt(facilityCd, 5);
    }

    /**
     * �{�݃R�[�h�̂U�����ڂ��擾���܂��B
     * 
     * @return �{�݃R�[�h�̂U������
     */
    public String getFacilityCd6() {

        return getCharAt(facilityCd, 6);
    }

    /**
     * �{�ݕt�я�Ԃ��擾���܂��B
     * 
     * @return �{�ݕt�я��
     */
    public String getFacilityDecisionFlg() {
        return facilityDecisionFlg;
    }

    /**
     * �{�ݖ��̂��擾���܂��B
     * 
     * @return �{�ݖ���
     */
    public String getFacilityNm() {
        return facilityNm;
    }

    /**
     * �{�ݕt�уp�^�[�����擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[��
     */
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * �{�ݕt�уp�^�[���̂P�����ڂ��擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[���̂P������
     */
    public String getFacilityPattern1() {

        return getCharAt(facilityPattern, 1);
    }

    /**
     * �{�ݕt�уp�^�[���̂Q�����ڂ��擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[���̂Q������
     */
    public String getFacilityPattern2() {

        return getCharAt(facilityPattern, 2);
    }

    /**
     * �{�ݕt�уp�^�[���̂R�����ڂ��擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[���̂R������
     */
    public String getFacilityPattern3() {

        return getCharAt(facilityPattern, 3);
    }

    /**
     * �{�ݕt�уp�^�[���̂S�����ڂ��擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[���̂S������
     */
    public String getFacilityPattern4() {

        return getCharAt(facilityPattern, 4);
    }

    /**
     * �{�ݕt�уp�^�[���̂T�����ڂ��擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[���̂T������
     */
    public String getFacilityPattern5() {

        return getCharAt(facilityPattern, 5);
    }

    /**
     * �{�ݕt�уp�^�[���̂U�����ڂ��擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[���̂U������
     */
    public String getFacilityPattern6() {

        return getCharAt(facilityPattern, 6);
    }

    /**
     * �{�ݕt�уp�^�[�����̂��擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[������
     */
    public String getFacilityPatternNm() {
        return facilityPatternNm;
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
     * ��ԁi�{�݁j���擾���܂��B
     * 
     * @return ��ԁi�{�݁j
     */
    public Integer getFpStatus() {
        return fpStatus;
    }

    /**
     * ��ԁi�{�݁j���̂��擾���܂��B
     * 
     * @return ��ԁi�{�݁j����
     */
    public String getFpStatusName() {
        return null == fpStatus ? "" : JreConstants.getListLabel(
                DJreConstants.DIV_FP_STATUS, fpStatus.toString());
    }

    /**
     * ���i���̂��擾���܂��B
     * 
     * @return ���i����
     */
    public String getGoodsNm() {
        return goodsNm;
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
     * ��ʖ��̂��擾���܂��B
     * 
     * @return ��ʖ���
     */
    public String getKindName() {

        return JreConstants.getListLabel(JreConstants.DIV_KIND,
                kindFlg.toString());
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
     * ���ʔԁi�����{�j���擾���܂��B
     * 
     * @return ���ʔԁi�����{�j
     */
    public String getPlanNoEJp() {
        return planNoEJp;
    }

    /**
     * ���ʔԁi�����{�j�̂P�����ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̂P������
     */
    public String getPlanNoEJp1() {

        return getCharAt(planNoEJp, 1);
    }

    /**
     * ���ʔԁi�����{�j�̂Q�����ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̂Q������
     */
    public String getPlanNoEJp2() {

        return getCharAt(planNoEJp, 2);
    }

    /**
     * ���ʔԁi�����{�j�̂R�����ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̂R������
     */
    public String getPlanNoEJp3() {

        return getCharAt(planNoEJp, 3);
    }

    /**
     * ���ʔԁi�����{�j�̂S�����ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̂S������
     */
    public String getPlanNoEJp4() {

        return getCharAt(planNoEJp, 4);
    }

    /**
     * ���ʔԁi�����{�j�̂T�����ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̂T������
     */
    public String getPlanNoEJp5() {

        return getCharAt(planNoEJp, 5);
    }

    /**
     * ���ʔԁi�����{�j�̂U�����ڂ��擾���܂��B
     * 
     * @return ���ʔԁi�����{�j�̂U������
     */
    public String getPlanNoEJp6() {

        return getCharAt(planNoEJp, 6);
    }

    /**
     * �V�[�Y���敪���擾���܂��B
     * 
     * @return �V�[�Y���敪
     */
    public String getSeasonDiv() {
        return seasonDiv;
    }

    /**
     * �V�[�Y���敪���̂��擾���܂�
     * 
     * @return �V�[�Y���敪����
     */
    public String getSeasonDivName() {

        return JreConstants.getListLabel(JreConstants.DIV_SEASON,
                seasonDiv.toString());
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
     * ��Ԃ��擾���܂��B
     * 
     * @return ���
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ��Ԗ��̂��擾���܂�
     * 
     * @return ��Ԗ���
     */
    public String getStatusName() {

        if (getStatus() == null) {
            return null;
        }
        String status = StringUtil.lpad(getStatus().toString(), 2,
                JreConstants.FACILITY1_FLAG);
        String statusName = JreConstants.getListLabel(JreConstants.DIV_STATUS,
                status);
        if (!StringUtil.isEmpty(statusName)) {
            if (statusName.trim().equals(JreConstants.AGREESTATUS_RECORD)) {
                return JreConstants.AGREESTATUS_OTHER;
            } else if (statusName.trim().equals(JreConstants.ADMINSTATUS_ALL)) {
                return JreConstants.ADMINSTATUS_OTHER;
            }
        }

        return statusName;
    }

    /**
     * �{�ݕt�уp�^�[��(�ꎞ)���擾���܂��B
     * 
     * @return �{�ݕt�уp�^�[��(�ꎞ)
     */
    public String getTempFacilityPattern() {
        return tempFacilityPattern;
    }

    /**
     * �X�V���t���擾���܂��B
     * 
     * @return �X�V���t
     */
    public String getUpdateYmd() {
        return updateYmd;
    }

    /**
     * �X�V�����擾���܂��B
     * 
     * @return �X�V��
     */
    public String getUpYmd() {
        if (!(upYmd == null)) {
            if (upYmd.length() > 10) {
                setUpYmd(upYmd.substring(0, 10).replace('-', '/'));
            }
        }
        return upYmd;
    }

    /**
     * ���[�UID���擾���܂��B
     * 
     * @return ���[�UID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �N�x���擾���܂��B
     * 
     * @return �N�x
     */
    public String getYear() {
        return year;
    }

    /**
     * �񓚏����t���ݒ肵�܂��B
     * 
     * @param ansSendAddr
     *            �񓚏����t��
     */
    public void setAnsSendAddr(String ansSendAddr) {
        this.ansSendAddr = ansSendAddr;
    }

    /**
     * �x�ЃR�[�h��ݒ肵�܂��B
     * 
     * @param branchCd
     *            �x�ЃR�[�h
     */
    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
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
     * �{�݃R�[�h��ݒ肵�܂��B
     * 
     * @param facilityCd
     *            �{�݃R�[�h
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �{�ݕt�я�Ԃ�ݒ肵�܂��B
     * 
     * @param facilityDecisionFlg
     *            �{�ݕt�я��
     */
    public void setFacilityDecisionFlg(String facilityDecisionFlg) {
        this.facilityDecisionFlg = facilityDecisionFlg;
    }

    /**
     * �{�ݖ��̂�ݒ肵�܂��B
     * 
     * @param facilityNm
     *            �{�ݖ���
     */
    public void setFacilityNm(String facilityNm) {
        this.facilityNm = facilityNm;
    }

    /**
     * �{�ݕt�уp�^�[����ݒ肵�܂��B
     * 
     * @param facilityPattern
     *            �{�ݕt�уp�^�[��
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * �{�ݕt�уp�^�[�����̂�ݒ肵�܂��B
     * 
     * @param facilityPatternNm
     *            �{�ݕt�уp�^�[������
     */
    public void setFacilityPatternNm(String facilityPatternNm) {
        this.facilityPatternNm = facilityPatternNm;
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
     * ��ԁi�{�݁j��ݒ肵�܂��B
     * 
     * @param fpStatus
     *            ��ԁi�{�݁j
     */
    public void setFpStatus(Integer fpStatus) {
        this.fpStatus = fpStatus;
    }

    /**
     * ���i���̂�ݒ肵�܂��B
     * 
     * @param goodsNm
     *            ���i����
     */
    public void setGoodsNm(String goodsNm) {
        this.goodsNm = goodsNm;
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
     * ���񓚘A�Ԃ�ݒ肵�܂��B
     * 
     * @param planAnsNo
     *            ���񓚘A��
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
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
     * �V�[�Y���敪��ݒ肵�܂��B
     * 
     * @param seasonDiv
     *            �V�[�Y���敪
     */
    public void setSeasonDiv(String seasonDiv) {
        this.seasonDiv = seasonDiv;
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
     * ��Ԃ�ݒ肵�܂��B
     * 
     * @param status
     *            ���
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * �{�ݕt�уp�^�[��(�ꎞ)��ݒ肵�܂��B
     * 
     * @param tempFacilityPattern
     *            �{�ݕt�уp�^�[��(�ꎞ)
     */
    public void setTempFacilityPattern(String tempFacilityPattern) {
        this.tempFacilityPattern = tempFacilityPattern;
    }

    /**
     * �X�V���t��ݒ肵�܂��B
     * 
     * @param updateYmd
     *            �X�V���t
     */
    public void setUpdateYmd(String updateYmd) {
        this.updateYmd = updateYmd;
    }

    /**
     * �X�V����ݒ肵�܂��B
     * 
     * @param upYmd
     *            �X�V��
     */
    public void setUpYmd(String upYmd) {
        this.upYmd = upYmd;
    }

    /**
     * ���[�UID��ݒ肵�܂��B
     * 
     * @param userId
     *            ���[�UID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * �N�x��ݒ肵�܂��B
     * 
     * @param year
     *            �N�x
     */
    public void setYear(String year) {
        this.year = year;
    }

}
