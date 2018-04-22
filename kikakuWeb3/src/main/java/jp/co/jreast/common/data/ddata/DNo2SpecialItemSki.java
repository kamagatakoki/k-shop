package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 15 10:24:06 JST 2014
 */

/**
 * DNo2SpecialItemSki.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/15 keiken Generated.
 */
public class DNo2SpecialItemSki {

    /** テーブル名：[DP/RM]NO2_特典_スキー */
    public static final String TABLE = "D_NO2_SPECIAL_ITEM_SKI";

    /**
     * びゅう特典１０_2泊目有無
     */
    private String byu102daysFlg;

    /**
     * びゅう特典１０_内容
     */
    private String byu10Content;

    /**
     * びゅう特典１０_無料サービス有無
     */
    private String byu10FreeFlg;

    /**
     * びゅう特典１１_2泊目有無
     */
    private String byu112daysFlg;

    /**
     * びゅう特典１１_内容
     */
    private String byu11Content;

    /**
     * びゅう特典１１_割引サービス有無
     */
    private String byu11DiscountFlg;

    /**
     * びゅう特典１２_2泊目有無
     */
    private String byu122daysFlg;

    /**
     * びゅう特典１２_金額
     */
    private String byu12Charge;

    /**
     * びゅう特典１２_食事券有無
     */
    private String byu12TicketFlg;

    /**
     * びゅう特典１２_利用箇所
     */
    private String byu12UsePlace;

    /**
     * びゅう特典１３_その他内容
     */
    private String byu13OtherContent;

    /**
     * びゅう特典１４_変更方法
     */
    private String byu14Change;

    /**
     * びゅう特典１４_館内金額_おとな
     */
    private String byu14Charge1Adult;

    /**
     * びゅう特典１４_館内金額_こども
     */
    private String byu14Charge1Child;

    /**
     * びゅう特典１４_スクール金額_おとな
     */
    private String byu14Charge2Adult;

    /**
     * びゅう特典１４_スクール金額_こども
     */
    private String byu14Charge2Child;

    /**
     * びゅう特典１４_レンタル金額_おとな
     */
    private String byu14Charge3Adult;

    /**
     * びゅう特典１４_レンタル金額_こども
     */
    private String byu14Charge3Child;

    /**
     * びゅう特典１４_その他内容
     */
    private String byu14OtherContent;

    /**
     * びゅう特典１４_滞在サービス有無
     */
    private String byu14StayFlg;

    /**
     * びゅう特典１４_利用可能施設
     */
    private String byu14UsePlace;

    /**
     * びゅう特典１_チェックイン
     */
    private String byu1CheckIn;

    /**
     * びゅう特典１_通常チェックイン
     */
    private String byu1CheckInNormal;

    /**
     * びゅう特典１_チェックアウト
     */
    private String byu1CheckOut;

    /**
     * びゅう特典１_通常チェックアウト
     */
    private String byu1CheckOutNormal;

    /**
     * びゅう特典２_子供半額有無
     */
    private String byu2ChildHalfFlg;

    /**
     * びゅう特典２_食事
     */
    private String byu2Meal;

    /**
     * びゅう特典２_食事_その他内容
     */
    private String byu2OtherContent;

    /**
     * びゅう特典２_特記事項
     */
    private String byu2SpCmt;

    /**
     * びゅう特典３_到着時チェックイン有無
     */
    private String byu3CheckInFlg;

    /**
     * びゅう特典３_特記事項
     */
    private String byu3SpCmt;

    /**
     * びゅう特典４_お帰りまで利用有無
     */
    private String byu4ReturnFlg;

    /**
     * びゅう特典４_特記事項
     */
    private String byu4SpCmt;

    /**
     * びゅう特典５_チェックイン前
     */
    private String byu5CheckIn;

    /**
     * びゅう特典５_チェックアウト後
     */
    private String byu5CheckOut;

    /**
     * びゅう特典５_無料入浴有無
     */
    private String byu5FreeBathFlg;

