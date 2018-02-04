package com.example.demo.web.form.maintenance;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.domain.entity.maintenance.GoodsEntity;
import com.example.demo.domain.validator.Unique;
import com.example.demo.web.form.common.CommonForm;

import lombok.Getter;
import lombok.Setter;

/**
 * クラスの説明：商品マスタフォーム
 * @author kamagata
 * @since 2018/01/17
 */
@MappedSuperclass
@Setter
@Getter
public class GoodsForm extends CommonForm {

	/**
	 * フィールドの説明：商品コード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Unique(entity = GoodsEntity.class, property = "goodsCd", groups = Insert.class)
	@Size(min = 10, max = 10)
	private String goodsCd;

	/**
	 * フィールドの説明：商品名(メイン)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	@Size(max = 100)
	private String goodsNm;

	/**
	 * フィールドの説明：商品名(サブ)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@Size(max = 100)
	private String subGoodsNm;

	/**
	 * フィールドの説明：大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	private String genreLgCd;

	/**
	 * フィールドの説明：大ジャンル名称
	 * @author kamagata
	 * @since 2018/01/19
	 */
	private String genreLgNm;

	/**
	 * フィールドの説明：中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	private String genreMdCd;

	/**
	 * フィールドの説明：中ジャンル名称
	 * @author kamagata
	 * @since 2018/01/19
	 */
	private String genreMdNm;

	/**
	 * フィールドの説明：小ジャンルコード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	private String genreSmCd;

	/**
	 * フィールドの説明：小ジャンル名称
	 * @author kamagata
	 * @since 2018/01/19
	 */
	private String genreSmNm;

	/**
	 * フィールドの説明：発売日
	 * @author kamagata
	 * @since 2018/01/18
	 */
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate releaseDt;

	/**
	 * フィールドの説明：商品概要
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	@Size(max = 500)
	private String overview;

	/**
	 * フィールドの説明：表示用商品概要
	 * @author kamagata
	 * @since 2018/01/18
	 */
	private String displayOverview;

	/**
	 * フィールドの説明：商品詳細
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	@Size(max = 2000)
	private String detail;

	/**
	 * フィールドの説明：表示用商品詳細
	 * @author kamagata
	 * @since 2018/01/18
	 */
	private String displayDetail;

	/**
	 * フィールドの説明：メーカー
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	@Size(max = 100)
	private String maker;

	/**
	 * フィールドの説明：商品サイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	@NotEmpty
	private String goodsSize;

	/**
	 * フィールドの説明：検索条件 商品コード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchGoodsCd;

	/**
	 * フィールドの説明：検索条件 商品名(メイン)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchGoodsNm;

	/**
	 * フィールドの説明：検索条件 商品名(サブ)
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchSubGoodsNm;

	/**
	 * フィールドの説明：検索条件 大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchGenreLgCd;

	/**
	 * フィールドの説明：検索条件 中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchGenreMdCd;

	/**
	 * フィールドの説明：検索条件 小ジャンルコード
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchGenreSmCd;

	/**
	 * フィールドの説明：検索条件 商品概要
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchOverview;

	/**
	 * フィールドの説明：検索条件 商品詳細
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchDetail;

	/**
	 * フィールドの説明：検索条件 メーカー
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchMaker;

	/**
	 * フィールドの説明：検索条件 サイズ
	 * @author kamagata
	 * @since 2018/01/17
	 */
	private String searchGoodsSize;

}
