package jp.co.jreast.common.data.no1data;
import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * ���񓚏������X�V�p�f�[�^�N���X�B.
 * �@�\�T�v    �F  ���񓚏������X�V�p�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu
 * @version 0.1 2006/10/27
 */
public final class No1PlanAnsBean extends PlanAnsBaseData implements InData, OutData {
	/**
	 * �폜�t���O .
	 */
	private String delFlg = JreConstants.FLG_FALSE;
	
	/**
	 * JR���F�t���O .
	 */
	private String jrAdimtFlg = JreConstants.FLG_FALSE;
	
	/**
	 * ���єԃt���O�@.
	 */
	private String planNoPickUpFlg = JreConstants.FLG_FALSE;
	
	/**
	 * ���i�����ς݃t���O .
	 */
	private String createGoodsFlg = JreConstants.FLG_FALSE;
	
	/**
	 * �݌ɋ敪 .
	 */
	private Integer stockDiv;
	
	/**
	 * ���.
	 */
	private Integer status;
	
	/**
	 * �e�l�����A�g.
	 */
	private Integer fmCostRelateDiv;
	
	/**
	 * ���ʔԁi�����{�j.
	 */
	private String planNoEJp;

	/**
	 * ���ʔԁi�U�Ёj.
	 */
	private String planNo6Off;
	
	/**
	 * ���[�UID.
	 */
	private String userId;

	/**
	 * ���[�U����.
	 */
	private String userNm;
	
	/**
	 * ����t���O�@.
	 */
	private boolean isOverFlow;
	
	/**
	 * ���ʔԃ��X�g�@.
	 */
	private List planNoList;
	
	/**
	 * @return the planNo6Off
	 */
	public final String getPlanNo6Off() {
		return planNo6Off;
	}

	/**
	 * @param planNo6Off the planNo6Off to set
	 */
	public final void setPlanNo6Off(final String planNo6Off) {
		this.planNo6Off = planNo6Off;
	}

	/**
	 * @return the planNoEJp
	 */
	public final String getPlanNoEJp() {
		return planNoEJp;
	}

	/**
	 * @param planNoEJp the planNoEJp to set
	 */
	public final void setPlanNoEJp(final String planNoEJp) {
		this.planNoEJp = planNoEJp;
	}
	
	/**
	 * 
	 * @return �폜�t���O
	 */
	public String getDelFlg() {
		return delFlg;
	}

	/**
	 * 
	 * @param delFlg �폜�t���O
	 */
	public void setDelFlg(final String delFlg) {
		this.delFlg = delFlg;
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
	 * @return the status
	 */
	public final Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public final void setStatus(final Integer status) {
		this.status = status;
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
	 * @return .
	 */
	public String getJrAdimtFlg() {
		return jrAdimtFlg;
	}

	/**
	 * 
	 * @param jrAdimtFlg .
	 */
	public void setJrAdimtFlg(String jrAdimtFlg) {
		this.jrAdimtFlg = jrAdimtFlg;
	}

	/**
	 * 
	 * @return .
	 */
	public boolean isOverFlow() {
		return isOverFlow;
	}

	/**
	 * 
	 * @param isOverFlow .
	 */
	public void setOverFlow(boolean isOverFlow) {
		this.isOverFlow = isOverFlow;
	}

	/**
	 * 
	 * @return .
	 */
	public List getPlanNoList() {
		return planNoList;
	}

	/**
	 * 
	 * @param planNoList .
	 */
	public void setPlanNoList(List planNoList) {
		this.planNoList = planNoList;
	}

	/**
	 * 
	 * @return .
	 */
	public String getCreateGoodsFlg() {
		return createGoodsFlg;
	}

	/**
	 * 
	 * @param createGoodsFlg .
	 */
	public void setCreateGoodsFlg(String createGoodsFlg) {
		this.createGoodsFlg = createGoodsFlg;
	}

	/**
	 * 
	 * @return .
	 */
	public Integer getStockDiv() {
		return stockDiv;
	}

	/**
	 * 
	 * @param stockDiv .
	 */
	public void setStockDiv(Integer stockDiv) {
		this.stockDiv = stockDiv;
	}

	/**
	 * 
	 * @return .
	 */
	public String getPlanNoPickUpFlg() {
		return planNoPickUpFlg;
	}

	/**
	 * 
	 * @param planNoPickUpFlg .
	 */
	public void setPlanNoPickUpFlg(String planNoPickUpFlg) {
		this.planNoPickUpFlg = planNoPickUpFlg;
	}
	/**
	 * No1���.
	 */
	private Integer no1Status;
	/**
	 * 
	 * @return No1���
	 */
	public Integer getNo1Status() {
		return no1Status;
	}
	/**
	 * 
	 * @param no1Status No1���
	 */
	public void setNo1Status(Integer no1Status) {
		this.no1Status = no1Status;
	}
	
	/**
	 * ���t�S���Җ�.(�`�F�b�N��)
	 */
	private String senderNm;

	/**
	 * 
	 * @return ���t�S���Җ�(�`�F�b�N��)
	 */
	public String getSenderNm() {
		return senderNm;
	}

	/**
	 * 
	 * @param senderNm ���t�S���Җ�(�`�F�b�N��)
	 */
	public void setSenderNm(String senderNm) {
		this.senderNm = senderNm;
	}
	
	/**
	 * ���t�A����d�b.
	 */
	private String senderTel;
	
	/**
	 * 
	 * @return ���t�A����d�b
	 */
	public String getSenderTel() {
		return senderTel;
	}
	
	/**
	 * 
	 * @param senderTel ���t�A����d�b
	 */
	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}
	
	/**.
	 * �A����Fax
	 */
	private String senderFax;
	
	/**
	 * 
	 * @return �A����Fax
	 */
	public String getSenderFax() {
		return senderFax;
	}
	
	/**
	 * 
	 * @param senderFax �A����Fax
	 */
	public void setSenderFax(String senderFax) {
		this.senderFax = senderFax;
	}
}
