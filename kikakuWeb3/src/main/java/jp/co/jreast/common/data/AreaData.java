package jp.co.jreast.common.data;
/**
 * <pre>
 * �n��}�X�^�f�[�^�N���X�B.
 * �@�\�T�v    �F  �n��}�X�^�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/12/07
 */
public class AreaData {
	/**
	 * �n��R�[�h.
	 */
	private String areaCd;
	
	/**
	 * �n�於��.
	 */
	private String areaName;
	
	/**
	 * �n�於�́i�J�i�j.
	 */
	private String areaKana;

	/**
	 * @return Returns the areaCd.
	 */
	public String getAreaCd() {
		return areaCd;
	}

	/**
	 * @param areaCd The areaCd to set.
	 */
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	/**
	 * @return Returns the areaKana.
	 */
	public String getAreaKana() {
		return areaKana;
	}

	/**
	 * @param areaKana The areaKana to set.
	 */
	public void setAreaKana(String areaKana) {
		this.areaKana = areaKana;
	}

	/**
	 * @return Returns the areaName.
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName The areaName to set.
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}
