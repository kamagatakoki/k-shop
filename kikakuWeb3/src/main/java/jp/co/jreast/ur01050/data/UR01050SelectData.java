package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.PlanAnsData;

/**
 * <pre>
 * 『NO5』画面のデータクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class UR01050SelectData implements OutData, InData {
	
	/**
	 * コンストラクター
	 *　データ初期化する .
	 */
	public UR01050SelectData() {
		headData = new PlanAnsData();
		generalData = new GeneralInfoData();
		bathInfoData = new BathInfoData();
		facilitiesInfoData = new FacilitiesInfoData();
		trafficData = new TrafficData();
		memoData = new MemoData();
	} 

	/**
	 * 通信メモデータ .
	 */
	private MemoData memoData;
	
	/**
	 * 『NO5』画面のヘッドデータ .
	 */
	private PlanAnsData headData;

	/**
	 * 普通情報　と　詳細項目情報データ .
	 */
	private GeneralInfoData generalData;

	/**
	 * お風呂情報データ .
	 */
	private BathInfoData bathInfoData;

	/**
	 * 各種設備情報データ .
	 */
	private FacilitiesInfoData facilitiesInfoData;
	
	/**
	 * 交通情報データ .
	 */
	private TrafficData trafficData;

	/**
	 * @return bathInfoData お風呂情報データ
	 */
	public BathInfoData getBathInfoData() {
		return bathInfoData;
	}

	/**
	 * @param bathInfoData お風呂情報データ
	 */
	public void setBathInfoData(BathInfoData bathInfoData) {
		this.bathInfoData = bathInfoData;
	}

	/**
	 * @return facilitiesInfoData 各種設備情報データ
	 */
	public FacilitiesInfoData getFacilitiesInfoData() {
		return facilitiesInfoData;
	}

	/**
	 * @param facilitiesInfoData 各種設備情報データ
	 */
	public void setFacilitiesInfoData(FacilitiesInfoData facilitiesInfoData) {
		this.facilitiesInfoData = facilitiesInfoData;
	}

	/**
	 * @return generalData 普通情報　と　詳細項目情報データ
	 */
	public GeneralInfoData getGeneralData() {
		return generalData;
	}

	/**
	 * @param generalData 普通情報　と　詳細項目情報データ
	 */
	public void setGeneralData(GeneralInfoData generalData) {
		this.generalData = generalData;
	}

	/**
	 * @return headData 『NO5』画面のヘッドデータ
	 */
	public PlanAnsData getHeadData() {
		return headData;
	}

	/**
	 * @param headData 『NO5』画面のヘッドデータ
	 */
	public void setHeadData(PlanAnsData headData) {
		this.headData = headData;
	}

	/**
	 * @return trafficData 交通情報データ
	 */
	public TrafficData getTrafficData() {
		return trafficData;
	}

	/**
	 * @param trafficData 交通情報データ
	 */
	public void setTrafficData(TrafficData trafficData) {
		this.trafficData = trafficData;
	}

	/**
	 * 
	 * @return 通信メモデータ
	 */
	public MemoData getMemoData() {
		return memoData;
	}

	/**
	 * 
	 * @param memoData 通信メモデータ
	 */
	public void setMemoData(MemoData memoData) {
		this.memoData = memoData;
	}


}
