package jp.co.jreast.ur01050.data;


/**
 * <pre>
 * 各種設備情報データ。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class FacilitiesInfoData {

	/**
	 * コンストラクター
	 *　データ初期化する .
	 */
	public FacilitiesInfoData() {
		super();
		karaokeBoxData = new EquipmentData();
		gameCornerData = new EquipmentData();
		tennisCourtData = new EquipmentData();
		tableTennisData = new EquipmentData();
		poolIndoorData = new EquipmentData();
		poolOutsideData = new EquipmentData();
		fitnessData = new EquipmentData();
		newsData = new EquipmentData();
		parkFreeData = new EquipmentData();
		parkPayData = new EquipmentData();
		convenienceData = new EquipmentData();
		infantData = new GeneralInfoData();
		
		// 最寄コンビニまで徒歩追加 2009/11/13 add by s31109
		nearStoreData = new EquipmentData();
	}
		
	/**
	 * カラオケＢＯＸ .
	 */
	private EquipmentData karaokeBoxData;
	
	/**
	 * ゲームコーナー有り .
	 */
	private EquipmentData gameCornerData;
	
	/**
	 * 貴館専用テニスコート有り .
	 */
	private EquipmentData tennisCourtData;
	
	/**
	 * 卓球台有り .
	 */
	private EquipmentData tableTennisData;
	
	/**
	 * プール有り（屋内） .
	 */
	private EquipmentData poolIndoorData;
	
	/**
	 * プール有り（屋外） .
	 */
	private EquipmentData poolOutsideData;
	
	/**
	 * フィットネス施設有り .
	 */
	private EquipmentData fitnessData;
	
	/**
	 * 部屋に新聞サービス有り .
	 */
	private EquipmentData newsData;
	
	/**
	 * 駐車場（無料）有り .
	 */
	private EquipmentData parkFreeData;
	
	/**
	 * 駐車場（有料）有り .
	 */
	private EquipmentData parkPayData;
	
	/**
	 * 館内にコンビニ有 .
	 */
	private EquipmentData convenienceData;
	
	/**
	 * 乳幼児 .
	 */
	private GeneralInfoData infantData;
	
	/**
	 * 最寄コンビニ有 .
	 */
	private EquipmentData nearStoreData;

	/**
	 * 
	 * @return 館内にコンビニ有
	 */
	public EquipmentData getConvenienceData() {
		return convenienceData;
	}

	/**
	 * 
	 * @param convenienceData 館内にコンビニ有
	 */
	public void setConvenienceData(EquipmentData convenienceData) {
		this.convenienceData = convenienceData;
	}

	/**
	 * 
	 * @return フィットネス施設有り
	 */
	public EquipmentData getFitnessData() {
		return fitnessData;
	}

	/**
	 * 
	 * @param fitnessData フィットネス施設有り
	 */
	public void setFitnessData(EquipmentData fitnessData) {
		this.fitnessData = fitnessData;
	}
	
	/**
	 * 
	 * @return ゲームコーナー有り
	 */
	public EquipmentData getGameCornerData() {
		return gameCornerData;
	}

	/**
	 * 
	 * @param gameCornerData ゲームコーナー有り
	 */
	public void setGameCornerData(EquipmentData gameCornerData) {
		this.gameCornerData = gameCornerData;
	}

	/**
	 * 
	 * @return カラオケＢＯＸ
	 */
	public EquipmentData getKaraokeBoxData() {
		return karaokeBoxData;
	}

	/**
	 * 
	 * @param karaokeBoxData カラオケＢＯＸ
	 */
	public void setKaraokeBoxData(EquipmentData karaokeBoxData) {
		this.karaokeBoxData = karaokeBoxData;
	}

	/**
	 * 
	 * @return 部屋に新聞サービス有り
	 */
	public EquipmentData getNewsData() {
		return newsData;
	}

	/**
	 * 
	 * @param newsData 部屋に新聞サービス有り
	 */
	public void setNewsData(EquipmentData newsData) {
		this.newsData = newsData;
	}

	/**
	 * 
	 * @return 駐車場（無料）有り
	 */
	public EquipmentData getParkFreeData() {
		return parkFreeData;
	}
	
	/**
	 * 
	 * @param parkFreeData 駐車場（無料）有り
	 */
	public void setParkFreeData(EquipmentData parkFreeData) {
		this.parkFreeData = parkFreeData;
	}

	/**
	 * 
	 * @return 駐車場（有料）有り
	 */
	public EquipmentData getParkPayData() {
		return parkPayData;
	}

	/**
	 * 
	 * @param parkPayData 駐車場（有料）有り
	 */
	public void setParkPayData(EquipmentData parkPayData) {
		this.parkPayData = parkPayData;
	}

	/**
	 * 
	 * @return プール有り（屋外）
	 */
	public EquipmentData getPoolOutsideData() {
		return poolOutsideData;
	}

	/**

	 * @param poolOutsideData プール有り（屋外）
	 */
	public void setPoolOutsideData(EquipmentData poolOutsideData) {
		this.poolOutsideData = poolOutsideData;
	}

	/**
	 * 
	 * @return プール有り（屋内）
	 */
	public EquipmentData getPoolIndoorData() {
		return poolIndoorData;
	}

	/**
	 * 
	 * @param poolIndoorData プール有り（屋内）
	 */
	public void setPoolIndoorData(EquipmentData poolIndoorData) {
		this.poolIndoorData = poolIndoorData;
	}

	/**
	 * 
	 * @return  卓球台有り
	 */
	public EquipmentData getTableTennisData() {
		return tableTennisData;
	}

	/**
	 * 
	 * @param tableTennisData 卓球台有り
	 */
	public void setTableTennisData(EquipmentData tableTennisData) {
		this.tableTennisData = tableTennisData;
	}

	/**
	 * 
	 * @return 貴館専用テニスコート有り
	 */
	public EquipmentData getTennisCourtData() {
		return tennisCourtData;
	}

	/**
	 * 
	 * @param tennisCourtData 貴館専用テニスコート有り
	 */
	public void setTennisCourtData(EquipmentData tennisCourtData) {
		this.tennisCourtData = tennisCourtData;
	}

	/**
	 * @return infantData 乳幼児
	 */
	public GeneralInfoData getInfantData() {
		return infantData;
	}

	/**
	 * @param infantData 乳幼児
	 */
	public void setInfantData(GeneralInfoData infantData) {
		this.infantData = infantData;
	}

	/**
	 * @return infantData 最寄コンビニ有
	 */
	public EquipmentData getNearStoreData() {
		return nearStoreData;
	}

	/**
	 * @param infantData 最寄コンビニ有
	 */
	public void setNearStoreData(EquipmentData nearStoreData) {
		this.nearStoreData = nearStoreData;
	}
}
