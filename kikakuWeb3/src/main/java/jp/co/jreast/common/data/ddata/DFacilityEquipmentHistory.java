package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]�{��_�ݔ�_���� �G���e�B�e�B
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
public class DFacilityEquipmentHistory extends DFacilityEquipment implements
        FacilityManageBodyHistoryKey {

    /** ����ԍ� */
    private Integer careerNo;

    /**
     * �R���X�g���N�^
     */
    public DFacilityEquipmentHistory() {
        super();
    }

    /**
     * �R���X�g���N�^
     * 
     * @param equipmentKind
     *            �ݔ����
     */
    public DFacilityEquipmentHistory(Integer equipmentKind) {
        super(equipmentKind);
    }

    @Override
    public Integer getCareerNo() {
        return careerNo;
    }

    @Override
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

}
