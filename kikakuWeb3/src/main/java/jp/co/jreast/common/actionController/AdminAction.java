package jp.co.jreast.common.actionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindingResult;

import jp.co.intage.framework.exception.BusinessException;
import jp.co.intage.framework.exception.SystemException;
import jp.co.intage.framework.support.ActionMapping;
import jp.co.intage.framework.web.form.BaseForm;

/**
 * 【廃止】
 *
 * <pre>
 *  リセットアクションクラス。.
 *  機能概要　：
 *  特記事項　：
 * </pre>
 * @version 0.1 2007/02/14
 * @author 斉
 */
public class AdminAction extends BaseAction {

	@Override
	public String executeAction(ActionMapping mapping, BaseForm form, BindingResult result, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return reset(mapping, form, request, response);
	}

	/**
	 * 【廃止】
	 *
	 *  初期化処理のリセット.
	 *
	 * @param mapping 遷移先のマッピング
	 * @param form FORMデータ
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return 遷移先情報
	 * @throws SystemException システム例外
	 * @throws BusinessException 業務例外
	 */
	public String reset(ActionMapping mapping, BaseForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws SystemException, BusinessException {
		getLog().info("AdminAction::reset");
		return null;
	}

	/**
	 *  ログを取得する.
	 *
	 * @return ログ
	 */
	@Override
	public Log getLog() {
		return log;
	}

	/**
	 *  ログ.
	 */
	private static Log log = LogFactory.getLog(AdminAction.class);

	/**
	 * ログインは必要かどうか.
	 * @return boolean
	 */
	@Override
	protected boolean needLogin() {
		return false;
	}

}
