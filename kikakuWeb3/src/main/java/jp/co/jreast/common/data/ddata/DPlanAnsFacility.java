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

    /** テーブル名 */
    public static final String TABLE = "D_PLAN_ANS_FACILITY";

    /**
     * 施設コード
     */
    private String facilityCd;

    /**
     * 施設パターン_NO3
     */
    private String facilityPatternNo3;

    /**
     * 施設パターン_NO5
     */
    private String facilityPatternNo5;

    /**
     * 施設タイプ
     */
    private String facilityType;

    /**
     * 種別
     */
    private String kindFlg;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * ユーザID
     */
    private String userId;

    /**
     * 施設コードを取得します。
     * @return 施設コード
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設コードを設定します。
     * @param facilityCd 施設コード
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 施設パターン_NO3を取得します。
     * @return 施設パターン_NO3
     */
    public String getFacilityPatternNo3() {
        return facilityPatternNo3;
    }

    /**
     * 施設パターン_NO3を設定します。
     * @param facilityPatternNo3 施設パターン_NO3
     */
    public void setFacilityPatternNo3(String facilityPatternNo3) {
        this.facilityPatternNo3 = facilityPatternNo3;
    }

    /**
     * 施設パターン_NO5を取得します。
     * @return 施設パターン_NO5
     */
    public String getFacilityPatternNo5() {
        return facilityPatternNo5;
    }

    /**
     * 施設パターン_NO5を設定します。
     * @param facilityPatternNo5 施設パターン_NO5
     */
    public void setFacilityPatternNo5(String facilityPatternNo5) {
        this.facilityPatternNo5 = facilityPatternNo5;
    }

    /**
     * 施設タイプを取得します。
     * @return 施設タイプ
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * 施設タイプを設定します。
     * @param facilityType 施設タイプ
     */
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    /**
     * 種別を取得します。
     * @return 種別
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * 種別を設定します。
     * @param kindFlg 種別
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * 企画回答連番を取得します。
     * @return 企画回答連番
     */
    public long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * 企画回答連番を設定します。
     * @param planAnsNo 企画回答連番
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * ユーザIDを取得します。
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザIDを設定します。
     * @param userId ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
