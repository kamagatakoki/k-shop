package com.example.demo.web.controller.master;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.entity.master.GenreLgEntity;
import com.example.demo.domain.repository.master.GenreLgRepository;
import com.example.demo.service.master.GenreLgService;
import com.example.demo.web.form.master.GenreLgForm;

/**
 * クラスの説明：大ジャンルメンテ一覧のコントローラー
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
	 * @param genreLgForm 大ジャンルフォーム
	 * @since 2018/01/07
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	ModelAndView list(ModelAndView modelAndView, GenreLgForm genreLgForm) {

		// 検索処理
		return search(modelAndView, genreLgForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/07
	 * @param modelAndView モデル
	 * @param genreLgForm 大ジャンルフォーム
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
				genreLgForm.getSearchGenreLgNm(),
				new Sort("displayOrder", "genreLgCd"));

		// 検索結果、件数
		modelAndView.addObject("items", genreLEntities);
		modelAndView.addObject("itemsSize", genreLEntities.size());

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param genreLgForm 大ジャンルフォーム
	 * @since 2018/01/07
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	String newEdit(GenreLgForm genreLgForm) {

		return "master/genrelg_newedit";
	}

	/**
	 * メソッドの説明：更新ボタン処理
	 * @author kamagata
	 * @param genreLgCd 大ジャンルコード
	 * @param genreLgForm 大ジャンルフォーム
	 * @since 2018/01/07
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	String newEdit(@RequestParam String genreLgCd, GenreLgForm genreLgForm) {

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
	 * @param genreLgCd 大ジャンルコード
	 * @param modelAndView モデル
	 * @param genreLgForm 大ジャンルフォーム
	 * @param bindingResult エラー情報
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	ModelAndView delete(@RequestParam String genreLgCd, ModelAndView modelAndView, GenreLgForm genreLgForm,
			BindingResult bindingResult) {

		// 中ジャンル存在チェック
		if (genreLgService.deleteCheck(genreLgCd)) {
			// 存在する場合はエラー
			bindingResult.reject("com.example.demo.web.controller.master.deletecheck", "下位ジャンルに紐づくデータがあります。"); //?????????????
			return search(modelAndView, genreLgForm);
		}

		// 削除処理
		genreLgService.delete(genreLgCd);

		// 一覧画面へ
		return search(modelAndView, genreLgForm);

	}

}
