package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * [DP/RM]施設_風呂 エンティティ
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
public class DFacilityBath implements FacilityManageBodyKey {

    /** 風呂区分 */
    private Integer bathDiv;

    /** 風呂有無 */
    private String bathFlg;

    /** 風呂種別 */
    private Integer bathKind;

    /** 湯色 */
    private String colour;

    /** 湯色コメント */
    private String colourCmt;

    /** 源泉消毒有り有無 */
    private String disinfectFlg;

    /** 効能 */
    private String effect;

    /** 施設コード */
    private String facilityCd;

    /** 施設パターン */
    private String facilityPattern;

    /** 女性専用有無 */
    private String femaleOnlyFlg;

    /** 女性箇所名称 */
    private String femaleSiteNm;

    /** 女性箇所数量 */
    private String femaleSiteNum;

    /** 女性時間区分 */
    private String femaleTimeDiv;

    /** 女性開始時間１（時間） */
    private String femaleTimeFrom1Hour;

    /** 女性開始時間１（分） */
    private String femaleTimeFrom1Minute;

    /** 女性開始時間２（時間） */
    private String femaleTimeFrom2Hour;

    /** 女性開始時間２（分） */
    private String femaleTimeFrom2Minute;

    /** 女性開始時間３（時間） */
    private String femaleTimeFrom3Hour;

    /** 女性開始時間３（分） */
    private String femaleTimeFrom3Minute;

    /** 女性終了時間１（時間） */
    private String femaleTimeTo1Hour;

    /** 女性終了時間１（分） */
    private String femaleTimeTo1Minute;

    /** 女性終了時間２（時間） */
    private String femaleTimeTo2Hour;

    /** 女性終了時間２（分） */
    private String femaleTimeTo2Minute;

    /** 女性終了時間３（時間） */
    private String femaleTimeTo3Hour;

    /** 女性終了時間３（分） */
    private String femaleTimeTo3Minute;

    /** 回答書種別 */
    private String kindFlg;

    /** 男性箇所名称 */
    private String maleSiteNm;

    /** 男性箇所数量 */
    private String maleSiteNum;

    /** 男性時間区分 */
    private String maleTimeDiv;

    /** 男性開始時間１（時間） */
    private String maleTimeFrom1Hour;

    /** 男性開始時間１（分） */
    private String maleTimeFrom1Minute;

    /** 男性開始時間２（時間） */
    private String maleTimeFrom2Hour;

    /** 男性開始時間２（分） */
    private String maleTimeFrom2Minute;

    /** 男性開始時間３（時間） */
    private String maleTimeFrom3Hour;

    /** 男性開始時間３（分） */
    private String maleTimeFrom3Minute;

    /** 男性終了時間１（時間） */
    private String maleTimeTo1Hour;

    /** 男性終了時間１（分） */
    private String maleTimeTo1Minute;

    /** 男性終了時間２（時間） */
    private String maleTimeTo2Hour;

    /** 男性終了時間２（分） */
    private String maleTimeTo2Minute;

    /** 男性終了時間３（時間） */
    private String maleTimeTo3Hour;

    /** 男性終了時間３（分） */
    private String maleTimeTo3Minute;

    /** 備考 */
    private String memo;

    /** 天然温泉・その他 */
    private String naturalSpa;

    /** その他源泉コメント */
    private String otherSpringCmt;

    /** 湧出状態 */
    private String pourStatus;

    /** 湧出状態コメント */
    private String pourStatusCmt;

    /** 温泉循環式有無 */
    private String recircleKindFlg;

    /** 賃切料金 */
    private String rentalFees;

    /** 賃切有料有無 */
    private String rentalPayFlg;

    /** 賃切予約区分 */
    private String rentalReserveDiv;

    /** 賃切事前予約選択フラグ */
    private String rentalReserveFlg;

    /** 賃切箇所数量 */
    private String rentalSiteNum;

    /** 賃切時間 */
    private String rentalTime;

    /** 自家源泉有無 */
    private String selfSpringFlg;

    /** 共同源泉有無 */
    private String shareSpringFlg;

    /** 共同源泉名 */
    private String shareSpringNm;

    /** 入れ替制有無 */
    private String shiftFlg;

    /** 源泉かけ流し有無 */
    private String spaFlowFlg;

    /** 泉質 */
    private String spaQuality;

    /** 源泉温度 */
    private String spaTemp;

    /** 温泉加温有り有無 */
    private String warmingFlg;

    /** 浴槽への湯量コントロール有無 */
    private String waterControlFlg;

    /**
     * コンストラクタ
     */
    public DFacilityBath() {
        super();
    }

    /**
     * コンストラクタ
     * 
     * @param bathDiv
     *            風呂区分
     * @param bathKind
     *            風呂種別
     */
    public DFacilityBath(Integer bathDiv, Integer bathKind) {
        super();
        this.bathDiv = bathDiv;
        this.bathKind = bathKind;
    }

