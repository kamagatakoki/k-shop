package com.example.demo.domain.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * クラスの説明：商品サイズEnum
 * @author kamagata
 * @since 2018/01/17
 */
@Getter
@AllArgsConstructor
public enum GoodsSize {

	/**
	 * フィールドの説明：Sサイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	S("1", "S"),

	/**
	 * フィールドの説明：Mサイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	M("2", "M"),

	/**
	 * フィールドの説明：Lサイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	L("3", "L");

	private final String value;
	private final String text;

	/**
	 * メソッドの説明：値から表示名を取得
	 * @author kamagata
	 * @since 2018/01/23
	 * @param param 値
	 * @return 表示名
	 */
	public static String getText(String param) {
		for (GoodsSize e : values()) {
			if (e.getValue().equals(param)) {
				return e.getText();
			}
		}

		return null;
	}

}
