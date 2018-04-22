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
 * D��ʗpKikakuWebUtil���b�p�[�N���X
 *
 * <pre>
 *   �@�\�T�v �F
 *   ���L���� �F D��ʂɂ������������I�[�o�[���C�h����ꍇ�͂����Ɏ�������B
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public abstract class DKikakuWebUtilWrapper extends KikakuWebUtil {

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

	public static final BindingResult checkTermTime(IDNo1CommonData termTime,
			int currentY, BindingResult errors, String fieldName,
			MessageResources errorRe, String kind) {

		boolean errorFromY = false, errorFromM = false, errorFromD = false, errorEndY = false, errorEndM = false,
				errorEndD = false;
		int fromY, fromM, fromD, endY, endM, endD;
		// �����̃`�F�b�N�͂���
		//		if ("".equals(termTime.getTermFromY())) {
		//			// �J�n�N�x�͋�
		//			errors.add(fieldName + "termFromY",
		//					new ActionMessage(addMessage(kind, "W309")));
		//			errorFromY = true;
		//		} else if (!isNumber(termTime.getTermFromY())) {
		//			// �J�n�N�x�͐����ł͂Ȃ�
		//			errors.add(
		//					fieldName + "termFromY",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W209"))));
		//			errorFromY = true;
		//		} else {
		//			// �J�n�N�x�͔N�x+1�A�N�x-1�̒��ł���
		//			fromY = Integer.parseInt(termTime.getTermFromY());
		//			if (fromY > currentY + 1 || fromY < currentY - 1) {
		//				errors.add(fieldName + "termFromY", new ActionMessage(
		//						addMessage(kind, "W236"), String.valueOf(currentY - 1),
		//						String.valueOf(currentY), String.valueOf(currentY + 1)));
		//				errorFromY = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermFromM())) {
		//			// �J�n���͋�
		//			errors.add(fieldName + "termFromM",
		//					new ActionMessage(addMessage(kind, "W310")));
		//			errorFromM = true;
		//		} else if (!isNumber(termTime.getTermFromM())) {
		//			// �J�n���͐����ł͂Ȃ�
		//			errors.add(
		//					fieldName + "termFromM",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W210"))));
		//			errorFromM = true;
		//		} else {
		//			// �J�n���͂P�`�P�Q�ȓ��ł���
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
		//			// �J�n���͋�
		//			errors.add(fieldName + "termFromD",
		//					new ActionMessage(addMessage(kind, "W311")));
		//			errorFromD = true;
		//		} else if (!isNumber(termTime.getTermFromD())) {
		//			// �J�n���͐����ł͂Ȃ�
		//			errors.add(
		//					fieldName + "termFromD",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W211"))));
		//			errorFromD = true;
		//		} else {
		//			// �J�n���͂P�`�R�P���Ȃ��ł���
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
		//			// �I���N�x�͂���
		//			errors.add(fieldName + "termEndY",
		//					new ActionMessage(addMessage(kind, "W312")));
		//			errorEndY = true;
		//		} else if (!isNumber(termTime.getTermEndY())) {
		//			// �I���N�x�͐����ł͂Ȃ�
		//			errors.add(
		//					fieldName + "termEndY",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W263"))));
		//			errorEndY = true;
		//		} else {
		//			// �I���N�x�͔N�x�[�P�A�N�x�{�P�ȓ��ł���
		//			endY = Integer.parseInt(termTime.getTermEndY());
		//			if (endY > currentY + 1 || endY < currentY - 1) {
		//				errors.add(fieldName + "termEndY", new ActionMessage(
		//						addMessage(kind, "W261"), String.valueOf(currentY - 1),
		//						String.valueOf(currentY), String.valueOf(currentY + 1)));
		//				errorEndY = true;
		//			}
		//		}
		//		if ("".equals(termTime.getTermEndM())) {
		//			// �I�����͋�
		//			errors.add(fieldName + "termEndM",
		//					new ActionMessage(addMessage(kind, "W313")));
		//			errorEndM = true;
		//		} else if (!isNumber(termTime.getTermEndM())) {
		//			// �I�����͐����ł͂Ȃ�
		//			errors.add(
		//					fieldName + "termEndM",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W264"))));
		//			errorEndM = true;
		//		} else {
		//			// �I�����͂P�`�P�Q�ȓ��ł���
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
		//			// �I�����͋�
		//			errors.add(fieldName + "termEndD",
		//					new ActionMessage(addMessage(kind, "W314")));
		//			errorEndD = true;
		//		} else if (!isNumber(termTime.getTermEndD())) {
		//			// �I�����͐����ł͂Ȃ�
		//			errors.add(
		//					fieldName + "termEndD",
		//					new ActionMessage("errors.integer", errorRe
		//							.getMessage(addMessage(kind, "W265"))));
		//			errorEndD = true;
		//		} else {
		//			// �I�����͂P�`�R�P�ȓ��ł���
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
	 * Fax���M�𔻒f.
	 *
	 * @param data
	 *            �m���P�f�[�^
	 * @return �e�������M��
	 */
	public static boolean isFaxSend(BaseDNo1Data data) {
		return isFaxSend(data.getPlanAnsData().getSendDiv().toString());
	}

	/**
	 * �g�p�\�������؂����{���܂��B
	 *
	 * <pre></pre>
	 *
	 * @see jp.co.jreast.common.util.KikakuWebUtil#isKanji(String)
	 * @see jp.co.jreast.common.validator.CooperationChecks#findIllegalChar(String)
	 * @param str
	 *            ���ؑΏۂ̕�����
	 * @return ����OK�̏ꍇ�͋󕶎���A����NG�̏ꍇ�͊Y������������Ԃ��܂��B
	 */
	public static String isKanji(String str) {
		return CooperationChecks.findIllegalChar(str);
	}

	/**
	 * �̔� .DKikakuWebUtil�ŃI�[�o�[���C�h���Ă�̂ŕs�v�ȃ��\�b�h�H
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
		// 2007�N�x�̍̔Ԃ�30����n�܂� jinhuashi 2007/
		String subPlansNo = plansNoStr.substring(4, 6);
		/* DEL(S) goudou 2017�N�x�ł͕s�v�̑Ή��Ȃ̂ō폜 */
		//        if (plansNoStr.substring(2, 3).equals("7")) {
		//            if (Integer.parseInt(subPlansNo) < 30) {
		//                subPlansNo = new Integer(Integer.parseInt(subPlansNo) + 30)
		//                        .toString();
		//            }
		//        }
		/* DEL(E) goudou 2017�N�x�ł͕s�v�̑Ή��Ȃ̂ō폜 */
		planNoData.setPlanNo(subPlansNo);
		plansNoStr = plansNoStr.substring(0, 4) + subPlansNo;
		planNoData.setPlansNoStr(plansNoStr);

		return planNoData;
	}

	/**
	 * �u�����v��ԂɍX�V����B
	 *
	 * <pre></pre>
	 *
	 * @deprecated
	 *             �񓚏��̏�Ԃ��u�����v�ɍX�V���鏈���̓o�b�`�ɂ���Ď��������悤�ɂȂ�܂����B
	 *             �o�b�`�����ŘA�g�t�@�C�����쐬�����񓚏��̂݁u�����v��ԂɂȂ�܂��B
	 * @param planAnsNo
	 *            ���񓚘A��
	 * @param careerNo
	 *            ����ԍ�
	 * @param dao
	 *            DAO
	 */
	@Deprecated
	public static void updateFinishStatus(Long planAnsNo, Integer careerNo,
			IDao dao) {
		throw new AssertionError("�񐄏��̃��\�b�h�����s����܂����B");
	}

}
