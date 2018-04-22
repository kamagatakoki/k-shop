package jp.co.jreast.common.data;

/**
 *<pre>
 * 痕跡クラスのプロパティクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 * @author Xbl
 *
 */
public interface SpoorParamter {
		
	/**
	 * 
	 * @return AnsSearchData
	 */
	public AnsSearchData getAnsSearchData();
	
	/**
	 * 
	 * @param data AnsSearchData
	 */
	public void setAnsSearchData(AnsSearchData data);	
	
	/**
	 * 
	 * @return user
	 */
	public Boolean getIsJR();
	
	/**
	 * 
	 * @param isJr is Jr
	 */
	public void setIsJR(boolean isJr);
}
