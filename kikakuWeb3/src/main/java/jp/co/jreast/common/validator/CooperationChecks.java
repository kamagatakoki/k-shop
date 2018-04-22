package jp.co.jreast.common.validator;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.Arg;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.springframework.validation.BindingResult;

/**
 * 造成WEB連携対象項目入力値検証
 *
 * <pre>
 *   機能概要 ：
 *   特記事項 ：
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class CooperationChecks extends FMKanJiCheck implements Serializable {

	/** 禁止文字集合 */
	private static final String EXCLUDES = "ヰヱヵヮ≒≡∫√⊥∠∵∩∪";

	/**
	 * デフォルトバージョンID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 検証対象のフィールド値を文字列で取得します。
	 *
	 * <pre></pre>
	 *
	 * @see org.apache.struts.validator.FieldChecks#evaluateBean(Object, Field)
	 * @param bean
	 *            検証対象のBean
	 * @param field
	 *            フィールド
	 * @return 検証対象のフィールド値
	 */
	private static String evaluateBean(Object bean, Field field) {
		if (isString(bean)) {
			return (String) bean;
		} else {
			return ValidatorUtils.getValueAsString(bean, field.getProperty());
		}
	}

	/**
	 * 使用可能文字検証を実施します。
	 *
	 * <pre>
	 * </pre>
	 *
	 * @param value
	 *            検証対象の文字列
	 * @return 検証OKの場合は空文字列、検証NGの場合は該当した文字を返します。（該当するすべての文字を返します）
	 */
	public static String findIllegalChar(String value) {

		String input = value;

		if (StringUtils.isEmpty(input)) {
			return "";
		}

		// FM漢字チェックを実施
		String fmKanjiCheckResult = validateOneString(input);

		// 該当した禁止文字を保持
		StringBuilder illegalChars = new StringBuilder(fmKanjiCheckResult);

		// 追加の禁止文字チェック
		char[] excludeChars = EXCLUDES.toCharArray();
		for (char c : excludeChars) {
			// 禁止文字（一文字）
			String str = String.valueOf(c);

			// 検証対象に含まれている場合はその文字を返す
			if (input.contains(str)) {
				illegalChars.append(str);
			}
		}

		return illegalChars.toString();
	}

	/**
	 * 使用可能文字検証
	 *
	 * <pre>
	 * FM漢字チェックに加え、FM漢字チェックでは許容されてしまう一部の文字を禁止します。
	 * </pre>
	 *
	 * @param bean
	 *            検証対象のBean
	 * @param va
	 *            ValidatorAction
	 * @param field
	 *            フィールド
	 * @param errors
	 *            ActionMessages
	 * @param validator
	 *            Validator
	 * @param request
	 *            HttpServletRequest
	 * @return 検証OKの場合true
	 */
	public static boolean validateIgnoreChars(Object bean, ValidatorAction va,
			Field field, BindingResult errors, Validator validator,
			HttpServletRequest request) {

		String value = evaluateBean(bean, field);

		String illegalChar = findIllegalChar(value);

		if (StringUtils.isEmpty(illegalChar)) {
			// 検証OK
			return true;
		}

		// 検証エラーメッセージの第2パラメータを追加
		Arg arg = new Arg();
		arg.setName(va.getName());
		arg.setPosition(1);
		arg.setResource(false);
		arg.setKey(illegalChar);
		field.addArg(arg);

		// 検証エラーメッセージを取得
		//		ActionMessage msg = Resources.getActionMessage(validator, request, va,
		//				field);
		//		errors.add(field.getKey(), msg);

		return false;
	}

}
