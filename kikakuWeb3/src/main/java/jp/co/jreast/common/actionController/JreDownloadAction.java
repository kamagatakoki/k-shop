package jp.co.jreast.common.actionController;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.jreast.common.JreConstants;
import jp.co.jreast.ur00100.data.UR00100Data;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DownloadAction;

/**
 * <pre>
 * �E�����[�h�p�@�N���X�A�N�V�����B.
 * �@�\�T�v    �F  �E�����[�h�p�@�N���X�A�N�V�����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/11/17
 */
public class JreDownloadAction extends DownloadBaseAction {

	/**
	 * �t�@�[�����_�E�����[�h����.
	 * @param mapping �J�ڐ�̃}�b�s���O
	 * @param form FORM�f�[�^
	 * @param request ���N�G�X�g
	 * @param response ���X�|���X
	 * @exception Exception ��O
	 * @return �J�ڐ���
	 */
	protected StreamInfo getStreamInfo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		if (!validateUser(request.getSession())) {
			return null;
		}
		String strPath = (String) request
				.getAttribute(JreConstants.DOWNLOAD_KEY);
		File file = new File(strPath);
		return new DownloadAction.FileStreamInfo(getContentType(strPath), file);
	}
	
	/**
	 * �_�E�����[�h����t�@�[���^�C�v���Q�b�g����.
	 * @param fileName �t�@�[������
	 * @return �t�@�[���^�C�v
	 */
	private String getContentType(String fileName) {
		String fileNameTmp = fileName.toLowerCase();
		String ret = "";
		if (fileNameTmp.endsWith("txt")) {
			ret = "text/plain";
		} else if (fileNameTmp.endsWith("gif")) {
			ret = "image/gif";
		} else if (fileNameTmp.endsWith("jpg")) {
			ret = "image/jpeg";
		} else if (fileNameTmp.endsWith("jpeg")) {
			ret = "image/jpeg";
		} else if (fileNameTmp.endsWith("jpe")) {
			ret = "image/jpeg";
		} else if (fileNameTmp.endsWith("zip")) {
			ret = "application/zip";
		} else if (fileNameTmp.endsWith("rar")) {
			ret = "application/rar";
		} else if (fileNameTmp.endsWith("doc")) {
			ret = "application/msword";
		} else if (fileNameTmp.endsWith("ppt")) {
			ret = "application/vnd.ms-powerpoint";
		} else if (fileNameTmp.endsWith("xls")) {
			ret = "application/vnd.ms-excel";
		} else if (fileNameTmp.endsWith("html")) {
			ret = "text/html";
		} else if (fileNameTmp.endsWith("htm")) {
			ret = "text/html";
		} else if (fileNameTmp.endsWith("tif")) {
			ret = "image/tiff";
		} else if (fileNameTmp.endsWith("tiff")) {
			ret = "image/tiff";
		} else if (fileNameTmp.endsWith("pdf")) {
			ret = "application/pdf";
		}
		return ret;
	}
	
    /**
     * ���[�U�L�������m�F����.
     * @param ss �Z�b�V�����f�[�^
     * @return TRUE:�L��
     */
	private boolean validateUser(HttpSession ss) {

		UR00100Data userData = (UR00100Data) ss
				.getAttribute(JreConstants.SESSION_KEY_USERDATA);
		if (userData == null) {
			return false;
		}
		return true;
	}

}
