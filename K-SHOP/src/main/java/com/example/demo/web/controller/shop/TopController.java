package com.example.demo.web.controller.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.entity.maintenance.GoodsEntity;
import com.example.demo.service.maintenance.GenreLgService;
import com.example.demo.service.maintenance.GoodsService;

/**
 * クラスの説明：ショップ　トップ画面コントローラー(
 * @author kamagata
 * @since 2018/01/23
 */
@Controller
@RequestMapping("/")
public class TopController {

	@Autowired
	GenreLgService genreLgService;

	@Autowired
	GoodsService goodsService;

	private List<GenreLgEntity> genreLgEntities;

	/**
	 * メソッドの説明：トップ画面表示
	 * @author kamagata
	 * @since 2018/01/27
	 * @param modelAndView モデルビュー
	 * @return ModelAndView モデルビュー
	 */
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

	/**
	 * メソッドの説明：小ジャンル検索
	 * @author kamagata
	 * @since 2018/01/27
	 * @param modelAndView モデル
	 * @param genreSmCd 小ジャンルコード
	 * @return ModelAndView モデルビュー
	 */
	@GetMapping(path = "/{genreSmCd}")
	ModelAndView searchGenreSmCd(ModelAndView modelAndView, @PathVariable String genreSmCd) {

		// 商品情報取得
		List<GoodsEntity> goodsEntities = goodsService.findByGenreSmCd(genreSmCd);

		// 遷移先画面
		genreLgEntities = genreLgService.findAll(new Sort("displayOrder"));
		modelAndView.addObject("genreLgItemList", genreLgEntities);
		modelAndView.addObject("items", goodsEntities);
		modelAndView.setViewName("shop/top");

		// 検索処理
		return modelAndView;
	}

}
