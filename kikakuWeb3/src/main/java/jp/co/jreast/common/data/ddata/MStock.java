package jp.co.jreast.common.data.ddata;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * 在庫管理マスタ エンティティ
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
public class MStock {

	/** 住所 */
	private String address;

	/** エリアコード */
	private String areaCd;

	/** 会社ID */
	private String comId;

	/** 作成年月日 */
	private String createYmd;

	/** 取扱手数料 */
	private String dealFee;

	/** 施設コード */
	private String facilityCd;

	/** 通知先地区名 */
	private String informAreaNm;

	/** 通知先FAX番号 */
	private String informFax;

	/** 通知先名 */
	private String informNm;

	/** 回答書種別 */
	private String kindFlg;

	/** 手仕舞日 */
	private String liquidateDay;

	/** 手仕舞通知方法 */
	private String liquidateInform;

	/** 手仕舞時刻（当日設定時）（時間） */
	private String liquidateTimeHour;

	/** 手仕舞時刻（当日設定時）（分） */
	private String liquidateTimeMinute;

	/** 備考 */
	private String memo;

	/** 新規フラグ */
	private String newFlg;

	/** 郵便番号 */
	private String postcode;

	/** 都道府県コード */
	private String prefecturesCd;

	/** 地域コード */
	private String regionCd;

	/** 予約通知方法 */
	private String reserveInformWay;

	/** 在庫名称（カナ） */
	private String stockKana;

	/** 在庫名称（漢字） */
	private String stockKanj;

	/** 在庫管理方法 */
	private String stockManagement;

	/** 在庫番号 */
	private String stockNo;

	/** 仕入箇所コード */
	private String stockPlaceCd;

	/** 在庫単位 */
	private String stockUnit;

	/** 電話番号 */
	private String telephonNo;

	/** 更新フラグ */
	private String updateFlg;

	/** 更新年月日 */
	private String upYmd;

	/**
	 * 住所を取得します。
	 *
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * エリアコードを取得します。
	 *
	 * @return エリアコード
	 */
	public String getAreaCd() {
		return areaCd;
	}

	/**
	 * 会社IDを取得します。
	 *
	 * @return 会社ID
	 */
	public String getComId() {
		return comId;
	}

	/**
	 * 作成年月日を取得します。
	 *
	 * @return 作成年月日
	 */
	public String getCreateYmd() {
		return createYmd;
	}

	/**
	 * 取扱手数料を取得します。
	 *
	 * @return 取扱手数料
	 */
	public String getDealFee() {
		return dealFee;
	}

	/**
	 * 施設コードを取得します。
	 *
	 * @return 施設コード
	 */
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * 通知先地区名を取得します。
	 *
	 * @return 通知先地区名
	 */
	public String getInformAreaNm() {
		return informAreaNm;
	}

	/**
	 * 通知先FAX番号を取得します。
	 *
	 * @return 通知先FAX番号
	 */
	public String getInformFax() {
		return StringUtils.trim(informFax);
	}

	/**
	 * 通知先名を取得します。
	 *
	 * @return 通知先名
	 */
	public String getInformNm() {
		return informNm;
	}

