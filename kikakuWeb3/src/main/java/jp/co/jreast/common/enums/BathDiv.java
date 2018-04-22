package jp.co.jreast.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 風呂区分 列挙型
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
public enum BathDiv {

    /** 大浴場 */
    BATH_HOUSE(3),

    /** 露天風呂 */
    OUTSIDE(2),

    /** 貸切露天風呂 */
    RENTAL_OUTSIDE_SPA(6),

    /** 貸切風呂 */
    RENTAL_SPA(5),

    /** サウナ */
    SAUNA(4),

    /** 温泉あり */
    SPA(1);

    /** 逆引きマップ */
    private static final Map<Integer, BathDiv> REVERESE_MAP;

    static {
        REVERESE_MAP = new HashMap<Integer, BathDiv>();
        for (BathDiv item : values()) {
            REVERESE_MAP.put(item.code(), item);
        }
    }

    /**
     * コード値から列挙型を取得します。
     * 
     * <pre></pre>
     * 
     * @param code
     *            コード値
     * @return 列挙型
     */
    public static BathDiv codeOf(int code) {
        return REVERESE_MAP.get(code);
    }

    /** コード値 */
    private final int code;

    /**
     * コンストラクタ
     * 
     * @param bathDiv
     *            風呂区分
     */
    BathDiv(int bathDiv) {
        this.code = bathDiv;
    }

    /**
     * コード値を取得します。
     * 
     * @return コード値
     */
    public int code() {
        return code;
    }

}
