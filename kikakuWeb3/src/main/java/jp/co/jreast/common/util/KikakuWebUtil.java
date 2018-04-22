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
 *     プロジェクトのツールクラス。.
 *    機能概要    ：  プロジェクトのツール
 *    特記事項    ：  無し
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/10/10
 */
public class KikakuWebUtil {

	/**
	 * 企画定義ファイル.
	 */
	private static Properties kikakuProps;

	/**
	 * メール定義ファイル.
	 */
	private static Properties mailProps;

	/**
	 * 企画定義ファイルを取得する.
	 *
	 * @param inFile
	 *            企画定義ファイル
	 * @return 企画定義ファイル
	 * @throws SystemException
	 *             システム例外
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
	 * メール定義ファイルを取得する.
	 *
	 * @param inFile
	 *            メール定義ファイル
	 * @return メール定義ファイル
	 * @throws SystemException
	 *             システム例外
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
	 * 施設コード補充する.
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
	 * サブ文字配列と返す、桁数不足時 文字列の後で特定charを詰め桁数超え時、 文字列の後charを切り.
	 *
	 * @param str
	 *            文字列
	 * @param length
	 *            サイズ
	 * @param ch
	 *            文字
	 * @return 文字列
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
	 * mail送信.
	 *
	 * @param mail
	 *            メール
	 * @return 送信成功時true 送信失敗時false
	 * @throws SystemException
	 *             システム例外
	 * @throws IOException
	 *             I/O例外
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
	 * 値を取得する.
	 *
	 * @param key
	 *            キー
	 * @return 値
	 * @throws SystemException
	 *             システム例外
	 */
	public static String getPropertiesValue(String key) throws SystemException {

		InputStream inFile = JreConstants.getKikakuWebPropertiesStream();

		return getKikakuProps(inFile).getProperty(key);

	}

