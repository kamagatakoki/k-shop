package jp.co.jreast.common.util;

/**
 * <pre>
 * SQL文句専用クラス。.
 * 機能概要    ：  SQL文句の条件文句を作成ため
 * 特記事項    ：  例　SQL文句select * where fieldName(名前) operater（＝） value（小泉） ） 
 * </pre>
 * @author Xbl
 *
 */
public class Condition {

	/**
	 * フィールド.
	 */
	private String fieldName;

	/**
	 * 判断用値.
	 */
	private Object value;

	/**
	 * operater.
	 */
	private String operater = "=";

	/**
	 * construct.
	 *
	 */
	public Condition() {

	}

	/**
	 * 
	 * @param field field
	 * @param val value
	 */
	public Condition(String field, Object val) {
		this.fieldName = field;
		this.value = val;
	}

	/**
	 * 
	 * @param field field
	 * @param val value
	 * @param oper operator
	 */
	public Condition(String field, Object val, String oper) {
		this.fieldName = field;
		this.operater = oper;
		this.value = val;
	}

	/**
	 * 
	 * @return String fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * 
	 * @param fieldName field name
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * 
	 * @return value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * 
	 * @param value value
	 */
	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * 
	 * @return operator
	 */
	public String getOperater() {
		return operater;
	}

	/**
	 * 
	 * @param operater operator
	 */
	public void setOperater(String operater) {
		this.operater = operater;
	}

}
