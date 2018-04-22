package jp.co.jreast.common.data.ddata;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * [DP/RM]施設_設備 エンティティ
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
public class DFacilityEquipment implements FacilityManageBodyKey {

	/** 料金有無 */
	private String chargeFlg;

	/** 設備有無 */
	private String equipmentFlg;

	/** 設備種別 */
	private Integer equipmentKind;

	/** 施設コード */
	private String facilityCd;

	/** 設備数量 */
	private String facilityNum;

	/** 施設パターン */
	private String facilityPattern;

	/** ジャンル1 */
	private String genre1;

	/** ジャンル2 */
	private String genre2;

	/** ジャンル3 */
	private String genre3;

	/** ジャンル4 */
	private String genre4;

	/** ジャンル5 */
	private String genre5;

	/** ジャンルその他内容1 */
	private String genreOthers1;

	/** ジャンルその他内容2 */
	private String genreOthers2;

	/** ジャンルその他内容3 */
	private String genreOthers3;

	/** ジャンルその他内容4 */
	private String genreOthers4;

	/** ジャンルその他内容5 */
	private String genreOthers5;

	/** 回答書種別 */
	private String kindFlg;

	/** LAN利用料金 */
	private String lanFee;

	/** LAN料金有無 */
	private String lanFlg;

	/** LAN利用時間 */
	private String lanTime;

	/** インターネット備考 */
	private String netNote;

	/** 新聞サービス区分 */
	private String newspaperServiceDiv;

	/** 駐車場利用台数 */
	private String parkAvailableNum;

	/** 駐車場一泊金額 */
	private String parkCharge;

	/** 駐車場備考 */
	private String parkNote;

	/** コンビニ営業開始時間（時間） */
	private String storeBeginHour;

	/** コンビニ営業開始時間（分） */
	private String storeBeginMinute;

	/** コンビニ営業終了時間（時間） */
	private String storeEndHour;

	/** コンビニ営業終了時間（分） */
	private String storeEndMinute;

	/** 店名1 */
	private String storeNm1;

	/** 店名2 */
	private String storeNm2;

	/** 店名3 */
	private String storeNm3;

	/** 店名4 */
	private String storeNm4;

	/** 店名5 */
	private String storeNm5;

	/** SUICA_飲食施設有り */
	private String suicaFooddrinkFlg;

	/** SUICA_飲食施設名 */
	private String suicaFooddrinkNm;

	/** SUICA_フロント有り */
	private String suicaFrontFlg;

	/** SUICA_その他有り */
	private String suicaOtherFlg;

	/** SUICA_その他備考 */
	private String suicaOtherNote;

	/** ズボンプレッサー区分 */
	private String trouserPressDiv;

	/** ズボンプレッサー備考 */
	private String trouserPressNote;

	/** 利用料金 */
	private String useFee;

	/** 利用可能期間 */
	private String usePeriod;

	/** 利用時間 */
	private String useTime;

	/** WIFI利用料金 */
	private String wifiFee;

	/** WIFI料金有無 */
	private String wifiFlg;

	/** WIFI利用時間 */
	private String wifiTime;

	/**
	 * コンストラクタ
	 */
	public DFacilityEquipment() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param equipmentKind
	 *            設備種別
	 */
	public DFacilityEquipment(Integer equipmentKind) {
		super();
		this.equipmentKind = equipmentKind;
	}

	/**
	 * 料金有無を取得します。
	 *
	 * @return 料金有無
	 */
	public String getChargeFlg() {
		return chargeFlg;
	}

	/**
	 * 設備有無を取得します。
	 *
	 * @return 設備有無
	 */
	public String getEquipmentFlg() {
		return equipmentFlg;
	}

