package com.example.demo.web.controller.maintenance;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.maintenance.GoodsImageEntity;
import com.example.demo.service.maintenance.GoodsImageService;
import com.example.demo.web.form.maintenance.GoodsImageForm;

/**
 * クラスの説明：商品画像マスタコントローラー
 * @author kamagata
 * @since 2018/01/14
 */
@Controller
@RequestMapping("/maintenance/goodsimage")
public class GoodsImageListController {

	@Autowired
	GoodsImageService goodsImageService;

	@ModelAttribute
	GoodsImageForm setUpForm() {
		return new GoodsImageForm();
	}

	/**
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @param goodsCd 商品コード
	 * @since 2018/01/16
	 * @param modelAndView モデル
	 * @param goodsImageForm 商品画像フォーム
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	ModelAndView list(@RequestParam(name = "goodsCd", required = false) String goodsCd, ModelAndView modelAndView,
			GoodsImageForm goodsImageForm) {

		// 検索
		goodsImageForm.setSearchGoodsCd(goodsCd);
		return search(modelAndView, goodsImageForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/16
	 * @param modelAndView モデル
	 * @param goodsImageForm 商品画像フォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	ModelAndView search(ModelAndView modelAndView, GoodsImageForm goodsImageForm) {

		// 検索実行
		List<GoodsImageEntity> goodsImageEntities = goodsImageService.findAllCustom(
				goodsImageForm,
				new Sort("goodsEntity.goodsCd", "displayOrder"));

		// 遷移先画面・検索条件セット
		modelAndView.setViewName("maintenance/goodsimage_list");
		modelAndView.addObject("goodsImageForm", goodsImageForm);

		// 検索結果、件数
		modelAndView.addObject("items", goodsImageEntities);
		modelAndView.addObject("itemsSize", goodsImageEntities.size());

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param goodsImageForm 商品画像フォーム
	 * @param modelAndView モデル
	 * @since 2018/01/16
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	ModelAndView openNew(GoodsImageForm goodsImageForm, ModelAndView modelAndView) {

		// モデルセット
		modelAndView.setViewName("maintenance/goodsimage_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：編集ボタン処理
	 * @author kamagata
	 * @param goodsImageForm 商品画像フォーム
	 * @param modelAndView モデル
	 * @since 2018/01/16
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	ModelAndView openEdit(GoodsImageForm goodsImageForm, ModelAndView modelAndView) {

		// 検索処理
		GoodsImageEntity goodsImageEntity = goodsImageService.findOne(goodsImageForm.getGoodsImageCd());

		// エンティティの内容をフォームにコピー
		BeanUtils.copyProperties(goodsImageEntity, goodsImageForm);
		BeanUtils.copyProperties(goodsImageEntity.getGoodsEntity(), goodsImageForm);

		// モデルセット
		modelAndView.addObject("goodsImageForm", goodsImageForm); // 商品画像フォーム
		modelAndView.setViewName("maintenance/goodsimage_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @param goodsImageCd 商品画像コード
	 * @since 2018/01/16
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam Integer goodsImageCd) {

		// 削除処理
		goodsImageService.delete(goodsImageCd);

		// 一覧画面へ
		return "redirect:/maintenance/goodsimage/list";

	}
}
