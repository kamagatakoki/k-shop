package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]施設_部屋備品_履歴 エンティティ
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
public class DFacilityVesselHistory extends DFacilityVessel implements
        FacilityManageBodyHistoryKey {

    /** 履歴番号 */
    private Integer careerNo;

    /** 企画回答書NO1紐付け件数 */
    private Integer no1Linked;

    @Override
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 企画回答書NO1紐付け件数を取得します。
     * 
     * @return 企画回答書NO1紐付け件数
     */
    public Integer getNo1Linked() {
        return no1Linked;
    }

    @Override
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * 企画回答書NO1紐付け件数を設定します。
     * 
     * @param no1Linked
     *            企画回答書NO1紐付け件数
     */
    public void setNo1Linked(Integer no1Linked) {
        this.no1Linked = no1Linked;
    }

}
