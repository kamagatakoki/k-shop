package org.seasar.example.service;

import static org.seasar.example.entity.GenreSmNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.example.entity.GenreSm;

/**
 * {@link GenreSm}のサービスクラスです。
 *
 */
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2018/03/31 19:40:43")
public class GenreSmService extends AbstractService<GenreSm> {

	/**
	 * 識別子でエンティティを検索します。
	 *
	 * @param genreSmCd
	 *            識別子
	 * @return エンティティ
	 */
	public GenreSm findById(String genreSmCd) {
		return select().id(genreSmCd).getSingleResult();
	}

	/**
	 * 識別子の昇順ですべてのエンティティを検索します。
	 *
	 * @return エンティティのリスト
	 */
	public List<GenreSm> findAllOrderById() {
		return select().orderBy(asc(genreSmCd())).getResultList();
	}

	/**
	 * メソッドの説明：中ジャンルコードによる検索の件数
	 * @author kamagata
	 * @since 2018/04/02
	 * @param genreMdCd 中ジャンルコード
	 * @return Long 件数
	 */
	public Long countByGenreMdCd(String genreMdCd) {
		return select().innerJoin(genreMd(), false).where(eq(genreMd().genreMdCd(), genreMdCd)).getCount();
	}
}