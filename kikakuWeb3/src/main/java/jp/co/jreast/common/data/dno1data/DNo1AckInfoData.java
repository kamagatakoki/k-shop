package jp.co.jreast.common.data.dno1data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_���F�󋵃f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1_���F�󋵃f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/11/17
 */
public final class DNo1AckInfoData extends PlanAnsBaseData implements InData, OutData {
	
	/**
	 * ���[�U�敪.
	 */
	private Integer userDiv;
	
	/**
	 * �V�[�P���X.
	 */
	private Integer sequence;
	
	/**
	 * �S����.
	 */
	private String tantousya;
	
	/**
	 * �ӔC��.
	 */
	private String responsibler;
	
	/**
	 * ���F���t.
	 */
	private Date ackDate;

	/**
	 * @return ���F���t.
	 */
	public Date getAckDate() {
		return ackDate;
	}
	
	/**
	 * @param ackDate ���F���t	 
	 */
	public void setAckDateStr(final String ackDate) {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			this.ackDate = format.parse(ackDate);
		} catch (ParseException e) {			
			
		}
	}
	
	/**
	 * @return ���F���t
	 */
	public String getAckDateStr() {
		if (ackDate == null) {
			return "";
		}
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return format.format(ackDate);
	}

	/**
	 * @param ackDate ���F���t
	 */
	public void setAckDate(final Date ackDate) {
		this.ackDate = ackDate;
	}

	/**
	 * @return �ӔC��
	 */
	public String getResponsibler() {
		return responsibler;
	}

	/**
	 * @param responsibler �ӔC��
	 */
	public void setResponsibler(final String responsibler) {
		this.responsibler = responsibler;
	}

	/**
	 * @return �V�[�P���X
	 */
	public Integer getSequence() {
		return sequence;
	}

	/**
	 * @param sequence �V�[�P���X
	 */
	public void setSequence(final Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return �S����
	 */
	public String getTantousya() {
		return tantousya;
	}

	/**
	 * @param tantousya �S����
	 */
	public void setTantousya(final String tantousya) {
		this.tantousya = tantousya;
	}

	/**
	 * @return ���[�U�敪
	 */
	public Integer getUserDiv() {
		return userDiv;
	}

	/**
	 * @param userDiv ���[�U�敪
	 */
	public void setUserDiv(final Integer userDiv) {
		this.userDiv = userDiv;
	}
	
}
