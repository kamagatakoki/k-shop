package jp.co.jreast.common.interfaces;

/**
 * �{�ݕt�я��{�̗����f�[�^ �L�[����
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
public interface FacilityManageBodyHistoryKey extends FacilityManageBodyKey {

    /**
     * ����ԍ����擾���܂��B
     * 
     * @return ����ԍ�
     */
    Integer getCareerNo();

    /**
     * ����ԍ���ݒ肵�܂��B
     * 
     * @param careerNo
     *            ����ԍ�
     */
    void setCareerNo(Integer careerNo);

}
