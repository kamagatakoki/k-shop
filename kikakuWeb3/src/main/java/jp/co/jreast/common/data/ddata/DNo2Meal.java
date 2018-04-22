package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 08 10:56:14 JST 2014
 */

/**
 * D_no2_meal.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/08 keiken Generated.
 */
public class DNo2Meal {

    /** テーブル名 */
    public static final String TABLE = "D_NO2_MEAL";

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 中華有無
     */
    private String chFoodFlg;

    /**
     * 洋食有無
     */
    private String euFoodFlg;

    /**
     * 和食有無
     */
    private String jpFoodFlg;

    /**
     * 食事内容
     */
    private String mealContent;

    /**
     * 食事種別
     */
    private Integer mealKind;

    /**
     * 品数
     */
    private String mealNum;

    /**
     * 食事箇所コード
     */
    private Integer mealPlaceCd;

    /**
     * 食事箇所選択有無
     */
    private String mealPlaceSelFlg;

    /**
     * その他有無
     */
    private String otherFoodFlg;

    /**
     * 人数制限
     */
    private String personNumLit;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * ﾊﾞｲｷﾝｸﾞ中華有無
     */
    private String vkChFoodFlg;

    /**
     * ﾊﾞｲｷﾝｸﾞ洋食有無
     */
    private String vkEuFoodFlg;

    /**
     * ﾊﾞｲｷﾝｸﾞ和食有無
     */
    private String vkJpFoodFlg;

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 中華有無を取得します。
     * 
     * @return 中華有無
     */
    public String getChFoodFlg() {
        return chFoodFlg;
    }

    /**
     * 洋食有無を取得します。
     * 
     * @return 洋食有無
     */
    public String getEuFoodFlg() {
        return euFoodFlg;
    }

    /**
     * 和食有無を取得します。
     * 
     * @return 和食有無
     */
    public String getJpFoodFlg() {
        return jpFoodFlg;
    }

    /**
     * 食事内容を取得します。
     * 
     * @return 食事内容
     */
    public String getMealContent() {
        return mealContent;
    }

    /**
     * 食事種別を取得します。
     * 
     * @return 食事種別
     */
    public Integer getMealKind() {
        return mealKind;
    }

    /**
     * 品数を取得します。
     * 
     * @return 品数
     */
    public String getMealNum() {
        return mealNum;
    }

    /**
     * 食事箇所コードを取得します。
     * 
     * @return 食事箇所コード
     */
    public Integer getMealPlaceCd() {
        return mealPlaceCd;
    }

    /**
     * 食事箇所選択有無を取得します。
     * 
     * @return 食事箇所選択有無
     */
    public String getMealPlaceSelFlg() {
        return mealPlaceSelFlg;
    }

    /**
     * その他有無を取得します。
     * 
     * @return その他有無
     */
    public String getOtherFoodFlg() {
        return otherFoodFlg;
    }

    /**
     * 人数制限を取得します。
     * 
     * @return 人数制限
     */
    public String getPersonNumLit() {
        return personNumLit;
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
     * ﾊﾞｲｷﾝｸﾞ中華有無を取得します。
     * 
     * @return ﾊﾞｲｷﾝｸﾞ中華有無
     */
    public String getVkChFoodFlg() {
        return vkChFoodFlg;
    }

    /**
     * ﾊﾞｲｷﾝｸﾞ洋食有無を取得します。
     * 
     * @return ﾊﾞｲｷﾝｸﾞ洋食有無
     */
    public String getVkEuFoodFlg() {
        return vkEuFoodFlg;
    }

    /**
     * ﾊﾞｲｷﾝｸﾞ和食有無を取得します。
     * 
     * @return ﾊﾞｲｷﾝｸﾞ和食有無
     */
    public String getVkJpFoodFlg() {
        return vkJpFoodFlg;
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
     * 中華有無を設定します。
     * 
     * @param chFoodFlg
     *            中華有無
     */
    public void setChFoodFlg(String chFoodFlg) {
        this.chFoodFlg = chFoodFlg;
    }

    /**
     * 洋食有無を設定します。
     * 
     * @param euFoodFlg
     *            洋食有無
     */
    public void setEuFoodFlg(String euFoodFlg) {
        this.euFoodFlg = euFoodFlg;
    }

    /**
     * 和食有無を設定します。
     * 
     * @param jpFoodFlg
     *            和食有無
     */
    public void setJpFoodFlg(String jpFoodFlg) {
        this.jpFoodFlg = jpFoodFlg;
    }

    /**
     * 食事内容を設定します。
     * 
     * @param mealContent
     *            食事内容
     */
    public void setMealContent(String mealContent) {
        this.mealContent = mealContent;
    }

    /**
     * 食事種別を設定します。
     * 
     * @param mealKind
     *            食事種別
     */
    public void setMealKind(Integer mealKind) {
        this.mealKind = mealKind;
    }

    /**
     * 品数を設定します。
     * 
     * @param mealNum
     *            品数
     */
    public void setMealNum(String mealNum) {
        this.mealNum = mealNum;
    }

    /**
     * 食事箇所コードを設定します。
     * 
     * @param mealPlaceCd
     *            食事箇所コード
     */
    public void setMealPlaceCd(Integer mealPlaceCd) {
        this.mealPlaceCd = mealPlaceCd;
    }

    /**
     * 食事箇所選択有無を設定します。
     * 
     * @param mealPlaceSelFlg
     *            食事箇所選択有無
     */
    public void setMealPlaceSelFlg(String mealPlaceSelFlg) {
        this.mealPlaceSelFlg = mealPlaceSelFlg;
    }

    /**
     * その他有無を設定します。
     * 
     * @param otherFoodFlg
     *            その他有無
     */
    public void setOtherFoodFlg(String otherFoodFlg) {
        this.otherFoodFlg = otherFoodFlg;
    }

    /**
     * 人数制限を設定します。
     * 
     * @param personNumLit
     *            人数制限
     */
    public void setPersonNumLit(String personNumLit) {
        this.personNumLit = personNumLit;
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
     * ﾊﾞｲｷﾝｸﾞ中華有無を設定します。
     * 
     * @param vkChFoodFlg
     *            ﾊﾞｲｷﾝｸﾞ中華有無
     */
    public void setVkChFoodFlg(String vkChFoodFlg) {
        this.vkChFoodFlg = vkChFoodFlg;
    }

    /**
     * ﾊﾞｲｷﾝｸﾞ洋食有無を設定します。
     * 
     * @param vkEuFoodFlg
     *            ﾊﾞｲｷﾝｸﾞ洋食有無
     */
    public void setVkEuFoodFlg(String vkEuFoodFlg) {
        this.vkEuFoodFlg = vkEuFoodFlg;
    }

    /**
     * ﾊﾞｲｷﾝｸﾞ和食有無を設定します。
     * 
     * @param vkJpFoodFlg
     *            ﾊﾞｲｷﾝｸﾞ和食有無
     */
    public void setVkJpFoodFlg(String vkJpFoodFlg) {
        this.vkJpFoodFlg = vkJpFoodFlg;
    }

}
