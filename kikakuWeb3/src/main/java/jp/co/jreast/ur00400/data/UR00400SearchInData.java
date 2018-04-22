package jp.co.jreast.ur00400.data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.FacilityData;
import jp.co.jreast.common.data.PlanAnsData;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * ��ʌ�������Ƃ��g���f�[�^�N���X�B.
 * 
 * <pre>
 *  �@�\�T�v�@�F��ʌ�������Ƃ��g���f�[�^�N���X .
 *  ���L�����@�F�Ȃ�
 * </pre>
 * 
 * @author �v���N
 */
public class UR00400SearchInData implements InData {

    /**
     * �{�݃R�[�h�P�̂S�� .
     */
    private String facilityCd1L;

    /**
     * �{�݃R�[�h�P��2�� .
     */
    private String facilityCd1R;

    /**
     * �{�݃R�[�h2�̂S�� .
     */
    private String facilityCd2L;

    /**
     * �{�݃R�[�h2��2�� .
     */
    private String facilityCd2R;

    /**
     * �{�ݏ��f�[�^ .
     */
    private FacilityData facilityData;

    /**
     * ���M�R�����g�f�[�^ .
     */
    private List list;

    /**
     * ���񓚏��f�[�^ .
     */
    private PlanAnsData planAnsData;

    /**
     * ���M�R�����g�e���v���[�g�f�[�^ .
     */
    private SendCmtTmplData sendCmtTmplData;

    /**
     * ���M���ԂP .
     */
    private String sendYmd1;

    /**
     * ���M���ԂQ .
     */
    private String sendYmd2;

    /**
     * �R���X�g���N�^�[
     * �@�f�[�^���������� .
     */
    public UR00400SearchInData() {
        facilityData = new FacilityData();
        planAnsData = new DPlanAnsData();
        sendCmtTmplData = new SendCmtTmplData();
    }

    /**
     * @return String �x�ЃR�[�h
     */
    public String getBranchCd() {

        return planAnsData.getBranchCd();
    }

    /**
     * @return ����ԍ�
     */
    public Integer getCareerNo() {
        return planAnsData.getCareerNo();
    }

    /**
     * @return �{�݃R�[�h�P
     */
    public String getFacilityCd1() {

        return KikakuWebUtil.appendFacilityCode(facilityCd1L, facilityCd1R,
                JreConstants.FACILITY1_FLAG);
    }

    /**
     * @return �{�݃R�[�h1��4��
     */
    public String getFacilityCd1L() {
        return facilityCd1L;
    }

    /**
     * @return �{�݃R�[�h1��2��
     */
    public String getFacilityCd1R() {
        return facilityCd1R;
    }

    /**
     * @return �{�݃R�[�h2
     */
    public String getFacilityCd2() {
        StringBuffer facilityCd1 = new StringBuffer(this.getFacilityCd1L()
                .trim());
        facilityCd1.append(this.getFacilityCd1R());
        if (facilityCd1.toString().length() < 6
                && facilityCd1.toString().length() > 0
                && this.getFacilityCd2L().trim().equals("")
                && this.getFacilityCd2R().trim().equals("")) {
            return KikakuWebUtil.appendFacilityCode(getFacilityCd1L(),
                    this.getFacilityCd1R(), JreConstants.FACILITY2_FLAG);
        } else {

            return KikakuWebUtil.appendFacilityCode(facilityCd2L, facilityCd2R,
                    JreConstants.FACILITY2_FLAG);
        }

    }

    /**
     * @return �{�݃R�[�h2��4��
     */
    public String getFacilityCd2L() {
        return facilityCd2L;
    }

    /**
     * @return �{�݃R�[�h2��2��
     */
    public String getFacilityCd2R() {
        return facilityCd2R;
    }

    /**
     * @return ���i����
     */
    public String getGoodsNm() {
        return planAnsData.getGoodsNm();
    }

    /**
     * @return ���
     */
    public String getKind() {

        return planAnsData.getKindFlg();
    }

    /**
     * @return Returns the list.
     */
    public List getList() {
        return list;
    }

    /**
     * �f�ގ�ʂ��擾���܂��B
     * 
     * @return �f�ގ��
     */
    public String getMaterialKind() {
        return planAnsData.getMaterialKind();
    }

    /**
     * @return �f�ގ�ʖ���
     * @see jp.co.jreast.common.data.PlanAnsBaseData#getMaterialKindName()
     */
    public String getMaterialKindName() {
        return planAnsData.getMaterialKindName();
    }

    /**
     * @return no2�{�݃^�C�v
     */
    public String getNo2Type() {
        return planAnsData.getNo2Type();
    }

    /**
     * @return no3�{�݃p�^�[��
     */
    public String getNo3Pattern() {
        return planAnsData.getNo3Pattern();
    }

    /**
     * @return no5�{�݃p�^�[��
     */
    public String getNo5Pattern() {
        return planAnsData.getNo5Pattern();
    }

    /**
     * @return ���񓚘A��
     */
    public Long getPlanAnsNo() {
        return planAnsData.getPlanAnsNo();
    }

    /**
     * @return �s���{���R�[�h
     */
    public String getPrefecturesCd() {
        return facilityData.getPrefecturesCd();
    }

    /**
     * @return �V�[�Y���敪
     */
    public String getSeasonDiv() {
        return planAnsData.getSeasonDiv();
    }

    /**
     * @return Returns the sendCmtTmplData.
     */
    public SendCmtTmplData getSendCmtTmplData() {
        return sendCmtTmplData;
    }

    /**
     * @return ���t�敪
     */
    public Integer getSendDiv() {
        return planAnsData.getSendDiv();
    }

    /**
     * @return ���M���t�P
     */
    public String getSendYmd1() {
        return KikakuWebUtil.getDisplayDate(this.sendYmd1,
                getSendYmd1Validate());
    }

    /**
     * @return ���M���t�P
     */
    public String getSendYmd1Validate() {

        return KikakuWebUtil.replaceSpecialSymbolInDate(sendYmd1);
    }

    /**
     * @return ���M���t�Q
     */
    public String getSendYmd2() {
        return KikakuWebUtil.getDisplayDate(this.sendYmd2,
                getSendYmd2Validate());
    }

    /**
     * @return ���M���t2
     */
    public String getSendYmd2Validate() {

        return KikakuWebUtil.replaceSpecialSymbolInDate(sendYmd2);
    }

    /**
     * @return ���
     */
    public String getStatus() {
        return planAnsData.getStatus() == null ? null : StringUtil.lpad(
                planAnsData.getStatus().toString(), 2, '0');
    }

    /**
     * @return �N�x
     */
    public String getYear() {
        return planAnsData.getYear();
    }

    /**
     * @param branchCd
     *            �x�ЃR�[�h
     */
    public void setBranchCd(String branchCd) {

        planAnsData.setBranchCd(branchCd);
    }

    /**
     * @param careerNo
     *            ����ԍ�
     */
    public void setCareerNo(Integer careerNo) {
        planAnsData.setCareerNo(careerNo);
    }

    /**
     * @param facilityCd1L
     *            �{�݃R�[�h2��4��
     */
    public void setFacilityCd1L(String facilityCd1L) {
        this.facilityCd1L = facilityCd1L;
    }

    /**
     * @param facilityCd1R
     *            �{�݃R�[�h1��2��
     */
    public void setFacilityCd1R(String facilityCd1R) {
        this.facilityCd1R = facilityCd1R;
    }

    /**
     * @param facilityCd2L
     *            �{�݃R�[�h2��4��
     */
    public void setFacilityCd2L(String facilityCd2L) {
        this.facilityCd2L = facilityCd2L;
    }

    /**
     * @param facilityCd2R
     *            �{�݃R�[�h2��2��
     */
    public void setFacilityCd2R(String facilityCd2R) {
        this.facilityCd2R = facilityCd2R;
    }

    /**
     * @param facilityData
     *            �{�ݏ��
     */
    public void setFacilityData(FacilityData facilityData) {
        this.facilityData = facilityData;
    }

    /**
     * @param goodsNm
     *            ���i����
     */
    public void setGoodsNm(String goodsNm) {
        planAnsData.setGoodsNm(goodsNm);
    }

    /**
     * @param kind
     *            ���
     */
    public void setKind(String kind) {

        planAnsData.setKindFlg(kind);
    }

    /**
     * @param list
     *            The list to set.
     */
    public void setList(List list) {
        this.list = list;
    }

    /**
     * �f�ގ�ʂ�ݒ肵�܂��B
     * 
     * @param materialKind
     *            �f�ގ��
     */
    public void setMaterialKind(String materialKind) {
        planAnsData.setMaterialKind(materialKind);
    }

    /**
     * @param no2Type
     *            no2�{�݃^�C�v
     */
    public void setNo2Type(String no2Type) {
        planAnsData.setNo2Type(no2Type);
    }

    /**
     * @param no3Pattern
     *            no3�p�^�[��
     */
    public void setNo3Pattern(String no3Pattern) {
        planAnsData.setNo3Pattern(no3Pattern);
    }

    /**
     * @param no5Pattern
     *            no5�p�^�[��
     */
    public void setNo5Pattern(String no5Pattern) {
        planAnsData.setNo5Pattern(no5Pattern);
    }

    /**
     * @param planAnsData
     *            ���񓚏�
     */
    public void setPlanAnsData(PlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param planAnsNo
     *            ���񓚘A��
     */
    public void setPlanAnsNo(Long planAnsNo) {
        planAnsData.setPlanAnsNo(planAnsNo);
    }

    /**
     * @param prefecturesCd
     *            �s���{���R�[�h
     */
    public void setPrefecturesCd(String prefecturesCd) {
        facilityData.setPrefecturesCd(prefecturesCd);
    }

    /**
     * @param seasonDiv
     *            �V�[�Y���敪
     */
    public void setSeasonDiv(String seasonDiv) {
        planAnsData.setSeasonDiv(seasonDiv);
    }

    /**
     * @param sendCmtTmplData
     *            The sendCmtTmplData to set.
     */
    public void setSendCmtTmplData(SendCmtTmplData sendCmtTmplData) {
        this.sendCmtTmplData = sendCmtTmplData;
    }

    /**
     * @param sendDiv
     *            ���t�敪
     */
    public void setSendDiv(Integer sendDiv) {
        planAnsData.setSendDiv(sendDiv);
    }

    /**
     * @param sendYmd1
     *            ���M���t�P
     */
    public void setSendYmd1(String sendYmd1) {
        this.sendYmd1 = sendYmd1;
    }

    /**
     * @param sendYmd2
     *            ���M���t�Q
     */
    public void setSendYmd2(String sendYmd2) {
        this.sendYmd2 = sendYmd2;
    }

    /**
     * @param status
     *            ���
     */
    public void setStatus(String status) {
        planAnsData.setStatus(new Integer(status));
    }

    /**
     * @param year
     *            �N�x
     */
    public void setYear(String year) {
        planAnsData.setYear(year);
    }
}
