package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Thu Oct 30 11:08:52 JST 2014
 */

/**
 * D_no2_meal_hotelVo.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/30 keiken Generated.
 */
public class DNo2MealHotel {

    /** テーブル名 */
    public static final String TABLE = "D_NO2_MEAL_HOTEL";

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * レストラン食事内容
     */
    private String restaurantMealContent;

    /**
     * レストラン名称
     */
    private String restaurantNam;

    /**
     * レストラン数
     */
    private String restaurantNum;

    /**
     * 営業時間開始
     */
    private String salesTimeBegin;

    /**
     * 営業時間終了
     */
    private String salesTimeEnd;

    /**
     * 現地払い朝食代金
     */
    private String spotPrice;

    /**
     * 現地払い朝食代金条件
     */
    private String spotPriceCondition;

    /**
     * 現地払い朝食内容
     */
    private String spotPriceContent;

    /**
     * 履歴番号を取得します。
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 履歴番号を設定します。
     * @param careerNo 履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * 企画回答連番を取得します。
     * @return 企画回答連番
     */
    public long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * 企画回答連番を設定します。
     * @param planAnsNo 企画回答連番
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * レストラン食事内容を取得します。
     * @return レストラン食事内容
     */
    public String getRestaurantMealContent() {
        return restaurantMealContent;
    }

    /**
     * レストラン食事内容を設定します。
     * @param restaurantMealContent レストラン食事内容
     */
    public void setRestaurantMealContent(String restaurantMealContent) {
        this.restaurantMealContent = restaurantMealContent;
    }

    /**
     * レストラン名称を取得します。
     * @return レストラン名称
     */
    public String getRestaurantNam() {
        return restaurantNam;
    }

    /**
     * レストラン名称を設定します。
     * @param restaurantNam レストラン名称
     */
    public void setRestaurantNam(String restaurantNam) {
        this.restaurantNam = restaurantNam;
    }

    /**
     * レストラン数を取得します。
     * @return レストラン数
     */
    public String getRestaurantNum() {
        return restaurantNum;
    }

    /**
     * レストラン数を設定します。
     * @param restaurantNum レストラン数
     */
    public void setRestaurantNum(String restaurantNum) {
        this.restaurantNum = restaurantNum;
    }

    /**
     * 営業時間開始を取得します。
     * @return 営業時間開始
     */
    public String getSalesTimeBegin() {
        return salesTimeBegin;
    }

    /**
     * 営業時間開始を設定します。
     * @param salesTimeBegin 営業時間開始
     */
    public void setSalesTimeBegin(String salesTimeBegin) {
        this.salesTimeBegin = salesTimeBegin;
    }

    /**
     * 営業時間終了を取得します。
     * @return 営業時間終了
     */
    public String getSalesTimeEnd() {
        return salesTimeEnd;
    }

    /**
     * 営業時間終了を設定します。
     * @param salesTimeEnd 営業時間終了
     */
    public void setSalesTimeEnd(String salesTimeEnd) {
        this.salesTimeEnd = salesTimeEnd;
    }

    /**
     * 現地払い朝食代金を取得します。
     * @return 現地払い朝食代金
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * 現地払い朝食代金を設定します。
     * @param spotPrice 現地払い朝食代金
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * 現地払い朝食代金条件を取得します。
     * @return 現地払い朝食代金条件
     */
    public String getSpotPriceCondition() {
        return spotPriceCondition;
    }

    /**
     * 現地払い朝食代金条件を設定します。
     * @param spotPriceCondition 現地払い朝食代金条件
     */
    public void setSpotPriceCondition(String spotPriceCondition) {
        this.spotPriceCondition = spotPriceCondition;
    }

    /**
     * 現地払い朝食内容を取得します。
     * @return 現地払い朝食内容
     */
    public String getSpotPriceContent() {
        return spotPriceContent;
    }

    /**
     * 現地払い朝食内容を設定します。
     * @param spotPriceContent 現地払い朝食内容
     */
    public void setSpotPriceContent(String spotPriceContent) {
        this.spotPriceContent = spotPriceContent;
    }

}
