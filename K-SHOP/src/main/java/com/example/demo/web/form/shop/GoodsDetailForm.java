package com.example.demo.web.form.shop;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.domain.entity.maintenance.GoodsImageEntity;
import com.example.demo.web.form.common.CommonForm;

import lombok.Getter;
import lombok.Setter;

/**
 * クラスの説明：商品詳細フォーム
 * @author kamagata
 * @since 2018/01/30
 */
@Setter
@Getter
public class GoodsDetailForm extends CommonForm {

	/**
	 * フィールドの説明：商品コード
	 * @author kamagata
	 * @since 2018/01/30
	 */
	@NotEmpty
	private String goodsCd;

	/**
	 * フィールドの説明：商品名
	 * @author kamagata
	 * @since 2018/02/03
	 */
	private String goodsNm;

	/**
	 * フィールドの説明：商品詳細
	 * @author kamagata
	 * @since 2018/02/03
	 */
	private String detail;

	/**
	 * フィールドの説明：数量
	 * @author kamagata
	 * @since 2018/01/30
	 */
	@NotNull
	@Min(1)
	@Max(99)
	private Integer quantity;

	/**
	 * フィールドの説明：商品画像リスト
	 * @author kamagata
	 * @since 2018/02/03
	 */
	private List<GoodsImageEntity> goodsImageEntities;

}
