package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 * NO1_�S���t�f�[�^�N���X�B.
 * �@�\�T�v    �F   NO1_�S���t�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */

public class DNo1GolfData extends PlanAnsBaseData implements IDNo1CommonData {

    /** �ԗ��p�������HIC . */
    private String accessIc;

    /** �ԗ��p���� . */
    private String accessTime;

    /** �G���A�R�[�h . */
    private String areaCd;

    /** �n��啪�� */
    private String areaDaiCd;

    /** �n�於��(�J�i) */
    private String areaKana;

    /** �n�於�� */
    private String areaNm;

    /** �n�揬���� */
    private String areaShoCd;

    /** �ԗ��p�����ԓ� . */
    private String autoRoadway;

    /** �ԗ��p���� . */
    private String availableDistance;

    /** �\���� . */
    private String bookKind = "61";

    /** �p�r . */
    private String bookPurpose = "3";

    /** �o�X�s���� . */
    private String busDestination;

    /** �o�X�▼�� . */
    private String busStation;

    /** �o�X���p���� . */
    private String busTimetable;

    /** �L���f�B�����QB_�y�j�x�� . */
    private String caddieCharge2bHoliday;

    /** �L���f�B�����QB_���� . */
    private String caddieCharge2bWeekday;

    /** �L���f�B�����RB_�y�j�x�� . */
    private String caddieCharge3bHoliday;

    /** �L���f�B�����RB_���� . */
    private String caddieCharge3bWeekday;

    /** �L���f�B�����SB_�y�j�x�� . */
    private String caddieCharge4bHoliday;

    /** �L���f�B�����SB_���� . */
    private String caddieCharge4bWeekday;

    /** �L���f�B�����敪 . */
    private String caddieChargeDiv = JreConstants.CADDIE_CHARGE_DIV_1;

    /** �����P�ʋ敪 . */
    /**
     * ToDo: ���x���\���i�P�������̓��͂Ő��䂷��j
     */
    private String chargeDiv;

    /** �w�����v�A���L�� . */
    private String contactFlg = JreConstants.FLG_FALSE;

    /** �ԗ��p���� . */
    private String countyRoadway;

    /** �R�[�X�����i���[�h�j�P . */
    private String courseDistance1;

    /** �R�[�X�����i���[�h�j�Q . */
    private String courseDistance2;

    /** �R�[�X�����i���[�h�j�R . */
    private String courseDistance3;

    /** �R�[�X�����i���[�h�j�S . */
    private String courseDistance4;

    /** �R�[�X�z�[���P . */
    private String courseHole1;

    /** �R�[�X�z�[���Q . */
    private String courseHole2;

    /** �R�[�X�z�[���R . */
    private String courseHole3;

    /** �R�[�X�z�[���S . */
    private String courseHole4;

    /** �R�[�X���P . */
    private String courseName1;

    /** �R�[�X���Q . */
    private String courseName2;

    /** �R�[�X���R . */
    private String courseName3;

    /** �R�[�X���S . */
    private String courseName4;

    /** �R�[�X�o�[�P . */
    private String coursePar1;

    /** �R�[�X�o�[�Q . */
    private String coursePar2;

    /** �R�[�X�o�[�R . */
    private String coursePar3;

    /** �R�[�X�o�[�S . */
    private String coursePar4;

    /** �q���}�L�� . */
    private String customerMsFlg = JreConstants.FLG_FALSE;

    /** �戵�萔�� . */
    private String dealFee;

    /** �戵�萔��Flag . */
    private String dealFeeFlg;

    /** �戵�萔����� . */
    private String dealFeeType;

    /** ���O�� . */
    private String exceptDate;

    /** �{�ݏZ�� . */
    private String facilityAddr;

    /** �{�݃t�@�b�N�X . */
    private String facilityFax;

    /** �{�ݗX�֔ԍ� . */
    private String facilityPostCd;

    /** �{�ݓd�b . */
    private String facilityTel;

    /** ���R���͗� . */
    private String freelyColumn;

    /** �ԗ��p���ʓ��H . */
    private String genreralRoadway;

    /** �V���g���o�X�S���t�ꔭ�����P . */
    private String golfSpotDepart1;

    /** �V���g���o�X�S���t�ꔭ�����Q . */
    private String golfSpotDepart2;

    /** �V���g���o�X�S���t�ꔭ�����R . */
    private String golfSpotDepart3;

    /** �V���g���o�X�S���t�ꔭ�����P . */
    private String golfSpotDepartH1;

    /** �V���g���o�X�S���t�ꔭ�����Q . */
    private String golfSpotDepartH2;

    /** �V���g���o�X�S���t�ꔭ�����R . */
    private String golfSpotDepartH3;

    /** �V���g���o�X�S���t�ꔭ�����P . */
    private String golfSpotDepartM1;

    /** �V���g���o�X�S���t�ꔭ�����Q . */
    private String golfSpotDepartM2;

    /** �V���g���o�X�S���t�ꔭ�����R . */
    private String golfSpotDepartM3;

    /** ���ރR�[�h . */
    private String goodsKindCd;

    /** �ԗ��p�������H . */
    private String highway;

    /**
     * �ʒm��n�於
     */
    private String informAreaNm;

    /** �ʒm��t�@�b�N�X . */
    private String informFax;

    /**
     * �ʒm�於
     */
    private String informNm;

    /** �J�[�g�����QB_�y�j�x�� . */
    private String kartCharge2bHoliday;

    /** �J�[�g�����QB_���� . */
    private String kartCharge2bWeekday;

    /** �J�[�g�����RB_�y�j�x�� . */
    private String kartCharge3bHoliday;

    /** �J�[�g�����RB_���� . */
    private String kartCharge3bWeekday;

    /** �J�[�g�����SB_�y�j�x�� . */
    private String kartCharge4bHoliday;

    /** �J�[�g�����SB_���� . */
    private String kartCharge4bWeekday;

    /** �J�[�g�����敪 . */
    private String kartChargeDiv = JreConstants.CADDIE_CHARGE_DIV_1;

    /** ��d���� . */
    private String liquidateDay;

    /** ��d���ʒm���@�p�� . */
    private String liquidateInformFlg = JreConstants.FLG_TRUE;

    /**
     * ��d�������i�����ݒ莞�j
     */
    private String liquidateTime;

    /**
     * ��d�������i�����ݒ莞�j�i���j
     */
    private String liquidateTimeHour;

    /**
     * ��d�������i�����ݒ莞�j�i���j
     */
    private String liquidateTimeMinute;

    /** �}���\���ԊJ�n . */
    private String meetTimeBegin;

    /** �}���\���ԊJ�n . */
    private String meetTimeBeginH;

    /** �}���\���ԊJ�n�� . */
    private String meetTimeBeginM;

    /** �}���\���ԏI���� . */
    private String meetTimeEnd;

    /** �}���\���ԏI���� . */
    private String meetTimeEndH;

    /** �}���\���ԏI���� . */
    private String meetTimeEndM;

    /** �}���\���ԗL�� . */
    private String meetTimeFlg = JreConstants.FLG_FALSE;

    /** ���l */
    private String memo;

    /** ���}�敪 . */
    private String msDiv = JreConstants.CADDIE_CHARGE_DIV_1;

    /** ���}�L�� . */
    private String msFlg = JreConstants.FLG_TRUE;

    /** ���}���l . */
    private String msMemo;

    /** ���}�̏��� . */
    private String msTerm;

    /** �ԗ��p���� . */
    private String nationalRoadway;

    /** �i�q�E���S�Ċ���H . */
    private String nearestRoute;

    /** �i�q�E���S�Ċ�w . */
    private String nearestStation;

    /** �V���g���o�X�Ŋ�w�������P . */
    private String nearestStationDepart1;

    /** �V���g���o�X�Ŋ�w�������Q . */
    private String nearestStationDepart2;

    /** �V���g���o�X�Ŋ�w�������R . */
    private String nearestStationDepart3;

    /** �V���g���o�X�Ŋ�w������1 . */
    private String nearestStationDepartH1;

    /** �V���g���o�X�Ŋ�w�������Q . */
    private String nearestStationDepartH2;

    /** �V���g���o�X�Ŋ�w�������R . */
    private String nearestStationDepartH3;

    /** �V���g���o�X�Ŋ�w�������P . */
    private String nearestStationDepartM1;

    /** �V���g���o�X�Ŋ�w�������Q . */
    private String nearestStationDepartM2;

    /** �V���g���o�X�Ŋ�w�������R . */
    private String nearestStationDepartM3;

    /**
     * 1�������t���O.
     */
    private String onePersonFlg;

    /** ��\�Җ� . */
    private String ownerNm;

    /**
     * �D���o�͎w��L�� .
     */
    private String personalTicketPrintFlg;

    /** �L���f�B�t�v���[�� . */
    private String playWithCaddieFlg = JreConstants.FLG_TRUE;

    /** �s���{���R�[�h . */
    private String prefecturesCd;

    /** �n��R�[�h . */
    private String regionCd;

    /** �v�\��R�����g . */
    private String reserveCmt;

    /** �v�\��L�� . */
    private String reserveFlg = JreConstants.FLG_FALSE;

    /** �\��ʒm���@�p�� . */
    private String reserveInformWay = JreConstants.FLG_TRUE;

    /** �Z�[���X�|�C���g . */
    private String salesPoint;

    /** �Z���t�v���[�QB . */
    private String selfPlay2b;

    /** �Z���t�v���[�RB . */
    private String selfPlay3b;

    /** �Z���t�v���[�SB . */
    private String selfPlay4b;

    /** �Z���t�v���[�敪 . */
    private String selfPlayDiv;

    /** �Z���t�v���[�� . */
    private String selfPlayFlg = JreConstants.FLG_TRUE;

    /** ����\���ԊJ�n . */
    private String sendTimeBegin;

    /** ����\���ԊJ�n�� . */
    private String sendTimeBeginH;

    /** ����\���ԊJ�n�� . */
    private String sendTimeBeginM;

    /** ����\���ԏI�� . */
    private String sendTimeEnd;

    /** ����\���ԏI���� . */
    private String sendTimeEndH;

    /** ����\���ԏI���� . */
    private String sendTimeEndM;

    /** ����\���ԗL�� . */
    private String sendTimeFlg = JreConstants.FLG_FALSE;

    /**
     * �V�j�A�N��From .
     */
    private String seniorAgeFrom;

    /** �V���g���o�X�\��R�����g . */
    private String shuttleBusBookCmt;

    /** �V���g���o�X�\��L�� . */
    private String shuttleBusBookFlg = JreConstants.FLG_FALSE;

    /** �V���g���o�X�L�� . */
    private String shuttleBusFlg = JreConstants.FLG_FALSE;

    /** �V���g���o�X�^�s���l . */
    private String shuttleBusMemo;

    /** �X�^�[�g�R�[�X . */
    private String startCourse;

    /** �X�^�[�g���� . */
    private String startTime;

    /** �X�^�[�g�� . */
    private String startTimeH;

    /** �X�^�[�g���@. */
    private String startTimeM;

    /**
     * JR�Ǝ��S�̋敪.
     */
    private String stationDiv;

    /** �Z���i�݌Ɂj */
    private String stockAddr;

    /**
     * �݌ɐ����t���O .
     */
    private String stockControlFlg;

    /**
     * �݌ɖ��́i�J�i�j
     */
    private String stockKana;

    /**
     * �݌ɖ��́i�����j
     */
    private String stockKanj;

    /**
     * �݌ɊǗ����@
     */
    private String stockManagement;

    /** �݌ɔԍ� . */
    private String stockNo;

    /** �X�֔ԍ��i�݌Ɂj */
    private String stockPostCd;

    /** �d�b�ԍ��i�݌Ɂj */
    private String stockTel;

    /**
     * �݌ɒP��
     */
    private String stockUnit;

    /** �^�N�V�[���� . */
    private String taxiTime;

    /** �񋟊��ԏI���� . */
    private String termEndD;

    /** �񋟊��ԏI���� . */
    private String termEndM;

    /** �񋟊��ԏI���N . */
    private String termEndY;

    /** �񋟊��ԏI���N���� . */
    private String termEndYmd;

    /** �񋟊��ԊJ�n�� . */
    private String termFromD;

    /** �񋟊��ԊJ�n�� . */
    private String termFromM;

    /** �񋟊��ԊJ�n�N . */
    private String termFromY;

    /** �񋟊��ԊJ�n�N���� . */
    private String termFromYmd;

    /** �o�X����k������ . */
    private String toBusStaTime;

    /** �w���k������ . */
    private String toStationWalktime;

    /** �L������ . */
    private String validPeriod;

    /** �o�E�`���[���X�� . */
    private String voucherFlg = JreConstants.FLG_TRUE;

    /**
     * �o�E�`���[���ē����i�����j .
     */
    private String voucherIntroKanji;

    /**
     * �ԗ��p�������HIC .���擾���܂��B
     * 
     * @return �ԗ��p�������HIC .
     */
    public String getAccessIc() {
        return accessIc;
    }

    /**
     * �ԗ��p���� .���擾���܂��B
     * 
     * @return �ԗ��p���� .
     */
    public String getAccessTime() {
        return accessTime;
    }

    /**
     * �G���A�R�[�h .���擾���܂��B
     * 
     * @return �G���A�R�[�h .
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * �n��啪�ނ��擾���܂��B
     * 
     * @return �n��啪��
     */
    public String getAreaDaiCd() {
        return areaDaiCd;
    }

    /**
     * �n�於��(�J�i)���擾���܂��B
     * 
     * @return �n�於��(�J�i)
     */
    public String getAreaKana() {
        return areaKana;
    }

    /**
     * �n�於�̂��擾���܂��B
     * 
     * @return �n�於��
     */
    public String getAreaNm() {
        return areaNm;
    }

    /**
     * �n�揬���ނ��擾���܂��B
     * 
     * @return �n�揬����
     */
    public String getAreaShoCd() {
        return areaShoCd;
    }

    /**
     * �ԗ��p�����ԓ� .���擾���܂��B
     * 
     * @return �ԗ��p�����ԓ� .
     */
    public String getAutoRoadway() {
        return autoRoadway;
    }

    /**
     * �ԗ��p���� .���擾���܂��B
     * 
     * @return �ԗ��p���� .
     */
    public String getAvailableDistance() {
        return availableDistance;
    }

    /**
     * �\���� .���擾���܂��B
     * 
     * @return �\���� .
     */
    public String getBookKind() {
        return bookKind;
    }

    /**
     * �p�r .���擾���܂��B
     * 
     * @return �p�r .
     */
    public String getBookPurpose() {
        return bookPurpose;
    }

    /**
     * �o�X�s���� .���擾���܂��B
     * 
     * @return �o�X�s���� .
     */
    public String getBusDestination() {
        return busDestination;
    }

    /**
     * �o�X�▼�� .���擾���܂��B
     * 
     * @return �o�X�▼�� .
     */
    public String getBusStation() {
        return busStation;
    }

    /**
     * �o�X���p���� .���擾���܂��B
     * 
     * @return �o�X���p���� .
     */
    public String getBusTimetable() {
        return busTimetable;
    }

    /**
     * �L���f�B�����QB_�y�j�x�� .���擾���܂��B
     * 
     * @return �L���f�B�����QB_�y�j�x�� .
     */
    public String getCaddieCharge2bHoliday() {
        return caddieCharge2bHoliday;
    }

    /**
     * �L���f�B�����QB_���� .���擾���܂��B
     * 
     * @return �L���f�B�����QB_���� .
     */
    public String getCaddieCharge2bWeekday() {
        return caddieCharge2bWeekday;
    }

    /**
     * �L���f�B�����RB_�y�j�x�� .���擾���܂��B
     * 
     * @return �L���f�B�����RB_�y�j�x�� .
     */
    public String getCaddieCharge3bHoliday() {
        return caddieCharge3bHoliday;
    }

    /**
     * �L���f�B�����RB_���� .���擾���܂��B
     * 
     * @return �L���f�B�����RB_���� .
     */
    public String getCaddieCharge3bWeekday() {
        return caddieCharge3bWeekday;
    }

    /**
     * �L���f�B�����SB_�y�j�x�� .���擾���܂��B
     * 
     * @return �L���f�B�����SB_�y�j�x�� .
     */
    public String getCaddieCharge4bHoliday() {
        return caddieCharge4bHoliday;
    }

    /**
     * �L���f�B�����SB_���� .���擾���܂��B
     * 
     * @return �L���f�B�����SB_���� .
     */
    public String getCaddieCharge4bWeekday() {
        return caddieCharge4bWeekday;
    }

    /**
     * �L���f�B�����敪 .���擾���܂��B
     * 
     * @return �L���f�B�����敪 .
     */
    public String getCaddieChargeDiv() {
        return caddieChargeDiv;
    }

    /**
     * �����P�ʋ敪 .���擾���܂��B
     * 
     * @return �����P�ʋ敪 .
     */
    public String getChargeDiv() {
        return chargeDiv;
    }

    /**
     * �w�����v�A���L�� .���擾���܂��B
     * 
     * @return �w�����v�A���L�� .
     */
    public String getContactFlg() {
        return contactFlg;
    }

    /**
     * �ԗ��p���� .���擾���܂��B
     * 
     * @return �ԗ��p���� .
     */
    public String getCountyRoadway() {
        return countyRoadway;
    }

    /**
     * �R�[�X�����i���[�h�j�P .���擾���܂��B
     * 
     * @return �R�[�X�����i���[�h�j�P .
     */
    public String getCourseDistance1() {
        return courseDistance1;
    }

    /**
     * �R�[�X�����i���[�h�j�Q .���擾���܂��B
     * 
     * @return �R�[�X�����i���[�h�j�Q .
     */
    public String getCourseDistance2() {
        return courseDistance2;
    }

    /**
     * �R�[�X�����i���[�h�j�R .���擾���܂��B
     * 
     * @return �R�[�X�����i���[�h�j�R .
     */
    public String getCourseDistance3() {
        return courseDistance3;
    }

    /**
     * �R�[�X�����i���[�h�j�S .���擾���܂��B
     * 
     * @return �R�[�X�����i���[�h�j�S .
     */
    public String getCourseDistance4() {
        return courseDistance4;
    }

    /**
     * �R�[�X�z�[���P .���擾���܂��B
     * 
     * @return �R�[�X�z�[���P .
     */
    public String getCourseHole1() {
        return courseHole1;
    }

    /**
     * �R�[�X�z�[���Q .���擾���܂��B
     * 
     * @return �R�[�X�z�[���Q .
     */
    public String getCourseHole2() {
        return courseHole2;
    }

    /**
     * �R�[�X�z�[���R .���擾���܂��B
     * 
     * @return �R�[�X�z�[���R .
     */
    public String getCourseHole3() {
        return courseHole3;
    }

    /**
     * �R�[�X�z�[���S .���擾���܂��B
     * 
     * @return �R�[�X�z�[���S .
     */
    public String getCourseHole4() {
        return courseHole4;
    }

    /**
     * �R�[�X���P .���擾���܂��B
     * 
     * @return �R�[�X���P .
     */
    public String getCourseName1() {
        return courseName1;
    }

    /**
     * �R�[�X���Q .���擾���܂��B
     * 
     * @return �R�[�X���Q .
     */
    public String getCourseName2() {
        return courseName2;
    }

    /**
     * �R�[�X���R .���擾���܂��B
     * 
     * @return �R�[�X���R .
     */
    public String getCourseName3() {
        return courseName3;
    }

    /**
     * �R�[�X���S .���擾���܂��B
     * 
     * @return �R�[�X���S .
     */
    public String getCourseName4() {
        return courseName4;
    }

    /**
     * �R�[�X�o�[�P .���擾���܂��B
     * 
     * @return �R�[�X�o�[�P .
     */
    public String getCoursePar1() {
        return coursePar1;
    }

    /**
     * �R�[�X�o�[�Q .���擾���܂��B
     * 
     * @return �R�[�X�o�[�Q .
     */
    public String getCoursePar2() {
        return coursePar2;
    }

    /**
     * �R�[�X�o�[�R .���擾���܂��B
     * 
     * @return �R�[�X�o�[�R .
     */
    public String getCoursePar3() {
        return coursePar3;
    }

    /**
     * �R�[�X�o�[�S .���擾���܂��B
     * 
     * @return �R�[�X�o�[�S .
     */
    public String getCoursePar4() {
        return coursePar4;
    }

    /**
     * �q���}�L�� .���擾���܂��B
     * 
     * @return �q���}�L�� .
     */
    public String getCustomerMsFlg() {
        return customerMsFlg;
    }

    /**
     * �戵�萔�� .���擾���܂��B
     * 
     * @return �戵�萔�� .
     */
    public String getDealFee() {

        //�戵�萔����ʂ͉~�̏ꍇ�A������؂�̂Ă�
        if (JreConstants.EnTypeFlg.equals(getDealFeeType())) {
            //�����ł͂Ȃ��̏ꍇ�A���̂܂ܕԂ�. jinhuashi 720501
            if (!DKikakuWebUtil.isNumber(dealFee)
                    && !DKikakuWebUtil.isFloat(dealFee)) {
                return dealFee;
            }
            if (!StringUtil.isEmpty(dealFee) && dealFee.length() > 0) {
                int dealFeeValue = Float.valueOf(dealFee).intValue();
                dealFee = String.valueOf(dealFeeValue);
            }

            return dealFee;
        } else {
            return dealFee;
        }

    }

    /**
     * �萔���̕\���������擾.
     * 
     * @return �萔��(�J���}�t���j
     */
    @Override
    public String getDealFeeDisplay() {
        if (!StringUtil.isEmpty(dealFee)
                && !StringUtil.isEmpty(getDealFeeType())
                && JreConstants.DEAL_FEE_YEN_VALUE.equals(getDealFeeType())) {
            return DKikakuWebUtil.formatCharge(dealFee);
        }
        return dealFee;
    }

    /**
     * �戵�萔��Flag .���擾���܂��B
     * 
     * @return �戵�萔��Flag .
     */
    public String getDealFeeFlg() {
        return dealFeeFlg;
    }

    /**
     * �戵�萔����� .���擾���܂��B
     * 
     * @return �戵�萔����� .
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * ���O�� .���擾���܂��B
     * 
     * @return ���O�� .
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * �{�ݏZ�� .���擾���܂��B
     * 
     * @return �{�ݏZ�� .
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * �{�݃t�@�b�N�X .���擾���܂��B
     * 
     * @return �{�݃t�@�b�N�X .
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * �{�ݗX�֔ԍ� .���擾���܂��B
     * 
     * @return �{�ݗX�֔ԍ� .
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * �{�ݓd�b .���擾���܂��B
     * 
     * @return �{�ݓd�b .
     */
    public String getFacilityTel() {
        return facilityTel == null ? "" : facilityTel.trim();
    }

    /**
     * ���R���͗� .���擾���܂��B
     * 
     * @return ���R���͗� .
     */
    public String getFreelyColumn() {
        return freelyColumn;
    }

    /**
     * �ԗ��p���ʓ��H .���擾���܂��B
     * 
     * @return �ԗ��p���ʓ��H .
     */
    public String getGenreralRoadway() {
        return genreralRoadway;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����P .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����P .
     */
    public String getGolfSpotDepart1() {
        return golfSpotDepart1;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����Q .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����Q .
     */
    public String getGolfSpotDepart2() {
        return golfSpotDepart2;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����R .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����R .
     */
    public String getGolfSpotDepart3() {
        return golfSpotDepart3;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����P .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����P .
     */
    public String getGolfSpotDepartH1() {
        return golfSpotDepartH1;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����Q .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����Q .
     */
    public String getGolfSpotDepartH2() {
        return golfSpotDepartH2;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����R .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����R .
     */
    public String getGolfSpotDepartH3() {
        return golfSpotDepartH3;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����P .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����P .
     */
    public String getGolfSpotDepartM1() {
        return golfSpotDepartM1;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����Q .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����Q .
     */
    public String getGolfSpotDepartM2() {
        return golfSpotDepartM2;
    }

    /**
     * �V���g���o�X�S���t�ꔭ�����R .���擾���܂��B
     * 
     * @return �V���g���o�X�S���t�ꔭ�����R .
     */
    public String getGolfSpotDepartM3() {
        return golfSpotDepartM3;
    }

    /**
     * ���ރR�[�h .���擾���܂��B
     * 
     * @return ���ރR�[�h .
     */
    public String getGoodsKindCd() {
        return goodsKindCd;
    }

    /**
     * �ԗ��p�������H .���擾���܂��B
     * 
     * @return �ԗ��p�������H .
     */
    public String getHighway() {
        return highway;
    }

    /**
     * �ʒm��n�於���擾���܂��B
     * 
     * @return �ʒm��n�於
     */
    public String getInformAreaNm() {
        return informAreaNm;
    }

    /**
     * �ʒm��t�@�b�N�X .���擾���܂��B
     * 
     * @return �ʒm��t�@�b�N�X .
     */
    public String getInformFax() {
        return StringUtils.trim(informFax);
    }

    /**
     * �ʒm�於���擾���܂��B
     * 
     * @return �ʒm�於
     */
    public String getInformNm() {
        return informNm;
    }

    /**
     * �J�[�g�����QB_�y�j�x�� .���擾���܂��B
     * 
     * @return �J�[�g�����QB_�y�j�x�� .
     */
    public String getKartCharge2bHoliday() {
        return kartCharge2bHoliday;
    }

    /**
     * �J�[�g�����QB_���� .���擾���܂��B
     * 
     * @return �J�[�g�����QB_���� .
     */
    public String getKartCharge2bWeekday() {
        return kartCharge2bWeekday;
    }

    /**
     * �J�[�g�����RB_�y�j�x�� .���擾���܂��B
     * 
     * @return �J�[�g�����RB_�y�j�x�� .
     */
    public String getKartCharge3bHoliday() {
        return kartCharge3bHoliday;
    }

    /**
     * �J�[�g�����RB_���� .���擾���܂��B
     * 
     * @return �J�[�g�����RB_���� .
     */
    public String getKartCharge3bWeekday() {
        return kartCharge3bWeekday;
    }

    /**
     * �J�[�g�����SB_�y�j�x�� .���擾���܂��B
     * 
     * @return �J�[�g�����SB_�y�j�x�� .
     */
    public String getKartCharge4bHoliday() {
        return kartCharge4bHoliday;
    }

    /**
     * �J�[�g�����SB_���� .���擾���܂��B
     * 
     * @return �J�[�g�����SB_���� .
     */
    public String getKartCharge4bWeekday() {
        return kartCharge4bWeekday;
    }

    /**
     * �J�[�g�����敪 .���擾���܂��B
     * 
     * @return �J�[�g�����敪 .
     */
    public String getKartChargeDiv() {
        return kartChargeDiv;
    }

    /**
     * ��d���� .���擾���܂��B
     * 
     * @return ��d���� .
     */
    public String getLiquidateDay() {
        return liquidateDay;
    }

    /**
     * ��d���ʒm���@�p�� .���擾���܂��B
     * 
     * @return ��d���ʒm���@�p�� .
     */
    public String getLiquidateInformFlg() {
        return liquidateInformFlg;
    }

    /**
     * ��d�������i�����ݒ莞�j���擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j
     */
    public String getLiquidateTime() {
        return liquidateTime;
    }

    /**
     * ��d�������i�����ݒ莞�j�i���j���擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j�i���j
     */
    public String getLiquidateTimeHour() {
        return liquidateTimeHour;
    }

    /**
     * ��d�������i�����ݒ莞�j�i���j���擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j�i���j
     */
    public String getLiquidateTimeMinute() {
        return liquidateTimeMinute;
    }

    /**
     * �}���\���ԊJ�n .���擾���܂��B
     * 
     * @return �}���\���ԊJ�n .
     */
    public String getMeetTimeBegin() {
        return meetTimeBegin;
    }

    /**
     * �}���\���ԊJ�n .���擾���܂��B
     * 
     * @return �}���\���ԊJ�n .
     */
    public String getMeetTimeBeginH() {
        return meetTimeBeginH;
    }

    /**
     * �}���\���ԊJ�n�� .���擾���܂��B
     * 
     * @return �}���\���ԊJ�n�� .
     */
    public String getMeetTimeBeginM() {
        return meetTimeBeginM;
    }

    /**
     * �}���\���ԏI���� .���擾���܂��B
     * 
     * @return �}���\���ԏI���� .
     */
    public String getMeetTimeEnd() {
        return meetTimeEnd;

    }

    /**
     * �}���\���ԏI���� .���擾���܂��B
     * 
     * @return �}���\���ԏI���� .
     */
    public String getMeetTimeEndH() {
        return meetTimeEndH;
    }

    /**
     * �}���\���ԏI���� .���擾���܂��B
     * 
     * @return �}���\���ԏI���� .
     */
    public String getMeetTimeEndM() {
        return meetTimeEndM;
    }

    /**
     * �}���\���ԗL�� .���擾���܂��B
     * 
     * @return �}���\���ԗL�� .
     */
    public String getMeetTimeFlg() {
        return meetTimeFlg;
    }

    /**
     * ���l���擾���܂��B
     * 
     * @return ���l
     */
    public String getMemo() {
        return memo;
    }

    /**
     * ���}�敪 .���擾���܂��B
     * 
     * @return ���}�敪 .
     */
    public String getMsDiv() {
        return msDiv;
    }

    /**
     * ���}�L�� .���擾���܂��B
     * 
     * @return ���}�L�� .
     */
    public String getMsFlg() {
        return msFlg;
    }

    /**
     * ���}���l .���擾���܂��B
     * 
     * @return ���}���l .
     */
    public String getMsMemo() {
        return msMemo;
    }

    /**
     * ���}�̏��� .���擾���܂��B
     * 
     * @return ���}�̏��� .
     */
    public String getMsTerm() {
        return msTerm;
    }

    /**
     * �ԗ��p���� .���擾���܂��B
     * 
     * @return �ԗ��p���� .
     */
    public String getNationalRoadway() {
        return nationalRoadway;
    }

    /**
     * �i�q�E���S�Ċ���H .���擾���܂��B
     * 
     * @return �i�q�E���S�Ċ���H .
     */
    public String getNearestRoute() {
        return nearestRoute;
    }

    /**
     * �i�q�E���S�Ċ�w .���擾���܂��B
     * 
     * @return �i�q�E���S�Ċ�w .
     */
    public String getNearestStation() {
        return nearestStation;
    }

    /**
     * �V���g���o�X�Ŋ�w�������P .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������P .
     */
    public String getNearestStationDepart1() {
        return nearestStationDepart1;
    }

    /**
     * �V���g���o�X�Ŋ�w�������Q .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������Q .
     */
    public String getNearestStationDepart2() {
        return nearestStationDepart2;
    }

    /**
     * �V���g���o�X�Ŋ�w�������R .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������R .
     */
    public String getNearestStationDepart3() {
        return nearestStationDepart3;

    }

    /**
     * �V���g���o�X�Ŋ�w������1 .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w������1 .
     */
    public String getNearestStationDepartH1() {
        return nearestStationDepartH1;
    }

    /**
     * �V���g���o�X�Ŋ�w�������Q .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������Q .
     */
    public String getNearestStationDepartH2() {
        return nearestStationDepartH2;
    }

    /**
     * �V���g���o�X�Ŋ�w�������R .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������R .
     */
    public String getNearestStationDepartH3() {
        return nearestStationDepartH3;

    }

    /**
     * �V���g���o�X�Ŋ�w�������P .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������P .
     */
    public String getNearestStationDepartM1() {
        return nearestStationDepartM1;
    }

    /**
     * �V���g���o�X�Ŋ�w�������Q .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������Q .
     */
    public String getNearestStationDepartM2() {
        return nearestStationDepartM2;
    }

    /**
     * �V���g���o�X�Ŋ�w�������R .���擾���܂��B
     * 
     * @return �V���g���o�X�Ŋ�w�������R .
     */
    public String getNearestStationDepartM3() {
        return nearestStationDepartM3;
    }

    /**
     * 1�������t���O.���擾���܂��B
     * 
     * @return 1�������t���O.
     */
    public String getOnePersonFlg() {
        return onePersonFlg;
    }

    /**
     * ��\�Җ� .���擾���܂��B
     * 
     * @return ��\�Җ� .
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * �D���o�͎w��L�� .���擾���܂��B
     * 
     * @return �D���o�͎w��L�� .
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
    }

    /**
     * �L���f�B�t�v���[�� .���擾���܂��B
     * 
     * @return �L���f�B�t�v���[�� .
     */
    public String getPlayWithCaddieFlg() {
        return playWithCaddieFlg;
    }

    /**
     * �s���{���R�[�h .���擾���܂��B
     * 
     * @return �s���{���R�[�h .
     */
    public String getPrefecturesCd() {
        return prefecturesCd;
    }

    /**
     * �n��R�[�h .���擾���܂��B
     * 
     * @return �n��R�[�h .
     */
    public String getRegionCd() {
        return regionCd;
    }

    /**
     * �v�\��R�����g .���擾���܂��B
     * 
     * @return �v�\��R�����g .
     */
    public String getReserveCmt() {
        return reserveCmt;
    }

    /**
     * �v�\��L�� .���擾���܂��B
     * 
     * @return �v�\��L�� .
     */
    public String getReserveFlg() {
        return reserveFlg;
    }

    /**
     * �\��ʒm���@�p�� .���擾���܂��B
     * 
     * @return �\��ʒm���@�p�� .
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * �Z�[���X�|�C���g .���擾���܂��B
     * 
     * @return �Z�[���X�|�C���g .
     */
    public String getSalesPoint() {
        return salesPoint;
    }

    /**
     * �Z���t�v���[�QB .���擾���܂��B
     * 
     * @return �Z���t�v���[�QB .
     */
    public String getSelfPlay2b() {
        return selfPlay2b;
    }

    /**
     * �Z���t�v���[�RB .���擾���܂��B
     * 
     * @return �Z���t�v���[�RB .
     */
    public String getSelfPlay3b() {
        return selfPlay3b;
    }

    /**
     * �Z���t�v���[�SB .���擾���܂��B
     * 
     * @return �Z���t�v���[�SB .
     */
    public String getSelfPlay4b() {
        return selfPlay4b;
    }

    /**
     * �Z���t�v���[�敪 .���擾���܂��B
     * 
     * @return �Z���t�v���[�敪 .
     */
    public String getSelfPlayDiv() {
        return selfPlayDiv;
    }

    /**
     * �Z���t�v���[�� .���擾���܂��B
     * 
     * @return �Z���t�v���[�� .
     */
    public String getSelfPlayFlg() {
        return selfPlayFlg;
    }

    /**
     * ����\���ԊJ�n .���擾���܂��B
     * 
     * @return ����\���ԊJ�n .
     */
    public String getSendTimeBegin() {
        return sendTimeBegin;
    }

    /**
     * ����\���ԊJ�n�� .���擾���܂��B
     * 
     * @return ����\���ԊJ�n�� .
     */
    public String getSendTimeBeginH() {
        return sendTimeBeginH;
    }

    /**
     * ����\���ԊJ�n�� .���擾���܂��B
     * 
     * @return ����\���ԊJ�n�� .
     */
    public String getSendTimeBeginM() {
        return sendTimeBeginM;

    }

    /**
     * ����\���ԏI�� .���擾���܂��B
     * 
     * @return ����\���ԏI�� .
     */
    public String getSendTimeEnd() {
        return sendTimeEnd;
    }

    /**
     * ����\���ԏI���� .���擾���܂��B
     * 
     * @return ����\���ԏI���� .
     */
    public String getSendTimeEndH() {
        return sendTimeEndH;
    }

    /**
     * ����\���ԏI���� .���擾���܂��B
     * 
     * @return ����\���ԏI���� .
     */
    public String getSendTimeEndM() {
        return sendTimeEndM;
    }

    /**
     * ����\���ԗL�� .���擾���܂��B
     * 
     * @return ����\���ԗL�� .
     */
    public String getSendTimeFlg() {
        return sendTimeFlg;
    }

    /**
     * �V�j�A�N��From .���擾���܂��B
     * 
     * @return �V�j�A�N��From .
     */
    public String getSeniorAgeFrom() {
        return seniorAgeFrom;
    }

    /**
     * �V���g���o�X�\��R�����g .���擾���܂��B
     * 
     * @return �V���g���o�X�\��R�����g .
     */
    public String getShuttleBusBookCmt() {
        return shuttleBusBookCmt;
    }

    /**
     * �V���g���o�X�\��L�� .���擾���܂��B
     * 
     * @return �V���g���o�X�\��L�� .
     */
    public String getShuttleBusBookFlg() {
        return shuttleBusBookFlg;
    }

    /**
     * �V���g���o�X�L�� .���擾���܂��B
     * 
     * @return �V���g���o�X�L�� .
     */
    public String getShuttleBusFlg() {
        return shuttleBusFlg;
    }

    /**
     * �V���g���o�X�^�s���l .���擾���܂��B
     * 
     * @return �V���g���o�X�^�s���l .
     */
    public String getShuttleBusMemo() {
        return shuttleBusMemo;
    }

    /**
     * �X�^�[�g�R�[�X .���擾���܂��B
     * 
     * @return �X�^�[�g�R�[�X .
     */
    public String getStartCourse() {
        return startCourse;
    }

    /**
     * �X�^�[�g���� .���擾���܂��B
     * 
     * @return �X�^�[�g���� .
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * �X�^�[�g�� .���擾���܂��B
     * 
     * @return �X�^�[�g�� .
     */
    public String getStartTimeH() {
        return startTimeH;
    }

    /**
     * �X�^�[�g���@.���擾���܂��B
     * 
     * @return �X�^�[�g���@.
     */
    public String getStartTimeM() {
        return startTimeM;
    }

    /**
     * JR�Ǝ��S�̋敪.���擾���܂��B
     * 
     * @return JR�Ǝ��S�̋敪.
     */
    public String getStationDiv() {
        return stationDiv;
    }

    /**
     * �Z���i�݌Ɂj���擾���܂��B
     * 
     * @return �Z���i�݌Ɂj
     */
    public String getStockAddr() {
        return stockAddr;
    }

    /**
     * �݌ɐ����t���O .���擾���܂��B
     * 
     * @return �݌ɐ����t���O .
     */
    public String getStockControlFlg() {
        return stockControlFlg;
    }

    /**
     * �݌ɖ��́i�J�i�j���擾���܂��B
     * 
     * @return stockKana �݌ɖ��́i�J�i�j
     */
    public String getStockKana() {
        return stockKana;
    }

    /**
     * �݌ɖ��́i�����j���擾���܂��B
     * 
     * @return �݌ɖ��́i�����j
     */
    public String getStockKanj() {
        return stockKanj;
    }

    /**
     * �݌ɊǗ����@���擾���܂��B
     * 
     * @return �݌ɊǗ����@
     */
    public String getStockManagement() {
        return stockManagement;
    }

    /**
     * �݌ɔԍ� .���擾���܂��B
     * 
     * @return �݌ɔԍ� .
     */
    public String getStockNo() {
        return stockNo;
    }

    /**
     * �X�֔ԍ��i�݌Ɂj���擾���܂��B
     * 
     * @return �X�֔ԍ��i�݌Ɂj
     */
    public String getStockPostCd() {
        return stockPostCd;
    }

    /**
     * �d�b�ԍ��i�݌Ɂj���擾���܂��B
     * 
     * @return �d�b�ԍ��i�݌Ɂj
     */
    public String getStockTel() {
        return stockTel;
    }

    /**
     * �݌ɒP�ʂ��擾���܂��B
     * 
     * @return �݌ɒP��
     */
    public String getStockUnit() {
        return stockUnit;
    }

    /**
     * �^�N�V�[���� .���擾���܂��B
     * 
     * @return �^�N�V�[���� .
     */
    public String getTaxiTime() {
        return taxiTime;
    }

    /**
     * �񋟊��ԏI���� .���擾���܂��B
     * 
     * @return �񋟊��ԏI���� .
     */
    @Override
    public String getTermEndD() {
        return termEndD;
    }

    /**
     * �񋟊��ԏI���� .���擾���܂��B
     * 
     * @return �񋟊��ԏI���� .
     */
    @Override
    public String getTermEndM() {
        return termEndM;
    }

    /**
     * �񋟊��ԏI���N .���擾���܂��B
     * 
     * @return �񋟊��ԏI���N .
     */
    @Override
    public String getTermEndY() {
        return termEndY;
    }

    /**
     * �񋟊��ԏI���N���� .���擾���܂��B
     * 
     * @return �񋟊��ԏI���N���� .
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * �񋟊��ԊJ�n�� .���擾���܂��B
     * 
     * @return �񋟊��ԊJ�n�� .
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * �񋟊��ԊJ�n�� .���擾���܂��B
     * 
     * @return �񋟊��ԊJ�n�� .
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * �񋟊��ԊJ�n�N .���擾���܂��B
     * 
     * @return �񋟊��ԊJ�n�N .
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * �񋟊��ԊJ�n�N���� .���擾���܂��B
     * 
     * @return �񋟊��ԊJ�n�N���� .
     */
    public String getTermFromYmd() {
        return termFromYmd;
    }

    /**
     * �o�X����k������ .���擾���܂��B
     * 
     * @return �o�X����k������ .
     */
    public String getToBusStaTime() {
        return toBusStaTime;
    }

    /**
     * �w���k������ .���擾���܂��B
     * 
     * @return �w���k������ .
     */
    public String getToStationWalktime() {
        return toStationWalktime;
    }

    /**
     * �L������ .���擾���܂��B
     * 
     * @return �L������ .
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * �o�E�`���[���X�� .���擾���܂��B
     * 
     * @return �o�E�`���[���X�� .
     */
    public String getVoucherFlg() {
        return voucherFlg;
    }

    /**
     * �o�E�`���[���ē����i�����j .���擾���܂��B
     * 
     * @return �o�E�`���[���ē����i�����j .
     */
    public String getVoucherIntroKanji() {
        return voucherIntroKanji;
    }

    /**
     * @param accessIc
     *            The accessIc to set.
     */
    public void setAccessIc(String accessIc) {
        this.accessIc = accessIc;
    }

    /**
     * @param accessTime
     *            The accessTime to set.
     */
    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * �G���A�R�[�h .��ݒ肵�܂��B
     * 
     * @param areaCd
     *            �G���A�R�[�h .
     */
    public void setAreaCd(String areaCd) {
        this.areaCd = areaCd;
    }

    /**
     * �n��啪�ނ�ݒ肵�܂��B
     * 
     * @param areaDaiCd
     *            �n��啪��
     */
    public void setAreaDaiCd(String areaDaiCd) {
        this.areaDaiCd = areaDaiCd;
    }

    /**
     * �n�於�i�J�i�j��ݒ肵�܂��B
     * 
     * @param areaKana
     *            �n�於�i�J�i�j
     */
    public void setAreaKana(String areaKana) {
        this.areaKana = areaKana;
    }

    /**
     * �n�於��ݒ肵�܂��B
     * 
     * @param areaNm
     *            �n�於
     */
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    /**
     * �n�揬���ނ�ݒ肵�܂��B
     * 
     * @param areaShoCd
     *            �n�揬����
     */
    public void setAreaShoCd(String areaShoCd) {
        this.areaShoCd = areaShoCd;
    }

    /**
     * @param autoRoadway
     *            The autoRoadway to set.
     */
    public void setAutoRoadway(String autoRoadway) {
        this.autoRoadway = autoRoadway;
    }

    /**
     * @param availableDistance
     *            The availableDistance to set.
     */
    public void setAvailableDistance(String availableDistance) {
        this.availableDistance = availableDistance;
    }

    /**
     * @param bookKind
     *            The bookKind to set.
     */
    public void setBookKind(String bookKind) {
        this.bookKind = bookKind;
    }

    /**
     * @param bookPurpose
     *            The bookPurpose to set.
     */
    public void setBookPurpose(String bookPurpose) {
        this.bookPurpose = bookPurpose;
    }

    /**
     * @param busDestination
     *            The busDestination to set.
     */
    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    /**
     * @param bs
     *            The busStation to set.
     */
    public void setBusStation(String bs) {
        this.busStation = bs;
    }

    /**
     * @param busTimetable
     *            The busTimetable to set.
     */
    public void setBusTimetable(String busTimetable) {
        this.busTimetable = busTimetable;
    }

    /**
     * �L���f�B�����QB_�y�j�x�� .��ݒ肵�܂��B
     * 
     * @param caddieCharge2bHoliday
     *            �L���f�B�����QB_�y�j�x�� .
     */
    public void setCaddieCharge2bHoliday(String caddieCharge2bHoliday) {
        this.caddieCharge2bHoliday = caddieCharge2bHoliday;
    }

    /**
     * �L���f�B�����QB_���� .��ݒ肵�܂��B
     * 
     * @param caddieCharge2bWeekday
     *            �L���f�B�����QB_���� .
     */
    public void setCaddieCharge2bWeekday(String caddieCharge2bWeekday) {
        this.caddieCharge2bWeekday = caddieCharge2bWeekday;
    }

    /**
     * �L���f�B�����RB_�y�j�x�� .��ݒ肵�܂��B
     * 
     * @param caddieCharge3bHoliday
     *            �L���f�B�����RB_�y�j�x�� .
     */
    public void setCaddieCharge3bHoliday(String caddieCharge3bHoliday) {
        this.caddieCharge3bHoliday = caddieCharge3bHoliday;
    }

    /**
     * �L���f�B�����RB_���� .��ݒ肵�܂��B
     * 
     * @param caddieCharge3bWeekday
     *            �L���f�B�����RB_���� .
     */
    public void setCaddieCharge3bWeekday(String caddieCharge3bWeekday) {
        this.caddieCharge3bWeekday = caddieCharge3bWeekday;
    }

    /**
     * �L���f�B�����SB_�y�j�x�� .��ݒ肵�܂��B
     * 
     * @param caddieCharge4bHoliday
     *            �L���f�B�����SB_�y�j�x�� .
     */
    public void setCaddieCharge4bHoliday(String caddieCharge4bHoliday) {
        this.caddieCharge4bHoliday = caddieCharge4bHoliday;
    }

    /**
     * �L���f�B�����SB_���� .��ݒ肵�܂��B
     * 
     * @param caddieCharge4bWeekday
     *            �L���f�B�����SB_���� .
     */
    public void setCaddieCharge4bWeekday(String caddieCharge4bWeekday) {
        this.caddieCharge4bWeekday = caddieCharge4bWeekday;
    }

    /**
     * @param caddieChargeDiv
     *            The caddieChargeDiv to set.
     */
    public void setCaddieChargeDiv(String caddieChargeDiv) {
        this.caddieChargeDiv = caddieChargeDiv;
    }

    /**
     * �����P�ʋ敪 .��ݒ肵�܂��B
     * 
     * @param chargeDiv
     *            �����P�ʋ敪 .
     */
    public void setChargeDiv(String chargeDiv) {
        this.chargeDiv = chargeDiv;
    }

    /**
     * @param contactFlg
     *            The contactFlg to set.
     */
    public void setContactFlg(String contactFlg) {
        this.contactFlg = contactFlg;
    }

    /**
     * @param countyRoadway
     *            The countyRoadway to set.
     */
    public void setCountyRoadway(String countyRoadway) {
        this.countyRoadway = countyRoadway;
    }

    /**
     * @param courseDistance1
     *            The courseDistance1 to set.
     */
    public void setCourseDistance1(String courseDistance1) {
        this.courseDistance1 = courseDistance1;
    }

    /**
     * @param courseDistance2
     *            The courseDistance2 to set.
     */
    public void setCourseDistance2(String courseDistance2) {
        this.courseDistance2 = courseDistance2;
    }

    /**
     * @param courseDistance3
     *            The courseDistance3 to set.
     */
    public void setCourseDistance3(String courseDistance3) {
        this.courseDistance3 = courseDistance3;
    }

    /**
     * @param courseDistance4
     *            The courseDistance4 to set.
     */
    public void setCourseDistance4(String courseDistance4) {
        this.courseDistance4 = courseDistance4;
    }

    /**
     * @param courseHole1
     *            The courseHole1 to set.
     */
    public void setCourseHole1(String courseHole1) {
        this.courseHole1 = courseHole1;
    }

    /**
     * @param courseHole2
     *            The courseHole2 to set.
     */
    public void setCourseHole2(String courseHole2) {
        this.courseHole2 = courseHole2;
    }

    /**
     * @param courseHole3
     *            The courseHole3 to set.
     */
    public void setCourseHole3(String courseHole3) {
        this.courseHole3 = courseHole3;
    }

    /**
     * @param courseHole4
     *            The courseHole4 to set.
     */
    public void setCourseHole4(String courseHole4) {
        this.courseHole4 = courseHole4;
    }

    /**
     * @param courseName1
     *            The courseName1 to set.
     */
    public void setCourseName1(String courseName1) {
        this.courseName1 = courseName1;
    }

    /**
     * @param courseName2
     *            The courseName2 to set.
     */
    public void setCourseName2(String courseName2) {
        this.courseName2 = courseName2;
    }

    /**
     * @param courseName3
     *            The courseName3 to set.
     */
    public void setCourseName3(String courseName3) {
        this.courseName3 = courseName3;
    }

    /**
     * @param courseName4
     *            The courseName4 to set.
     */
    public void setCourseName4(String courseName4) {
        this.courseName4 = courseName4;
    }

    /**
     * @param coursePar1
     *            The coursePar1 to set.
     */
    public void setCoursePar1(String coursePar1) {
        this.coursePar1 = coursePar1;
    }

    /**
     * @param coursePar2
     *            The coursePar2 to set.
     */
    public void setCoursePar2(String coursePar2) {
        this.coursePar2 = coursePar2;
    }

    /**
     * @param coursePar3
     *            The coursePar3 to set.
     */
    public void setCoursePar3(String coursePar3) {
        this.coursePar3 = coursePar3;
    }

    /**
     * @param coursePar4
     *            The coursePar4 to set.
     */
    public void setCoursePar4(String coursePar4) {
        this.coursePar4 = coursePar4;
    }

    /**
     * @param customerMsFlg
     *            The customerMsFlg to set.
     */
    public void setCustomerMsFlg(String customerMsFlg) {
        this.customerMsFlg = customerMsFlg;
    }

    /**
     * @param dealFee
     *            The dealFee to set.
     */
    public void setDealFee(String dealFee) {
        this.dealFee = dealFee;
    }

    /**
     * @param dealFeeFlg
     *            The dealFeeFlg to set.
     */
    public void setDealFeeFlg(String dealFeeFlg) {
        this.dealFeeFlg = dealFeeFlg;
    }

    /**
     * @param dealFeeType
     *            The dealFeeType to set.
     */
    public void setDealFeeType(String dealFeeType) {
        this.dealFeeType = dealFeeType;
    }

    /**
     * @param exceptDate
     *            The exceptDate to set.
     */
    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    /**
     * @param facilityAddr
     *            The facilityAddr to set.
     */
    public void setFacilityAddr(String facilityAddr) {
        this.facilityAddr = facilityAddr;
    }

    /**
     * @param facilityFax
     *            The facilityFax to set.
     */
    public void setFacilityFax(String facilityFax) {
        this.facilityFax = facilityFax;
    }

    /**
     * @param facilityPostCd
     *            The facilityPostCd to set.
     */
    public void setFacilityPostCd(String facilityPostCd) {
        this.facilityPostCd = facilityPostCd;
    }

    /**
     * @param facilityTel
     *            The facilityTel to set.
     */
    public void setFacilityTel(String facilityTel) {
        this.facilityTel = facilityTel;
    }

    /**
     * @param freelyColumn
     *            The freelyColumn to set.
     */
    public void setFreelyColumn(String freelyColumn) {
        this.freelyColumn = freelyColumn;
    }

    /**
     * @param genreralRoadway
     *            The genreralRoadway to set.
     */
    public void setGenreralRoadway(String genreralRoadway) {
        this.genreralRoadway = genreralRoadway;
    }

    /**
     * @param golfSpotDepart1
     *            The golfSpotDepart1 to set.
     */
    public void setGolfSpotDepart1(String golfSpotDepart1) {
        this.golfSpotDepart1 = golfSpotDepart1;
        if (!StringUtil.isEmpty(this.golfSpotDepart1)) {
            this.golfSpotDepartH1 = golfSpotDepart1.substring(0, 2);
            this.golfSpotDepartM1 = golfSpotDepart1.substring(2, 4);
        } else {
            this.golfSpotDepartH1 = "";
            this.golfSpotDepartM1 = "";
        }
    }

    /**
     * @param golfSpotDepart2
     *            The golfSpotDepart2 to set.
     */
    public void setGolfSpotDepart2(String golfSpotDepart2) {
        this.golfSpotDepart2 = golfSpotDepart2;
        if (!StringUtil.isEmpty(this.golfSpotDepart2)) {
            this.golfSpotDepartH2 = golfSpotDepart2.substring(0, 2);
            this.golfSpotDepartM2 = golfSpotDepart2.substring(2, 4);
        } else {
            this.golfSpotDepartH2 = "";
            this.golfSpotDepartM2 = "";
        }
    }

    /**
     * @param golfSpotDepart3
     *            The golfSpotDepart3 to set.
     */
    public void setGolfSpotDepart3(String golfSpotDepart3) {
        this.golfSpotDepart3 = golfSpotDepart3;
        if (!StringUtil.isEmpty(this.golfSpotDepart3)) {
            this.golfSpotDepartH3 = golfSpotDepart3.substring(0, 2);
            this.golfSpotDepartM3 = golfSpotDepart3.substring(2, 4);
        } else {
            this.golfSpotDepartH3 = "";
            this.golfSpotDepartM3 = "";
        }
    }

    /**
     * @param golfSpotDepartH1
     *            The golfSpotDepartH1 to set.
     */
    public void setGolfSpotDepartH1(String golfSpotDepartH1) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartH1)) {
            this.golfSpotDepartH1 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartH1).trim(), 2, '0');
        } else {
            this.golfSpotDepartH1 = golfSpotDepartH1;
        }

    }

    /**
     * @param golfSpotDepartH2
     *            The golfSpotDepartH2 to set.
     */
    public void setGolfSpotDepartH2(String golfSpotDepartH2) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartH2)) {
            this.golfSpotDepartH2 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartH2).trim(), 2, '0');
        } else {
            this.golfSpotDepartH2 = golfSpotDepartH2;
        }
    }

    /**
     * @param golfSpotDepartH3
     *            The golfSpotDepartH3 to set.
     */
    public void setGolfSpotDepartH3(String golfSpotDepartH3) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartH3)) {
            this.golfSpotDepartH3 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartH3).trim(), 2, '0');
        } else {
            this.golfSpotDepartH3 = golfSpotDepartH3;
        }

    }

    /**
     * @param golfSpotDepartM1
     *            The golfSpotDepartM1 to set.
     */
    public void setGolfSpotDepartM1(String golfSpotDepartM1) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartM1)) {
            this.golfSpotDepartM1 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartM1).trim(), 2, '0');
        } else {
            this.golfSpotDepartM1 = golfSpotDepartM1;
        }

    }

    /**
     * @param golfSpotDepartM2
     *            The golfSpotDepartM2 to set.
     */
    public void setGolfSpotDepartM2(String golfSpotDepartM2) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartM2)) {
            this.golfSpotDepartM2 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartM2).trim(), 2, '0');
        } else {
            this.golfSpotDepartM2 = golfSpotDepartM2;
        }

    }

    /**
     * @param golfSpotDepartM3
     *            The golfSpotDepartM3 to set.
     */
    public void setGolfSpotDepartM3(String golfSpotDepartM3) {
        if (DKikakuWebUtil.isNumber(golfSpotDepartM3)) {
            this.golfSpotDepartM3 = StringUtil.lpad(
                    StringUtil.toHalf(golfSpotDepartM3).trim(), 2, '0');
        } else {
            this.golfSpotDepartM3 = golfSpotDepartM3;
        }

    }

    /**
     * ���ރR�[�h .��ݒ肵�܂��B
     * 
     * @param goodsKindCd
     *            ���ރR�[�h .
     */
    public void setGoodsKindCd(String goodsKindCd) {
        this.goodsKindCd = goodsKindCd;
    }

    /**
     * @param highway
     *            The highway to set.
     */
    public void setHighway(String highway) {
        this.highway = highway;
    }

    /**
     * �ʒm��n�於��ݒ肵�܂��B
     * 
     * @param informAreaNm
     *            �ʒm��n�於
     */
    public void setInformAreaNm(String informAreaNm) {
        this.informAreaNm = informAreaNm;
    }

    /**
     * @param informFax
     *            The informFax to set.
     */
    public void setInformFax(String informFax) {
        this.informFax = informFax;
    }

    /**
     * �ʒm�於��ݒ肵�܂��B
     * 
     * @param informNm
     *            �ʒm�於
     */
    public void setInformNm(String informNm) {
        this.informNm = informNm;
    }

    /**
     * �J�[�g�����QB_�y�j�x�� .��ݒ肵�܂��B
     * 
     * @param kartCharge2bHoliday
     *            �J�[�g�����QB_�y�j�x�� .
     */
    public void setKartCharge2bHoliday(String kartCharge2bHoliday) {
        this.kartCharge2bHoliday = kartCharge2bHoliday;
    }

    /**
     * �J�[�g�����QB_���� .��ݒ肵�܂��B
     * 
     * @param kartCharge2bWeekday
     *            �J�[�g�����QB_���� .
     */
    public void setKartCharge2bWeekday(String kartCharge2bWeekday) {
        this.kartCharge2bWeekday = kartCharge2bWeekday;
    }

    /**
     * �J�[�g�����RB_�y�j�x�� .��ݒ肵�܂��B
     * 
     * @param kartCharge3bHoliday
     *            �J�[�g�����RB_�y�j�x�� .
     */
    public void setKartCharge3bHoliday(String kartCharge3bHoliday) {
        this.kartCharge3bHoliday = kartCharge3bHoliday;
    }

    /**
     * �J�[�g�����RB_���� .��ݒ肵�܂��B
     * 
     * @param kartCharge3bWeekday
     *            �J�[�g�����RB_���� .
     */
    public void setKartCharge3bWeekday(String kartCharge3bWeekday) {
        this.kartCharge3bWeekday = kartCharge3bWeekday;
    }

    /**
     * �J�[�g�����SB_�y�j�x�� .��ݒ肵�܂��B
     * 
     * @param kartCharge4bHoliday
     *            �J�[�g�����SB_�y�j�x�� .
     */
    public void setKartCharge4bHoliday(String kartCharge4bHoliday) {
        this.kartCharge4bHoliday = kartCharge4bHoliday;
    }

    /**
     * �J�[�g�����SB_���� .��ݒ肵�܂��B
     * 
     * @param kartCharge4bWeekday
     *            �J�[�g�����SB_���� .
     */
    public void setKartCharge4bWeekday(String kartCharge4bWeekday) {
        this.kartCharge4bWeekday = kartCharge4bWeekday;
    }

    /**
     * �J�[�g�����敪 .��ݒ肵�܂��B
     * 
     * @param kartChargeDiv
     *            �J�[�g�����敪 .
     */
    public void setKartChargeDiv(String kartChargeDiv) {
        this.kartChargeDiv = kartChargeDiv;
    }

    /**
     * @param liquidateDay
     *            The liquidateDay to set.
     */
    public void setLiquidateDay(String liquidateDay) {
        this.liquidateDay = liquidateDay;
    }

    /**
     * @param liquidateInformFlg
     *            The liquidateInformFlg to set.
     */
    public void setLiquidateInformFlg(String liquidateInformFlg) {
        this.liquidateInformFlg = liquidateInformFlg;
    }

    /**
     * ��d�������i�����ݒ莞�j��ݒ肵�܂��B
     * 
     * @param liquidateTime
     *            ��d�������i�����ݒ莞�j
     */
    public void setLiquidateTime(String liquidateTime) {
        this.liquidateTime = liquidateTime;
    }

    /**
     * ��d�������i�����ݒ莞�j�i���j��ݒ肵�܂��B
     * 
     * @param liquidateTimeHour
     *            ��d�������i�����ݒ莞�j�i���j
     */
    public void setLiquidateTimeHour(String liquidateTimeHour) {
        this.liquidateTimeHour = liquidateTimeHour;
    }

    /**
     * ��d�������i�����ݒ莞�j�i���j��ݒ肵�܂��B
     * 
     * @param liquidateTimeMinute
     *            ��d�������i�����ݒ莞�j�i���j
     */
    public void setLiquidateTimeMinute(String liquidateTimeMinute) {
        this.liquidateTimeMinute = liquidateTimeMinute;
    }

    /**
     * @param meetTimeBegin
     *            The meetTimeBegin to set.
     */
    public void setMeetTimeBegin(String meetTimeBegin) {
        this.meetTimeBegin = meetTimeBegin;
        if (!StringUtil.isEmpty(this.meetTimeBegin)) {
            this.meetTimeBeginH = meetTimeBegin.substring(0, 2);
            this.meetTimeBeginM = meetTimeBegin.substring(2, 4);
        } else {
            this.meetTimeBeginH = "";
            this.meetTimeBeginM = "";
        }
    }

    /**
     * @param meetTimeBeginH
     *            The meetTimeBeginH to set.
     */
    public void setMeetTimeBeginH(String meetTimeBeginH) {
        if (DKikakuWebUtil.isNumber(meetTimeBeginH)) {
            this.meetTimeBeginH = StringUtil.lpad(
                    StringUtil.toHalf(meetTimeBeginH).trim(), 2, '0');
        } else {
            this.meetTimeBeginH = meetTimeBeginH;
        }

    }

    /**
     * @param meetTimeBeginM
     *            The meetTimeBeginM to set.
     */
    public void setMeetTimeBeginM(String meetTimeBeginM) {
        if (DKikakuWebUtil.isNumber(meetTimeBeginM)) {
            this.meetTimeBeginM = StringUtil.lpad(
                    StringUtil.toHalf(meetTimeBeginM).trim(), 2, '0');
        } else {
            this.meetTimeBeginM = meetTimeBeginM;
        }

    }

    /**
     * @param meetTimeEnd
     *            The meetTimeEnd to set.
     */
    public void setMeetTimeEnd(String meetTimeEnd) {
        this.meetTimeEnd = meetTimeEnd;
        if (!StringUtil.isEmpty(this.meetTimeEnd)) {
            this.meetTimeEndH = meetTimeEnd.substring(0, 2);
            this.meetTimeEndM = meetTimeEnd.substring(2, 4);
        } else {
            this.meetTimeEndH = "";
            this.meetTimeEndM = "";
        }
    }

    /**
     * @param meetTimeEndH
     *            The meetTimeEndH to set.
     */
    public void setMeetTimeEndH(String meetTimeEndH) {
        if (DKikakuWebUtil.isNumber(meetTimeEndH)) {
            this.meetTimeEndH = StringUtil.lpad(StringUtil.toHalf(meetTimeEndH)
                    .trim(), 2, '0');
        } else {
            this.meetTimeEndH = meetTimeEndH;
        }

    }

    /**
     * @param meetTimeEndM
     *            The meetTimeEndM to set.
     */
    public void setMeetTimeEndM(String meetTimeEndM) {
        if (DKikakuWebUtil.isNumber(meetTimeEndM)) {
            this.meetTimeEndM = StringUtil.lpad(StringUtil.toHalf(meetTimeEndM)
                    .trim(), 2, '0');
        } else {
            this.meetTimeEndM = meetTimeEndM;
        }

    }

    /**
     * @param meetTimeFlg
     *            The meetTimeFlg to set.
     */
    public void setMeetTimeFlg(String meetTimeFlg) {
        this.meetTimeFlg = meetTimeFlg;
    }

    /**
     * ���l��ݒ肵�܂��B
     * 
     * @param memo
     *            ���l
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @param msDiv
     *            The msDiv to set.
     */
    public void setMsDiv(String msDiv) {
        this.msDiv = msDiv;
    }

    /**
     * @param msFlg
     *            The msFlg to set.
     */
    public void setMsFlg(String msFlg) {
        this.msFlg = msFlg;
    }

    /**
     * @param msMemo
     *            The msMemo to set.
     */
    public void setMsMemo(String msMemo) {
        this.msMemo = msMemo;
    }

    /**
     * @param msTerm
     *            The msTerm to set.
     */
    public void setMsTerm(String msTerm) {
        this.msTerm = msTerm;
    }

    /**
     * @param nationalRoadway
     *            The nationalRoadway to set.
     */
    public void setNationalRoadway(String nationalRoadway) {
        this.nationalRoadway = nationalRoadway;
    }

    /**
     * @param nearestRoute
     *            The nearestRoute to set.
     */
    public void setNearestRoute(String nearestRoute) {
        this.nearestRoute = nearestRoute;
    }

    /**
     * @param nearestStation
     *            The nearestStation to set.
     */
    public void setNearestStation(String nearestStation) {
        this.nearestStation = nearestStation;
    }

    /**
     * @param nearestStationDepart1
     *            The nearestStationDepart1 to set.
     */
    public void setNearestStationDepart1(String nearestStationDepart1) {
        this.nearestStationDepart1 = nearestStationDepart1;
        if (!StringUtil.isEmpty(this.nearestStationDepart1)) {
            this.nearestStationDepartH1 = nearestStationDepart1.substring(0, 2);
            this.nearestStationDepartM1 = nearestStationDepart1.substring(2, 4);
        } else {
            this.nearestStationDepartH1 = "";
            this.nearestStationDepartM1 = "";
        }
    }

    /**
     * @param nearestStationDepart2
     *            The nearestStationDepart2 to set.
     */
    public void setNearestStationDepart2(String nearestStationDepart2) {
        this.nearestStationDepart2 = nearestStationDepart2;
        if (!StringUtil.isEmpty(this.nearestStationDepart2)) {
            this.nearestStationDepartH2 = nearestStationDepart2.substring(0, 2);
            this.nearestStationDepartM2 = nearestStationDepart2.substring(2, 4);
        } else {
            this.nearestStationDepartH2 = "";
            this.nearestStationDepartM2 = "";
        }
    }

    /**
     * @param nearestStationDepart3
     *            The nearestStationDepart3 to set.
     */
    public void setNearestStationDepart3(String nearestStationDepart3) {
        this.nearestStationDepart3 = nearestStationDepart3;
        if (!StringUtil.isEmpty(this.nearestStationDepart3)) {
            this.nearestStationDepartH3 = nearestStationDepart3.substring(0, 2);
            this.nearestStationDepartM3 = nearestStationDepart3.substring(2, 4);
        } else {
            this.nearestStationDepartH3 = "";
            this.nearestStationDepartM3 = "";
        }
    }

    /**
     * @param nearestStationDepartH1
     *            The nearestStationDepartH1 to set.
     */
    public void setNearestStationDepartH1(String nearestStationDepartH1) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartH1)) {
            this.nearestStationDepartH1 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartH1).trim(), 2, '0');
        } else {
            this.nearestStationDepartH1 = nearestStationDepartH1;
        }

    }

    /**
     * @param nearestStationDepartH2
     *            The nearestStationDepartH2 to set.
     */
    public void setNearestStationDepartH2(String nearestStationDepartH2) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartH2)) {
            this.nearestStationDepartH2 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartH2).trim(), 2, '0');
        } else {
            this.nearestStationDepartH2 = nearestStationDepartH2;
        }
    }

    /**
     * @param nearestStationDepartH3
     *            The nearestStationDepartH3 to set.
     */
    public void setNearestStationDepartH3(String nearestStationDepartH3) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartH3)) {
            this.nearestStationDepartH3 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartH3).trim(), 2, '0');
        } else {
            this.nearestStationDepartH3 = nearestStationDepartH3;
        }

    }

    /**
     * @param nearestStationDepartM1
     *            The nearestStationDepartM1 to set.
     */
    public void setNearestStationDepartM1(String nearestStationDepartM1) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartM1)) {
            this.nearestStationDepartM1 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartM1).trim(), 2, '0');
        } else {
            this.nearestStationDepartM1 = nearestStationDepartM1;
        }
    }

    /**
     * @param nearestStationDepartM2
     *            The nearestStationDepartM2 to set.
     */
    public void setNearestStationDepartM2(String nearestStationDepartM2) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartM2)) {
            this.nearestStationDepartM2 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartM2).trim(), 2, '0');
        } else {
            this.nearestStationDepartM2 = nearestStationDepartM2;
        }

    }

    /**
     * @param nearestStationDepartM3
     *            The nearestStationDepartM3 to set.
     */
    public void setNearestStationDepartM3(String nearestStationDepartM3) {
        if (DKikakuWebUtil.isNumber(nearestStationDepartM3)) {
            this.nearestStationDepartM3 = StringUtil.lpad(
                    StringUtil.toHalf(nearestStationDepartM3).trim(), 2, '0');
        } else {
            this.nearestStationDepartM3 = nearestStationDepartM3;
        }

    }

    /**
     * @param onePersonFlg
     *            1�������t���O.
     */
    public void setOnePersonFlg(String onePersonFlg) {
        this.onePersonFlg = onePersonFlg;
    }

    /**
     * @param ownerNm
     *            The ownerNm to set.
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * �D���o�͎w��L�� .��ݒ肵�܂��B
     * 
     * @param personalTicketPrintFlg
     *            �D���o�͎w��L�� .
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
    }

    /**
     * @param playWithCaddieFlg
     *            The playWithCaddieFlg to set.
     */
    public void setPlayWithCaddieFlg(String playWithCaddieFlg) {
        this.playWithCaddieFlg = playWithCaddieFlg;
    }

    /**
     * �s���{���R�[�h .��ݒ肵�܂��B
     * 
     * @param prefecturesCd
     *            �s���{���R�[�h .
     */
    public void setPrefecturesCd(String prefecturesCd) {
        this.prefecturesCd = prefecturesCd;
    }

    /**
     * �n��R�[�h .��ݒ肵�܂��B
     * 
     * @param regionCd
     *            �n��R�[�h .
     */
    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    /**
     * @param reserveCmt
     *            The reserveCmt to set.
     */
    public void setReserveCmt(String reserveCmt) {
        this.reserveCmt = reserveCmt;
    }

    /**
     * @param reserveFlg
     *            The reserveFlg to set.
     */
    public void setReserveFlg(String reserveFlg) {
        this.reserveFlg = reserveFlg;
    }

    /**
     * �\��ʒm���@�p�� .��ݒ肵�܂��B
     * 
     * @param reserveInformWay
     *            �\��ʒm���@�p�� .
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * @param salesPoint
     *            The salesPoint to set.
     */
    public void setSalesPoint(String salesPoint) {
        this.salesPoint = salesPoint;
    }

    /**
     * @param selfPlay2b
     *            The selfPlay2b to set.
     */
    public void setSelfPlay2b(String selfPlay2b) {
        this.selfPlay2b = selfPlay2b;
    }

    /**
     * @param selfPlay3b
     *            The selfPlay3b to set.
     */
    public void setSelfPlay3b(String selfPlay3b) {
        this.selfPlay3b = selfPlay3b;
    }

    /**
     * @param selfPlay4b
     *            The selfPlay4b to set.
     */
    public void setSelfPlay4b(String selfPlay4b) {
        this.selfPlay4b = selfPlay4b;
    }

    /**
     * @param selfPlayDiv
     *            The selfPlayDiv to set.
     */
    public void setSelfPlayDiv(String selfPlayDiv) {
        this.selfPlayDiv = selfPlayDiv;
    }

    /**
     * @param selfPlayFlg
     *            The selfPlayFlg to set.
     */
    public void setSelfPlayFlg(String selfPlayFlg) {
        this.selfPlayFlg = selfPlayFlg;
    }

    /**
     * @param sendTimeBegin
     *            The sendTimeBegin to set.
     */
    public void setSendTimeBegin(String sendTimeBegin) {
        this.sendTimeBegin = sendTimeBegin;
        if (!StringUtil.isEmpty(this.sendTimeBegin)) {
            this.sendTimeBeginH = sendTimeBegin.substring(0, 2);
            this.sendTimeBeginM = sendTimeBegin.substring(2, 4);
        } else {
            this.sendTimeBeginH = "";
            this.sendTimeBeginM = "";
        }
    }

    /**
     * @param sendTimeBeginH
     *            The sendTimeBeginH to set.
     */
    public void setSendTimeBeginH(String sendTimeBeginH) {
        if (DKikakuWebUtil.isNumber(sendTimeBeginH)) {
            this.sendTimeBeginH = StringUtil.lpad(
                    StringUtil.toHalf(sendTimeBeginH).trim(), 2, '0');
        } else {
            this.sendTimeBeginH = sendTimeBeginH;
        }

    }

    /**
     * @param sendTimeBeginM
     *            The sendTimeBeginM to set.
     */
    public void setSendTimeBeginM(String sendTimeBeginM) {
        if (DKikakuWebUtil.isNumber(sendTimeBeginM)) {
            this.sendTimeBeginM = StringUtil.lpad(
                    StringUtil.toHalf(sendTimeBeginM).trim(), 2, '0');
        } else {
            this.sendTimeBeginM = sendTimeBeginM;
        }

    }

    /**
     * @param sendTimeEnd
     *            The sendTimeEnd to set.
     */
    public void setSendTimeEnd(String sendTimeEnd) {
        this.sendTimeEnd = sendTimeEnd;
        if (!StringUtil.isEmpty(this.sendTimeEnd)) {
            this.sendTimeEndH = sendTimeEnd.substring(0, 2);
            this.sendTimeEndM = sendTimeEnd.substring(2, 4);
        } else {
            this.sendTimeEndH = "";
            this.sendTimeEndM = "";
        }
    }

    /**
     * @param sendTimeEndH
     *            The sendTimeEndH to set.
     */
    public void setSendTimeEndH(String sendTimeEndH) {
        if (DKikakuWebUtil.isNumber(sendTimeEndH)) {
            this.sendTimeEndH = StringUtil.lpad(StringUtil.toHalf(sendTimeEndH)
                    .trim(), 2, '0');
        } else {
            this.sendTimeEndH = sendTimeEndH;
        }

    }

    /**
     * @param sendTimeEndM
     *            The sendTimeEndM to set.
     */
    public void setSendTimeEndM(String sendTimeEndM) {
        if (DKikakuWebUtil.isNumber(sendTimeEndM)) {
            this.sendTimeEndM = StringUtil.lpad(StringUtil.toHalf(sendTimeEndM)
                    .trim(), 2, '0');
        } else {
            this.sendTimeEndM = sendTimeEndM;
        }

    }

    /**
     * @param sendTimeFlg
     *            The sendTimeFlg to set.
     */
    public void setSendTimeFlg(String sendTimeFlg) {
        this.sendTimeFlg = sendTimeFlg;
    }

    /**
     * �V�j�A�N��From .��ݒ肵�܂��B
     * 
     * @param seniorAgeFrom
     *            �V�j�A�N��From .
     */
    public void setSeniorAgeFrom(String seniorAgeFrom) {
        this.seniorAgeFrom = seniorAgeFrom;
    }

    /**
     * @param shuttleBusBookCmt
     *            The shuttleBusBookCmt to set.
     */
    public void setShuttleBusBookCmt(String shuttleBusBookCmt) {
        this.shuttleBusBookCmt = shuttleBusBookCmt;
    }

    /**
     * @param shuttleBusBookFlg
     *            The shuttleBusBookFlg to set.
     */
    public void setShuttleBusBookFlg(String shuttleBusBookFlg) {
        this.shuttleBusBookFlg = shuttleBusBookFlg;
    }

    /**
     * @param shuttleBusFlg
     *            The shuttleBusFlg to set.
     */
    public void setShuttleBusFlg(String shuttleBusFlg) {
        this.shuttleBusFlg = shuttleBusFlg;
    }

    /**
     * @param shuttleBusMemo
     *            The shuttleBusMemo to set.
     */
    public void setShuttleBusMemo(String shuttleBusMemo) {
        this.shuttleBusMemo = shuttleBusMemo;
    }

    /**
     * @param startCourse
     *            The startCourse to set.
     */
    public void setStartCourse(String startCourse) {
        this.startCourse = startCourse;
    }

    /**
     * @param startTime
     *            The startTime to set.
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
        if (!StringUtil.isEmpty(this.startTime)) {
            this.startTimeH = startTime.substring(0, 2);
            this.startTimeM = startTime.substring(2, 4);
        } else {
            this.startTimeH = "";
            this.startTimeM = "";
        }
    }

    /**
     * @param startTimeH
     *            The startTimeH to set.
     */
    public void setStartTimeH(String startTimeH) {
        if (DKikakuWebUtil.isNumber(startTimeH)) {
            this.startTimeH = StringUtil.lpad(StringUtil.toHalf(startTimeH)
                    .trim(), 2, '0');
        } else {
            this.startTimeH = startTimeH;
        }
    }

    /**
     * @param startTimeM
     *            The startTimeM to set.
     */
    public void setStartTimeM(String startTimeM) {
        if (DKikakuWebUtil.isNumber(startTimeM)) {
            this.startTimeM = StringUtil.lpad(StringUtil.toHalf(startTimeM)
                    .trim(), 2, '0');
        } else {
            this.startTimeM = startTimeM;
        }
    }

    /**
     * @param stationDiv
     *            JR�Ǝ��S�̋敪
     */
    public void setStationDiv(String stationDiv) {
        this.stationDiv = stationDiv;
    }

    /**
     * �Z���i�݌Ɂj��ݒ肵�܂��B
     * 
     * @param stockAddr
     *            �Z���i�݌Ɂj
     */
    public void setStockAddr(String stockAddr) {
        this.stockAddr = stockAddr;
    }

    /**
     * �݌ɐ����t���O .��ݒ肵�܂��B
     * 
     * @param stockControlFlg
     *            �݌ɐ����t���O .
     */
    public void setStockControlFlg(String stockControlFlg) {
        this.stockControlFlg = stockControlFlg;
    }

    /**
     * �݌ɖ��́i�J�i�j��ݒ肵�܂��B
     * 
     * @param stockKana
     *            �݌ɖ��́i�J�i�j
     */
    public void setStockKana(String stockKana) {
        this.stockKana = stockKana;
    }

    /**
     * �݌ɖ��́i�����j��ݒ肵�܂��B
     * 
     * @param stockKanj
     *            �݌ɖ��́i�����j
     */
    public void setStockKanj(String stockKanj) {
        this.stockKanj = stockKanj;
    }

    /**
     * �݌ɊǗ����@��ݒ肵�܂��B
     * 
     * @param stockManagement
     *            �݌ɊǗ����@
     */
    public void setStockManagement(String stockManagement) {
        this.stockManagement = stockManagement;
    }

    /**
     * @param stockNo
     *            The stockNo to set.
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    /**
     * �X�֔ԍ��i�݌Ɂj��ݒ肵�܂��B
     * 
     * @param stockPostCd
     *            �X�֔ԍ��i�݌Ɂj
     */
    public void setStockPostCd(String stockPostCd) {
        this.stockPostCd = stockPostCd;
    }

    /**
     * �d�b�ԍ��i�݌Ɂj��ݒ肵�܂��B
     * 
     * @param stockTel
     *            �d�b�ԍ��i�݌Ɂj
     */
    public void setStockTel(String stockTel) {
        this.stockTel = stockTel;
    }

    /**
     * �݌ɒP�ʂ�ݒ肵�܂��B
     * 
     * @param stockUnit
     *            �݌ɒP��
     */
    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    /**
     * @param taxiTime
     *            The taxiTime to set.
     */
    public void setTaxiTime(String taxiTime) {
        this.taxiTime = taxiTime;
    }

    /**
     * @param termEndD
     *            The termEndD to set.
     */
    @Override
    public void setTermEndD(String termEndD) {
        if (DKikakuWebUtil.isNumber(termEndD)) {
            this.termEndD = StringUtil.lpad(StringUtil.toHalf(termEndD).trim(),
                    2, '0');
        } else {
            this.termEndD = termEndD;
        }

    }

    /**
     * @param termEndM
     *            The termEndM to set.
     */
    @Override
    public void setTermEndM(String termEndM) {
        if (DKikakuWebUtil.isNumber(termEndM)) {
            this.termEndM = StringUtil.lpad(StringUtil.toHalf(termEndM).trim(),
                    2, '0');
        } else {
            this.termEndM = termEndM;
        }
    }

    /**
     * @param termEndY
     *            The termEndY to set.
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = StringUtil.toHalf(termEndY);
    }

    /**
     * @param termEndYmd
     *            The termEndYmd to set.
     */
    public void setTermEndYmd(String termEndYmd) {
        this.termEndYmd = termEndYmd;
        if (!StringUtil.isEmpty(this.termEndYmd)) {
            this.termEndY = termEndYmd.substring(0, 4);
            this.termEndM = termEndYmd.substring(4, 6);
            this.termEndD = termEndYmd.substring(6, 8);
        } else {
            this.termEndY = "";
            this.termEndM = "";
            this.termEndD = "";
        }
    }

    /**
     * @param termFromD
     *            The termFromD to set.
     */
    @Override
    public void setTermFromD(String termFromD) {
        if (DKikakuWebUtil.isNumber(termFromD)) {
            this.termFromD = StringUtil.lpad(StringUtil.toHalf(termFromD)
                    .trim(), 2, '0');
        } else {
            this.termFromD = termFromD;
        }
    }

    /**
     * @param termFromM
     *            The termFromM to set.
     */
    @Override
    public void setTermFromM(String termFromM) {
        if (DKikakuWebUtil.isNumber(termFromM)) {
            this.termFromM = StringUtil.lpad(StringUtil.toHalf(termFromM)
                    .trim(), 2, '0');
        } else {
            this.termFromM = termFromM;
        }
    }

    /**
     * @param termFromY
     *            The termFromY to set.
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = StringUtil.toHalf(termFromY);
    }

    /**
     * @param termFromYmd
     *            The termFromYmd to set.
     */
    public void setTermFromYmd(String termFromYmd) {
        this.termFromYmd = termFromYmd;

        if (!StringUtil.isEmpty(this.termFromYmd)) {
            this.termFromY = termFromYmd.substring(0, 4);
            this.termFromM = termFromYmd.substring(4, 6);
            this.termFromD = termFromYmd.substring(6, 8);
        } else {
            this.termFromY = "";
            this.termFromM = "";
            this.termFromD = "";
        }
    }

    /**
     * @param toBusStaTime
     *            The toBusStaTime to set.
     */
    public void setToBusStaTime(String toBusStaTime) {
        this.toBusStaTime = toBusStaTime;
    }

    /**
     * @param toStationWalktime
     *            The toStationWalktime to set.
     */
    public void setToStationWalktime(String toStationWalktime) {
        this.toStationWalktime = toStationWalktime;
    }

    /**
     * �L������ .��ݒ肵�܂��B
     * 
     * @param validPeriod
     *            �L������ .
     */
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    /**
     * �o�E�`���[���X�� .��ݒ肵�܂��B
     * 
     * @param voucherFlg
     *            �o�E�`���[���X�� .
     */
    public void setVoucherFlg(String voucherFlg) {
        this.voucherFlg = voucherFlg;
    }

    /**
     * �o�E�`���[���ē����i�����j .��ݒ肵�܂��B
     * 
     * @param voucherIntroKanji
     *            �o�E�`���[���ē����i�����j .
     */
    public void setVoucherIntroKanji(String voucherIntroKanji) {
        this.voucherIntroKanji = voucherIntroKanji;
    }
}
