package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.BathDiv;
import jp.co.jreast.common.enums.BathKind;

/**
 * [DP/RM]�{��_���C�E�I�V���C �f�[�^
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
public class DFacilityBathDivOutside {

    /** ���C�敪 : �I�V���C */
    private static final Integer BATH_DIV = BathDiv.OUTSIDE.code();

    /** ������p�̂� */
    private DFacilityBathHistory femaleOnly;

    /** �j���� */
    private DFacilityBathHistory maleFemale;

    /** �j����p�̂� */
    private DFacilityBathHistory maleOnly;

    /** ���l */
    private DFacilityBathHistory memo;

    /** ���� */
    private DFacilityBathHistory mixBath;

    /** ���Ԍ�֐� */
    private DFacilityBathHistory timeShift;

    /**
     * �R���X�g���N�^
     */
    public DFacilityBathDivOutside() {
        super();
        this.maleFemale = new DFacilityBathHistory(BATH_DIV,
                BathKind.MALE_FEMALE.code());
        this.maleOnly = new DFacilityBathHistory(BATH_DIV,
                BathKind.MALE_ONLY.code());
        this.femaleOnly = new DFacilityBathHistory(BATH_DIV,
                BathKind.FEMALE_ONLY.code());
        this.timeShift = new DFacilityBathHistory(BATH_DIV,
                BathKind.TIME_SHIFT.code());
        this.mixBath = new DFacilityBathHistory(BATH_DIV,
                BathKind.MIX_BATH.code());
        this.memo = new DFacilityBathHistory(BATH_DIV, BathKind.MEMO.code());
    }

    /**
     * �u���C��ʁv����{��_���C���擾���܂��B
     * 
     * <pre></pre>
     * 
     * @param bathKind
     *            ���C���
     * @return �{��_���C
     */
    public DFacilityBathHistory getBath(int bathKind) {

        BathKind enm = BathKind.codeOf(bathKind);

        if (enm == null) {
            return new DFacilityBathHistory(BATH_DIV, bathKind);
        }

        switch (enm) {
        case MALE_FEMALE:
            return getMaleFemale();
        case MALE_ONLY:
            return getMaleOnly();
        case FEMALE_ONLY:
            return getFemaleOnly();
        case TIME_SHIFT:
            return getTimeShift();
        case MIX_BATH:
            return getMixBath();
        case MEMO:
            return getMemo();
        default:
            return new DFacilityBathHistory(BATH_DIV, enm.code());
        }
    }

    /**
     * ������p�݂̂��擾���܂��B
     * 
     * @return ������p�̂�
     */
    public DFacilityBathHistory getFemaleOnly() {
        return femaleOnly;
    }

    /**
     * �j���ʂ��擾���܂��B
     * 
     * @return �j����
     */
    public DFacilityBathHistory getMaleFemale() {
        return maleFemale;
    }

    /**
     * �j����p�݂̂��擾���܂��B
     * 
     * @return �j����p�̂�
     */
    public DFacilityBathHistory getMaleOnly() {
        return maleOnly;
    }

    /**
     * ���l���擾���܂��B
     * 
     * @return ���l
     */
    public DFacilityBathHistory getMemo() {
        return memo;
    }

    /**
     * �������擾���܂��B
     * 
     * @return ����
     */
    public DFacilityBathHistory getMixBath() {
        return mixBath;
    }

    /**
     * ���Ԍ�֐����擾���܂��B
     * 
     * @return ���Ԍ�֐�
     */
    public DFacilityBathHistory getTimeShift() {
        return timeShift;
    }

    /**
     * ������p�݂̂�ݒ肵�܂��B
     * 
     * @param femaleOnly
     *            ������p�̂�
     */
    public void setFemaleOnly(DFacilityBathHistory femaleOnly) {
        this.femaleOnly = femaleOnly;
    }

    /**
     * �j���ʂ�ݒ肵�܂��B
     * 
     * @param maleFemale
     *            �j����
     */
    public void setMaleFemale(DFacilityBathHistory maleFemale) {
        this.maleFemale = maleFemale;
    }

    /**
     * �j����p�݂̂�ݒ肵�܂��B
     * 
     * @param maleOnly
     *            �j����p�̂�
     */
    public void setMaleOnly(DFacilityBathHistory maleOnly) {
        this.maleOnly = maleOnly;
    }

    /**
     * ���l��ݒ肵�܂��B
     * 
     * @param memo
     *            ���l
     */
    public void setMemo(DFacilityBathHistory memo) {
        this.memo = memo;
    }

    /**
     * ������ݒ肵�܂��B
     * 
     * @param mixBath
     *            ����
     */
    public void setMixBath(DFacilityBathHistory mixBath) {
        this.mixBath = mixBath;
    }

    /**
     * ���Ԍ�֐���ݒ肵�܂��B
     * 
     * @param timeShift
     *            ���Ԍ�֐�
     */
    public void setTimeShift(DFacilityBathHistory timeShift) {
        this.timeShift = timeShift;
    }

    /**
     * �{��_���C �f�[�^��List�Ƃ��Ď擾���܂��B
     * 
     * <pre></pre>
     * 
     * @return �{��_���C���X�g
     */
    public List<DFacilityBathHistory> toList() {
        List<DFacilityBathHistory> list = new ArrayList<DFacilityBathHistory>();

        list.add(maleFemale);
        list.add(maleOnly);
        list.add(femaleOnly);
        list.add(timeShift);
        list.add(mixBath);
        list.add(memo);

        return list;
    }

}
