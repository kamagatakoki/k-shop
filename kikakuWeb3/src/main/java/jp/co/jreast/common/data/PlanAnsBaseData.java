package jp.co.jreast.common.data;

import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;

/**
 * <pre>
 * ��揑�x�[�X�f�[�^�N���X�B.
 * �@�\�T�v    �F  ��揑�x�[�X�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author zhu
 * @version 0.1 2006/10/27
 */
public class PlanAnsBaseData {

    /**
     * ����ԍ�.
     */
    private Integer careerNo;

    /** �f�ގ�� */
    private String materialKind;

    /**
     * ���񓚘A��.
     */
    private Long planAnsNo;

    /**
     * @return Returns the careerNo.
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * �f�ގ�ʂ��擾���܂��B
     * 
     * @return �f�ގ��
     */
    public String getMaterialKind() {
        return materialKind;
    }

    /**
     * �f�ގ�ʖ��̂��擾���܂��B
     * 
     * <pre></pre>
     * 
     * @return �f�ގ�ʖ���
     */
    public String getMaterialKindName() {
        return JreConstants.getListLabel(DJreConstants.DIV_MATERIAL_KIND,
                materialKind);
    }

    /**
     * @return Returns the planAnsNo.
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * @param careerNo
     *            The careerNo to set.
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * �f�ގ�ʂ�ݒ肵�܂��B
     * 
     * @param materialKind
     *            �f�ގ��
     */
    public void setMaterialKind(String materialKind) {
        this.materialKind = materialKind;
    }

    /**
     * @param planAnsNo
     *            The planAnsNo to set.
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * ���񓚘A�ԂƗ���ԍ����Z�b�g����.
     * 
     * @param from
     *            from�f�[�^
     */
    public void setPlanNoAndCareerNo(PlanAnsBaseData from) {
        setPlanAnsNo(from.getPlanAnsNo());
        setCareerNo(from.getCareerNo());
    }

}
