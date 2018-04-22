package jp.co.jreast.common;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.BasicMstData;
import jp.co.jreast.common.support.LabelValueBean;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 *   ���ʒ萔�N���X�B.
 *   �@�\�T�v    �F  ���ʒ萔������B
 *   ���L����    �F  ����
 * </pre>
 */
public class JreConstants {

	/**
	 * �S�̂̏��(�������F).
	 */
	public static final String ADMINSTATUS_ALL = "�������F";

	/**
	 * No1�ȊO�̏�ԁi���F).
	 */
	public static final String ADMINSTATUS_OTHER = "���F";

	/**
	 * No1�ȊO�̏�ԁi�m��).
	 */
	public static final String AGREESTATUS_OTHER = "�m��";

	//�m���Ԗ��O�̏C��
	/**
	 * �S�̂̏��(�����m��).
	 */
	public static final String AGREESTATUS_RECORD = "�����m��";

	/**
	 * �ʐϒP�ʋ敪�R�[�h.
	 */
	public static final String AREA_UNIT_DIV = "0202";

	/**
	 * �ꊇ�o�̓t�@�C�����i�S���t�j
	 */
	public static final String BATCH_PRINT_FILE_NAME_GOLF = "Golf_All";

	/**
	 * �ꊇ�o�̓t�@�C�����i���t�g�j
	 */
	public static final String BATCH_PRINT_FILE_NAME_LIFT = "Lift_All";

	//-------------------------------------------------------------------------------
	//-------------------�ꊇ�o�̓t�@�C�����̒ǉ� 2010/4/12 ����--------------------
	/**
	 * �ꊇ�o�̓t�@�C�����i�h���j
	 */
	public static final String BATCH_PRINT_FILE_NAME_SHUKUHAKU = "Shukuhaku_All";

	/**
	 * �ꊇ�o�̓t�@�C�����i�D�ԁj
	 */
	public static final String BATCH_PRINT_FILE_NAME_TRAFFIC = "Traffic_Al";

	/**
	 * �ꊇ�o�̓t�@�C�����i�ό��j
	 */
	public static final String BATCH_PRINT_FILE_NAME_TRAVEL = "Travel_All";

	/**
	 * ���C�敪�F�嗁��.
	 */
	public static final int BATH_DIV_BATH_HOUSE = 3;

	/**
	 * ���C�敪�F�I�V���C.
	 */
	public static final int BATH_DIV_OUTSIDE_BATH = 2;

	/**
	 * ���C�敪�F���ؘI�V���C.
	 */
	public static final int BATH_DIV_RENTAL_OUTSIDE_SPA = 6;

	/**
	 * ���C�敪�F���ؕ��C.
	 */
	public static final int BATH_DIV_RENTAL_SPA = 5;

	/**
	 * ���C�敪�F�T�E�i.
	 */
	public static final int BATH_DIV_SAUNA = 4;

	/**
	 * ���C�敪�F����L��.
	 */
	public static final int BATH_DIV_SPA = 1;

	/**
	 * ���C��ށF������p.
	 */
	public static final int BATH_KIND_FEMALE_SPECIALTY = 4;

	/**
	 * ���C��ށF�j����.
	 */
	public static final int BATH_KIND_MALE_FEMALE = 2;

	/**
	 * ���C��ށF�j����p.
	 */
	public static final int BATH_KIND_MALE_SPECIALTY = 3;

	/**
	 * ���C��ށF����.
	 */
	public static final int BATH_KIND_MIX_BATH = 6;

	/**
	 * ���C��ށF���ؕ��C.
	 */
	public static final int BATH_KIND_RENTAL_SPA = 7;

	/**
	 * ���C��ށF����L��.
	 */
	public static final int BATH_KIND_SPA = 1;

	/**
	 * ���C��ށF���Ԍ�֐�.
	 */
	public static final int BATH_KIND_TIME_SHIFT = 5;

	/**
	 * ������ʃR�[�h.
	 */
	public static final String BUILDING_TYPE = "0102";

	/** �L���f�B�����敪 . */
	public static final String CADDIE_CHARGE_DIV = "caddieChargeDiv";

	/** �L���f�B�����敪 . */
	public static final String CADDIE_CHARGE_DIV_1 = "1";

	/** �L���f�B�����敪 . */
	public static final String CADDIE_CHARGE_DIV_1_NM = "�L���f�B�����̂�";

	/** �L���f�B�����敪 . */
	public static final String CADDIE_CHARGE_DIV_2 = "2";

	/** �L���f�B�����敪 . */
	public static final String CADDIE_CHARGE_DIV_2_NM = "�L���f�B�{��p�J�[�g����";

	/** �L���f�B�����敪 . */
	public static final String CADDIE_CHARGE_DIV_3 = "3";

	/** �L���f�B�����敪 . */
	public static final String CADDIE_CHARGE_DIV_3_NM = "�L���f�B�{�d���J�[�g����";

	/**
	 * �L���f�B�����敪 .
	 */
	private static Map caddieChargeDivMap = new LinkedHashMap();

	/**
	 * ����ԍ�1.
	 */
	public static final Integer CAREER_NO_1 = new Integer(1);

	/**
	 * SQL��L�[�G���[�R�[�h.
	 */
	public static final String CD_SQL_PK_ERROR = "23000";

	/**
	 * �`�F�b�N�{�b�N�X���`�F�b�N�����Ƃ��}�[�N.
	 */
	public static final String CHECKBOX_CHECK = "��";

	/**
	 * No2���W�I�{�b�N�X���`�F�b�N�Ȃ����Ƃ��}�[�N.
	 */
	public static final String CHECKBOX_NO2_CHECK = "��";

	/**
	 * No2���W�I�{�b�N�X���`�F�b�N�Ȃ����Ƃ��}�[�N.
	 */
	public static final String CHECKBOX_NO2_UNCHECK = "�~";

	/**
	 * �`�F�b�N�{�b�N�X���`�F�b�N�Ȃ����Ƃ��}�[�N.
	 */
	public static final String CHECKBOX_UNCHECK = "��";

	/**
	 * �`�F�b�N�{�b�N�X���`�F�b�N�����Ƃ��l.
	 */
	public static final String CHECKED_VALUE = "1";

	/**
	 * ���M�p�R�����g�̃��X�g��.
	 */
	public static final String COMMENT_LIST = "cmtList";

	/**
	 * �萔�f�[�^�̏W��.
	 */
	private static Map constantsMap = new HashMap();

	/**
	 * ����ŗ�.
	 */
	public static final String CONSUMPTION_TAX_RATE = "0014";

	/**
	 * �D��No.1:�D�ԓ��e�敪�R�[�h.
	 */
	public static final String CONTENT_DIV = "1110";

	/**
	 * �t�H�}�[�g.
	 */
	public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";

	/**
	 * ���t�f�[�^�̋L���F"-".
	 */
	public static final String DATE_SYMBOL1 = "-";

	/**
	 * ���t�f�[�^�̋L���F"/".
	 */
	public static final String DATE_SYMBOL2 = "/";

	/**
	 * �戵�萔���̒P�ʁF�p�[�Z���g .
	 */
	public static final String DEAL_FEE_PERCENT = "��";

	/**
	 * �戵�萔���P�ʁu���v�̒l .
	 */
	public static final String DEAL_FEE_PERCENT_VLAUE = "1";

	/**
	 * �戵�萔���P�ʃ��X�g�̃t���O .
	 */
	public static final String DEAL_FEE_UNIT_FLG = "dealFeeUnitFlg";

	/**
	 * �戵�萔���̒P�ʁF�~ .
	 */
	public static final String DEAL_FEE_YEN = "�~";

	/**
	 * �戵�萔���P�ʁu�~�v�̒l .
	 */
	public static final String DEAL_FEE_YEN_VALUE = "2";

	/**
	 * �戵�萔���̒P�ʃf�[�^�̏W�� .
	 */
	private static Map dealFeeFlgMap = new HashMap();

	/**
	 * 12��.
	 */
	public static final int DECEMBER = 12;

	/**
	 * ��ނ̃f�t�H�[���g�l.
	 */
	public static final String DEFAULT_DIV_KIND_VLAUE = "4";

	/**
	 * �V�[�Y���̃f�t�H�[���g�l.
	 */
	public static final String DEFAULT_DIV_SEASON_VALUE = "8";

	/**
	 * �x�Ћ敪�R�[�h.
	 */
	public static final String DIV_BRANCH = "0002";

	/**
	 * �폜�R�[�h.
	 */
	public static final String DIV_CODE_DELET = "40";

	/**
	 * �쐬��ԃR�[�h.
	 */
	public static final String DIV_CODE_SAKUSEI = "01";

	/**
	 * ���M�G���[�R�[�h.
	 */
	public static final String DIV_CODE_SOSINERROR = "03";

	/**
	 * ���M�҂���ԃR�[�h.
	 */
	public static final String DIV_CODE_SOSINMATU = "02";

	/**
	 * �{�ݕt�я�� �{�݊m��.
	 */
	public static final String DIV_FAC_DECISION_DIV = "FAC_MANAGE";

	/**
	 * �e�l�����A�g�敪.
	 */
	public static final String DIV_FM_COST_DIV = "JRE002";

	/**
	 * �e�l�݌ɋ敪.
	 */
	public static final String DIV_FM_STOCK_DIV = "JRE003";

	/**
	 * ��ʋ敪�R�[�h.
	 */
	public static final String DIV_KIND = "0001";

