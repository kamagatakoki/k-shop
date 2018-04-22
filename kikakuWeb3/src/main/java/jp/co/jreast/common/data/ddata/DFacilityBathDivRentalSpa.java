package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.BathDiv;
import jp.co.jreast.common.enums.BathKind;

/**
 * [DP/RM]施設_風呂・貸切風呂 データ
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
public class DFacilityBathDivRentalSpa {

    /** 風呂区分 : 貸切風呂 */
    private static final Integer BATH_DIV = BathDiv.RENTAL_SPA.code();

    /** 貸切風呂あり */
    private DFacilityBathHistory data;

    /** 備考 */
    private DFacilityBathHistory memo;

    /**
     * コンストラクタ
     */
    public DFacilityBathDivRentalSpa() {
        super();
        this.data = new DFacilityBathHistory(BATH_DIV,
                BathKind.HAS_RENTAL_SPA.code());
        this.memo = new DFacilityBathHistory(BATH_DIV, BathKind.MEMO.code());
    }

    /**
     * 「風呂種別」から施設_風呂を取得します。
     * 
     * <pre></pre>
     * 
     * @param bathKind
     *            風呂種別
     * @return 施設_風呂
     */
    public DFacilityBathHistory getBath(int bathKind) {

        BathKind enm = BathKind.codeOf(bathKind);

        if (enm == null) {
            return new DFacilityBathHistory(BATH_DIV, bathKind);
        }

        switch (enm) {
        case HAS_RENTAL_SPA:
            return getData();
        case MEMO:
            return getMemo();
        default:
            return new DFacilityBathHistory(BATH_DIV, enm.code());
        }
    }

    /**
     * 貸切風呂ありを取得します。
     * 
     * @return 貸切風呂あり
     */
    public DFacilityBathHistory getData() {
        return data;
    }

    /**
     * 備考を取得します。
     * 
     * @return 備考
     */
    public DFacilityBathHistory getMemo() {
        return memo;
    }

    /**
     * 貸切風呂ありを設定します。
     * 
     * @param data
     *            貸切風呂あり
     */
    public void setData(DFacilityBathHistory data) {
        this.data = data;
    }

    /**
     * 備考を設定します。
     * 
     * @param memo
     *            備考
     */
    public void setMemo(DFacilityBathHistory memo) {
        this.memo = memo;
    }

    /**
     * 施設_風呂 データをListとして取得します。
     * 
     * <pre></pre>
     * 
     * @return 施設_風呂リスト
     */
    public List<DFacilityBathHistory> toList() {
        List<DFacilityBathHistory> list = new ArrayList<DFacilityBathHistory>();

        list.add(data);
        list.add(memo);

        return list;
    }

}
