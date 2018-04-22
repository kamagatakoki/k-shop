package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]施設_一般情報 エンティティ
 * 
 * <pre>
 *   機能概要 ： 
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityGeneralInfo implements FacilityManageBodyKey {

    /** 別館年数 */
    private String annexYears;

    /** 築何年有無 */
    private String buildingYearsFlg;

    /** 子供料金寝具有無 */
    private String childBeddingFreeFlg;

    /** 子供料金 */
    private String childFees;

    /** 子供料金コメント */
    private String childFeesCmt;

    /** 子供無料年齢From */
    private String childFreeAgeFrom;

    /** 子供無料年齢To */
    private String childFreeAgeTo;

    /** 子供無料条件 */
    private String childFreeCond;

    /** 子供料金有無 */
    private String childFreeFlg;

    /** 子供料金食事有無 */
    private String childMealFreeFlg;

    /** 子供有料年齢From */
    private String childPayAgeFrom;

    /** 子供有料年齢To */
    private String childPayAgeTo;

    /** 子供有料条件 */
    private String childPayCond;

    /** 利用可能クレジットカードAMEX */
    private String creditCardBrandAmex;

    /** 利用可能クレジットカードDC */
    private String creditCardBrandDc;

    /** 利用可能クレジットカードDINERS */
    private String creditCardBrandDiners;

    /** 利用可能クレジットカードJACCS */
    private String creditCardBrandJaccs;

    /** 利用可能クレジットカードJCB */
    private String creditCardBrandJcb;

    /** 利用可能クレジットカードMC */
    private String creditCardBrandMc;

    /** 利用可能クレジットカードNICOS */
    private String creditCardBrandNicos;

    /** 利用可能クレジットカードその他 */
    private String creditCardBrandOther;

    /** 利用可能クレジットカードUC */
    private String creditCardBrandUc;

    /** 利用可能クレジットカードVISA */
    private String creditCardBrandVisa;

    /** 利用可能クレジットカード有無 */
    private String creditCardFlg;

    /** 利用可能クレジットカードその他内容 */
    private String creditCardOthers;

    /** おすすめ客層_カップル */
    private String customerCouple;

    /** おすすめ客層_ファミリー */
    private String customerFamily;

    /** 客層別おすすめ有無 */
    private String customerFlg;

    /** おすすめ客層_熟年 */
    private String customerMiddle;

    /** おすすめ客層_その他 */
    private String customerOther;

    /** エレベーター有無 */
    private String elevatorFlg;

    /** 英語全員区分 */
    private String engAllDiv;

    /** 英語の出来るフロント係有無 */
    private String engFrontFlg;

    /** 英語開始時間（時間） */
    private String engTimeBeginHour;

    /** 英語開始時間（分） */
    private String engTimeBeginMinute;

    /** 英語時間区分 */
    private String engTimeDiv;

    /** 英語終了時間（時間） */
    private String engTimeEndHour;

    /** 英語終了時間（分） */
    private String engTimeEndMinute;

    /** 施設コード */
    private String facilityCd;

    /** 施設パターン */
    private String facilityPattern;

    /** チェックイン前の荷物預かり有無 */
    private String keepBaggageFlg;

    /** 回答書種別 */
    private String kindFlg;

    /** 本館年数 */
    private String mainBuildingYears;

    /** 自動マッサージ機有無 */
    private String massagerFlg;

    /** 自動マッサージ機設置場所 */
    private String massagerLocation;

    /** 自動マッサージ機台数 */
    private String massagerNum;

    /** 自動マッサージ機有料有無 */
    private String massagerPayFlg;

    /** 自動マッサージ機利用金額 */
    private String massagerUseAmt;

    /** 自動マッサージ機利用時間 */
    private String massagerUseTime;

    /** 備考 */
    private String memo;

    /** 新館年数 */
    private String newBuildingYears;

    /** その他コメント */
    private String othersCmt;

    /** 部屋まで盲導犬有無 */
    private String roomGuideDogFlg;

    /** 部屋までペット条件 */
    private String roomPetCond;

    /** 部屋までペット有無 */
    private String roomPetFlg;

    /** セールスポイント */
    private String salesPoint;

    /** 手話全員区分 */
    private String signLangAllDiv;

    /** 手話開始時間（時間） */
    private String signLangBeginHour;

    /** 手話開始時間（分） */
    private String signLangBeginMinute;

    /** 手話終了時間（時間） */
    private String signLangEndHour;

    /** 手話終了時間（分） */
    private String signLangEndMinute;

    /** 手話の出来るフロント係有無 */
    private String signLangFrontFlg;

    /** 手話時間区分 */
    private String signLangTimeDiv;

    /** おすすめコメント */
    private String suggestionCmt;

    /** 総客室数有無 */
    private String totalRoomFlg;

    /** 総客室数 */
    private String totalRoomNum;

    /** 車椅子常備有無 */
    private String wheelchairFlg;

    /** 車椅子常備台数 */
    private String wheelchairNum;

    /**
     * 別館年数を取得します。
     * 
     * @return 別館年数
     */
    public String getAnnexYears() {
        return annexYears;
    }

    /**
     * 築何年有無を取得します。
     * 
     * @return 築何年有無
     */
    public String getBuildingYearsFlg() {
        return buildingYearsFlg;
    }

    /**
     * 子供料金寝具有無を取得します。
     * 
     * @return 子供料金寝具有無
     */
    public String getChildBeddingFreeFlg() {
        return childBeddingFreeFlg;
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
     * 子供料金コメントを取得します。
     * 
     * @return 子供料金コメント
     */
    public String getChildFeesCmt() {
        return childFeesCmt;
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
     * 子供無料条件を取得します。
     * 
     * @return 子供無料条件
     */
    public String getChildFreeCond() {
        return childFreeCond;
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
     * 子供料金食事有無を取得します。
     * 
     * @return 子供料金食事有無
     */
    public String getChildMealFreeFlg() {
        return childMealFreeFlg;
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
     * 子供有料条件を取得します。
     * 
     * @return 子供有料条件
     */
    public String getChildPayCond() {
        return childPayCond;
    }

    /**
     * 利用可能クレジットカードAMEXを取得します。
     * 
     * @return 利用可能クレジットカードAMEX
     */
    public String getCreditCardBrandAmex() {
        return creditCardBrandAmex;
    }

    /**
     * 利用可能クレジットカードDCを取得します。
     * 
     * @return 利用可能クレジットカードDC
     */
    public String getCreditCardBrandDc() {
        return creditCardBrandDc;
    }

    /**
     * 利用可能クレジットカードDINERSを取得します。
     * 
     * @return 利用可能クレジットカードDINERS
     */
    public String getCreditCardBrandDiners() {
        return creditCardBrandDiners;
    }

    /**
     * 利用可能クレジットカードJACCSを取得します。
     * 
     * @return 利用可能クレジットカードJACCS
     */
    public String getCreditCardBrandJaccs() {
        return creditCardBrandJaccs;
    }

    /**
     * 利用可能クレジットカードJCBを取得します。
     * 
     * @return 利用可能クレジットカードJCB
     */
    public String getCreditCardBrandJcb() {
        return creditCardBrandJcb;
    }

    /**
     * 利用可能クレジットカードMCを取得します。
     * 
     * @return 利用可能クレジットカードMC
     */
    public String getCreditCardBrandMc() {
        return creditCardBrandMc;
    }

    /**
     * 利用可能クレジットカードNICOSを取得します。
     * 
     * @return 利用可能クレジットカードNICOS
     */
    public String getCreditCardBrandNicos() {
        return creditCardBrandNicos;
    }

    /**
     * 利用可能クレジットカードその他を取得します。
     * 
     * @return 利用可能クレジットカードその他
     */
    public String getCreditCardBrandOther() {
        return creditCardBrandOther;
    }

    /**
     * 利用可能クレジットカードUCを取得します。
     * 
     * @return 利用可能クレジットカードUC
     */
    public String getCreditCardBrandUc() {
        return creditCardBrandUc;
    }

    /**
     * 利用可能クレジットカードVISAを取得します。
     * 
     * @return 利用可能クレジットカードVISA
     */
    public String getCreditCardBrandVisa() {
        return creditCardBrandVisa;
    }

    /**
     * 利用可能クレジットカード有無を取得します。
     * 
     * @return 利用可能クレジットカード有無
     */
    public String getCreditCardFlg() {
        return creditCardFlg;
    }

    /**
     * 利用可能クレジットカードその他内容を取得します。
     * 
     * @return 利用可能クレジットカードその他内容
     */
    public String getCreditCardOthers() {
        return creditCardOthers;
    }

    /**
     * おすすめ客層_カップルを取得します。
     * 
     * @return おすすめ客層_カップル
     */
    public String getCustomerCouple() {
        return customerCouple;
    }

    /**
     * おすすめ客層_ファミリーを取得します。
     * 
     * @return おすすめ客層_ファミリー
     */
    public String getCustomerFamily() {
        return customerFamily;
    }

    /**
     * 客層別おすすめ有無を取得します。
     * 
     * @return 客層別おすすめ有無
     */
    public String getCustomerFlg() {
        return customerFlg;
    }

    /**
     * おすすめ客層_熟年を取得します。
     * 
     * @return おすすめ客層_熟年
     */
    public String getCustomerMiddle() {
        return customerMiddle;
    }

    /**
     * おすすめ客層_その他を取得します。
     * 
     * @return おすすめ客層_その他
     */
    public String getCustomerOther() {
        return customerOther;
    }

    /**
     * エレベーター有無を取得します。
     * 
     * @return エレベーター有無
     */
    public String getElevatorFlg() {
        return elevatorFlg;
    }

    /**
     * 英語全員区分を取得します。
     * 
     * @return 英語全員区分
     */
    public String getEngAllDiv() {
        return engAllDiv;
    }

    /**
     * 英語の出来るフロント係有無を取得します。
     * 
     * @return 英語の出来るフロント係有無
     */
    public String getEngFrontFlg() {
        return engFrontFlg;
    }

    /**
     * 英語開始時間を取得します。
     * 
     * @return 英語開始時間
     */
    public String getEngTimeBegin() {
        return DKikakuWebUtil.buildTime(getEngTimeBeginHour(),
                getEngTimeBeginMinute());
    }

    /**
     * 英語開始時間（時間）を取得します。
     * 
     * @return 英語開始時間（時間）
     */
    public String getEngTimeBeginHour() {
        return engTimeBeginHour;
    }

    /**
     * 英語開始時間（分）を取得します。
     * 
     * @return 英語開始時間（分）
     */
    public String getEngTimeBeginMinute() {
        return engTimeBeginMinute;
    }

    /**
     * 英語時間区分を取得します。
     * 
     * @return 英語時間区分
     */
    public String getEngTimeDiv() {
        return engTimeDiv;
    }

    /**
     * 英語終了時間を取得します。
     * 
     * @return 英語終了時間
     */
    public String getEngTimeEnd() {
        return DKikakuWebUtil.buildTime(getEngTimeEndHour(),
                getEngTimeEndMinute());
    }

    /**
     * 英語終了時間（時間）を取得します。
     * 
     * @return 英語終了時間（時間）
     */
    public String getEngTimeEndHour() {
        return engTimeEndHour;
    }

    /**
     * 英語終了時間（分）を取得します。
     * 
     * @return 英語終了時間（分）
     */
    public String getEngTimeEndMinute() {
        return engTimeEndMinute;
    }

    /**
     * 施設コードを取得します。
     * 
     * @return 施設コード
     */
    @Override
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設パターンを取得します。
     * 
     * @return 施設パターン
     */
    @Override
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * チェックイン前の荷物預かり有無を取得します。
     * 
     * @return チェックイン前の荷物預かり有無
     */
    public String getKeepBaggageFlg() {
        return keepBaggageFlg;
    }

    /**
     * 回答書種別を取得します。
     * 
     * @return 回答書種別
     */
    @Override
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * 本館年数を取得します。
     * 
     * @return 本館年数
     */
    public String getMainBuildingYears() {
        return mainBuildingYears;
    }

    /**
     * 自動マッサージ機有無を取得します。
     * 
     * @return 自動マッサージ機有無
     */
    public String getMassagerFlg() {
        return massagerFlg;
    }

    /**
     * 自動マッサージ機設置場所を取得します。
     * 
     * @return 自動マッサージ機設置場所
     */
    public String getMassagerLocation() {
        return massagerLocation;
    }

    /**
     * 自動マッサージ機台数を取得します。
     * 
     * @return 自動マッサージ機台数
     */
    public String getMassagerNum() {
        return massagerNum;
    }

    /**
     * 自動マッサージ機有料有無を取得します。
     * 
     * @return 自動マッサージ機有料有無
     */
    public String getMassagerPayFlg() {
        return massagerPayFlg;
    }

    /**
     * 自動マッサージ機利用金額を取得します。
     * 
     * @return 自動マッサージ機利用金額
     */
    public String getMassagerUseAmt() {
        return massagerUseAmt;
    }

    /**
     * 自動マッサージ機利用時間を取得します。
     * 
     * @return 自動マッサージ機利用時間
     */
    public String getMassagerUseTime() {
        return massagerUseTime;
    }

    /**
     * 備考を取得します。
     * 
     * @return 備考
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 新館年数を取得します。
     * 
     * @return 新館年数
     */
    public String getNewBuildingYears() {
        return newBuildingYears;
    }

    /**
     * その他コメントを取得します。
     * 
     * @return その他コメント
     */
    public String getOthersCmt() {
        return othersCmt;
    }

    /**
     * 部屋まで盲導犬有無を取得します。
     * 
     * @return 部屋まで盲導犬有無
     */
    public String getRoomGuideDogFlg() {
        return roomGuideDogFlg;
    }

    /**
     * 部屋までペット条件を取得します。
     * 
     * @return 部屋までペット条件
     */
    public String getRoomPetCond() {
        return roomPetCond;
    }

    /**
     * 部屋までペット有無を取得します。
     * 
     * @return 部屋までペット有無
     */
    public String getRoomPetFlg() {
        return roomPetFlg;
    }

    /**
     * セールスポイントを取得します。
     * 
     * @return セールスポイント
     */
    public String getSalesPoint() {
        return salesPoint;
    }

    /**
     * 手話全員区分を取得します。
     * 
     * @return 手話全員区分
     */
    public String getSignLangAllDiv() {
        return signLangAllDiv;
    }

    /**
     * 手話開始時間を取得します。
     * 
     * @return 手話開始時間
     */
    public String getSignLangBegin() {
        return DKikakuWebUtil.buildTime(getSignLangBeginHour(),
                getSignLangBeginMinute());
    }

    /**
     * 手話開始時間（時間）を取得します。
     * 
     * @return 手話開始時間（時間）
     */
    public String getSignLangBeginHour() {
        return signLangBeginHour;
    }

    /**
     * 手話開始時間（分）を取得します。
     * 
     * @return 手話開始時間（分）
     */
    public String getSignLangBeginMinute() {
        return signLangBeginMinute;
    }

    /**
     * 手話終了時間を取得します。
     * 
     * @return 手話終了時間
     */
    public String getSignLangEnd() {
        return DKikakuWebUtil.buildTime(getSignLangEndHour(),
                getSignLangEndMinute());
    }

    /**
     * 手話終了時間（時間）を取得します。
     * 
     * @return 手話終了時間（時間）
     */
    public String getSignLangEndHour() {
        return signLangEndHour;
    }

    /**
     * 手話終了時間（分）を取得します。
     * 
     * @return 手話終了時間（分）
     */
    public String getSignLangEndMinute() {
        return signLangEndMinute;
    }

    /**
     * 手話の出来るフロント係有無を取得します。
     * 
     * @return 手話の出来るフロント係有無
     */
    public String getSignLangFrontFlg() {
        return signLangFrontFlg;
    }

    /**
     * 手話時間区分を取得します。
     * 
     * @return 手話時間区分
     */
    public String getSignLangTimeDiv() {
        return signLangTimeDiv;
    }

    /**
     * おすすめコメントを取得します。
     * 
     * @return おすすめコメント
     */
    public String getSuggestionCmt() {
        return suggestionCmt;
    }

    /**
     * 総客室数有無を取得します。
     * 
     * @return 総客室数有無
     */
    public String getTotalRoomFlg() {
        return totalRoomFlg;
    }

    /**
     * 総客室数を取得します。
     * 
     * @return 総客室数
     */
    public String getTotalRoomNum() {
        return totalRoomNum;
    }

    /**
     * 車椅子常備有無を取得します。
     * 
     * @return 車椅子常備有無
     */
    public String getWheelchairFlg() {
        return wheelchairFlg;
    }

    /**
     * 車椅子常備台数を取得します。
     * 
     * @return 車椅子常備台数
     */
    public String getWheelchairNum() {
        return wheelchairNum;
    }

    /**
     * 別館年数を設定します。
     * 
     * @param annexYears
     *            別館年数
     */
    public void setAnnexYears(String annexYears) {
        this.annexYears = annexYears;
    }

    /**
     * 築何年有無を設定します。
     * 
     * @param buildingYearsFlg
     *            築何年有無
     */
    public void setBuildingYearsFlg(String buildingYearsFlg) {
        this.buildingYearsFlg = buildingYearsFlg;
    }

    /**
     * 子供料金寝具有無を設定します。
     * 
     * @param childBeddingFreeFlg
     *            子供料金寝具有無
     */
    public void setChildBeddingFreeFlg(String childBeddingFreeFlg) {
        this.childBeddingFreeFlg = childBeddingFreeFlg;
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
     * 子供料金コメントを設定します。
     * 
     * @param childFeesCmt
     *            子供料金コメント
     */
    public void setChildFeesCmt(String childFeesCmt) {
        this.childFeesCmt = childFeesCmt;
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
     * 子供無料条件を設定します。
     * 
     * @param childFreeCond
     *            子供無料条件
     */
    public void setChildFreeCond(String childFreeCond) {
        this.childFreeCond = childFreeCond;
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
     * 子供料金食事有無を設定します。
     * 
     * @param childMealFreeFlg
     *            子供料金食事有無
     */
    public void setChildMealFreeFlg(String childMealFreeFlg) {
        this.childMealFreeFlg = childMealFreeFlg;
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
     * 子供有料条件を設定します。
     * 
     * @param childPayCond
     *            子供有料条件
     */
    public void setChildPayCond(String childPayCond) {
        this.childPayCond = childPayCond;
    }

    /**
     * 利用可能クレジットカードAMEXを設定します。
     * 
     * @param creditCardBrandAmex
     *            利用可能クレジットカードAMEX
     */
    public void setCreditCardBrandAmex(String creditCardBrandAmex) {
        this.creditCardBrandAmex = creditCardBrandAmex;
    }

    /**
     * 利用可能クレジットカードDCを設定します。
     * 
     * @param creditCardBrandDc
     *            利用可能クレジットカードDC
     */
    public void setCreditCardBrandDc(String creditCardBrandDc) {
        this.creditCardBrandDc = creditCardBrandDc;
    }

    /**
     * 利用可能クレジットカードDINERSを設定します。
     * 
     * @param creditCardBrandDiners
     *            利用可能クレジットカードDINERS
     */
    public void setCreditCardBrandDiners(String creditCardBrandDiners) {
        this.creditCardBrandDiners = creditCardBrandDiners;
    }

    /**
     * 利用可能クレジットカードJACCSを設定します。
     * 
     * @param creditCardBrandJaccs
     *            利用可能クレジットカードJACCS
     */
    public void setCreditCardBrandJaccs(String creditCardBrandJaccs) {
        this.creditCardBrandJaccs = creditCardBrandJaccs;
    }

    /**
     * 利用可能クレジットカードJCBを設定します。
     * 
     * @param creditCardBrandJcb
     *            利用可能クレジットカードJCB
     */
    public void setCreditCardBrandJcb(String creditCardBrandJcb) {
        this.creditCardBrandJcb = creditCardBrandJcb;
    }

    /**
     * 利用可能クレジットカードMCを設定します。
     * 
     * @param creditCardBrandMc
     *            利用可能クレジットカードMC
     */
    public void setCreditCardBrandMc(String creditCardBrandMc) {
        this.creditCardBrandMc = creditCardBrandMc;
    }

    /**
     * 利用可能クレジットカードNICOSを設定します。
     * 
     * @param creditCardBrandNicos
     *            利用可能クレジットカードNICOS
     */
    public void setCreditCardBrandNicos(String creditCardBrandNicos) {
        this.creditCardBrandNicos = creditCardBrandNicos;
    }

    /**
     * 利用可能クレジットカードその他を設定します。
     * 
     * @param creditCardBrandOther
     *            利用可能クレジットカードその他
     */
    public void setCreditCardBrandOther(String creditCardBrandOther) {
        this.creditCardBrandOther = creditCardBrandOther;
    }

    /**
     * 利用可能クレジットカードUCを設定します。
     * 
     * @param creditCardBrandUc
     *            利用可能クレジットカードUC
     */
    public void setCreditCardBrandUc(String creditCardBrandUc) {
        this.creditCardBrandUc = creditCardBrandUc;
    }

    /**
     * 利用可能クレジットカードVISAを設定します。
     * 
     * @param creditCardBrandVisa
     *            利用可能クレジットカードVISA
     */
    public void setCreditCardBrandVisa(String creditCardBrandVisa) {
        this.creditCardBrandVisa = creditCardBrandVisa;
    }

    /**
     * 利用可能クレジットカード有無を設定します。
     * 
     * @param creditCardFlg
     *            利用可能クレジットカード有無
     */
    public void setCreditCardFlg(String creditCardFlg) {
        this.creditCardFlg = creditCardFlg;
    }

    /**
     * 利用可能クレジットカードその他内容を設定します。
     * 
     * @param creditCardOthers
     *            利用可能クレジットカードその他内容
     */
    public void setCreditCardOthers(String creditCardOthers) {
        this.creditCardOthers = creditCardOthers;
    }

    /**
     * おすすめ客層_カップルを設定します。
     * 
     * @param customerCouple
     *            おすすめ客層_カップル
     */
    public void setCustomerCouple(String customerCouple) {
        this.customerCouple = customerCouple;
    }

    /**
     * おすすめ客層_ファミリーを設定します。
     * 
     * @param customerFamily
     *            おすすめ客層_ファミリー
     */
    public void setCustomerFamily(String customerFamily) {
        this.customerFamily = customerFamily;
    }

    /**
     * 客層別おすすめ有無を設定します。
     * 
     * @param customerFlg
     *            客層別おすすめ有無
     */
    public void setCustomerFlg(String customerFlg) {
        this.customerFlg = customerFlg;
    }

    /**
     * おすすめ客層_熟年を設定します。
     * 
     * @param customerMiddle
     *            おすすめ客層_熟年
     */
    public void setCustomerMiddle(String customerMiddle) {
        this.customerMiddle = customerMiddle;
    }

    /**
     * おすすめ客層_その他を設定します。
     * 
     * @param customerOther
     *            おすすめ客層_その他
     */
    public void setCustomerOther(String customerOther) {
        this.customerOther = customerOther;
    }

    /**
     * エレベーター有無を設定します。
     * 
     * @param elevatorFlg
     *            エレベーター有無
     */
    public void setElevatorFlg(String elevatorFlg) {
        this.elevatorFlg = elevatorFlg;
    }

    /**
     * 英語全員区分を設定します。
     * 
     * @param engAllDiv
     *            英語全員区分
     */
    public void setEngAllDiv(String engAllDiv) {
        this.engAllDiv = engAllDiv;
    }

    /**
     * 英語の出来るフロント係有無を設定します。
     * 
     * @param engFrontFlg
     *            英語の出来るフロント係有無
     */
    public void setEngFrontFlg(String engFrontFlg) {
        this.engFrontFlg = engFrontFlg;
    }

    /**
     * 英語開始時間を設定します。
     * 
     * @param engTimeBegin
     *            英語開始時間
     */
    public void setEngTimeBegin(String engTimeBegin) {
        setEngTimeBeginHour(DKikakuWebUtil.getHourFormTime(engTimeBegin));
        setEngTimeBeginMinute(DKikakuWebUtil.getMinuteFromTime(engTimeBegin));
    }

    /**
     * 英語開始時間（時間）を設定します。
     * 
     * @param engTimeBeginHour
     *            英語開始時間（時間）
     */
    public void setEngTimeBeginHour(String engTimeBeginHour) {
        this.engTimeBeginHour = engTimeBeginHour;
    }

    /**
     * 英語開始時間（分）を設定します。
     * 
     * @param engTimeBeginMinute
     *            英語開始時間（分）
     */
    public void setEngTimeBeginMinute(String engTimeBeginMinute) {
        this.engTimeBeginMinute = engTimeBeginMinute;
    }

    /**
     * 英語時間区分を設定します。
     * 
     * @param engTimeDiv
     *            英語時間区分
     */
    public void setEngTimeDiv(String engTimeDiv) {
        this.engTimeDiv = engTimeDiv;
    }

    /**
     * 英語終了時間を設定します。
     * 
     * @param engTimeEnd
     *            英語終了時間
     */
    public void setEngTimeEnd(String engTimeEnd) {
        setEngTimeEndHour(DKikakuWebUtil.getHourFormTime(engTimeEnd));
        setEngTimeEndMinute(DKikakuWebUtil.getMinuteFromTime(engTimeEnd));
    }

    /**
     * 英語終了時間（時間）を設定します。
     * 
     * @param engTimeEndHour
     *            英語終了時間（時間）
     */
    public void setEngTimeEndHour(String engTimeEndHour) {
        this.engTimeEndHour = engTimeEndHour;
    }

    /**
     * 英語終了時間（分）を設定します。
     * 
     * @param engTimeEndMinute
     *            英語終了時間（分）
     */
    public void setEngTimeEndMinute(String engTimeEndMinute) {
        this.engTimeEndMinute = engTimeEndMinute;
    }

    /**
     * 施設コードを設定します。
     * 
     * @param facilityCd
     *            施設コード
     */
    @Override
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 施設パターンを設定します。
     * 
     * @param facilityPattern
     *            施設パターン
     */
    @Override
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * チェックイン前の荷物預かり有無を設定します。
     * 
     * @param keepBaggageFlg
     *            チェックイン前の荷物預かり有無
     */
    public void setKeepBaggageFlg(String keepBaggageFlg) {
        this.keepBaggageFlg = keepBaggageFlg;
    }

    /**
     * 回答書種別を設定します。
     * 
     * @param kindFlg
     *            回答書種別
     */
    @Override
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * 本館年数を設定します。
     * 
     * @param mainBuildingYears
     *            本館年数
     */
    public void setMainBuildingYears(String mainBuildingYears) {
        this.mainBuildingYears = mainBuildingYears;
    }

    /**
     * 自動マッサージ機有無を設定します。
     * 
     * @param massagerFlg
     *            自動マッサージ機有無
     */
    public void setMassagerFlg(String massagerFlg) {
        this.massagerFlg = massagerFlg;
    }

    /**
     * 自動マッサージ機設置場所を設定します。
     * 
     * @param massagerLocation
     *            自動マッサージ機設置場所
     */
    public void setMassagerLocation(String massagerLocation) {
        this.massagerLocation = massagerLocation;
    }

    /**
     * 自動マッサージ機台数を設定します。
     * 
     * @param massagerNum
     *            自動マッサージ機台数
     */
    public void setMassagerNum(String massagerNum) {
        this.massagerNum = massagerNum;
    }

    /**
     * 自動マッサージ機有料有無を設定します。
     * 
     * @param massagerPayFlg
     *            自動マッサージ機有料有無
     */
    public void setMassagerPayFlg(String massagerPayFlg) {
        this.massagerPayFlg = massagerPayFlg;
    }

    /**
     * 自動マッサージ機利用金額を設定します。
     * 
     * @param massagerUseAmt
     *            自動マッサージ機利用金額
     */
    public void setMassagerUseAmt(String massagerUseAmt) {
        this.massagerUseAmt = massagerUseAmt;
    }

    /**
     * 自動マッサージ機利用時間を設定します。
     * 
     * @param massagerUseTime
     *            自動マッサージ機利用時間
     */
    public void setMassagerUseTime(String massagerUseTime) {
        this.massagerUseTime = massagerUseTime;
    }

    /**
     * 備考を設定します。
     * 
     * @param memo
     *            備考
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 新館年数を設定します。
     * 
     * @param newBuildingYears
     *            新館年数
     */
    public void setNewBuildingYears(String newBuildingYears) {
        this.newBuildingYears = newBuildingYears;
    }

    /**
     * その他コメントを設定します。
     * 
     * @param othersCmt
     *            その他コメント
     */
    public void setOthersCmt(String othersCmt) {
        this.othersCmt = othersCmt;
    }

    /**
     * 部屋まで盲導犬有無を設定します。
     * 
     * @param roomGuideDogFlg
     *            部屋まで盲導犬有無
     */
    public void setRoomGuideDogFlg(String roomGuideDogFlg) {
        this.roomGuideDogFlg = roomGuideDogFlg;
    }

    /**
     * 部屋までペット条件を設定します。
     * 
     * @param roomPetCond
     *            部屋までペット条件
     */
    public void setRoomPetCond(String roomPetCond) {
        this.roomPetCond = roomPetCond;
    }

    /**
     * 部屋までペット有無を設定します。
     * 
     * @param roomPetFlg
     *            部屋までペット有無
     */
    public void setRoomPetFlg(String roomPetFlg) {
        this.roomPetFlg = roomPetFlg;
    }

    /**
     * セールスポイントを設定します。
     * 
     * @param salesPoint
     *            セールスポイント
     */
    public void setSalesPoint(String salesPoint) {
        this.salesPoint = salesPoint;
    }

    /**
     * 手話全員区分を設定します。
     * 
     * @param signLangAllDiv
     *            手話全員区分
     */
    public void setSignLangAllDiv(String signLangAllDiv) {
        this.signLangAllDiv = signLangAllDiv;
    }

    /**
     * 手話開始時間を設定します。
     * 
     * @param signLangBegin
     *            手話開始時間
     */
    public void setSignLangBegin(String signLangBegin) {
        setSignLangBeginHour(DKikakuWebUtil.getHourFormTime(signLangBegin));
        setSignLangBeginMinute(DKikakuWebUtil.getMinuteFromTime(signLangBegin));
    }

    /**
     * 手話開始時間（時間）を設定します。
     * 
     * @param signLangBeginHour
     *            手話開始時間（時間）
     */
    public void setSignLangBeginHour(String signLangBeginHour) {
        this.signLangBeginHour = signLangBeginHour;
    }

    /**
     * 手話開始時間（分）を設定します。
     * 
     * @param signLangBeginMinute
     *            手話開始時間（分）
     */
    public void setSignLangBeginMinute(String signLangBeginMinute) {
        this.signLangBeginMinute = signLangBeginMinute;
    }

    /**
     * 手話終了時間を設定します。
     * 
     * @param signLangEnd
     *            手話終了時間
     */
    public void setSignLangEnd(String signLangEnd) {
        setSignLangEndHour(DKikakuWebUtil.getHourFormTime(signLangEnd));
        setSignLangEndMinute(DKikakuWebUtil.getMinuteFromTime(signLangEnd));
    }

    /**
     * 手話終了時間（時間）を設定します。
     * 
     * @param signLangEndHour
     *            手話終了時間（時間）
     */
    public void setSignLangEndHour(String signLangEndHour) {
        this.signLangEndHour = signLangEndHour;
    }

    /**
     * 手話終了時間（分）を設定します。
     * 
     * @param signLangEndMinute
     *            手話終了時間（分）
     */
    public void setSignLangEndMinute(String signLangEndMinute) {
        this.signLangEndMinute = signLangEndMinute;
    }

    /**
     * 手話の出来るフロント係有無を設定します。
     * 
     * @param signLangFrontFlg
     *            手話の出来るフロント係有無
     */
    public void setSignLangFrontFlg(String signLangFrontFlg) {
        this.signLangFrontFlg = signLangFrontFlg;
    }

    /**
     * 手話時間区分を設定します。
     * 
     * @param signLangTimeDiv
     *            手話時間区分
     */
    public void setSignLangTimeDiv(String signLangTimeDiv) {
        this.signLangTimeDiv = signLangTimeDiv;
    }

    /**
     * おすすめコメントを設定します。
     * 
     * @param suggestionCmt
     *            おすすめコメント
     */
    public void setSuggestionCmt(String suggestionCmt) {
        this.suggestionCmt = suggestionCmt;
    }

    /**
     * 総客室数有無を設定します。
     * 
     * @param totalRoomFlg
     *            総客室数有無
     */
    public void setTotalRoomFlg(String totalRoomFlg) {
        this.totalRoomFlg = totalRoomFlg;
    }

    /**
     * 総客室数を設定します。
     * 
     * @param totalRoomNum
     *            総客室数
     */
    public void setTotalRoomNum(String totalRoomNum) {
        this.totalRoomNum = totalRoomNum;
    }

    /**
     * 車椅子常備有無を設定します。
     * 
     * @param wheelchairFlg
     *            車椅子常備有無
     */
    public void setWheelchairFlg(String wheelchairFlg) {
        this.wheelchairFlg = wheelchairFlg;
    }

    /**
     * 車椅子常備台数を設定します。
     * 
     * @param wheelchairNum
     *            車椅子常備台数
     */
    public void setWheelchairNum(String wheelchairNum) {
        this.wheelchairNum = wheelchairNum;
    }

}
