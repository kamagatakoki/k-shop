package jp.co.jreast.ur00400.data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsData;

/**
 * ��ʑ��M����Ƃ��g���f�[�^�N���X�B.
 * 
 * <pre>
 *  �@�\�T�v�@�F��ʑ��M����Ƃ��g���f�[�^�N���X .
 *  ���L�����@�F�Ȃ�
 * </pre>
 * 
 * @author �v���N
 */
public class UR00400ListInData implements InData {

    /**
     * ���M�R�����g .
     */
    private String cmtTmpl;

    /**
     * �I��Disabled�t���O.
     */
    private String disabledFlg;

    /**
     * ���[�����M�G���[�t���O .
     */
    private boolean mailError;

    /**
     * �H������
     */
    private String mealCondNm;

    /**
     * No1Disabled�t���O.
     */
    private String no1DisabledFlg;

    /**
     * No1�{�^���̃t���O .
     */
    private String no1Flag;

    /**
     * No2Disabled�t���O.
     */
    private String no2DisabledFlg;

    /**
     * No2�{�^���̃t���O .
     */
    private String no2Flag;

    /**
     * No3Disabled�t���O.
     */
    private String no3DisabledFlg;

    /**
     * No3�{�^���̃t���O .
     */
    private String no3Flag;

    /**
     * No4Disabled�t���O.
     */
    private String no4DisabledFlg;

    /**
     * No4�{�^���̃t���O .
     */
    private String no4Flag;

    /**
     * No5Disabled�t���O.
     */
    private String no5DisabledFlg;

    /**
     * No5�{�^���̃t���O .
     */
    private String no5Flag;

    /**
     * ���񓚏��f�[�^ .
     */
    private PlanAnsData planAnsData;

    /**
     * �����^�C�v5
     */
    private String roomTypeFive;

    /**
     * �����^�C�v4
     */
    private String roomTypeFour;

    //PDF�쐬�����C��(No2�ANo3�ANo5�Ή�) 2010/02/17 add by s30873 =====E n d
    //=======================START �����^�C�v�ƐH�������\�����߁A�ϐ��ǉ��@s30873 =======================
    /**
     * �����^�C�v1
     */
    private String roomTypeOne;

    /**
     * �����^�C�v6
     */
    private String roomTypeSix;

    /**
     * �����^�C�v3
     */
    private String roomTypeThree;

    /**
     * �����^�C�v2
     */
    private String roomTypeTwo;

    /**
     * �@�I���̃t���O .
     */
    private String selectFlag;

    /**
     * �R���X�g���N�^�[
     * �@�f�[�^���������� .
     */
    public UR00400ListInData() {
        planAnsData = new PlanAnsData();
        selectFlag = JreConstants.FLG_TRUE;
        no1Flag = JreConstants.FLG_TRUE;
        no2Flag = JreConstants.FLG_TRUE;
        no3Flag = JreConstants.FLG_TRUE;
        no4Flag = JreConstants.FLG_TRUE;
        no5Flag = JreConstants.FLG_TRUE;
        disabledFlg = JreConstants.FLG_TRUE;
        no1DisabledFlg = JreConstants.FLG_TRUE;
        no2DisabledFlg = JreConstants.FLG_TRUE;
        no3DisabledFlg = JreConstants.FLG_TRUE;
        no4DisabledFlg = JreConstants.FLG_TRUE;
        no5DisabledFlg = JreConstants.FLG_TRUE;
        mailError = false;
    }

    /**
     * @return String �񓚏����t��
     */
    public String getAnsSendAddr() {
        return planAnsData.getAnsSendAddr();
    }

    /**
     * @return �x�ЃR�[�h
     */
    public String getBranchCd() {
        return planAnsData.getBranchCd();
    }

    /**
     * @return �x�Ж���
     */
    public String getBranchName() {

        return planAnsData.getBranchName();
    }

    /**
     * @return ����ԍ�
     */
    public Integer getCareerNo() {
        return planAnsData.getCareerNo();
    }

    /**
     * @return cmtTmpl ���M�R�����g
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * @return Returns the disabledFlg.
     */
    public String getDisabledFlg() {
        return disabledFlg;
    }

    /**
     * @return �{�݃R�[�h
     */
    public String getFacilityCd() {
        return planAnsData.getFacilityCd();
    }

    /**
     * @return �{�ݖ���
     */
    public String getFacilityNm() {
        return planAnsData.getFacilityNm();
    }

    /**
     * �O�S���{�݃R�[�h���擾���� .
     * 
     * @return �O�S���{�݃R�[�h
     */
    public String getFourFacilityCd() {
        return planAnsData.getFourFacilityCd();
    }

