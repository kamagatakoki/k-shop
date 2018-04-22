package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_料金表データクラス。.
 * 機能概要    ：  NO1_料金表データを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1ChargeTblData extends PlanAnsBaseData {
    /**
     * .
     * 金額（仕入額） .
     */
    private Integer amount;

    /**
     * .
     * 金額（販売額）.
     */
    private Integer amountHanbai;

    /**
     * .
     * パターン定員 .
     */
    private Integer capaPattern;

    /**
     * 料金シーケンス .
     */
    private String chargeSequence;

    /**
     * .
     * 人員種別 .
     */
    private Integer manKind;

    /**
     * 提供料金
     */
    private Integer offerCharge;

    /**
     * 乗捨料金
     */
    private Integer oneWayCharge;

    /**
     * パターン種別 .
     */
    private String pattern;

    /**
     * 東京都宿泊税
     */
    private Integer tyoStayTax;

    /**
     * @return 金額
     */
    public Integer getAmount() {
        return amount;
    }

    //------ 販売額追加 加藤-------------------------------
    /**
     * @return 販売額
     */
    public Integer getAmountHanbai() {
        return amountHanbai;
    }

    /**
     * @return パターン定員
     */
    public Integer getCapaPattern() {
        return capaPattern;
    }

    /**
     * @return 料金シーケンス
     */
    public String getChargeSequence() {
        return chargeSequence;
    }

    /**
     * @return 人員種別
     */
    public Integer getManKind() {
        return manKind;
    }

    /**
     * 提供料金を取得します。
     * 
     * @return 提供料金
     */
    public Integer getOfferCharge() {
        return offerCharge;
    }

    /**
     * 乗捨料金を取得します。
     * 
     * @return 乗捨料金
     */
    public Integer getOneWayCharge() {
        return oneWayCharge;
    }

    /**
     * @return パターン種別
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 東京都宿泊税を取得します。
     * 
     * @return 東京都宿泊税
     */
    public Integer getTyoStayTax() {
        return tyoStayTax;
    }

    /**
     * @param amount
     *            金額
     */
    public void setAmount(final Integer amount) {
        this.amount = amount;
    }

    /**
     * @param amountHanbai
     *            販売額
     */
    public void setAmountHanbai(Integer amountHanbai) {
        this.amountHanbai = amountHanbai;
    }

    /**
     * @param capaPattern
     *            パターン定員
     */
    public void setCapaPattern(final Integer capaPattern) {
        this.capaPattern = capaPattern;
    }

    //-----------------------------------------------------

    /**
     * @param chargeSequence
     *            料金シーケンス
     */
    public void setChargeSequence(String chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    /**
     * @param manKind
     *            人員種別
     */
    public void setManKind(final Integer manKind) {
        this.manKind = manKind;
    }

    /**
     * 提供料金を設定します。
     * 
     * @param offerCharge
     *            提供料金
     */
    public void setOfferCharge(Integer offerCharge) {
        this.offerCharge = offerCharge;
    }

    /**
     * 乗捨料金を設定します。
     * 
     * @param oneWayCharge
     *            乗捨料金
     */
    public void setOneWayCharge(Integer oneWayCharge) {
        this.oneWayCharge = oneWayCharge;
    }

    /**
     * @param pattern
     *            パターン種別
     */
    public void setPattern(final String pattern) {
        this.pattern = pattern;
    }

    /**
     * 東京都宿泊税を設定します。
     * 
     * @param tyoStayTax
     *            東京都宿泊税
     */
    public void setTyoStayTax(Integer tyoStayTax) {
        this.tyoStayTax = tyoStayTax;
    }

}
