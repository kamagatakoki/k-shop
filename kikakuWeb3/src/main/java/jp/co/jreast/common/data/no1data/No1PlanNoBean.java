package jp.co.jreast.common.data.no1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.ur00400.data.SendCmtData;

/**
 * <pre>
 * FM送信用データクラス。.
 * 機能概要    ：  FM送信用データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu
 * @version 0.1 2006/10/27
 */
public final class No1PlanNoBean extends PlanAnsBaseData implements InData {
	/**
	 * 送付先.
	 */
	private String ansSendAddr;
	/**
	 * ＦＭ原価連携 .
	 */
	private Integer fmCostRelateDiv;
	
	/**
	 * 種類　.
	 */
	private Character kind;
	
	/**
	 * 施設コード .
	 */
	private String facilityCd;
	
	/**
	 * ユーザID .
	 */
	private String userId;

	/**
	 * ユーザ名称 .
	 */
	private String userNm;
	
	/**
	 * メールコメントデータ .
	 */
	private SendCmtData sendCmtData;
	
	/**
	 * 送付区分.
	 */
	private Integer sendDiv;
	
	/**
	 * 6社タイプか.
	 */
	private boolean isJr6RoomType = false;
	
	/**
	 * 采番フラグリスト .
	 * Boolean
	 */
	private List isSaibanList;

	/**
	 * @return the facilityCd
	 */
	public final String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * @param facilityCd the facilityCd to set
	 */
	public final void setFacilityCd(final String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * @return the fmCostRelateDiv
	 */
	public final Integer getFmCostRelateDiv() {
		return fmCostRelateDiv;
	}

	/**
	 * @param fmCostRelateDiv the status to set
	 */
	public final void setFmCostRelateDiv(final Integer fmCostRelateDiv) {
		this.fmCostRelateDiv = fmCostRelateDiv;
	}

	/**
	 * @return the kind
	 */
	public final Character getKind() {
		return kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public final void setKind(final Character kind) {
		this.kind = kind;
	}
	/**
     * Returns a string containing the characters in this sequence in the same
     * order as this sequence.  The length of the string will be the length of
     * this sequence. 
     *
     * @return  a string consisting of exactly this sequence of characters
     */
	public String toString() {
		StringBuffer s = new StringBuffer(128);
		
		s.append("planAnsNo=").append(getPlanAnsNo()).append(";");
		s.append("careerNo=").append(getCareerNo()).append(";");
		s.append("fmCostRelateDiv=").append(fmCostRelateDiv).append(";");
		s.append("kind=").append(kind).append(";");
		s.append("facilityCd=").append(facilityCd).append(";");
		
		return s.toString();
	}

	/**
	 * @return the isJr6RoomType
	 */
	public final boolean isJr6RoomType() {
		return isJr6RoomType;
	}

	/**
	 * @param isJr6RoomType the isJr6RoomType to set
	 */
	public final void setJr6RoomType(final boolean isJr6RoomType) {
		this.isJr6RoomType = isJr6RoomType;
	}
	
	/**
	 * 
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return ユーザ名称
	 */
	public String getUserNm() {
		return userNm;
	}

	/**
	 * 
	 * @param userNm ユーザ名称
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	/**
	 * 
	 * @return  メールコメントデータ.
	 */
	public SendCmtData getSendCmtData() {
		return sendCmtData;
	}

	/**
	 * 
	 * @param sendCmtData .
	 */
	public void setSendCmtData(SendCmtData sendCmtData) {
		this.sendCmtData = sendCmtData;
	}

	/**
	 * 
	 * @return 送付区分.
	 */
	public Integer getSendDiv() {
		return sendDiv;
	}

	/**
	 * 
	 * @param sendDiv .
	 */
	public void setSendDiv(Integer sendDiv) {
		this.sendDiv = sendDiv;
	}

	/**
	 * 
	 * @return 采番フラグリスト .
	 */
	public List getIsSaibanList() {
		return isSaibanList;
	}

	/**
	 * 
	 * @param isSaibanList .
	 */
	public void setIsSaibanList(List isSaibanList) {
		this.isSaibanList = isSaibanList;
	}
	/**
	 * 
	 * @return 送付先.
	 */
	public String getAnsSendAddr() {
		return ansSendAddr;
	}
	/**
	 * 
	 * @param ansSendAddr 送付先
	 */
	public void setAnsSendAddr(String ansSendAddr) {
		this.ansSendAddr = ansSendAddr;
	}
	
}
