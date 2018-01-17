package com.example.demo.web.controller.master;

import java.io.File;
import java.io.IOException;

import javax.validation.groups.Default;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.entity.master.GoodsImageEntity;
import com.example.demo.service.master.GoodsImageService;
import com.example.demo.web.form.master.GoodsImageForm;
import com.example.demo.web.form.master.GoodsImageForm.Insert;
import com.example.demo.web.form.master.GoodsImageForm.Update;

/**
 * クラスの説明：商品画像マスタ一覧のコントローラー
 * @author kamagata
 * @since 2018/01/06
 */
@Controller
@RequestMapping("/maintenance/goodsimage")
public class GoodsImageNewEditControlle {
	@Autowired
	GoodsImageService goodsImageService;

	@ModelAttribute
	GoodsImageForm setUpForm() {
		return new GoodsImageForm();
	}

	/**
	 * メソッドの説明：戻るボタン処理
	 * @author kamagata
	 * @param redirectAttributes リダイクレト先へのパラメータ
	 * @param goodsImageForm 商品画像フォーム
	 * @since 2018/01/08
	 * @return モデル
	 */
	@PostMapping(path = "newedit", params = "goToBack")
	String goToTop(RedirectAttributes redirectAttributes, GoodsImageForm goodsImageForm) {
		redirectAttributes.addFlashAttribute("goodsImageForm", goodsImageForm);

		return "redirect:/maintenance/goodsimage/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Insert)
	 * @author kamagata
	 * @param goodsImageForm 商品画像フォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @param uploadFile 画像ファイル
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 * @throws IOException IO例外
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=insert" })
	ModelAndView regsit(@Validated({ Insert.class, Default.class }) GoodsImageForm goodsImageForm, BindingResult bindingResult,
			ModelAndView modelAndView, @RequestParam(value = "uploadFile", required = true) MultipartFile uploadFile)
			throws IOException {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

			// モデルセット
			modelAndView.addObject("goodsImageForm", goodsImageForm); // 商品画像フォーム
			modelAndView.setViewName("master/goodsimage_newedit"); // 遷移先URLセット

			return modelAndView;
		}

		// 画像ファイルをバイト配列に変換しフォームにセット
		try {
			byte[] fileContent = goodsImageService.convertImageToBytes(uploadFile);
			goodsImageForm.setImage(fileContent);
		} catch (IOException e) {
			throw e;
		}

		// エンティティにフォームの内容をコピー
		GoodsImageEntity goodsImageEntity = new GoodsImageEntity();
		BeanUtils.copyProperties(goodsImageForm, goodsImageEntity);
		goodsImageEntity.setFileNm(new File(goodsImageForm.getInputFilePath()).getName()); // ファイルパスからファイル名のみをセット

		// 更新処理実行
		goodsImageService.update(goodsImageEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/goodsimage/list"); // 遷移先URLセット

		return modelAndView;
	}

	/**
	 * メソッドの説明：登録ボタン処理(Update)
	 * @author kamagata
	 * @param goodsImageForm 商品画像フォーム
	 * @param bindingResult エラーチェック結果
	 * @param modelAndView モデル
	 * @param uploadFile 画像ファイル
	 * @since 2018/01/08
	 * @return 一覧画面URL
	 * @throws IOException IO例外
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=update" })
	ModelAndView update(@Validated({ Update.class, Default.class }) @ModelAttribute GoodsImageForm goodsImageForm,
			BindingResult bindingResult, ModelAndView modelAndView,
			@RequestParam(value = "uploadFile", required = false) MultipartFile uploadFile) throws IOException {

		// エラーがあれば中断
		if (bindingResult.hasErrors()) {

			// モデルセット
			modelAndView.addObject("goodsImageForm", goodsImageForm); // 商品画像フォーム
			modelAndView.setViewName("master/goodsimage_newedit"); // 遷移先URLセット

			return modelAndView;

		}

		// エンティティにフォームの内容をコピー
		GoodsImageEntity goodsImageEntity = new GoodsImageEntity();
		BeanUtils.copyProperties(goodsImageForm, goodsImageEntity);

		// 更新処理実行
		goodsImageService.update(goodsImageEntity);

		// モデルセット
		modelAndView.setViewName("redirect:/maintenance/goodsimage/list"); // 遷移先URLセット

		return modelAndView;
	}
}
