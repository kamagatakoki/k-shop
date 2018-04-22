package jp.co.jreast.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.web.multipart.MultipartFile;

import jp.co.intage.framework.dao.IDao;
import jp.co.intage.framework.exception.BusinessException;
import jp.co.intage.framework.exception.SystemException;
import jp.co.intage.framework.util.DateUtil;
import jp.co.intage.framework.util.MailUtil;
import jp.co.intage.framework.util.MessageResources;
import jp.co.intage.framework.util.MimeMail;
import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.PlanAnsData;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.data.no1data.BaseNo1Data;
import jp.co.jreast.common.data.no1data.INo1CommonData;
import jp.co.jreast.common.data.no1data.No1PlanNoBean;
import jp.co.jreast.common.data.no1data.No1PlanNoData;
import jp.co.jreast.common.report.IRptSource;
import jp.co.jreast.common.validator.FMKanJiCheck;
import jp.co.jreast.ur00100.data.UR00100Data;
import jp.co.jreast.ur02000.data.UR02000Data;
import net.sf.jasperreports.web.actions.AbstractAction.ActionErrors;

/**
 * <pre>
 *     �v���W�F�N�g�̃c�[���N���X�B.
 *    �@�\�T�v    �F  �v���W�F�N�g�̃c�[��
 *    ���L����    �F  ����
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/10/10
 */
public class KikakuWebUtil {

	/**
	 * ����`�t�@�C��.
	 */
	private static Properties kikakuProps;

	/**
	 * ���[����`�t�@�C��.
	 */
	private static Properties mailProps;

	/**
	 * ����`�t�@�C�����擾����.
	 *
	 * @param inFile
	 *            ����`�t�@�C��
	 * @return ����`�t�@�C��
	 * @throws SystemException
	 *             �V�X�e����O
	 */
	private static Properties getKikakuProps(InputStream inFile)
			throws SystemException {
		if (kikakuProps != null) {
			return kikakuProps;
		}

		kikakuProps = new Properties();
		try {
			kikakuProps.load(inFile);
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

		return kikakuProps;
	}

	/**
	 * ���[����`�t�@�C�����擾����.
	 *
	 * @param inFile
	 *            ���[����`�t�@�C��
	 * @return ���[����`�t�@�C��
	 * @throws SystemException
	 *             �V�X�e����O
	 */
	private static Properties getMailProps(InputStream inFile)
			throws SystemException {
		if (mailProps != null) {
			return mailProps;
		}

		mailProps = new Properties();
		try {
			mailProps.load(inFile);
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new SystemException(e);
		}

		return mailProps;
	}

	/**
	 * �{�݃R�[�h��[����.
	 *
	 * @param strLeft
	 *            String
	 * @param strRight
	 *            String
	 * @param ch
	 *            char
	 * @return String
	 */
	public static String appendFacilityCode(String strLeft, String strRight,
			char ch) {
		StringBuffer sb = new StringBuffer();
		if (ch == JreConstants.FACILITY1_FLAG) {

			sb.append(rpad(strLeft, 4, ch));
			sb.append(rpad(strRight, 2, ch));

		} else {
			if ((null == strLeft || "".equals(strLeft))
					&& (null == strRight || "".equals(strRight))) {

				sb.append(rpad(strLeft, 4, JreConstants.FACILITY1_FLAG));
				sb.append(rpad(strRight, 2, JreConstants.FACILITY1_FLAG));

			} else {

				sb.append(rpad(strLeft, 4, ch));
				sb.append(rpad(strRight, 2, ch));

			}
		}
		return sb.toString();
	}

	/**
	 * �T�u�����z��ƕԂ��A�����s���� ������̌�œ���char���l�ߌ����������A ������̌�char��؂�.
	 *
	 * @param str
	 *            ������
	 * @param length
	 *            �T�C�Y
	 * @param ch
	 *            ����
	 * @return ������
	 */
	public static String rpad(String str, int length, char ch) {

		if (length <= 0) {
			return "";
		}

		if (str == null) {
			str = "";
		}

		if (str.length() > length) {
			return str.substring(0, length);
		}

		StringBuffer sb = new StringBuffer();

		sb.append(str);

		for (int i = 0; i < length - str.length(); i++) {
			sb.append(ch);
		}

		return sb.toString();
	}

	/**
	 * mail���M.
	 *
	 * @param mail
	 *            ���[��
	 * @return ���M������true ���M���s��false
	 * @throws SystemException
	 *             �V�X�e����O
	 * @throws IOException
	 *             I/O��O
	 */
	public static boolean mailSend(MimeMail mail) throws SystemException,
			IOException {

		InputStream inFile = JreConstants.getMailInputStream();

		MailUtil sender = MailUtil.getInstance(getMailProps(inFile));
		JreMailUtil.setUserInfo(sender);
		sender.smtpSend(mail);
		return mail.isSend();
	}

	/**
	 * �l���擾����.
	 *
	 * @param key
	 *            �L�[
	 * @return �l
	 * @throws SystemException
	 *             �V�X�e����O
	 */
	public static String getPropertiesValue(String key) throws SystemException {

		InputStream inFile = JreConstants.getKikakuWebPropertiesStream();

		return getKikakuProps(inFile).getProperty(key);

	}

	/**
	 * �Y���Ɩ��N�x���擾����.
	 *
	 * @return year �Y���Ɩ��N�x
	 */
	public static String getGyomuYear() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMM");
		String yearAndMonth = sf.format(new Date());
		// �Ɩ��J�n���̑O�̌��́A�O�Ɩ��N�x�ɐݒ肷��.
		if (yearAndMonth.substring(4, 6).compareTo(JreConstants.GYOMU_MONTH) >= 0) {
			return yearAndMonth.substring(0, 4);
		} else {
			return Integer.toString(Integer.parseInt(yearAndMonth.substring(0,
					4)) - 1);
		}
	}

