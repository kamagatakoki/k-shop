package jp.co.jreast.common.interfaces;

/**
 * 施設付帯情報本体履歴データ キー項目
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
public interface FacilityManageBodyHistoryKey extends FacilityManageBodyKey {

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    Integer getCareerNo();

    /**
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    void setCareerNo(Integer careerNo);

}
