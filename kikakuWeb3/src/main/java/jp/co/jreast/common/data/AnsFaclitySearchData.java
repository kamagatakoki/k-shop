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
 * @since 2009/12/10
 * @version 0.1
 */
public class AnsFaclitySearchData extends AnsSearchData implements InData {
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
	private String btnNm;
	/**
	 * 回答書：0、付帯情報：1、新規：2
	 */
	private String callFlg;
	/**
	 * ログインユーザーID
	 */
	private String userId; 
	/**
	 * ログインユーザー名
	 */
	private String userNm;
	/**
	 * ログインユーザー区分
	 */
	private Integer userDiv;
	/**
	 * 施設確定フラグ
	 */
	private String facilityDecisionFlg;
	/**
	 * 施設タイプ
	 */
	private String facilityType;
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
		if(btnNm != null){
			return String.valueOf(Integer.parseInt(btnNm)-2);
		}
		return facilitySorts;
	}
	/**
	 * @return btnNm
	 */
	public String getBtnNm() {
		return btnNm;
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
	/**
	 * @param btnNm 設定する isNewType
	 */
	public void setBtnNm(String btnNm) {
		this.btnNm = btnNm;
	}
	/**
	 * @return callFlg
	 */
	public String getCallFlg() {
		return callFlg;
	}
	/**
	 * @param callFlg 設定する callFlg
	 */
	public void setCallFlg(String callFlg) {
		this.callFlg = callFlg;
	}
	/**
	 * @return userDiv
	 */
	public Integer getUserDiv() {
		return userDiv;
	}
	/**
	 * @param userDiv 設定する userDiv
	 */
	public void setUserDiv(Integer userDiv) {
		this.userDiv = userDiv;
	}
	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId 設定する userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return userNm
	 */
	public String getUserNm() {
		return userNm;
	}
	/**
	 * @param userNm 設定する userNm
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	/**
	 * @return facilityDecisionFlg
	 */
	public String getFacilityDecisionFlg() {
		return facilityDecisionFlg;
	}
	/**
	 * @param facilityDecisionFlg 設定する facilityDecisionFlg
	 */
	public void setFacilityDecisionFlg(String facilityDecisionFlg) {
		this.facilityDecisionFlg = facilityDecisionFlg;
	}
	/**
	 * @return facilityType
	 */
	public String getFacilityType() {
		return facilityType;
	}
	/**
	 * @param facilityType 設定する facilityType
	 */
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	
}
