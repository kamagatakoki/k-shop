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
 *  Action�N���X�B.
 *  �@�\�T�v�@�F
 *  �@�����e�i���X�̏ꍇ�A�����e�i���X�̂��m�点��ʂɑJ�ڂ���B
 *  �@����̏ꍇ�́A�o�^��ʂɑJ�ڂ���.
 *  ���L�����@�F
 * </pre>
 *
 *
 * @see org.apache.struts.action.Action
 * @author jinhuashi
 * @version 0.1 2006.10.10
 */
public class MainAction extends BaseAction {
	/**
	 * �����e�i���X���؂��s�� .
	 * @param mapping �J�ڐ�̃}�b�s���O
	 * @param form FORM�f�[�^
	 * @param request ���N�G�X�g
	 * @param response ���X�|���X
	 * @return �J�ڐ���
	 * @throws SystemException �V�X�e����O
	 * @throws BusinessException �Ɩ���O
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
	 *  ���O.
	 */
	private static Log log = LogFactory.getLog(MainAction.class);

	/**
	 *  ���O���擾����.
	 *
	 * @return ���O
	 */
	@Override
	public Log getLog() {
		return log;
	}

}
