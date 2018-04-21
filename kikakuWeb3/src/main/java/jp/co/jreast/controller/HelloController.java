package jp.co.jreast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * �N���X�̐����F
 * @author kamagata
 * @since 2018/04/21
 */
@Controller
public class HelloController {

	/**
	 * ���\�b�h�̐����F
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