	/**
	 * 設備種別を取得します。
	 *
	 * @return 設備種別
	 */
	public Integer getEquipmentKind() {
		return equipmentKind;
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
	 * 設備数量を取得します。
	 *
	 * @return 設備数量
	 */
	public String getFacilityNum() {
		return facilityNum;
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
	 * ジャンル1を取得します。
	 *
	 * @return ジャンル1
	 */
	public String getGenre1() {
		return genre1;
	}

	/**
	 * ジャンル2を取得します。
	 *
	 * @return ジャンル2
	 */
	public String getGenre2() {
		return genre2;
	}

	/**
	 * ジャンル3を取得します。
	 *
	 * @return ジャンル3
	 */
	public String getGenre3() {
		return genre3;
	}

	/**
	 * ジャンル4を取得します。
	 *
	 * @return ジャンル4
	 */
	public String getGenre4() {
		return genre4;
	}

	/**
	 * ジャンル5を取得します。
	 *
	 * @return ジャンル5
	 */
	public String getGenre5() {
		return genre5;
	}

	/**
	 * ジャンルその他内容1を取得します。
	 *
	 * @return ジャンルその他内容1
	 */
	public String getGenreOthers1() {
		return genreOthers1;
	}

	/**
	 * ジャンルその他内容2を取得します。
	 *
	 * @return ジャンルその他内容2
	 */
	public String getGenreOthers2() {
		return genreOthers2;
	}

	/**
	 * ジャンルその他内容3を取得します。
	 *
	 * @return ジャンルその他内容3
	 */
	public String getGenreOthers3() {
		return genreOthers3;
	}

	/**
	 * ジャンルその他内容4を取得します。
	 *
	 * @return ジャンルその他内容4
	 */
	public String getGenreOthers4() {
		return genreOthers4;
	}

	/**
	 * ジャンルその他内容5を取得します。
	 *
	 * @return ジャンルその他内容5
	 */
	public String getGenreOthers5() {
		return genreOthers5;
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
	 * LAN利用料金を取得します。
	 *
	 * @return LAN利用料金
	 */
	public String getLanFee() {
		return lanFee;
	}

	/**
	 * LAN料金有無を取得します。
	 *
	 * @return LAN料金有無
	 */
	public String getLanFlg() {
		return lanFlg;
	}

	/**
	 * LAN利用時間を取得します。
	 *
	 * @return LAN利用時間
	 */
	public String getLanTime() {
		return lanTime;
	}

	/**
	 * インターネット備考を取得します。
	 *
	 * @return インターネット備考
	 */
	public String getNetNote() {
		return netNote;
	}

	/**
	 * 新聞サービス区分を取得します。
	 *
	 * @return 新聞サービス区分
	 */
	public String getNewspaperServiceDiv() {
		return newspaperServiceDiv;
	}

	/**
	 * 駐車場利用台数を取得します。
	 *
	 * @return 駐車場利用台数
	 */
	public String getParkAvailableNum() {
		return parkAvailableNum;
	}

	/**
	 * 駐車場一泊金額を取得します。
	 *
	 * @return 駐車場一泊金額
	 */
	public String getParkCharge() {
		return parkCharge;
	}

	/**
	 * 駐車場備考を取得します。
	 *
	 * @return 駐車場備考
	 */
	public String getParkNote() {
		return parkNote;
	}

	/**
	 * コンビニ営業開始時間を取得します。
	 *
	 * @return コンビニ営業開始時間
	 */
	public String getStoreBegin() {
		return KikakuWebUtil.buildTime(getStoreBeginHour(),
				getStoreBeginMinute());
	}

	/**
	 * コンビニ営業開始時間（時間）を取得します。
	 *
	 * @return コンビニ営業開始時間（時間）
	 */
	public String getStoreBeginHour() {
		return storeBeginHour;
	}

	/**
	 * コンビニ営業開始時間（分）を取得します。
	 *
	 * @return コンビニ営業開始時間（分）
	 */
	public String getStoreBeginMinute() {
		return storeBeginMinute;
	}

	/**
	 * コンビニ営業終了時間を取得します。
	 *
	 * @return コンビニ営業終了時間
	 */
	public String getStoreEnd() {
		return KikakuWebUtil.buildTime(getStoreEndHour(), getStoreEndMinute());
	}

	/**
	 * コンビニ営業終了時間（時間）を取得します。
	 *
	 * @return コンビニ営業終了時間（時間）
	 */
	public String getStoreEndHour() {
		return storeEndHour;
	}

	/**
	 * コンビニ営業終了時間（分）を取得します。
	 *
	 * @return コンビニ営業終了時間（分）
	 */
	public String getStoreEndMinute() {
		return storeEndMinute;
	}

	/**
	 * 店名1を取得します。
	 *
	 * @return 店名1
	 */
	public String getStoreNm1() {
		return storeNm1;
	}

	/**
	 * 店名2を取得します。
	 *
	 * @return 店名2
	 */
	public String getStoreNm2() {
		return storeNm2;
	}

	/**
	 * 店名3を取得します。
	 *
	 * @return 店名3
	 */
	public String getStoreNm3() {
		return storeNm3;
	}

	/**
	 * 店名4を取得します。
	 *
	 * @return 店名4
	 */
	public String getStoreNm4() {
		return storeNm4;
	}

	/**
	 * 店名5を取得します。
	 *
	 * @return 店名5
	 */
	public String getStoreNm5() {
		return storeNm5;
	}

	/**
	 * SUICA_飲食施設有りを取得します。
	 *
	 * @return SUICA_飲食施設有り
	 */
	public String getSuicaFooddrinkFlg() {
		return suicaFooddrinkFlg;
	}

	/**
	 * SUICA_飲食施設名を取得します。
	 *
	 * @return SUICA_飲食施設名
	 */
	public String getSuicaFooddrinkNm() {
		return suicaFooddrinkNm;
	}

	/**
	 * SUICA_フロント有りを取得します。
	 *
	 * @return SUICA_フロント有り
	 */
	public String getSuicaFrontFlg() {
		return suicaFrontFlg;
	}

	/**
	 * SUICA_その他有りを取得します。
	 *
	 * @return SUICA_その他有り
	 */
	public String getSuicaOtherFlg() {
		return suicaOtherFlg;
	}

	/**
	 * SUICA_その他備考を取得します。
	 *
	 * @return SUICA_その他備考
	 */
	public String getSuicaOtherNote() {
		return suicaOtherNote;
	}

	/**
	 * ズボンプレッサー区分を取得します。
	 *
	 * @return ズボンプレッサー区分
	 */
	public String getTrouserPressDiv() {
		return trouserPressDiv;
	}

	/**
	 * ズボンプレッサー備考を取得します。
	 *
	 * @return ズボンプレッサー備考
	 */
	public String getTrouserPressNote() {
		return trouserPressNote;
	}

	/**
	 * 利用料金を取得します。
	 *
	 * @return 利用料金
	 */
	public String getUseFee() {
		return useFee;
	}

	/**
	 * 利用可能期間を取得します。
	 *
	 * @return 利用可能期間
	 */
	public String getUsePeriod() {
		return usePeriod;
	}

	/**
	 * 利用時間を取得します。
	 *
	 * @return 利用時間
	 */
	public String getUseTime() {
		return useTime;
	}

	/**
	 * WIFI利用料金を取得します。
	 *
	 * @return WIFI利用料金
	 */
	public String getWifiFee() {
		return wifiFee;
	}

	/**
	 * WIFI料金有無を取得します。
	 *
	 * @return WIFI料金有無
	 */
	public String getWifiFlg() {
		return wifiFlg;
	}

	/**
	 * WIFI利用時間を取得します。
	 *
	 * @return WIFI利用時間
	 */
	public String getWifiTime() {
		return wifiTime;
	}

	/**
	 * 料金有無を設定します。
	 *
	 * @param chargeFlg
	 *            料金有無
	 */
	public void setChargeFlg(String chargeFlg) {
		this.chargeFlg = chargeFlg;
	}

	/**
	 * 設備有無を設定します。
	 *
	 * @param equipmentFlg
	 *            設備有無
	 */
	public void setEquipmentFlg(String equipmentFlg) {
		this.equipmentFlg = equipmentFlg;
	}

	/**
	 * 設備種別を設定します。
	 *
	 * @param equipmentKind
	 *            設備種別
	 */
	public void setEquipmentKind(Integer equipmentKind) {
		this.equipmentKind = equipmentKind;
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
	 * 設備数量を設定します。
	 *
	 * @param facilityNum
	 *            設備数量
	 */
	public void setFacilityNum(String facilityNum) {
		this.facilityNum = facilityNum;
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
	 * ジャンル1を設定します。
	 *
	 * @param genre1
	 *            ジャンル1
	 */
	public void setGenre1(String genre1) {
		this.genre1 = StringUtils.trim(genre1);
	}

	/**
	 * ジャンル2を設定します。
	 *
	 * @param genre2
	 *            ジャンル2
	 */
	public void setGenre2(String genre2) {
		this.genre2 = StringUtils.trim(genre2);
	}

	/**
	 * ジャンル3を設定します。
	 *
	 * @param genre3
	 *            ジャンル3
	 */
	public void setGenre3(String genre3) {
		this.genre3 = StringUtils.trim(genre3);
	}

	/**
	 * ジャンル4を設定します。
	 *
	 * @param genre4
	 *            ジャンル4
	 */
	public void setGenre4(String genre4) {
		this.genre4 = StringUtils.trim(genre4);
	}

	/**
	 * ジャンル5を設定します。
	 *
	 * @param genre5
	 *            ジャンル5
	 */
	public void setGenre5(String genre5) {
		this.genre5 = StringUtils.trim(genre5);
	}

	/**
	 * ジャンルその他内容1を設定します。
	 *
	 * @param genreOthers1
	 *            ジャンルその他内容1
	 */
	public void setGenreOthers1(String genreOthers1) {
		this.genreOthers1 = genreOthers1;
	}

	/**
	 * ジャンルその他内容2を設定します。
	 *
	 * @param genreOthers2
	 *            ジャンルその他内容2
	 */
	public void setGenreOthers2(String genreOthers2) {
		this.genreOthers2 = genreOthers2;
	}

	/**
	 * ジャンルその他内容3を設定します。
	 *
	 * @param genreOthers3
	 *            ジャンルその他内容3
	 */
	public void setGenreOthers3(String genreOthers3) {
		this.genreOthers3 = genreOthers3;
	}

	/**
	 * ジャンルその他内容4を設定します。
	 *
	 * @param genreOthers4
	 *            ジャンルその他内容4
	 */
	public void setGenreOthers4(String genreOthers4) {
		this.genreOthers4 = genreOthers4;
	}

	/**
	 * ジャンルその他内容5を設定します。
	 *
	 * @param genreOthers5
	 *            ジャンルその他内容5
	 */
	public void setGenreOthers5(String genreOthers5) {
		this.genreOthers5 = genreOthers5;
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
	 * LAN利用料金を設定します。
	 *
	 * @param lanFee
	 *            LAN利用料金
	 */
	public void setLanFee(String lanFee) {
		this.lanFee = lanFee;
	}

	/**
	 * LAN料金有無を設定します。
	 *
	 * @param lanFlg
	 *            LAN料金有無
	 */
	public void setLanFlg(String lanFlg) {
		this.lanFlg = lanFlg;
	}

	/**
	 * LAN利用時間を設定します。
	 *
	 * @param lanTime
	 *            LAN利用時間
	 */
	public void setLanTime(String lanTime) {
		this.lanTime = lanTime;
	}

	/**
	 * インターネット備考を設定します。
	 *
	 * @param netNote
	 *            インターネット備考
	 */
	public void setNetNote(String netNote) {
		this.netNote = netNote;
	}

	/**
	 * 新聞サービス区分を設定します。
	 *
	 * @param newspaperServiceDiv
	 *            新聞サービス区分
	 */
	public void setNewspaperServiceDiv(String newspaperServiceDiv) {
		this.newspaperServiceDiv = newspaperServiceDiv;
	}

	/**
	 * 駐車場利用台数を設定します。
	 *
	 * @param parkAvailableNum
	 *            駐車場利用台数
	 */
	public void setParkAvailableNum(String parkAvailableNum) {
		this.parkAvailableNum = parkAvailableNum;
	}

	/**
	 * 駐車場一泊金額を設定します。
	 *
	 * @param parkCharge
	 *            駐車場一泊金額
	 */
	public void setParkCharge(String parkCharge) {
		this.parkCharge = parkCharge;
	}

	/**
	 * 駐車場備考を設定します。
	 *
	 * @param parkNote
	 *            駐車場備考
	 */
	public void setParkNote(String parkNote) {
		this.parkNote = parkNote;
	}

	/**
	 * コンビニ営業開始時間を設定します。
	 *
	 * @param storeBegin
	 *            コンビニ営業開始時間
	 */
	public void setStoreBegin(String storeBegin) {
		setStoreBeginHour(KikakuWebUtil.getHourFormTime(storeBegin));
		setStoreBeginMinute(KikakuWebUtil.getMinuteFromTime(storeBegin));
	}

	/**
	 * コンビニ営業開始時間（時間）を設定します。
	 *
	 * @param storeBeginHour
	 *            コンビニ営業開始時間（時間）
	 */
	public void setStoreBeginHour(String storeBeginHour) {
		this.storeBeginHour = storeBeginHour;
	}

	/**
	 * コンビニ営業開始時間（分）を設定します。
	 *
	 * @param storeBeginMinute
	 *            コンビニ営業開始時間（分）
	 */
	public void setStoreBeginMinute(String storeBeginMinute) {
		this.storeBeginMinute = storeBeginMinute;
	}

	/**
	 * コンビニ営業終了時間を設定します。
	 *
	 * @param storeEnd
	 *            コンビニ営業終了時間
	 */
	public void setStoreEnd(String storeEnd) {
		setStoreEndHour(KikakuWebUtil.getHourFormTime(storeEnd));
		setStoreEndMinute(KikakuWebUtil.getMinuteFromTime(storeEnd));
	}

	/**
	 * コンビニ営業終了時間（時間）を設定します。
	 *
	 * @param storeEndHour
	 *            コンビニ営業終了時間（時間）
	 */
	public void setStoreEndHour(String storeEndHour) {
		this.storeEndHour = storeEndHour;
	}

	/**
	 * コンビニ営業終了時間（分）を設定します。
	 *
	 * @param storeEndMinute
	 *            コンビニ営業終了時間（分）
	 */
	public void setStoreEndMinute(String storeEndMinute) {
		this.storeEndMinute = storeEndMinute;
	}

	/**
	 * 店名1を設定します。
	 *
	 * @param storeNm1
	 *            店名1
	 */
	public void setStoreNm1(String storeNm1) {
		this.storeNm1 = storeNm1;
	}

	/**
	 * 店名2を設定します。
	 *
	 * @param storeNm2
	 *            店名2
	 */
	public void setStoreNm2(String storeNm2) {
		this.storeNm2 = storeNm2;
	}

	/**
	 * 店名3を設定します。
	 *
	 * @param storeNm3
	 *            店名3
	 */
	public void setStoreNm3(String storeNm3) {
		this.storeNm3 = storeNm3;
	}

	/**
	 * 店名4を設定します。
	 *
	 * @param storeNm4
	 *            店名4
	 */
	public void setStoreNm4(String storeNm4) {
		this.storeNm4 = storeNm4;
	}

	/**
	 * 店名5を設定します。
	 *
	 * @param storeNm5
	 *            店名5
	 */
	public void setStoreNm5(String storeNm5) {
		this.storeNm5 = storeNm5;
	}

	/**
	 * SUICA_飲食施設有りを設定します。
	 *
	 * @param suicaFooddrinkFlg
	 *            SUICA_飲食施設有り
	 */
	public void setSuicaFooddrinkFlg(String suicaFooddrinkFlg) {
		this.suicaFooddrinkFlg = suicaFooddrinkFlg;
	}

	/**
	 * SUICA_飲食施設名を設定します。
	 *
	 * @param suicaFooddrinkNm
	 *            SUICA_飲食施設名
	 */
	public void setSuicaFooddrinkNm(String suicaFooddrinkNm) {
		this.suicaFooddrinkNm = suicaFooddrinkNm;
	}

	/**
	 * SUICA_フロント有りを設定します。
	 *
	 * @param suicaFrontFlg
	 *            SUICA_フロント有り
	 */
	public void setSuicaFrontFlg(String suicaFrontFlg) {
		this.suicaFrontFlg = suicaFrontFlg;
	}

	/**
	 * SUICA_その他有りを設定します。
	 *
	 * @param suicaOtherFlg
	 *            SUICA_その他有り
	 */
	public void setSuicaOtherFlg(String suicaOtherFlg) {
		this.suicaOtherFlg = suicaOtherFlg;
	}

	/**
	 * SUICA_その他備考を設定します。
	 *
	 * @param suicaOtherNote
	 *            SUICA_その他備考
	 */
	public void setSuicaOtherNote(String suicaOtherNote) {
		this.suicaOtherNote = suicaOtherNote;
	}

	/**
	 * ズボンプレッサー区分を設定します。
	 *
	 * @param trouserPressDiv
	 *            ズボンプレッサー区分
	 */
	public void setTrouserPressDiv(String trouserPressDiv) {
		this.trouserPressDiv = trouserPressDiv;
	}

	/**
	 * ズボンプレッサー備考を設定します。
	 *
	 * @param trouserPressNote
	 *            ズボンプレッサー備考
	 */
	public void setTrouserPressNote(String trouserPressNote) {
		this.trouserPressNote = trouserPressNote;
	}

	/**
	 * 利用料金を設定します。
	 *
	 * @param useFee
	 *            利用料金
	 */
	public void setUseFee(String useFee) {
		this.useFee = useFee;
	}

	/**
	 * 利用可能期間を設定します。
	 *
	 * @param usePeriod
	 *            利用可能期間
	 */
	public void setUsePeriod(String usePeriod) {
		this.usePeriod = usePeriod;
	}

	/**
	 * 利用時間を設定します。
	 *
	 * @param useTime
	 *            利用時間
	 */
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	/**
	 * WIFI利用料金を設定します。
	 *
	 * @param wifiFee
	 *            WIFI利用料金
	 */
	public void setWifiFee(String wifiFee) {
		this.wifiFee = wifiFee;
	}

	/**
	 * WIFI料金有無を設定します。
	 *
	 * @param wifiFlg
	 *            WIFI料金有無
	 */
	public void setWifiFlg(String wifiFlg) {
		this.wifiFlg = wifiFlg;
	}

	/**
	 * WIFI利用時間を設定します。
	 *
	 * @param wifiTime
	 *            WIFI利用時間
	 */
	public void setWifiTime(String wifiTime) {
		this.wifiTime = wifiTime;
	}

}
