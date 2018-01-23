package com.example.demo.web.controller.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.master.GenreLgEntity;
import com.example.demo.domain.entity.master.GoodsEntity;
import com.example.demo.service.master.GenreLgService;
import com.example.demo.service.master.GoodsService;

/**
 * クラスの説明：ショップ　トップ画面コントローラー
 * @author kamagata
 * @since 2018/01/23
 */
@Controller
@RequestMapping("/")
public class ShopTopController {

	@Autowired
	GenreLgService genreLgService;

	@Autowired
	GoodsService goodsService;

	private List<GenreLgEntity> genreLgEntities;

	/**
	 * コンストラクタの説明：
	 * @author kamagata
	 * @since 2018/01/23
	 */
	public ShopTopController() {
	}

	@GetMapping(path = "/")
	ModelAndView list(ModelAndView modelAndView) {

		// 商品情報取得
		List<GoodsEntity> goodsEntities = goodsService.findAll(new Sort("goodsCd"));

		// 遷移先画面
		genreLgEntities = genreLgService.findAll(new Sort("displayOrder"));
		modelAndView.addObject("genreLgItemList", genreLgEntities);
		modelAndView.addObject("items", goodsEntities);
		modelAndView.setViewName("shop/top");

		// 検索処理
		return modelAndView;
	}

}
