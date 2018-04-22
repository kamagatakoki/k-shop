package jp.co.jreast.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 風呂種別 列挙型
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
public enum BathKind {

    /** 女性専用のみ */
    FEMALE_ONLY(4),

    /** 貸切風呂あり */
    HAS_RENTAL_SPA(7),

    /** 温泉あり */
    HAS_SPA(1),

    /** 男女別 */
    MALE_FEMALE(2),

    /** 男性専用のみ */
    MALE_ONLY(3),

    /** 備考 */
    MEMO(8),

    /** 混浴 */
    MIX_BATH(6),

    /** 時間交替制 */
    TIME_SHIFT(5);

    /** 逆引きマップ */
    private static final Map<Integer, BathKind> REVERESE_MAP;

    static {
        REVERESE_MAP = new HashMap<Integer, BathKind>();
        for (BathKind item : values()) {
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
    public static BathKind codeOf(int code) {
        return REVERESE_MAP.get(code);
    }

    /** コード値 */
    private final int code;

    /**
     * コンストラクタ
     * 
     * @param bathKind
     *            風呂種別
     */
    BathKind(int bathKind) {
        this.code = bathKind;
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
