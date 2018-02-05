package com.example.demo.web.controller.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.shop.CartDetailEntity;
import com.example.demo.service.shop.CartService;
import com.example.demo.web.CartSession;

/**
 * クラスの説明：ショップ　カート画面コントローラー
 * @author kamagata
 * @since 2018/01/28
 */
@Controller
@RequestMapping("shop/cart")
public class CartController {

	@Autowired
	CartService cartService;

	@Autowired
	CartSession cartSession;

	@GetMapping(path = "/")
	ModelAndView list(ModelAndView modelAndView) {

		// カート情報取得
		List<CartDetailEntity> cartDetailEntities = cartService.findCartDetail(cartSession.getCartHeadCd());

		// 遷移先画面
		modelAndView.addObject("cartDetailList", cartDetailEntities);
		modelAndView.setViewName("shop/cart");

		return modelAndView;
	}

	@GetMapping(path = "/delete/{cartDetailCd}")
	ModelAndView deleteCartDetail(ModelAndView modelAndView, @PathVariable Integer cartDetailCd) {

		// 選択したカート詳細を削除
		cartService.delete(cartDetailCd);

		// カート情報取得
		List<CartDetailEntity> cartDetailEntities = cartService.findCartDetail(cartSession.getCartHeadCd());

		// 遷移先画面
		modelAndView.addObject("cartDetailList", cartDetailEntities);
		modelAndView.setViewName("shop/cart");

		return modelAndView;

	}

}
