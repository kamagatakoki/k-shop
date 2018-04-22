package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_JR在庫データクラス。.
 * 機能概要    ：  NO1_JR在庫データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1JrStockData extends PlanAnsBaseData{
	/**
	 * 在庫区分.
	 */
	private Integer stockDiv;
	
	/**
	 * 部屋タイプ.
	 */
	private Integer roomType;
	
	/**
	 * 建物.
	 */
	private String building;
	
	/**
	 * 眺望コード.
	 */
	private Integer viewCd;
	/**
	 * 眺望 .
	 */
	private String view;
	/**
	 * 定員１.
	 */
	private String capacityFrom;
	
	/**
	 * 定員２.
	 */
	private String capacityTo;
	
	/**
	 * 室数.
	 */
	private String roomQuan;
	
	/**
	 * 建物種別.
	 */
	private Integer buildKind;
	
	/**
	 * 階層指定.
	 */
	private String floorAssign;
	
//	start 2010/1/20 d.endo 在庫タイプ入力部追加
	/**
	 * 在庫タイプ種別.
	 */
	private String stockType="-1";
	
	/**
	 * 在庫タイプその他.
	 */
	private String otherPlanNam;
//	end 2010/1/20 d.endo 在庫タイプ入力部追加
	
	/**
	 * @return 建物.
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building 建物
	 */
	public void setBuilding(final String building) {
		this.building = building;
	}

	/**
	 * @return 建物種別
	 */
	public Integer getBuildKind() {
		return buildKind;
	}

	/**
	 * @param buildKind 建物種別
	 */
	public void setBuildKind(final Integer buildKind) {
		if (buildKind != null && buildKind.intValue() == 0) {
			this.buildKind = null;
		} else {
			this.buildKind = buildKind;
		}
		
	}

	/**
	 * @return 定員１
	 */
	public String getCapacityFrom() {
		return capacityFrom;
	}

	/**
	 * @param capacityFrom 定員１
	 */
	public void setCapacityFrom(final String capacityFrom) {
		this.capacityFrom = StringUtil.toHalf(capacityFrom);
	}

	/**
	 * @return 定員２
	 */
	public String getCapacityTo() {
		return capacityTo;
	}

	/**
	 * @param capacityTo 定員２
	 */
	public void setCapacityTo(final String capacityTo) {
		this.capacityTo = StringUtil.toHalf(capacityTo);
	}

	/**
	 * @return 階層指定
	 */
	public String getFloorAssign() {
		return floorAssign;
	}

	/**
	 * @param floorAssign 階層指定
	 */
	public void setFloorAssign(final String floorAssign) {
		this.floorAssign = StringUtil.toHalf(floorAssign);
	}

	/**
	 * @return 室数
	 */
	public String getRoomQuan() {
		return roomQuan;
	}

	/**
	 * @param roomQuan 室数
	 */
	public void setRoomQuan(final String roomQuan) {
		this.roomQuan = StringUtil.toHalf(roomQuan);
	}

	/**
	 * @return 部屋タイプ
	 */
	public Integer getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType 部屋タイプ
	 */
	public void setRoomType(final Integer roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return 在庫区分
	 */
	public Integer getStockDiv() {
		return stockDiv;
	}

	/**
	 * @param stockDiv 在庫区分
	 */
	public void setStockDiv(final Integer stockDiv) {
		this.stockDiv = stockDiv;
	}

	/**
	 * @return 眺望コード
	 */
	public Integer getViewCd() {
		return viewCd;
	}

	/**
	 * @param viewCd 眺望コード
	 */
	public void setViewCd(final Integer viewCd) {
		if (viewCd != null && viewCd.intValue() == 0) {
			this.viewCd = null;
		} else {
			this.viewCd = viewCd;
		}
		
	}

	/**
	 * @return 眺望 
	 */
	public String getView() {
		return view;
	}

	/**
	 * @param view 眺望 
	 */
	public void setView(String view) {
		this.view = view;
	}
	
//start 2010/1/20 d.endo 在庫タイプ入力部追加
	/**
	 * @return 在庫タイプ種別
	 */
	public String getStockType() {
		return stockType;
	}

	/**
	 * @param view 在庫タイプ種別 
	 */
	public void setStockType(final String stockType) {
		this.stockType = stockType;
	}
	
	/**
	 * @return 在庫タイプその他 
	 */
	public String getOtherPlanNam() {
		return otherPlanNam;
	}

	/**
	 * @param view 在庫タイプその他 
	 */
	public void setOtherPlanNam(final String otherPlanNam) {
		this.otherPlanNam = otherPlanNam;
	}
//end 2010/1/20 d.endo 在庫タイプ入力部追加
}
