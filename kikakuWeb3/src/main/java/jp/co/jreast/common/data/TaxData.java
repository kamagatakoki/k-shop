package jp.co.jreast.common.data;

import java.util.Date;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
/**
 * <pre>
 * 税マスタデータクラス。.
 * 機能概要    ：  税データを格納する .
 * 特記事項    ：  無し
 * </pre>
 * @author 郷道
 * @version 0.1 2013/10/01
 */
public class TaxData implements InData, OutData {

	/**
	 * 税区分 1:消費税
	 */
	private String taxDivisionCd = null;
	
	/**
	 * 税率
	 */
	private String taxRate = null;
	
	/**
	 * 適用開始日
	 */
	private String fromYmd = null;
	
	/**
	 * 適用終了日
	 */
	private String toYmd = null;
	
	/**
	 * 登録日
	 */
	private Date createYmd = null;
	
	/**
	 * 更新日
	 */
	private Date upYmd = null;

	/**
	 * 税区分を返却する
	 * @return 税区分
	 */
	public String getTaxDivisionCd() {
		return taxDivisionCd;
	}

	/**
	 * 税区分を設定する
	 * @param taxDivisionCd
	 */
	public void setTaxDivisionCd(String taxDivisionCd) {
		this.taxDivisionCd = taxDivisionCd;
	}

	/**
	 * 税率を返却する
	 * @return 税率
	 */
	public String getTaxRate() {
		return taxRate;
	}

	/**
	 * 税率を設定する
	 * @param taxRate
	 */
	public void setTaxRate(String taxRate) {
		if (taxRate != null) {
			this.taxRate = taxRate.trim();
			return;
		}
		this.taxRate = taxRate;
	}

	/**
	 * 適用開始日を返却する
	 * @return 適用開始日
	 */
	public String getFromYmd() {
		return fromYmd;
	}

	/**
	 * 適用開始日を設定する
	 * @param fromYmd
	 */
	public void setFromYmd(String fromYmd) {
		this.fromYmd = fromYmd;
	}

	/**
	 * 適用終了日を返却する
	 * @return 適用終了日
	 */
	public String getToYmd() {
		return toYmd;
	}

	/**
	 * 適用終了日を設定する
	 * @param toYmd
	 */
	public void setToYmd(String toYmd) {
		this.toYmd = toYmd;
	}

	/**
	 * 登録日を返却する
	 * @return 登録日
	 */
	public Date getCreateYmd() {
		return createYmd;
	}

	/**
	 * 登録日を設定する
	 * @param createYmd
	 */
	public void setCreateYmd(Date createYmd) {
		this.createYmd = createYmd;
	}

	/**
	 * 更新日を返却する
	 * @return 更新日
	 */
	public Date getUpYmd() {
		return upYmd;
	}

	/**
	 * 更新日を設定する
	 * @param upYmd
	 */
	public void setUpYmd(Date upYmd) {
		this.upYmd = upYmd;
	}

}
