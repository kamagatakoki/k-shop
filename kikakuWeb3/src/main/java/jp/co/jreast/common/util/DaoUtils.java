package jp.co.jreast.common.util;

import java.util.List;

/**
 * DAO�p���[�e�B���e�B
 * 
 * <pre>
 *   �@�\�T�v �F DAO�֘A�̃��[�e�B���e�B���\�b�h����������N���X�B
 *   ���L���� �F DAO�ADTO�ɑ΂���ėp�I�ȏ�������������B
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public final class DaoUtils {

    /**
     * raw�^��List�𑍏̌^List�ɃL���X�g���܂��B
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            List�̑��̌^�����B�߂�l��������List�̑��̌^����
     * @param rawList
     *            raw�^��List
     * @return ���̌^List
     */
    public static <E> List<E> castList(List<?> rawList) {
        @SuppressWarnings("unchecked")
        List<E> list = (List<E>) rawList;
        return list;
    }

    /**
     * Object���L���X�g���܂��B
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            �߂�l��������ϐ��̃N���X
     * @param object
     *            �I�u�W�F�N�g
     * @return ���̌^List
     */
    public static <E> E castObject(Object object) {
        @SuppressWarnings("unchecked")
        E casted = (E) object;
        return casted;
    }

    /**
     * �R���X�g���N�^
     */
    private DaoUtils() {
    }

}
