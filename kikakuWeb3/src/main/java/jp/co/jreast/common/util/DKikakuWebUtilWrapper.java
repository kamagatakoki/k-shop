package jp.co.jreast.common.util;

import org.springframework.validation.BindingResult;

import jp.co.intage.framework.dao.IDao;
import jp.co.intage.framework.util.MessageResources;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.dno1data.BaseDNo1Data;
import jp.co.jreast.common.data.dno1data.DNo1PlanNoBean;
import jp.co.jreast.common.data.dno1data.DNo1PlanNoData;
import jp.co.jreast.common.data.dno1data.IDNo1CommonData;
import jp.co.jreast.common.validator.CooperationChecks;

/**
 * D画面用KikakuWebUtilラッパークラス
 *
 * <pre>
 *   機能概要 ：
 *   特記事項 ： D画面により既存実装をオーバーライドする場合はここに実装する。
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public abstract class DKikakuWebUtilWrapper extends KikakuWebUtil {

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

	public static final BindingResult checkTermTime(IDNo1CommonData termTime,
			int currentY, BindingResult errors, String fieldName,
			MessageResources errorRe, String kind) {

		boolean errorFromY = false, errorFromM = false, errorFromD = false, errorEndY = false, errorEndM = false,
				errorEndD = false;
		int fromY, fromM, fromD, endY, endM, endD;
		// 期限のチェックはじめ
		//		if ("".equals(termTime.getTermFromY())) {
		//			// 開始年度は空
		//			errors.add(fieldName + "termFromY",
		//					new ActionMessage(addMessage(kind, "W309")));
		//			errorFromY = true;
		//		} else if (!isNumber(termTime.getTermFromY())) {
		//			// 開始年度は数字ではない
		//			errors.add(
		//					fieldName + "termFromY",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W209"))));
		//			errorFromY = true;
		//		} else {
		//			// 開始年度は年度+1、年度-1の中ですか
		//			fromY = Integer.parseInt(termTime.getTermFromY());
		//			if (fromY > currentY + 1 || fromY < currentY - 1) {
		//				errors.add(fieldName + "termFromY", new ActionMessage(
		//						addMessage(kind, "W236"), String.valueOf(currentY - 1),
		//						String.valueOf(currentY), String.valueOf(currentY + 1)));
		//				errorFromY = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermFromM())) {
		//			// 開始月は空
		//			errors.add(fieldName + "termFromM",
		//					new ActionMessage(addMessage(kind, "W310")));
		//			errorFromM = true;
		//		} else if (!isNumber(termTime.getTermFromM())) {
		//			// 開始月は数字ではない
		//			errors.add(
		//					fieldName + "termFromM",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W210"))));
		//			errorFromM = true;
		//		} else {
		//			// 開始月は１～１２以内ですか
		//			fromM = Integer.parseInt(termTime.getTermFromM());
		//			if (fromM < JreConstants.JANUARY || fromM > JreConstants.DECEMBER) {
		//				errors.add(
		//						fieldName + "termFromM",
		//						new ActionMessage("errors.range", errorRe
		//								.getMessage(addMessage(kind, "W210")), "1",
		//								"12"));
		//				errorFromM = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermFromD())) {
		//			// 開始日は空
		//			errors.add(fieldName + "termFromD",
		//					new ActionMessage(addMessage(kind, "W311")));
		//			errorFromD = true;
		//		} else if (!isNumber(termTime.getTermFromD())) {
		//			// 開始日は数字ではない
		//			errors.add(
		//					fieldName + "termFromD",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W211"))));
		//			errorFromD = true;
		//		} else {
		//			// 開始日は１～３１いないですか
		//			fromD = Integer.parseInt(termTime.getTermFromD());
		//			if (fromD < JreConstants.FIRSEDAY || fromD > JreConstants.LASTDAT) {
		//				errors.add(
		//						fieldName + "termFromD",
		//						new ActionMessage("errors.range", errorRe
		//								.getMessage(addMessage(kind, "W211")), "1",
		//								"31"));
		//				errorFromD = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermEndY())) {
		//			// 終了年度はから
		//			errors.add(fieldName + "termEndY",
		//					new ActionMessage(addMessage(kind, "W312")));
		//			errorEndY = true;
		//		} else if (!isNumber(termTime.getTermEndY())) {
		//			// 終了年度は数字ではない
		//			errors.add(
		//					fieldName + "termEndY",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W263"))));
		//			errorEndY = true;
		//		} else {
		//			// 終了年度は年度ー１、年度＋１以内ですか
		//			endY = Integer.parseInt(termTime.getTermEndY());
		//			if (endY > currentY + 1 || endY < currentY - 1) {
		//				errors.add(fieldName + "termEndY", new ActionMessage(
		//						addMessage(kind, "W261"), String.valueOf(currentY - 1),
		//						String.valueOf(currentY), String.valueOf(currentY + 1)));
		//				errorEndY = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermEndM())) {
		//			// 終了月は空
		//			errors.add(fieldName + "termEndM",
		//					new ActionMessage(addMessage(kind, "W313")));
		//			errorEndM = true;
		//		} else if (!isNumber(termTime.getTermEndM())) {
		//			// 終了月は数字ではない
		//			errors.add(
		//					fieldName + "termEndM",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W264"))));
		//			errorEndM = true;
		//		} else {
		//			// 終了月は１～１２以内ですか
		//			endM = Integer.parseInt(termTime.getTermEndM());
		//			if (endM < JreConstants.JANUARY || endM > JreConstants.DECEMBER) {
		//				errors.add(
		//						fieldName + "termEndM",
		//						new ActionMessage("errors.range", errorRe
		//								.getMessage(addMessage(kind, "W264")), "1",
		//								"12"));
		//				errorEndM = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermEndD())) {
		//			// 終了日は空
		//			errors.add(fieldName + "termEndD",
		//					new ActionMessage(addMessage(kind, "W314")));
		//			errorEndD = true;
		//		} else if (!isNumber(termTime.getTermEndD())) {
		//			// 終了日は数字ではない
		//			errors.add(
		//					fieldName + "termEndD",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W265"))));
		//			errorEndD = true;
		//		} else {
		//			// 終了日は１～３１以内ですか
		//			endD = Integer.parseInt(termTime.getTermEndD());
		//			if (endD < JreConstants.FIRSEDAY || endD > JreConstants.LASTDAT) {
		//				errors.add(
		//						fieldName + "termEndD",
		//						new ActionMessage("errors.range", errorRe
		//								.getMessage(addMessage(kind, "W265")), "1",
		//								"31"));
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
	 * Fax送信を判断.
	 *
	 * @param data
	 *            Ｎｏ１データ
	 * @return Ｆａｘ送信か
	 */
	public static boolean isFaxSend(BaseDNo1Data data) {
		return isFaxSend(data.getPlanAnsData().getSendDiv().toString());
	}

	/**
	 * 使用可能文字検証を実施します。
	 *
	 * <pre></pre>
	 *
	 * @see jp.co.jreast.common.util.KikakuWebUtil#isKanji(String)
	 * @see jp.co.jreast.common.validator.CooperationChecks#findIllegalChar(String)
	 * @param str
	 *            検証対象の文字列
	 * @return 検証OKの場合は空文字列、検証NGの場合は該当した文字を返します。
	 */
	public static String isKanji(String str) {
		return CooperationChecks.findIllegalChar(str);
	}

	/**
	 * 採番 .DKikakuWebUtilでオーバーライドしてるので不要なメソッド？
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

		planNoData.setBranchCd(plansNoStr.substring(0, 2));
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
	 * 「完了」状態に更新する。
	 *
	 * <pre></pre>
	 *
	 * @deprecated
	 *             回答書の状態を「完了」に更新する処理はバッチによって実現されるようになりました。
	 *             バッチ処理で連携ファイルを作成した回答書のみ「完了」状態になります。
	 * @param planAnsNo
	 *            企画回答連番
	 * @param careerNo
	 *            履歴番号
	 * @param dao
	 *            DAO
	 */
	@Deprecated
	public static void updateFinishStatus(Long planAnsNo, Integer careerNo,
			IDao dao) {
		throw new AssertionError("非推奨のメソッドが実行されました。");
	}

}
