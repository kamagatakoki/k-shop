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
import com.example.demo.service.maintenance.GoodsImageService;
import com.example.demo.service.maintenance.GoodsService;

/**
 * クラスの説明：ショップ　商品詳細画面コントローラー
 * @author kamagata
 * @since 2018/01/23
 */
@Controller
@RequestMapping("/shop/goodsdetail")
public class GoodsDetailController {

	@Autowired
	GenreLgService genreLgService;

	@Autowired
	GoodsService goodsService;

	@Autowired
	GoodsImageService goodsImageService;

	private List<GenreLgEntity> genreLgEntities;

	@GetMapping(path = "/{goodsCd}")
	ModelAndView list(ModelAndView modelAndView, @PathVariable String goodsCd) {

		// ヘッダー情報取得
		genreLgEntities = genreLgService.findAll(new Sort("displayOrder"));

		// 商品情報取得
		GoodsEntity goodsEntity = goodsService.findOne(goodsCd);

		// 遷移先画面
		modelAndView.addObject("genreLgItemList", genreLgEntities);
		modelAndView.addObject("mainDisplayImage", goodsEntity.getGoodsImageEntities().get(0));
		modelAndView.addObject("subDisplayImage", goodsEntity.getGoodsImageEntities());
		modelAndView.addObject("goods", goodsEntity);
		modelAndView.setViewName("shop/goods_detail");

		// 検索処理
		return modelAndView;
	}

}
