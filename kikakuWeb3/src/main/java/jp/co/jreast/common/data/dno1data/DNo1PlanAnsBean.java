package jp.co.jreast.common.data.dno1data;

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
public final class DNo1PlanAnsBean extends PlanAnsBaseData implements InData,
        OutData {

    /**
     * 商品造成済みフラグ .
     */
    private String createGoodsFlg = JreConstants.FLG_FALSE;

    /**
     * 削除フラグ .
     */
    private String delFlg = JreConstants.FLG_FALSE;

    /**
     * ＦＭ原価連携.
     */
    private Integer fmCostRelateDiv;

    /**
     * 溢れるフラグ　.
     */
    private boolean isOverFlow;

    /**
     * JR承認フラグ .
     */
    private String jrAdimtFlg = JreConstants.FLG_FALSE;

    /**
     * 種別
     */
    private String kindFlg;

    /**
     * No1状態.
     */
    private Integer no1Status;

    /**
     * No2状態
     */
    private Integer no2Status;

    /**
     * 企画通番（６社）.
     */
    private String planNo6Off;

    /**
     * 企画通番（東日本）.
     */
    private String planNoEJp;

    /**
     * 企画通番リスト　.
     */
    private List planNoList;

    /**
     * 企画采番フラグ　.
     */
    private String planNoPickUpFlg = JreConstants.FLG_FALSE;

    /**
     * .
     * 連絡先Fax
     */
    private String senderFax;

    /**
     * 送付担当者名.(チェック欄)
     */
    private String senderNm;

    /**
     * 送付連絡先電話.
     */
    private String senderTel;

    /**
     * 状態.
     */
    private Integer status;

    /**
     * 在庫区分 .
     */
    private Integer stockDiv;

    /**
     * ユーザID.
     */
    private String userId;

    /**
     * ユーザ名称.
     */
    private String userNm;

    /**
     * @return .
     */
    public String getCreateGoodsFlg() {
        return createGoodsFlg;
    }

    /**
     * @return 削除フラグ
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * @return the fmCostRelateDiv
     */
    public final Integer getFmCostRelateDiv() {
        return fmCostRelateDiv;
    }

    /**
     * @return .
     */
    public String getJrAdimtFlg() {
        return jrAdimtFlg;
    }

    /**
     * 種別を取得します。
     * 
     * @return 種別
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * @return No1状態
     */
    public Integer getNo1Status() {
        return no1Status;
    }

    /**
     * No2状態を取得します。
     * 
     * @return No2状態
     */
    public Integer getNo2Status() {
        return no2Status;
    }

    /**
     * @return the planNo6Off
     */
    public final String getPlanNo6Off() {
        return planNo6Off;
    }

    /**
     * @return the planNoEJp
     */
    public final String getPlanNoEJp() {
        return planNoEJp;
    }

    /**
     * @return .
     */
    public List getPlanNoList() {
        return planNoList;
    }

    /**
     * @return .
     */
    public String getPlanNoPickUpFlg() {
        return planNoPickUpFlg;
    }

    /**
     * @return 連絡先Fax
     */
    public String getSenderFax() {
        return senderFax;
    }

    /**
     * @return 送付担当者名(チェック欄)
     */
    public String getSenderNm() {
        return senderNm;
    }

    /**
     * @return 送付連絡先電話
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * @return the status
     */
    public final Integer getStatus() {
        return status;
    }

    /**
     * @return .
     */
    public Integer getStockDiv() {
        return stockDiv;
    }

    /**
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return ユーザ名称
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * @return .
     */
    public boolean isOverFlow() {
        return isOverFlow;
    }

    /**
     * @param createGoodsFlg
     *            .
     */
    public void setCreateGoodsFlg(String createGoodsFlg) {
        this.createGoodsFlg = createGoodsFlg;
    }

    /**
     * @param delFlg
     *            削除フラグ
     */
    public void setDelFlg(final String delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * @param fmCostRelateDiv
     *            the status to set
     */
    public final void setFmCostRelateDiv(final Integer fmCostRelateDiv) {
        this.fmCostRelateDiv = fmCostRelateDiv;
    }

    /**
     * @param jrAdimtFlg
     *            .
     */
    public void setJrAdimtFlg(String jrAdimtFlg) {
        this.jrAdimtFlg = jrAdimtFlg;
    }

    /**
     * 種別を設定します。
     * 
     * @param kindFlg
     *            種別
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * @param no1Status
     *            No1状態
     */
    public void setNo1Status(Integer no1Status) {
        this.no1Status = no1Status;
    }

    /**
     * No2状態を設定します。
     * 
     * @param no2Status
     *            No2状態
     */
    public void setNo2Status(Integer no2Status) {
        this.no2Status = no2Status;
    }

    /**
     * @param isOverFlow
     *            .
     */
    public void setOverFlow(boolean isOverFlow) {
        this.isOverFlow = isOverFlow;
    }

    /**
     * @param planNo6Off
     *            the planNo6Off to set
     */
    public final void setPlanNo6Off(final String planNo6Off) {
        this.planNo6Off = planNo6Off;
    }

    /**
     * @param planNoEJp
     *            the planNoEJp to set
     */
    public final void setPlanNoEJp(final String planNoEJp) {
        this.planNoEJp = planNoEJp;
    }

    /**
     * @param planNoList
     *            .
     */
    public void setPlanNoList(List planNoList) {
        this.planNoList = planNoList;
    }

    /**
     * @param planNoPickUpFlg
     *            .
     */
    public void setPlanNoPickUpFlg(String planNoPickUpFlg) {
        this.planNoPickUpFlg = planNoPickUpFlg;
    }

    /**
     * @param senderFax
     *            連絡先Fax
     */
    public void setSenderFax(String senderFax) {
        this.senderFax = senderFax;
    }

    /**
     * @param senderNm
     *            送付担当者名(チェック欄)
     */
    public void setSenderNm(String senderNm) {
        this.senderNm = senderNm;
    }

    /**
     * @param senderTel
     *            送付連絡先電話
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    /**
     * @param status
     *            the status to set
     */
    public final void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * @param stockDiv
     *            .
     */
    public void setStockDiv(Integer stockDiv) {
        this.stockDiv = stockDiv;
    }

    /**
     * @param userId
     *            ユーザID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @param userNm
     *            ユーザ名称
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }
}
