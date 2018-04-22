package jp.co.jreast.common.data;
/**
 * <pre>
 * 地区マスタデータクラス。.
 * 機能概要    ：  地区マスタデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/12/07
 */
public class AreaData {
	/**
	 * 地区コード.
	 */
	private String areaCd;
	
	/**
	 * 地区名称.
	 */
	private String areaName;
	
	/**
	 * 地区名称（カナ）.
	 */
	private String areaKana;

	/**
	 * @return Returns the areaCd.
	 */
	public String getAreaCd() {
		return areaCd;
	}

	/**
	 * @param areaCd The areaCd to set.
	 */
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	/**
	 * @return Returns the areaKana.
	 */
	public String getAreaKana() {
		return areaKana;
	}

	/**
	 * @param areaKana The areaKana to set.
	 */
	public void setAreaKana(String areaKana) {
		this.areaKana = areaKana;
	}

	/**
	 * @return Returns the areaName.
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName The areaName to set.
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}
