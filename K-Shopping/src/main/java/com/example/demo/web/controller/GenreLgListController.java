package com.example.demo.web.controller;

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

import com.example.demo.domain.master.GenreLgEntity;
import com.example.demo.domain.master.GenreLgRepository;
import com.example.demo.service.master.GenreLgService;
import com.example.demo.web.form.GenreLgForm;

/**
 * クラスの説明：ジャンル大メンテ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/06
 */
@Controller
@RequestMapping("/maintenance/genrelg")
public class GenreLgListController {
	@Autowired
	GenreLgService genreLgService;

	@Autowired
	GenreLgRepository genreLgRepository;

	@ModelAttribute
	GenreLgForm setUpForm() {
		return new GenreLgForm();
	}

	/**
	 * メソッドの説明：一覧画面初期処理
	 * @author kamagata
	 * @param modelAndView モデル
	 * @param genreLgForm ジャンル大フォーム
	 * @since 2018/01/07
	 * @return 遷移先URL(一覧)
	 */
	@GetMapping(path = "list")
	ModelAndView list(ModelAndView modelAndView, GenreLgForm genreLgForm) {

		// 検索処理
		List<GenreLgEntity> genreLEntities = genreLgService.findGenreLg(
				genreLgForm.getSearchGenreLgCd(),
				genreLgForm.getSearchGenreNm(),
				new Sort("displayOrder", "genreLgCd"));

		// 検索結果セット
		modelAndView.setViewName("master/genrelg_list");
		modelAndView.addObject("items", genreLEntities);
		modelAndView.addObject("itemsSize", genreLEntities.size());

		return modelAndView;
	}

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/01/07
	 * @param modelAndView モデル
	 * @param genreLgForm ジャンル大フォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	ModelAndView search(ModelAndView modelAndView, GenreLgForm genreLgForm) {

		// 遷移先画面・検索条件セット
		modelAndView.setViewName("master/genrelg_list");
		modelAndView.addObject("genreLgForm", genreLgForm);

		// 検索実行
		List<GenreLgEntity> genreLEntities = genreLgService.findGenreLg(
				genreLgForm.getSearchGenreLgCd(),
				genreLgForm.getSearchGenreNm(),
				new Sort("displayOrder", "genreLgCd"));

		// 検索結果、件数
		modelAndView.addObject("items", genreLEntities);
		modelAndView.addObject("itemsSize", genreLEntities.size());

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @since 2018/01/07
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	String newEdit() {

		return "master/genrelg_newedit";
	}

	/**
	 * メソッドの説明：初期表示処理(更新)
	 * @author kamagata
	 * @param genreLgCd ジャンル大コード
	 * @param genreLgForm ジャンル大フォーム
	 * @since 2018/01/07
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	String newEdit(@RequestParam Integer genreLgCd, GenreLgForm genreLgForm) {

		// 検索処理
		GenreLgEntity genreLgEntity = genreLgRepository.findOne(genreLgCd);

		// フォームにエンティティの内容をコピー、検索条件をフォームにセット
		BeanUtils.copyProperties(genreLgEntity, genreLgForm);

		// 更新画面
		return "master/genrelg_newedit";
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @since 2018/01/08
	 * @param genreLgCd ジャンル大コード
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam Integer genreLgCd) {

		// 削除処理
		genreLgService.delete(genreLgCd);

		// 一覧画面へ
		return "redirect:/maintenance/genrelg/list";

	}

}
