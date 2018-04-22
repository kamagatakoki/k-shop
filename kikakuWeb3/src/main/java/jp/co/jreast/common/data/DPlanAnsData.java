package jp.co.jreast.common.data;

/**
 * <pre>
 * DP/RM���񓚏��f�[�^�N���X
 * �@�\�T�v    �F  DP/RM���񓚏��f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public class DPlanAnsData extends PlanAnsData {

    /**
     * ���ID
     */
    private String comId;

    /**
     * ����WEB�A�g��
     */
    private Integer zouseiRelateCnt;

    /**
     * ���ID���擾���܂��B
     * 
     * @return ���ID
     */
    public String getComId() {
        return comId;
    }

    /**
     * ����WEB�A�g�񐔂��擾���܂��B
     * 
     * @return ����WEB�A�g��
     */
    public Integer getZouseiRelateCnt() {
        return zouseiRelateCnt;
    }

    /**
     * ���ID��ݒ肵�܂��B
     * 
     * @param comId
     *            ���ID
     */
    public void setComId(String comId) {
        this.comId = comId;
    }

    /**
     * ����WEB�A�g�񐔂�ݒ肵�܂��B
     * 
     * @param zouseiRelateCnt
     *            ����WEB�A�g��
     */
    public void setZouseiRelateCnt(Integer zouseiRelateCnt) {
        this.zouseiRelateCnt = zouseiRelateCnt;
    }

}
