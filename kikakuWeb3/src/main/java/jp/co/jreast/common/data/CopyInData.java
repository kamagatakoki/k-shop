package jp.co.jreast.common.data;

import jp.co.intage.framework.data.InData;

/**
 * <pre>
 * �R�s�[���̓f�[�^�N���X�B.
 * �@�\�T�v    �F  �R�s�[���̓f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/11/07
 */
public class CopyInData implements InData{
	
	/**
	 * ��挟���f�[�^.
	 */
	private AnsSearchData newData = new AnsSearchData();
	
	/**
	 * ��挟���f�[�^.
	 */
	private AnsSearchData oldData = new AnsSearchData();
		
	/**
	 * @return Returns the newData.
	 */
	public AnsSearchData getNewData() {
		return newData;
	}
	/**
	 * @param newData The newData to set.
	 */
	public void setNewData(AnsSearchData newData) {
		this.newData = newData;
	}
	/**
	 * @return Returns the oldData.
	 */
	public AnsSearchData getOldData() {
		return oldData;
	}
	/**
	 * @param oldData The oldData to set.
	 */
	public void setOldData(AnsSearchData oldData) {
		this.oldData = oldData;
	}
	
}
