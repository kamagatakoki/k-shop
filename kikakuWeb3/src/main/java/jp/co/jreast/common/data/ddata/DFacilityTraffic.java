package jp.co.jreast.common.data.ddata; // SUPPRESS CHECKSTYLE (�񐔂��������ߍs���팸�s��)

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]�{��_��ʎ�i �G���e�B�e�B
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
public class DFacilityTraffic implements FacilityManageBodyKey {

    /** �ԗ��p�������HIC1 */
    private String accessIc1;

    /** �ԗ��p����1 */
    private String accessTime1;

    /** �^�N�V�[�����N�x1 */
    private String annualTaxiFee1;

    /** �^�N�V�[�����N�x2 */
    private String annualTaxiFee2;

    /** �ԗ��p�����ԓ�1 */
    private String autoRoadway1;

    /** �ԗ��p����1 */
    private String availableDistance1;

    /** �o�X�s����1 */
    private String busDestination1;

    /** �o�X�s����2 */
    private String busDestination2;

    /** �o�X�▼1 */
    private String busStation1;

    /** �o�X�▼2 */
    private String busStation2;

    /** �o�X���p����1 */
    private String busTimetable1;

    /** �o�X���p����2 */
    private String busTimetable2;

    /** �ԗ��p����1 */
    private String carDirection1;

    /** �ԗ��p�ڕW��1 */
    private String carTarget1;

    /** �w�����v�A���L��1 */
    private String contactFlg1;

    /** �w�����v�A���L��2 */
    private String contactFlg2;

    /** �ԗ��p����1 */
    private String countyRoadway1;

    /** �o�����1 */
    private String exitInfo1;

    /** �o�����2 */
    private String exitInfo2;

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �{�݃p�^�[�� */
    private String facilityPattern;

    /** �ԗ��p���ʓ��H1 */
    private String genreralRoadway1;

    /** �ԗ��p�������H1 */
    private String highway1;

    /** �񓚏���� */
    private String kindFlg;

    /** �}���\���ԊJ�n1�i���ԁj */
    private String meetTimeBegin1Hour;

    /** �}���\���ԊJ�n1�i���j */
    private String meetTimeBegin1Minute;

    /** �}���\���ԊJ�n2�i���ԁj */
    private String meetTimeBegin2Hour;

    /** �}���\���ԊJ�n2�i���j */
    private String meetTimeBegin2Minute;

    /** �}���\���ԏI��1�i���ԁj */
    private String meetTimeEnd1Hour;

    /** �}���\���ԏI��1�i���j */
    private String meetTimeEnd1Minute;

    /** �}���\���ԏI��2�i���ԁj */
    private String meetTimeEnd2Hour;

    /** �}���\���ԏI��2�i���j */
    private String meetTimeEnd2Minute;

    /** �}���\���ԗL��1 */
    private String meetTimeFlg1;

    /** �}���\���ԗL��2 */
    private String meetTimeFlg2;

    /** �^�N�V�[������1 */
    private String monthlyTaxiFee1;

    /** �^�N�V�[������2 */
    private String monthlyTaxiFee2;

    /** ���}�o�X1 */
    private String msBus1;

    /** ���}�o�X2 */
    private String msBus2;

    /** ���}�o�X�L��1 */
    private String msBusFlg1;

    /** ���}�o�X�L��2 */
    private String msBusFlg2;

    /** ���}�敪1 */
    private String msDiv1;

    /** ���}�敪2 */
    private String msDiv2;

    /** ���}�L��1 */
    private String msFlg1;

    /** ���}�L��2 */
    private String msFlg2;

    /** ���}�w1 */
    private String msStation1;

    /** ���}�w2 */
    private String msStation2;

    /** ���}�w�L��1 */
    private String msStationFlg1;

    /** ���}�w�L��2 */
    private String msStationFlg2;

    /** �ԗ��p����1 */
    private String nationalRoadway1;

    /** �i�q�E���S�Ŋ�w1 */
    private String nearestStation1;

    /** �i�q�E���S�Ŋ�w2 */
    private String nearestStation2;

    /** ���S�Ŋ�JR�w1 */
    private String nearestStationPrivate1;

    /** ���S�Ŋ�JR�w2 */
    private String nearestStationPrivate2;

    /** �\��s�v�L��1 */
    private String noReserveFlg1;

    /** �\��s�v�L��2 */
    private String noReserveFlg2;

    /** ���S��Ж��H����1 */
    private String privateLineNm1;

    /** ���S��Ж��H����2 */
    private String privateLineNm2;

    /** �v�\��R�����g1 */
    private String reserveCmt1;

    /** �v�\��R�����g2 */
    private String reserveCmt2;

    /** �v�\��敪1 */
    private String reserveDiv1;

    /** �v�\��敪2 */
    private String reserveDiv2;

    /** �v�\��L��1 */
    private String reserveFlg1;

    /** �v�\��L��2 */
    private String reserveFlg2;

    /** ����\���ԊJ�n1�i���ԁj */
    private String sendTimeBegin1Hour;

    /** ����\���ԊJ�n1�i���j */
    private String sendTimeBegin1Minute;

    /** ����\���ԊJ�n2�i���ԁj */
    private String sendTimeBegin2Hour;

    /** ����\���ԊJ�n2�i���j */
    private String sendTimeBegin2Minute;

    /** ����\���ԏI��1�i���ԁj */
    private String sendTimeEnd1Hour;

    /** ����\���ԏI��1�i���j */
    private String sendTimeEnd1Minute;

    /** ����\���ԏI��2�i���ԁj */
    private String sendTimeEnd2Hour;

    /** ����\���ԏI��2�i���j */
    private String sendTimeEnd2Minute;

    /** ����\���ԗL��1 */
    private String sendTimeFlg1;

    /** ����\���ԗL��2 */
    private String sendTimeFlg2;

    /** ���}�V���g���o�X�L��1 */
    private String shuttleBusFlg1;

    /** ���}�V���g���o�X�L��2 */
    private String shuttleBusFlg2;

    /** �V���g���o�X�^�s����_�}��1 */
    private String shuttleBusMeet1;

    /** �V���g���o�X�^�s����_�}��2 */
    private String shuttleBusMeet2;

    /** �V���g���o�X���l1 */
    private String shuttleBusMemo1;

    /** �V���g���o�X���l2 */
    private String shuttleBusMemo2;

    /** �V���g���o�X�^�s����_����1 */
    private String shuttleBusSend1;

    /** �V���g���o�X�^�s����_����2 */
    private String shuttleBusSend2;

    /** ���}�V���g���o�X�i�Ŋ�w���j1 */
    private String shuttleBusStation1;

    /** ���}�V���g���o�X�i�Ŋ�w���j2 */
    private String shuttleBusStation2;

    /** �V���g���o�X�^�s����_���l1 */
    private String shuttleBusTimeMemo1;

    /** �V���g���o�X�^�s����_���l2 */
    private String shuttleBusTimeMemo2;

    /** �i�q�E���S�敪1 */
    private String stationDiv1;

    /** �i�q�E���S�敪2 */
    private String stationDiv2;

    /** �^�N�V�[���p����1 */
    private String taxiFee1;

    /** �^�N�V�[���p����2 */
    private String taxiFee2;

    /** �^�N�V�[����1 */
    private String taxiTime1;

    /** �^�N�V�[����2 */
    private String taxiTime2;

    /** �o�X����k������1 */
    private String toBusStaTime1;

    /** �o�X����k������2 */
    private String toBusStaTime2;

    /** �w���k������1 */
    private String toStationWalktime1;

    /** �w���k������2 */
    private String toStationWalktime2;

    /** ��ʎ�i�L�� */
    private String trafficFlg;

    /**
     * �ԗ��p�������HIC1���擾���܂��B
     * 
     * @return �ԗ��p�������HIC1
     */
    public String getAccessIc1() {
        return accessIc1;
    }

    /**
     * �ԗ��p����1���擾���܂��B
     * 
     * @return �ԗ��p����1
     */
    public String getAccessTime1() {
        return accessTime1;
    }

    /**
     * �^�N�V�[�����N�x1���擾���܂��B
     * 
     * @return �^�N�V�[�����N�x1
     */
    public String getAnnualTaxiFee1() {
        return annualTaxiFee1;
    }

    /**
     * �^�N�V�[�����N�x2���擾���܂��B
     * 
     * @return �^�N�V�[�����N�x2
     */
    public String getAnnualTaxiFee2() {
        return annualTaxiFee2;
    }

    /**
     * �ԗ��p�����ԓ�1���擾���܂��B
     * 
     * @return �ԗ��p�����ԓ�1
     */
    public String getAutoRoadway1() {
        return autoRoadway1;
    }

    /**
     * �ԗ��p����1���擾���܂��B
     * 
     * @return �ԗ��p����1
     */
    public String getAvailableDistance1() {
        return availableDistance1;
    }

    /**
     * �o�X�s����1���擾���܂��B
     * 
     * @return �o�X�s����1
     */
    public String getBusDestination1() {
        return busDestination1;
    }

    /**
     * �o�X�s����2���擾���܂��B
     * 
     * @return �o�X�s����2
     */
    public String getBusDestination2() {
        return busDestination2;
    }

    /**
     * �o�X�▼1���擾���܂��B
     * 
     * @return �o�X�▼1
     */
    public String getBusStation1() {
        return busStation1;
    }

    /**
     * �o�X�▼2���擾���܂��B
     * 
     * @return �o�X�▼2
     */
    public String getBusStation2() {
        return busStation2;
    }

    /**
     * �o�X���p����1���擾���܂��B
     * 
     * @return �o�X���p����1
     */
    public String getBusTimetable1() {
        return busTimetable1;
    }

    /**
     * �o�X���p����2���擾���܂��B
     * 
     * @return �o�X���p����2
     */
    public String getBusTimetable2() {
        return busTimetable2;
    }

    /**
     * �ԗ��p����1���擾���܂��B
     * 
     * @return �ԗ��p����1
     */
    public String getCarDirection1() {
        return carDirection1;
    }

    /**
     * �ԗ��p�ڕW��1���擾���܂��B
     * 
     * @return �ԗ��p�ڕW��1
     */
    public String getCarTarget1() {
        return carTarget1;
    }

    /**
     * �w�����v�A���L��1���擾���܂��B
     * 
     * @return �w�����v�A���L��1
     */
    public String getContactFlg1() {
        return contactFlg1;
    }

    /**
     * �w�����v�A���L��2���擾���܂��B
     * 
     * @return �w�����v�A���L��2
     */
    public String getContactFlg2() {
        return contactFlg2;
    }

    /**
     * �ԗ��p����1���擾���܂��B
     * 
     * @return �ԗ��p����1
     */
    public String getCountyRoadway1() {
        return countyRoadway1;
    }

    /**
     * �o�����1���擾���܂��B
     * 
     * @return �o�����1
     */
    public String getExitInfo1() {
        return exitInfo1;
    }

    /**
     * �o�����2���擾���܂��B
     * 
     * @return �o�����2
     */
    public String getExitInfo2() {
        return exitInfo2;
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
     * �ԗ��p���ʓ��H1���擾���܂��B
     * 
     * @return �ԗ��p���ʓ��H1
     */
    public String getGenreralRoadway1() {
        return genreralRoadway1;
    }

    /**
     * �ԗ��p�������H1���擾���܂��B
     * 
     * @return �ԗ��p�������H1
     */
    public String getHighway1() {
        return highway1;
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
     * �}���\���ԊJ�n1���擾���܂��B
     * 
     * @return �}���\���ԊJ�n1
     */
    public String getMeetTimeBegin1() {
        return DKikakuWebUtil.buildTime(getMeetTimeBegin1Hour(),
                getMeetTimeBegin1Minute());
    }

    /**
     * �}���\���ԊJ�n1�i���ԁj���擾���܂��B
     * 
     * @return �}���\���ԊJ�n1�i���ԁj
     */
    public String getMeetTimeBegin1Hour() {
        return meetTimeBegin1Hour;
    }

    /**
     * �}���\���ԊJ�n1�i���j���擾���܂��B
     * 
     * @return �}���\���ԊJ�n1�i���j
     */
    public String getMeetTimeBegin1Minute() {
        return meetTimeBegin1Minute;
    }

    /**
     * �}���\���ԊJ�n2���擾���܂��B
     * 
     * @return �}���\���ԊJ�n2
     */
    public String getMeetTimeBegin2() {
        return DKikakuWebUtil.buildTime(getMeetTimeBegin2Hour(),
                getMeetTimeBegin2Minute());
    }

    /**
     * �}���\���ԊJ�n2�i���ԁj���擾���܂��B
     * 
     * @return �}���\���ԊJ�n2�i���ԁj
     */
    public String getMeetTimeBegin2Hour() {
        return meetTimeBegin2Hour;
    }

    /**
     * �}���\���ԊJ�n2�i���j���擾���܂��B
     * 
     * @return �}���\���ԊJ�n2�i���j
     */
    public String getMeetTimeBegin2Minute() {
        return meetTimeBegin2Minute;
    }

    /**
     * �}���\���ԏI��1���擾���܂��B
     * 
     * @return �}���\���ԏI��1
     */
    public String getMeetTimeEnd1() {
        return DKikakuWebUtil.buildTime(getMeetTimeEnd1Hour(),
                getMeetTimeEnd1Minute());
    }

    /**
     * �}���\���ԏI��1�i���ԁj���擾���܂��B
     * 
     * @return �}���\���ԏI��1�i���ԁj
     */
    public String getMeetTimeEnd1Hour() {
        return meetTimeEnd1Hour;
    }

    /**
     * �}���\���ԏI��1�i���j���擾���܂��B
     * 
     * @return �}���\���ԏI��1�i���j
     */
    public String getMeetTimeEnd1Minute() {
        return meetTimeEnd1Minute;
    }

    /**
     * �}���\���ԏI��2���擾���܂��B
     * 
     * @return �}���\���ԏI��2
     */
    public String getMeetTimeEnd2() {
        return DKikakuWebUtil.buildTime(getMeetTimeEnd2Hour(),
                getMeetTimeEnd2Minute());
    }

    /**
     * �}���\���ԏI��2�i���ԁj���擾���܂��B
     * 
     * @return �}���\���ԏI��2�i���ԁj
     */
    public String getMeetTimeEnd2Hour() {
        return meetTimeEnd2Hour;
    }

    /**
     * �}���\���ԏI��2�i���j���擾���܂��B
     * 
     * @return �}���\���ԏI��2�i���j
     */
    public String getMeetTimeEnd2Minute() {
        return meetTimeEnd2Minute;
    }

    /**
     * �}���\���ԗL��1���擾���܂��B
     * 
     * @return �}���\���ԗL��1
     */
    public String getMeetTimeFlg1() {
        return meetTimeFlg1;
    }

    /**
     * �}���\���ԗL��2���擾���܂��B
     * 
     * @return �}���\���ԗL��2
     */
    public String getMeetTimeFlg2() {
        return meetTimeFlg2;
    }

    /**
     * �^�N�V�[������1���擾���܂��B
     * 
     * @return �^�N�V�[������1
     */
    public String getMonthlyTaxiFee1() {
        return monthlyTaxiFee1;
    }

    /**
     * �^�N�V�[������2���擾���܂��B
     * 
     * @return �^�N�V�[������2
     */
    public String getMonthlyTaxiFee2() {
        return monthlyTaxiFee2;
    }

    /**
     * ���}�o�X1���擾���܂��B
     * 
     * @return ���}�o�X1
     */
    public String getMsBus1() {
        return msBus1;
    }

    /**
     * ���}�o�X2���擾���܂��B
     * 
     * @return ���}�o�X2
     */
    public String getMsBus2() {
        return msBus2;
    }

    /**
     * ���}�o�X�L��1���擾���܂��B
     * 
     * @return ���}�o�X�L��1
     */
    public String getMsBusFlg1() {
        return msBusFlg1;
    }

    /**
     * ���}�o�X�L��2���擾���܂��B
     * 
     * @return ���}�o�X�L��2
     */
    public String getMsBusFlg2() {
        return msBusFlg2;
    }

    /**
     * ���}�敪1���擾���܂��B
     * 
     * @return ���}�敪1
     */
    public String getMsDiv1() {
        return msDiv1;
    }

    /**
     * ���}�敪2���擾���܂��B
     * 
     * @return ���}�敪2
     */
    public String getMsDiv2() {
        return msDiv2;
    }

    /**
     * ���}�L��1���擾���܂��B
     * 
     * @return ���}�L��1
     */
    public String getMsFlg1() {
        return msFlg1;
    }

    /**
     * ���}�L��2���擾���܂��B
     * 
     * @return ���}�L��2
     */
    public String getMsFlg2() {
        return msFlg2;
    }

    /**
     * ���}�w1���擾���܂��B
     * 
     * @return ���}�w1
     */
    public String getMsStation1() {
        return msStation1;
    }

    /**
     * ���}�w2���擾���܂��B
     * 
     * @return ���}�w2
     */
    public String getMsStation2() {
        return msStation2;
    }

    /**
     * ���}�w�L��1���擾���܂��B
     * 
     * @return ���}�w�L��1
     */
    public String getMsStationFlg1() {
        return msStationFlg1;
    }

    /**
     * ���}�w�L��2���擾���܂��B
     * 
     * @return ���}�w�L��2
     */
    public String getMsStationFlg2() {
        return msStationFlg2;
    }

    /**
     * �ԗ��p����1���擾���܂��B
     * 
     * @return �ԗ��p����1
     */
    public String getNationalRoadway1() {
        return nationalRoadway1;
    }

    /**
     * �i�q�E���S�Ŋ�w1���擾���܂��B
     * 
     * @return �i�q�E���S�Ŋ�w1
     */
    public String getNearestStation1() {
        return nearestStation1;
    }

    /**
     * �i�q�E���S�Ŋ�w2���擾���܂��B
     * 
     * @return �i�q�E���S�Ŋ�w2
     */
    public String getNearestStation2() {
        return nearestStation2;
    }

    /**
     * ���S�Ŋ�JR�w1���擾���܂��B
     * 
     * @return ���S�Ŋ�JR�w1
     */
    public String getNearestStationPrivate1() {
        return nearestStationPrivate1;
    }

    /**
     * ���S�Ŋ�JR�w2���擾���܂��B
     * 
     * @return ���S�Ŋ�JR�w2
     */
    public String getNearestStationPrivate2() {
        return nearestStationPrivate2;
    }

    /**
     * �\��s�v�L��1���擾���܂��B
     * 
     * @return �\��s�v�L��1
     */
    public String getNoReserveFlg1() {
        return noReserveFlg1;
    }

    /**
     * �\��s�v�L��2���擾���܂��B
     * 
     * @return �\��s�v�L��2
     */
    public String getNoReserveFlg2() {
        return noReserveFlg2;
    }

    /**
     * ���S��Ж��H����1���擾���܂��B
     * 
     * @return ���S��Ж��H����1
     */
    public String getPrivateLineNm1() {
        return privateLineNm1;
    }

    /**
     * ���S��Ж��H����2���擾���܂��B
     * 
     * @return ���S��Ж��H����2
     */
    public String getPrivateLineNm2() {
        return privateLineNm2;
    }

    /**
     * �v�\��R�����g1���擾���܂��B
     * 
     * @return �v�\��R�����g1
     */
    public String getReserveCmt1() {
        return reserveCmt1;
    }

    /**
     * �v�\��R�����g2���擾���܂��B
     * 
     * @return �v�\��R�����g2
     */
    public String getReserveCmt2() {
        return reserveCmt2;
    }

    /**
     * �v�\��敪1���擾���܂��B
     * 
     * @return �v�\��敪1
     */
    public String getReserveDiv1() {
        return reserveDiv1;
    }

    /**
     * �v�\��敪2���擾���܂��B
     * 
     * @return �v�\��敪2
     */
    public String getReserveDiv2() {
        return reserveDiv2;
    }

    /**
     * �v�\��L��1���擾���܂��B
     * 
     * @return �v�\��L��1
     */
    public String getReserveFlg1() {
        return reserveFlg1;
    }

    /**
     * �v�\��L��2���擾���܂��B
     * 
     * @return �v�\��L��2
     */
    public String getReserveFlg2() {
        return reserveFlg2;
    }

    /**
     * ����\���ԊJ�n1���擾���܂��B
     * 
     * @return ����\���ԊJ�n1
     */
    public String getSendTimeBegin1() {
        return DKikakuWebUtil.buildTime(getSendTimeBegin1Hour(),
                getSendTimeBegin1Minute());
    }

    /**
     * ����\���ԊJ�n1�i���ԁj���擾���܂��B
     * 
     * @return ����\���ԊJ�n1�i���ԁj
     */
    public String getSendTimeBegin1Hour() {
        return sendTimeBegin1Hour;
    }

    /**
     * ����\���ԊJ�n1�i���j���擾���܂��B
     * 
     * @return ����\���ԊJ�n1�i���j
     */
    public String getSendTimeBegin1Minute() {
        return sendTimeBegin1Minute;
    }

    /**
     * ����\���ԊJ�n2���擾���܂��B
     * 
     * @return ����\���ԊJ�n2
     */
    public String getSendTimeBegin2() {
        return DKikakuWebUtil.buildTime(getSendTimeBegin2Hour(),
                getSendTimeBegin2Minute());
    }

    /**
     * ����\���ԊJ�n2�i���ԁj���擾���܂��B
     * 
     * @return ����\���ԊJ�n2�i���ԁj
     */
    public String getSendTimeBegin2Hour() {
        return sendTimeBegin2Hour;
    }

    /**
     * ����\���ԊJ�n2�i���j���擾���܂��B
     * 
     * @return ����\���ԊJ�n2�i���j
     */
    public String getSendTimeBegin2Minute() {
        return sendTimeBegin2Minute;
    }

    /**
     * ����\���ԏI��1���擾���܂��B
     * 
     * @return ����\���ԏI��1
     */
    public String getSendTimeEnd1() {
        return DKikakuWebUtil.buildTime(getSendTimeEnd1Hour(),
                getSendTimeEnd1Minute());
    }

    /**
     * ����\���ԏI��1�i���ԁj���擾���܂��B
     * 
     * @return ����\���ԏI��1�i���ԁj
     */
    public String getSendTimeEnd1Hour() {
        return sendTimeEnd1Hour;
    }

    /**
     * ����\���ԏI��1�i���j���擾���܂��B
     * 
     * @return ����\���ԏI��1�i���j
     */
    public String getSendTimeEnd1Minute() {
        return sendTimeEnd1Minute;
    }

    /**
     * ����\���ԏI��2���擾���܂��B
     * 
     * @return ����\���ԏI��2
     */
    public String getSendTimeEnd2() {
        return DKikakuWebUtil.buildTime(getSendTimeEnd2Hour(),
                getSendTimeEnd2Minute());
    }

    /**
     * ����\���ԏI��2�i���ԁj���擾���܂��B
     * 
     * @return ����\���ԏI��2�i���ԁj
     */
    public String getSendTimeEnd2Hour() {
        return sendTimeEnd2Hour;
    }

    /**
     * ����\���ԏI��2�i���j���擾���܂��B
     * 
     * @return ����\���ԏI��2�i���j
     */
    public String getSendTimeEnd2Minute() {
        return sendTimeEnd2Minute;
    }

    /**
     * ����\���ԗL��1���擾���܂��B
     * 
     * @return ����\���ԗL��1
     */
    public String getSendTimeFlg1() {
        return sendTimeFlg1;
    }

    /**
     * ����\���ԗL��2���擾���܂��B
     * 
     * @return ����\���ԗL��2
     */
    public String getSendTimeFlg2() {
        return sendTimeFlg2;
    }

    /**
     * ���}�V���g���o�X�L��1���擾���܂��B
     * 
     * @return ���}�V���g���o�X�L��1
     */
    public String getShuttleBusFlg1() {
        return shuttleBusFlg1;
    }

    /**
     * ���}�V���g���o�X�L��2���擾���܂��B
     * 
     * @return ���}�V���g���o�X�L��2
     */
    public String getShuttleBusFlg2() {
        return shuttleBusFlg2;
    }

    /**
     * �V���g���o�X�^�s����_�}��1���擾���܂��B
     * 
     * @return �V���g���o�X�^�s����_�}��1
     */
    public String getShuttleBusMeet1() {
        return shuttleBusMeet1;
    }

    /**
     * �V���g���o�X�^�s����_�}��2���擾���܂��B
     * 
     * @return �V���g���o�X�^�s����_�}��2
     */
    public String getShuttleBusMeet2() {
        return shuttleBusMeet2;
    }

    /**
     * �V���g���o�X���l1���擾���܂��B
     * 
     * @return �V���g���o�X���l1
     */
    public String getShuttleBusMemo1() {
        return shuttleBusMemo1;
    }

    /**
     * �V���g���o�X���l2���擾���܂��B
     * 
     * @return �V���g���o�X���l2
     */
    public String getShuttleBusMemo2() {
        return shuttleBusMemo2;
    }

    /**
     * �V���g���o�X�^�s����_����1���擾���܂��B
     * 
     * @return �V���g���o�X�^�s����_����1
     */
    public String getShuttleBusSend1() {
        return shuttleBusSend1;
    }

    /**
     * �V���g���o�X�^�s����_����2���擾���܂��B
     * 
     * @return �V���g���o�X�^�s����_����2
     */
    public String getShuttleBusSend2() {
        return shuttleBusSend2;
    }

    /**
     * ���}�V���g���o�X�i�Ŋ�w���j1���擾���܂��B
     * 
     * @return ���}�V���g���o�X�i�Ŋ�w���j1
     */
    public String getShuttleBusStation1() {
        return shuttleBusStation1;
    }

    /**
     * ���}�V���g���o�X�i�Ŋ�w���j2���擾���܂��B
     * 
     * @return ���}�V���g���o�X�i�Ŋ�w���j2
     */
    public String getShuttleBusStation2() {
        return shuttleBusStation2;
    }

    /**
     * �V���g���o�X�^�s����_���l1���擾���܂��B
     * 
     * @return �V���g���o�X�^�s����_���l1
     */
    public String getShuttleBusTimeMemo1() {
        return shuttleBusTimeMemo1;
    }

    /**
     * �V���g���o�X�^�s����_���l2���擾���܂��B
     * 
     * @return �V���g���o�X�^�s����_���l2
     */
    public String getShuttleBusTimeMemo2() {
        return shuttleBusTimeMemo2;
    }

    /**
     * �i�q�E���S�敪1���擾���܂��B
     * 
     * @return �i�q�E���S�敪1
     */
    public String getStationDiv1() {
        return stationDiv1;
    }

    /**
     * �i�q�E���S�敪2���擾���܂��B
     * 
     * @return �i�q�E���S�敪2
     */
    public String getStationDiv2() {
        return stationDiv2;
    }

    /**
     * �^�N�V�[���p����1���擾���܂��B
     * 
     * @return �^�N�V�[���p����1
     */
    public String getTaxiFee1() {
        return taxiFee1;
    }

    /**
     * �^�N�V�[���p����2���擾���܂��B
     * 
     * @return �^�N�V�[���p����2
     */
    public String getTaxiFee2() {
        return taxiFee2;
    }

    /**
     * �^�N�V�[����1���擾���܂��B
     * 
     * @return �^�N�V�[����1
     */
    public String getTaxiTime1() {
        return taxiTime1;
    }

    /**
     * �^�N�V�[����2���擾���܂��B
     * 
     * @return �^�N�V�[����2
     */
    public String getTaxiTime2() {
        return taxiTime2;
    }

    /**
     * �o�X����k������1���擾���܂��B
     * 
     * @return �o�X����k������1
     */
    public String getToBusStaTime1() {
        return toBusStaTime1;
    }

    /**
     * �o�X����k������2���擾���܂��B
     * 
     * @return �o�X����k������2
     */
    public String getToBusStaTime2() {
        return toBusStaTime2;
    }

    /**
     * �w���k������1���擾���܂��B
     * 
     * @return �w���k������1
     */
    public String getToStationWalktime1() {
        return toStationWalktime1;
    }

    /**
     * �w���k������2���擾���܂��B
     * 
     * @return �w���k������2
     */
    public String getToStationWalktime2() {
        return toStationWalktime2;
    }

    /**
     * ��ʎ�i�L�����擾���܂��B
     * 
     * @return ��ʎ�i�L��
     */
    public String getTrafficFlg() {
        return trafficFlg;
    }

    /**
     * �ԗ��p�������HIC1��ݒ肵�܂��B
     * 
     * @param accessIc1
     *            �ԗ��p�������HIC1
     */
    public void setAccessIc1(String accessIc1) {
        this.accessIc1 = accessIc1;
    }

    /**
     * �ԗ��p����1��ݒ肵�܂��B
     * 
     * @param accessTime1
     *            �ԗ��p����1
     */
    public void setAccessTime1(String accessTime1) {
        this.accessTime1 = accessTime1;
    }

    /**
     * �^�N�V�[�����N�x1��ݒ肵�܂��B
     * 
     * @param annualTaxiFee1
     *            �^�N�V�[�����N�x1
     */
    public void setAnnualTaxiFee1(String annualTaxiFee1) {
        this.annualTaxiFee1 = annualTaxiFee1;
    }

    /**
     * �^�N�V�[�����N�x2��ݒ肵�܂��B
     * 
     * @param annualTaxiFee2
     *            �^�N�V�[�����N�x2
     */
    public void setAnnualTaxiFee2(String annualTaxiFee2) {
        this.annualTaxiFee2 = annualTaxiFee2;
    }

    /**
     * �ԗ��p�����ԓ�1��ݒ肵�܂��B
     * 
     * @param autoRoadway1
     *            �ԗ��p�����ԓ�1
     */
    public void setAutoRoadway1(String autoRoadway1) {
        this.autoRoadway1 = autoRoadway1;
    }

    /**
     * �ԗ��p����1��ݒ肵�܂��B
     * 
     * @param availableDistance1
     *            �ԗ��p����1
     */
    public void setAvailableDistance1(String availableDistance1) {
        this.availableDistance1 = availableDistance1;
    }

    /**
     * �o�X�s����1��ݒ肵�܂��B
     * 
     * @param busDestination1
     *            �o�X�s����1
     */
    public void setBusDestination1(String busDestination1) {
        this.busDestination1 = busDestination1;
    }

    /**
     * �o�X�s����2��ݒ肵�܂��B
     * 
     * @param busDestination2
     *            �o�X�s����2
     */
    public void setBusDestination2(String busDestination2) {
        this.busDestination2 = busDestination2;
    }

    /**
     * �o�X�▼1��ݒ肵�܂��B
     * 
     * @param busStation1
     *            �o�X�▼1
     */
    public void setBusStation1(String busStation1) {
        this.busStation1 = busStation1;
    }

    /**
     * �o�X�▼2��ݒ肵�܂��B
     * 
     * @param busStation2
     *            �o�X�▼2
     */
    public void setBusStation2(String busStation2) {
        this.busStation2 = busStation2;
    }

    /**
     * �o�X���p����1��ݒ肵�܂��B
     * 
     * @param busTimetable1
     *            �o�X���p����1
     */
    public void setBusTimetable1(String busTimetable1) {
        this.busTimetable1 = busTimetable1;
    }

    /**
     * �o�X���p����2��ݒ肵�܂��B
     * 
     * @param busTimetable2
     *            �o�X���p����2
     */
    public void setBusTimetable2(String busTimetable2) {
        this.busTimetable2 = busTimetable2;
    }

    /**
     * �ԗ��p����1��ݒ肵�܂��B
     * 
     * @param carDirection1
     *            �ԗ��p����1
     */
    public void setCarDirection1(String carDirection1) {
        this.carDirection1 = carDirection1;
    }

    /**
     * �ԗ��p�ڕW��1��ݒ肵�܂��B
     * 
     * @param carTarget1
     *            �ԗ��p�ڕW��1
     */
    public void setCarTarget1(String carTarget1) {
        this.carTarget1 = carTarget1;
    }

    /**
     * �w�����v�A���L��1��ݒ肵�܂��B
     * 
     * @param contactFlg1
     *            �w�����v�A���L��1
     */
    public void setContactFlg1(String contactFlg1) {
        this.contactFlg1 = contactFlg1;
    }

    /**
     * �w�����v�A���L��2��ݒ肵�܂��B
     * 
     * @param contactFlg2
     *            �w�����v�A���L��2
     */
    public void setContactFlg2(String contactFlg2) {
        this.contactFlg2 = contactFlg2;
    }

    /**
     * �ԗ��p����1��ݒ肵�܂��B
     * 
     * @param countyRoadway1
     *            �ԗ��p����1
     */
    public void setCountyRoadway1(String countyRoadway1) {
        this.countyRoadway1 = countyRoadway1;
    }

    /**
     * �o�����1��ݒ肵�܂��B
     * 
     * @param exitInfo1
     *            �o�����1
     */
    public void setExitInfo1(String exitInfo1) {
        this.exitInfo1 = exitInfo1;
    }

    /**
     * �o�����2��ݒ肵�܂��B
     * 
     * @param exitInfo2
     *            �o�����2
     */
    public void setExitInfo2(String exitInfo2) {
        this.exitInfo2 = exitInfo2;
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
     * �ԗ��p���ʓ��H1��ݒ肵�܂��B
     * 
     * @param genreralRoadway1
     *            �ԗ��p���ʓ��H1
     */
    public void setGenreralRoadway1(String genreralRoadway1) {
        this.genreralRoadway1 = genreralRoadway1;
    }

    /**
     * �ԗ��p�������H1��ݒ肵�܂��B
     * 
     * @param highway1
     *            �ԗ��p�������H1
     */
    public void setHighway1(String highway1) {
        this.highway1 = highway1;
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

    /**
     * �}���\���ԊJ�n1��ݒ肵�܂��B
     * 
     * @param meetTimeBegin1
     *            �}���\���ԊJ�n1
     */
    public void setMeetTimeBegin1(String meetTimeBegin1) {
        setMeetTimeBegin1Hour(DKikakuWebUtil.getHourFormTime(meetTimeBegin1));
        setMeetTimeBegin1Minute(DKikakuWebUtil
                .getMinuteFromTime(meetTimeBegin1));
    }

    /**
     * �}���\���ԊJ�n1�i���ԁj��ݒ肵�܂��B
     * 
     * @param meetTimeBegin1Hour
     *            �}���\���ԊJ�n1�i���ԁj
     */
    public void setMeetTimeBegin1Hour(String meetTimeBegin1Hour) {
        this.meetTimeBegin1Hour = meetTimeBegin1Hour;
    }

    /**
     * �}���\���ԊJ�n1�i���j��ݒ肵�܂��B
     * 
     * @param meetTimeBegin1Minute
     *            �}���\���ԊJ�n1�i���j
     */
    public void setMeetTimeBegin1Minute(String meetTimeBegin1Minute) {
        this.meetTimeBegin1Minute = meetTimeBegin1Minute;
    }

    /**
     * �}���\���ԊJ�n2��ݒ肵�܂��B
     * 
     * @param meetTimeBegin2
     *            �}���\���ԊJ�n2
     */
    public void setMeetTimeBegin2(String meetTimeBegin2) {
        setMeetTimeBegin2Hour(DKikakuWebUtil.getHourFormTime(meetTimeBegin2));
        setMeetTimeBegin2Minute(DKikakuWebUtil
                .getMinuteFromTime(meetTimeBegin2));
    }

    /**
     * �}���\���ԊJ�n2�i���ԁj��ݒ肵�܂��B
     * 
     * @param meetTimeBegin2Hour
     *            �}���\���ԊJ�n2�i���ԁj
     */
    public void setMeetTimeBegin2Hour(String meetTimeBegin2Hour) {
        this.meetTimeBegin2Hour = meetTimeBegin2Hour;
    }

    /**
     * �}���\���ԊJ�n2�i���j��ݒ肵�܂��B
     * 
     * @param meetTimeBegin2Minute
     *            �}���\���ԊJ�n2�i���j
     */
    public void setMeetTimeBegin2Minute(String meetTimeBegin2Minute) {
        this.meetTimeBegin2Minute = meetTimeBegin2Minute;
    }

    /**
     * �}���\���ԏI��1��ݒ肵�܂��B
     * 
     * @param meetTimeEnd1
     *            �}���\���ԏI��1
     */
    public void setMeetTimeEnd1(String meetTimeEnd1) {
        setMeetTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(meetTimeEnd1));
        setMeetTimeEnd1Minute(DKikakuWebUtil.getMinuteFromTime(meetTimeEnd1));
    }

    /**
     * �}���\���ԏI��1�i���ԁj��ݒ肵�܂��B
     * 
     * @param meetTimeEnd1Hour
     *            �}���\���ԏI��1�i���ԁj
     */
    public void setMeetTimeEnd1Hour(String meetTimeEnd1Hour) {
        this.meetTimeEnd1Hour = meetTimeEnd1Hour;
    }

    /**
     * �}���\���ԏI��1�i���j��ݒ肵�܂��B
     * 
     * @param meetTimeEnd1Minute
     *            �}���\���ԏI��1�i���j
     */
    public void setMeetTimeEnd1Minute(String meetTimeEnd1Minute) {
        this.meetTimeEnd1Minute = meetTimeEnd1Minute;
    }

    /**
     * �}���\���ԏI��2��ݒ肵�܂��B
     * 
     * @param meetTimeEnd2
     *            �}���\���ԏI��2
     */
    public void setMeetTimeEnd2(String meetTimeEnd2) {
        setMeetTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(meetTimeEnd2));
        setMeetTimeEnd2Minute(DKikakuWebUtil.getMinuteFromTime(meetTimeEnd2));
    }

    /**
     * �}���\���ԏI��2�i���ԁj��ݒ肵�܂��B
     * 
     * @param meetTimeEnd2Hour
     *            �}���\���ԏI��2�i���ԁj
     */
    public void setMeetTimeEnd2Hour(String meetTimeEnd2Hour) {
        this.meetTimeEnd2Hour = meetTimeEnd2Hour;
    }

    /**
     * �}���\���ԏI��2�i���j��ݒ肵�܂��B
     * 
     * @param meetTimeEnd2Minute
     *            �}���\���ԏI��2�i���j
     */
    public void setMeetTimeEnd2Minute(String meetTimeEnd2Minute) {
        this.meetTimeEnd2Minute = meetTimeEnd2Minute;
    }

    /**
     * �}���\���ԗL��1��ݒ肵�܂��B
     * 
     * @param meetTimeFlg1
     *            �}���\���ԗL��1
     */
    public void setMeetTimeFlg1(String meetTimeFlg1) {
        this.meetTimeFlg1 = meetTimeFlg1;
    }

    /**
     * �}���\���ԗL��2��ݒ肵�܂��B
     * 
     * @param meetTimeFlg2
     *            �}���\���ԗL��2
     */
    public void setMeetTimeFlg2(String meetTimeFlg2) {
        this.meetTimeFlg2 = meetTimeFlg2;
    }

    /**
     * �^�N�V�[������1��ݒ肵�܂��B
     * 
     * @param monthlyTaxiFee1
     *            �^�N�V�[������1
     */
    public void setMonthlyTaxiFee1(String monthlyTaxiFee1) {
        this.monthlyTaxiFee1 = monthlyTaxiFee1;
    }

    /**
     * �^�N�V�[������2��ݒ肵�܂��B
     * 
     * @param monthlyTaxiFee2
     *            �^�N�V�[������2
     */
    public void setMonthlyTaxiFee2(String monthlyTaxiFee2) {
        this.monthlyTaxiFee2 = monthlyTaxiFee2;
    }

    /**
     * ���}�o�X1��ݒ肵�܂��B
     * 
     * @param msBus1
     *            ���}�o�X1
     */
    public void setMsBus1(String msBus1) {
        this.msBus1 = msBus1;
    }

    /**
     * ���}�o�X2��ݒ肵�܂��B
     * 
     * @param msBus2
     *            ���}�o�X2
     */
    public void setMsBus2(String msBus2) {
        this.msBus2 = msBus2;
    }

    /**
     * ���}�o�X�L��1��ݒ肵�܂��B
     * 
     * @param msBusFlg1
     *            ���}�o�X�L��1
     */
    public void setMsBusFlg1(String msBusFlg1) {
        this.msBusFlg1 = msBusFlg1;
    }

    /**
     * ���}�o�X�L��2��ݒ肵�܂��B
     * 
     * @param msBusFlg2
     *            ���}�o�X�L��2
     */
    public void setMsBusFlg2(String msBusFlg2) {
        this.msBusFlg2 = msBusFlg2;
    }

    /**
     * ���}�敪1��ݒ肵�܂��B
     * 
     * @param msDiv1
     *            ���}�敪1
     */
    public void setMsDiv1(String msDiv1) {
        this.msDiv1 = msDiv1;
    }

    /**
     * ���}�敪2��ݒ肵�܂��B
     * 
     * @param msDiv2
     *            ���}�敪2
     */
    public void setMsDiv2(String msDiv2) {
        this.msDiv2 = msDiv2;
    }

    /**
     * ���}�L��1��ݒ肵�܂��B
     * 
     * @param msFlg1
     *            ���}�L��1
     */
    public void setMsFlg1(String msFlg1) {
        this.msFlg1 = msFlg1;
    }

    /**
     * ���}�L��2��ݒ肵�܂��B
     * 
     * @param msFlg2
     *            ���}�L��2
     */
    public void setMsFlg2(String msFlg2) {
        this.msFlg2 = msFlg2;
    }

    /**
     * ���}�w1��ݒ肵�܂��B
     * 
     * @param msStation1
     *            ���}�w1
     */
    public void setMsStation1(String msStation1) {
        this.msStation1 = msStation1;
    }

    /**
     * ���}�w2��ݒ肵�܂��B
     * 
     * @param msStation2
     *            ���}�w2
     */
    public void setMsStation2(String msStation2) {
        this.msStation2 = msStation2;
    }

    /**
     * ���}�w�L��1��ݒ肵�܂��B
     * 
     * @param msStationFlg1
     *            ���}�w�L��1
     */
    public void setMsStationFlg1(String msStationFlg1) {
        this.msStationFlg1 = msStationFlg1;
    }

    /**
     * ���}�w�L��2��ݒ肵�܂��B
     * 
     * @param msStationFlg2
     *            ���}�w�L��2
     */
    public void setMsStationFlg2(String msStationFlg2) {
        this.msStationFlg2 = msStationFlg2;
    }

    /**
     * �ԗ��p����1��ݒ肵�܂��B
     * 
     * @param nationalRoadway1
     *            �ԗ��p����1
     */
    public void setNationalRoadway1(String nationalRoadway1) {
        this.nationalRoadway1 = nationalRoadway1;
    }

    /**
     * �i�q�E���S�Ŋ�w1��ݒ肵�܂��B
     * 
     * @param nearestStation1
     *            �i�q�E���S�Ŋ�w1
     */
    public void setNearestStation1(String nearestStation1) {
        this.nearestStation1 = nearestStation1;
    }

    /**
     * �i�q�E���S�Ŋ�w2��ݒ肵�܂��B
     * 
     * @param nearestStation2
     *            �i�q�E���S�Ŋ�w2
     */
    public void setNearestStation2(String nearestStation2) {
        this.nearestStation2 = nearestStation2;
    }

    /**
     * ���S�Ŋ�JR�w1��ݒ肵�܂��B
     * 
     * @param nearestStationPrivate1
     *            ���S�Ŋ�JR�w1
     */
    public void setNearestStationPrivate1(String nearestStationPrivate1) {
        this.nearestStationPrivate1 = nearestStationPrivate1;
    }

    /**
     * ���S�Ŋ�JR�w2��ݒ肵�܂��B
     * 
     * @param nearestStationPrivate2
     *            ���S�Ŋ�JR�w2
     */
    public void setNearestStationPrivate2(String nearestStationPrivate2) {
        this.nearestStationPrivate2 = nearestStationPrivate2;
    }

    /**
     * �\��s�v�L��1��ݒ肵�܂��B
     * 
     * @param noReserveFlg1
     *            �\��s�v�L��1
     */
    public void setNoReserveFlg1(String noReserveFlg1) {
        this.noReserveFlg1 = noReserveFlg1;
    }

    /**
     * �\��s�v�L��2��ݒ肵�܂��B
     * 
     * @param noReserveFlg2
     *            �\��s�v�L��2
     */
    public void setNoReserveFlg2(String noReserveFlg2) {
        this.noReserveFlg2 = noReserveFlg2;
    }

    /**
     * ���S��Ж��H����1��ݒ肵�܂��B
     * 
     * @param privateLineNm1
     *            ���S��Ж��H����1
     */
    public void setPrivateLineNm1(String privateLineNm1) {
        this.privateLineNm1 = privateLineNm1;
    }

    /**
     * ���S��Ж��H����2��ݒ肵�܂��B
     * 
     * @param privateLineNm2
     *            ���S��Ж��H����2
     */
    public void setPrivateLineNm2(String privateLineNm2) {
        this.privateLineNm2 = privateLineNm2;
    }

    /**
     * �v�\��R�����g1��ݒ肵�܂��B
     * 
     * @param reserveCmt1
     *            �v�\��R�����g1
     */
    public void setReserveCmt1(String reserveCmt1) {
        this.reserveCmt1 = reserveCmt1;
    }

    /**
     * �v�\��R�����g2��ݒ肵�܂��B
     * 
     * @param reserveCmt2
     *            �v�\��R�����g2
     */
    public void setReserveCmt2(String reserveCmt2) {
        this.reserveCmt2 = reserveCmt2;
    }

    /**
     * �v�\��敪1��ݒ肵�܂��B
     * 
     * @param reserveDiv1
     *            �v�\��敪1
     */
    public void setReserveDiv1(String reserveDiv1) {
        this.reserveDiv1 = reserveDiv1;
    }

    /**
     * �v�\��敪2��ݒ肵�܂��B
     * 
     * @param reserveDiv2
     *            �v�\��敪2
     */
    public void setReserveDiv2(String reserveDiv2) {
        this.reserveDiv2 = reserveDiv2;
    }

    /**
     * �v�\��L��1��ݒ肵�܂��B
     * 
     * @param reserveFlg1
     *            �v�\��L��1
     */
    public void setReserveFlg1(String reserveFlg1) {
        this.reserveFlg1 = reserveFlg1;
    }

    /**
     * �v�\��L��2��ݒ肵�܂��B
     * 
     * @param reserveFlg2
     *            �v�\��L��2
     */
    public void setReserveFlg2(String reserveFlg2) {
        this.reserveFlg2 = reserveFlg2;
    }

    /**
     * ����\���ԊJ�n1��ݒ肵�܂��B
     * 
     * @param sendTimeBegin1
     *            ����\���ԊJ�n1
     */
    public void setSendTimeBegin1(String sendTimeBegin1) {
        setSendTimeBegin1Hour(DKikakuWebUtil.getHourFormTime(sendTimeBegin1));
        setSendTimeBegin1Minute(DKikakuWebUtil
                .getMinuteFromTime(sendTimeBegin1));
    }

    /**
     * ����\���ԊJ�n1�i���ԁj��ݒ肵�܂��B
     * 
     * @param sendTimeBegin1Hour
     *            ����\���ԊJ�n1�i���ԁj
     */
    public void setSendTimeBegin1Hour(String sendTimeBegin1Hour) {
        this.sendTimeBegin1Hour = sendTimeBegin1Hour;
    }

    /**
     * ����\���ԊJ�n1�i���j��ݒ肵�܂��B
     * 
     * @param sendTimeBegin1Minute
     *            ����\���ԊJ�n1�i���j
     */
    public void setSendTimeBegin1Minute(String sendTimeBegin1Minute) {
        this.sendTimeBegin1Minute = sendTimeBegin1Minute;
    }

    /**
     * ����\���ԊJ�n2��ݒ肵�܂��B
     * 
     * @param sendTimeBegin2
     *            ����\���ԊJ�n2
     */
    public void setSendTimeBegin2(String sendTimeBegin2) {
        setSendTimeBegin2Hour(DKikakuWebUtil.getHourFormTime(sendTimeBegin2));
        setSendTimeBegin2Minute(DKikakuWebUtil
                .getMinuteFromTime(sendTimeBegin2));
    }

    /**
     * ����\���ԊJ�n2�i���ԁj��ݒ肵�܂��B
     * 
     * @param sendTimeBegin2Hour
     *            ����\���ԊJ�n2�i���ԁj
     */
    public void setSendTimeBegin2Hour(String sendTimeBegin2Hour) {
        this.sendTimeBegin2Hour = sendTimeBegin2Hour;
    }

    /**
     * ����\���ԊJ�n2�i���j��ݒ肵�܂��B
     * 
     * @param sendTimeBegin2Minute
     *            ����\���ԊJ�n2�i���j
     */
    public void setSendTimeBegin2Minute(String sendTimeBegin2Minute) {
        this.sendTimeBegin2Minute = sendTimeBegin2Minute;
    }

    /**
     * ����\���ԏI��1��ݒ肵�܂��B
     * 
     * @param sendTimeEnd1
     *            ����\���ԏI��1
     */
    public void setSendTimeEnd1(String sendTimeEnd1) {
        setSendTimeEnd1Hour(DKikakuWebUtil.getHourFormTime(sendTimeEnd1));
        setSendTimeEnd1Minute(DKikakuWebUtil.getMinuteFromTime(sendTimeEnd1));
    }

    /**
     * ����\���ԏI��1�i���ԁj��ݒ肵�܂��B
     * 
     * @param sendTimeEnd1Hour
     *            ����\���ԏI��1�i���ԁj
     */
    public void setSendTimeEnd1Hour(String sendTimeEnd1Hour) {
        this.sendTimeEnd1Hour = sendTimeEnd1Hour;
    }

    /**
     * ����\���ԏI��1�i���j��ݒ肵�܂��B
     * 
     * @param sendTimeEnd1Minute
     *            ����\���ԏI��1�i���j
     */
    public void setSendTimeEnd1Minute(String sendTimeEnd1Minute) {
        this.sendTimeEnd1Minute = sendTimeEnd1Minute;
    }

    /**
     * ����\���ԏI��2��ݒ肵�܂��B
     * 
     * @param sendTimeEnd2
     *            ����\���ԏI��2
     */
    public void setSendTimeEnd2(String sendTimeEnd2) {
        setSendTimeEnd2Hour(DKikakuWebUtil.getHourFormTime(sendTimeEnd2));
        setSendTimeEnd2Minute(DKikakuWebUtil.getMinuteFromTime(sendTimeEnd2));
    }

    /**
     * ����\���ԏI��2�i���ԁj��ݒ肵�܂��B
     * 
     * @param sendTimeEnd2Hour
     *            ����\���ԏI��2�i���ԁj
     */
    public void setSendTimeEnd2Hour(String sendTimeEnd2Hour) {
        this.sendTimeEnd2Hour = sendTimeEnd2Hour;
    }

    /**
     * ����\���ԏI��2�i���j��ݒ肵�܂��B
     * 
     * @param sendTimeEnd2Minute
     *            ����\���ԏI��2�i���j
     */
    public void setSendTimeEnd2Minute(String sendTimeEnd2Minute) {
        this.sendTimeEnd2Minute = sendTimeEnd2Minute;
    }

    /**
     * ����\���ԗL��1��ݒ肵�܂��B
     * 
     * @param sendTimeFlg1
     *            ����\���ԗL��1
     */
    public void setSendTimeFlg1(String sendTimeFlg1) {
        this.sendTimeFlg1 = sendTimeFlg1;
    }

    /**
     * ����\���ԗL��2��ݒ肵�܂��B
     * 
     * @param sendTimeFlg2
     *            ����\���ԗL��2
     */
    public void setSendTimeFlg2(String sendTimeFlg2) {
        this.sendTimeFlg2 = sendTimeFlg2;
    }

    /**
     * ���}�V���g���o�X�L��1��ݒ肵�܂��B
     * 
     * @param shuttleBusFlg1
     *            ���}�V���g���o�X�L��1
     */
    public void setShuttleBusFlg1(String shuttleBusFlg1) {
        this.shuttleBusFlg1 = shuttleBusFlg1;
    }

    /**
     * ���}�V���g���o�X�L��2��ݒ肵�܂��B
     * 
     * @param shuttleBusFlg2
     *            ���}�V���g���o�X�L��2
     */
    public void setShuttleBusFlg2(String shuttleBusFlg2) {
        this.shuttleBusFlg2 = shuttleBusFlg2;
    }

    /**
     * �V���g���o�X�^�s����_�}��1��ݒ肵�܂��B
     * 
     * @param shuttleBusMeet1
     *            �V���g���o�X�^�s����_�}��1
     */
    public void setShuttleBusMeet1(String shuttleBusMeet1) {
        this.shuttleBusMeet1 = shuttleBusMeet1;
    }

    /**
     * �V���g���o�X�^�s����_�}��2��ݒ肵�܂��B
     * 
     * @param shuttleBusMeet2
     *            �V���g���o�X�^�s����_�}��2
     */
    public void setShuttleBusMeet2(String shuttleBusMeet2) {
        this.shuttleBusMeet2 = shuttleBusMeet2;
    }

    /**
     * �V���g���o�X���l1��ݒ肵�܂��B
     * 
     * @param shuttleBusMemo1
     *            �V���g���o�X���l1
     */
    public void setShuttleBusMemo1(String shuttleBusMemo1) {
        this.shuttleBusMemo1 = shuttleBusMemo1;
    }

    /**
     * �V���g���o�X���l2��ݒ肵�܂��B
     * 
     * @param shuttleBusMemo2
     *            �V���g���o�X���l2
     */
    public void setShuttleBusMemo2(String shuttleBusMemo2) {
        this.shuttleBusMemo2 = shuttleBusMemo2;
    }

    /**
     * �V���g���o�X�^�s����_����1��ݒ肵�܂��B
     * 
     * @param shuttleBusSend1
     *            �V���g���o�X�^�s����_����1
     */
    public void setShuttleBusSend1(String shuttleBusSend1) {
        this.shuttleBusSend1 = shuttleBusSend1;
    }

    /**
     * �V���g���o�X�^�s����_����2��ݒ肵�܂��B
     * 
     * @param shuttleBusSend2
     *            �V���g���o�X�^�s����_����2
     */
    public void setShuttleBusSend2(String shuttleBusSend2) {
        this.shuttleBusSend2 = shuttleBusSend2;
    }

    /**
     * ���}�V���g���o�X�i�Ŋ�w���j1��ݒ肵�܂��B
     * 
     * @param shuttleBusStation1
     *            ���}�V���g���o�X�i�Ŋ�w���j1
     */
    public void setShuttleBusStation1(String shuttleBusStation1) {
        this.shuttleBusStation1 = shuttleBusStation1;
    }

    /**
     * ���}�V���g���o�X�i�Ŋ�w���j2��ݒ肵�܂��B
     * 
     * @param shuttleBusStation2
     *            ���}�V���g���o�X�i�Ŋ�w���j2
     */
    public void setShuttleBusStation2(String shuttleBusStation2) {
        this.shuttleBusStation2 = shuttleBusStation2;
    }

    /**
     * �V���g���o�X�^�s����_���l1��ݒ肵�܂��B
     * 
     * @param shuttleBusTimeMemo1
     *            �V���g���o�X�^�s����_���l1
     */
    public void setShuttleBusTimeMemo1(String shuttleBusTimeMemo1) {
        this.shuttleBusTimeMemo1 = shuttleBusTimeMemo1;
    }

    /**
     * �V���g���o�X�^�s����_���l2��ݒ肵�܂��B
     * 
     * @param shuttleBusTimeMemo2
     *            �V���g���o�X�^�s����_���l2
     */
    public void setShuttleBusTimeMemo2(String shuttleBusTimeMemo2) {
        this.shuttleBusTimeMemo2 = shuttleBusTimeMemo2;
    }

    /**
     * �i�q�E���S�敪1��ݒ肵�܂��B
     * 
     * @param stationDiv1
     *            �i�q�E���S�敪1
     */
    public void setStationDiv1(String stationDiv1) {
        this.stationDiv1 = stationDiv1;
    }

    /**
     * �i�q�E���S�敪2��ݒ肵�܂��B
     * 
     * @param stationDiv2
     *            �i�q�E���S�敪2
     */
    public void setStationDiv2(String stationDiv2) {
        this.stationDiv2 = stationDiv2;
    }

    /**
     * �^�N�V�[���p����1��ݒ肵�܂��B
     * 
     * @param taxiFee1
     *            �^�N�V�[���p����1
     */
    public void setTaxiFee1(String taxiFee1) {
        this.taxiFee1 = taxiFee1;
    }

    /**
     * �^�N�V�[���p����2��ݒ肵�܂��B
     * 
     * @param taxiFee2
     *            �^�N�V�[���p����2
     */
    public void setTaxiFee2(String taxiFee2) {
        this.taxiFee2 = taxiFee2;
    }

    /**
     * �^�N�V�[����1��ݒ肵�܂��B
     * 
     * @param taxiTime1
     *            �^�N�V�[����1
     */
    public void setTaxiTime1(String taxiTime1) {
        this.taxiTime1 = taxiTime1;
    }

    /**
     * �^�N�V�[����2��ݒ肵�܂��B
     * 
     * @param taxiTime2
     *            �^�N�V�[����2
     */
    public void setTaxiTime2(String taxiTime2) {
        this.taxiTime2 = taxiTime2;
    }

    /**
     * �o�X����k������1��ݒ肵�܂��B
     * 
     * @param toBusStaTime1
     *            �o�X����k������1
     */
    public void setToBusStaTime1(String toBusStaTime1) {
        this.toBusStaTime1 = toBusStaTime1;
    }

    /**
     * �o�X����k������2��ݒ肵�܂��B
     * 
     * @param toBusStaTime2
     *            �o�X����k������2
     */
    public void setToBusStaTime2(String toBusStaTime2) {
        this.toBusStaTime2 = toBusStaTime2;
    }

    /**
     * �w���k������1��ݒ肵�܂��B
     * 
     * @param toStationWalktime1
     *            �w���k������1
     */
    public void setToStationWalktime1(String toStationWalktime1) {
        this.toStationWalktime1 = toStationWalktime1;
    }

    /**
     * �w���k������2��ݒ肵�܂��B
     * 
     * @param toStationWalktime2
     *            �w���k������2
     */
    public void setToStationWalktime2(String toStationWalktime2) {
        this.toStationWalktime2 = toStationWalktime2;
    }

    /**
     * ��ʎ�i�L����ݒ肵�܂��B
     * 
     * @param trafficFlg
     *            ��ʎ�i�L��
     */
    public void setTrafficFlg(String trafficFlg) {
        this.trafficFlg = trafficFlg;
    }

}
