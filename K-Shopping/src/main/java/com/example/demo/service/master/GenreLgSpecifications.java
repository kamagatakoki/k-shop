package com.example.demo.service.master;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.domain.master.GenreLgEntity;

/**
 * クラスの説明：ジャンル大テーブル検索の条件付加
 * @author kamagata
 * @since 2018/01/06
 */
@Service
public class GenreLgSpecifications {

	/**
	 * メソッドの説明：ジャンルLコードが指定されいている場合は条件追加
	 * @author kamagata
	 * @param genreLgCd ジャンル大コード
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreLgEntity> genreLgCdContains(Integer genreLgCd) {
		return StringUtils.isEmpty(genreLgCd) ? null : (root, query, cb) -> cb.equal(root.get("genreLgCd"), genreLgCd);
	}

	/**
	 * メソッドの説明：ジャンル名が指定されいている場合は条件追加
	 * @author kamagata
	 * @param genreNm ジャンル名
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreLgEntity> genreNmContains(String genreNm) {
		return StringUtils.isEmpty(genreNm) ? null : (root, query, cb) -> cb.like(root.get("genreNm"), "%" + genreNm + "%");
	}
}
