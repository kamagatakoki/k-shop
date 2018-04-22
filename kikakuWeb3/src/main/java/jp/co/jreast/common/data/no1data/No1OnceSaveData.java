package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;

/**
 * <pre>
 * NO1_セーブデータクラス。.
 * 機能概要    ：  NO1_セーブデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public class No1OnceSaveData implements InData {

	/**
	 * 関連チェックフラグ.
	 */
	private int errorFlg ;
	/**
	 * No2画面コピーフラグ.
	 */
	private AnsSearchData no2CopyData;
	/**
	 * No3画面コピーフラグ.
	 */
	private AnsSearchData no3CopyData;
	/**
	 * No4画面コピーフラグ.
	 */
	private AnsSearchData no4CopyData;
	/**
	 * No5画面コピーフラグ.
	 */
	private AnsSearchData no5CopyData;
	
	/**
	 * No1業務データ.
	 */
	private No1FormBean formBean;

	/**
	 * @return the formBean
	 */
	public final No1FormBean getFormBean() {
		return formBean;
	}

	/**
	 * @param formBean the formBean to set
	 */
	public final void setFormBean(final No1FormBean formBean) {
		this.formBean = formBean;
	}

	/**
	 * @return the no2CopyData
	 */
	public final AnsSearchData getNo2CopyData() {
		return no2CopyData;
	}

	/**
	 * @param no2CopyData the no2CopyData to set
	 */
	public final void setNo2CopyData(final AnsSearchData no2CopyData) {
		this.no2CopyData = no2CopyData;
	}

	/**
	 * @return the no3CopyData
	 */
	public final AnsSearchData getNo3CopyData() {
		return no3CopyData;
	}

	/**
	 * @param no3CopyData the no3CopyData to set
	 */
	public final void setNo3CopyData(final AnsSearchData no3CopyData) {
		this.no3CopyData = no3CopyData;
	}

	/**
	 * @return the no4CopyData
	 */
	public final AnsSearchData getNo4CopyData() {
		return no4CopyData;
	}

	/**
	 * @param no4CopyData the no4CopyData to set
	 */
	public final void setNo4CopyData(final AnsSearchData no4CopyData) {
		this.no4CopyData = no4CopyData;
	}
	
	/**
	 * @return the no5CopyData
	 */
	public final AnsSearchData getNo5CopyData() {
		return no5CopyData;
	}

	/**
	 * @param no5CopyData the no5CopyData to set
	 */
	public final void setNo5CopyData(final AnsSearchData no5CopyData) {
		this.no5CopyData = no5CopyData;
	}

	public int getErrorFlg() {
		return errorFlg;
	}

	public void setErrorFlg(int errorFlg) {
		this.errorFlg = errorFlg;
	}
	
}
						
