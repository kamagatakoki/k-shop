package jp.co.jreast.common.validator;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.springframework.validation.BindingResult;

/**
 * FM漢字チェック.
 * @author jinhuashi
 * 2007.1.15
 */
public class FMKanJiCheck implements Serializable {
	/**
	 * FM漢字を検証する.
	 * @param bean bean
	 * @param va ValidatorAction
	 * @param field 検証のfield
	 * @param errors エラーの集合
	 * @param validator validator
	 * @param request request
	 * @return boolean
	 */
	public static boolean validateFMKanJi(Object bean, ValidatorAction va, Field field,
			BindingResult errors, Validator validator, HttpServletRequest request) {
		String value = null;
		//Stringのデータを取得
		if (isString(bean)) {
			value = (String) bean;

		} else {
			value = ValidatorUtils.getValueAsString(bean, field.getProperty());
		}
		//ＦＭ漢字を検証する
		String rtn = validateOneString(value);
		if (rtn.length() < 1) { //エラーがないの場合
			//if (rtn.length() < 1 || rtn.trim().equals("")) { //エラーがないの場合
			return true;
		} else { //エラーが有るの場合
			//	        	ActionMessage ams = Resources.getActionMessage(validator, request, va, field);
			//	        	String[] strings = (String[]) ams.getValues();
			//	        	errors.add(field.getKey(),  new ActionMessage("errors.FMKanji", strings[0], rtn
			//	        			.replaceAll("&", "&amp;")
			//	        			.replaceAll("<","&lt;")
			//	        			.replaceAll(">","&gt;")
			//	        			.replaceAll("\"","&quot;")
			//	        			.replaceAll("'","&#39;")
			//	        			));
			//errors.add(field.getKey(),  new ActionMessage("errors.FMKanji", rtn));
		}

		return true;
	}

	/**
	 * ひとつ文字でFM漢字を検証する.
	 * @param input 検証したい文字String
	 * @return FM漢字ではない文字
	 */
	public static String validateOneString(String input) {
		byte[] bstr = null;
		int kjCode = 0xffff;
		String moji;
		String rtn = "";

		for (int i = 0; i < input.length(); i++) {
			moji = input.substring(i, i + 1);

			try {
				bstr = moji.getBytes("MS932");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			// 1ﾊﾞｲﾄの文字
			if (bstr.length < 2) {
				rtn = rtn + moji;
				continue;
			}

			// 2ﾊﾞｲﾄの文字ｺｰﾄﾞ
			kjCode = bstr[0] << 8 & 0xffff ^ bstr[1] & 0xff;

			if (kjCode >= 0x8140 && kjCode <= 0x84BE
					|| kjCode >= 0x889F && kjCode <= 0x9872
					|| kjCode >= 0x989F && kjCode <= 0x9FFC
					|| kjCode >= 0xE040 && kjCode <= 0xEAA4) {
				continue;
			} else {
				rtn = rtn + moji;
			}
		}
		//改行コードと半角スペースのエラーメッセージを置換する
		rtn = rtn.replaceFirst("(\\r\\n)", "改行");
		rtn = rtn.replaceFirst(" ", "半角スペース");
		rtn = rtn.replaceAll("(\\r\\n)", "");
		rtn = rtn.replaceAll(" ", "");
		return rtn;
	}

	/**
	    * 文字列か否か判断する。 Nullの場合はTrue。.
	    *
	    * @param o オブジェクト
	    * @return 文字列か否か
	    */
	protected static boolean isString(Object o) {

		return o == null ? true : String.class.isInstance(o);
	}

	/**
	 * デフォルトバージョンID。.
	 */
	private static final long serialVersionUID = 1L;
}
