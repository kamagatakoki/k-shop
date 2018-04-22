package jp.co.jreast.common.data.ddata; // SUPPRESS CHECKSTYLE (�񐔂��������ߍs���팸�s��)

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]�{��_���t�g_�X�L�[ �G���e�B�e�B
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
public class DFacilityLiftSki implements FacilityManageBodyKey {

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �{�݃p�^�[�� */
    private String facilityPattern;

    /** �񓚏���� */
    private String kindFlg;

    /** ���t�g�����ӎ��� */
    private String liftAttentionContent;

    /** ���t�g�c��_����_�c�Ɠ� */
    private String liftBsMorningDay;

    /** ���t�g�c��_����_�I�����ԁi���ԁj */
    private String liftBsMorningEndHour;

    /** ���t�g�c��_����_�I�����ԁi���j */
    private String liftBsMorningEndMinute;

    /** ���t�g�c��_����_�L�� */
    private String liftBsMorningFlg;

    /** ���t�g�c��_����_�J�n���ԁi���ԁj */
    private String liftBsMorningStartHour;

    /** ���t�g�c��_����_�J�n���ԁi���j */
    private String liftBsMorningStartMinute;

    /** ���t�g�c��_�i�C�^�[_�c�Ɠ� */
    private String liftBsNightDay;

    /** ���t�g�c��_�i�C�^�[_�I�����ԁi���ԁj */
    private String liftBsNightEndHour;

    /** ���t�g�c��_�i�C�^�[_�I�����ԁi���j */
    private String liftBsNightEndMinute;

    /** ���t�g�c��_�i�C�^�[_�L�� */
    private String liftBsNightFlg;

    /** ���t�g�c��_�i�C�^�[_�J�n���ԁi���ԁj */
    private String liftBsNightStartHour;

    /** ���t�g�c��_�i�C�^�[_�J�n���ԁi���j */
    private String liftBsNightStartMinute;

    /** ���t�g�c��_�ʏ�_�I�����ԁi���ԁj */
    private String liftBsNomalEndHour;

    /** ���t�g�c��_�ʏ�_�I�����ԁi���j */
    private String liftBsNomalEndMinute;

    /** ���t�g�c��_�ʏ�_�J�n���ԁi���ԁj */
    private String liftBsNomalStartHour;

    /** ���t�g�c��_�ʏ�_�J�n���ԁi���j */
    private String liftBsNomalStartMinute;

    /** ���t�g�c��_�X�L�[�ꖼ */
    private String liftBsSkiNm;

    /** ���t�g��������_���@ */
    private String liftChWayFlg;

    /** ���t�g��������_���̑����e */
    private String liftChWayOtherContent;

    /** ���t�g���̔�_��l_�тイ�����z�P */
    private String liftSlAdultByu1;

    /** ���t�g���̔�_��l_�тイ�����z�Q */
    private String liftSlAdultByu2;

    /** ���t�g���̔�_��l_�����z�P */
    private String liftSlAdultDiscount1;

    /** ���t�g���̔�_��l_�����z�Q */
    private String liftSlAdultDiscount2;

    /** ���t�g���̔�_��l_����P */
    private String liftSlAdultKind1;

    /** ���t�g���̔�_��l_����Q */
    private String liftSlAdultKind2;

    /** ���t�g���̔�_��l_�ʏ�z�P */
    private String liftSlAdultNomal1;

    /** ���t�g���̔�_��l_�ʏ�z�Q */
    private String liftSlAdultNomal2;

    /** ���t�g���̔�_���l_�тイ�����z�P */
    private String liftSlChildByu1;

    /** ���t�g���̔�_���l_�тイ�����z�Q */
    private String liftSlChildByu2;

    /** ���t�g���̔�_���l_�����z�P */
    private String liftSlChildDiscount1;

    /** ���t�g���̔�_���l_�����z�Q */
    private String liftSlChildDiscount2;

    /** ���t�g���̔�_���l_����P */
    private String liftSlChildKind1;

    /** ���t�g���̔�_���l_����Q */
    private String liftSlChildKind2;

    /** ���t�g���̔�_���l_�ʏ�z�P */
    private String liftSlChildNomal1;

    /** ���t�g���̔�_���l_�ʏ�z�Q */
    private String liftSlChildNomal2;

    /** ���t�g���̔�_�X�L�[�ꖼ */
    private String liftSlSkiNm;

    /** ���t�g����܂�_�L�� */
    private String liftTkContainFlg;

    /** ���t�g���� */
    private String liftTkKind;

    /** ���t�g����_���̑����e */
    private String liftTkOtherContent;

    /** ���t�g����܂�_�X�L�[�ꖼ */
    private String liftTkSkiNm;

    /** ���t�g���L��_�A�����i�C�^�[ */
    private String liftYkBackNight;

    /** ���t�g���L��_���[�v�E�F�C */
    private String liftYkCable;

    /** ���t�g���L��_�S���h�� */
    private String liftYkGondola;

    /** ���t�g���L��_���� */
    private String liftYkMorning;

    /** ���t�g���L��_���̑� */
    private String liftYkOther;

    /** ���t�g���L��_���̑����e */
    private String liftYkOtherContent;

    /** ���t�g���L��_�h�����i�C�^�[ */
    private String liftYkStayNight;

    /** �����^���X�m�[�{�[�h_�P��_��l_�����O */
    private String rentBdDayAdult1;

    /** �����^���X�m�[�{�[�h_�P��_��l_������ */
    private String rentBdDayAdult2;

    /** �����^���X�m�[�{�[�h_�P��_���l_�����O */
    private String rentBdDayChild1;

    /** �����^���X�m�[�{�[�h_�P��_���l_������ */
    private String rentBdDayChild2;

    /** �����^���X�m�[�{�[�h_�����L�� */
    private String rentBdDiscountFlg;

    /** �����^���X�m�[�{�[�h_����_��l_�����O */
    private String rentBdHalfAdult1;

    /** �����^���X�m�[�{�[�h_����_��l_������ */
    private String rentBdHalfAdult2;

    /** �����^���X�m�[�{�[�h_����_���l_�����O */
    private String rentBdHalfChild1;

    /** �����^���X�m�[�{�[�h_����_���l_������ */
    private String rentBdHalfChild2;

    /** �����^���X�m�[�{�[�h_����_��l_�����O */
    private String rentBdSpAdult1;

    /** �����^���X�m�[�{�[�h_����_��l_������ */
    private String rentBdSpAdult2;

    /** �����^���X�m�[�{�[�h_����_���l_�����O */
    private String rentBdSpChild1;

    /** �����^���X�m�[�{�[�h_����_���l_������ */
    private String rentBdSpChild2;

    /** �����^���X�m�[�{�[�h_���茔�� */
    private String rentBdSpKind;

    /** �����^���X�m�[�{�[�h_�݌ɗL�� */
    private String rentBdStockFlg;

    /** �����^���{�[�h�E�F�A_�P��_��l_�����O */
    private String rentBdwDayAdult1;

    /** �����^���{�[�h�E�F�A_�P��_��l_������ */
    private String rentBdwDayAdult2;

    /** �����^���{�[�h�E�F�A_�P��_���l_�����O */
    private String rentBdwDayChild1;

    /** �����^���{�[�h�E�F�A_�P��_���l_������ */
    private String rentBdwDayChild2;

    /** �����^���{�[�h�E�F�A_�����L�� */
    private String rentBdwDiscountFlg;

    /** �����^���{�[�h�E�F�A_����_��l_�����O */
    private String rentBdwHalfAdult1;

    /** �����^���{�[�h�E�F�A_����_��l_������ */
    private String rentBdwHalfAdult2;

    /** �����^���{�[�h�E�F�A_����_���l_�����O */
    private String rentBdwHalfChild1;

    /** �����^���{�[�h�E�F�A_����_���l_������ */
    private String rentBdwHalfChild2;

    /** �����^���{�[�h�E�F�A_����_��l_�����O */
    private String rentBdwSpAdult1;

    /** �����^���{�[�h�E�F�A_����_��l_������ */
    private String rentBdwSpAdult2;

    /** �����^���{�[�h�E�F�A_����_���l_�����O */
    private String rentBdwSpChild1;

    /** �����^���{�[�h�E�F�A_����_���l_������ */
    private String rentBdwSpChild2;

    /** �����^���{�[�h�E�F�A_���茔�� */
    private String rentBdwSpKind;

    /** �����^���{�[�h�E�F�A_�݌ɗL�� */
    private String rentBdwStockFlg;

    /** �����^�������L�� */
    private String rentChageFlg;

    /** �����^���J�[�r���O_�P��_��l_�����O */
    private String rentCvDayAdult1;

    /** �����^���J�[�r���O_�P��_��l_������ */
    private String rentCvDayAdult2;

    /** �����^���J�[�r���O_�P��_���l_�����O */
    private String rentCvDayChild1;

    /** �����^���J�[�r���O_�P��_���l_������ */
    private String rentCvDayChild2;

    /** �����^���J�[�r���O_�����L�� */
    private String rentCvDiscountFlg;

    /** �����^���J�[�r���O_����_��l_�����O */
    private String rentCvHalfAdult1;

    /** �����^���J�[�r���O_����_��l_������ */
    private String rentCvHalfAdult2;

    /** �����^���J�[�r���O_����_���l_�����O */
    private String rentCvHalfChild1;

    /** �����^���J�[�r���O_����_���l_������ */
    private String rentCvHalfChild2;

    /** �����^���J�[�r���O_����_��l_�����O */
    private String rentCvSpAdult1;

    /** �����^���J�[�r���O_����_��l_������ */
    private String rentCvSpAdult2;

    /** �����^���J�[�r���O_����_���l_�����O */
    private String rentCvSpChild1;

    /** �����^���J�[�r���O_����_���l_������ */
    private String rentCvSpChild2;

    /** �����^���J�[�r���O_���茔�� */
    private String rentCvSpKind;

    /** �����^���J�[�r���O_�݌ɗL�� */
    private String rentCvStockFlg;

    /** �t�@���X�L�[�����^�������� */
    private String rentFsChargeFlg;

    /** �t�@���X�L�[�����^���L�� */
    private String rentFsFlg;

    /** �����^��_�\�����@ */
    private String rentRequestWay;

    /** �����^���X�L�[_�P��_��l_�����O */
    private String rentSkiDayAdult1;

    /** �����^���X�L�[_�P��_��l_������ */
    private String rentSkiDayAdult2;

    /** �����^���X�L�[_�P��_���l_�����O */
    private String rentSkiDayChild1;

    /** �����^���X�L�[_�P��_���l_������ */
    private String rentSkiDayChild2;

    /** �����^���X�L�[_�����L�� */
    private String rentSkiDiscountFlg;

    /** �����^���X�L�[_����_��l_�����O */
    private String rentSkiHalfAdult1;

    /** �����^���X�L�[_����_��l_������ */
    private String rentSkiHalfAdult2;

    /** �����^���X�L�[_����_���l_�����O */
    private String rentSkiHalfChild1;

    /** �����^���X�L�[_����_���l_������ */
    private String rentSkiHalfChild2;

    /** �����^������_���l */
    private String rentSkiPriceMemo;

    /** �����^���X�L�[_����_��l_�����O */
    private String rentSkiSpAdult1;

    /** �����^���X�L�[_����_��l_������ */
    private String rentSkiSpAdult2;

    /** �����^���X�L�[_����_���l_�����O */
    private String rentSkiSpChild1;

    /** �����^���X�L�[_����_���l_������ */
    private String rentSkiSpChild2;

    /** �����^���X�L�[_���茔�� */
    private String rentSkiSpKind;

    /** �����^���X�L�[_�݌ɗL�� */
    private String rentSkiStockFlg;

    /** �����^���X�L�[�E�F�A_�P��_��l_�����O */
    private String rentSkiwDayAdult1;

    /** �����^���X�L�[�E�F�A_�P��_��l_������ */
    private String rentSkiwDayAdult2;

    /** �����^���X�L�[�E�F�A_�P��_���l_�����O */
    private String rentSkiwDayChild1;

    /** �����^���X�L�[�E�F�A_�P��_���l_������ */
    private String rentSkiwDayChild2;

    /** �����^���X�L�[�E�F�A_�����L�� */
    private String rentSkiwDiscountFlg;

    /** �����^���X�L�[�E�F�A_����_��l_�����O */
    private String rentSkiwHalfAdult1;

    /** �����^���X�L�[�E�F�A_����_��l_������ */
    private String rentSkiwHalfAdult2;

    /** �����^���X�L�[�E�F�A_����_���l_�����O */
    private String rentSkiwHalfChild1;

    /** �����^���X�L�[�E�F�A_����_���l_������ */
    private String rentSkiwHalfChild2;

    /** �����^���X�L�[�E�F�A_����_��l_�����O */
    private String rentSkiwSpAdult1;

    /** �����^���X�L�[�E�F�A_����_��l_������ */
    private String rentSkiwSpAdult2;

    /** �����^���X�L�[�E�F�A_����_���l_�����O */
    private String rentSkiwSpChild1;

    /** �����^���X�L�[�E�F�A_����_���l_������ */
    private String rentSkiwSpChild2;

    /** �����^���X�L�[�E�F�A_���茔�� */
    private String rentSkiwSpKind;

    /** �����^���X�L�[�E�F�A_�݌ɗL�� */
    private String rentSkiwStockFlg;

    /** �X�N�[���{�[�h_�P��_��l_�����O */
    private String schoolBdDayAdult1;

    /** �X�N�[���{�[�h_�P��_��l_������ */
    private String schoolBdDayAdult2;

    /** �X�N�[���{�[�h_�P��_���l_�����O */
    private String schoolBdDayChild1;

    /** �X�N�[���{�[�h_�P��_���l_������ */
    private String schoolBdDayChild2;

    /** �X�N�[���{�[�h_�����L�� */
    private String schoolBdDiscountFlg;

    /** �X�N�[���{�[�h_����_��l_�����O */
    private String schoolBdHalfAdult1;

    /** �X�N�[���{�[�h_����_��l_������ */
    private String schoolBdHalfAdult2;

    /** �X�N�[���{�[�h_����_���l_�����O */
    private String schoolBdHalfChild1;

    /** �X�N�[���{�[�h_����_���l_������ */
    private String schoolBdHalfChild2;

    /** �X�N�[���{�[�h_����P_��l_�����O */
    private String schoolBdTime1Adult1;

    /** �X�N�[���{�[�h_����P_��l_������ */
    private String schoolBdTime1Adult2;

    /** �X�N�[���{�[�h_����P_���l_�����O */
    private String schoolBdTime1Child1;

    /** �X�N�[���{�[�h_����P_���l_������ */
    private String schoolBdTime1Child2;

    /** �X�N�[���{�[�h_����P_���� */
    private String schoolBdTime1Hh;

    /** �X�N�[���{�[�h_����P_�� */
    private String schoolBdTime1Mm;

    /** �X�N�[���{�[�h_����Q_��l_�����O */
    private String schoolBdTime2Adult1;

    /** �X�N�[���{�[�h_����Q_��l_������ */
    private String schoolBdTime2Adult2;

    /** �X�N�[���{�[�h_����Q_���l_�����O */
    private String schoolBdTime2Child1;

    /** �X�N�[���{�[�h_����Q_���l_������ */
    private String schoolBdTime2Child2;

    /** �X�N�[���{�[�h_����Q_���� */
    private String schoolBdTime2Hh;

    /** �X�N�[���{�[�h_����Q_�� */
    private String schoolBdTime2Mm;

    /** �X�N�[��_���̑����e */
    private String schoolOtherContent;

    /** �X�N�[������_���l */
    private String schoolPriceMemo;

    /** �X�N�[��_�\�����@ */
    private String schoolRequestWay;

    /** �X�N�[���X�L�[_�P��_��l_�����O */
    private String schoolSkiDayAdult1;

    /** �X�N�[���X�L�[_�P��_��l_������ */
    private String schoolSkiDayAdult2;

    /** �X�N�[���X�L�[_�P��_���l_�����O */
    private String schoolSkiDayChild1;

    /** �X�N�[���X�L�[_�P��_���l_������ */
    private String schoolSkiDayChild2;

    /** �X�N�[���X�L�[_�����L�� */
    private String schoolSkiDiscountFlg;

    /** �X�N�[���X�L�[_����_��l_�����O */
    private String schoolSkiHalfAdult1;

    /** �X�N�[���X�L�[_����_��l_������ */
    private String schoolSkiHalfAdult2;

    /** �X�N�[���X�L�[_����_���l_�����O */
    private String schoolSkiHalfChild1;

    /** �X�N�[���X�L�[_����_���l_������ */
    private String schoolSkiHalfChild2;

    /** �X�N�[���X�L�[_����P_��l_�����O */
    private String schoolSkiTime1Adult1;

    /** �X�N�[���X�L�[_����P_��l_������ */
    private String schoolSkiTime1Adult2;

    /** �X�N�[���X�L�[_����P_���l_�����O */
    private String schoolSkiTime1Child1;

    /** �X�N�[���X�L�[_����P_���l_������ */
    private String schoolSkiTime1Child2;

    /** �X�N�[���X�L�[_����P_���� */
    private String schoolSkiTime1Hh;

    /** �X�N�[���X�L�[_����P_�� */
    private String schoolSkiTime1Mm;

    /** �X�N�[���X�L�[_����Q_��l_�����O */
    private String schoolSkiTime2Adult1;

    /** �X�N�[���X�L�[_����Q_��l_������ */
    private String schoolSkiTime2Adult2;

    /** �X�N�[���X�L�[_����Q_���l_�����O */
    private String schoolSkiTime2Child1;

    /** �X�N�[���X�L�[_����Q_���l_������ */
    private String schoolSkiTime2Child2;

    /** �X�N�[���X�L�[_����Q_���� */
    private String schoolSkiTime2Hh;

    /** �X�N�[���X�L�[_����Q_�� */
    private String schoolSkiTime2Mm;

    /** �X�L�[�L���b�`�R�s�[ */
    private String skiCatchcopy;

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
     * ���t�g�����ӎ������擾���܂��B
     * 
     * @return ���t�g�����ӎ���
     */
    public String getLiftAttentionContent() {
        return liftAttentionContent;
    }

    /**
     * ���t�g�c��_����_�c�Ɠ����擾���܂��B
     * 
     * @return ���t�g�c��_����_�c�Ɠ�
     */
    public String getLiftBsMorningDay() {
        return liftBsMorningDay;
    }

    /**
     * ���t�g�c��_����_�I�����Ԃ��擾���܂��B
     * 
     * @return ���t�g�c��_����_�I������
     */
    public String getLiftBsMorningEnd() {
        return DKikakuWebUtil.buildTime(getLiftBsMorningEndHour(),
                getLiftBsMorningEndMinute());
    }

    /**
     * ���t�g�c��_����_�I�����ԁi���ԁj���擾���܂��B
     * 
     * @return ���t�g�c��_����_�I�����ԁi���ԁj
     */
    public String getLiftBsMorningEndHour() {
        return liftBsMorningEndHour;
    }

    /**
     * ���t�g�c��_����_�I�����ԁi���j���擾���܂��B
     * 
     * @return ���t�g�c��_����_�I�����ԁi���j
     */
    public String getLiftBsMorningEndMinute() {
        return liftBsMorningEndMinute;
    }

    /**
     * ���t�g�c��_����_�L�����擾���܂��B
     * 
     * @return ���t�g�c��_����_�L��
     */
    public String getLiftBsMorningFlg() {
        return liftBsMorningFlg;
    }

    /**
     * ���t�g�c��_����_�J�n���Ԃ��擾���܂��B
     * 
     * @return ���t�g�c��_����_�J�n����
     */
    public String getLiftBsMorningStart() {
        return DKikakuWebUtil.buildTime(getLiftBsMorningStartHour(),
                getLiftBsMorningStartMinute());
    }

    /**
     * ���t�g�c��_����_�J�n���ԁi���ԁj���擾���܂��B
     * 
     * @return ���t�g�c��_����_�J�n���ԁi���ԁj
     */
    public String getLiftBsMorningStartHour() {
        return liftBsMorningStartHour;
    }

    /**
     * ���t�g�c��_����_�J�n���ԁi���j���擾���܂��B
     * 
     * @return ���t�g�c��_����_�J�n���ԁi���j
     */
    public String getLiftBsMorningStartMinute() {
        return liftBsMorningStartMinute;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�c�Ɠ����擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�c�Ɠ�
     */
    public String getLiftBsNightDay() {
        return liftBsNightDay;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�I�����Ԃ��擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�I������
     */
    public String getLiftBsNightEnd() {
        return DKikakuWebUtil.buildTime(getLiftBsNightEndHour(),
                getLiftBsNightEndMinute());
    }

    /**
     * ���t�g�c��_�i�C�^�[_�I�����ԁi���ԁj���擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�I�����ԁi���ԁj
     */
    public String getLiftBsNightEndHour() {
        return liftBsNightEndHour;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�I�����ԁi���j���擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�I�����ԁi���j
     */
    public String getLiftBsNightEndMinute() {
        return liftBsNightEndMinute;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�L�����擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�L��
     */
    public String getLiftBsNightFlg() {
        return liftBsNightFlg;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�J�n���Ԃ��擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�J�n����
     */
    public String getLiftBsNightStart() {
        return DKikakuWebUtil.buildTime(getLiftBsNightStartHour(),
                getLiftBsNightStartMinute());
    }

    /**
     * ���t�g�c��_�i�C�^�[_�J�n���ԁi���ԁj���擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�J�n���ԁi���ԁj
     */
    public String getLiftBsNightStartHour() {
        return liftBsNightStartHour;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�J�n���ԁi���j���擾���܂��B
     * 
     * @return ���t�g�c��_�i�C�^�[_�J�n���ԁi���j
     */
    public String getLiftBsNightStartMinute() {
        return liftBsNightStartMinute;
    }

    /**
     * ���t�g�c��_�ʏ�_�I�����Ԃ��擾���܂��B
     * 
     * @return ���t�g�c��_�ʏ�_�I������
     */
    public String getLiftBsNomalEnd() {
        return DKikakuWebUtil.buildTime(getLiftBsNomalEndHour(),
                getLiftBsNomalEndMinute());
    }

    /**
     * ���t�g�c��_�ʏ�_�I�����ԁi���ԁj���擾���܂��B
     * 
     * @return ���t�g�c��_�ʏ�_�I�����ԁi���ԁj
     */
    public String getLiftBsNomalEndHour() {
        return liftBsNomalEndHour;
    }

    /**
     * ���t�g�c��_�ʏ�_�I�����ԁi���j���擾���܂��B
     * 
     * @return ���t�g�c��_�ʏ�_�I�����ԁi���j
     */
    public String getLiftBsNomalEndMinute() {
        return liftBsNomalEndMinute;
    }

    /**
     * ���t�g�c��_�ʏ�_�J�n���Ԃ��擾���܂��B
     * 
     * @return ���t�g�c��_�ʏ�_�J�n����
     */
    public String getLiftBsNomalStart() {
        return DKikakuWebUtil.buildTime(getLiftBsNomalStartHour(),
                getLiftBsNomalStartMinute());
    }

    /**
     * ���t�g�c��_�ʏ�_�J�n���ԁi���ԁj���擾���܂��B
     * 
     * @return ���t�g�c��_�ʏ�_�J�n���ԁi���ԁj
     */
    public String getLiftBsNomalStartHour() {
        return liftBsNomalStartHour;
    }

    /**
     * ���t�g�c��_�ʏ�_�J�n���ԁi���j���擾���܂��B
     * 
     * @return ���t�g�c��_�ʏ�_�J�n���ԁi���j
     */
    public String getLiftBsNomalStartMinute() {
        return liftBsNomalStartMinute;
    }

    /**
     * ���t�g�c��_�X�L�[�ꖼ���擾���܂��B
     * 
     * @return ���t�g�c��_�X�L�[�ꖼ
     */
    public String getLiftBsSkiNm() {
        return liftBsSkiNm;
    }

    /**
     * ���t�g��������_���@���擾���܂��B
     * 
     * @return ���t�g��������_���@
     */
    public String getLiftChWayFlg() {
        return liftChWayFlg;
    }

    /**
     * ���t�g��������_���̑����e���擾���܂��B
     * 
     * @return ���t�g��������_���̑����e
     */
    public String getLiftChWayOtherContent() {
        return liftChWayOtherContent;
    }

    /**
     * ���t�g���̔�_��l_�тイ�����z�P���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_�тイ�����z�P
     */
    public String getLiftSlAdultByu1() {
        return liftSlAdultByu1;
    }

    /**
     * ���t�g���̔�_��l_�тイ�����z�Q���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_�тイ�����z�Q
     */
    public String getLiftSlAdultByu2() {
        return liftSlAdultByu2;
    }

    /**
     * ���t�g���̔�_��l_�����z�P���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_�����z�P
     */
    public String getLiftSlAdultDiscount1() {
        return liftSlAdultDiscount1;
    }

    /**
     * ���t�g���̔�_��l_�����z�Q���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_�����z�Q
     */
    public String getLiftSlAdultDiscount2() {
        return liftSlAdultDiscount2;
    }

    /**
     * ���t�g���̔�_��l_����P���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_����P
     */
    public String getLiftSlAdultKind1() {
        return liftSlAdultKind1;
    }

    /**
     * ���t�g���̔�_��l_����Q���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_����Q
     */
    public String getLiftSlAdultKind2() {
        return liftSlAdultKind2;
    }

    /**
     * ���t�g���̔�_��l_�ʏ�z�P���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_�ʏ�z�P
     */
    public String getLiftSlAdultNomal1() {
        return liftSlAdultNomal1;
    }

    /**
     * ���t�g���̔�_��l_�ʏ�z�Q���擾���܂��B
     * 
     * @return ���t�g���̔�_��l_�ʏ�z�Q
     */
    public String getLiftSlAdultNomal2() {
        return liftSlAdultNomal2;
    }

    /**
     * ���t�g���̔�_���l_�тイ�����z�P���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_�тイ�����z�P
     */
    public String getLiftSlChildByu1() {
        return liftSlChildByu1;
    }

    /**
     * ���t�g���̔�_���l_�тイ�����z�Q���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_�тイ�����z�Q
     */
    public String getLiftSlChildByu2() {
        return liftSlChildByu2;
    }

    /**
     * ���t�g���̔�_���l_�����z�P���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_�����z�P
     */
    public String getLiftSlChildDiscount1() {
        return liftSlChildDiscount1;
    }

    /**
     * ���t�g���̔�_���l_�����z�Q���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_�����z�Q
     */
    public String getLiftSlChildDiscount2() {
        return liftSlChildDiscount2;
    }

    /**
     * ���t�g���̔�_���l_����P���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_����P
     */
    public String getLiftSlChildKind1() {
        return liftSlChildKind1;
    }

    /**
     * ���t�g���̔�_���l_����Q���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_����Q
     */
    public String getLiftSlChildKind2() {
        return liftSlChildKind2;
    }

    /**
     * ���t�g���̔�_���l_�ʏ�z�P���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_�ʏ�z�P
     */
    public String getLiftSlChildNomal1() {
        return liftSlChildNomal1;
    }

    /**
     * ���t�g���̔�_���l_�ʏ�z�Q���擾���܂��B
     * 
     * @return ���t�g���̔�_���l_�ʏ�z�Q
     */
    public String getLiftSlChildNomal2() {
        return liftSlChildNomal2;
    }

    /**
     * ���t�g���̔�_�X�L�[�ꖼ���擾���܂��B
     * 
     * @return ���t�g���̔�_�X�L�[�ꖼ
     */
    public String getLiftSlSkiNm() {
        return liftSlSkiNm;
    }

    /**
     * ���t�g����܂�_�L�����擾���܂��B
     * 
     * @return ���t�g����܂�_�L��
     */
    public String getLiftTkContainFlg() {
        return liftTkContainFlg;
    }

    /**
     * ���t�g������擾���܂��B
     * 
     * @return ���t�g����
     */
    public String getLiftTkKind() {
        return liftTkKind;
    }

    /**
     * ���t�g����_���̑����e���擾���܂��B
     * 
     * @return ���t�g����_���̑����e
     */
    public String getLiftTkOtherContent() {
        return liftTkOtherContent;
    }

    /**
     * ���t�g����܂�_�X�L�[�ꖼ���擾���܂��B
     * 
     * @return ���t�g����܂�_�X�L�[�ꖼ
     */
    public String getLiftTkSkiNm() {
        return liftTkSkiNm;
    }

    /**
     * ���t�g���L��_�A�����i�C�^�[���擾���܂��B
     * 
     * @return ���t�g���L��_�A�����i�C�^�[
     */
    public String getLiftYkBackNight() {
        return liftYkBackNight;
    }

    /**
     * ���t�g���L��_���[�v�E�F�C���擾���܂��B
     * 
     * @return ���t�g���L��_���[�v�E�F�C
     */
    public String getLiftYkCable() {
        return liftYkCable;
    }

    /**
     * ���t�g���L��_�S���h�����擾���܂��B
     * 
     * @return ���t�g���L��_�S���h��
     */
    public String getLiftYkGondola() {
        return liftYkGondola;
    }

    /**
     * ���t�g���L��_�������擾���܂��B
     * 
     * @return ���t�g���L��_����
     */
    public String getLiftYkMorning() {
        return liftYkMorning;
    }

    /**
     * ���t�g���L��_���̑����擾���܂��B
     * 
     * @return ���t�g���L��_���̑�
     */
    public String getLiftYkOther() {
        return liftYkOther;
    }

    /**
     * ���t�g���L��_���̑����e���擾���܂��B
     * 
     * @return ���t�g���L��_���̑����e
     */
    public String getLiftYkOtherContent() {
        return liftYkOtherContent;
    }

    /**
     * ���t�g���L��_�h�����i�C�^�[���擾���܂��B
     * 
     * @return ���t�g���L��_�h�����i�C�^�[
     */
    public String getLiftYkStayNight() {
        return liftYkStayNight;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_�P��_��l_�����O
     */
    public String getRentBdDayAdult1() {
        return rentBdDayAdult1;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_��l_��������擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_�P��_��l_������
     */
    public String getRentBdDayAdult2() {
        return rentBdDayAdult2;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_�P��_���l_�����O
     */
    public String getRentBdDayChild1() {
        return rentBdDayChild1;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_���l_��������擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_�P��_���l_������
     */
    public String getRentBdDayChild2() {
        return rentBdDayChild2;
    }

    /**
     * �����^���X�m�[�{�[�h_�����L�����擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_�����L��
     */
    public String getRentBdDiscountFlg() {
        return rentBdDiscountFlg;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_��l_�����O
     */
    public String getRentBdHalfAdult1() {
        return rentBdHalfAdult1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_��������擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_��l_������
     */
    public String getRentBdHalfAdult2() {
        return rentBdHalfAdult2;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_���l_�����O
     */
    public String getRentBdHalfChild1() {
        return rentBdHalfChild1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_��������擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_���l_������
     */
    public String getRentBdHalfChild2() {
        return rentBdHalfChild2;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_��l_�����O
     */
    public String getRentBdSpAdult1() {
        return rentBdSpAdult1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_��������擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_��l_������
     */
    public String getRentBdSpAdult2() {
        return rentBdSpAdult2;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_���l_�����O
     */
    public String getRentBdSpChild1() {
        return rentBdSpChild1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_��������擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_����_���l_������
     */
    public String getRentBdSpChild2() {
        return rentBdSpChild2;
    }

    /**
     * �����^���X�m�[�{�[�h_���茔����擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_���茔��
     */
    public String getRentBdSpKind() {
        return rentBdSpKind;
    }

    /**
     * �����^���X�m�[�{�[�h_�݌ɗL�����擾���܂��B
     * 
     * @return �����^���X�m�[�{�[�h_�݌ɗL��
     */
    public String getRentBdStockFlg() {
        return rentBdStockFlg;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_��l_�����O���擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_�P��_��l_�����O
     */
    public String getRentBdwDayAdult1() {
        return rentBdwDayAdult1;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_��l_��������擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_�P��_��l_������
     */
    public String getRentBdwDayAdult2() {
        return rentBdwDayAdult2;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_���l_�����O���擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_�P��_���l_�����O
     */
    public String getRentBdwDayChild1() {
        return rentBdwDayChild1;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_���l_��������擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_�P��_���l_������
     */
    public String getRentBdwDayChild2() {
        return rentBdwDayChild2;
    }

    /**
     * �����^���{�[�h�E�F�A_�����L�����擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_�����L��
     */
    public String getRentBdwDiscountFlg() {
        return rentBdwDiscountFlg;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_��l_�����O
     */
    public String getRentBdwHalfAdult1() {
        return rentBdwHalfAdult1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_��������擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_��l_������
     */
    public String getRentBdwHalfAdult2() {
        return rentBdwHalfAdult2;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_���l_�����O
     */
    public String getRentBdwHalfChild1() {
        return rentBdwHalfChild1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_��������擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_���l_������
     */
    public String getRentBdwHalfChild2() {
        return rentBdwHalfChild2;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_��l_�����O
     */
    public String getRentBdwSpAdult1() {
        return rentBdwSpAdult1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_��������擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_��l_������
     */
    public String getRentBdwSpAdult2() {
        return rentBdwSpAdult2;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_���l_�����O
     */
    public String getRentBdwSpChild1() {
        return rentBdwSpChild1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_��������擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_����_���l_������
     */
    public String getRentBdwSpChild2() {
        return rentBdwSpChild2;
    }

    /**
     * �����^���{�[�h�E�F�A_���茔����擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_���茔��
     */
    public String getRentBdwSpKind() {
        return rentBdwSpKind;
    }

    /**
     * �����^���{�[�h�E�F�A_�݌ɗL�����擾���܂��B
     * 
     * @return �����^���{�[�h�E�F�A_�݌ɗL��
     */
    public String getRentBdwStockFlg() {
        return rentBdwStockFlg;
    }

    /**
     * �����^�������L�����擾���܂��B
     * 
     * @return �����^�������L��
     */
    public String getRentChageFlg() {
        return rentChageFlg;
    }

    /**
     * �����^���J�[�r���O_�P��_��l_�����O���擾���܂��B
     * 
     * @return �����^���J�[�r���O_�P��_��l_�����O
     */
    public String getRentCvDayAdult1() {
        return rentCvDayAdult1;
    }

    /**
     * �����^���J�[�r���O_�P��_��l_��������擾���܂��B
     * 
     * @return �����^���J�[�r���O_�P��_��l_������
     */
    public String getRentCvDayAdult2() {
        return rentCvDayAdult2;
    }

    /**
     * �����^���J�[�r���O_�P��_���l_�����O���擾���܂��B
     * 
     * @return �����^���J�[�r���O_�P��_���l_�����O
     */
    public String getRentCvDayChild1() {
        return rentCvDayChild1;
    }

    /**
     * �����^���J�[�r���O_�P��_���l_��������擾���܂��B
     * 
     * @return �����^���J�[�r���O_�P��_���l_������
     */
    public String getRentCvDayChild2() {
        return rentCvDayChild2;
    }

    /**
     * �����^���J�[�r���O_�����L�����擾���܂��B
     * 
     * @return �����^���J�[�r���O_�����L��
     */
    public String getRentCvDiscountFlg() {
        return rentCvDiscountFlg;
    }

    /**
     * �����^���J�[�r���O_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_��l_�����O
     */
    public String getRentCvHalfAdult1() {
        return rentCvHalfAdult1;
    }

    /**
     * �����^���J�[�r���O_����_��l_��������擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_��l_������
     */
    public String getRentCvHalfAdult2() {
        return rentCvHalfAdult2;
    }

    /**
     * �����^���J�[�r���O_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_���l_�����O
     */
    public String getRentCvHalfChild1() {
        return rentCvHalfChild1;
    }

    /**
     * �����^���J�[�r���O_����_���l_��������擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_���l_������
     */
    public String getRentCvHalfChild2() {
        return rentCvHalfChild2;
    }

    /**
     * �����^���J�[�r���O_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_��l_�����O
     */
    public String getRentCvSpAdult1() {
        return rentCvSpAdult1;
    }

    /**
     * �����^���J�[�r���O_����_��l_��������擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_��l_������
     */
    public String getRentCvSpAdult2() {
        return rentCvSpAdult2;
    }

    /**
     * �����^���J�[�r���O_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_���l_�����O
     */
    public String getRentCvSpChild1() {
        return rentCvSpChild1;
    }

    /**
     * �����^���J�[�r���O_����_���l_��������擾���܂��B
     * 
     * @return �����^���J�[�r���O_����_���l_������
     */
    public String getRentCvSpChild2() {
        return rentCvSpChild2;
    }

    /**
     * �����^���J�[�r���O_���茔����擾���܂��B
     * 
     * @return �����^���J�[�r���O_���茔��
     */
    public String getRentCvSpKind() {
        return rentCvSpKind;
    }

    /**
     * �����^���J�[�r���O_�݌ɗL�����擾���܂��B
     * 
     * @return �����^���J�[�r���O_�݌ɗL��
     */
    public String getRentCvStockFlg() {
        return rentCvStockFlg;
    }

    /**
     * �t�@���X�L�[�����^�������т��擾���܂��B
     * 
     * @return �t�@���X�L�[�����^��������
     */
    public String getRentFsChargeFlg() {
        return rentFsChargeFlg;
    }

    /**
     * �t�@���X�L�[�����^���L�����擾���܂��B
     * 
     * @return �t�@���X�L�[�����^���L��
     */
    public String getRentFsFlg() {
        return rentFsFlg;
    }

    /**
     * �����^��_�\�����@���擾���܂��B
     * 
     * @return �����^��_�\�����@
     */
    public String getRentRequestWay() {
        return rentRequestWay;
    }

    /**
     * �����^���X�L�[_�P��_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[_�P��_��l_�����O
     */
    public String getRentSkiDayAdult1() {
        return rentSkiDayAdult1;
    }

    /**
     * �����^���X�L�[_�P��_��l_��������擾���܂��B
     * 
     * @return �����^���X�L�[_�P��_��l_������
     */
    public String getRentSkiDayAdult2() {
        return rentSkiDayAdult2;
    }

    /**
     * �����^���X�L�[_�P��_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[_�P��_���l_�����O
     */
    public String getRentSkiDayChild1() {
        return rentSkiDayChild1;
    }

    /**
     * �����^���X�L�[_�P��_���l_��������擾���܂��B
     * 
     * @return �����^���X�L�[_�P��_���l_������
     */
    public String getRentSkiDayChild2() {
        return rentSkiDayChild2;
    }

    /**
     * �����^���X�L�[_�����L�����擾���܂��B
     * 
     * @return �����^���X�L�[_�����L��
     */
    public String getRentSkiDiscountFlg() {
        return rentSkiDiscountFlg;
    }

    /**
     * �����^���X�L�[_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[_����_��l_�����O
     */
    public String getRentSkiHalfAdult1() {
        return rentSkiHalfAdult1;
    }

    /**
     * �����^���X�L�[_����_��l_��������擾���܂��B
     * 
     * @return �����^���X�L�[_����_��l_������
     */
    public String getRentSkiHalfAdult2() {
        return rentSkiHalfAdult2;
    }

    /**
     * �����^���X�L�[_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[_����_���l_�����O
     */
    public String getRentSkiHalfChild1() {
        return rentSkiHalfChild1;
    }

    /**
     * �����^���X�L�[_����_���l_��������擾���܂��B
     * 
     * @return �����^���X�L�[_����_���l_������
     */
    public String getRentSkiHalfChild2() {
        return rentSkiHalfChild2;
    }

    /**
     * �����^������_���l���擾���܂��B
     * 
     * @return �����^������_���l
     */
    public String getRentSkiPriceMemo() {
        return rentSkiPriceMemo;
    }

    /**
     * �����^���X�L�[_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[_����_��l_�����O
     */
    public String getRentSkiSpAdult1() {
        return rentSkiSpAdult1;
    }

    /**
     * �����^���X�L�[_����_��l_��������擾���܂��B
     * 
     * @return �����^���X�L�[_����_��l_������
     */
    public String getRentSkiSpAdult2() {
        return rentSkiSpAdult2;
    }

    /**
     * �����^���X�L�[_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[_����_���l_�����O
     */
    public String getRentSkiSpChild1() {
        return rentSkiSpChild1;
    }

    /**
     * �����^���X�L�[_����_���l_��������擾���܂��B
     * 
     * @return �����^���X�L�[_����_���l_������
     */
    public String getRentSkiSpChild2() {
        return rentSkiSpChild2;
    }

    /**
     * �����^���X�L�[_���茔����擾���܂��B
     * 
     * @return �����^���X�L�[_���茔��
     */
    public String getRentSkiSpKind() {
        return rentSkiSpKind;
    }

    /**
     * �����^���X�L�[_�݌ɗL�����擾���܂��B
     * 
     * @return �����^���X�L�[_�݌ɗL��
     */
    public String getRentSkiStockFlg() {
        return rentSkiStockFlg;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_�P��_��l_�����O
     */
    public String getRentSkiwDayAdult1() {
        return rentSkiwDayAdult1;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_��l_��������擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_�P��_��l_������
     */
    public String getRentSkiwDayAdult2() {
        return rentSkiwDayAdult2;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_�P��_���l_�����O
     */
    public String getRentSkiwDayChild1() {
        return rentSkiwDayChild1;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_���l_��������擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_�P��_���l_������
     */
    public String getRentSkiwDayChild2() {
        return rentSkiwDayChild2;
    }

    /**
     * �����^���X�L�[�E�F�A_�����L�����擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_�����L��
     */
    public String getRentSkiwDiscountFlg() {
        return rentSkiwDiscountFlg;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_��l_�����O
     */
    public String getRentSkiwHalfAdult1() {
        return rentSkiwHalfAdult1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_��������擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_��l_������
     */
    public String getRentSkiwHalfAdult2() {
        return rentSkiwHalfAdult2;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_���l_�����O
     */
    public String getRentSkiwHalfChild1() {
        return rentSkiwHalfChild1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_��������擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_���l_������
     */
    public String getRentSkiwHalfChild2() {
        return rentSkiwHalfChild2;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_��l_�����O
     */
    public String getRentSkiwSpAdult1() {
        return rentSkiwSpAdult1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_��������擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_��l_������
     */
    public String getRentSkiwSpAdult2() {
        return rentSkiwSpAdult2;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_�����O���擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_���l_�����O
     */
    public String getRentSkiwSpChild1() {
        return rentSkiwSpChild1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_��������擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_����_���l_������
     */
    public String getRentSkiwSpChild2() {
        return rentSkiwSpChild2;
    }

    /**
     * �����^���X�L�[�E�F�A_���茔����擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_���茔��
     */
    public String getRentSkiwSpKind() {
        return rentSkiwSpKind;
    }

    /**
     * �����^���X�L�[�E�F�A_�݌ɗL�����擾���܂��B
     * 
     * @return �����^���X�L�[�E�F�A_�݌ɗL��
     */
    public String getRentSkiwStockFlg() {
        return rentSkiwStockFlg;
    }

    /**
     * �X�N�[���{�[�h_�P��_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_�P��_��l_�����O
     */
    public String getSchoolBdDayAdult1() {
        return schoolBdDayAdult1;
    }

    /**
     * �X�N�[���{�[�h_�P��_��l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_�P��_��l_������
     */
    public String getSchoolBdDayAdult2() {
        return schoolBdDayAdult2;
    }

    /**
     * �X�N�[���{�[�h_�P��_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_�P��_���l_�����O
     */
    public String getSchoolBdDayChild1() {
        return schoolBdDayChild1;
    }

    /**
     * �X�N�[���{�[�h_�P��_���l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_�P��_���l_������
     */
    public String getSchoolBdDayChild2() {
        return schoolBdDayChild2;
    }

    /**
     * �X�N�[���{�[�h_�����L�����擾���܂��B
     * 
     * @return �X�N�[���{�[�h_�����L��
     */
    public String getSchoolBdDiscountFlg() {
        return schoolBdDiscountFlg;
    }

    /**
     * �X�N�[���{�[�h_����_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����_��l_�����O
     */
    public String getSchoolBdHalfAdult1() {
        return schoolBdHalfAdult1;
    }

    /**
     * �X�N�[���{�[�h_����_��l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����_��l_������
     */
    public String getSchoolBdHalfAdult2() {
        return schoolBdHalfAdult2;
    }

    /**
     * �X�N�[���{�[�h_����_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����_���l_�����O
     */
    public String getSchoolBdHalfChild1() {
        return schoolBdHalfChild1;
    }

    /**
     * �X�N�[���{�[�h_����_���l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����_���l_������
     */
    public String getSchoolBdHalfChild2() {
        return schoolBdHalfChild2;
    }

    /**
     * �X�N�[���{�[�h_����P_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����P_��l_�����O
     */
    public String getSchoolBdTime1Adult1() {
        return schoolBdTime1Adult1;
    }

    /**
     * �X�N�[���{�[�h_����P_��l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����P_��l_������
     */
    public String getSchoolBdTime1Adult2() {
        return schoolBdTime1Adult2;
    }

    /**
     * �X�N�[���{�[�h_����P_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����P_���l_�����O
     */
    public String getSchoolBdTime1Child1() {
        return schoolBdTime1Child1;
    }

    /**
     * �X�N�[���{�[�h_����P_���l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����P_���l_������
     */
    public String getSchoolBdTime1Child2() {
        return schoolBdTime1Child2;
    }

    /**
     * �X�N�[���{�[�h_����P_���Ԃ��擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����P_����
     */
    public String getSchoolBdTime1Hh() {
        return schoolBdTime1Hh;
    }

    /**
     * �X�N�[���{�[�h_����P_�����擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����P_��
     */
    public String getSchoolBdTime1Mm() {
        return schoolBdTime1Mm;
    }

    /**
     * �X�N�[���{�[�h_����Q_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����Q_��l_�����O
     */
    public String getSchoolBdTime2Adult1() {
        return schoolBdTime2Adult1;
    }

    /**
     * �X�N�[���{�[�h_����Q_��l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����Q_��l_������
     */
    public String getSchoolBdTime2Adult2() {
        return schoolBdTime2Adult2;
    }

    /**
     * �X�N�[���{�[�h_����Q_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����Q_���l_�����O
     */
    public String getSchoolBdTime2Child1() {
        return schoolBdTime2Child1;
    }

    /**
     * �X�N�[���{�[�h_����Q_���l_��������擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����Q_���l_������
     */
    public String getSchoolBdTime2Child2() {
        return schoolBdTime2Child2;
    }

    /**
     * �X�N�[���{�[�h_����Q_���Ԃ��擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����Q_����
     */
    public String getSchoolBdTime2Hh() {
        return schoolBdTime2Hh;
    }

    /**
     * �X�N�[���{�[�h_����Q_�����擾���܂��B
     * 
     * @return �X�N�[���{�[�h_����Q_��
     */
    public String getSchoolBdTime2Mm() {
        return schoolBdTime2Mm;
    }

    /**
     * �X�N�[��_���̑����e���擾���܂��B
     * 
     * @return �X�N�[��_���̑����e
     */
    public String getSchoolOtherContent() {
        return schoolOtherContent;
    }

    /**
     * �X�N�[������_���l���擾���܂��B
     * 
     * @return �X�N�[������_���l
     */
    public String getSchoolPriceMemo() {
        return schoolPriceMemo;
    }

    /**
     * �X�N�[��_�\�����@���擾���܂��B
     * 
     * @return �X�N�[��_�\�����@
     */
    public String getSchoolRequestWay() {
        return schoolRequestWay;
    }

    /**
     * �X�N�[���X�L�[_�P��_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_�P��_��l_�����O
     */
    public String getSchoolSkiDayAdult1() {
        return schoolSkiDayAdult1;
    }

    /**
     * �X�N�[���X�L�[_�P��_��l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_�P��_��l_������
     */
    public String getSchoolSkiDayAdult2() {
        return schoolSkiDayAdult2;
    }

    /**
     * �X�N�[���X�L�[_�P��_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_�P��_���l_�����O
     */
    public String getSchoolSkiDayChild1() {
        return schoolSkiDayChild1;
    }

    /**
     * �X�N�[���X�L�[_�P��_���l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_�P��_���l_������
     */
    public String getSchoolSkiDayChild2() {
        return schoolSkiDayChild2;
    }

    /**
     * �X�N�[���X�L�[_�����L�����擾���܂��B
     * 
     * @return �X�N�[���X�L�[_�����L��
     */
    public String getSchoolSkiDiscountFlg() {
        return schoolSkiDiscountFlg;
    }

    /**
     * �X�N�[���X�L�[_����_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����_��l_�����O
     */
    public String getSchoolSkiHalfAdult1() {
        return schoolSkiHalfAdult1;
    }

    /**
     * �X�N�[���X�L�[_����_��l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����_��l_������
     */
    public String getSchoolSkiHalfAdult2() {
        return schoolSkiHalfAdult2;
    }

    /**
     * �X�N�[���X�L�[_����_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����_���l_�����O
     */
    public String getSchoolSkiHalfChild1() {
        return schoolSkiHalfChild1;
    }

    /**
     * �X�N�[���X�L�[_����_���l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����_���l_������
     */
    public String getSchoolSkiHalfChild2() {
        return schoolSkiHalfChild2;
    }

    /**
     * �X�N�[���X�L�[_����P_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����P_��l_�����O
     */
    public String getSchoolSkiTime1Adult1() {
        return schoolSkiTime1Adult1;
    }

    /**
     * �X�N�[���X�L�[_����P_��l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����P_��l_������
     */
    public String getSchoolSkiTime1Adult2() {
        return schoolSkiTime1Adult2;
    }

    /**
     * �X�N�[���X�L�[_����P_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����P_���l_�����O
     */
    public String getSchoolSkiTime1Child1() {
        return schoolSkiTime1Child1;
    }

    /**
     * �X�N�[���X�L�[_����P_���l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����P_���l_������
     */
    public String getSchoolSkiTime1Child2() {
        return schoolSkiTime1Child2;
    }

    /**
     * �X�N�[���X�L�[_����P_���Ԃ��擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����P_����
     */
    public String getSchoolSkiTime1Hh() {
        return schoolSkiTime1Hh;
    }

    /**
     * �X�N�[���X�L�[_����P_�����擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����P_��
     */
    public String getSchoolSkiTime1Mm() {
        return schoolSkiTime1Mm;
    }

    /**
     * �X�N�[���X�L�[_����Q_��l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����Q_��l_�����O
     */
    public String getSchoolSkiTime2Adult1() {
        return schoolSkiTime2Adult1;
    }

    /**
     * �X�N�[���X�L�[_����Q_��l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����Q_��l_������
     */
    public String getSchoolSkiTime2Adult2() {
        return schoolSkiTime2Adult2;
    }

    /**
     * �X�N�[���X�L�[_����Q_���l_�����O���擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����Q_���l_�����O
     */
    public String getSchoolSkiTime2Child1() {
        return schoolSkiTime2Child1;
    }

    /**
     * �X�N�[���X�L�[_����Q_���l_��������擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����Q_���l_������
     */
    public String getSchoolSkiTime2Child2() {
        return schoolSkiTime2Child2;
    }

    /**
     * �X�N�[���X�L�[_����Q_���Ԃ��擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����Q_����
     */
    public String getSchoolSkiTime2Hh() {
        return schoolSkiTime2Hh;
    }

    /**
     * �X�N�[���X�L�[_����Q_�����擾���܂��B
     * 
     * @return �X�N�[���X�L�[_����Q_��
     */
    public String getSchoolSkiTime2Mm() {
        return schoolSkiTime2Mm;
    }

    /**
     * �X�L�[�L���b�`�R�s�[���擾���܂��B
     * 
     * @return �X�L�[�L���b�`�R�s�[
     */
    public String getSkiCatchcopy() {
        return skiCatchcopy;
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

    /**
     * ���t�g�����ӎ�����ݒ肵�܂��B
     * 
     * @param liftAttentionContent
     *            ���t�g�����ӎ���
     */
    public void setLiftAttentionContent(String liftAttentionContent) {
        this.liftAttentionContent = liftAttentionContent;
    }

    /**
     * ���t�g�c��_����_�c�Ɠ���ݒ肵�܂��B
     * 
     * @param liftBsMorningDay
     *            ���t�g�c��_����_�c�Ɠ�
     */
    public void setLiftBsMorningDay(String liftBsMorningDay) {
        this.liftBsMorningDay = liftBsMorningDay;
    }

    /**
     * ���t�g�c��_����_�I�����Ԃ�ݒ肵�܂��B
     * 
     * @param liftBsMorningEnd
     *            ���t�g�c��_����_�I������
     */
    public void setLiftBsMorningEnd(String liftBsMorningEnd) {
        setLiftBsMorningEndHour(DKikakuWebUtil
                .getHourFormTime(liftBsMorningEnd));
        setLiftBsMorningEndMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsMorningEnd));
    }

    /**
     * ���t�g�c��_����_�I�����ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param liftBsMorningEndHour
     *            ���t�g�c��_����_�I�����ԁi���ԁj
     */
    public void setLiftBsMorningEndHour(String liftBsMorningEndHour) {
        this.liftBsMorningEndHour = liftBsMorningEndHour;
    }

    /**
     * ���t�g�c��_����_�I�����ԁi���j��ݒ肵�܂��B
     * 
     * @param liftBsMorningEndMinute
     *            ���t�g�c��_����_�I�����ԁi���j
     */
    public void setLiftBsMorningEndMinute(String liftBsMorningEndMinute) {
        this.liftBsMorningEndMinute = liftBsMorningEndMinute;
    }

    /**
     * ���t�g�c��_����_�L����ݒ肵�܂��B
     * 
     * @param liftBsMorningFlg
     *            ���t�g�c��_����_�L��
     */
    public void setLiftBsMorningFlg(String liftBsMorningFlg) {
        this.liftBsMorningFlg = liftBsMorningFlg;
    }

    /**
     * ���t�g�c��_����_�J�n���Ԃ�ݒ肵�܂��B
     * 
     * @param liftBsMorningStart
     *            ���t�g�c��_����_�J�n����
     */
    public void setLiftBsMorningStart(String liftBsMorningStart) {
        setLiftBsMorningStartHour(DKikakuWebUtil
                .getHourFormTime(liftBsMorningStart));
        setLiftBsMorningStartMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsMorningStart));
    }

    /**
     * ���t�g�c��_����_�J�n���ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param liftBsMorningStartHour
     *            ���t�g�c��_����_�J�n���ԁi���ԁj
     */
    public void setLiftBsMorningStartHour(String liftBsMorningStartHour) {
        this.liftBsMorningStartHour = liftBsMorningStartHour;
    }

    /**
     * ���t�g�c��_����_�J�n���ԁi���j��ݒ肵�܂��B
     * 
     * @param liftBsMorningStartMinute
     *            ���t�g�c��_����_�J�n���ԁi���j
     */
    public void setLiftBsMorningStartMinute(String liftBsMorningStartMinute) {
        this.liftBsMorningStartMinute = liftBsMorningStartMinute;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�c�Ɠ���ݒ肵�܂��B
     * 
     * @param liftBsNightDay
     *            ���t�g�c��_�i�C�^�[_�c�Ɠ�
     */
    public void setLiftBsNightDay(String liftBsNightDay) {
        this.liftBsNightDay = liftBsNightDay;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�I�����Ԃ�ݒ肵�܂��B
     * 
     * @param liftBsNightEnd
     *            ���t�g�c��_�i�C�^�[_�I������
     */
    public void setLiftBsNightEnd(String liftBsNightEnd) {
        setLiftBsNightEndHour(DKikakuWebUtil.getHourFormTime(liftBsNightEnd));
        setLiftBsNightEndMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNightEnd));
    }

    /**
     * ���t�g�c��_�i�C�^�[_�I�����ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param liftBsNightEndHour
     *            ���t�g�c��_�i�C�^�[_�I�����ԁi���ԁj
     */
    public void setLiftBsNightEndHour(String liftBsNightEndHour) {
        this.liftBsNightEndHour = liftBsNightEndHour;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�I�����ԁi���j��ݒ肵�܂��B
     * 
     * @param liftBsNightEndMinute
     *            ���t�g�c��_�i�C�^�[_�I�����ԁi���j
     */
    public void setLiftBsNightEndMinute(String liftBsNightEndMinute) {
        this.liftBsNightEndMinute = liftBsNightEndMinute;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�L����ݒ肵�܂��B
     * 
     * @param liftBsNightFlg
     *            ���t�g�c��_�i�C�^�[_�L��
     */
    public void setLiftBsNightFlg(String liftBsNightFlg) {
        this.liftBsNightFlg = liftBsNightFlg;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�J�n���Ԃ�ݒ肵�܂��B
     * 
     * @param liftBsNightStart
     *            ���t�g�c��_�i�C�^�[_�J�n����
     */
    public void setLiftBsNightStart(String liftBsNightStart) {
        setLiftBsNightStartHour(DKikakuWebUtil
                .getHourFormTime(liftBsNightStart));
        setLiftBsNightStartMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNightStart));
    }

    /**
     * ���t�g�c��_�i�C�^�[_�J�n���ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param liftBsNightStartHour
     *            ���t�g�c��_�i�C�^�[_�J�n���ԁi���ԁj
     */
    public void setLiftBsNightStartHour(String liftBsNightStartHour) {
        this.liftBsNightStartHour = liftBsNightStartHour;
    }

    /**
     * ���t�g�c��_�i�C�^�[_�J�n���ԁi���j��ݒ肵�܂��B
     * 
     * @param liftBsNightStartMinute
     *            ���t�g�c��_�i�C�^�[_�J�n���ԁi���j
     */
    public void setLiftBsNightStartMinute(String liftBsNightStartMinute) {
        this.liftBsNightStartMinute = liftBsNightStartMinute;
    }

    /**
     * ���t�g�c��_�ʏ�_�I�����Ԃ�ݒ肵�܂��B
     * 
     * @param liftBsNomalEnd
     *            ���t�g�c��_�ʏ�_�I������
     */
    public void setLiftBsNomalEnd(String liftBsNomalEnd) {
        setLiftBsNomalEndHour(DKikakuWebUtil.getHourFormTime(liftBsNomalEnd));
        setLiftBsNomalEndMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNomalEnd));
    }

    /**
     * ���t�g�c��_�ʏ�_�I�����ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param liftBsNomalEndHour
     *            ���t�g�c��_�ʏ�_�I�����ԁi���ԁj
     */
    public void setLiftBsNomalEndHour(String liftBsNomalEndHour) {
        this.liftBsNomalEndHour = liftBsNomalEndHour;
    }

    /**
     * ���t�g�c��_�ʏ�_�I�����ԁi���j��ݒ肵�܂��B
     * 
     * @param liftBsNomalEndMinute
     *            ���t�g�c��_�ʏ�_�I�����ԁi���j
     */
    public void setLiftBsNomalEndMinute(String liftBsNomalEndMinute) {
        this.liftBsNomalEndMinute = liftBsNomalEndMinute;
    }

    /**
     * ���t�g�c��_�ʏ�_�J�n���Ԃ�ݒ肵�܂��B
     * 
     * @param liftBsNomalStart
     *            ���t�g�c��_�ʏ�_�J�n����
     */
    public void setLiftBsNomalStart(String liftBsNomalStart) {
        setLiftBsNomalStartHour(DKikakuWebUtil
                .getHourFormTime(liftBsNomalStart));
        setLiftBsNomalStartMinute(DKikakuWebUtil
                .getMinuteFromTime(liftBsNomalStart));
    }

    /**
     * ���t�g�c��_�ʏ�_�J�n���ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param liftBsNomalStartHour
     *            ���t�g�c��_�ʏ�_�J�n���ԁi���ԁj
     */
    public void setLiftBsNomalStartHour(String liftBsNomalStartHour) {
        this.liftBsNomalStartHour = liftBsNomalStartHour;
    }

    /**
     * ���t�g�c��_�ʏ�_�J�n���ԁi���j��ݒ肵�܂��B
     * 
     * @param liftBsNomalStartMinute
     *            ���t�g�c��_�ʏ�_�J�n���ԁi���j
     */
    public void setLiftBsNomalStartMinute(String liftBsNomalStartMinute) {
        this.liftBsNomalStartMinute = liftBsNomalStartMinute;
    }

    /**
     * ���t�g�c��_�X�L�[�ꖼ��ݒ肵�܂��B
     * 
     * @param liftBsSkiNm
     *            ���t�g�c��_�X�L�[�ꖼ
     */
    public void setLiftBsSkiNm(String liftBsSkiNm) {
        this.liftBsSkiNm = liftBsSkiNm;
    }

    /**
     * ���t�g��������_���@��ݒ肵�܂��B
     * 
     * @param liftChWayFlg
     *            ���t�g��������_���@
     */
    public void setLiftChWayFlg(String liftChWayFlg) {
        this.liftChWayFlg = liftChWayFlg;
    }

    /**
     * ���t�g��������_���̑����e��ݒ肵�܂��B
     * 
     * @param liftChWayOtherContent
     *            ���t�g��������_���̑����e
     */
    public void setLiftChWayOtherContent(String liftChWayOtherContent) {
        this.liftChWayOtherContent = liftChWayOtherContent;
    }

    /**
     * ���t�g���̔�_��l_�тイ�����z�P��ݒ肵�܂��B
     * 
     * @param liftSlAdultByu1
     *            ���t�g���̔�_��l_�тイ�����z�P
     */
    public void setLiftSlAdultByu1(String liftSlAdultByu1) {
        this.liftSlAdultByu1 = liftSlAdultByu1;
    }

    /**
     * ���t�g���̔�_��l_�тイ�����z�Q��ݒ肵�܂��B
     * 
     * @param liftSlAdultByu2
     *            ���t�g���̔�_��l_�тイ�����z�Q
     */
    public void setLiftSlAdultByu2(String liftSlAdultByu2) {
        this.liftSlAdultByu2 = liftSlAdultByu2;
    }

    /**
     * ���t�g���̔�_��l_�����z�P��ݒ肵�܂��B
     * 
     * @param liftSlAdultDiscount1
     *            ���t�g���̔�_��l_�����z�P
     */
    public void setLiftSlAdultDiscount1(String liftSlAdultDiscount1) {
        this.liftSlAdultDiscount1 = liftSlAdultDiscount1;
    }

    /**
     * ���t�g���̔�_��l_�����z�Q��ݒ肵�܂��B
     * 
     * @param liftSlAdultDiscount2
     *            ���t�g���̔�_��l_�����z�Q
     */
    public void setLiftSlAdultDiscount2(String liftSlAdultDiscount2) {
        this.liftSlAdultDiscount2 = liftSlAdultDiscount2;
    }

    /**
     * ���t�g���̔�_��l_����P��ݒ肵�܂��B
     * 
     * @param liftSlAdultKind1
     *            ���t�g���̔�_��l_����P
     */
    public void setLiftSlAdultKind1(String liftSlAdultKind1) {
        this.liftSlAdultKind1 = liftSlAdultKind1;
    }

    /**
     * ���t�g���̔�_��l_����Q��ݒ肵�܂��B
     * 
     * @param liftSlAdultKind2
     *            ���t�g���̔�_��l_����Q
     */
    public void setLiftSlAdultKind2(String liftSlAdultKind2) {
        this.liftSlAdultKind2 = liftSlAdultKind2;
    }

    /**
     * ���t�g���̔�_��l_�ʏ�z�P��ݒ肵�܂��B
     * 
     * @param liftSlAdultNomal1
     *            ���t�g���̔�_��l_�ʏ�z�P
     */
    public void setLiftSlAdultNomal1(String liftSlAdultNomal1) {
        this.liftSlAdultNomal1 = liftSlAdultNomal1;
    }

    /**
     * ���t�g���̔�_��l_�ʏ�z�Q��ݒ肵�܂��B
     * 
     * @param liftSlAdultNomal2
     *            ���t�g���̔�_��l_�ʏ�z�Q
     */
    public void setLiftSlAdultNomal2(String liftSlAdultNomal2) {
        this.liftSlAdultNomal2 = liftSlAdultNomal2;
    }

    /**
     * ���t�g���̔�_���l_�тイ�����z�P��ݒ肵�܂��B
     * 
     * @param liftSlChildByu1
     *            ���t�g���̔�_���l_�тイ�����z�P
     */
    public void setLiftSlChildByu1(String liftSlChildByu1) {
        this.liftSlChildByu1 = liftSlChildByu1;
    }

    /**
     * ���t�g���̔�_���l_�тイ�����z�Q��ݒ肵�܂��B
     * 
     * @param liftSlChildByu2
     *            ���t�g���̔�_���l_�тイ�����z�Q
     */
    public void setLiftSlChildByu2(String liftSlChildByu2) {
        this.liftSlChildByu2 = liftSlChildByu2;
    }

    /**
     * ���t�g���̔�_���l_�����z�P��ݒ肵�܂��B
     * 
     * @param liftSlChildDiscount1
     *            ���t�g���̔�_���l_�����z�P
     */
    public void setLiftSlChildDiscount1(String liftSlChildDiscount1) {
        this.liftSlChildDiscount1 = liftSlChildDiscount1;
    }

    /**
     * ���t�g���̔�_���l_�����z�Q��ݒ肵�܂��B
     * 
     * @param liftSlChildDiscount2
     *            ���t�g���̔�_���l_�����z�Q
     */
    public void setLiftSlChildDiscount2(String liftSlChildDiscount2) {
        this.liftSlChildDiscount2 = liftSlChildDiscount2;
    }

    /**
     * ���t�g���̔�_���l_����P��ݒ肵�܂��B
     * 
     * @param liftSlChildKind1
     *            ���t�g���̔�_���l_����P
     */
    public void setLiftSlChildKind1(String liftSlChildKind1) {
        this.liftSlChildKind1 = liftSlChildKind1;
    }

    /**
     * ���t�g���̔�_���l_����Q��ݒ肵�܂��B
     * 
     * @param liftSlChildKind2
     *            ���t�g���̔�_���l_����Q
     */
    public void setLiftSlChildKind2(String liftSlChildKind2) {
        this.liftSlChildKind2 = liftSlChildKind2;
    }

    /**
     * ���t�g���̔�_���l_�ʏ�z�P��ݒ肵�܂��B
     * 
     * @param liftSlChildNomal1
     *            ���t�g���̔�_���l_�ʏ�z�P
     */
    public void setLiftSlChildNomal1(String liftSlChildNomal1) {
        this.liftSlChildNomal1 = liftSlChildNomal1;
    }

    /**
     * ���t�g���̔�_���l_�ʏ�z�Q��ݒ肵�܂��B
     * 
     * @param liftSlChildNomal2
     *            ���t�g���̔�_���l_�ʏ�z�Q
     */
    public void setLiftSlChildNomal2(String liftSlChildNomal2) {
        this.liftSlChildNomal2 = liftSlChildNomal2;
    }

    /**
     * ���t�g���̔�_�X�L�[�ꖼ��ݒ肵�܂��B
     * 
     * @param liftSlSkiNm
     *            ���t�g���̔�_�X�L�[�ꖼ
     */
    public void setLiftSlSkiNm(String liftSlSkiNm) {
        this.liftSlSkiNm = liftSlSkiNm;
    }

    /**
     * ���t�g����܂�_�L����ݒ肵�܂��B
     * 
     * @param liftTkContainFlg
     *            ���t�g����܂�_�L��
     */
    public void setLiftTkContainFlg(String liftTkContainFlg) {
        this.liftTkContainFlg = liftTkContainFlg;
    }

    /**
     * ���t�g�����ݒ肵�܂��B
     * 
     * @param liftTkKind
     *            ���t�g����
     */
    public void setLiftTkKind(String liftTkKind) {
        this.liftTkKind = liftTkKind;
    }

    /**
     * ���t�g����_���̑����e��ݒ肵�܂��B
     * 
     * @param liftTkOtherContent
     *            ���t�g����_���̑����e
     */
    public void setLiftTkOtherContent(String liftTkOtherContent) {
        this.liftTkOtherContent = liftTkOtherContent;
    }

    /**
     * ���t�g����܂�_�X�L�[�ꖼ��ݒ肵�܂��B
     * 
     * @param liftTkSkiNm
     *            ���t�g����܂�_�X�L�[�ꖼ
     */
    public void setLiftTkSkiNm(String liftTkSkiNm) {
        this.liftTkSkiNm = liftTkSkiNm;
    }

    /**
     * ���t�g���L��_�A�����i�C�^�[��ݒ肵�܂��B
     * 
     * @param liftYkBackNight
     *            ���t�g���L��_�A�����i�C�^�[
     */
    public void setLiftYkBackNight(String liftYkBackNight) {
        this.liftYkBackNight = liftYkBackNight;
    }

    /**
     * ���t�g���L��_���[�v�E�F�C��ݒ肵�܂��B
     * 
     * @param liftYkCable
     *            ���t�g���L��_���[�v�E�F�C
     */
    public void setLiftYkCable(String liftYkCable) {
        this.liftYkCable = liftYkCable;
    }

    /**
     * ���t�g���L��_�S���h����ݒ肵�܂��B
     * 
     * @param liftYkGondola
     *            ���t�g���L��_�S���h��
     */
    public void setLiftYkGondola(String liftYkGondola) {
        this.liftYkGondola = liftYkGondola;
    }

    /**
     * ���t�g���L��_������ݒ肵�܂��B
     * 
     * @param liftYkMorning
     *            ���t�g���L��_����
     */
    public void setLiftYkMorning(String liftYkMorning) {
        this.liftYkMorning = liftYkMorning;
    }

    /**
     * ���t�g���L��_���̑���ݒ肵�܂��B
     * 
     * @param liftYkOther
     *            ���t�g���L��_���̑�
     */
    public void setLiftYkOther(String liftYkOther) {
        this.liftYkOther = liftYkOther;
    }

    /**
     * ���t�g���L��_���̑����e��ݒ肵�܂��B
     * 
     * @param liftYkOtherContent
     *            ���t�g���L��_���̑����e
     */
    public void setLiftYkOtherContent(String liftYkOtherContent) {
        this.liftYkOtherContent = liftYkOtherContent;
    }

    /**
     * ���t�g���L��_�h�����i�C�^�[��ݒ肵�܂��B
     * 
     * @param liftYkStayNight
     *            ���t�g���L��_�h�����i�C�^�[
     */
    public void setLiftYkStayNight(String liftYkStayNight) {
        this.liftYkStayNight = liftYkStayNight;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdDayAdult1
     *            �����^���X�m�[�{�[�h_�P��_��l_�����O
     */
    public void setRentBdDayAdult1(String rentBdDayAdult1) {
        this.rentBdDayAdult1 = rentBdDayAdult1;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_��l_�������ݒ肵�܂��B
     * 
     * @param rentBdDayAdult2
     *            �����^���X�m�[�{�[�h_�P��_��l_������
     */
    public void setRentBdDayAdult2(String rentBdDayAdult2) {
        this.rentBdDayAdult2 = rentBdDayAdult2;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdDayChild1
     *            �����^���X�m�[�{�[�h_�P��_���l_�����O
     */
    public void setRentBdDayChild1(String rentBdDayChild1) {
        this.rentBdDayChild1 = rentBdDayChild1;
    }

    /**
     * �����^���X�m�[�{�[�h_�P��_���l_�������ݒ肵�܂��B
     * 
     * @param rentBdDayChild2
     *            �����^���X�m�[�{�[�h_�P��_���l_������
     */
    public void setRentBdDayChild2(String rentBdDayChild2) {
        this.rentBdDayChild2 = rentBdDayChild2;
    }

    /**
     * �����^���X�m�[�{�[�h_�����L����ݒ肵�܂��B
     * 
     * @param rentBdDiscountFlg
     *            �����^���X�m�[�{�[�h_�����L��
     */
    public void setRentBdDiscountFlg(String rentBdDiscountFlg) {
        this.rentBdDiscountFlg = rentBdDiscountFlg;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdHalfAdult1
     *            �����^���X�m�[�{�[�h_����_��l_�����O
     */
    public void setRentBdHalfAdult1(String rentBdHalfAdult1) {
        this.rentBdHalfAdult1 = rentBdHalfAdult1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentBdHalfAdult2
     *            �����^���X�m�[�{�[�h_����_��l_������
     */
    public void setRentBdHalfAdult2(String rentBdHalfAdult2) {
        this.rentBdHalfAdult2 = rentBdHalfAdult2;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdHalfChild1
     *            �����^���X�m�[�{�[�h_����_���l_�����O
     */
    public void setRentBdHalfChild1(String rentBdHalfChild1) {
        this.rentBdHalfChild1 = rentBdHalfChild1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentBdHalfChild2
     *            �����^���X�m�[�{�[�h_����_���l_������
     */
    public void setRentBdHalfChild2(String rentBdHalfChild2) {
        this.rentBdHalfChild2 = rentBdHalfChild2;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdSpAdult1
     *            �����^���X�m�[�{�[�h_����_��l_�����O
     */
    public void setRentBdSpAdult1(String rentBdSpAdult1) {
        this.rentBdSpAdult1 = rentBdSpAdult1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentBdSpAdult2
     *            �����^���X�m�[�{�[�h_����_��l_������
     */
    public void setRentBdSpAdult2(String rentBdSpAdult2) {
        this.rentBdSpAdult2 = rentBdSpAdult2;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdSpChild1
     *            �����^���X�m�[�{�[�h_����_���l_�����O
     */
    public void setRentBdSpChild1(String rentBdSpChild1) {
        this.rentBdSpChild1 = rentBdSpChild1;
    }

    /**
     * �����^���X�m�[�{�[�h_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentBdSpChild2
     *            �����^���X�m�[�{�[�h_����_���l_������
     */
    public void setRentBdSpChild2(String rentBdSpChild2) {
        this.rentBdSpChild2 = rentBdSpChild2;
    }

    /**
     * �����^���X�m�[�{�[�h_���茔���ݒ肵�܂��B
     * 
     * @param rentBdSpKind
     *            �����^���X�m�[�{�[�h_���茔��
     */
    public void setRentBdSpKind(String rentBdSpKind) {
        this.rentBdSpKind = rentBdSpKind;
    }

    /**
     * �����^���X�m�[�{�[�h_�݌ɗL����ݒ肵�܂��B
     * 
     * @param rentBdStockFlg
     *            �����^���X�m�[�{�[�h_�݌ɗL��
     */
    public void setRentBdStockFlg(String rentBdStockFlg) {
        this.rentBdStockFlg = rentBdStockFlg;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdwDayAdult1
     *            �����^���{�[�h�E�F�A_�P��_��l_�����O
     */
    public void setRentBdwDayAdult1(String rentBdwDayAdult1) {
        this.rentBdwDayAdult1 = rentBdwDayAdult1;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_��l_�������ݒ肵�܂��B
     * 
     * @param rentBdwDayAdult2
     *            �����^���{�[�h�E�F�A_�P��_��l_������
     */
    public void setRentBdwDayAdult2(String rentBdwDayAdult2) {
        this.rentBdwDayAdult2 = rentBdwDayAdult2;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdwDayChild1
     *            �����^���{�[�h�E�F�A_�P��_���l_�����O
     */
    public void setRentBdwDayChild1(String rentBdwDayChild1) {
        this.rentBdwDayChild1 = rentBdwDayChild1;
    }

    /**
     * �����^���{�[�h�E�F�A_�P��_���l_�������ݒ肵�܂��B
     * 
     * @param rentBdwDayChild2
     *            �����^���{�[�h�E�F�A_�P��_���l_������
     */
    public void setRentBdwDayChild2(String rentBdwDayChild2) {
        this.rentBdwDayChild2 = rentBdwDayChild2;
    }

    /**
     * �����^���{�[�h�E�F�A_�����L����ݒ肵�܂��B
     * 
     * @param rentBdwDiscountFlg
     *            �����^���{�[�h�E�F�A_�����L��
     */
    public void setRentBdwDiscountFlg(String rentBdwDiscountFlg) {
        this.rentBdwDiscountFlg = rentBdwDiscountFlg;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdwHalfAdult1
     *            �����^���{�[�h�E�F�A_����_��l_�����O
     */
    public void setRentBdwHalfAdult1(String rentBdwHalfAdult1) {
        this.rentBdwHalfAdult1 = rentBdwHalfAdult1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentBdwHalfAdult2
     *            �����^���{�[�h�E�F�A_����_��l_������
     */
    public void setRentBdwHalfAdult2(String rentBdwHalfAdult2) {
        this.rentBdwHalfAdult2 = rentBdwHalfAdult2;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdwHalfChild1
     *            �����^���{�[�h�E�F�A_����_���l_�����O
     */
    public void setRentBdwHalfChild1(String rentBdwHalfChild1) {
        this.rentBdwHalfChild1 = rentBdwHalfChild1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentBdwHalfChild2
     *            �����^���{�[�h�E�F�A_����_���l_������
     */
    public void setRentBdwHalfChild2(String rentBdwHalfChild2) {
        this.rentBdwHalfChild2 = rentBdwHalfChild2;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdwSpAdult1
     *            �����^���{�[�h�E�F�A_����_��l_�����O
     */
    public void setRentBdwSpAdult1(String rentBdwSpAdult1) {
        this.rentBdwSpAdult1 = rentBdwSpAdult1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentBdwSpAdult2
     *            �����^���{�[�h�E�F�A_����_��l_������
     */
    public void setRentBdwSpAdult2(String rentBdwSpAdult2) {
        this.rentBdwSpAdult2 = rentBdwSpAdult2;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentBdwSpChild1
     *            �����^���{�[�h�E�F�A_����_���l_�����O
     */
    public void setRentBdwSpChild1(String rentBdwSpChild1) {
        this.rentBdwSpChild1 = rentBdwSpChild1;
    }

    /**
     * �����^���{�[�h�E�F�A_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentBdwSpChild2
     *            �����^���{�[�h�E�F�A_����_���l_������
     */
    public void setRentBdwSpChild2(String rentBdwSpChild2) {
        this.rentBdwSpChild2 = rentBdwSpChild2;
    }

    /**
     * �����^���{�[�h�E�F�A_���茔���ݒ肵�܂��B
     * 
     * @param rentBdwSpKind
     *            �����^���{�[�h�E�F�A_���茔��
     */
    public void setRentBdwSpKind(String rentBdwSpKind) {
        this.rentBdwSpKind = rentBdwSpKind;
    }

    /**
     * �����^���{�[�h�E�F�A_�݌ɗL����ݒ肵�܂��B
     * 
     * @param rentBdwStockFlg
     *            �����^���{�[�h�E�F�A_�݌ɗL��
     */
    public void setRentBdwStockFlg(String rentBdwStockFlg) {
        this.rentBdwStockFlg = rentBdwStockFlg;
    }

    /**
     * �����^�������L����ݒ肵�܂��B
     * 
     * @param rentChageFlg
     *            �����^�������L��
     */
    public void setRentChageFlg(String rentChageFlg) {
        this.rentChageFlg = rentChageFlg;
    }

    /**
     * �����^���J�[�r���O_�P��_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentCvDayAdult1
     *            �����^���J�[�r���O_�P��_��l_�����O
     */
    public void setRentCvDayAdult1(String rentCvDayAdult1) {
        this.rentCvDayAdult1 = rentCvDayAdult1;
    }

    /**
     * �����^���J�[�r���O_�P��_��l_�������ݒ肵�܂��B
     * 
     * @param rentCvDayAdult2
     *            �����^���J�[�r���O_�P��_��l_������
     */
    public void setRentCvDayAdult2(String rentCvDayAdult2) {
        this.rentCvDayAdult2 = rentCvDayAdult2;
    }

    /**
     * �����^���J�[�r���O_�P��_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentCvDayChild1
     *            �����^���J�[�r���O_�P��_���l_�����O
     */
    public void setRentCvDayChild1(String rentCvDayChild1) {
        this.rentCvDayChild1 = rentCvDayChild1;
    }

    /**
     * �����^���J�[�r���O_�P��_���l_�������ݒ肵�܂��B
     * 
     * @param rentCvDayChild2
     *            �����^���J�[�r���O_�P��_���l_������
     */
    public void setRentCvDayChild2(String rentCvDayChild2) {
        this.rentCvDayChild2 = rentCvDayChild2;
    }

    /**
     * �����^���J�[�r���O_�����L����ݒ肵�܂��B
     * 
     * @param rentCvDiscountFlg
     *            �����^���J�[�r���O_�����L��
     */
    public void setRentCvDiscountFlg(String rentCvDiscountFlg) {
        this.rentCvDiscountFlg = rentCvDiscountFlg;
    }

    /**
     * �����^���J�[�r���O_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentCvHalfAdult1
     *            �����^���J�[�r���O_����_��l_�����O
     */
    public void setRentCvHalfAdult1(String rentCvHalfAdult1) {
        this.rentCvHalfAdult1 = rentCvHalfAdult1;
    }

    /**
     * �����^���J�[�r���O_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentCvHalfAdult2
     *            �����^���J�[�r���O_����_��l_������
     */
    public void setRentCvHalfAdult2(String rentCvHalfAdult2) {
        this.rentCvHalfAdult2 = rentCvHalfAdult2;
    }

    /**
     * �����^���J�[�r���O_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentCvHalfChild1
     *            �����^���J�[�r���O_����_���l_�����O
     */
    public void setRentCvHalfChild1(String rentCvHalfChild1) {
        this.rentCvHalfChild1 = rentCvHalfChild1;
    }

    /**
     * �����^���J�[�r���O_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentCvHalfChild2
     *            �����^���J�[�r���O_����_���l_������
     */
    public void setRentCvHalfChild2(String rentCvHalfChild2) {
        this.rentCvHalfChild2 = rentCvHalfChild2;
    }

    /**
     * �����^���J�[�r���O_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentCvSpAdult1
     *            �����^���J�[�r���O_����_��l_�����O
     */
    public void setRentCvSpAdult1(String rentCvSpAdult1) {
        this.rentCvSpAdult1 = rentCvSpAdult1;
    }

    /**
     * �����^���J�[�r���O_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentCvSpAdult2
     *            �����^���J�[�r���O_����_��l_������
     */
    public void setRentCvSpAdult2(String rentCvSpAdult2) {
        this.rentCvSpAdult2 = rentCvSpAdult2;
    }

    /**
     * �����^���J�[�r���O_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentCvSpChild1
     *            �����^���J�[�r���O_����_���l_�����O
     */
    public void setRentCvSpChild1(String rentCvSpChild1) {
        this.rentCvSpChild1 = rentCvSpChild1;
    }

    /**
     * �����^���J�[�r���O_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentCvSpChild2
     *            �����^���J�[�r���O_����_���l_������
     */
    public void setRentCvSpChild2(String rentCvSpChild2) {
        this.rentCvSpChild2 = rentCvSpChild2;
    }

    /**
     * �����^���J�[�r���O_���茔���ݒ肵�܂��B
     * 
     * @param rentCvSpKind
     *            �����^���J�[�r���O_���茔��
     */
    public void setRentCvSpKind(String rentCvSpKind) {
        this.rentCvSpKind = rentCvSpKind;
    }

    /**
     * �����^���J�[�r���O_�݌ɗL����ݒ肵�܂��B
     * 
     * @param rentCvStockFlg
     *            �����^���J�[�r���O_�݌ɗL��
     */
    public void setRentCvStockFlg(String rentCvStockFlg) {
        this.rentCvStockFlg = rentCvStockFlg;
    }

    /**
     * �t�@���X�L�[�����^�������т�ݒ肵�܂��B
     * 
     * @param rentFsChargeFlg
     *            �t�@���X�L�[�����^��������
     */
    public void setRentFsChargeFlg(String rentFsChargeFlg) {
        this.rentFsChargeFlg = rentFsChargeFlg;
    }

    /**
     * �t�@���X�L�[�����^���L����ݒ肵�܂��B
     * 
     * @param rentFsFlg
     *            �t�@���X�L�[�����^���L��
     */
    public void setRentFsFlg(String rentFsFlg) {
        this.rentFsFlg = rentFsFlg;
    }

    /**
     * �����^��_�\�����@��ݒ肵�܂��B
     * 
     * @param rentRequestWay
     *            �����^��_�\�����@
     */
    public void setRentRequestWay(String rentRequestWay) {
        this.rentRequestWay = rentRequestWay;
    }

    /**
     * �����^���X�L�[_�P��_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiDayAdult1
     *            �����^���X�L�[_�P��_��l_�����O
     */
    public void setRentSkiDayAdult1(String rentSkiDayAdult1) {
        this.rentSkiDayAdult1 = rentSkiDayAdult1;
    }

    /**
     * �����^���X�L�[_�P��_��l_�������ݒ肵�܂��B
     * 
     * @param rentSkiDayAdult2
     *            �����^���X�L�[_�P��_��l_������
     */
    public void setRentSkiDayAdult2(String rentSkiDayAdult2) {
        this.rentSkiDayAdult2 = rentSkiDayAdult2;
    }

    /**
     * �����^���X�L�[_�P��_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiDayChild1
     *            �����^���X�L�[_�P��_���l_�����O
     */
    public void setRentSkiDayChild1(String rentSkiDayChild1) {
        this.rentSkiDayChild1 = rentSkiDayChild1;
    }

    /**
     * �����^���X�L�[_�P��_���l_�������ݒ肵�܂��B
     * 
     * @param rentSkiDayChild2
     *            �����^���X�L�[_�P��_���l_������
     */
    public void setRentSkiDayChild2(String rentSkiDayChild2) {
        this.rentSkiDayChild2 = rentSkiDayChild2;
    }

    /**
     * �����^���X�L�[_�����L����ݒ肵�܂��B
     * 
     * @param rentSkiDiscountFlg
     *            �����^���X�L�[_�����L��
     */
    public void setRentSkiDiscountFlg(String rentSkiDiscountFlg) {
        this.rentSkiDiscountFlg = rentSkiDiscountFlg;
    }

    /**
     * �����^���X�L�[_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiHalfAdult1
     *            �����^���X�L�[_����_��l_�����O
     */
    public void setRentSkiHalfAdult1(String rentSkiHalfAdult1) {
        this.rentSkiHalfAdult1 = rentSkiHalfAdult1;
    }

    /**
     * �����^���X�L�[_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentSkiHalfAdult2
     *            �����^���X�L�[_����_��l_������
     */
    public void setRentSkiHalfAdult2(String rentSkiHalfAdult2) {
        this.rentSkiHalfAdult2 = rentSkiHalfAdult2;
    }

    /**
     * �����^���X�L�[_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiHalfChild1
     *            �����^���X�L�[_����_���l_�����O
     */
    public void setRentSkiHalfChild1(String rentSkiHalfChild1) {
        this.rentSkiHalfChild1 = rentSkiHalfChild1;
    }

    /**
     * �����^���X�L�[_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentSkiHalfChild2
     *            �����^���X�L�[_����_���l_������
     */
    public void setRentSkiHalfChild2(String rentSkiHalfChild2) {
        this.rentSkiHalfChild2 = rentSkiHalfChild2;
    }

    /**
     * �����^������_���l��ݒ肵�܂��B
     * 
     * @param rentSkiPriceMemo
     *            �����^������_���l
     */
    public void setRentSkiPriceMemo(String rentSkiPriceMemo) {
        this.rentSkiPriceMemo = rentSkiPriceMemo;
    }

    /**
     * �����^���X�L�[_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiSpAdult1
     *            �����^���X�L�[_����_��l_�����O
     */
    public void setRentSkiSpAdult1(String rentSkiSpAdult1) {
        this.rentSkiSpAdult1 = rentSkiSpAdult1;
    }

    /**
     * �����^���X�L�[_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentSkiSpAdult2
     *            �����^���X�L�[_����_��l_������
     */
    public void setRentSkiSpAdult2(String rentSkiSpAdult2) {
        this.rentSkiSpAdult2 = rentSkiSpAdult2;
    }

    /**
     * �����^���X�L�[_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiSpChild1
     *            �����^���X�L�[_����_���l_�����O
     */
    public void setRentSkiSpChild1(String rentSkiSpChild1) {
        this.rentSkiSpChild1 = rentSkiSpChild1;
    }

    /**
     * �����^���X�L�[_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentSkiSpChild2
     *            �����^���X�L�[_����_���l_������
     */
    public void setRentSkiSpChild2(String rentSkiSpChild2) {
        this.rentSkiSpChild2 = rentSkiSpChild2;
    }

    /**
     * �����^���X�L�[_���茔���ݒ肵�܂��B
     * 
     * @param rentSkiSpKind
     *            �����^���X�L�[_���茔��
     */
    public void setRentSkiSpKind(String rentSkiSpKind) {
        this.rentSkiSpKind = rentSkiSpKind;
    }

    /**
     * �����^���X�L�[_�݌ɗL����ݒ肵�܂��B
     * 
     * @param rentSkiStockFlg
     *            �����^���X�L�[_�݌ɗL��
     */
    public void setRentSkiStockFlg(String rentSkiStockFlg) {
        this.rentSkiStockFlg = rentSkiStockFlg;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiwDayAdult1
     *            �����^���X�L�[�E�F�A_�P��_��l_�����O
     */
    public void setRentSkiwDayAdult1(String rentSkiwDayAdult1) {
        this.rentSkiwDayAdult1 = rentSkiwDayAdult1;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_��l_�������ݒ肵�܂��B
     * 
     * @param rentSkiwDayAdult2
     *            �����^���X�L�[�E�F�A_�P��_��l_������
     */
    public void setRentSkiwDayAdult2(String rentSkiwDayAdult2) {
        this.rentSkiwDayAdult2 = rentSkiwDayAdult2;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiwDayChild1
     *            �����^���X�L�[�E�F�A_�P��_���l_�����O
     */
    public void setRentSkiwDayChild1(String rentSkiwDayChild1) {
        this.rentSkiwDayChild1 = rentSkiwDayChild1;
    }

    /**
     * �����^���X�L�[�E�F�A_�P��_���l_�������ݒ肵�܂��B
     * 
     * @param rentSkiwDayChild2
     *            �����^���X�L�[�E�F�A_�P��_���l_������
     */
    public void setRentSkiwDayChild2(String rentSkiwDayChild2) {
        this.rentSkiwDayChild2 = rentSkiwDayChild2;
    }

    /**
     * �����^���X�L�[�E�F�A_�����L����ݒ肵�܂��B
     * 
     * @param rentSkiwDiscountFlg
     *            �����^���X�L�[�E�F�A_�����L��
     */
    public void setRentSkiwDiscountFlg(String rentSkiwDiscountFlg) {
        this.rentSkiwDiscountFlg = rentSkiwDiscountFlg;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiwHalfAdult1
     *            �����^���X�L�[�E�F�A_����_��l_�����O
     */
    public void setRentSkiwHalfAdult1(String rentSkiwHalfAdult1) {
        this.rentSkiwHalfAdult1 = rentSkiwHalfAdult1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentSkiwHalfAdult2
     *            �����^���X�L�[�E�F�A_����_��l_������
     */
    public void setRentSkiwHalfAdult2(String rentSkiwHalfAdult2) {
        this.rentSkiwHalfAdult2 = rentSkiwHalfAdult2;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiwHalfChild1
     *            �����^���X�L�[�E�F�A_����_���l_�����O
     */
    public void setRentSkiwHalfChild1(String rentSkiwHalfChild1) {
        this.rentSkiwHalfChild1 = rentSkiwHalfChild1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentSkiwHalfChild2
     *            �����^���X�L�[�E�F�A_����_���l_������
     */
    public void setRentSkiwHalfChild2(String rentSkiwHalfChild2) {
        this.rentSkiwHalfChild2 = rentSkiwHalfChild2;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiwSpAdult1
     *            �����^���X�L�[�E�F�A_����_��l_�����O
     */
    public void setRentSkiwSpAdult1(String rentSkiwSpAdult1) {
        this.rentSkiwSpAdult1 = rentSkiwSpAdult1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_��l_�������ݒ肵�܂��B
     * 
     * @param rentSkiwSpAdult2
     *            �����^���X�L�[�E�F�A_����_��l_������
     */
    public void setRentSkiwSpAdult2(String rentSkiwSpAdult2) {
        this.rentSkiwSpAdult2 = rentSkiwSpAdult2;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param rentSkiwSpChild1
     *            �����^���X�L�[�E�F�A_����_���l_�����O
     */
    public void setRentSkiwSpChild1(String rentSkiwSpChild1) {
        this.rentSkiwSpChild1 = rentSkiwSpChild1;
    }

    /**
     * �����^���X�L�[�E�F�A_����_���l_�������ݒ肵�܂��B
     * 
     * @param rentSkiwSpChild2
     *            �����^���X�L�[�E�F�A_����_���l_������
     */
    public void setRentSkiwSpChild2(String rentSkiwSpChild2) {
        this.rentSkiwSpChild2 = rentSkiwSpChild2;
    }

    /**
     * �����^���X�L�[�E�F�A_���茔���ݒ肵�܂��B
     * 
     * @param rentSkiwSpKind
     *            �����^���X�L�[�E�F�A_���茔��
     */
    public void setRentSkiwSpKind(String rentSkiwSpKind) {
        this.rentSkiwSpKind = rentSkiwSpKind;
    }

    /**
     * �����^���X�L�[�E�F�A_�݌ɗL����ݒ肵�܂��B
     * 
     * @param rentSkiwStockFlg
     *            �����^���X�L�[�E�F�A_�݌ɗL��
     */
    public void setRentSkiwStockFlg(String rentSkiwStockFlg) {
        this.rentSkiwStockFlg = rentSkiwStockFlg;
    }

    /**
     * �X�N�[���{�[�h_�P��_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdDayAdult1
     *            �X�N�[���{�[�h_�P��_��l_�����O
     */
    public void setSchoolBdDayAdult1(String schoolBdDayAdult1) {
        this.schoolBdDayAdult1 = schoolBdDayAdult1;
    }

    /**
     * �X�N�[���{�[�h_�P��_��l_�������ݒ肵�܂��B
     * 
     * @param schoolBdDayAdult2
     *            �X�N�[���{�[�h_�P��_��l_������
     */
    public void setSchoolBdDayAdult2(String schoolBdDayAdult2) {
        this.schoolBdDayAdult2 = schoolBdDayAdult2;
    }

    /**
     * �X�N�[���{�[�h_�P��_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdDayChild1
     *            �X�N�[���{�[�h_�P��_���l_�����O
     */
    public void setSchoolBdDayChild1(String schoolBdDayChild1) {
        this.schoolBdDayChild1 = schoolBdDayChild1;
    }

    /**
     * �X�N�[���{�[�h_�P��_���l_�������ݒ肵�܂��B
     * 
     * @param schoolBdDayChild2
     *            �X�N�[���{�[�h_�P��_���l_������
     */
    public void setSchoolBdDayChild2(String schoolBdDayChild2) {
        this.schoolBdDayChild2 = schoolBdDayChild2;
    }

    /**
     * �X�N�[���{�[�h_�����L����ݒ肵�܂��B
     * 
     * @param schoolBdDiscountFlg
     *            �X�N�[���{�[�h_�����L��
     */
    public void setSchoolBdDiscountFlg(String schoolBdDiscountFlg) {
        this.schoolBdDiscountFlg = schoolBdDiscountFlg;
    }

    /**
     * �X�N�[���{�[�h_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdHalfAdult1
     *            �X�N�[���{�[�h_����_��l_�����O
     */
    public void setSchoolBdHalfAdult1(String schoolBdHalfAdult1) {
        this.schoolBdHalfAdult1 = schoolBdHalfAdult1;
    }

    /**
     * �X�N�[���{�[�h_����_��l_�������ݒ肵�܂��B
     * 
     * @param schoolBdHalfAdult2
     *            �X�N�[���{�[�h_����_��l_������
     */
    public void setSchoolBdHalfAdult2(String schoolBdHalfAdult2) {
        this.schoolBdHalfAdult2 = schoolBdHalfAdult2;
    }

    /**
     * �X�N�[���{�[�h_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdHalfChild1
     *            �X�N�[���{�[�h_����_���l_�����O
     */
    public void setSchoolBdHalfChild1(String schoolBdHalfChild1) {
        this.schoolBdHalfChild1 = schoolBdHalfChild1;
    }

    /**
     * �X�N�[���{�[�h_����_���l_�������ݒ肵�܂��B
     * 
     * @param schoolBdHalfChild2
     *            �X�N�[���{�[�h_����_���l_������
     */
    public void setSchoolBdHalfChild2(String schoolBdHalfChild2) {
        this.schoolBdHalfChild2 = schoolBdHalfChild2;
    }

    /**
     * �X�N�[���{�[�h_����P_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdTime1Adult1
     *            �X�N�[���{�[�h_����P_��l_�����O
     */
    public void setSchoolBdTime1Adult1(String schoolBdTime1Adult1) {
        this.schoolBdTime1Adult1 = schoolBdTime1Adult1;
    }

    /**
     * �X�N�[���{�[�h_����P_��l_�������ݒ肵�܂��B
     * 
     * @param schoolBdTime1Adult2
     *            �X�N�[���{�[�h_����P_��l_������
     */
    public void setSchoolBdTime1Adult2(String schoolBdTime1Adult2) {
        this.schoolBdTime1Adult2 = schoolBdTime1Adult2;
    }

    /**
     * �X�N�[���{�[�h_����P_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdTime1Child1
     *            �X�N�[���{�[�h_����P_���l_�����O
     */
    public void setSchoolBdTime1Child1(String schoolBdTime1Child1) {
        this.schoolBdTime1Child1 = schoolBdTime1Child1;
    }

    /**
     * �X�N�[���{�[�h_����P_���l_�������ݒ肵�܂��B
     * 
     * @param schoolBdTime1Child2
     *            �X�N�[���{�[�h_����P_���l_������
     */
    public void setSchoolBdTime1Child2(String schoolBdTime1Child2) {
        this.schoolBdTime1Child2 = schoolBdTime1Child2;
    }

    /**
     * �X�N�[���{�[�h_����P_���Ԃ�ݒ肵�܂��B
     * 
     * @param schoolBdTime1Hh
     *            �X�N�[���{�[�h_����P_����
     */
    public void setSchoolBdTime1Hh(String schoolBdTime1Hh) {
        this.schoolBdTime1Hh = schoolBdTime1Hh;
    }

    /**
     * �X�N�[���{�[�h_����P_����ݒ肵�܂��B
     * 
     * @param schoolBdTime1Mm
     *            �X�N�[���{�[�h_����P_��
     */
    public void setSchoolBdTime1Mm(String schoolBdTime1Mm) {
        this.schoolBdTime1Mm = schoolBdTime1Mm;
    }

    /**
     * �X�N�[���{�[�h_����Q_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdTime2Adult1
     *            �X�N�[���{�[�h_����Q_��l_�����O
     */
    public void setSchoolBdTime2Adult1(String schoolBdTime2Adult1) {
        this.schoolBdTime2Adult1 = schoolBdTime2Adult1;
    }

    /**
     * �X�N�[���{�[�h_����Q_��l_�������ݒ肵�܂��B
     * 
     * @param schoolBdTime2Adult2
     *            �X�N�[���{�[�h_����Q_��l_������
     */
    public void setSchoolBdTime2Adult2(String schoolBdTime2Adult2) {
        this.schoolBdTime2Adult2 = schoolBdTime2Adult2;
    }

    /**
     * �X�N�[���{�[�h_����Q_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolBdTime2Child1
     *            �X�N�[���{�[�h_����Q_���l_�����O
     */
    public void setSchoolBdTime2Child1(String schoolBdTime2Child1) {
        this.schoolBdTime2Child1 = schoolBdTime2Child1;
    }

    /**
     * �X�N�[���{�[�h_����Q_���l_�������ݒ肵�܂��B
     * 
     * @param schoolBdTime2Child2
     *            �X�N�[���{�[�h_����Q_���l_������
     */
    public void setSchoolBdTime2Child2(String schoolBdTime2Child2) {
        this.schoolBdTime2Child2 = schoolBdTime2Child2;
    }

    /**
     * �X�N�[���{�[�h_����Q_���Ԃ�ݒ肵�܂��B
     * 
     * @param schoolBdTime2Hh
     *            �X�N�[���{�[�h_����Q_����
     */
    public void setSchoolBdTime2Hh(String schoolBdTime2Hh) {
        this.schoolBdTime2Hh = schoolBdTime2Hh;
    }

    /**
     * �X�N�[���{�[�h_����Q_����ݒ肵�܂��B
     * 
     * @param schoolBdTime2Mm
     *            �X�N�[���{�[�h_����Q_��
     */
    public void setSchoolBdTime2Mm(String schoolBdTime2Mm) {
        this.schoolBdTime2Mm = schoolBdTime2Mm;
    }

    /**
     * �X�N�[��_���̑����e��ݒ肵�܂��B
     * 
     * @param schoolOtherContent
     *            �X�N�[��_���̑����e
     */
    public void setSchoolOtherContent(String schoolOtherContent) {
        this.schoolOtherContent = schoolOtherContent;
    }

    /**
     * �X�N�[������_���l��ݒ肵�܂��B
     * 
     * @param schoolPriceMemo
     *            �X�N�[������_���l
     */
    public void setSchoolPriceMemo(String schoolPriceMemo) {
        this.schoolPriceMemo = schoolPriceMemo;
    }

    /**
     * �X�N�[��_�\�����@��ݒ肵�܂��B
     * 
     * @param schoolRequestWay
     *            �X�N�[��_�\�����@
     */
    public void setSchoolRequestWay(String schoolRequestWay) {
        this.schoolRequestWay = schoolRequestWay;
    }

    /**
     * �X�N�[���X�L�[_�P��_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiDayAdult1
     *            �X�N�[���X�L�[_�P��_��l_�����O
     */
    public void setSchoolSkiDayAdult1(String schoolSkiDayAdult1) {
        this.schoolSkiDayAdult1 = schoolSkiDayAdult1;
    }

    /**
     * �X�N�[���X�L�[_�P��_��l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiDayAdult2
     *            �X�N�[���X�L�[_�P��_��l_������
     */
    public void setSchoolSkiDayAdult2(String schoolSkiDayAdult2) {
        this.schoolSkiDayAdult2 = schoolSkiDayAdult2;
    }

    /**
     * �X�N�[���X�L�[_�P��_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiDayChild1
     *            �X�N�[���X�L�[_�P��_���l_�����O
     */
    public void setSchoolSkiDayChild1(String schoolSkiDayChild1) {
        this.schoolSkiDayChild1 = schoolSkiDayChild1;
    }

    /**
     * �X�N�[���X�L�[_�P��_���l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiDayChild2
     *            �X�N�[���X�L�[_�P��_���l_������
     */
    public void setSchoolSkiDayChild2(String schoolSkiDayChild2) {
        this.schoolSkiDayChild2 = schoolSkiDayChild2;
    }

    /**
     * �X�N�[���X�L�[_�����L����ݒ肵�܂��B
     * 
     * @param schoolSkiDiscountFlg
     *            �X�N�[���X�L�[_�����L��
     */
    public void setSchoolSkiDiscountFlg(String schoolSkiDiscountFlg) {
        this.schoolSkiDiscountFlg = schoolSkiDiscountFlg;
    }

    /**
     * �X�N�[���X�L�[_����_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiHalfAdult1
     *            �X�N�[���X�L�[_����_��l_�����O
     */
    public void setSchoolSkiHalfAdult1(String schoolSkiHalfAdult1) {
        this.schoolSkiHalfAdult1 = schoolSkiHalfAdult1;
    }

    /**
     * �X�N�[���X�L�[_����_��l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiHalfAdult2
     *            �X�N�[���X�L�[_����_��l_������
     */
    public void setSchoolSkiHalfAdult2(String schoolSkiHalfAdult2) {
        this.schoolSkiHalfAdult2 = schoolSkiHalfAdult2;
    }

    /**
     * �X�N�[���X�L�[_����_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiHalfChild1
     *            �X�N�[���X�L�[_����_���l_�����O
     */
    public void setSchoolSkiHalfChild1(String schoolSkiHalfChild1) {
        this.schoolSkiHalfChild1 = schoolSkiHalfChild1;
    }

    /**
     * �X�N�[���X�L�[_����_���l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiHalfChild2
     *            �X�N�[���X�L�[_����_���l_������
     */
    public void setSchoolSkiHalfChild2(String schoolSkiHalfChild2) {
        this.schoolSkiHalfChild2 = schoolSkiHalfChild2;
    }

    /**
     * �X�N�[���X�L�[_����P_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiTime1Adult1
     *            �X�N�[���X�L�[_����P_��l_�����O
     */
    public void setSchoolSkiTime1Adult1(String schoolSkiTime1Adult1) {
        this.schoolSkiTime1Adult1 = schoolSkiTime1Adult1;
    }

    /**
     * �X�N�[���X�L�[_����P_��l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiTime1Adult2
     *            �X�N�[���X�L�[_����P_��l_������
     */
    public void setSchoolSkiTime1Adult2(String schoolSkiTime1Adult2) {
        this.schoolSkiTime1Adult2 = schoolSkiTime1Adult2;
    }

    /**
     * �X�N�[���X�L�[_����P_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiTime1Child1
     *            �X�N�[���X�L�[_����P_���l_�����O
     */
    public void setSchoolSkiTime1Child1(String schoolSkiTime1Child1) {
        this.schoolSkiTime1Child1 = schoolSkiTime1Child1;
    }

    /**
     * �X�N�[���X�L�[_����P_���l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiTime1Child2
     *            �X�N�[���X�L�[_����P_���l_������
     */
    public void setSchoolSkiTime1Child2(String schoolSkiTime1Child2) {
        this.schoolSkiTime1Child2 = schoolSkiTime1Child2;
    }

    /**
     * �X�N�[���X�L�[_����P_���Ԃ�ݒ肵�܂��B
     * 
     * @param schoolSkiTime1Hh
     *            �X�N�[���X�L�[_����P_����
     */
    public void setSchoolSkiTime1Hh(String schoolSkiTime1Hh) {
        this.schoolSkiTime1Hh = schoolSkiTime1Hh;
    }

    /**
     * �X�N�[���X�L�[_����P_����ݒ肵�܂��B
     * 
     * @param schoolSkiTime1Mm
     *            �X�N�[���X�L�[_����P_��
     */
    public void setSchoolSkiTime1Mm(String schoolSkiTime1Mm) {
        this.schoolSkiTime1Mm = schoolSkiTime1Mm;
    }

    /**
     * �X�N�[���X�L�[_����Q_��l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiTime2Adult1
     *            �X�N�[���X�L�[_����Q_��l_�����O
     */
    public void setSchoolSkiTime2Adult1(String schoolSkiTime2Adult1) {
        this.schoolSkiTime2Adult1 = schoolSkiTime2Adult1;
    }

    /**
     * �X�N�[���X�L�[_����Q_��l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiTime2Adult2
     *            �X�N�[���X�L�[_����Q_��l_������
     */
    public void setSchoolSkiTime2Adult2(String schoolSkiTime2Adult2) {
        this.schoolSkiTime2Adult2 = schoolSkiTime2Adult2;
    }

    /**
     * �X�N�[���X�L�[_����Q_���l_�����O��ݒ肵�܂��B
     * 
     * @param schoolSkiTime2Child1
     *            �X�N�[���X�L�[_����Q_���l_�����O
     */
    public void setSchoolSkiTime2Child1(String schoolSkiTime2Child1) {
        this.schoolSkiTime2Child1 = schoolSkiTime2Child1;
    }

    /**
     * �X�N�[���X�L�[_����Q_���l_�������ݒ肵�܂��B
     * 
     * @param schoolSkiTime2Child2
     *            �X�N�[���X�L�[_����Q_���l_������
     */
    public void setSchoolSkiTime2Child2(String schoolSkiTime2Child2) {
        this.schoolSkiTime2Child2 = schoolSkiTime2Child2;
    }

    /**
     * �X�N�[���X�L�[_����Q_���Ԃ�ݒ肵�܂��B
     * 
     * @param schoolSkiTime2Hh
     *            �X�N�[���X�L�[_����Q_����
     */
    public void setSchoolSkiTime2Hh(String schoolSkiTime2Hh) {
        this.schoolSkiTime2Hh = schoolSkiTime2Hh;
    }

    /**
     * �X�N�[���X�L�[_����Q_����ݒ肵�܂��B
     * 
     * @param schoolSkiTime2Mm
     *            �X�N�[���X�L�[_����Q_��
     */
    public void setSchoolSkiTime2Mm(String schoolSkiTime2Mm) {
        this.schoolSkiTime2Mm = schoolSkiTime2Mm;
    }

    /**
     * �X�L�[�L���b�`�R�s�[��ݒ肵�܂��B
     * 
     * @param skiCatchcopy
     *            �X�L�[�L���b�`�R�s�[
     */
    public void setSkiCatchcopy(String skiCatchcopy) {
        this.skiCatchcopy = skiCatchcopy;
    }

}