	/**
	 * �s���{���敪�R�[�h.
	 */
	public static final String DIV_PREFECTURES = "0007";

	/**
	 * �V�[�Y���敪�R�[�h.
	 */
	public static final String DIV_SEASON = "0004";

	/**
	 * ���t�敪�敪�R�[�h.
	 */
	public static final String DIV_SEND = "0003";

	/**
	 * ����_�~�[���M
	 */
	public static final String DIV_SEND_TO_NAGANO = "0020";

	/**
	 * �{�ݕt�я��ꗗ�@�\�ǉ��Ή� 2009/12/04 s30873
	 * �{�ݕt�ю�ދ敪�R�[�h.
	 */
	public static final String DIV_SORTS_FAC = "0017";

	/**
	 * ��ԋ敪�R�[�h.
	 */
	public static final String DIV_STATUS = "0005";

	/**
	 * ��ԕύX��ރR�[�h.
	 * �ۑ�No52�F��ԕύX�@�\�ǉ��Ή��@2009/12/10 add by s31109
	 */
	public static final String DIV_STATUS_CHANGE = "0019";

	/**
	 * �݌ɋ敪.
	 */
	public static final String DIV_STOCK_DIV = "JRE001";

	/**
	 * �g�b�v�y�[�W�敪�R�[�h.
	 */
	public static final String DIV_TOP_PAGE = "9000";

	/**
	 * �{�ݕt�я��ꗗ�@�\�ǉ��Ή� 2009/12/18 s30873
	 * �{�݃^�C�v�敪�R�[�h.
	 */
	public static final String DIV_TYPE_FAC = "0018";

	/**
	 * �_�E�����[�h�t�@�C����.
	 */
	public static final String DOWNLOAD_FILE_NAME = "downloadFileName";

	/**
	 * �_�E�����[�h�p�L�[.
	 */
	public static final String DOWNLOAD_KEY = "filePath";

	/**
	 * �萔���̉~�̃^�C�v.
	 */
	public static final String EnTypeFlg = "2";

	/**
	 * �������ʗ����L�� 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_BATH = 16;

	/**
	 * �ݔ���ʁF�ٓ��ɃR���r�j�L.
	 */
	public static final int EQUIPMENT_KIND_CONVENIENCE = 11;

	/**
	 * �ݔ���ʁF�t�B�b�g�l�X�{�ݗL��.
	 */
	public static final int EQUIPMENT_KIND_FITNESS = 7;

	/**
	 * �ݔ���ʁF�Q�[���R�[�i�[�L��.
	 */
	public static final int EQUIPMENT_KIND_GAME_CORNER = 2;

	/**
	 * �ݔ���ʁF�J���I�P�a�n�w�L��.
	 */
	public static final int EQUIPMENT_KIND_KARAOKE_BOX = 1;

	/**
	 * �ݔ���ʁF�Ŋ�̃R���r�j�L 2009/11/13 add by s31109.
	 */
	public static final int EQUIPMENT_KIND_NEARSTORE = 12;

	//	�{�ݕt�я�� �{�݊m��. 2009/12/07 S30873 END

	/**
	 * �C���^�[�l�b�g�ڑ����޽�L�� 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_NET = 15;

	/**
	 * �ݔ���ʁF�����ɐV���T�[�r�X�L��.
	 */
	public static final int EQUIPMENT_KIND_NEWS = 8;

	/**
	 * �ݔ���ʁF���ԏ�i�����j�L��.
	 */
	public static final int EQUIPMENT_KIND_PARK_FREE = 9;

	/**
	 * �ݔ���ʁF���ԏ�i�L���j�L��.
	 */
	public static final int EQUIPMENT_KIND_PARK_PAY = 10;

	/**
	 * �ݔ���ʁF�v�[���L��i�����j.
	 */
	public static final int EQUIPMENT_KIND_POOL_INDOOR = 6;

	/**
	 * �ݔ���ʁF�v�[���L��i���O�j.
	 */
	public static final int EQUIPMENT_KIND_POOL_OUTSIDE = 5;

	/**
	 * SUICA���p�\�{�ݗL�� 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_SUICA = 14;

	/**
	 * �ݔ���ʁF�싅��L��.
	 */
	public static final int EQUIPMENT_KIND_TABLE_TENNIS = 4;

	/**
	 * �ݔ���ʁF�M�ِ�p�e�j�X�R�[�g�L��.
	 */
	public static final int EQUIPMENT_KIND_TENNIS_COURT = 3;

	/**
	 * �Y�{���v���b�T�[�L�� 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_TROUSERPRESS = 13;

	//	�{�ݕt�я�� �{�݊m��. 2009/12/07 S30873 START
	/**
	 * �{�ݕt�я�� �{�݊m��.
	 */
	private static final String FAC_DECISION_DIV_CODE_1 = "0";

	/**
	 * �{�ݕt�я�� �{�݊m��.
	 */
	private static final String FAC_DECISION_DIV_CODE_2 = "1";

	/**
	 * �{�ݕt�я�� �{�݊m��.
	 */
	private static final String FAC_DECISION_DIV_NAME_1 = "-";

	/**
	 * �{�ݕt�я�� �{�݊m��.
	 */
	private static final String FAC_DECISION_DIV_NAME_2 = "�ς�";

	/**
	 * s30873 2009/12/15 �񓚏��F0�A�t�я��F1�A�V�K�F2
	 * �ڍ׉�ʂ̋�ʂ��߁A�ǉ�
	 */
	public static final String FAC_DECISION_FUTAIINFO_CALL = "1";

	/**
	 * s30873 2009/12/15 �񓚏��F0�A�t�я��F1�A�V�K�F2
	 * �ڍ׉�ʂ̋�ʂ��߁A�ǉ�
	 */
	public static final String FAC_DECISION_FUTAIMAKE_CALL = "2";

	/**
	 * s30873 2009/12/15 �񓚏��F0�A�t�я��F1�A�V�K�F2
	 * �ڍ׉�ʂ̋�ʂ��߁A�ǉ�
	 */
	public static final String FAC_DECISION_KAITOUSYO_CALL = "0";

	/**
	 * �{�ݕt�я�� �{�݊m��.
	 */
	private static Map facDecisionDivMap = new HashMap();

	/**
	 * �f�t�H���g�\���u-�v
	 */
	public static final String FACILITY_INFO_SET_FALSE = "-";

	/**
	 * �{�ݏ��ݒ���s�����ꍇ�A��ʏ�Ɂu�ρv��\������
	 */
	public static final String FACILITY_INFO_SET_TURE = "��";

	/**
	 * �{�݃p�^�[���V�K�\���p
	 */
	public static final String FACILITY_PATTERN_INIT_SIX = "******";

	/**
	 * �{�݃p�^�[�������l
	 */
	public static final String FACILITY_PATTERN_INIT_VAL = "001";

	/**
	 * �{�݃^�C�v(�f�t�H���g��1�F����)
	 */
	public static final String FACILITY_PATTERN_INIT_VALUE = "1";

	//-------------------ur00300 & ur02006---------------------
	/**
	 * �{�݃p�^�[������
	 */
	public static final int FACILITY_PATTERN_LEN = 6;

	/**
	 * �{�݃R�[�h�P�̃f�t�H�[���g�l.
	 */
	public static final char FACILITY1_FLAG = '0';

	/**
	 * �{�݃R�[�h2�̃f�t�H�[���g�l.
	 */
	public static final char FACILITY2_FLAG = 'z';

	/**
	 * ���������R�[�h.
	 */
	public static final String FEE_COND_TYPE = "0106";

	/**
	 * ���z�󋵁F���� .
	 */
	public static final String FEE_FREE_FLG = "����";

	/**
	 * ���z�󋵁F�L�� .
	 */
	public static final String FEE_PAY_FLG = "�L��";

	/**
	 * �ꃖ���̍ŏ��̓��t.
	 */
	public static final int FIRSEDAY = 1;

	/**
	 * disbaled�t���O 2.
	 */
	public static final String FLG_DISABLED = "2";

	/**
	 * Flag 0.
	 */
	public static final String FLG_FALSE = "0";

	/**
	 * Flag 1.
	 */
	public static final String FLG_TRUE = "1";

	/**
	 * ��I�����.
	 */
	public static final String FLG_UNSELECTED = null;

	/**
	 * �e�l�����A�g�R�[�h.
	 */
	private static final String FM_COST_DIV_CODE_1 = "1";

	/**
	 * �e�l�����A�g�R�[�h.
	 */
	private static final String FM_COST_DIV_CODE_2 = "2";

	/**
	 * �e�l�����A�g�R�[�h.
	 */
	private static final String FM_COST_DIV_CODE_3 = "3";

	/**
	 * �e�l�����A�g��.
	 */
	private static final String FM_COST_DIV_NAME_1 = "�҂�";

	/**
	 * �e�l�����A�g��.
	 */
	private static final String FM_COST_DIV_NAME_2 = "�����";

	/**
	 * �e�l�����A�g��.
	 */
	private static final String FM_COST_DIV_NAME_3 = "�ς�";

	/**
	 * �e�l��������� .
	 */
	public static final int FM_COST_RELATE_DIV_HAND_INPUT = 2;

	/**
	 * �e�l�������M�ς� .
	 */
	public static final int FM_COST_RELATE_DIV_SEND_FINSIH = 3;

	/**
	 * �e�l�������M�҂� .
	 */
	public static final int FM_COST_RELATE_DIV_SEND_WAIT = 1;

	/**
	 * �e�l�݌ɘA�g.
	 */
	private static final String FM_STOCK_DIV_CODE_1 = "1";

