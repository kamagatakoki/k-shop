package jp.co.jreast.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.data.dno1data.DNo1PlanNoBean;
import jp.co.jreast.common.data.dno1data.DNo1PlanNoData;

/**
 * D画面用KikakuWebUtilラッパークラス
 *
 * <pre>
 *   機能概要 ：
 *   特記事項 ： D画面により追加となる動作はここに実装する。
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public final class DKikakuWebUtil extends DKikakuWebUtilWrapper {

	/** NO1画面IDのリスト */
	private static final List<String> NO1_SCREEN_ID;

	/** NO2画面IDのリスト */
	private static final List<String> NO2_SCREEN_ID;

	/** NO3画面IDのリスト */
	private static final List<String> NO3_SCREEN_ID;

	/** NO4画面IDのリスト */
	private static final List<String> NO4_SCREEN_ID;

	/** NO5画面IDのリスト */
	private static final List<String> NO5_SCREEN_ID;

	static {
		// NO1画面IDのリストを初期化
		NO1_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO1,
				JreConstants.SCREEN_ID_NO1_TRAVEL,
				JreConstants.SCREEN_ID_NO1_TRAFFIC,
				JreConstants.SCREEN_ID_NO1_GOLF,
				JreConstants.SCREEN_ID_NO1_LIFT,
				DJreConstants.SCREEN_ID_D_STAYING_NO1,
				DJreConstants.SCREEN_ID_D_TRAVEL_NO1,
				DJreConstants.SCREEN_ID_D_TRAFFIC_NO1,
				DJreConstants.SCREEN_ID_D_GOLF_NO1,
				DJreConstants.SCREEN_ID_D_LIFT_NO1 });

		// NO2画面IDのリストを初期化
		NO2_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO2,
				JreConstants.SCREEN_ID_LIFT_NO2,
				JreConstants.SCREEN_ID_NO2_HOTEL,
				JreConstants.SCREEN_ID_NO2_SKI,
				DJreConstants.SCREEN_ID_D_STAYING_NO2,
				DJreConstants.SCREEN_ID_D_LIFT_NO2,
				DJreConstants.SCREEN_ID_D_STAYING_NO2_HOTEL,
				DJreConstants.SCREEN_ID_D_STAYING_NO2_SKI });

		// NO3画面IDのリストを初期化
		NO3_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO3,
				DJreConstants.SCREEN_ID_D_STAYING_NO3 });

		// NO4画面IDのリストを初期化
		NO4_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO4,
				JreConstants.SCREEN_ID_NO4_1, JreConstants.SCREEN_ID_NO4_2,
				DJreConstants.SCREEN_ID_D_STAYING_NO4,
				DJreConstants.SCREEN_ID_D_TRAVEL_TRAFFIC_NO4,
				DJreConstants.SCREEN_ID_D_LIFT_NO4 });

		// NO5画面IDのリストを初期化
		NO5_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO5,
				DJreConstants.SCREEN_ID_D_STAYING_NO5 });

	}

	/**
	 * シート名配列にシート名を追加する
	 *
	 * @param sheetName
	 *            追加シート名
	 * @param sheetNameArray
	 *            シート名配列
	 * @param sizePerPage
	 *            １ページあたりのデータ数
	 * @param totalDataSize
	 *            総データ数
	 * @return シート配列
	 */
	public static String[] addSheetNames(String sheetName,
			String[] sheetNameArray, int sizePerPage, int totalDataSize) {

		List<String> nameList = new ArrayList<>();
		for (String element : sheetNameArray) {
			nameList.add(element);
		}

		if (sizePerPage <= 0 || totalDataSize <= sizePerPage) {
			nameList.add(sheetName);
			return nameList.toArray(new String[0]);
		}

		List<String> sheet3Names = new ArrayList<>();
		for (int i = 0; i < totalDataSize; i++) {
			if (i % sizePerPage == 0) {
				sheet3Names.add(sheetName + "_" + (1 + i / sizePerPage));
			}
		}
		nameList.addAll(sheet3Names);

		return nameList.toArray(new String[0]);
	}

	/**
	 * テンプレート名配列にテンプレート名を追加する
	 *
	 * @param templateName
	 *            追加テンプレート名
	 * @param templateNameArray
	 *            テンプレート名配列
	 * @param sizePerPage
	 *            １ページあたりのデータ数
	 * @param totalDataSize
	 *            総データ数
	 * @return テンプレート名配列
	 */
	public static String[] addTemplateNames(String templateName,
			String[] templateNameArray, int sizePerPage, int totalDataSize) {

		List<String> nameList = new ArrayList<>();
		for (String element : templateNameArray) {
			nameList.add(element);
		}

		if (sizePerPage <= 0 || totalDataSize <= sizePerPage) {
			nameList.add(templateName);
			return nameList.toArray(new String[0]);
		}

		List<String> newTemplateNames = new ArrayList<>();
		for (int i = 0; i < totalDataSize; i++) {
			if (i % sizePerPage == 0) {
				newTemplateNames.add(templateName);
			}

		}
		nameList.addAll(newTemplateNames);

		return nameList.toArray(new String[0]);
	}

	/**
	 * 指定した位置の1文字を取得します。
	 *
	 * <pre></pre>
	 *
	 * @param text
	 *            検索対象文字
	 * @param pos
	 *            位置
	 * @return 指定した位置の文字
	 */
	public static String charAt(String text, int pos) {
		if (StringUtils.isEmpty(text)) {
			return "";
		}
		return "" + text.charAt(pos - 1);
	}

	/**
	 * 日付文字列を整形します。
	 *
	 * <pre></pre>
	 *
	 * @param dateString
	 *            日付文字列
	 * @return 日付文字列（年月日）
	 */
	public static String formatDate(String dateString) {
		String str = dateString;
		if (StringUtils.isEmpty(str)) {
			return str;
		}
		if (str.length() <= 10) {
			return str;
		}
		return str.substring(0, 10).replace('-', '/');
	}

	/**
	 * compareListにnameが含まれていたらstyleClassValにスタイルクラスを追加して返却する
	 *
	 * <pre></pre>
	 *
	 * @param compareList
	 *            スタイルクラス追加対象リスト
	 * @param name
	 *            スタイルクラス追加対象name
	 * @param styleClassVal
	 *            追加するスタイルクラス
	 * @return 追加後のスタイルクラス
	 */
	public static String getDifferentStyleClass(List<String> compareList,
			String name, String styleClassVal) {

		String ret = "";
		if (styleClassVal != null) {
			ret = styleClassVal;
		}

		//リストに同じnameがあればスタイルクラスに追記
		if (compareList.contains(name)) {
			if (ret.indexOf("changedClass") < 0) {
				ret = ret + " changedClass ";
			}
		} else {
			//リストに同じnameがなければ「changedClass」を削除する
			ret = ret.replaceAll("changedClass", "");
		}

		return ret;
	}

	/**
	 * 企画回答書No2状態の次の状態を取得します。
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            実行イベント(DJreConstants.event)
	 * @param currentStatus
	 *            現在の状態
	 * @param isError
	 *            エラーの有無
	 * @return 次の状態
	 */
	public static Integer getNextNo2Status(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError) {
		return getNextStatus(event, currentStatus, isError, null);
	}

	/**
	 * 企画回答書No2状態の次の状態を取得します。
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            実行イベント(DJreConstants.event)
	 * @param currentStatus
	 *            現在の状態
	 * @param isError
	 *            エラーの有無
	 * @param sendDiv
	 *            FAX送信区分
	 * @return 次の状態
	 */
	public static Integer getNextNo2Status(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError,
			final Integer sendDiv) {
		return getNextStatus(event, currentStatus, isError, sendDiv, true);
	}

	/**
	 * 企画回答書の次の状態を取得します。
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            実行イベント(DJreConstants.event)
	 * @param currentStatus
	 *            現在の状態
	 * @param isError
	 *            エラーの有無
	 * @return 次の状態
	 */
	public static Integer getNextStatus(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError) {
		return getNextStatus(event, currentStatus, isError, null);
	}

	/**
	 * 企画回答書の次の状態を取得します。
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            実行イベント(DJreConstants.event)
	 * @param currentStatus
	 *            現在の状態
	 * @param isError
	 *            エラーの有無
	 * @param sendDiv
	 *            FAX送信区分
	 * @return 次の状態
	 */
	public static Integer getNextStatus(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError,
			final Integer sendDiv) {
		return getNextStatus(event, currentStatus, isError, sendDiv, null);
	}

	/**
	 * 企画回答書の次の状態を取得します。
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            実行イベント(DJreConstants.event)
	 * @param currentStatus
	 *            現在の状態
	 * @param isError
	 *            エラーの有無
	 * @param sendDiv
	 *            FAX送信区分
	 * @param isNo2
	 *            No2状態か否か
	 * @return 次の状態
	 */
	public static Integer getNextStatus(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError,
			final Integer sendDiv, final Boolean isNo2) {
		Integer returnStatus = currentStatus;

		switch (event) {
		// 一時保存（JR）
		case jrIchijihozon:
			// 状態：作成、作成（保留）
			if (JreConstants.STATUS_MAKING.equals(currentStatus)
					|| JreConstants.STATUS_MAKING_ERR.equals(currentStatus)) {
				if (isError) {
					if (isMailSend(sendDiv)) {
						return JreConstants.STATUS_MAKING_ERR;
					} else {
						return JreConstants.STATUS_JR_ERR;
					}
				}
				if (isNo2 != null && isNo2) {
					return JreConstants.STATUS_JR;
				}
				return JreConstants.STATUS_MAKING;
				// 状態：未開封
			} else if (JreConstants.STATUS_UNOPEN.equals(currentStatus)) {
				// 送信区分：FAX
				if (isFaxSend(sendDiv)) {
					return JreConstants.STATUS_JR;
				}
				return JreConstants.STATUS_UNOPEN;
				// 状態：開封
			} else if (JreConstants.STATUS_OPEN.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES.equals(currentStatus)
					|| JreConstants.STATUS_JR.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES_ERR.equals(currentStatus)
					|| JreConstants.STATUS_JR_ERR.equals(currentStatus)) {
				if (isError) {
					return JreConstants.STATUS_JR_ERR;
				}
				return JreConstants.STATUS_JR;
				// 状態：送信エラー
			} else if (DJreConstants.STATUS_SOUSHIN_ERROR.equals(currentStatus)) {
				//                if (isError) {
				//                    return JreConstants.STATUS_MAKING_ERR;
				//                } else {
				//                    return JreConstants.STATUS_MAKING;
				//                }
				return DJreConstants.STATUS_SOUSHIN_ERROR;
				// 状態：再編集中
			} else if (DJreConstants.STATUS_SAIHENSHUCHU.equals(currentStatus)) {
				return DJreConstants.STATUS_SAIHENSHUCHU;
				// 状態：施設登録中（再）、施設登録中（保留）（再）、JR登録中（再）、JR登録中（保留）（再）
			} else if (DJreConstants.STATUS_SHISETSU_TOUROKUCHU_SAI
					.equals(currentStatus)
					|| DJreConstants.STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_JR_TOUROKUCHU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_JR_TOUROKUCHU_HORYU_SAI
							.equals(currentStatus)) {
				if (isError) {
					return DJreConstants.STATUS_JR_TOUROKUCHU_HORYU_SAI;
				}
				return DJreConstants.STATUS_JR_TOUROKUCHU_SAI;

			}
			break;
		// 一時保存（施設）
		case shisetsuIchijihozon:
			// 状態：開封、作成、施設登録中、JR登録中、施設登録中（再）、JR登録中（再）、差戻
			if (JreConstants.STATUS_OPEN.equals(currentStatus)
					|| JreConstants.STATUS_MAKING.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES.equals(currentStatus)
					|| JreConstants.STATUS_JR.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES_ERR.equals(currentStatus)
					|| JreConstants.STATUS_JR_ERR.equals(currentStatus)
					|| JreConstants.STATUS_SEND_BACK.equals(currentStatus)) {
				if (isError) {
					return JreConstants.STATUS_FACILITIES_ERR;
				}
				return JreConstants.STATUS_FACILITIES;

				// 状態：施設登録中（再）、施設登録中（保留）（再）、JR登録中（再）、JR登録中（保留）（再）
			} else if (DJreConstants.STATUS_SHISETSU_TOUROKUCHU_SAI
					.equals(currentStatus)
					|| DJreConstants.STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_JR_TOUROKUCHU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_JR_TOUROKUCHU_HORYU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_SASHIMODOSHI_SAI
							.equals(currentStatus)) {
				if (isError) {
					return DJreConstants.STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI;
				}
				return DJreConstants.STATUS_SHISETSU_TOUROKUCHU_SAI;
			}
			break;
		// 送信
		case soushin:
			// 状態：作成
			if (JreConstants.STATUS_MAKING.equals(currentStatus)) {
				if (isError) {
					return JreConstants.STATUS_MAKING_ERR;
				}
				return JreConstants.STATUS_UNOPEN;
			}
			break;
		// 承認（JR）
		case jrShounin:
			// 送信区分：FAX
			if (isFaxSend(sendDiv)) {
				// 状態：開封、JR登録中、JR登録中（保留）
				if (JreConstants.STATUS_OPEN.equals(currentStatus)
						|| JreConstants.STATUS_JR.equals(currentStatus)
						|| JreConstants.STATUS_JR_ERR.equals(currentStatus)) {
					return JreConstants.STATUS_APPROVE;
					// 状態：再編集中
				} else if (DJreConstants.STATUS_SAIHENSHUCHU
						.equals(currentStatus)) {
					return DJreConstants.STATUS_RYOUKIN_SHONIN_SAI;
				}
				// 送信区分：MAIL
			} else if (isMailSend(sendDiv)) {
				// 状態：料金確定
				if (JreConstants.STATUS_CONFIRM.equals(currentStatus)) {
					return JreConstants.STATUS_APPROVE;
					// 状態：再編集中、料金確定（再）
				} else if (DJreConstants.STATUS_SAIHENSHUCHU
						.equals(currentStatus)
						|| DJreConstants.STATUS_RYOUKIN_KAKUTEI_SAI
								.equals(currentStatus)) {
					return DJreConstants.STATUS_RYOUKIN_SHONIN_SAI;
				}
			}
			break;
		// 差戻
		case sashimodoshi:
			// 状態：料金確定
			if (JreConstants.STATUS_CONFIRM.equals(currentStatus)) {
				return JreConstants.STATUS_SEND_BACK;
				// 状態：再編集中、料金確定（再）
			} else if (DJreConstants.STATUS_SAIHENSHUCHU.equals(currentStatus)
					|| DJreConstants.STATUS_RYOUKIN_KAKUTEI_SAI
							.equals(currentStatus)) {
				return DJreConstants.STATUS_SASHIMODOSHI_SAI;
			}

			break;
		// FM送信
		case fmSoushin:
			// 状態：料金承認
			if (JreConstants.STATUS_APPROVE.equals(currentStatus)) {
				return JreConstants.STATUS_APPROVE;
			}
			break;
		// 造成WEB連携
		case zouseiwebSoushin:
			if (JreConstants.STATUS_APPROVE.equals(currentStatus)) {
				return DJreConstants.STATUS_ZOUSEIWEB_SOUSHINMACHI;
			} else if (DJreConstants.STATUS_RYOUKIN_SHONIN_SAI
					.equals(currentStatus)) {
				return DJreConstants.STATUS_ZOUSEIWEB_SOUSHINMACHI_SAI;
			}
			break;
		// 連携済データ再編集
		case saihenshu:
			// 状態：造成WEB送信済、完了、造成WEB送信済（再）
			if (DJreConstants.STATUS_ZOUSEIWEB_SOUSHINZUMI
					.equals(currentStatus)
					|| JreConstants.STATUS_COMPLETE.equals(currentStatus)
					|| DJreConstants.STATUS_ZOUSEIWEB_SOUSHINZUMI_SAI
							.equals(currentStatus)) {
				return DJreConstants.STATUS_SAIHENSHUCHU;
			}
			break;
		// 削除
		case sakujo:
			if (JreConstants.STATUS_MAKING.equals(currentStatus)
					|| JreConstants.STATUS_MAKING_ERR.equals(currentStatus)
					|| JreConstants.STATUS_UNOPEN.equals(currentStatus)
					|| JreConstants.STATUS_OPEN.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES_ERR.equals(currentStatus)
					|| JreConstants.STATUS_JR.equals(currentStatus)
					|| JreConstants.STATUS_JR_ERR.equals(currentStatus)
					|| JreConstants.STATUS_CONFIRM.equals(currentStatus)
					|| JreConstants.STATUS_APPROVE.equals(currentStatus)
					|| JreConstants.STATUS_SEND_BACK.equals(currentStatus)
					|| JreConstants.STATUS_FM_FINISH.equals(currentStatus)
					|| JreConstants.STATUS_COMPLETE.equals(currentStatus)
					|| DJreConstants.STATUS_SAIHENSHUCHU.equals(currentStatus)
					|| DJreConstants.STATUS_SHISETSU_TOUROKUCHU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_JR_TOUROKUCHU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_JR_TOUROKUCHU_HORYU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_RYOUKIN_KAKUTEI_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_RYOUKIN_SHONIN_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_SASHIMODOSHI_SAI
							.equals(currentStatus)) {
				return JreConstants.STATUS_DELETE;
			}
			break;
		// 承認（施設）
		case shisetsuShounin:
			// 状態：開封、施設登録中、JR登録中、差戻
			if (JreConstants.STATUS_OPEN.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES_ERR.equals(currentStatus)
					|| JreConstants.STATUS_JR.equals(currentStatus)
					|| JreConstants.STATUS_SEND_BACK.equals(currentStatus)) {
				if (isError) {
					return JreConstants.STATUS_FACILITIES_ERR;
				} else {
					return JreConstants.STATUS_CONFIRM;
				}
				// 状態：施設登録中（再）、施設登録中（保留）（再）、JR登録中（再）、差戻（再）
			} else if (DJreConstants.STATUS_SHISETSU_TOUROKUCHU_SAI
					.equals(currentStatus)
					|| DJreConstants.STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_JR_TOUROKUCHU_SAI
							.equals(currentStatus)
					|| DJreConstants.STATUS_SASHIMODOSHI_SAI
							.equals(currentStatus)) {
				if (isError) {
					return DJreConstants.STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI;
				} else {
					return DJreConstants.STATUS_RYOUKIN_KAKUTEI_SAI;
				}
			}
		default:
		}

		return returnStatus;

	}

	/**
	 * 画面IDから画面区分（NO1～5の数字部分）を取得します。
	 *
	 * <pre></pre>
	 *
	 * @param screenId
	 *            画面ID
	 * @return 画面区分（※判別できない場合は"0"になります）
	 */
	public static String getScreenFlg(String screenId) {

		if (NO1_SCREEN_ID.contains(screenId)) {
			return DJreConstants.SCREEN_FLG_NO1;
		}

		if (NO2_SCREEN_ID.contains(screenId)) {
			return DJreConstants.SCREEN_FLG_NO2;
		}

		if (NO3_SCREEN_ID.contains(screenId)) {
			return DJreConstants.SCREEN_FLG_NO3;
		}

		if (NO4_SCREEN_ID.contains(screenId)) {
			return DJreConstants.SCREEN_FLG_NO4;
		}

		if (NO5_SCREEN_ID.contains(screenId)) {
			return DJreConstants.SCREEN_FLG_NO5;
		}

		return DJreConstants.SCREEN_FLG_ERROR;
	}

	/**
	 * Aコード（旧商品）であるか判別します。
	 *
	 * <pre>
	 * ※DP/RM（新商品）でなければAコード（旧商品）と判定されます。
	 * </pre>
	 *
	 * @param facilityMaterialKind
	 *            施設素材種別
	 * @return Aコード（旧商品）の場合true
	 */
	public static boolean isAcodeFacility(String facilityMaterialKind) {
		return !isDpRmFacility(facilityMaterialKind);
	}

	/**
	 * Aコード（旧商品）であるか判別します。
	 *
	 * <pre>
	 * ※DP/RM（新商品）でなければAコード（旧商品）と判定されます。
	 * </pre>
	 *
	 * @param materialKind
	 *            素材種別
	 * @return Aコード（旧商品）の場合true
	 */
	public static boolean isAcodePlanAns(String materialKind) {
		return !isDpRmPlanAns(materialKind);
	}

	/**
	 * DP/RM（新商品）であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param facilityMaterialKind
	 *            施設素材種別
	 * @return DP/RM（新商品）の場合true
	 */
	public static boolean isDpRmFacility(String facilityMaterialKind) {
		return DJreConstants.CODE_FACILITY_MATERIAL_KIND_DPRM
				.equals(facilityMaterialKind);
	}

	/**
	 * DP/RM（新商品）であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param materialKind
	 *            素材種別
	 * @return DP/RM（新商品）の場合true
	 */
	public static boolean isDpRmPlanAns(String materialKind) {
		return DJreConstants.CODE_MATERIAL_KIND_DP.equals(materialKind)
				|| DJreConstants.CODE_MATERIAL_KIND_RMSP.equals(materialKind)
				|| DJreConstants.CODE_MATERIAL_KIND_DPRM.equals(materialKind);
	}

	/**
	 * 「施設ユーザ」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param userDiv
	 *            ユーザー区分
	 * @return 「施設ユーザ」の場合true
	 */
	public static boolean isFacilities(Integer userDiv) {
		return isFacilities(String.valueOf(userDiv));
	}

	/**
	 * 「施設ユーザ」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param userData
	 *            ユーザーマスタデータ
	 * @return 「施設ユーザ」の場合true
	 */
	public static boolean isFacilities(UserData userData) {
		if (userData == null) {
			return false;
		}
		return isFacilities(userData.getUserDiv());
	}

	/**
	 * 「送付区分：FAX送信」であるか判定します。
	 *
	 * <pre></pre>
	 *
	 * @param sendDiv
	 *            送付区分
	 * @return 「FAX送信」の場合true
	 */
	public static boolean isFaxSend(Integer sendDiv) {
		return isFaxSend(String.valueOf(sendDiv));
	}

	/**
	 * データを参照する際、マスターから取得するか否か判定します。
	 *
	 * <pre>
	 * 企画回答書が編集可能の場合はマスターから取得する。
	 * </pre>
	 *
	 * @param status
	 *            状態
	 * @return マスターからの取得可否
	 */
	public static boolean isFetchedMasterData(final Integer status) {
		boolean retVal = false;

		if (JreConstants.STATUS_MAKING.equals(status)
				|| JreConstants.STATUS_MAKING_ERR.equals(status)
				|| DJreConstants.STATUS_SOUSHIN_ERROR.equals(status)
				|| JreConstants.STATUS_UNOPEN.equals(status)
				|| JreConstants.STATUS_OPEN.equals(status)) {
			return true;
		} else if (JreConstants.STATUS_FACILITIES.equals(status)
				|| JreConstants.STATUS_JR.equals(status)
				|| JreConstants.STATUS_FACILITIES_ERR.equals(status)
				|| JreConstants.STATUS_JR_ERR.equals(status)
				|| JreConstants.STATUS_SEND_BACK.equals(status)) {
			return true;
		} else if (DJreConstants.STATUS_SAIHENSHUCHU.equals(status)
				|| DJreConstants.STATUS_SHISETSU_TOUROKUCHU_SAI.equals(status)
				|| DJreConstants.STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI
						.equals(status)
				|| DJreConstants.STATUS_JR_TOUROKUCHU_SAI.equals(status)
				|| DJreConstants.STATUS_JR_TOUROKUCHU_HORYU_SAI.equals(status)
				|| DJreConstants.STATUS_SASHIMODOSHI_SAI.equals(status)) {
			return true;
		}

		return retVal;
	}

	/**
	 * 渡された文字列が商品コードのフォーマットに適しているか判定します。
	 *
	 * @param str
	 *            入力文字列
	 * @return boolean 商品コードのフォーマットに一致:true | 商品コードのフォーマットに不一致:false
	 */
	public static boolean isFormatByGoodsCode(String str) {
		if (StringUtil.isEmpty(str)) {
			return false;
		}
		Pattern p = Pattern.compile("^A\\d{10}$");
		Matcher m = p.matcher(str);
		return m.matches();
	}

	/**
	 * 長野ユーザであるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param userData
	 *            ユーザー情報
	 * @return 長野ユーザの場合true
	 */
	public static boolean isItnUser(UserData userData) {
		if (userData == null) {
			return false;
		}
		if (StringUtils.isEmpty(userData.getUserId())) {
			return false;
		}
		return userData.getUserId()
				.startsWith(DJreConstants.USER_ID_ITN_PREFIX);
	}

	/**
	 * 「JRユーザ」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param userDiv
	 *            ユーザー区分
	 * @return 「JRユーザ」の場合true
	 */
	public static boolean isJR(Integer userDiv) {
		return isJR(String.valueOf(userDiv));
	}

	/**
	 * 「JRユーザ」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param userData
	 *            ユーザー情報
	 * @return 「JRユーザ」の場合true
	 */
	public static boolean isJR(UserData userData) {
		if (userData == null) {
			return false;
		}
		return isJR(userData.getUserDiv());
	}

	/**
	 * 「送付区分：メール送信」であるか判定します。
	 *
	 * <pre></pre>
	 *
	 * @param sendDiv
	 *            送付区分
	 * @return 「メール送信」の場合true
	 */
	public static boolean isMailSend(Integer sendDiv) {
		return isMailSend(String.valueOf(sendDiv));
	}

	/**
	 * 「在庫管理方法」が「人数管理」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param stockManage
	 *            在庫管理方法
	 * @return 「人数管理」の場合true
	 */
	public static boolean isStockManagePerson(String stockManage) {
		return DJreConstants.CODE_STOCK_MANAGEMENT_PERSONS_MANAGED
				.equals(stockManage);
	}

	/**
	 * 「回答書種別」が「船車レンタカー」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            回答書種別
	 * @return 「船車レンタカー」の場合true
	 */
	public static boolean isTrafficRentacar(String kindFlg) {
		return DJreConstants.CODE_KIND_FLG_TRAFFIC_RENTACAR.equals(kindFlg);
	}

	/**
	 * 「回答書種別」が「観光ゴルフ」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            回答書種別
	 * @return 「観光ゴルフ」の場合true
	 */
	public static boolean isTravelGolf(String kindFlg) {
		return JreConstants.KIND_FLG_GOLF.equals(kindFlg);
	}

	/**
	 * 「回答書種別」が「観光TDR（東京ディズニーリゾート）」であるか判別します。
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            回答書種別
	 * @return 「観光TDR（東京ディズニーリゾート）」の場合true
	 */
	public static boolean isTravelTdr(String kindFlg) {
		return DJreConstants.CODE_KIND_FLG_TRAVEL_TDR.equals(kindFlg);
	}

	/**
	 * 採番 .
	 *
	 * @param bean
	 *            .
	 * @param plansNoStrParam
	 *            .
	 * @return .
	 */
	public static DNo1PlanNoData subPlanNoService(final DNo1PlanNoBean bean,
			final String plansNoStrParam) {
		DNo1PlanNoData planNoData = new DNo1PlanNoData();

		String plansNoStr = plansNoStrParam;
		if (plansNoStr == null) {
			AnsSearchData param = new AnsSearchData();
			param.setCareerNo(bean.getCareerNo());
			param.setPlanAnsNo(bean.getPlanAnsNo());
			plansNoStr = DHarvestUtil.getIdentPlanNo(param);
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

		planNoData.setBranchCd(DHarvestUtil.getBranchCd(plansNoStr));
		planNoData.setYearNo(plansNoStr.substring(2, 3));
		planNoData.setSeasonDiv(plansNoStr.substring(3, 4));
		// 2007年度の採番は30から始まる jinhuashi 2007/
		String subPlansNo = plansNoStr.substring(4, 6);
		/* DEL(S) goudou 2017年度では不要の対応なので削除 */
		//        if (plansNoStr.substring(2, 3).equals("7")) {
		//            if (Integer.parseInt(subPlansNo) < 30) {
		//                subPlansNo = new Integer(Integer.parseInt(subPlansNo) + 30)
		//                        .toString();
		//            }
		//        }
		/* DEL(E) goudou 2017年度では不要の対応なので削除 */
		planNoData.setPlanNo(subPlansNo);
		plansNoStr = plansNoStr.substring(0, 4) + subPlansNo;
		planNoData.setPlansNoStr(plansNoStr);

		return planNoData;
	}

	/**
	 * コンストラクタ
	 */
	private DKikakuWebUtil() {
	}

}
