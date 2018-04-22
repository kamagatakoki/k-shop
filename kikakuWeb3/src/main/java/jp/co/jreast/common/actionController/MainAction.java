package jp.co.jreast.common.actionController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindingResult;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.intage.framework.exception.BusinessException;
import jp.co.intage.framework.exception.SystemException;
import jp.co.intage.framework.support.ActionMapping;
import jp.co.intage.framework.web.form.BaseForm;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.MainTenanceData;

/**
 * <pre>
 *  Actionクラス。.
 *  機能概要　：
 *  　メンテナンスの場合、メンテナンスのお知らせ画面に遷移する。
 *  　正常の場合は、登録画面に遷移する.
 *  特記事項　：
 * </pre>
 *
 *
 * @see org.apache.struts.action.Action
 * @author jinhuashi
 * @version 0.1 2006.10.10
 */
public class MainAction extends BaseAction {
	/**
	 * メンテナンス検証を行う .
	 * @param mapping 遷移先のマッピング
	 * @param form FORMデータ
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return 遷移先情報
	 * @throws SystemException システム例外
	 * @throws BusinessException 業務例外
	 */
	@Override
	public String doTask(ActionMapping mapping, BaseForm form, BindingResult result,
			HttpServletRequest request, HttpServletResponse response)
			throws SystemException, BusinessException {
		log.info("check is maintenance");
		IDao dao = DaoManagerDelegate.createDao(IDao.class);
		List list = dao.queryForList("isMaintenance", null);
		if (list.size() > 0) {
			if (JreConstants.MAINTENANCE.equals(((MainTenanceData) list.get(0)).getSysJTI())) {
				return mapping.findForward("maintenace");
			}
		}
		request.getSession().invalidate();
		return mapping.findForward("success");
	}

	/**
	 *  ログ.
	 */
	private static Log log = LogFactory.getLog(MainAction.class);

	/**
	 *  ログを取得する.
	 *
	 * @return ログ
	 */
	@Override
	public Log getLog() {
		return log;
	}

}
