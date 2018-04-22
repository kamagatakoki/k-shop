package jp.co.jreast.common.data.ddata;

/**
 * [DP/RM]送信コメントテンプレート エンティティ
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
public class DSendCmtTmpl {

    /** 支社コード */
    private String branchCd;

    /** 送信コメント */
    private String cmtTmpl;

    /** タイムスタンプ */
    private String timestamp;

    /**
     * 支社コードを取得します。
     * 
     * @return 支社コード
     */
    public String getBranchCd() {
        return branchCd;
    }

    /**
     * 送信コメントを取得します。
     * 
     * @return 送信コメント
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * タイムスタンプを取得します。
     * 
     * @return タイムスタンプ
     */
    public String getTimestamp() {
        return timestamp;
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
     * 送信コメントを設定します。
     * 
     * @param cmtTmpl
     *            送信コメント
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * タイムスタンプを設定します。
     * 
     * @param timestamp
     *            タイムスタンプ
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
