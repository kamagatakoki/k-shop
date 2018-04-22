package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.SpoorParamter;

/**
 * <pre>
 * NO1�������f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1�������f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author jinhuashi
 * @version 0.1 2006/11/17
 */
public class No1InitData implements InData, SpoorParamter {
	
	/**
     * �R���X�g���N�^.
     */
	public No1InitData() {
		ansSearchData = new AnsSearchData();
	}
	/**
	 * �{���f�[�^.
	 */
	private AnsSearchData ansSearchData;
	/**
	 * JR�o�^�҂�.
	 */
	private Boolean isJR;
	
	/**
	 * ���[�U�敪.
	 */
	private String userDiv;
	
	/**
	 * �֎�����t���O.
	 */
	private Boolean isDisplayFlg = Boolean.FALSE;	
	/**
	 * �R�s����t���O .
	 */
	private Boolean isCopyFlg = Boolean.FALSE;	
	
	/**
	 * 
	 * @return searchData
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}
	/**
	 * 
	 * @param searchData searchData
	 */
	public void setAnsSearchData(AnsSearchData searchData) {
		this.ansSearchData = searchData;
	}
	/**
	 * 
	 * @return user
	 */
	public Boolean getIsJR() {
		return isJR;
	}
	/**
	 * 
	 * @param isJR isJR
	 */
	public void setIsJR(boolean isJR) {
		this.isJR = new Boolean(isJR);
	}
	
	/**
	 * 
	 * @return �\������t���O
	 */
	public Boolean getIsDisplayFlg() {
		return isDisplayFlg;
	}
	
	/**
	 * 
	 * @param isDisplayFlg �\������t���O
	 */
	public void setIsDisplayFlg(Boolean isDisplayFlg) {
		this.isDisplayFlg = isDisplayFlg;
	}
	/**
	 * @return Returns the userDiv.
	 */
	public String getUserDiv() {
		return userDiv;
	}
	/**
	 * @param userDiv The userDiv to set.
	 */
	public void setUserDiv(String userDiv) {
		this.userDiv = userDiv;
	}
	/**
	 * @return Returns the isCopyFlg.
	 */
	public Boolean getIsCopyFlg() {
		return isCopyFlg;
	}
	/**
	 * @param isCopyFlg The isCopyFlg to set.
	 */
	public void setIsCopyFlg(Boolean isCopyFlg) {
		this.isCopyFlg = isCopyFlg;
	}

}
