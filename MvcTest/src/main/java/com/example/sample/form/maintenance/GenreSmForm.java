package com.example.sample.form.maintenance;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.sample.form.common.CommonForm;

import lombok.Getter;
import lombok.Setter;

/**
 * クラスの説明：小ジャンルマスタフォーム
 * @author kamagata
 * @since 2018/02/15
 */
@Setter
@Getter
public class GenreSmForm extends CommonForm {

	/**
	 * フィールドの説明：小ジャンルコード
	 * @author kamagata
	 * @since 2018/02/15
	 */
	@NotNull
	@Size(min = 6, max = 6)
	private String genreSmCd;

	/**
	 * フィールドの説明：小ジャンル名称
	 * @author kamagata
	 * @since 2018/02/15
	 */
	@NotNull
	@Size(min = 1, max = 50)
	private String genreSmNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/02/15
	 */
	@NotNull
	@Min(1)
	@Max(99)
	private Integer displayOrder;

	/**
	 * フィールドの説明：大ジャンルコード
	 * @author kamagata
	 * @since 2018/02/15
	 */
	@NotNull
	private String genreLgCd;

	/**
	 * フィールドの説明：中ジャンルコード
	 * @author kamagata
	 * @since 2018/02/15
	 */
	@NotNull
	@Size(min = 4, max = 4)
	private String genreMdCd;

	/**
	 * フィールドの説明：検索条件 大ジャンルコード
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private String searchGenreLgCd;

	/**
	 * フィールドの説明：検索条件 中ジャンルコード
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private String searchGenreMdCd;

	/**
	 * フィールドの説明：検索条件 小ジャンルコード
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private String searchGenreSmCd;

	/**
	 * フィールドの説明：検索条件 大ジャンル名称
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private String searchGenreLgNm;

	/**
	 * フィールドの説明：検索条件 中ジャンル名称
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private String searchGenreMdNm;

	/**
	 * フィールドの説明：検索条件 小ジャンル名称
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private String searchGenreSmNm;

	/**
	 * フィールドの説明：更新モード(新規or更新)
	 * @author kamagata
	 * @since 2018/02/15
	 */
	private String crud;
}
