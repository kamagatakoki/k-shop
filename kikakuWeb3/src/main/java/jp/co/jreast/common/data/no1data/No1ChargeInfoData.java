package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * �������f�[�^�N���X�B.
 * �@�\�T�v    �F  �������f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhouch
 * @version 0.1 2006/11/17
 */
public class No1ChargeInfoData extends PlanAnsBaseData {

	/**
	 * �����V�[�P���X.
	 */
	private Integer chargeSequence;

	/**
	 * ���ʔ�.
	 */
	private String planNo;

	/**
	 * �}��.
	 */
	private String branchNo;

	/**
	 * �݌ɔԍ� .
	 */
	private String stockNo;

	/**
	 * �D�ԓ��e�敪.
	 */
	private String contentDiv;

	/**
	 * �ό��R�[�X����(�J�i�j .
	 */
	private String courseNmKana;

	/**
	 * �ό��R�[�X���́i�����j.
	 */
	private String courseNmKanji;

	/**
	 * ���e������i�i�J�i�j.
	 */
	private String contentExplain1Kana;

	/**
	 * ���e������i�i�����j.
	 */
	private String contentExplain1Kanji;

	/**
	 * ���e�������i�i�J�i�j.
	 */
	private String contentExplain2Kana;

	/**
	 * ���e�������i�i�����j.
	 */
	private String contentExplain2Kanji;

	/**
	 * �єԃt���O .
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
	 * @return ���ʔԁi�����{�j����
	 */
	public String getCharOfPlanNo(int i) {
		return getCharAt(planNo, i);
	}

	/**
	 * . �w��ʒu�ɕ������擾����B
	 * 
	 * @param pos
	 *            �ʒu
	 * @param str
	 *            ���͕�����
	 * @return �w�肷�镶��
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
