package jp.co.jreast.ur00400.data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsData;

/**
 * 画面送信するとき使うデータクラス。.
 * 
 * <pre>
 *  機能概要　：画面送信するとき使うデータクラス .
 *  特記事項　：なし
 * </pre>
 * 
 * @author 忻兆君
 */
public class UR00400ListInData implements InData {

    /**
     * 送信コメント .
     */
    private String cmtTmpl;

    /**
     * 選択Disabledフラグ.
     */
    private String disabledFlg;

    /**
     * メール送信エラーフラグ .
     */
    private boolean mailError;

    /**
     * 食事条件
     */
    private String mealCondNm;

    /**
     * No1Disabledフラグ.
     */
    private String no1DisabledFlg;

    /**
     * No1ボタンのフラグ .
     */
    private String no1Flag;

    /**
     * No2Disabledフラグ.
     */
    private String no2DisabledFlg;

    /**
     * No2ボタンのフラグ .
     */
    private String no2Flag;

    /**
     * No3Disabledフラグ.
     */
    private String no3DisabledFlg;

    /**
     * No3ボタンのフラグ .
     */
    private String no3Flag;

    /**
     * No4Disabledフラグ.
     */
    private String no4DisabledFlg;

    /**
     * No4ボタンのフラグ .
     */
    private String no4Flag;

    /**
     * No5Disabledフラグ.
     */
    private String no5DisabledFlg;

    /**
     * No5ボタンのフラグ .
     */
    private String no5Flag;

    /**
     * 企画回答書データ .
     */
    private PlanAnsData planAnsData;

    /**
     * 部屋タイプ5
     */
    private String roomTypeFive;

    /**
     * 部屋タイプ4
     */
    private String roomTypeFour;

    //PDF作成処理修正(No2、No3、No5対応) 2010/02/17 add by s30873 =====E n d
    //=======================START 部屋タイプと食事条件表示ため、変数追加　s30873 =======================
    /**
     * 部屋タイプ1
     */
    private String roomTypeOne;

    /**
     * 部屋タイプ6
     */
    private String roomTypeSix;

    /**
     * 部屋タイプ3
     */
    private String roomTypeThree;

    /**
     * 部屋タイプ2
     */
    private String roomTypeTwo;

    /**
     * 　選択のフラグ .
     */
    private String selectFlag;

    /**
     * コンストラクター
     * 　データ初期化する .
     */
    public UR00400ListInData() {
        planAnsData = new PlanAnsData();
        selectFlag = JreConstants.FLG_TRUE;
        no1Flag = JreConstants.FLG_TRUE;
        no2Flag = JreConstants.FLG_TRUE;
        no3Flag = JreConstants.FLG_TRUE;
        no4Flag = JreConstants.FLG_TRUE;
        no5Flag = JreConstants.FLG_TRUE;
        disabledFlg = JreConstants.FLG_TRUE;
        no1DisabledFlg = JreConstants.FLG_TRUE;
        no2DisabledFlg = JreConstants.FLG_TRUE;
        no3DisabledFlg = JreConstants.FLG_TRUE;
        no4DisabledFlg = JreConstants.FLG_TRUE;
        no5DisabledFlg = JreConstants.FLG_TRUE;
        mailError = false;
    }

    /**
     * @return String 回答書送付先
     */
    public String getAnsSendAddr() {
        return planAnsData.getAnsSendAddr();
    }

    /**
     * @return 支社コード
     */
    public String getBranchCd() {
        return planAnsData.getBranchCd();
    }

    /**
     * @return 支社名称
     */
    public String getBranchName() {

        return planAnsData.getBranchName();
    }

    /**
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return planAnsData.getCareerNo();
    }

    /**
     * @return cmtTmpl 送信コメント
     */
    public String getCmtTmpl() {
        return cmtTmpl;
    }

    /**
     * @return Returns the disabledFlg.
     */
    public String getDisabledFlg() {
        return disabledFlg;
    }

    /**
     * @return 施設コード
     */
    public String getFacilityCd() {
        return planAnsData.getFacilityCd();
    }

    /**
     * @return 施設名称
     */
    public String getFacilityNm() {
        return planAnsData.getFacilityNm();
    }

    /**
     * 前４枚施設コードを取得する .
     * 
     * @return 前４枚施設コード
     */
    public String getFourFacilityCd() {
        return planAnsData.getFourFacilityCd();
    }

    /**
     * @return 商品名称
     */
    public String getGoodsNm() {
        return planAnsData.getGoodsNm();
    }

    /**
     * @return kindFlg 種別
     */
    public String getKindFlg() {
        return planAnsData.getKindFlg();
    }

