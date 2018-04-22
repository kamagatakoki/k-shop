package jp.co.jreast.common.interfaces;

/**
 * 施設付帯情報本体データテーブル共通 キー項目
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
public interface FacilityManageBodyKey {

    /**
     * 施設コードを取得します。
     * 
     * @return 施設コード
     */
    String getFacilityCd();

    /**
     * 施設パターンを取得します。
     * 
     * @return 施設パターン
     */
    String getFacilityPattern();

    /**
     * 回答書種別を取得します。
     * 
     * @return 回答書種別
     */
    String getKindFlg();

    /**
     * 施設コードを設定します。
     * 
     * @param facilityCd
     *            施設コード
     */
    void setFacilityCd(String facilityCd);

    /**
     * 施設パターンを設定します。
     * 
     * @param facilityPattern
     *            施設パターン
     */
    void setFacilityPattern(String facilityPattern);

    /**
     * 回答書種別を設定します。
     * 
     * @param kindFlg
     *            回答書種別
     */
    void setKindFlg(String kindFlg);

}
