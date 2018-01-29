package com.example.demo.web.controller.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.service.maintenance.GenreLgService;

/**
 * クラスの説明：ショップ　カート画面コントローラー
 * @author kamagata
 * @since 2018/01/28
 */
@Controller
@RequestMapping("/shop/cart")
public class CartController {

	@Autowired
	GenreLgService genreLgService;

	private List<GenreLgEntity> genreLgEntities;

	@GetMapping(path = "/")
	ModelAndView list(ModelAndView modelAndView) {

		// ヘッダー情報取得
		genreLgEntities = genreLgService.findAll(new Sort("displayOrder"));
		// 遷移先画面
		modelAndView.addObject("genreLgItemList", genreLgEntities);
		modelAndView.setViewName("shop/cart");

		// 検索処理
		return modelAndView;
	}

}
