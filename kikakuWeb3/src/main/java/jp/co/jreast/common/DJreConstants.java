package jp.co.jreast.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.jreast.common.data.BasicMstData;
import jp.co.jreast.common.data.ddata.NestedLabelValueBean;
import jp.co.jreast.common.support.LabelValueBean;
import jp.co.jreast.common.util.DKikakuWebUtil;
import jp.co.jreast.common.util.DaoUtils;

/**
 * D��ʗpJreConstants���b�p�[�N���X
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
public final class DJreConstants /* extends JreConstants */ {

	/**
	 * event ���񓚏��ڍׂ̃C�x���g���
	 */
	public enum event {
		/** FM���M */
		fmSoushin,
		/** �ꎞ�ۑ��iJR�j */
		jrIchijihozon,
		/** ���F�iJR�j */
		jrShounin,
		/** �ĕҏW */
		saihenshu,
		/** �폜 */
		sakujo,
		/** ���� */
		sashimodoshi,
		/** �ꎞ�ۑ��i�{�݁j */
		shisetsuIchijihozon,
		/** ���F�i�{�݁j */
		shisetsuShounin,
		/** ���M */
		soushin,
		/** ����WEB���M */
		zouseiwebSoushin
	}

	/**
	 * �ꊇ�o�̓t�@�C�����i�����^�J�[�j
	 */
	public static final String BATCH_PRINT_FILE_NAME_RENTACAR = "Rentacar_All";

	/**
	 * �ꊇ�o�̓t�@�C�����iTDR�j
	 */
	public static final String BATCH_PRINT_FILE_NAME_TDR = "Tdr_All";

	/** �\��J�n���΋敪�F���Γ� */
	public static final String BOOK_BEGIN_RELATIVE_DIV_DATE = "1";

	/** �\��J�n���΋敪�F���Ό� */
	public static final String BOOK_BEGIN_RELATIVE_DIV_MONTH = "2";

	/** �x�ЃR�[�h�FVTS */
	public static final String BRANCH_CD_VTS = "70";

	/** �q���N��To : �����l */
	public static final String CHILD_AGE_TO_DEFAULT = "12";

	/** �R�[�h�l �i�Ǘ��O�j: �ʐϒP�� : ���I�� */
	public static final String CODE_AREA_UNIT_NOT_SELECTED = "0";

	/** �R�[�h�l : �����P�ʋ敪�i�S���t�j : �P�������藿�� */
	public static final String CODE_CHARGE_DIV_GOLF_PER_PERSON = "1";

	/** �R�[�h�l : �����P�ʋ敪�i�S���t�j : �P�g�����藘�p�l�����Ɨ��� */
	public static final String CODE_CHARGE_DIV_GOLF_PER_UNIT_USE_PERSON = "3";

	// TODO : �u�R�[�h�l : ��ԁv�̒萔���͉��Őݒ肵�Ă���̂ŁA�K�v�ł���ΏC�����s���B
	/** �R�[�h�l : �����P�ʋ敪 : �P�������藿�� */
	public static final String CODE_CHARGE_DIV_PER_PERSON = "1";

	/** �R�[�h�l : �����P�ʋ敪 : �P�䂠���藿�� */
	public static final String CODE_CHARGE_DIV_PER_UNIT = "2";

	/** �R�[�h�l : �����P�ʋ敪 : �P�䂠���藘�p�l�����Ɨ��� */
	public static final String CODE_CHARGE_DIV_PER_UNIT_USE_PERSON = "3";

	/** �R�[�h�l : �_���� : �����iDP�ARM/SP�j */
	public static final String CODE_CONTRACT_KIND_BOTH = "3";

	/** �R�[�h�l : �_���� : DP�i�_�C���N�g�p�b�P�[�W�j */
	public static final String CODE_CONTRACT_KIND_DP = "1";

	/** �R�[�h�l : �_���� : RM/SP�i���f�B���C�h/�Z���N�g�p�b�N�j */
	public static final String CODE_CONTRACT_KIND_RMSP = "2";

	/** �R�[�h�l : �萔���^�C�v : �z */
	public static final String CODE_DEAL_FEE_TYPE_AMOUNT = "2";

	/** �R�[�h�l : �萔���^�C�v : �� */
	public static final String CODE_DEAL_FEE_TYPE_PERCENT = "1";

	/** �R�[�h�l : ��{�}�X�^.�敪�R�[�h=�ʒm���@ : �݌ɊǗ��}�X�^�̃��X�g�p�t���O */
	public static final String CODE_DIV_INFORM_FOR_STOCK_MANAGEMENT = "1";

	/** �R�[�h�l : �{�ݕt�я�񏳔F�󋵃��[�U�[�敪 : �{�� */
	public static final String CODE_FACILITY_ACK_USER_DIV_FACILITY = "2";

	/** �R�[�h�l : �{�ݕt�я�񏳔F�󋵃��[�U�[�敪 : JR */
	public static final String CODE_FACILITY_ACK_USER_DIV_JR = "1";

	/**
	 * �R�[�h�l : �{�݊m��t���O : �m��
	 *
	 * @see {@link JreConstants#FAC_DECISION_DIV_CODE_2}
	 */
	public static final String CODE_FACILITY_DECISION_FLG_DECISION = "1";

	/**
	 * �R�[�h�l : �{�݊m��t���O : ���m��
	 *
	 * @see {@link JreConstants#FAC_DECISION_DIV_CODE_1}
	 */
	public static final String CODE_FACILITY_DECISION_FLG_UNDECIDED = "0";

	/** �R�[�h�l : �{�ݑf�ގ�� : A�R�[�h�i�����i�j */
	public static final String CODE_FACILITY_MATERIAL_KIND_ACODE = "1";

	/** �R�[�h�l : �{�ݑf�ގ�� : DP�ERM�p�i�V���i�j */
	public static final String CODE_FACILITY_MATERIAL_KIND_DPRM = "2";

	/** �R�[�h�l : �{�ݕt�ю�� : NO3 */
	public static final String CODE_FACILITY_SORTS_NO3 = JreConstants.FUTAI_FACILITY_PATTERN_NO3;

	/** �R�[�h�l : �{�ݕt�ю�� : NO5 */
	public static final String CODE_FACILITY_SORTS_NO5 = JreConstants.FUTAI_FACILITY_PATTERN_NO5;

	/** �R�[�h�l : �񓚏���� : �D�ԃ����^�J�[ */
	public static final String CODE_KIND_FLG_TRAFFIC_RENTACAR = "7";

	/** �R�[�h�l : �񓚏���� : �ό�TDR�i�����f�B�Y�j�[���]�[�g�j */
	public static final String CODE_KIND_FLG_TRAVEL_TDR = "8";

	/** �R�[�h�l : �f�ގ�� : A�R�[�h */
	public static final String CODE_MATERIAL_KIND_ACODE = "0";

	/** �R�[�h�l : �f�ގ�� : DP�i�_�C���N�g�p�b�P�[�W�j */
	public static final String CODE_MATERIAL_KIND_DP = "1";

	/** �R�[�h�l : �f�ގ�� : DP�ERM�p */
	public static final String CODE_MATERIAL_KIND_DPRM = "3";

