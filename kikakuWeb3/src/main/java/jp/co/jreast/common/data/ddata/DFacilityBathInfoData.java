package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.BathDiv;

/**
 * [DP/RM]�{��_���C �f�[�^
 * 
 * <pre>
 *   �@�\�T�v �F  �{�ݕt�я��P�ʂ̑S�����̏���ێ����܂��B
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityBathInfoData {

    /** �嗁�� */
    private DFacilityBathDivBathHouse bathHouse;

    /** �I�V���C */
    private DFacilityBathDivOutside outside;

    /** �ݐؘI�V���C */
    private DFacilityBathDivRentalOutsideSpa rentalOutsideSpa;

    /** �ݐؕ��C */
    private DFacilityBathDivRentalSpa rentalSpa;

    /** �T�E�i */
    private DFacilityBathDivSauna sauna;

    /** ���� */
    private DFacilityBathDivSpa spa;

    /**
     * �R���X�g���N�^
     */
    public DFacilityBathInfoData() {
        super();
        this.bathHouse = new DFacilityBathDivBathHouse();
        this.outside = new DFacilityBathDivOutside();
        this.rentalOutsideSpa = new DFacilityBathDivRentalOutsideSpa();
        this.rentalSpa = new DFacilityBathDivRentalSpa();
        this.sauna = new DFacilityBathDivSauna();
        this.spa = new DFacilityBathDivSpa();
    }

    /**
     * �u���C�敪�v����сu���C��ʁv����{��_���C���擾���܂��B
     * 
     * <pre></pre>
     * 
     * @param bathDiv
     *            ���C�敪
     * @param bathKind
     *            ���C���
     * @return �{��_���C
     */
    public DFacilityBathHistory getBath(Integer bathDiv, Integer bathKind) {

        BathDiv enm = BathDiv.codeOf(bathDiv);

        if (enm == null) {
            return new DFacilityBathHistory(bathDiv, bathKind);
        }

        switch (enm) {
        case SPA:
            return getSpa().getBath(bathKind);

        case OUTSIDE:
            return getOutside().getBath(bathKind);

        case BATH_HOUSE:
            return getBathHouse().getBath(bathKind);

        case RENTAL_OUTSIDE_SPA:
            return getRentalOutsideSpa().getBath(bathKind);

        case RENTAL_SPA:
            return getRentalSpa().getBath(bathKind);

        case SAUNA:
            return getSauna().getBath(bathKind);

        default:
            return new DFacilityBathHistory(enm.code(), bathKind);
        }
    }

    /**
     * �嗁����擾���܂��B
     * 
     * @return �嗁��
     */
    public DFacilityBathDivBathHouse getBathHouse() {
        return bathHouse;
    }

    /**
     * �I�V���C���擾���܂��B
     * 
     * @return �I�V���C
     */
    public DFacilityBathDivOutside getOutside() {
        return outside;
    }

    /**
     * �ݐؘI�V���C���擾���܂��B
     * 
     * @return �ݐؘI�V���C
     */
    public DFacilityBathDivRentalOutsideSpa getRentalOutsideSpa() {
        return rentalOutsideSpa;
    }

    /**
     * �ݐؕ��C���擾���܂��B
     * 
     * @return �ݐؕ��C
     */
    public DFacilityBathDivRentalSpa getRentalSpa() {
        return rentalSpa;
    }

    /**
     * �T�E�i���擾���܂��B
     * 
     * @return �T�E�i
     */
    public DFacilityBathDivSauna getSauna() {
        return sauna;
    }

    /**
     * ������擾���܂��B
     * 
     * @return ����
     */
    public DFacilityBathDivSpa getSpa() {
        return spa;
    }

    /**
     * �嗁���ݒ肵�܂��B
     * 
     * @param bathHouse
     *            �嗁��
     */
    public void setBathHouse(DFacilityBathDivBathHouse bathHouse) {
        this.bathHouse = bathHouse;
    }

    /**
     * �I�V���C��ݒ肵�܂��B
     * 
     * @param outside
     *            �I�V���C
     */
    public void setOutside(DFacilityBathDivOutside outside) {
        this.outside = outside;
    }

    /**
     * �ݐؘI�V���C��ݒ肵�܂��B
     * 
     * @param rentalOutsideSpa
     *            �ݐؘI�V���C
     */
    public void setRentalOutsideSpa(
            DFacilityBathDivRentalOutsideSpa rentalOutsideSpa) {
        this.rentalOutsideSpa = rentalOutsideSpa;
    }

    /**
     * �ݐؕ��C��ݒ肵�܂��B
     * 
     * @param rentalSpa
     *            �ݐؕ��C
     */
    public void setRentalSpa(DFacilityBathDivRentalSpa rentalSpa) {
        this.rentalSpa = rentalSpa;
    }

    /**
     * �T�E�i��ݒ肵�܂��B
     * 
     * @param sauna
     *            �T�E�i
     */
    public void setSauna(DFacilityBathDivSauna sauna) {
        this.sauna = sauna;
    }

    /**
     * �����ݒ肵�܂��B
     * 
     * @param spa
     *            ����
     */
    public void setSpa(DFacilityBathDivSpa spa) {
        this.spa = spa;
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

        list.addAll(bathHouse.toList());
        list.addAll(outside.toList());
        list.addAll(rentalOutsideSpa.toList());
        list.addAll(rentalSpa.toList());
        list.addAll(sauna.toList());
        list.addAll(spa.toList());

        return list;
    }

}
