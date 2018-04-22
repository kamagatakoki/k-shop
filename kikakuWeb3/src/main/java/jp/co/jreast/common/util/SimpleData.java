package jp.co.jreast.common.util;

/**.
 * <pre>
 * �ȒP�f�[�^�N���X�B.
 * �@�\�T�v    �F  �ȒP�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author Xbl	
 * @version 0.1 2006/10/27
 */
public class SimpleData {
	
	/**
	 * long type value.
	 */
	private Long longValue;
	
	/**
	 * string type value.
	 */
	private String stringValue;

	/**
	 * 
	 * @return string type value
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * 
	 * @param stringValue string type value
	 */
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	/**
	 * 
	 * @return long type value
	 */
	public Long getLongValue() {
		return longValue;
	}

	/**
	 * 
	 * @param longValue long type value
	 */
	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}	
}
