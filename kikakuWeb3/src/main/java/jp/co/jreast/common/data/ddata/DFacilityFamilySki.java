package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;

/**
 * [DP/RM]�{��_�t�@�~���[�{��_�X�L�[ �G���e�B�e�B
 * 
 * <pre>
 *   �@�\�T�v �F 
 *              �Q�����f�ݔ��P �F ���芊��\ (sledgeData)
 *              �Q�����f�ݔ��Q �F �X�L�[�����\ (skiData)
 *              �Q�����f�ݔ��R �F �X�m�[�G�X�J���[�^�[ (snowEscalator)
 *              �Q�����f�ݔ��S �F �X�m�[�`���[�r���O (snowChu)
 *              �Q�����f�ݔ��T �F �����i�p����g��Ȃ��j (slideData)
 *              �Q�����f�ݔ��U �F �ӂ�ӂ�i��^�̊ߋ�j (bigPlaything)
 *              �Q�����f�ݔ��V �F ��V�уO�b�Y�i�޹E����ٓ�) (snowGoods)
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityFamilySki implements FacilityManageBodyKey {

    /** �L�b�Y��p�G���A�L�� */
    private String areaForKidsFlg;

    /** ���ꗿ_�L��_��l_�N�� */
    private String entranceFeeAdultAge;

    /** ���ꗿ_�L��_��l_���� */
    private String entranceFeeAdultCharge;

    /** ���ꗿ_�L��_��l */
    private String entranceFeeAdultPay;

    /** ���ꗿ_�L��_���l_���� */
    private String entranceFeeChildCharge;

    /** ���ꗿ_�L��_���l_�N��From */
    private String entranceFeeChildFrom;

    /** ���ꗿ_�L��_���l */
    private String entranceFeeChildPay;

    /** ���ꗿ_�L��_���l_�N��To */
    private String entranceFeeChildTo;

    /** ���ꗿ_�L�� */
    private String entranceFeeFlg;

    /** ���ꗿ_������� */
    private String entranceFeeFree;

    /** ���ꗿ_�L��_���� */
    private String entranceFeeHhPay;

    /** ���ꗿ_�L��_�� */
    private String entranceFeeMmPay;

    /** ���ꗿ_�L����� */
    private String entranceFeePay;

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �{�݃p�^�[�� */
    private String facilityPattern;

    /** �Q�����f�ݔ��P_��l���� �i���芊��\�j */
    private String gelandeChargeAdult1;

    /** �Q�����f�ݔ��Q_��l���� �i�X�L�[�����\�j */
    private String gelandeChargeAdult2;

    /** �Q�����f�ݔ��R_��l���� �i�X�m�[�G�X�J���[�^�[�j */
    private String gelandeChargeAdult3;

    /** �Q�����f�ݔ��S_��l���� �i�X�m�[�`���[�r���O�j */
    private String gelandeChargeAdult4;

    /** �Q�����f�ݔ��T_��l���� �i�����i�p����g��Ȃ��j�j */
    private String gelandeChargeAdult5;

    /** �Q�����f�ݔ��U_��l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j */
    private String gelandeChargeAdult6;

    /** �Q�����f�ݔ��V_��l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j */
    private String gelandeChargeAdult7;

    /** �Q�����f�ݔ��P_���l���� �i���芊��\�j */
    private String gelandeChargeChild1;

    /** �Q�����f�ݔ��Q_���l���� �i�X�L�[�����\�j */
    private String gelandeChargeChild2;

    /** �Q�����f�ݔ��R_���l���� �i�X�m�[�G�X�J���[�^�[�j */
    private String gelandeChargeChild3;

    /** �Q�����f�ݔ��S_���l���� �i�X�m�[�`���[�r���O�j */
    private String gelandeChargeChild4;

    /** �Q�����f�ݔ��T_���l���� �i�����i�p����g��Ȃ��j�j */
    private String gelandeChargeChild5;

    /** �Q�����f�ݔ��U_���l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j */
    private String gelandeChargeChild6;

    /** �Q�����f�ݔ��V_���l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j */
    private String gelandeChargeChild7;

    /** �Q�����f�ݔ��P_�����L�� �i���芊��\�j */
    private String gelandeChargeFlg1;

    /** �Q�����f�ݔ��Q_�����L�� �i�X�L�[�����\�j */
    private String gelandeChargeFlg2;

    /** �Q�����f�ݔ��R_�����L�� �i�X�m�[�G�X�J���[�^�[�j */
    private String gelandeChargeFlg3;

    /** �Q�����f�ݔ��S_�����L�� �i�X�m�[�`���[�r���O�j */
    private String gelandeChargeFlg4;

    /** �Q�����f�ݔ��T_�����L�� �i�����i�p����g��Ȃ��j�j */
    private String gelandeChargeFlg5;

    /** �Q�����f�ݔ��U_�����L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j */
    private String gelandeChargeFlg6;

    /** �Q�����f�ݔ��V_�����L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j */
    private String gelandeChargeFlg7;

    /** �Q�����f�ݔ��P_�L�� �i���芊��\�j */
    private String gelandeFlg1;

    /** �Q�����f�ݔ��Q_�L�� �i�X�L�[�����\�j */
    private String gelandeFlg2;

    /** �Q�����f�ݔ��R_�L�� �i�X�m�[�G�X�J���[�^�[�j */
    private String gelandeFlg3;

    /** �Q�����f�ݔ��S_�L�� �i�X�m�[�`���[�r���O�j */
    private String gelandeFlg4;

    /** �Q�����f�ݔ��T_�L�� �i�����i�p����g��Ȃ��j�j */
    private String gelandeFlg5;

    /** �Q�����f�ݔ��U_�L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j */
    private String gelandeFlg6;

    /** �Q�����f�ݔ��V_�L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j */
    private String gelandeFlg7;

    /** �񓚏���� */
    private String kindFlg;

    /** ���̑��ݔ��P */
    private String otherFacility1;

    /** ���̑��ݔ��Q */
    private String otherFacility2;

    /** ���̑��ݔ��R */
    private String otherFacility3;

    /** ���̑��ݔ��S */
    private String otherFacility4;

    /** ���̑����L���� */
    private String otherSpCmt;

    /**
     * �L�b�Y��p�G���A�L�����擾���܂��B
     * 
     * @return �L�b�Y��p�G���A�L��
     */
    public String getAreaForKidsFlg() {
        return areaForKidsFlg;
    }

    /**
     * ���ꗿ_�L��_��l_�N����擾���܂��B
     * 
     * @return ���ꗿ_�L��_��l_�N��
     */
    public String getEntranceFeeAdultAge() {
        return entranceFeeAdultAge;
    }

    /**
     * ���ꗿ_�L��_��l_�������擾���܂��B
     * 
     * @return ���ꗿ_�L��_��l_����
     */
    public String getEntranceFeeAdultCharge() {
        return entranceFeeAdultCharge;
    }

    /**
     * ���ꗿ_�L��_��l���擾���܂��B
     * 
     * @return ���ꗿ_�L��_��l
     */
    public String getEntranceFeeAdultPay() {
        return entranceFeeAdultPay;
    }

    /**
     * ���ꗿ_�L��_���l_�������擾���܂��B
     * 
     * @return ���ꗿ_�L��_���l_����
     */
    public String getEntranceFeeChildCharge() {
        return entranceFeeChildCharge;
    }

    /**
     * ���ꗿ_�L��_���l_�N��From���擾���܂��B
     * 
     * @return ���ꗿ_�L��_���l_�N��From
     */
    public String getEntranceFeeChildFrom() {
        return entranceFeeChildFrom;
    }

    /**
     * ���ꗿ_�L��_���l���擾���܂��B
     * 
     * @return ���ꗿ_�L��_���l
     */
    public String getEntranceFeeChildPay() {
        return entranceFeeChildPay;
    }

    /**
     * ���ꗿ_�L��_���l_�N��To���擾���܂��B
     * 
     * @return ���ꗿ_�L��_���l_�N��To
     */
    public String getEntranceFeeChildTo() {
        return entranceFeeChildTo;
    }

    /**
     * ���ꗿ_�L�����擾���܂��B
     * 
     * @return ���ꗿ_�L��
     */
    public String getEntranceFeeFlg() {
        return entranceFeeFlg;
    }

    /**
     * ���ꗿ_������ނ��擾���܂��B
     * 
     * @return ���ꗿ_�������
     */
    public String getEntranceFeeFree() {
        return entranceFeeFree;
    }

    /**
     * ���ꗿ_�L��_���Ԃ��擾���܂��B
     * 
     * @return ���ꗿ_�L��_����
     */
    public String getEntranceFeeHhPay() {
        return entranceFeeHhPay;
    }

    /**
     * ���ꗿ_�L��_�����擾���܂��B
     * 
     * @return ���ꗿ_�L��_��
     */
    public String getEntranceFeeMmPay() {
        return entranceFeeMmPay;
    }

    /**
     * ���ꗿ_�L����ނ��擾���܂��B
     * 
     * @return ���ꗿ_�L�����
     */
    public String getEntranceFeePay() {
        return entranceFeePay;
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
     * �Q�����f�ݔ��P_��l���� �i���芊��\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��P_��l���� �i���芊��\�j
     */
    public String getGelandeChargeAdult1() {
        return gelandeChargeAdult1;
    }

    /**
     * �Q�����f�ݔ��Q_��l���� �i�X�L�[�����\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��Q_��l���� �i�X�L�[�����\�j
     */
    public String getGelandeChargeAdult2() {
        return gelandeChargeAdult2;
    }

    /**
     * �Q�����f�ݔ��R_��l���� �i�X�m�[�G�X�J���[�^�[�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��R_��l���� �i�X�m�[�G�X�J���[�^�[�j
     */
    public String getGelandeChargeAdult3() {
        return gelandeChargeAdult3;
    }

    /**
     * �Q�����f�ݔ��S_��l���� �i�X�m�[�`���[�r���O�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��S_��l���� �i�X�m�[�`���[�r���O�j
     */
    public String getGelandeChargeAdult4() {
        return gelandeChargeAdult4;
    }

    /**
     * �Q�����f�ݔ��T_��l���� �i�����i�p����g��Ȃ��j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��T_��l���� �i�����i�p����g��Ȃ��j�j
     */
    public String getGelandeChargeAdult5() {
        return gelandeChargeAdult5;
    }

    /**
     * �Q�����f�ݔ��U_��l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��U_��l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public String getGelandeChargeAdult6() {
        return gelandeChargeAdult6;
    }

    /**
     * �Q�����f�ݔ��V_��l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��V_��l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public String getGelandeChargeAdult7() {
        return gelandeChargeAdult7;
    }

    /**
     * �Q�����f�ݔ��P_���l���� �i���芊��\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��P_���l���� �i���芊��\�j
     */
    public String getGelandeChargeChild1() {
        return gelandeChargeChild1;
    }

    /**
     * �Q�����f�ݔ��Q_���l���� �i�X�L�[�����\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��Q_���l���� �i�X�L�[�����\�j
     */
    public String getGelandeChargeChild2() {
        return gelandeChargeChild2;
    }

    /**
     * �Q�����f�ݔ��R_���l���� �i�X�m�[�G�X�J���[�^�[�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��R_���l���� �i�X�m�[�G�X�J���[�^�[�j
     */
    public String getGelandeChargeChild3() {
        return gelandeChargeChild3;
    }

    /**
     * �Q�����f�ݔ��S_���l���� �i�X�m�[�`���[�r���O�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��S_���l���� �i�X�m�[�`���[�r���O�j
     */
    public String getGelandeChargeChild4() {
        return gelandeChargeChild4;
    }

    /**
     * �Q�����f�ݔ��T_���l���� �i�����i�p����g��Ȃ��j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��T_���l���� �i�����i�p����g��Ȃ��j�j
     */
    public String getGelandeChargeChild5() {
        return gelandeChargeChild5;
    }

    /**
     * �Q�����f�ݔ��U_���l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��U_���l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public String getGelandeChargeChild6() {
        return gelandeChargeChild6;
    }

    /**
     * �Q�����f�ݔ��V_���l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��V_���l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public String getGelandeChargeChild7() {
        return gelandeChargeChild7;
    }

    /**
     * �Q�����f�ݔ��P_�����L�� �i���芊��\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��P_�����L�� �i���芊��\�j
     */
    public String getGelandeChargeFlg1() {
        return gelandeChargeFlg1;
    }

    /**
     * �Q�����f�ݔ��Q_�����L�� �i�X�L�[�����\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��Q_�����L�� �i�X�L�[�����\�j
     */
    public String getGelandeChargeFlg2() {
        return gelandeChargeFlg2;
    }

    /**
     * �Q�����f�ݔ��R_�����L�� �i�X�m�[�G�X�J���[�^�[�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��R_�����L�� �i�X�m�[�G�X�J���[�^�[�j
     */
    public String getGelandeChargeFlg3() {
        return gelandeChargeFlg3;
    }

    /**
     * �Q�����f�ݔ��S_�����L�� �i�X�m�[�`���[�r���O�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��S_�����L�� �i�X�m�[�`���[�r���O�j
     */
    public String getGelandeChargeFlg4() {
        return gelandeChargeFlg4;
    }

    /**
     * �Q�����f�ݔ��T_�����L�� �i�����i�p����g��Ȃ��j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��T_�����L�� �i�����i�p����g��Ȃ��j�j
     */
    public String getGelandeChargeFlg5() {
        return gelandeChargeFlg5;
    }

    /**
     * �Q�����f�ݔ��U_�����L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��U_�����L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public String getGelandeChargeFlg6() {
        return gelandeChargeFlg6;
    }

    /**
     * �Q�����f�ݔ��V_�����L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��V_�����L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public String getGelandeChargeFlg7() {
        return gelandeChargeFlg7;
    }

    /**
     * �Q�����f�ݔ��P_�L�� �i���芊��\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��P_�L�� �i���芊��\�j
     */
    public String getGelandeFlg1() {
        return gelandeFlg1;
    }

    /**
     * �Q�����f�ݔ��Q_�L�� �i�X�L�[�����\�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��Q_�L�� �i�X�L�[�����\�j
     */
    public String getGelandeFlg2() {
        return gelandeFlg2;
    }

    /**
     * �Q�����f�ݔ��R_�L�� �i�X�m�[�G�X�J���[�^�[�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��R_�L�� �i�X�m�[�G�X�J���[�^�[�j
     */
    public String getGelandeFlg3() {
        return gelandeFlg3;
    }

    /**
     * �Q�����f�ݔ��S_�L�� �i�X�m�[�`���[�r���O�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��S_�L�� �i�X�m�[�`���[�r���O�j
     */
    public String getGelandeFlg4() {
        return gelandeFlg4;
    }

    /**
     * �Q�����f�ݔ��T_�L�� �i�����i�p����g��Ȃ��j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��T_�L�� �i�����i�p����g��Ȃ��j�j
     */
    public String getGelandeFlg5() {
        return gelandeFlg5;
    }

    /**
     * �Q�����f�ݔ��U_�L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��U_�L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public String getGelandeFlg6() {
        return gelandeFlg6;
    }

    /**
     * �Q�����f�ݔ��V_�L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j���擾���܂��B
     * 
     * @return �Q�����f�ݔ��V_�L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public String getGelandeFlg7() {
        return gelandeFlg7;
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
     * ���̑��ݔ��P���擾���܂��B
     * 
     * @return ���̑��ݔ��P
     */
    public String getOtherFacility1() {
        return otherFacility1;
    }

    /**
     * ���̑��ݔ��Q���擾���܂��B
     * 
     * @return ���̑��ݔ��Q
     */
    public String getOtherFacility2() {
        return otherFacility2;
    }

    /**
     * ���̑��ݔ��R���擾���܂��B
     * 
     * @return ���̑��ݔ��R
     */
    public String getOtherFacility3() {
        return otherFacility3;
    }

    /**
     * ���̑��ݔ��S���擾���܂��B
     * 
     * @return ���̑��ݔ��S
     */
    public String getOtherFacility4() {
        return otherFacility4;
    }

    /**
     * ���̑����L�������擾���܂��B
     * 
     * @return ���̑����L����
     */
    public String getOtherSpCmt() {
        return otherSpCmt;
    }

    /**
     * �L�b�Y��p�G���A�L����ݒ肵�܂��B
     * 
     * @param areaForKidsFlg
     *            �L�b�Y��p�G���A�L��
     */
    public void setAreaForKidsFlg(String areaForKidsFlg) {
        this.areaForKidsFlg = areaForKidsFlg;
    }

    /**
     * ���ꗿ_�L��_��l_�N���ݒ肵�܂��B
     * 
     * @param entranceFeeAdultAge
     *            ���ꗿ_�L��_��l_�N��
     */
    public void setEntranceFeeAdultAge(String entranceFeeAdultAge) {
        this.entranceFeeAdultAge = entranceFeeAdultAge;
    }

    /**
     * ���ꗿ_�L��_��l_������ݒ肵�܂��B
     * 
     * @param entranceFeeAdultCharge
     *            ���ꗿ_�L��_��l_����
     */
    public void setEntranceFeeAdultCharge(String entranceFeeAdultCharge) {
        this.entranceFeeAdultCharge = entranceFeeAdultCharge;
    }

    /**
     * ���ꗿ_�L��_��l��ݒ肵�܂��B
     * 
     * @param entranceFeeAdultPay
     *            ���ꗿ_�L��_��l
     */
    public void setEntranceFeeAdultPay(String entranceFeeAdultPay) {
        this.entranceFeeAdultPay = entranceFeeAdultPay;
    }

    /**
     * ���ꗿ_�L��_���l_������ݒ肵�܂��B
     * 
     * @param entranceFeeChildCharge
     *            ���ꗿ_�L��_���l_����
     */
    public void setEntranceFeeChildCharge(String entranceFeeChildCharge) {
        this.entranceFeeChildCharge = entranceFeeChildCharge;
    }

    /**
     * ���ꗿ_�L��_���l_�N��From��ݒ肵�܂��B
     * 
     * @param entranceFeeChildFrom
     *            ���ꗿ_�L��_���l_�N��From
     */
    public void setEntranceFeeChildFrom(String entranceFeeChildFrom) {
        this.entranceFeeChildFrom = entranceFeeChildFrom;
    }

    /**
     * ���ꗿ_�L��_���l��ݒ肵�܂��B
     * 
     * @param entranceFeeChildPay
     *            ���ꗿ_�L��_���l
     */
    public void setEntranceFeeChildPay(String entranceFeeChildPay) {
        this.entranceFeeChildPay = entranceFeeChildPay;
    }

    /**
     * ���ꗿ_�L��_���l_�N��To��ݒ肵�܂��B
     * 
     * @param entranceFeeChildTo
     *            ���ꗿ_�L��_���l_�N��To
     */
    public void setEntranceFeeChildTo(String entranceFeeChildTo) {
        this.entranceFeeChildTo = entranceFeeChildTo;
    }

    /**
     * ���ꗿ_�L����ݒ肵�܂��B
     * 
     * @param entranceFeeFlg
     *            ���ꗿ_�L��
     */
    public void setEntranceFeeFlg(String entranceFeeFlg) {
        this.entranceFeeFlg = entranceFeeFlg;
    }

    /**
     * ���ꗿ_������ނ�ݒ肵�܂��B
     * 
     * @param entranceFeeFree
     *            ���ꗿ_�������
     */
    public void setEntranceFeeFree(String entranceFeeFree) {
        this.entranceFeeFree = entranceFeeFree;
    }

    /**
     * ���ꗿ_�L��_���Ԃ�ݒ肵�܂��B
     * 
     * @param entranceFeeHhPay
     *            ���ꗿ_�L��_����
     */
    public void setEntranceFeeHhPay(String entranceFeeHhPay) {
        this.entranceFeeHhPay = entranceFeeHhPay;
    }

    /**
     * ���ꗿ_�L��_����ݒ肵�܂��B
     * 
     * @param entranceFeeMmPay
     *            ���ꗿ_�L��_��
     */
    public void setEntranceFeeMmPay(String entranceFeeMmPay) {
        this.entranceFeeMmPay = entranceFeeMmPay;
    }

    /**
     * ���ꗿ_�L����ނ�ݒ肵�܂��B
     * 
     * @param entranceFeePay
     *            ���ꗿ_�L�����
     */
    public void setEntranceFeePay(String entranceFeePay) {
        this.entranceFeePay = entranceFeePay;
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
     * �Q�����f�ݔ��P_��l���� �i���芊��\�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeAdult1
     *            �Q�����f�ݔ��P_��l���� �i���芊��\�j
     */
    public void setGelandeChargeAdult1(String gelandeChargeAdult1) {
        this.gelandeChargeAdult1 = gelandeChargeAdult1;
    }

    /**
     * �Q�����f�ݔ��Q_��l���� �i�X�L�[�����\�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeAdult2
     *            �Q�����f�ݔ��Q_��l���� �i�X�L�[�����\�j
     */
    public void setGelandeChargeAdult2(String gelandeChargeAdult2) {
        this.gelandeChargeAdult2 = gelandeChargeAdult2;
    }

    /**
     * �Q�����f�ݔ��R_��l���� �i�X�m�[�G�X�J���[�^�[�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeAdult3
     *            �Q�����f�ݔ��R_��l���� �i�X�m�[�G�X�J���[�^�[�j
     */
    public void setGelandeChargeAdult3(String gelandeChargeAdult3) {
        this.gelandeChargeAdult3 = gelandeChargeAdult3;
    }

    /**
     * �Q�����f�ݔ��S_��l���� �i�X�m�[�`���[�r���O�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeAdult4
     *            �Q�����f�ݔ��S_��l���� �i�X�m�[�`���[�r���O�j
     */
    public void setGelandeChargeAdult4(String gelandeChargeAdult4) {
        this.gelandeChargeAdult4 = gelandeChargeAdult4;
    }

    /**
     * �Q�����f�ݔ��T_��l���� �i�����i�p����g��Ȃ��j�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeAdult5
     *            �Q�����f�ݔ��T_��l���� �i�����i�p����g��Ȃ��j�j
     */
    public void setGelandeChargeAdult5(String gelandeChargeAdult5) {
        this.gelandeChargeAdult5 = gelandeChargeAdult5;
    }

    /**
     * �Q�����f�ݔ��U_��l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeAdult6
     *            �Q�����f�ݔ��U_��l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public void setGelandeChargeAdult6(String gelandeChargeAdult6) {
        this.gelandeChargeAdult6 = gelandeChargeAdult6;
    }

    /**
     * �Q�����f�ݔ��V_��l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeAdult7
     *            �Q�����f�ݔ��V_��l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public void setGelandeChargeAdult7(String gelandeChargeAdult7) {
        this.gelandeChargeAdult7 = gelandeChargeAdult7;
    }

    /**
     * �Q�����f�ݔ��P_���l���� �i���芊��\�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeChild1
     *            �Q�����f�ݔ��P_���l���� �i���芊��\�j
     */
    public void setGelandeChargeChild1(String gelandeChargeChild1) {
        this.gelandeChargeChild1 = gelandeChargeChild1;
    }

    /**
     * �Q�����f�ݔ��Q_���l���� �i�X�L�[�����\�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeChild2
     *            �Q�����f�ݔ��Q_���l���� �i�X�L�[�����\�j
     */
    public void setGelandeChargeChild2(String gelandeChargeChild2) {
        this.gelandeChargeChild2 = gelandeChargeChild2;
    }

    /**
     * �Q�����f�ݔ��R_���l���� �i�X�m�[�G�X�J���[�^�[�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeChild3
     *            �Q�����f�ݔ��R_���l���� �i�X�m�[�G�X�J���[�^�[�j
     */
    public void setGelandeChargeChild3(String gelandeChargeChild3) {
        this.gelandeChargeChild3 = gelandeChargeChild3;
    }

    /**
     * �Q�����f�ݔ��S_���l���� �i�X�m�[�`���[�r���O�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeChild4
     *            �Q�����f�ݔ��S_���l���� �i�X�m�[�`���[�r���O�j
     */
    public void setGelandeChargeChild4(String gelandeChargeChild4) {
        this.gelandeChargeChild4 = gelandeChargeChild4;
    }

    /**
     * �Q�����f�ݔ��T_���l���� �i�����i�p����g��Ȃ��j�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeChild5
     *            �Q�����f�ݔ��T_���l���� �i�����i�p����g��Ȃ��j�j
     */
    public void setGelandeChargeChild5(String gelandeChargeChild5) {
        this.gelandeChargeChild5 = gelandeChargeChild5;
    }

    /**
     * �Q�����f�ݔ��U_���l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeChild6
     *            �Q�����f�ݔ��U_���l���� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public void setGelandeChargeChild6(String gelandeChargeChild6) {
        this.gelandeChargeChild6 = gelandeChargeChild6;
    }

    /**
     * �Q�����f�ݔ��V_���l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeChild7
     *            �Q�����f�ݔ��V_���l���� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public void setGelandeChargeChild7(String gelandeChargeChild7) {
        this.gelandeChargeChild7 = gelandeChargeChild7;
    }

    /**
     * �Q�����f�ݔ��P_�����L�� �i���芊��\�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeFlg1
     *            �Q�����f�ݔ��P_�����L�� �i���芊��\�j
     */
    public void setGelandeChargeFlg1(String gelandeChargeFlg1) {
        this.gelandeChargeFlg1 = gelandeChargeFlg1;
    }

    /**
     * �Q�����f�ݔ��Q_�����L�� �i�X�L�[�����\�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeFlg2
     *            �Q�����f�ݔ��Q_�����L�� �i�X�L�[�����\�j
     */
    public void setGelandeChargeFlg2(String gelandeChargeFlg2) {
        this.gelandeChargeFlg2 = gelandeChargeFlg2;
    }

    /**
     * �Q�����f�ݔ��R_�����L�� �i�X�m�[�G�X�J���[�^�[�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeFlg3
     *            �Q�����f�ݔ��R_�����L�� �i�X�m�[�G�X�J���[�^�[�j
     */
    public void setGelandeChargeFlg3(String gelandeChargeFlg3) {
        this.gelandeChargeFlg3 = gelandeChargeFlg3;
    }

    /**
     * �Q�����f�ݔ��S_�����L�� �i�X�m�[�`���[�r���O�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeFlg4
     *            �Q�����f�ݔ��S_�����L�� �i�X�m�[�`���[�r���O�j
     */
    public void setGelandeChargeFlg4(String gelandeChargeFlg4) {
        this.gelandeChargeFlg4 = gelandeChargeFlg4;
    }

    /**
     * �Q�����f�ݔ��T_�����L�� �i�����i�p����g��Ȃ��j�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeFlg5
     *            �Q�����f�ݔ��T_�����L�� �i�����i�p����g��Ȃ��j�j
     */
    public void setGelandeChargeFlg5(String gelandeChargeFlg5) {
        this.gelandeChargeFlg5 = gelandeChargeFlg5;
    }

    /**
     * �Q�����f�ݔ��U_�����L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeFlg6
     *            �Q�����f�ݔ��U_�����L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public void setGelandeChargeFlg6(String gelandeChargeFlg6) {
        this.gelandeChargeFlg6 = gelandeChargeFlg6;
    }

    /**
     * �Q�����f�ݔ��V_�����L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j��ݒ肵�܂��B
     * 
     * @param gelandeChargeFlg7
     *            �Q�����f�ݔ��V_�����L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public void setGelandeChargeFlg7(String gelandeChargeFlg7) {
        this.gelandeChargeFlg7 = gelandeChargeFlg7;
    }

    /**
     * �Q�����f�ݔ��P_�L�� �i���芊��\�j��ݒ肵�܂��B
     * 
     * @param gelandeFlg1
     *            �Q�����f�ݔ��P_�L�� �i���芊��\�j
     */
    public void setGelandeFlg1(String gelandeFlg1) {
        this.gelandeFlg1 = gelandeFlg1;
    }

    /**
     * �Q�����f�ݔ��Q_�L�� �i�X�L�[�����\�j��ݒ肵�܂��B
     * 
     * @param gelandeFlg2
     *            �Q�����f�ݔ��Q_�L�� �i�X�L�[�����\�j
     */
    public void setGelandeFlg2(String gelandeFlg2) {
        this.gelandeFlg2 = gelandeFlg2;
    }

    /**
     * �Q�����f�ݔ��R_�L�� �i�X�m�[�G�X�J���[�^�[�j��ݒ肵�܂��B
     * 
     * @param gelandeFlg3
     *            �Q�����f�ݔ��R_�L�� �i�X�m�[�G�X�J���[�^�[�j
     */
    public void setGelandeFlg3(String gelandeFlg3) {
        this.gelandeFlg3 = gelandeFlg3;
    }

    /**
     * �Q�����f�ݔ��S_�L�� �i�X�m�[�`���[�r���O�j��ݒ肵�܂��B
     * 
     * @param gelandeFlg4
     *            �Q�����f�ݔ��S_�L�� �i�X�m�[�`���[�r���O�j
     */
    public void setGelandeFlg4(String gelandeFlg4) {
        this.gelandeFlg4 = gelandeFlg4;
    }

    /**
     * �Q�����f�ݔ��T_�L�� �i�����i�p����g��Ȃ��j�j��ݒ肵�܂��B
     * 
     * @param gelandeFlg5
     *            �Q�����f�ݔ��T_�L�� �i�����i�p����g��Ȃ��j�j
     */
    public void setGelandeFlg5(String gelandeFlg5) {
        this.gelandeFlg5 = gelandeFlg5;
    }

    /**
     * �Q�����f�ݔ��U_�L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j��ݒ肵�܂��B
     * 
     * @param gelandeFlg6
     *            �Q�����f�ݔ��U_�L�� �i�ӂ�ӂ�i��^�̊ߋ�j�j
     */
    public void setGelandeFlg6(String gelandeFlg6) {
        this.gelandeFlg6 = gelandeFlg6;
    }

    /**
     * �Q�����f�ݔ��V_�L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j��ݒ肵�܂��B
     * 
     * @param gelandeFlg7
     *            �Q�����f�ݔ��V_�L�� �i��V�уO�b�Y�i�޹E����ٓ�)�j
     */
    public void setGelandeFlg7(String gelandeFlg7) {
        this.gelandeFlg7 = gelandeFlg7;
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
     * ���̑��ݔ��P��ݒ肵�܂��B
     * 
     * @param otherFacility1
     *            ���̑��ݔ��P
     */
    public void setOtherFacility1(String otherFacility1) {
        this.otherFacility1 = otherFacility1;
    }

    /**
     * ���̑��ݔ��Q��ݒ肵�܂��B
     * 
     * @param otherFacility2
     *            ���̑��ݔ��Q
     */
    public void setOtherFacility2(String otherFacility2) {
        this.otherFacility2 = otherFacility2;
    }

    /**
     * ���̑��ݔ��R��ݒ肵�܂��B
     * 
     * @param otherFacility3
     *            ���̑��ݔ��R
     */
    public void setOtherFacility3(String otherFacility3) {
        this.otherFacility3 = otherFacility3;
    }

    /**
     * ���̑��ݔ��S��ݒ肵�܂��B
     * 
     * @param otherFacility4
     *            ���̑��ݔ��S
     */
    public void setOtherFacility4(String otherFacility4) {
        this.otherFacility4 = otherFacility4;
    }

    /**
     * ���̑����L������ݒ肵�܂��B
     * 
     * @param otherSpCmt
     *            ���̑����L����
     */
    public void setOtherSpCmt(String otherSpCmt) {
        this.otherSpCmt = otherSpCmt;
    }

}
