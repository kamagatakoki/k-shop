package com.example.demo.service.master;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.domain.entity.master.GenreLgEntity;

/**
 * クラスの説明：大ジャンルテーブル検索の条件付加
 * @author kamagata
 * @since 2018/01/06
 */
@Service
public class GenreLgSpecifications {

	/**
	 * メソッドの説明：ジャンルLコードが指定されいている場合は条件追加
	 * @author kamagata
	 * @param string 大ジャンルコード
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreLgEntity> genreLgCdContains(String string) {
		return StringUtils.isEmpty(string) ? null : (root, query, cb) -> cb.equal(root.get("genreLgCd"), string);
	}

	/**
	 * メソッドの説明：大ジャンル名が指定されいている場合は条件追加
	 * @author kamagata
	 * @param genreLgNm 大ジャンル名
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<GenreLgEntity> genreLgNmContains(String genreLgNm) {
		return StringUtils.isEmpty(genreLgNm) ? null
				: (root, query, cb) -> cb.like(root.get("genreLgNm"), "%" + genreLgNm + "%");
	}
}
