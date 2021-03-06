package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.UserData;

/**
 * <pre>
 * NO1_³FüÍf[^NXB.
 * @\Tv    F  NO1_³FüÍf[^ði[·éB
 * ÁL    F  ³µ
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1AdmitBean implements InData {

	/**
	 * NO1_³Fóµ.
	 */
	private No1AckInfoData no1AckInfoData;
	
	/**
	 *  NO1_³Fóµ(FaxÌêA{ÝÌ³Fóµ).
	 */
	private No1AckInfoData AckInfoFacilityData;
	/**
	 * [Uf[^.
	 */
	private UserData userData;
	
	/**
	 * õl.
	 */
	private MemoData memo;
	
	/**.
	 * éæñf[^.
	 */
	private No1FormBean formData;
	
	/**.
	 * õð.
	 */
	private AnsSearchData ansSearchData;
	
	/**
	 * óÔ.
	 */
	private Integer status;
	
	/**
	 * `FbNbean.
	 */
	private No1BusinessCheckBean businessCheckBean;

	/**
	 * @return NO1_³Fóµ.
	 */
	public final No1AckInfoData getNo1AckInfoData() {
		return no1AckInfoData;
	}

	/**
	 * @param no1AckInfoData NO1_³Fóµ.
	 */
	public final void setNo1AckInfoData(final No1AckInfoData no1AckInfoData) {
		this.no1AckInfoData = no1AckInfoData;
	}

	/**
	 * @return éæñf[^.
	 */
	public final No1FormBean getFormData() {
		return formData;
	}

	/**
	 * @param formData éæñf[^.
	 */
	public final void setFormData(final No1FormBean formData) {
		this.formData = formData;
	}
	
	/**
	 * @return õð
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData õð
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
	 * @return NO1_³Fóµ(FaxÌêA{ÝÌ³Fóµ).
	 */
	public No1AckInfoData getAckInfoFacilityData() {
		return AckInfoFacilityData;
	}
	/**
	 * 
	 * @param ackInfoFacilityData NO1_³Fóµ(FaxÌêA{ÝÌ³Fóµ).
	 */
	public void setAckInfoFacilityData(No1AckInfoData ackInfoFacilityData) {
		AckInfoFacilityData = ackInfoFacilityData;
	}

	/**
	 * tSÒ¼.(`FbN)
	 */
	private String senderNm;

	/**
	 * 
	 * @return tSÒ¼(`FbN)
	 */
	public String getSenderNm() {
		return senderNm;
	}

	/**
	 * 
	 * @param senderNm tSÒ¼(`FbN)
	 */
	public void setSenderNm(String senderNm) {
		this.senderNm = senderNm;
	}
	
	/**
	 * tAædb.
	 */
	private String senderTel;
	
	/**
	 * 
	 * @return tAædb
	 */
	public String getSenderTel() {
		return senderTel;
	}
	
	/**
	 * 
	 * @param senderTel tAædb
	 */
	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}
	
	/**.
	 * AæFax
	 */
	private String senderFax;
	
	/**
	 * 
	 * @return AæFax
	 */
	public String getSenderFax() {
		return senderFax;
	}
	
	/**
	 * 
	 * @param senderFax AæFax
	 */
	public void setSenderFax(String senderFax) {
		this.senderFax = senderFax;
	}
}
