package jp.co.jreast.common.data.dno1data;

import java.util.List;

import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.FacilityData;

/**
 * <pre>
 * [DP/RM]NO1共通データクラス。
 * 機能概要    ：  [DP/RM]NO1共通データを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public class BaseDNo1Data {

    /**
     * 料金_平日・休日・休前日リスト
     * 課題NO18：カレンダー設定（平日・休日・休前日）追加対応　2009/12/02 add by s31109
     * No1ChargeWeekData .
     */
    private List chargeDayList;

    /**
     * 料金情報データ .
     */
    private List chargeInfoList;

    /**
     * 料金曜日リスト
     * No1ChargeWeekData .
     */
    private List chargeWeekList;

    /**
     * 施設情報マスタデータクラス
     */
    private FacilityData facilityData;

    /**
     * 捜索用データ .
     */
    private DNo1InitData initData;

    /**
     * Fax送信フラグ.
     */
    private boolean isSendFax = false;

    /**
     * メーモ .
     */
    private String memo;

    /**
     * NO1_承認状況 施設様 データ .
     */
    private DNo1AckInfoData no1AckInfoFacilityData;

    /**
     * NO1_承認状況 施設様 リスト .
     * No1AckInfoData
     */
    private List no1AckInfoFacilityList;

    /**
     * NO1_承認状況 ＪＲ東日本様 データ .
     */
    private DNo1AckInfoData no1AckInfoJrData;

    /**
     * 提供料金 /NO1_料金表詳細（ゴルフ）リス
     * No1PageChargeData//NO1ChargeDtlData.
     */
    private List pageChargeList;

    /**
     * パスワード .
     */
    private String password;

    /**
     * 企画回答書 .
     */
    private DPlanAnsData planAnsData;

    /**
     * ユーザID .
     */
    private String userId;

    /**
     * ユーザ名 .
     */
    private String userNm;

    /**
     * コンストラクタ.
     */
    public BaseDNo1Data() {
        planAnsData = new DPlanAnsData();
        no1AckInfoJrData = new DNo1AckInfoData();
        no1AckInfoFacilityData = new DNo1AckInfoData();
        initData = new DNo1InitData();
    }

    /**
     * @return 料金_平日・休日・休前日リスト
     */
    public List getChargeDayList() {
        return chargeDayList;
    }

    /**
     * @return Returns the chargeInfoList.
     */
    public List getChargeInfoList() {
        return chargeInfoList;
    }

    /**
     * @return 料金曜日リスト
     */
    public List getChargeWeekList() {
        return chargeWeekList;
    }

    /**
     * 施設情報マスタデータクラスを取得します。
     * 
     * @return 施設情報マスタデータクラス
     */
    public FacilityData getFacilityData() {
        return facilityData;
    }

    /**
     * @return initData .
     */
    public DNo1InitData getInitData() {
        return initData;
    }

    /**
     * @return メーモ
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @return NO1_承認状況 施設様 データ
     */
    public DNo1AckInfoData getNo1AckInfoFacilityData() {
        return no1AckInfoFacilityData;
    }

    /**
     * @return NO1_承認状況 施設様
     */
    public List getNo1AckInfoFacilityList() {
        return no1AckInfoFacilityList;
    }

    /**
     * @return NO1_承認状況 ＪＲ東日本様
     */
    public DNo1AckInfoData getNo1AckInfoJrData() {
        return no1AckInfoJrData;
    }

    /**
     * @return 提供料金
     */
    public List getPageChargeList() {
        return pageChargeList;
    }

    /**
     * @return パスワード
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return 企画回答書
     */
    public DPlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return Returns the userId.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return Returns the userNm.
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * @return Fax送信フラグ
     */
    public boolean isSendFax() {
        return isSendFax;
    }

    /**
     * @param chargeDayList
     *            料金_平日・休日・休前日リスト
     */
    public void setChargeDayList(List chargeDayList) {
        this.chargeDayList = chargeDayList;
    }

    /**
     * @param chargeInfoList
     *            The chargeInfoList to set.
     */
    public void setChargeInfoList(List chargeInfoList) {
        this.chargeInfoList = chargeInfoList;
    }

    /**
     * @param chargeWeekList
     *            料金曜日リスト
     */
    public void setChargeWeekList(List chargeWeekList) {
        this.chargeWeekList = chargeWeekList;
    }

    /**
     * 施設情報マスタデータクラスを設定します。
     * 
     * @param facilityData
     *            施設情報マスタデータクラス
     */
    public void setFacilityData(FacilityData facilityData) {
        this.facilityData = facilityData;
    }

    /**
     * @param initData
     *            .
     */
    public void setInitData(DNo1InitData initData) {
        this.initData = initData;
    }

    /**
     * @param memo
     *            メーモ
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @param no1AckInfoFacilityData
     *            NO1_承認状況 施設様 データ
     */
    public void setNo1AckInfoFacilityData(DNo1AckInfoData no1AckInfoFacilityData) {
        this.no1AckInfoFacilityData = no1AckInfoFacilityData;
    }

    /**
     * @param no1AckInfoFacilityList
     *            NO1_承認状況 施設様
     */
    public void setNo1AckInfoFacilityList(final List no1AckInfoFacilityList) {
        this.no1AckInfoFacilityList = no1AckInfoFacilityList;
    }

    /**
     * @param no1AckInfoJrData
     *            NO1_承認状況 ＪＲ東日本様
     */
    public void setNo1AckInfoJrData(final DNo1AckInfoData no1AckInfoJrData) {
        this.no1AckInfoJrData = no1AckInfoJrData;
    }

    /**
     * @param pageChargeList
     *            提供料金
     */
    public void setPageChargeList(final List pageChargeList) {
        this.pageChargeList = pageChargeList;
    }

    /**
     * @param password
     *            パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param planAnsData
     *            企画回答書
     */
    public void setPlanAnsData(final DPlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param isSendFax
     *            Fax送信フラグ
     */
    public void setSendFax(boolean isSendFax) {
        this.isSendFax = isSendFax;
    }

    /**
     * @param userId
     *            The userId to set.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @param userNm
     *            The userNm to set.
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

}