    /**
     * @return ���i����
     */
    public String getGoodsNm() {
        return planAnsData.getGoodsNm();
    }

    /**
     * @return kindFlg ���
     */
    public String getKindFlg() {
        return planAnsData.getKindFlg();
    }

    /**
     * @return ���[�����M�G���[�t���O
     */
    public boolean getMailError() {
        return mailError;
    }

    /**
     * @return �f�ގ��
     * @see jp.co.jreast.common.data.PlanAnsBaseData#getMaterialKind()
     */
    public String getMaterialKind() {
        return planAnsData.getMaterialKind();
    }

    /**
     * @return �f�ގ�ʖ�
     * @see jp.co.jreast.common.data.PlanAnsBaseData#getMaterialKindName()
     */
    public String getMaterialKindName() {
        return planAnsData.getMaterialKindName();
    }

    /**
     * @return mealCondNm
     */
    public String getMealCondNm() {
        return mealCondNm;
    }

    /**
     * @return Returns the no1DisabledFlg.
     */
    public String getNo1DisabledFlg() {
        return no1DisabledFlg;
    }

    /**
     * @return Returns the no1Flag.
     */
    public String getNo1Flag() {
        return no1Flag;
    }

    /**
     * @return Returns the no2DisabledFlg.
     */
    public String getNo2DisabledFlg() {
        return no2DisabledFlg;
    }

    /**
     * @return Returns the no2Flag.
     */
    public String getNo2Flag() {
        return no2Flag;
    }

    //PDF�쐬�����C��(No2�ANo3�ANo5�Ή�) 2010/02/17 add by s30873 =====Start
    /**
     * @return no2�{�݃^�C�v
     */
    public String getNo2Type() {
        return this.planAnsData.getNo2Type();
    }

    /**
     * @return Returns the no3DisabledFlg.
     */
    public String getNo3DisabledFlg() {
        return no3DisabledFlg;
    }

    /**
     * @return Returns the no3Flag.
     */
    public String getNo3Flag() {
        return no3Flag;
    }

    /**
     * @return No3�{�݃p�^�[��
     */
    public String getNo3Pattern() {
        return this.planAnsData.getNo3Pattern();
    }

    /**
     * @return Returns the no4DisabledFlg.
     */
    public String getNo4DisabledFlg() {
        return no4DisabledFlg;
    }

    /**
     * @return Returns the no4Flag.
     */
    public String getNo4Flag() {
        return no4Flag;
    }

    /**
     * @return Returns the no5DisabledFlg.
     */
    public String getNo5DisabledFlg() {
        return no5DisabledFlg;
    }

    /**
     * @return Returns the no5Flag.
     */
    public String getNo5Flag() {
        return no5Flag;
    }

    /**
     * @return no5�{�݃p�^�[��
     */
    public String getNo5Pattern() {
        return this.planAnsData.getNo5Pattern();
    }

    /**
     * @return ���񓚏��f�[�^
     */
    public PlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return ���񓚘A��
     */
    public Long getPlanAnsNo() {
        return planAnsData.getPlanAnsNo();
    }

    /**
     * �����^�C�v5���擾���܂��B
     * 
     * @return �����^�C�v5
     */
    public String getRoomTypeFive() {
        return roomTypeFive;
    }

