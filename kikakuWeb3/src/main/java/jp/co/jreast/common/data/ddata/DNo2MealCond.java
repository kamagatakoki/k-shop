package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 08 10:43:41 JST 2014
 */

/**
 * D_no2_meal_cond.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/08 keiken Generated.
 */
public class DNo2MealCond {

    /** テーブル名 */
    public static final String TABLE = "D_NO2_MEAL_COND";

    /**
     * 朝食_食事内容選択
     */
    private String bfContentFlg;

    /**
     * 朝食_食事内容_人数
     */
    private String bfContentNum;

    /**
     * 朝食_食事内容_その他内容
     */
    private String bfContentOther;

    /**
     * 朝食_食事箇所選択
     */
    private String bfPlaceFlg;

    /**
     * 朝食_食事箇所選択_人数
     */
    private String bfPlaceNum;

    /**
     * 朝食_食事箇所選択_その他内容
     */
    private String bfPlaceOther;

    /**
     * 朝食_選択方法_締切日
     */
    private String bfSelectDeadline;

    /**
     * 朝食_選択方法_締切日_申込時入力
     */
    private String bfSelectDeadline0;
    
    /**
     * 朝食_選択方法_締切日_要電話予約
     */
    private String bfSelectDeadline1;
    
    /**
     * 朝食_選択方法
     */
    private String bfSelectFlg;

    /**
     * 朝食料理特徴
     */
    private String breakfastFeature;

    /**
     * 朝食食事条件
     */
    private String breakfastItem;

    /**
     * 朝食バイキング制限有無
     */
    private String breakfastVkLitFlg;

    /**
     * 朝食バイキング制限人数
     */
    private String breakfastVkNumber;

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 夕食料理特徴
     */
    private String dinnerFeature;

    /**
     * 夕食食事条件
     */
    private String dinnerItem;

    /**
     * 夕食バイキング制限有無
     */
    private String dinnerVkLitFlg;

    /**
     * 夕食バイキング制限人数
     */
    private String dinnerVkNum;

    /**
     * 夕食_食事内容選択
     */
    private String dnContentFlg;

    /**
     * 夕食_食事内容選択_人数
     */
    private String dnContentNum;

    /**
     * 夕食_食事内容選択_その他内容
     */
    private String dnContentOther;

    /**
     * 夕食_食事箇所選択
     */
    private String dnPlaceFlg;

    /**
     * 夕食_食事箇所選択_人数
     */
    private String dnPlaceNum;

    /**
     * 夕食_食事箇所選択_その他内容
     */
    private String dnPlaceOther;

    /**
     * 夕食_選択方法_締切日
     */
    private String dnSelectDeadline;

    /**
     * 夕食_選択方法_締切日_申込時入力
     */
    private String dnSelectDeadline0;
    
    /**
     * 夕食_選択方法_締切日_要電話予約
     */
    private String dnSelectDeadline1;
    
    /**
     * 夕食_選択方法
     */
    private String dnSelectFlg;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * 部屋備品有無
     */
    private String roomVesselFlg;

    /**
     * 朝食_食事内容選択を取得します。
     * 
     * @return 朝食_食事内容選択
     */
    public String getBfContentFlg() {
        return bfContentFlg;
    }

    /**
     * 朝食_食事内容_人数を取得します。
     * 
     * @return 朝食_食事内容_人数
     */
    public String getBfContentNum() {
        return bfContentNum;
    }

    /**
     * 朝食_食事内容_その他内容を取得します。
     * 
     * @return 朝食_食事内容_その他内容
     */
    public String getBfContentOther() {
        return bfContentOther;
    }

    /**
     * 朝食_食事箇所選択を取得します。
     * 
     * @return 朝食_食事箇所選択
     */
    public String getBfPlaceFlg() {
        return bfPlaceFlg;
    }

    /**
     * 朝食_食事箇所選択_人数を取得します。
     * 
     * @return 朝食_食事箇所選択_人数
     */
    public String getBfPlaceNum() {
        return bfPlaceNum;
    }

    /**
     * 朝食_食事箇所選択_その他内容を取得します。
     * 
     * @return 朝食_食事箇所選択_その他内容
     */
    public String getBfPlaceOther() {
        return bfPlaceOther;
    }

