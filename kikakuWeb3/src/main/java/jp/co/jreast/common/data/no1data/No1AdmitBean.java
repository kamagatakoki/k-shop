package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.UserData;

/**
 * <pre>
 * NO1_承認入力データクラス。.
 * 機能概要    ：  NO1_承認入力データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1AdmitBean implements InData {

	/**
	 * NO1_承認状況.
	 */
	private No1AckInfoData no1AckInfoData;
	
	/**
	 *  NO1_承認状況(Faxの場合、施設の承認状況).
	 */
	private No1AckInfoData AckInfoFacilityData;
	/**
	 * ユーザデータ.
	 */
	private UserData userData;
	
	/**
	 * 備考.
	 */
	private MemoData memo;
	
	/**.
	 * 企画回答書データ.
	 */
	private No1FormBean formData;
	
	/**.
	 * 検索条件.
	 */
	private AnsSearchData ansSearchData;
	
	/**
	 * 状態.
	 */
	private Integer status;
	
	/**
	 * チェックbean.
	 */
	private No1BusinessCheckBean businessCheckBean;

	/**
	 * @return NO1_承認状況.
	 */
	public final No1AckInfoData getNo1AckInfoData() {
		return no1AckInfoData;
	}

	/**
	 * @param no1AckInfoData NO1_承認状況.
	 */
	public final void setNo1AckInfoData(final No1AckInfoData no1AckInfoData) {
		this.no1AckInfoData = no1AckInfoData;
	}

	/**
	 * @return 企画回答書データ.
	 */
	public final No1FormBean getFormData() {
		return formData;
	}

	/**
	 * @param formData 企画回答書データ.
	 */
	public final void setFormData(final No1FormBean formData) {
		this.formData = formData;
	}
	
	/**
	 * @return 検索条件
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData 検索条件
	 */
	public void setAnsSearchData(final AnsSearchData ansSearchData) {
		this.ansSearchData = ansSearchData;
	}

	/**
	 * @return the memo
	 */
	public final MemoData getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public final void setMemo(final MemoData memo) {
		this.memo = memo;
	}

	/**
	 * @return the status
	 */
	public final Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public final void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the userData
	 */
	public final UserData getUserData() {
		return userData;
	}

	/**
	 * @param userData the userData to set
	 */
	public final void setUserData(final UserData userData) {
		this.userData = userData;
	}

	/**
	 * 
	 * @return businessCheckBean
	 */
	public No1BusinessCheckBean getBusinessCheckBean() {
		return businessCheckBean;
	}

	/**
	 * 
	 * @param businessCheckBean businessCheckBean
	 */
	public void setBusinessCheckBean(No1BusinessCheckBean businessCheckBean) {
		this.businessCheckBean = businessCheckBean;
	}
	/**
	 * 
	 * @return NO1_承認状況(Faxの場合、施設の承認状況).
	 */
	public No1AckInfoData getAckInfoFacilityData() {
		return AckInfoFacilityData;
	}
	/**
	 * 
	 * @param ackInfoFacilityData NO1_承認状況(Faxの場合、施設の承認状況).
	 */
	public void setAckInfoFacilityData(No1AckInfoData ackInfoFacilityData) {
		AckInfoFacilityData = ackInfoFacilityData;
	}

	/**
	 * 送付担当者名.(チェック欄)
	 */
	private String senderNm;

	/**
	 * 
	 * @return 送付担当者名(チェック欄)
	 */
	public String getSenderNm() {
		return senderNm;
	}

	/**
	 * 
	 * @param senderNm 送付担当者名(チェック欄)
	 */
	public void setSenderNm(String senderNm) {
		this.senderNm = senderNm;
	}
	
	/**
	 * 送付連絡先電話.
	 */
	private String senderTel;
	
	/**
	 * 
	 * @return 送付連絡先電話
	 */
	public String getSenderTel() {
		return senderTel;
	}
	
	/**
	 * 
	 * @param senderTel 送付連絡先電話
	 */
	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}
	
	/**.
	 * 連絡先Fax
	 */
	private String senderFax;
	
	/**
	 * 
	 * @return 連絡先Fax
	 */
	public String getSenderFax() {
		return senderFax;
	}
	
	/**
	 * 
	 * @param senderFax 連絡先Fax
	 */
	public void setSenderFax(String senderFax) {
		this.senderFax = senderFax;
	}
}
