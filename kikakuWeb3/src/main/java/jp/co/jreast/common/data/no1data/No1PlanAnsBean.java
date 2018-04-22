package jp.co.jreast.common.data.no1data;
import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * 企画回答書だけ更新用データクラス。.
 * 機能概要    ：  企画回答書だけ更新用データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu
 * @version 0.1 2006/10/27
 */
public final class No1PlanAnsBean extends PlanAnsBaseData implements InData, OutData {
	/**
	 * 削除フラグ .
	 */
	private String delFlg = JreConstants.FLG_FALSE;
	
	/**
	 * JR承認フラグ .
	 */
	private String jrAdimtFlg = JreConstants.FLG_FALSE;
	
	/**
	 * 企画采番フラグ　.
	 */
	private String planNoPickUpFlg = JreConstants.FLG_FALSE;
	
	/**
	 * 商品造成済みフラグ .
	 */
	private String createGoodsFlg = JreConstants.FLG_FALSE;
	
	/**
	 * 在庫区分 .
	 */
	private Integer stockDiv;
	
	/**
	 * 状態.
	 */
	private Integer status;
	
	/**
	 * ＦＭ原価連携.
	 */
	private Integer fmCostRelateDiv;
	
	/**
	 * 企画通番（東日本）.
	 */
	private String planNoEJp;

	/**
	 * 企画通番（６社）.
	 */
	private String planNo6Off;
	
	/**
	 * ユーザID.
	 */
	private String userId;

	/**
	 * ユーザ名称.
	 */
	private String userNm;
	
	/**
	 * 溢れるフラグ　.
	 */
	private boolean isOverFlow;
	
	/**
	 * 企画通番リスト　.
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
	 * @return 削除フラグ
	 */
	public String getDelFlg() {
		return delFlg;
	}

	/**
	 * 
	 * @param delFlg 削除フラグ
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
	 * No1状態.
	 */
	private Integer no1Status;
	/**
	 * 
	 * @return No1状態
	 */
	public Integer getNo1Status() {
		return no1Status;
	}
	/**
	 * 
	 * @param no1Status No1状態
	 */
	public void setNo1Status(Integer no1Status) {
		this.no1Status = no1Status;
	}
	
	/**
	 * 送付担当者名.(チェック欄)
	 */
	private String senderNm;

	/**
	 * 
	 * @return 送付担当者名(チェック欄)
	 */
	public String getSenderNm() {
		return senderNm;
	}

	/**
	 * 
	 * @param senderNm 送付担当者名(チェック欄)
	 */
	public void setSenderNm(String senderNm) {
		this.senderNm = senderNm;
	}
	
	/**
	 * 送付連絡先電話.
	 */
	private String senderTel;
	
	/**
	 * 
	 * @return 送付連絡先電話
	 */
	public String getSenderTel() {
		return senderTel;
	}
	
	/**
	 * 
	 * @param senderTel 送付連絡先電話
	 */
	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}
	
	/**.
	 * 連絡先Fax
	 */
	private String senderFax;
	
	/**
	 * 
	 * @return 連絡先Fax
	 */
	public String getSenderFax() {
		return senderFax;
	}
	
	/**
	 * 
	 * @param senderFax 連絡先Fax
	 */
	public void setSenderFax(String senderFax) {
		this.senderFax = senderFax;
	}
}
