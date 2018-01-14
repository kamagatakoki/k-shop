package com.example.demo.service.master;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.domain.entity.master.GenreSmEntity;

/**
 * クラスの説明：小ジャンルマスタ検索条件付加
 * @author kamagata
 * @since 2018/01/14
 */
@Service
public class GenreSmSpecifications {

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @param genreLgCd 大ジャンルコード
	 * @since 2018/01/14
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreSmEntity> genreLgCdContains(String genreLgCd) {
		return StringUtils.isEmpty(genreLgCd) ? null
				: (root, query, cb) -> cb.like(root.get("genreLgEntity").get("genreLgCd"), "%" + genreLgCd + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @param genreMdCd 中ジャンルコード
	 * @since 2018/01/14
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreSmEntity> genreMdCdContains(String genreMdCd) {
		return StringUtils.isEmpty(genreMdCd) ? null
				: (root, query, cb) -> cb.like(root.get("genreMdEntity").get("genreMdCd"), "%" + genreMdCd + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @param genreSmCd 小ジャンルコード
	 * @since 2018/01/14
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreSmEntity> genreSmCdContains(String genreSmCd) {
		return StringUtils.isEmpty(genreSmCd) ? null
				: (root, query, cb) -> cb.like(root.get("genreSmCd"), "%" + genreSmCd + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreLgNm 大ジャンル名
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreSmEntity> genreLgNmContains(String genreLgNm) {
		return StringUtils.isEmpty(genreLgNm) ? null
				: (root, query, cb) -> cb.like(root.get("genreLgEntity").get("genreLgNm"), "%" + genreLgNm + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreMdNm 中ジャンル名
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreSmEntity> genreMdNmContains(String genreMdNm) {
		return StringUtils.isEmpty(genreMdNm) ? null
				: (root, query, cb) -> cb.like(root.get("genreMdEntity").get("genreMdNm"), "%" + genreMdNm + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @since 2018/01/14
	 * @param genreSmNm 小ジャンル名
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreSmEntity> genreSmNmContains(String genreSmNm) {
		return StringUtils.isEmpty(genreSmNm) ? null
				: (root, query, cb) -> cb.like(root.get("genreSmNm"), "%" + genreSmNm + "%");
	}

}
