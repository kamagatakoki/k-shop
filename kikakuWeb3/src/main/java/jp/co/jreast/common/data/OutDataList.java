package jp.co.jreast.common.data;

import java.util.List;

import jp.co.intage.framework.data.OutData;

/**
 * <pre>
 * リストデータクラス。.
 * 機能概要    ：  リストデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhou
 * @version 0.1 2006/10/27
 */
public class OutDataList implements OutData{
	/**
	 * 件数リスト.
	 */
	private List list;

	/**
	 * 件数を取得する.
	 * 
	 * @return 件数。
	 */
	public int getCount() {

		if (list == null) {
			return 0;
		}
		return list.size();
	}

	/**
	 * @return Returns the list.
	 */
	public List getList() {
		return list;
	}

	/**
	 * @param list The list to set.
	 */
	public void setList(List list) {
		this.list = list;
	}
}
