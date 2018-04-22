package jp.co.jreast.common.interfaces;

import jp.co.jreast.common.data.ddata.DFacilityBathInfoData;
import jp.co.jreast.common.data.ddata.DFacilityEquipmentInfoData;
import jp.co.jreast.common.data.ddata.DFacilityGeneralInfoHistory;
import jp.co.jreast.common.data.ddata.DFacilityTrafficHistory;

/**
 * TODO DFacilityManageNo5Data
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
public interface DFacilityManageNo5Data {

    /**
     * 施設_風呂データを取得します。
     * 
     * @return 施設_風呂データ
     */
    DFacilityBathInfoData getBathInfoData();

    /**
     * 施設_設備データを取得します。
     * 
     * @return 施設_設備データ
     */
    DFacilityEquipmentInfoData getEquipmentInfoData();

    /**
     * 施設_一般情報データを取得します。
     * 
     * @return 施設_一般情報データ
     */
    DFacilityGeneralInfoHistory getGeneralInfo();

    /**
     * 幼児受入可否フラグを取得します。
     * 
     * @return 幼児受入可否フラグ
     * @see jp.co.jreast.common.data.ddata.MFacility#getInfantFlg()
     */
    String getInfantFlg();

    /**
     * 施設_交通手段データを取得します。
     * 
     * @return 施設_交通手段データ
     */
    DFacilityTrafficHistory getTraffic();

}
