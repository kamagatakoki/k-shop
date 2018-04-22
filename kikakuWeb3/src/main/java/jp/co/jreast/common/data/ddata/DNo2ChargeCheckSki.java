package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 15 09:35:44 JST 2014
 */

/**
 * DNo2ChargeCheckSki.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/15 keiken Generated.
 */
public class DNo2ChargeCheckSki {

    /** テーブル名：[DP/RM]NO2_料金確認スキー */
    public static final String TABLE = "D_NO2_CHARGE_CHECK_SKI";

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * チェックイン後_預かり場所
     */
    private String checkInAfterKeep;

    /**
     * チェックイン後_預かり料金
     */
    private String checkInAfterKeepCharge;

    /**
     * チェックイン前_預かり場所
     */
    private String checkInBeforeKeep;

    /**
     * チェックイン前_預かり料金
     */
    private String checkInBeforeKeepCharge;

    /**
     * 子供料金
     */
    private String childFees;

    /**
     * 子供料金特記欄
     */
    private String childFeesSpCmt;

    /**
     * 子供料金にバイキング代含む
     */
    private String childFeesVk;

    /**
     * 子供無料年齢From
     */
    private String childFreeAgeFrom;

    /**
     * 子供無料年齢To
     */
    private String childFreeAgeTo;

    /**
     * 子供料金有無
     */
    private String childFreeFlg;

    /**
     * 子供有料年齢From
     */
    private String childPayAgeFrom;

    /**
     * 子供有料年齢To
     */
    private String childPayAgeTo;

    /**
     * 子供バイキング料金朝食
     */
    private String childVkChareBreakfast;

    /**
     * 子供バイキング料金夕食
     */
    private String childVkChareDinner;

    /**
     * 子供バイキング有無
     */
    private String childVkFlg;

    /**
     * 子供バイキング無料年齢From
     */
    private String childVkFreeAgeFrom;

    /**
     * 子供バイキング無料年齢To
     */
    private String childVkFreeAgeTo;

    /**
     * 子供バイキング有料年齢From
     */
    private String childVkPayAgeFrom;

    /**
     * 子供バイキング有料年齢To
     */
    private String childVkPayAgeTo;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * ルームクリーニング有無
     */
    private String rcFlg;

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * チェックイン後_預かり場所を取得します。
     * 
     * @return チェックイン後_預かり場所
     */
    public String getCheckInAfterKeep() {
        return checkInAfterKeep;
    }

    /**
     * チェックイン後_預かり料金を取得します。
     * 
     * @return チェックイン後_預かり料金
     */
    public String getCheckInAfterKeepCharge() {
        return checkInAfterKeepCharge;
    }

    /**
     * チェックイン前_預かり場所を取得します。
     * 
     * @return チェックイン前_預かり場所
     */
    public String getCheckInBeforeKeep() {
        return checkInBeforeKeep;
    }

    /**
     * チェックイン前_預かり料金を取得します。
     * 
     * @return チェックイン前_預かり料金
     */
    public String getCheckInBeforeKeepCharge() {
        return checkInBeforeKeepCharge;
    }

    /**
     * 子供料金を取得します。
     * 
     * @return 子供料金
     */
    public String getChildFees() {
        return childFees;
    }

    /**
     * 子供料金特記欄を取得します。
     * 
     * @return 子供料金特記欄
     */
    public String getChildFeesSpCmt() {
        return childFeesSpCmt;
    }

    /**
     * 子供料金にバイキング代含むを取得します。
     * 
     * @return 子供料金にバイキング代含む
     */
    public String getChildFeesVk() {
        return childFeesVk;
    }

    /**
     * 子供無料年齢Fromを取得します。
     * 
     * @return 子供無料年齢From
     */
    public String getChildFreeAgeFrom() {
        return childFreeAgeFrom;
    }

    /**
     * 子供無料年齢Toを取得します。
     * 
     * @return 子供無料年齢To
     */
    public String getChildFreeAgeTo() {
        return childFreeAgeTo;
    }

