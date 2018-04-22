package jp.co.jreast.common.data.ddata;

import jp.co.intage.framework.data.OutData;

/**
 * [DP/RM]施設付帯情報 入力依頼送信結果出力データ
 * 
 * <pre>
 *   機能概要 ： ビジネスロジックの戻り値として使用します。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class SendResultMessage implements OutData {

    /** メール送信エラーフラグ */
    private boolean mailError;

    /** 送付区分 */
    private Integer sendDiv;

    /**
     * 送付区分を取得します。
     * 
     * @return 送付区分
     */
    public Integer getSendDiv() {
        return sendDiv;
    }

    /**
     * メール送信エラーフラグを取得します。
     * 
     * @return メール送信エラーフラグ
     */
    public boolean isMailError() {
        return mailError;
    }

    /**
     * メール送信エラーフラグを設定します。
     * 
     * @param mailError
     *            メール送信エラーフラグ
     */
    public void setMailError(boolean mailError) {
        this.mailError = mailError;
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

}