    /**
     * @return メール送信エラーフラグ
     */
    public boolean getMailError() {
        return mailError;
    }

    /**
     * @return 素材種別
     * @see jp.co.jreast.common.data.PlanAnsBaseData#getMaterialKind()
     */
    public String getMaterialKind() {
        return planAnsData.getMaterialKind();
    }

    /**
     * @return 素材種別名
     * @see jp.co.jreast.common.data.PlanAnsBaseData#getMaterialKindName()
     */
    public String getMaterialKindName() {
        return planAnsData.getMaterialKindName();
    }

    /**
     * @return mealCondNm
     */
    public String getMealCondNm() {
        return mealCondNm;
    }

    /**
     * @return Returns the no1DisabledFlg.
     */
    public String getNo1DisabledFlg() {
        return no1DisabledFlg;
    }

    /**
     * @return Returns the no1Flag.
     */
    public String getNo1Flag() {
        return no1Flag;
    }

    /**
     * @return Returns the no2DisabledFlg.
     */
    public String getNo2DisabledFlg() {
        return no2DisabledFlg;
    }

    /**
     * @return Returns the no2Flag.
     */
    public String getNo2Flag() {
        return no2Flag;
    }

    //PDF作成処理修正(No2、No3、No5対応) 2010/02/17 add by s30873 =====Start
    /**
     * @return no2施設タイプ
     */
    public String getNo2Type() {
        return this.planAnsData.getNo2Type();
    }

    /**
     * @return Returns the no3DisabledFlg.
     */
    public String getNo3DisabledFlg() {
        return no3DisabledFlg;
    }

    /**
     * @return Returns the no3Flag.
     */
    public String getNo3Flag() {
        return no3Flag;
    }

    /**
     * @return No3施設パターン
     */
    public String getNo3Pattern() {
        return this.planAnsData.getNo3Pattern();
    }

    /**
     * @return Returns the no4DisabledFlg.
     */
    public String getNo4DisabledFlg() {
        return no4DisabledFlg;
    }

    /**
     * @return Returns the no4Flag.
     */
    public String getNo4Flag() {
        return no4Flag;
    }

    /**
     * @return Returns the no5DisabledFlg.
     */
    public String getNo5DisabledFlg() {
        return no5DisabledFlg;
    }

    /**
     * @return Returns the no5Flag.
     */
    public String getNo5Flag() {
        return no5Flag;
    }

    /**
     * @return no5施設パターン
     */
    public String getNo5Pattern() {
        return this.planAnsData.getNo5Pattern();
    }

    /**
     * @return 企画回答書データ
     */
    public PlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return 企画回答連番
     */
    public Long getPlanAnsNo() {
        return planAnsData.getPlanAnsNo();
    }

    /**
     * 部屋タイプ5を取得します。
     * 
     * @return 部屋タイプ5
     */
    public String getRoomTypeFive() {
        return roomTypeFive;
    }

