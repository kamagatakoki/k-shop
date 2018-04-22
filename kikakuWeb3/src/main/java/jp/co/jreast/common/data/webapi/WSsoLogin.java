package jp.co.jreast.common.data.webapi;

import java.util.Date;

/**
 * <pre>
 * SSOID�F�؈ꎞ�f�[�^�N���X
 * �@�\�T�v    �F  SSOID�F�؃f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public class WSsoLogin {

    /** �e�[�u���� */
    public static final String TABLE = "W_SSO_LOGIN";

    /**
     * �쐬�N����.
     */
    private Date createYmd;

    /**
     * �����^�C���g�[�N��.
     */
    private String oneTimeToken;

    /**
     * SSOID.
     */
    private String ssoId;

    /**
     * SSO�g�[�N��.
     */
    private String ssoToken;

    /**
     * �X�V�N����.
     */
    private Date upYmd;

    /**
     * �쐬�N����.���擾���܂��B
     * 
     * @return �쐬�N����.
     */
    public Date getCreateYmd() {
        return createYmd;
    }

    /**
     * �����^�C���g�[�N��.���擾���܂��B
     * 
     * @return �����^�C���g�[�N��.
     */
    public String getOneTimeToken() {
        return oneTimeToken;
    }

    /**
     * SSOID.���擾���܂��B
     * 
     * @return SSOID.
     */
    public String getSsoId() {
        return ssoId;
    }

    /**
     * SSO�g�[�N��.���擾���܂��B
     * 
     * @return SSO�g�[�N��.
     */
    public String getSsoToken() {
        return ssoToken;
    }

    /**
     * �X�V�N����.���擾���܂��B
     * 
     * @return �X�V�N����.
     */
    public Date getUpYmd() {
        return upYmd;
    }

    /**
     * �쐬�N����.��ݒ肵�܂��B
     * 
     * @param createYmd
     *            �쐬�N����.
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * �����^�C���g�[�N��.��ݒ肵�܂��B
     * 
     * @param oneTimeToken
     *            �����^�C���g�[�N��.
     */
    public void setOneTimeToken(String oneTimeToken) {
        this.oneTimeToken = oneTimeToken;
    }

    /**
     * SSOID.��ݒ肵�܂��B
     * 
     * @param ssoId
     *            SSOID.
     */
    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    /**
     * SSO�g�[�N��.��ݒ肵�܂��B
     * 
     * @param ssoToken
     *            SSO�g�[�N��.
     */
    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    /**
     * �X�V�N����.��ݒ肵�܂��B
     * 
     * @param upYmd
     *            �X�V�N����.
     */
    public void setUpYmd(Date upYmd) {
        this.upYmd = upYmd;
    }

}