	/**
	 * �e�l�݌ɘA�g.
	 */
	private static final String FM_STOCK_DIV_CODE_2 = "2";

	/**
	 * �e�l�݌ɘA�g.
	 */
	private static final String FM_STOCK_DIV_NAME_1 = "�҂�";

	/**
	 * �e�l�݌ɘA�g.
	 */
	private static final String FM_STOCK_DIV_NAME_2 = "�ς�";

	/**
	 * �e�l�݌ɑ��M�ς� .
	 */
	public static final int FM_STOCK_RELATE_DIV_SEND_FINSIH = 2;

	/**
	 * �e�l�݌ɑ��M�҂� .
	 */
	public static final int FM_STOCK_RELATE_DIV_SEND_WAIT = 1;

	/**
	 * �e�l�����A�g.
	 */
	private static Map fmCostDivMap = new HashMap();

	/**
	 * �e�l�݌ɘA�g.
	 */
	private static Map fmStockDivMap = new HashMap();

	/**
	 * �{�ݕt�ю�� NO3
	 */
	public static final String FUTAI_FACILITY_PATTERN_NO3 = "1";

	/**
	 * �{�ݕt�ю�� NO5
	 */
	public static final String FUTAI_FACILITY_PATTERN_NO5 = "2";

	/**
	 * �Ɩ��J�n��.
	 */
	public static final String GYOMU_MONTH = "04";

	/**
	 * �j���̈�.
	 */
	public static final String HolidayMark = "��";

	/** ��d���ʒm���@�p��/�\��ʒm���@�p�ۃ��X�g . */
	public static final String INFORM_WAY_FLG = "InformWayFlg";

	/**
	 * ��d���ʒm���@�p��/�\��ʒm���@�p�� �v .
	 **/
	public static final String INFORM_WAY_FLG_HAVA = "�v";

	/**
	 * ��d���ʒm���@�p��/�\��ʒm���@�p�� �s�v .
	 **/
	public static final String INFORM_WAY_FLG_NOT = "�s�v";

	/**
	 * ��d���ʒm���@�p��/�\��ʒm���@�p�� .
	 */
	private static Map informWayFlgMap = new LinkedHashMap();

	/**
	 * Flag 0.
	 */
	public static final int INT_FALSE = 0;

	/**
	 * Flag 1.
	 */
	public static final int INT_TRUE = 1;

	/**
	 * ����.
	 */
	public static final int JANUARY = 1;

	/**
	 * No1��ʓ����{�݌ɂ̌��萔.
	 */
	public static final int JRSTOCKCAPACITY = 3;

	/** �J�[�g�����敪 . */
	public static final String KART_CHARGE_DIV = "kartChargeDiv";

	/** �J�[�g�����敪 . */
	public static final String KART_CHARGE_DIV_1_NM = "��p�J�[�g����";

	/** �J�[�g�����敪 . */
	public static final String KART_CHARGE_DIV_2_NM = "�d���J�[�g����";

	/** �J�[�g�����敪 . */
	private static Map kartChargeDivMap = new LinkedHashMap();

	/**
	 * AnsSearchData�̃��X�g�f�[�^.
	 */
	public static final String KEY_ANSSEARCHDATA_DATA = "ansSearchData";

	/**
	 * �񓚏���ʂɏڍ׉񓚏���ʂ֑J�ڂ���p�����[�^�F����ԍ�.
	 */
	public static final String KEY_CAREER_NO = "careerNo";

	/**
	 * �L�[ �R�s�[�t�H�[��.
	 */
	public static final String KEY_COPYFORM = "UR02001CopyForm";

	/**
	 * �񓚏���ʂɏڍ׉񓚏���ʂ֑J�ڂ���p�����[�^�F���񓚘A��.
	 */
	public static final String KEY_PLAN_ANS_NO = "planAnsNo";

	// ------------------------ur00200--------------------------
	/**
	 * �g�b�v�y�[�W���.
	 */
	public static final String KEY_UR00200_DATA = "ur00200OutData";

	/**
	 * UR00300��ʂ̃��X�g�f�[�^.
	 */
	public static final String KEY_UR00300_DATA = "ur00300OutData";

	/**
	 * UR00400��ʂ̃��X�g�f�[�^.
	 */
	public static final String KEY_UR00400_DATA = "ur00400OutData";

	/**
	 * �L�[ UR02000�f�[�^.
	 */
	public static final String KEY_UR02000_COPY_CALENDAR_DATA = "UR02000CopyCalendarData";

	/**
	 * �L�[ UR02000�f�[�^.
	 */
	public static final String KEY_UR02000_COPY_DATA = "UR02000CopyData";

	/**
	 * �L�[ UR02000�f�[�^.
	 */
	public static final String KEY_UR02000_CURRENT_DATA = "UR02000Data";

	/**
	 * �L�[ UR02000�f�[�^.
	 */
	public static final String KEY_UR02000_HISTORY_DATA = "UR02000HistoryData";

	/**
	 * �L�[ UR02000�f�[�^.
	 */
	public static final String KEY_UR02000_INIT_DATA = "UR02000InitData";

	/**
	 * �L�[ UR02000�f�[�^.
	 */
	public static final String KEY_UR02000_SAVED_DATA = "UR02000SavedData";

	/**
	 * ���i�Q�ƃ��X�g�f�[�^.
	 */
	public static final String KEY_UR02003_DATA = "ur02003OutData";

	/**
	 * �J�����_�[�R�s�[OutData.
	 */
	public static final String KEY_UR02004_DATA = "UR02004OutData";

	// ------------------------ur02004--------------------------
	/**
	 * �J�����_�[�R�s�[Form.
	 */
	public static final String KEY_UR02004_FORM = "UR02004Form";

	/**
	 * �J�����_�[�R�s�[����Form.
	 */
	public static final String KEY_UR02004_SEARCH_FORM = "UR02004SearchForm";

	/**
	 * �����f�[�^.
	 */
	public static final String KEY_UR05000SEARCH_DATA = "ur05000SearchData";

	/**
	 * ����`�t�@�C��.
	 */
	private static InputStream kikakuWebPropertiesStream;

	/**
	 * ���:�S���t.
	 */
	public static final String KIND_FLG_GOLF = "5";

	/**
	 * �{�݃^�C�v:�z�e��.
	 */
	public static final String KIND_FLG_HOTEL = "2";

	//---------------------------------------------------------
	//-------------------�{�݃^�C�v�p�萔�ǉ�--------------------
	// add by s30873 2010/01/28
	/**
	 * �{�݃^�C�v:����.
	 */
	public static final String KIND_FLG_INN = "1";

	/**
	 * ���:���t�g.
	 */
	public static final String KIND_FLG_LIFT = "6";

	/**
	 * �{�݃^�C�v:�X�L�[. 2010�N4���ǉ��\��
	 */
	public static final String KIND_FLG_SKI = "3";

	//-----------------------------------------------------------

	/**
	 * ���:�h��.
	 */
	public static final String KIND_FLG_STAYING = "4";

	/**
	 * ���:�h��.
	 */
	public static final String KIND_FLG_STAYING_HOTEL = "2";

	// kimu end

	//kimu start add by 2010/02/28 �h���z�e���A���ً敪
	/**
	 * ���:�h��.
	 */
	public static final String KIND_FLG_STAYING_RYOKAN = "1";

	//---- 2010/4/9�X�L�[�敪�ǉ��@���� ---------------------
	/**
	 * ���:�h���i�X�L�[�j.
	 */
	public static final String KIND_FLG_STAYING_SKI = "3";

	//--------------------------------------------------------

	/**
	 * ���:�D��.
	 */
	public static final String KIND_FLG_TRAFFIC = "2";

	/**
	 * ���:�ό�.
	 */
	public static final String KIND_FLG_TRAVEL = "3";

	/**
	 * �ꃖ���̍ő�̓��t.
	 */
	public static final int LASTDAT = 31;

	/**
	 * �ʐϒP�ʃ��X�g��.
	 */
	public static final String LIST_AREA_UNIT = "areaUnitlist";

	/**
	 * ������ʃ��X�g��.
	 */
	public static final String LIST_BUILDING_TYPE = "buildingTypeList";

	/**
	 * ����ŗ�.
	 */
	public static final String LIST_CONSUMPTION_TAX_RATE = "consumptionTaxRateList";

	/**
	 * �D��No.1:�D�ԓ��e�敪��.
	 */
	public static final String LIST_CONTENT_DIV = "contentList";

	/**
	 * �����������X�g��.
	 */
	public static final String LIST_FEE_COND_TYPE = "feeCondTypeList";

	/**
	 * No.1 �񋟗����l����� .
	 */
	public static final String LIST_MAX_CAPA_PATTERN = "maxCapaPatternList";

	/**
	 * �H���������X�g��.
	 */
	public static final String LIST_MEAL_COND_TYPE = "mealCondTypeList";

	/**
	 * �H���ӏ����X�g��.
	 */
	public static final String LIST_MEAL_PLACE_CD = "mealPlaceList";

	/**
	 * �x�Ћ敪���X�g��.
	 */
	public static final String LIST_NAME_DIV_BRANCH = "branchlist";

	/**
	 * �x�Ћ敪���X�g��(�x�Ќ���).
	 */
	public static final String LIST_NAME_DIV_BRANCH1 = "branchlist1";

	/**
	 * ��ʋ敪���X�g��.
	 */
	public static final String LIST_NAME_DIV_KIND = "kindlist";