	/**
	 * 該当業務年度を取得する.
	 *
	 * @return year 該当業務年度
	 */
	public static String getGyomuYear() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMM");
		String yearAndMonth = sf.format(new Date());
		// 業務開始月の前の月は、前業務年度に設定する.
		if (yearAndMonth.substring(4, 6).compareTo(JreConstants.GYOMU_MONTH) >= 0) {
			return yearAndMonth.substring(0, 4);
		} else {
			return Integer.toString(Integer.parseInt(yearAndMonth.substring(0,
					4)) - 1);
		}
	}

	/**
	 * システム年度を取得する.
	 *
	 * @return year システム年度
	 */
	public static String getCurrentYear() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMM");
		String yearAndMonth = sf.format(new Date());
		// システム年度を返す.
		return yearAndMonth.substring(0, 4);

	}

	/**
	 * 文字列には 特別な記号を置き換える.
	 *
	 * @param words
	 *            文字列
	 * @return String 特別な記号を置き換える文字列
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
	 * 日付の判断.
	 *
	 * @param symbol
	 *            特別な記号
	 * @param words
	 *            文字列
	 * @return boolean
	 */
	private static boolean isDateWithSymbol(String symbol, String words) {
		return words.indexOf(symbol) == 4 && words.lastIndexOf(symbol) == 7;
	}

	/**
	 * 表示用日付を取得する.
	 *
	 * @param word
	 *            入力文字列
	 * @param ymd
	 *            判断した文字列
	 * @return 表示用日付
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
	 * 時間の文字列には 時間桁を取得する.
	 *
	 * @param time
	 *            時間の文字列 mmss
	 * @return 時間桁
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
	 * ユーザ状態判断する.
	 *
	 * @param userStatus
	 *            ユーザ状態
	 * @return true:JR側
	 */
	public static boolean isJR(String userStatus) {

		if (ArrayUtils.indexOf(JreConstants.USER_DIV_JR_RANG, userStatus) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * ユーザ状態判断する.
	 *
	 * @param userStatus
	 *            ユーザ状態
	 * @return TRUE:FACILITIES側
	 */
	public static boolean isFacilities(String userStatus) {

		if (ArrayUtils.indexOf(JreConstants.USER_DIV_FACILITIES_RANG,
				userStatus) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * ユーザ状態判断する.
	 *
	 * @param userStatus
	 *            ユーザ状態
	 * @return TRUE:管理側
	 */
	public static boolean isManager(String userStatus) {

		if (ArrayUtils.indexOf(JreConstants.USER_DIV_MANAGER_RANG, userStatus) != -1) {
			return true;
		}
		return false;
	}

	/**
	 * 時間の文字列には 分桁を取得する.
	 *
	 * @param time
	 *            時間の文字列
	 * @return 分桁
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
	 * 入力時間と分によって ４桁のタイムを作成する.
	 *
	 * @param hour
	 *            時間
	 * @param minute
	 *            文
	 * @return ４桁のタイム
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
	 * セッションには 企画検索データを更新する.
	 *
	 * @param request
	 *            リクエスト
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
	 * 完了の状態になる場合、履歴番号を更新する.
	 *
	 * @param request
	 *            リクエスト
	 * @param status
	 *            状態
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
	 * フォーム中にの回答書データによって リクエストの企画検索データを更新する.
	 *
	 * @param planAnsData
	 *            回答書データ
	 * @param request
	 *            リクエスト
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
	 * コピーフォームをクリアする.
	 *
	 * @param request
	 *            リクエスト
	 */
	public static void cleanCopyForm(HttpServletRequest request) {
		request.getSession().removeAttribute(JreConstants.KEY_COPYFORM);
	}

	/**
	 * すべての画面が参照不可の判断(宿泊).
	 *
	 * @param userData
	 *            ユーザデータ
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
	 * すべての画面が参照不可の判断(宿泊以外).
	 *
	 * @param userData
	 *            ユーザデータ
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
	 * 画面IDを取得する(宿泊).
	 *
	 * @param userData
	 *            ユーザデータ
	 * @return 画面ID
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
	 * No1画面が参照不可の判断.
	 *
	 * @param userData
	 *            ユーザデータ
	 * @return boolean
	 */
	public static boolean isNo1Display(UserData userData) {
		return userData.getReferComp1().equals(JreConstants.FLG_TRUE);
	}

	/**
	 * 「完了」状態更新する.
	 *
	 * @param planAnsNo
	 *            回答書コード
	 * @param careerNo
	 *            履歴番号
	 * @param dao
	 *            データベースを操作すオブジェクト
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
	 * 送信区分はメールかどうか.
	 *
	 * @param sendFlg
	 *            送信区分
	 * @return boolean
	 */
	public static boolean isMailSend(String sendFlg) {
		return sendFlg.equals(JreConstants.SEND_DIV_FLAG_MAIL);
	}

	/**
	 * 送信区分はファクスかどうか.
	 *
	 * @param sendFlg
	 *            送信区分
	 * @return boolean
	 */
	public static boolean isFaxSend(String sendFlg) {
		return sendFlg.equals(JreConstants.SEND_DIV_FLAG_FAX);
	}

	/**
	 * Fax送信を判断.
	 *
	 * @param data
	 *            Ｎｏ１データ
	 * @return Ｆａｘ送信か
	 */
	public static boolean isFaxSend(BaseNo1Data data) {
		return isFaxSend(data.getPlanAnsData().getSendDiv().toString());
	}

	/**
	 * Fax送信を判断.
	 *
	 * @param data
	 *            回答書データ
	 * @return Ｆａｘ送信か
	 */
	public static boolean isFaxSend(PlanAnsData data) {
		return isFaxSend(data.getSendDiv().toString());
	}

	/**
	 * 数字の判断.
	 *
	 * @param strNum
	 *            入力文字列
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
	 * 英数字の判断.
	 *
	 * @param str
	 *            入力文字列
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
	 * 文字列フォマットの検証（###.##）.
	 *
	 * @param strFloat
	 *            文字列
	 * @return TRUE:###.##
	 */
	public static boolean isFloat(String strFloat) {
		if (StringUtil.isEmpty(strFloat)) {
			return true;
		}

		// 点のみ入力チェック追加 2009/11/13 add by s31109
		if (!checkDotsOnly(strFloat)) {
			return false;
		}

		Pattern p = Pattern.compile("^\\-{0,1}[0-9]{0,}\\.{0,1}[0-9]{0,}$");
		Matcher m = p.matcher(strFloat);
		return m.matches();
	}

	/**
	 * FM漢字の判断 .
	 *
	 * @param str
	 *            入力文字列
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
	 * 半角文字を検証.
	 *
	 * @param str
	 *            str
	 * @return 結果
	 */
	public static boolean isHalf(String str) {
		if (StringUtil.isEmpty(str)) {
			return true;
		}
		Pattern p = Pattern.compile("^[｡-ﾟ|!-~]*$");
		Matcher m = p.matcher(str);
		return m.matches();
	}

	/**
	 * 連絡先などの判断.
	 *
	 * @param strNum
	 *            入力文字列
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
	 * リクエストから文字列を取得する.
	 *
	 * @param str
	 *            文字列
	 * @return 文字列
	 * @throws SystemException
	 *             システム例外
	 */
	public static String getRequestValue(String str) throws SystemException {
		try {
			return new String(str.getBytes("ISO-8859-1"), "MS932");
		} catch (UnsupportedEncodingException e) {
			throw new SystemException(e);
		}
	}

	/**
	 * 採番 .
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
		// 2007年度の採番は30から始まる jinhuashi 2007/
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
	 * 種別は宿泊の判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isShukuhaku(String kind) {
		return JreConstants.KIND_FLG_STAYING.equals(kind);
	}

	/**
	 * 種別は宿泊の判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isShukuhakuRyokan(String kind) {
		return JreConstants.KIND_FLG_STAYING_RYOKAN.equals(kind);
	}

	/**
	 * 種別は宿泊の判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isShukuhakuHotel(String kind) {
		return JreConstants.KIND_FLG_STAYING_HOTEL.equals(kind);
	}

	/**
	 * 種別は宿泊の判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isShukuhakuSki(String kind) {
		return JreConstants.KIND_FLG_STAYING_SKI.equals(kind);
	}

	/**
	 * 種別は観光の判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isTravel(String kind) {
		return JreConstants.KIND_FLG_TRAVEL.equals(kind);
	}

	/**
	 * 種別は船車の判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isTraffic(String kind) {
		return JreConstants.KIND_FLG_TRAFFIC.equals(kind);
	}

	/**
	 * 種別はゴルフの判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isGolf(String kind) {
		return JreConstants.KIND_FLG_GOLF.equals(kind);
	}

	/**
	 * 種別はリフトの判断.
	 *
	 * @param kind
	 *            種別
	 * @return boolean
	 */
	public static boolean isLift(String kind) {
		return JreConstants.KIND_FLG_LIFT.equals(kind);
	}

	/**
	 * ファイルをアップロードする .
	 *
	 * @param path
	 *            ファイルパス
	 * @param size
	 *            有効なサイズ
	 * @param fileUpload
	 *            ファイル対象
	 * @param fileType
	 *            有効なファイルタイプ
	 * @throws IOException
	 *             I/O例外
	 * @throws BusinessException
	 *             ビジネス例外
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
	 * アップロードファイルのサイズ有効性を判断する .
	 *
	 * @param file
	 *            ファイル対象
	 * @param size
	 *            サイズ
	 * @throws BusinessException
	 *             例外
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
	 * アップロードファイルのタイプ有効性を判断する .
	 *
	 * @param file
	 *            ファイル対象
	 * @param type
	 *            ファイルタイプ
	 * @throws BusinessException
	 *             例外
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
	 * 種別により、メッセージを変換1.
	 *
	 * @param kind
	 *            kind
	 * @param messageKey
	 *            MessageKey
	 * @return エラーメッセージのキー
	 */
	private static String addMessage(String kind, String messageKey) {
		if (isShukuhaku(kind)) {
			return "ur01010." + messageKey;
		}
		return "ur01011." + messageKey;
	}

	/**
	 * 提供期限をチェック .
	 *
	 * @param termTime .
	 * @param currentY
	 *            今年度 .
	 * @param errors .
	 * @param fieldName
	 *            提供期限の所属データの名前.
	 * @param errorRe
	 *            errorMessageResource
	 * @param kind
	 *            種別
	 * @return ActionErrors .
	 */
	public static final ActionErrors checkTermTime(INo1CommonData termTime,
			int currentY, ActionErrors errors, String fieldName,
			MessageResources errorRe, String kind) {

		boolean errorFromY = false, errorFromM = false, errorFromD = false, errorEndY = false, errorEndM = false,
				errorEndD = false;
		int fromY, fromM, fromD, endY, endM, endD;
		// 期限のチェックはじめ
		//		if ("".equals(termTime.getTermFromY())) {
		//			// 開始年度は空
		//			errors.add(fieldName + "termFromY", new ActionMessage(addMessage(
		//					kind, "W309")));
		//			errorFromY = true;
		//		} else if (!isNumber(termTime.getTermFromY())) {
		//			// 開始年度は数字ではない
		//			errors.add(fieldName + "termFromY", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W209"))));
		//			errorFromY = true;
		//		} else {
		//			// 開始年度は年度+1、年度-1の中ですか
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
		//			// 開始月は空
		//			errors.add(fieldName + "termFromM", new ActionMessage(addMessage(
		//					kind, "W310")));
		//			errorFromM = true;
		//		} else if (!isNumber(termTime.getTermFromM())) {
		//			// 開始月は数字ではない
		//			errors.add(fieldName + "termFromM", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W210"))));
		//			errorFromM = true;
		//		} else {
		//			// 開始月は１～１２以内ですか
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
		//			// 開始日は空
		//			errors.add(fieldName + "termFromD", new ActionMessage(addMessage(
		//					kind, "W311")));
		//			errorFromD = true;
		//		} else if (!isNumber(termTime.getTermFromD())) {
		//			// 開始日は数字ではない
		//			errors.add(fieldName + "termFromD", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W211"))));
		//			errorFromD = true;
		//		} else {
		//			// 開始日は１～３１いないですか
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
		//			// 終了年度はから
		//			errors.add(fieldName + "termEndY", new ActionMessage(addMessage(
		//					kind, "W312")));
		//			errorEndY = true;
		//		} else if (!isNumber(termTime.getTermEndY())) {
		//			// 終了年度は数字ではない
		//			errors.add(fieldName + "termEndY", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W263"))));
		//			errorEndY = true;
		//		} else {
		//			// 終了年度は年度ー１、年度＋１以内ですか
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
		//			// 終了月は空
		//			errors.add(fieldName + "termEndM", new ActionMessage(addMessage(
		//					kind, "W313")));
		//			errorEndM = true;
		//		} else if (!isNumber(termTime.getTermEndM())) {
		//			// 終了月は数字ではない
		//			errors.add(fieldName + "termEndM", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W264"))));
		//			errorEndM = true;
		//		} else {
		//			// 終了月は１～１２以内ですか
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
		//			// 終了日は空
		//			errors.add(fieldName + "termEndD", new ActionMessage(addMessage(
		//					kind, "W314")));
		//			errorEndD = true;
		//		} else if (!isNumber(termTime.getTermEndD())) {
		//			// 終了日は数字ではない
		//			errors.add(fieldName + "termEndD", new ActionMessage(
		//					"errors.integer", errorRe.getMessage(addMessage(kind,
		//							"W265"))));
		//			errorEndD = true;
		//		} else {
		//			// 終了日は１～３１以内ですか
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
		//		// 開始日はカレンダーに正しいですか
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
		//		// 終了日はカレンダーに正しいですか
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
		//		// 開始期限は終了期限より小さいか
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
	 * email addressを検証する.
	 *
	 * @param emailAddress
	 *            検証したいメールアドレス
	 * @return 判断結果
	 */
	public static boolean isEmailAdr(String emailAddress) {
		Pattern p = Pattern.compile("\\b[-\\w.]+@[-\\w.]+\\.[-\\w]+\\b$");
		Matcher m = p.matcher(emailAddress);
		return m.matches();
	}

	/**
	 * 数字のデータに’，’を入れる.
	 *
	 * @param charge
	 *            原型
	 * @return ”，”を入れた数字
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
	 * 自動添加シートの名の配列を作る.
	 *
	 * @param ur02000Data
	 *            カレンダーデータ
	 * @param sheetNames
	 *            添加しないシートの名の配列
	 * @return シートの名の配列
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
	 * カレンダーのシートを自動添加する.
	 *
	 * @param ur02000Data
	 *            カレンダーデータ
	 * @param templetNames
	 *            templetNames
	 * @return 添加しましたtemplete配列
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
	 * 手数料の金額検証.
	 *
	 * @param fee
	 *            金額
	 * @return 検証結果
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
	 * 手数料の率検証.
	 *
	 * @param percent
	 *            率
	 * @return 検証結果
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
	 * 手数料の率検証（２）："."のみ入力の場合の検証 2009/11/13 add by s31109 .
	 *
	 * @param percent
	 *            率
	 * @return 検証結果
	 */
	public static boolean checkDotsOnly(String percent) {
		if (percent.length() == 1 && percent.indexOf(".") == 0) {
			return false;
		}
		return true;
	}

	/**
	 * String に変更します.
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
	 * loginDataを取得.
	 * @param request request
	 * @return loginData
	 */
	public static UR00100Data getUR00100Data(HttpServletRequest request) {
		return (UR00100Data) request.getSession().getAttribute(JreConstants.SESSION_KEY_USERDATA);
	}

	/**
	 * UserDataを取得.
	 * @param request request
	 * @return UserData
	 */
	public static UserData getUserData(HttpServletRequest request) {
		return getUR00100Data(request).getUser();
	}

	/**
	 * UserIdを取得.
	 * @param request request
	 * @return UserId
	 */
	public static String getBranchCd(HttpServletRequest request) {
		return getUserData(request).getBranchCd();
	}

	/**
	 * 施設パターン採番対応ため追加 add by s30873 2010/01/26
	 * 文字列整形
	 * 文字列を指定された文字数で0を補充する.
	 * @param str 変換する文字列
	 * @param n 整形文字列の文字数(全角文字はn*2)
	 * @param hAlign L/R/M
	 * @return 変更した文字列
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
	 * 施設パターン採番
	 * @param str 施設パターン番号
	 * @return 施設パターン番号
	 */
	public static String increasesPatternNum(String str) {
		//文字列⇒数字化
		int retVal = Integer.parseInt(str) + 1;
		//リターン文字列
		return retVal + "";
	}

	//============================施設タイプによるページ移動ため、施設タイプ判断メッソド追加============================
	//============================				add by s30873 2010/01/28		START		============================
	/**
	 * 施設タイプ⇒旅館判断.
	 *
	 * @param type
	 *            施設タイプ
	 * @return boolean
	 */
	public static boolean isInn(String type) {
		return JreConstants.KIND_FLG_INN.equals(type);
	}

	/**
	 * 施設タイプ⇒ホテル判断.
	 *
	 * @param type
	 *            施設タイプ
	 * @return boolean
	 */
	public static boolean isHotel(String type) {
		return JreConstants.KIND_FLG_HOTEL.equals(type);
	}

	/**
	 * 施設タイプ⇒スキー判断.
	 *
	 * @param type
	 *            施設タイプ
	 * @return boolean
	 */
	public static boolean isSki(String type) {
		return JreConstants.KIND_FLG_SKI.equals(type);
	}
	//============================				add by s30873 2010/01/28		END		============================

	/**
	 * 現在、年月日時分秒取得
	 */
	public static String getNowDate() {
		SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		return d1.format(now);//.toString();
	}
}
