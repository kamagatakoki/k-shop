package jp.co.jreast.common.data.no1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_�����\�f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1_�����\�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1ChargeTblData extends PlanAnsBaseData {
	/**
	 * �p�^�[����� .
	 */
	private String pattern;
	
	/**
	 * �����V�[�P���X .
	 */
	private String chargeSequence;

	/**.
	 * �l����� .
	 */
	private Integer manKind;

	/**.
	 * �p�^�[����� .
	 */
	private Integer capaPattern;

	/**.
	 * ���z�i�d���z�j .
	 */
	private Integer amount;
	
	/**.
	 * ���z�i�̔��z�j.
	 */
	private Integer amountHanbai;

	/**
	 * @return ���z
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * @param amount ���z
	 */
	public void setAmount(final Integer amount) {
		this.amount = amount;
	}

	/**
	 * @return �p�^�[�����
	 */
	public Integer getCapaPattern() {
		return capaPattern;
	}

	/**
	 * @param capaPattern �p�^�[�����
	 */
	public void setCapaPattern(final Integer capaPattern) {
		this.capaPattern = capaPattern;
	}

	/**
	 * @return �l�����
	 */
	public Integer getManKind() {
		return manKind;
	}

	/**
	 * @param manKind �l�����
	 */
	public void setManKind(final Integer manKind) {
		this.manKind = manKind;
	}

	/**
	 * @return �p�^�[�����
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern �p�^�[�����
	 */
	public void setPattern(final String pattern) {
		this.pattern = pattern;
	}

	/**
	 * 
	 * @return �����V�[�P���X
	 */
	public String getChargeSequence() {
		return chargeSequence;
	}

	/**
	 * 
	 * @param chargeSequence �����V�[�P���X
	 */
	public void setChargeSequence(String chargeSequence) {
		this.chargeSequence = chargeSequence;
	}

	//------ �̔��z�ǉ� ����-------------------------------
	/**
	 * @return �̔��z
	 */
	public Integer getAmountHanbai() {
		return amountHanbai;
	}

	/**
	 * @param amountHanbai �̔��z
	 */
	public void setAmountHanbai(Integer amountHanbai) {
		this.amountHanbai = amountHanbai;
	}
	//-----------------------------------------------------
	
}
