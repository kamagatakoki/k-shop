package com.example.demo.specifications;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.domain.entity.common.CommonColumnEntity;

/**
 * クラスの説明：共通Specifications
 * @author kamagata
 * @param <E> 共通カラムエンティティを継承したクラス
 * @since 2018/01/17
 */
@Service
public class CommonSpecifications<E extends CommonColumnEntity> {

	/**
	 * メソッドの説明：equal条件 指定されいている場合は条件追加
	 * @author kamagata
	 * @since 2018/01/17
	 * @param columnName 検索条件 エンティティカラム名
	 * @param value 検索値
	 * @return Specification<E> 指定のエンティティクラス
	 */
	public Specification<E> conditionForEqual(String columnName, String value) {
		return StringUtils.isEmpty(value) ? null : (root, query, cb) -> cb.equal(root.get(columnName), value);
	}

	/**
	 * メソッドの説明：完全一致条件 指定されいている場合は条件追加 外部キーに対応
	 * @author kamagata
	 * @param parentColumnNm 検索条件 エンティティテーブル名
	 * @param childColumnNm 検索条件 エンティティカラム名
	 * @since 2018/01/17
	 * @param value 検索値
	 * @return Specification<?> 指定のエンティティクラス
	 */
	public Specification<E> conditionForEqual(String parentColumnNm, String childColumnNm, String value) {
		return StringUtils.isEmpty(value) ? null
				: (root, query, cb) -> cb.equal(root.get(parentColumnNm).get(childColumnNm), value);
	}

	/**
	 * メソッドの説明：部分一致条件 指定されいている場合は条件追加
	 * @author kamagata
	 * @param columnName 検索条件 エンティティカラム名
	 * @param value 値
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public Specification<E> conditionForLike(String columnName, String value) {
		return StringUtils.isEmpty(value) ? null
				: (root, query, cb) -> cb.like(root.get(columnName), "%" + value + "%");
	}

	/**
	 * メソッドの説明：部分一致条件 指定されいている場合は条件追加 外部キーに対応
	 * @author kamagata
	 * @param parentColumnNm 検索条件 エンティティテーブル名
	 * @param childColumnNm 検索条件 エンティティカラム名
	 * @param value 値
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public Specification<E> conditionForLike(String parentColumnNm, String childColumnNm, String value) {
		return StringUtils.isEmpty(value) ? null
				: (root, query, cb) -> cb.like(root.get(parentColumnNm).get(childColumnNm), "%" + value + "%");
	}

	/**
	 * メソッドの説明：前方一致条件 指定されいている場合は条件追加
	 * @author kamagata
	 * @param columnName 検索条件 エンティティカラム名
	 * @param value 値
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public Specification<E> conditionForStartWith(String columnName, String value) {
		return StringUtils.isEmpty(value) ? null
				: (root, query, cb) -> cb.like(root.get(columnName), value + "%");
	}

	/**
	 * メソッドの説明：前方一致条件 指定されいている場合は条件追加 外部キーに対応
	 * @author kamagata
	 * @param parentColumnNm 検索条件 エンティティテーブル名
	 * @param childColumnNm 検索条件 エンティティカラム名
	 * @param value 値
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public Specification<E> conditionForStartWith(String parentColumnNm, String childColumnNm, String value) {
		return StringUtils.isEmpty(value) ? null
				: (root, query, cb) -> cb.like(root.get(parentColumnNm).get(childColumnNm), value + "%");
	}

}
