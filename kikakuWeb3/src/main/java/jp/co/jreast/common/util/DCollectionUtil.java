package jp.co.jreast.common.util;

import java.util.List;

/**
 * コレクション操作に使用するユーティリティ
 * 
 * <pre>
 *   機能概要 ： 
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public final class DCollectionUtil {

    /**
     * Listの最初の要素を取得します。
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            リストの要素の型
     * @param list
     *            対象のList
     * @return 最初の要素
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
     * Listの最後の要素を取得します。
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            リストの要素の型
     * @param list
     *            対象のList
     * @return 最後の要素
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
     * コンストラクタ
     */
    private DCollectionUtil() {
    }

}
