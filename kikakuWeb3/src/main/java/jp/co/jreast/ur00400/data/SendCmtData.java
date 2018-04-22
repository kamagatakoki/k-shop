package jp.co.jreast.ur00400.data;

import java.util.Date;

/**
 * メールコメントデータクラス。.
 * 
 * <pre>
 *  機能概要　：なし
 *  特記事項　：なし
 * </pre>
 * 
 * @author 忻兆君
 */
public class SendCmtData {

    /**
     * 回答書送付先 .
     */
    private String ansSendAddr;

    /**
     * 送信コメント .
     */
    private String cmtTmpl;

    /**
     * 作成年月日 .
     */
    private Date createYmd;

    /**
     * 回答書ファイルパス .
     */
    private String planAnsFilePath;

    /**
     * 企画回答連番 .
     */
    private Long planAnsNo;

    /**
     * 企画書ファイルパス .
     */
    private String planFilePath;

    /**
     * 担当者 .
     */
    private String tantousya;

    /**
     * FAXNOの長さ調整.
     * 
     * @param faxNo
     *            FAXNO
     * @return FAX NO
     */
    private String faxNoForBatch(String faxNo) {
        String newFaxNo = faxNo.trim();
        if (newFaxNo.length() > 15) {
            newFaxNo = newFaxNo.substring(0, 15);
        }
        return newFaxNo;
    }

    /**
     * @return 回答書送付先 .
     */
    public String getAnsSendAddr() {
        return ansSendAddr;
    }

    /**
     * @return 送信コメント
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * @return 作成年月日 .
     */
    public Date getCreateYmd() {
        return createYmd;
    }

    /**
     * @return 回答書ファイルパス .
     */
    public String getPlanAnsFilePath() {
        return planAnsFilePath;
    }

    /**
     * @return 企画回答連番
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * @return 企画書ファイルパス .
     */
    public String getPlanFilePath() {
        return planFilePath;
    }

    /**
     * @return 担当者 .
     */
    public String getTantousya() {
        return tantousya;
    }

    /**
     * @param ansSendAddr
     *            回答書送付先 .
     */
    public void setAnsSendAddr(String ansSendAddr) {
        this.ansSendAddr = faxNoForBatch(ansSendAddr);
    }

    /**
     * @param cmtTmpl
     *            送信コメント
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * @param createYmd
     *            作成年月日 .
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * @param planAnsFilePath
     *            回答書ファイルパス .
     */
    public void setPlanAnsFilePath(String planAnsFilePath) {

        this.planAnsFilePath = planAnsFilePath;
    }

    /**
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * @param planFilePath
     *            企画書ファイルパス .
     */
    public void setPlanFilePath(String planFilePath) {
        this.planFilePath = planFilePath;
    }

    /**
     * @param tantousya
     *            担当者 .
     */
    public void setTantousya(String tantousya) {
        this.tantousya = tantousya;
    }
}
