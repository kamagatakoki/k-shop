package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]施設_交通手段_履歴 エンティティ
 * 
 * <pre>
 *   機能概要 ： 
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityTrafficHistory extends DFacilityTraffic implements
        FacilityManageBodyHistoryKey {

    /** 履歴番号 */
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
