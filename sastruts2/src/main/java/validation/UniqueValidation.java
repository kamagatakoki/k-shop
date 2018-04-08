package validation;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.struts.action.ActionMessages;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.struts.validator.S2FieldChecks;

/**
 * クラスの説明：一意チェックバリデーション
 * @author kamagata
 * @since 2018/04/02
 */
public class UniqueValidation extends S2FieldChecks {

	private static final long serialVersionUID = 1L;

	/**
	 * メソッドの説明：一意チェック
	 * @author kamagata
	 * @since 2018/04/02
	 * @param bean ビーン
	 * @param validatorAction アクション
	 * @param field フィールド
	 * @param errors エラー
	 * @param validator バリデーター
	 * @param request リクエスト
	 * @return boolean
	 */
	public static boolean uniqueValidate(Object bean, ValidatorAction validatorAction, Field field, ActionMessages errors,
			Validator validator, HttpServletRequest request) {

		JdbcManager jdbcManager = SingletonS2Container.getComponent(JdbcManager.class);

		Object value = null;

		try {
			value = PropertyUtils.getProperty(bean, field.getProperty());
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		}

		String tableNm = field.getVarValue("tableNm");
		String columnNm = field.getVarValue("columnNm");

		String sql = String.format("SELECT * FROM %s e WHERE e.%s = ? ", tableNm, columnNm);

		if (jdbcManager.getCountBySql(sql, value) > 0) {
			addError(errors, field, validator, validatorAction, request);
			return false;
		}

		return true;
	}
}
