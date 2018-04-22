package jp.co.jreast.ur00400.data;

import jp.co.intage.framework.data.OutData;

/**
 * 送信した結果データクラス。.
 * 
 * <pre>
 *  機能概要　：画面送信したとき使うデータクラス .
 *  特記事項　：なし
 * </pre>
 * 
 * @author 忻兆君
 */
public class UR00400ResultOutData implements OutData {

    /**
     * エラーメール件数 .
     */
    private Integer errorMailCount;

    /**
     * FAX件数 .
     */
    private Integer faxCount;

    /**
     * メール件数 .
     */
    private Integer rightMailCount;

    /**
     * 送信総数 .
     */
    private Integer sumCount;

    /**
     * @return エラーメール件数
     */
    public Integer getErrorMailCount() {
        return errorMailCount;
    }

    /**
     * @return FAX件数
     */
    public Integer getFaxCount() {
        return faxCount;
    }

    /**
     * @return メール件数
     */
    public Integer getRightMailCount() {
        return rightMailCount;
    }

    /**
     * @return 送信総数
     */
    public Integer getSumCount() {
        return sumCount;
    }

    /**
     * @param errorMailCount
     *            エラーメール件数
     */
    public void setErrorMailCount(Integer errorMailCount) {
        this.errorMailCount = errorMailCount;
    }

    /**
     * @param faxCount
     *            FAX件数
     */
    public void setFaxCount(Integer faxCount) {
        this.faxCount = faxCount;
    }

    /**
     * @param rightMailCount
     *            メール件数
     */
    public void setRightMailCount(Integer rightMailCount) {
        this.rightMailCount = rightMailCount;
    }

    /**
     * @param sumCount
     *            送信総数
     */
    public void setSumCount(Integer sumCount) {
        this.sumCount = sumCount;
    }

}
