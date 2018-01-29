package com.example.demo.web.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * クラスの説明：ログインコントローラー
 * @author kamagata
 * @since 2018/01/29
 */
@Controller
@RequestMapping("/common/login")
public class LoginController {

	@GetMapping
	ModelAndView init(ModelAndView modelAndView) {

		modelAndView.setViewName("common/login");

		// 検索処理
		return modelAndView;
	}

}
