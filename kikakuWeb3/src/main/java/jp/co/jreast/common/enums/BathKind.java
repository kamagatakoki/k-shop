package jp.co.jreast.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * ���C��� �񋓌^
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
public enum BathKind {

    /** ������p�̂� */
    FEMALE_ONLY(4),

    /** �ݐؕ��C���� */
    HAS_RENTAL_SPA(7),

    /** ���򂠂� */
    HAS_SPA(1),

    /** �j���� */
    MALE_FEMALE(2),

    /** �j����p�̂� */
    MALE_ONLY(3),

    /** ���l */
    MEMO(8),

    /** ���� */
    MIX_BATH(6),

    /** ���Ԍ�֐� */
    TIME_SHIFT(5);

    /** �t�����}�b�v */
    private static final Map<Integer, BathKind> REVERESE_MAP;

    static {
        REVERESE_MAP = new HashMap<Integer, BathKind>();
        for (BathKind item : values()) {
            REVERESE_MAP.put(item.code(), item);
        }
    }

    /**
     * �R�[�h�l����񋓌^���擾���܂��B
     * 
     * <pre></pre>
     * 
     * @param code
     *            �R�[�h�l
     * @return �񋓌^
     */
    public static BathKind codeOf(int code) {
        return REVERESE_MAP.get(code);
    }

    /** �R�[�h�l */
    private final int code;

    /**
     * �R���X�g���N�^
     * 
     * @param bathKind
     *            ���C���
     */
    BathKind(int bathKind) {
        this.code = bathKind;
    }

    /**
     * �R�[�h�l���擾���܂��B
     * 
     * @return �R�[�h�l
     */
    public int code() {
        return code;
    }
}
