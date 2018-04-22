package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]�{��_�������i_���� �G���e�B�e�B
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
public class DFacilityVesselHistory extends DFacilityVessel implements
        FacilityManageBodyHistoryKey {

    /** ����ԍ� */
    private Integer careerNo;

    /** ���񓚏�NO1�R�t������ */
    private Integer no1Linked;

    @Override
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * ���񓚏�NO1�R�t���������擾���܂��B
     * 
     * @return ���񓚏�NO1�R�t������
     */
    public Integer getNo1Linked() {
        return no1Linked;
    }

    @Override
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * ���񓚏�NO1�R�t��������ݒ肵�܂��B
     * 
     * @param no1Linked
     *            ���񓚏�NO1�R�t������
     */
    public void setNo1Linked(Integer no1Linked) {
        this.no1Linked = no1Linked;
    }

}
