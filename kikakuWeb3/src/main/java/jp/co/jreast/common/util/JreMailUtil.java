package jp.co.jreast.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import jp.co.intage.framework.util.MailUtil;
import jp.co.intage.framework.util.MimeMail;
import jp.co.jreast.common.JreConstants;

/**
 * メール送信用ツールクラス。.
 *
 * <pre>
 *   機能概要　：画面データよって　関すデータを検索することを処理する .
 *   特記事項　：なし
 * </pre>
 *
 * @author 忻兆君
 */
public class JreMailUtil {

	/**
	 * メールの入力条件 .
	 */
	public static final String[] MAIL_CONDITION = new String[] { "Facilities",
			"GoodsNm", "UrlAddress", "Cmt", "BranchNm", "SenderNm", "SenderTel", "SenderFax" };

	/**
	 * 送信者のキー .
	 */
	private static final String MAIL_FROM = "mail.from";

	/**
	 * BCC .
	 */
	private static final String MAIL_BCC = "mail.bcc";

	/**
	 * CC .
	 */
	private static final String MAIL_CC = "mail.cc";

	/**
	 * 主題 .
	 */
	private static final String MAIL_SUBJECT = "mail.subject";

	/**
	 * ユーザ名前 .
	 */
	private static final String USER_NAME = "user.userName";

	/**
	 * ユーザパースワード .
	 */
	private static final String USER_PASSWORD = "user.userPassword";

	/**
	 * メールテンプレート .
	 */
	private static final String MAIL_TEMPLATE = "mail.template";

	/**
	 * 回答書登録画面を表示するためのURL .
	 */
	public static final String MAIL_URL_ADDRESS = "mail.urlAddress";

	/**
	 * メール Envelope-From.
	 */
	public static final String MAIL_ENVELOPE_FROM = "mail.envelopeFrom";

	/**
	 * メール Replay-To.
	 */
	public static final String MAIL_REPLY_TO = "mail.replyTo";

	/**
	 * メール Return-Path.
	 */
	public static final String MAIL_RETURN_PATH = "mail.returnPath";

	/**
	 * 入力文字列には 特別な文字列を 指定文字に 変更する .
	 *
	 * @param base
	 *            入力データ
	 * @param before
	 *            特別な文字列
	 * @param after
	 *            指定文字
	 * @return 変更した文字列
	 */
	public static String replaceStringEveryCase(String base, String before,
			String after) {
		StringBuffer sb = new StringBuffer();
		String searchStr = base.toLowerCase();
		int searchInd = 0;
		int findInd = 0;
		int beforeLength = before.length();
		before = before.toLowerCase();
		while (findInd >= 0) {
			findInd = searchStr.indexOf(before, searchInd);
			if (findInd < 0) {
				sb = sb.append(base.substring(searchInd));
				break;
			}
			sb = sb.append(base.substring(searchInd, findInd));
			sb = sb.append(after);
			searchInd = findInd + beforeLength;
		}

		return sb.toString();
	}

	/**
	 * 入力文字列には 指定文字配列を 換える .
	 *
	 * @param in
	 *            入力文字列
	 * @param key
	 *            目標文字配列
	 * @param value
	 *            指定文字配列
	 * @return 換えった文字列
	 */
	public static String buildInternal(String in, String[] key, String[] value) {
		String out = in;
		if (key == null || value == null || key.length != value.length) {
			throw new IllegalArgumentException(
					"Cannot build mail text with null parameter or inconsistent number of parameters");
		}
		for (int i = 0; i < key.length; i++) {
			out = replaceStringEveryCase(out, "$" + key[i] + "$", value[i]);
		}

		return out;
	}