    /**
     * 子供料金有無を取得します。
     * 
     * @return 子供料金有無
     */
    public String getChildFreeFlg() {
        return childFreeFlg;
    }

    /**
     * 子供有料年齢Fromを取得します。
     * 
     * @return 子供有料年齢From
     */
    public String getChildPayAgeFrom() {
        return childPayAgeFrom;
    }

    /**
     * 子供有料年齢Toを取得します。
     * 
     * @return 子供有料年齢To
     */
    public String getChildPayAgeTo() {
        return childPayAgeTo;
    }

    /**
     * 子供バイキング料金朝食を取得します。
     * 
     * @return 子供バイキング料金朝食
     */
    public String getChildVkChareBreakfast() {
        return childVkChareBreakfast;
    }

    /**
     * 子供バイキング料金夕食を取得します。
     * 
     * @return 子供バイキング料金夕食
     */
    public String getChildVkChareDinner() {
        return childVkChareDinner;
    }

    /**
     * 子供バイキング有無を取得します。
     * 
     * @return 子供バイキング有無
     */
    public String getChildVkFlg() {
        return childVkFlg;
    }

    /**
     * 子供バイキング無料年齢Fromを取得します。
     * 
     * @return 子供バイキング無料年齢From
     */
    public String getChildVkFreeAgeFrom() {
        return childVkFreeAgeFrom;
    }

    /**
     * 子供バイキング無料年齢Toを取得します。
     * 
     * @return 子供バイキング無料年齢To
     */
    public String getChildVkFreeAgeTo() {
        return childVkFreeAgeTo;
    }

    /**
     * 子供バイキング有料年齢Fromを取得します。
     * 
     * @return 子供バイキング有料年齢From
     */
    public String getChildVkPayAgeFrom() {
        return childVkPayAgeFrom;
    }

    /**
     * 子供バイキング有料年齢Toを取得します。
     * 
     * @return 子供バイキング有料年齢To
     */
    public String getChildVkPayAgeTo() {
        return childVkPayAgeTo;
    }

    /**
     * 企画回答連番を取得します。
     * 
     * @return 企画回答連番
     */
    public long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * ルームクリーニング有無を取得します。
     * 
     * @return ルームクリーニング有無
     */
    public String getRcFlg() {
        return rcFlg;
    }

    /**
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * チェックイン後_預かり場所を設定します。
     * 
     * @param checkInAfterKeep
     *            チェックイン後_預かり場所
     */
    public void setCheckInAfterKeep(String checkInAfterKeep) {
        this.checkInAfterKeep = checkInAfterKeep;
    }

    /**
     * チェックイン後_預かり料金を設定します。
     * 
     * @param checkInAfterKeepCharge
     *            チェックイン後_預かり料金
     */
    public void setCheckInAfterKeepCharge(String checkInAfterKeepCharge) {
        this.checkInAfterKeepCharge = checkInAfterKeepCharge;
    }

    /**
     * チェックイン前_預かり場所を設定します。
     * 
     * @param checkInBeforeKeep
     *            チェックイン前_預かり場所
     */
    public void setCheckInBeforeKeep(String checkInBeforeKeep) {
        this.checkInBeforeKeep = checkInBeforeKeep;
    }

    /**
     * チェックイン前_預かり料金を設定します。
     * 
     * @param checkInBeforeKeepCharge
     *            チェックイン前_預かり料金
     */
    public void setCheckInBeforeKeepCharge(String checkInBeforeKeepCharge) {
        this.checkInBeforeKeepCharge = checkInBeforeKeepCharge;
    }

    /**
     * 子供料金を設定します。
     * 
     * @param childFees
     *            子供料金
     */
    public void setChildFees(String childFees) {
        this.childFees = childFees;
    }

    /**
     * 子供料金特記欄を設定します。
     * 
     * @param childFeesSpCmt
     *            子供料金特記欄
     */
    public void setChildFeesSpCmt(String childFeesSpCmt) {
        this.childFeesSpCmt = childFeesSpCmt;
    }

