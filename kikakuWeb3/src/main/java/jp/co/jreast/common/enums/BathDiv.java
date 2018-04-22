package jp.co.jreast.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * ���C�敪 �񋓌^
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
public enum BathDiv {

    /** �嗁�� */
    BATH_HOUSE(3),

    /** �I�V���C */
    OUTSIDE(2),

    /** �ݐؘI�V���C */
    RENTAL_OUTSIDE_SPA(6),

    /** �ݐؕ��C */
    RENTAL_SPA(5),

    /** �T�E�i */
    SAUNA(4),

    /** ���򂠂� */
    SPA(1);

    /** �t�����}�b�v */
    private static final Map<Integer, BathDiv> REVERESE_MAP;

    static {
        REVERESE_MAP = new HashMap<Integer, BathDiv>();
        for (BathDiv item : values()) {
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
    public static BathDiv codeOf(int code) {
        return REVERESE_MAP.get(code);
    }

    /** �R�[�h�l */
    private final int code;

    /**
     * �R���X�g���N�^
     * 
     * @param bathDiv
     *            ���C�敪
     */
    BathDiv(int bathDiv) {
        this.code = bathDiv;
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
