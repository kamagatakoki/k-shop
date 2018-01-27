package com.example.demo.web.controller.maintenance;

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

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.entity.maintenance.GenreMdEntity;
import com.example.demo.service.maintenance.GenreMdService;
import com.example.demo.web.form.common.CommonForm.Insert;
import com.example.demo.web.form.common.CommonForm.Update;
import com.example.demo.web.form.maintenance.GenreMdForm;

/**
 * クラスの説明：中ジャンルメンテ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/06
 */
@Controller
@RequestMapping("/maintenance/genremd")
public class GenreMdNewEditController {
	@Autowired
	GenreMdService genreMdService;

	@Autowired
	GenreMdEntity genreMdEntity;

	@ModelAttribute
	GenreMdForm setUpForm() {
		return new GenreMdForm();
	}

	/**
	 * メソッドの説明：戻るボタン処理
	 * @author kamagata
	 * @param redirectAttributes リダイクレト先へのパラメータ
	 * @param genreMdForm 中ジャンルフォーム
	 * @since 2018/01/08
	 * @return モデル
	 */
	@PostMapping(path = "newedit", params = "goToBack")
	String goToTop(RedirectAttributes redirectAttributes, GenreMdForm genreMdForm) {
		redirectAttributes.addFlashAttribute("genreMdForm", genreMdForm);

		return "redirect:/maintenance/genremd/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Insert)
	 * @author kamagata
	 * @param genreMdForm 中ジャンルフォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=insert" })
	ModelAndView regsit(@Validated({ Insert.class, Default.class }) GenreMdForm genreMdForm, BindingResult bindingResult,
			ModelAndView modelAndView) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

			// 大ジャンルプルダウン要素取得
			List<GenreLgEntity> genreLgEntities = genreMdService.findGenreLgList();

			// モデルセット
			modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
			modelAndView.addObject("genreMdForm", genreMdForm); // 中ジャンルフォーム
			modelAndView.setViewName("maintenance/genremd_newedit"); // 遷移先URLセット

			return modelAndView;
		}

		// エンティティにフォームの内容をコピー、選択した大ジャンルコード設定
		BeanUtils.copyProperties(genreMdForm, genreMdEntity);
		BeanUtils.copyProperties(genreMdForm, genreMdEntity.getGenreLgEntity());

		// 更新処理実行
		genreMdService.update(genreMdEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/genremd/list"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：登録ボタン処理(Update)
	 * @author kamagata
	 * @param genreMdForm 中ジャンルフォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=update" })
	ModelAndView update(@Validated({ Update.class, Default.class }) @ModelAttribute GenreMdForm genreMdForm,
			BindingResult bindingResult, ModelAndView modelAndView) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

			// 大ジャンルプルダウン要素取得
			List<GenreLgEntity> genreLgEntities = genreMdService.findGenreLgList();

			// モデルセット
			modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
			modelAndView.addObject("genreMdForm", genreMdForm); // 中ジャンルフォーム
			modelAndView.setViewName("maintenance/genremd_newedit"); // 遷移先URLセット

			return modelAndView;

		}

		// エンティティにフォームの内容をコピー、選択した大ジャンルコード設定
		BeanUtils.copyProperties(genreMdForm, genreMdEntity);
		BeanUtils.copyProperties(genreMdForm, genreMdEntity.getGenreLgEntity());

		// 更新処理実行
		genreMdService.update(genreMdEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/genremd/list"); // 遷移先URLセット

		return modelAndView;
	}
}
