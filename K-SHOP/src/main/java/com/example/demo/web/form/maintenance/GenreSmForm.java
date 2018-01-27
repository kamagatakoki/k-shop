package com.example.demo.web.form.maintenance;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.domain.entity.maintenance.GenreSmEntity;
import com.example.demo.domain.validator.Unique;
import com.example.demo.web.form.common.CommonForm;

import lombok.Getter;
import lombok.Setter;

/**
 * クラスの説明：小ジャンルマスタフォーム
 * @author kamagata
 * @since 2018/01/14
 */
@Setter
@Getter
public class GenreSmForm extends CommonForm {

	/**
	 * フィールドの説明：小ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@NotNull
	@Size(min = 6, max = 6)
	@Unique(entity = GenreSmEntity.class, property = "genreSmCd", groups = Insert.class)
	private String genreSmCd;

	/**
	 * フィールドの説明：小ジャンル名称
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@NotNull
	@Size(min = 1, max = 50)
	private String genreSmNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@NotNull
	@Min(1)
	@Max(99)
	private Integer displayOrder;

	/**
	 * フィールドの説明：大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@NotEmpty
	private String genreLgCd;

	/**
	 * フィールドの説明：中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@NotEmpty
	private String genreMdCd;

	/**
	 * フィールドの説明：検索条件 大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String searchGenreLgCd;

	/**
	 * フィールドの説明：検索条件 中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String searchGenreMdCd;

	/**
	 * フィールドの説明：検索条件 小ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String searchGenreSmCd;

	/**
	 * フィールドの説明：検索条件 大ジャンル名称
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String searchGenreLgNm;

	/**
	 * フィールドの説明：検索条件 中ジャンル名称
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String searchGenreMdNm;

	/**
	 * フィールドの説明：検索条件 小ジャンル名称
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String searchGenreSmNm;

	/**
	 * フィールドの説明：更新モード(新規or更新)
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String crud;
}
