package jp.co.jreast.common.interfaces;

/**
 * ���񓚏� �L�[����
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
public interface PlanAnsKey {

    /**
     * ����ԍ����擾���܂��B
     * 
     * @return ����ԍ�
     */
    Integer getCareerNo();

    /**
     * �f�ގ�ʂ��擾���܂��B
     * 
     * @return �f�ގ��
     */
    String getMaterialKind();

    /**
     * ���񓚘A�Ԃ��擾���܂��B
     * 
     * @return ���񓚘A��
     */
    Long getPlanAnsNo();

    /**
     * ����ԍ���ݒ肵�܂��B
     * 
     * @param careerNo
     *            ����ԍ�
     */
    void setCareerNo(Integer careerNo);

    /**
     * �f�ގ�ʂ�ݒ肵�܂��B
     * 
     * @param materialKind
     *            �f�ގ��
     */
    void setMaterialKind(String materialKind);

    /**
     * ���񓚘A�Ԃ�ݒ肵�܂��B
     * 
     * @param planAnsNo
     *            ���񓚘A��
     */
    void setPlanAnsNo(Long planAnsNo);

}
