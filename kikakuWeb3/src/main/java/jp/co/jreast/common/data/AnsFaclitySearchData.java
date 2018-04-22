/**
 * <pre>
 * �{�ݕt�ь����f�[�^�N���X�B.
 * �@�\�T�v    �F  �{�ݕt�ь����f�[�^���i�[����B
 * ���L����    �F  ����
 */
package jp.co.jreast.common.data;

import jp.co.intage.framework.data.InData;

/**
 * @author s30873
 * @since 2009/12/10
 * @version 0.1
 */
public class AnsFaclitySearchData extends AnsSearchData implements InData {
	/**
	 * �{�݃R�[�h
	 */
	private String facilityCd;
	/**
	 * �{�ݕt�ю��
	 */
	private String facilitySorts;
	/**
	 * �{�݃p�^�[��
	 */
	private String facilityPattern;
	/**
	 * �V�K�쐬��
	 */
	private String btnNm;
	/**
	 * �񓚏��F0�A�t�я��F1�A�V�K�F2
	 */
	private String callFlg;
	/**
	 * ���O�C�����[�U�[ID
	 */
	private String userId; 
	/**
	 * ���O�C�����[�U�[��
	 */
	private String userNm;
	/**
	 * ���O�C�����[�U�[�敪
	 */
	private Integer userDiv;
	/**
	 * �{�݊m��t���O
	 */
	private String facilityDecisionFlg;
	/**
	 * �{�݃^�C�v
	 */
	private String facilityType;
	/**
	 * @return facilityCd
	 */
	public String getFacilityCd() {
		return facilityCd;
	}
	/**
	 * @return facilityPattern
	 */
	public String getFacilityPattern() {
		return facilityPattern;
	}
	/**
	 * @return facilitySorts
	 */
	public String getFacilitySorts() {
		if(btnNm != null){
			return String.valueOf(Integer.parseInt(btnNm)-2);
		}
		return facilitySorts;
	}
	/**
	 * @return btnNm
	 */
	public String getBtnNm() {
		return btnNm;
	}
	
	/**
	 * @param facilityCd �ݒ肷�� facilityCd
	 */
	public void setFacilityCd(final String facilityCd) {
		this.facilityCd = facilityCd;
	}
	/**
	 * @param facilityPattern �ݒ肷�� facilityPattern
	 */
	public void setFacilityPattern(final String facilityPattern) {
		this.facilityPattern = facilityPattern;
	}
	/**
	 * @param facilitySorts �ݒ肷�� facilitySorts
	 */
	public void setFacilitySorts(final String facilitySorts) {
		this.facilitySorts = facilitySorts;
	}
	/**
	 * @param btnNm �ݒ肷�� isNewType
	 */
	public void setBtnNm(String btnNm) {
		this.btnNm = btnNm;
	}
	/**
	 * @return callFlg
	 */
	public String getCallFlg() {
		return callFlg;
	}
	/**
	 * @param callFlg �ݒ肷�� callFlg
	 */
	public void setCallFlg(String callFlg) {
		this.callFlg = callFlg;
	}
	/**
	 * @return userDiv
	 */
	public Integer getUserDiv() {
		return userDiv;
	}
	/**
	 * @param userDiv �ݒ肷�� userDiv
	 */
	public void setUserDiv(Integer userDiv) {
		this.userDiv = userDiv;
	}
	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId �ݒ肷�� userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return userNm
	 */
	public String getUserNm() {
		return userNm;
	}
	/**
	 * @param userNm �ݒ肷�� userNm
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	/**
	 * @return facilityDecisionFlg
	 */
	public String getFacilityDecisionFlg() {
		return facilityDecisionFlg;
	}
	/**
	 * @param facilityDecisionFlg �ݒ肷�� facilityDecisionFlg
	 */
	public void setFacilityDecisionFlg(String facilityDecisionFlg) {
		this.facilityDecisionFlg = facilityDecisionFlg;
	}
	/**
	 * @return facilityType
	 */
	public String getFacilityType() {
		return facilityType;
	}
	/**
	 * @param facilityType �ݒ肷�� facilityType
	 */
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	
}