    /**
     * ���^�C�v����5
     * 
     * <pre></pre>
     * 
     * @return ���^�C�v����5
     */
    public String getRoomTypeFiveNm() {
        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeFive);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeFive);

    }

    /**
     * �����^�C�v4���擾���܂��B
     * 
     * @return �����^�C�v4
     */
    public String getRoomTypeFour() {
        return roomTypeFour;
    }

    /**
     * ���^�C�v����4
     * 
     * <pre></pre>
     * 
     * @return ���^�C�v����4
     */
    public String getRoomTypeFourNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeFour);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeFour);
    }

    /**
     * @return roomTypeOne
     */
    public String getRoomTypeOne() {
        return roomTypeOne;
    }

    /**
     * @return ���^�C�v����1
     */
    public String getRoomTypeOneNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeOne);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeOne);

    }

    /**
     * �����^�C�v6���擾���܂��B
     * 
     * @return �����^�C�v6
     */
    public String getRoomTypeSix() {
        return roomTypeSix;
    }

    /**
     * ���^�C�v����6
     * 
     * <pre></pre>
     * 
     * @return ���^�C�v����6
     */
    public String getRoomTypeSixNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeSix);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeSix);

    }

    /**
     * @return roomTypeThree
     */
    public String getRoomTypeThree() {
        return roomTypeThree;
    }

    /**
     * @return ���^�C�v����3
     */
    public String getRoomTypeThreeNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeThree);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeThree);

    }

    /**
     * @return roomTypeTwo
     */
    public String getRoomTypeTwo() {
        return roomTypeTwo;
    }

    /**
     * @return ���^�C�v����2
     */
    public String getRoomTypeTwoNm() {
        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeTwo);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeTwo);

    }

    /**
     * @return Returns the selectFlag.
     */
    public String getSelectFlag() {
        return selectFlag;
    }

    /**
     * @return ���t�敪
     */
    public Integer getSendDiv() {
        return planAnsData.getSendDiv();
    }

    /**
     * @return ���tFAX
     */
    public String getSenderFax() {
        return planAnsData.getSenderFax();
    }

    /**
     * @return ���t�S���Җ�
     */
    public String getSenderNm() {
        return planAnsData.getSenderNm();
    }

    /**
     * @return ���t�A����d�b
     */
    public String getSenderTel() {
        return planAnsData.getSenderTel();
    }

    /**
     * @return ���M���.
     */
    public String getSendStatus() {
        return this.planAnsData.getSendStatus();
    }

    /**
     * @return ���M��Ԗ�
     */
    public String getSendStatusName() {
        return this.planAnsData.getSendStatusName();
    }

    /**
     * @return ���
     */
    public Integer getStatus() {
        return planAnsData.getStatus();
    }

    /**
     * @return ��Ԗ���
     */
    public String getStatusName() {
        return planAnsData.getStatusName();
    }

    /**
     * ��Q���{�݃R�[�h���擾���� .
     * 
     * @return ��Q���{�݃R�[�h
     */
    public String getTwoFacilityCd() {
        return planAnsData.getTwoFacilityCd();
    }

    /**
     * @return �X�V��
     */
    public String getUpdateUser() {
        return planAnsData.getUserId();
    }

    /**
     * @param ansSendAddr
     *            �񓚏����t��
     */
    public void setAnsSendAddr(String ansSendAddr) {
        planAnsData.setAnsSendAddr(ansSendAddr);
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
     * @param cmtTmpl
     *            ���M�R�����g
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * @param disabledFlg
     *            The disabledFlg to set.
     */
    public void setDisabledFlg(String disabledFlg) {
        this.disabledFlg = disabledFlg;
    }

    /**
     * @param facilityCd
     *            �{�݃R�[�h
     */
    public void setFacilityCd(String facilityCd) {
        planAnsData.setFacilityCd(facilityCd);
    }

    /**
     * @param facilityNm
     *            �{�ݖ���
     */
    public void setFacilityNm(String facilityNm) {
        planAnsData.setFacilityNm(facilityNm);
    }

    /**
     * @param goodsNm
     *            ���i����
     */
    public void setGoodsNm(String goodsNm) {
        planAnsData.setGoodsNm(goodsNm);
    }

    /**
     * @param kindFlg
     *            ���
     */
    public void setKindFlg(String kindFlg) {
        planAnsData.setKindFlg(kindFlg);
    }

    /**
     * @param mailError
     *            ���[�����M�G���[�t���O
     */
    public void setMailError(boolean mailError) {
        this.mailError = mailError;
    }

    /**
     * @param materialKind
     *            �f�ގ��
     * @see jp.co.jreast.common.data.PlanAnsBaseData#setMaterialKind(java.lang.String)
     */
    public void setMaterialKind(String materialKind) {
        planAnsData.setMaterialKind(materialKind);
    }

    /**
     * @param mealCondNm
     *            �ݒ肷�� mealCondNm
     */
    public void setMealCondNm(String mealCondNm) {
        this.mealCondNm = mealCondNm;
    }

    /**
     * @param no1DisabledFlg
     *            The no1DisabledFlg to set.
     */
    public void setNo1DisabledFlg(String no1DisabledFlg) {
        this.no1DisabledFlg = no1DisabledFlg;
    }

    /**
     * @param no1Flag
     *            The no1Flag to set.
     */
    public void setNo1Flag(String no1Flag) {
        this.no1Flag = no1Flag;
    }

    /**
     * @param no2DisabledFlg
     *            The no2DisabledFlg to set.
     */
    public void setNo2DisabledFlg(String no2DisabledFlg) {
        this.no2DisabledFlg = no2DisabledFlg;
    }

    //=======================E N D �����^�C�v�ƐH�������\�����߁A�ϐ��ǉ��@s30873 =======================

    /**
     * @param no2Flag
     *            The no2Flag to set.
     */
    public void setNo2Flag(String no2Flag) {
        this.no2Flag = no2Flag;
    }

    /**
     * @param no2Type
     *            No2�{�݃^�C�v
     */
    public void setNo2Type(String no2Type) {
        this.planAnsData.setNo2Type(no2Type);
    }

    /**
     * @param no3DisabledFlg
     *            The no3DisabledFlg to set.
     */
    public void setNo3DisabledFlg(String no3DisabledFlg) {
        this.no3DisabledFlg = no3DisabledFlg;
    }

    /**
     * @param no3Flag
     *            The no3Flag to set.
     */
    public void setNo3Flag(String no3Flag) {
        this.no3Flag = no3Flag;
    }

    /**
     * @param no3Pattern
     *            no3�{�݃p�^�[��
     */
    public void setNo3Pattern(String no3Pattern) {
        this.planAnsData.setNo3Pattern(no3Pattern);
    }

    /**
     * @param no4DisabledFlg
     *            The no4DisabledFlg to set.
     */
    public void setNo4DisabledFlg(String no4DisabledFlg) {
        this.no4DisabledFlg = no4DisabledFlg;
    }

    /**
     * @param no4Flag
     *            The no4Flag to set.
     */
    public void setNo4Flag(String no4Flag) {
        this.no4Flag = no4Flag;
    }

    /**
     * @param no5DisabledFlg
     *            The no5DisabledFlg to set.
     */
    public void setNo5DisabledFlg(String no5DisabledFlg) {
        this.no5DisabledFlg = no5DisabledFlg;
    }

    /**
     * @param no5Flag
     *            The no5Flag to set.
     */
    public void setNo5Flag(String no5Flag) {
        this.no5Flag = no5Flag;
    }

    /**
     * @param no5Pattern
     *            no5�{�݃p�^�[��
     */
    public void setNo5Pattern(String no5Pattern) {
        this.planAnsData.setNo5Pattern(no5Pattern);
    }

    /**
     * @param planAnsData
     *            ���񓚏��f�[�^
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
     * �����^�C�v5��ݒ肵�܂��B
     * 
     * @param roomTypeFive
     *            �����^�C�v5
     */
    public void setRoomTypeFive(String roomTypeFive) {
        this.roomTypeFive = roomTypeFive;
    }

    /**
     * �����^�C�v4��ݒ肵�܂��B
     * 
     * @param roomTypeFour
     *            �����^�C�v4
     */
    public void setRoomTypeFour(String roomTypeFour) {
        this.roomTypeFour = roomTypeFour;
    }

    /**
     * @param roomTypeOne
     *            �ݒ肷�� roomTypeOne
     */
    public void setRoomTypeOne(String roomTypeOne) {
        this.roomTypeOne = roomTypeOne;
    }

    /**
     * �����^�C�v6��ݒ肵�܂��B
     * 
     * @param roomTypeSix
     *            �����^�C�v6
     */
    public void setRoomTypeSix(String roomTypeSix) {
        this.roomTypeSix = roomTypeSix;
    }

    /**
     * @param roomTypeThree
     *            �ݒ肷�� roomTypeThree
     */
    public void setRoomTypeThree(String roomTypeThree) {
        this.roomTypeThree = roomTypeThree;
    }

    /**
     * @param roomTypeTwo
     *            �ݒ肷�� roomTypeTwo
     */
    public void setRoomTypeTwo(String roomTypeTwo) {
        this.roomTypeTwo = roomTypeTwo;
    }

    /**
     * @param selectFlag
     *            The selectFlag to set.
     */
    public void setSelectFlag(String selectFlag) {
        this.selectFlag = selectFlag;
    }

    /**
     * @param sendDiv
     *            ���t�敪
     */
    public void setSendDiv(Integer sendDiv) {
        planAnsData.setSendDiv(sendDiv);
    }

    /**
     * @param senderFax
     *            ���tFAX
     */
    public void setSenderFax(String senderFax) {
        planAnsData.setSenderFax(senderFax);
    }

    /**
     * @param senderNm
     *            ���t�S���Җ�
     */
    public void setSenderNm(String senderNm) {
        planAnsData.setSenderNm(senderNm);
    }

    /**
     * @param senderTel
     *            ���t�A����d�b
     */
    public void setSenderTel(String senderTel) {
        planAnsData.setSenderTel(senderTel);
    }

    /**
     * @param sendStatus
     *            ���M���
     */
    public void setSendStatus(String sendStatus) {
        this.planAnsData.setSendStatus(sendStatus);
    }

    /**
     * @param status
     *            ���
     */
    public void setStatus(Integer status) {
        planAnsData.setStatus(status);
    }

    /**
     * @param updateUser
     *            �X�V��
     */
    public void setUpdateUser(String updateUser) {
        planAnsData.setUserId(updateUser);
    }
}