    /**
     * びゅう特典５_特記事項
     */
    private String byu5SpCmt;

    /**
     * びゅう特典５_タオル貸出
     */
    private String byu5Towel;

    /**
     * びゅう特典５_タオル貸出金額
     */
    private String byu5TowelCharge;

    /**
     * びゅう特典６_2泊目有無
     */
    private String byu62daysFlg;

    /**
     * びゅう特典６_内容
     */
    private String byu6Content;

    /**
     * びゅう特典６_ファミリーサービス有無
     */
    private String byu6FamilyFlg;

    /**
     * びゅう特典７_2泊目有無
     */
    private String byu72daysFlg;

    /**
     * びゅう特典７_内容
     */
    private String byu7Content;

    /**
     * びゅう特典７_レディースサービス有無
     */
    private String byu7LadysFlg;

    /**
     * びゅう特典８_2泊目有無
     */
    private String byu82daysFlg;

    /**
     * びゅう特典８_内容
     */
    private String byu8Content;

    /**
     * びゅう特典８_カップルサービス有無
     */
    private String byu8CoupleFlg;

    /**
     * びゅう特典９_2泊目有無
     */
    private String byu92daysFlg;

    /**
     * びゅう特典９_内容
     */
    private String byu9Content;

    /**
     * びゅう特典９_グループサービス有無
     */
    private String byu9GroupFlg;

    /**
     * びゅう特典９_人数
     */
    private String byu9Num;

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * びゅう特典１０_2泊目有無を取得します。
     * 
     * @return びゅう特典１０_2泊目有無
     */
    public String getByu102daysFlg() {
        return byu102daysFlg;
    }

    /**
     * びゅう特典１０_内容を取得します。
     * 
     * @return びゅう特典１０_内容
     */
    public String getByu10Content() {
        return byu10Content;
    }

    /**
     * びゅう特典１０_無料サービス有無を取得します。
     * 
     * @return びゅう特典１０_無料サービス有無
     */
    public String getByu10FreeFlg() {
        return byu10FreeFlg;
    }

    /**
     * びゅう特典１１_2泊目有無を取得します。
     * 
     * @return びゅう特典１１_2泊目有無
     */
    public String getByu112daysFlg() {
        return byu112daysFlg;
    }

    /**
     * びゅう特典１１_内容を取得します。
     * 
     * @return びゅう特典１１_内容
     */
    public String getByu11Content() {
        return byu11Content;
    }

    /**
     * びゅう特典１１_割引サービス有無を取得します。
     * 
     * @return びゅう特典１１_割引サービス有無
     */
    public String getByu11DiscountFlg() {
        return byu11DiscountFlg;
    }

    /**
     * びゅう特典１２_2泊目有無を取得します。
     * 
     * @return びゅう特典１２_2泊目有無
     */
    public String getByu122daysFlg() {
        return byu122daysFlg;
    }

    /**
     * びゅう特典１２_金額を取得します。
     * 
     * @return びゅう特典１２_金額
     */
    public String getByu12Charge() {
        return byu12Charge;
    }

    /**
     * びゅう特典１２_食事券有無を取得します。
     * 
     * @return びゅう特典１２_食事券有無
     */
    public String getByu12TicketFlg() {
        return byu12TicketFlg;
    }

    /**
     * びゅう特典１２_利用箇所を取得します。
     * 
     * @return びゅう特典１２_利用箇所
     */
    public String getByu12UsePlace() {
        return byu12UsePlace;
    }

    /**
     * びゅう特典１３_その他内容を取得します。
     * 
     * @return びゅう特典１３_その他内容
     */
    public String getByu13OtherContent() {
        return byu13OtherContent;
    }

    /**
     * びゅう特典１４_変更方法を取得します。
     * 
     * @return びゅう特典１４_変更方法
     */
    public String getByu14Change() {
        return byu14Change;
    }

