package com.example.demo.web.controller.master;

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

import com.example.demo.domain.entity.master.GenreLgEntity;
import com.example.demo.domain.entity.master.GenreMdEntity;
import com.example.demo.domain.entity.master.GenreSmEntity;
import com.example.demo.service.master.GenreSmService;
import com.example.demo.web.form.master.GenreSmForm;
import com.example.demo.web.form.master.GenreSmForm.Insert;
import com.example.demo.web.form.master.GenreSmForm.Update;

/**
 * クラスの説明：小ジャンルメンテ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/06
 */
@Controller
@RequestMapping("/maintenance/genresm")
public class GenreSmNewEditControlle {
	@Autowired
	GenreSmService genreSmService;

	@ModelAttribute
	GenreSmForm setUpForm() {
		return new GenreSmForm();
	}

	/**
	 * メソッドの説明：戻るボタン処理
	 * @author kamagata
	 * @param redirectAttributes リダイクレト先へのパラメータ
	 * @param genreSmForm 小ジャンルフォーム
	 * @since 2018/01/08
	 * @return モデル
	 */
	@PostMapping(path = "newedit", params = "goToBack")
	String goToTop(RedirectAttributes redirectAttributes, GenreSmForm genreSmForm) {
		redirectAttributes.addFlashAttribute("genreSmForm", genreSmForm);

		return "redirect:/maintenance/genresm/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Insert)
	 * @author kamagata
	 * @param genreSmForm 小ジャンルフォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=insert" })
	ModelAndView regsit(@Validated({ Insert.class, Default.class }) GenreSmForm genreSmForm, BindingResult bindingResult,
			ModelAndView modelAndView) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

			// 大ジャンルプルダウン要素取得
			List<GenreLgEntity> genreLgEntities = genreSmService.findGenreLgList();
			genreSmForm.setGenreLgCd(genreSmForm.getGenreLgCd());

			// 中ジャンルプルダウン要素取得
			List<GenreMdEntity> genreMdEntities = genreSmService.findGenreMdList(genreSmForm.getGenreLgCd());
			genreSmForm.setGenreMdCd(genreSmForm.getGenreMdCd());

			// モデルセット
			modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
			modelAndView.addObject("genreMdList", genreMdEntities); // 中ジャンルプルダウン要素
			modelAndView.addObject("genreSmForm", genreSmForm); // 小ジャンルフォーム
			modelAndView.setViewName("master/genresm_newedit"); // 遷移先URLセット

			return modelAndView;
		}

		// エンティティにフォームの内容をコピー、選択した大中ジャンルコード設定
		GenreSmEntity genreSmEntity = new GenreSmEntity();
		genreSmEntity.setGenreLgEntity(new GenreLgEntity());
		genreSmEntity.setGenreMdEntity(new GenreMdEntity());
		BeanUtils.copyProperties(genreSmForm, genreSmEntity);
		genreSmEntity.getGenreLgEntity().setGenreLgCd(genreSmForm.getGenreLgCd());
		genreSmEntity.getGenreMdEntity().setGenreMdCd(genreSmForm.getGenreMdCd());

		// 更新処理実行
		genreSmService.update(genreSmEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/genresm/list"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：登録ボタン処理(Update)
	 * @author kamagata
	 * @param genreSmForm 小ジャンルフォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=update" })
	ModelAndView update(@Validated({ Update.class, Default.class }) @ModelAttribute GenreSmForm genreSmForm,
			BindingResult bindingResult, ModelAndView modelAndView) {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

			// 大ジャンルプルダウン要素取得
			List<GenreLgEntity> genreLgEntities = genreSmService.findGenreLgList();
			genreSmForm.setGenreLgCd(genreSmForm.getGenreLgCd());

			// 中ジャンルプルダウン要素取得
			List<GenreMdEntity> genreMdEntities = genreSmService.findGenreMdList(genreSmForm.getGenreLgCd());
			genreSmForm.setGenreMdCd(genreSmForm.getGenreMdCd());

			// モデルセット
			modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
			modelAndView.addObject("genreMdList", genreMdEntities); // 中ジャンルプルダウン要素
			modelAndView.addObject("genreSmForm", genreSmForm); // 小ジャンルフォーム
			modelAndView.setViewName("master/genresm_newedit"); // 遷移先URLセット

			return modelAndView;
		}

		// エンティティにフォームの内容をコピー、選択した大中ジャンルコード設定
		GenreSmEntity genreSmEntity = new GenreSmEntity();
		genreSmEntity.setGenreLgEntity(new GenreLgEntity());
		genreSmEntity.setGenreMdEntity(new GenreMdEntity());
		BeanUtils.copyProperties(genreSmForm, genreSmEntity);
		genreSmEntity.getGenreLgEntity().setGenreLgCd(genreSmForm.getGenreLgCd());
		genreSmEntity.getGenreMdEntity().setGenreMdCd(genreSmForm.getGenreMdCd());

		// 更新処理実行
		genreSmService.update(genreSmEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/genresm/list"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：初期表示処理
	 * @author kamagata
	 * @since 2018/01/14
	 * @param modelAndView モデル
	 * @param genreSmForm 小ジャンルフォーム
	 * @return 遷移先モデル(一覧)
	 */
	@PostMapping(path = "newedit", params = "dummy")
	ModelAndView list(ModelAndView modelAndView, GenreSmForm genreSmForm) {

		// 大ジャンルプルダウン要素取得
		List<GenreLgEntity> genreLgEntities = genreSmService.findGenreLgList();

		// 中ジャンルプルダウン要素取得
		List<GenreMdEntity> genreMdEntities = genreSmService.findGenreMdList(genreSmForm.getGenreLgCd());

		// モデルセット
		modelAndView.addObject("genreLgList", genreLgEntities); // 大ジャンルプルダウン要素
		modelAndView.addObject("genreMdList", genreMdEntities); // 中ジャンルプルダウン要素
		modelAndView.addObject("genreSmForm", genreSmForm); // 小ジャンルフォーム
		modelAndView.setViewName("master/genresm_newedit"); // 遷移先URLセット

		return modelAndView;
	}

}
