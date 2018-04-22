package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 01 16:22:59 JST 2014
 */

/**
 * D_plan_ans_facilityVo.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/01 keiken Generated.
 */
public class DPlanAnsFacility {

    /** �e�[�u���� */
    public static final String TABLE = "D_PLAN_ANS_FACILITY";

    /**
     * �{�݃R�[�h
     */
    private String facilityCd;

    /**
     * �{�݃p�^�[��_NO3
     */
    private String facilityPatternNo3;

    /**
     * �{�݃p�^�[��_NO5
     */
    private String facilityPatternNo5;

    /**
     * �{�݃^�C�v
     */
    private String facilityType;

    /**
     * ���
     */
    private String kindFlg;

    /**
     * ���񓚘A��
     */
    private long planAnsNo;

    /**
     * ���[�UID
     */
    private String userId;

    /**
     * �{�݃R�[�h���擾���܂��B
     * @return �{�݃R�[�h
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * �{�݃R�[�h��ݒ肵�܂��B
     * @param facilityCd �{�݃R�[�h
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �{�݃p�^�[��_NO3���擾���܂��B
     * @return �{�݃p�^�[��_NO3
     */
    public String getFacilityPatternNo3() {
        return facilityPatternNo3;
    }

    /**
     * �{�݃p�^�[��_NO3��ݒ肵�܂��B
     * @param facilityPatternNo3 �{�݃p�^�[��_NO3
     */
    public void setFacilityPatternNo3(String facilityPatternNo3) {
        this.facilityPatternNo3 = facilityPatternNo3;
    }

    /**
     * �{�݃p�^�[��_NO5���擾���܂��B
     * @return �{�݃p�^�[��_NO5
     */
    public String getFacilityPatternNo5() {
        return facilityPatternNo5;
    }

    /**
     * �{�݃p�^�[��_NO5��ݒ肵�܂��B
     * @param facilityPatternNo5 �{�݃p�^�[��_NO5
     */
    public void setFacilityPatternNo5(String facilityPatternNo5) {
        this.facilityPatternNo5 = facilityPatternNo5;
    }

    /**
     * �{�݃^�C�v���擾���܂��B
     * @return �{�݃^�C�v
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * �{�݃^�C�v��ݒ肵�܂��B
     * @param facilityType �{�݃^�C�v
     */
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    /**
     * ��ʂ��擾���܂��B
     * @return ���
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * ��ʂ�ݒ肵�܂��B
     * @param kindFlg ���
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * ���񓚘A�Ԃ��擾���܂��B
     * @return ���񓚘A��
     */
    public long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * ���񓚘A�Ԃ�ݒ肵�܂��B
     * @param planAnsNo ���񓚘A��
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * ���[�UID���擾���܂��B
     * @return ���[�UID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�UID��ݒ肵�܂��B
     * @param userId ���[�UID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