	/**
	 * �{�ݕt�я��ꗗ�@�\�ǉ��Ή� 2009/12/04 s30873
	 * ��ʋ敪�Œ胊�X�g��.
	 */
	public static final String LIST_NAME_DIV_KIND_LOCKED = "kindlistlocked";

	/**
	 * �s���{���敪���X�g��.
	 */
	public static final String LIST_NAME_DIV_PREFECTURES = "prefectureslist";

	/**
	 * �V�[�Y���敪���X�g��.
	 */
	public static final String LIST_NAME_DIV_SEASON = "seasonlist";

	/**
	 * ���t�敪�敪���X�g��.
	 */
	public static final String LIST_NAME_DIV_SEND = "sendlist";

	/**
	 * �{�ݕt�я��ꗗ�@�\�ǉ��Ή� 2009/12/04 s30873
	 * �{�ݕt�ю�ރ��X�g��.
	 */
	public static final String LIST_NAME_DIV_SORTS_FAC = "facsortslist";

	/**
	 * ��ԋ敪���X�g��.
	 */
	public static final String LIST_NAME_DIV_STATUS = "statuslist";

	/**
	 * ��ԕύX��ރR�[�h.
	 * �ۑ�No52�F��ԕύX�@�\�ǉ��Ή��@2009/12/10 add by s31109
	 */
	public static final String LIST_NAME_DIV_STATUS_CHANGE = "statusChangeList";

	// --------------------�Ɩ������X�^�b�g---------------------------------

	/**
	 * �{�ݕt�я��ꗗ�@�\�ǉ��Ή� 2009/12/18 s30873
	 * �{�݃^�C�v���X�g��.
	 */
	public static final String LIST_NAME_DIV_TYPE_FAC = "faclityTypeList";

	/**
	 * �Ɩ��N�x���X�g��.
	 */
	public static final String LIST_NAME_GYOMU_YEAR = "gyomulist";

	/**
	 * �Ɩ��N�x���X�g��.
	 */
	public static final String LIST_NAME_GYOMU_YEAR_SP = "gyomulistsp";

	/**
	 * �l���敪���X�g��.
	 */
	public static final String LIST_NAME_STYLE_DIV = "styleDivlist";

	/**
	 * �D��No.1:�p�r���X�g��.
	 */
	public static final String LIST_PUPORSE = "bookPurposeList";

	/**
	 * �����^�C�v���X�g��..
	 */
	public static final String LIST_ROOM_TYPE = "roomTypeList";

	/**
	 * �����^�C�v���X�g��.
	 */
	public static final String LIST_ROOM_TYPE_LABEL_WITH_VALUE = "roomTypeListLabelWithValue";

	/**
	 * �������i�L�����X�g��.
	 */
	public static final String LIST_ROOM_VESSEL_FLG = "roomVesselFlgList";

	/**
	 * �݌ɋ敪 .
	 */
	public static final String LIST_STOCK_DIV = "stockDivList";

	/**
	 * No.1�i�ό��j �\���ʃ��X�g�� .
	 */
	public static final String LIST_TRAVEL_BOOK_KIND = "travelBookKindList";

	/**
	 * No.1�i�ό��j �p�r ���X�g��.
	 */
	public static final String LIST_TRAVEL_BOOK_PURPOSE = "travelBookPurposeList";

	/**
	 * ���]���X�g��.
	 */
	public static final String LIST_VIEW_TYPE = "viewTypeList";

	/**
	 * �o�C�L���O�������X�g��.
	 */
	public static final String LIST_VK_LIT_FLG = "vkLitFlglist";

	/**
	 * ���[���z�u.
	 */
	private static InputStream mailInputStream;

	/**
	 * �����e�i���X�t���O.
	 */
	public static final String MAINTENANCE = "2";

	/**
	 * �l����� ��l.
	 */
	public static final int MAN_KIND_ADLT = 1;

	/**
	 * �l����� ���l.
	 */
	public static final int MAN_KIND_CHILD = 2;

	/**
	 * �񋟗����l����� .
	 */
	public static final String MAX_CAPA_PATTERN_DEFAULT_VALUE = "5";

	/**
	 * ���O���̍ő咷���@.
	 */
	public static final int MAX_EXCEPT_DAY_LENGTH = 4500;

	/**
	 * �{�݃p�^�[���ő�l
	 */
	public static final String MAX_FACILITY_PATTERN_NUM = "999";

	//-------------------------�{�ݕt�щ��ID�ǉ� s30873 2010/01/22 END-------------------------

	/**
	 * �H�������R�[�h.
	 */
	public static final String MEAL_COND_TYPE = "0105";

	/**
	 * �H����� ���H.
	 */
	public static final String MEAL_KIND_A = "2";

	/**
	 * �H����� �[�H�H.
	 */
	public static final String MEAL_KIND_D = "3";

	/**
	 * �H����� ���H.
	 */
	public static final String MEAL_KIND_M = "1";

	/**
	 * �H���ӏ��敪�R�[�h.
	 */
	public static final String MEAL_PLACE_CD_DIV = "0203";

	/**
	 * �{�^������ 0�ꎞ�ۑ�,1�m��,2�����߂�,3���F, 4����.
	 */
	public static final String[] METHOD_DIV = { "0", "1", "2", "3", "4" };

	/**
	 * ���z�󋵃t���O .
	 */
	public static final String MONEY_STATUS_FLG = "moneyStatusFlg";

	/**
	 * ���z�� .
	 */
	private static Map moneyStatus = new HashMap();

	/** ���}�敪 . */
	public static final String MS_DIV = "msDiv";

	/** ���}�敪 . */
	public static final String MS_DIV_1 = "����}���Ƃ�����";

	/** ���}�敪 . */
	public static final String MS_DIV_2 = "�}���݂̂���";

	/** ���}�敪 . */
	public static final String MS_DIV_3 = "����݂̂���";

	/** ���}�敪 . */
	private static Map msDivMap = new LinkedHashMap();

	/**
	 * �}�X�^�f�[�^�̏W��.
	 */
	private static Map mstBasicMap = new HashMap();

	/**
	 * �V�K�敪 1�F�V�K .
	 */
	public static final String NEW_DIV_1 = "1";

	/**
	 * �V�K�敪 2�F�p�� .
	 */
	public static final String NEW_DIV_2 = "2";

	/**
	 * �ݒ� ���Ԏw��.
	 */
	public static final String NO4_APPLY_BY_SPECIFY = "applyBySpecify";

	/* NO4�֘A */
	/**
	 * �ݒ� �j������.
	 */
	public static final String NO4_APPLY_BY_WEEK = "applyByWeek";

	/**
	 * �{�^���̖������ �L��.
	 */
	public static final String NO4_BUTTON_DISABLED_FALSE = "false";

	/**
	 * �{�^���̖������ ����.
	 */
	public static final String NO4_BUTTON_DISABLED_TRUE = "true";

	/**
	 * ���̃f�t�H���g�w�i�F.
	 */
	public static final String NO4_DAY_BGCOLOR_DEFAULT = "#FFFFFF";

	/**
	 * ���O���̔w�i�F.
	 */
	public static final String NO4_DAY_BGCOLOR_EXCEPTDATE = "#FFFF00";

	/**
	 * �y�j���̔w�i�F.
	 */
	public static final String NO4_DAY_BGCOLOR_SATURDAY = "#E1EDFE";

	/**
	 * No4��roomData�̔w�i�F.
	 */
	public static final String NO4_DAY_BGCOLOR_STOCK = "#808080";

	/**
	 * ���j���̔w�i�F.
	 */
	public static final String NO4_DAY_BGCOLOR_SUNDAY = "#FFD9D9";

	/**
	 * �J�n��.
	 */
	public static final int NO4_FIRST_MONTH = 10;

	/**
	 * �I����.
	 */
	public static final int NO4_LAST_MONTH = 1;

	/**
	 * ���Ԃ̌�.
	 */
	public static final int NO4_MIDDLE_MONTH = 0;

	/**
	 * �ق��1�J��.
	 */
	public static final int NO4_ONLY_ONE_MONTH = 11;

	/**
	 * �y�[�W�̌��̋L�^��.
	 */
	public static final int NO4_PAGE_RECORD = 6;

	// ���̃y�[�W���ǉ��i�������1�y�[�W4�����j 2010/4/9
	/**
	 * �y�[�W�̌��̋L�^���i���t�g�j.
	 */
	public static final int NO4_PAGE_RECORD_PRINT = 4;

	/**
	 * NO4�t���O.
	 */
	public static final int NO4PAGE = 4;

	/**
	 * No4��ʓ��pstatusList.
	 */
	public static final String NO4STATUSLIST = "no4StatusList";

	/**
	 * No4�ɑ��݂��Ȃ��݌ɔԍ�.
	 */
	public static final String NotNo4StockNo = "0000";

	/**
	 * �p�^��"-".
	 */
	public static final String PATTERN_EXCEPT_DAY = "-";

	/**
	 * �p�^��"��".
	 */
	public static final String PATTERN_EXIST_KEY = "��";

	/**
	 * �p�^��"A".
	 */
	public static final String PATTERN_EXIST_VALUE = "A";

	/** �L���f�B�t�v���[�� . */
	public static final String PLAY_WITH_CADDIE_CAN = "��";

	/** �L���f�B�t�v���[�s�� . */
	public static final String PLAY_WITH_CADDIE_CANNOT = "�s��";

