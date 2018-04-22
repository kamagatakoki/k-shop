package jp.co.jreast.common.data;

/**
 * <pre>
 * マスタデータクラス。.
 * 機能概要    ：  マスタデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/10/27
 */
public class BasicMstData {
	/**
	 * 区分コード.
	 */
	private String divCode;
	
	/**
	 * 基本コード１	.
	 */
	private String basicCode1;
	
	/**
	 * 基本コード２.
	 */
	private String basicCode2;
	
	/**
	 * 基本名称１.
	 */
	private String basicName1;
	/**
	 * 基本名称2.
	 */
	private String basicName2;
	
	/**
	 * @return Returns the basicCode1.
	 */
	public String getBasicCode1() {
		return basicCode1;
	}

	/**
	 * @param basicCode1 The basicCode1 to set.
	 */
	public void setBasicCode1(String basicCode1) {
		this.basicCode1 = basicCode1;
	}

	/**
	 * @return Returns the basicCode2.
	 */
	public String getBasicCode2() {
		return basicCode2;
	}

	/**
	 * @param basicCode2 The basicCode2 to set.
	 */
	public void setBasicCode2(String basicCode2) {
		this.basicCode2 = basicCode2;
	}

	/**
	 * @return Returns the basicName1.
	 */
	public String getBasicName1() {
		return basicName1;
	}

	/**
	 * @param basicName1 The basicName1 to set.
	 */
	public void setBasicName1(String basicName1) {
		this.basicName1 = basicName1;
	}

	/**
	 * @return Returns the divCode.
	 */
	public String getDivCode() {
		return divCode;
	}

	/**
	 * @param divCode The divCode to set.
	 */
	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}

	/**
	 * @return Returns the basicName2.
	 */
	public String getBasicName2() {
		return basicName2;
	}

	/**
	 * @param basicName2 The basicName2 to set.
	 */
	public void setBasicName2(String basicName2) {
		this.basicName2 = basicName2;
	}
	
}
