package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_JRÝÉf[^NXB.
 * @\Tv    F  NO1_JRÝÉf[^ði[·éB
 * ÁL    F  ³µ
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1JrStockData extends PlanAnsBaseData{
	/**
	 * ÝÉæª.
	 */
	private Integer stockDiv;
	
	/**
	 * ®^Cv.
	 */
	private Integer roomType;
	
	/**
	 * š.
	 */
	private String building;
	
	/**
	 * ­]R[h.
	 */
	private Integer viewCd;
	/**
	 * ­] .
	 */
	private String view;
	/**
	 * èõP.
	 */
	private String capacityFrom;
	
	/**
	 * èõQ.
	 */
	private String capacityTo;
	
	/**
	 * º.
	 */
	private String roomQuan;
	
	/**
	 * šíÊ.
	 */
	private Integer buildKind;
	
	/**
	 * Kwwè.
	 */
	private String floorAssign;
	
//	start 2010/1/20 d.endo ÝÉ^CvüÍÇÁ
	/**
	 * ÝÉ^CvíÊ.
	 */
	private String stockType="-1";
	
	/**
	 * ÝÉ^Cv»ÌŒ.
	 */
	private String otherPlanNam;
//	end 2010/1/20 d.endo ÝÉ^CvüÍÇÁ
	
	/**
	 * @return š.
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building š
	 */
	public void setBuilding(final String building) {
		this.building = building;
	}

	/**
	 * @return šíÊ
	 */
	public Integer getBuildKind() {
		return buildKind;
	}

	/**
	 * @param buildKind šíÊ
	 */
	public void setBuildKind(final Integer buildKind) {
		if (buildKind != null && buildKind.intValue() == 0) {
			this.buildKind = null;
		} else {
			this.buildKind = buildKind;
		}
		
	}

	/**
	 * @return èõP
	 */
	public String getCapacityFrom() {
		return capacityFrom;
	}

	/**
	 * @param capacityFrom èõP
	 */
	public void setCapacityFrom(final String capacityFrom) {
		this.capacityFrom = StringUtil.toHalf(capacityFrom);
	}

	/**
	 * @return èõQ
	 */
	public String getCapacityTo() {
		return capacityTo;
	}

	/**
	 * @param capacityTo èõQ
	 */
	public void setCapacityTo(final String capacityTo) {
		this.capacityTo = StringUtil.toHalf(capacityTo);
	}

	/**
	 * @return Kwwè
	 */
	public String getFloorAssign() {
		return floorAssign;
	}

	/**
	 * @param floorAssign Kwwè
	 */
	public void setFloorAssign(final String floorAssign) {
		this.floorAssign = StringUtil.toHalf(floorAssign);
	}

	/**
	 * @return º
	 */
	public String getRoomQuan() {
		return roomQuan;
	}

	/**
	 * @param roomQuan º
	 */
	public void setRoomQuan(final String roomQuan) {
		this.roomQuan = StringUtil.toHalf(roomQuan);
	}

	/**
	 * @return ®^Cv
	 */
	public Integer getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType ®^Cv
	 */
	public void setRoomType(final Integer roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return ÝÉæª
	 */
	public Integer getStockDiv() {
		return stockDiv;
	}

	/**
	 * @param stockDiv ÝÉæª
	 */
	public void setStockDiv(final Integer stockDiv) {
		this.stockDiv = stockDiv;
	}

	/**
	 * @return ­]R[h
	 */
	public Integer getViewCd() {
		return viewCd;
	}

	/**
	 * @param viewCd ­]R[h
	 */
	public void setViewCd(final Integer viewCd) {
		if (viewCd != null && viewCd.intValue() == 0) {
			this.viewCd = null;
		} else {
			this.viewCd = viewCd;
		}
		
	}

	/**
	 * @return ­] 
	 */
	public String getView() {
		return view;
	}

	/**
	 * @param view ­] 
	 */
	public void setView(String view) {
		this.view = view;
	}
	
//start 2010/1/20 d.endo ÝÉ^CvüÍÇÁ
	/**
	 * @return ÝÉ^CvíÊ
	 */
	public String getStockType() {
		return stockType;
	}

	/**
	 * @param view ÝÉ^CvíÊ 
	 */
	public void setStockType(final String stockType) {
		this.stockType = stockType;
	}
	
	/**
	 * @return ÝÉ^Cv»ÌŒ 
	 */
	public String getOtherPlanNam() {
		return otherPlanNam;
	}

	/**
	 * @param view ÝÉ^Cv»ÌŒ 
	 */
	public void setOtherPlanNam(final String otherPlanNam) {
		this.otherPlanNam = otherPlanNam;
	}
//end 2010/1/20 d.endo ÝÉ^CvüÍÇÁ
}
