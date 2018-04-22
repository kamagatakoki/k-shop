package jp.co.jreast.common.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * SQL文句を組み合わせクラス。.
 * 機能概要    ：  SQL文句を組み合わせ.
 * 特記事項    ：  無し
 * </pre>
 * @author Xbl
 * 
 */
public class StatParamter {

	/**
	 * table name.
	 */
	private String tableName;

	/**
	 * stat filed name.
	 */
	private String field;

	/**
	 * stat function.
	 */
	private String function;

	/**
	 * where sub sql string.
	 */
	private String conString;

	/**
	 * where sub sql conditions.
	 */
	private List conSet = new ArrayList();;

	/**
	 * 
	 * @param tableName
	 *            table name
	 * @param function
	 *            function
	 * @param conditions
	 *            conditions
	 */
	public StatParamter(String tableName, String function, Map conditions) {
		this.tableName = tableName;
		this.function = function;
		if (null != conditions) {
			Iterator it = conditions.entrySet().iterator();
			while (it.hasNext()) {
				Condition con = new Condition();
				Map.Entry entry = (Map.Entry) it.next();
				con.setFieldName(entry.getKey().toString());
				con.setValue(entry.getValue());
				conSet.add(con);
			}
		}
	}

	/**
	 * 
	 * @param tableName
	 *            table name
	 * @param field
	 *            field name
	 * @param conString
	 *            condition string
	 */
	public StatParamter(String tableName, String field, String conString) {

		this.conString = conString;
		this.tableName = tableName;
		this.field = field;

	}

	/**
	 * 
	 * @param tableName
	 *            table name
	 * @param field
	 *            field name
	 * @param conSet
	 *            conditions list
	 */
	public StatParamter(String tableName, String field, List conSet) {

		this.tableName = tableName;
		this.conSet = conSet;
		this.field = field;

	}

	/**
	 * 
	 * @param tableName
	 *            table name
	 * @param field
	 *            field name
	 */
	public StatParamter(String tableName, String field) {

		this.tableName = tableName;
		this.field = field;

	}

	/**
	 * 
	 * @param conSet
	 *            conditions collections
	 */
	public void setConSet(List conSet) {
		this.conSet = conSet;
	}

	/**
	 * 
	 * @param conString
	 *            condition string
	 */
	public void setConString(String conString) {
		this.conString = conString;
	}

	/**
	 * 
	 * @param function
	 *            stat function name
	 */
	public void setFunction(String function) {
		this.function = function;
	}

	/**
	 * 
	 * @return condition string
	 */
	public String getConString() {
		return conString;
	}

	/**
	 * 
	 * @return field name
	 */
	public String getField() {
		return field;
	}

	/**
	 * 
	 * @param field
	 *            field
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * 
	 * @return table name
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * 
	 * @return conditon collection
	 */
	public List getConSet() {
		return conSet;
	}

	/**
	 * 
	 * @return stat function
	 */
	public String getFunction() {
		return function;
	}
	
}
