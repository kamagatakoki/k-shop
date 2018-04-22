package jp.co.jreast.common.interfaces;

import jp.co.jreast.common.data.ddata.DFacilityBathInfoData;
import jp.co.jreast.common.data.ddata.DFacilityEquipmentInfoData;
import jp.co.jreast.common.data.ddata.DFacilityGeneralInfoHistory;
import jp.co.jreast.common.data.ddata.DFacilityTrafficHistory;

/**
 * TODO DFacilityManageNo5Data
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
public interface DFacilityManageNo5Data {

    /**
     * �{��_���C�f�[�^���擾���܂��B
     * 
     * @return �{��_���C�f�[�^
     */
    DFacilityBathInfoData getBathInfoData();

    /**
     * �{��_�ݔ��f�[�^���擾���܂��B
     * 
     * @return �{��_�ݔ��f�[�^
     */
    DFacilityEquipmentInfoData getEquipmentInfoData();

    /**
     * �{��_��ʏ��f�[�^���擾���܂��B
     * 
     * @return �{��_��ʏ��f�[�^
     */
    DFacilityGeneralInfoHistory getGeneralInfo();

    /**
     * �c������ۃt���O���擾���܂��B
     * 
     * @return �c������ۃt���O
     * @see jp.co.jreast.common.data.ddata.MFacility#getInfantFlg()
     */
    String getInfantFlg();

    /**
     * �{��_��ʎ�i�f�[�^���擾���܂��B
     * 
     * @return �{��_��ʎ�i�f�[�^
     */
    DFacilityTrafficHistory getTraffic();

}
