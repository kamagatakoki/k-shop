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
 *
 */
public class FacilityManageSearchData extends AnsSearchData implements InData {
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
	private boolean isNewType=false;
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
		return facilitySorts;
	}
	
	/**
	 * @return IsNewType
	 */
	public boolean getIsNewType() {
		return isNewType;
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
}
