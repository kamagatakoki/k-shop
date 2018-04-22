package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.data.AnsFaclitySearchData;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.interfaces.DFacilityManageSearchData;

/**
 * �����������������f�[�^
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
public class DFacilityManageSearchDataImple extends AnsFaclitySearchData
        implements DFacilityManageSearchData {

    /** �{�ݑf�ގ�� */
    private String facilityMaterialKind;

    /** ���[�U��� */
    private UserData userData;

    @Override
    public String getFacilityMaterialKind() {
        return facilityMaterialKind;
    }

    @Override
    public UserData getUserData() {
        return userData;
    }

    @Override
    public void setFacilityMaterialKind(String facilityMaterialKind) {
        this.facilityMaterialKind = facilityMaterialKind;
    }

    @Override
    public void setUserData(UserData userData) {
        this.userData = userData;
    }

}
