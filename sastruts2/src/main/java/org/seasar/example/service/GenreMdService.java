package org.seasar.example.service;

import static org.seasar.example.entity.GenreMdNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.example.entity.GenreMd;
import org.seasar.framework.beans.util.BeanMap;

/**
 * {@link GenreMd}のサービスクラスです。
 *
 */
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2018/03/31 19:40:43")
public class GenreMdService extends AbstractService<GenreMd> {

	/**
	 * 識別子でエンティティを検索します。
	 *
	 * @param genreMdCd
	 *            識別子
	 * @return エンティティ
	 */
	public GenreMd findById(String genreMdCd) {
		return select().id(genreMdCd).getSingleResult();
	}

	/**
	 * 識別子の昇順ですべてのエンティティを検索します。
	 *
	 * @return エンティティのリスト
	 */
	public List<GenreMd> findAllOrderById() {
		return select().innerJoin(genreLg(), true).orderBy(asc(genreMdCd())).getResultList();
	}

	/**
	 * メソッドの説明：大ジャンルコードによる検索の件数
	 * @author kamagata
	 * @since 2018/04/02
	 * @param genreLgCd 大ジャンルコード
	 * @return Long 件数
	 */
	public Long countByGenreLgCd(String genreLgCd) {
		return select().innerJoin(genreLg(), false).where(eq(genreLg().genreLgCd(), genreLgCd)).getCount();
	}

	/**
	 * メソッドの説明：検索条件指定
	 * @author kamagata
	 * @since 2018/04/02
	 * @param conditions 条件
	 * @return  List<GenreMd>
	 */
	@Override
	public List<GenreMd> findByCondition(BeanMap conditions) {
		return this.select().innerJoin(genreLg(), true).where(conditions).getResultList();
	}
}