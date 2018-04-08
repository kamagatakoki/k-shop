package org.seasar.example.service;

import javax.annotation.Generated;

import org.seasar.example.aop.CommonColumn;
import org.seasar.extension.jdbc.service.S2AbstractService;

/**
 * サービスの抽象クラスです。
 *
 * @param <ENTITY>
 *            エンティティの型
 */
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.AbstServiceModelFactoryImpl" }, date = "2018/03/31 19:40:43")
public abstract class AbstractService<ENTITY> extends S2AbstractService<ENTITY> {

	/** オーバーライドの説明：
	 * @see org.seasar.extension.jdbc.service.S2AbstractService#insert(java.lang.Object)
	 * @author kamagata
	 * @since 2018/04/02
	 * @param entity エンティティ
	 * @return 登録行数
	 */
	@Override
	@CommonColumn
	public int insert(ENTITY entity) {
		return this.jdbcManager.insert(entity).execute();
	}

	/** オーバーライドの説明：
	 * @see org.seasar.extension.jdbc.service.S2AbstractService#insert(java.lang.Object)
	 * @author kamagata
	 * @since 2018/04/02
	 * @param entity エンティティ
	 * @return 登録行数
	 */
	@Override
	@CommonColumn
	public int update(ENTITY entity) {
		return this.jdbcManager.update(entity).excludes("insertDt", "insertCd").execute();
	}
}