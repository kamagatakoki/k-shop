package jp.co.jreast.common.data;

import jp.co.intage.framework.data.InData;

/**
 * <pre>
 * コピー入力データクラス。.
 * 機能概要    ：  コピー入力データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/11/07
 */
public class CopyInData implements InData{
	
	/**
	 * 企画検索データ.
	 */
	private AnsSearchData newData = new AnsSearchData();
	
	/**
	 * 企画検索データ.
	 */
	private AnsSearchData oldData = new AnsSearchData();
		
	/**
	 * @return Returns the newData.
	 */
	public AnsSearchData getNewData() {
		return newData;
	}
	/**
	 * @param newData The newData to set.
	 */
	public void setNewData(AnsSearchData newData) {
		this.newData = newData;
	}
	/**
	 * @return Returns the oldData.
	 */
	public AnsSearchData getOldData() {
		return oldData;
	}
	/**
	 * @param oldData The oldData to set.
	 */
	public void setOldData(AnsSearchData oldData) {
		this.oldData = oldData;
	}
	
}
