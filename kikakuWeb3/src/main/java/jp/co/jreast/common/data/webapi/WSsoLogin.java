package jp.co.jreast.common.data.webapi;

import java.util.Date;

/**
 * <pre>
 * SSOID認証一時データクラス
 * 機能概要    ：  SSOID認証データを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public class WSsoLogin {

    /** テーブル名 */
    public static final String TABLE = "W_SSO_LOGIN";

    /**
     * 作成年月日.
     */
    private Date createYmd;

    /**
     * ワンタイムトークン.
     */
    private String oneTimeToken;

    /**
     * SSOID.
     */
    private String ssoId;

    /**
     * SSOトークン.
     */
    private String ssoToken;

    /**
     * 更新年月日.
     */
    private Date upYmd;

    /**
     * 作成年月日.を取得します。
     * 
     * @return 作成年月日.
     */
    public Date getCreateYmd() {
        return createYmd;
    }

    /**
     * ワンタイムトークン.を取得します。
     * 
     * @return ワンタイムトークン.
     */
    public String getOneTimeToken() {
        return oneTimeToken;
    }

    /**
     * SSOID.を取得します。
     * 
     * @return SSOID.
     */
    public String getSsoId() {
        return ssoId;
    }

    /**
     * SSOトークン.を取得します。
     * 
     * @return SSOトークン.
     */
    public String getSsoToken() {
        return ssoToken;
    }

    /**
     * 更新年月日.を取得します。
     * 
     * @return 更新年月日.
     */
    public Date getUpYmd() {
        return upYmd;
    }

    /**
     * 作成年月日.を設定します。
     * 
     * @param createYmd
     *            作成年月日.
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * ワンタイムトークン.を設定します。
     * 
     * @param oneTimeToken
     *            ワンタイムトークン.
     */
    public void setOneTimeToken(String oneTimeToken) {
        this.oneTimeToken = oneTimeToken;
    }

    /**
     * SSOID.を設定します。
     * 
     * @param ssoId
     *            SSOID.
     */
    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    /**
     * SSOトークン.を設定します。
     * 
     * @param ssoToken
     *            SSOトークン.
     */
    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    /**
     * 更新年月日.を設定します。
     * 
     * @param upYmd
     *            更新年月日.
     */
    public void setUpYmd(Date upYmd) {
        this.upYmd = upYmd;
    }

}
