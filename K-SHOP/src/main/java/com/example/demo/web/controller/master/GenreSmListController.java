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
import com.example.demo.service.master.GenreSmService;
import com.example.demo.web.form.master.GenreSmForm;

/**
 * クラスの説明：小ジャンルマスタコントローラー
 * @author kamagata
 * @since 2018/01/14
 */
@Controller
@RequestMapping("/maintenance/genresm")
public class GenreSmListController {

	@Autowired
	GenreSmService genreSmService;

	@ModelAttribute
	GenreSmForm setUpForm() {
		return new GenreSmForm();
	}

	/**
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param modelAndView モデル
	 * @param genreSmForm 小ジャンルフォーム
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	ModelAndView list(ModelAndView modelAndView, GenreSmForm genreSmForm) {

		// 全件検索
		return search(modelAndView, genreSmForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param modelAndView モデル
	 * @param genreSmForm 小ジャンルフォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	ModelAndView search(ModelAndView modelAndView, GenreSmForm genreSmForm) {

		// 検索実行
		List<GenreSmEntity> genreSmEntities = genreSmService.findAllCustom(
				genreSmForm,
				new Sort("genreLgEntity.genreLgCd", "genreMdEntity.genreMdCd", "displayOrder"));

		// 遷移先画面・検索条件セット
		modelAndView.setViewName("master/genresm_list");
		modelAndView.addObject("genreSmForm", genreSmForm);

		// 検索結果、件数
		modelAndView.addObject("items", genreSmEntities);
		modelAndView.addObject("itemsSize", genreSmEntities.size());

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param genreSmForm 小ジャンルフォーム
	 * @param modelAndView モデル
	 * @since 2018/01/14
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	ModelAndView openNew(GenreSmForm genreSmForm, ModelAndView modelAndView) {

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = genreSmService.findGenreLgList();

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.setViewName("master/genresm_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：編集ボタン処理
	 * @author kamagata
	 * @param genreSmForm 小ジャンルフォーム
	 * @param modelAndView モデル
	 * @since 2018/01/14
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	ModelAndView openEdit(GenreSmForm genreSmForm, ModelAndView modelAndView) {

		// 検索処理
		GenreSmEntity genreSmEntity = genreSmService.findOne(genreSmForm.getGenreSmCd());

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = genreSmService.findGenreLgList();

		// 中ジャンルプルダウン要素取得
		List<GenreMdEntity> genreMdEntities = genreSmService.findGenreMdList(genreSmEntity.getGenreLgEntity().getGenreLgCd());

		// エンティティの内容をフォームにコピー
		BeanUtils.copyProperties(genreSmEntity, genreSmForm);
		genreSmForm.setGenreLgCd(genreSmEntity.getGenreLgEntity().getGenreLgCd());
		genreSmForm.setGenreMdCd(genreSmEntity.getGenreMdEntity().getGenreMdCd());

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.addObject("genreMdList", genreMdEntities); // 中ジャンルプルダウン要素
		modelAndView.addObject("genreSmForm", genreSmForm); // 小ジャンルフォーム
		modelAndView.setViewName("master/genresm_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @param genreSmCd 小ジャンルコード
	 * @since 2018/01/08
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam String genreSmCd) {

		// 削除処理
		genreSmService.delete(genreSmCd);

		// 一覧画面へ
		return "redirect:/maintenance/genresm/list";

	}
}
