package jp.co.jreast.common.util;

import java.util.List;

/**
 * DAO用ユーティリティ
 * 
 * <pre>
 *   機能概要 ： DAO関連のユーティリティメソッドを実現するクラス。
 *   特記事項 ： DAO、DTOに対する汎用的な処理を実装する。
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public final class DaoUtils {

    /**
     * raw型のListを総称型Listにキャストします。
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            Listの総称型引数。戻り値を代入するListの総称型引数
     * @param rawList
     *            raw型のList
     * @return 総称型List
     */
    public static <E> List<E> castList(List<?> rawList) {
        @SuppressWarnings("unchecked")
        List<E> list = (List<E>) rawList;
        return list;
    }

    /**
     * Objectをキャストします。
     * 
     * <pre></pre>
     * 
     * @param <E>
     *            戻り値を代入する変数のクラス
     * @param object
     *            オブジェクト
     * @return 総称型List
     */
    public static <E> E castObject(Object object) {
        @SuppressWarnings("unchecked")
        E casted = (E) object;
        return casted;
    }

    /**
     * コンストラクタ
     */
    private DaoUtils() {
    }

}
