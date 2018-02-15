package com.example.sample.domain.entity.common;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * クラスの説明：Generator自動生成時のModelクラス名変更(テーブル名 + "Entity")
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

		String name = table.getBaseRecordType();
		table.setBaseRecordType(name + "Entity");
	}
}
