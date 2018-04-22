package jp.co.jreast.common.data.no1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.PlanAnsData;
import jp.co.jreast.ur01050.data.TrafficData;

/**
 * <pre>
 * No1業務データクラス。.
 * 機能概要    ：  No1業務データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1FormBean implements InData, OutData{
	
	/**
	 * 施設承認情報データ.
	 */
	private No1AckInfoData no1AckInfoFacilityData;
	/**
	 * ユーザ区分.
	 */
	private String userDiv;
	
	/**
	 * 検索条件.
	 */
	private AnsSearchData ansSearchData;
	
	/**
	 * 企画回答書.
	 */
	private PlanAnsData planAnsData;
	
	/**
	 * NO1_宿泊、観光、船車.
	 */
	private INo1CommonData no1CommonData;
	
	/**
	 * NO1_JR在庫 ６社在庫.
	 */
	private No1JrStockData jr6CStockData;
	
	/**
	 * NO1_JR在庫 東日本在庫
	 * No1JrStockData.
	 * 
	 */
	private List jrEJStockList;
	
	/**
	 * 提供料金 一名当たりの額 
	 * No1ChargeTblData.
	 */
	private List chargeList;
	/**
	 * NO1_料金表詳細（ゴルフ） 
	 * No1ChargeDtlData.
	 */
	private List chargeDtlList;
	
	/**
	 * 料金曜日リスト
	 * No1ChargeWeekData.
	 */
	private List chargeWeekList;
	
	/**
	 * 料金カレンダーリスト
	 * No1ChargeCalendarData.
	 */
	private List chargeCalendarList;
	
	/**
	 * NO5_交通手段 .
	 */
	private TrafficData no5TrafficData;
	
	/**
	 * 料金情報 .
	 * No1ChargeInfoData .
	 */
	private List no1ChargeInfoList;
	
	/**
	 * 料金_平日・休日・休前日リスト	課題NO18：カレンダー設定（平日・休日・休前日）追加対応　2009/12/02 add by s31109
	 * No1ChargeDayData.
	 */
	private List chargeDayList;

	/**
	 * @return 検索条件
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData 検索条件
	 */
	public void setAnsSearchData(final AnsSearchData ansSearchData) {
		this.ansSearchData = ansSearchData;
	}

	/**
	 * @return (No1ChargeTblData) 提供料金「一名当たりの額 
	 */
	public List getChargeList() {
		return chargeList;
	}

	/**
	 * @param chargeList (No1ChargeTblData) 提供料金「一名当たりの額 
	 */
	public void setChargeList(final List chargeList) {
		this.chargeList = chargeList;
	}

	/**
	 * @return 企画回答書
	 */
	public PlanAnsData getPlanAnsData() {
		return planAnsData;
	}

	/**
	 * @param planAnsData 企画回答書
	 */
	public void setPlanAnsData(final PlanAnsData planAnsData) {
		this.planAnsData = planAnsData;
	}

	/**
	 * @return NO1_JR在庫 ６社在庫
	 */
	public No1JrStockData getJr6CStockData() {
		return jr6CStockData;
	}

	/**
	 * @param jr6CStockData NO1_JR在庫 ６社在庫
	 */
	public void setJr6CStockData(final No1JrStockData jr6CStockData) {
		this.jr6CStockData = jr6CStockData;
	}

	/**
	 * @return NO1_JR在庫 東日本在庫
	 */
	public List getJrEJStockList() {
		return jrEJStockList;
	}

	/**
	 * @param jrEJStockList NO1_JR在庫 東日本在庫
	 */
	public void setJrEJStockList(final List jrEJStockList) {
		this.jrEJStockList = jrEJStockList;
	}
	
	/**
	 * 
	 * @param i index
	 * @return NO1_JR在庫 東日本在庫
	 */
	public No1JrStockData getNo1JrStockData(int i) {
		return (No1JrStockData) jrEJStockList.get(i);
	}
	
	/**
	 * 
	 * @return 料金カレンダーリスト
	 */
	public List getChargeCalendarList() {
		return chargeCalendarList;
	}

	/**
	 * 
	 * @param chargeCalendarList 料金カレンダーリスト
	 */
	public void setChargeCalendarList(List chargeCalendarList) {
		this.chargeCalendarList = chargeCalendarList;
	}

	/**
	 * 
	 * @return 料金曜日リスト
	 */
	public List getChargeWeekList() {
		return chargeWeekList;
	}

	/**
	 * 
	 * @param chargeWeekList 料金曜日リスト
	 */
	public void setChargeWeekList(List chargeWeekList) {
		this.chargeWeekList = chargeWeekList;
	}

	/**
	 * @return the userDiv
	 */
	public final String getUserDiv() {
		return userDiv;
	}

	/**
	 * @param userDiv the userDiv to set
	 */
	public final void setUserDiv(final String userDiv) {
		this.userDiv = userDiv;
	}

	/**
	 * @return Returns the no1CommonData.
	 */
	public INo1CommonData getNo1CommonData() {
		return no1CommonData;
	}

	/**
	 * @param no1CommonData The no1CommonData to set.
	 */
	public void setNo1CommonData(INo1CommonData no1CommonData) {
		this.no1CommonData = no1CommonData;
	}
	
	/**
	 * 
	 * @return .
	 */
	public TrafficData getNo5TrafficData() {
		return no5TrafficData;
	}

	/**
	 * 
	 * @param no5TrafficData .
	 */
	public void setNo5TrafficData(TrafficData no5TrafficData) {
		this.no5TrafficData = no5TrafficData;
	}
	
	/**
	 * 
	 * @return .
	 */
	public List getNo1ChargeInfoList() {
		return no1ChargeInfoList;
	}

	/**
	 * 
	 * @param no1ChargeInfoList .
	 */
	public void setNo1ChargeInfoList(List no1ChargeInfoList) {
		this.no1ChargeInfoList = no1ChargeInfoList;
	}

	/**
	 * @return Returns the chargeDtlList.
	 */
	public List getChargeDtlList() {
		return chargeDtlList;
	}

	/**
	 * @param chargeDtlList The chargeDtlList to set.
	 */
	public void setChargeDtlList(List chargeDtlList) {
		this.chargeDtlList = chargeDtlList;
	}
	/**
	 * 
	 * @return 施設承認情報データ
	 */
	public No1AckInfoData getNo1AckInfoFacilityData() {
		return no1AckInfoFacilityData;
	}
	/**
	 * 
	 * @param no1AckInfoFacilityData 施設承認情報データ
	 */
	public void setNo1AckInfoFacilityData(No1AckInfoData no1AckInfoFacilityData) {
		this.no1AckInfoFacilityData = no1AckInfoFacilityData;
	}
	
	/**
	 * 
	 * @return 料金_平日・休日・休前日リスト
	 */
	public List getChargeDayList() {
		return chargeDayList;
	}

	/**
	 * 
	 * @param chargeDayList 料金_平日・休日・休前日リスト
	 */
	public void setChargeDayList(List chargeDayList) {
		this.chargeDayList = chargeDayList;
	}
}