	/**
	 * 回答書種別を取得します。
	 *
	 * @return 回答書種別
	 */
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * 手仕舞日を取得します。
	 *
	 * @return 手仕舞日
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}

	/**
	 * 手仕舞通知方法を取得します。
	 *
	 * @return 手仕舞通知方法
	 */
	public String getLiquidateInform() {
		return liquidateInform;
	}

	/**
	 * 手仕舞時刻（当日設定時）を取得します。
	 *
	 * @return 手仕舞時刻（当日設定時）
	 */
	public String getLiquidateTime() {
		return KikakuWebUtil.buildTime(getLiquidateTimeHour(),
				getLiquidateTimeMinute());
	}

	/**
	 * 手仕舞時刻（当日設定時）（時間）を取得します。
	 *
	 * @return 手仕舞時刻（当日設定時）（時間）
	 */
	public String getLiquidateTimeHour() {
		return liquidateTimeHour;
	}

	/**
	 * 手仕舞時刻（当日設定時）（分）を取得します。
	 *
	 * @return 手仕舞時刻（当日設定時）（分）
	 */
	public String getLiquidateTimeMinute() {
		return liquidateTimeMinute;
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
	 * 新規フラグを取得します。
	 *
	 * @return 新規フラグ
	 */
	public String getNewFlg() {
		return newFlg;
	}

	/**
	 * 郵便番号を取得します。
	 *
	 * @return 郵便番号
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * 都道府県コードを取得します。
	 *
	 * @return 都道府県コード
	 */
	public String getPrefecturesCd() {
		return prefecturesCd;
	}

	/**
	 * 地域コードを取得します。
	 *
	 * @return 地域コード
	 */
	public String getRegionCd() {
		return regionCd;
	}

	/**
	 * 予約通知方法を取得します。
	 *
	 * @return 予約通知方法
	 */
	public String getReserveInformWay() {
		return reserveInformWay;
	}

	/**
	 * 在庫名称（カナ）を取得します。
	 *
	 * @return 在庫名称（カナ）
	 */
	public String getStockKana() {
		return stockKana;
	}

	/**
	 * 在庫名称（漢字）を取得します。
	 *
	 * @return 在庫名称（漢字）
	 */
	public String getStockKanj() {
		return stockKanj;
	}

	/**
	 * 在庫管理方法を取得します。
	 *
	 * @return 在庫管理方法
	 */
	public String getStockManagement() {
		return stockManagement;
	}

	/**
	 * 在庫番号を取得します。
	 *
	 * @return 在庫番号
	 */
	public String getStockNo() {
		return stockNo;
	}

	/**
	 * 仕入箇所コードを取得します。
	 *
	 * @return 仕入箇所コード
	 */
	public String getStockPlaceCd() {
		return stockPlaceCd;
	}

	/**
	 * 在庫単位を取得します。
	 *
	 * @return 在庫単位
	 */
	public String getStockUnit() {
		return stockUnit;
	}

	/**
	 * 電話番号を取得します。
	 *
	 * @return 電話番号
	 */
	public String getTelephonNo() {
		return StringUtils.trim(telephonNo);
	}

	/**
	 * 更新フラグを取得します。
	 *
	 * @return 更新フラグ
	 */
	public String getUpdateFlg() {
		return updateFlg;
	}

	/**
	 * 更新年月日を取得します。
	 *
	 * @return 更新年月日
	 */
	public String getUpYmd() {
		return upYmd;
	}

	/**
	 * 住所を設定します。
	 *
	 * @param address
	 *            住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * エリアコードを設定します。
	 *
	 * @param areaCd
	 *            エリアコード
	 */
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	/**
	 * 会社IDを設定します。
	 *
	 * @param comId
	 *            会社ID
	 */
	public void setComId(String comId) {
		this.comId = comId;
	}

	/**
	 * 作成年月日を設定します。
	 *
	 * @param createYmd
	 *            作成年月日
	 */
	public void setCreateYmd(String createYmd) {
		this.createYmd = createYmd;
	}

	/**
	 * 取扱手数料を設定します。
	 *
	 * @param dealFee
	 *            取扱手数料
	 */
	public void setDealFee(String dealFee) {
		this.dealFee = dealFee;
	}

	/**
	 * 施設コードを設定します。
	 *
	 * @param facilityCd
	 *            施設コード
	 */
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * 通知先地区名を設定します。
	 *
	 * @param informAreaNm
	 *            通知先地区名
	 */
	public void setInformAreaNm(String informAreaNm) {
		this.informAreaNm = informAreaNm;
	}

	/**
	 * 通知先FAX番号を設定します。
	 *
	 * @param informFax
	 *            通知先FAX番号
	 */
	public void setInformFax(String informFax) {
		this.informFax = informFax;
	}

	/**
	 * 通知先名を設定します。
	 *
	 * @param informNm
	 *            通知先名
	 */
	public void setInformNm(String informNm) {
		this.informNm = informNm;
	}

	/**
	 * 回答書種別を設定します。
	 *
	 * @param kindFlg
	 *            回答書種別
	 */
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}

	/**
	 * 手仕舞日を設定します。
	 *
	 * @param liquidateDay
	 *            手仕舞日
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = liquidateDay;
	}

	/**
	 * 手仕舞通知方法を設定します。
	 *
	 * @param liquidateInform
	 *            手仕舞通知方法
	 */
	public void setLiquidateInform(String liquidateInform) {
		this.liquidateInform = liquidateInform;
	}

	/**
	 * 手仕舞時刻（当日設定時）を設定します。
	 *
	 * @param liquidateTime
	 *            手仕舞時刻（当日設定時）
	 */
	public void setLiquidateTime(String liquidateTime) {
		setLiquidateTimeHour(KikakuWebUtil.getHourFormTime(liquidateTime));
		setLiquidateTimeMinute(KikakuWebUtil.getMinuteFromTime(liquidateTime));
	}

	/**
	 * 手仕舞時刻（当日設定時）（時間）を設定します。
	 *
	 * @param liquidateTimeHour
	 *            手仕舞時刻（当日設定時）（時間）
	 */
	public void setLiquidateTimeHour(String liquidateTimeHour) {
		this.liquidateTimeHour = liquidateTimeHour;
	}

	/**
	 * 手仕舞時刻（当日設定時）（分）を設定します。
	 *
	 * @param liquidateTimeMinute
	 *            手仕舞時刻（当日設定時）（分）
	 */
	public void setLiquidateTimeMinute(String liquidateTimeMinute) {
		this.liquidateTimeMinute = liquidateTimeMinute;
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
	 * 新規フラグを設定します。
	 *
	 * @param newFlg
	 *            新規フラグ
	 */
	public void setNewFlg(String newFlg) {
		this.newFlg = newFlg;
	}

	/**
	 * 郵便番号を設定します。
	 *
	 * @param postcode
	 *            郵便番号
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * 都道府県コードを設定します。
	 *
	 * @param prefecturesCd
	 *            都道府県コード
	 */
	public void setPrefecturesCd(String prefecturesCd) {
		this.prefecturesCd = prefecturesCd;
	}

	/**
	 * エリアコードを設定します。
	 *
	 * @param regionCd
	 *            エリアコード
	 */
	public void setRegionCd(String regionCd) {
		this.regionCd = regionCd;
	}

	/**
	 * 予約通知方法を設定します。
	 *
	 * @param reserveInformWay
	 *            予約通知方法
	 */
	public void setReserveInformWay(String reserveInformWay) {
		this.reserveInformWay = reserveInformWay;
	}

	/**
	 * 在庫名称（カナ）を設定します。
	 *
	 * @param stockKana
	 *            在庫名称（カナ）
	 */
	public void setStockKana(String stockKana) {
		this.stockKana = stockKana;
	}

	/**
	 * 在庫名称（漢字）を設定します。
	 *
	 * @param stockKanj
	 *            在庫名称（漢字）
	 */
	public void setStockKanj(String stockKanj) {
		this.stockKanj = stockKanj;
	}

	/**
	 * 在庫管理方法を設定します。
	 *
	 * @param stockManagement
	 *            在庫管理方法
	 */
	public void setStockManagement(String stockManagement) {
		this.stockManagement = stockManagement;
	}

	/**
	 * 在庫番号を設定します。
	 *
	 * @param stockNo
	 *            在庫番号
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}

	/**
	 * 仕入箇所コードを設定します。
	 *
	 * @param stockPlaceCd
	 *            仕入箇所コード
	 */
	public void setStockPlaceCd(String stockPlaceCd) {
		this.stockPlaceCd = stockPlaceCd;
	}

	/**
	 * 在庫単位を設定します。
	 *
	 * @param stockUnit
	 *            在庫単位
	 */
	public void setStockUnit(String stockUnit) {
		this.stockUnit = stockUnit;
	}

	/**
	 * 電話番号を設定します。
	 *
	 * @param telephonNo
	 *            電話番号
	 */
	public void setTelephonNo(String telephonNo) {
		this.telephonNo = telephonNo;
	}

	/**
	 * 更新フラグを設定します。
	 *
	 * @param updateFlg
	 *            更新フラグ
	 */
	public void setUpdateFlg(String updateFlg) {
		this.updateFlg = updateFlg;
	}

	/**
	 * 更新年月日を設定します。
	 *
	 * @param upYmd
	 *            更新年月日
	 */
	public void setUpYmd(String upYmd) {
		this.upYmd = upYmd;
	}

}
