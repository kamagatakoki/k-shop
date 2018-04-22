package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyHistoryKey;

/**
 * [DP/RM]施設_設備_履歴 エンティティ
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
public class DFacilityEquipmentHistory extends DFacilityEquipment implements
        FacilityManageBodyHistoryKey {

    /** 履歴番号 */
    private Integer careerNo;

    /**
     * コンストラクタ
     */
    public DFacilityEquipmentHistory() {
        super();
    }

    /**
     * コンストラクタ
     * 
     * @param equipmentKind
     *            設備種別
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
