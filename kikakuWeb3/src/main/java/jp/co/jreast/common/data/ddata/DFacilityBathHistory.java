package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]施設_風呂_履歴 エンティティ
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
public class DFacilityBathHistory extends DFacilityBath implements
        FacilityManageBodyHistoryKey {

    /** 履歴番号 */
    private Integer careerNo;

    /**
     * コンストラクタ
     */
    public DFacilityBathHistory() {
        super();
    }

    /**
     * コンストラクタ
     * 
     * @param bathDiv
     *            風呂区分
     * @param bathKind
     *            風呂種別
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
