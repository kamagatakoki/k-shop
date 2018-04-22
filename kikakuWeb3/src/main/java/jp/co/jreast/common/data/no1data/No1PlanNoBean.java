package jp.co.jreast.common.data.no1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.ur00400.data.SendCmtData;

/**
 * <pre>
 * FM���M�p�f�[�^�N���X�B.
 * �@�\�T�v    �F  FM���M�p�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu
 * @version 0.1 2006/10/27
 */
public final class No1PlanNoBean extends PlanAnsBaseData implements InData {
	/**
	 * ���t��.
	 */
	private String ansSendAddr;
	/**
	 * �e�l�����A�g .
	 */
	private Integer fmCostRelateDiv;
	
	/**
	 * ��ށ@.
	 */
	private Character kind;
	
	/**
	 * �{�݃R�[�h .
	 */
	private String facilityCd;
	
	/**
	 * ���[�UID .
	 */
	private String userId;

	/**
	 * ���[�U���� .
	 */
	private String userNm;
	
	/**
	 * ���[���R�����g�f�[�^ .
	 */
	private SendCmtData sendCmtData;
	
	/**
	 * ���t�敪.
	 */
	private Integer sendDiv;
	
	/**
	 * 6�Ѓ^�C�v��.
	 */
	private boolean isJr6RoomType = false;
	
	/**
	 * �єԃt���O���X�g .
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
	 * @return ���[�UID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId ���[�UID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return ���[�U����
	 */
	public String getUserNm() {
		return userNm;
	}

	/**
	 * 
	 * @param userNm ���[�U����
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	/**
	 * 
	 * @return  ���[���R�����g�f�[�^.
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
	 * @return ���t�敪.
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
	 * @return �єԃt���O���X�g .
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
	 * @return ���t��.
	 */
	public String getAnsSendAddr() {
		return ansSendAddr;
	}
	/**
	 * 
	 * @param ansSendAddr ���t��
	 */
	public void setAnsSendAddr(String ansSendAddr) {
		this.ansSendAddr = ansSendAddr;
	}
	
}
