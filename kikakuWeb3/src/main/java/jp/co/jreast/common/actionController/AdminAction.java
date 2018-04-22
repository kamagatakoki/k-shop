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
 * �y�p�~�z
 *
 * <pre>
 *  ���Z�b�g�A�N�V�����N���X�B.
 *  �@�\�T�v�@�F
 *  ���L�����@�F
 * </pre>
 * @version 0.1 2007/02/14
 * @author ��
 */
public class AdminAction extends BaseAction {

	@Override
	public String executeAction(ActionMapping mapping, BaseForm form, BindingResult result, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return reset(mapping, form, request, response);
	}

	/**
	 * �y�p�~�z
	 *
	 *  �����������̃��Z�b�g.
	 *
	 * @param mapping �J�ڐ�̃}�b�s���O
	 * @param form FORM�f�[�^
	 * @param request ���N�G�X�g
	 * @param response ���X�|���X
	 * @return �J�ڐ���
	 * @throws SystemException �V�X�e����O
	 * @throws BusinessException �Ɩ���O
	 */
	public String reset(ActionMapping mapping, BaseForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws SystemException, BusinessException {
		getLog().info("AdminAction::reset");
		return null;
	}

	/**
	 *  ���O���擾����.
	 *
	 * @return ���O
	 */
	@Override
	public Log getLog() {
		return log;
	}

	/**
	 *  ���O.
	 */
	private static Log log = LogFactory.getLog(AdminAction.class);

	/**
	 * ���O�C���͕K�v���ǂ���.
	 * @return boolean
	 */
	@Override
	protected boolean needLogin() {
		return false;
	}

}
