package com.example.demo.web.form.maintenance;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.validator.Unique;
import com.example.demo.web.form.common.CommonForm;

import lombok.Getter;
import lombok.Setter;

/**
 * コンストラクタの説明：大ジャンルフォームクラス
 * @author kamagata
 * @since 2018/01/07
 */
@Setter
@Getter
public class GenreLgForm extends CommonForm {

	/**
	 * フィールドの説明：大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@NotNull
	@Size(min = 2, max = 2)
	@Unique(entity = GenreLgEntity.class, property = "genreLgCd")
	private String genreLgCd;

	/**
	 * フィールドの説明：大ジャンル名
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@NotNull
	@Size(min = 1, max = 50)
	private String genreLgNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/08
	 */
	@NotNull
	@Min(1)
	@Max(99)
	private Integer displayOrder;

	/**
	 * フィールドの説明：検索条件 大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/10
	 */
	private String searchGenreLgCd;

	/**
	 * フィールドの説明：検索条件 大ジャンル名
	 * @author kamagata
	 * @since 2018/01/10
	 */
	private String searchGenreLgNm;

	/**
	 * フィールドの説明：更新モード(新規or更新)
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String crud;
}
