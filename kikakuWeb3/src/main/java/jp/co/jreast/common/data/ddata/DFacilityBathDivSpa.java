package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.BathDiv;
import jp.co.jreast.common.enums.BathKind;

/**
 * [DP/RM]�{��_���C�E���� �f�[�^
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
public class DFacilityBathDivSpa {

    /** ���C�敪 : ���� */
    private static final Integer BATH_DIV = BathDiv.SPA.code();

    /** ���򂠂� */
    private DFacilityBathHistory data;

    /** ���l */
    private DFacilityBathHistory memo;

    /**
     * �R���X�g���N�^
     */
    public DFacilityBathDivSpa() {
        super();
        this.data = new DFacilityBathHistory(BATH_DIV, BathKind.HAS_SPA.code());
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
        case HAS_SPA:
            return getData();
        case MEMO:
            return getMemo();
        default:
            return new DFacilityBathHistory(BATH_DIV, enm.code());
        }
    }

    /**
     * ���򂠂���擾���܂��B
     * 
     * @return ���򂠂�
     */
    public DFacilityBathHistory getData() {
        return data;
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
     * ���򂠂��ݒ肵�܂��B
     * 
     * @param data
     *            ���򂠂�
     */
    public void setData(DFacilityBathHistory data) {
        this.data = data;
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
     * �{��_���C �f�[�^��List�Ƃ��Ď擾���܂��B
     * 
     * <pre></pre>
     * 
     * @return �{��_���C���X�g
     */
    public List<DFacilityBathHistory> toList() {
        List<DFacilityBathHistory> list = new ArrayList<DFacilityBathHistory>();

        list.add(data);
        list.add(memo);

        return list;
    }

}
