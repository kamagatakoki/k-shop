package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.BathDiv;

/**
 * [DP/RM]施設_風呂 データ
 * 
 * <pre>
 *   機能概要 ：  施設付帯情報単位の全件分の情報を保持します。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityBathInfoData {

    /** 大浴場 */
    private DFacilityBathDivBathHouse bathHouse;

    /** 露天風呂 */
    private DFacilityBathDivOutside outside;

    /** 貸切露天風呂 */
    private DFacilityBathDivRentalOutsideSpa rentalOutsideSpa;

    /** 貸切風呂 */
    private DFacilityBathDivRentalSpa rentalSpa;

    /** サウナ */
    private DFacilityBathDivSauna sauna;

    /** 温泉 */
    private DFacilityBathDivSpa spa;

    /**
     * コンストラクタ
     */
    public DFacilityBathInfoData() {
        super();
        this.bathHouse = new DFacilityBathDivBathHouse();
        this.outside = new DFacilityBathDivOutside();
        this.rentalOutsideSpa = new DFacilityBathDivRentalOutsideSpa();
        this.rentalSpa = new DFacilityBathDivRentalSpa();
        this.sauna = new DFacilityBathDivSauna();
        this.spa = new DFacilityBathDivSpa();
    }

    /**
     * 「風呂区分」および「風呂種別」から施設_風呂を取得します。
     * 
     * <pre></pre>
     * 
     * @param bathDiv
     *            風呂区分
     * @param bathKind
     *            風呂種別
     * @return 施設_風呂
     */
    public DFacilityBathHistory getBath(Integer bathDiv, Integer bathKind) {

        BathDiv enm = BathDiv.codeOf(bathDiv);

        if (enm == null) {
            return new DFacilityBathHistory(bathDiv, bathKind);
        }

        switch (enm) {
        case SPA:
            return getSpa().getBath(bathKind);

        case OUTSIDE:
            return getOutside().getBath(bathKind);

        case BATH_HOUSE:
            return getBathHouse().getBath(bathKind);

        case RENTAL_OUTSIDE_SPA:
            return getRentalOutsideSpa().getBath(bathKind);

        case RENTAL_SPA:
            return getRentalSpa().getBath(bathKind);

        case SAUNA:
            return getSauna().getBath(bathKind);

        default:
            return new DFacilityBathHistory(enm.code(), bathKind);
        }
    }

    /**
     * 大浴場を取得します。
     * 
     * @return 大浴場
     */
    public DFacilityBathDivBathHouse getBathHouse() {
        return bathHouse;
    }

    /**
     * 露天風呂を取得します。
     * 
     * @return 露天風呂
     */
    public DFacilityBathDivOutside getOutside() {
        return outside;
    }

    /**
     * 貸切露天風呂を取得します。
     * 
     * @return 貸切露天風呂
     */
    public DFacilityBathDivRentalOutsideSpa getRentalOutsideSpa() {
        return rentalOutsideSpa;
    }

    /**
     * 貸切風呂を取得します。
     * 
     * @return 貸切風呂
     */
    public DFacilityBathDivRentalSpa getRentalSpa() {
        return rentalSpa;
    }

    /**
     * サウナを取得します。
     * 
     * @return サウナ
     */
    public DFacilityBathDivSauna getSauna() {
        return sauna;
    }

    /**
     * 温泉を取得します。
     * 
     * @return 温泉
     */
    public DFacilityBathDivSpa getSpa() {
        return spa;
    }

    /**
     * 大浴場を設定します。
     * 
     * @param bathHouse
     *            大浴場
     */
    public void setBathHouse(DFacilityBathDivBathHouse bathHouse) {
        this.bathHouse = bathHouse;
    }

    /**
     * 露天風呂を設定します。
     * 
     * @param outside
     *            露天風呂
     */
    public void setOutside(DFacilityBathDivOutside outside) {
        this.outside = outside;
    }

    /**
     * 貸切露天風呂を設定します。
     * 
     * @param rentalOutsideSpa
     *            貸切露天風呂
     */
    public void setRentalOutsideSpa(
            DFacilityBathDivRentalOutsideSpa rentalOutsideSpa) {
        this.rentalOutsideSpa = rentalOutsideSpa;
    }

    /**
     * 貸切風呂を設定します。
     * 
     * @param rentalSpa
     *            貸切風呂
     */
    public void setRentalSpa(DFacilityBathDivRentalSpa rentalSpa) {
        this.rentalSpa = rentalSpa;
    }

    /**
     * サウナを設定します。
     * 
     * @param sauna
     *            サウナ
     */
    public void setSauna(DFacilityBathDivSauna sauna) {
        this.sauna = sauna;
    }

    /**
     * 温泉を設定します。
     * 
     * @param spa
     *            温泉
     */
    public void setSpa(DFacilityBathDivSpa spa) {
        this.spa = spa;
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

        list.addAll(bathHouse.toList());
        list.addAll(outside.toList());
        list.addAll(rentalOutsideSpa.toList());
        list.addAll(rentalSpa.toList());
        list.addAll(sauna.toList());
        list.addAll(spa.toList());

        return list;
    }

}
