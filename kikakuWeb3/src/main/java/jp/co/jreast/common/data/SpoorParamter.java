package jp.co.jreast.common.data;

/**
 *<pre>
 * ���ՃN���X�̃v���p�e�B�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 * @author Xbl
 *
 */
public interface SpoorParamter {
		
	/**
	 * 
	 * @return AnsSearchData
	 */
	public AnsSearchData getAnsSearchData();
	
	/**
	 * 
	 * @param data AnsSearchData
	 */
	public void setAnsSearchData(AnsSearchData data);	
	
	/**
	 * 
	 * @return user
	 */
	public Boolean getIsJR();
	
	/**
	 * 
	 * @param isJr is Jr
	 */
	public void setIsJR(boolean isJr);
}
