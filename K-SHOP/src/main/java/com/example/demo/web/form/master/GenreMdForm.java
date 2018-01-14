package com.example.demo.web.form.master;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.domain.entity.master.GenreMdEntity;
import com.example.demo.domain.validator.Unique;

import lombok.Data;

/**
 * クラスの説明：中ジャンルマスタフォーム
 * @author kamagata
 * @since 2018/01/14
 */
@Data
public class GenreMdForm {

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
	 * フィールドの説明：中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@NotNull
	@Size(min = 4, max = 4)
	@Unique(entity = GenreMdEntity.class, property = "genreMdCd", groups = Insert.class)
	private String genreMdCd;

	/**
	 * フィールドの説明：中ジャンル名称
	 * @author kamagata
	 * @since 2018/01/14
	 */
	@NotNull
	@Size(min = 1, max = 50)
	private String genreMdNm;

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
	@NotNull
	@NotEmpty
	private String genreLgCd;

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
	 * フィールドの説明：更新モード(新規or更新)
	 * @author kamagata
	 * @since 2018/01/14
	 */
	private String crud;
}
