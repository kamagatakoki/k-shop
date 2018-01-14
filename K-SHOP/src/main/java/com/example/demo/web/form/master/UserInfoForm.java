package com.example.demo.web.form.master;

import java.util.Objects;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import lombok.Data;

/**
 * クラスの説明：ユーザーマスタフォーム
 * @author kamagata
 * @since 2018/01/11
 */
@Data
public class UserInfoForm {

	/**
	 * クラスの説明：登録用バリデーショングループ
	 * @author kamagata
	 * @since 2018/01/13
	 */
	public static interface Insert {

	}

	/**
	 * クラスの説明：更新用バリデーショングループ
	 * @author kamagata
	 * @since 2018/01/13
	 */
	public static interface Update {

	}

	/**
	 * フィールドの説明：ユーザーコード
	 * @author kamagata
	 * @since 2018/01/11
	 */
	private Integer userCd;

	/**
	 * フィールドの説明：名前
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@NotNull
	@Size(min = 1, max = 10)
	private String firstNm;

	/**
	 * フィールドの説明：苗字
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@NotNull
	@Size(min = 1, max = 10)
	private String lastNm;

	/**
	 * フィールドの説明：Eメールアドレス
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@NotNull
	@Size(min = 1, max = 50)
	@Email
	private String email;

	/**
	 * フィールドの説明：電話番号
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@NotNull
	@Size(min = 8, max = 13)
	private String phone;

	/**
	 * フィールドの説明：入力パスワード バリデーションは登録時のみ
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@NotNull(groups = Insert.class)
	@Size(min = 4, max = 20, groups = Insert.class)
	private String inputPassword;

	/**
	 * フィールドの説明：入力パスワード(確認用)
	 * @author kamagata
	 * @since 2018/01/11
	 */
	private String confirmPassword;

	/**
	 * メソッドの説明：パスワード(確認)チェック
	 * @author kamagata
	 * @since 2018/01/13
	 * @return チェック可否(true:OK、false:NG)
	 */
	@AssertTrue(message = "{com.example.demo.web.form.passwordConfirmed.message}", groups = Insert.class)
	public boolean isEqualsInputPassword() {
		// 同じ入力値ならOK
		return Objects.equals(inputPassword, confirmPassword);
	}

	/**
	 * フィールドの説明：名前(検索条件)
	 * @author kamagata
	 * @since 2018/01/13
	 */
	private String searchFirstNm;

	/**
	 * フィールドの説明：苗字(検索条件)
	 * @author kamagata
	 * @since 2018/01/13
	 */
	private String searchLastNm;

	/**
	 * フィールドの説明：Eメールアドレス(検索条件)
	 * @author kamagata
	 * @since 2018/01/13
	 */
	private String searchEmail;

	/**
	 * フィールドの説明：電話番号(検索条件)
	 * @author kamagata
	 * @since 2018/01/13
	 */
	private String searchPhone;

	/**
	 * フィールドの説明：更新モード(新規or更新)
	 * @author kamagata
	 * @since 2018/01/13
	 */
	private String crud;

}