	/** �L���f�B�t�v���[�ۃ��X�g . */
	public static final String PLAY_WITH_CADDIE_FLG = "playWithCaddieFlg";

	/**
	 * �L���f�B�t�v���[�� .
	 */
	private static Map playWithCaddieMap = new LinkedHashMap();

	/**
	 * �\�[�X�����̃A�h���X.
	 */
	public static final String PROPERTIES_FILE_PATH = "/jp/co/jreast/common/properties/kikakuweb.properties";

	// ---------------------------------------------------------

	// ------------------------ur00100--------------------------

	// ---------------------------------------------------------

	/**
	 * �D��No.1:�p�r�R�[�h.
	 */
	public static final String PUPORSE_CD_DIV = "1109";

	/**
	 * ���W�I�{�^���̒l.
	 */
	public static final String[] RADIO_BUTTON_VALUE = { "1", "2", "3", "4" };

	// ---------------------------------------------------------

	// ------------------------ur00300--------------------------

	/**
	 * ���W�I�{�b�N�X���`�F�b�N�����Ƃ��}�[�N.
	 */
	public static final String RADIOBOX_CHECK = "��";

	/**
	 * ���W�I�{�b�N�X���`�F�b�N�Ȃ����Ƃ��}�[�N.
	 */
	public static final String RADIOBOX_UNCHECK = "��";

	/**
	 * �����^�C�v�敪�R�[�h.
	 */
	public static final String ROOM_TYPE_DIV = "0101";

	/**
	 * �������i�L.
	 */
	public static final String ROOM_VESSEL_FLG_HAVE = "�L��";

	// ---------------------------------------------------------

	/**
	 * �������i��.
	 **/
	public static final String ROOM_VESSEL_FLG_NOT = "����";

	/**
	 * �������i�L���f�[�^�̏W��.
	 */
	private static Map roomVesselFlgMap = new LinkedHashMap();

	/**
	 * ���t�gNo2���ID.
	 */
	public static final String SCREEN_ID_LIFT_NO2 = "ur01021";

	/**
	 * NO1���ID.
	 */
	public static final String SCREEN_ID_NO1 = "ur01010";

	/**
	 * NO1�S���t���ID .
	 */
	public static final String SCREEN_ID_NO1_GOLF = "ur01013";

	// ---------------------------------------------------------

	// ------------------------ur00500--------------------------

	/**
	 * NO1���t�g���ID .
	 */
	public static final String SCREEN_ID_NO1_LIFT = "ur01014";

	/**
	 * NO1�D�ԉ��ID .
	 */
	public static final String SCREEN_ID_NO1_TRAFFIC = "ur01012";

	// ---------------------------------------------------------

	/**
	 * NO1�ό����ID .
	 */
	public static final String SCREEN_ID_NO1_TRAVEL = "ur01011";

	/**
	 * NO2���ID.
	 */
	public static final String SCREEN_ID_NO2 = "ur01020";

	//---------------------------------------------------------
	//-------------------ur00300 & ur02006---------------------
	/**
	 * NO2���ID �{�݃^�C�v�˃z�e��(2)
	 *
	 * @auther s32395 �L�� add by 2010/01/26
	 */
	public static final String SCREEN_ID_NO2_HOTEL = "ur01022";

	public static final String SCREEN_ID_NO2_SKI = "ur01023";

	// ---------------------------------------------------------

	/**
	 * NO3���ID.
	 */
	public static final String SCREEN_ID_NO3 = "ur01030";

	/**
	 * �t�я��NO3���ID�z�e��
	 */
	public static final String SCREEN_ID_NO3_FUTAI_HOTEL = "ur05031";

	//-------------------------�{�ݕt�щ��ID�ǉ� s30873 2010/01/22 START-------------------------
	/**
	 * �t�я��NO3���ID����
	 */
	public static final String SCREEN_ID_NO3_FUTAI_RYOKAN = "ur05030";

	/**
	 * �t�я��NO3���ID�X�L�[
	 */
	public static final String SCREEN_ID_NO3_FUTAI_SKI = "ur05032";

	/**
	 * NO4���ID.
	 */
	public static final String SCREEN_ID_NO4 = "ur01040";

	/**
	 * NO4�ό��E�D�ԉ��ID.
	 */
	public static final String SCREEN_ID_NO4_1 = "ur01041";

	/**
	 * NO4�S���t�E���t�g���ID.
	 */
	public static final String SCREEN_ID_NO4_2 = "ur01042";

	/**
	 * NO5���ID.
	 */
	public static final String SCREEN_ID_NO5 = "ur01050";

	// ---------------------------------------------------------

	/**
	 * �t�я��NO5���ID
	 */
	public static final String SCREEN_ID_NO5_FUTAI = "ur05050";

	//�ǉ� s32472 No5.�X�L�[���ID START
	/**
	 * �t�я��NO5.SKI���ID
	 */
	public static final String SCREEN_ID_NO5_FUTAI_SKI = "ur05052";

	//�ǉ� s32472 No5.�X�L�[���ID END
	/**
	 * ���M�敪�FFAX.
	 */
	public static final String SEND_DIV_FLAG_FAX = "2";

	/**
	 * ���M�敪�F���[��.
	 */
	public static final String SEND_DIV_FLAG_MAIL = "1";

	// ---------------------------------------------------------

	/**
	 * ���M���.
	 */
	public static final String[] SENDSTATUSNAMES = new String[] { "����", "�װ",
			"�҂�" };

	/**
	 * �T�[�r�X�L��.
	 */
	public static final String SERVICECHECKE = "�L";

	/**
	 * �T�[�r�X�Ȃ�.
	 */
	public static final String SERVICEUNCHECK = "��";

	/**
	 * ���[�U�[���.
	 */
	public static final String SESSION_KEY_USERDATA = "userData";

	/** �V���g���o�X�\��L�� . */
	public static final String SHUTTLE_BUS_BOOK_FLG = "shuttleBusBookFlg";

	/** �V���g���o�X�\��L�� . */
	public static final String SHUTTLE_BUS_BOOK_FLG_NO = "�\��s�v";

	/** �V���g���o�X�\��L�� . */
	public static final String SHUTTLE_BUS_BOOK_FLG_YES = "�v�\��";

	/** �V���g���o�X�\��L�� . */
	private static Map shuttleBusBookMap = new LinkedHashMap();

	/**
	 * �\�[�g����.
	 */
	public static final String SORT_ASC = "asc";

	/**
	 * �\�[�g�~��.
	 */
	public static final String SORT_DESC = "desc";

	/**
	 * �������F.
	 */
	public static final Integer STATUS_APPROVE = new Integer(21);

	/**
	 * �񓚏�ԁF����.
	 */
	public static final Integer STATUS_COMPLETE = new Integer(30);

	/**
	 * �����m��.
	 */
	public static final Integer STATUS_CONFIRM = new Integer(20);

	/**
	 * �񓚏�ԁF�폜.
	 */
	public static final Integer STATUS_DELETE = new Integer(40);

	/**
	 * �{�ݓo�^��.
	 */
	public static final Integer STATUS_FACILITIES = new Integer(11);

	/**
	 * �{�ݓo�^���i�G���[�ۑ��j.
	 */
	public static final Integer STATUS_FACILITIES_ERR = new Integer(13);

	/**
	 * �񓚏���ԁFFM��.
	 */
	public static final Integer STATUS_FM_FINISH = new Integer(23);

	/**
	 * JR�o�^��.
	 */
	public static final Integer STATUS_JR = new Integer(12);

	/**
	 * JR�o�^���i�G���[�ۑ��j.
	 */
	public static final Integer STATUS_JR_ERR = new Integer(14);

	// ---------------------���--------------------------------
	/**
	 * ��� �쐬.
	 */
	public static final Integer STATUS_MAKING = new Integer(1);

	/**
	 * ��� �쐬�i�G���[�ۑ��j.
	 */
	public static final Integer STATUS_MAKING_ERR = new Integer(5);

	/**
	 * ��� �J��.
	 */
	public static final Integer STATUS_OPEN = new Integer(10);

	/**
	 * ����.
	 */
	public static final Integer STATUS_SEND_BACK = new Integer(22);

	/**
	 * ��� ���J��.
	 */
	public static final Integer STATUS_UNOPEN = new Integer(4);

	/**
	 * �݌ɋ敪�R�[�h.
	 */
	private static final String STOCK_DIV_CODE_1 = "1";

	/**
	 * �݌ɋ敪�R�[�h.
	 */
	private static final String STOCK_DIV_CODE_2 = "2";

	/**
	 * �݌ɋ敪�R�[�h.
	 */
	private static final String STOCK_DIV_CODE_3 = "3";

	/**
	 * �݌ɋ敪�R�[�h.
	 */
	public static final String STOCK_DIV_CODE_4 = "4";

	/**
	 * �݌ɋ敪 6�Ѝ݌� .
	 */
	public static final String STOCK_DIV_CODE_6C = "2";

	/**
	 * �݌ɋ敪 ���݌� .
	 */
	public static final String STOCK_DIV_CODE_EJ = "1";

	/**
	 * �݌ɋ敪��.
	 */
	private static final String STOCK_DIV_NAME_1 = "�тイ";

	/**
	 * �݌ɋ敪��.
	 */
	private static final String STOCK_DIV_NAME_2 = "���p";

	/**
	 * �݌ɋ敪��.
	 */
	private static final String STOCK_DIV_NAME_3 = "������";

	/**
	 * �݌ɋ敪��.
	 */
	private static final String STOCK_DIV_NAME_4 = "�����ς�";