    /**
     * 風呂区分を取得します。
     * 
     * @return 風呂区分
     */
    public Integer getBathDiv() {
        return bathDiv;
    }

    /**
     * 風呂有無を取得します。
     * 
     * @return 風呂有無
     */
    public String getBathFlg() {
        return bathFlg;
    }

    /**
     * 風呂種別を取得します。
     * 
     * @return 風呂種別
     */
    public Integer getBathKind() {
        return bathKind;
    }

    /**
     * 湯色を取得します。
     * 
     * @return 湯色
     */
    public String getColour() {
        return colour;
    }

    /**
     * 湯色コメントを取得します。
     * 
     * @return 湯色コメント
     */
    public String getColourCmt() {
        return colourCmt;
    }

    /**
     * 源泉消毒有り有無を取得します。
     * 
     * @return 源泉消毒有り有無
     */
    public String getDisinfectFlg() {
        return disinfectFlg;
    }

    /**
     * 効能を取得します。
     * 
     * @return 効能
     */
    public String getEffect() {
        return effect;
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
     * 女性専用有無を取得します。
     * 
     * @return 女性専用有無
     */
    public String getFemaleOnlyFlg() {
        return femaleOnlyFlg;
    }

    /**
     * 女性箇所名称を取得します。
     * 
     * @return 女性箇所名称
     */
    public String getFemaleSiteNm() {
        return femaleSiteNm;
    }

    /**
     * 女性箇所数量を取得します。
     * 
     * @return 女性箇所数量
     */
    public String getFemaleSiteNum() {
        return femaleSiteNum;
    }

    /**
     * 女性時間区分を取得します。
     * 
     * @return 女性時間区分
     */
    public String getFemaleTimeDiv() {
        return femaleTimeDiv;
    }

    /**
     * 女性開始時間１を取得します。
     * 
     * @return 女性開始時間１
     */
    public String getFemaleTimeFrom1() {
        return DKikakuWebUtil.buildTime(getFemaleTimeFrom1Hour(),
                getFemaleTimeFrom1Minute());
    }

    /**
     * 女性開始時間１（時間）を取得します。
     * 
     * @return 女性開始時間１（時間）
     */
    public String getFemaleTimeFrom1Hour() {
        return femaleTimeFrom1Hour;
    }

    /**
     * 女性開始時間１（分）を取得します。
     * 
     * @return 女性開始時間１（分）
     */
    public String getFemaleTimeFrom1Minute() {
        return femaleTimeFrom1Minute;
    }

    /**
     * 女性開始時間２を取得します。
     * 
     * @return 女性開始時間２
     */
    public String getFemaleTimeFrom2() {
        return DKikakuWebUtil.buildTime(getFemaleTimeFrom2Hour(),
                getFemaleTimeFrom2Minute());
    }

    /**
     * 女性開始時間２（時間）を取得します。
     * 
     * @return 女性開始時間２（時間）
     */
    public String getFemaleTimeFrom2Hour() {
        return femaleTimeFrom2Hour;
    }

    /**
     * 女性開始時間２（分）を取得します。
     * 
     * @return 女性開始時間２（分）
     */
    public String getFemaleTimeFrom2Minute() {
        return femaleTimeFrom2Minute;
    }

    /**
     * 女性開始時間３を取得します。
     * 
     * @return 女性開始時間３
     */
    public String getFemaleTimeFrom3() {
        return DKikakuWebUtil.buildTime(getFemaleTimeFrom3Hour(),
                getFemaleTimeFrom3Minute());
    }

    /**
     * 女性開始時間３（時間）を取得します。
     * 
     * @return 女性開始時間３（時間）
     */
    public String getFemaleTimeFrom3Hour() {
        return femaleTimeFrom3Hour;
    }

    /**
     * 女性開始時間３（分）を取得します。
     * 
     * @return 女性開始時間３（分）
     */
    public String getFemaleTimeFrom3Minute() {
        return femaleTimeFrom3Minute;
    }

    /**
     * 女性終了時間１を取得します。
     * 
     * @return 女性終了時間１
     */
    public String getFemaleTimeTo1() {
        return DKikakuWebUtil.buildTime(getFemaleTimeTo1Hour(),
                getFemaleTimeTo1Minute());
    }

    /**
     * 女性終了時間１（時間）を取得します。
     * 
     * @return 女性終了時間１（時間）
     */
    public String getFemaleTimeTo1Hour() {
        return femaleTimeTo1Hour;
    }

    /**
     * 女性終了時間１（分）を取得します。
     * 
     * @return 女性終了時間１（分）
     */
    public String getFemaleTimeTo1Minute() {
        return femaleTimeTo1Minute;
    }

    /**
     * 女性終了時間２を取得します。
     * 
     * @return 女性終了時間２
     */
    public String getFemaleTimeTo2() {
        return DKikakuWebUtil.buildTime(getFemaleTimeTo2Hour(),
                getFemaleTimeTo2Minute());
    }

    /**
     * 女性終了時間２（時間）を取得します。
     * 
     * @return 女性終了時間２（時間）
     */
    public String getFemaleTimeTo2Hour() {
        return femaleTimeTo2Hour;
    }

    /**
     * 女性終了時間２（分）を取得します。
     * 
     * @return 女性終了時間２（分）
     */
    public String getFemaleTimeTo2Minute() {
        return femaleTimeTo2Minute;
    }

    /**
     * 女性終了時間３を取得します。
     * 
     * @return 女性終了時間３
     */
    public String getFemaleTimeTo3() {
        return DKikakuWebUtil.buildTime(getFemaleTimeTo3Hour(),
                getFemaleTimeTo3Minute());
    }

    /**
     * 女性終了時間３（時間）を取得します。
     * 
     * @return 女性終了時間３（時間）
     */
    public String getFemaleTimeTo3Hour() {
        return femaleTimeTo3Hour;
    }

    /**
     * 女性終了時間３（分）を取得します。
     * 
     * @return 女性終了時間３（分）
     */
    public String getFemaleTimeTo3Minute() {
        return femaleTimeTo3Minute;
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
     * 男性箇所名称を取得します。
     * 
     * @return 男性箇所名称
     */
    public String getMaleSiteNm() {
        return maleSiteNm;
    }

    /**
     * 男性箇所数量を取得します。
     * 
     * @return 男性箇所数量
     */
    public String getMaleSiteNum() {
        return maleSiteNum;
    }

    /**
     * 男性時間区分を取得します。
     * 
     * @return 男性時間区分
     */
    public String getMaleTimeDiv() {
        return maleTimeDiv;
    }

    /**
     * 男性開始時間１を取得します。
     * 
     * @return 男性開始時間１
     */
    public String getMaleTimeFrom1() {
        return DKikakuWebUtil.buildTime(getMaleTimeFrom1Hour(),
                getMaleTimeFrom1Minute());
    }

    /**
     * 男性開始時間１（時間）を取得します。
     * 
     * @return 男性開始時間１（時間）
     */
    public String getMaleTimeFrom1Hour() {
        return maleTimeFrom1Hour;
    }

    /**
     * 男性開始時間１（分）を取得します。
     * 
     * @return 男性開始時間１（分）
     */
    public String getMaleTimeFrom1Minute() {
        return maleTimeFrom1Minute;
    }

    /**
     * 男性開始時間２を取得します。
     * 
     * @return 男性開始時間２
     */
    public String getMaleTimeFrom2() {
        return DKikakuWebUtil.buildTime(getMaleTimeFrom2Hour(),
                getMaleTimeFrom2Minute());
    }

    /**
     * 男性開始時間２（時間）を取得します。
     * 
     * @return 男性開始時間２（時間）
     */
    public String getMaleTimeFrom2Hour() {
        return maleTimeFrom2Hour;
    }

    /**
     * 男性開始時間２（分）を取得します。
     * 
     * @return 男性開始時間２（分）
     */
    public String getMaleTimeFrom2Minute() {
        return maleTimeFrom2Minute;
    }

    /**
     * 男性開始時間３を取得します。
     * 
     * @return 男性開始時間３
     */
    public String getMaleTimeFrom3() {
        return DKikakuWebUtil.buildTime(getMaleTimeFrom3Hour(),
                getMaleTimeFrom3Minute());
    }

    /**
     * 男性開始時間３（時間）を取得します。
     * 
     * @return 男性開始時間３（時間）
     */
    public String getMaleTimeFrom3Hour() {
        return maleTimeFrom3Hour;
    }

    /**
     * 男性開始時間３（分）を取得します。
     * 
     * @return 男性開始時間３（分）
     */
    public String getMaleTimeFrom3Minute() {
        return maleTimeFrom3Minute;
    }

    /**
     * 男性終了時間１を取得します。
     * 
     * @return 男性終了時間１
     */
    public String getMaleTimeTo1() {
        return DKikakuWebUtil.buildTime(getMaleTimeTo1Hour(),
                getMaleTimeTo1Minute());
    }

    /**
     * 男性終了時間１（時間）を取得します。
     * 
     * @return 男性終了時間１（時間）
     */
    public String getMaleTimeTo1Hour() {
        return maleTimeTo1Hour;
    }

    /**
     * 男性終了時間１（分）を取得します。
     * 
     * @return 男性終了時間１（分）
     */
    public String getMaleTimeTo1Minute() {
        return maleTimeTo1Minute;
    }

    /**
     * 男性終了時間２を取得します。
     * 
     * @return 男性終了時間２
     */
    public String getMaleTimeTo2() {
        return DKikakuWebUtil.buildTime(getMaleTimeTo2Hour(),
                getMaleTimeTo2Minute());
    }

    /**
     * 男性終了時間２（時間）を取得します。
     * 
     * @return 男性終了時間２（時間）
     */
    public String getMaleTimeTo2Hour() {
        return maleTimeTo2Hour;
    }

    /**
     * 男性終了時間２（分）を取得します。
     * 
     * @return 男性終了時間２（分）
     */
    public String getMaleTimeTo2Minute() {
        return maleTimeTo2Minute;
    }

    /**
     * 男性終了時間３を取得します。
     * 
     * @return 男性終了時間３
     */
    public String getMaleTimeTo3() {
        return DKikakuWebUtil.buildTime(getMaleTimeTo3Hour(),
                getMaleTimeTo3Minute());
    }

    /**
     * 男性終了時間３（時間）を取得します。
     * 
     * @return 男性終了時間３（時間）
     */
    public String getMaleTimeTo3Hour() {
        return maleTimeTo3Hour;
    }

    /**
     * 男性終了時間３（分）を取得します。
     * 
     * @return 男性終了時間３（分）
     */
    public String getMaleTimeTo3Minute() {
        return maleTimeTo3Minute;
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
     * 天然温泉・その他を取得します。
     * 
     * @return 天然温泉・その他
     */
    public String getNaturalSpa() {
        return naturalSpa;
    }

    /**
     * その他源泉コメントを取得します。
     * 
     * @return その他源泉コメント
     */
    public String getOtherSpringCmt() {
        return otherSpringCmt;
    }

    /**
     * 湧出状態を取得します。
     * 
     * @return 湧出状態
     */
    public String getPourStatus() {
        return pourStatus;
    }

    /**
     * 湧出状態コメントを取得します。
     * 
     * @return 湧出状態コメント
     */
    public String getPourStatusCmt() {
        return pourStatusCmt;
    }

    /**
     * 温泉循環式有無を取得します。
     * 
     * @return 温泉循環式有無
     */
    public String getRecircleKindFlg() {
        return recircleKindFlg;
    }

    /**
     * 賃切料金を取得します。
     * 
     * @return 賃切料金
     */
    public String getRentalFees() {
        return rentalFees;
    }

    /**
     * 賃切有料有無を取得します。
     * 
     * @return 賃切有料有無
     */
    public String getRentalPayFlg() {
        return rentalPayFlg;
    }

    /**
     * 賃切予約区分を取得します。
     * 
     * @return 賃切予約区分
     */
    public String getRentalReserveDiv() {
        return rentalReserveDiv;
    }

    /**
     * 賃切事前予約選択フラグを取得します。
     * 
     * @return 賃切事前予約選択フラグ
     */
    public String getRentalReserveFlg() {
        return rentalReserveFlg;
    }

    /**
     * 賃切箇所数量を取得します。
     * 
     * @return 賃切箇所数量
     */
    public String getRentalSiteNum() {
        return rentalSiteNum;
    }

    /**
     * 賃切時間を取得します。
     * 
     * @return 賃切時間
     */
    public String getRentalTime() {
        return rentalTime;
    }

    /**
     * 自家源泉有無を取得します。
     * 
     * @return 自家源泉有無
     */
    public String getSelfSpringFlg() {
        return selfSpringFlg;
    }

    /**
     * 共同源泉有無を取得します。
     * 
     * @return 共同源泉有無
     */
    public String getShareSpringFlg() {
        return shareSpringFlg;
    }

    /**
     * 共同源泉名を取得します。
     * 
     * @return 共同源泉名
     */
    public String getShareSpringNm() {
        return shareSpringNm;
    }

    /**
     * 入れ替制有無を取得します。
     * 
     * @return 入れ替制有無
     */
    public String getShiftFlg() {
        return shiftFlg;
    }

    /**
     * 源泉かけ流し有無を取得します。
     * 
     * @return 源泉かけ流し有無
     */
    public String getSpaFlowFlg() {
        return spaFlowFlg;
    }

    /**
     * 泉質を取得します。
     * 
     * @return 泉質
     */
    public String getSpaQuality() {
        return spaQuality;
    }

    /**
     * 源泉温度を取得します。
     * 
     * @return 源泉温度
     */
    public String getSpaTemp() {
        return spaTemp;
    }

    /**
     * 温泉加温有り有無を取得します。
     * 
     * @return 温泉加温有り有無
     */
    public String getWarmingFlg() {
        return warmingFlg;
    }

    /**
     * 浴槽への湯量コントロール有無を取得します。
     * 
     * @return 浴槽への湯量コントロール有無
     */
    public String getWaterControlFlg() {
        return waterControlFlg;
    }

    /**
     * 風呂区分を設定します。
     * 
     * @param bathDiv
     *            風呂区分
     */
    public void setBathDiv(Integer bathDiv) {
        this.bathDiv = bathDiv;
    }

    /**
     * 風呂有無を設定します。
     * 
     * @param bathFlg
     *            風呂有無
     */
    public void setBathFlg(String bathFlg) {
        this.bathFlg = bathFlg;
    }

    /**
     * 風呂種別を設定します。
     * 
     * @param bathKind
     *            風呂種別
     */
    public void setBathKind(Integer bathKind) {
        this.bathKind = bathKind;
    }

    /**
     * 湯色を設定します。
     * 
     * @param colour
     *            湯色
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * 湯色コメントを設定します。
     * 
     * @param colourCmt
     *            湯色コメント
     */
    public void setColourCmt(String colourCmt) {
        this.colourCmt = colourCmt;
    }

    /**
     * 源泉消毒有り有無を設定します。
     * 
     * @param disinfectFlg
     *            源泉消毒有り有無
     */
    public void setDisinfectFlg(String disinfectFlg) {
        this.disinfectFlg = disinfectFlg;
    }

    /**
     * 効能を設定します。
     * 
     * @param effect
     *            効能
     */
    public void setEffect(String effect) {
        this.effect = effect;
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
     * 女性専用有無を設定します。
     * 
     * @param femaleOnlyFlg
     *            女性専用有無
     */
    public void setFemaleOnlyFlg(String femaleOnlyFlg) {
        this.femaleOnlyFlg = femaleOnlyFlg;
    }

    /**
     * 女性箇所名称を設定します。
     * 
     * @param femaleSiteNm
     *            女性箇所名称
     */
    public void setFemaleSiteNm(String femaleSiteNm) {
        this.femaleSiteNm = femaleSiteNm;
    }

    /**
     * 女性箇所数量を設定します。
     * 
     * @param femaleSiteNum
     *            女性箇所数量
     */
    public void setFemaleSiteNum(String femaleSiteNum) {
        this.femaleSiteNum = femaleSiteNum;
    }

    /**
     * 女性時間区分を設定します。
     * 
     * @param femaleTimeDiv
     *            女性時間区分
     */
    public void setFemaleTimeDiv(String femaleTimeDiv) {
        this.femaleTimeDiv = femaleTimeDiv;
    }

    /**
     * 女性開始時間１を設定します。
     * 
     * @param femaleTimeFrom1
     *            女性開始時間１
     */
    public void setFemaleTimeFrom1(String femaleTimeFrom1) {
        setFemaleTimeFrom1Hour(DKikakuWebUtil.getHourFormTime(femaleTimeFrom1));
        setFemaleTimeFrom1Minute(DKikakuWebUtil
                .getMinuteFromTime(femaleTimeFrom1));
    }

    /**
     * 女性開始時間１（時間）を設定します。
     * 
     * @param femaleTimeFrom1Hour
     *            女性開始時間１（時間）
     */
    public void setFemaleTimeFrom1Hour(String femaleTimeFrom1Hour) {
        this.femaleTimeFrom1Hour = femaleTimeFrom1Hour;
    }

    /**
     * 女性開始時間１（分）を設定します。
     * 
     * @param femaleTimeFrom1Minute
     *            女性開始時間１（分）
     */
    public void setFemaleTimeFrom1Minute(String femaleTimeFrom1Minute) {
        this.femaleTimeFrom1Minute = femaleTimeFrom1Minute;
    }

    /**
     * 女性開始時間２を設定します。
     * 
     * @param femaleTimeFrom2
     *            女性開始時間２
     */
    public void setFemaleTimeFrom2(String femaleTimeFrom2) {
        setFemaleTimeFrom2Hour(DKikakuWebUtil.getHourFormTime(femaleTimeFrom2));
        setFemaleTimeFrom2Minute(DKikakuWebUtil
                .getMinuteFromTime(femaleTimeFrom2));
    }

    /**
     * 女性開始時間２（時間）を設定します。
     * 
     * @param femaleTimeFrom2Hour
     *            女性開始時間２（時間）
     */
    public void setFemaleTimeFrom2Hour(String femaleTimeFrom2Hour) {
        this.femaleTimeFrom2Hour = femaleTimeFrom2Hour;
    }

    /**
     * 女性開始時間２（分）を設定します。
     * 
     * @param femaleTimeFrom2Minute
     *            女性開始時間２（分）
     */
    public void setFemaleTimeFrom2Minute(String femaleTimeFrom2Minute) {
        this.femaleTimeFrom2Minute = femaleTimeFrom2Minute;
    }

    /**
     * 女性開始時間３を設定します。
     * 
     * @param femaleTimeFrom3
     *            女性開始時間３
     */
    public void setFemaleTimeFrom3(String femaleTimeFrom3) {
        setFemaleTimeFrom3Hour(DKikakuWebUtil.getHourFormTime(femaleTimeFrom3));
        setFemaleTimeFrom3Minute(DKikakuWebUtil
                .getMinuteFromTime(femaleTimeFrom3));
    }

    /**
     * 女性開始時間３（時間）を設定します。
     * 
     * @param femaleTimeFrom3Hour
     *            女性開始時間３（時間）
     */
    public void setFemaleTimeFrom3Hour(String femaleTimeFrom3Hour) {
        this.femaleTimeFrom3Hour = femaleTimeFrom3Hour;
    }

    /**
     * 女性開始時間３（分）を設定します。
     * 
     * @param femaleTimeFrom3Minute
     *            女性開始時間３（分）
     */
    public void setFemaleTimeFrom3Minute(String femaleTimeFrom3Minute) {
        this.femaleTimeFrom3Minute = femaleTimeFrom3Minute;
    }

    /**
     * 女性終了時間１を設定します。
     * 
     * @param femaleTimeTo1
     *            女性終了時間１
     */
    public void setFemaleTimeTo1(String femaleTimeTo1) {
        setFemaleTimeTo1Hour(DKikakuWebUtil.getHourFormTime(femaleTimeTo1));
        setFemaleTimeTo1Minute(DKikakuWebUtil.getMinuteFromTime(femaleTimeTo1));
    }

    /**
     * 女性終了時間１（時間）を設定します。
     * 
     * @param femaleTimeTo1Hour
     *            女性終了時間１（時間）
     */
    public void setFemaleTimeTo1Hour(String femaleTimeTo1Hour) {
        this.femaleTimeTo1Hour = femaleTimeTo1Hour;
    }

    /**
     * 女性終了時間１（分）を設定します。
     * 
     * @param femaleTimeTo1Minute
     *            女性終了時間１（分）
     */
    public void setFemaleTimeTo1Minute(String femaleTimeTo1Minute) {
        this.femaleTimeTo1Minute = femaleTimeTo1Minute;
    }

    /**
     * 女性終了時間２を設定します。
     * 
     * @param femaleTimeTo2
     *            女性終了時間２
     */
    public void setFemaleTimeTo2(String femaleTimeTo2) {
        setFemaleTimeTo2Hour(DKikakuWebUtil.getHourFormTime(femaleTimeTo2));
        setFemaleTimeTo2Minute(DKikakuWebUtil.getMinuteFromTime(femaleTimeTo2));
    }

    /**
     * 女性終了時間２（時間）を設定します。
     * 
     * @param femaleTimeTo2Hour
     *            女性終了時間２（時間）
     */
    public void setFemaleTimeTo2Hour(String femaleTimeTo2Hour) {
        this.femaleTimeTo2Hour = femaleTimeTo2Hour;
    }

    /**
     * 女性終了時間２（分）を設定します。
     * 
     * @param femaleTimeTo2Minute
     *            女性終了時間２（分）
     */
    public void setFemaleTimeTo2Minute(String femaleTimeTo2Minute) {
        this.femaleTimeTo2Minute = femaleTimeTo2Minute;
    }

    /**
     * 女性終了時間３を設定します。
     * 
     * @param femaleTimeTo3
     *            女性終了時間３
     */
    public void setFemaleTimeTo3(String femaleTimeTo3) {
        setFemaleTimeTo3Hour(DKikakuWebUtil.getHourFormTime(femaleTimeTo3));
        setFemaleTimeTo3Minute(DKikakuWebUtil.getMinuteFromTime(femaleTimeTo3));
    }

    /**
     * 女性終了時間３（時間）を設定します。
     * 
     * @param femaleTimeTo3Hour
     *            女性終了時間３（時間）
     */
    public void setFemaleTimeTo3Hour(String femaleTimeTo3Hour) {
        this.femaleTimeTo3Hour = femaleTimeTo3Hour;
    }

    /**
     * 女性終了時間３（分）を設定します。
     * 
     * @param femaleTimeTo3Minute
     *            女性終了時間３（分）
     */
    public void setFemaleTimeTo3Minute(String femaleTimeTo3Minute) {
        this.femaleTimeTo3Minute = femaleTimeTo3Minute;
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
     * 男性箇所名称を設定します。
     * 
     * @param maleSiteNm
     *            男性箇所名称
     */
    public void setMaleSiteNm(String maleSiteNm) {
        this.maleSiteNm = maleSiteNm;
    }

    /**
     * 男性箇所数量を設定します。
     * 
     * @param maleSiteNum
     *            男性箇所数量
     */
    public void setMaleSiteNum(String maleSiteNum) {
        this.maleSiteNum = maleSiteNum;
    }

    /**
     * 男性時間区分を設定します。
     * 
     * @param maleTimeDiv
     *            男性時間区分
     */
    public void setMaleTimeDiv(String maleTimeDiv) {
        this.maleTimeDiv = maleTimeDiv;
    }

    /**
     * 男性開始時間１を設定します。
     * 
     * @param maleTimeFrom1
     *            男性開始時間１
     */
    public void setMaleTimeFrom1(String maleTimeFrom1) {
        setMaleTimeFrom1Hour(DKikakuWebUtil.getHourFormTime(maleTimeFrom1));
        setMaleTimeFrom1Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeFrom1));
    }

    /**
     * 男性開始時間１（時間）を設定します。
     * 
     * @param maleTimeFrom1Hour
     *            男性開始時間１（時間）
     */
    public void setMaleTimeFrom1Hour(String maleTimeFrom1Hour) {
        this.maleTimeFrom1Hour = maleTimeFrom1Hour;
    }

    /**
     * 男性開始時間１（分）を設定します。
     * 
     * @param maleTimeFrom1Minute
     *            男性開始時間１（分）
     */
    public void setMaleTimeFrom1Minute(String maleTimeFrom1Minute) {
        this.maleTimeFrom1Minute = maleTimeFrom1Minute;
    }

    /**
     * 男性開始時間２を設定します。
     * 
     * @param maleTimeFrom2
     *            男性開始時間２
     */
    public void setMaleTimeFrom2(String maleTimeFrom2) {
        setMaleTimeFrom2Hour(DKikakuWebUtil.getHourFormTime(maleTimeFrom2));
        setMaleTimeFrom2Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeFrom2));
    }

    /**
     * 男性開始時間２（時間）を設定します。
     * 
     * @param maleTimeFrom2Hour
     *            男性開始時間２（時間）
     */
    public void setMaleTimeFrom2Hour(String maleTimeFrom2Hour) {
        this.maleTimeFrom2Hour = maleTimeFrom2Hour;
    }

    /**
     * 男性開始時間２（分）を設定します。
     * 
     * @param maleTimeFrom2Minute
     *            男性開始時間２（分）
     */
    public void setMaleTimeFrom2Minute(String maleTimeFrom2Minute) {
        this.maleTimeFrom2Minute = maleTimeFrom2Minute;
    }

    /**
     * 男性開始時間３を設定します。
     * 
     * @param maleTimeFrom3
     *            男性開始時間３
     */
    public void setMaleTimeFrom3(String maleTimeFrom3) {
        setMaleTimeFrom3Hour(DKikakuWebUtil.getHourFormTime(maleTimeFrom3));
        setMaleTimeFrom3Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeFrom3));
    }

    /**
     * 男性開始時間３（時間）を設定します。
     * 
     * @param maleTimeFrom3Hour
     *            男性開始時間３（時間）
     */
    public void setMaleTimeFrom3Hour(String maleTimeFrom3Hour) {
        this.maleTimeFrom3Hour = maleTimeFrom3Hour;
    }

    /**
     * 男性開始時間３（分）を設定します。
     * 
     * @param maleTimeFrom3Minute
     *            男性開始時間３（分）
     */
    public void setMaleTimeFrom3Minute(String maleTimeFrom3Minute) {
        this.maleTimeFrom3Minute = maleTimeFrom3Minute;
    }

    /**
     * 男性終了時間１を設定します。
     * 
     * @param maleTimeTo1
     *            男性終了時間１
     */
    public void setMaleTimeTo1(String maleTimeTo1) {
        setMaleTimeTo1Hour(DKikakuWebUtil.getHourFormTime(maleTimeTo1));
        setMaleTimeTo1Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeTo1));
    }

    /**
     * 男性終了時間１（時間）を設定します。
     * 
     * @param maleTimeTo1Hour
     *            男性終了時間１（時間）
     */
    public void setMaleTimeTo1Hour(String maleTimeTo1Hour) {
        this.maleTimeTo1Hour = maleTimeTo1Hour;
    }

    /**
     * 男性終了時間１（分）を設定します。
     * 
     * @param maleTimeTo1Minute
     *            男性終了時間１（分）
     */
    public void setMaleTimeTo1Minute(String maleTimeTo1Minute) {
        this.maleTimeTo1Minute = maleTimeTo1Minute;
    }

    /**
     * 男性終了時間２を設定します。
     * 
     * @param maleTimeTo2
     *            男性終了時間２
     */
    public void setMaleTimeTo2(String maleTimeTo2) {
        setMaleTimeTo2Hour(DKikakuWebUtil.getHourFormTime(maleTimeTo2));
        setMaleTimeTo2Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeTo2));
    }

    /**
     * 男性終了時間２（時間）を設定します。
     * 
     * @param maleTimeTo2Hour
     *            男性終了時間２（時間）
     */
    public void setMaleTimeTo2Hour(String maleTimeTo2Hour) {
        this.maleTimeTo2Hour = maleTimeTo2Hour;
    }

    /**
     * 男性終了時間２（分）を設定します。
     * 
     * @param maleTimeTo2Minute
     *            男性終了時間２（分）
     */
    public void setMaleTimeTo2Minute(String maleTimeTo2Minute) {
        this.maleTimeTo2Minute = maleTimeTo2Minute;
    }

    /**
     * 男性終了時間３を設定します。
     * 
     * @param maleTimeTo3
     *            男性終了時間３
     */
    public void setMaleTimeTo3(String maleTimeTo3) {
        setMaleTimeTo3Hour(DKikakuWebUtil.getHourFormTime(maleTimeTo3));
        setMaleTimeTo3Minute(DKikakuWebUtil.getMinuteFromTime(maleTimeTo3));
    }

    /**
     * 男性終了時間３（時間）を設定します。
     * 
     * @param maleTimeTo3Hour
     *            男性終了時間３（時間）
     */
    public void setMaleTimeTo3Hour(String maleTimeTo3Hour) {
        this.maleTimeTo3Hour = maleTimeTo3Hour;
    }

    /**
     * 男性終了時間３（分）を設定します。
     * 
     * @param maleTimeTo3Minute
     *            男性終了時間３（分）
     */
    public void setMaleTimeTo3Minute(String maleTimeTo3Minute) {
        this.maleTimeTo3Minute = maleTimeTo3Minute;
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
     * 天然温泉・その他を設定します。
     * 
     * @param naturalSpa
     *            天然温泉・その他
     */
    public void setNaturalSpa(String naturalSpa) {
        this.naturalSpa = naturalSpa;
    }

    /**
     * その他源泉コメントを設定します。
     * 
     * @param otherSpringCmt
     *            その他源泉コメント
     */
    public void setOtherSpringCmt(String otherSpringCmt) {
        this.otherSpringCmt = otherSpringCmt;
    }

    /**
     * 湧出状態を設定します。
     * 
     * @param pourStatus
     *            湧出状態
     */
    public void setPourStatus(String pourStatus) {
        this.pourStatus = pourStatus;
    }

    /**
     * 湧出状態コメントを設定します。
     * 
     * @param pourStatusCmt
     *            湧出状態コメント
     */
    public void setPourStatusCmt(String pourStatusCmt) {
        this.pourStatusCmt = pourStatusCmt;
    }

    /**
     * 温泉循環式有無を設定します。
     * 
     * @param recircleKindFlg
     *            温泉循環式有無
     */
    public void setRecircleKindFlg(String recircleKindFlg) {
        this.recircleKindFlg = recircleKindFlg;
    }

    /**
     * 賃切料金を設定します。
     * 
     * @param rentalFees
     *            賃切料金
     */
    public void setRentalFees(String rentalFees) {
        this.rentalFees = rentalFees;
    }

    /**
     * 賃切有料有無を設定します。
     * 
     * @param rentalPayFlg
     *            賃切有料有無
     */
    public void setRentalPayFlg(String rentalPayFlg) {
        this.rentalPayFlg = rentalPayFlg;
    }

    /**
     * 賃切予約区分を設定します。
     * 
     * @param rentalReserveDiv
     *            賃切予約区分
     */
    public void setRentalReserveDiv(String rentalReserveDiv) {
        this.rentalReserveDiv = rentalReserveDiv;
    }

    /**
     * 賃切事前予約選択フラグを設定します。
     * 
     * @param rentalReserveFlg
     *            賃切事前予約選択フラグ
     */
    public void setRentalReserveFlg(String rentalReserveFlg) {
        this.rentalReserveFlg = rentalReserveFlg;
    }

    /**
     * 賃切箇所数量を設定します。
     * 
     * @param rentalSiteNum
     *            賃切箇所数量
     */
    public void setRentalSiteNum(String rentalSiteNum) {
        this.rentalSiteNum = rentalSiteNum;
    }

    /**
     * 賃切時間を設定します。
     * 
     * @param rentalTime
     *            賃切時間
     */
    public void setRentalTime(String rentalTime) {
        this.rentalTime = rentalTime;
    }

    /**
     * 自家源泉有無を設定します。
     * 
     * @param selfSpringFlg
     *            自家源泉有無
     */
    public void setSelfSpringFlg(String selfSpringFlg) {
        this.selfSpringFlg = selfSpringFlg;
    }

    /**
     * 共同源泉有無を設定します。
     * 
     * @param shareSpringFlg
     *            共同源泉有無
     */
    public void setShareSpringFlg(String shareSpringFlg) {
        this.shareSpringFlg = shareSpringFlg;
    }

    /**
     * 共同源泉名を設定します。
     * 
     * @param shareSpringNm
     *            共同源泉名
     */
    public void setShareSpringNm(String shareSpringNm) {
        this.shareSpringNm = shareSpringNm;
    }

    /**
     * 入れ替制有無を設定します。
     * 
     * @param shiftFlg
     *            入れ替制有無
     */
    public void setShiftFlg(String shiftFlg) {
        this.shiftFlg = shiftFlg;
    }

    /**
     * 源泉かけ流し有無を設定します。
     * 
     * @param spaFlowFlg
     *            源泉かけ流し有無
     */
    public void setSpaFlowFlg(String spaFlowFlg) {
        this.spaFlowFlg = spaFlowFlg;
    }

    /**
     * 泉質を設定します。
     * 
     * @param spaQuality
     *            泉質
     */
    public void setSpaQuality(String spaQuality) {
        this.spaQuality = spaQuality;
    }

    /**
     * 源泉温度を設定します。
     * 
     * @param spaTemp
     *            源泉温度
     */
    public void setSpaTemp(String spaTemp) {
        this.spaTemp = spaTemp;
    }

    /**
     * 温泉加温有り有無を設定します。
     * 
     * @param warmingFlg
     *            温泉加温有り有無
     */
    public void setWarmingFlg(String warmingFlg) {
        this.warmingFlg = warmingFlg;
    }

    /**
     * 浴槽への湯量コントロール有無を設定します。
     * 
     * @param waterControlFlg
     *            浴槽への湯量コントロール有無
     */
    public void setWaterControlFlg(String waterControlFlg) {
        this.waterControlFlg = waterControlFlg;
    }

}
