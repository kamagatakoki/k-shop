package com.example.demo.domain.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * クラスの説明：商品サイズEnum
 * @author kamagata
 * @since 2018/01/17
 */
@Getter
@AllArgsConstructor
public enum GoodsSize implements Values {

	/**
	 * フィールドの説明：Sサイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	S("1", "Sサイズ"),

	/**
	 * フィールドの説明：Mサイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	M("1", "Mサイズ"),

	/**
	 * フィールドの説明：Lサイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	L("1", "Lサイズ");

	private final String value;
	private final String text;

}
