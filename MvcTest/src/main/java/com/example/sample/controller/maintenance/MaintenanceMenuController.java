package com.example.sample.controller.maintenance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * クラスの説明：メンテナンスメニューコントローラー
 * @author kamagata
 * @since 2018/01/11
 */
@Controller
@RequestMapping("/maintenance")
public class MaintenanceMenuController {

	/**
	 * メソッドの説明：メニュー画面遷移
	 * @author kamagata
	 * @since 2018/02/15
	 * @return メニュー画面URL
	 */
	@GetMapping
	String menu() {
		return "maintenance/maintenance_menu";
	}
}
