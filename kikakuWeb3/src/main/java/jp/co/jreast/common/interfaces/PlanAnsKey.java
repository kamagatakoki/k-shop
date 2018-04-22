package jp.co.jreast.common.interfaces;

/**
 * 企画回答書 キー項目
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
public interface PlanAnsKey {

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    Integer getCareerNo();

    /**
     * 素材種別を取得します。
     * 
     * @return 素材種別
     */
    String getMaterialKind();

    /**
     * 企画回答連番を取得します。
     * 
     * @return 企画回答連番
     */
    Long getPlanAnsNo();

    /**
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    void setCareerNo(Integer careerNo);

    /**
     * 素材種別を設定します。
     * 
     * @param materialKind
     *            素材種別
     */
    void setMaterialKind(String materialKind);

    /**
     * 企画回答連番を設定します。
     * 
     * @param planAnsNo
     *            企画回答連番
     */
    void setPlanAnsNo(Long planAnsNo);

}
