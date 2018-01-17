package com.example.demo.service.master;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.domain.entity.master.UserInfoEntity;

/**
 * クラスの説明：ユーザーマスタ検索条件付加
 * @author kamagata
 * @since 2018/01/12
 */
@Service
public class UserInfoSpecifications {

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @param firstNm 名前
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<UserInfoEntity> firstNmContains(String firstNm) {
		return StringUtils.isEmpty(firstNm) ? null : (root, query, cb) -> cb.like(root.get("firstNm"), "%" + firstNm + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @param lastNm 苗字
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<UserInfoEntity> lastNmContains(String lastNm) {
		return StringUtils.isEmpty(lastNm) ? null : (root, query, cb) -> cb.like(root.get("lastNm"), "%" + lastNm + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @param email メールアドレス
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<UserInfoEntity> emailContains(String email) {
		return StringUtils.isEmpty(email) ? null : (root, query, cb) -> cb.like(root.get("email"), "%" + email + "%");
	}

	/**
	 * メソッドの説明：指定されいている場合は条件追加
	 * @author kamagata
	 * @param phone 電話番号
	 * @since 2018/01/06
	 * @return 引数指定なし：null、指定あり：Predicateクラス
	 */
	public static Specification<UserInfoEntity> phoneContains(String phone) {
		return StringUtils.isEmpty(phone) ? null : (root, query, cb) -> cb.like(root.get("phone"), "%" + phone + "%");
	}
}
