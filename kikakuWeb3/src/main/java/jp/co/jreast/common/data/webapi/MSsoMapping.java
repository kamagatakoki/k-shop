package jp.co.jreast.common.data.webapi;

import java.util.Date;

/**
 * <pre>
 * SSOIDマッピングデータクラス
 * 機能概要    ：  SSOIDマッピングデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public class MSsoMapping {

    /** テーブル名 */
    public static final String TABLE = "M_SSO_MAPPING";

    /**
     * 作成年月日.
     */
    private Date createYmd;

    /**
     * SSOID.
     */
    private String ssoId;

    /**
     * ユーザーID.
     */
    private String userId;

    /**
     * 作成年月日.を取得します。
     * @return 作成年月日.
     */
    public Date getCreateYmd() {
        return createYmd;
    }

    /**
     * 作成年月日.を設定します。
     * @param createYmd 作成年月日.
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * SSOID.を取得します。
     * @return SSOID.
     */
    public String getSsoId() {
        return ssoId;
    }

    /**
     * SSOID.を設定します。
     * @param ssoId SSOID.
     */
    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    /**
     * ユーザーID.を取得します。
     * @return ユーザーID.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザーID.を設定します。
     * @param userId ユーザーID.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
