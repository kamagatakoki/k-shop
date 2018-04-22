package jp.co.jreast.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 設備種別 列挙型
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
public enum EquipmentKind {

    /** 館内にコンビニ有り */
    CONVENIENCE(11),

    /** フィットネス施設有り */
    FITNESS(7),

    /** ゲームコーナー有り */
    GAME_CORNER(2),

    /** 館内に売店あり */
    IN_HOUSE_STAND(17),

    /** インターネット接続ｻｰﾋﾞｽ有り */
    INTERNET(15),

    /** カラオケBOX有り */
    KARAOKE_BOX(1),

    /** ランドリーサービス */
    LAUNDRY_SERVICE(19),

    /** マッサージサービス */
    MASSAGE_SERVICE(21),

    /** 部屋に新聞サービス有り */
    NEWS(8),

    /** 駐車場（無料）有り */
    PARK_FREE(9),

    /** 駐車場（有料）有り */
    PARK_PAY(10),

    /** プール有り（屋内） */
    POOL_INDOOR(6),

    /** プール有り（屋外） */
    POOL_OUTSIDE(5),

    /** 加湿器貸し出し */
    RENTAL_HUMIDIFIER(22),

    /** 電気スタンド貸し出し */
    RENTAL_LAMP(23),

    /** 飲食施設 */
    RESTAURANT(18),

    /** ルームサービス */
    ROOM_SERVICE(20),

    /** SUICA利用可能施設有り */
    SUICA(14),

    /** 卓球台有り */
    TABLE_TENNIS(4),

    /** 貴館専用テニスコート有り */
    TENNIS_COURT(3),

    /** ズボンプレッサー有り */
    TROUSER_PRESS(13);

    /** 逆引きマップ */
    private static final Map<Integer, EquipmentKind> REVERESE_MAP;

    static {
        REVERESE_MAP = new HashMap<Integer, EquipmentKind>();
        for (EquipmentKind item : values()) {
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
    public static EquipmentKind codeOf(int code) {
        return REVERESE_MAP.get(code);
    }

    /** コード値 */
    private final int code;

    /**
     * コンストラクタ
     * 
     * @param equipmentKind
     *            設備種別
     */
    EquipmentKind(int equipmentKind) {
        this.code = equipmentKind;
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
