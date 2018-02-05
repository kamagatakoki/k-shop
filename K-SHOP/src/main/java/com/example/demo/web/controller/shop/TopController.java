package com.example.demo.web.controller.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.maintenance.GoodsEntity;
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
	GoodsService goodsService;

	@Autowired
	List<GoodsEntity> goodsEntities;

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
	 * @param genreCd ジャンルコード(大、中、小いずれか)
	 * @return ModelAndView モデルビュー
	 */
	@GetMapping(path = "/shop/{genreCd}")
	ModelAndView searchGenreSmCd(ModelAndView modelAndView, @PathVariable String genreCd) {

		// 商品情報取得 パラメータの桁数でどのジャンルで検索するか判断する
		goodsEntities = goodsService.findBySomeGenreCd(genreCd);

		// 遷移先画面
		modelAndView.addObject("items", goodsEntities);
		modelAndView.setViewName("shop/top");

		// 検索処理
		return modelAndView;
	}

}
