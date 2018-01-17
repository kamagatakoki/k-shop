package com.example.demo.web.form;

import lombok.Data;

/**
 * クラスの説明：共通フォームクラス
 * @author kamagata
 * @since 2018/01/17
 */
@Data
public class CommonForm {

	/**
	 * クラスの説明：登録用バリデーショングループ
	 * @author kamagata
	 * @since 2018/01/14
	 */
	public static interface Insert {

	}

	/**
	 * クラスの説明：更新用バリデーショングループ
	 * @author kamagata
	 * @since 2018/01/14
	 */
	public static interface Update {

	}

	/**
	 * フィールドの説明：更新モード(新規or更新)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String crud;
}