	/**
	 * �݌ɔԍ� .
	 */
	public static final String STOCK_NO_DEFAULT_VALUE = "0000";

	/**
	 * �݌ɋ敪.
	 */
	private static Map stockDivMap = new LinkedMap();

	/**
	 * dot�̃}�[�N.
	 */
	public static final String STRING_DOT = ".";

	/**
	 * �󂭕�����.
	 */
	public static final String STRING_NULL = "";

	/**
	 * �l���敪�R�[�h.
	 */
	public static final String STYLE_DIV = "0201";

	/**
	 * �ŋ敪 �����.
	 */
	public static final String TAX_DIVSION_CONSUMPTION = "1";

	/**
	 * �N�����ʐ� .
	 */
	public static final int TERM_YMD = 8;

	/**
	 * �^�A�敪 1�F�D�� .
	 */
	public static final String TRAFFIC_DIV_1 = "1";

	/**
	 * No.1�i�ό��j �\���ʃR�[�h .
	 */
	public static final String TRAVEL_BOOK_KIND = "2109";

	/**
	 * No.1�i�ό��j �p�r .
	 */
	public static final String TRAVEL_BOOK_PURPOSE = "2110";

	/**
	 * �t�H�[����.
	 */
	public static final String UR00300_INSERTFORM = "UR00300InsertForm";

	/**
	 * maxcount.
	 */
	public static final String UR00300_MAXCOUNT = "ur00300.maxcount";

	/**
	 * move�t���O.
	 */
	public static final String UR00300_MOVE = "move";

	/**
	 * ���ʂ�100���𒴂���ꍇ�̃t���O.
	 */
	public static final String UR00400_EXCEED_FLAG = "ur00400ExceedFlag";

	/**
	 * ���ʂ�100���𒴂���ꍇ�̒l.
	 */
	public static final String UR00400_EXCEED_VLAUE = "1";

	// ------------------------ur00400--------------------------
	/**
	 * �t�H�[����.
	 */
	public static final String UR00400_FORM = "UR00400Form";

	/**
	 * �t�H�[����.
	 */
	public static final String UR00400_FORMLIST = "UR00400FormList";

	/**
	 * �t�H�[����.
	 */
	public static final String UR00400_INITFORM = "UR00400InitForm";

	/**
	 * maxcount.
	 */
	public static final String UR00400_MAXCOUNT = "ur00400.maxcount";

	/**
	 * UR00400���ʉ�ʂɕ\������f�[�^�̃L�[.
	 */
	public static final String UR00400_SEND_FILE_OUTDATA = "sendOutData";

	/**
	 * maxcount.
	 */
	public static final String UR00500_MAXCOUNT = "ur00500.maxcount";

	/**
	 * �o�̓f�[�^��.
	 */
	public static final String UR00500OUTDATA = "UR00500OutData";

	/**
	 * �L���󋵈ꗗ��ʓ��pstatusList.
	 */
	public static final String UR00500STATUSLIST = "ur00500StatusList";

	/**
	 * �^�C�v null.
	 */
	public static final int UR01010_TYPE_NULL = -1;

	/**
	 * �ݒ� �����E�x���E�x�O�� 2009/12/02 add by s31109.
	 */
	public static final String UR02000_APPLY_BY_DAY = "applyByDay";

	/**
	 * �ݒ� ���Ԏw��.
	 */
	public static final String UR02000_APPLY_BY_SPECIFY = "applyBySpecify";

	/**
	 * �ݒ� �j������.
	 */
	public static final String UR02000_APPLY_BY_WEEK = "applyByWeek";

	/**
	 * �{�^���̖������ ����.
	 */
	public static final String UR02000_BUTTON_DISABLED = "disabled";

	/**
	 * �{�^���̖������ �L��.
	 */
	public static final String UR02000_BUTTON_DISABLED_FALSE = "false";

	/**
	 * �{�^���̖������ ����.
	 */
	public static final String UR02000_BUTTON_DISABLED_TRUE = "true";

	/**
	 * �{�^���̖������ �L��.
	 */
	public static final String UR02000_BUTTON_ENABLED = "";

	/**
	 * ���F�������ԓ_�őO�ɏ��F���ꂽ�f�[�^�Ɣ�r���āA�Ⴄ�_�̔w�i�F.
	 */
	public static final String UR02000_DAY_BGCOLOR_CHANGED = "#00FFFF";

	/**
	 * ���̃f�t�H���g�w�i�F.
	 */
	public static final String UR02000_DAY_BGCOLOR_DEFAULT = "#FFFFFF";

	/**
	 * �R�s�[��ɃR�s�[�����Ȃ��ꍇ.
	 */
	public static final String UR02000_DAY_BGCOLOR_ERROR = "#FF0000";

	/**
	 * �y�j���̔w�i�F.
	 */
	public static final String UR02000_DAY_BGCOLOR_SATURDAY = "#E1EDFE";

	/**
	 * ���j���̔w�i�F.
	 */
	public static final String UR02000_DAY_BGCOLOR_SUNDAY = "#FFD9D9";

	/**
	 * �J�n��.
	 */
	public static final int UR02000_FIRST_MONTH = 10;

	/**
	 * �I����.
	 */
	public static final int UR02000_LAST_MONTH = 1;

	/**
	 * ���Ԃ̌�.
	 */
	public static final int UR02000_MIDDLE_MONTH = 0;

	/**
	 * �ق��1�J��.
	 */
	public static final int UR02000_ONLY_ONE_MONTH = 11;

	/**
	 * �y�[�W�̌��̋L�^��.
	 */
	public static final int UR02000_PAGE_RECORD = 6;

	/**
	 * maxcount.
	 */
	public static final String UR02001_MAXCOUNT = "ur02001.maxcount";

	// ---------------------------------------------------------
	// ---------------------------------------------------------
	// ------------------------ur02001--------------------------
	//���񓚏��ߋ��f�[�^�R�s�[�@�\(�ő�\�������ݒ�)
	/**
	 * �o�̓f�[�^��.
	 */
	public static final String UR02001OUTDATA = "UR02001OutData";

	/**
	 * �J�����_�[�R�s�[�����ő匏���v���p�e�B��.
	 */
	public static final String UR02004_MAXCOUNT = "ur02004.maxcount";

	/**
	 * maxcount.
	 */
	public static final String UR02007_MAXCOUNT = "ur02007.maxcount";

	// ------------------------ur02007--------------------------
	// �{�ݕt�я��ꗗ�@�\�ǉ� 2009/12/25 s30873
	/**
	 * �o�̓f�[�^��.
	 */
	public static final String UR02007OUTDATA = "UR02007OutData";

	/**
	 * maxcount.
	 */
	public static final String UR04000_MAXCOUNT = "ur04000.maxcount";

	/**
	 * �o�̓f�[�^��.
	 */
	public static final String UR04000OUTDATA = "UR04000OutData";

	/**
	 * maxcount.
	 */
	public static final String UR05000_MAXCOUNT = "ur05000.maxcount";

	public static final String UR05000_RESULTCONTROLFORM = "UR05000ResultControlForm";

	// ------------------------ur05000--------------------------
	// �{�ݕt�я��ꗗ�@�\�ǉ� 2009/12/04 s30873
	/**
	 * �o�̓f�[�^��.
	 */
	//public static final String UR05000OUTDATA = "UR05000OutData";
	public static final String UR05000FORM = "UR05000Form";

	/**
	 * maxcount.
	 */
	public static final String UR05100_MAXCOUNT = "ur05100.maxcount";

	// ------------------------ur05100--------------------------
	// �{�ݕt�я��ڍ׉�ʃR�s�[�@�\�ǉ� 2009/12/28 s30873
	/**
	 * �o�̓f�[�^��.
	 */
	public static final String UR05100OUTDATA = "UR05100OutData";

	// ---------------------------------------------------------
	// ------------------------ur06000--------------------------
	public static final String UR06000_MAXCOUNT = "ur06000.maxcount";

	//------------------------ur06000--------------------------
	// �ۑ�No52�F��ԕύX�@�\�ǉ� 2009/12/10 s31109
	/**
	 * �o�̓f�[�^��.
	 */
	public static final String UR06000OUTDATA = "UR06000OutData";

	/**
	 * JR���p.
	 */
	public static final String USEJR = "1";

	/**
	 * ���[�U�敪�F�{�ݑ�.
	 */
	public static final String[] USER_DIV_FACILITIES_RANG = { "2" };

	/**
	 * ���[�U�敪�F�i�q��.
	 */
	public static final String[] USER_DIV_JR_RANG = { "0", "1" };

	/**
	 * ���[�U�敪�F�Ǘ���.
	 */
	public static final String[] USER_DIV_MANAGER_RANG = { "9" };

	/**
	 * ���[�U�[�敪�A�{�݃��[�U�[.
	 */
	public static final String USER_KUBUN_SINSETU = "2";

	/**
	 * ���S���p.
	 */
	public static final String USESITETU = "2";

	/**
	 * ���]�R�[�h.
	 */
	public static final String VIEW_TYPE = "0103";

	/**
	 * �o�C�L���O�����L.
	 */
	public static final String VK_LIT_FLG_HAVE = "����";

	/**
	 * �o�C�L���O������.
	 */
	public static final String VK_LIT_FLG_NOT = "�Ȃ�";

	/**
	 * �o�C�L���O�����L���f�[�^�̏W��.
	 */
	private static Map vkLitFlgMap = new LinkedHashMap();

