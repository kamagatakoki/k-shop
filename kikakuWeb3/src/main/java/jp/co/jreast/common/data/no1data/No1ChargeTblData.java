package jp.co.jreast.common.data.no1data;

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
public final class No1ChargeTblData extends PlanAnsBaseData {
	/**
	 * パターン種別 .
	 */
	private String pattern;
	
	/**
	 * 料金シーケンス .
	 */
	private String chargeSequence;

	/**.
	 * 人員種別 .
	 */
	private Integer manKind;

	/**.
	 * パターン定員 .
	 */
	private Integer capaPattern;

	/**.
	 * 金額（仕入額） .
	 */
	private Integer amount;
	
	/**.
	 * 金額（販売額）.
	 */
	private Integer amountHanbai;

	/**
	 * @return 金額
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * @param amount 金額
	 */
	public void setAmount(final Integer amount) {
		this.amount = amount;
	}

	/**
	 * @return パターン定員
	 */
	public Integer getCapaPattern() {
		return capaPattern;
	}

	/**
	 * @param capaPattern パターン定員
	 */
	public void setCapaPattern(final Integer capaPattern) {
		this.capaPattern = capaPattern;
	}

	/**
	 * @return 人員種別
	 */
	public Integer getManKind() {
		return manKind;
	}

	/**
	 * @param manKind 人員種別
	 */
	public void setManKind(final Integer manKind) {
		this.manKind = manKind;
	}

	/**
	 * @return パターン種別
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern パターン種別
	 */
	public void setPattern(final String pattern) {
		this.pattern = pattern;
	}

	/**
	 * 
	 * @return 料金シーケンス
	 */
	public String getChargeSequence() {
		return chargeSequence;
	}

	/**
	 * 
	 * @param chargeSequence 料金シーケンス
	 */
	public void setChargeSequence(String chargeSequence) {
		this.chargeSequence = chargeSequence;
	}

	//------ 販売額追加 加藤-------------------------------
	/**
	 * @return 販売額
	 */
	public Integer getAmountHanbai() {
		return amountHanbai;
	}

	/**
	 * @param amountHanbai 販売額
	 */
	public void setAmountHanbai(Integer amountHanbai) {
		this.amountHanbai = amountHanbai;
	}
	//-----------------------------------------------------
	
}
