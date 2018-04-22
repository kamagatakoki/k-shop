package jp.co.jreast.common.exceptions;

import jp.co.intage.framework.exception.SystemException;

/**
 * �A�v���P�[�V������O
 * 
 * <pre>
 *   �@�\�T�v �F �V�X�e����O�̎��s����O�łł��B
 *   ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class JresApplicationException extends RuntimeException {

    /** �o�[�W����ID */
    private static final long serialVersionUID = 1L;

    /**
     * �R���X�g���N�^
     */
    public JresApplicationException() {
        super(new SystemException());
    }

    /**
     * �R���X�g���N�^
     * 
     * @param key
     *            ���b�Z�[�WID
     */
    public JresApplicationException(String key) {
        super(new SystemException(key));
    }

    /**
     * �R���X�g���N�^
     * 
     * @param key
     *            ���b�Z�[�WID
     * @param args
     *            ���b�Z�[�W�u���p�����[�^
     */
    public JresApplicationException(String key, String[] args) {
        super(new SystemException(key, args));
    }

    /**
     * �R���X�g���N�^
     * 
     * @param key
     *            ���b�Z�[�WID
     * @param args
     *            ���b�Z�[�W�u���p�����[�^
     * @param cause
     *            ������O
     */
    public JresApplicationException(String key, String[] args, Throwable cause) {
        super(new SystemException(key, args, cause));
    }

    /**
     * �R���X�g���N�^
     * 
     * @param key
     *            ���b�Z�[�WID
     * @param cause
     *            ������O
     */
    public JresApplicationException(String key, Throwable cause) {
        super(new SystemException(key, cause));
    }

    /**
     * �R���X�g���N�^
     * 
     * @param cause
     *            ������O
     */
    public JresApplicationException(Throwable cause) {
        super(cause);
    }

}
