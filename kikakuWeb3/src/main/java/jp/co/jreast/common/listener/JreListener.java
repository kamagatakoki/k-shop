package jp.co.jreast.common.listener;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.co.intage.framework.log.Loggable;
import jp.co.intage.framework.web.listener.ContextListener;

/**
 * <pre>
 * �R���e�L�X�gListener�N���X�B.
 * �@�\�T�v�@�F�}�X�^�f�[�^�����������s���B
 * </pre>
 *
 * ���L�����@�F
 *
 * @author zhu
 * @version 0.1 2006.10.10
 */
public class JreListener extends ContextListener implements Loggable {

	/**
	 * ���O.
	 */
	private static Log log = LogFactory.getLog(JreListener.class);

	/**
	 * �����������B.
	 *
	 * @param e
	 *            �J�n�C�x���g
	 */
	@Override
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("grjeiojegiorgjeoiwgjieowgjwori");
		super.contextInitialized(e);
		try {

		} catch (RuntimeException re) {
			getLog().error("���X�i�[���g�p���A�G���[���������܂����B", re);
		}
	}

	/**
	 * ���O���擾����.
	 *
	 * @return ���O
	 */
	@Override
	public Log getLog() {
		return log;
	}

}
