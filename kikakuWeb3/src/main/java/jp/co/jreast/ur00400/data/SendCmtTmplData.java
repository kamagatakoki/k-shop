package jp.co.jreast.ur00400.data;

/**
 * 送信コメントテンプレートデータクラス。.
 * 
 * <pre>
 *  機能概要　：なし
 *  特記事項　：なし
 * </pre>
 * 
 * @author 李政　.
 */
public class SendCmtTmplData {

    /**
     * 支社コード.
     */
    private String branchCd;

    /**
     * 送信コメント .
     */
    private String cmtTmpl;

    /**
     * タイムスタンプ .
     */
    private String timestamp;

    /**
     * @return BranchCd
     */
    public String getBranchCd() {
        return branchCd;
    }

    /**
     * @return 送信コメント .
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * @return タイムスタンプ .
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @param branchCd
     *            設定する BranchCd
     */
    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }

    /**
     * @param cmtTmpl
     *            送信コメント
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * @param timestamp
     *            タイムスタンプ .
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
