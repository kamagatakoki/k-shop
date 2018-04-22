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
 * ウンロード用　クラスアクション。.
 * 機能概要    ：  ウンロード用　クラスアクション。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/11/17
 */
public class JreDownloadAction extends DownloadBaseAction {

	/**
	 * ファールをダウンロードする.
	 * @param mapping 遷移先のマッピング
	 * @param form FORMデータ
	 * @param request リクエスト
	 * @param response レスポンス
	 * @exception Exception 例外
	 * @return 遷移先情報
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
	 * ダウンロードするファールタイプをゲットする.
	 * @param fileName ファール名称
	 * @return ファールタイプ
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
     * ユーザ有効性を確認する.
     * @param ss セッションデータ
     * @return TRUE:有効
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
