package jp.co.jreast.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.intage.framework.util.MessageUtil;
import jp.co.jreast.common.data.BasicMstData;

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
	public String hello(Model model, HttpServletRequest request) {

		System.out.println(MessageUtil.format(request, "アクションがスタートする。"));

		System.out.println(MessageUtil.getMessage(Locale.getDefault(), "common.W201"));

		IDao dao = DaoManagerDelegate.createDao(IDao.class);

		BasicMstData blog = (BasicMstData) dao.queryForObject("constants.SelectAll", null);
		System.out.println(blog.getBasicCode1());

		return "hello";
	}
}