    /**
     * びゅう特典１４_館内金額_おとなを取得します。
     * 
     * @return びゅう特典１４_館内金額_おとな
     */
    public String getByu14Charge1Adult() {
        return byu14Charge1Adult;
    }

    /**
     * びゅう特典１４_館内金額_こどもを取得します。
     * 
     * @return びゅう特典１４_館内金額_こども
     */
    public String getByu14Charge1Child() {
        return byu14Charge1Child;
    }

    /**
     * びゅう特典１４_スクール金額_おとなを取得します。
     * 
     * @return びゅう特典１４_スクール金額_おとな
     */
    public String getByu14Charge2Adult() {
        return byu14Charge2Adult;
    }

    /**
     * びゅう特典１４_スクール金額_こどもを取得します。
     * 
     * @return びゅう特典１４_スクール金額_こども
     */
    public String getByu14Charge2Child() {
        return byu14Charge2Child;
    }

    /**
     * びゅう特典１４_レンタル金額_おとなを取得します。
     * 
     * @return びゅう特典１４_レンタル金額_おとな
     */
    public String getByu14Charge3Adult() {
        return byu14Charge3Adult;
    }

    /**
     * びゅう特典１４_レンタル金額_こどもを取得します。
     * 
     * @return びゅう特典１４_レンタル金額_こども
     */
    public String getByu14Charge3Child() {
        return byu14Charge3Child;
    }

    /**
     * びゅう特典１４_その他内容を取得します。
     * 
     * @return びゅう特典１４_その他内容
     */
    public String getByu14OtherContent() {
        return byu14OtherContent;
    }

    /**
     * びゅう特典１４_滞在サービス有無を取得します。
     * 
     * @return びゅう特典１４_滞在サービス有無
     */
    public String getByu14StayFlg() {
        return byu14StayFlg;
    }

    /**
     * びゅう特典１４_利用可能施設を取得します。
     * 
     * @return びゅう特典１４_利用可能施設
     */
    public String getByu14UsePlace() {
        return byu14UsePlace;
    }

    /**
     * びゅう特典１_チェックインを取得します。
     * 
     * @return びゅう特典１_チェックイン
     */
    public String getByu1CheckIn() {
        return byu1CheckIn;
    }

    /**
     * びゅう特典１_通常チェックインを取得します。
     * 
     * @return びゅう特典１_通常チェックイン
     */
    public String getByu1CheckInNormal() {
        return byu1CheckInNormal;
    }

    /**
     * びゅう特典１_チェックアウトを取得します。
     * 
     * @return びゅう特典１_チェックアウト
     */
    public String getByu1CheckOut() {
        return byu1CheckOut;
    }

    /**
     * びゅう特典１_通常チェックアウトを取得します。
     * 
     * @return びゅう特典１_通常チェックアウト
     */
    public String getByu1CheckOutNormal() {
        return byu1CheckOutNormal;
    }

    /**
     * びゅう特典２_子供半額有無を取得します。
     * 
     * @return びゅう特典２_子供半額有無
     */
    public String getByu2ChildHalfFlg() {
        return byu2ChildHalfFlg;
    }

    /**
     * びゅう特典２_食事を取得します。
     * 
     * @return びゅう特典２_食事
     */
    public String getByu2Meal() {
        return byu2Meal;
    }

    /**
     * びゅう特典２_食事_その他内容を取得します。
     * 
     * @return びゅう特典２_食事_その他内容
     */
    public String getByu2OtherContent() {
        return byu2OtherContent;
    }

    /**
     * びゅう特典２_特記事項を取得します。
     * 
     * @return びゅう特典２_特記事項
     */
    public String getByu2SpCmt() {
        return byu2SpCmt;
    }

    /**
     * びゅう特典３_到着時チェックイン有無を取得します。
     * 
     * @return びゅう特典３_到着時チェックイン有無
     */
    public String getByu3CheckInFlg() {
        return byu3CheckInFlg;
    }

