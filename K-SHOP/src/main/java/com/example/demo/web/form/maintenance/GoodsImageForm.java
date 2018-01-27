package com.example.demo.web.form.maintenance;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.web.form.common.CommonForm;

import lombok.Getter;
import lombok.Setter;

/**
 * クラスの説明：商品画像マスタフォーム
 * @author kamagata
 * @since 2018/01/16
 */
@Setter
@Getter
public class GoodsImageForm extends CommonForm implements Serializable {

	/**
	 * フィールドの説明：商品画像コード
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private Integer goodsImageCd;

	/**
	 * フィールドの説明：商品コード
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@NotNull
	@Size(min = 10, max = 10)
	private String goodsCd;

	/**
	 * フィールドの説明：入力ファイルパス
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@NotEmpty(groups = Insert.class)
	private String inputFilePath;

	/**
	 * フィールドの説明：ファイル名
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private String fileNm;

	/**
	 * フィールドの説明：画像
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private byte[] image;

	/**
	 * フィールドの説明：説明
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@Size(max = 100)
	private String description;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/16
	 */
	@NotNull
	@Min(1)
	@Max(99)
	private Integer displayOrder;

	/**
	 * フィールドの説明：検索条件 商品画像コード
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private String searchGoodsImageCd;

	/**
	 * フィールドの説明：検索条件 商品コード
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private String searchGoodsCd;

	/**
	 * フィールドの説明：検索条件 ファイル名
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private String searchFileNm;

	/**
	 * フィールドの説明：検索条件 説明
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private String searchDescription;

	/**
	 * フィールドの説明：更新モード(新規or更新)
	 * @author kamagata
	 * @since 2018/01/16
	 */
	private String crud;
}
