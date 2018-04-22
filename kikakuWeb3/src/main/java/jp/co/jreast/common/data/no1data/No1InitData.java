package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.SpoorParamter;

/**
 * <pre>
 * NO1初期化データクラス。.
 * 機能概要    ：  NO1初期化データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author jinhuashi
 * @version 0.1 2006/11/17
 */
public class No1InitData implements InData, SpoorParamter {
	
	/**
     * コンストラクタ.
     */
	public No1InitData() {
		ansSearchData = new AnsSearchData();
	}
	/**
	 * 捜索データ.
	 */
	private AnsSearchData ansSearchData;
	/**
	 * JR登録者か.
	 */
	private Boolean isJR;
	
	/**
	 * ユーザ区分.
	 */
	private String userDiv;
	
	/**
	 * 誇示するフラグ.
	 */
	private Boolean isDisplayFlg = Boolean.FALSE;	
	/**
	 * コピするフラグ .
	 */
	private Boolean isCopyFlg = Boolean.FALSE;	
	
	/**
	 * 
	 * @return searchData
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}
	/**
	 * 
	 * @param searchData searchData
	 */
	public void setAnsSearchData(AnsSearchData searchData) {
		this.ansSearchData = searchData;
	}
	/**
	 * 
	 * @return user
	 */
	public Boolean getIsJR() {
		return isJR;
	}
	/**
	 * 
	 * @param isJR isJR
	 */
	public void setIsJR(boolean isJR) {
		this.isJR = new Boolean(isJR);
	}
	
	/**
	 * 
	 * @return 表示するフラグ
	 */
	public Boolean getIsDisplayFlg() {
		return isDisplayFlg;
	}
	
	/**
	 * 
	 * @param isDisplayFlg 表示するフラグ
	 */
	public void setIsDisplayFlg(Boolean isDisplayFlg) {
		this.isDisplayFlg = isDisplayFlg;
	}
	/**
	 * @return Returns the userDiv.
	 */
	public String getUserDiv() {
		return userDiv;
	}
	/**
	 * @param userDiv The userDiv to set.
	 */
	public void setUserDiv(String userDiv) {
		this.userDiv = userDiv;
	}
	/**
	 * @return Returns the isCopyFlg.
	 */
	public Boolean getIsCopyFlg() {
		return isCopyFlg;
	}
	/**
	 * @param isCopyFlg The isCopyFlg to set.
	 */
	public void setIsCopyFlg(Boolean isCopyFlg) {
		this.isCopyFlg = isCopyFlg;
	}

}
