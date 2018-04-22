package jp.co.jreast.common.data;

import java.util.Date;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
/**
 * <pre>
 * �Ń}�X�^�f�[�^�N���X�B.
 * �@�\�T�v    �F  �Ńf�[�^���i�[���� .
 * ���L����    �F  ����
 * </pre>
 * @author ����
 * @version 0.1 2013/10/01
 */
public class TaxData implements InData, OutData {

	/**
	 * �ŋ敪 1:�����
	 */
	private String taxDivisionCd = null;
	
	/**
	 * �ŗ�
	 */
	private String taxRate = null;
	
	/**
	 * �K�p�J�n��
	 */
	private String fromYmd = null;
	
	/**
	 * �K�p�I����
	 */
	private String toYmd = null;
	
	/**
	 * �o�^��
	 */
	private Date createYmd = null;
	
	/**
	 * �X�V��
	 */
	private Date upYmd = null;

	/**
	 * �ŋ敪��ԋp����
	 * @return �ŋ敪
	 */
	public String getTaxDivisionCd() {
		return taxDivisionCd;
	}

	/**
	 * �ŋ敪��ݒ肷��
	 * @param taxDivisionCd
	 */
	public void setTaxDivisionCd(String taxDivisionCd) {
		this.taxDivisionCd = taxDivisionCd;
	}

	/**
	 * �ŗ���ԋp����
	 * @return �ŗ�
	 */
	public String getTaxRate() {
		return taxRate;
	}

	/**
	 * �ŗ���ݒ肷��
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
	 * �K�p�J�n����ԋp����
	 * @return �K�p�J�n��
	 */
	public String getFromYmd() {
		return fromYmd;
	}

	/**
	 * �K�p�J�n����ݒ肷��
	 * @param fromYmd
	 */
	public void setFromYmd(String fromYmd) {
		this.fromYmd = fromYmd;
	}

	/**
	 * �K�p�I������ԋp����
	 * @return �K�p�I����
	 */
	public String getToYmd() {
		return toYmd;
	}

	/**
	 * �K�p�I������ݒ肷��
	 * @param toYmd
	 */
	public void setToYmd(String toYmd) {
		this.toYmd = toYmd;
	}

	/**
	 * �o�^����ԋp����
	 * @return �o�^��
	 */
	public Date getCreateYmd() {
		return createYmd;
	}

	/**
	 * �o�^����ݒ肷��
	 * @param createYmd
	 */
	public void setCreateYmd(Date createYmd) {
		this.createYmd = createYmd;
	}

	/**
	 * �X�V����ԋp����
	 * @return �X�V��
	 */
	public Date getUpYmd() {
		return upYmd;
	}

	/**
	 * �X�V����ݒ肷��
	 * @param upYmd
	 */
	public void setUpYmd(Date upYmd) {
		this.upYmd = upYmd;
	}

}
