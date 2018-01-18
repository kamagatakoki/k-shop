package com.example.demo.web.controller.master;

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

import com.example.demo.domain.entity.master.GenreLgEntity;
import com.example.demo.domain.entity.master.GenreMdEntity;
import com.example.demo.domain.entity.master.GenreSmEntity;
import com.example.demo.domain.entity.master.GoodsEntity;
import com.example.demo.service.master.GoodsService;
import com.example.demo.web.form.master.GoodsForm;

/**
 * クラスの説明：商品マスタコントローラー
 * @author kamagata
 * @since 2018/01/14
 */
@Controller
@RequestMapping("/maintenance/goods")
public class GoodsListController {

	@Autowired
	GoodsService goodsService;

	@ModelAttribute
	GoodsForm setUpForm() {
		return new GoodsForm();
	}

	/**
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @since 2018/01/16
	 * @param modelAndView モデル
	 * @param goodsForm 商品フォーム
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	ModelAndView list(ModelAndView modelAndView, GoodsForm goodsForm) {

		// 全件検索
		return search(modelAndView, goodsForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/16
	 * @param modelAndView モデル
	 * @param goodsForm 商品フォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	ModelAndView search(ModelAndView modelAndView, GoodsForm goodsForm) {

		// 検索実行
		List<GoodsEntity> goodsEntities = goodsService.findAllCustom(
				goodsForm,
				new Sort("goodsCd"));

		// 遷移先画面・検索条件セット
		modelAndView.setViewName("master/goods_list");
		modelAndView.addObject("goodsForm", goodsForm);

		// 検索結果、件数
		modelAndView.addObject("items", goodsEntities);
		modelAndView.addObject("itemsSize", goodsEntities.size());

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param goodsForm 商品フォーム
	 * @param modelAndView モデル
	 * @since 2018/01/16
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	ModelAndView openNew(GoodsForm goodsForm, ModelAndView modelAndView) {

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = goodsService.findGenreLgList();
		goodsForm.setGenreLgCd(goodsForm.getGenreLgCd());

		// 中ジャンルプルダウン要素取得
		List<GenreMdEntity> genreMdEntities = goodsService.findGenreMdList(goodsForm.getGenreLgCd());
		goodsForm.setGenreMdCd(goodsForm.getGenreMdCd());

		// 小ジャンルプルダウン要素取得
		List<GenreSmEntity> genreSmEntities = goodsService.findGenreSmList(goodsForm.getGenreMdCd());
		goodsForm.setGenreMdCd(goodsForm.getGenreMdCd());

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.addObject("genreMdList", genreMdEntities); // 中ジャンルプルダウン要素
		modelAndView.addObject("genreSmList", genreSmEntities); // 小ジャンルプルダウン要素
		modelAndView.setViewName("master/goods_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：編集ボタン処理
	 * @author kamagata
	 * @param goodsForm 商品フォーム
	 * @param modelAndView モデル
	 * @since 2018/01/16
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	ModelAndView openEdit(GoodsForm goodsForm, ModelAndView modelAndView) {

		// 検索処理
		GoodsEntity goodsEntity = goodsService.findOne(goodsForm.getGoodsCd());

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = goodsService.findGenreLgList();
		goodsForm.setGenreLgCd(goodsEntity.getGenreLgEntity().getGenreLgCd());

		// 中ジャンルプルダウン要素取得
		List<GenreMdEntity> genreMdEntities = goodsService.findGenreMdList(goodsEntity.getGenreLgEntity().getGenreLgCd());
		goodsForm.setGenreMdCd(goodsEntity.getGenreMdEntity().getGenreMdCd());

		// 小ジャンルプルダウン要素取得
		List<GenreSmEntity> genreSmEntities = goodsService.findGenreSmList(goodsEntity.getGenreMdEntity().getGenreMdCd());
		goodsForm.setGenreMdCd(goodsEntity.getGenreSmEntity().getGenreSmCd());

		// エンティティの内容をフォームにコピー
		BeanUtils.copyProperties(goodsEntity, goodsForm);
		goodsForm.setGenreLgCd(goodsEntity.getGenreLgEntity().getGenreLgCd());
		goodsForm.setGenreMdCd(goodsEntity.getGenreMdEntity().getGenreMdCd());
		goodsForm.setGenreSmCd(goodsEntity.getGenreSmEntity().getGenreSmCd());

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.addObject("genreMdList", genreMdEntities); // 中ジャンルプルダウン要素
		modelAndView.addObject("genreSmList", genreSmEntities); // 小ジャンルプルダウン要素
		modelAndView.addObject("goodsForm", goodsForm); // 商品フォーム
		modelAndView.setViewName("master/goods_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @param goodsCd 商品コード
	 * @since 2018/01/16
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam String goodsCd) {

		// 削除処理
		goodsService.delete(goodsCd);

		// 一覧画面へ
		return "redirect:/maintenance/goods/list";

	}
}