	/** �R�[�h�l : �f�ގ�� : RM/SP�i���f�B���C�h/�Z���N�g�p�b�N�j */
	public static final String CODE_MATERIAL_KIND_RMSP = "2";

	/** �R�[�h�l : �H������ : 1�����H�t */
	public static final String CODE_MEAL_COND_TYPE_INCLUDE_BREAKFAST = "4";

	/** �R�[�h�l : �ӏ��I�� �l���ɂ��قȂ� */
	public static final String CODE_PLACE_FLG_NINZUU = "2";

	/** �R�[�h�l : �ӏ��I�� ���q�l�I���� */
	public static final String CODE_PLACE_FLG_OKYAKUSAMSENTAKUKA = "0";

	/** �R�[�h�l : �ӏ��I�� �I��s�� */
	public static final String CODE_PLACE_FLG_SENTAKUFUKA = "1";

	/** �R�[�h�l : �ӏ��I�� ���̑��i�t���[���́j */
	public static final String CODE_PLACE_FLG_SONOTA = "3";

	/** �R�[�h�l : �ړI�啪�� : �I�v�V���� */
	public static final String CODE_PURPOSE_LARGE_OPTION = "9";

	/** �R�[�h�l : �����^�J�[�N���X : A */
	public static final String CODE_RENTACAR_CLASS_A = "2";

	/** �R�[�h�l : �����^�J�[�N���X : S */
	public static final String CODE_RENTACAR_CLASS_S = "1";

	/** �R�[�h�l : �I����@ �`�F�b�N�C���� */
	public static final String CODE_SELECT_FLG_CHECKIN = "2";

	/** �R�[�h�l : �I����@ �\�������� */
	public static final String CODE_SELECT_FLG_MOUSHIKOMI = "0";

	/** �R�[�h�l : �I����@ �v�d�b�\�� */
	public static final String CODE_SELECT_FLG_YOUDENWAYOYAKU = "1";

	/** �R�[�h�l : �I����@ �\��s�v */
	public static final String CODE_SELECT_FLG_YOYAKUFUYOU = "3";

	/** �R�[�h�l : �A�������敪 : �Q���ڈȍ~�ꗥ */
	public static final String CODE_STAY_DISCOUNT_ALL = "2";

	/** �R�[�h�l : �A�������敪 : �����ɉ����ĉ� */
	public static final String CODE_STAY_DISCOUNT_CASE = "1";

	/** �R�[�h�l : �݌ɐ����t���O : �������� */
	public static final String CODE_STOCK_CONTROL_FLG_LIMITED = "1";

	/** �R�[�h�l : �݌ɐ����t���O : �������� */
	public static final String CODE_STOCK_CONTROL_FLG_UNLIMITED = "0";

	/** �R�[�h�l : �݌ɊǗ����@ : �l���Ǘ� */
	public static final String CODE_STOCK_MANAGEMENT_PERSONS_MANAGED = "0";

	/** �R�[�h�l : �݌ɊǗ����@ : �䐔�g���Ǘ� */
	public static final String CODE_STOCK_MANAGEMENT_UNIT_MANAGED = "1";

	/** �R�[�h�l : �݌Ƀ^�C�v : �����Ƌ��p */
	public static final String CODE_STOCK_TYPE_SHARE = "4";

	/** �R�[�h�l : �݌ɒP�ʁi�x�[�X�j : �� */
	private static final String CODE_STOCK_UNIT_DAI = "2";

	/** �R�[�h�l : �݌ɒP�ʃ����^�J�[ : �� */
	public static final String CODE_STOCK_UNIT_RENTACAR_DAI = CODE_STOCK_UNIT_DAI;

	/** �R�[�h�l �i�Ǘ��O�j: �l���敪 : ���I�� */
	public static final String CODE_STYLE_DIV_NOT_SELECTED = "0";

	/** ���񓚏�.���ID : JR�� */
	public static final String COM_ID_JRES = "2";

	/** �萔�����E�z�敪�F�� */
	public static final String COMMISSION_RATE_PRICE_PERCENT = "10";

	/** ��Ж��FJR�����{ */
	public static final String COMPANY_NAME_JREAST = "�����{���q�S���������";

	/** ��Ж��FVTS */
	public static final String COMPANY_NAME_VTS = "VTS";

	/** ���t�t�H�[�}�b�g�`�� */
	public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

	/** ��{�}�X�^.�敪�R�[�h : �G���A */
	public static final String DIV_AREA_CD = "0027";

	/** ��{�}�X�^.�敪�R�[�h : NG���[�h */
	public static final String DIV_BAD_WORDS = "0052";

	/** ��{�}�X�^.�敪�R�[�h : �ݒ�x�Е��� */
	public static final String DIV_BRANCH_CLASS = "0035";

	/**
	 * ��{�}�X�^.�敪�R�[�h : �x�ЃR�[�h�iCD1�j <-> ���ʔԗp�x�ЃR�[�h�iCD2�j
	 * SQL���Œ��ڃR�[�h���g�p���Ă��邽�߁A�ύX���͒���
	 */
	public static final String DIV_BRANCH_TO_PLAN_NO = "0048";

	/** ��{�}�X�^.�敪�R�[�h : �����P�ʋ敪(�D��) */
	public static final String DIV_CHARGE_DIV = "0034";

	/** ��{�}�X�^.�敪�R�[�h : �����P�ʋ敪�i�S���t�j */
	public static final String DIV_CHARGE_DIV_GOLF = "0053";

	/** ��{�}�X�^.�敪�R�[�h : �����P�ʋ敪(�ό�) */
	public static final String DIV_CHARGE_DIV_TRAVEL = "0056";

	/** ��{�}�X�^.�敪�R�[�h : �{�ݕt�я��o�^������� */
	public static final String DIV_D_FACILITY_MANAGE_LIMIT = "0049";

	/** ��{�}�X�^.�敪�R�[�h : �萔���^�C�v */
	public static final String DIV_DEAL_FEE_TYPE = "0033";

	/** ��{�}�X�^.�敪�R�[�h : �n��啪�� */
	public static final String DIV_DISTRICT_LARGE_CLASS = "0029";

	/** ��{�}�X�^.�敪�R�[�h : �n�揬���� */
	public static final String DIV_DISTRICT_SMALL_CLASS = "0030";

	/** ��{�}�X�^.�敪�R�[�h : �H�������iNO1�j�i�V���i�p�j */
	public static final String DIV_DR_MEAL_COND_TYPE = "0112";

	/** ��{�}�X�^.�敪�R�[�h : �{�ݑf�ގ�� */
	public static final String DIV_FACILITY_MATERIAL_KIND = "0022";

	/** ��{�}�X�^.�敪�R�[�h : ��ԁi�{�݁j */
	public static final String DIV_FP_STATUS = "0023";

	/**
	 * �����敪�R�[�h.
	 */
	public static final String DIV_GRADE = "1112";

	/** ��{�}�X�^.�敪�R�[�h : �ʒm���@ */
	public static final String DIV_INFORM = "0026";

