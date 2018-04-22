package jp.co.jreast.common.exceptions;

import jp.co.intage.framework.exception.SystemException;

/**
 * アプリケーション例外
 * 
 * <pre>
 *   機能概要 ： システム例外の実行時例外版です。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class JresApplicationException extends RuntimeException {

    /** バージョンID */
    private static final long serialVersionUID = 1L;

    /**
     * コンストラクタ
     */
    public JresApplicationException() {
        super(new SystemException());
    }

    /**
     * コンストラクタ
     * 
     * @param key
     *            メッセージID
     */
    public JresApplicationException(String key) {
        super(new SystemException(key));
    }

    /**
     * コンストラクタ
     * 
     * @param key
     *            メッセージID
     * @param args
     *            メッセージ置換パラメータ
     */
    public JresApplicationException(String key, String[] args) {
        super(new SystemException(key, args));
    }

    /**
     * コンストラクタ
     * 
     * @param key
     *            メッセージID
     * @param args
     *            メッセージ置換パラメータ
     * @param cause
     *            原因例外
     */
    public JresApplicationException(String key, String[] args, Throwable cause) {
        super(new SystemException(key, args, cause));
    }

    /**
     * コンストラクタ
     * 
     * @param key
     *            メッセージID
     * @param cause
     *            原因例外
     */
    public JresApplicationException(String key, Throwable cause) {
        super(new SystemException(key, cause));
    }

    /**
     * コンストラクタ
     * 
     * @param cause
     *            原因例外
     */
    public JresApplicationException(Throwable cause) {
        super(cause);
    }

}
