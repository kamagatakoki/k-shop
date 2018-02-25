package com.example.sample.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * クラスの説明：ログイン処理コントローラー
 * @author kamagata
 * @since 2018/02/25
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping
	String login() {
		return "common/login";
	}
}
