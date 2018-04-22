package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;

/**
 * <pre>
 * NO1_�Z�[�u�f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1_�Z�[�u�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public class No1OnceSaveData implements InData {

	/**
	 * �֘A�`�F�b�N�t���O.
	 */
	private int errorFlg ;
	/**
	 * No2��ʃR�s�[�t���O.
	 */
	private AnsSearchData no2CopyData;
	/**
	 * No3��ʃR�s�[�t���O.
	 */
	private AnsSearchData no3CopyData;
	/**
	 * No4��ʃR�s�[�t���O.
	 */
	private AnsSearchData no4CopyData;
	/**
	 * No5��ʃR�s�[�t���O.
	 */
	private AnsSearchData no5CopyData;
	
	/**
	 * No1�Ɩ��f�[�^.
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
						
