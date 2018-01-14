package com.example.demo.web.controller.master;

import javax.validation.Validator;
import javax.validation.groups.Default;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.entity.master.UserInfoEntity;
import com.example.demo.service.master.UserInfoService;
import com.example.demo.web.form.master.UserInfoForm;
import com.example.demo.web.form.master.UserInfoForm.Insert;
import com.example.demo.web.form.master.UserInfoForm.Update;

/**
 * クラスの説明：ユーザーマスタメンテ更新のコントローラー
 * @author kamagata
 * @since 2018/01/13
 */
@Controller
@RequestMapping("/maintenance/userinfo")
public class UserInfoNewEditController {
	@Autowired
	UserInfoService userInfoService;

	@Autowired
	Validator validator;

	@ModelAttribute
	UserInfoForm setUpForm() {
		return new UserInfoForm();
	}

	/**
	 * メソッドの説明：戻るボタン処理
	 * @author kamagata
	 * @param redirectAttributes リダイクレト先へのパラメータ
	 * @param userInfoForm ジャン大フォーム
	 * @since 2018/01/13
	 * @return 遷移先URL(一覧画面)
	 */
	@PostMapping(path = "newedit", params = "goToBack")
	String goToTop(RedirectAttributes redirectAttributes, UserInfoForm userInfoForm) {
		redirectAttributes.addFlashAttribute("userInfoForm", userInfoForm);

		return "redirect:/maintenance/userinfo/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Insert)
	 * @author kamagata
	 * @param userInfoForm ユーザーマスタフォーム
	 * @param bindingResult エラーチェック結果
	 * @since 2018/01/13
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=insert" })
	String regsit(@Validated({ Insert.class, Default.class }) UserInfoForm userInfoForm, BindingResult bindingResult) {

		// バリデーションエラーがあれば中断
		if (bindingResult.hasErrors()) {
			return "master/userinfo_newedit";
		}

		// エンティティにフォームの内容をコピー
		UserInfoEntity userInfoEntity = new UserInfoEntity();
		BeanUtils.copyProperties(userInfoForm, userInfoEntity);
		userInfoEntity.setPassword(userInfoForm.getInputPassword()); // 入力パスワードをハッシュ化してセット

		// 更新処理実行
		userInfoService.update(userInfoEntity);

		return "redirect:/maintenance/userinfo/list";
	}

	/**
	 * メソッドの説明：登録ボタン処理(Update)
	 * @author kamagata
	 * @param userInfoForm ユーザーマスタフォーム
	 * @param bindingResult エラーチェック結果
	 * @since 2018/01/13
	 * @return 一覧画面URL
	 */
	@PostMapping(path = "newedit", params = { "regist", "crud=update" })
	String update(@Validated({ Update.class, Default.class }) UserInfoForm userInfoForm,
			BindingResult bindingResult) {

		// バリデーションエラーがあれば中断
		if (bindingResult.hasErrors()) {
			return "master/userinfo_newedit";
		}

		// エンティティにフォームの内容をコピー
		UserInfoEntity userInfoEntity = new UserInfoEntity();
		BeanUtils.copyProperties(userInfoForm, userInfoEntity);

		// 更新処理実行
		userInfoService.update(userInfoEntity);

		return "redirect:/maintenance/userinfo/list";
	}
}
