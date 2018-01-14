package com.example.demo.web.form;

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
	 * フィールドの説明：入力パスワード
	 * @author kamagata
	 * @since 2018/01/11
	 */
	@NotNull
	@Size(min = 4, max = 20)
	private String inputPassword;
}
