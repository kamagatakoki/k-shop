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
 *  Action���N���X�B.
 *  �@�\�T�v�@�F
 *  �@Struts��Action���p������B�T�u�N���X�ł́AException���X���[����B
 *  �@Exception���L���b�`���āA�G���[�������܂Ƃ߂čs���B
 *  ���L�����@�F
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
	 * �A�N�V��������B<p>
	 * ���O�Ɨ�O�����Ȃǋ��ʏ������s��<p>
	 * doTask���ďo���āA��̂Ȑ�����s��.
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping,
	 *      org.apache.struts.action.ActionForm,
	 *      javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 * @param mapping �J�ڐ�̃}�b�s���O
	 * @param form FORM�f�[�^
	 * @param request ���N�G�X�g
	 * @param response ���X�|���X
	 * @return �J�ڐ���
	 * @throws Exception ��O
	 */
	public String execute(ActionMapping mapping, BaseForm form, BindingResult result,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {

			//        	String user_agent = request.getHeader("user-agent");
			//        	if (user_agent.indexOf("MSIE 10") > 0) {
			//        		response.setHeader("X-UA-Compatible", "IE=EmulateIE8");
			//        	}

			getLog().info(MessageUtil.format(request, "�A�N�V�������X�^�[�g����B"));

			HttpSession ss = request.getSession();

			UR00100Data userData = (UR00100Data) ss.getAttribute(JreConstants.SESSION_KEY_USERDATA);
			if (needLogin() && userData == null) {
				result.reject("common.W010");
				return mapping.findForward("SessionTimeOut");
			}

			if (needLogin()) {
				// Cookie �� JSESSIONID �Ɠ����l�� POST/GET �ő��M����Ă��Ȃ���΃G���[�Ƃ���B
				// (CSRF �΍�)
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

			getLog().info(MessageUtil.format(request, "�A�N�V�������I������B"));

			return forward;

		} catch (BusinessException be) {

			// ���O�փG���[�������o��
			getLog().error(be);

			String key = be.getFocus();
			result.rejectValue(key, be.getKey());

			// ���͉�ʂ֖߂�
			return mapping.findForward("inputForward");

		} catch (SystemException se) {
			getLog().error(MessageUtil.format(request, "�x�[�X�A�N�V�������g�p���A�G���[���������܂����B"), se);
			// �V�X�e���G���[��ʂɑJ�ڂ���
			return mapping.findForward(Constants.KEY_PAGE_SYSTEM_ERROR);

		} catch (Exception e) {
			getLog().error(e);
			return mapping.findForward(Constants.KEY_PAGE_SYSTEM_ERROR);

		}

	}

	/**
	 * ���[�U�͎{�ݎ��A��ԃ��X�g���擾����.
	 * @param userData ���[�U�f�[�^
	 * @return list ��ԃ��X�g
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
	 * ���[�U�͎{�ݎ��A��ԃ��X�g���ɕK�v�Ȃ���Ԃ𔻒f����.
	 * @param lv �@���
	 * @return boolean
	 */
	private boolean isRemoveItem(LabelValueBean lv) {
		return lv.getValue().equals(JreConstants.DIV_CODE_SAKUSEI)
				|| lv.getValue().equals(JreConstants.DIV_CODE_SOSINMATU)
				|| lv.getValue().equals(JreConstants.DIV_CODE_SOSINERROR)
				|| lv.getValue().equals(JreConstants.DIV_CODE_DELET);
	}

	/**
	 *  ���O���擾����.
	 *
	 * @return ���O
	 */
	@Override
	public abstract Log getLog();

	/**
	 * ���O�C���͕K�v���ǂ���.
	 * @return boolean
	 */
	protected boolean needLogin() {
		return true;
	}
}
