package jp.co.jreast.common.data.webapi;

import java.util.Date;

/**
 * <pre>
 * SSOID�}�b�s���O�f�[�^�N���X
 * �@�\�T�v    �F  SSOID�}�b�s���O�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public class MSsoMapping {

    /** �e�[�u���� */
    public static final String TABLE = "M_SSO_MAPPING";

    /**
     * �쐬�N����.
     */
    private Date createYmd;

    /**
     * SSOID.
     */
    private String ssoId;

    /**
     * ���[�U�[ID.
     */
    private String userId;

    /**
     * �쐬�N����.���擾���܂��B
     * @return �쐬�N����.
     */
    public Date getCreateYmd() {
        return createYmd;
    }

    /**
     * �쐬�N����.��ݒ肵�܂��B
     * @param createYmd �쐬�N����.
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * SSOID.���擾���܂��B
     * @return SSOID.
     */
    public String getSsoId() {
        return ssoId;
    }

    /**
     * SSOID.��ݒ肵�܂��B
     * @param ssoId SSOID.
     */
    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    /**
     * ���[�U�[ID.���擾���܂��B
     * @return ���[�U�[ID.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�U�[ID.��ݒ肵�܂��B
     * @param userId ���[�U�[ID.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
