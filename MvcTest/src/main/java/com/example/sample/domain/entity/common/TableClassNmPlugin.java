package com.example.sample.domain.entity.common;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * クラスの説明：Generator自動生成時の色々な名称変更
 * @author kamagata
 * @since 2018/02/15
 */
public class TableClassNmPlugin extends PluginAdapter {

	/** オーバーライドの説明：
	 * @see org.mybatis.generator.api.Plugin#validate(java.util.List)
	 * @author kamagata
	 * @since 2018/02/15
	 * @param warnings 警告
	 * @return 検証結果
	 */
	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	/**
	 * メソッドの説明：名称変更
	 * @author kamagata
	 * @since 2018/02/15
	 * @param table テーブル
	 */
	@Override
	public void initialized(IntrospectedTable table) {
		super.initialized(table);

		// Modelクラス名を「テーブル名 + "Entity"」に変更
		String name = table.getBaseRecordType();
		table.setBaseRecordType(name + "Entity");

		// 以下、メソッド名やMapperXMLに出現する"Example"をCriteria"に変更
		name = table.getExampleWhereClauseId();
		table.setExampleWhereClauseId(name.replaceAll("Example", "Criteria"));

		name = table.getSelectByExampleStatementId();
		table.setSelectByExampleStatementId(name.replaceAll("Example", "Criteria"));

		name = table.getUpdateByExampleSelectiveStatementId();
		table.setUpdateByExampleSelectiveStatementId(name.replaceAll("Example", "Criteria"));

		name = table.getUpdateByExampleStatementId();
		table.setUpdateByExampleStatementId(name.replaceAll("Example", "Criteria"));

		name = table.getUpdateByExampleWithBLOBsStatementId();
		table.setUpdateByExampleWithBLOBsStatementId(name.replaceAll("Example", "Criteria"));

		name = table.getMyBatis3UpdateByExampleWhereClauseId();
		table.setMyBatis3UpdateByExampleWhereClauseId(name.replaceAll("Example", "Criteria"));

		name = table.getSelectByExampleWithBLOBsStatementId();
		table.setSelectByExampleWithBLOBsStatementId(name.replaceAll("Example", "Criteria"));

		name = table.getDeleteByExampleStatementId();
		table.setDeleteByExampleStatementId(name.replaceAll("Example", "Criteria"));

		name = table.getCountByExampleStatementId();
		table.setCountByExampleStatementId(name.replaceAll("Example", "Criteria"));
	}
}
