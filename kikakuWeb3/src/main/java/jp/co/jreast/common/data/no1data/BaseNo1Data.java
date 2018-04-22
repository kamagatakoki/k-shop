package jp.co.jreast.common.data.no1data;

import java.util.List;

import jp.co.jreast.common.data.PlanAnsData;

/**
 * <pre>
 * NO1共通データクラス。.
 * 機能概要    ：  NO1共通データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/11/17
 */
public class BaseNo1Data {

	/**
     * コンストラクタ.
     */
	public BaseNo1Data() {
		planAnsData = new PlanAnsData();
		no1AckInfoJrData = new No1AckInfoData();
		no1AckInfoFacilityData = new No1AckInfoData();
		initData = new No1InitData(); 
	}

	/**
	 * 捜索用データ .
	 */
	private No1InitData initData;

	/**
	 * パスワード .
	 */
	private String password;

	/**
	 * メーモ .
	 */
	private String memo;
	
	/**
	 * ユーザID .
	 */
	private String userId;
	/**
	 * ユーザ名 .
	 */
	private String userNm;
	/**
	 * 企画回答書 .
	 */
	private PlanAnsData planAnsData;

	/**
	 * NO1_承認状況 施設様 リスト .
	 * No1AckInfoData
	 */
	private List no1AckInfoFacilityList;

	/**
	 * NO1_承認状況 ＪＲ東日本様	データ .
	 */
	private No1AckInfoData no1AckInfoJrData;

	/**
	 * NO1_承認状況 施設様	データ .
	 */
	private No1AckInfoData no1AckInfoFacilityData;
	
	/**
	 * 提供料金 /NO1_料金表詳細（ゴルフ）リス
	 * No1PageChargeData//NO1ChargeDtlData.
	 */
	private List pageChargeList;

	/**
	 * 料金曜日リスト
	 * No1ChargeWeekData .
	 */
	private List chargeWeekList;
	
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
	 * @return 提供料金
	 */
	public List getPageChargeList() {
		return pageChargeList;
	}

	/**
	 * @param pageChargeList 提供料金
	 */
	public void setPageChargeList(final List pageChargeList) {
		this.pageChargeList = pageChargeList;
	}
	
	/**
	 * @return NO1_承認状況 施設様
	 */
	public List getNo1AckInfoFacilityList() {
		return no1AckInfoFacilityList;
	}

	/**
	 * @param no1AckInfoFacilityList NO1_承認状況 施設様
	 */
	public void setNo1AckInfoFacilityList(final List no1AckInfoFacilityList) {
		this.no1AckInfoFacilityList = no1AckInfoFacilityList;
	}

	/**
	 * @return NO1_承認状況 ＪＲ東日本様
	 */
	public No1AckInfoData getNo1AckInfoJrData() {
		return no1AckInfoJrData;
	}

	/**
	 * @param no1AckInfoJrData NO1_承認状況 ＪＲ東日本様
	 */
	public void setNo1AckInfoJrData(final No1AckInfoData no1AckInfoJrData) {
		this.no1AckInfoJrData = no1AckInfoJrData;
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
	 * 
	 * @return NO1_承認状況 施設様	データ
	 */
	public No1AckInfoData getNo1AckInfoFacilityData() {
		return no1AckInfoFacilityData;
	}

	/**
	 * 
	 * @param no1AckInfoFacilityData NO1_承認状況 施設様	データ
	 */
	public void setNo1AckInfoFacilityData(No1AckInfoData no1AckInfoFacilityData) {
		this.no1AckInfoFacilityData = no1AckInfoFacilityData;
	}

	/**
	 * 
	 * @return メーモ
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 
	 * @param memo メーモ
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * 
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Returns the userId.
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId The userId to set.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return Returns the userNm.
	 */
	public String getUserNm() {
		return userNm;
	}

	/**
	 * @param userNm The userNm to set.
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	
	/**
	 * 
	 * @return initData .
	 */
	public No1InitData getInitData() {
		return initData;
	}

	/**
	 * 
	 * @param initData .
	 */
	public void setInitData(No1InitData initData) {
		this.initData = initData;
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
	
	/**
	 * @return Returns the chargeInfoList.
	 */
	public List getChargeInfoList() {
		return chargeInfoList;
	}

	/**
	 * @param chargeInfoList The chargeInfoList to set.
	 */
	public void setChargeInfoList(List chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}
	/**
	 * Fax送信フラグ.
	 */
	private boolean isSendFax = false;
	/**
	 * 
	 * @return Fax送信フラグ
	 */
	public boolean isSendFax() {
		return isSendFax;
	}
	/**
	 * 
	 * @param isSendFax Fax送信フラグ
	 */
	public void setSendFax(boolean isSendFax) {
		this.isSendFax = isSendFax;
	}
	
}
