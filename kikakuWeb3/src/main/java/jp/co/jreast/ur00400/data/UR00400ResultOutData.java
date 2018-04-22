package jp.co.jreast.ur00400.data;

import jp.co.intage.framework.data.OutData;

/**
 * ���M�������ʃf�[�^�N���X�B.
 * 
 * <pre>
 *  �@�\�T�v�@�F��ʑ��M�����Ƃ��g���f�[�^�N���X .
 *  ���L�����@�F�Ȃ�
 * </pre>
 * 
 * @author �v���N
 */
public class UR00400ResultOutData implements OutData {

    /**
     * �G���[���[������ .
     */
    private Integer errorMailCount;

    /**
     * FAX���� .
     */
    private Integer faxCount;

    /**
     * ���[������ .
     */
    private Integer rightMailCount;

    /**
     * ���M���� .
     */
    private Integer sumCount;

    /**
     * @return �G���[���[������
     */
    public Integer getErrorMailCount() {
        return errorMailCount;
    }

    /**
     * @return FAX����
     */
    public Integer getFaxCount() {
        return faxCount;
    }

    /**
     * @return ���[������
     */
    public Integer getRightMailCount() {
        return rightMailCount;
    }

    /**
     * @return ���M����
     */
    public Integer getSumCount() {
        return sumCount;
    }

    /**
     * @param errorMailCount
     *            �G���[���[������
     */
    public void setErrorMailCount(Integer errorMailCount) {
        this.errorMailCount = errorMailCount;
    }

    /**
     * @param faxCount
     *            FAX����
     */
    public void setFaxCount(Integer faxCount) {
        this.faxCount = faxCount;
    }

    /**
     * @param rightMailCount
     *            ���[������
     */
    public void setRightMailCount(Integer rightMailCount) {
        this.rightMailCount = rightMailCount;
    }

    /**
     * @param sumCount
     *            ���M����
     */
    public void setSumCount(Integer sumCount) {
        this.sumCount = sumCount;
    }

}
