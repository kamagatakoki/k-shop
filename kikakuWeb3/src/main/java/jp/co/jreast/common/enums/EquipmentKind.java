package jp.co.jreast.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * �ݔ���� �񋓌^
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
public enum EquipmentKind {

    /** �ٓ��ɃR���r�j�L�� */
    CONVENIENCE(11),

    /** �t�B�b�g�l�X�{�ݗL�� */
    FITNESS(7),

    /** �Q�[���R�[�i�[�L�� */
    GAME_CORNER(2),

    /** �ٓ��ɔ��X���� */
    IN_HOUSE_STAND(17),

    /** �C���^�[�l�b�g�ڑ����޽�L�� */
    INTERNET(15),

    /** �J���I�PBOX�L�� */
    KARAOKE_BOX(1),

    /** �����h���[�T�[�r�X */
    LAUNDRY_SERVICE(19),

    /** �}�b�T�[�W�T�[�r�X */
    MASSAGE_SERVICE(21),

    /** �����ɐV���T�[�r�X�L�� */
    NEWS(8),

    /** ���ԏ�i�����j�L�� */
    PARK_FREE(9),

    /** ���ԏ�i�L���j�L�� */
    PARK_PAY(10),

    /** �v�[���L��i�����j */
    POOL_INDOOR(6),

    /** �v�[���L��i���O�j */
    POOL_OUTSIDE(5),

    /** ������݂��o�� */
    RENTAL_HUMIDIFIER(22),

    /** �d�C�X�^���h�݂��o�� */
    RENTAL_LAMP(23),

    /** ���H�{�� */
    RESTAURANT(18),

    /** ���[���T�[�r�X */
    ROOM_SERVICE(20),

    /** SUICA���p�\�{�ݗL�� */
    SUICA(14),

    /** �싅��L�� */
    TABLE_TENNIS(4),

    /** �M�ِ�p�e�j�X�R�[�g�L�� */
    TENNIS_COURT(3),

    /** �Y�{���v���b�T�[�L�� */
    TROUSER_PRESS(13);

    /** �t�����}�b�v */
    private static final Map<Integer, EquipmentKind> REVERESE_MAP;

    static {
        REVERESE_MAP = new HashMap<Integer, EquipmentKind>();
        for (EquipmentKind item : values()) {
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
    public static EquipmentKind codeOf(int code) {
        return REVERESE_MAP.get(code);
    }

    /** �R�[�h�l */
    private final int code;

    /**
     * �R���X�g���N�^
     * 
     * @param equipmentKind
     *            �ݔ����
     */
    EquipmentKind(int equipmentKind) {
        this.code = equipmentKind;
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