    /**
     * 朝食_選択方法_締切日を取得します。
     * 
     * @return 朝食_選択方法_締切日
     */
    public String getBfSelectDeadline() {
        return bfSelectDeadline;
    }

    /**
     * 朝食_選択方法_締切日_申込時入力を取得します。
     * @return 朝食_選択方法_締切日_申込時入力
     */
    public String getBfSelectDeadline0() {
        return bfSelectDeadline0;
    }

    /**
     * 朝食_選択方法_締切日_申込時入力を設定します。
     * @param bfSelectDeadline0 朝食_選択方法_締切日_申込時入力
     */
    public void setBfSelectDeadline0(String bfSelectDeadline0) {
        this.bfSelectDeadline0 = bfSelectDeadline0;
    }

    /**
     * 朝食_選択方法_締切日_要電話予約を取得します。
     * @return 朝食_選択方法_締切日_要電話予約
     */
    public String getBfSelectDeadline1() {
        return bfSelectDeadline1;
    }

    /**
     * 朝食_選択方法_締切日_要電話予約を設定します。
     * @param bfSelectDeadline1 朝食_選択方法_締切日_要電話予約
     */
    public void setBfSelectDeadline1(String bfSelectDeadline1) {
        this.bfSelectDeadline1 = bfSelectDeadline1;
    }

    /**
     * 朝食_選択方法を取得します。
     * 
     * @return 朝食_選択方法
     */
    public String getBfSelectFlg() {
        return bfSelectFlg;
    }

    /**
     * 朝食料理特徴を取得します。
     * 
     * @return 朝食料理特徴
     */
    public String getBreakfastFeature() {
        return breakfastFeature;
    }

    /**
     * 朝食食事条件を取得します。
     * 
     * @return 朝食食事条件
     */
    public String getBreakfastItem() {
        return breakfastItem;
    }

    /**
     * 朝食バイキング制限有無を取得します。
     * 
     * @return 朝食バイキング制限有無
     */
    public String getBreakfastVkLitFlg() {
        return breakfastVkLitFlg;
    }

    /**
     * 朝食バイキング制限人数を取得します。
     * 
     * @return 朝食バイキング制限人数
     */
    public String getBreakfastVkNumber() {
        return breakfastVkNumber;
    }

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 夕食料理特徴を取得します。
     * 
     * @return 夕食料理特徴
     */
    public String getDinnerFeature() {
        return dinnerFeature;
    }

    /**
     * 夕食食事条件を取得します。
     * 
     * @return 夕食食事条件
     */
    public String getDinnerItem() {
        return dinnerItem;
    }

    /**
     * 夕食バイキング制限有無を取得します。
     * 
     * @return 夕食バイキング制限有無
     */
    public String getDinnerVkLitFlg() {
        return dinnerVkLitFlg;
    }

    /**
     * 夕食バイキング制限人数を取得します。
     * 
     * @return 夕食バイキング制限人数
     */
    public String getDinnerVkNum() {
        return dinnerVkNum;
    }

    /**
     * 夕食_食事内容選択を取得します。
     * 
     * @return 夕食_食事内容選択
     */
    public String getDnContentFlg() {
        return dnContentFlg;
    }

    /**
     * 夕食_食事内容選択_人数を取得します。
     * 
     * @return 夕食_食事内容選択_人数
     */
    public String getDnContentNum() {
        return dnContentNum;
    }

    /**
     * 夕食_食事内容選択_その他内容を取得します。
     * 
     * @return 夕食_食事内容選択_その他内容
     */
    public String getDnContentOther() {
        return dnContentOther;
    }

    /**
     * 夕食_食事箇所選択を取得します。
     * 
     * @return 夕食_食事箇所選択
     */
    public String getDnPlaceFlg() {
        return dnPlaceFlg;
    }

    /**
     * 夕食_食事箇所選択_人数を取得します。
     * 
     * @return 夕食_食事箇所選択_人数
     */
    public String getDnPlaceNum() {
        return dnPlaceNum;
    }

    /**
     * 夕食_食事箇所選択_その他内容を取得します。
     * 
     * @return 夕食_食事箇所選択_その他内容
     */
    public String getDnPlaceOther() {
        return dnPlaceOther;
    }

