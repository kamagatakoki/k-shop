package com.example.demo.web.controller.maintenance;

import javax.validation.groups.Default;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.entity.maintenance.GoodsEntity;
import com.example.demo.service.maintenance.GoodsService;
import com.example.demo.web.form.common.CommonForm.Insert;
import com.example.demo.web.form.common.CommonForm.Update;
import com.example.demo.web.form.maintenance.GoodsForm;

/**
 * クラスの説明：商品マスタ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/18
 */
@Controller
@RequestMapping("/maintenance/goods")
public class GoodsNewEditController {
	@Autowired
	GoodsService goodsService;

	@Autowired
	GoodsEntity goodsEntity;

	@ModelAttribute
	GoodsForm setUpForm() {
		return new GoodsForm();
	}

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
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

			// 遷移先モデルビューをセット
			modelAndView = goodsService.setModelAndView(modelAndView, goodsForm, "maintenance/goods_newedit");

			return modelAndView;
		}

		// エンティティにフォームの内容をコピー
		BeanUtils.copyProperties(goodsForm, goodsEntity);
		BeanUtils.copyProperties(goodsForm, goodsEntity.getGenreLgEntity());
		BeanUtils.copyProperties(goodsForm, goodsEntity.getGenreMdEntity());
		BeanUtils.copyProperties(goodsForm, goodsEntity.getGenreSmEntity());

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
	ModelAndView update(@Validated({ Update.class, Default.class }) GoodsForm goodsForm,
			BindingResult bindingResult, ModelAndView modelAndView) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

			// 遷移先モデルビューをセット
			modelAndView = goodsService.setModelAndView(modelAndView, goodsForm, "maintenance/goods_newedit");

			return modelAndView;

		}

		// エンティティにフォームの内容をコピー
		BeanUtils.copyProperties(goodsForm, goodsEntity);
		BeanUtils.copyProperties(goodsForm, goodsEntity.getGenreLgEntity());
		BeanUtils.copyProperties(goodsForm, goodsEntity.getGenreMdEntity());
		BeanUtils.copyProperties(goodsForm, goodsEntity.getGenreSmEntity());

		// 更新処理実行
		goodsService.update(goodsEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/goods/list"); // 遷移先URLセット

		return modelAndView;
	}

}
