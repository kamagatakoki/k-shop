package com.example.sample.matchers;

import static org.junit.Assert.*;

import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.ModelResultMatchers;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

/**
 * クラスの説明：グローバルエラー用Matchers
 * @author kamagata
 * @since 2018/03/04
 */
public class GlobalErrorsMatchers extends ModelResultMatchers {

	private GlobalErrorsMatchers() {
	}

	/**
	 * メソッドの説明：コンストラクタ
	 * @author kamagata
	 * @since 2018/03/04
	 * @return GlobalErrorsMatchers
	 */
	public static GlobalErrorsMatchers globalErrors() {
		return new GlobalErrorsMatchers();
	}

	/**
	 * メソッドの説明：グローバルエラー有無
	 * @author kamagata
	 * @since 2018/03/04
	 * @param attribute アトリビュート
	 * @param expectedMessage エラーメッセージコード
	 * @return ResultMatcher
	 */
	public ResultMatcher hasGlobalError(String attribute, String expectedMessage) {
		return result -> {
			BindingResult bindingResult = getBindingResult(
					result.getModelAndView(), attribute);
			bindingResult.getGlobalErrors()
					.stream()
					.filter(oe -> attribute.equals(oe.getObjectName()))
					.forEach(oe -> assertEquals(
							"Expected default message", expectedMessage, oe.getCode()));
		};
	}

	/**
	 * メソッドの説明：BindingResult取得
	 * @author kamagata
	 * @since 2018/03/04
	 * @param mav modelAndView
	 * @param name 名前
	 * @return BindingResult
	 */
	private BindingResult getBindingResult(ModelAndView mav, String name) {
		BindingResult result = (BindingResult) mav.getModel().get(BindingResult.MODEL_KEY_PREFIX + name);
		assertTrue(
				"No BindingResult for attribute: " + name, result != null);
		assertTrue(
				"No global errors for attribute: " + name, result.getGlobalErrorCount() > 0);
		return result;
	}
}