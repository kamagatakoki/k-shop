package com.example.demo.web.controller.maintenance;

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

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.domain.entity.maintenance.GenreMdEntity;
import com.example.demo.service.maintenance.GenreMdService;
import com.example.demo.web.form.maintenance.GenreMdForm;

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
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param modelAndView モデル
	 * @param genreMdForm 中ジャンルフォーム
	 * @return 遷移先モデル(一覧)
	 */
	@GetMapping(path = "list")
	ModelAndView list(ModelAndView modelAndView, GenreMdForm genreMdForm) {

		// 全件検索
		return search(modelAndView, genreMdForm);
	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param modelAndView モデル
	 * @param genreMdForm 中ジャンルフォーム
	 * @return 検索結果(モデル)
	 */
	@PostMapping(path = "list", params = "search")
	ModelAndView search(ModelAndView modelAndView, GenreMdForm genreMdForm) {

		// 検索実行
		List<GenreMdEntity> genreMdEntities = genreMdService.findAllCustom(
				genreMdForm,
				new Sort("genreLgEntity.genreLgCd", "displayOrder"));

		// 遷移先画面・検索条件セット
		modelAndView.setViewName("maintenance/genremd_list");
		modelAndView.addObject("genreMdForm", genreMdForm);

		// 検索結果、件数
		modelAndView.addObject("items", genreMdEntities);
		modelAndView.addObject("itemsSize", genreMdEntities.size());

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param genreMdForm 中ジャンルフォーム
	 * @param modelAndView モデル
	 * @since 2018/01/14
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	ModelAndView openNew(GenreMdForm genreMdForm, ModelAndView modelAndView) {

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = genreMdService.findGenreLgList();

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.setViewName("maintenance/genremd_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：編集ボタン処理
	 * @author kamagata
	 * @param genreMdForm 中ジャンルフォーム
	 * @param modelAndView モデル
	 * @since 2018/01/14
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	ModelAndView openEdit(GenreMdForm genreMdForm, ModelAndView modelAndView) {

		// 検索処理
		GenreMdEntity genreMgEntity = genreMdService.findOne(genreMdForm.getGenreMdCd());

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = genreMdService.findGenreLgList();

		// エンティティの内容をフォームにコピー
		BeanUtils.copyProperties(genreMgEntity, genreMdForm);
		genreMdForm.setGenreLgCd(genreMgEntity.getGenreLgEntity().getGenreLgCd());

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.addObject("genreMdForm", genreMdForm); // 中ジャンルフォーム
		modelAndView.setViewName("maintenance/genremd_newedit"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @param genreMdCd 中ジャンルコード
	 * @param modelAndView モデル
	 * @param genreMdForm 中ジャンルフォーム
	 * @param bindingResult エラー情報
	 * @since 2018/01/08
	 * @return ModelAndView 遷移先モデル(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	ModelAndView delete(@RequestParam String genreMdCd, ModelAndView modelAndView, GenreMdForm genreMdForm,
			BindingResult bindingResult) {

		// 小ジャンル存在チェック
		if (genreMdService.deleteCheck(genreMdCd)) {
			// 存在する場合はエラー
			bindingResult.reject("com.example.demo.web.controller.maintenance.deletecheck");
			return search(modelAndView, genreMdForm);
		}

		// 削除処理
		genreMdService.delete(genreMdCd);

		return search(modelAndView, genreMdForm);

	}
}
