package jp.co.jreast.common.data.ddata;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * [DP/RM]施設_設備_スキー エンティティ
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
public class DFacilityEquipmentSki implements FacilityManageBodyKey {

	/** 大浴場・共用_備考 */
	private String bigbathMemo;

	/** 共用_交代制_終了時間（時間） */
	private String commonbathChangeEndHour;

	/** 共用_交代制_終了時間（分） */
	private String commonbathChangeEndMinute;

	/** 共用_交代制_箇所数 */
	private String commonbathChangeNum;

	/** 共用_交代制_開始時間（時間） */
	private String commonbathChangeStartHour;

	/** 共用_交代制_開始時間（分） */
	private String commonbathChangeStartMinute;

	/** 共用_有無 */
	private String commonbathFlg;

	/** 共用_女_箇所数 */
	private String commonbathLadyNum;

	/** 共用_男_箇所数 */
	private String commonbathManNum;

	/** 共用_男女_箇所数 */
	private String commonbathMlNum;

	/** 託児所_年齢From */
	private String daycareAgeFrom;

	/** 託児所_年齢To */
	private String daycareAgeTo;

	/** 託児所_料金 */
	private String daycareCharge;

	/** 託児所_料金_有無 */
	private String daycareChargeFlg;

	/** 託児所_有無 */
	private String daycareFlg;

	/** 託児所_時間 */
	private String daycareTime;

	/** 託児所_営業時間１_終了（時間） */
	private String daycareTimeEnd1Hour;

	/** 託児所_営業時間１_終了（分） */
	private String daycareTimeEnd1Minute;

	/** 託児所_営業時間２_終了（時間） */
	private String daycareTimeEnd2Hour;

	/** 託児所_営業時間２_終了（分） */
	private String daycareTimeEnd2Minute;

	/** 託児所_営業時間_備考 */
	private String daycareTimeMemo;

	/** 託児所_営業時間１_開始（時間） */
	private String daycareTimeStart1Hour;

	/** 託児所_営業時間１_開始（分） */
	private String daycareTimeStart1Minute;

	/** 託児所_営業時間２_開始（時間） */
	private String daycareTimeStart2Hour;

	/** 託児所_営業時間２_開始（分） */
	private String daycareTimeStart2Minute;

	/** 更衣室_区分 */
	private String dressingRoomDiv;

	/** 更衣室_その他内容 */
	private String dressingRoomOthers;

	/** 施設コード */
	private String facilityCd;

	/** 施設パターン */
	private String facilityPattern;

	/** 回答書種別 */
	private String kindFlg;

	/** 更衣室_有無 */
	private String lockerroomFlg;

	/**
	 * 大浴場・共用_備考を取得します。
	 *
	 * @return 大浴場・共用_備考
	 */
	public String getBigbathMemo() {
		return bigbathMemo;
	}

	/**
	 * 共用_交代制_終了時間を取得します。
	 *
	 * @return 共用_交代制_終了時間
	 */
	public String getCommonbathChangeEnd() {
		return KikakuWebUtil.buildTime(getCommonbathChangeEndHour(),
				getCommonbathChangeEndMinute());
	}

	/**
	 * 共用_交代制_終了時間（時間）を取得します。
	 *
	 * @return 共用_交代制_終了時間（時間）
	 */
	public String getCommonbathChangeEndHour() {
		return commonbathChangeEndHour;
	}

	/**
	 * 共用_交代制_終了時間（分）を取得します。
	 *
	 * @return 共用_交代制_終了時間（分）
	 */
	public String getCommonbathChangeEndMinute() {
		return commonbathChangeEndMinute;
	}

	/**
	 * 共用_交代制_箇所数を取得します。
	 *
	 * @return 共用_交代制_箇所数
	 */
	public String getCommonbathChangeNum() {
		return commonbathChangeNum;
	}

	/**
	 * 共用_交代制_開始時間を取得します。
	 *
	 * @return 共用_交代制_開始時間
	 */
	public String getCommonbathChangeStart() {
		return KikakuWebUtil.buildTime(getCommonbathChangeStartHour(),
				getCommonbathChangeStartMinute());
	}

	/**
	 * 共用_交代制_開始時間（時間）を取得します。
	 *
	 * @return 共用_交代制_開始時間（時間）
	 */
	public String getCommonbathChangeStartHour() {
		return commonbathChangeStartHour;
	}

