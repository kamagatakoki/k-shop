/**
 * <pre>
 * 施設付帯検索データクラス。.
 * 機能概要    ：  施設付帯検索データを格納する。
 * 特記事項    ：  無し
 */
package jp.co.jreast.common.data;

import jp.co.intage.framework.data.InData;

/**
 * @author s30873
 *
 */
public class FacilityManageSearchData extends AnsSearchData implements InData {
	/**
	 * 施設コード
	 */
	private String facilityCd;
	/**
	 * 施設付帯種類
	 */
	private String facilitySorts;
	/**
	 * 施設パターン
	 */
	private String facilityPattern;
	/**
	 * 新規作成か
	 */
	private boolean isNewType=false;
	/**
	 * @return facilityCd
	 */
	public String getFacilityCd() {
		return facilityCd;
	}
	/**
	 * @return facilityPattern
	 */
	public String getFacilityPattern() {
		return facilityPattern;
	}
	/**
	 * @return facilitySorts
	 */
	public String getFacilitySorts() {
		return facilitySorts;
	}
	
	/**
	 * @return IsNewType
	 */
	public boolean getIsNewType() {
		return isNewType;
	}
		
	/**
	 * @param facilityCd 設定する facilityCd
	 */
	public void setFacilityCd(final String facilityCd) {
		this.facilityCd = facilityCd;
	}
	/**
	 * @param facilityPattern 設定する facilityPattern
	 */
	public void setFacilityPattern(final String facilityPattern) {
		this.facilityPattern = facilityPattern;
	}
	/**
	 * @param facilitySorts 設定する facilitySorts
	 */
	public void setFacilitySorts(final String facilitySorts) {
		this.facilitySorts = facilitySorts;
	}
}