	/**
	 * テンプレートファールによって メールボディをセットする .
	 *
	 * @return メールボディ
	 * @throws IOException
	 *             IO例外
	 */
	public static String getMailBody() throws IOException {

		Properties properties = readPropertiesFile();
		InputStream inputStream = null;
		StringBuffer strBuffer = null;
		BufferedReader readBuffer = null;
		try {

			inputStream = JreMailUtil.class
					.getResourceAsStream((String) properties
							.getProperty(MAIL_TEMPLATE));
			readBuffer = new BufferedReader(new InputStreamReader(inputStream, "Shift_JIS"));
			strBuffer = new StringBuffer();
			String str;
			while ((str = readBuffer.readLine()) != null) {
				strBuffer.append(str);
				strBuffer.append("\n");
			}
		} catch (IOException exception) {
			throw exception;
		} finally {
			readBuffer.close();
			inputStream.close();
		}
		return strBuffer.toString();
	}

	/**
	 * 属性ファールによって メール送信情報をセットする .
	 *
	 * @param mail
	 *            メールデータ
	 * @param to
	 *            受信側
	 * @param text
	 *            メールのボディ
	 * @param file
	 *            添付ファイル
	 * @throws IOException
	 *             I/O例外
	 */
	public static void setMailInfo(MimeMail mail, String to, String text,
			File[] file) throws IOException {

		Properties properties = readPropertiesFile();

		// add by youzm for add mail properties 20070117 s
		String envelopeFrom = properties.getProperty(MAIL_ENVELOPE_FROM);
		String replyTo = properties.getProperty(MAIL_REPLY_TO);
		String returnPath = properties.getProperty(MAIL_RETURN_PATH);
		String mailFrom = properties.getProperty(MAIL_FROM);
		String mailBcc = properties.getProperty(MAIL_BCC);
		String mailCc = properties.getProperty(MAIL_CC);
		String mailSubject = properties.getProperty(MAIL_SUBJECT);

		//取りあえず、youzm 2007/03/23
		//mail.setCharset("Shift_JIS");

		if (envelopeFrom != null && !"".equals(envelopeFrom)) {
			mail.setEnvelopeFrom(envelopeFrom);
		}
		if (replyTo != null && !"".equals(replyTo)) {
			mail.setReplyTo(replyTo);
		}
		if (returnPath != null && !"".equals(returnPath)) {
			mail.setReturnPath(returnPath);
		}
		if (mailFrom != null && !"".equals(mailFrom)) {
			mail.setFrom(mailFrom);
		}
		if (mailBcc != null && !"".equals(mailBcc)) {
			mail.setBcc(mailBcc);
		}
		if (mailCc != null && !"".equals(mailCc)) {
			mail.setCc(mailCc);
		}
		if (mailSubject != null && !"".equals(mailSubject)) {
			mail.setSubject(mailSubject);
		}

		// mail.setFrom(properties.getProperty(MAIL_FROM));
		// mail.setBcc(properties.getProperty(MAIL_BCC));
		// mail.setCc(properties.getProperty(MAIL_CC));
		// mail.setSubject(properties.getProperty(MAIL_SUBJECT));

		// add by youzm for add mail properties 20070117 e
		mail.setTo(to);
		mail.setText(text);
		mail.setAttach(file);
	}

	/**
	 * メールに ユーザの情報を セットする .
	 *
	 * @param mailUtil
	 *            メールツールデータ
	 * @throws IOException
	 *             I/O例外
	 */
	public static void setUserInfo(MailUtil mailUtil) throws IOException {

		Properties properties = readPropertiesFile();
		mailUtil.setUserPwd(properties.getProperty(USER_NAME), properties
				.getProperty(USER_PASSWORD));
	}

	/**
	 * 属性ファールをゲットする .
	 *
	 * @return 属性対象
	 * @throws IOException
	 *             I/O例外
	 */
	public static Properties readPropertiesFile() throws IOException {

		InputStream stream = JreMailUtil.class
				.getResourceAsStream(JreConstants.PROPERTIES_FILE_PATH);
		Properties properties = new Properties();
		properties.load(stream);
		return properties;
	}
}
