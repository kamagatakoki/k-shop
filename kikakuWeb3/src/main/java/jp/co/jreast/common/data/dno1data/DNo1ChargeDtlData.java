package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 *    NO1_料金表詳細（ゴルフ）データ。.
 *    機能概要    ：   NO1_料金表詳細（ゴルフ）データを格納する。
 *    特記事項    ：  無し
 * </pre>
 * 
 * @author 周安静
 * @version 0.1 2006/11/24
 */

public class DNo1ChargeDtlData extends PlanAnsBaseData {
	/** 料金シーケンス . */
	private String chargeSequence;

	/** パターン種別 . */
	private String pattern;

	/** 人員種別 . */
	private Integer manKind;

	/** パターン定員 . */
	private Integer capaPattern;

	/** グリーンフィ . */
	private String greenFee;

	/** 諸経費 . */
	private String overhead;

	/** キャディフィ . */
	private String caddieFee;

	/** カートフィ . */
	private String kartFee;

	/** ロッカーフィ . */
	private String lockerFee;

	/** 昼食代 . */
	private String lunchFee;

	/** 消費税 . */
	private String consumptionTax;

	/** 利用税 . */
	private String useTax;

	/** 合計販売額 . */
	private String totalAmount;

	/** 清算額 . */
	private String adjustedAmount;

	/** 手数料・消費税 . */
	private String commissionConsumptionTax;

	/** 現地予約料金 . */
	private String localBookCharge;

	/** ツーサム対応可能 . */
	private String twoSamFlg = JreConstants.FLG_FALSE;

	/**
	 * @return Returns the adjustedAmount.
	 */
	public String getAdjustedAmount() {
		return adjustedAmount;
	}

	/**
	 * @param adjustedAmount
	 *            The adjustedAmount to set.
	 */
	public void setAdjustedAmount(String adjustedAmount) {
		this.adjustedAmount = adjustedAmount;

	}

	/**
	 * @return Returns the caddieFee.
	 */
	public String getCaddieFee() {
		return caddieFee;
	}

	/**
	 * @param caddieFee
	 *            The caddieFee to set.
	 */
	public void setCaddieFee(String caddieFee) {
		this.caddieFee = caddieFee;
	}

	/**
	 * @return Returns the capaPattern.
	 */
	public Integer getCapaPattern() {
		return capaPattern;
	}

	/**
	 * @param capaPattern
	 *            The capaPattern to set.
	 */
	public void setCapaPattern(Integer capaPattern) {
		this.capaPattern = capaPattern;
	}

	/**
	 * @return Returns the chargeSequence.
	 */
	public String getChargeSequence() {
		return chargeSequence;
	}

	/**
	 * @param chargeSequence
	 *            The chargeSequence to set.
	 */
	public void setChargeSequence(String chargeSequence) {
		this.chargeSequence = chargeSequence;
	}

	/**
	 * @return Returns the commissionConsumptionTax.
	 */
	public String getCommissionConsumptionTax() {
		return commissionConsumptionTax;
	}

	/**
	 * @param commissionConsumptionTax
	 *            The commissionConsumptionTax to set.
	 */
	public void setCommissionConsumptionTax(String commissionConsumptionTax) {

		this.commissionConsumptionTax = commissionConsumptionTax;
	}

	/**
	 * @return Returns the greenFee.
	 */
	public String getGreenFee() {
		return greenFee;
	}

	/**
	 * @param greenFee
	 *            The greenFee to set.
	 */
	public void setGreenFee(String greenFee) {
		this.greenFee = greenFee;
	}

	/**
	 * @return Returns the kartFee.
	 */
	public String getKartFee() {
		return kartFee;
	}

	/**
	 * @param kartFee
	 *            The kartFee to set.
	 */
	public void setKartFee(String kartFee) {
		this.kartFee = kartFee;
	}

	/**
	 * @return Returns the localBookCharge.
	 */
	public String getLocalBookCharge() {
		return localBookCharge;
	}

	/**
	 * @param localBookCharge
	 *            The localBookCharge to set.
	 */
	public void setLocalBookCharge(String localBookCharge) {
		this.localBookCharge = localBookCharge;
	}

	/**
	 * @return Returns the lockerFee.
	 */
	public String getLockerFee() {
		return lockerFee;
	}

	/**
	 * @param lockerFee
	 *            The lockerFee to set.
	 */
	public void setLockerFee(String lockerFee) {
		this.lockerFee = lockerFee;
	}

	/**
	 * @return Returns the lunchFee.
	 */
	public String getLunchFee() {
		return lunchFee;
	}

	/**
	 * @param lunchFee
	 *            The lunchFee to set.
	 */
	public void setLunchFee(String lunchFee) {
		this.lunchFee = lunchFee;
	}

	/**
	 * @return Returns the manKind.
	 */
	public Integer getManKind() {
		return manKind;
	}

	/**
	 * @param manKind
	 *            The manKind to set.
	 */
	public void setManKind(Integer manKind) {
		this.manKind = manKind;
	}

	/**
	 * @return Returns the overhead.
	 */
	public String getOverhead() {
		return overhead;
	}

	/**
	 * @param overhead
	 *            The overhead to set.
	 */
	public void setOverhead(String overhead) {
		this.overhead = overhead;
	}

	/**
	 * @return Returns the pattern.
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern
	 *            The pattern to set.
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	/**
	 * @return Returns the totalAmount.
	 */
	public String getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount
	 *            The totalAmount to set.
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return Returns the twoSamFlg.
	 */
	public String getTwoSamFlg() {
		if (!JreConstants.FLG_TRUE.equals(twoSamFlg)) {
			return "";
		}
		return twoSamFlg;
	}

	/**
	 * @param twoSamFlg
	 *            The twoSamFlg to set.
	 */
	public void setTwoSamFlg(String twoSamFlg) {
		
		this.twoSamFlg = twoSamFlg;
	}

	/**
	 * @return Returns the useTax.
	 */
	public String getUseTax() {
		return useTax;
	}

	/**
	 * @param useTax
	 *            The useTax to set.
	 */
	public void setUseTax(String useTax) {
		this.useTax = useTax;
	}

	/**
	 * @return Returns the consumptionTax.
	 */
	public String getConsumptionTax() {
		return consumptionTax;
	}

	/**
	 * @param consumptionTax
	 *            The consumptionTax to set.
	 */
	public void setConsumptionTax(String consumptionTax) {
		this.consumptionTax = consumptionTax;
	}

}
