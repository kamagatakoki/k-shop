package com.example.demo.web.controller.shop;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.maintenance.GoodsEntity;
import com.example.demo.domain.entity.shop.CartDetailEntity;
import com.example.demo.domain.entity.shop.CartHeadEntity;
import com.example.demo.service.common.LoginUserDetails;
import com.example.demo.service.maintenance.GoodsService;
import com.example.demo.service.shop.CartService;
import com.example.demo.web.CartSession;
import com.example.demo.web.form.shop.GoodsDetailForm;

/**
 * クラスの説明：ショップ　商品詳細画面コントローラー
 * @author kamagata
 * @since 2018/01/23
 */
@Controller
@RequestMapping("/shop/goodsdetail")
public class GoodsDetailController {

	@Autowired
	GoodsService goodsService;

	@Autowired
	CartService cartService;

	@Autowired
	CartSession cartSession;

	@ModelAttribute
	GoodsDetailForm setUpForm() {
		return new GoodsDetailForm();
	}

	@GetMapping(path = "/{goodsCd}")
	ModelAndView list(GoodsDetailForm goodsDetailForm, ModelAndView modelAndView, @PathVariable String goodsCd) {

		// 商品情報取得
		GoodsEntity goodsEntity = goodsService.findOne(goodsCd);

		// エンティティの内容をフォームにコピー
		BeanUtils.copyProperties(goodsEntity, goodsDetailForm);

		// 遷移先画面
		modelAndView.addObject("goodsDetailForm", goodsDetailForm); // 商品詳細フォーム
		modelAndView.setViewName("shop/goods_detail");

		// 検索処理
		return modelAndView;
	}

	@PostMapping(path = "/addcart")
	ModelAndView addCart(
			@Validated GoodsDetailForm goodsDetailForm,
			BindingResult bindingResult,
			ModelAndView modelAndView, HttpSession httpSession,
			@CookieValue(name = "JSESSIONID", required = false) String sessionId,
			@AuthenticationPrincipal LoginUserDetails loginUserDetails) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {
			modelAndView.addObject("goodsDetailForm", goodsDetailForm); // 商品詳細フォーム
			modelAndView.setViewName("shop/goods_detail"); // 遷移先URLセット
			return modelAndView;
		}

		// カートヘッダ登録・更新
		CartHeadEntity cartHeadEntity = new CartHeadEntity();
		cartHeadEntity.setSessionId(sessionId);
		cartHeadEntity.setCartHeadCd(cartSession.getCartHeadCd());
		cartHeadEntity
				.setUserInfoEntity(loginUserDetails == null ? null : loginUserDetails.getUserInfoEntity());
		cartSession.setCartHeadCd(cartService.updateCartHead(cartHeadEntity).getCartHeadCd());

		// カート詳細登録
		GoodsEntity goodsEntity = goodsService.findOne(goodsDetailForm.getGoodsCd()); // 商品詳細取得
		CartDetailEntity cartDetailEntity = new CartDetailEntity();
		BeanUtils.copyProperties(goodsDetailForm, cartDetailEntity); // フォームの内容をエンティティにコピー
		cartDetailEntity.setCartHeadEntity(cartHeadEntity);
		cartDetailEntity.setGoodsEntity(goodsEntity);
		cartService.updateCartDetail(cartDetailEntity);

		// 遷移先画面
		modelAndView.setViewName("redirect:/");

		// 検索処理
		return modelAndView;
	}

}
