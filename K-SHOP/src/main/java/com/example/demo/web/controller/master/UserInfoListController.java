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

import com.example.demo.domain.entity.master.GenreLgRepository;
import com.example.demo.domain.entity.master.UserInfoEntity;
import com.example.demo.service.master.UserInfoService;
import com.example.demo.web.form.master.UserInfoForm;

/**
 * クラスの説明：ユーザーマスタ一覧コントローラー
 * @author kamagata
 * @since 2018/01/11
 */
@Controller
@RequestMapping("/maintenance/userinfo")
public class UserInfoListController {
	@Autowired
	UserInfoService userInfoService;

	@Autowired
	GenreLgRepository genreLgRepository;

	@ModelAttribute
	UserInfoForm setUpForm() {
		return new UserInfoForm();
	}

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/01/11
	 * @param modelAndView モデル
	 * @param userInfoForm ユーザーマスタフォーム
	 * @return ModelAndView 遷移先モデル
	 */
	@GetMapping(path = "list")
	ModelAndView list(ModelAndView modelAndView, UserInfoForm userInfoForm) {

		// 全件検索
		List<UserInfoEntity> userInfoEntities = userInfoService.findAll();

		// 検索結果セット
		modelAndView.setViewName("master/userinfo_list");
		modelAndView.addObject("items", userInfoEntities);
		modelAndView.addObject("itemsSize", userInfoEntities.size());

		return modelAndView;

	}

	/**
	 * メソッドの説明：検索ボタン処理
	 * @author kamagata
	 * @since 2018/01/11
	 * @param modelAndView モデル
	 * @param userInfoForm ユーザーマスタフォーム
	 * @return ModelAndView 遷移先モデル
	 */
	@PostMapping(path = "list", params = "search")
	ModelAndView search(ModelAndView modelAndView, UserInfoForm userInfoForm) {

		// 入力された条件で検索
		List<UserInfoEntity> userInfoEntities = userInfoService.findAllCustom(userInfoForm, new Sort("userCd"));

		// 検索結果セット
		modelAndView.setViewName("master/userinfo_list");
		modelAndView.addObject("items", userInfoEntities);
		modelAndView.addObject("itemsSize", userInfoEntities.size());

		return modelAndView;

	}

	/**
	 * メソッドの説明：削除処理
	 * @author kamagata
	 * @param userCd ユーザーコード
	 * @since 2018/01/11
	 * @return 遷移先URL(一覧)
	 */
	@PostMapping(path = "list", params = "delete")
	String delete(@RequestParam Integer userCd) {

		// 削除処理
		userInfoService.delete(userCd);

		// 一覧画面へ
		return "redirect:/maintenance/userinfo/list";

	}

	/**
	 * メソッドの説明：初期表示処理(新規)
	 * @author kamagata
	 * @param userInfoForm ユーザーマスタフォーム
	 * @since 2018/01/13
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "new")
	String newEdit(UserInfoForm userInfoForm) {

		return "master/userinfo_newedit";
	}

	/**
	 * メソッドの説明：初期表示処理(更新)
	 * @author kamagata
	 * @param userCd ユーザーコード
	 * @param userInfoForm ユーザーマスタフォーム
	 * @since 2018/01/13
	 * @return 遷移先URL(登録更新)
	 */
	@PostMapping(path = "list", params = "edit")
	String newEdit(@RequestParam Integer userCd, UserInfoForm userInfoForm) {

		// 検索処理
		UserInfoEntity userInfoEntity = userInfoService.findOne(userCd);

		// フォームにエンティティの内容をコピー、検索条件をフォームにセット
		BeanUtils.copyProperties(userInfoEntity, userInfoForm);

		// 更新画面
		return "master/userinfo_newedit";
	}

}
