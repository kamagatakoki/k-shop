package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]�{��_���C_���� �G���e�B�e�B
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
public class DFacilityBathHistory extends DFacilityBath implements
        FacilityManageBodyHistoryKey {

    /** ����ԍ� */
    private Integer careerNo;

    /**
     * �R���X�g���N�^
     */
    public DFacilityBathHistory() {
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
    public DFacilityBathHistory(Integer bathDiv, Integer bathKind) {
        super(bathDiv, bathKind);
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