    /**
     * 室タイプ名称5
     * 
     * <pre></pre>
     * 
     * @return 室タイプ名称5
     */
    public String getRoomTypeFiveNm() {
        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeFive);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeFive);

    }

    /**
     * 部屋タイプ4を取得します。
     * 
     * @return 部屋タイプ4
     */
    public String getRoomTypeFour() {
        return roomTypeFour;
    }

    /**
     * 室タイプ名称4
     * 
     * <pre></pre>
     * 
     * @return 室タイプ名称4
     */
    public String getRoomTypeFourNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeFour);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeFour);
    }

    /**
     * @return roomTypeOne
     */
    public String getRoomTypeOne() {
        return roomTypeOne;
    }

    /**
     * @return 室タイプ名称1
     */
    public String getRoomTypeOneNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeOne);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeOne);

    }

    /**
     * 部屋タイプ6を取得します。
     * 
     * @return 部屋タイプ6
     */
    public String getRoomTypeSix() {
        return roomTypeSix;
    }

    /**
     * 室タイプ名称6
     * 
     * <pre></pre>
     * 
     * @return 室タイプ名称6
     */
    public String getRoomTypeSixNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeSix);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeSix);

    }

    /**
     * @return roomTypeThree
     */
    public String getRoomTypeThree() {
        return roomTypeThree;
    }

    /**
     * @return 室タイプ名称3
     */
    public String getRoomTypeThreeNm() {

        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeThree);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeThree);

    }

    /**
     * @return roomTypeTwo
     */
    public String getRoomTypeTwo() {
        return roomTypeTwo;
    }

    /**
     * @return 室タイプ名称2
     */
    public String getRoomTypeTwoNm() {
        if (DJreConstants.CODE_MATERIAL_KIND_ACODE.equals(this.planAnsData
                .getMaterialKind())) {
            return JreConstants.getListLabel(JreConstants.ROOM_TYPE_DIV,
                    roomTypeTwo);
        }

        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                roomTypeTwo);

    }

    /**
     * @return Returns the selectFlag.
     */
    public String getSelectFlag() {
        return selectFlag;
    }

    /**
     * @return 送付区分
     */
    public Integer getSendDiv() {
        return planAnsData.getSendDiv();
    }

    /**
     * @return 送付FAX
     */
    public String getSenderFax() {
        return planAnsData.getSenderFax();
    }

    /**
     * @return 送付担当者名
     */
    public String getSenderNm() {
        return planAnsData.getSenderNm();
    }

    /**
     * @return 送付連絡先電話
     */
    public String getSenderTel() {
        return planAnsData.getSenderTel();
    }

    /**
     * @return 送信状態.
     */
    public String getSendStatus() {
        return this.planAnsData.getSendStatus();
    }

    /**
     * @return 送信状態名
     */
    public String getSendStatusName() {
        return this.planAnsData.getSendStatusName();
    }

    /**
     * @return 状態
     */
    public Integer getStatus() {
        return planAnsData.getStatus();
    }

    /**
     * @return 状態名称
     */
    public String getStatusName() {
        return planAnsData.getStatusName();
    }

    /**
     * 後２枚施設コードを取得する .
     * 
     * @return 後２枚施設コード
     */
    public String getTwoFacilityCd() {
        return planAnsData.getTwoFacilityCd();
    }

    /**
     * @return 更新者
     */
    public String getUpdateUser() {
        return planAnsData.getUserId();
    }

    /**
     * @param ansSendAddr
     *            回答書送付先
     */
    public void setAnsSendAddr(String ansSendAddr) {
        planAnsData.setAnsSendAddr(ansSendAddr);
    }

    /**
     * @param branchCd
     *            支社コード
     */
    public void setBranchCd(String branchCd) {
        planAnsData.setBranchCd(branchCd);
    }

    /**
     * @param careerNo
     *            履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        planAnsData.setCareerNo(careerNo);
    }

    /**
     * @param cmtTmpl
     *            送信コメント
     */
    public void setCmtTmpl(String cmtTmpl) {
        this.cmtTmpl = cmtTmpl;
    }

    /**
     * @param disabledFlg
     *            The disabledFlg to set.
     */
    public void setDisabledFlg(String disabledFlg) {
        this.disabledFlg = disabledFlg;
    }

    /**
     * @param facilityCd
     *            施設コード
     */
    public void setFacilityCd(String facilityCd) {
        planAnsData.setFacilityCd(facilityCd);
    }

    /**
     * @param facilityNm
     *            施設名称
     */
    public void setFacilityNm(String facilityNm) {
        planAnsData.setFacilityNm(facilityNm);
    }

    /**
     * @param goodsNm
     *            商品名称
     */
    public void setGoodsNm(String goodsNm) {
        planAnsData.setGoodsNm(goodsNm);
    }

    /**
     * @param kindFlg
     *            種別
     */
    public void setKindFlg(String kindFlg) {
        planAnsData.setKindFlg(kindFlg);
    }

    /**
     * @param mailError
     *            メール送信エラーフラグ
     */
    public void setMailError(boolean mailError) {
        this.mailError = mailError;
    }

    /**
     * @param materialKind
     *            素材種別
     * @see jp.co.jreast.common.data.PlanAnsBaseData#setMaterialKind(java.lang.String)
     */
    public void setMaterialKind(String materialKind) {
        planAnsData.setMaterialKind(materialKind);
    }

    /**
     * @param mealCondNm
     *            設定する mealCondNm
     */
    public void setMealCondNm(String mealCondNm) {
        this.mealCondNm = mealCondNm;
    }

    /**
     * @param no1DisabledFlg
     *            The no1DisabledFlg to set.
     */
    public void setNo1DisabledFlg(String no1DisabledFlg) {
        this.no1DisabledFlg = no1DisabledFlg;
    }

    /**
     * @param no1Flag
     *            The no1Flag to set.
     */
    public void setNo1Flag(String no1Flag) {
        this.no1Flag = no1Flag;
    }

    /**
     * @param no2DisabledFlg
     *            The no2DisabledFlg to set.
     */
    public void setNo2DisabledFlg(String no2DisabledFlg) {
        this.no2DisabledFlg = no2DisabledFlg;
    }

    //=======================E N D 部屋タイプと食事条件表示ため、変数追加　s30873 =======================

    /**
     * @param no2Flag
     *            The no2Flag to set.
     */
    public void setNo2Flag(String no2Flag) {
        this.no2Flag = no2Flag;
    }

    /**
     * @param no2Type
     *            No2施設タイプ
     */
    public void setNo2Type(String no2Type) {
        this.planAnsData.setNo2Type(no2Type);
    }

    /**
     * @param no3DisabledFlg
     *            The no3DisabledFlg to set.
     */
    public void setNo3DisabledFlg(String no3DisabledFlg) {
        this.no3DisabledFlg = no3DisabledFlg;
    }

    /**
     * @param no3Flag
     *            The no3Flag to set.
     */
    public void setNo3Flag(String no3Flag) {
        this.no3Flag = no3Flag;
    }

    /**
     * @param no3Pattern
     *            no3施設パターン
     */
    public void setNo3Pattern(String no3Pattern) {
        this.planAnsData.setNo3Pattern(no3Pattern);
    }

    /**
     * @param no4DisabledFlg
     *            The no4DisabledFlg to set.
     */
    public void setNo4DisabledFlg(String no4DisabledFlg) {
        this.no4DisabledFlg = no4DisabledFlg;
    }

    /**
     * @param no4Flag
     *            The no4Flag to set.
     */
    public void setNo4Flag(String no4Flag) {
        this.no4Flag = no4Flag;
    }

    /**
     * @param no5DisabledFlg
     *            The no5DisabledFlg to set.
     */
    public void setNo5DisabledFlg(String no5DisabledFlg) {
        this.no5DisabledFlg = no5DisabledFlg;
    }

    /**
     * @param no5Flag
     *            The no5Flag to set.
     */
    public void setNo5Flag(String no5Flag) {
        this.no5Flag = no5Flag;
    }

    /**
     * @param no5Pattern
     *            no5施設パターン
     */
    public void setNo5Pattern(String no5Pattern) {
        this.planAnsData.setNo5Pattern(no5Pattern);
    }

    /**
     * @param planAnsData
     *            企画回答書データ
     */
    public void setPlanAnsData(PlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(Long planAnsNo) {
        planAnsData.setPlanAnsNo(planAnsNo);
    }

    /**
     * 部屋タイプ5を設定します。
     * 
     * @param roomTypeFive
     *            部屋タイプ5
     */
    public void setRoomTypeFive(String roomTypeFive) {
        this.roomTypeFive = roomTypeFive;
    }

    /**
     * 部屋タイプ4を設定します。
     * 
     * @param roomTypeFour
     *            部屋タイプ4
     */
    public void setRoomTypeFour(String roomTypeFour) {
        this.roomTypeFour = roomTypeFour;
    }

    /**
     * @param roomTypeOne
     *            設定する roomTypeOne
     */
    public void setRoomTypeOne(String roomTypeOne) {
        this.roomTypeOne = roomTypeOne;
    }

    /**
     * 部屋タイプ6を設定します。
     * 
     * @param roomTypeSix
     *            部屋タイプ6
     */
    public void setRoomTypeSix(String roomTypeSix) {
        this.roomTypeSix = roomTypeSix;
    }

    /**
     * @param roomTypeThree
     *            設定する roomTypeThree
     */
    public void setRoomTypeThree(String roomTypeThree) {
        this.roomTypeThree = roomTypeThree;
    }

    /**
     * @param roomTypeTwo
     *            設定する roomTypeTwo
     */
    public void setRoomTypeTwo(String roomTypeTwo) {
        this.roomTypeTwo = roomTypeTwo;
    }

    /**
     * @param selectFlag
     *            The selectFlag to set.
     */
    public void setSelectFlag(String selectFlag) {
        this.selectFlag = selectFlag;
    }

    /**
     * @param sendDiv
     *            送付区分
     */
    public void setSendDiv(Integer sendDiv) {
        planAnsData.setSendDiv(sendDiv);
    }

    /**
     * @param senderFax
     *            送付FAX
     */
    public void setSenderFax(String senderFax) {
        planAnsData.setSenderFax(senderFax);
    }

    /**
     * @param senderNm
     *            送付担当者名
     */
    public void setSenderNm(String senderNm) {
        planAnsData.setSenderNm(senderNm);
    }

    /**
     * @param senderTel
     *            送付連絡先電話
     */
    public void setSenderTel(String senderTel) {
        planAnsData.setSenderTel(senderTel);
    }

    /**
     * @param sendStatus
     *            送信状態
     */
    public void setSendStatus(String sendStatus) {
        this.planAnsData.setSendStatus(sendStatus);
    }

    /**
     * @param status
     *            状態
     */
    public void setStatus(Integer status) {
        planAnsData.setStatus(status);
    }

    /**
     * @param updateUser
     *            更新者
     */
    public void setUpdateUser(String updateUser) {
        planAnsData.setUserId(updateUser);
    }
}
