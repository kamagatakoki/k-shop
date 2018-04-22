package jp.co.jreast.common.actionController;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DownloadAction;

import jp.co.intage.framework.support.ActionMapping;
import jp.co.intage.framework.util.StringUtil;
import jp.co.intage.framework.web.form.BaseForm;
import jp.co.jreast.common.JreConstants;

/**
 * <pre>
 *  Action基底クラス。.
 *  機能概要　：
 *  　StrutsのActionを継承する。
 *  特記事項　：
 * </pre>
 *
 *
 * @author xin
 * @version 0.1 2006.11.10
 */
public abstract class DownloadBaseAction extends DownloadAction {

	/**
	 * Process the specified HTTP request, and create the corresponding HTTP
	 * response (or forward to another web component that will create it).
	 * Return an <code>ActionForward</code> instance describing where and how
	 * control should be forwarded, or <code>null</code> if the response has
	 * already been completed.
	 *
	 * @param mapping The ActionMapping used to select this instance.
	 * @param form The optional ActionForm bean for this request (if any).
	 * @param request The HTTP request we are processing.
	 * @param response The HTTP response we are creating.
	 * @return return information
	 * @throws Exception if an exception occurs.
	 */
	public String execute(ActionMapping mapping, BaseForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		StreamInfo info = getStreamInfo(mapping, form, request, response);

		if (info == null) {
			ActionMessages errors = new ActionMessages();
			ActionMessage error = new ActionMessage("common.W010");
			errors.add("", error);
			saveErrors(request, errors);
			return mapping.findForward("SystemErrorPage");
		}
		String contentType = info.getContentType();
		InputStream stream = info.getInputStream();

		String downFileName = (String) request.getAttribute(JreConstants.DOWNLOAD_FILE_NAME);

		try {
			if (!StringUtil.isEmpty(downFileName)) {
				String fileNameTmp = downFileName.toLowerCase();
				if (fileNameTmp.endsWith("xls")) {
					response.setHeader("Content-disposition", "Attachment; filename=" + downFileName);
				} else {
					response.setHeader("Content-disposition", "filename=" + downFileName);
				}
			}
			response.setContentType(contentType);
			copy(stream, response.getOutputStream());
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
		// Tell Struts that we are done with the response.
		return null;
	}
}
