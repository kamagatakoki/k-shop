package jp.co.jreast.common.interfaces;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.UserData;

/**
 * �����������������f�[�^ �C���^�[�t�F�[�X
 * 
 * <pre>
 *   �@�\�T�v �F �Ăяo�����⃆�[�U�f�[�^�ɉ����A�{�ݕt�я��Ǘ��L�[���ځA���񓚏��L�[���ڂ�ێ�����f�[�^�̃C���^�[�t�F�[�X�ł��B
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public interface DFacilityManageSearchData extends InData, PlanAnsKey,
        FacilityManageKey {

    /**
     * �Ăяo�����敪���擾���܂��B
     * 
     * @return �Ăяo�����敪
     */
    String getCallFlg();

    /**
     * �{�݃^�C�v���擾���܂��B
     * 
     * @return �{�݃^�C�v
     */
    String getFacilityType();

    /**
     * �Ăяo�����敪���擾���܂��B
     * 
     * @return �Ăяo�����敪
     */
    UserData getUserData();

    /**
     * �Ăяo�����敪��ݒ肵�܂��B
     * 
     * @param callFlg
     *            �Ăяo�����敪
     */
    void setCallFlg(String callFlg);

    /**
     * �{�݃^�C�v��ݒ肵�܂��B
     * 
     * @param facilityType
     *            �{�݃^�C�v
     */
    void setFacilityType(String facilityType);

    /**
     * �Ăяo�����敪��ݒ肵�܂��B
     * 
     * @param userData
     *            �Ăяo�����敪
     */
    void setUserData(UserData userData);

}
