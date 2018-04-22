package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.data.ddata.DPlanAnsFacility;
import jp.co.jreast.common.data.no1data.No1BusinessCheckBean;

/**
 * <pre>
 * [DP/RM]NO1_承認入力データクラス。.
 * 機能概要    ：  [DP/RM]NO1_承認入力データを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1AdmitBean implements InData {

    /**
     * NO1_承認状況(Faxの場合、施設の承認状況).
     */
    private DNo1AckInfoData ackInfoFacilityData;

    /**
     * .
     * 検索条件.
     */
    private AnsSearchData ansSearchData;

    /**
     * チェックbean.
     */
    private No1BusinessCheckBean businessCheckBean;

    /**
     * 料金単位区分
     */
    private String chargeDiv;

    /**
     * 企画回答書_施設情報
     */
    private DPlanAnsFacility dPlanAnsFacility;

    /**
     * .
     * 企画回答書データ.
     */
    private DNo1FormBean formData;

    /**
     * 備考.
     */
    private MemoData memo;

    /**
     * NO1_承認状況.
     */
    private DNo1AckInfoData no1AckInfoData;

    /**
     * NO2状態
     */
    private Integer no2Status;

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
     * ユーザデータ.
     */
    private UserData userData;

    /**
     * @return NO1_承認状況(Faxの場合、施設の承認状況).
     */
    public DNo1AckInfoData getAckInfoFacilityData() {
        return ackInfoFacilityData;
    }

    /**
     * @return 検索条件
     */
    public AnsSearchData getAnsSearchData() {
        return ansSearchData;
    }

    /**
     * @return businessCheckBean
     */
    public No1BusinessCheckBean getBusinessCheckBean() {
        return businessCheckBean;
    }

    /**
     * 企画回答書_施設情報を取得します。
     * 
     * @return 企画回答書_施設情報
     */
    public DPlanAnsFacility getDPlanAnsFacility() {
        return dPlanAnsFacility;
    }

    /**
     * 料金単位区分を取得します。
     * @return 料金単位区分
     */
    public String getChargeDiv() {
        return chargeDiv;
    }

    /**
     * 料金単位区分を設定します。
     * @param chargeDiv 料金単位区分
     */
    public void setChargeDiv(String chargeDiv) {
        this.chargeDiv = chargeDiv;
    }

    /**
     * @return [DP/RM]企画回答書データ.
     */
    public final DNo1FormBean getFormData() {
        return formData;
    }

    /**
     * @return 種別
     */
    public String getKindFlg() {
        return this.getAnsSearchData().getKindFlg();
    }

    /**
     * @return the memo
     */
    public final MemoData getMemo() {
        return memo;
    }

    /**
     * @return NO1_承認状況.
     */
    public final DNo1AckInfoData getNo1AckInfoData() {
        return no1AckInfoData;
    }

    /**
     * NO2状態を取得します。
     * 
     * @return NO2状態
     */
    public Integer getNo2Status() {
        return no2Status;
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
     * @return the userData
     */
    public final UserData getUserData() {
        return userData;
    }

    /**
     * @param ackInfoFacilityData
     *            NO1_承認状況(Faxの場合、施設の承認状況).
     */
    public void setAckInfoFacilityData(DNo1AckInfoData ackInfoFacilityData) {
        this.ackInfoFacilityData = ackInfoFacilityData;
    }

    /**
     * @param ansSearchData
     *            検索条件
     */
    public void setAnsSearchData(final AnsSearchData ansSearchData) {
        this.ansSearchData = ansSearchData;
    }

    /**
     * @param businessCheckBean
     *            businessCheckBean
     */
    public void setBusinessCheckBean(No1BusinessCheckBean businessCheckBean) {
        this.businessCheckBean = businessCheckBean;
    }

    /**
     * 企画回答書_施設情報を設定します。
     * 
     * @param dPlanAnsFacility
     *            企画回答書_施設情報
     */
    public void setDPlanAnsFacility(DPlanAnsFacility dPlanAnsFacility) {
        this.dPlanAnsFacility = dPlanAnsFacility;
    }

    /**
     * @param formData
     *            [DP/RM]企画回答書データ.
     */
    public final void setFormData(final DNo1FormBean formData) {
        this.formData = formData;
    }

    /**
     * @param memo
     *            the memo to set
     */
    public final void setMemo(final MemoData memo) {
        this.memo = memo;
    }

    /**
     * @param no1AckInfoData
     *            NO1_承認状況.
     */
    public final void setNo1AckInfoData(final DNo1AckInfoData no1AckInfoData) {
        this.no1AckInfoData = no1AckInfoData;
    }

    /**
     * NO2状態を設定します。
     * 
     * @param no2Status
     *            NO2状態
     */
    public void setNo2Status(Integer no2Status) {
        this.no2Status = no2Status;
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
    public final void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @param userData
     *            the userData to set
     */
    public final void setUserData(final UserData userData) {
        this.userData = userData;
    }
}
