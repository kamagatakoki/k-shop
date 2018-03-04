package com.example.sample.controller.maintenance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.form.maintenance.GenreLgForm;
import com.example.sample.service.maintenance.GenreLgService;

/**
 * クラスの説明：大ジャンルメンテ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/06
 */
@Controller
@RequestMapping("/maintenance/genrelg")
@Scope("prototype")
public class GenreLgListController {
	@Autowired
	GenreLgService genreLgService;

	@ModelAttribute
	GenreLgForm setUpForm() {
		return new GenreLgForm();
	}

	/**
	 * メソッドの説明：初期処理 入力値をtrimし、空の場合はNULLでforｍmに格納する
	 * @author kamagata
	 * @since 2018/02/12
	 * @param binder バインダー
	 */
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	/**
	 * メソッドの説明：一覧画面初期処理
	 * @author kamagata
	 * @param model モデル
	 * @param genreLgForm 大ジャンルフォーム
	 * @since 2018/01/07
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	String list(Model model, GenreLgForm genreLgForm) {

		// 検索処理
		return search(model, genreLgForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/07
	 * @param model モデル
	 * @param genreLgForm 大ジャンルフォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	String search(Model model, GenreLgForm genreLgForm) {

		// 検索実行
		List<GenreLgEntity> genreLEntities = genreLgService.findGenreLgCriteria(genreLgForm);

		// 検索結果、件数
		model.addAttribute("items", genreLEntities);
		model.addAttribute("itemsSize", genreLEntities.size());

		// 遷移先
		return "maintenance/genrelg_list";
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param redirectAttributes リダイレクト
	 * @param genreLgForm 大ジャンルフォーム
	 * @since 2018/01/07
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	String newEdit(RedirectAttributes redirectAttributes, GenreLgForm genreLgForm) {

		redirectAttributes.addFlashAttribute("genreLgForm", genreLgForm);

		return "redirect:newedit";
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @since 2018/01/08
	 * @param genreLgCd 大ジャンルコード
	 * @param model モデル
	 * @param genreLgForm 大ジャンルフォーム
	 * @param bindingResult エラー情報
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam String genreLgCd, Model model, GenreLgForm genreLgForm,
			BindingResult bindingResult) {

		// 中ジャンル存在チェック
		if (genreLgService.deleteCheck(genreLgCd)) {
			// 存在する場合はエラー
			bindingResult.reject("com.example.demo.web.controller.maintenance.deletecheck");
			return search(model, genreLgForm);
		}

		// 削除処理
		genreLgService.delete(genreLgCd);

		// 一覧画面へ
		return search(model, genreLgForm);

	}

}
