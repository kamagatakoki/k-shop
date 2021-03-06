package com.example.demo.web.controller.maintenance;

import javax.validation.Validator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.repository.maintenance.GenreLgRepository;
import com.example.demo.service.maintenance.GenreLgService;
import com.example.demo.web.form.maintenance.GenreLgForm;

/**
 * クラスの説明：大ジャンルメンテ更新のコントローラー
 * @author kamagata
 * @since 2018/01/06
 */
@Controller
@RequestMapping("/maintenance/genrelg")
public class GenreLgNewEditController {
	@Autowired
	GenreLgService genreLgService;

	@Autowired
	GenreLgRepository genreLgRepository;

	@Autowired
	Validator validator;

	@Autowired
	GenreLgEntity genreLgEntity;

	@ModelAttribute
	GenreLgForm setUpForm() {
		return new GenreLgForm();
	}

	/**
	 * メソッドの説明：戻るボタン処理
	 * @author kamagata
	 * @param redirectAttributes リダイクレト先へのパラメータ
	 * @param genreLgForm ジャン大フォーム
	 * @since 2018/01/08
	 * @return モデル
	 */
	@PostMapping(path = "newedit", params = "goToBack")
	String goToTop(RedirectAttributes redirectAttributes, GenreLgForm genreLgForm) {
		redirectAttributes.addFlashAttribute("genreLgForm", genreLgForm);

		return "redirect:/maintenance/genrelg/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Insert)
	 * @author kamagata
	 * @param genreLgForm 大ジャンルフォーム
	 * @param bindingResult エラーチェック結果
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=insert" })
	String regsit(@Validated GenreLgForm genreLgForm, BindingResult bindingResult) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {
			return "maintenance/genrelg_newedit";
		}

		// エンティティにフォームの内容をコピー
		BeanUtils.copyProperties(genreLgForm, genreLgEntity);

		// 更新処理実行
		genreLgService.update(genreLgEntity);

		return "redirect:/maintenance/genrelg/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Update)
	 * @author kamagata
	 * @param genreLgForm 大ジャンルフォーム
	 * @param bindingResult エラーチェック結果
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=update" })
	String update(@Validated GenreLgForm genreLgForm, BindingResult bindingResult) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {
			return "maintenance/genrelg_newedit";
		}

		// エンティティにフォームの内容をコピー
		BeanUtils.copyProperties(genreLgForm, genreLgEntity);

		// 更新処理実行
		genreLgService.update(genreLgEntity);

		return "redirect:/maintenance/genrelg/list";
	}

}