	/**
	 * �V�X�e���N�x���擾����.
	 *
	 * @return year �V�X�e���N�x
	 */
	public static String getCurrentYear() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMM");
		String yearAndMonth = sf.format(new Date());
		// �V�X�e���N�x��Ԃ�.
		return yearAndMonth.substring(0, 4);

	}

	/**
	 * ������ɂ� ���ʂȋL����u��������.
	 *
	 * @param words
	 *            ������
	 * @return String ���ʂȋL����u�������镶����
	 */
	public static String replaceSpecialSymbolInDate(String words) {
		if (StringUtil.isEmpty(words)) {
			return words;
		}

		if (isDateWithSymbol(JreConstants.DATE_SYMBOL1, words)) {
			return words.replaceAll(JreConstants.DATE_SYMBOL1,
					JreConstants.STRING_NULL);
		} else if (isDateWithSymbol(JreConstants.DATE_SYMBOL2, words)) {
			return words.replaceAll(JreConstants.DATE_SYMBOL2,
					JreConstants.STRING_NULL);
		}
		return words;
	}

	/**
	 * ���t�̔��f.
	 *
	 * @param symbol
	 *            ���ʂȋL��
	 * @param words
	 *            ������
	 * @return boolean
	 */
	private static boolean isDateWithSymbol(String symbol, String words) {
		return words.indexOf(symbol) == 4 && words.lastIndexOf(symbol) == 7;
	}

	/**
	 * �\���p���t���擾����.
	 *
	 * @param word
	 *            ���͕�����
	 * @param ymd
	 *            ���f����������
	 * @return �\���p���t
	 */
	public static String getDisplayDate(String word, String ymd) {
		if (StringUtil.isEmpty(word)) {
			return null;
		}
		try {
			Date date = DateUtil.string2Date(ymd, "yyyyMMdd");
			if (!DateUtil.date2String(date, "yyyyMMdd").equals(ymd)) {
				return word;
			}
			return DateUtil.date2String(date, "yyyy/MM/dd");
		} catch (Exception e) {
			return word;
		}
	}

	/**
	 * ���Ԃ̕�����ɂ� ���Ԍ����擾����.
	 *
	 * @param time
	 *            ���Ԃ̕����� mmss
	 * @return ���Ԍ�
	 */
	public static String getHourFormTime(String time) {

		if (StringUtil.isEmpty(time)) {
			return null;
		}

		if (time.length() != 4) {
			return time;
		}

		return time.substring(0, 2);
	}

	/**
	 * ���[�U��Ԕ��f����.
	 *
	 * @param userStatus
	 *            ���[�U���
	 * @return true:JR��
	 */
	public static boolean isJR(String userStatus) {

		if (ArrayUtils.indexOf(JreConstants.USER_DIV_JR_RANG, userStatus) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * ���[�U��Ԕ��f����.
	 *
	 * @param userStatus
	 *            ���[�U���
	 * @return TRUE:FACILITIES��
	 */
	public static boolean isFacilities(String userStatus) {

		if (ArrayUtils.indexOf(JreConstants.USER_DIV_FACILITIES_RANG,
				userStatus) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * ���[�U��Ԕ��f����.
	 *
	 * @param userStatus
	 *            ���[�U���
	 * @return TRUE:�Ǘ���
	 */
	public static boolean isManager(String userStatus) {

		if (ArrayUtils.indexOf(JreConstants.USER_DIV_MANAGER_RANG, userStatus) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * ���Ԃ̕�����ɂ� �������擾����.
	 *
	 * @param time
	 *            ���Ԃ̕�����
	 * @return ����
	 */
	public static String getMinuteFromTime(String time) {

		if (StringUtil.isEmpty(time)) {
			return null;
		}

		if (time.length() != 4) {
			return time;
		}

		return time.substring(2, 4);
	}

	/**
	 * ���͎��Ԃƕ��ɂ���� �S���̃^�C�����쐬����.
	 *
	 * @param hour
	 *            ����
	 * @param minute
	 *            ��
	 * @return �S���̃^�C��
	 */
	public static String buildTime(String hour, String minute) {

		String strHour, strMinute;

		if (StringUtil.isEmpty(hour) || StringUtil.isEmpty(minute)) {
			return "";
		}

		strHour = new String(hour);
		strMinute = new String(minute);
		strHour = StringUtil.lpad(strHour, 2, '0');
		strMinute = StringUtil.lpad(strMinute, 2, '0');
		return strHour + strMinute;
	}

	/**
	 * �Z�b�V�����ɂ� ��挟���f�[�^���X�V����.
	 *
	 * @param request
	 *            ���N�G�X�g
	 */
	public static void updateAnsSearchData(HttpServletRequest request) {

		AnsSearchData ansSearchData = (AnsSearchData) request.getSession()
				.getAttribute(JreConstants.KEY_ANSSEARCHDATA_DATA);
		ansSearchData.setCareerNo(new Integer(ansSearchData.getCareerNo()
				.intValue() + 1));
		request.getSession().setAttribute(JreConstants.KEY_ANSSEARCHDATA_DATA,
				ansSearchData);
	}

	/**
	 * �����̏�ԂɂȂ�ꍇ�A����ԍ����X�V����.
	 *
	 * @param request
	 *            ���N�G�X�g
	 * @param status
	 *            ���
	 */
	public static void updateAnsSearchDataWhenComplete(
			HttpServletRequest request, Integer status) {
		AnsSearchData ansSearchData = (AnsSearchData) request.getSession()
				.getAttribute(JreConstants.KEY_ANSSEARCHDATA_DATA);
		if (status == null) {
			ansSearchData.setCareerNo(new Integer(ansSearchData.getCareerNo()
					.intValue() + 1));
		} else if (JreConstants.STATUS_COMPLETE.compareTo(status) == 0) {
			ansSearchData.setCareerNo(new Integer(ansSearchData.getCareerNo()
					.intValue() + 2));
		} else {
			ansSearchData.setCareerNo(new Integer(ansSearchData.getCareerNo()
					.intValue() + 1));
		}

		request.getSession().setAttribute(JreConstants.KEY_ANSSEARCHDATA_DATA,
				ansSearchData);
	}

	/**
	 * �t�H�[�����ɂ̉񓚏��f�[�^�ɂ���� ���N�G�X�g�̊�挟���f�[�^���X�V����.
	 *
	 * @param planAnsData
	 *            �񓚏��f�[�^
	 * @param request
	 *            ���N�G�X�g
	 */
	public static void updateAnsSearchData(PlanAnsData planAnsData,
			HttpServletRequest request) {

		AnsSearchData ansSearchData = (AnsSearchData) request.getSession()
				.getAttribute(JreConstants.KEY_ANSSEARCHDATA_DATA);
		ansSearchData.setCareerNo(new Integer(planAnsData.getCareerNo()
				.intValue()));
		request.getSession().setAttribute(JreConstants.KEY_ANSSEARCHDATA_DATA,
				ansSearchData);
	}

	/**
	 * �R�s�[�t�H�[�����N���A����.
	 *
	 * @param request
	 *            ���N�G�X�g
	 */
	public static void cleanCopyForm(HttpServletRequest request) {
		request.getSession().removeAttribute(JreConstants.KEY_COPYFORM);
	}

	/**
	 * ���ׂẲ�ʂ��Q�ƕs�̔��f(�h��).
	 *
	 * @param userData
	 *            ���[�U�f�[�^
	 * @return boolean
	 */
	public static boolean isAllNoDisplay(UserData userData) {
		if (userData.getReferComp1().equals(JreConstants.FLG_FALSE)
				&& userData.getReferComp2().equals(JreConstants.FLG_FALSE)
				&& userData.getReferComp3().equals(JreConstants.FLG_FALSE)
				&& userData.getReferComp4().equals(JreConstants.FLG_FALSE)
				&& userData.getReferComp5().equals(JreConstants.FLG_FALSE)) {
			return true;
		}

		return false;
	}

	/**
	 * ���ׂẲ�ʂ��Q�ƕs�̔��f(�h���ȊO).
	 *
	 * @param userData
	 *            ���[�U�f�[�^
	 * @return boolean
	 */
	public static boolean isAllNoDisplayForOthers(UserData userData) {
		if (userData.getReferComp1().equals(JreConstants.FLG_FALSE)
				&& userData.getReferComp4().equals(JreConstants.FLG_FALSE)) {
			return true;
		}

		return false;
	}

	/**
	 * ���ID���擾����(�h��).
	 *
	 * @param userData
	 *            ���[�U�f�[�^
	 * @return ���ID
	 */
	public static String getForwardScreenName(UserData userData) {

		if (userData.getReferComp2().equals(JreConstants.FLG_TRUE)) {
			return JreConstants.SCREEN_ID_NO2;
		}

		if (userData.getReferComp3().equals(JreConstants.FLG_TRUE)) {
			return JreConstants.SCREEN_ID_NO3;
		}

		if (userData.getReferComp4().equals(JreConstants.FLG_TRUE)) {
			return JreConstants.SCREEN_ID_NO4;
		}

		return JreConstants.SCREEN_ID_NO5;
	}

	/**
	 * No1��ʂ��Q�ƕs�̔��f.
	 *
	 * @param userData
	 *            ���[�U�f�[�^
	 * @return boolean
	 */
	public static boolean isNo1Display(UserData userData) {
		return userData.getReferComp1().equals(JreConstants.FLG_TRUE);
	}

	/**
	 * �u�����v��ԍX�V����.
	 *
	 * @param planAnsNo
	 *            �񓚏��R�[�h
	 * @param careerNo
	 *            ����ԍ�
	 * @param dao
	 *            �f�[�^�x�[�X�𑀍삷�I�u�W�F�N�g
	 */
	public static void updateFinishStatus(Long planAnsNo, Integer careerNo,
			IDao dao) {

		AnsSearchData ansSearchData = new AnsSearchData();
		ansSearchData.setPlanAnsNo(new Long(planAnsNo.longValue()));
		ansSearchData.setCareerNo(new Integer(careerNo.intValue() + 1));
		dao.update("PlanAnsFlgRestore", ansSearchData.getPlanAnsNo());
		dao.insert("insertFinishStatus", ansSearchData);
	}

	/**
	 * ���M�敪�̓��[�����ǂ���.
	 *
	 * @param sendFlg
	 *            ���M�敪
	 * @return boolean
	 */
	public static boolean isMailSend(String sendFlg) {
		return sendFlg.equals(JreConstants.SEND_DIV_FLAG_MAIL);
	}

	/**
	 * ���M�敪�̓t�@�N�X���ǂ���.
	 *
	 * @param sendFlg
	 *            ���M�敪
	 * @return boolean
	 */
	public static boolean isFaxSend(String sendFlg) {
		return sendFlg.equals(JreConstants.SEND_DIV_FLAG_FAX);
	}

	/**
	 * Fax���M�𔻒f.
	 *
	 * @param data
	 *            �m���P�f�[�^
	 * @return �e�������M��
	 */
	public static boolean isFaxSend(BaseNo1Data data) {
		return isFaxSend(data.getPlanAnsData().getSendDiv().toString());
	}

	/**
	 * Fax���M�𔻒f.
	 *
	 * @param data
	 *            �񓚏��f�[�^
	 * @return �e�������M��
	 */
	public static boolean isFaxSend(PlanAnsData data) {
		return isFaxSend(data.getSendDiv().toString());
	}

	/**
	 * �����̔��f.
	 *
	 * @param strNum
	 *            ���͕�����
	 * @return boolean
	 */
	public static boolean isNumber(String strNum) {
		if (StringUtil.isEmpty(strNum)) {
			return false;
		}

		Pattern p = Pattern.compile("[0-9]*");
		Matcher m = p.matcher(strNum);
		return m.matches();
	}

	/**
	 * �p�����̔��f.
	 *
	 * @param str
	 *            ���͕�����
	 * @return boolean
	 */
	public static boolean isAlphaNum(String str) {
		if (StringUtil.isEmpty(str)) {
			return false;
		}

		Pattern p = Pattern.compile("[0-9A-Za-z]*");
		Matcher m = p.matcher(str);
		return m.matches();
	}

	/**
	 * ������t�H�}�b�g�̌��؁i###.##�j.
	 *
	 * @param strFloat
	 *            ������
	 * @return TRUE:###.##
	 */
	public static boolean isFloat(String strFloat) {
		if (StringUtil.isEmpty(strFloat)) {
			return true;
		}

		// �_�̂ݓ��̓`�F�b�N�ǉ� 2009/11/13 add by s31109
		if (!checkDotsOnly(strFloat)) {
			return false;
		}

		Pattern p = Pattern.compile("^\\-{0,1}[0-9]{0,}\\.{0,1}[0-9]{0,}$");
		Matcher m = p.matcher(strFloat);
		return m.matches();
	}

	/**
	 * FM�����̔��f .
	 *
	 * @param str
	 *            ���͕�����
	 * @return boolean
	 */
	public static String isKanji(String str) {
		if (StringUtil.isEmpty(str)) {
			return "";
		}

		String rtn = FMKanJiCheck.validateOneString(str);
		if (str.length() > 0) {
			return rtn;
		}
		return "";
	}

	/**
	 * ���p����������.
	 *
	 * @param str
	 *            str
	 * @return ����
	 */
	public static boolean isHalf(String str) {
		if (StringUtil.isEmpty(str)) {
			return true;
		}
		Pattern p = Pattern.compile("^[�-�|!-~]*$");
		Matcher m = p.matcher(str);
		return m.matches();
	}

	/**
	 * �A����Ȃǂ̔��f.
	 *
	 * @param strNum
	 *            ���͕�����
	 * @return boolean
	 */
	public static boolean isTelNum(String strNum) {
		if (StringUtil.isEmpty(strNum)) {
			return true;
		}

		Pattern p = Pattern.compile("[0-9\\-]*");
		Matcher m = p.matcher(strNum);
		return m.matches();
	}

	/**
	 * ���N�G�X�g���當������擾����.
	 *
	 * @param str
	 *            ������
	 * @return ������
	 * @throws SystemException
	 *             �V�X�e����O
	 */
	public static String getRequestValue(String str) throws SystemException {
		try {
			return new String(str.getBytes("ISO-8859-1"), "MS932");
		} catch (UnsupportedEncodingException e) {
			throw new SystemException(e);
		}
	}

	/**
	 * �̔� .
	 *
	 * @param bean .
	 * @param plansNoStrParam .
	 * @return .
	 */
	public static No1PlanNoData subPlanNoService(final No1PlanNoBean bean,
			final String plansNoStrParam) {
		No1PlanNoData planNoData = new No1PlanNoData();

		String plansNoStr = plansNoStrParam;
		if (plansNoStr == null) {
			AnsSearchData param = new AnsSearchData();
			param.setCareerNo(bean.getCareerNo());
			param.setPlanAnsNo(bean.getPlanAnsNo());
			plansNoStr = HarvestUtil.getIdentPlanNo(param);
			if (plansNoStr.length() == 7) {
				plansNoStr = plansNoStr.substring(0, 6);
				planNoData.setOverFlow(true);
			} else {
				planNoData.setOverFlow(false);
			}
		}

		planNoData.setKind(bean.getKind().toString());
		planNoData.setFacilityCd(bean.getFacilityCd());
		planNoData.setPlanAnsNo(bean.getPlanAnsNo());

		planNoData.setBranchCd(plansNoStr.substring(0, 2));
		planNoData.setYearNo(plansNoStr.substring(2, 3));
		planNoData.setSeasonDiv(plansNoStr.substring(3, 4));
		// 2007�N�x�̍̔Ԃ�30����n�܂� jinhuashi 2007/
		String subPlansNo = plansNoStr.substring(4, 6);
		if (plansNoStr.substring(2, 3).equals("7")) {
			if (Integer.parseInt(subPlansNo) < 30) {
				subPlansNo = new Integer(Integer.parseInt(subPlansNo) + 30)
						.toString();
			}
		}
		// end
		planNoData.setPlanNo(subPlansNo);
		plansNoStr = plansNoStr.substring(0, 4) + subPlansNo;
		planNoData.setPlansNoStr(plansNoStr);

		return planNoData;
	}

	/**
	 * ��ʂ͏h���̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isShukuhaku(String kind) {
		return JreConstants.KIND_FLG_STAYING.equals(kind);
	}

	/**
	 * ��ʂ͏h���̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isShukuhakuRyokan(String kind) {
		return JreConstants.KIND_FLG_STAYING_RYOKAN.equals(kind);
	}

	/**
	 * ��ʂ͏h���̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isShukuhakuHotel(String kind) {
		return JreConstants.KIND_FLG_STAYING_HOTEL.equals(kind);
	}

	/**
	 * ��ʂ͏h���̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isShukuhakuSki(String kind) {
		return JreConstants.KIND_FLG_STAYING_SKI.equals(kind);
	}

	/**
	 * ��ʂ͊ό��̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isTravel(String kind) {
		return JreConstants.KIND_FLG_TRAVEL.equals(kind);
	}

	/**
	 * ��ʂ͑D�Ԃ̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isTraffic(String kind) {
		return JreConstants.KIND_FLG_TRAFFIC.equals(kind);
	}

	/**
	 * ��ʂ̓S���t�̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isGolf(String kind) {
		return JreConstants.KIND_FLG_GOLF.equals(kind);
	}

	/**
	 * ��ʂ̓��t�g�̔��f.
	 *
	 * @param kind
	 *            ���
	 * @return boolean
	 */
	public static boolean isLift(String kind) {
		return JreConstants.KIND_FLG_LIFT.equals(kind);
	}

	/**
	 * �t�@�C�����A�b�v���[�h���� .
	 *
	 * @param path
	 *            �t�@�C���p�X
	 * @param size
	 *            �L���ȃT�C�Y
	 * @param fileUpload
	 *            �t�@�C���Ώ�
	 * @param fileType
	 *            �L���ȃt�@�C���^�C�v
	 * @throws IOException
	 *             I/O��O
	 * @throws BusinessException
	 *             �r�W�l�X��O
	 */
	public static void uploadFile(final String path, int size,
			MultipartFile fileUpload, final String fileType)
			throws BusinessException, IOException {

		InputStream inputStream = null;
		BufferedInputStream inputBuffer = null;
		BufferedOutputStream outBuffer = null;
		FileOutputStream fileOutputStream = null;

		controlFileSize(fileUpload, size);
		controlFileType(fileUpload, fileType);
		try {
			inputStream = fileUpload.getInputStream();
			inputBuffer = new BufferedInputStream(inputStream);
			fileOutputStream = new FileOutputStream(path);
			outBuffer = new BufferedOutputStream(fileOutputStream);
			int contents = 0;
			while ((contents = inputBuffer.read()) != -1) {
				outBuffer.write(contents);
			}
		} catch (FileNotFoundException e) {
			throw new BusinessException(e.getMessage());
		} catch (IOException e) {
			throw new BusinessException(e.getMessage());
		} finally {
			outBuffer.flush();
			fileOutputStream.close();
			inputBuffer.close();
			inputStream.close();
		}
	}

	/**
	 * �A�b�v���[�h�t�@�C���̃T�C�Y�L�����𔻒f���� .
	 *
	 * @param file
	 *            �t�@�C���Ώ�
	 * @param size
	 *            �T�C�Y
	 * @throws BusinessException
	 *             ��O
	 */
	public static void controlFileSize(final MultipartFile file, final int size)
			throws BusinessException {
		if (size != 0) {
			if (file.getSize() > size) {
				int sizeMB = size / 1048576;
				throw new BusinessException("common.W008", new String[] {
						Integer.toString(sizeMB), "MB" }, "shfilenm");
			}
		}
	}

	/**
	 * �A�b�v���[�h�t�@�C���̃^�C�v�L�����𔻒f���� .
	 *
	 * @param file
	 *            �t�@�C���Ώ�
	 * @param type
	 *            �t�@�C���^�C�v
	 * @throws BusinessException
	 *             ��O
	 */
	public static void controlFileType(final MultipartFile file, final String type)
			throws BusinessException {
		if (!type.equals("*")) {
			String fileName = file.getOriginalFilename();
			String fileType = fileName.substring(fileName.lastIndexOf('.') + 1,
					fileName.length());
			if (!fileType.equals(type)) {
				throw new BusinessException("common.W009", new String[] { "*.",
						type }, "shfilenm");
			}
		}
	}

	/**
	 * ��ʂɂ��A���b�Z�[�W��ϊ�1.
	 *
	 * @param kind
	 *            kind
	 * @param messageKey
	 *            MessageKey
	 * @return �G���[���b�Z�[�W�̃L�[
	 */
	private static String addMessage(String kind, String messageKey) {
		if (isShukuhaku(kind)) {
			return "ur01010." + messageKey;
		}
		return "ur01011." + messageKey;
	}

	/**
	 * �񋟊������`�F�b�N .
	 *
	 * @param termTime .
	 * @param currentY
	 *            ���N�x .
	 * @param errors .
	 * @param fieldName
	 *            �񋟊����̏����f�[�^�̖��O.
	 * @param errorRe
	 *            errorMessageResource
	 * @param kind
	 *            ���
	 * @return ActionErrors .
	 */
	public static final ActionErrors checkTermTime(INo1CommonData termTime,
			int currentY, ActionErrors errors, String fieldName,
			MessageResources errorRe, String kind) {

		boolean errorFromY = false, errorFromM = false, errorFromD = false, errorEndY = false, errorEndM = false,
				errorEndD = false;
		int fromY, fromM, fromD, endY, endM, endD;
		// �����̃`�F�b�N�͂���
		//		if ("".equals(termTime.getTermFromY())) {
		//			// �J�n�N�x�͋�
		//			errors.add(fieldName + "termFromY", new ActionMessage(addMessage(
		//					kind, "W309")));
		//			errorFromY = true;
		//		} else if (!isNumber(termTime.getTermFromY())) {
		//			// �J�n�N�x�͐����ł͂Ȃ�
		//			errors.add(fieldName + "termFromY", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W209"))));
		//			errorFromY = true;
		//		} else {
		//			// �J�n�N�x�͔N�x+1�A�N�x-1�̒��ł���
		//			fromY = Integer.parseInt(termTime.getTermFromY());
		//			if (fromY > currentY + 1 || fromY < currentY - 1) {
		//				errors
		//						.add(fieldName + "termFromY", new ActionMessage(
		//								addMessage(kind, "W236"), String
		//										.valueOf(currentY - 1),
		//								String
		//										.valueOf(currentY),
		//								String
		//										.valueOf(currentY + 1)));
		//				errorFromY = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermFromM())) {
		//			// �J�n���͋�
		//			errors.add(fieldName + "termFromM", new ActionMessage(addMessage(
		//					kind, "W310")));
		//			errorFromM = true;
		//		} else if (!isNumber(termTime.getTermFromM())) {
		//			// �J�n���͐����ł͂Ȃ�
		//			errors.add(fieldName + "termFromM", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W210"))));
		//			errorFromM = true;
		//		} else {
		//			// �J�n���͂P�`�P�Q�ȓ��ł���
		//			fromM = Integer.parseInt(termTime.getTermFromM());
		//			if (fromM < JreConstants.JANUARY || fromM > JreConstants.DECEMBER) {
		//				errors.add(fieldName + "termFromM", new ActionMessage(
		//						"errors.range", errorRe.getMessage(addMessage(kind,
		//								"W210")),
		//						"1", "12"));
		//				errorFromM = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermFromD())) {
		//			// �J�n���͋�
		//			errors.add(fieldName + "termFromD", new ActionMessage(addMessage(
		//					kind, "W311")));
		//			errorFromD = true;
		//		} else if (!isNumber(termTime.getTermFromD())) {
		//			// �J�n���͐����ł͂Ȃ�
		//			errors.add(fieldName + "termFromD", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W211"))));
		//			errorFromD = true;
		//		} else {
		//			// �J�n���͂P�`�R�P���Ȃ��ł���
		//			fromD = Integer.parseInt(termTime.getTermFromD());
		//			if (fromD < JreConstants.FIRSEDAY || fromD > JreConstants.LASTDAT) {
		//				errors.add(fieldName + "termFromD", new ActionMessage(
		//						"errors.range", errorRe.getMessage(addMessage(kind,
		//								"W211")),
		//						"1", "31"));
		//				errorFromD = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermEndY())) {
		//			// �I���N�x�͂���
		//			errors.add(fieldName + "termEndY", new ActionMessage(addMessage(
		//					kind, "W312")));
		//			errorEndY = true;
		//		} else if (!isNumber(termTime.getTermEndY())) {
		//			// �I���N�x�͐����ł͂Ȃ�
		//			errors.add(fieldName + "termEndY", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W263"))));
		//			errorEndY = true;
		//		} else {
		//			// �I���N�x�͔N�x�[�P�A�N�x�{�P�ȓ��ł���
		//			endY = Integer.parseInt(termTime.getTermEndY());
		//			if (endY > currentY + 1 || endY < currentY - 1) {
		//				errors
		//						.add(fieldName + "termEndY", new ActionMessage(
		//								addMessage(kind, "W261"), String
		//										.valueOf(currentY - 1),
		//								String
		//										.valueOf(currentY),
		//								String
		//										.valueOf(currentY + 1)));
		//				errorEndY = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermEndM())) {
		//			// �I�����͋�
		//			errors.add(fieldName + "termEndM", new ActionMessage(addMessage(
		//					kind, "W313")));
		//			errorEndM = true;
		//		} else if (!isNumber(termTime.getTermEndM())) {
		//			// �I�����͐����ł͂Ȃ�
		//			errors.add(fieldName + "termEndM", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W264"))));
		//			errorEndM = true;
		//		} else {
		//			// �I�����͂P�`�P�Q�ȓ��ł���
		//			endM = Integer.parseInt(termTime.getTermEndM());
		//			if (endM < JreConstants.JANUARY || endM > JreConstants.DECEMBER) {
		//				errors.add(fieldName + "termEndM", new ActionMessage(
		//						"errors.range", errorRe.getMessage(addMessage(kind,
		//								"W264")),
		//						"1", "12"));
		//				errorEndM = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermEndD())) {
		//			// �I�����͋�
		//			errors.add(fieldName + "termEndD", new ActionMessage(addMessage(
		//					kind, "W314")));
		//			errorEndD = true;
		//		} else if (!isNumber(termTime.getTermEndD())) {
		//			// �I�����͐����ł͂Ȃ�
		//			errors.add(fieldName + "termEndD", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W265"))));
		//			errorEndD = true;
		//		} else {
		//			// �I�����͂P�`�R�P�ȓ��ł���
		//			endD = Integer.parseInt(termTime.getTermEndD());
		//			if (endD < JreConstants.FIRSEDAY || endD > JreConstants.LASTDAT) {
		//				errors.add(fieldName + "termEndD", new ActionMessage(
		//						"errors.range", errorRe.getMessage(addMessage(kind,
		//								"W265")),
		//						"1", "31"));
		//				errorEndD = true;
		//			}
		//		}
		//		Calendar calendar = Calendar.getInstance();
		//		// �J�n���̓J�����_�[�ɐ������ł���
		//		if (!errorFromY && !errorFromM && !errorFromD) {
		//			fromY = Integer.parseInt(termTime.getTermFromY());
		//			fromM = Integer.parseInt(termTime.getTermFromM());
		//			fromD = Integer.parseInt(termTime.getTermFromD());
		//			calendar.clear();
		//			calendar.set(fromY, fromM - 1, 1);
		//
		//			int maxDay = calendar.getActualMaximum(Calendar.DATE);
		//			if (maxDay < fromD) {
		//				errors.add(fieldName + "termFromD", new ActionMessage(
		//						addMessage(kind, "W282"), String.valueOf(maxDay)));
		//				errorFromD = true;
		//			}
		//		}
		//		// �I�����̓J�����_�[�ɐ������ł���
		//		if (!errorEndY && !errorEndM && !errorEndD) {
		//			endY = Integer.parseInt(termTime.getTermEndY());
		//			endM = Integer.parseInt(termTime.getTermEndM());
		//			endD = Integer.parseInt(termTime.getTermEndD());
		//			calendar.clear();
		//			calendar.set(endY, endM - 1, 1);
		//			int maxDay = calendar.getActualMaximum(Calendar.DATE);
		//			if (maxDay < endD) {
		//				errors.add(fieldName + "termEndD", new ActionMessage(
		//						addMessage(kind, "W283"), String.valueOf(maxDay)));
		//				errorEndD = true;
		//			}
		//		}
		//		// �J�n�����͏I��������菬������
		//		if (!errorFromY && !errorFromM && !errorFromD && !errorEndY
		//				&& !errorEndM && !errorEndD) {
		//			fromY = Integer.parseInt(termTime.getTermFromY());
		//			fromM = Integer.parseInt(termTime.getTermFromM());
		//			fromD = Integer.parseInt(termTime.getTermFromD());
		//			endY = Integer.parseInt(termTime.getTermEndY());
		//			endM = Integer.parseInt(termTime.getTermEndM());
		//			endD = Integer.parseInt(termTime.getTermEndD());
		//			if (fromY > endY) {
		//				errors.add(fieldName + "termFromY", new ActionMessage(
		//						addMessage(kind, "W233")));
		//			}
		//			if (fromY == endY && fromM > endM) {
		//				errors.add(fieldName + "termFromM", new ActionMessage(
		//						addMessage(kind, "W233")));
		//			}
		//			if (fromY == endY && fromM == endM && fromD > endD) {
		//				errors.add(fieldName + "termFromD", new ActionMessage(
		//						addMessage(kind, "W233")));
		//			}
		//		}
		return errors;
	}

	/**
	 * email address�����؂���.
	 *
	 * @param emailAddress
	 *            ���؂��������[���A�h���X
	 * @return ���f����
	 */
	public static boolean isEmailAdr(String emailAddress) {
		Pattern p = Pattern.compile("\\b[-\\w.]+@[-\\w.]+\\.[-\\w]+\\b$");
		Matcher m = p.matcher(emailAddress);
		return m.matches();
	}

	/**
	 * �����̃f�[�^�Ɂf�C�f������.
	 *
	 * @param charge
	 *            ���^
	 * @return �h�C�h����ꂽ����
	 */
	public static String formatCharge(String charge) {
		if (StringUtil.isEmpty(charge)) {
			return "";
		}

		if (!isNumber(charge)) {
			return charge;
		}

		DecimalFormat df = new DecimalFormat("###,###");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < charge.length(); i++) {
			char c = charge.charAt(i);
			if (Character.isDefined(c)) {
				sb.append(c);
			}
		}
		return df.format(Double.parseDouble(sb.toString()));
	}

	/**
	 * �����Y���V�[�g�̖��̔z������.
	 *
	 * @param ur02000Data
	 *            �J�����_�[�f�[�^
	 * @param sheetNames
	 *            �Y�����Ȃ��V�[�g�̖��̔z��
	 * @return �V�[�g�̖��̔z��
	 */
	public static String[] addSheet3Names(UR02000Data ur02000Data,
			String[] sheetNames) {

		List nameList = new ArrayList();
		for (String sheetName : sheetNames) {
			nameList.add(sheetName);
		}

		if (null == ur02000Data || ur02000Data.getYearMonthArr().length < 6) {
			nameList.add(IRptSource.RPT_NO1_3_NAME_RPT1);
		} else {
			List sheet3Names = new ArrayList();
			for (int i = 0; i < ur02000Data.getYearMonthArr().length; i++) {
				if (i % 6 == 0) {
					sheet3Names.add(IRptSource.RPT_NO1_3_NAME_RPT1 + "_"
							+ (1 + i / 6));
				}

			}
			nameList.addAll(2, sheet3Names);
		}
		sheetNames = (String[]) nameList.toArray(new String[0]);
		return sheetNames;
	}

	/**
	 * �J�����_�[�̃V�[�g�������Y������.
	 *
	 * @param ur02000Data
	 *            �J�����_�[�f�[�^
	 * @param templetNames
	 *            templetNames
	 * @return �Y�����܂���templete�z��
	 */
	public static String[] addTemplet3Names(UR02000Data ur02000Data,
			String[] templetNames) {

		List nameList = new ArrayList();
		for (String templetName : templetNames) {
			nameList.add(templetName);
		}

		if (null == ur02000Data || ur02000Data.getYearMonthArr().length < 6) {
			return templetNames;
		} else {
			List sheet3TempletNames = new ArrayList();
			for (int i = 0; i < ur02000Data.getYearMonthArr().length; i++) {
				if (i % 6 == 0 && i != 0) {
					sheet3TempletNames.add(templetNames[2]);
				}

			}
			nameList.addAll(3, sheet3TempletNames);
		}
		templetNames = (String[]) nameList.toArray(new String[0]);
		return templetNames;
	}

	/**
	 * �萔���̋��z����.
	 *
	 * @param fee
	 *            ���z
	 * @return ���،���
	 */
	public static boolean checkFee(String fee) {

		if (StringUtil.isEmpty(fee)) {
			return true;
		} else {
			if (!isNumber(fee)) {
				return false;
			}
			return !(fee.indexOf(".") != -1); /*{
												return false;
												} else {
												return true;
												}*/
		}

	}

	/**
	 * �萔���̗�����.
	 *
	 * @param percent
	 *            ��
	 * @return ���،���
	 */
	public static boolean checkPercent(String percent) {

		if (StringUtil.isEmpty(percent)) {
			return true;
		} else {
			float value = Float.parseFloat(percent);
			return 100 > value; /*{
								return true;
								} else {
								return false;
								}*/
		}
	}

	/**
	 * �萔���̗����؁i�Q�j�F"."�̂ݓ��͂̏ꍇ�̌��� 2009/11/13 add by s31109 .
	 *
	 * @param percent
	 *            ��
	 * @return ���،���
	 */
	public static boolean checkDotsOnly(String percent) {
		if (percent.length() == 1 && percent.indexOf(".") == 0) {
			return false;
		}
		return true;
	}

	/**
	 * String �ɕύX���܂�.
	 * @param obj obj
	 * @return string
	 */
	public static String convert2String(Object obj) {
		try {
			if (obj == null) {
				return "";
			} else {
				return obj.toString();
			}
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * loginData���擾.
	 * @param request request
	 * @return loginData
	 */
	public static UR00100Data getUR00100Data(HttpServletRequest request) {
		return (UR00100Data) request.getSession().getAttribute(JreConstants.SESSION_KEY_USERDATA);
	}

	/**
	 * UserData���擾.
	 * @param request request
	 * @return UserData
	 */
	public static UserData getUserData(HttpServletRequest request) {
		return getUR00100Data(request).getUser();
	}

	/**
	 * UserId���擾.
	 * @param request request
	 * @return UserId
	 */
	public static String getBranchCd(HttpServletRequest request) {
		return getUserData(request).getBranchCd();
	}

	/**
	 * �{�݃p�^�[���̔ԑΉ����ߒǉ� add by s30873 2010/01/26
	 * �����񐮌`
	 * ��������w�肳�ꂽ��������0���[����.
	 * @param str �ϊ����镶����
	 * @param n ���`������̕�����(�S�p������n*2)
	 * @param hAlign L/R/M
	 * @return �ύX����������
	 */
	public static String getFormatPatternNum(String str, int n, String hAlign) {
		String space = "0";
		String rtn = "";
		if (str == null || str.trim().length() < 1) {
			for (int i = 0; i < n; i++) {
				rtn = rtn + space;
			}
			return rtn;
		} else {
			byte[] b = str.getBytes();
			int len = b.length;
			for (int i = 0; i < n - len; i++) {
				if (hAlign.equalsIgnoreCase("L")) {
					str = str + space;
				} else if (hAlign.equalsIgnoreCase("R")) {
					str = space + str;
				} else {
					if (i % 2 == 0) {
						str = space + str;
					} else {
						str = str + space;
					}
				}
			}
			return str;
		}
	}

	/**
	 * �{�݃p�^�[���̔�
	 * @param str �{�݃p�^�[���ԍ�
	 * @return �{�݃p�^�[���ԍ�
	 */
	public static String increasesPatternNum(String str) {
		//������ː�����
		int retVal = Integer.parseInt(str) + 1;
		//���^�[��������
		return retVal + "";
	}

	//============================�{�݃^�C�v�ɂ��y�[�W�ړ����߁A�{�݃^�C�v���f���b�\�h�ǉ�============================
	//============================				add by s30873 2010/01/28		START		============================
	/**
	 * �{�݃^�C�v�˗��ٔ��f.
	 *
	 * @param type
	 *            �{�݃^�C�v
	 * @return boolean
	 */
	public static boolean isInn(String type) {
		return JreConstants.KIND_FLG_INN.equals(type);
	}

	/**
	 * �{�݃^�C�v�˃z�e�����f.
	 *
	 * @param type
	 *            �{�݃^�C�v
	 * @return boolean
	 */
	public static boolean isHotel(String type) {
		return JreConstants.KIND_FLG_HOTEL.equals(type);
	}

	/**
	 * �{�݃^�C�v�˃X�L�[���f.
	 *
	 * @param type
	 *            �{�݃^�C�v
	 * @return boolean
	 */
	public static boolean isSki(String type) {
		return JreConstants.KIND_FLG_SKI.equals(type);
	}
	//============================				add by s30873 2010/01/28		END		============================

	/**
	 * ���݁A�N���������b�擾
	 */
	public static String getNowDate() {
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		return d1.format(now);//.toString();
	}
}