    /**
     * びゅう特典３_特記事項を取得します。
     * 
     * @return びゅう特典３_特記事項
     */
    public String getByu3SpCmt() {
        return byu3SpCmt;
    }

    /**
     * びゅう特典４_お帰りまで利用有無を取得します。
     * 
     * @return びゅう特典４_お帰りまで利用有無
     */
    public String getByu4ReturnFlg() {
        return byu4ReturnFlg;
    }

    /**
     * びゅう特典４_特記事項を取得します。
     * 
     * @return びゅう特典４_特記事項
     */
    public String getByu4SpCmt() {
        return byu4SpCmt;
    }

    /**
     * びゅう特典５_チェックイン前を取得します。
     * 
     * @return びゅう特典５_チェックイン前
     */
    public String getByu5CheckIn() {
        return byu5CheckIn;
    }

    /**
     * びゅう特典５_チェックアウト後を取得します。
     * 
     * @return びゅう特典５_チェックアウト後
     */
    public String getByu5CheckOut() {
        return byu5CheckOut;
    }

    /**
     * びゅう特典５_無料入浴有無を取得します。
     * 
     * @return びゅう特典５_無料入浴有無
     */
    public String getByu5FreeBathFlg() {
        return byu5FreeBathFlg;
    }

    /**
     * びゅう特典５_特記事項を取得します。
     * 
     * @return びゅう特典５_特記事項
     */
    public String getByu5SpCmt() {
        return byu5SpCmt;
    }

    /**
     * びゅう特典５_タオル貸出を取得します。
     * 
     * @return びゅう特典５_タオル貸出
     */
    public String getByu5Towel() {
        return byu5Towel;
    }

    /**
     * びゅう特典５_タオル貸出金額を取得します。
     * 
     * @return びゅう特典５_タオル貸出金額
     */
    public String getByu5TowelCharge() {
        return byu5TowelCharge;
    }

    /**
     * びゅう特典６_2泊目有無を取得します。
     * 
     * @return びゅう特典６_2泊目有無
     */
    public String getByu62daysFlg() {
        return byu62daysFlg;
    }

    /**
     * びゅう特典６_内容を取得します。
     * 
     * @return びゅう特典６_内容
     */
    public String getByu6Content() {
        return byu6Content;
    }

    /**
     * びゅう特典６_ファミリーサービス有無を取得します。
     * 
     * @return びゅう特典６_ファミリーサービス有無
     */
    public String getByu6FamilyFlg() {
        return byu6FamilyFlg;
    }

    /**
     * びゅう特典７_2泊目有無を取得します。
     * 
     * @return びゅう特典７_2泊目有無
     */
    public String getByu72daysFlg() {
        return byu72daysFlg;
    }

    /**
     * びゅう特典７_内容を取得します。
     * 
     * @return びゅう特典７_内容
     */
    public String getByu7Content() {
        return byu7Content;
    }

    /**
     * びゅう特典７_レディースサービス有無を取得します。
     * 
     * @return びゅう特典７_レディースサービス有無
     */
    public String getByu7LadysFlg() {
        return byu7LadysFlg;
    }

    /**
     * びゅう特典８_2泊目有無を取得します。
     * 
     * @return びゅう特典８_2泊目有無
     */
    public String getByu82daysFlg() {
        return byu82daysFlg;
    }

    /**
     * びゅう特典８_内容を取得します。
     * 
     * @return びゅう特典８_内容
     */
    public String getByu8Content() {
        return byu8Content;
    }

    /**
     * びゅう特典８_カップルサービス有無を取得します。
     * 
     * @return びゅう特典８_カップルサービス有無
     */
    public String getByu8CoupleFlg() {
        return byu8CoupleFlg;
    }

    /**
     * びゅう特典９_2泊目有無を取得します。
     * 
     * @return びゅう特典９_2泊目有無
     */
    public String getByu92daysFlg() {
        return byu92daysFlg;
    }

