package com.example.sample.controller.maintenance;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
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

import com.example.sample.domain.model.maintenance.GenreLg;
import com.example.sample.domain.model.maintenance.GenreMd;
import com.example.sample.form.maintenance.GenreMdForm;
import com.example.sample.service.maintenance.GenreMdService;

/**
 * クラスの説明：中ジャンルマスタコントローラー
 * @author kamagata
 * @since 2018/01/14
 */
@Controller
@RequestMapping("/maintenance/genremd")
public class GenreMdListController {

	@Autowired
	GenreMdService genreMdService;

	@ModelAttribute
	GenreMdForm setUpForm() {
		return new GenreMdForm();
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
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param model モデル
	 * @param genreMdForm 中ジャンルフォーム
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	String list(Model model, GenreMdForm genreMdForm) {

		// 全件検索
		return search(model, genreMdForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param model モデル
	 * @param genreMdForm 中ジャンルフォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	String search(Model model, GenreMdForm genreMdForm) {

		// 検索実行
		List<GenreMd> genreMdEntities = genreMdService.findGenreMd(genreMdForm);

		// 検索結果、件数
		model.addAttribute("items", genreMdEntities);
		model.addAttribute("itemsSize", genreMdEntities.size());

		// 遷移先画面
		return "maintenance/genremd_list";
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param genreMdForm 中ジャンルフォーム
	 * @param model モデル
	 * @since 2018/01/14
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	String openNew(Model model, GenreMdForm genreMdForm) {

		// 大ジャンルプルダウン要素取得
		List<GenreLg> genreLgEntities = genreMdService.findGenreLgList();

		// 大ジャンルをセット
		model.addAttribute("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素

		// 登録・編集画面遷移
		return "maintenance/genremd_newedit";
	}

	/**
	 * メソッドの説明：編集ボタン処理
	 * @author kamagata
	 * @param genreMdForm 中ジャンルフォーム
	 * @param model モデル
	 * @since 2018/01/14
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	String openEdit(GenreMdForm genreMdForm, Model model) {

		// 検索処理
		GenreMd genreMgEntity = genreMdService.findOne(genreMdForm.getGenreMdCd());

		// 大ジャンルプルダウン要素取得
		List<GenreLg> genreLgEntities = genreMdService.findGenreLgList();

		// エンティティの内容をフォームにコピー
		BeanUtils.copyProperties(genreMgEntity, genreMdForm);

		// モデルセット
		model.addAttribute("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		model.addAttribute("genreMdForm", genreMdForm); // 中ジャンルフォーム

		// 登録・編集画面遷移
		return "maintenance/genremd_newedit";
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @param genreMdCd 中ジャンルコード
	 * @param model モデル
	 * @param genreMdForm 中ジャンルフォーム
	 * @param bindingResult エラー情報
	 * @since 2018/01/08
	 * @return Model 遷移先モデル(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam String genreMdCd, Model model, GenreMdForm genreMdForm,
			BindingResult bindingResult) {

		//		// 小ジャンル存在チェック
		//		if (genreMdService.deleteCheck(genreMdCd)) {
		//			// 存在する場合はエラー
		//			bindingResult.reject("com.example.demo.web.controller.maintenance.deletecheck");
		//			return search(model, genreMdForm);
		//		}

		// 削除処理
		genreMdService.delete(genreMdCd);

		return search(model, genreMdForm);

	}
}
