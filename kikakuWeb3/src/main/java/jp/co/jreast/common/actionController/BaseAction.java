package jp.co.jreast.common.actionController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.springframework.validation.BindingResult;

import jp.co.intage.framework.Constants;
import jp.co.intage.framework.exception.BusinessException;
import jp.co.intage.framework.exception.SystemException;
import jp.co.intage.framework.log.Loggable;
import jp.co.intage.framework.support.ActionMapping;
import jp.co.intage.framework.util.MessageUtil;
import jp.co.intage.framework.web.form.BaseForm;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.FutaiViewData;
import jp.co.jreast.common.support.LabelValueBean;
import jp.co.jreast.common.util.KikakuWebUtil;
import jp.co.jreast.ur00100.data.UR00100Data;

/**
 * <pre>
 *  Action基底クラス。.
 *  機能概要　：
 *  　StrutsのActionを継承する。サブクラスでは、Exceptionをスローする。
 *  　Exceptionをキャッチして、エラー処理をまとめて行う。
 *  特記事項　：
 * </pre>
 *
 *
 * @see org.apache.struts.action.Action
 * @author zhulq
 * @version 0.1 2006.10.10
 */
public abstract class BaseAction implements Loggable {

	public abstract String doTask(ActionMapping mapping, BaseForm form, BindingResult result,
			HttpServletRequest request, HttpServletResponse response) throws Exception;

	/**
	 * アクション制御。<p>
	 * ログと例外処理など共通処理を行う<p>
	 * doTaskを呼出して、具体な制御を行う.
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping,
	 *      org.apache.struts.action.ActionForm,
	 *      javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 * @param mapping 遷移先のマッピング
	 * @param form FORMデータ
	 * @param request リクエスト
	 * @param response レスポンス
	 * @return 遷移先情報
	 * @throws Exception 例外
	 */
	public String execute(ActionMapping mapping, BaseForm form, BindingResult result,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {

			//        	String user_agent = request.getHeader("user-agent");
			//        	if (user_agent.indexOf("MSIE 10") > 0) {
			//        		response.setHeader("X-UA-Compatible", "IE=EmulateIE8");
			//        	}

			getLog().info(MessageUtil.format(request, "アクションがスタートする。"));

			HttpSession ss = request.getSession();

			UR00100Data userData = (UR00100Data) ss.getAttribute(JreConstants.SESSION_KEY_USERDATA);
			if (needLogin() && userData == null) {
				result.reject("common.W010");
				return mapping.findForward("SessionTimeOut");
			}

			if (needLogin()) {
				// Cookie の JSESSIONID と同じ値が POST/GET で送信されてこなければエラーとする。
				// (CSRF 対策)
				String key = request.getSession().getId();
				String val = request.getParameter(key);
				if (!key.equals(val)) {
					return mapping.findForward("redirect:/ur09002.do");
				}
			}

			if (userData != null && ss.getAttribute(JreConstants.LIST_NAME_DIV_STATUS) == null) {
				ss.setAttribute(JreConstants.LIST_NAME_DIV_STATUS,
						getStatusList(userData));
			}
			FutaiViewData futaiData = (FutaiViewData) ss.getAttribute("test");
			if (futaiData == null) {
				futaiData = new FutaiViewData();
			}
			String forward = doTask(mapping, form, result, request, response);

			getLog().info(MessageUtil.format(request, "アクションが終了する。"));

			return forward;

		} catch (BusinessException be) {

			// ログへエラーを書き出す
			getLog().error(be);

			String key = be.getFocus();
			result.rejectValue(key, be.getKey());

			// 入力画面へ戻る
			return mapping.findForward("inputForward");

		} catch (SystemException se) {
			getLog().error(MessageUtil.format(request, "ベースアクションを使用時、エラーが発生しました。"), se);
			// システムエラー画面に遷移する
			return mapping.findForward(Constants.KEY_PAGE_SYSTEM_ERROR);

		} catch (Exception e) {
			getLog().error(e);
			return mapping.findForward(Constants.KEY_PAGE_SYSTEM_ERROR);

		}

	}

	/**
	 * ユーザは施設時、状態リストを取得する.
	 * @param userData ユーザデータ
	 * @return list 状態リスト
	 */
	private List getStatusList(UR00100Data userData) {
		if (userData == null) {
			return null;
		}
		List statusList = JreConstants.getStatusLvList();
		if (KikakuWebUtil.isFacilities(userData.getUser().getUserDiv())) {
			List facilityStatusList = new ArrayList();
			for (Iterator i = statusList.iterator(); i.hasNext();) {
				LabelValueBean lv = (LabelValueBean) i.next();
				if (!isRemoveItem(lv)) {
					facilityStatusList.add(lv);
				}
			}
			return facilityStatusList;
		} else {
			return statusList;
		}
	}

	/**
	 * ユーザは施設時、状態リスト中に必要ない状態を判断する.
	 * @param lv 　状態
	 * @return boolean
	 */
	private boolean isRemoveItem(LabelValueBean lv) {
		return lv.getValue().equals(JreConstants.DIV_CODE_SAKUSEI)
				|| lv.getValue().equals(JreConstants.DIV_CODE_SOSINMATU)
				|| lv.getValue().equals(JreConstants.DIV_CODE_SOSINERROR)
				|| lv.getValue().equals(JreConstants.DIV_CODE_DELET);
	}

	/**
	 *  ログを取得する.
	 *
	 * @return ログ
	 */
	@Override
	public abstract Log getLog();

	/**
	 * ログインは必要かどうか.
	 * @return boolean
	 */
	protected boolean needLogin() {
		return true;
	}
}
