package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]�{��_��ʎ�i_���� �G���e�B�e�B
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
public class DFacilityTrafficHistory extends DFacilityTraffic implements
        FacilityManageBodyHistoryKey {

    /** ����ԍ� */
    private Integer careerNo;

    @Override
    public Integer getCareerNo() {
        return careerNo;
    }

    @Override
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

}
