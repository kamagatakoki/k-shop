package jp.co.jreast.common.data;

import jp.co.jreast.common.JreConstants;

public class FutaiViewData {
	/** 参照フラグ(企画の場合：1、付帯：0 */
	private String readFutai=JreConstants.FLG_FALSE;
	/** no3リック非活性判断 */
	private String readNo3=JreConstants.FLG_FALSE;
	/** no5リック非活性判断 */
	private String readNo5=JreConstants.FLG_FALSE;
	//追加　施設タイプの判別項目追加　2010/05/14 s32472
	/** 施設タイプの判別(旅館、ホテル、スキー) */
	private String facType;
	/**
	 * @return readFutai
	 */
	public String getReadFutai() {
		return readFutai;
	}
	/**
	 * @param readFutai 設定する readFutai
	 */
	public void setReadFutai(String readFutai) {
		this.readFutai = readFutai;
	}
	/**
	 * @return readNo3
	 */
	public String getReadNo3() {
		return readNo3;
	}
	/**
	 * @param readNo3 設定する readNo3
	 */
	public void setReadNo3(String readNo3) {
		this.readNo3 = readNo3;
	}
	/**
	 * @return readNo5
	 */
	public String getReadNo5() {
		return readNo5;
	}
	/**
	 * @param readNo5 設定する readNo5
	 */
	public void setReadNo5(String readNo5) {
		this.readNo5 = readNo5;
	}
	/**
	 * @return facType
	 */
	public String getFacType() {
		return facType;
	}
	/**
	 * @param facType 設定する facType
	 */
	public void setFacType(String facType) {
		this.facType = facType;
	} 
}