	/**
	 * �ʐϒP�ʃ��X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getAreaUnit() {
		Map map = (Map) getMstBasicMap().get(AREA_UNIT_DIV);
		return getLvList(map);
	}

	/**
	 * �D��No.1:�p�r���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getBookPurposeList() {
		Map map = (Map) getMstBasicMap().get(PUPORSE_CD_DIV);
		return getLvListLabelWithValue(map);

	}

	/**
	 * �x�Ѓ��X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getBranchLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_BRANCH);
		return getLvList(map);

	}

	/**
	 * ������ʃ��X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getBuildingType() {
		Map map = (Map) getMstBasicMap().get(BUILDING_TYPE);
		return getLvList(map);
	}

	/**
	 * �L���f�B�����敪 .
	 *
	 * @return List
	 */
	public static List getcaddieChargeDiv() {
		List list = new ArrayList();
		list = getLvList(caddieChargeDivMap);
		return list;
	}

	/**
	 * �D��No.1:�D�ԓ��e�敪���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getContentList() {
		Map map = (Map) getMstBasicMap().get(CONTENT_DIV);
		return getLvList(map);

	}

	/**
	 * �戵�萔���P�ʉ~�^�� .
	 *
	 * @return List �~�^��
	 */
	public static List getDealFeeFlg() {
		List list = new ArrayList();
		List listOrg = getLvList(dealFeeFlgMap);
		list.add(0, listOrg.get(1));
		list.add(1, listOrg.get(0));
		return list;
	}

	/**
	 * �����������X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getFeeCondType() {
		Map map = (Map) getMstBasicMap().get(FEE_COND_TYPE);
		return getLvList(map);
	}

	/**
	 * �Ɩ��N�x���X�g���擾����.
	 *
	 * @return List �Ɩ��N�x���X�g
	 */
	public static List getGyomuYearList() {
		/*
		 * SimpleDateFormat df = new SimpleDateFormat("yyyy");
		 * String year = df.format(new Date());
		 */
		String year = KikakuWebUtil.getGyomuYear(); //�Ɩ��N�x���擾jinhuashi 2007.1.22
		String lastYear = Integer.toString(Integer.parseInt(year) - 1);
		String comeingYear = Integer.toString(Integer.parseInt(year) + 1);
		List list = new ArrayList();
		list.add(new LabelValueBean(lastYear, lastYear));
		list.add(new LabelValueBean(year, year));
		list.add(new LabelValueBean(comeingYear, comeingYear));
		return list;
	}

	/**
	 * �Ɩ��N�x���X�g���擾����.
	 *
	 * @return List �Ɩ��N�x���X�g
	 */
	public static List getGyomuYearListSp() {
		String year = KikakuWebUtil.getGyomuYear(); //�Ɩ��N�x���擾jinhuashi 2007.1.22
		String comeingYear = Integer.toString(Integer.parseInt(year) + 1);
		List list = new ArrayList();
		list.add(new LabelValueBean(year, year));
		list.add(new LabelValueBean(comeingYear, comeingYear));
		return list;
	}

	/**
	 * ��d���ʒm���@�p��/�\��ʒm���@�p�� .
	 *
	 * @return List �v �s�v
	 */
	public static List getInformWayFlg() {
		List list = new ArrayList();
		list = getLvList(informWayFlgMap);
		return list;
	}

	/**
	 * �J�[�g�����敪 .
	 *
	 * @return List
	 */
	public static List getkartChargeDiv() {
		List list = new ArrayList();
		list = getLvList(kartChargeDivMap);
		return list;
	}

	/**
	 * @return Returns the kikakuWebPropertiesStream.
	 */
	public static InputStream getKikakuWebPropertiesStream() {
		return kikakuWebPropertiesStream;
	}

	/**
	 * ��ʃ��X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getKindLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_KIND);
		return getLvList(map);

	}

	/**
	 * ���X�g��LABEL���擾����.
	 *
	 * @param divCode
	 *            �敪�R�[�h
	 * @param listValue
	 *            ���X�g��VALUE
	 * @return String ���X�g��LABEL
	 */
	public static String getListLabel(String divCode, String listValue) {
		Map map = (Map) getMstBasicMap().get(divCode);

		if (StringUtil.isEmpty(listValue)) {
			return null;
		}
		for (Iterator i = map.keySet().iterator(); i.hasNext();) {
			String key = (String) i.next();
			if (key.equals(listValue)) {
				return (String) map.get(key);
			}
		}

		return null;
	}

	// --------------------�Ɩ������X�^�b�g---------------------------------

	// ------------------------ur04000--------------------------

	/**
	 * LabelValueBean���X�g���擾����.
	 *
	 * @param map
	 *            �萔�̏W��
	 * @return returnList LabelValueBean���X�g
	 */
	private static List getLvList(Map map) {
		List returnList = new ArrayList();
		for (Iterator i = map.keySet().iterator(); i.hasNext();) {
			LabelValueBean lv = new LabelValueBean();
			String key = i.next().toString();
			Object obj = map.get(key);
			//null�f�[�^�ɑ΂��āA�C���@jinhuashi 2007/4/24
			if (obj == null) {
				lv.setLabel("");
			} else {
				lv.setLabel(obj.toString());
			}

			lv.setValue(key);
			returnList.add(lv);
		}

		return returnList;
	}

	/**
	 * LabelValueBean���X�g���擾����.
	 *
	 * @param map
	 *            �萔�̏W��
	 * @return returnList LabelValueBean���X�g
	 */
	protected static List getLvListLabelWithValue(Map map) {
		List returnList = new ArrayList();
		for (Iterator i = map.keySet().iterator(); i.hasNext();) {
			LabelValueBean lv = new LabelValueBean();
			String key = i.next().toString();
			String label = map.get(key).toString();
			lv.setLabel(key + "�F" + label);
			lv.setValue(key);
			returnList.add(lv);
		}

		return returnList;
	}

	/**
	 * @return Returns the mailInputStream.
	 */
	public static InputStream getMailInputStream() {
		return mailInputStream;
	}

	/**
	 * �萔���擾����.
	 *
	 * @param dicCode
	 *            �敪�R�[�h
	 * @param key
	 *            �}�b�v�̃L�[
	 * @return String �萔
	 */
	public static String getMapValue(String dicCode, String key) {
		if (StringUtil.isEmpty(key)) {
			return "-";
		}

		return (String) ((Map) constantsMap.get(dicCode)).get(key);

	}

	/**
	 * �H���������X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getMealCondType() {
		Map map = (Map) getMstBasicMap().get(MEAL_COND_TYPE);
		return getLvList(map);
	}

	/**
	 * �H���ӏ����X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getMealPlaceCd() {
		Map map = (Map) getMstBasicMap().get(MEAL_PLACE_CD_DIV);
		return getLvList(map);
	}

	/**
	 * ���z��:�L���^���� .
	 *
	 * @return List �L���^����
	 */
	public static List getMoneyStatus() {
		List list = new ArrayList();
		List listOrg = getLvList(moneyStatus);
		list.add(0, listOrg.get(1));
		list.add(1, listOrg.get(0));
		return list;
	}

	/**
	 * ���}�敪 .
	 *
	 * @return List
	 */
	public static List getmsDiv() {
		List list = new ArrayList();
		list = getLvList(msDivMap);
		return list;
	}

	/**
	 * @return Returns the mstBasicMap.
	 */
	public static Map getMstBasicMap() {
		return mstBasicMap;
	}

	/**
	 * No.1 �񋟗����l�����.
	 *
	 * @return List ���X�g
	 */
	public static List getNo1MaxCapaPattern() {
		List maxCapaPatternList = new ArrayList();
		for (int i = 5; i <= 14; i++) {
			LabelValueBean lv = new LabelValueBean();
			lv.setLabel(i + "��");
			lv.setValue(i + "");
			maxCapaPatternList.add(lv);
		}
		return maxCapaPatternList;
	}

	/**
	 * �L���f�B�t�v���[�� .
	 *
	 * @return List �� �s��
	 */
	public static List getplayWithCaddieFlg() {
		List list = new ArrayList();
		list = getLvList(playWithCaddieMap);
		return list;
	}

	/**
	 * �s���{�����X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getPrefecturesLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_PREFECTURES);
		return getLvList(map);

	}

	/**
	 * �^�C�v���X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getRoomType() {
		Map map = (Map) getMstBasicMap().get(ROOM_TYPE_DIV);
		return getLvList(map);
	}

	/**
	 * �^�C�v���X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getRoomTypeLabelWithValue() {
		Map map = (Map) getMstBasicMap().get(ROOM_TYPE_DIV);
		return getLvListLabelWithValue(map);
	}

	/**
	 * �������i�L�����X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getRoomVesselFlg() {
		List list = new ArrayList();
		list = getLvList(roomVesselFlgMap);
		return list;
	}

	/**
	 * �V�[�Y�����X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getSeasonLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_SEASON);

		List returnList = new ArrayList();

		List list = getLvList(map);

		if (list.size() != 10) {
			return getLvList(map);
		}

		returnList.add(list.get(8));
		returnList.add(list.get(1));
		returnList.add(list.get(2));
		returnList.add(list.get(3));
		returnList.add(list.get(4));
		returnList.add(list.get(5));
		returnList.add(list.get(6));
		returnList.add(list.get(7));
		returnList.add(list.get(9));
		returnList.add(list.get(0));

		return returnList;

	}

	/**
	 * ���t�敪���X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getSendLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_SEND);
		return getLvList(map);

	}

	/**
	 * �V���g���o�X�\��L�� .
	 *
	 * @return List
	 */
	public static List getshuttleBusBookFlg() {
		List list = new ArrayList();
		list = getLvList(shuttleBusBookMap);
		return list;
	}