	/** ��{�}�X�^.�敪�R�[�h : �񓚏��R�Â� */
	public static final String DIV_LINKING_ANS_NAME = "0024";

	/** ��{�}�X�^.�敪�R�[�h : �f�ގ�� */
	public static final String DIV_MATERIAL_KIND = "0021";

	/** ��{�}�X�^.�敪�R�[�h : 1�����ݒ�\���^�C�v�� */
	public static final String DIV_MAX_ROOM_TYPE = "0050";

	/** ��{�}�X�^.�敪�R�[�h : ���̑����� */
	public static final String DIV_MISCELLANEOUS_CLASS = "0037";

	/**
	 * DP/RM�̂ݍ���x��
	 */
	public static final String DIV_NEW_TYPE_CREATE_BRANCH = "0060";

	/**
	 * A�R�[�h�̂ݍ���x��
	 */
	public static final String DIV_OLD_TYPE_CREATE_BRANCH = "0059";

	/** ��{�}�X�^.�敪�R�[�h : �ړI�啪�� */
	public static final String DIV_PURPOSE_LARGE_CLASS = "0031";

	/** ��{�}�X�^.�敪�R�[�h : �ړI������ */
	public static final String DIV_PURPOSE_SMALL_CLASS = "0032";

	/** ��{�}�X�^.�敪�R�[�h : �n�� */
	public static final String DIV_REGION_CD = "0028";

	/** ��{�}�X�^.�敪�R�[�h : �����^�J�[�N���X */
	public static final String DIV_RENTACAR_CLASS = "1111";

	/** ��{�}�X�^.�敪�R�[�h : ���菤�i���� */
	public static final String DIV_SPECIFIC_GOODS_CLASS = "0036";

