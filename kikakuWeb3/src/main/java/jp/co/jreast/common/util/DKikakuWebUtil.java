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
 * D��ʗpKikakuWebUtil���b�p�[�N���X
 *
 * <pre>
 *   �@�\�T�v �F
 *   ���L���� �F D��ʂɂ��ǉ��ƂȂ铮��͂����Ɏ�������B
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public final class DKikakuWebUtil extends DKikakuWebUtilWrapper {

	/** NO1���ID�̃��X�g */
	private static final List<String> NO1_SCREEN_ID;

	/** NO2���ID�̃��X�g */
	private static final List<String> NO2_SCREEN_ID;

	/** NO3���ID�̃��X�g */
	private static final List<String> NO3_SCREEN_ID;

	/** NO4���ID�̃��X�g */
	private static final List<String> NO4_SCREEN_ID;

	/** NO5���ID�̃��X�g */
	private static final List<String> NO5_SCREEN_ID;

	static {
		// NO1���ID�̃��X�g��������
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

		// NO2���ID�̃��X�g��������
		NO2_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO2,
				JreConstants.SCREEN_ID_LIFT_NO2,
				JreConstants.SCREEN_ID_NO2_HOTEL,
				JreConstants.SCREEN_ID_NO2_SKI,
				DJreConstants.SCREEN_ID_D_STAYING_NO2,
				DJreConstants.SCREEN_ID_D_LIFT_NO2,
				DJreConstants.SCREEN_ID_D_STAYING_NO2_HOTEL,
				DJreConstants.SCREEN_ID_D_STAYING_NO2_SKI });

		// NO3���ID�̃��X�g��������
		NO3_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO3,
				DJreConstants.SCREEN_ID_D_STAYING_NO3 });

		// NO4���ID�̃��X�g��������
		NO4_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO4,
				JreConstants.SCREEN_ID_NO4_1, JreConstants.SCREEN_ID_NO4_2,
				DJreConstants.SCREEN_ID_D_STAYING_NO4,
				DJreConstants.SCREEN_ID_D_TRAVEL_TRAFFIC_NO4,
				DJreConstants.SCREEN_ID_D_LIFT_NO4 });

		// NO5���ID�̃��X�g��������
		NO5_SCREEN_ID = Arrays.asList(new String[] { JreConstants.SCREEN_ID_NO5,
				DJreConstants.SCREEN_ID_D_STAYING_NO5 });

	}

	/**
	 * �V�[�g���z��ɃV�[�g����ǉ�����
	 *
	 * @param sheetName
	 *            �ǉ��V�[�g��
	 * @param sheetNameArray
	 *            �V�[�g���z��
	 * @param sizePerPage
	 *            �P�y�[�W������̃f�[�^��
	 * @param totalDataSize
	 *            ���f�[�^��
	 * @return �V�[�g�z��
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
	 * �e���v���[�g���z��Ƀe���v���[�g����ǉ�����
	 *
	 * @param templateName
	 *            �ǉ��e���v���[�g��
	 * @param templateNameArray
	 *            �e���v���[�g���z��
	 * @param sizePerPage
	 *            �P�y�[�W������̃f�[�^��
	 * @param totalDataSize
	 *            ���f�[�^��
	 * @return �e���v���[�g���z��
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
	 * �w�肵���ʒu��1�������擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param text
	 *            �����Ώە���
	 * @param pos
	 *            �ʒu
	 * @return �w�肵���ʒu�̕���
	 */
	public static String charAt(String text, int pos) {
		if (StringUtils.isEmpty(text)) {
			return "";
		}
		return "" + text.charAt(pos - 1);
	}

	/**
	 * ���t������𐮌`���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param dateString
	 *            ���t������
	 * @return ���t������i�N�����j
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
	 * compareList��name���܂܂�Ă�����styleClassVal�ɃX�^�C���N���X��ǉ����ĕԋp����
	 *
	 * <pre></pre>
	 *
	 * @param compareList
	 *            �X�^�C���N���X�ǉ��Ώۃ��X�g
	 * @param name
	 *            �X�^�C���N���X�ǉ��Ώ�name
	 * @param styleClassVal
	 *            �ǉ�����X�^�C���N���X
	 * @return �ǉ���̃X�^�C���N���X
	 */
	public static String getDifferentStyleClass(List<String> compareList,
			String name, String styleClassVal) {

		String ret = "";
		if (styleClassVal != null) {
			ret = styleClassVal;
		}

		//���X�g�ɓ���name������΃X�^�C���N���X�ɒǋL
		if (compareList.contains(name)) {
			if (ret.indexOf("changedClass") < 0) {
				ret = ret + " changedClass ";
			}
		} else {
			//���X�g�ɓ���name���Ȃ���΁uchangedClass�v���폜����
			ret = ret.replaceAll("changedClass", "");
		}

		return ret;
	}

	/**
	 * ���񓚏�No2��Ԃ̎��̏�Ԃ��擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            ���s�C�x���g(DJreConstants.event)
	 * @param currentStatus
	 *            ���݂̏��
	 * @param isError
	 *            �G���[�̗L��
	 * @return ���̏��
	 */
	public static Integer getNextNo2Status(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError) {
		return getNextStatus(event, currentStatus, isError, null);
	}

	/**
	 * ���񓚏�No2��Ԃ̎��̏�Ԃ��擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            ���s�C�x���g(DJreConstants.event)
	 * @param currentStatus
	 *            ���݂̏��
	 * @param isError
	 *            �G���[�̗L��
	 * @param sendDiv
	 *            FAX���M�敪
	 * @return ���̏��
	 */
	public static Integer getNextNo2Status(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError,
			final Integer sendDiv) {
		return getNextStatus(event, currentStatus, isError, sendDiv, true);
	}

	/**
	 * ���񓚏��̎��̏�Ԃ��擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            ���s�C�x���g(DJreConstants.event)
	 * @param currentStatus
	 *            ���݂̏��
	 * @param isError
	 *            �G���[�̗L��
	 * @return ���̏��
	 */
	public static Integer getNextStatus(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError) {
		return getNextStatus(event, currentStatus, isError, null);
	}

	/**
	 * ���񓚏��̎��̏�Ԃ��擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            ���s�C�x���g(DJreConstants.event)
	 * @param currentStatus
	 *            ���݂̏��
	 * @param isError
	 *            �G���[�̗L��
	 * @param sendDiv
	 *            FAX���M�敪
	 * @return ���̏��
	 */
	public static Integer getNextStatus(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError,
			final Integer sendDiv) {
		return getNextStatus(event, currentStatus, isError, sendDiv, null);
	}

	/**
	 * ���񓚏��̎��̏�Ԃ��擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param event
	 *            ���s�C�x���g(DJreConstants.event)
	 * @param currentStatus
	 *            ���݂̏��
	 * @param isError
	 *            �G���[�̗L��
	 * @param sendDiv
	 *            FAX���M�敪
	 * @param isNo2
	 *            No2��Ԃ��ۂ�
	 * @return ���̏��
	 */
	public static Integer getNextStatus(final DJreConstants.event event,
			final Integer currentStatus, final boolean isError,
			final Integer sendDiv, final Boolean isNo2) {
		Integer returnStatus = currentStatus;

		switch (event) {
		// �ꎞ�ۑ��iJR�j
		case jrIchijihozon:
			// ��ԁF�쐬�A�쐬�i�ۗ��j
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
				// ��ԁF���J��
			} else if (JreConstants.STATUS_UNOPEN.equals(currentStatus)) {
				// ���M�敪�FFAX
				if (isFaxSend(sendDiv)) {
					return JreConstants.STATUS_JR;
				}
				return JreConstants.STATUS_UNOPEN;
				// ��ԁF�J��
			} else if (JreConstants.STATUS_OPEN.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES.equals(currentStatus)
					|| JreConstants.STATUS_JR.equals(currentStatus)
					|| JreConstants.STATUS_FACILITIES_ERR.equals(currentStatus)
					|| JreConstants.STATUS_JR_ERR.equals(currentStatus)) {
				if (isError) {
					return JreConstants.STATUS_JR_ERR;
				}
				return JreConstants.STATUS_JR;
				// ��ԁF���M�G���[
			} else if (DJreConstants.STATUS_SOUSHIN_ERROR.equals(currentStatus)) {
				//                if (isError) {
				//                    return JreConstants.STATUS_MAKING_ERR;
				//                } else {
				//                    return JreConstants.STATUS_MAKING;
				//                }
				return DJreConstants.STATUS_SOUSHIN_ERROR;
				// ��ԁF�ĕҏW��
			} else if (DJreConstants.STATUS_SAIHENSHUCHU.equals(currentStatus)) {
				return DJreConstants.STATUS_SAIHENSHUCHU;
				// ��ԁF�{�ݓo�^���i�āj�A�{�ݓo�^���i�ۗ��j�i�āj�AJR�o�^���i�āj�AJR�o�^���i�ۗ��j�i�āj
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
		// �ꎞ�ۑ��i�{�݁j
		case shisetsuIchijihozon:
			// ��ԁF�J���A�쐬�A�{�ݓo�^���AJR�o�^���A�{�ݓo�^���i�āj�AJR�o�^���i�āj�A����
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

				// ��ԁF�{�ݓo�^���i�āj�A�{�ݓo�^���i�ۗ��j�i�āj�AJR�o�^���i�āj�AJR�o�^���i�ۗ��j�i�āj
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
		// ���M
		case soushin:
			// ��ԁF�쐬
			if (JreConstants.STATUS_MAKING.equals(currentStatus)) {
				if (isError) {
					return JreConstants.STATUS_MAKING_ERR;
				}
				return JreConstants.STATUS_UNOPEN;
			}
			break;
		// ���F�iJR�j
		case jrShounin:
			// ���M�敪�FFAX
			if (isFaxSend(sendDiv)) {
				// ��ԁF�J���AJR�o�^���AJR�o�^���i�ۗ��j
				if (JreConstants.STATUS_OPEN.equals(currentStatus)
						|| JreConstants.STATUS_JR.equals(currentStatus)
						|| JreConstants.STATUS_JR_ERR.equals(currentStatus)) {
					return JreConstants.STATUS_APPROVE;
					// ��ԁF�ĕҏW��
				} else if (DJreConstants.STATUS_SAIHENSHUCHU
						.equals(currentStatus)) {
					return DJreConstants.STATUS_RYOUKIN_SHONIN_SAI;
				}
				// ���M�敪�FMAIL
			} else if (isMailSend(sendDiv)) {
				// ��ԁF�����m��
				if (JreConstants.STATUS_CONFIRM.equals(currentStatus)) {
					return JreConstants.STATUS_APPROVE;
					// ��ԁF�ĕҏW���A�����m��i�āj
				} else if (DJreConstants.STATUS_SAIHENSHUCHU
						.equals(currentStatus)
						|| DJreConstants.STATUS_RYOUKIN_KAKUTEI_SAI
								.equals(currentStatus)) {
					return DJreConstants.STATUS_RYOUKIN_SHONIN_SAI;
				}
			}
			break;
		// ����
		case sashimodoshi:
			// ��ԁF�����m��
			if (JreConstants.STATUS_CONFIRM.equals(currentStatus)) {
				return JreConstants.STATUS_SEND_BACK;
				// ��ԁF�ĕҏW���A�����m��i�āj
			} else if (DJreConstants.STATUS_SAIHENSHUCHU.equals(currentStatus)
					|| DJreConstants.STATUS_RYOUKIN_KAKUTEI_SAI
							.equals(currentStatus)) {
				return DJreConstants.STATUS_SASHIMODOSHI_SAI;
			}

			break;
		// FM���M
		case fmSoushin:
			// ��ԁF�������F
			if (JreConstants.STATUS_APPROVE.equals(currentStatus)) {
				return JreConstants.STATUS_APPROVE;
			}
			break;
		// ����WEB�A�g
		case zouseiwebSoushin:
			if (JreConstants.STATUS_APPROVE.equals(currentStatus)) {
				return DJreConstants.STATUS_ZOUSEIWEB_SOUSHINMACHI;
			} else if (DJreConstants.STATUS_RYOUKIN_SHONIN_SAI
					.equals(currentStatus)) {
				return DJreConstants.STATUS_ZOUSEIWEB_SOUSHINMACHI_SAI;
			}
			break;
		// �A�g�σf�[�^�ĕҏW
		case saihenshu:
			// ��ԁF����WEB���M�ρA�����A����WEB���M�ρi�āj
			if (DJreConstants.STATUS_ZOUSEIWEB_SOUSHINZUMI
					.equals(currentStatus)
					|| JreConstants.STATUS_COMPLETE.equals(currentStatus)
					|| DJreConstants.STATUS_ZOUSEIWEB_SOUSHINZUMI_SAI
							.equals(currentStatus)) {
				return DJreConstants.STATUS_SAIHENSHUCHU;
			}
			break;
		// �폜
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
		// ���F�i�{�݁j
		case shisetsuShounin:
			// ��ԁF�J���A�{�ݓo�^���AJR�o�^���A����
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
				// ��ԁF�{�ݓo�^���i�āj�A�{�ݓo�^���i�ۗ��j�i�āj�AJR�o�^���i�āj�A���߁i�āj
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
	 * ���ID�����ʋ敪�iNO1�`5�̐��������j���擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param screenId
	 *            ���ID
	 * @return ��ʋ敪�i�����ʂł��Ȃ��ꍇ��"0"�ɂȂ�܂��j
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
	 * A�R�[�h�i�����i�j�ł��邩���ʂ��܂��B
	 *
	 * <pre>
	 * ��DP/RM�i�V���i�j�łȂ����A�R�[�h�i�����i�j�Ɣ��肳��܂��B
	 * </pre>
	 *
	 * @param facilityMaterialKind
	 *            �{�ݑf�ގ��
	 * @return A�R�[�h�i�����i�j�̏ꍇtrue
	 */
	public static boolean isAcodeFacility(String facilityMaterialKind) {
		return !isDpRmFacility(facilityMaterialKind);
	}

	/**
	 * A�R�[�h�i�����i�j�ł��邩���ʂ��܂��B
	 *
	 * <pre>
	 * ��DP/RM�i�V���i�j�łȂ����A�R�[�h�i�����i�j�Ɣ��肳��܂��B
	 * </pre>
	 *
	 * @param materialKind
	 *            �f�ގ��
	 * @return A�R�[�h�i�����i�j�̏ꍇtrue
	 */
	public static boolean isAcodePlanAns(String materialKind) {
		return !isDpRmPlanAns(materialKind);
	}

	/**
	 * DP/RM�i�V���i�j�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param facilityMaterialKind
	 *            �{�ݑf�ގ��
	 * @return DP/RM�i�V���i�j�̏ꍇtrue
	 */
	public static boolean isDpRmFacility(String facilityMaterialKind) {
		return DJreConstants.CODE_FACILITY_MATERIAL_KIND_DPRM
				.equals(facilityMaterialKind);
	}

	/**
	 * DP/RM�i�V���i�j�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param materialKind
	 *            �f�ގ��
	 * @return DP/RM�i�V���i�j�̏ꍇtrue
	 */
	public static boolean isDpRmPlanAns(String materialKind) {
		return DJreConstants.CODE_MATERIAL_KIND_DP.equals(materialKind)
				|| DJreConstants.CODE_MATERIAL_KIND_RMSP.equals(materialKind)
				|| DJreConstants.CODE_MATERIAL_KIND_DPRM.equals(materialKind);
	}

	/**
	 * �u�{�݃��[�U�v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param userDiv
	 *            ���[�U�[�敪
	 * @return �u�{�݃��[�U�v�̏ꍇtrue
	 */
	public static boolean isFacilities(Integer userDiv) {
		return isFacilities(String.valueOf(userDiv));
	}

	/**
	 * �u�{�݃��[�U�v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param userData
	 *            ���[�U�[�}�X�^�f�[�^
	 * @return �u�{�݃��[�U�v�̏ꍇtrue
	 */
	public static boolean isFacilities(UserData userData) {
		if (userData == null) {
			return false;
		}
		return isFacilities(userData.getUserDiv());
	}

	/**
	 * �u���t�敪�FFAX���M�v�ł��邩���肵�܂��B
	 *
	 * <pre></pre>
	 *
	 * @param sendDiv
	 *            ���t�敪
	 * @return �uFAX���M�v�̏ꍇtrue
	 */
	public static boolean isFaxSend(Integer sendDiv) {
		return isFaxSend(String.valueOf(sendDiv));
	}

	/**
	 * �f�[�^���Q�Ƃ���ہA�}�X�^�[����擾���邩�ۂ����肵�܂��B
	 *
	 * <pre>
	 * ���񓚏����ҏW�\�̏ꍇ�̓}�X�^�[����擾����B
	 * </pre>
	 *
	 * @param status
	 *            ���
	 * @return �}�X�^�[����̎擾��
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
	 * �n���ꂽ�����񂪏��i�R�[�h�̃t�H�[�}�b�g�ɓK���Ă��邩���肵�܂��B
	 *
	 * @param str
	 *            ���͕�����
	 * @return boolean ���i�R�[�h�̃t�H�[�}�b�g�Ɉ�v:true | ���i�R�[�h�̃t�H�[�}�b�g�ɕs��v:false
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
	 * ���샆�[�U�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param userData
	 *            ���[�U�[���
	 * @return ���샆�[�U�̏ꍇtrue
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
	 * �uJR���[�U�v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param userDiv
	 *            ���[�U�[�敪
	 * @return �uJR���[�U�v�̏ꍇtrue
	 */
	public static boolean isJR(Integer userDiv) {
		return isJR(String.valueOf(userDiv));
	}

	/**
	 * �uJR���[�U�v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param userData
	 *            ���[�U�[���
	 * @return �uJR���[�U�v�̏ꍇtrue
	 */
	public static boolean isJR(UserData userData) {
		if (userData == null) {
			return false;
		}
		return isJR(userData.getUserDiv());
	}

	/**
	 * �u���t�敪�F���[�����M�v�ł��邩���肵�܂��B
	 *
	 * <pre></pre>
	 *
	 * @param sendDiv
	 *            ���t�敪
	 * @return �u���[�����M�v�̏ꍇtrue
	 */
	public static boolean isMailSend(Integer sendDiv) {
		return isMailSend(String.valueOf(sendDiv));
	}

	/**
	 * �u�݌ɊǗ����@�v���u�l���Ǘ��v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param stockManage
	 *            �݌ɊǗ����@
	 * @return �u�l���Ǘ��v�̏ꍇtrue
	 */
	public static boolean isStockManagePerson(String stockManage) {
		return DJreConstants.CODE_STOCK_MANAGEMENT_PERSONS_MANAGED
				.equals(stockManage);
	}

	/**
	 * �u�񓚏���ʁv���u�D�ԃ����^�J�[�v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            �񓚏����
	 * @return �u�D�ԃ����^�J�[�v�̏ꍇtrue
	 */
	public static boolean isTrafficRentacar(String kindFlg) {
		return DJreConstants.CODE_KIND_FLG_TRAFFIC_RENTACAR.equals(kindFlg);
	}

	/**
	 * �u�񓚏���ʁv���u�ό��S���t�v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            �񓚏����
	 * @return �u�ό��S���t�v�̏ꍇtrue
	 */
	public static boolean isTravelGolf(String kindFlg) {
		return JreConstants.KIND_FLG_GOLF.equals(kindFlg);
	}

	/**
	 * �u�񓚏���ʁv���u�ό�TDR�i�����f�B�Y�j�[���]�[�g�j�v�ł��邩���ʂ��܂��B
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            �񓚏����
	 * @return �u�ό�TDR�i�����f�B�Y�j�[���]�[�g�j�v�̏ꍇtrue
	 */
	public static boolean isTravelTdr(String kindFlg) {
		return DJreConstants.CODE_KIND_FLG_TRAVEL_TDR.equals(kindFlg);
	}

	/**
	 * �̔� .
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
	 * �R���X�g���N�^
	 */
	private DKikakuWebUtil() {
	}

}
