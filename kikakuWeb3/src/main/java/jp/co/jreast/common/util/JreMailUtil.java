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
 * ���[�����M�p�c�[���N���X�B.
 *
 * <pre>
 *   �@�\�T�v�@�F��ʃf�[�^����ā@�ւ��f�[�^���������邱�Ƃ��������� .
 *   ���L�����@�F�Ȃ�
 * </pre>
 *
 * @author �v���N
 */
public class JreMailUtil {

	/**
	 * ���[���̓��͏��� .
	 */
	public static final String[] MAIL_CONDITION = new String[] { "Facilities",
			"GoodsNm", "UrlAddress", "Cmt", "BranchNm", "SenderNm", "SenderTel", "SenderFax" };

	/**
	 * ���M�҂̃L�[ .
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
	 * ��� .
	 */
	private static final String MAIL_SUBJECT = "mail.subject";

	/**
	 * ���[�U���O .
	 */
	private static final String USER_NAME = "user.userName";

	/**
	 * ���[�U�p�[�X���[�h .
	 */
	private static final String USER_PASSWORD = "user.userPassword";

	/**
	 * ���[���e���v���[�g .
	 */
	private static final String MAIL_TEMPLATE = "mail.template";

	/**
	 * �񓚏��o�^��ʂ�\�����邽�߂�URL .
	 */
	public static final String MAIL_URL_ADDRESS = "mail.urlAddress";

	/**
	 * ���[�� Envelope-From.
	 */
	public static final String MAIL_ENVELOPE_FROM = "mail.envelopeFrom";

	/**
	 * ���[�� Replay-To.
	 */
	public static final String MAIL_REPLY_TO = "mail.replyTo";

	/**
	 * ���[�� Return-Path.
	 */
	public static final String MAIL_RETURN_PATH = "mail.returnPath";

	/**
	 * ���͕�����ɂ� ���ʂȕ������ �w�蕶���� �ύX���� .
	 *
	 * @param base
	 *            ���̓f�[�^
	 * @param before
	 *            ���ʂȕ�����
	 * @param after
	 *            �w�蕶��
	 * @return �ύX����������
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
	 * ���͕�����ɂ� �w�蕶���z��� ������ .
	 *
	 * @param in
	 *            ���͕�����
	 * @param key
	 *            �ڕW�����z��
	 * @param value
	 *            �w�蕶���z��
	 * @return ��������������
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
	 * �e���v���[�g�t�@�[���ɂ���� ���[���{�f�B���Z�b�g���� .
	 *
	 * @return ���[���{�f�B
	 * @throws IOException
	 *             IO��O
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
	 * �����t�@�[���ɂ���� ���[�����M�����Z�b�g���� .
	 *
	 * @param mail
	 *            ���[���f�[�^
	 * @param to
	 *            ��M��
	 * @param text
	 *            ���[���̃{�f�B
	 * @param file
	 *            �Y�t�t�@�C��
	 * @throws IOException
	 *             I/O��O
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

		//��肠�����Ayouzm 2007/03/23
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
	 * ���[���� ���[�U�̏��� �Z�b�g���� .
	 *
	 * @param mailUtil
	 *            ���[���c�[���f�[�^
	 * @throws IOException
	 *             I/O��O
	 */
	public static void setUserInfo(MailUtil mailUtil) throws IOException {

		Properties properties = readPropertiesFile();
		mailUtil.setUserPwd(properties.getProperty(USER_NAME), properties
				.getProperty(USER_PASSWORD));
	}

	/**
	 * �����t�@�[�����Q�b�g���� .
	 *
	 * @return �����Ώ�
	 * @throws IOException
	 *             I/O��O
	 */
	public static Properties readPropertiesFile() throws IOException {

		InputStream stream = JreMailUtil.class
				.getResourceAsStream(JreConstants.PROPERTIES_FILE_PATH);
		Properties properties = new Properties();
		properties.load(stream);
		return properties;
	}
}