	/** ��{�}�X�^.�敪�R�[�h : �A�������敪 */
	public static final String DIV_STAY_DISCOUNT = "0110";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁi�S���t�j */
	public static final String DIV_STOCK_UNIT_GOLF = "0043";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁi���t�g�j */
	public static final String DIV_STOCK_UNIT_LIFT = "0044";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁi�����^�J�[�j */
	public static final String DIV_STOCK_UNIT_RENTACAR = "0046";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁiTDR�j */
	public static final String DIV_STOCK_UNIT_TDR = "0045";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁi�D�ԁi��g���j�j */
	public static final String DIV_STOCK_UNIT_TRAFFIC_PERSONS_MANAGED = "0041";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁi�D�ԁi��g����j�j */
	public static final String DIV_STOCK_UNIT_TRAFFIC_UNIT_MANAGED = "0042";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁi�ό��i��g���j�j */
	public static final String DIV_STOCK_UNIT_TRAVEL_PERSONS_MANAGED = "0039";

	/** ��{�}�X�^.�敪�R�[�h : �݌ɒP�ʁi�ό��i��g����j�j */
	public static final String DIV_STOCK_UNIT_TRAVEL_UNIT_MANAGED = "0040";

	/** ��{�}�X�^.�敪�R�[�h : �����s�h���� */
	public static final String DIV_TYO_STAY_TAX = "0109";

	/** ��{�}�X�^.�敪�R�[�h : ���] */
	private static final String DIV_VIEW_CD = "0103";

	/** TODO:�萔���̍œK�����K�v NO1�h�� : �^�C�v(�݌ɕ����̎��^�C�v).null */
	public static final int DR01010_TYPE_NULL = -1;

	/** �ݔ���ʁF������݂��o�� */
	public static final int EQUIPMENT_KIND_HUMIDIFIER = 22;

	/** �ݔ���ʁF�d�C�X�^���h�݂��o�� */
	public static final int EQUIPMENT_KIND_LAMP = 23;

	/** �ݔ���ʁF�����h���[�T�[�r�X */
	public static final int EQUIPMENT_KIND_LAUNDRY = 19;

	/** �ݔ���ʁF�}�b�T�[�W�T�[�r�X */
	public static final int EQUIPMENT_KIND_MASSAGE = 21;

	/** �ݔ���ʁF���H�{�� */
	public static final int EQUIPMENT_KIND_RESTAURANT = 18;

	/** �ݔ���ʁF���[���T�[�r�X */
	public static final int EQUIPMENT_KIND_ROOM_SERVICE = 20;

	/** �ݔ���ʁF�ٓ��ɔ��X���� */
	public static final int EQUIPMENT_KIND_STAND = 17;

	/** ���(�{��) 33:JR�o�^�� */
	public static final int FPSTATUS_JR_TOUROKUCHU = 33;

	/** ���(�{��) 73:JR�o�^��(��) */
	public static final int FPSTATUS_JR_TOUROKUCHU_SAI = 73;

	/** ���(�{��) 34:JR�o�^��(�ۗ�) */
	public static final int FPSTATUS_JR_TOUROKUCHUU_HORYU = 34;

	/** ���(�{��) 74:JR�o�^��(�ۗ�)(��) */
	public static final int FPSTATUS_JR_TOUROKUCHUU_HORYU_SAI = 74;

	/** ���(�{��) 24:�J�� */
	public static final int FPSTATUS_KAIFU = 24;

	/** ���(�{��) 23:���J�� */
	public static final int FPSTATUS_MIKAIFU = 23;

	/** ���(�{��) 51:�ĕҏW��(��) */
	public static final int FPSTATUS_SAIHENSHUCHU_SAI = 51;

	/** ���(�{��) 11:�쐬 */
	public static final int FPSTATUS_SAKUSEI = 11;

	/** ���(�{��) 12:�쐬(�ۗ�) */
	public static final int FPSTATUS_SAKUSEI_HORYU = 12;

	/** ���(�{��) 37:���� */
	public static final int FPSTATUS_SASHIMODOSHI = 37;

	/** ���(�{��) 77:����(��) */
	public static final int FPSTATUS_SASHIMODOSHI_SAI = 77;

	/** ���(�{��) 0:�V�K */
	public static final int FPSTATUS_SHINKI = 0;

	/** ���(�{��) 31:�{�ݓo�^�� */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU = 31;

	/** ���(�{��) 32:�{�ݓo�^��(�ۗ�) */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU_HORYU = 32;

	/** ���(�{��) 72:�{�ݓo�^��(�ۗ�)(��) */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU_HORYU_SAI = 72;

	/** ���(�{��) 71:�{�ݓo�^��(��) */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU_SAI = 71;

	/** ���(�{��) 35:���F�҂� */
	public static final int FPSTATUS_SHONINMACHI = 35;

	/** ���(�{��) 75:���F�҂�(��) */
	public static final int FPSTATUS_SHONINMACHI_SAI = 75;

	/** ���(�{��) 36:���F�� */
	public static final int FPSTATUS_SHONINZUMI = 36;

	/** ���(�{��) 76:���F��(��) */
	public static final int FPSTATUS_SHONINZUMI_SAI = 76;

	/** ���(�{��) 22:���M�G���[ */
	public static final int FPSTATUS_SOUSHINERROR = 22;

	/** ���(�{��) 21:���M�҂� */
	public static final int FPSTATUS_SOUSHINMACHI = 21;

	/** ���(�{��) 41:�����A�g�҂� */
	public static final int FPSTATUS_ZOUSEIRENKEIMACHI = 41;

	/** ���(�{��) 81:�����A�g�҂�(��) */
	public static final int FPSTATUS_ZOUSEIRENKEIMACHI_SAI = 81;

	/** ���(�{��) 42:�����A�g�� */
	public static final int FPSTATUS_ZOUSEIRENKEIZUMI = 42;

	/** ���(�{��) 82:�����A�g��(��) */
	public static final int FPSTATUS_ZOUSEIRENKEIZUMI_SAI = 82;

	/** ��������p�y�[�W�ԍ�: �{�ݕt�я��NO3 */
	public static final int JRIGHT_PAGE_NO3 = 3;

	/** ��������p�y�[�W�ԍ�: �{�ݕt�я��NO5 */
	public static final int JRIGHT_PAGE_NO5 = 5;

	/**
	 * No1��ʓ����{�݌ɂ̌��萔.
	 */
	public static final int JRSTOCKCAPACITY = 6;

	/** ���N�G�X�g�����L�[ : �g�b�v�y�[�W : �X�e�[�^�X�ʒm�f�[�^ */
	public static final String KEY_UR00200_STATUS_NOTICE_DATA = "ur00200statusNoticeOutData";

	/** �񓚏��A�g�F���� */
	public static final String LABEL_KAITOUSHO_RENKEI_ARI = "����";

	/** �񓚏��A�g�F�Ȃ� */
	public static final String LABEL_KAITOUSHO_RENKEI_NASHI = "�Ȃ�";

	/** �񓚏��A�g�F�A�g�� */
	public static final String LABEL_KAITOUSHO_RENKEI_RENKEIZUMI = "�A�g��";

	/** �񓚏��A�g�F�ΏۊO */
	public static final String LABEL_KAITOUSHO_RENKEI_TAISHOUGAI = "-";

	/** ��d�����F���� */
	public static final Integer LIQUIDATE_DAY_CURRENT = new Integer(0);

	/** ���N�G�X�g�����L�[ : �uNG���[�h�v���X�g */
	public static final String LIST_NAME_DIV_BAD_WORDS = "badWordsList";

	/** ���N�G�X�g�����L�[ : �u�ݒ�x�Е��ށv���X�g */
	public static final String LIST_NAME_DIV_BRANCH_CLASS = "branchClassList";

	/** ���N�G�X�g�����L�[ : �u�����P�ʋ敪�i�D�ԁj�v���X�g */
	public static final String LIST_NAME_DIV_CHARGE_DIV = "chargeDivList";

	/** ���N�G�X�g�����L�[ : �u�����P�ʋ敪�i�ό��j�v���X�g */
	public static final String LIST_NAME_DIV_CHARGE_DIV_TRAVEL = "chargeDivTravelList";

	/** ���N�G�X�g�����L�[ : �u�����P�ʋ敪�i�S���t�j�v���X�g */
	public static final String LIST_NAME_DIV_CHARGE_GOLF_DIV = "chargeDivGolfList";

	/** ���N�G�X�g�����L�[�F�u�쐬�����v���X�g */
	public static final String LIST_NAME_DIV_COUNT_CREATE = "countCreateList";

	/** ���N�G�X�g�����L�[ : �u�n��啪�ށv���X�g */
	public static final String LIST_NAME_DIV_DISTRICT_LARGE_CLASS = "districtLargeClassList";

	/** ���N�G�X�g�����L�[ : �u�H�������iNO1�j�i�V���i�p�j�v���X�g */
	public static final String LIST_NAME_DIV_DR_MEAL_COND_TYPE = "drMealCondTypeList";

	/** ���N�G�X�g�����L�[ : �u�{�ݑf�ގ�ʁv���X�g */
	public static final String LIST_NAME_DIV_FACILITY_MATERIAL_KIND = "facilityMaterialKindList";

	/** ���N�G�X�g�����L�[ : �u�����v���X�g */
	public static final String LIST_NAME_DIV_GRADE = "gradeList";

	/** ���N�G�X�g�����L�[ : �u��d���ʒm���@�v���X�g */
	public static final String LIST_NAME_DIV_LIQUIDATE_INFORM = "liquidateInformList";

	/** ���N�G�X�g�����L�[ : �u�f�ގ�ʁv���X�g */
	public static final String LIST_NAME_DIV_MATERIAL_KIND = "materialKindList";

	/** ���N�G�X�g�����L�[ : �u���̑����ށv���X�g */
	public static final String LIST_NAME_DIV_MISCELLANEOUS_CLASS = "miscellaneousClassList";

	/** ���N�G�X�g�����L�[ : �u�ړI�啪�ށv���X�g */
	public static final String LIST_NAME_DIV_PURPOSE_LARGE_CLASS = "purposeLargeClassList";

	/** ���N�G�X�g�����L�[ : �u�����^�J�[�N���X�v���X�g */
	public static final String LIST_NAME_DIV_RENTACAR_CLASS = "rentacarClassList";

	/** ���N�G�X�g�����L�[ : �u�\��ʒm���@�v���X�g */
	public static final String LIST_NAME_DIV_RESERVE_INFORM_WAY = "reserveInformWayList";

	/** ���N�G�X�g�����L�[ : �u���菤�i���ށv���X�g */
	public static final String LIST_NAME_DIV_SPECIFIC_GOODS_CLASS = "specificGoodsClassList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁi�S���t�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_GOLF = "stockUnitGolfList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁi���t�g�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_LIFT = "stockUnitLiftList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁi�����^�J�[�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_RENTACAR = "stockUnitRentacarList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁiTDR�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TDR = "stockUnitTdrList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁi�D�ԁi��g���j�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAFFIC_PERSONS_MANAGED = "stockUnitTrafficPersonsManagedList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁi�D�ԁi��g����j�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAFFIC_UNIT_MANAGED = "stockUnitTrafficUnitManagedList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁi�ό��i��g���j�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAVEL_PERSONS_MANAGED = "stockUnitTravelPersonsManagedList";

	/** ���N�G�X�g�����L�[ : �u�݌ɒP�ʁi�ό��i��g����j�j�v���X�g */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAVEL_UNIT_MANAGED = "stockUnitTravelUnitManagedList";

	/** ���N�G�X�g�����L�[ : �u�����s�h���Łv���X�g */
	public static final String LIST_NAME_DIV_TYO_STAY_TAX = "tyoStayTaxList";

	/** ���N�G�X�g�����L�[ : �u���]�v���X�g */
	public static final String LIST_NAME_DIV_VIEW_CD = "viewCdList";

	/**
	 * �����^�C�v���X�g���iDP/RM�p�j
	 */
	public static final String LIST_ROOM_TYPE_DR = "roomTypeListDr";

	/**
	 * �����^�C�v���X�g��.
	 */
	public static final String LIST_ROOM_TYPE_LABEL_WITH_VALUE_DR = "roomTypeListLabelWithValueDr";

	/** �l����ʁF��w�� */
	public static final int MAN_KIND_COLLEGE = 4;

	/** �l����ʁF���Z�� */
	public static final int MAN_KIND_HIGH = 5;

	/** �l����ʁF���w�� */
	public static final int MAN_KIND_JUNIORHIGH = 6;

	/** �l����ʁF�V�j�A */
	public static final int MAN_KIND_SENIOR = 3;

	/** ���N�G�X�g�����L�[ : �u�G���A�^���^�n��v�}�b�v */
	public static final String MAP_NAME_DIV_AREA_PREFECTURES_REGION = "areaPrefecturesRegionMap";

	/** ���N�G�X�g�����L�[ : �u�x�ЃR�[�h�E�ݒ�x�Е��ފ֘A�v�}�b�v */
	public static final String MAP_NAME_DIV_BRANCH_CLASS_RELATION = "branchClassRelationMap";

	/** ���N�G�X�g�����L�[ : �u�n�揬���ށv�}�b�v */
	public static final String MAP_NAME_DIV_DISTRICT_SMALL_CLASS = "districtSmallClassMap";

	/** ���N�G�X�g�����L�[ : �u�ړI�����ށv�}�b�v */
	public static final String MAP_NAME_DIV_PURPOSE_SMALL_CLASS = "purposeSmallClassMap";

	/** �P�������t���O : �Ȃ� */
	public static final String ONE_PERSON_FLG_NONE = "0";

	/** �P�������t���O : 1������ */
	public static final String ONE_PERSON_FLG_ONE_PERSON_FEE = "1";

	/** �w��p�[�N : ���p�[�N���p�� */
	public static final String PARK_FLG_BOTH = "4";

	/** �w��p�[�N : 1�p�[�N�I�� */
	public static final String PARK_FLG_ONESIDE = "3";

	/** �w��p�[�N : TDL */
	public static final String PARK_FLG_TDL = "1";

	/** �w��p�[�N : TDS */
	public static final String PARK_FLG_TDS = "2";

	/** �v���Z�X�t���O�F�G���[�\���̂݁i�_�C�A���O�\�����j */
	public static final String PROCESS_FLG_NO_ALERT = "1";

	/** �v���Z�X�t���O�F�ʏ�G���[�F�����l�i�_�C�A���O�\���L�j */
	public static final String PROCESS_FLG_NORMAL_ALERT = "0";

	/** �v���Z�X�t���O�F�G���[�ۑ��i�_�C�A���O�\���L�j */
	public static final String PROCESS_FLG_SAVE_ALERT = "2";

	/**
	 * �����^�C�v�敪�R�[�h(DP/RM�p).
	 */
	public static final String ROOM_TYPE_DIV_DR = "0111";

	/** ��ʋ敪 : ����s�� */
	public static final String SCREEN_FLG_ERROR = "0";

	/** ��ʋ敪 : NO1 */
	public static final String SCREEN_FLG_NO1 = "1";

	/** ��ʋ敪 : NO2 */
	public static final String SCREEN_FLG_NO2 = "2";

	/** ��ʋ敪 : NO3 */
	public static final String SCREEN_FLG_NO3 = "3";

	/** ��ʋ敪 : NO4 */
	public static final String SCREEN_FLG_NO4 = "4";

	/** ��ʋ敪 : NO5 */
	public static final String SCREEN_FLG_NO5 = "5";

	/** ���ID : �ό��S���t(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_GOLF_NO1 = "dr01013";

	/** ���ID : �D�ԃ��t�g(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_LIFT_NO1 = "dr01014";

	/** ���ID : �D�ԃ��t�g(DP/RM) : NO2 */
	public static final String SCREEN_ID_D_LIFT_NO2 = "dr01021";

	/** ���ID : �ό��E�D��(DP/RM) : NO4 */
	public static final String SCREEN_ID_D_LIFT_NO4 = "dr01042";

	/** ���ID : �h��(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_STAYING_NO1 = "dr01010";

	/** ���ID : �h��(DP/RM) : NO2 */
	public static final String SCREEN_ID_D_STAYING_NO2 = "dr01020";

	/** ���ID : �h��(DP/RM) : NO2�i�z�e���j */
	public static final String SCREEN_ID_D_STAYING_NO2_HOTEL = "dr01022";

	/** ���ID : �h��(DP/RM) : NO2�i�X�L�[�j */
	public static final String SCREEN_ID_D_STAYING_NO2_SKI = "dr01023";

	/** ���ID : �h��(DP/RM) : NO3 */
	public static final String SCREEN_ID_D_STAYING_NO3 = "dr05030";

	/** ���ID : �h��(DP/RM) : NO3�i�X�L�[�j */
	public static final String SCREEN_ID_D_STAYING_NO3_SKI = "dr05032";

	/** ���ID : �h��(DP/RM) : NO4 */
	public static final String SCREEN_ID_D_STAYING_NO4 = "dr01040";

	/** ���ID : �h��(DP/RM) : NO5 */
	public static final String SCREEN_ID_D_STAYING_NO5 = "dr05050";

	/** ���ID : �h��(DP/RM) : NO5�i�X�L�[�j */
	public static final String SCREEN_ID_D_STAYING_NO5_SKI = "dr05052";

	/** ���ID : �D��(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_TRAFFIC_NO1 = "dr01012";

	/** ���ID : �ό�(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_TRAVEL_NO1 = "dr01011";

	/** ���ID : �ό��E�D��(DP/RM) : NO4 */
	public static final String SCREEN_ID_D_TRAVEL_TRAFFIC_NO4 = "dr01041";

	/** ���ID : �񓚏��쐬��� */
	public static final String SCREEN_ID_PLAN_ANS_CREATE = "ur00300";

	/** ���[�쐬�^�C�v.BatchPrint2XlsFile�n */
	public static final int SHEET_TYPE_BATCH2XLS = 1;

	/** ���[�쐬�^�C�v.Print2XlsFile�n */
	public static final int SHEET_TYPE_PRINT2XLS = 2;

	/** �R�[�h�l : ��� : JR�o�^���i�ۗ��j�i�āj */
	public static final Integer STATUS_JR_TOUROKUCHU_HORYU_SAI = new Integer(54);

	/** �R�[�h�l : ��� : JR�o�^���i�āj */
	public static final Integer STATUS_JR_TOUROKUCHU_SAI = new Integer(53);

	/** �R�[�h�l : ��� : �����m��i�āj */
	public static final Integer STATUS_RYOUKIN_KAKUTEI_SAI = new Integer(60);

	/** �R�[�h�l : ��� : �������F�i�āj */
	public static final Integer STATUS_RYOUKIN_SHONIN_SAI = new Integer(61);

	/** �R�[�h�l : ��� : �ĕҏW�� */
	public static final Integer STATUS_SAIHENSHUCHU = new Integer(50);

	/** �R�[�h�l : ��� : ���߁i�āj */
	public static final Integer STATUS_SASHIMODOSHI_SAI = new Integer(62);

	/** �R�[�h�l : ��� : �{�ݓo�^���i�ۗ��j�i�āj */
	public static final Integer STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI = new Integer(
			52);

	/** �R�[�h�l : ��� : �{�ݓo�^���i�āj */
	public static final Integer STATUS_SHISETSU_TOUROKUCHU_SAI = new Integer(51);

	/** �R�[�h�l : ��� : ���M�G���[ */
	public static final Integer STATUS_SOUSHIN_ERROR = new Integer(3);

	/** �R�[�h�l : ��� : �݌ɒǉ� */
	public static final Integer STATUS_ZAIKO_TSUIKA = new Integer(55);

	/** �R�[�h�l : ��� : ����WEB���M�҂� */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINMACHI = new Integer(24);

	/** �R�[�h�l : ��� : ����WEB���M�҂��i�āj */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINMACHI_SAI = new Integer(
			63);

	/** �R�[�h�l : ��� : ����WEB���M�� */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINZUMI = new Integer(25);

	/** �R�[�h�l : ��� : ����WEB���M�ρi�āj */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINZUMI_SAI = new Integer(
			64);

	/** �݌ɔԍ� : ��݌� */
	public static final String STOCK_NO_NONSTOCKED = "0000";

	/** �݌ɔԍ��i�l���Ǘ��j�I���l */
	public static final String STOCK_NO_PERSONS_MANGED_END = "4999";

	/** �݌ɔԍ��i�l���Ǘ��j�J�n�l */
	public static final String STOCK_NO_PERSONS_MANGED_START = "0001";

	/** �\��݌ɔԍ����X�g */
	public static final String[] STOCK_NO_RESERVED_LIST = new String[] { STOCK_NO_NONSTOCKED };

	/** �݌ɔԍ��i�䐔�g���Ǘ��j�I���l */
	public static final String STOCK_NO_UNIT_MANAGED_END = "9999";

	/** �݌ɔԍ��i�䐔�g���Ǘ��j�J�n�l */
	public static final String STOCK_NO_UNIT_MANAGED_START = "5000";

	/** �����\�ڍ�.�c�[�T���Ή��\ : �Ή����Ȃ� */
	public static final String TWO_SAM_FLG_IMPOSSIBLE = "";

	/** �����\�ڍ�.�c�[�T���Ή��\ : �Ή��\ */
	public static final String TWO_SAM_FLG_POSSIBLE = "1";

	/** ���[�UID�v���t�B�b�N�X : ���샆�[�U */
	public static final String USER_ID_ITN_PREFIX = "itn";

	/** ���񓚏�.�����A�g�� : ���A�g */
	public static final Integer ZOUSEI_RELATE_CNT_NOT_RELATE = new Integer(0);

	/** �t�я�񑢐�WEB���M���R�����g�FNO3 */
	public final static String ZOUSEI_WEB_SEND_COMMENT_TEMPLATE_NO3 = "�{�ݕt�я��NO3���m�肵�܂����B";

	/** �t�я�񑢐�WEB���M���R�����g�FNO5 */
	public final static String ZOUSEI_WEB_SEND_COMMENT_TEMPLATE_NO5 = "�{�ݕt�я��NO5���m�肵�܂����B";

	/**
	 * �敪�R�[�h���w�肵��{�}�X�^�f�[�^�̃��X�g���擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @param divisionCd
	 *            �敪�R�[�h
	 * @return ��{�}�X�^�f�[�^�̃��X�g
	 */
	private static List<BasicMstData> fetchBasicMstData(String divisionCd) {
		IDao dao = DaoManagerDelegate.createDao(IDao.class);

		List<?> resultList = dao.queryForList("d_fetchMBasisByDivisionCd",
				divisionCd);

		List<BasicMstData> list = DaoUtils.castList(resultList);

		return list;
	}

	/**
	 * �u�G���A�^���^�n��v�n�b�V�����擾���܂��B
	 *
	 * <pre>
	 * JS�ŃR���{�{�b�N�X��option�v�f���\�z���邽�߂Ɏg�p���܂��B
	 *
	 * �ȉ��̍\���̃n�b�V�����쐬���܂��B
	 * hash : {
	 *      "(areaCd)" : {
	 *          'label' : "(areaNm)",
	 *          'value' : "(areaCd)",
	 *          'children' : {
	 *              "(prefecturesCd)" : {
	 *                  'label' : "(prefecturesNm)",
	 *                  'value' : "(prefecturesCd)",
	 *                  'children' : {
	 *                      "(regionCd)" : {
	 *                          'label' : "(prefecturesNm)",
	 *                          'value' : "(prefecturesCd)",
	 *                          'children' : {}
	 *                      }
	 *                      ...
	 *                  }
	 *              }
	 *              ...
	 *          }
	 *      },
	 *      ...
	 * }
	 * </pre>
	 *
	 * @return �u�G���A�^���^�n��v�}�b�v
	 */
	public static Map<String, NestedLabelValueBean> getAreaPrefecturesRegionMap() {

		List<BasicMstData> areaList = fetchBasicMstData(DIV_AREA_CD);
		List<BasicMstData> prefecturesList = fetchBasicMstData(JreConstants.DIV_PREFECTURES);
		List<BasicMstData> regionList = fetchBasicMstData(DIV_REGION_CD);

		Map<String, NestedLabelValueBean> areaPrefRegionMap = new HashMap<>();

		// �G���A�f�[�^���n�b�V���ɒǉ�
		for (BasicMstData area : areaList) {
			NestedLabelValueBean areaItem = new NestedLabelValueBean(area);

			areaPrefRegionMap.put(areaItem.getValue(), areaItem);

			// �s���{���f�[�^���n�b�V���ɒǉ�
			for (BasicMstData prefectures : prefecturesList) {
				if (!areaItem.getValue().equals(
						StringUtils.trimToEmpty(prefectures.getBasicCode2()))) {
					continue;
				}

				NestedLabelValueBean prefItem = new NestedLabelValueBean(
						prefectures);

				areaItem.appendChild(prefItem);

				// �n��f�[�^���n�b�V���ɒǉ�
				for (BasicMstData region : regionList) {
					if (!prefItem.getValue().equals(
							StringUtils.trimToEmpty(region.getBasicCode2()))) {
						continue;
					}

					NestedLabelValueBean regionItem = new NestedLabelValueBean(
							region);

					prefItem.appendChild(regionItem);
				}
			}
		}

		return areaPrefRegionMap;
	}

	/**
	 * �uNG���[�h�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �uNG���[�h�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getBadWordsList() {
		return getMstBasicList(DIV_BAD_WORDS);
	}

	/**
	 * �u�ݒ�x�Е��ށv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�ݒ�x�Е��ށvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getBranchClassList() {
		return getMstBasicList(DIV_BRANCH_CLASS);
	}

	/**
	 * �u�x�ЃR�[�h�E�ݒ�x�Е��ފ֘A�v�n�b�V�����擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @return �u�x�ЃR�[�h�E�ݒ�x�Е��ފ֘A�v�n�b�V��
	 */
	public static Map<String, String> getBranchClassRelationMap() {

		Map<String, String> map = new HashMap<>();

		List<BasicMstData> basisList = fetchBasicMstData(DIV_BRANCH_CLASS);

		for (BasicMstData basis : basisList) {
			String branchCd = StringUtils.defaultString(basis.getBasicCode2());
			String branchClass = StringUtils.trimToEmpty(basis.getBasicCode1());

			map.put(branchCd, branchClass);
		}

		return map;
	}

	/**
	 * �u�����P�ʋ敪�i�S���t�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�����P�ʋ敪�i�S���t�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getChargeDivGolfList() {
		return getMstBasicList(DIV_CHARGE_DIV_GOLF);
	}

	/**
	 * �u�����P�ʋ敪�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�����P�ʋ敪�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getChargeDivList() {
		return getMstBasicList(DIV_CHARGE_DIV);
	}

	/**
	 * �u�����P�ʋ敪�i�ό��j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�����P�ʋ敪�i�ό��j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getChargeDivTravelList() {
		return getMstBasicList(DIV_CHARGE_DIV_TRAVEL);
	}

	/**
	 * �u�쐬���� �v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�쐬���� �vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getCountCreateList() {
		List<LabelValueBean> list = new ArrayList<LabelValueBean>();

		for (int i = 1; i < 10; i++) {
			String str = String.valueOf(i);
			list.add(new LabelValueBean(str, str));
		}
		return list;
	}

	/**
	 * �u�n��啪�ށv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�n��啪�ށvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getDistrictLargeClassList() {
		return getMstBasicList(DIV_DISTRICT_LARGE_CLASS);
	}

	/**
	 * �u�n��啪�ށ^�n�揬���ށv�n�b�V�����擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @return �u�n��啪�ށ^�n�揬���ށv�n�b�V��
	 */
	public static Map<String, NestedLabelValueBean> getDistrictSmallClassMap() {
		return getMBasisChildrenMap(DIV_DISTRICT_SMALL_CLASS);
	}

	/**
	 * �u�H�������iNO1�j�i�V���i�p�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�H�������iNO1�j�i�V���i�p�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getDrMealCondTypeList() {
		return getMstBasicList(DIV_DR_MEAL_COND_TYPE);
	}

	/**
	 * �u�{�ݑf�ގ�ʁv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�{�ݑf�ގ�ʁvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getFacilityMaterialKindList() {
		return getMstBasicList(DIV_FACILITY_MATERIAL_KIND);
	}

	/**
	 * �u��ԁi�{�݁j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u��ԁi�{�݁j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getFpStatusList() {
		return getMstBasicList(DIV_FP_STATUS);
	}

	/**
	 * �u�����v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�����vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getGradeList() {
		Map map = (Map) JreConstants.getMstBasicMap().get(DIV_GRADE);
		return JreConstants.getLvListLabelWithValue(map);
	}

	/**
	 * �u��d���ʒm���@�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u��d���ʒm���@�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getLiquidateInformList() {
		return makeInformList();
	}

	/**
	 * Map��LabelValueBean�̃��X�g�ɕϊ�����B
	 *
	 * <pre>
	 * {@link JreConstants#getLvList(Map)} �Ɠ����B
	 * JreConstants�ɌĂяo�������\�b�h���ړ�������A{@link JreConstants#getLvList(Map)}�̉������グ��ꍇ�A���̃��\�b�h�͕s�v�B
	 * </pre>
	 *
	 * @param map
	 *            {@link JreConstants#mstBasicMap} ��1�v�f
	 * @return LabelValueBean�̃��X�g
	 */
	private static List<LabelValueBean> getLvList(Map<String, String> map) {
		List<LabelValueBean> list = new ArrayList<LabelValueBean>();
		for (String key : map.keySet()) {
			String name = StringUtils.defaultString(map.get(key));
			list.add(new LabelValueBean(name, key));
		}
		return list;
	}

	/**
	 * �u�f�ގ�ʁv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�f�ގ�ʁvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getMaterialKindList() {
		return getMstBasicList(DIV_MATERIAL_KIND);
	}

	/**
	 * �u�񓚏���ʁv�ɂ���āu�f�ގ�ʁv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            �񓚏����
	 * @param contractKind
	 *            �_����
	 * @return �u�f�ގ�ʁvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getMaterialKindList(String kindFlg,
			String contractKind) {
		List<LabelValueBean> list = getMaterialKindList();

		// �u�񓚏���ʁv���w�肳��Ă��Ȃ��ꍇ�͍i�荞�݂��s��Ȃ�
		if (StringUtils.isEmpty(kindFlg)) {
			return list;
		}

		// �t�����}�b�v���쐬
		Map<String, LabelValueBean> reverseMap = new HashMap<String, LabelValueBean>();
		for (LabelValueBean item : list) {
			reverseMap.put(item.getValue(), item);
		}

		List<LabelValueBean> filteredList = new ArrayList<LabelValueBean>();

		// �u�ό��v�u�D�ԁv�u�ό��S���t�v�u�D�ԃ��t�g�v
		if (DKikakuWebUtil.isTravel(kindFlg)
				|| DKikakuWebUtil.isTraffic(kindFlg)
				|| DKikakuWebUtil.isGolf(kindFlg)
				|| DKikakuWebUtil.isLift(kindFlg)) {
			filteredList.add(reverseMap
					.get(DJreConstants.CODE_MATERIAL_KIND_ACODE));
			if (StringUtils.isEmpty(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_BOTH
							.equals(contractKind)) {
				filteredList.add(reverseMap
						.get(DJreConstants.CODE_MATERIAL_KIND_DPRM));
			}
		}

		// �u�ό�TDR�v�u�D�ԃ����^�J�[�v
		if (DKikakuWebUtil.isTravelTdr(kindFlg)
				|| DKikakuWebUtil.isTrafficRentacar(kindFlg)) {
			filteredList.add(reverseMap
					.get(DJreConstants.CODE_MATERIAL_KIND_DPRM));
		}

		// �u�h���v
		if (DKikakuWebUtil.isShukuhaku(kindFlg)) {
			filteredList.add(reverseMap
					.get(DJreConstants.CODE_MATERIAL_KIND_ACODE));

			if (StringUtils.isEmpty(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_DP.equals(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_BOTH
							.equals(contractKind)) {
				filteredList.add(reverseMap
						.get(DJreConstants.CODE_MATERIAL_KIND_DP));
			}

			if (StringUtils.isEmpty(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_RMSP
							.equals(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_BOTH
							.equals(contractKind)) {
				filteredList.add(reverseMap
						.get(DJreConstants.CODE_MATERIAL_KIND_RMSP));
			}

		}

		return filteredList;
	}

	/**
	 * �q�v�f�̊�{�}�X�^�f�[�^�n�b�V�����擾���܂��B
	 *
	 * <pre>
	 * �e�q�֌W�̂���敪�̎q�v�f�̃n�b�V�����擾���܂��B
	 * �n�b�V���̃L�[�͊�{�R�[�h2�i�e�v�f�̃R�[�h�l�j�ƂȂ�܂��B�i���ݒ�̏ꍇ�͊i�[����܂���j
	 *
	 * ���JS�ŃR���{�{�b�N�X��option�v�f���\�z���邽�߂Ɏg�p���܂��B
	 *
	 * �ȉ��̍\���̃n�b�V�����쐬���܂��B
	 * hash : {
	 *      "(parentCd)" : {
	 *          'label' : null,
	 *          'value' : null,
	 *          'children' : {
	 *              "(childCd)" : {
	 *                  'label' : "(childNm)",
	 *                  'value' : "(childCd)",
	 *                  'children' : {}
	 *              }
	 *              ...
	 *          }
	 *      },
	 *      ...
	 * }
	 *
	 * </pre>
	 *
	 * @param childDivisionCd
	 *            �q�̋敪�R�[�h
	 * @return ��{�}�X�^�f�[�^�̃n�b�V��
	 */
	private static Map<String, NestedLabelValueBean> getMBasisChildrenMap(
			String childDivisionCd) {
		Map<String, NestedLabelValueBean> map = new HashMap<>();

		List<BasicMstData> childList = fetchBasicMstData(childDivisionCd);

		for (BasicMstData basis : childList) {

			String parentCd = basis.getBasicCode2();
			if (StringUtils.isEmpty(parentCd)) {
				continue;
			}

			NestedLabelValueBean parentItem;
			if (map.containsKey(parentCd)) {
				parentItem = map.get(parentCd);
			} else {
				parentItem = new NestedLabelValueBean();
				map.put(parentCd, parentItem);
			}

			parentItem.appendChild(new NestedLabelValueBean(basis));

		}

		return map;
	}

	/**
	 * �u���̑����� �v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u���̑����� �vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getMiscellaneousClassList() {
		return getMstBasicList(DIV_MISCELLANEOUS_CLASS);
	}

	/**
	 * �u��{�}�X�^.�敪�R�[�h�v���w�肵��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @param div
	 *            ��{�}�X�^.�敪�R�[�h
	 * @return LabelValueBean�̃��X�g
	 */
	private static List<LabelValueBean> getMstBasicList(String div) {
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) JreConstants
				.getMstBasicMap().get(div);

		return getLvList(map);
	}

