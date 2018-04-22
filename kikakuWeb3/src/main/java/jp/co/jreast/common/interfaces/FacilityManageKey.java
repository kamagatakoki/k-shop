package jp.co.jreast.common.interfaces;

/**
 * 施設付帯情報管理 キー項目
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
public interface FacilityManageKey {

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    Integer getCareerNo();

    /**
     * 施設コードを取得します。
     * 
     * @return 施設コード
     */
    String getFacilityCd();

    /**
     * 施設素材種別を取得します。
     * 
     * @return 施設素材種別
     */
    String getFacilityMaterialKind();

    /**
     * 施設パターンを取得します。
     * 
     * @return 施設パターン
     */
    String getFacilityPattern();

    /**
     * 施設付帯種類を取得します。
     * 
     * @return 施設付帯種類
     */
    String getFacilitySorts();

    /**
     * 回答書種別を取得します。
     * 
     * @return 回答書種別
     */
    String getKindFlg();

    /**
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    void setCareerNo(Integer careerNo);

    /**
     * 施設コードを設定します。
     * 
     * @param facilityCd
     *            施設コード
     */
    void setFacilityCd(String facilityCd);

    /**
     * 施設素材種別を設定します。
     * 
     * @param facilityMaterialKind
     *            施設素材種別
     */
    void setFacilityMaterialKind(String facilityMaterialKind);

    /**
     * 施設パターンを設定します。
     * 
     * @param facilityPattern
     *            施設パターン
     */
    void setFacilityPattern(String facilityPattern);

    /**
     * 施設付帯種類を設定します。
     * 
     * @param facilitySorts
     *            施設付帯種類
     */
    void setFacilitySorts(String facilitySorts);

    /**
     * 回答書種別を設定します。
     * 
     * @param kindFlg
     *            回答書種別
     */
    void setKindFlg(String kindFlg);

}
