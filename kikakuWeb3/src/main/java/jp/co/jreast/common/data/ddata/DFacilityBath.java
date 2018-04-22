package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]�{��_���C �G���e�B�e�B
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
public class DFacilityBath implements FacilityManageBodyKey {

    /** ���C�敪 */
    private Integer bathDiv;

    /** ���C�L�� */
    private String bathFlg;

    /** ���C��� */
    private Integer bathKind;

    /** ���F */
    private String colour;

    /** ���F�R�����g */
    private String colourCmt;

    /** ������ŗL��L�� */
    private String disinfectFlg;

    /** ���\ */
    private String effect;

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �{�݃p�^�[�� */
    private String facilityPattern;

    /** ������p�L�� */
    private String femaleOnlyFlg;

    /** �����ӏ����� */
    private String femaleSiteNm;

    /** �����ӏ����� */
    private String femaleSiteNum;

    /** �������ԋ敪 */
    private String femaleTimeDiv;

    /** �����J�n���ԂP�i���ԁj */
    private String femaleTimeFrom1Hour;

    /** �����J�n���ԂP�i���j */
    private String femaleTimeFrom1Minute;

    /** �����J�n���ԂQ�i���ԁj */
    private String femaleTimeFrom2Hour;

    /** �����J�n���ԂQ�i���j */
    private String femaleTimeFrom2Minute;

    /** �����J�n���ԂR�i���ԁj */
    private String femaleTimeFrom3Hour;

    /** �����J�n���ԂR�i���j */
    private String femaleTimeFrom3Minute;

    /** �����I�����ԂP�i���ԁj */
    private String femaleTimeTo1Hour;

    /** �����I�����ԂP�i���j */
    private String femaleTimeTo1Minute;

    /** �����I�����ԂQ�i���ԁj */
    private String femaleTimeTo2Hour;

    /** �����I�����ԂQ�i���j */
    private String femaleTimeTo2Minute;

    /** �����I�����ԂR�i���ԁj */
    private String femaleTimeTo3Hour;

    /** �����I�����ԂR�i���j */
    private String femaleTimeTo3Minute;

    /** �񓚏���� */
    private String kindFlg;

    /** �j���ӏ����� */
    private String maleSiteNm;

    /** �j���ӏ����� */
    private String maleSiteNum;

    /** �j�����ԋ敪 */
    private String maleTimeDiv;

    /** �j���J�n���ԂP�i���ԁj */
    private String maleTimeFrom1Hour;

    /** �j���J�n���ԂP�i���j */
    private String maleTimeFrom1Minute;

    /** �j���J�n���ԂQ�i���ԁj */
    private String maleTimeFrom2Hour;

    /** �j���J�n���ԂQ�i���j */
    private String maleTimeFrom2Minute;

    /** �j���J�n���ԂR�i���ԁj */
    private String maleTimeFrom3Hour;

    /** �j���J�n���ԂR�i���j */
    private String maleTimeFrom3Minute;

    /** �j���I�����ԂP�i���ԁj */
    private String maleTimeTo1Hour;

    /** �j���I�����ԂP�i���j */
    private String maleTimeTo1Minute;

    /** �j���I�����ԂQ�i���ԁj */
    private String maleTimeTo2Hour;

    /** �j���I�����ԂQ�i���j */
    private String maleTimeTo2Minute;

    /** �j���I�����ԂR�i���ԁj */
    private String maleTimeTo3Hour;

    /** �j���I�����ԂR�i���j */
    private String maleTimeTo3Minute;

    /** ���l */
    private String memo;

    /** �V�R����E���̑� */
    private String naturalSpa;

    /** ���̑�����R�����g */
    private String otherSpringCmt;

    /** �N�o��� */
    private String pourStatus;

    /** �N�o��ԃR�����g */
    private String pourStatusCmt;

    /** ����z���L�� */
    private String recircleKindFlg;

    /** ���ؗ��� */
    private String rentalFees;

    /** ���ؗL���L�� */
    private String rentalPayFlg;

    /** ���ؗ\��敪 */
    private String rentalReserveDiv;

    /** ���؎��O�\��I���t���O */
    private String rentalReserveFlg;

    /** ���؉ӏ����� */
    private String rentalSiteNum;

    /** ���؎��� */
    private String rentalTime;

    /** ���ƌ���L�� */
    private String selfSpringFlg;

    /** ��������L�� */
    private String shareSpringFlg;

    /** �������� */
    private String shareSpringNm;

    /** ����֐��L�� */
    private String shiftFlg;

    /** ���򂩂������L�� */
    private String spaFlowFlg;

    /** �� */
    private String spaQuality;

    /** ���򉷓x */
    private String spaTemp;

    /** ��������L��L�� */
    private String warmingFlg;

    /** �����ւ̓��ʃR���g���[���L�� */
    private String waterControlFlg;

    /**
     * �R���X�g���N�^
     */
    public DFacilityBath() {
        super();
    }

    /**
     * �R���X�g���N�^
     * 
     * @param bathDiv
     *            ���C�敪
     * @param bathKind
     *            ���C���
     */
    public DFacilityBath(Integer bathDiv, Integer bathKind) {
        super();
        this.bathDiv = bathDiv;
        this.bathKind = bathKind;
    }

    /**
     * ���C�敪���擾���܂��B
     * 
     * @return ���C�敪
     */
    public Integer getBathDiv() {
        return bathDiv;
    }

    /**
     * ���C�L�����擾���܂��B
     * 
     * @return ���C�L��
     */
    public String getBathFlg() {
        return bathFlg;
    }

    /**
     * ���C��ʂ��擾���܂��B
     * 
     * @return ���C���
     */
    public Integer getBathKind() {
        return bathKind;
    }

    /**
     * ���F���擾���܂��B
     * 
     * @return ���F
     */
    public String getColour() {
        return colour;
    }

    /**
     * ���F�R�����g���擾���܂��B
     * 
     * @return ���F�R�����g
     */
    public String getColourCmt() {
        return colourCmt;
    }

    /**
     * ������ŗL��L�����擾���܂��B
     * 
     * @return ������ŗL��L��
     */
    public String getDisinfectFlg() {
        return disinfectFlg;
    }

    /**
     * ���\���擾���܂��B
     * 
     * @return ���\
     */
    public String getEffect() {
        return effect;
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
     * ������p�L�����擾���܂��B
     * 
     * @return ������p�L��
     */
    public String getFemaleOnlyFlg() {
        return femaleOnlyFlg;
    }

    /**
     * �����ӏ����̂��擾���܂��B
     * 
     * @return �����ӏ�����
     */
    public String getFemaleSiteNm() {
        return femaleSiteNm;
    }

    /**
     * �����ӏ����ʂ��擾���܂��B
     * 
     * @return �����ӏ�����
     */
    public String getFemaleSiteNum() {
        return femaleSiteNum;
    }

    /**
     * �������ԋ敪���擾���܂��B
     * 
     * @return �������ԋ敪
     */
    public String getFemaleTimeDiv() {
        return femaleTimeDiv;
    }

    /**
     * �����J�n���ԂP���擾���܂��B
     * 
     * @return �����J�n���ԂP
     */
    public String getFemaleTimeFrom1() {
        return DKikakuWebUtil.buildTime(getFemaleTimeFrom1Hour(),
                getFemaleTimeFrom1Minute());
    }

    /**
     * �����J�n���ԂP�i���ԁj���擾���܂��B
     * 
     * @return �����J�n���ԂP�i���ԁj
     */
    public String getFemaleTimeFrom1Hour() {
        return femaleTimeFrom1Hour;
    }

    /**
     * �����J�n���ԂP�i���j���擾���܂��B
     * 
     * @return �����J�n���ԂP�i���j
     */
    public String getFemaleTimeFrom1Minute() {
        return femaleTimeFrom1Minute;
    }

    /**
     * �����J�n���ԂQ���擾���܂��B
     * 
     * @return �����J�n���ԂQ
     */
    public String getFemaleTimeFrom2() {
        return DKikakuWebUtil.buildTime(getFemaleTimeFrom2Hour(),
                getFemaleTimeFrom2Minute());
    }

    /**
     * �����J�n���ԂQ�i���ԁj���擾���܂��B
     * 
     * @return �����J�n���ԂQ�i���ԁj
     */
    public String getFemaleTimeFrom2Hour() {
        return femaleTimeFrom2Hour;
    }

    /**
     * �����J�n���ԂQ�i���j���擾���܂��B
     * 
     * @return �����J�n���ԂQ�i���j
     */
    public String getFemaleTimeFrom2Minute() {
        return femaleTimeFrom2Minute;
    }

    /**
     * �����J�n���ԂR���擾���܂��B
     * 
     * @return �����J�n���ԂR
     */
    public String getFemaleTimeFrom3() {
        return DKikakuWebUtil.buildTime(getFemaleTimeFrom3Hour(),
                getFemaleTimeFrom3Minute());
    }

    /**
     * �����J�n���ԂR�i���ԁj���擾���܂��B
     * 
     * @return �����J�n���ԂR�i���ԁj
     */
    public String getFemaleTimeFrom3Hour() {
        return femaleTimeFrom3Hour;
    }

    /**
     * �����J�n���ԂR�i���j���擾���܂��B
     * 
     * @return �����J�n���ԂR�i���j
     */
    public String getFemaleTimeFrom3Minute() {
        return femaleTimeFrom3Minute;
    }

    /**
     * �����I�����ԂP���擾���܂��B
     * 
     * @return �����I�����ԂP
     */
    public String getFemaleTimeTo1() {
        return DKikakuWebUtil.buildTime(getFemaleTimeTo1Hour(),
                getFemaleTimeTo1Minute());
    }

    /**
     * �����I�����ԂP�i���ԁj���擾���܂��B
     * 
     * @return �����I�����ԂP�i���ԁj
     */
    public String getFemaleTimeTo1Hour() {
        return femaleTimeTo1Hour;
    }

    /**
     * �����I�����ԂP�i���j���擾���܂��B
     * 
     * @return �����I�����ԂP�i���j
     */
    public String getFemaleTimeTo1Minute() {
        return femaleTimeTo1Minute;
    }

    /**
     * �����I�����ԂQ���擾���܂��B
     * 
     * @return �����I�����ԂQ
     */
    public String getFemaleTimeTo2() {
        return DKikakuWebUtil.buildTime(getFemaleTimeTo2Hour(),
                getFemaleTimeTo2Minute());
    }

    /**
     * �����I�����ԂQ�i���ԁj���擾���܂��B
     * 
     * @return �����I�����ԂQ�i���ԁj
     */
    public String getFemaleTimeTo2Hour() {
        return femaleTimeTo2Hour;
    }

    /**
     * �����I�����ԂQ�i���j���擾���܂��B
     * 
     * @return �����I�����ԂQ�i���j
     */
    public String getFemaleTimeTo2Minute() {
        return femaleTimeTo2Minute;
    }

    /**
     * �����I�����ԂR���擾���܂��B
     * 
     * @return �����I�����ԂR
     */
    public String getFemaleTimeTo3() {
        return DKikakuWebUtil.buildTime(getFemaleTimeTo3Hour(),
                getFemaleTimeTo3Minute());
    }

    /**
     * �����I�����ԂR�i���ԁj���擾���܂��B
     * 
     * @return �����I�����ԂR�i���ԁj
     */
    public String getFemaleTimeTo3Hour() {
        return femaleTimeTo3Hour;
    }

    /**
     * �����I�����ԂR�i���j���擾���܂��B
     * 
     * @return �����I�����ԂR�i���j
     */
    public String getFemaleTimeTo3Minute() {
        return femaleTimeTo3Minute;
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
     * �j���ӏ����̂��擾���܂��B
     * 
     * @return �j���ӏ�����
     */
    public String getMaleSiteNm() {
        return maleSiteNm;
    }

    /**
     * �j���ӏ����ʂ��擾���܂��B
     * 
     * @return �j���ӏ�����
     */
    public String getMaleSiteNum() {
        return maleSiteNum;
    }

    /**
     * �j�����ԋ敪���擾���܂��B
     * 
     * @return �j�����ԋ敪
     */
    public String getMaleTimeDiv() {
        return maleTimeDiv;
    }

    /**
     * �j���J�n���ԂP���擾���܂��B
     * 
     * @return �j���J�n���ԂP
     */
    public String getMaleTimeFrom1() {
        return DKikakuWebUtil.buildTime(getMaleTimeFrom1Hour(),
                getMaleTimeFrom1Minute());
    }

    /**
     * �j���J�n���ԂP�i���ԁj���擾���܂��B
     * 
     * @return �j���J�n���ԂP�i���ԁj
     */
    public String getMaleTimeFrom1Hour() {
        return maleTimeFrom1Hour;
    }

    /**
     * �j���J�n���ԂP�i���j���擾���܂��B
     * 
     * @return �j���J�n���ԂP�i���j
     */
    public String getMaleTimeFrom1Minute() {
        return maleTimeFrom1Minute;
    }

    /**
     * �j���J�n���ԂQ���擾���܂��B
     * 
     * @return �j���J�n���ԂQ
     */
    public String getMaleTimeFrom2() {
        return DKikakuWebUtil.buildTime(getMaleTimeFrom2Hour(),
                getMaleTimeFrom2Minute());
    }

    /**
     * �j���J�n���ԂQ�i���ԁj���擾���܂��B
     * 
     * @return �j���J�n���ԂQ�i���ԁj
     */
    public String getMaleTimeFrom2Hour() {
        return maleTimeFrom2Hour;
    }

    /**
     * �j���J�n���ԂQ�i���j���擾���܂��B
     * 
     * @return �j���J�n���ԂQ�i���j
     */
    public String getMaleTimeFrom2Minute() {
        return maleTimeFrom2Minute;
    }

    /**
     * �j���J�n���ԂR���擾���܂��B
     * 
     * @return �j���J�n���ԂR
     */
    public String getMaleTimeFrom3() {
        return DKikakuWebUtil.buildTime(getMaleTimeFrom3Hour(),
                getMaleTimeFrom3Minute());
    }

    /**
     * �j���J�n���ԂR�i���ԁj���擾���܂��B
     * 
     * @return �j���J�n���ԂR�i���ԁj
     */
    public String getMaleTimeFrom3Hour() {
        return maleTimeFrom3Hour;
    }

    /**
     * �j���J�n���ԂR�i���j���擾���܂��B
     * 
     * @return �j���J�n���ԂR�i���j
     */
    public String getMaleTimeFrom3Minute() {
        return maleTimeFrom3Minute;
    }

    /**
     * �j���I�����ԂP���擾���܂��B
     * 
     * @return �j���I�����ԂP
     */
    public String getMaleTimeTo1() {
        return DKikakuWebUtil.buildTime(getMaleTimeTo1Hour(),
                getMaleTimeTo1Minute());
    }

    /**
     * �j���I�����ԂP�i���ԁj���擾���܂��B
     * 
     * @return �j���I�����ԂP�i���ԁj
     */
    public String getMaleTimeTo1Hour() {
        return maleTimeTo1Hour;
    }

    /**
     * �j���I�����ԂP�i���j���擾���܂��B
     * 
     * @return �j���I�����ԂP�i���j
     */
    public String getMaleTimeTo1Minute() {
        return maleTimeTo1Minute;
    }

    /**
     * �j���I�����ԂQ���擾���܂��B
     * 
     * @return �j���I�����ԂQ
     */
    public String getMaleTimeTo2() {
        return DKikakuWebUtil.buildTime(getMaleTimeTo2Hour(),
                getMaleTimeTo2Minute());
    }

    /**
     * �j���I�����ԂQ�i���ԁj���擾���܂��B
     * 
     * @return �j���I�����ԂQ�i���ԁj
     */
    public String getMaleTimeTo2Hour() {
        return maleTimeTo2Hour;
    }

    /**
     * �j���I�����ԂQ�i���j���擾���܂��B
     * 
     * @return �j���I�����ԂQ�i���j
     */
    public String getMaleTimeTo2Minute() {
        return maleTimeTo2Minute;
    }

    /**
     * �j���I�����ԂR���擾���܂��B
     * 
     * @return �j���I�����ԂR
     */
    public String getMaleTimeTo3() {
        return DKikakuWebUtil.buildTime(getMaleTimeTo3Hour(),
                getMaleTimeTo3Minute());
    }

    /**
     * �j���I�����ԂR�i���ԁj���擾���܂��B
     * 
     * @return �j���I�����ԂR�i���ԁj
     */
    public String getMaleTimeTo3Hour() {
        return maleTimeTo3Hour;
    }

    /**
     * �j���I�����ԂR�i���j���擾���܂��B
     * 
     * @return �j���I�����ԂR�i���j
     */
    public String getMaleTimeTo3Minute() {
        return maleTimeTo3Minute;
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
     * �V�R����E���̑����擾���܂��B
     * 
     * @return �V�R����E���̑�
     */
    public String getNaturalSpa() {
        return naturalSpa;
    }

    /**
     * ���̑�����R�����g���擾���܂��B
     * 
     * @return ���̑�����R�����g
     */
    public String getOtherSpringCmt() {
        return otherSpringCmt;
    }

    /**
     * �N�o��Ԃ��擾���܂��B
     * 
     * @return �N�o���
     */
    public String getPourStatus() {
        return pourStatus;
    }

    /**
     * �N�o��ԃR�����g���擾���܂��B
     * 
     * @return �N�o��ԃR�����g
     */
    public String getPourStatusCmt() {
        return pourStatusCmt;
    }

    /**
     * ����z���L�����擾���܂��B
     * 
     * @return ����z���L��
     */
    public String getRecircleKindFlg() {
        return recircleKindFlg;
    }

    /**
     * ���ؗ������擾���܂��B
     * 
     * @return ���ؗ���
     */
    public String getRentalFees() {
        return rentalFees;
    }

    /**
     * ���ؗL���L�����擾���܂��B
     * 
     * @return ���ؗL���L��
     */
    public String getRentalPayFlg() {
        return rentalPayFlg;
    }

    /**
     * ���ؗ\��敪���擾���܂��B
     * 
     * @return ���ؗ\��敪
     */
    public String getRentalReserveDiv() {
        return rentalReserveDiv;
    }

    /**
     * ���؎��O�\��I���t���O���擾���܂��B
     * 
     * @return ���؎��O�\��I���t���O
     */
    public String getRentalReserveFlg() {
        return rentalReserveFlg;
    }

    /**
     * ���؉ӏ����ʂ��擾���܂��B
     * 
     * @return ���؉ӏ�����
     */
    public String getRentalSiteNum() {
        return rentalSiteNum;
    }

    /**
     * ���؎��Ԃ��擾���܂��B
     * 
     * @return ���؎���
     */
    public String getRentalTime() {
        return rentalTime;
    }

    /**
     * ���ƌ���L�����擾���܂��B
     * 
     * @return ���ƌ���L��
     */
    public String getSelfSpringFlg() {
        return selfSpringFlg;
    }

    /**
     * ��������L�����擾���܂��B
     * 
     * @return ��������L��
     */
    public String getShareSpringFlg() {
        return shareSpringFlg;
    }

    /**
     * �������򖼂��擾���܂��B
     * 
     * @return ��������
     */
    public String getShareSpringNm() {
        return shareSpringNm;
    }

    /**
     * ����֐��L�����擾���܂��B
     * 
     * @return ����֐��L��
     */
    public String getShiftFlg() {
        return shiftFlg;
    }

    /**
     * ���򂩂������L�����擾���܂��B
     * 
     * @return ���򂩂������L��
     */
    public String getSpaFlowFlg() {
        return spaFlowFlg;
    }

    /**
     * �򎿂��擾���܂��B
     * 
     * @return ��
     */
    public String getSpaQuality() {
        return spaQuality;
    }

    /**
     * ���򉷓x���擾���܂��B
     * 
     * @return ���򉷓x
     */
    public String getSpaTemp() {
        return spaTemp;
    }

    /**
     * ��������L��L�����擾���܂��B
     * 
     * @return ��������L��L��
     */
    public String getWarmingFlg() {
        return warmingFlg;
    }

    /**
     * �����ւ̓��ʃR���g���[���L�����擾���܂��B
     * 
     * @return �����ւ̓��ʃR���g���[���L��
     */
    public String getWaterControlFlg() {
        return waterControlFlg;
    }

    /**
     * ���C�敪��ݒ肵�܂��B
     * 
     * @param bathDiv
     *            ���C�敪
     */
    public void setBathDiv(Integer bathDiv) {
        this.bathDiv = bathDiv;
    }

    /**
     * ���C�L����ݒ肵�܂��B
     * 
     * @param bathFlg
     *            ���C�L��
     */
    public void setBathFlg(String bathFlg) {
        this.bathFlg = bathFlg;
    }

    /**
     * ���C��ʂ�ݒ肵�܂��B
     * 
     * @param bathKind
     *            ���C���
     */
    public void setBathKind(Integer bathKind) {
        this.bathKind = bathKind;
    }

    /**
     * ���F��ݒ肵�܂��B
     * 
     * @param colour
     *            ���F
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * ���F�R�����g��ݒ肵�܂��B
     * 
     * @param colourCmt
     *            ���F�R�����g
     */
    public void setColourCmt(String colourCmt) {
        this.colourCmt = colourCmt;
    }

    /**
     * ������ŗL��L����ݒ肵�܂��B
     * 
     * @param disinfectFlg
     *            ������ŗL��L��
     */
    public void setDisinfectFlg(String disinfectFlg) {
        this.disinfectFlg = disinfectFlg;
    }

    /**
     * ���\��ݒ肵�܂��B
     * 
     * @param effect
     *            ���\
     */
    public void setEffect(String effect) {
        this.effect = effect;
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
     * ������p�L����ݒ肵�܂��B
     * 
     * @param femaleOnlyFlg
     *            ������p�L��
     */
    public void setFemaleOnlyFlg(String femaleOnlyFlg) {
        this.femaleOnlyFlg = femaleOnlyFlg;
    }

    /**
     * �����ӏ����̂�ݒ肵�܂��B
     * 
     * @param femaleSiteNm
     *            �����ӏ�����
     */
    public void setFemaleSiteNm(String femaleSiteNm) {
        this.femaleSiteNm = femaleSiteNm;
    }

    /**
     * �����ӏ����ʂ�ݒ肵�܂��B
     * 
     * @param femaleSiteNum
     *            �����ӏ�����
     */
    public void setFemaleSiteNum(String femaleSiteNum) {
        this.femaleSiteNum = femaleSiteNum;
    }

    /**
     * �������ԋ敪��ݒ肵�܂��B
     * 
     * @param femaleTimeDiv
     *            �������ԋ敪
     */
    public void setFemaleTimeDiv(String femaleTimeDiv) {
        this.femaleTimeDiv = femaleTimeDiv;
    }

    /**
     * �����J�n���ԂP��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom1
     *            �����J�n���ԂP
     */
    public void setFemaleTimeFrom1(String femaleTimeFrom1) {
        setFemaleTimeFrom1Hour(DKikakuWebUtil.getHourFormTime(femaleTimeFrom1));
        setFemaleTimeFrom1Minute(DKikakuWebUtil
                .getMinuteFromTime(femaleTimeFrom1));
    }

    /**
     * �����J�n���ԂP�i���ԁj��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom1Hour
     *            �����J�n���ԂP�i���ԁj
     */
    public void setFemaleTimeFrom1Hour(String femaleTimeFrom1Hour) {
        this.femaleTimeFrom1Hour = femaleTimeFrom1Hour;
    }

    /**
     * �����J�n���ԂP�i���j��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom1Minute
     *            �����J�n���ԂP�i���j
     */
    public void setFemaleTimeFrom1Minute(String femaleTimeFrom1Minute) {
        this.femaleTimeFrom1Minute = femaleTimeFrom1Minute;
    }

    /**
     * �����J�n���ԂQ��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom2
     *            �����J�n���ԂQ
     */
    public void setFemaleTimeFrom2(String femaleTimeFrom2) {
        setFemaleTimeFrom2Hour(DKikakuWebUtil.getHourFormTime(femaleTimeFrom2));
        setFemaleTimeFrom2Minute(DKikakuWebUtil
                .getMinuteFromTime(femaleTimeFrom2));
    }

    /**
     * �����J�n���ԂQ�i���ԁj��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom2Hour
     *            �����J�n���ԂQ�i���ԁj
     */
    public void setFemaleTimeFrom2Hour(String femaleTimeFrom2Hour) {
        this.femaleTimeFrom2Hour = femaleTimeFrom2Hour;
    }

    /**
     * �����J�n���ԂQ�i���j��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom2Minute
     *            �����J�n���ԂQ�i���j
     */
    public void setFemaleTimeFrom2Minute(String femaleTimeFrom2Minute) {
        this.femaleTimeFrom2Minute = femaleTimeFrom2Minute;
    }

    /**
     * �����J�n���ԂR��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom3
     *            �����J�n���ԂR
     */
    public void setFemaleTimeFrom3(String femaleTimeFrom3) {
        setFemaleTimeFrom3Hour(DKikakuWebUtil.getHourFormTime(femaleTimeFrom3));
        setFemaleTimeFrom3Minute(DKikakuWebUtil
                .getMinuteFromTime(femaleTimeFrom3));
    }

    /**
     * �����J�n���ԂR�i���ԁj��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom3Hour
     *            �����J�n���ԂR�i���ԁj
     */
    public void setFemaleTimeFrom3Hour(String femaleTimeFrom3Hour) {
        this.femaleTimeFrom3Hour = femaleTimeFrom3Hour;
    }

    /**
     * �����J�n���ԂR�i���j��ݒ肵�܂��B
     * 
     * @param femaleTimeFrom3Minute
     *            �����J�n���ԂR�i���j
     */
    public void setFemaleTimeFrom3Minute(String femaleTimeFrom3Minute) {
        this.femaleTimeFrom3Minute = femaleTimeFrom3Minute;
    }

    /**
     * �����I�����ԂP��ݒ肵�܂��B
     * 
     * @param femaleTimeTo1
     *            �����I�����ԂP
     */
    public void setFemaleTimeTo1(String femaleTimeTo1) {
        setFemaleTimeTo1Hour(DKikakuWebUtil.getHourFormTime(femaleTimeTo1));
        setFemaleTimeTo1Minute(DKikakuWebUtil.getMinuteFromTime(femaleTimeTo1));
    }

    /**
     * �����I�����ԂP�i���ԁj��ݒ肵�܂��B
     * 
     * @param femaleTimeTo1Hour
     *            �����I�����ԂP�i���ԁj
     */
    public void setFemaleTimeTo1Hour(String femaleTimeTo1Hour) {
        this.femaleTimeTo1Hour = femaleTimeTo1Hour;
    }

    /**
     * �����I�����ԂP�i���j��ݒ肵�܂��B
     * 
     * @param femaleTimeTo1Minute
     *            �����I�����ԂP�i���j
     */
    public void setFemaleTimeTo1Minute(String femaleTimeTo1Minute) {
        this.femaleTimeTo1Minute = femaleTimeTo1Minute;
    }

    /**
     * �����I�����ԂQ��ݒ肵�܂��B
     * 
     * @param femaleTimeTo2
     *            �����I�����ԂQ
     */
    public void setFemaleTimeTo2(String femaleTimeTo2) {
        setFemaleTimeTo2Hour(DKikakuWebUtil.getHourFormTime(femaleTimeTo2));
        setFemaleTimeTo2Minute(DKikakuWebUtil.getMinuteFromTime(femaleTimeTo2));
    }

    /**
     * �����I�����ԂQ�i���ԁj��ݒ肵�܂��B
     * 
     * @param femaleTimeTo2Hour
     *            �����I�����ԂQ�i���ԁj
     */
    public void setFemaleTimeTo2Hour(String femaleTimeTo2Hour) {
        this.femaleTimeTo2Hour = femaleTimeTo2Hour;
    }

    /**
     * �����I�����ԂQ�i���j��ݒ肵�܂��B
     * 
     * @param femaleTimeTo2Minute
     *            �����I�����ԂQ�i���j
     */
    public void setFemaleTimeTo2Minute(String femaleTimeTo2Minute) {
        this.femaleTimeTo2Minute = femaleTimeTo2Minute;
    }

    /**
     * �����I�����ԂR��ݒ肵�܂��B
     * 
     * @param femaleTimeTo3
     *            �����I�����ԂR
     */
    public void setFemaleTimeTo3(String femaleTimeTo3) {
        setFemaleTimeTo3Hour(DKikakuWebUtil.getHourFormTime(femaleTimeTo3));
        setFemaleTimeTo3Minute(DKikakuWebUtil.getMinuteFromTime(femaleTimeTo3));
    }

    /**
     * �����I�����ԂR�i���ԁj��ݒ肵�܂��B
     * 
     * @param femaleTimeTo3Hour
     *            �����I�����ԂR�i���ԁj
     */
    public void setFemaleTimeTo3Hour(String femaleTimeTo3Hour) {
        this.femaleTimeTo3Hour = femaleTimeTo3Hour;
    }

    /**
     * �����I�����ԂR�i���j��ݒ肵�܂��B
     * 
     * @param femaleTimeTo3Minute
     *            �����I�����ԂR�i���j
     */
    public void setFemaleTimeTo3Minute(String femaleTimeTo3Minute) {
        this.femaleTimeTo3Minute = femaleTimeTo3Minute;
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
     * �j���ӏ����̂�ݒ肵�܂��B
     * 
     * @param maleSiteNm
     *            �j���ӏ�����
     */
    public void setMaleSiteNm(String maleSiteNm) {
        this.maleSiteNm = maleSiteNm;
    }

    /**
     * �j���ӏ����ʂ�ݒ肵�܂��B
     * 
     * @param maleSiteNum
     *            �j���ӏ�����
     */
    public void setMaleSiteNum(String maleSiteNum) {
        this.maleSiteNum = maleSiteNum;
    }

    /**
     * �j�����ԋ敪��ݒ肵�܂��B
     * 
     * @param maleTimeDiv
     *            �j�����ԋ敪
     */
    public void setMaleTimeDiv(String maleTimeDiv) {
        this.maleTimeDiv = maleTimeDiv;
    }

    /**
     * �j���J�n���ԂP��ݒ肵�܂��B
     * 
     * @param maleTimeFrom1
     *            �j���J�n���ԂP
     */
    public void setMaleTimeFrom1(String maleTimeFrom1) {
        setMaleTimeFrom1Hour(DKikakuWebUtil.getHourFormTime(maleTimeFrom1));
        setMaleTimeFrom1Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeFrom1));
    }

    /**
     * �j���J�n���ԂP�i���ԁj��ݒ肵�܂��B
     * 
     * @param maleTimeFrom1Hour
     *            �j���J�n���ԂP�i���ԁj
     */
    public void setMaleTimeFrom1Hour(String maleTimeFrom1Hour) {
        this.maleTimeFrom1Hour = maleTimeFrom1Hour;
    }

    /**
     * �j���J�n���ԂP�i���j��ݒ肵�܂��B
     * 
     * @param maleTimeFrom1Minute
     *            �j���J�n���ԂP�i���j
     */
    public void setMaleTimeFrom1Minute(String maleTimeFrom1Minute) {
        this.maleTimeFrom1Minute = maleTimeFrom1Minute;
    }

    /**
     * �j���J�n���ԂQ��ݒ肵�܂��B
     * 
     * @param maleTimeFrom2
     *            �j���J�n���ԂQ
     */
    public void setMaleTimeFrom2(String maleTimeFrom2) {
        setMaleTimeFrom2Hour(DKikakuWebUtil.getHourFormTime(maleTimeFrom2));
        setMaleTimeFrom2Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeFrom2));
    }

    /**
     * �j���J�n���ԂQ�i���ԁj��ݒ肵�܂��B
     * 
     * @param maleTimeFrom2Hour
     *            �j���J�n���ԂQ�i���ԁj
     */
    public void setMaleTimeFrom2Hour(String maleTimeFrom2Hour) {
        this.maleTimeFrom2Hour = maleTimeFrom2Hour;
    }

    /**
     * �j���J�n���ԂQ�i���j��ݒ肵�܂��B
     * 
     * @param maleTimeFrom2Minute
     *            �j���J�n���ԂQ�i���j
     */
    public void setMaleTimeFrom2Minute(String maleTimeFrom2Minute) {
        this.maleTimeFrom2Minute = maleTimeFrom2Minute;
    }

    /**
     * �j���J�n���ԂR��ݒ肵�܂��B
     * 
     * @param maleTimeFrom3
     *            �j���J�n���ԂR
     */
    public void setMaleTimeFrom3(String maleTimeFrom3) {
        setMaleTimeFrom3Hour(DKikakuWebUtil.getHourFormTime(maleTimeFrom3));
        setMaleTimeFrom3Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeFrom3));
    }

    /**
     * �j���J�n���ԂR�i���ԁj��ݒ肵�܂��B
     * 
     * @param maleTimeFrom3Hour
     *            �j���J�n���ԂR�i���ԁj
     */
    public void setMaleTimeFrom3Hour(String maleTimeFrom3Hour) {
        this.maleTimeFrom3Hour = maleTimeFrom3Hour;
    }

    /**
     * �j���J�n���ԂR�i���j��ݒ肵�܂��B
     * 
     * @param maleTimeFrom3Minute
     *            �j���J�n���ԂR�i���j
     */
    public void setMaleTimeFrom3Minute(String maleTimeFrom3Minute) {
        this.maleTimeFrom3Minute = maleTimeFrom3Minute;
    }

    /**
     * �j���I�����ԂP��ݒ肵�܂��B
     * 
     * @param maleTimeTo1
     *            �j���I�����ԂP
     */
    public void setMaleTimeTo1(String maleTimeTo1) {
        setMaleTimeTo1Hour(DKikakuWebUtil.getHourFormTime(maleTimeTo1));
        setMaleTimeTo1Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeTo1));
    }

    /**
     * �j���I�����ԂP�i���ԁj��ݒ肵�܂��B
     * 
     * @param maleTimeTo1Hour
     *            �j���I�����ԂP�i���ԁj
     */
    public void setMaleTimeTo1Hour(String maleTimeTo1Hour) {
        this.maleTimeTo1Hour = maleTimeTo1Hour;
    }

    /**
     * �j���I�����ԂP�i���j��ݒ肵�܂��B
     * 
     * @param maleTimeTo1Minute
     *            �j���I�����ԂP�i���j
     */
    public void setMaleTimeTo1Minute(String maleTimeTo1Minute) {
        this.maleTimeTo1Minute = maleTimeTo1Minute;
    }

    /**
     * �j���I�����ԂQ��ݒ肵�܂��B
     * 
     * @param maleTimeTo2
     *            �j���I�����ԂQ
     */
    public void setMaleTimeTo2(String maleTimeTo2) {
        setMaleTimeTo2Hour(DKikakuWebUtil.getHourFormTime(maleTimeTo2));
        setMaleTimeTo2Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeTo2));
    }

    /**
     * �j���I�����ԂQ�i���ԁj��ݒ肵�܂��B
     * 
     * @param maleTimeTo2Hour
     *            �j���I�����ԂQ�i���ԁj
     */
    public void setMaleTimeTo2Hour(String maleTimeTo2Hour) {
        this.maleTimeTo2Hour = maleTimeTo2Hour;
    }

    /**
     * �j���I�����ԂQ�i���j��ݒ肵�܂��B
     * 
     * @param maleTimeTo2Minute
     *            �j���I�����ԂQ�i���j
     */
    public void setMaleTimeTo2Minute(String maleTimeTo2Minute) {
        this.maleTimeTo2Minute = maleTimeTo2Minute;
    }

    /**
     * �j���I�����ԂR��ݒ肵�܂��B
     * 
     * @param maleTimeTo3
     *            �j���I�����ԂR
     */
    public void setMaleTimeTo3(String maleTimeTo3) {
        setMaleTimeTo3Hour(DKikakuWebUtil.getHourFormTime(maleTimeTo3));
        setMaleTimeTo3Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeTo3));
    }

    /**
     * �j���I�����ԂR�i���ԁj��ݒ肵�܂��B
     * 
     * @param maleTimeTo3Hour
     *            �j���I�����ԂR�i���ԁj
     */
    public void setMaleTimeTo3Hour(String maleTimeTo3Hour) {
        this.maleTimeTo3Hour = maleTimeTo3Hour;
    }

    /**
     * �j���I�����ԂR�i���j��ݒ肵�܂��B
     * 
     * @param maleTimeTo3Minute
     *            �j���I�����ԂR�i���j
     */
    public void setMaleTimeTo3Minute(String maleTimeTo3Minute) {
        this.maleTimeTo3Minute = maleTimeTo3Minute;
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
     * �V�R����E���̑���ݒ肵�܂��B
     * 
     * @param naturalSpa
     *            �V�R����E���̑�
     */
    public void setNaturalSpa(String naturalSpa) {
        this.naturalSpa = naturalSpa;
    }

    /**
     * ���̑�����R�����g��ݒ肵�܂��B
     * 
     * @param otherSpringCmt
     *            ���̑�����R�����g
     */
    public void setOtherSpringCmt(String otherSpringCmt) {
        this.otherSpringCmt = otherSpringCmt;
    }

    /**
     * �N�o��Ԃ�ݒ肵�܂��B
     * 
     * @param pourStatus
     *            �N�o���
     */
    public void setPourStatus(String pourStatus) {
        this.pourStatus = pourStatus;
    }

    /**
     * �N�o��ԃR�����g��ݒ肵�܂��B
     * 
     * @param pourStatusCmt
     *            �N�o��ԃR�����g
     */
    public void setPourStatusCmt(String pourStatusCmt) {
        this.pourStatusCmt = pourStatusCmt;
    }

    /**
     * ����z���L����ݒ肵�܂��B
     * 
     * @param recircleKindFlg
     *            ����z���L��
     */
    public void setRecircleKindFlg(String recircleKindFlg) {
        this.recircleKindFlg = recircleKindFlg;
    }

    /**
     * ���ؗ�����ݒ肵�܂��B
     * 
     * @param rentalFees
     *            ���ؗ���
     */
    public void setRentalFees(String rentalFees) {
        this.rentalFees = rentalFees;
    }

    /**
     * ���ؗL���L����ݒ肵�܂��B
     * 
     * @param rentalPayFlg
     *            ���ؗL���L��
     */
    public void setRentalPayFlg(String rentalPayFlg) {
        this.rentalPayFlg = rentalPayFlg;
    }

    /**
     * ���ؗ\��敪��ݒ肵�܂��B
     * 
     * @param rentalReserveDiv
     *            ���ؗ\��敪
     */
    public void setRentalReserveDiv(String rentalReserveDiv) {
        this.rentalReserveDiv = rentalReserveDiv;
    }

    /**
     * ���؎��O�\��I���t���O��ݒ肵�܂��B
     * 
     * @param rentalReserveFlg
     *            ���؎��O�\��I���t���O
     */
    public void setRentalReserveFlg(String rentalReserveFlg) {
        this.rentalReserveFlg = rentalReserveFlg;
    }

    /**
     * ���؉ӏ����ʂ�ݒ肵�܂��B
     * 
     * @param rentalSiteNum
     *            ���؉ӏ�����
     */
    public void setRentalSiteNum(String rentalSiteNum) {
        this.rentalSiteNum = rentalSiteNum;
    }

    /**
     * ���؎��Ԃ�ݒ肵�܂��B
     * 
     * @param rentalTime
     *            ���؎���
     */
    public void setRentalTime(String rentalTime) {
        this.rentalTime = rentalTime;
    }

    /**
     * ���ƌ���L����ݒ肵�܂��B
     * 
     * @param selfSpringFlg
     *            ���ƌ���L��
     */
    public void setSelfSpringFlg(String selfSpringFlg) {
        this.selfSpringFlg = selfSpringFlg;
    }

    /**
     * ��������L����ݒ肵�܂��B
     * 
     * @param shareSpringFlg
     *            ��������L��
     */
    public void setShareSpringFlg(String shareSpringFlg) {
        this.shareSpringFlg = shareSpringFlg;
    }

    /**
     * �������򖼂�ݒ肵�܂��B
     * 
     * @param shareSpringNm
     *            ��������
     */
    public void setShareSpringNm(String shareSpringNm) {
        this.shareSpringNm = shareSpringNm;
    }

    /**
     * ����֐��L����ݒ肵�܂��B
     * 
     * @param shiftFlg
     *            ����֐��L��
     */
    public void setShiftFlg(String shiftFlg) {
        this.shiftFlg = shiftFlg;
    }

    /**
     * ���򂩂������L����ݒ肵�܂��B
     * 
     * @param spaFlowFlg
     *            ���򂩂������L��
     */
    public void setSpaFlowFlg(String spaFlowFlg) {
        this.spaFlowFlg = spaFlowFlg;
    }

    /**
     * �򎿂�ݒ肵�܂��B
     * 
     * @param spaQuality
     *            ��
     */
    public void setSpaQuality(String spaQuality) {
        this.spaQuality = spaQuality;
    }

    /**
     * ���򉷓x��ݒ肵�܂��B
     * 
     * @param spaTemp
     *            ���򉷓x
     */
    public void setSpaTemp(String spaTemp) {
        this.spaTemp = spaTemp;
    }

    /**
     * ��������L��L����ݒ肵�܂��B
     * 
     * @param warmingFlg
     *            ��������L��L��
     */
    public void setWarmingFlg(String warmingFlg) {
        this.warmingFlg = warmingFlg;
    }

    /**
     * �����ւ̓��ʃR���g���[���L����ݒ肵�܂��B
     * 
     * @param waterControlFlg
     *            �����ւ̓��ʃR���g���[���L��
     */
    public void setWaterControlFlg(String waterControlFlg) {
        this.waterControlFlg = waterControlFlg;
    }

}
