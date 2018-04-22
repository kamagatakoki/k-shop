package jp.co.jreast.common.data;

import jp.co.intage.framework.data.InData;


/**
 * <pre>
 * 企画検索データクラス。.
 * 機能概要    ：  企画検索データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/10/27
 */
public class AnsSearchData extends PlanAnsBaseData implements InData{
	/**
	 * 種別.
	 */
	private String kindFlg;

	/**
	 * @return Returns the kindFlg.
	 */
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * @param kindFlg The kindFlg to set.
	 */
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
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
	
	//no1画面からNo2データのコピー処理を行う場合⇒施設タイプ区別のため(タイプによって保存先が違う)、追加 s30873 E N D
}