    /**
     * びゅう特典９_内容を取得します。
     * 
     * @return びゅう特典９_内容
     */
    public String getByu9Content() {
        return byu9Content;
    }

    /**
     * びゅう特典９_グループサービス有無を取得します。
     * 
     * @return びゅう特典９_グループサービス有無
     */
    public String getByu9GroupFlg() {
        return byu9GroupFlg;
    }

    /**
     * びゅう特典９_人数を取得します。
     * 
     * @return びゅう特典９_人数
     */
    public String getByu9Num() {
        return byu9Num;
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
     * 企画回答連番を取得します。
     * 
     * @return 企画回答連番
     */
    public long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * びゅう特典１０_2泊目有無を設定します。
     * 
     * @param byu102daysFlg
     *            びゅう特典１０_2泊目有無
     */
    public void setByu102daysFlg(String byu102daysFlg) {
        this.byu102daysFlg = byu102daysFlg;
    }

    /**
     * びゅう特典１０_内容を設定します。
     * 
     * @param byu10Content
     *            びゅう特典１０_内容
     */
    public void setByu10Content(String byu10Content) {
        this.byu10Content = byu10Content;
    }

    /**
     * びゅう特典１０_無料サービス有無を設定します。
     * 
     * @param byu10FreeFlg
     *            びゅう特典１０_無料サービス有無
     */
    public void setByu10FreeFlg(String byu10FreeFlg) {
        this.byu10FreeFlg = byu10FreeFlg;
    }

    /**
     * びゅう特典１１_2泊目有無を設定します。
     * 
     * @param byu112daysFlg
     *            びゅう特典１１_2泊目有無
     */
    public void setByu112daysFlg(String byu112daysFlg) {
        this.byu112daysFlg = byu112daysFlg;
    }

    /**
     * びゅう特典１１_内容を設定します。
     * 
     * @param byu11Content
     *            びゅう特典１１_内容
     */
    public void setByu11Content(String byu11Content) {
        this.byu11Content = byu11Content;
    }

    /**
     * びゅう特典１１_割引サービス有無を設定します。
     * 
     * @param byu11DiscountFlg
     *            びゅう特典１１_割引サービス有無
     */
    public void setByu11DiscountFlg(String byu11DiscountFlg) {
        this.byu11DiscountFlg = byu11DiscountFlg;
    }

    /**
     * びゅう特典１２_2泊目有無を設定します。
     * 
     * @param byu122daysFlg
     *            びゅう特典１２_2泊目有無
     */
    public void setByu122daysFlg(String byu122daysFlg) {
        this.byu122daysFlg = byu122daysFlg;
    }

    /**
     * びゅう特典１２_金額を設定します。
     * 
     * @param byu12Charge
     *            びゅう特典１２_金額
     */
    public void setByu12Charge(String byu12Charge) {
        this.byu12Charge = byu12Charge;
    }

    /**
     * びゅう特典１２_食事券有無を設定します。
     * 
     * @param byu12TicketFlg
     *            びゅう特典１２_食事券有無
     */
    public void setByu12TicketFlg(String byu12TicketFlg) {
        this.byu12TicketFlg = byu12TicketFlg;
    }

    /**
     * びゅう特典１２_利用箇所を設定します。
     * 
     * @param byu12UsePlace
     *            びゅう特典１２_利用箇所
     */
    public void setByu12UsePlace(String byu12UsePlace) {
        this.byu12UsePlace = byu12UsePlace;
    }

    /**
     * びゅう特典１３_その他内容を設定します。
     * 
     * @param byu13OtherContent
     *            びゅう特典１３_その他内容
     */
    public void setByu13OtherContent(String byu13OtherContent) {
        this.byu13OtherContent = byu13OtherContent;
    }

    /**
     * びゅう特典１４_変更方法を設定します。
     * 
     * @param byu14Change
     *            びゅう特典１４_変更方法
     */
    public void setByu14Change(String byu14Change) {
        this.byu14Change = byu14Change;
    }

    /**
     * びゅう特典１４_館内金額_おとなを設定します。
     * 
     * @param byu14Charge1Adult
     *            びゅう特典１４_館内金額_おとな
     */
    public void setByu14Charge1Adult(String byu14Charge1Adult) {
        this.byu14Charge1Adult = byu14Charge1Adult;
    }

    /**
     * びゅう特典１４_館内金額_こどもを設定します。
     * 
     * @param byu14Charge1Child
     *            びゅう特典１４_館内金額_こども
     */
    public void setByu14Charge1Child(String byu14Charge1Child) {
        this.byu14Charge1Child = byu14Charge1Child;
    }

    /**
     * びゅう特典１４_スクール金額_おとなを設定します。
     * 
     * @param byu14Charge2Adult
     *            びゅう特典１４_スクール金額_おとな
     */
    public void setByu14Charge2Adult(String byu14Charge2Adult) {
        this.byu14Charge2Adult = byu14Charge2Adult;
    }

    /**
     * びゅう特典１４_スクール金額_こどもを設定します。
     * 
     * @param byu14Charge2Child
     *            びゅう特典１４_スクール金額_こども
     */
    public void setByu14Charge2Child(String byu14Charge2Child) {
        this.byu14Charge2Child = byu14Charge2Child;
    }

    /**
     * びゅう特典１４_レンタル金額_おとなを設定します。
     * 
     * @param byu14Charge3Adult
     *            びゅう特典１４_レンタル金額_おとな
     */
    public void setByu14Charge3Adult(String byu14Charge3Adult) {
        this.byu14Charge3Adult = byu14Charge3Adult;
    }

    /**
     * びゅう特典１４_レンタル金額_こどもを設定します。
     * 
     * @param byu14Charge3Child
     *            びゅう特典１４_レンタル金額_こども
     */
    public void setByu14Charge3Child(String byu14Charge3Child) {
        this.byu14Charge3Child = byu14Charge3Child;
    }

    /**
     * びゅう特典１４_その他内容を設定します。
     * 
     * @param byu14OtherContent
     *            びゅう特典１４_その他内容
     */
    public void setByu14OtherContent(String byu14OtherContent) {
        this.byu14OtherContent = byu14OtherContent;
    }

    /**
     * びゅう特典１４_滞在サービス有無を設定します。
     * 
     * @param byu14StayFlg
     *            びゅう特典１４_滞在サービス有無
     */
    public void setByu14StayFlg(String byu14StayFlg) {
        this.byu14StayFlg = byu14StayFlg;
    }

    /**
     * びゅう特典１４_利用可能施設を設定します。
     * 
     * @param byu14UsePlace
     *            びゅう特典１４_利用可能施設
     */
    public void setByu14UsePlace(String byu14UsePlace) {
        this.byu14UsePlace = byu14UsePlace;
    }

    /**
     * びゅう特典１_チェックインを設定します。
     * 
     * @param byu1CheckIn
     *            びゅう特典１_チェックイン
     */
    public void setByu1CheckIn(String byu1CheckIn) {
        this.byu1CheckIn = byu1CheckIn;
    }

    /**
     * びゅう特典１_通常チェックインを設定します。
     * 
     * @param byu1CheckInNormal
     *            びゅう特典１_通常チェックイン
     */
    public void setByu1CheckInNormal(String byu1CheckInNormal) {
        this.byu1CheckInNormal = byu1CheckInNormal;
    }

    /**
     * びゅう特典１_チェックアウトを設定します。
     * 
     * @param byu1CheckOut
     *            びゅう特典１_チェックアウト
     */
    public void setByu1CheckOut(String byu1CheckOut) {
        this.byu1CheckOut = byu1CheckOut;
    }

    /**
     * びゅう特典１_通常チェックアウトを設定します。
     * 
     * @param byu1CheckOutNormal
     *            びゅう特典１_通常チェックアウト
     */
    public void setByu1CheckOutNormal(String byu1CheckOutNormal) {
        this.byu1CheckOutNormal = byu1CheckOutNormal;
    }

    /**
     * びゅう特典２_子供半額有無を設定します。
     * 
     * @param byu2ChildHalfFlg
     *            びゅう特典２_子供半額有無
     */
    public void setByu2ChildHalfFlg(String byu2ChildHalfFlg) {
        this.byu2ChildHalfFlg = byu2ChildHalfFlg;
    }

    /**
     * びゅう特典２_食事を設定します。
     * 
     * @param byu2Meal
     *            びゅう特典２_食事
     */
    public void setByu2Meal(String byu2Meal) {
        this.byu2Meal = byu2Meal;
    }

    /**
     * びゅう特典２_食事_その他内容を設定します。
     * 
     * @param byu2OtherContent
     *            びゅう特典２_食事_その他内容
     */
    public void setByu2OtherContent(String byu2OtherContent) {
        this.byu2OtherContent = byu2OtherContent;
    }

    /**
     * びゅう特典２_特記事項を設定します。
     * 
     * @param byu2SpCmt
     *            びゅう特典２_特記事項
     */
    public void setByu2SpCmt(String byu2SpCmt) {
        this.byu2SpCmt = byu2SpCmt;
    }

    /**
     * びゅう特典３_到着時チェックイン有無を設定します。
     * 
     * @param byu3CheckInFlg
     *            びゅう特典３_到着時チェックイン有無
     */
    public void setByu3CheckInFlg(String byu3CheckInFlg) {
        this.byu3CheckInFlg = byu3CheckInFlg;
    }

    /**
     * びゅう特典３_特記事項を設定します。
     * 
     * @param byu3SpCmt
     *            びゅう特典３_特記事項
     */
    public void setByu3SpCmt(String byu3SpCmt) {
        this.byu3SpCmt = byu3SpCmt;
    }

    /**
     * びゅう特典４_お帰りまで利用有無を設定します。
     * 
     * @param byu4ReturnFlg
     *            びゅう特典４_お帰りまで利用有無
     */
    public void setByu4ReturnFlg(String byu4ReturnFlg) {
        this.byu4ReturnFlg = byu4ReturnFlg;
    }

    /**
     * びゅう特典４_特記事項を設定します。
     * 
     * @param byu4SpCmt
     *            びゅう特典４_特記事項
     */
    public void setByu4SpCmt(String byu4SpCmt) {
        this.byu4SpCmt = byu4SpCmt;
    }

    /**
     * びゅう特典５_チェックイン前を設定します。
     * 
     * @param byu5CheckIn
     *            びゅう特典５_チェックイン前
     */
    public void setByu5CheckIn(String byu5CheckIn) {
        this.byu5CheckIn = byu5CheckIn;
    }

    /**
     * びゅう特典５_チェックアウト後を設定します。
     * 
     * @param byu5CheckOut
     *            びゅう特典５_チェックアウト後
     */
    public void setByu5CheckOut(String byu5CheckOut) {
        this.byu5CheckOut = byu5CheckOut;
    }

    /**
     * びゅう特典５_無料入浴有無を設定します。
     * 
     * @param byu5FreeBathFlg
     *            びゅう特典５_無料入浴有無
     */
    public void setByu5FreeBathFlg(String byu5FreeBathFlg) {
        this.byu5FreeBathFlg = byu5FreeBathFlg;
    }

    /**
     * びゅう特典５_特記事項を設定します。
     * 
     * @param byu5SpCmt
     *            びゅう特典５_特記事項
     */
    public void setByu5SpCmt(String byu5SpCmt) {
        this.byu5SpCmt = byu5SpCmt;
    }

    /**
     * びゅう特典５_タオル貸出を設定します。
     * 
     * @param byu5Towel
     *            びゅう特典５_タオル貸出
     */
    public void setByu5Towel(String byu5Towel) {
        this.byu5Towel = byu5Towel;
    }

    /**
     * びゅう特典５_タオル貸出金額を設定します。
     * 
     * @param byu5TowelCharge
     *            びゅう特典５_タオル貸出金額
     */
    public void setByu5TowelCharge(String byu5TowelCharge) {
        this.byu5TowelCharge = byu5TowelCharge;
    }

    /**
     * びゅう特典６_2泊目有無を設定します。
     * 
     * @param byu62daysFlg
     *            びゅう特典６_2泊目有無
     */
    public void setByu62daysFlg(String byu62daysFlg) {
        this.byu62daysFlg = byu62daysFlg;
    }

    /**
     * びゅう特典６_内容を設定します。
     * 
     * @param byu6Content
     *            びゅう特典６_内容
     */
    public void setByu6Content(String byu6Content) {
        this.byu6Content = byu6Content;
    }

    /**
     * びゅう特典６_ファミリーサービス有無を設定します。
     * 
     * @param byu6FamilyFlg
     *            びゅう特典６_ファミリーサービス有無
     */
    public void setByu6FamilyFlg(String byu6FamilyFlg) {
        this.byu6FamilyFlg = byu6FamilyFlg;
    }

    /**
     * びゅう特典７_2泊目有無を設定します。
     * 
     * @param byu72daysFlg
     *            びゅう特典７_2泊目有無
     */
    public void setByu72daysFlg(String byu72daysFlg) {
        this.byu72daysFlg = byu72daysFlg;
    }

    /**
     * びゅう特典７_内容を設定します。
     * 
     * @param byu7Content
     *            びゅう特典７_内容
     */
    public void setByu7Content(String byu7Content) {
        this.byu7Content = byu7Content;
    }

    /**
     * びゅう特典７_レディースサービス有無を設定します。
     * 
     * @param byu7LadysFlg
     *            びゅう特典７_レディースサービス有無
     */
    public void setByu7LadysFlg(String byu7LadysFlg) {
        this.byu7LadysFlg = byu7LadysFlg;
    }

    /**
     * びゅう特典８_2泊目有無を設定します。
     * 
     * @param byu82daysFlg
     *            びゅう特典８_2泊目有無
     */
    public void setByu82daysFlg(String byu82daysFlg) {
        this.byu82daysFlg = byu82daysFlg;
    }

    /**
     * びゅう特典８_内容を設定します。
     * 
     * @param byu8Content
     *            びゅう特典８_内容
     */
    public void setByu8Content(String byu8Content) {
        this.byu8Content = byu8Content;
    }

    /**
     * びゅう特典８_カップルサービス有無を設定します。
     * 
     * @param byu8CoupleFlg
     *            びゅう特典８_カップルサービス有無
     */
    public void setByu8CoupleFlg(String byu8CoupleFlg) {
        this.byu8CoupleFlg = byu8CoupleFlg;
    }

    /**
     * びゅう特典９_2泊目有無を設定します。
     * 
     * @param byu92daysFlg
     *            びゅう特典９_2泊目有無
     */
    public void setByu92daysFlg(String byu92daysFlg) {
        this.byu92daysFlg = byu92daysFlg;
    }

    /**
     * びゅう特典９_内容を設定します。
     * 
     * @param byu9Content
     *            びゅう特典９_内容
     */
    public void setByu9Content(String byu9Content) {
        this.byu9Content = byu9Content;
    }

    /**
     * びゅう特典９_グループサービス有無を設定します。
     * 
     * @param byu9GroupFlg
     *            びゅう特典９_グループサービス有無
     */
    public void setByu9GroupFlg(String byu9GroupFlg) {
        this.byu9GroupFlg = byu9GroupFlg;
    }

    /**
     * びゅう特典９_人数を設定します。
     * 
     * @param byu9Num
     *            びゅう特典９_人数
     */
    public void setByu9Num(String byu9Num) {
        this.byu9Num = byu9Num;
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
     * 企画回答連番を設定します。
     * 
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

}