	/**
	 * 共用_交代制_開始時間（分）を取得します。
	 *
	 * @return 共用_交代制_開始時間（分）
	 */
	public String getCommonbathChangeStartMinute() {
		return commonbathChangeStartMinute;
	}

	/**
	 * 共用_有無を取得します。
	 *
	 * @return 共用_有無
	 */
	public String getCommonbathFlg() {
		return commonbathFlg;
	}

	/**
	 * 共用_女_箇所数を取得します。
	 *
	 * @return 共用_女_箇所数
	 */
	public String getCommonbathLadyNum() {
		return commonbathLadyNum;
	}

	/**
	 * 共用_男_箇所数を取得します。
	 *
	 * @return 共用_男_箇所数
	 */
	public String getCommonbathManNum() {
		return commonbathManNum;
	}

	/**
	 * 共用_男女_箇所数を取得します。
	 *
	 * @return 共用_男女_箇所数
	 */
	public String getCommonbathMlNum() {
		return commonbathMlNum;
	}

	/**
	 * 託児所_年齢Fromを取得します。
	 *
	 * @return 託児所_年齢From
	 */
	public String getDaycareAgeFrom() {
		return daycareAgeFrom;
	}

	/**
	 * 託児所_年齢Toを取得します。
	 *
	 * @return 託児所_年齢To
	 */
	public String getDaycareAgeTo() {
		return daycareAgeTo;
	}

	/**
	 * 託児所_料金を取得します。
	 *
	 * @return 託児所_料金
	 */
	public String getDaycareCharge() {
		return daycareCharge;
	}

	/**
	 * 託児所_料金_有無を取得します。
	 *
	 * @return 託児所_料金_有無
	 */
	public String getDaycareChargeFlg() {
		return daycareChargeFlg;
	}

	/**
	 * 託児所_有無を取得します。
	 *
	 * @return 託児所_有無
	 */
	public String getDaycareFlg() {
		return daycareFlg;
	}

	/**
	 * 託児所_時間を取得します。
	 *
	 * @return 託児所_時間
	 */
	public String getDaycareTime() {
		return daycareTime;
	}

	/**
	 * 託児所_営業時間１_終了を取得します。
	 *
	 * @return 託児所_営業時間１_終了
	 */
	public String getDaycareTimeEnd1() {
		return KikakuWebUtil.buildTime(getDaycareTimeEnd1Hour(),
				getDaycareTimeEnd1Minute());
	}

	/**
	 * 託児所_営業時間１_終了（時間）を取得します。
	 *
	 * @return 託児所_営業時間１_終了（時間）
	 */
	public String getDaycareTimeEnd1Hour() {
		return daycareTimeEnd1Hour;
	}

	/**
	 * 託児所_営業時間１_終了（分）を取得します。
	 *
	 * @return 託児所_営業時間１_終了（分）
	 */
	public String getDaycareTimeEnd1Minute() {
		return daycareTimeEnd1Minute;
	}

	/**
	 * 託児所_営業時間２_終了を取得します。
	 *
	 * @return 託児所_営業時間２_終了
	 */
	public String getDaycareTimeEnd2() {
		return KikakuWebUtil.buildTime(getDaycareTimeEnd2Hour(),
				getDaycareTimeEnd2Minute());
	}

	/**
	 * 託児所_営業時間２_終了（時間）を取得します。
	 *
	 * @return 託児所_営業時間２_終了（時間）
	 */
	public String getDaycareTimeEnd2Hour() {
		return daycareTimeEnd2Hour;
	}

	/**
	 * 託児所_営業時間２_終了（分）を取得します。
	 *
	 * @return 託児所_営業時間２_終了（分）
	 */
	public String getDaycareTimeEnd2Minute() {
		return daycareTimeEnd2Minute;
	}

	/**
	 * 託児所_営業時間_備考を取得します。
	 *
	 * @return 託児所_営業時間_備考
	 */
	public String getDaycareTimeMemo() {
		return daycareTimeMemo;
	}

	/**
	 * 託児所_営業時間１_開始を取得します。
	 *
	 * @return 託児所_営業時間１_開始
	 */
	public String getDaycareTimeStart1() {
		return KikakuWebUtil.buildTime(getDaycareTimeStart1Hour(),
				getDaycareTimeStart1Minute());
	}

	/**
	 * 託児所_営業時間１_開始（時間）を取得します。
	 *
	 * @return 託児所_営業時間１_開始（時間）
	 */
	public String getDaycareTimeStart1Hour() {
		return daycareTimeStart1Hour;
	}

