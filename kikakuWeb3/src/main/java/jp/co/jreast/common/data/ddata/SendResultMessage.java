package jp.co.jreast.common.data.ddata;

import jp.co.intage.framework.data.OutData;

/**
 * [DP/RM]�{�ݕt�я�� ���͈˗����M���ʏo�̓f�[�^
 * 
 * <pre>
 *   �@�\�T�v �F �r�W�l�X���W�b�N�̖߂�l�Ƃ��Ďg�p���܂��B
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class SendResultMessage implements OutData {

    /** ���[�����M�G���[�t���O */
    private boolean mailError;

    /** ���t�敪 */
    private Integer sendDiv;

    /**
     * ���t�敪���擾���܂��B
     * 
     * @return ���t�敪
     */
    public Integer getSendDiv() {
        return sendDiv;
    }

    /**
     * ���[�����M�G���[�t���O���擾���܂��B
     * 
     * @return ���[�����M�G���[�t���O
     */
    public boolean isMailError() {
        return mailError;
    }

    /**
     * ���[�����M�G���[�t���O��ݒ肵�܂��B
     * 
     * @param mailError
     *            ���[�����M�G���[�t���O
     */
    public void setMailError(boolean mailError) {
        this.mailError = mailError;
    }

    /**
     * ���t�敪��ݒ肵�܂��B
     * 
     * @param sendDiv
     *            ���t�敪
     */
    public void setSendDiv(Integer sendDiv) {
        this.sendDiv = sendDiv;
    }

}
