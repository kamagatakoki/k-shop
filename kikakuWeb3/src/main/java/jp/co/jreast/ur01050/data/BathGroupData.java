package jp.co.jreast.ur01050.data;


/**
 * <pre>
 * 風呂情報グループデータ。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class BathGroupData {

	/**
	 * コンストラクター
	 *　データ初期化する .
	 */
	public BathGroupData() {
		super();
		maleFemaleData = new BathData();
		maleSpecialtyData = new BathData();
		feamleSpecialtyData = new BathData();
		timeShift = new BathData();
		mixBath = new BathData();
	}
	
	/**
	 * 男女別 .
	 */
	private BathData maleFemaleData;
	
	/**
	 * 男性専用のみ .
	 */
	private BathData maleSpecialtyData;
	
	/**
	 * 女性専用のみ .
	 */
	private BathData feamleSpecialtyData;
	
	/**
	 * 時間交替 .
	 */
	private BathData timeShift;
	
	/**
	 * 混浴 .
	 */
	private BathData mixBath;

	/**
	 * @return feamleSpecialtyData 女性専用のみ
	 */
	public BathData getFeamleSpecialtyData() {
		return feamleSpecialtyData;
	}

	/**
	 * @param feamleSpecialtyData 女性専用のみ
	 */
	public void setFeamleSpecialtyData(BathData feamleSpecialtyData) {
		this.feamleSpecialtyData = feamleSpecialtyData;
	}

	/**
	 * @return maleFemaleData　男女別
	 */
	public BathData getMaleFemaleData() {
		return maleFemaleData;
	}

	/**
	 * @param maleFemaleData 男女別
	 */
	public void setMaleFemaleData(BathData maleFemaleData) {
		this.maleFemaleData = maleFemaleData;
	}

	/**
	 * @return maleSpecialtyData　男性専用のみ
	 */
	public BathData getMaleSpecialtyData() {
		return maleSpecialtyData;
	}

	/**
	 * @param maleSpecialtyData 男性専用のみ
	 */
	public void setMaleSpecialtyData(BathData maleSpecialtyData) {
		this.maleSpecialtyData = maleSpecialtyData;
	}

	/**
	 * @return mixBath 混浴
	 */
	public BathData getMixBath() {
		return mixBath;
	}

	/**
	 * @param mixBath 混浴
	 */
	public void setMixBath(BathData mixBath) {
		this.mixBath = mixBath;
	}

	/**
	 * @return timeShift 時間交替
	 */
	public BathData getTimeShift() {
		return timeShift;
	}

	/**
	 * @param timeShift 時間交替
	 */
	public void setTimeShift(BathData timeShift) {
		this.timeShift = timeShift;
	}
}
