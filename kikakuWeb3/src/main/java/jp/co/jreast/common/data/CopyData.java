package jp.co.jreast.common.data;

import jp.co.intage.framework.data.InData;

/**
 * <pre>
 * 画面コピーデータクラス。.
 * 機能概要    ：  画面コピーデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/10/31
 */
public class CopyData extends PlanAnsBaseData implements InData{
	
	/**
	 * No1画面コピーフラグ.
	 */
	private String isNo1Copy;
	
	/**
	 * No2画面コピーフラグ.
	 */
	private String isNo2Copy;
	
	/**
	 * No3画面コピーフラグ.
	 */
	private String isNo3Copy;
	
	/**
	 * No4画面コピーフラグ.
	 */
	private String isNo4Copy;
	
	/**
	 * No5画面コピーフラグ.
	 */
	private String isNo5Copy;
	
	/**
	 * No2履歴番号.
	 */
	private Integer no2CareerNo;
	/**
	 * No3履歴番号.
	 */
	private Integer no3CareerNo;
	
	/**
	 * No4履歴番号.
	 */
	private Integer no4CareerNo;
	
	/**
	 * No5履歴番号.
	 */
	private Integer no5CareerNo;
	
	/**
	 * 画面ID.
	 */
	private String screenId;
	
	/**
	 * @return Returns the isNo2Copy.
	 */
	public String getIsNo2Copy() {
		return isNo2Copy;
	}
	/**
	 * @param isNo2Copy The isNo2Copy to set.
	 */
	public void setIsNo2Copy(String isNo2Copy) {
		this.isNo2Copy = isNo2Copy;
	}
	/**
	 * @return Returns the isNo3Copy.
	 */
	public String getIsNo3Copy() {
		return isNo3Copy;
	}
	/**
	 * @param isNo3Copy The isNo3Copy to set.
	 */
	public void setIsNo3Copy(String isNo3Copy) {
		this.isNo3Copy = isNo3Copy;
	}
	/**
	 * @return Returns the isNo4Copy.
	 */
	public String getIsNo4Copy() {
		return isNo4Copy;
	}
	/**
	 * @param isNo4Copy The isNo4Copy to set.
	 */
	public void setIsNo4Copy(String isNo4Copy) {
		this.isNo4Copy = isNo4Copy;
	}
	/**
	 * @return Returns the isNo5Copy.
	 */
	public String getIsNo5Copy() {
		return isNo5Copy;
	}
	/**
	 * @param isNo5Copy The isNo5Copy to set.
	 */
	public void setIsNo5Copy(String isNo5Copy) {
		this.isNo5Copy = isNo5Copy;
	}
	/**
	 * @return Returns the isNo1Copy.
	 */
	public String getIsNo1Copy() {
		return isNo1Copy;
	}
	/**
	 * @param isNo1Copy The isNo1Copy to set.
	 */
	public void setIsNo1Copy(String isNo1Copy) {
		this.isNo1Copy = isNo1Copy;
	}
	/**
	 * @return Returns the no2CareerNo.
	 */
	public Integer getNo2CareerNo() {
		return no2CareerNo;
	}
	/**
	 * @param no2CareerNo The no2CareerNo to set.
	 */
	public void setNo2CareerNo(Integer no2CareerNo) {
		this.no2CareerNo = no2CareerNo;
	}
	/**
	 * @return Returns the no3CareerNo.
	 */
	public Integer getNo3CareerNo() {
		return no3CareerNo;
	}
	/**
	 * @param no3CareerNo The no3CareerNo to set.
	 */
	public void setNo3CareerNo(Integer no3CareerNo) {
		this.no3CareerNo = no3CareerNo;
	}
	/**
	 * @return Returns the no4CareerNo.
	 */
	public Integer getNo4CareerNo() {
		return no4CareerNo;
	}
	/**
	 * @param no4CareerNo The no4CareerNo to set.
	 */
	public void setNo4CareerNo(Integer no4CareerNo) {
		this.no4CareerNo = no4CareerNo;
	}
	/**
	 * @return Returns the no5CareerNo.
	 */
	public Integer getNo5CareerNo() {
		return no5CareerNo;
	}
	/**
	 * @param no5CareerNo The no5CareerNo to set.
	 */
	public void setNo5CareerNo(Integer no5CareerNo) {
		this.no5CareerNo = no5CareerNo;
	}
	/**
	 * @return Returns the screenId.
	 */
	public String getScreenId() {
		return screenId;
	}
	/**
	 * @param screenId The screenID to set.
	 */
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	//no1画面からNo2データのコピー処理を行う場合⇒施設タイプ区別のため(タイプによって保存先が違う)、追加 s30873 START
	private String no2Type;

	/**
	 * @return no2Type
	 */
	public String getNo2Type() {
		return no2Type;
	}
	/**
	 * @param no2Type 設定する no2Type
	 */
	public void setNo2Type(String no2Type) {
		this.no2Type = no2Type;
	}
	//no1画面からNo2データのコピー処理を行う場合⇒施設タイプ区別のため(タイプによって保存先が違う)、追加 s30873 END
}
