package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]�{��_��ʏ�� �G���e�B�e�B
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
public class DFacilityGeneralInfo implements FacilityManageBodyKey {

    /** �ʊٔN�� */
    private String annexYears;

    /** �z���N�L�� */
    private String buildingYearsFlg;

    /** �q�������Q��L�� */
    private String childBeddingFreeFlg;

    /** �q������ */
    private String childFees;

    /** �q�������R�����g */
    private String childFeesCmt;

    /** �q�������N��From */
    private String childFreeAgeFrom;

    /** �q�������N��To */
    private String childFreeAgeTo;

    /** �q���������� */
    private String childFreeCond;

    /** �q�������L�� */
    private String childFreeFlg;

    /** �q�������H���L�� */
    private String childMealFreeFlg;

    /** �q���L���N��From */
    private String childPayAgeFrom;

    /** �q���L���N��To */
    private String childPayAgeTo;

    /** �q���L������ */
    private String childPayCond;

    /** ���p�\�N���W�b�g�J�[�hAMEX */
    private String creditCardBrandAmex;

    /** ���p�\�N���W�b�g�J�[�hDC */
    private String creditCardBrandDc;

    /** ���p�\�N���W�b�g�J�[�hDINERS */
    private String creditCardBrandDiners;

    /** ���p�\�N���W�b�g�J�[�hJACCS */
    private String creditCardBrandJaccs;

    /** ���p�\�N���W�b�g�J�[�hJCB */
    private String creditCardBrandJcb;

    /** ���p�\�N���W�b�g�J�[�hMC */
    private String creditCardBrandMc;

    /** ���p�\�N���W�b�g�J�[�hNICOS */
    private String creditCardBrandNicos;

    /** ���p�\�N���W�b�g�J�[�h���̑� */
    private String creditCardBrandOther;

    /** ���p�\�N���W�b�g�J�[�hUC */
    private String creditCardBrandUc;

    /** ���p�\�N���W�b�g�J�[�hVISA */
    private String creditCardBrandVisa;

    /** ���p�\�N���W�b�g�J�[�h�L�� */
    private String creditCardFlg;

    /** ���p�\�N���W�b�g�J�[�h���̑����e */
    private String creditCardOthers;

    /** �������ߋq�w_�J�b�v�� */
    private String customerCouple;

    /** �������ߋq�w_�t�@�~���[ */
    private String customerFamily;

    /** �q�w�ʂ������ߗL�� */
    private String customerFlg;

    /** �������ߋq�w_�n�N */
    private String customerMiddle;

    /** �������ߋq�w_���̑� */
    private String customerOther;

    /** �G���x�[�^�[�L�� */
    private String elevatorFlg;

    /** �p��S���敪 */
    private String engAllDiv;

    /** �p��̏o����t�����g�W�L�� */
    private String engFrontFlg;

    /** �p��J�n���ԁi���ԁj */
    private String engTimeBeginHour;

    /** �p��J�n���ԁi���j */
    private String engTimeBeginMinute;

    /** �p�ꎞ�ԋ敪 */
    private String engTimeDiv;

    /** �p��I�����ԁi���ԁj */
    private String engTimeEndHour;

    /** �p��I�����ԁi���j */
    private String engTimeEndMinute;

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �{�݃p�^�[�� */
    private String facilityPattern;

    /** �`�F�b�N�C���O�̉ו��a����L�� */
    private String keepBaggageFlg;

    /** �񓚏���� */
    private String kindFlg;

    /** �{�ٔN�� */
    private String mainBuildingYears;

    /** �����}�b�T�[�W�@�L�� */
    private String massagerFlg;

    /** �����}�b�T�[�W�@�ݒu�ꏊ */
    private String massagerLocation;

    /** �����}�b�T�[�W�@�䐔 */
    private String massagerNum;

    /** �����}�b�T�[�W�@�L���L�� */
    private String massagerPayFlg;

    /** �����}�b�T�[�W�@���p���z */
    private String massagerUseAmt;

    /** �����}�b�T�[�W�@���p���� */
    private String massagerUseTime;

    /** ���l */
    private String memo;

    /** �V�ٔN�� */
    private String newBuildingYears;

    /** ���̑��R�����g */
    private String othersCmt;

    /** �����܂Ŗӓ����L�� */
    private String roomGuideDogFlg;

    /** �����܂Ńy�b�g���� */
    private String roomPetCond;

    /** �����܂Ńy�b�g�L�� */
    private String roomPetFlg;

    /** �Z�[���X�|�C���g */
    private String salesPoint;

    /** ��b�S���敪 */
    private String signLangAllDiv;

    /** ��b�J�n���ԁi���ԁj */
    private String signLangBeginHour;

    /** ��b�J�n���ԁi���j */
    private String signLangBeginMinute;

    /** ��b�I�����ԁi���ԁj */
    private String signLangEndHour;

    /** ��b�I�����ԁi���j */
    private String signLangEndMinute;

    /** ��b�̏o����t�����g�W�L�� */
    private String signLangFrontFlg;

    /** ��b���ԋ敪 */
    private String signLangTimeDiv;

    /** �������߃R�����g */
    private String suggestionCmt;

    /** ���q�����L�� */
    private String totalRoomFlg;

    /** ���q���� */
    private String totalRoomNum;

    /** �Ԉ֎q����L�� */
    private String wheelchairFlg;

    /** �Ԉ֎q����䐔 */
    private String wheelchairNum;

    /**
     * �ʊٔN�����擾���܂��B
     * 
     * @return �ʊٔN��
     */
    public String getAnnexYears() {
        return annexYears;
    }

    /**
     * �z���N�L�����擾���܂��B
     * 
     * @return �z���N�L��
     */
    public String getBuildingYearsFlg() {
        return buildingYearsFlg;
    }

    /**
     * �q�������Q��L�����擾���܂��B
     * 
     * @return �q�������Q��L��
     */
    public String getChildBeddingFreeFlg() {
        return childBeddingFreeFlg;
    }

    /**
     * �q���������擾���܂��B
     * 
     * @return �q������
     */
    public String getChildFees() {
        return childFees;
    }

    /**
     * �q�������R�����g���擾���܂��B
     * 
     * @return �q�������R�����g
     */
    public String getChildFeesCmt() {
        return childFeesCmt;
    }

    /**
     * �q�������N��From���擾���܂��B
     * 
     * @return �q�������N��From
     */
    public String getChildFreeAgeFrom() {
        return childFreeAgeFrom;
    }

    /**
     * �q�������N��To���擾���܂��B
     * 
     * @return �q�������N��To
     */
    public String getChildFreeAgeTo() {
        return childFreeAgeTo;
    }

    /**
     * �q�������������擾���܂��B
     * 
     * @return �q����������
     */
    public String getChildFreeCond() {
        return childFreeCond;
    }

    /**
     * �q�������L�����擾���܂��B
     * 
     * @return �q�������L��
     */
    public String getChildFreeFlg() {
        return childFreeFlg;
    }

    /**
     * �q�������H���L�����擾���܂��B
     * 
     * @return �q�������H���L��
     */
    public String getChildMealFreeFlg() {
        return childMealFreeFlg;
    }

    /**
     * �q���L���N��From���擾���܂��B
     * 
     * @return �q���L���N��From
     */
    public String getChildPayAgeFrom() {
        return childPayAgeFrom;
    }

    /**
     * �q���L���N��To���擾���܂��B
     * 
     * @return �q���L���N��To
     */
    public String getChildPayAgeTo() {
        return childPayAgeTo;
    }

    /**
     * �q���L���������擾���܂��B
     * 
     * @return �q���L������
     */
    public String getChildPayCond() {
        return childPayCond;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hAMEX���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hAMEX
     */
    public String getCreditCardBrandAmex() {
        return creditCardBrandAmex;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hDC���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hDC
     */
    public String getCreditCardBrandDc() {
        return creditCardBrandDc;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hDINERS���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hDINERS
     */
    public String getCreditCardBrandDiners() {
        return creditCardBrandDiners;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hJACCS���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hJACCS
     */
    public String getCreditCardBrandJaccs() {
        return creditCardBrandJaccs;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hJCB���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hJCB
     */
    public String getCreditCardBrandJcb() {
        return creditCardBrandJcb;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hMC���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hMC
     */
    public String getCreditCardBrandMc() {
        return creditCardBrandMc;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hNICOS���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hNICOS
     */
    public String getCreditCardBrandNicos() {
        return creditCardBrandNicos;
    }

    /**
     * ���p�\�N���W�b�g�J�[�h���̑����擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�h���̑�
     */
    public String getCreditCardBrandOther() {
        return creditCardBrandOther;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hUC���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hUC
     */
    public String getCreditCardBrandUc() {
        return creditCardBrandUc;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hVISA���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�hVISA
     */
    public String getCreditCardBrandVisa() {
        return creditCardBrandVisa;
    }

    /**
     * ���p�\�N���W�b�g�J�[�h�L�����擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�h�L��
     */
    public String getCreditCardFlg() {
        return creditCardFlg;
    }

    /**
     * ���p�\�N���W�b�g�J�[�h���̑����e���擾���܂��B
     * 
     * @return ���p�\�N���W�b�g�J�[�h���̑����e
     */
    public String getCreditCardOthers() {
        return creditCardOthers;
    }

    /**
     * �������ߋq�w_�J�b�v�����擾���܂��B
     * 
     * @return �������ߋq�w_�J�b�v��
     */
    public String getCustomerCouple() {
        return customerCouple;
    }

    /**
     * �������ߋq�w_�t�@�~���[���擾���܂��B
     * 
     * @return �������ߋq�w_�t�@�~���[
     */
    public String getCustomerFamily() {
        return customerFamily;
    }

    /**
     * �q�w�ʂ������ߗL�����擾���܂��B
     * 
     * @return �q�w�ʂ������ߗL��
     */
    public String getCustomerFlg() {
        return customerFlg;
    }

    /**
     * �������ߋq�w_�n�N���擾���܂��B
     * 
     * @return �������ߋq�w_�n�N
     */
    public String getCustomerMiddle() {
        return customerMiddle;
    }

    /**
     * �������ߋq�w_���̑����擾���܂��B
     * 
     * @return �������ߋq�w_���̑�
     */
    public String getCustomerOther() {
        return customerOther;
    }

    /**
     * �G���x�[�^�[�L�����擾���܂��B
     * 
     * @return �G���x�[�^�[�L��
     */
    public String getElevatorFlg() {
        return elevatorFlg;
    }

    /**
     * �p��S���敪���擾���܂��B
     * 
     * @return �p��S���敪
     */
    public String getEngAllDiv() {
        return engAllDiv;
    }

    /**
     * �p��̏o����t�����g�W�L�����擾���܂��B
     * 
     * @return �p��̏o����t�����g�W�L��
     */
    public String getEngFrontFlg() {
        return engFrontFlg;
    }

    /**
     * �p��J�n���Ԃ��擾���܂��B
     * 
     * @return �p��J�n����
     */
    public String getEngTimeBegin() {
        return DKikakuWebUtil.buildTime(getEngTimeBeginHour(),
                getEngTimeBeginMinute());
    }

    /**
     * �p��J�n���ԁi���ԁj���擾���܂��B
     * 
     * @return �p��J�n���ԁi���ԁj
     */
    public String getEngTimeBeginHour() {
        return engTimeBeginHour;
    }

    /**
     * �p��J�n���ԁi���j���擾���܂��B
     * 
     * @return �p��J�n���ԁi���j
     */
    public String getEngTimeBeginMinute() {
        return engTimeBeginMinute;
    }

    /**
     * �p�ꎞ�ԋ敪���擾���܂��B
     * 
     * @return �p�ꎞ�ԋ敪
     */
    public String getEngTimeDiv() {
        return engTimeDiv;
    }

    /**
     * �p��I�����Ԃ��擾���܂��B
     * 
     * @return �p��I������
     */
    public String getEngTimeEnd() {
        return DKikakuWebUtil.buildTime(getEngTimeEndHour(),
                getEngTimeEndMinute());
    }

    /**
     * �p��I�����ԁi���ԁj���擾���܂��B
     * 
     * @return �p��I�����ԁi���ԁj
     */
    public String getEngTimeEndHour() {
        return engTimeEndHour;
    }

    /**
     * �p��I�����ԁi���j���擾���܂��B
     * 
     * @return �p��I�����ԁi���j
     */
    public String getEngTimeEndMinute() {
        return engTimeEndMinute;
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
     * �`�F�b�N�C���O�̉ו��a����L�����擾���܂��B
     * 
     * @return �`�F�b�N�C���O�̉ו��a����L��
     */
    public String getKeepBaggageFlg() {
        return keepBaggageFlg;
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
     * �{�ٔN�����擾���܂��B
     * 
     * @return �{�ٔN��
     */
    public String getMainBuildingYears() {
        return mainBuildingYears;
    }

    /**
     * �����}�b�T�[�W�@�L�����擾���܂��B
     * 
     * @return �����}�b�T�[�W�@�L��
     */
    public String getMassagerFlg() {
        return massagerFlg;
    }

    /**
     * �����}�b�T�[�W�@�ݒu�ꏊ���擾���܂��B
     * 
     * @return �����}�b�T�[�W�@�ݒu�ꏊ
     */
    public String getMassagerLocation() {
        return massagerLocation;
    }

    /**
     * �����}�b�T�[�W�@�䐔���擾���܂��B
     * 
     * @return �����}�b�T�[�W�@�䐔
     */
    public String getMassagerNum() {
        return massagerNum;
    }

    /**
     * �����}�b�T�[�W�@�L���L�����擾���܂��B
     * 
     * @return �����}�b�T�[�W�@�L���L��
     */
    public String getMassagerPayFlg() {
        return massagerPayFlg;
    }

    /**
     * �����}�b�T�[�W�@���p���z���擾���܂��B
     * 
     * @return �����}�b�T�[�W�@���p���z
     */
    public String getMassagerUseAmt() {
        return massagerUseAmt;
    }

    /**
     * �����}�b�T�[�W�@���p���Ԃ��擾���܂��B
     * 
     * @return �����}�b�T�[�W�@���p����
     */
    public String getMassagerUseTime() {
        return massagerUseTime;
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
     * �V�ٔN�����擾���܂��B
     * 
     * @return �V�ٔN��
     */
    public String getNewBuildingYears() {
        return newBuildingYears;
    }

    /**
     * ���̑��R�����g���擾���܂��B
     * 
     * @return ���̑��R�����g
     */
    public String getOthersCmt() {
        return othersCmt;
    }

    /**
     * �����܂Ŗӓ����L�����擾���܂��B
     * 
     * @return �����܂Ŗӓ����L��
     */
    public String getRoomGuideDogFlg() {
        return roomGuideDogFlg;
    }

    /**
     * �����܂Ńy�b�g�������擾���܂��B
     * 
     * @return �����܂Ńy�b�g����
     */
    public String getRoomPetCond() {
        return roomPetCond;
    }

    /**
     * �����܂Ńy�b�g�L�����擾���܂��B
     * 
     * @return �����܂Ńy�b�g�L��
     */
    public String getRoomPetFlg() {
        return roomPetFlg;
    }

    /**
     * �Z�[���X�|�C���g���擾���܂��B
     * 
     * @return �Z�[���X�|�C���g
     */
    public String getSalesPoint() {
        return salesPoint;
    }

    /**
     * ��b�S���敪���擾���܂��B
     * 
     * @return ��b�S���敪
     */
    public String getSignLangAllDiv() {
        return signLangAllDiv;
    }

    /**
     * ��b�J�n���Ԃ��擾���܂��B
     * 
     * @return ��b�J�n����
     */
    public String getSignLangBegin() {
        return DKikakuWebUtil.buildTime(getSignLangBeginHour(),
                getSignLangBeginMinute());
    }

    /**
     * ��b�J�n���ԁi���ԁj���擾���܂��B
     * 
     * @return ��b�J�n���ԁi���ԁj
     */
    public String getSignLangBeginHour() {
        return signLangBeginHour;
    }

    /**
     * ��b�J�n���ԁi���j���擾���܂��B
     * 
     * @return ��b�J�n���ԁi���j
     */
    public String getSignLangBeginMinute() {
        return signLangBeginMinute;
    }

    /**
     * ��b�I�����Ԃ��擾���܂��B
     * 
     * @return ��b�I������
     */
    public String getSignLangEnd() {
        return DKikakuWebUtil.buildTime(getSignLangEndHour(),
                getSignLangEndMinute());
    }

    /**
     * ��b�I�����ԁi���ԁj���擾���܂��B
     * 
     * @return ��b�I�����ԁi���ԁj
     */
    public String getSignLangEndHour() {
        return signLangEndHour;
    }

    /**
     * ��b�I�����ԁi���j���擾���܂��B
     * 
     * @return ��b�I�����ԁi���j
     */
    public String getSignLangEndMinute() {
        return signLangEndMinute;
    }

    /**
     * ��b�̏o����t�����g�W�L�����擾���܂��B
     * 
     * @return ��b�̏o����t�����g�W�L��
     */
    public String getSignLangFrontFlg() {
        return signLangFrontFlg;
    }

    /**
     * ��b���ԋ敪���擾���܂��B
     * 
     * @return ��b���ԋ敪
     */
    public String getSignLangTimeDiv() {
        return signLangTimeDiv;
    }

    /**
     * �������߃R�����g���擾���܂��B
     * 
     * @return �������߃R�����g
     */
    public String getSuggestionCmt() {
        return suggestionCmt;
    }

    /**
     * ���q�����L�����擾���܂��B
     * 
     * @return ���q�����L��
     */
    public String getTotalRoomFlg() {
        return totalRoomFlg;
    }

    /**
     * ���q�������擾���܂��B
     * 
     * @return ���q����
     */
    public String getTotalRoomNum() {
        return totalRoomNum;
    }

    /**
     * �Ԉ֎q����L�����擾���܂��B
     * 
     * @return �Ԉ֎q����L��
     */
    public String getWheelchairFlg() {
        return wheelchairFlg;
    }

    /**
     * �Ԉ֎q����䐔���擾���܂��B
     * 
     * @return �Ԉ֎q����䐔
     */
    public String getWheelchairNum() {
        return wheelchairNum;
    }

    /**
     * �ʊٔN����ݒ肵�܂��B
     * 
     * @param annexYears
     *            �ʊٔN��
     */
    public void setAnnexYears(String annexYears) {
        this.annexYears = annexYears;
    }

    /**
     * �z���N�L����ݒ肵�܂��B
     * 
     * @param buildingYearsFlg
     *            �z���N�L��
     */
    public void setBuildingYearsFlg(String buildingYearsFlg) {
        this.buildingYearsFlg = buildingYearsFlg;
    }

    /**
     * �q�������Q��L����ݒ肵�܂��B
     * 
     * @param childBeddingFreeFlg
     *            �q�������Q��L��
     */
    public void setChildBeddingFreeFlg(String childBeddingFreeFlg) {
        this.childBeddingFreeFlg = childBeddingFreeFlg;
    }

    /**
     * �q��������ݒ肵�܂��B
     * 
     * @param childFees
     *            �q������
     */
    public void setChildFees(String childFees) {
        this.childFees = childFees;
    }

    /**
     * �q�������R�����g��ݒ肵�܂��B
     * 
     * @param childFeesCmt
     *            �q�������R�����g
     */
    public void setChildFeesCmt(String childFeesCmt) {
        this.childFeesCmt = childFeesCmt;
    }

    /**
     * �q�������N��From��ݒ肵�܂��B
     * 
     * @param childFreeAgeFrom
     *            �q�������N��From
     */
    public void setChildFreeAgeFrom(String childFreeAgeFrom) {
        this.childFreeAgeFrom = childFreeAgeFrom;
    }

    /**
     * �q�������N��To��ݒ肵�܂��B
     * 
     * @param childFreeAgeTo
     *            �q�������N��To
     */
    public void setChildFreeAgeTo(String childFreeAgeTo) {
        this.childFreeAgeTo = childFreeAgeTo;
    }

    /**
     * �q������������ݒ肵�܂��B
     * 
     * @param childFreeCond
     *            �q����������
     */
    public void setChildFreeCond(String childFreeCond) {
        this.childFreeCond = childFreeCond;
    }

    /**
     * �q�������L����ݒ肵�܂��B
     * 
     * @param childFreeFlg
     *            �q�������L��
     */
    public void setChildFreeFlg(String childFreeFlg) {
        this.childFreeFlg = childFreeFlg;
    }

    /**
     * �q�������H���L����ݒ肵�܂��B
     * 
     * @param childMealFreeFlg
     *            �q�������H���L��
     */
    public void setChildMealFreeFlg(String childMealFreeFlg) {
        this.childMealFreeFlg = childMealFreeFlg;
    }

    /**
     * �q���L���N��From��ݒ肵�܂��B
     * 
     * @param childPayAgeFrom
     *            �q���L���N��From
     */
    public void setChildPayAgeFrom(String childPayAgeFrom) {
        this.childPayAgeFrom = childPayAgeFrom;
    }

    /**
     * �q���L���N��To��ݒ肵�܂��B
     * 
     * @param childPayAgeTo
     *            �q���L���N��To
     */
    public void setChildPayAgeTo(String childPayAgeTo) {
        this.childPayAgeTo = childPayAgeTo;
    }

    /**
     * �q���L��������ݒ肵�܂��B
     * 
     * @param childPayCond
     *            �q���L������
     */
    public void setChildPayCond(String childPayCond) {
        this.childPayCond = childPayCond;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hAMEX��ݒ肵�܂��B
     * 
     * @param creditCardBrandAmex
     *            ���p�\�N���W�b�g�J�[�hAMEX
     */
    public void setCreditCardBrandAmex(String creditCardBrandAmex) {
        this.creditCardBrandAmex = creditCardBrandAmex;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hDC��ݒ肵�܂��B
     * 
     * @param creditCardBrandDc
     *            ���p�\�N���W�b�g�J�[�hDC
     */
    public void setCreditCardBrandDc(String creditCardBrandDc) {
        this.creditCardBrandDc = creditCardBrandDc;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hDINERS��ݒ肵�܂��B
     * 
     * @param creditCardBrandDiners
     *            ���p�\�N���W�b�g�J�[�hDINERS
     */
    public void setCreditCardBrandDiners(String creditCardBrandDiners) {
        this.creditCardBrandDiners = creditCardBrandDiners;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hJACCS��ݒ肵�܂��B
     * 
     * @param creditCardBrandJaccs
     *            ���p�\�N���W�b�g�J�[�hJACCS
     */
    public void setCreditCardBrandJaccs(String creditCardBrandJaccs) {
        this.creditCardBrandJaccs = creditCardBrandJaccs;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hJCB��ݒ肵�܂��B
     * 
     * @param creditCardBrandJcb
     *            ���p�\�N���W�b�g�J�[�hJCB
     */
    public void setCreditCardBrandJcb(String creditCardBrandJcb) {
        this.creditCardBrandJcb = creditCardBrandJcb;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hMC��ݒ肵�܂��B
     * 
     * @param creditCardBrandMc
     *            ���p�\�N���W�b�g�J�[�hMC
     */
    public void setCreditCardBrandMc(String creditCardBrandMc) {
        this.creditCardBrandMc = creditCardBrandMc;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hNICOS��ݒ肵�܂��B
     * 
     * @param creditCardBrandNicos
     *            ���p�\�N���W�b�g�J�[�hNICOS
     */
    public void setCreditCardBrandNicos(String creditCardBrandNicos) {
        this.creditCardBrandNicos = creditCardBrandNicos;
    }

    /**
     * ���p�\�N���W�b�g�J�[�h���̑���ݒ肵�܂��B
     * 
     * @param creditCardBrandOther
     *            ���p�\�N���W�b�g�J�[�h���̑�
     */
    public void setCreditCardBrandOther(String creditCardBrandOther) {
        this.creditCardBrandOther = creditCardBrandOther;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hUC��ݒ肵�܂��B
     * 
     * @param creditCardBrandUc
     *            ���p�\�N���W�b�g�J�[�hUC
     */
    public void setCreditCardBrandUc(String creditCardBrandUc) {
        this.creditCardBrandUc = creditCardBrandUc;
    }

    /**
     * ���p�\�N���W�b�g�J�[�hVISA��ݒ肵�܂��B
     * 
     * @param creditCardBrandVisa
     *            ���p�\�N���W�b�g�J�[�hVISA
     */
    public void setCreditCardBrandVisa(String creditCardBrandVisa) {
        this.creditCardBrandVisa = creditCardBrandVisa;
    }

    /**
     * ���p�\�N���W�b�g�J�[�h�L����ݒ肵�܂��B
     * 
     * @param creditCardFlg
     *            ���p�\�N���W�b�g�J�[�h�L��
     */
    public void setCreditCardFlg(String creditCardFlg) {
        this.creditCardFlg = creditCardFlg;
    }

    /**
     * ���p�\�N���W�b�g�J�[�h���̑����e��ݒ肵�܂��B
     * 
     * @param creditCardOthers
     *            ���p�\�N���W�b�g�J�[�h���̑����e
     */
    public void setCreditCardOthers(String creditCardOthers) {
        this.creditCardOthers = creditCardOthers;
    }

    /**
     * �������ߋq�w_�J�b�v����ݒ肵�܂��B
     * 
     * @param customerCouple
     *            �������ߋq�w_�J�b�v��
     */
    public void setCustomerCouple(String customerCouple) {
        this.customerCouple = customerCouple;
    }

    /**
     * �������ߋq�w_�t�@�~���[��ݒ肵�܂��B
     * 
     * @param customerFamily
     *            �������ߋq�w_�t�@�~���[
     */
    public void setCustomerFamily(String customerFamily) {
        this.customerFamily = customerFamily;
    }

    /**
     * �q�w�ʂ������ߗL����ݒ肵�܂��B
     * 
     * @param customerFlg
     *            �q�w�ʂ������ߗL��
     */
    public void setCustomerFlg(String customerFlg) {
        this.customerFlg = customerFlg;
    }

    /**
     * �������ߋq�w_�n�N��ݒ肵�܂��B
     * 
     * @param customerMiddle
     *            �������ߋq�w_�n�N
     */
    public void setCustomerMiddle(String customerMiddle) {
        this.customerMiddle = customerMiddle;
    }

    /**
     * �������ߋq�w_���̑���ݒ肵�܂��B
     * 
     * @param customerOther
     *            �������ߋq�w_���̑�
     */
    public void setCustomerOther(String customerOther) {
        this.customerOther = customerOther;
    }

    /**
     * �G���x�[�^�[�L����ݒ肵�܂��B
     * 
     * @param elevatorFlg
     *            �G���x�[�^�[�L��
     */
    public void setElevatorFlg(String elevatorFlg) {
        this.elevatorFlg = elevatorFlg;
    }

    /**
     * �p��S���敪��ݒ肵�܂��B
     * 
     * @param engAllDiv
     *            �p��S���敪
     */
    public void setEngAllDiv(String engAllDiv) {
        this.engAllDiv = engAllDiv;
    }

    /**
     * �p��̏o����t�����g�W�L����ݒ肵�܂��B
     * 
     * @param engFrontFlg
     *            �p��̏o����t�����g�W�L��
     */
    public void setEngFrontFlg(String engFrontFlg) {
        this.engFrontFlg = engFrontFlg;
    }

    /**
     * �p��J�n���Ԃ�ݒ肵�܂��B
     * 
     * @param engTimeBegin
     *            �p��J�n����
     */
    public void setEngTimeBegin(String engTimeBegin) {
        setEngTimeBeginHour(DKikakuWebUtil.getHourFormTime(engTimeBegin));
        setEngTimeBeginMinute(DKikakuWebUtil.getMinuteFromTime(engTimeBegin));
    }

    /**
     * �p��J�n���ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param engTimeBeginHour
     *            �p��J�n���ԁi���ԁj
     */
    public void setEngTimeBeginHour(String engTimeBeginHour) {
        this.engTimeBeginHour = engTimeBeginHour;
    }

    /**
     * �p��J�n���ԁi���j��ݒ肵�܂��B
     * 
     * @param engTimeBeginMinute
     *            �p��J�n���ԁi���j
     */
    public void setEngTimeBeginMinute(String engTimeBeginMinute) {
        this.engTimeBeginMinute = engTimeBeginMinute;
    }

    /**
     * �p�ꎞ�ԋ敪��ݒ肵�܂��B
     * 
     * @param engTimeDiv
     *            �p�ꎞ�ԋ敪
     */
    public void setEngTimeDiv(String engTimeDiv) {
        this.engTimeDiv = engTimeDiv;
    }

    /**
     * �p��I�����Ԃ�ݒ肵�܂��B
     * 
     * @param engTimeEnd
     *            �p��I������
     */
    public void setEngTimeEnd(String engTimeEnd) {
        setEngTimeEndHour(DKikakuWebUtil.getHourFormTime(engTimeEnd));
        setEngTimeEndMinute(DKikakuWebUtil.getMinuteFromTime(engTimeEnd));
    }

    /**
     * �p��I�����ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param engTimeEndHour
     *            �p��I�����ԁi���ԁj
     */
    public void setEngTimeEndHour(String engTimeEndHour) {
        this.engTimeEndHour = engTimeEndHour;
    }

    /**
     * �p��I�����ԁi���j��ݒ肵�܂��B
     * 
     * @param engTimeEndMinute
     *            �p��I�����ԁi���j
     */
    public void setEngTimeEndMinute(String engTimeEndMinute) {
        this.engTimeEndMinute = engTimeEndMinute;
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
     * �`�F�b�N�C���O�̉ו��a����L����ݒ肵�܂��B
     * 
     * @param keepBaggageFlg
     *            �`�F�b�N�C���O�̉ו��a����L��
     */
    public void setKeepBaggageFlg(String keepBaggageFlg) {
        this.keepBaggageFlg = keepBaggageFlg;
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
     * �{�ٔN����ݒ肵�܂��B
     * 
     * @param mainBuildingYears
     *            �{�ٔN��
     */
    public void setMainBuildingYears(String mainBuildingYears) {
        this.mainBuildingYears = mainBuildingYears;
    }

    /**
     * �����}�b�T�[�W�@�L����ݒ肵�܂��B
     * 
     * @param massagerFlg
     *            �����}�b�T�[�W�@�L��
     */
    public void setMassagerFlg(String massagerFlg) {
        this.massagerFlg = massagerFlg;
    }

    /**
     * �����}�b�T�[�W�@�ݒu�ꏊ��ݒ肵�܂��B
     * 
     * @param massagerLocation
     *            �����}�b�T�[�W�@�ݒu�ꏊ
     */
    public void setMassagerLocation(String massagerLocation) {
        this.massagerLocation = massagerLocation;
    }

    /**
     * �����}�b�T�[�W�@�䐔��ݒ肵�܂��B
     * 
     * @param massagerNum
     *            �����}�b�T�[�W�@�䐔
     */
    public void setMassagerNum(String massagerNum) {
        this.massagerNum = massagerNum;
    }

    /**
     * �����}�b�T�[�W�@�L���L����ݒ肵�܂��B
     * 
     * @param massagerPayFlg
     *            �����}�b�T�[�W�@�L���L��
     */
    public void setMassagerPayFlg(String massagerPayFlg) {
        this.massagerPayFlg = massagerPayFlg;
    }

    /**
     * �����}�b�T�[�W�@���p���z��ݒ肵�܂��B
     * 
     * @param massagerUseAmt
     *            �����}�b�T�[�W�@���p���z
     */
    public void setMassagerUseAmt(String massagerUseAmt) {
        this.massagerUseAmt = massagerUseAmt;
    }

    /**
     * �����}�b�T�[�W�@���p���Ԃ�ݒ肵�܂��B
     * 
     * @param massagerUseTime
     *            �����}�b�T�[�W�@���p����
     */
    public void setMassagerUseTime(String massagerUseTime) {
        this.massagerUseTime = massagerUseTime;
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
     * �V�ٔN����ݒ肵�܂��B
     * 
     * @param newBuildingYears
     *            �V�ٔN��
     */
    public void setNewBuildingYears(String newBuildingYears) {
        this.newBuildingYears = newBuildingYears;
    }

    /**
     * ���̑��R�����g��ݒ肵�܂��B
     * 
     * @param othersCmt
     *            ���̑��R�����g
     */
    public void setOthersCmt(String othersCmt) {
        this.othersCmt = othersCmt;
    }

    /**
     * �����܂Ŗӓ����L����ݒ肵�܂��B
     * 
     * @param roomGuideDogFlg
     *            �����܂Ŗӓ����L��
     */
    public void setRoomGuideDogFlg(String roomGuideDogFlg) {
        this.roomGuideDogFlg = roomGuideDogFlg;
    }

    /**
     * �����܂Ńy�b�g������ݒ肵�܂��B
     * 
     * @param roomPetCond
     *            �����܂Ńy�b�g����
     */
    public void setRoomPetCond(String roomPetCond) {
        this.roomPetCond = roomPetCond;
    }

    /**
     * �����܂Ńy�b�g�L����ݒ肵�܂��B
     * 
     * @param roomPetFlg
     *            �����܂Ńy�b�g�L��
     */
    public void setRoomPetFlg(String roomPetFlg) {
        this.roomPetFlg = roomPetFlg;
    }

    /**
     * �Z�[���X�|�C���g��ݒ肵�܂��B
     * 
     * @param salesPoint
     *            �Z�[���X�|�C���g
     */
    public void setSalesPoint(String salesPoint) {
        this.salesPoint = salesPoint;
    }

    /**
     * ��b�S���敪��ݒ肵�܂��B
     * 
     * @param signLangAllDiv
     *            ��b�S���敪
     */
    public void setSignLangAllDiv(String signLangAllDiv) {
        this.signLangAllDiv = signLangAllDiv;
    }

    /**
     * ��b�J�n���Ԃ�ݒ肵�܂��B
     * 
     * @param signLangBegin
     *            ��b�J�n����
     */
    public void setSignLangBegin(String signLangBegin) {
        setSignLangBeginHour(DKikakuWebUtil.getHourFormTime(signLangBegin));
        setSignLangBeginMinute(DKikakuWebUtil.getMinuteFromTime(signLangBegin));
    }

    /**
     * ��b�J�n���ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param signLangBeginHour
     *            ��b�J�n���ԁi���ԁj
     */
    public void setSignLangBeginHour(String signLangBeginHour) {
        this.signLangBeginHour = signLangBeginHour;
    }

    /**
     * ��b�J�n���ԁi���j��ݒ肵�܂��B
     * 
     * @param signLangBeginMinute
     *            ��b�J�n���ԁi���j
     */
    public void setSignLangBeginMinute(String signLangBeginMinute) {
        this.signLangBeginMinute = signLangBeginMinute;
    }

    /**
     * ��b�I�����Ԃ�ݒ肵�܂��B
     * 
     * @param signLangEnd
     *            ��b�I������
     */
    public void setSignLangEnd(String signLangEnd) {
        setSignLangEndHour(DKikakuWebUtil.getHourFormTime(signLangEnd));
        setSignLangEndMinute(DKikakuWebUtil.getMinuteFromTime(signLangEnd));
    }

    /**
     * ��b�I�����ԁi���ԁj��ݒ肵�܂��B
     * 
     * @param signLangEndHour
     *            ��b�I�����ԁi���ԁj
     */
    public void setSignLangEndHour(String signLangEndHour) {
        this.signLangEndHour = signLangEndHour;
    }

    /**
     * ��b�I�����ԁi���j��ݒ肵�܂��B
     * 
     * @param signLangEndMinute
     *            ��b�I�����ԁi���j
     */
    public void setSignLangEndMinute(String signLangEndMinute) {
        this.signLangEndMinute = signLangEndMinute;
    }

    /**
     * ��b�̏o����t�����g�W�L����ݒ肵�܂��B
     * 
     * @param signLangFrontFlg
     *            ��b�̏o����t�����g�W�L��
     */
    public void setSignLangFrontFlg(String signLangFrontFlg) {
        this.signLangFrontFlg = signLangFrontFlg;
    }

    /**
     * ��b���ԋ敪��ݒ肵�܂��B
     * 
     * @param signLangTimeDiv
     *            ��b���ԋ敪
     */
    public void setSignLangTimeDiv(String signLangTimeDiv) {
        this.signLangTimeDiv = signLangTimeDiv;
    }

    /**
     * �������߃R�����g��ݒ肵�܂��B
     * 
     * @param suggestionCmt
     *            �������߃R�����g
     */
    public void setSuggestionCmt(String suggestionCmt) {
        this.suggestionCmt = suggestionCmt;
    }

    /**
     * ���q�����L����ݒ肵�܂��B
     * 
     * @param totalRoomFlg
     *            ���q�����L��
     */
    public void setTotalRoomFlg(String totalRoomFlg) {
        this.totalRoomFlg = totalRoomFlg;
    }

    /**
     * ���q������ݒ肵�܂��B
     * 
     * @param totalRoomNum
     *            ���q����
     */
    public void setTotalRoomNum(String totalRoomNum) {
        this.totalRoomNum = totalRoomNum;
    }

    /**
     * �Ԉ֎q����L����ݒ肵�܂��B
     * 
     * @param wheelchairFlg
     *            �Ԉ֎q����L��
     */
    public void setWheelchairFlg(String wheelchairFlg) {
        this.wheelchairFlg = wheelchairFlg;
    }

    /**
     * �Ԉ֎q����䐔��ݒ肵�܂��B
     * 
     * @param wheelchairNum
     *            �Ԉ֎q����䐔
     */
    public void setWheelchairNum(String wheelchairNum) {
        this.wheelchairNum = wheelchairNum;
    }

}
