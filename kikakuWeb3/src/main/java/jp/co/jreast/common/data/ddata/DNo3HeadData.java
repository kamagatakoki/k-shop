package jp.co.jreast.common.data.ddata;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;

/**
 * <pre>
 * [DP/RM]NO3ヘッダクラス
 * 機能概要 ：[DP/RM]NO3ヘッダデータを格納する
 * 特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DNo3HeadData {
    /**
     * 回答書送付先.
     */
    private String ansSendAddr;

    /**
     * 支社コード.
     */
    private String branchCd;

    /**
     * 履歴番号.
     */
    private Integer careerNo;

    /**
     * 施設コード.
     */
    private String facilityCd;

    /**
     * 施設付帯状態
     */
    private String facilityDecisionFlg;

    /**
     * 施設名称.
     */
    private String facilityNm;

    /**
     * 施設付帯パターン
     */
    private String facilityPattern;

    /**
     * 施設付帯パターン名称
     */
    private String facilityPatternNm;

    /**
     * 施設付帯種類
     */
    private String facilitySorts;

    /**
     * 施設タイプ
     */
    private String facilityType;

    /**
     * 状態（施設）
     */
    private Integer fpStatus;

    /**
     * 商品名称.
     */
    private String goodsNm;

    /**
     * 種別.
     */
    private String kindFlg;

    /**
     * 企画回答連番.
     */
    private Long planAnsNo;

    /**
     * 企画通番（東日本）.
     */
    private String planNoEJp;

    /**
     * シーズン区分.
     */
    private String seasonDiv;

    /**
     * 送付区分.
     */
    private Integer sendDiv;

    /**
     * 状態.
     */
    private Integer status;

    /**
     * 施設付帯パターン(一時)
     */
    private String tempFacilityPattern;

    /**
     * 更新日付
     */
    private String updateYmd;

    /**
     * 更新日
     */
    private String upYmd;

    /**
     * ユーザID
     */
    private String userId;

    /**
     * 年度.
     */
    private String year;

    /**
     * 回答書送付先を取得します。
     * 
     * @return 回答書送付先
     */
    public String getAnsSendAddr() {
        return ansSendAddr;
    }

    /**
     * 支社コードを取得します。
     * 
     * @return 支社コード
     */
    public String getBranchCd() {
        return branchCd;
    }

    /**
     * 支社名称を取得します。
     * 
     * @return 支社名称
     */
    public String getBranchName() {

        return JreConstants.getListLabel(JreConstants.DIV_BRANCH, branchCd);
    }

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 指定位置に文字を取得する.
     * 
     * @param pos
     *            位置
     * @param str
     *            入力文字列
     * @return 指定する文字
     */
    private String getCharAt(String str, int pos) {

        if (StringUtil.isEmpty(str)) {
            return "";
        }
        return "" + str.charAt(pos - 1);
    }

    /**
     * 施設コードを取得します。
     * 
     * @return 施設コード
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設コードの１文字目を取得します。
     * 
     * @return 施設コードの１文字目
     */
    public String getFacilityCd1() {

        return getCharAt(facilityCd, 1);
    }

    /**
     * 施設コードの２文字目を取得します。
     * 
     * @return 施設コードの２文字目
     */
    public String getFacilityCd2() {

        return getCharAt(facilityCd, 2);
    }

    /**
     * 施設コードの３文字目を取得します。
     * 
     * @return 施設コードの３文字目
     */
    public String getFacilityCd3() {

        return getCharAt(facilityCd, 3);
    }

    /**
     * 施設コードの４文字目を取得します。
     * 
     * @return 施設コードの４文字目
     */
    public String getFacilityCd4() {

        return getCharAt(facilityCd, 4);
    }

    /**
     * 施設コードの５文字目を取得します。
     * 
     * @return 施設コードの５文字目
     */
    public String getFacilityCd5() {

        return getCharAt(facilityCd, 5);
    }

    /**
     * 施設コードの６文字目を取得します。
     * 
     * @return 施設コードの６文字目
     */
    public String getFacilityCd6() {

        return getCharAt(facilityCd, 6);
    }

    /**
     * 施設付帯状態を取得します。
     * 
     * @return 施設付帯状態
     */
    public String getFacilityDecisionFlg() {
        return facilityDecisionFlg;
    }

    /**
     * 施設名称を取得します。
     * 
     * @return 施設名称
     */
    public String getFacilityNm() {
        return facilityNm;
    }

    /**
     * 施設付帯パターンを取得します。
     * 
     * @return 施設付帯パターン
     */
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * 施設付帯パターンの１文字目を取得します。
     * 
     * @return 施設付帯パターンの１文字目
     */
    public String getFacilityPattern1() {

        return getCharAt(facilityPattern, 1);
    }

    /**
     * 施設付帯パターンの２文字目を取得します。
     * 
     * @return 施設付帯パターンの２文字目
     */
    public String getFacilityPattern2() {

        return getCharAt(facilityPattern, 2);
    }

    /**
     * 施設付帯パターンの３文字目を取得します。
     * 
     * @return 施設付帯パターンの３文字目
     */
    public String getFacilityPattern3() {

        return getCharAt(facilityPattern, 3);
    }

    /**
     * 施設付帯パターンの４文字目を取得します。
     * 
     * @return 施設付帯パターンの４文字目
     */
    public String getFacilityPattern4() {

        return getCharAt(facilityPattern, 4);
    }

    /**
     * 施設付帯パターンの５文字目を取得します。
     * 
     * @return 施設付帯パターンの５文字目
     */
    public String getFacilityPattern5() {

        return getCharAt(facilityPattern, 5);
    }

    /**
     * 施設付帯パターンの６文字目を取得します。
     * 
     * @return 施設付帯パターンの６文字目
     */
    public String getFacilityPattern6() {

        return getCharAt(facilityPattern, 6);
    }

    /**
     * 施設付帯パターン名称を取得します。
     * 
     * @return 施設付帯パターン名称
     */
    public String getFacilityPatternNm() {
        return facilityPatternNm;
    }

    /**
     * 施設付帯種類を取得します。
     * 
     * @return 施設付帯種類
     */
    public String getFacilitySorts() {
        return facilitySorts;
    }

    /**
     * 施設タイプを取得します。
     * 
     * @return 施設タイプ
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * 状態（施設）を取得します。
     * 
     * @return 状態（施設）
     */
    public Integer getFpStatus() {
        return fpStatus;
    }

    /**
     * 状態（施設）名称を取得します。
     * 
     * @return 状態（施設）名称
     */
    public String getFpStatusName() {
        return null == fpStatus ? "" : JreConstants.getListLabel(
                DJreConstants.DIV_FP_STATUS, fpStatus.toString());
    }

    /**
     * 商品名称を取得します。
     * 
     * @return 商品名称
     */
    public String getGoodsNm() {
        return goodsNm;
    }

    /**
     * 種別を取得します。
     * 
     * @return 種別
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * 種別名称を取得します。
     * 
     * @return 種別名称
     */
    public String getKindName() {

        return JreConstants.getListLabel(JreConstants.DIV_KIND,
                kindFlg.toString());
    }

    /**
     * 企画回答連番を取得します。
     * 
     * @return 企画回答連番
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * 企画通番（東日本）を取得します。
     * 
     * @return 企画通番（東日本）
     */
    public String getPlanNoEJp() {
        return planNoEJp;
    }

    /**
     * 企画通番（東日本）の１文字目を取得します。
     * 
     * @return 企画通番（東日本）の１文字目
     */
    public String getPlanNoEJp1() {

        return getCharAt(planNoEJp, 1);
    }

    /**
     * 企画通番（東日本）の２文字目を取得します。
     * 
     * @return 企画通番（東日本）の２文字目
     */
    public String getPlanNoEJp2() {

        return getCharAt(planNoEJp, 2);
    }

    /**
     * 企画通番（東日本）の３文字目を取得します。
     * 
     * @return 企画通番（東日本）の３文字目
     */
    public String getPlanNoEJp3() {

        return getCharAt(planNoEJp, 3);
    }

    /**
     * 企画通番（東日本）の４文字目を取得します。
     * 
     * @return 企画通番（東日本）の４文字目
     */
    public String getPlanNoEJp4() {

        return getCharAt(planNoEJp, 4);
    }

    /**
     * 企画通番（東日本）の５文字目を取得します。
     * 
     * @return 企画通番（東日本）の５文字目
     */
    public String getPlanNoEJp5() {

        return getCharAt(planNoEJp, 5);
    }

    /**
     * 企画通番（東日本）の６文字目を取得します。
     * 
     * @return 企画通番（東日本）の６文字目
     */
    public String getPlanNoEJp6() {

        return getCharAt(planNoEJp, 6);
    }

    /**
     * シーズン区分を取得します。
     * 
     * @return シーズン区分
     */
    public String getSeasonDiv() {
        return seasonDiv;
    }

    /**
     * シーズン区分名称を取得します
     * 
     * @return シーズン区分名称
     */
    public String getSeasonDivName() {

        return JreConstants.getListLabel(JreConstants.DIV_SEASON,
                seasonDiv.toString());
    }

    /**
     * 送付区分を取得します。
     * 
     * @return 送付区分
     */
    public Integer getSendDiv() {
        return sendDiv;
    }

    /**
     * 状態を取得します。
     * 
     * @return 状態
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状態名称を取得します
     * 
     * @return 状態名称
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
     * 施設付帯パターン(一時)を取得します。
     * 
     * @return 施設付帯パターン(一時)
     */
    public String getTempFacilityPattern() {
        return tempFacilityPattern;
    }

    /**
     * 更新日付を取得します。
     * 
     * @return 更新日付
     */
    public String getUpdateYmd() {
        return updateYmd;
    }

    /**
     * 更新日を取得します。
     * 
     * @return 更新日
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
     * ユーザIDを取得します。
     * 
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 年度を取得します。
     * 
     * @return 年度
     */
    public String getYear() {
        return year;
    }

    /**
     * 回答書送付先を設定します。
     * 
     * @param ansSendAddr
     *            回答書送付先
     */
    public void setAnsSendAddr(String ansSendAddr) {
        this.ansSendAddr = ansSendAddr;
    }

    /**
     * 支社コードを設定します。
     * 
     * @param branchCd
     *            支社コード
     */
    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }

    /**
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * 施設コードを設定します。
     * 
     * @param facilityCd
     *            施設コード
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 施設付帯状態を設定します。
     * 
     * @param facilityDecisionFlg
     *            施設付帯状態
     */
    public void setFacilityDecisionFlg(String facilityDecisionFlg) {
        this.facilityDecisionFlg = facilityDecisionFlg;
    }

    /**
     * 施設名称を設定します。
     * 
     * @param facilityNm
     *            施設名称
     */
    public void setFacilityNm(String facilityNm) {
        this.facilityNm = facilityNm;
    }

    /**
     * 施設付帯パターンを設定します。
     * 
     * @param facilityPattern
     *            施設付帯パターン
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * 施設付帯パターン名称を設定します。
     * 
     * @param facilityPatternNm
     *            施設付帯パターン名称
     */
    public void setFacilityPatternNm(String facilityPatternNm) {
        this.facilityPatternNm = facilityPatternNm;
    }

    /**
     * 施設付帯種類を設定します。
     * 
     * @param facilitySorts
     *            施設付帯種類
     */
    public void setFacilitySorts(String facilitySorts) {
        this.facilitySorts = facilitySorts;
    }

    /**
     * 施設タイプを設定します。
     * 
     * @param facilityType
     *            施設タイプ
     */
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    /**
     * 状態（施設）を設定します。
     * 
     * @param fpStatus
     *            状態（施設）
     */
    public void setFpStatus(Integer fpStatus) {
        this.fpStatus = fpStatus;
    }

    /**
     * 商品名称を設定します。
     * 
     * @param goodsNm
     *            商品名称
     */
    public void setGoodsNm(String goodsNm) {
        this.goodsNm = goodsNm;
    }

    /**
     * 種別を設定します。
     * 
     * @param kindFlg
     *            種別
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * 企画回答連番を設定します。
     * 
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * 企画通番（東日本）を設定します。
     * 
     * @param planNoEJp
     *            企画通番（東日本）
     */
    public void setPlanNoEJp(String planNoEJp) {
        this.planNoEJp = planNoEJp;
    }

    /**
     * シーズン区分を設定します。
     * 
     * @param seasonDiv
     *            シーズン区分
     */
    public void setSeasonDiv(String seasonDiv) {
        this.seasonDiv = seasonDiv;
    }

    /**
     * 送付区分を設定します。
     * 
     * @param sendDiv
     *            送付区分
     */
    public void setSendDiv(Integer sendDiv) {
        this.sendDiv = sendDiv;
    }

    /**
     * 状態を設定します。
     * 
     * @param status
     *            状態
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 施設付帯パターン(一時)を設定します。
     * 
     * @param tempFacilityPattern
     *            施設付帯パターン(一時)
     */
    public void setTempFacilityPattern(String tempFacilityPattern) {
        this.tempFacilityPattern = tempFacilityPattern;
    }

    /**
     * 更新日付を設定します。
     * 
     * @param updateYmd
     *            更新日付
     */
    public void setUpdateYmd(String updateYmd) {
        this.updateYmd = updateYmd;
    }

    /**
     * 更新日を設定します。
     * 
     * @param upYmd
     *            更新日
     */
    public void setUpYmd(String upYmd) {
        this.upYmd = upYmd;
    }

    /**
     * ユーザIDを設定します。
     * 
     * @param userId
     *            ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 年度を設定します。
     * 
     * @param year
     *            年度
     */
    public void setYear(String year) {
        this.year = year;
    }

}
