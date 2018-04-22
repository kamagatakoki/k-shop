package jp.co.jreast.common.util;

import java.util.List;

/**
 * �R���N�V��������Ɏg�p���郆�[�e�B���e�B
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
public final class DCollectionUtil {

    /**
     * List�̍ŏ��̗v�f���擾���܂��B
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            ���X�g�̗v�f�̌^
     * @param list
     *            �Ώۂ�List
     * @return �ŏ��̗v�f
     */
    public static <E> E getFirst(List<E> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /**
     * List�̍Ō�̗v�f���擾���܂��B
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            ���X�g�̗v�f�̌^
     * @param list
     *            �Ώۂ�List
     * @return �Ō�̗v�f
     */
    public static <E> E getLast(List<E> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /**
     * �R���X�g���N�^
     */
    private DCollectionUtil() {
    }

}
