package com.example.sample.controller.maintenance;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.form.common.CommonForm.Insert;
import com.example.sample.form.common.CommonForm.Update;
import com.example.sample.form.maintenance.GenreLgForm;
import com.example.sample.service.maintenance.GenreLgService;

/**
 * クラスの説明：大ジャンルメンテ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/06
 */
@Controller
@RequestMapping("/maintenance/genrelg")
public class GenreLgDetailController {
	@Autowired
	GenreLgService genreLgService;

	@Autowired
	GenreLgEntity genreLgEntity;

	@ModelAttribute
	GenreLgForm setUpForm() {
		return new GenreLgForm();
	}

	/**
	 * メソッドの説明：初期処理 入力値をtrimし、空の場合はNULLでformに格納する
	 * @author kamagata
	 * @since 2018/02/12
	 * @param binder バインダー
	 */
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	/**
	 * メソッドの説明：画面初期処理
	 * @author kamagata
	 * @param model モデル
	 * @param genreLgForm 大ジャンルフォーム
	 * @since 2018/02/17
	 * @return 遷移先モデル(一覧)
	 */
	@RequestMapping(path = "newedit", method = { RequestMethod.GET, RequestMethod.POST })
	String list(Model model, GenreLgForm genreLgForm) {

		// 検索実行
		GenreLgEntity genreLgEntity = genreLgService.findOne(genreLgForm.getGenreLgCd());

		// エンティティにフォームの内容をコピー
		Optional.ofNullable(genreLgEntity)
				.ifPresent(t -> BeanUtils.copyProperties(t, genreLgForm));

		// 検索処理
		return "maintenance/genrelg_newedit";
	}

	/**
	 * メソッドの説明：登録処理
	 * @author kamagata
	 * @param genreLgForm 大ジャンルフォーム
	 * @param bindingResult バリデーション結果
	 * @since 2018/02/17
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=insert" })
	String insert(@Validated({ Insert.class }) GenreLgForm genreLgForm, BindingResult bindingResult) {

		// 入力エラーの場合は中断
		if (bindingResult.hasErrors()) {
			return "maintenance/genrelg_newedit";
		}

		// エンティティにフォームの内容をコピー
		BeanUtils.copyProperties(genreLgForm, genreLgEntity);

		// 登録処理
		genreLgService.insert(genreLgEntity);

		return "forward:list";
	}

	/**
	 * メソッドの説明：更新処理
	 * @author kamagata
	 * @param genreLgForm 大ジャンルフォーム
	 * @param bindingResult バリデーション結果
	 * @since 2018/02/17
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=update" })
	String update(@Validated({ Update.class }) GenreLgForm genreLgForm, BindingResult bindingResult) {

		// 入力エラーの場合は中断
		if (bindingResult.hasErrors()) {
			return "maintenance/genrelg_newedit";
		}

		// エンティティにフォームの内容をコピー
		BeanUtils.copyProperties(genreLgForm, genreLgEntity);

		// 更新処理
		genreLgService.update(genreLgEntity);

		return "forward:list";
	}

	/**
	 * メソッドの説明：戻るボタン処理
	 * @author kamagata
	 * @param redirectAttributes リダイクレト先へのパラメータ
	 * @param genreLgForm ジャン大フォーム
	 * @since 2018/02/17
	 * @return モデル
	 */
	@PostMapping(path = "newedit", params = "goToBack")
	String goToTop(RedirectAttributes redirectAttributes, GenreLgForm genreLgForm) {

		redirectAttributes.addFlashAttribute("genreLgForm", genreLgForm);

		return "forward:list";
	}

}
