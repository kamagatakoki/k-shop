package com.example.demo.web.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * コンストラクタの説明：ジャンル大フォームクラス
 * @author kamagata
 * @since 2018/01/07
 */
@Data
public class GenreLgForm {

	/**
	 * フィールドの説明：ジャンル大コード
	 * @author kamagata
	 * @since 2018/01/07
	 */
	private Integer genreLgCd;

	/**
	 * フィールドの説明：ジャンル名
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@NotNull
	@Size(min = 1, max = 50)
	private String genreNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/08
	 */
	@NotNull
	@Min(1)
	@Max(999)
	private Integer displayOrder;

	/**
	 * フィールドの説明：検索条件 ジャンル大コード
	 * @author kamagata
	 * @since 2018/01/10
	 */
	private Integer searchGenreLgCd;

	/**
	 * フィールドの説明：検索条件 ジャンル名
	 * @author kamagata
	 * @since 2018/01/10
	 */
	private String searchGenreNm;
}
