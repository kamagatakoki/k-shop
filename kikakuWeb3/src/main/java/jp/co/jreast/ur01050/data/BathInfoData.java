package jp.co.jreast.ur01050.data;


/**
 * <pre>
 * お風呂情報グルプデータクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class BathInfoData {
	
	/**
	 * コンストラクター
	 *　データ初期化する .
	 */
	public BathInfoData() {
		super();
		spaData = new BathData();
		outsideData = new BathGroupData();
		bathHouseData = new BathGroupData();
		saunaData = new BathGroupData();
		rentalSpaData = new BathData();
		rentalOutsideSpaData = new BathData();
	}

	/**
	 * 温泉データ .
	 */
	private BathData spaData;

	/**
	 * 露天風呂 .
	 */
	private BathGroupData outsideData;

	/**
	 * 大浴場 .
	 */
	private BathGroupData bathHouseData;

	/**
	 * サウナ .
	 */
	private BathGroupData saunaData;

	/**
	 * 貸切風呂 .
	 */
	private BathData rentalSpaData;

	/**
	 * 貸切露天風呂 .
	 */
	private BathData rentalOutsideSpaData;

	/**
	 * 
	 * @return 大浴場
	 */
	public BathGroupData getBathHouseData() {
		return bathHouseData;
	}

	/**
	 * 
	 * @param bathHouseData 大浴場
	 */
	public void setBathHouseData(BathGroupData bathHouseData) {
		this.bathHouseData = bathHouseData;
	}


	/**
	 * 
	 * @return 露天風呂
	 */
	public BathGroupData getOutsideData() {
		return outsideData;
	}

	/**
	 * 
	 * @param outsideData 露天風呂
	 */
	public void setOutsideData(BathGroupData outsideData) {
		this.outsideData = outsideData;
	}

	/**
	 * 
	 * @return サウナ
	 */
	public BathGroupData getSaunaData() {
		return saunaData;
	}

	/**
	 * 
	 * @param saunaData サウナ
	 */
	public void setSaunaData(BathGroupData saunaData) {
		this.saunaData = saunaData;
	}

	/**
	 * 
	 * @return 温泉データ
	 */
	public BathData getSpaData() {
		return spaData;
	}

	/**
	 * 
	 * @param spaData 温泉データ
	 */
	public void setSpaData(BathData spaData) {
		this.spaData = spaData;
	}

	/**
	 * @return rentalOutsideSpaData 貸切露天風呂
	 */
	public BathData getRentalOutsideSpaData() {
		return rentalOutsideSpaData;
	}

	/**
	 * @param rentalOutsideSpaData 貸切露天風呂
	 */
	public void setRentalOutsideSpaData(BathData rentalOutsideSpaData) {
		this.rentalOutsideSpaData = rentalOutsideSpaData;
	}

	/**
	 * @return rentalSpaData 貸切風呂
	 */
	public BathData getRentalSpaData() {
		return rentalSpaData;
	}

	/**
	 * @param rentalSpaData 貸切風呂
	 */
	public void setRentalSpaData(BathData rentalSpaData) {
		this.rentalSpaData = rentalSpaData;
	}

}