    /**
     * 夕食_選択方法_締切日を取得します。
     * 
     * @return 夕食_選択方法_締切日
     */
    public String getDnSelectDeadline() {
        return dnSelectDeadline;
    }

    /**
     * 夕食_選択方法_締切日_申込時入力を取得します。
     * @return 夕食_選択方法_締切日_申込時入力
     */
    public String getDnSelectDeadline0() {
        return dnSelectDeadline0;
    }

    /**
     * 夕食_選択方法_締切日_申込時入力を設定します。
     * @param dnSelectDeadline0 夕食_選択方法_締切日_申込時入力
     */
    public void setDnSelectDeadline0(String dnSelectDeadline0) {
        this.dnSelectDeadline0 = dnSelectDeadline0;
    }

    /**
     * 夕食_選択方法_締切日_要電話予約を取得します。
     * @return 夕食_選択方法_締切日_要電話予約
     */
    public String getDnSelectDeadline1() {
        return dnSelectDeadline1;
    }

    /**
     * 夕食_選択方法_締切日_要電話予約を設定します。
     * @param dnSelectDeadline1 夕食_選択方法_締切日_要電話予約
     */
    public void setDnSelectDeadline1(String dnSelectDeadline1) {
        this.dnSelectDeadline1 = dnSelectDeadline1;
    }

