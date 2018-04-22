package jp.co.jreast.common.data.ddata;

/**
 * FAX状態管理 エンティティ
 * 
 * <pre>
 *   機能概要 ： 
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class BFaxStatus {

    /** 送信コメント */
    private String cmtTmpl;

    /** 付帯情報施設コード */
    private String facilityCd;

    /** 付帯情報キー項目 */
    private String facilityKey;

    /** FAX番号 */
    private String faxNo;

    /** ジョブID */
    private Long jobId;

    /** 回答書ファイルパス */
    private String planAnsFilePath;

    /** 企画回答連番 */
    private Long planAnsNo;

    /** 企画書ファイルパス */
    private String planFilePath;

    /** 送信日時 */
    private String sendTimestamp;

    /** 担当者 */
    private String tantousya;

    /**
     * 送信コメントを取得します。
     * 
     * @return 送信コメント
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * 付帯情報施設コードを取得します。
     * 
     * @return 付帯情報施設コード
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 付帯情報キー項目を取得します。
     * 
     * @return 付帯情報キー項目
     */
    public String getFacilityKey() {
        return facilityKey;
    }

    /**
     * FAX番号を取得します。
     * 
     * @return FAX番号
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * ジョブIDを取得します。
     * 
     * @return ジョブID
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 回答書ファイルパスを取得します。
     * 
     * @return 回答書ファイルパス
     */
    public String getPlanAnsFilePath() {
        return planAnsFilePath;
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
     * 企画書ファイルパスを取得します。
     * 
     * @return 企画書ファイルパス
     */
    public String getPlanFilePath() {
        return planFilePath;
    }

    /**
     * 送信日時を取得します。
     * 
     * @return 送信日時
     */
    public String getSendTimestamp() {
        return sendTimestamp;
    }

    /**
     * 担当者を取得します。
     * 
     * @return 担当者
     */
    public String getTantousya() {
        return tantousya;
    }

    /**
     * 送信コメントを設定します。
     * 
     * @param cmtTmpl
     *            送信コメント
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * 付帯情報施設コードを設定します。
     * 
     * @param facilityCd
     *            付帯情報施設コード
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 付帯情報キー項目を設定します。
     * 
     * @param facilityKey
     *            付帯情報キー項目
     */
    public void setFacilityKey(String facilityKey) {
        this.facilityKey = facilityKey;
    }

    /**
     * FAX番号を設定します。
     * 
     * @param faxNo
     *            FAX番号
     */
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    /**
     * ジョブIDを設定します。
     * 
     * @param jobId
     *            ジョブID
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * 回答書ファイルパスを設定します。
     * 
     * @param planAnsFilePath
     *            回答書ファイルパス
     */
    public void setPlanAnsFilePath(String planAnsFilePath) {
        this.planAnsFilePath = planAnsFilePath;
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
     * 企画書ファイルパスを設定します。
     * 
     * @param planFilePath
     *            企画書ファイルパス
     */
    public void setPlanFilePath(String planFilePath) {
        this.planFilePath = planFilePath;
    }

    /**
     * 送信日時を設定します。
     * 
     * @param sendTimestamp
     *            送信日時
     */
    public void setSendTimestamp(String sendTimestamp) {
        this.sendTimestamp = sendTimestamp;
    }

    /**
     * 担当者を設定します。
     * 
     * @param tantousya
     *            担当者
     */
    public void setTantousya(String tantousya) {
        this.tantousya = tantousya;
    }

}