	/**
	 * 託児所_営業時間１_開始（分）を取得します。
	 *
	 * @return 託児所_営業時間１_開始（分）
	 */
	public String getDaycareTimeStart1Minute() {
		return daycareTimeStart1Minute;
	}

	/**
	 * 託児所_営業時間２_開始を取得します。
	 *
	 * @return 託児所_営業時間２_開始
	 */
	public String getDaycareTimeStart2() {
		return KikakuWebUtil.buildTime(getDaycareTimeStart2Hour(),
				getDaycareTimeStart2Minute());
	}

	/**
	 * 託児所_営業時間２_開始（時間）を取得します。
	 *
	 * @return 託児所_営業時間２_開始（時間）
	 */
	public String getDaycareTimeStart2Hour() {
		return daycareTimeStart2Hour;
	}

	/**
	 * 託児所_営業時間２_開始（分）を取得します。
	 *
	 * @return 託児所_営業時間２_開始（分）
	 */
	public String getDaycareTimeStart2Minute() {
		return daycareTimeStart2Minute;
	}

	/**
	 * 更衣室_区分を取得します。
	 *
	 * @return 更衣室_区分
	 */
	public String getDressingRoomDiv() {
		return dressingRoomDiv;
	}

	/**
	 * 更衣室_その他内容を取得します。
	 *
	 * @return 更衣室_その他内容
	 */
	public String getDressingRoomOthers() {
		return dressingRoomOthers;
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
	 * 回答書種別を取得します。
	 *
	 * @return 回答書種別
	 */
	@Override
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * 更衣室_有無を取得します。
	 *
	 * @return 更衣室_有無
	 */
	public String getLockerroomFlg() {
		return lockerroomFlg;
	}

	/**
	 * 大浴場・共用_備考を設定します。
	 *
	 * @param bigbathMemo
	 *            大浴場・共用_備考
	 */
	public void setBigbathMemo(String bigbathMemo) {
		this.bigbathMemo = bigbathMemo;
	}

	/**
	 * 共用_交代制_終了時間を設定します。
	 *
	 * @param commonbathChangeEnd
	 *            共用_交代制_終了時間
	 */
	public void setCommonbathChangeEnd(String commonbathChangeEnd) {
		setCommonbathChangeEndHour(KikakuWebUtil
				.getHourFormTime(commonbathChangeEnd));
		setCommonbathChangeEndMinute(KikakuWebUtil
				.getMinuteFromTime(commonbathChangeEnd));
	}

	/**
	 * 共用_交代制_終了時間（時間）を設定します。
	 *
	 * @param commonbathChangeEndHour
	 *            共用_交代制_終了時間（時間）
	 */
	public void setCommonbathChangeEndHour(String commonbathChangeEndHour) {
		this.commonbathChangeEndHour = commonbathChangeEndHour;
	}

	/**
	 * 共用_交代制_終了時間（分）を設定します。
	 *
	 * @param commonbathChangeEndMinute
	 *            共用_交代制_終了時間（分）
	 */
	public void setCommonbathChangeEndMinute(String commonbathChangeEndMinute) {
		this.commonbathChangeEndMinute = commonbathChangeEndMinute;
	}

	/**
	 * 共用_交代制_箇所数を設定します。
	 *
	 * @param commonbathChangeNum
	 *            共用_交代制_箇所数
	 */
	public void setCommonbathChangeNum(String commonbathChangeNum) {
		this.commonbathChangeNum = commonbathChangeNum;
	}

	/**
	 * 共用_交代制_開始時間を設定します。
	 *
	 * @param commonbathChangeStart
	 *            共用_交代制_開始時間
	 */
	public void setCommonbathChangeStart(String commonbathChangeStart) {
		setCommonbathChangeStartHour(KikakuWebUtil
				.getHourFormTime(commonbathChangeStart));
		setCommonbathChangeStartMinute(KikakuWebUtil
				.getMinuteFromTime(commonbathChangeStart));
	}

	/**
	 * 共用_交代制_開始時間（時間）を設定します。
	 *
	 * @param commonbathChangeStartHour
	 *            共用_交代制_開始時間（時間）
	 */
	public void setCommonbathChangeStartHour(String commonbathChangeStartHour) {
		this.commonbathChangeStartHour = commonbathChangeStartHour;
	}

	/**
	 * 共用_交代制_開始時間（分）を設定します。
	 *
	 * @param commonbathChangeStartMinute
	 *            共用_交代制_開始時間（分）
	 */
	public void setCommonbathChangeStartMinute(
			String commonbathChangeStartMinute) {
		this.commonbathChangeStartMinute = commonbathChangeStartMinute;
	}

	/**
	 * 共用_有無を設定します。
	 *
	 * @param commonbathFlg
	 *            共用_有無
	 */
	public void setCommonbathFlg(String commonbathFlg) {
		this.commonbathFlg = commonbathFlg;
	}

	/**
	 * 共用_女_箇所数を設定します。
	 *
	 * @param commonbathLadyNum
	 *            共用_女_箇所数
	 */
	public void setCommonbathLadyNum(String commonbathLadyNum) {
		this.commonbathLadyNum = commonbathLadyNum;
	}

	/**
	 * 共用_男_箇所数を設定します。
	 *
	 * @param commonbathManNum
	 *            共用_男_箇所数
	 */
	public void setCommonbathManNum(String commonbathManNum) {
		this.commonbathManNum = commonbathManNum;
	}

	/**
	 * 共用_男女_箇所数を設定します。
	 *
	 * @param commonbathMlNum
	 *            共用_男女_箇所数
	 */
	public void setCommonbathMlNum(String commonbathMlNum) {
		this.commonbathMlNum = commonbathMlNum;
	}

	/**
	 * 託児所_年齢Fromを設定します。
	 *
	 * @param daycareAgeFrom
	 *            託児所_年齢From
	 */
	public void setDaycareAgeFrom(String daycareAgeFrom) {
		this.daycareAgeFrom = StringUtils.trimToEmpty(daycareAgeFrom);
	}

	/**
	 * 託児所_年齢Toを設定します。
	 *
	 * @param daycareAgeTo
	 *            託児所_年齢To
	 */
	public void setDaycareAgeTo(String daycareAgeTo) {
		this.daycareAgeTo = StringUtils.trimToEmpty(daycareAgeTo);
	}

	/**
	 * 託児所_料金を設定します。
	 *
	 * @param daycareCharge
	 *            託児所_料金
	 */
	public void setDaycareCharge(String daycareCharge) {
		this.daycareCharge = daycareCharge;
	}

	/**
	 * 託児所_料金_有無を設定します。
	 *
	 * @param daycareChargeFlg
	 *            託児所_料金_有無
	 */
	public void setDaycareChargeFlg(String daycareChargeFlg) {
		this.daycareChargeFlg = daycareChargeFlg;
	}

	/**
	 * 託児所_有無を設定します。
	 *
	 * @param daycareFlg
	 *            託児所_有無
	 */
	public void setDaycareFlg(String daycareFlg) {
		this.daycareFlg = daycareFlg;
	}

	/**
	 * 託児所_時間を設定します。
	 *
	 * @param daycareTime
	 *            託児所_時間
	 */
	public void setDaycareTime(String daycareTime) {
		this.daycareTime = daycareTime;
	}

	/**
	 * 託児所_営業時間１_終了を設定します。
	 *
	 * @param daycareTimeEnd1
	 *            託児所_営業時間１_終了
	 */
	public void setDaycareTimeEnd1(String daycareTimeEnd1) {
		setDaycareTimeEnd1Hour(KikakuWebUtil.getHourFormTime(daycareTimeEnd1));
		setDaycareTimeEnd1Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeEnd1));
	}

	/**
	 * 託児所_営業時間１_終了（時間）を設定します。
	 *
	 * @param daycareTimeEnd1Hour
	 *            託児所_営業時間１_終了（時間）
	 */
	public void setDaycareTimeEnd1Hour(String daycareTimeEnd1Hour) {
		this.daycareTimeEnd1Hour = daycareTimeEnd1Hour;
	}

	/**
	 * 託児所_営業時間１_終了（分）を設定します。
	 *
	 * @param daycareTimeEnd1Minute
	 *            託児所_営業時間１_終了（分）
	 */
	public void setDaycareTimeEnd1Minute(String daycareTimeEnd1Minute) {
		this.daycareTimeEnd1Minute = daycareTimeEnd1Minute;
	}

	/**
	 * 託児所_営業時間２_終了を設定します。
	 *
	 * @param daycareTimeEnd2
	 *            託児所_営業時間２_終了
	 */
	public void setDaycareTimeEnd2(String daycareTimeEnd2) {
		setDaycareTimeEnd2Hour(KikakuWebUtil.getHourFormTime(daycareTimeEnd2));
		setDaycareTimeEnd2Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeEnd2));
	}

	/**
	 * 託児所_営業時間２_終了（時間）を設定します。
	 *
	 * @param daycareTimeEnd2Hour
	 *            託児所_営業時間２_終了（時間）
	 */
	public void setDaycareTimeEnd2Hour(String daycareTimeEnd2Hour) {
		this.daycareTimeEnd2Hour = daycareTimeEnd2Hour;
	}

	/**
	 * 託児所_営業時間２_終了（分）を設定します。
	 *
	 * @param daycareTimeEnd2Minute
	 *            託児所_営業時間２_終了（分）
	 */
	public void setDaycareTimeEnd2Minute(String daycareTimeEnd2Minute) {
		this.daycareTimeEnd2Minute = daycareTimeEnd2Minute;
	}

	/**
	 * 託児所_営業時間_備考を設定します。
	 *
	 * @param daycareTimeMemo
	 *            託児所_営業時間_備考
	 */
	public void setDaycareTimeMemo(String daycareTimeMemo) {
		this.daycareTimeMemo = daycareTimeMemo;
	}

	/**
	 * 託児所_営業時間１_開始を設定します。
	 *
	 * @param daycareTimeStart1
	 *            託児所_営業時間１_開始
	 */
	public void setDaycareTimeStart1(String daycareTimeStart1) {
		setDaycareTimeStart1Hour(KikakuWebUtil
				.getHourFormTime(daycareTimeStart1));
		setDaycareTimeStart1Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeStart1));
	}

	/**
	 * 託児所_営業時間１_開始（時間）を設定します。
	 *
	 * @param daycareTimeStart1Hour
	 *            託児所_営業時間１_開始（時間）
	 */
	public void setDaycareTimeStart1Hour(String daycareTimeStart1Hour) {
		this.daycareTimeStart1Hour = daycareTimeStart1Hour;
	}

	/**
	 * 託児所_営業時間１_開始（分）を設定します。
	 *
	 * @param daycareTimeStart1Minute
	 *            託児所_営業時間１_開始（分）
	 */
	public void setDaycareTimeStart1Minute(String daycareTimeStart1Minute) {
		this.daycareTimeStart1Minute = daycareTimeStart1Minute;
	}

	/**
	 * 託児所_営業時間２_開始を設定します。
	 *
	 * @param daycareTimeStart2
	 *            託児所_営業時間２_開始
	 */
	public void setDaycareTimeStart2(String daycareTimeStart2) {
		setDaycareTimeStart2Hour(KikakuWebUtil
				.getHourFormTime(daycareTimeStart2));
		setDaycareTimeStart2Minute(KikakuWebUtil
				.getMinuteFromTime(daycareTimeStart2));
	}

	/**
	 * 託児所_営業時間２_開始（時間）を設定します。
	 *
	 * @param daycareTimeStart2Hour
	 *            託児所_営業時間２_開始（時間）
	 */
	public void setDaycareTimeStart2Hour(String daycareTimeStart2Hour) {
		this.daycareTimeStart2Hour = daycareTimeStart2Hour;
	}

	/**
	 * 託児所_営業時間２_開始（分）を設定します。
	 *
	 * @param daycareTimeStart2Minute
	 *            託児所_営業時間２_開始（分）
	 */
	public void setDaycareTimeStart2Minute(String daycareTimeStart2Minute) {
		this.daycareTimeStart2Minute = daycareTimeStart2Minute;
	}

	/**
	 * 更衣室_区分を設定します。
	 *
	 * @param dressingRoomDiv
	 *            更衣室_区分
	 */
	public void setDressingRoomDiv(String dressingRoomDiv) {
		this.dressingRoomDiv = dressingRoomDiv;
	}

	/**
	 * 更衣室_その他内容を設定します。
	 *
	 * @param dressingRoomOthers
	 *            更衣室_その他内容
	 */
	public void setDressingRoomOthers(String dressingRoomOthers) {
		this.dressingRoomOthers = dressingRoomOthers;
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
	 * 更衣室_有無を設定します。
	 *
	 * @param lockerroomFlg
	 *            更衣室_有無
	 */
	public void setLockerroomFlg(String lockerroomFlg) {
		this.lockerroomFlg = lockerroomFlg;
	}

}