    /**
     * 子供料金にバイキング代含むを設定します。
     * 
     * @param childFeesVk
     *            子供料金にバイキング代含む
     */
    public void setChildFeesVk(String childFeesVk) {
        this.childFeesVk = childFeesVk;
    }

    /**
     * 子供無料年齢Fromを設定します。
     * 
     * @param childFreeAgeFrom
     *            子供無料年齢From
     */
    public void setChildFreeAgeFrom(String childFreeAgeFrom) {
        this.childFreeAgeFrom = childFreeAgeFrom;
    }

    /**
     * 子供無料年齢Toを設定します。
     * 
     * @param childFreeAgeTo
     *            子供無料年齢To
     */
    public void setChildFreeAgeTo(String childFreeAgeTo) {
        this.childFreeAgeTo = childFreeAgeTo;
    }

    /**
     * 子供料金有無を設定します。
     * 
     * @param childFreeFlg
     *            子供料金有無
     */
    public void setChildFreeFlg(String childFreeFlg) {
        this.childFreeFlg = childFreeFlg;
    }

    /**
     * 子供有料年齢Fromを設定します。
     * 
     * @param childPayAgeFrom
     *            子供有料年齢From
     */
    public void setChildPayAgeFrom(String childPayAgeFrom) {
        this.childPayAgeFrom = childPayAgeFrom;
    }

    /**
     * 子供有料年齢Toを設定します。
     * 
     * @param childPayAgeTo
     *            子供有料年齢To
     */
    public void setChildPayAgeTo(String childPayAgeTo) {
        this.childPayAgeTo = childPayAgeTo;
    }

    /**
     * 子供バイキング料金朝食を設定します。
     * 
     * @param childVkChareBreakfast
     *            子供バイキング料金朝食
     */
    public void setChildVkChareBreakfast(String childVkChareBreakfast) {
        this.childVkChareBreakfast = childVkChareBreakfast;
    }

    /**
     * 子供バイキング料金夕食を設定します。
     * 
     * @param childVkChareDinner
     *            子供バイキング料金夕食
     */
    public void setChildVkChareDinner(String childVkChareDinner) {
        this.childVkChareDinner = childVkChareDinner;
    }

    /**
     * 子供バイキング有無を設定します。
     * 
     * @param childVkFlg
     *            子供バイキング有無
     */
    public void setChildVkFlg(String childVkFlg) {
        this.childVkFlg = childVkFlg;
    }

    /**
     * 子供バイキング無料年齢Fromを設定します。
     * 
     * @param childVkFreeAgeFrom
     *            子供バイキング無料年齢From
     */
    public void setChildVkFreeAgeFrom(String childVkFreeAgeFrom) {
        this.childVkFreeAgeFrom = childVkFreeAgeFrom;
    }

    /**
     * 子供バイキング無料年齢Toを設定します。
     * 
     * @param childVkFreeAgeTo
     *            子供バイキング無料年齢To
     */
    public void setChildVkFreeAgeTo(String childVkFreeAgeTo) {
        this.childVkFreeAgeTo = childVkFreeAgeTo;
    }

    /**
     * 子供バイキング有料年齢Fromを設定します。
     * 
     * @param childVkPayAgeFrom
     *            子供バイキング有料年齢From
     */
    public void setChildVkPayAgeFrom(String childVkPayAgeFrom) {
        this.childVkPayAgeFrom = childVkPayAgeFrom;
    }

    /**
     * 子供バイキング有料年齢Toを設定します。
     * 
     * @param childVkPayAgeTo
     *            子供バイキング有料年齢To
     */
    public void setChildVkPayAgeTo(String childVkPayAgeTo) {
        this.childVkPayAgeTo = childVkPayAgeTo;
    }

    /**
     * 企画回答連番を設定します。
     * 
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * ルームクリーニング有無を設定します。
     * 
     * @param rcFlg
     *            ルームクリーニング有無
     */
    public void setRcFlg(String rcFlg) {
        this.rcFlg = rcFlg;
    }

}