    /**
     * 夕食_選択方法を取得します。
     * 
     * @return 夕食_選択方法
     */
    public String getDnSelectFlg() {
        return dnSelectFlg;
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
     * 部屋備品有無を取得します。
     * 
     * @return 部屋備品有無
     */
    public String getRoomVesselFlg() {
        return roomVesselFlg;
    }

    /**
     * 朝食_食事内容選択を設定します。
     * 
     * @param bfContentFlg
     *            朝食_食事内容選択
     */
    public void setBfContentFlg(String bfContentFlg) {
        this.bfContentFlg = bfContentFlg;
    }

    /**
     * 朝食_食事内容_人数を設定します。
     * 
     * @param bfContentNum
     *            朝食_食事内容_人数
     */
    public void setBfContentNum(String bfContentNum) {
        this.bfContentNum = bfContentNum;
    }

    /**
     * 朝食_食事内容_その他内容を設定します。
     * 
     * @param bfContentOther
     *            朝食_食事内容_その他内容
     */
    public void setBfContentOther(String bfContentOther) {
        this.bfContentOther = bfContentOther;
    }

    /**
     * 朝食_食事箇所選択を設定します。
     * 
     * @param bfPlaceFlg
     *            朝食_食事箇所選択
     */
    public void setBfPlaceFlg(String bfPlaceFlg) {
        this.bfPlaceFlg = bfPlaceFlg;
    }

    /**
     * 朝食_食事箇所選択_人数を設定します。
     * 
     * @param bfPlaceNum
     *            朝食_食事箇所選択_人数
     */
    public void setBfPlaceNum(String bfPlaceNum) {
        this.bfPlaceNum = bfPlaceNum;
    }

    /**
     * 朝食_食事箇所選択_その他内容を設定します。
     * 
     * @param bfPlaceOther
     *            朝食_食事箇所選択_その他内容
     */
    public void setBfPlaceOther(String bfPlaceOther) {
        this.bfPlaceOther = bfPlaceOther;
    }

    /**
     * 朝食_選択方法_締切日を設定します。
     * 
     * @param bfSelectDeadline
     *            朝食_選択方法_締切日
     */
    public void setBfSelectDeadline(String bfSelectDeadline) {
        this.bfSelectDeadline = bfSelectDeadline;
    }

    /**
     * 朝食_選択方法を設定します。
     * 
     * @param bfSelectFlg
     *            朝食_選択方法
     */
    public void setBfSelectFlg(String bfSelectFlg) {
        this.bfSelectFlg = bfSelectFlg;
    }

    /**
     * 朝食料理特徴を設定します。
     * 
     * @param breakfastFeature
     *            朝食料理特徴
     */
    public void setBreakfastFeature(String breakfastFeature) {
        this.breakfastFeature = breakfastFeature;
    }

    /**
     * 朝食食事条件を設定します。
     * 
     * @param breakfastItem
     *            朝食食事条件
     */
    public void setBreakfastItem(String breakfastItem) {
        this.breakfastItem = breakfastItem;
    }

    /**
     * 朝食バイキング制限有無を設定します。
     * 
     * @param breakfastVkLitFlg
     *            朝食バイキング制限有無
     */
    public void setBreakfastVkLitFlg(String breakfastVkLitFlg) {
        this.breakfastVkLitFlg = breakfastVkLitFlg;
    }

    /**
     * 朝食バイキング制限人数を設定します。
     * 
     * @param breakfastVkNumber
     *            朝食バイキング制限人数
     */
    public void setBreakfastVkNumber(String breakfastVkNumber) {
        this.breakfastVkNumber = breakfastVkNumber;
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
     * 夕食料理特徴を設定します。
     * 
     * @param dinnerFeature
     *            夕食料理特徴
     */
    public void setDinnerFeature(String dinnerFeature) {
        this.dinnerFeature = dinnerFeature;
    }

    /**
     * 夕食食事条件を設定します。
     * 
     * @param dinnerItem
     *            夕食食事条件
     */
    public void setDinnerItem(String dinnerItem) {
        this.dinnerItem = dinnerItem;
    }

    /**
     * 夕食バイキング制限有無を設定します。
     * 
     * @param dinnerVkLitFlg
     *            夕食バイキング制限有無
     */
    public void setDinnerVkLitFlg(String dinnerVkLitFlg) {
        this.dinnerVkLitFlg = dinnerVkLitFlg;
    }

    /**
     * 夕食バイキング制限人数を設定します。
     * 
     * @param dinnerVkNum
     *            夕食バイキング制限人数
     */
    public void setDinnerVkNum(String dinnerVkNum) {
        this.dinnerVkNum = dinnerVkNum;
    }

    /**
     * 夕食_食事内容選択を設定します。
     * 
     * @param dnContentFlg
     *            夕食_食事内容選択
     */
    public void setDnContentFlg(String dnContentFlg) {
        this.dnContentFlg = dnContentFlg;
    }

    /**
     * 夕食_食事内容選択_人数を設定します。
     * 
     * @param dnContentNum
     *            夕食_食事内容選択_人数
     */
    public void setDnContentNum(String dnContentNum) {
        this.dnContentNum = dnContentNum;
    }

    /**
     * 夕食_食事内容選択_その他内容を設定します。
     * 
     * @param dnContentOther
     *            夕食_食事内容選択_その他内容
     */
    public void setDnContentOther(String dnContentOther) {
        this.dnContentOther = dnContentOther;
    }

    /**
     * 夕食_食事箇所選択を設定します。
     * 
     * @param dnPlaceFlg
     *            夕食_食事箇所選択
     */
    public void setDnPlaceFlg(String dnPlaceFlg) {
        this.dnPlaceFlg = dnPlaceFlg;
    }

    /**
     * 夕食_食事箇所選択_人数を設定します。
     * 
     * @param dnPlaceNum
     *            夕食_食事箇所選択_人数
     */
    public void setDnPlaceNum(String dnPlaceNum) {
        this.dnPlaceNum = dnPlaceNum;
    }

    /**
     * 夕食_食事箇所選択_その他内容を設定します。
     * 
     * @param dnPlaceOther
     *            夕食_食事箇所選択_その他内容
     */
    public void setDnPlaceOther(String dnPlaceOther) {
        this.dnPlaceOther = dnPlaceOther;
    }

    /**
     * 夕食_選択方法_締切日を設定します。
     * 
     * @param dnSelectDeadline
     *            夕食_選択方法_締切日
     */
    public void setDnSelectDeadline(String dnSelectDeadline) {
        this.dnSelectDeadline = dnSelectDeadline;
    }

    /**
     * 夕食_選択方法を設定します。
     * 
     * @param dnSelectFlg
     *            夕食_選択方法
     */
    public void setDnSelectFlg(String dnSelectFlg) {
        this.dnSelectFlg = dnSelectFlg;
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
     * 部屋備品有無を設定します。
     * 
     * @param roomVesselFlg
     *            部屋備品有無
     */
    public void setRoomVesselFlg(String roomVesselFlg) {
        this.roomVesselFlg = roomVesselFlg;
    }

}
