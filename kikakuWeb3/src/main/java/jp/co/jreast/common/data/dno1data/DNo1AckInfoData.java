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
 * NO1_承認状況データクラス。.
 * 機能概要    ：  NO1_承認状況データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/11/17
 */
public final class DNo1AckInfoData extends PlanAnsBaseData implements InData, OutData {
	
	/**
	 * ユーザ区分.
	 */
	private Integer userDiv;
	
	/**
	 * シーケンス.
	 */
	private Integer sequence;
	
	/**
	 * 担当者.
	 */
	private String tantousya;
	
	/**
	 * 責任者.
	 */
	private String responsibler;
	
	/**
	 * 承認日付.
	 */
	private Date ackDate;

	/**
	 * @return 承認日付.
	 */
	public Date getAckDate() {
		return ackDate;
	}
	
	/**
	 * @param ackDate 承認日付	 
	 */
	public void setAckDateStr(final String ackDate) {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			this.ackDate = format.parse(ackDate);
		} catch (ParseException e) {			
			
		}
	}
	
	/**
	 * @return 承認日付
	 */
	public String getAckDateStr() {
		if (ackDate == null) {
			return "";
		}
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return format.format(ackDate);
	}

	/**
	 * @param ackDate 承認日付
	 */
	public void setAckDate(final Date ackDate) {
		this.ackDate = ackDate;
	}

	/**
	 * @return 責任者
	 */
	public String getResponsibler() {
		return responsibler;
	}

	/**
	 * @param responsibler 責任者
	 */
	public void setResponsibler(final String responsibler) {
		this.responsibler = responsibler;
	}

	/**
	 * @return シーケンス
	 */
	public Integer getSequence() {
		return sequence;
	}

	/**
	 * @param sequence シーケンス
	 */
	public void setSequence(final Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return 担当者
	 */
	public String getTantousya() {
		return tantousya;
	}

	/**
	 * @param tantousya 担当者
	 */
	public void setTantousya(final String tantousya) {
		this.tantousya = tantousya;
	}

	/**
	 * @return ユーザ区分
	 */
	public Integer getUserDiv() {
		return userDiv;
	}

	/**
	 * @param userDiv ユーザ区分
	 */
	public void setUserDiv(final Integer userDiv) {
		this.userDiv = userDiv;
	}
	
}
