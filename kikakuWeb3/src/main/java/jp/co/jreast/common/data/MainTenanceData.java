package jp.co.jreast.common.data;

import java.util.Date;


/**
 * <pre>
 * NO1_ゴルフデータクラス。.
 * 機能概要    ：  メンテナンス遷移actionの専用データ.
 *　特記事項    ：  無し
 * </pre>
 * @author jinhuashi
 * @version 0.1 2006/11/24
 */
public class MainTenanceData {
	/**
	 * メンテナンスフラグ.
	 */
	private String sysJTI;
	/**
	 * 日時.
	 */
	private Date sysTMD;

	/**
	 * @return sysJTI
	 */
	public String getSysJTI() {
		return sysJTI;
	}

	/**
	 * @param sysJTI 設定する sysJTI
	 */
	public void setSysJTI(String sysJTI) {
		this.sysJTI = sysJTI;
	}

	/**
	 * @return sysTMD
	 */
	public Date getSysTMD() {
		return sysTMD;
	}

	/**
	 * @param sysTMD 設定する sysTMD
	 */
	public void setSysTMD(Date sysTMD) {
		this.sysTMD = sysTMD;
	}
	
}
