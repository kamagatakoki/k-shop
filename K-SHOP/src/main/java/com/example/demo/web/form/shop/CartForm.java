package com.example.demo.web.form.shop;

import java.util.List;

import com.example.demo.domain.entity.shop.CartDetailEntity;
import com.example.demo.web.form.common.CommonForm;

import lombok.Getter;
import lombok.Setter;

/**
 * クラスの説明：カートフォーム
 * @author kamagata
 * @since 2018/02/04
 */
@Setter
@Getter
public class CartForm extends CommonForm {

	/**
	 * フィールドの説明：カート詳細エンティティのリスト
	 * @author kamagata
	 * @since 2018/02/04
	 */
	private List<CartDetailEntity> cartDetailEntities;

}
