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
     * シリアルナンバー
     */
    private static final long serialVersionUID = 1L;

    /**
     * テーブル名
     */
    public static final String TABLE = "D_FACILITY_MANAGE";

    /**
     * 本体履歴番号
     */
    private Integer bodyCareerNo;

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 作成年月日
     */
    private Date createYmd;

    /**
     * 施設コード
     */
    private String facilityCd;

    /**
     * 施設確定フラグ
     */
    private String facilityDecisionFlg;

    /**
     * 施設パターン
     */
    private String facilityPattern;

    /**
     * 施設パターン名称
     */
    private String facilityPatternNm;

    /**
     * 付帯情報送付先
     */
    private String facilitySendAddr;

    /**
     * 施設付帯種類
     */
    private String facilitySorts;

    /**
     * 施設タイプ
     */
    private String facilityType;

    /**
     * 施設パターン状態
     */
    private Integer fpStatus;

    /**
     * 種別
     */
    private String kindFlg;

    /**
     * 最新フラグ
     */
    private String newFlg;

    /**
     * 送付区分
     */
    private Integer sendDiv;

    /**
     * 送付連絡先ＦＡＸ
     */
    private String senderFax;

    /**
     * 送付担当者名
     */
    private String senderNm;

    /**
     * 送付連絡先電話
     */
    private String senderTel;

    /**
     * 送信状態
     */
    private String sendStatus;

    /**
     * 更新年月日
     */
    private Date upYmd;

    /**
     * ユーザーID
     */
    private String userId;

    /**
     * 連携回数
     */
    private Integer zouseiRelateCnt;

    /**
     * Constractor
     */
    public DFacilityManage() {
    }

    /**
     * コンストラクタ
     * 
     * @param facilityCd
     *            施設コード
     * @param kindFlg
     *            種別
     * @param facilitySorts
     *            施設付帯種類
     * @param facilityPattern
     *            施設パターン
     * @param careerNo
     *            履歴番号
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
     * 本体履歴番号を取得します。
     * 
     * @return 本体履歴番号
     */
    public Integer getBodyCareerNo() {
        return bodyCareerNo;
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
     * 作成年月日を取得します。
     * 
     * @return 作成年月日
     */
    public Date getCreateYmd() {
        return createYmd;
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
     * 施設確定フラグを取得します。
     * 
     * @return 施設確定フラグ
     */
    public String getFacilityDecisionFlg() {
        return facilityDecisionFlg;
    }

    /**
     * 施設パターンを取得します。
     * 
     * @return 施設パターン
     */
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * 施設パターン名称を取得します。
     * 
     * @return 施設パターン名称
     */
    public String getFacilityPatternNm() {
        return facilityPatternNm;
    }

    /**
     * 付帯情報送付先を取得します。
     * 
     * @return 付帯情報送付先
     */
    public String getFacilitySendAddr() {
        return facilitySendAddr;
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
     * 施設パターン状態を取得します。
     * 
     * @return 施設パターン状態
     */
    public Integer getFpStatus() {
        return fpStatus;
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
     * 最新フラグを取得します。
     * 
     * @return 最新フラグ
     */
    public String getNewFlg() {
        return newFlg;
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
     * 送付連絡先ＦＡＸを取得します。
     * 
     * @return 送付連絡先ＦＡＸ
     */
    public String getSenderFax() {
        return senderFax;
    }

    /**
     * 送付担当者名を取得します。
     * 
     * @return 送付担当者名
     */
    public String getSenderNm() {
        return senderNm;
    }

    /**
     * 送付連絡先電話を取得します。
     * 
     * @return 送付連絡先電話
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * 送信状態を取得します。
     * 
     * @return 送信状態
     */
    public String getSendStatus() {
        return sendStatus;
    }

    /**
     * 更新年月日を取得します。
     * 
     * @return 更新年月日
     */
    public Date getUpYmd() {
        return upYmd;
    }

    /**
     * ユーザーIDを取得します。
     * 
     * @return ユーザーID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 連携回数を取得します。
     * 
     * @return 連携回数
     */
    public Integer getZouseiRelateCnt() {
        return zouseiRelateCnt;
    }

    /**
     * 本体履歴番号を設定します。
     * 
     * @param bodyCareerNo
     *            本体履歴番号
     */
    public void setBodyCareerNo(Integer bodyCareerNo) {
        this.bodyCareerNo = bodyCareerNo;
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
     * 作成年月日を設定します。
     * 
     * @param createYmd
     *            作成年月日
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
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
     * 施設確定フラグを設定します。
     * 
     * @param facilityDecisionFlg
     *            施設確定フラグ
     */
    public void setFacilityDecisionFlg(String facilityDecisionFlg) {
        this.facilityDecisionFlg = facilityDecisionFlg;
    }

    /**
     * 施設パターンを設定します。
     * 
     * @param facilityPattern
     *            施設パターン
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * 施設パターン名称を設定します。
     * 
     * @param facilityPatternNm
     *            施設パターン名称
     */
    public void setFacilityPatternNm(String facilityPatternNm) {
        this.facilityPatternNm = facilityPatternNm;
    }

    /**
     * 付帯情報送付先を設定します。
     * 
     * @param facilitySendAddr
     *            付帯情報送付先
     */
    public void setFacilitySendAddr(String facilitySendAddr) {
        this.facilitySendAddr = facilitySendAddr;
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
     * 施設パターン状態を設定します。
     * 
     * @param fpStatus
     *            施設パターン状態
     */
    public void setFpStatus(Integer fpStatus) {
        this.fpStatus = fpStatus;
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
     * 最新フラグを設定します。
     * 
     * @param newFlg
     *            最新フラグ
     */
    public void setNewFlg(String newFlg) {
        this.newFlg = newFlg;
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
     * 送付連絡先ＦＡＸを設定します。
     * 
     * @param senderFax
     *            送付連絡先ＦＡＸ
     */
    public void setSenderFax(String senderFax) {
        this.senderFax = senderFax;
    }

    /**
     * 送付担当者名を設定します。
     * 
     * @param senderNm
     *            送付担当者名
     */
    public void setSenderNm(String senderNm) {
        this.senderNm = senderNm;
    }

    /**
     * 送付連絡先電話を設定します。
     * 
     * @param senderTel
     *            送付連絡先電話
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    /**
     * 送信状態を設定します。
     * 
     * @param sendStatus
     *            送信状態
     */
    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * 更新年月日を設定します。
     * 
     * @param upYmd
     *            更新年月日
     */
    public void setUpYmd(Date upYmd) {
        this.upYmd = upYmd;
    }

    /**
     * ユーザーIDを設定します。
     * 
     * @param userId
     *            ユーザーID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 連携回数を設定します。
     * 
     * @param zouseiRelateCnt
     *            連携回数
     */
    public void setZouseiRelateCnt(Integer zouseiRelateCnt) {
        this.zouseiRelateCnt = zouseiRelateCnt;
    }

}
