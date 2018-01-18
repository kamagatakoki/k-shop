package com.example.demo.web.controller.master;

import java.util.List;

import javax.validation.groups.Default;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.entity.master.GenreLgEntity;
import com.example.demo.domain.entity.master.GenreMdEntity;
import com.example.demo.domain.entity.master.GenreSmEntity;
import com.example.demo.domain.entity.master.GoodsEntity;
import com.example.demo.service.master.GoodsService;
import com.example.demo.web.form.CommonForm.Insert;
import com.example.demo.web.form.CommonForm.Update;
import com.example.demo.web.form.master.GoodsForm;

/**
 * クラスの説明：商品マスタ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/18
 */
@Controller
@RequestMapping("/maintenance/goods")
public class GoodsNewEditControlle {
	@Autowired
	GoodsService goodsService;

	@ModelAttribute
	GoodsForm setUpForm() {
		return new GoodsForm();
	}

	/**
	 * メソッドの説明：戻るボタン処理
	 * @author kamagata
	 * @param redirectAttributes リダイクレト先へのパラメータ
	 * @param goodsForm 商品フォーム
	 * @since 2018/01/18
	 * @return モデル
	 */
	@PostMapping(path = "newedit", params = "goToBack")
	String goToTop(RedirectAttributes redirectAttributes, GoodsForm goodsForm) {
		redirectAttributes.addFlashAttribute("goodsForm", goodsForm);

		return "redirect:/maintenance/goods/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Insert)
	 * @author kamagata
	 * @param goodsForm 商品フォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @since 2018/01/18
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=insert" })
	ModelAndView regsit(@Validated({ Insert.class, Default.class }) GoodsForm goodsForm, BindingResult bindingResult,
			ModelAndView modelAndView) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

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
			modelAndView.addObject("goodsForm", goodsForm); // 商品フォーム
			modelAndView.setViewName("master/goods_newedit"); // 遷移先URLセット

			return modelAndView;
		}

		// エンティティにフォームの内容をコピー
		GoodsEntity goodsEntity = new GoodsEntity();
		goodsEntity.setGenreLgEntity(new GenreLgEntity());
		goodsEntity.setGenreMdEntity(new GenreMdEntity());
		goodsEntity.setGenreSmEntity(new GenreSmEntity());
		BeanUtils.copyProperties(goodsForm, goodsEntity);
		goodsEntity.getGenreLgEntity().setGenreLgCd(goodsForm.getGenreLgCd());
		goodsEntity.getGenreMdEntity().setGenreMdCd(goodsForm.getGenreMdCd());
		goodsEntity.getGenreSmEntity().setGenreSmCd(goodsForm.getGenreSmCd());

		// 更新処理実行
		goodsService.update(goodsEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/goods/list"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：登録ボタン処理(Update)
	 * @author kamagata
	 * @param goodsForm 商品フォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @since 2018/01/18
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=update" })
	ModelAndView update(@Validated({ Update.class, Default.class }) @ModelAttribute GoodsForm goodsForm,
			BindingResult bindingResult, ModelAndView modelAndView) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

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
			modelAndView.addObject("goodsForm", goodsForm); // 商品フォーム
			modelAndView.setViewName("master/goods_newedit"); // 遷移先URLセット

			return modelAndView;

		}

		// エンティティにフォームの内容をコピー
		GoodsEntity goodsEntity = new GoodsEntity();
		goodsEntity.setGenreLgEntity(new GenreLgEntity());
		goodsEntity.setGenreMdEntity(new GenreMdEntity());
		goodsEntity.setGenreSmEntity(new GenreSmEntity());
		BeanUtils.copyProperties(goodsForm, goodsEntity);
		goodsEntity.getGenreLgEntity().setGenreLgCd(goodsForm.getGenreLgCd());
		goodsEntity.getGenreMdEntity().setGenreMdCd(goodsForm.getGenreMdCd());
		goodsEntity.getGenreSmEntity().setGenreSmCd(goodsForm.getGenreSmCd());

		// 更新処理実行
		goodsService.update(goodsEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/goods/list"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param modelAndView モデル
	 * @param goodsForm 商品マスタフォーム
	 * @return 遷移先モデル(一覧)
	 */
	@PostMapping(path = "newedit", params = "dummy")
	ModelAndView list(ModelAndView modelAndView, GoodsForm goodsForm) {

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = goodsService.findGenreLgList();

		// 中ジャンルプルダウン要素取得
		List<GenreMdEntity> genreMdEntities = goodsService.findGenreMdList(goodsForm.getGenreLgCd());

		// 小ジャンルプルダウン要素取得
		List<GenreSmEntity> genreSmEntities = goodsService.findGenreSmList(goodsForm.getGenreMdCd());

		// 大ジャンルプルダウンが変更された場合はコードをクリアする
		if (!goodsService.existsByGenreLgCdAndGenreMdCd(goodsForm.getGenreLgCd(), goodsForm.getGenreMdCd())) {
			goodsForm.setGenreMdCd(null);
			goodsForm.setGenreSmCd(null);
		}

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.addObject("genreMdList", genreMdEntities); // 中ジャンルプルダウン要素
		modelAndView.addObject("genreSmList", genreSmEntities); // 小ジャンルプルダウン要素
		modelAndView.addObject("goodsForm", goodsForm); // 商品フォーム
		modelAndView.setViewName("master/goods_newedit"); // 遷移先URLセット

		return modelAndView;
	}
}
