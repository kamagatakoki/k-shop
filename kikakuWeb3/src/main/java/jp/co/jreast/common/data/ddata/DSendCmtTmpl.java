package jp.co.jreast.common.data.ddata;

/**
 * [DP/RM]���M�R�����g�e���v���[�g �G���e�B�e�B
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
public class DSendCmtTmpl {

    /** �x�ЃR�[�h */
    private String branchCd;

    /** ���M�R�����g */
    private String cmtTmpl;

    /** �^�C���X�^���v */
    private String timestamp;

    /**
     * �x�ЃR�[�h���擾���܂��B
     * 
     * @return �x�ЃR�[�h
     */
    public String getBranchCd() {
        return branchCd;
    }

    /**
     * ���M�R�����g���擾���܂��B
     * 
     * @return ���M�R�����g
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * �^�C���X�^���v���擾���܂��B
     * 
     * @return �^�C���X�^���v
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * �x�ЃR�[�h��ݒ肵�܂��B
     * 
     * @param branchCd
     *            �x�ЃR�[�h
     */
    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }

    /**
     * ���M�R�����g��ݒ肵�܂��B
     * 
     * @param cmtTmpl
     *            ���M�R�����g
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * �^�C���X�^���v��ݒ肵�܂��B
     * 
     * @param timestamp
     *            �^�C���X�^���v
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
