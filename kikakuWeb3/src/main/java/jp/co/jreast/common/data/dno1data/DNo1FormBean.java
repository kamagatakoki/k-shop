package jp.co.jreast.common.data.dno1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.ddata.DNo5TrafficData;
import jp.co.jreast.common.data.ddata.DPlanAnsFacility;
import jp.co.jreast.common.data.ddata.MStock;

/**
 * <pre>
 * [DP/RM]No1業務データクラス。.
 * 機能概要    ：  [DP/RM]No1業務データを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public final class DNo1FormBean implements InData, OutData {

    /**
     * 検索条件.
     */
    private AnsSearchData ansSearchData;

    /**
     * 料金カレンダーリスト
     * No1ChargeCalendarData.
     */
    private List<DNo1ChargeCalendarData> chargeCalendarList;

    /**
     * 料金_平日・休日・休前日リスト
     * No1ChargeDayData.
     */
    private List<DNo1ChargeDayData> chargeDayList;

    /**
     * NO1_料金表詳細（ゴルフ）
     * No1ChargeDtlData.
     */
    private List<DNo1ChargeDtlData> chargeDtlList;

    /**
     * 提供料金 一名当たりの額
     * No1ChargeTblData.
     */
    private List<DNo1ChargeTblData> chargeList;

    /**
     * 料金曜日リスト
     * No1ChargeWeekData.
     */
    private List<DNo1ChargeWeekData> chargeWeekList;

    /**
     * 企画回答書_施設情報
     */
    private DPlanAnsFacility dPlanAnsFacility;

    /**
     * NO1_JR在庫 ６社在庫.
     */
    private DNo1JrStockData jr6CStockData;

    /**
     * NO1_JR在庫 東日本在庫
     * No1JrStockData.
     */
    private List<DNo1JrStockData> jrEJStockList;

    /** 在庫管理マスタエンティティ */
    private MStock mStock;

    /**
     * 施設承認情報データ.
     */
    private DNo1AckInfoData no1AckInfoFacilityData;

    /**
     * 料金情報 .
     * No1ChargeInfoData .
     */
    private List<DNo1ChargeInfoData> no1ChargeInfoList;

    /**
     * NO1_宿泊、観光、船車.
     */
    private IDNo1CommonData no1CommonData;

    /**
     * NO2を更新する判定フラグ
     */
    private String no2Flg = JreConstants.FLG_FALSE;

    /**
     * NO5_交通手段 .
     */
    private DNo5TrafficData no5TrafficData;

    /**
     * 企画回答書.
     */
    private DPlanAnsData planAnsData;

    /**
     * ユーザ区分.
     */
    private String userDiv;

    /**
     * @return 検索条件
     */
    public AnsSearchData getAnsSearchData() {
        return ansSearchData;
    }

    /**
     * @return 料金カレンダーリスト
     */
    public List<DNo1ChargeCalendarData> getChargeCalendarList() {
        return chargeCalendarList;
    }

    /**
     * @return 料金_平日・休日・休前日リスト
     */
    public List<DNo1ChargeDayData> getChargeDayList() {
        return chargeDayList;
    }

    /**
     * @return Returns the chargeDtlList.
     */
    public List<DNo1ChargeDtlData> getChargeDtlList() {
        return chargeDtlList;
    }

    /**
     * @return (No1ChargeTblData) 提供料金「一名当たりの額
     */
    public List<DNo1ChargeTblData> getChargeList() {
        return chargeList;
    }

    /**
     * @return 料金曜日リスト
     */
    public List<DNo1ChargeWeekData> getChargeWeekList() {
        return chargeWeekList;
    }

    /**
     * 企画回答書_施設情報を取得します。
     * @return 企画回答書_施設情報
     */
    public DPlanAnsFacility getDPlanAnsFacility() {
        return dPlanAnsFacility;
    }

    /**
     * 企画回答書_施設情報を設定します。
     * @param dPlanAnsFacility 企画回答書_施設情報
     */
    public void setdPlanAnsFacility(DPlanAnsFacility dPlanAnsFacility) {
        this.dPlanAnsFacility = dPlanAnsFacility;
    }

    /**
     * @return NO1_JR在庫 ６社在庫
     */
    public DNo1JrStockData getJr6CStockData() {
        return jr6CStockData;
    }

    /**
     * @return NO1_JR在庫 東日本在庫
     */
    public List<DNo1JrStockData> getJrEJStockList() {
        return jrEJStockList;
    }

    /**
     * 在庫管理マスタエンティティを取得します。
     * 
     * @return 在庫管理マスタエンティティ
     */
    public MStock getMStock() {
        return mStock;
    }

    /**
     * @return 施設承認情報データ
     */
    public DNo1AckInfoData getNo1AckInfoFacilityData() {
        return no1AckInfoFacilityData;
    }

    /**
     * @return .
     */
    public List<DNo1ChargeInfoData> getNo1ChargeInfoList() {
        return no1ChargeInfoList;
    }

    /**
     * @return Returns the no1CommonData.
     */
    public IDNo1CommonData getNo1CommonData() {
        return no1CommonData;
    }

    /**
     * @param i
     *            index
     * @return NO1_JR在庫 東日本在庫
     */
    public DNo1JrStockData getNo1JrStockData(int i) {
        return jrEJStockList.get(i);
    }

    /**
     * NO2を更新する判定フラグを取得します。
     * 
     * @return NO2を更新する判定フラグ
     */
    public String getNo2Flg() {
        return no2Flg;
    }

    /**
     * @return .
     */
    public DNo5TrafficData getNo5TrafficData() {
        return no5TrafficData;
    }

    /**
     * @return 企画回答書
     */
    public DPlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return the userDiv
     */
    public final String getUserDiv() {
        return userDiv;
    }

    /**
     * @param ansSearchData
     *            検索条件
     */
    public void setAnsSearchData(final AnsSearchData ansSearchData) {
        this.ansSearchData = ansSearchData;
    }

    /**
     * @param chargeCalendarList
     *            料金カレンダーリスト
     */
    public void setChargeCalendarList(List chargeCalendarList) {
        this.chargeCalendarList = chargeCalendarList;
    }

    /**
     * @param chargeDayList
     *            料金_平日・休日・休前日リスト
     */
    public void setChargeDayList(List chargeDayList) {
        this.chargeDayList = chargeDayList;
    }

    /**
     * @param chargeDtlList
     *            The chargeDtlList to set.
     */
    public void setChargeDtlList(List chargeDtlList) {
        this.chargeDtlList = chargeDtlList;
    }

    /**
     * @param chargeList
     *            (No1ChargeTblData) 提供料金「一名当たりの額
     */
    public void setChargeList(final List chargeList) {
        this.chargeList = chargeList;
    }

    /**
     * @param chargeWeekList
     *            料金曜日リスト
     */
    public void setChargeWeekList(List chargeWeekList) {
        this.chargeWeekList = chargeWeekList;
    }

    /**
     * @param jr6CStockData
     *            NO1_JR在庫 ６社在庫
     */
    public void setJr6CStockData(final DNo1JrStockData jr6CStockData) {
        this.jr6CStockData = jr6CStockData;
    }

    /**
     * @param jrEJStockList
     *            NO1_JR在庫 東日本在庫
     */
    public void setJrEJStockList(final List jrEJStockList) {
        this.jrEJStockList = jrEJStockList;
    }

    /**
     * 在庫管理マスタエンティティを設定します。
     * 
     * @param mStock
     *            在庫管理マスタエンティティ
     */
    public void setMStock(MStock mStock) {
        this.mStock = mStock;
    }

    /**
     * @param no1AckInfoFacilityData
     *            施設承認情報データ
     */
    public void setNo1AckInfoFacilityData(DNo1AckInfoData no1AckInfoFacilityData) {
        this.no1AckInfoFacilityData = no1AckInfoFacilityData;
    }

    /**
     * @param no1ChargeInfoList
     *            .
     */
    public void setNo1ChargeInfoList(List no1ChargeInfoList) {
        this.no1ChargeInfoList = no1ChargeInfoList;
    }

    /**
     * @param no1CommonData
     *            The no1CommonData to set.
     */
    public void setNo1CommonData(IDNo1CommonData no1CommonData) {
        this.no1CommonData = no1CommonData;
    }

    /**
     * no2Flgを設定します。
     * 
     * @param no2Flg
     *            no2Flg
     */
    public void setNo2Flg(String no2Flg) {
        this.no2Flg = no2Flg;
    }

    /**
     * @param no5TrafficData
     *            .
     */
    public void setNo5TrafficData(DNo5TrafficData no5TrafficData) {
        this.no5TrafficData = no5TrafficData;
    }

    /**
     * @param planAnsData
     *            企画回答書
     */
    public void setPlanAnsData(final DPlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param userDiv
     *            the userDiv to set
     */
    public final void setUserDiv(final String userDiv) {
        this.userDiv = userDiv;
    }
}
