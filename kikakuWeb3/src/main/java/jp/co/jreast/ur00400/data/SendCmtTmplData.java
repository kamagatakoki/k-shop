package jp.co.jreast.ur00400.data;

/**
 * ���M�R�����g�e���v���[�g�f�[�^�N���X�B.
 * 
 * <pre>
 *  �@�\�T�v�@�F�Ȃ�
 *  ���L�����@�F�Ȃ�
 * </pre>
 * 
 * @author �����@.
 */
public class SendCmtTmplData {

    /**
     * �x�ЃR�[�h.
     */
    private String branchCd;

    /**
     * ���M�R�����g .
     */
    private String cmtTmpl;

    /**
     * �^�C���X�^���v .
     */
    private String timestamp;

    /**
     * @return BranchCd
     */
    public String getBranchCd() {
        return branchCd;
    }

    /**
     * @return ���M�R�����g .
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * @return �^�C���X�^���v .
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * @param branchCd
     *            �ݒ肷�� BranchCd
     */
    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }

    /**
     * @param cmtTmpl
     *            ���M�R�����g
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * @param timestamp
     *            �^�C���X�^���v .
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