	/**
	 * �{�ݕt�я��ꗗ�@�\�ǉ��Ή� 2009/12/04 s30873
	 * �{�ݕt�ю�ރ��X�g���擾����.
	 *
	 * @return List �{�ݕt�ю�ރ��X�g
	 */
	public static List getSortsFacLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_SORTS_FAC);
		return getLvList(map);

	}

	/**
	 * ��ԕύX��ރ��X�g���擾����.
	 * �ۑ�No52�F��ԕύX�@�\�ǉ��Ή��@2009/12/10 add by s31109
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getStatusChangeList() {
		Map map = (Map) getMstBasicMap().get(DIV_STATUS_CHANGE);
		return getLvList(map);

	}

	/**
	 * ��ԃ��X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getStatusLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_STATUS);
		return getLvList(map);

	}

	/**
	 * �݌ɋ敪���X�g���擾���� .
	 *
	 * @return List �݌ɋ敪���X�g
	 */
	public static List getStockDivList() {
		Map map = (Map) constantsMap.get(DIV_STOCK_DIV);
		List list = getLvList(map);
		return list;
	}

	/**
	 * �l���敪���X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getStyleDivList() {
		Map map = (Map) getMstBasicMap().get(STYLE_DIV);
		return getLvList(map);
	}

	/**
	 * No.1�i�ό��j �\���ʃ��X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getTravelBookKind() {
		Map map = (Map) getMstBasicMap().get(TRAVEL_BOOK_KIND);
		return getLvListLabelWithValue(map);
	}

	/**
	 * No.1�i�ό��j �p�r���X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getTravelBookPurpose() {
		Map map = (Map) getMstBasicMap().get(TRAVEL_BOOK_PURPOSE);
		return getLvListLabelWithValue(map);
	}

	//����őΉ��ɔ����A�폜
	//	/**
	//	 *   ����ŗ����擾����.
	//	 *
	//	 * @return List ��ʃ��X�g
	//	 */
	//	public static List getConsumptionTaxRateList() {
	//		Map map = (Map) getMstBasicMap().get(CONSUMPTION_TAX_RATE);
	//		return getLvList(map);
	//	}
	/**
	 * �{�ݕt�я��ꗗ�@�\�ǉ��Ή� 2009/12/18 s30873
	 * �{�݃^�C�v���̃��X�g���擾����.
	 *
	 * @return List �{�ݕt�ю�ރ��X�g
	 */
	public static List getTypeFaclityLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_TYPE_FAC);
		return getLvList(map);

	}

	//---------------------------------------------------------
	/**
	 * ���]���X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getViewType() {
		Map map = (Map) getMstBasicMap().get(VIEW_TYPE);
		return getLvList(map);
	}

	/**
	 * �o�C�L���O�������X�g���擾����.
	 *
	 * @return List ��ʃ��X�g
	 */
	public static List getVKLitFlg() {
		List list = new ArrayList();
		list = getLvList(vkLitFlgMap);
		return list;
	}

	/**
	 * �萔�f�[�^�̏W���̏�����.
	 */
	private static void initConstantsMap() {

		stockDivMap.put(STOCK_DIV_CODE_1, STOCK_DIV_NAME_1);
		stockDivMap.put(STOCK_DIV_CODE_2, STOCK_DIV_NAME_2);
		stockDivMap.put(STOCK_DIV_CODE_3, STOCK_DIV_NAME_3);
		stockDivMap.put(STOCK_DIV_CODE_4, STOCK_DIV_NAME_4);
		constantsMap.put(DIV_STOCK_DIV, stockDivMap);

		fmCostDivMap.put(FM_COST_DIV_CODE_1, FM_COST_DIV_NAME_1);
		fmCostDivMap.put(FM_COST_DIV_CODE_2, FM_COST_DIV_NAME_2);
		fmCostDivMap.put(FM_COST_DIV_CODE_3, FM_COST_DIV_NAME_3);
		constantsMap.put(DIV_FM_COST_DIV, fmCostDivMap);

		fmStockDivMap.put(FM_STOCK_DIV_CODE_1, FM_STOCK_DIV_NAME_1);
		fmStockDivMap.put(FM_STOCK_DIV_CODE_2, FM_STOCK_DIV_NAME_2);
		constantsMap.put(DIV_FM_STOCK_DIV, fmStockDivMap);

		roomVesselFlgMap.put(FLG_TRUE, ROOM_VESSEL_FLG_HAVE);
		roomVesselFlgMap.put(FLG_FALSE, ROOM_VESSEL_FLG_NOT);
		vkLitFlgMap.put(FLG_TRUE, VK_LIT_FLG_HAVE);
		vkLitFlgMap.put(FLG_FALSE, VK_LIT_FLG_NOT);

		informWayFlgMap.put(FLG_TRUE, INFORM_WAY_FLG_HAVA);
		informWayFlgMap.put(FLG_FALSE, INFORM_WAY_FLG_NOT);

		playWithCaddieMap.put(FLG_TRUE, PLAY_WITH_CADDIE_CAN);
		playWithCaddieMap.put(FLG_FALSE, PLAY_WITH_CADDIE_CANNOT);

		dealFeeFlgMap.put(DEAL_FEE_PERCENT_VLAUE, DEAL_FEE_PERCENT);
		dealFeeFlgMap.put(DEAL_FEE_YEN_VALUE, DEAL_FEE_YEN);

		moneyStatus.put(FLG_TRUE, FEE_PAY_FLG);
		moneyStatus.put(FLG_FALSE, FEE_FREE_FLG);

		caddieChargeDivMap.put(CADDIE_CHARGE_DIV_1, CADDIE_CHARGE_DIV_1_NM);
		caddieChargeDivMap.put(CADDIE_CHARGE_DIV_2, CADDIE_CHARGE_DIV_2_NM);
		caddieChargeDivMap.put(CADDIE_CHARGE_DIV_3, CADDIE_CHARGE_DIV_3_NM);

		kartChargeDivMap.put(CADDIE_CHARGE_DIV_1, KART_CHARGE_DIV_1_NM);
		kartChargeDivMap.put(CADDIE_CHARGE_DIV_2, KART_CHARGE_DIV_2_NM);

		msDivMap.put(CADDIE_CHARGE_DIV_1, MS_DIV_1);
		msDivMap.put(CADDIE_CHARGE_DIV_2, MS_DIV_2);
		msDivMap.put(CADDIE_CHARGE_DIV_3, MS_DIV_3);

		shuttleBusBookMap.put(FLG_FALSE, SHUTTLE_BUS_BOOK_FLG_NO);
		shuttleBusBookMap.put(FLG_TRUE, SHUTTLE_BUS_BOOK_FLG_YES);

		//�{�ݕt�я�� �{�݊m��. 2009/12/07 S30873 START
		facDecisionDivMap.put(FAC_DECISION_DIV_CODE_1, FAC_DECISION_DIV_NAME_1);
		facDecisionDivMap.put(FAC_DECISION_DIV_CODE_2, FAC_DECISION_DIV_NAME_2);
		constantsMap.put(DIV_FAC_DECISION_DIV, facDecisionDivMap);
		//		�{�ݕt�я�� �{�݊m��. 2009/12/07 S30873 END
	}

	/**
	 * ����`�t�@�C���̏�����.
	 */
	public static void initKikakuProperties() {
		InputStream inFile = JreConstants.class
				.getResourceAsStream("/jp/co/jreast/common/properties/kikakuweb.properties");

		setKikakuWebPropertiesStream(inFile);
	}

	/**
	 * ���[���̏�����.
	 */
	public static void initMail() {
		InputStream inFile = JreConstants.class
				.getResourceAsStream("/jp/co/jreast/common/properties/mail.properties");

		setMailInputStream(inFile);
	}

	/**
	 * �}�X�^�f�[�^�̏W���̏�����.
	 */
	public static void initMstBasicMap() {
		IDao dao = DaoManagerDelegate.createDao(IDao.class);

		List list = dao.queryForList("BasicMstSearch", null);

		list.addAll(dao.queryForList("BasicMstSearch2", null));

		String tempDiv = null;

		for (Iterator i = list.iterator(); i.hasNext();) {
			BasicMstData one = (BasicMstData) i.next();
			String divCode = one.getDivCode();

			if (!divCode.equals(tempDiv)) {
				getMstBasicMap().put(divCode, new LinkedHashMap());
				tempDiv = divCode;
			}

			((Map) getMstBasicMap().get(divCode)).put(one.getBasicCode1()
					.trim(), one.getBasicName1());

		}

		initConstantsMap();

	}

	/**
	 * @param kikakuWebPropertiesStream
	 *            The kikakuWebPropertiesStream to set.
	 */
	public static void setKikakuWebPropertiesStream(
			InputStream kikakuWebPropertiesStream) {
		JreConstants.kikakuWebPropertiesStream = kikakuWebPropertiesStream;
	}

	/**
	 * @param mailInputStream
	 *            The mailInputStream to set.
	 */
	public static void setMailInputStream(InputStream mailInputStream) {
		JreConstants.mailInputStream = mailInputStream;
	}

	/**
	 * @param mstBasicMap
	 *            The mstBasicMap to set.
	 */
	public static void setMstBasicMap(Map mstBasicMap) {
		JreConstants.mstBasicMap = mstBasicMap;
	}

}
