package com.example.sample.controller.maintenance;

import java.util.List;

import org.springframework.beans.BeanUtils;
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

import com.example.sample.domain.entity.maintenance.GenreLgEntity;
import com.example.sample.domain.entity.maintenance.GenreSmEntity;
import com.example.sample.form.maintenance.GenreSmForm;
import com.example.sample.service.maintenance.GenreSmService;

/**
 * クラスの説明：中ジャンルマスタコントローラー
 * @author kamagata
 * @since 2018/02/15
 */
@Controller
@Scope("prototype")
@RequestMapping("/maintenance/genresm")
public class GenreSmListController {

	@Autowired
	GenreSmService genreSmService;

	@ModelAttribute
	GenreSmForm setUpForm() {
		return new GenreSmForm();
	}

	/**
	 * メソッドの説明：初期処理 入力値をtrimし、空の場合はNULLでforｍmに格納する
	 * @author kamagata
	 * @since 2018/02/15
	 * @param binder バインダー
	 */
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	/**
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @since 2018/02/15
	 * @param model モデル
	 * @param genreSmForm 中ジャンルフォーム
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	String list(Model model, GenreSmForm genreSmForm) {

		// 全件検索
		return search(model, genreSmForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/02/15
	 * @param model モデル
	 * @param genreSmForm 中ジャンルフォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	String search(Model model, GenreSmForm genreSmForm) {

		// 検索実行
		List<GenreSmEntity> genreSmEntities = genreSmService.findGenreSm(genreSmForm);

		// 検索結果、件数
		model.addAttribute("items", genreSmEntities);
		model.addAttribute("itemsSize", genreSmEntities.size());

		// 遷移先画面
		return "maintenance/genresm_list";
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param genreSmForm 中ジャンルフォーム
	 * @param model モデル
	 * @since 2018/02/15
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	String openNew(Model model, GenreSmForm genreSmForm) {

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = genreSmService.findGenreLgList();

		// 大ジャンルをセット
		model.addAttribute("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素

		// 登録・編集画面遷移
		return "maintenance/genresm_newedit";
	}

	/**
	 * メソッドの説明：編集ボタン処理
	 * @author kamagata
	 * @param genreSmForm 中ジャンルフォーム
	 * @param model モデル
	 * @since 2018/02/15
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	String openEdit(GenreSmForm genreSmForm, Model model) {

		// 検索処理
		GenreSmEntity genreMgEntity = genreSmService.findOne(genreSmForm.getGenreSmCd());

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = genreSmService.findGenreLgList();

		// エンティティの内容をフォームにコピー
		BeanUtils.copyProperties(genreMgEntity, genreSmForm);

		// モデルセット
		model.addAttribute("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		model.addAttribute("genreSmForm", genreSmForm); // 中ジャンルフォーム

		// 登録・編集画面遷移
		return "maintenance/genresm_newedit";
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @param genreSmCd 中ジャンルコード
	 * @param model モデル
	 * @param genreSmForm 中ジャンルフォーム
	 * @param bindingResult エラー情報
	 * @since 2018/02/15
	 * @return Model 遷移先モデル(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam String genreSmCd, Model model, GenreSmForm genreSmForm,
			BindingResult bindingResult) {

		// 削除処理
		genreSmService.delete(genreSmCd);

		return search(model, genreSmForm);

	}
}
