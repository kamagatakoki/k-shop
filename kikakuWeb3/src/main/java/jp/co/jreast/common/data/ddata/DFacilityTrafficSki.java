package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]�{��_��ʎ�i_�X�L�[ �G���e�B�e�B
 * 
 * <pre>
 *   �@�\�T�v �F 
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityTrafficSki implements FacilityManageBodyKey {

    /** �A�N�Z�X�P_�Ԏ��� */
    private String acCarTime1;

    /** �A�N�Z�X�Q_�Ԏ��� */
    private String acCarTime2;

    /** �A�N�Z�X�R_�Ԏ��� */
    private String acCarTime3;

    /** �A�N�Z�X�P_�}�����ԏI���i���ԁj */
    private String acMeetTimeEnd1Hour;

    /** �A�N�Z�X�P_�}�����ԏI���i���j */
    private String acMeetTimeEnd1Minute;

    /** �A�N�Z�X�Q_�}�����ԏI���i���ԁj */
    private String acMeetTimeEnd2Hour;

    /** �A�N�Z�X�Q_�}�����ԏI���i���j */
    private String acMeetTimeEnd2Minute;

    /** �A�N�Z�X�R_�}�����ԏI���i���ԁj */
    private String acMeetTimeEnd3Hour;

    /** �A�N�Z�X�R_�}�����ԏI���i���j */
    private String acMeetTimeEnd3Minute;

    /** �A�N�Z�X�P_�}�����ԗL�� */
    private String acMeetTimeFlg1;

    /** �A�N�Z�X�Q_�}�����ԗL�� */
    private String acMeetTimeFlg2;

    /** �A�N�Z�X�R_�}�����ԗL�� */
    private String acMeetTimeFlg3;

    /** �A�N�Z�X�P_�}�����ԊJ�n�i���ԁj */
    private String acMeetTimeStart1Hour;

    /** �A�N�Z�X�P_�}�����ԊJ�n�i���j */
    private String acMeetTimeStart1Minute;

    /** �A�N�Z�X�Q_�}�����ԊJ�n�i���ԁj */
    private String acMeetTimeStart2Hour;

    /** �A�N�Z�X�Q_�}�����ԊJ�n�i���j */
    private String acMeetTimeStart2Minute;

    /** �A�N�Z�X�R_�}�����ԊJ�n�i���ԁj */
    private String acMeetTimeStart3Hour;

    /** �A�N�Z�X�R_�}�����ԊJ�n�i���j */
    private String acMeetTimeStart3Minute;

    /** �A�N�Z�X�P_���}�敪 */
    private String acMsDiv1;

    /** �A�N�Z�X�Q_���}�敪 */
    private String acMsDiv2;

    /** �A�N�Z�X�R_���}�敪 */
    private String acMsDiv3;

    /** �A�N�Z�X�P_���}�\�� */
    private String acMsReserve1;

    /** �A�N�Z�X�Q_���}�\�� */
    private String acMsReserve2;

    /** �A�N�Z�X�R_���}�\�� */
    private String acMsReserve3;

    /** �A�N�Z�X�P_���}�\�񂻂̑� */
    private String acMsReserveCmt1;

    /** �A�N�Z�X�Q_���}�\�񂻂̑� */
    private String acMsReserveCmt2;

    /** �A�N�Z�X�R_���}�\�񂻂̑� */
    private String acMsReserveCmt3;

    /** �A�N�Z�X�P_���̑��R�����g */
    private String acOthersCmt1;

    /** �A�N�Z�X�Q_���̑��R�����g */
    private String acOthersCmt2;

    /** �A�N�Z�X�R_���̑��R�����g */
    private String acOthersCmt3;

    /** �A�N�Z�X�P_���̑��L�� */
    private String acOthersFlg1;

    /** �A�N�Z�X�Q_���̑��L�� */
    private String acOthersFlg2;

    /** �A�N�Z�X�R_���̑��L�� */
    private String acOthersFlg3;

    /** �A�N�Z�X�P_���̑� */
    private String acOtherTimeCmt1;

    /** �A�N�Z�X�Q_���̑� */
    private String acOtherTimeCmt2;

    /** �A�N�Z�X�R_���̑� */
    private String acOtherTimeCmt3;

    /** �A�N�Z�X�P_���莞�ԏI���i���ԁj */
    private String acSendTimeEnd1Hour;

    /** �A�N�Z�X�P_���莞�ԏI���i���j */
    private String acSendTimeEnd1Minute;

    /** �A�N�Z�X�Q_���莞�ԏI���i���ԁj */
    private String acSendTimeEnd2Hour;

    /** �A�N�Z�X�Q_���莞�ԏI���i���j */
    private String acSendTimeEnd2Minute;

    /** �A�N�Z�X�R_���莞�ԏI���i���ԁj */
    private String acSendTimeEnd3Hour;

    /** �A�N�Z�X�R_���莞�ԏI���i���j */
    private String acSendTimeEnd3Minute;

    /** �A�N�Z�X�P_���莞�ԗL�� */
    private String acSendTimeFlg1;

    /** �A�N�Z�X�Q_���莞�ԗL�� */
    private String acSendTimeFlg2;

    /** �A�N�Z�X�R_���莞�ԗL�� */
    private String acSendTimeFlg3;

    /** �A�N�Z�X�P_���莞�ԊJ�n�i���ԁj */
    private String acSendTimeStart1Hour;

    /** �A�N�Z�X�P_���莞�ԊJ�n�i���j */
    private String acSendTimeStart1Minute;

    /** �A�N�Z�X�Q_���莞�ԊJ�n�i���ԁj */
    private String acSendTimeStart2Hour;

    /** �A�N�Z�X�Q_���莞�ԊJ�n�i���j */
    private String acSendTimeStart2Minute;

    /** �A�N�Z�X�R_���莞�ԊJ�n�i���ԁj */
    private String acSendTimeStart3Hour;

    /** �A�N�Z�X�R_���莞�ԊJ�n�i���j */
    private String acSendTimeStart3Minute;

    /** �A�N�Z�X�P_���}�V���g���o�X�L�� */
    private String acShuttleBusFlg1;

    /** �A�N�Z�X�Q_���}�V���g���o�X�L�� */
    private String acShuttleBusFlg2;

    /** �A�N�Z�X�R_���}�V���g���o�X�L�� */
    private String acShuttleBusFlg3;

    /** �A�N�Z�X�P_�X�L�[�� */
    private String acSkiNm1;

    /** �A�N�Z�X�Q_�X�L�[�� */
    private String acSkiNm2;

    /** �A�N�Z�X�R_�X�L�[�� */
    private String acSkiNm3;

    /** �A�N�Z�X�P_�k������ */
    private String acWalkTime1;

    /** �A�N�Z�X�Q_�k������ */
    private String acWalkTime2;

    /** �A�N�Z�X�R_�k������ */
    private String acWalkTime3;

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �{�݃p�^�[�� */
    private String facilityPattern;

    /** �񓚏���� */
    private String kindFlg;

    /**
     * �A�N�Z�X�P_�Ԏ��Ԃ��擾���܂��B
     * 
     * @return �A�N�Z�X�P_�Ԏ���
     */
    public String getAcCarTime1() {
        return acCarTime1;
    }

    /**
     * �A�N�Z�X�Q_�Ԏ��Ԃ��擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�Ԏ���
     */
    public String getAcCarTime2() {
        return acCarTime2;
    }

    /**
     * �A�N�Z�X�R_�Ԏ��Ԃ��擾���܂��B
     * 
     * @return �A�N�Z�X�R_�Ԏ���
     */
    public String getAcCarTime3() {
        return acCarTime3;
    }

    /**
     * �A�N�Z�X�P_�}�����ԏI�����擾���܂��B
     * 
     * @return �A�N�Z�X�P_�}�����ԏI��
     */
    public String getAcMeetTimeEnd1() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeEnd1Hour(),
                getAcMeetTimeEnd1Minute());
    }

    /**
     * �A�N�Z�X�P_�}�����ԏI���i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�P_�}�����ԏI���i���ԁj
     */
    public String getAcMeetTimeEnd1Hour() {
        return acMeetTimeEnd1Hour;
    }

    /**
     * �A�N�Z�X�P_�}�����ԏI���i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�P_�}�����ԏI���i���j
     */
    public String getAcMeetTimeEnd1Minute() {
        return acMeetTimeEnd1Minute;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԏI�����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�}�����ԏI��
     */
    public String getAcMeetTimeEnd2() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeEnd2Hour(),
                getAcMeetTimeEnd2Minute());
    }

    /**
     * �A�N�Z�X�Q_�}�����ԏI���i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�}�����ԏI���i���ԁj
     */
    public String getAcMeetTimeEnd2Hour() {
        return acMeetTimeEnd2Hour;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԏI���i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�}�����ԏI���i���j
     */
    public String getAcMeetTimeEnd2Minute() {
        return acMeetTimeEnd2Minute;
    }

    /**
     * �A�N�Z�X�R_�}�����ԏI�����擾���܂��B
     * 
     * @return �A�N�Z�X�R_�}�����ԏI��
     */
    public String getAcMeetTimeEnd3() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeEnd3Hour(),
                getAcMeetTimeEnd3Minute());
    }

    /**
     * �A�N�Z�X�R_�}�����ԏI���i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�R_�}�����ԏI���i���ԁj
     */
    public String getAcMeetTimeEnd3Hour() {
        return acMeetTimeEnd3Hour;
    }

    /**
     * �A�N�Z�X�R_�}�����ԏI���i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�R_�}�����ԏI���i���j
     */
    public String getAcMeetTimeEnd3Minute() {
        return acMeetTimeEnd3Minute;
    }

    /**
     * �A�N�Z�X�P_�}�����ԗL�����擾���܂��B
     * 
     * @return �A�N�Z�X�P_�}�����ԗL��
     */
    public String getAcMeetTimeFlg1() {
        return acMeetTimeFlg1;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԗL�����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�}�����ԗL��
     */
    public String getAcMeetTimeFlg2() {
        return acMeetTimeFlg2;
    }

    /**
     * �A�N�Z�X�R_�}�����ԗL�����擾���܂��B
     * 
     * @return �A�N�Z�X�R_�}�����ԗL��
     */
    public String getAcMeetTimeFlg3() {
        return acMeetTimeFlg3;
    }

    /**
     * �A�N�Z�X�P_�}�����ԊJ�n���擾���܂��B
     * 
     * @return �A�N�Z�X�P_�}�����ԊJ�n
     */
    public String getAcMeetTimeStart1() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeStart1Hour(),
                getAcMeetTimeStart1Minute());
    }

    /**
     * �A�N�Z�X�P_�}�����ԊJ�n�i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�P_�}�����ԊJ�n�i���ԁj
     */
    public String getAcMeetTimeStart1Hour() {
        return acMeetTimeStart1Hour;
    }

    /**
     * �A�N�Z�X�P_�}�����ԊJ�n�i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�P_�}�����ԊJ�n�i���j
     */
    public String getAcMeetTimeStart1Minute() {
        return acMeetTimeStart1Minute;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԊJ�n���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�}�����ԊJ�n
     */
    public String getAcMeetTimeStart2() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeStart2Hour(),
                getAcMeetTimeStart2Minute());
    }

    /**
     * �A�N�Z�X�Q_�}�����ԊJ�n�i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�}�����ԊJ�n�i���ԁj
     */
    public String getAcMeetTimeStart2Hour() {
        return acMeetTimeStart2Hour;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԊJ�n�i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�}�����ԊJ�n�i���j
     */
    public String getAcMeetTimeStart2Minute() {
        return acMeetTimeStart2Minute;
    }

    /**
     * �A�N�Z�X�R_�}�����ԊJ�n���擾���܂��B
     * 
     * @return �A�N�Z�X�R_�}�����ԊJ�n
     */
    public String getAcMeetTimeStart3() {
        return DKikakuWebUtil.buildTime(getAcMeetTimeStart3Hour(),
                getAcMeetTimeStart3Minute());
    }

    /**
     * �A�N�Z�X�R_�}�����ԊJ�n�i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�R_�}�����ԊJ�n�i���ԁj
     */
    public String getAcMeetTimeStart3Hour() {
        return acMeetTimeStart3Hour;
    }

    /**
     * �A�N�Z�X�R_�}�����ԊJ�n�i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�R_�}�����ԊJ�n�i���j
     */
    public String getAcMeetTimeStart3Minute() {
        return acMeetTimeStart3Minute;
    }

    /**
     * �A�N�Z�X�P_���}�敪���擾���܂��B
     * 
     * @return �A�N�Z�X�P_���}�敪
     */
    public String getAcMsDiv1() {
        return acMsDiv1;
    }

    /**
     * �A�N�Z�X�Q_���}�敪���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���}�敪
     */
    public String getAcMsDiv2() {
        return acMsDiv2;
    }

    /**
     * �A�N�Z�X�R_���}�敪���擾���܂��B
     * 
     * @return �A�N�Z�X�R_���}�敪
     */
    public String getAcMsDiv3() {
        return acMsDiv3;
    }

    /**
     * �A�N�Z�X�P_���}�\����擾���܂��B
     * 
     * @return �A�N�Z�X�P_���}�\��
     */
    public String getAcMsReserve1() {
        return acMsReserve1;
    }

    /**
     * �A�N�Z�X�Q_���}�\����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���}�\��
     */
    public String getAcMsReserve2() {
        return acMsReserve2;
    }

    /**
     * �A�N�Z�X�R_���}�\����擾���܂��B
     * 
     * @return �A�N�Z�X�R_���}�\��
     */
    public String getAcMsReserve3() {
        return acMsReserve3;
    }

    /**
     * �A�N�Z�X�P_���}�\�񂻂̑����擾���܂��B
     * 
     * @return �A�N�Z�X�P_���}�\�񂻂̑�
     */
    public String getAcMsReserveCmt1() {
        return acMsReserveCmt1;
    }

    /**
     * �A�N�Z�X�Q_���}�\�񂻂̑����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���}�\�񂻂̑�
     */
    public String getAcMsReserveCmt2() {
        return acMsReserveCmt2;
    }

    /**
     * �A�N�Z�X�R_���}�\�񂻂̑����擾���܂��B
     * 
     * @return �A�N�Z�X�R_���}�\�񂻂̑�
     */
    public String getAcMsReserveCmt3() {
        return acMsReserveCmt3;
    }

    /**
     * �A�N�Z�X�P_���̑��R�����g���擾���܂��B
     * 
     * @return �A�N�Z�X�P_���̑��R�����g
     */
    public String getAcOthersCmt1() {
        return acOthersCmt1;
    }

    /**
     * �A�N�Z�X�Q_���̑��R�����g���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���̑��R�����g
     */
    public String getAcOthersCmt2() {
        return acOthersCmt2;
    }

    /**
     * �A�N�Z�X�R_���̑��R�����g���擾���܂��B
     * 
     * @return �A�N�Z�X�R_���̑��R�����g
     */
    public String getAcOthersCmt3() {
        return acOthersCmt3;
    }

    /**
     * �A�N�Z�X�P_���̑��L�����擾���܂��B
     * 
     * @return �A�N�Z�X�P_���̑��L��
     */
    public String getAcOthersFlg1() {
        return acOthersFlg1;
    }

    /**
     * �A�N�Z�X�Q_���̑��L�����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���̑��L��
     */
    public String getAcOthersFlg2() {
        return acOthersFlg2;
    }

    /**
     * �A�N�Z�X�R_���̑��L�����擾���܂��B
     * 
     * @return �A�N�Z�X�R_���̑��L��
     */
    public String getAcOthersFlg3() {
        return acOthersFlg3;
    }

    /**
     * �A�N�Z�X�P_���̑����擾���܂��B
     * 
     * @return �A�N�Z�X�P_���̑�
     */
    public String getAcOtherTimeCmt1() {
        return acOtherTimeCmt1;
    }

    /**
     * �A�N�Z�X�Q_���̑����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���̑�
     */
    public String getAcOtherTimeCmt2() {
        return acOtherTimeCmt2;
    }

    /**
     * �A�N�Z�X�R_���̑����擾���܂��B
     * 
     * @return �A�N�Z�X�R_���̑�
     */
    public String getAcOtherTimeCmt3() {
        return acOtherTimeCmt3;
    }

    /**
     * �A�N�Z�X�P_���莞�ԏI�����擾���܂��B
     * 
     * @return �A�N�Z�X�P_���莞�ԏI��
     */
    public String getAcSendTimeEnd1() {
        return DKikakuWebUtil.buildTime(getAcSendTimeEnd1Hour(),
                getAcSendTimeEnd1Minute());
    }

    /**
     * �A�N�Z�X�P_���莞�ԏI���i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�P_���莞�ԏI���i���ԁj
     */
    public String getAcSendTimeEnd1Hour() {
        return acSendTimeEnd1Hour;
    }

    /**
     * �A�N�Z�X�P_���莞�ԏI���i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�P_���莞�ԏI���i���j
     */
    public String getAcSendTimeEnd1Minute() {
        return acSendTimeEnd1Minute;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԏI�����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���莞�ԏI��
     */
    public String getAcSendTimeEnd2() {
        return DKikakuWebUtil.buildTime(getAcSendTimeEnd2Hour(),
                getAcSendTimeEnd2Minute());
    }

    /**
     * �A�N�Z�X�Q_���莞�ԏI���i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���莞�ԏI���i���ԁj
     */
    public String getAcSendTimeEnd2Hour() {
        return acSendTimeEnd2Hour;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԏI���i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���莞�ԏI���i���j
     */
    public String getAcSendTimeEnd2Minute() {
        return acSendTimeEnd2Minute;
    }

    /**
     * �A�N�Z�X�R_���莞�ԏI�����擾���܂��B
     * 
     * @return �A�N�Z�X�R_���莞�ԏI��
     */
    public String getAcSendTimeEnd3() {
        return DKikakuWebUtil.buildTime(getAcSendTimeEnd3Hour(),
                getAcSendTimeEnd3Minute());
    }

    /**
     * �A�N�Z�X�R_���莞�ԏI���i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�R_���莞�ԏI���i���ԁj
     */
    public String getAcSendTimeEnd3Hour() {
        return acSendTimeEnd3Hour;
    }

    /**
     * �A�N�Z�X�R_���莞�ԏI���i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�R_���莞�ԏI���i���j
     */
    public String getAcSendTimeEnd3Minute() {
        return acSendTimeEnd3Minute;
    }

    /**
     * �A�N�Z�X�P_���莞�ԗL�����擾���܂��B
     * 
     * @return �A�N�Z�X�P_���莞�ԗL��
     */
    public String getAcSendTimeFlg1() {
        return acSendTimeFlg1;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԗL�����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���莞�ԗL��
     */
    public String getAcSendTimeFlg2() {
        return acSendTimeFlg2;
    }

    /**
     * �A�N�Z�X�R_���莞�ԗL�����擾���܂��B
     * 
     * @return �A�N�Z�X�R_���莞�ԗL��
     */
    public String getAcSendTimeFlg3() {
        return acSendTimeFlg3;
    }

    /**
     * �A�N�Z�X�P_���莞�ԊJ�n���擾���܂��B
     * 
     * @return �A�N�Z�X�P_���莞�ԊJ�n
     */
    public String getAcSendTimeStart1() {
        return DKikakuWebUtil.buildTime(getAcSendTimeStart1Hour(),
                getAcSendTimeStart1Minute());
    }

    /**
     * �A�N�Z�X�P_���莞�ԊJ�n�i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�P_���莞�ԊJ�n�i���ԁj
     */
    public String getAcSendTimeStart1Hour() {
        return acSendTimeStart1Hour;
    }

    /**
     * �A�N�Z�X�P_���莞�ԊJ�n�i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�P_���莞�ԊJ�n�i���j
     */
    public String getAcSendTimeStart1Minute() {
        return acSendTimeStart1Minute;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԊJ�n���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���莞�ԊJ�n
     */
    public String getAcSendTimeStart2() {
        return DKikakuWebUtil.buildTime(getAcSendTimeStart2Hour(),
                getAcSendTimeStart2Minute());
    }

    /**
     * �A�N�Z�X�Q_���莞�ԊJ�n�i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���莞�ԊJ�n�i���ԁj
     */
    public String getAcSendTimeStart2Hour() {
        return acSendTimeStart2Hour;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԊJ�n�i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���莞�ԊJ�n�i���j
     */
    public String getAcSendTimeStart2Minute() {
        return acSendTimeStart2Minute;
    }

    /**
     * �A�N�Z�X�R_���莞�ԊJ�n���擾���܂��B
     * 
     * @return �A�N�Z�X�R_���莞�ԊJ�n
     */
    public String getAcSendTimeStart3() {
        return DKikakuWebUtil.buildTime(getAcSendTimeStart3Hour(),
                getAcSendTimeStart3Minute());
    }

    /**
     * �A�N�Z�X�R_���莞�ԊJ�n�i���ԁj���擾���܂��B
     * 
     * @return �A�N�Z�X�R_���莞�ԊJ�n�i���ԁj
     */
    public String getAcSendTimeStart3Hour() {
        return acSendTimeStart3Hour;
    }

    /**
     * �A�N�Z�X�R_���莞�ԊJ�n�i���j���擾���܂��B
     * 
     * @return �A�N�Z�X�R_���莞�ԊJ�n�i���j
     */
    public String getAcSendTimeStart3Minute() {
        return acSendTimeStart3Minute;
    }

    /**
     * �A�N�Z�X�P_���}�V���g���o�X�L�����擾���܂��B
     * 
     * @return �A�N�Z�X�P_���}�V���g���o�X�L��
     */
    public String getAcShuttleBusFlg1() {
        return acShuttleBusFlg1;
    }

    /**
     * �A�N�Z�X�Q_���}�V���g���o�X�L�����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_���}�V���g���o�X�L��
     */
    public String getAcShuttleBusFlg2() {
        return acShuttleBusFlg2;
    }

    /**
     * �A�N�Z�X�R_���}�V���g���o�X�L�����擾���܂��B
     * 
     * @return �A�N�Z�X�R_���}�V���g���o�X�L��
     */
    public String getAcShuttleBusFlg3() {
        return acShuttleBusFlg3;
    }

    /**
     * �A�N�Z�X�P_�X�L�[����擾���܂��B
     * 
     * @return �A�N�Z�X�P_�X�L�[��
     */
    public String getAcSkiNm1() {
        return acSkiNm1;
    }

    /**
     * �A�N�Z�X�Q_�X�L�[����擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�X�L�[��
     */
    public String getAcSkiNm2() {
        return acSkiNm2;
    }

    /**
     * �A�N�Z�X�R_�X�L�[����擾���܂��B
     * 
     * @return �A�N�Z�X�R_�X�L�[��
     */
    public String getAcSkiNm3() {
        return acSkiNm3;
    }

    /**
     * �A�N�Z�X�P_�k�����Ԃ��擾���܂��B
     * 
     * @return �A�N�Z�X�P_�k������
     */
    public String getAcWalkTime1() {
        return acWalkTime1;
    }

    /**
     * �A�N�Z�X�Q_�k�����Ԃ��擾���܂��B
     * 
     * @return �A�N�Z�X�Q_�k������
     */
    public String getAcWalkTime2() {
        return acWalkTime2;
    }

    /**
     * �A�N�Z�X�R_�k�����Ԃ��擾���܂��B
     * 
     * @return �A�N�Z�X�R_�k������
     */
    public String getAcWalkTime3() {
        return acWalkTime3;
    }

    /**
     * �{�݃R�[�h���擾���܂��B
     * 
     * @return �{�݃R�[�h
     */
    @Override
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * �{�݃p�^�[�����擾���܂��B
     * 
     * @return �{�݃p�^�[��
     */
    @Override
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * �񓚏���ʂ��擾���܂��B
     * 
     * @return �񓚏����
     */
    @Override
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * �A�N�Z�X�P_�Ԏ��Ԃ�ݒ肵�܂��B
     * 
     * @param acCarTime1
     *            �A�N�Z�X�P_�Ԏ���
     */
    public void setAcCarTime1(String acCarTime1) {
        this.acCarTime1 = acCarTime1;
    }

    /**
     * �A�N�Z�X�Q_�Ԏ��Ԃ�ݒ肵�܂��B
     * 
     * @param acCarTime2
     *            �A�N�Z�X�Q_�Ԏ���
     */
    public void setAcCarTime2(String acCarTime2) {
        this.acCarTime2 = acCarTime2;
    }

    /**
     * �A�N�Z�X�R_�Ԏ��Ԃ�ݒ肵�܂��B
     * 
     * @param acCarTime3
     *            �A�N�Z�X�R_�Ԏ���
     */
    public void setAcCarTime3(String acCarTime3) {
        this.acCarTime3 = acCarTime3;
    }

    /**
     * �A�N�Z�X�P_�}�����ԏI����ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd1
     *            �A�N�Z�X�P_�}�����ԏI��
     */
    public void setAcMeetTimeEnd1(String acMeetTimeEnd1) {
        setAcMeetTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(acMeetTimeEnd1));
        setAcMeetTimeEnd1Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeEnd1));
    }

    /**
     * �A�N�Z�X�P_�}�����ԏI���i���ԁj��ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd1Hour
     *            �A�N�Z�X�P_�}�����ԏI���i���ԁj
     */
    public void setAcMeetTimeEnd1Hour(String acMeetTimeEnd1Hour) {
        this.acMeetTimeEnd1Hour = acMeetTimeEnd1Hour;
    }

    /**
     * �A�N�Z�X�P_�}�����ԏI���i���j��ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd1Minute
     *            �A�N�Z�X�P_�}�����ԏI���i���j
     */
    public void setAcMeetTimeEnd1Minute(String acMeetTimeEnd1Minute) {
        this.acMeetTimeEnd1Minute = acMeetTimeEnd1Minute;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԏI����ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd2
     *            �A�N�Z�X�Q_�}�����ԏI��
     */
    public void setAcMeetTimeEnd2(String acMeetTimeEnd2) {
        setAcMeetTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(acMeetTimeEnd2));
        setAcMeetTimeEnd2Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeEnd2));
    }

    /**
     * �A�N�Z�X�Q_�}�����ԏI���i���ԁj��ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd2Hour
     *            �A�N�Z�X�Q_�}�����ԏI���i���ԁj
     */
    public void setAcMeetTimeEnd2Hour(String acMeetTimeEnd2Hour) {
        this.acMeetTimeEnd2Hour = acMeetTimeEnd2Hour;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԏI���i���j��ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd2Minute
     *            �A�N�Z�X�Q_�}�����ԏI���i���j
     */
    public void setAcMeetTimeEnd2Minute(String acMeetTimeEnd2Minute) {
        this.acMeetTimeEnd2Minute = acMeetTimeEnd2Minute;
    }

    /**
     * �A�N�Z�X�R_�}�����ԏI����ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd3
     *            �A�N�Z�X�R_�}�����ԏI��
     */
    public void setAcMeetTimeEnd3(String acMeetTimeEnd3) {
        setAcMeetTimeEnd3Hour(DKikakuWebUtil.getHourFormTime(acMeetTimeEnd3));
        setAcMeetTimeEnd3Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeEnd3));
    }

    /**
     * �A�N�Z�X�R_�}�����ԏI���i���ԁj��ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd3Hour
     *            �A�N�Z�X�R_�}�����ԏI���i���ԁj
     */
    public void setAcMeetTimeEnd3Hour(String acMeetTimeEnd3Hour) {
        this.acMeetTimeEnd3Hour = acMeetTimeEnd3Hour;
    }

    /**
     * �A�N�Z�X�R_�}�����ԏI���i���j��ݒ肵�܂��B
     * 
     * @param acMeetTimeEnd3Minute
     *            �A�N�Z�X�R_�}�����ԏI���i���j
     */
    public void setAcMeetTimeEnd3Minute(String acMeetTimeEnd3Minute) {
        this.acMeetTimeEnd3Minute = acMeetTimeEnd3Minute;
    }

    /**
     * �A�N�Z�X�P_�}�����ԗL����ݒ肵�܂��B
     * 
     * @param acMeetTimeFlg1
     *            �A�N�Z�X�P_�}�����ԗL��
     */
    public void setAcMeetTimeFlg1(String acMeetTimeFlg1) {
        this.acMeetTimeFlg1 = acMeetTimeFlg1;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԗL����ݒ肵�܂��B
     * 
     * @param acMeetTimeFlg2
     *            �A�N�Z�X�Q_�}�����ԗL��
     */
    public void setAcMeetTimeFlg2(String acMeetTimeFlg2) {
        this.acMeetTimeFlg2 = acMeetTimeFlg2;
    }

    /**
     * �A�N�Z�X�R_�}�����ԗL����ݒ肵�܂��B
     * 
     * @param acMeetTimeFlg3
     *            �A�N�Z�X�R_�}�����ԗL��
     */
    public void setAcMeetTimeFlg3(String acMeetTimeFlg3) {
        this.acMeetTimeFlg3 = acMeetTimeFlg3;
    }

    /**
     * �A�N�Z�X�P_�}�����ԊJ�n��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart1
     *            �A�N�Z�X�P_�}�����ԊJ�n
     */
    public void setAcMeetTimeStart1(String acMeetTimeStart1) {
        setAcMeetTimeStart1Hour(DKikakuWebUtil
                .getHourFormTime(acMeetTimeStart1));
        setAcMeetTimeStart1Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeStart1));
    }

    /**
     * �A�N�Z�X�P_�}�����ԊJ�n�i���ԁj��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart1Hour
     *            �A�N�Z�X�P_�}�����ԊJ�n�i���ԁj
     */
    public void setAcMeetTimeStart1Hour(String acMeetTimeStart1Hour) {
        this.acMeetTimeStart1Hour = acMeetTimeStart1Hour;
    }

    /**
     * �A�N�Z�X�P_�}�����ԊJ�n�i���j��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart1Minute
     *            �A�N�Z�X�P_�}�����ԊJ�n�i���j
     */
    public void setAcMeetTimeStart1Minute(String acMeetTimeStart1Minute) {
        this.acMeetTimeStart1Minute = acMeetTimeStart1Minute;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԊJ�n��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart2
     *            �A�N�Z�X�Q_�}�����ԊJ�n
     */
    public void setAcMeetTimeStart2(String acMeetTimeStart2) {
        setAcMeetTimeStart2Hour(DKikakuWebUtil
                .getHourFormTime(acMeetTimeStart2));
        setAcMeetTimeStart2Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeStart2));
    }

    /**
     * �A�N�Z�X�Q_�}�����ԊJ�n�i���ԁj��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart2Hour
     *            �A�N�Z�X�Q_�}�����ԊJ�n�i���ԁj
     */
    public void setAcMeetTimeStart2Hour(String acMeetTimeStart2Hour) {
        this.acMeetTimeStart2Hour = acMeetTimeStart2Hour;
    }

    /**
     * �A�N�Z�X�Q_�}�����ԊJ�n�i���j��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart2Minute
     *            �A�N�Z�X�Q_�}�����ԊJ�n�i���j
     */
    public void setAcMeetTimeStart2Minute(String acMeetTimeStart2Minute) {
        this.acMeetTimeStart2Minute = acMeetTimeStart2Minute;
    }

    /**
     * �A�N�Z�X�R_�}�����ԊJ�n��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart3
     *            �A�N�Z�X�R_�}�����ԊJ�n
     */
    public void setAcMeetTimeStart3(String acMeetTimeStart3) {
        setAcMeetTimeStart3Hour(DKikakuWebUtil
                .getHourFormTime(acMeetTimeStart3));
        setAcMeetTimeStart3Minute(DKikakuWebUtil
                .getMinuteFromTime(acMeetTimeStart3));
    }

    /**
     * �A�N�Z�X�R_�}�����ԊJ�n�i���ԁj��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart3Hour
     *            �A�N�Z�X�R_�}�����ԊJ�n�i���ԁj
     */
    public void setAcMeetTimeStart3Hour(String acMeetTimeStart3Hour) {
        this.acMeetTimeStart3Hour = acMeetTimeStart3Hour;
    }

    /**
     * �A�N�Z�X�R_�}�����ԊJ�n�i���j��ݒ肵�܂��B
     * 
     * @param acMeetTimeStart3Minute
     *            �A�N�Z�X�R_�}�����ԊJ�n�i���j
     */
    public void setAcMeetTimeStart3Minute(String acMeetTimeStart3Minute) {
        this.acMeetTimeStart3Minute = acMeetTimeStart3Minute;
    }

    /**
     * �A�N�Z�X�P_���}�敪��ݒ肵�܂��B
     * 
     * @param acMsDiv1
     *            �A�N�Z�X�P_���}�敪
     */
    public void setAcMsDiv1(String acMsDiv1) {
        this.acMsDiv1 = acMsDiv1;
    }

    /**
     * �A�N�Z�X�Q_���}�敪��ݒ肵�܂��B
     * 
     * @param acMsDiv2
     *            �A�N�Z�X�Q_���}�敪
     */
    public void setAcMsDiv2(String acMsDiv2) {
        this.acMsDiv2 = acMsDiv2;
    }

    /**
     * �A�N�Z�X�R_���}�敪��ݒ肵�܂��B
     * 
     * @param acMsDiv3
     *            �A�N�Z�X�R_���}�敪
     */
    public void setAcMsDiv3(String acMsDiv3) {
        this.acMsDiv3 = acMsDiv3;
    }

    /**
     * �A�N�Z�X�P_���}�\���ݒ肵�܂��B
     * 
     * @param acMsReserve1
     *            �A�N�Z�X�P_���}�\��
     */
    public void setAcMsReserve1(String acMsReserve1) {
        this.acMsReserve1 = acMsReserve1;
    }

    /**
     * �A�N�Z�X�Q_���}�\���ݒ肵�܂��B
     * 
     * @param acMsReserve2
     *            �A�N�Z�X�Q_���}�\��
     */
    public void setAcMsReserve2(String acMsReserve2) {
        this.acMsReserve2 = acMsReserve2;
    }

    /**
     * �A�N�Z�X�R_���}�\���ݒ肵�܂��B
     * 
     * @param acMsReserve3
     *            �A�N�Z�X�R_���}�\��
     */
    public void setAcMsReserve3(String acMsReserve3) {
        this.acMsReserve3 = acMsReserve3;
    }

    /**
     * �A�N�Z�X�P_���}�\�񂻂̑���ݒ肵�܂��B
     * 
     * @param acMsReserveCmt1
     *            �A�N�Z�X�P_���}�\�񂻂̑�
     */
    public void setAcMsReserveCmt1(String acMsReserveCmt1) {
        this.acMsReserveCmt1 = acMsReserveCmt1;
    }

    /**
     * �A�N�Z�X�Q_���}�\�񂻂̑���ݒ肵�܂��B
     * 
     * @param acMsReserveCmt2
     *            �A�N�Z�X�Q_���}�\�񂻂̑�
     */
    public void setAcMsReserveCmt2(String acMsReserveCmt2) {
        this.acMsReserveCmt2 = acMsReserveCmt2;
    }

    /**
     * �A�N�Z�X�R_���}�\�񂻂̑���ݒ肵�܂��B
     * 
     * @param acMsReserveCmt3
     *            �A�N�Z�X�R_���}�\�񂻂̑�
     */
    public void setAcMsReserveCmt3(String acMsReserveCmt3) {
        this.acMsReserveCmt3 = acMsReserveCmt3;
    }

    /**
     * �A�N�Z�X�P_���̑��R�����g��ݒ肵�܂��B
     * 
     * @param acOthersCmt1
     *            �A�N�Z�X�P_���̑��R�����g
     */
    public void setAcOthersCmt1(String acOthersCmt1) {
        this.acOthersCmt1 = acOthersCmt1;
    }

    /**
     * �A�N�Z�X�Q_���̑��R�����g��ݒ肵�܂��B
     * 
     * @param acOthersCmt2
     *            �A�N�Z�X�Q_���̑��R�����g
     */
    public void setAcOthersCmt2(String acOthersCmt2) {
        this.acOthersCmt2 = acOthersCmt2;
    }

    /**
     * �A�N�Z�X�R_���̑��R�����g��ݒ肵�܂��B
     * 
     * @param acOthersCmt3
     *            �A�N�Z�X�R_���̑��R�����g
     */
    public void setAcOthersCmt3(String acOthersCmt3) {
        this.acOthersCmt3 = acOthersCmt3;
    }

    /**
     * �A�N�Z�X�P_���̑��L����ݒ肵�܂��B
     * 
     * @param acOthersFlg1
     *            �A�N�Z�X�P_���̑��L��
     */
    public void setAcOthersFlg1(String acOthersFlg1) {
        this.acOthersFlg1 = acOthersFlg1;
    }

    /**
     * �A�N�Z�X�Q_���̑��L����ݒ肵�܂��B
     * 
     * @param acOthersFlg2
     *            �A�N�Z�X�Q_���̑��L��
     */
    public void setAcOthersFlg2(String acOthersFlg2) {
        this.acOthersFlg2 = acOthersFlg2;
    }

    /**
     * �A�N�Z�X�R_���̑��L����ݒ肵�܂��B
     * 
     * @param acOthersFlg3
     *            �A�N�Z�X�R_���̑��L��
     */
    public void setAcOthersFlg3(String acOthersFlg3) {
        this.acOthersFlg3 = acOthersFlg3;
    }

    /**
     * �A�N�Z�X�P_���̑���ݒ肵�܂��B
     * 
     * @param acOtherTimeCmt1
     *            �A�N�Z�X�P_���̑�
     */
    public void setAcOtherTimeCmt1(String acOtherTimeCmt1) {
        this.acOtherTimeCmt1 = acOtherTimeCmt1;
    }

    /**
     * �A�N�Z�X�Q_���̑���ݒ肵�܂��B
     * 
     * @param acOtherTimeCmt2
     *            �A�N�Z�X�Q_���̑�
     */
    public void setAcOtherTimeCmt2(String acOtherTimeCmt2) {
        this.acOtherTimeCmt2 = acOtherTimeCmt2;
    }

    /**
     * �A�N�Z�X�R_���̑���ݒ肵�܂��B
     * 
     * @param acOtherTimeCmt3
     *            �A�N�Z�X�R_���̑�
     */
    public void setAcOtherTimeCmt3(String acOtherTimeCmt3) {
        this.acOtherTimeCmt3 = acOtherTimeCmt3;
    }

    /**
     * �A�N�Z�X�P_���莞�ԏI����ݒ肵�܂��B
     * 
     * @param acSendTimeEnd1
     *            �A�N�Z�X�P_���莞�ԏI��
     */
    public void setAcSendTimeEnd1(String acSendTimeEnd1) {
        setAcSendTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(acSendTimeEnd1));
        setAcSendTimeEnd1Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeEnd1));
    }

    /**
     * �A�N�Z�X�P_���莞�ԏI���i���ԁj��ݒ肵�܂��B
     * 
     * @param acSendTimeEnd1Hour
     *            �A�N�Z�X�P_���莞�ԏI���i���ԁj
     */
    public void setAcSendTimeEnd1Hour(String acSendTimeEnd1Hour) {
        this.acSendTimeEnd1Hour = acSendTimeEnd1Hour;
    }

    /**
     * �A�N�Z�X�P_���莞�ԏI���i���j��ݒ肵�܂��B
     * 
     * @param acSendTimeEnd1Minute
     *            �A�N�Z�X�P_���莞�ԏI���i���j
     */
    public void setAcSendTimeEnd1Minute(String acSendTimeEnd1Minute) {
        this.acSendTimeEnd1Minute = acSendTimeEnd1Minute;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԏI����ݒ肵�܂��B
     * 
     * @param acSendTimeEnd2
     *            �A�N�Z�X�Q_���莞�ԏI��
     */
    public void setAcSendTimeEnd2(String acSendTimeEnd2) {
        setAcSendTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(acSendTimeEnd2));
        setAcSendTimeEnd2Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeEnd2));
    }

    /**
     * �A�N�Z�X�Q_���莞�ԏI���i���ԁj��ݒ肵�܂��B
     * 
     * @param acSendTimeEnd2Hour
     *            �A�N�Z�X�Q_���莞�ԏI���i���ԁj
     */
    public void setAcSendTimeEnd2Hour(String acSendTimeEnd2Hour) {
        this.acSendTimeEnd2Hour = acSendTimeEnd2Hour;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԏI���i���j��ݒ肵�܂��B
     * 
     * @param acSendTimeEnd2Minute
     *            �A�N�Z�X�Q_���莞�ԏI���i���j
     */
    public void setAcSendTimeEnd2Minute(String acSendTimeEnd2Minute) {
        this.acSendTimeEnd2Minute = acSendTimeEnd2Minute;
    }

    /**
     * �A�N�Z�X�R_���莞�ԏI����ݒ肵�܂��B
     * 
     * @param acSendTimeEnd3
     *            �A�N�Z�X�R_���莞�ԏI��
     */
    public void setAcSendTimeEnd3(String acSendTimeEnd3) {
        setAcSendTimeEnd3Hour(DKikakuWebUtil.getHourFormTime(acSendTimeEnd3));
        setAcSendTimeEnd3Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeEnd3));
    }

    /**
     * �A�N�Z�X�R_���莞�ԏI���i���ԁj��ݒ肵�܂��B
     * 
     * @param acSendTimeEnd3Hour
     *            �A�N�Z�X�R_���莞�ԏI���i���ԁj
     */
    public void setAcSendTimeEnd3Hour(String acSendTimeEnd3Hour) {
        this.acSendTimeEnd3Hour = acSendTimeEnd3Hour;
    }

    /**
     * �A�N�Z�X�R_���莞�ԏI���i���j��ݒ肵�܂��B
     * 
     * @param acSendTimeEnd3Minute
     *            �A�N�Z�X�R_���莞�ԏI���i���j
     */
    public void setAcSendTimeEnd3Minute(String acSendTimeEnd3Minute) {
        this.acSendTimeEnd3Minute = acSendTimeEnd3Minute;
    }

    /**
     * �A�N�Z�X�P_���莞�ԗL����ݒ肵�܂��B
     * 
     * @param acSendTimeFlg1
     *            �A�N�Z�X�P_���莞�ԗL��
     */
    public void setAcSendTimeFlg1(String acSendTimeFlg1) {
        this.acSendTimeFlg1 = acSendTimeFlg1;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԗL����ݒ肵�܂��B
     * 
     * @param acSendTimeFlg2
     *            �A�N�Z�X�Q_���莞�ԗL��
     */
    public void setAcSendTimeFlg2(String acSendTimeFlg2) {
        this.acSendTimeFlg2 = acSendTimeFlg2;
    }

    /**
     * �A�N�Z�X�R_���莞�ԗL����ݒ肵�܂��B
     * 
     * @param acSendTimeFlg3
     *            �A�N�Z�X�R_���莞�ԗL��
     */
    public void setAcSendTimeFlg3(String acSendTimeFlg3) {
        this.acSendTimeFlg3 = acSendTimeFlg3;
    }

    /**
     * �A�N�Z�X�P_���莞�ԊJ�n��ݒ肵�܂��B
     * 
     * @param acSendTimeStart1
     *            �A�N�Z�X�P_���莞�ԊJ�n
     */
    public void setAcSendTimeStart1(String acSendTimeStart1) {
        setAcSendTimeStart1Hour(DKikakuWebUtil
                .getHourFormTime(acSendTimeStart1));
        setAcSendTimeStart1Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeStart1));
    }

    /**
     * �A�N�Z�X�P_���莞�ԊJ�n�i���ԁj��ݒ肵�܂��B
     * 
     * @param acSendTimeStart1Hour
     *            �A�N�Z�X�P_���莞�ԊJ�n�i���ԁj
     */
    public void setAcSendTimeStart1Hour(String acSendTimeStart1Hour) {
        this.acSendTimeStart1Hour = acSendTimeStart1Hour;
    }

    /**
     * �A�N�Z�X�P_���莞�ԊJ�n�i���j��ݒ肵�܂��B
     * 
     * @param acSendTimeStart1Minute
     *            �A�N�Z�X�P_���莞�ԊJ�n�i���j
     */
    public void setAcSendTimeStart1Minute(String acSendTimeStart1Minute) {
        this.acSendTimeStart1Minute = acSendTimeStart1Minute;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԊJ�n��ݒ肵�܂��B
     * 
     * @param acSendTimeStart2
     *            �A�N�Z�X�Q_���莞�ԊJ�n
     */
    public void setAcSendTimeStart2(String acSendTimeStart2) {
        setAcSendTimeStart2Hour(DKikakuWebUtil
                .getHourFormTime(acSendTimeStart2));
        setAcSendTimeStart2Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeStart2));
    }

    /**
     * �A�N�Z�X�Q_���莞�ԊJ�n�i���ԁj��ݒ肵�܂��B
     * 
     * @param acSendTimeStart2Hour
     *            �A�N�Z�X�Q_���莞�ԊJ�n�i���ԁj
     */
    public void setAcSendTimeStart2Hour(String acSendTimeStart2Hour) {
        this.acSendTimeStart2Hour = acSendTimeStart2Hour;
    }

    /**
     * �A�N�Z�X�Q_���莞�ԊJ�n�i���j��ݒ肵�܂��B
     * 
     * @param acSendTimeStart2Minute
     *            �A�N�Z�X�Q_���莞�ԊJ�n�i���j
     */
    public void setAcSendTimeStart2Minute(String acSendTimeStart2Minute) {
        this.acSendTimeStart2Minute = acSendTimeStart2Minute;
    }

    /**
     * �A�N�Z�X�R_���莞�ԊJ�n��ݒ肵�܂��B
     * 
     * @param acSendTimeStart3
     *            �A�N�Z�X�R_���莞�ԊJ�n
     */
    public void setAcSendTimeStart3(String acSendTimeStart3) {
        setAcSendTimeStart3Hour(DKikakuWebUtil
                .getHourFormTime(acSendTimeStart3));
        setAcSendTimeStart3Minute(DKikakuWebUtil
                .getMinuteFromTime(acSendTimeStart3));
    }

    /**
     * �A�N�Z�X�R_���莞�ԊJ�n�i���ԁj��ݒ肵�܂��B
     * 
     * @param acSendTimeStart3Hour
     *            �A�N�Z�X�R_���莞�ԊJ�n�i���ԁj
     */
    public void setAcSendTimeStart3Hour(String acSendTimeStart3Hour) {
        this.acSendTimeStart3Hour = acSendTimeStart3Hour;
    }

    /**
     * �A�N�Z�X�R_���莞�ԊJ�n�i���j��ݒ肵�܂��B
     * 
     * @param acSendTimeStart3Minute
     *            �A�N�Z�X�R_���莞�ԊJ�n�i���j
     */
    public void setAcSendTimeStart3Minute(String acSendTimeStart3Minute) {
        this.acSendTimeStart3Minute = acSendTimeStart3Minute;
    }

    /**
     * �A�N�Z�X�P_���}�V���g���o�X�L����ݒ肵�܂��B
     * 
     * @param acShuttleBusFlg1
     *            �A�N�Z�X�P_���}�V���g���o�X�L��
     */
    public void setAcShuttleBusFlg1(String acShuttleBusFlg1) {
        this.acShuttleBusFlg1 = acShuttleBusFlg1;
    }

    /**
     * �A�N�Z�X�Q_���}�V���g���o�X�L����ݒ肵�܂��B
     * 
     * @param acShuttleBusFlg2
     *            �A�N�Z�X�Q_���}�V���g���o�X�L��
     */
    public void setAcShuttleBusFlg2(String acShuttleBusFlg2) {
        this.acShuttleBusFlg2 = acShuttleBusFlg2;
    }

    /**
     * �A�N�Z�X�R_���}�V���g���o�X�L����ݒ肵�܂��B
     * 
     * @param acShuttleBusFlg3
     *            �A�N�Z�X�R_���}�V���g���o�X�L��
     */
    public void setAcShuttleBusFlg3(String acShuttleBusFlg3) {
        this.acShuttleBusFlg3 = acShuttleBusFlg3;
    }

    /**
     * �A�N�Z�X�P_�X�L�[���ݒ肵�܂��B
     * 
     * @param acSkiNm1
     *            �A�N�Z�X�P_�X�L�[��
     */
    public void setAcSkiNm1(String acSkiNm1) {
        this.acSkiNm1 = acSkiNm1;
    }

    /**
     * �A�N�Z�X�Q_�X�L�[���ݒ肵�܂��B
     * 
     * @param acSkiNm2
     *            �A�N�Z�X�Q_�X�L�[��
     */
    public void setAcSkiNm2(String acSkiNm2) {
        this.acSkiNm2 = acSkiNm2;
    }

    /**
     * �A�N�Z�X�R_�X�L�[���ݒ肵�܂��B
     * 
     * @param acSkiNm3
     *            �A�N�Z�X�R_�X�L�[��
     */
    public void setAcSkiNm3(String acSkiNm3) {
        this.acSkiNm3 = acSkiNm3;
    }

    /**
     * �A�N�Z�X�P_�k�����Ԃ�ݒ肵�܂��B
     * 
     * @param acWalkTime1
     *            �A�N�Z�X�P_�k������
     */
    public void setAcWalkTime1(String acWalkTime1) {
        this.acWalkTime1 = acWalkTime1;
    }

    /**
     * �A�N�Z�X�Q_�k�����Ԃ�ݒ肵�܂��B
     * 
     * @param acWalkTime2
     *            �A�N�Z�X�Q_�k������
     */
    public void setAcWalkTime2(String acWalkTime2) {
        this.acWalkTime2 = acWalkTime2;
    }

    /**
     * �A�N�Z�X�R_�k�����Ԃ�ݒ肵�܂��B
     * 
     * @param acWalkTime3
     *            �A�N�Z�X�R_�k������
     */
    public void setAcWalkTime3(String acWalkTime3) {
        this.acWalkTime3 = acWalkTime3;
    }

    /**
     * �{�݃R�[�h��ݒ肵�܂��B
     * 
     * @param facilityCd
     *            �{�݃R�[�h
     */
    @Override
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �{�݃p�^�[����ݒ肵�܂��B
     * 
     * @param facilityPattern
     *            �{�݃p�^�[��
     */
    @Override
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * �񓚏���ʂ�ݒ肵�܂��B
     * 
     * @param kindFlg
     *            �񓚏����
     */
    @Override
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

}
