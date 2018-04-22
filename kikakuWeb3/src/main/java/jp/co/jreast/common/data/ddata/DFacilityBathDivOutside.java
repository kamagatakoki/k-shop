package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import jp.co.jreast.common.enums.BathDiv;
import jp.co.jreast.common.enums.BathKind;

/**
 * [DP/RM]施設_風呂・露天風呂 データ
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
public class DFacilityBathDivOutside {

    /** 風呂区分 : 露天風呂 */
    private static final Integer BATH_DIV = BathDiv.OUTSIDE.code();

    /** 女性専用のみ */
    private DFacilityBathHistory femaleOnly;

    /** 男女別 */
    private DFacilityBathHistory maleFemale;

    /** 男性専用のみ */
    private DFacilityBathHistory maleOnly;

    /** 備考 */
    private DFacilityBathHistory memo;

    /** 混浴 */
    private DFacilityBathHistory mixBath;

    /** 時間交替制 */
    private DFacilityBathHistory timeShift;

    /**
     * コンストラクタ
     */
    public DFacilityBathDivOutside() {
        super();
        this.maleFemale = new DFacilityBathHistory(BATH_DIV,
                BathKind.MALE_FEMALE.code());
        this.maleOnly = new DFacilityBathHistory(BATH_DIV,
                BathKind.MALE_ONLY.code());
        this.femaleOnly = new DFacilityBathHistory(BATH_DIV,
                BathKind.FEMALE_ONLY.code());
        this.timeShift = new DFacilityBathHistory(BATH_DIV,
                BathKind.TIME_SHIFT.code());
        this.mixBath = new DFacilityBathHistory(BATH_DIV,
                BathKind.MIX_BATH.code());
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
        case MALE_FEMALE:
            return getMaleFemale();
        case MALE_ONLY:
            return getMaleOnly();
        case FEMALE_ONLY:
            return getFemaleOnly();
        case TIME_SHIFT:
            return getTimeShift();
        case MIX_BATH:
            return getMixBath();
        case MEMO:
            return getMemo();
        default:
            return new DFacilityBathHistory(BATH_DIV, enm.code());
        }
    }

    /**
     * 女性専用のみを取得します。
     * 
     * @return 女性専用のみ
     */
    public DFacilityBathHistory getFemaleOnly() {
        return femaleOnly;
    }

    /**
     * 男女別を取得します。
     * 
     * @return 男女別
     */
    public DFacilityBathHistory getMaleFemale() {
        return maleFemale;
    }

    /**
     * 男性専用のみを取得します。
     * 
     * @return 男性専用のみ
     */
    public DFacilityBathHistory getMaleOnly() {
        return maleOnly;
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
     * 混浴を取得します。
     * 
     * @return 混浴
     */
    public DFacilityBathHistory getMixBath() {
        return mixBath;
    }

    /**
     * 時間交替制を取得します。
     * 
     * @return 時間交替制
     */
    public DFacilityBathHistory getTimeShift() {
        return timeShift;
    }

    /**
     * 女性専用のみを設定します。
     * 
     * @param femaleOnly
     *            女性専用のみ
     */
    public void setFemaleOnly(DFacilityBathHistory femaleOnly) {
        this.femaleOnly = femaleOnly;
    }

    /**
     * 男女別を設定します。
     * 
     * @param maleFemale
     *            男女別
     */
    public void setMaleFemale(DFacilityBathHistory maleFemale) {
        this.maleFemale = maleFemale;
    }

    /**
     * 男性専用のみを設定します。
     * 
     * @param maleOnly
     *            男性専用のみ
     */
    public void setMaleOnly(DFacilityBathHistory maleOnly) {
        this.maleOnly = maleOnly;
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
     * 混浴を設定します。
     * 
     * @param mixBath
     *            混浴
     */
    public void setMixBath(DFacilityBathHistory mixBath) {
        this.mixBath = mixBath;
    }

    /**
     * 時間交替制を設定します。
     * 
     * @param timeShift
     *            時間交替制
     */
    public void setTimeShift(DFacilityBathHistory timeShift) {
        this.timeShift = timeShift;
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

        list.add(maleFemale);
        list.add(maleOnly);
        list.add(femaleOnly);
        list.add(timeShift);
        list.add(mixBath);
        list.add(memo);

        return list;
    }

}