	/**
	 * <pre></pre>
	 *
	 * @return DP/RM�̉񓚏����쐬�ł���x�Ѓ��X�g
	 */
	public static List<LabelValueBean> getNewTypeCreateList() {
		return getMstBasicList(DIV_NEW_TYPE_CREATE_BRANCH);
	}

	/**
	 * <pre></pre>
	 *
	 * @return A�R�[�h�̉񓚏����쐬�ł���x�Ѓ��X�g
	 */
	public static List<LabelValueBean> getOldTypeCreateList() {
		return getMstBasicList(DIV_OLD_TYPE_CREATE_BRANCH);
	}

	/**
	 * �u�ړI�啪�ށv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�ړI�啪�ށvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getPurposeLargeClassList() {
		return getMstBasicList(DIV_PURPOSE_LARGE_CLASS);
	}

	/**
	 * �u�ړI�啪�ށ^�ړI�����ށv�n�b�V�����擾���܂��B
	 *
	 * <pre></pre>
	 *
	 * @return �u�ړI�啪�ށ^�ړI�����ށv�n�b�V��
	 */
	public static Map<String, NestedLabelValueBean> getPurposeSmallClassMap() {
		return getMBasisChildrenMap(DIV_PURPOSE_SMALL_CLASS);
	}

	/**
	 * �u�����^�J�[�N���X�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�����^�J�[�N���X�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getRentacarClassList() {
		return getMstBasicList(DIV_RENTACAR_CLASS);
	}

	/**
	 * �u�\��ʒm���@�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�\��ʒm���@�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getReserveInformWayList() {
		return makeInformList();
	}

	/**
	 * �u���^�C�v�iDP/RM�p�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u���^�C�v�iDP/RM�p�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getRoomTypeDr() {
		return getMstBasicList(ROOM_TYPE_DIV_DR);
	}

	/**
	 * �^�C�v���X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getRoomTypeLabelWithValueDr() {
		Map map = (Map) JreConstants.getMstBasicMap().get(ROOM_TYPE_DIV_DR);
		return JreConstants.getLvListLabelWithValue(map);
	}

	/**
	 * �u���菤�i���ށv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u���菤�i���ށvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getSpecificGoodsClassList() {
		return getMstBasicList(DIV_SPECIFIC_GOODS_CLASS);
	}

	/**
	 * �u�݌ɒP�ʁi�S���t�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁi�S���t�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitGolfList() {
		return getMstBasicList(DIV_STOCK_UNIT_GOLF);
	}

	/**
	 * �u�݌ɒP�ʁi���t�g�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁi���t�g�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitLiftList() {
		return getMstBasicList(DIV_STOCK_UNIT_LIFT);
	}

	/**
	 * �u�݌ɒP�ʁi�����^�J�[�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁi�����^�J�[�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitRentacarList() {
		return getMstBasicList(DIV_STOCK_UNIT_RENTACAR);
	}

	/**
	 * �u�݌ɒP�ʁiTDR�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁiTDR�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitTdrList() {
		return getMstBasicList(DIV_STOCK_UNIT_TDR);
	}

	/**
	 * �u�݌ɒP�ʁi�D�ԁi��g���j�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁi�D�ԁi��g���j�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitTrafficPersonsManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAFFIC_PERSONS_MANAGED);
	}

	/**
	 * �u�݌ɒP�ʁi�D�ԁi��g����j�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁi�D�ԁi��g����j�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitTrafficUnitManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAFFIC_UNIT_MANAGED);
	}

	/**
	 * �u�݌ɒP�ʁi�ό��i��g���j�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁi�ό��i��g���j�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitTravelPersonsManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAVEL_PERSONS_MANAGED);
	}

	/**
	 * �u�݌ɒP�ʁi�ό��i��g����j�j�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�݌ɒP�ʁi�ό��i��g����j�j�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getStockUnitTravelUnitManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAVEL_UNIT_MANAGED);
	}

	/**
	 * �u�����s�h���Łv��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�����s�h���ŁvLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getTyoStayTaxList() {
		return getMstBasicList(DIV_TYO_STAY_TAX);
	}

	/**
	 * �u���]�v��LabelValueBean���X�g���擾����B
	 *
	 * <pre></pre>
	 *
	 * @return �u���]�vLabelValueBean���X�g
	 */
	public static List<LabelValueBean> getViewCdList() {
		return getMstBasicList(DIV_VIEW_CD);
	}

	/**
	 * �u�ʒm���@�i�݌ɊǗ��p�j�v��LabelValueBean���X�g���쐬����B
	 *
	 * <pre></pre>
	 *
	 * @return �u�ʒm���@�i�݌ɊǗ��p�j�vLabelValueBean���X�g
	 */
	private static List<LabelValueBean> makeInformList() {
		List<BasicMstData> list = fetchBasicMstData(DIV_INFORM);
		Map<String, String> map = new LinkedHashMap<>();
		for (BasicMstData inform : list) {
			// �K�v�ȃf�[�^�����W����
			if (!CODE_DIV_INFORM_FOR_STOCK_MANAGEMENT.equals(inform
					.getBasicCode2())) {
				continue;
			}
			String key = StringUtils.trimToEmpty(inform.getBasicCode1());
			String value = inform.getBasicName1();
			map.put(key, value);
		}
		return JreConstants.getLvListLabelWithValue(map);
	}

	/**
	 * �R���X�g���N�^
	 */
	private DJreConstants() {
		super();
	}
}
