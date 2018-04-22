package jp.co.jreast.common.data.dno1data;

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
public final class DNo1PlanNoBean extends PlanAnsBaseData implements InData {
    /**
     * 送付先.
     */
    private String ansSendAddr;

    /**
     * 施設コード .
     */
    private String facilityCd;

    /**
     * ＦＭ原価連携 .
     */
    private Integer fmCostRelateDiv;

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
     * 種類　.
     */
    private Character kind;

    /**
     * 企画通番（６社）
     */
    private String planNo6Off;

    /**
     * 企画通番（東日本）
     */
    private String planNoEJp;

    /**
     * メールコメントデータ .
     */
    private SendCmtData sendCmtData;

    /**
     * 送付区分.
     */
    private Integer sendDiv;

    /**
     * 状態
     */
    private Integer status;

    /**
     * ユーザID .
     */
    private String userId;

    /**
     * ユーザ名称 .
     */
    private String userNm;

    /**
     * @return 送付先.
     */
    public String getAnsSendAddr() {
        return ansSendAddr;
    }

    /**
     * 施設コード .を取得します。
     * 
     * @return 施設コード .
     */
    public final String getFacilityCd() {
        return facilityCd;
    }

    /**
     * ＦＭ原価連携 .を取得します。
     * 
     * @return ＦＭ原価連携 .
     */
    public final Integer getFmCostRelateDiv() {
        return fmCostRelateDiv;
    }

    /**
     * 采番フラグリスト .を取得します。
     * 
     * @return 采番フラグリスト .
     */
    public List getIsSaibanList() {
        return isSaibanList;
    }

    /**
     * @return the kind
     */
    public final Character getKind() {
        return kind;
    }

    /**
     * 企画通番（６社）を取得します。
     * 
     * @return 企画通番（６社）
     */
    public String getPlanNo6Off() {
        return planNo6Off;
    }

    /**
     * 企画通番（東日本）を取得します。
     * 
     * @return 企画通番（東日本）
     */
    public String getPlanNoEJp() {
        return planNoEJp;
    }

    /**
     * メールコメントデータ .を取得します。
     * 
     * @return メールコメントデータ .
     */
    public SendCmtData getSendCmtData() {
        return sendCmtData;
    }

    /**
     * @return 送付区分.
     */
    public Integer getSendDiv() {
        return sendDiv;
    }

    /**
     * 状態を取得します。
     * 
     * @return 状態
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ユーザID .を取得します。
     * 
     * @return ユーザID .
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザ名称 .を取得します。
     * 
     * @return ユーザ名称 .
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * 6社タイプか.を取得します。
     * 
     * @return 6社タイプか.
     */
    public final boolean isJr6RoomType() {
        return isJr6RoomType;
    }

    /**
     * @param ansSendAddr
     *            送付先
     */
    public void setAnsSendAddr(String ansSendAddr) {
        this.ansSendAddr = ansSendAddr;
    }

    /**
     * 施設コード .を設定します。
     * 
     * @param facilityCd
     *            施設コード .
     */
    public final void setFacilityCd(final String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * ＦＭ原価連携 .を設定します。
     * 
     * @param fmCostRelateDiv
     *            ＦＭ原価連携 .
     */
    public final void setFmCostRelateDiv(final Integer fmCostRelateDiv) {
        this.fmCostRelateDiv = fmCostRelateDiv;
    }

    /**
     * 采番フラグリスト .を設定します。
     * 
     * @param isSaibanList
     *            采番フラグリスト .
     */
    public void setIsSaibanList(List isSaibanList) {
        this.isSaibanList = isSaibanList;
    }

    /**
     * 6社タイプか.を設定します。
     * 
     * @param isJr6RoomType
     *            6社タイプか.
     */
    public final void setJr6RoomType(final boolean isJr6RoomType) {
        this.isJr6RoomType = isJr6RoomType;
    }

    /**
     * @param kind
     *            the kind to set
     */
    public final void setKind(final Character kind) {
        this.kind = kind;
    }

    /**
     * 企画通番（６社）を設定します。
     * 
     * @param planNo6Off
     *            企画通番（６社）
     */
    public void setPlanNo6Off(String planNo6Off) {
        this.planNo6Off = planNo6Off;
    }

    /**
     * 企画通番（東日本）を設定します。
     * 
     * @param planNoEJp
     *            企画通番（東日本）
     */
    public void setPlanNoEJp(String planNoEJp) {
        this.planNoEJp = planNoEJp;
    }

    /**
     * メールコメントデータ .を設定します。
     * 
     * @param sendCmtData
     *            メールコメントデータ .
     */
    public void setSendCmtData(SendCmtData sendCmtData) {
        this.sendCmtData = sendCmtData;
    }

    /**
     * @param sendDiv
     *            .
     */
    public void setSendDiv(Integer sendDiv) {
        this.sendDiv = sendDiv;
    }

    /**
     * 状態を設定します。
     * 
     * @param status
     *            状態
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ユーザID .を設定します。
     * 
     * @param userId
     *            ユーザID .
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ユーザ名称 .を設定します。
     * 
     * @param userNm
     *            ユーザ名称 .
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    /**
     * Returns a string containing the characters in this sequence in the same
     * order as this sequence. The length of the string will be the length of
     * this sequence.
     * 
     * @return a string consisting of exactly this sequence of characters
     */
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer(128);

        s.append("planAnsNo=").append(getPlanAnsNo()).append(";");
        s.append("careerNo=").append(getCareerNo()).append(";");
        s.append("fmCostRelateDiv=").append(fmCostRelateDiv).append(";");
        s.append("kind=").append(kind).append(";");
        s.append("facilityCd=").append(facilityCd).append(";");

        return s.toString();
    }

}
