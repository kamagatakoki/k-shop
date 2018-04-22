package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * 料金情報データクラス。.
 * 機能概要    ：  料金情報データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhouch
 * @version 0.1 2006/11/17
 */
public class No1ChargeInfoData extends PlanAnsBaseData {

	/**
	 * 料金シーケンス.
	 */
	private Integer chargeSequence;

	/**
	 * 企画通番.
	 */
	private String planNo;

	/**
	 * 枝番.
	 */
	private String branchNo;

	/**
	 * 在庫番号 .
	 */
	private String stockNo;

	/**
	 * 船車内容区分.
	 */
	private String contentDiv;

	/**
	 * 観光コース名称(カナ） .
	 */
	private String courseNmKana;

	/**
	 * 観光コース名称（漢字）.
	 */
	private String courseNmKanji;

	/**
	 * 内容説明上段（カナ）.
	 */
	private String contentExplain1Kana;

	/**
	 * 内容説明上段（漢字）.
	 */
	private String contentExplain1Kanji;

	/**
	 * 内容説明下段（カナ）.
	 */
	private String contentExplain2Kana;

	/**
	 * 内容説明下段（漢字）.
	 */
	private String contentExplain2Kanji;

	/**
	 * 采番フラグ .
	 */
	private boolean isSaiban;
	
	/**
	 * @return Returns the branchNo.
	 */
	public String getBranchNo() {
		return branchNo;
	}

	/**
	 * @param branchNo
	 *            The branchNo to set.
	 */
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	/**
	 * @return Returns the chargeSequence.
	 */
	public Integer getChargeSequence() {
		return chargeSequence;
	}

	/**
	 * @param chargeSequence
	 *            The chargeSequence to set.
	 */
	public void setChargeSequence(Integer chargeSequence) {
		this.chargeSequence = chargeSequence;
	}

	/**
	 * @return Returns the contentExplain1Kana.
	 */
	public String getContentExplain1Kana() {
		if (contentExplain1Kana == null) {
			return "";
		}
		return contentExplain1Kana;
	}

	/**
	 * @param contentExplain1Kana
	 *            The contentExplain1Kana to set.
	 */
	public void setContentExplain1Kana(String contentExplain1Kana) {
		this.contentExplain1Kana = contentExplain1Kana;
	}

	/**
	 * @return Returns the contentExplain1Kanji.
	 */
	public String getContentExplain1Kanji() {
		if (contentExplain1Kanji == null) {
			return "";
		}
		return contentExplain1Kanji;
	}

	/**
	 * @param contentExplain1Kanji
	 *            The contentExplain1Kanji to set.
	 */
	public void setContentExplain1Kanji(String contentExplain1Kanji) {
		this.contentExplain1Kanji = contentExplain1Kanji;
	}

	/**
	 * @return Returns the contentExplain2Kana.
	 */
	public String getContentExplain2Kana() {
		if (contentExplain2Kana == null) {
			return "";
		}
		return contentExplain2Kana;
	}

	/**
	 * @param contentExplain2Kana
	 *            The contentExplain2Kana to set.
	 */
	public void setContentExplain2Kana(String contentExplain2Kana) {
		
		this.contentExplain2Kana = contentExplain2Kana;
	}

	/**
	 * @return Returns the contentExplain2Kanji.
	 */
	public String getContentExplain2Kanji() {
		if (contentExplain2Kanji == null) {
			return "";
		}
		return contentExplain2Kanji;
	}

	/**
	 * @param contentExplain2Kanji
	 *            The contentExplain2Kanji to set.
	 */
	public void setContentExplain2Kanji(String contentExplain2Kanji) {
		this.contentExplain2Kanji = contentExplain2Kanji;
	}

	/**
	 * @return Returns the contentDiv.
	 */
	public String getContentDiv() {
		return contentDiv;
	}

	/**
	 * @param contentDiv
	 *            The contentDiv to set.
	 */
	public void setContentDiv(String contentDiv) {
		this.contentDiv = contentDiv;
	}

	/**
	 * @return Returns the planNo.
	 */
	public String getPlanNo() {
		return planNo;
	}

	/**
	 * @param planNo
	 *            The planNo to set.
	 */
	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	/**
	 * @return Returns the stockNo.
	 */
	public String getStockNo() {
		return stockNo;
	}

	/**
	 * @param stockNo
	 *            The stockNo to set.
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}

	/**
	 * @return Returns the courseNmKana.
	 */
	public String getCourseNmKana() {
		if (courseNmKana == null) {
			return "";
		}
		return courseNmKana;
	}

	/**
	 * @param courseNmKana
	 *            The courseNmKana to set.
	 */
	public void setCourseNmKana(String courseNmKana) {
		this.courseNmKana = courseNmKana;
	}

	/**
	 * @return Returns the courseNmKanji.
	 */
	public String getCourseNmKanji() {
		if (courseNmKanji == null) {
			return "";
		}
		return courseNmKanji;
	}

	/**
	 * @param courseNmKanji
	 *            The courseNmKanji to set.
	 */
	public void setCourseNmKanji(String courseNmKanji) {
		this.courseNmKanji = courseNmKanji;
	}

	/**
	 * @param i .
	 * @return 企画通番（東日本）文字
	 */
	public String getCharOfPlanNo(int i) {
		return getCharAt(planNo, i);
	}

	/**
	 * . 指定位置に文字を取得する。
	 * 
	 * @param pos
	 *            位置
	 * @param str
	 *            入力文字列
	 * @return 指定する文字
	 */
	private String getCharAt(String str, int pos) {

		if (StringUtil.isEmpty(str)) {
			return "";
		}
		return "" + str.charAt(pos - 1);
	}

	/**
	 * @return Returns the isSaiban.
	 */
	public boolean getIsSaiban() {
		return isSaiban;
	}

	/**
	 * @param isSaiban The isSaiban to set.
	 */
	public void setIsSaiban(boolean isSaiban) {
		this.isSaiban = isSaiban;
	}


}
