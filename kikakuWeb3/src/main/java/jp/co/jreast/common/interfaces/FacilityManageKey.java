package jp.co.jreast.common.interfaces;

/**
 * �{�ݕt�я��Ǘ� �L�[����
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
public interface FacilityManageKey {

    /**
     * ����ԍ����擾���܂��B
     * 
     * @return ����ԍ�
     */
    Integer getCareerNo();

    /**
     * �{�݃R�[�h���擾���܂��B
     * 
     * @return �{�݃R�[�h
     */
    String getFacilityCd();

    /**
     * �{�ݑf�ގ�ʂ��擾���܂��B
     * 
     * @return �{�ݑf�ގ��
     */
    String getFacilityMaterialKind();

    /**
     * �{�݃p�^�[�����擾���܂��B
     * 
     * @return �{�݃p�^�[��
     */
    String getFacilityPattern();

    /**
     * �{�ݕt�ю�ނ��擾���܂��B
     * 
     * @return �{�ݕt�ю��
     */
    String getFacilitySorts();

    /**
     * �񓚏���ʂ��擾���܂��B
     * 
     * @return �񓚏����
     */
    String getKindFlg();

    /**
     * ����ԍ���ݒ肵�܂��B
     * 
     * @param careerNo
     *            ����ԍ�
     */
    void setCareerNo(Integer careerNo);

    /**
     * �{�݃R�[�h��ݒ肵�܂��B
     * 
     * @param facilityCd
     *            �{�݃R�[�h
     */
    void setFacilityCd(String facilityCd);

    /**
     * �{�ݑf�ގ�ʂ�ݒ肵�܂��B
     * 
     * @param facilityMaterialKind
     *            �{�ݑf�ގ��
     */
    void setFacilityMaterialKind(String facilityMaterialKind);

    /**
     * �{�݃p�^�[����ݒ肵�܂��B
     * 
     * @param facilityPattern
     *            �{�݃p�^�[��
     */
    void setFacilityPattern(String facilityPattern);

    /**
     * �{�ݕt�ю�ނ�ݒ肵�܂��B
     * 
     * @param facilitySorts
     *            �{�ݕt�ю��
     */
    void setFacilitySorts(String facilitySorts);

    /**
     * �񓚏���ʂ�ݒ肵�܂��B
     * 
     * @param kindFlg
     *            �񓚏����
     */
    void setKindFlg(String kindFlg);

}
