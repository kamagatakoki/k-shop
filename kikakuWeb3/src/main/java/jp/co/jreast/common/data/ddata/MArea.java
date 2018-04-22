package jp.co.jreast.common.data.ddata;

/**
 * 地区マスタ エンティティ
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
public class MArea {

    /**
     * 地区コード
     */
    private String areaCd;

    /**
     * 地区名称（カナ）
     */

    private String areaKana;

    /**
     * 地区名称
     */
    private String areaNm;

    /**
     * 地区コードを取得します。
     * 
     * @return 地区コード
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * 地区名称（カナ）を取得します。
     * 
     * @return 地区名称（カナ）
     */
    public String getAreaKana() {
        return areaKana;
    }

    /**
     * 地区名称を取得します。
     * 
     * @return 地区名称
     */
    public String getAreaNm() {
        return areaNm;
    }

    /**
     * 地区コードを設定します。
     * 
     * @param areaCd
     *            地区コード
     */
    public void setAreaCd(String areaCd) {
        this.areaCd = areaCd;
    }

    /**
     * 地区名称（カナ）を設定します。
     * 
     * @param areaKana
     *            地区名称（カナ）
     */
    public void setAreaKana(String areaKana) {
        this.areaKana = areaKana;
    }

    /**
     * 地区名称を設定します。
     * 
     * @param areaNm
     *            地区名称
     */
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

}
