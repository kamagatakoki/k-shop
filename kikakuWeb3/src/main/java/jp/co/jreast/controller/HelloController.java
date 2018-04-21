package jp.co.jreast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * クラスの説明：
 * @author kamagata
 * @since 2018/04/21
 */
@Controller
public class HelloController {

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/04/21
	 * @param model a
	 * @return a
	 */
	@RequestMapping("hello")
	public String hello(Model model) {
		return "hello";
	}
}
