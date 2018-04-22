package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_JR�݌Ƀf�[�^�N���X�B.
 * �@�\�T�v    �F  NO1_JR�݌Ƀf�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1JrStockData extends PlanAnsBaseData{
	/**
	 * �݌ɋ敪.
	 */
	private Integer stockDiv;
	
	/**
	 * �����^�C�v.
	 */
	private Integer roomType;
	
	/**
	 * ����.
	 */
	private String building;
	
	/**
	 * ���]�R�[�h.
	 */
	private Integer viewCd;
	/**
	 * ���] .
	 */
	private String view;
	/**
	 * ����P.
	 */
	private String capacityFrom;
	
	/**
	 * ����Q.
	 */
	private String capacityTo;
	
	/**
	 * ����.
	 */
	private String roomQuan;
	
	/**
	 * �������.
	 */
	private Integer buildKind;
	
	/**
	 * �K�w�w��.
	 */
	private String floorAssign;
	
//	start 2010/1/20 d.endo �݌Ƀ^�C�v���͕��ǉ�
	/**
	 * �݌Ƀ^�C�v���.
	 */
	private String stockType="-1";
	
	/**
	 * �݌Ƀ^�C�v���̑�.
	 */
	private String otherPlanNam;
//	end 2010/1/20 d.endo �݌Ƀ^�C�v���͕��ǉ�
	
	/**
	 * @return ����.
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building ����
	 */
	public void setBuilding(final String building) {
		this.building = building;
	}

	/**
	 * @return �������
	 */
	public Integer getBuildKind() {
		return buildKind;
	}

	/**
	 * @param buildKind �������
	 */
	public void setBuildKind(final Integer buildKind) {
		if (buildKind != null && buildKind.intValue() == 0) {
			this.buildKind = null;
		} else {
			this.buildKind = buildKind;
		}
		
	}

	/**
	 * @return ����P
	 */
	public String getCapacityFrom() {
		return capacityFrom;
	}

	/**
	 * @param capacityFrom ����P
	 */
	public void setCapacityFrom(final String capacityFrom) {
		this.capacityFrom = StringUtil.toHalf(capacityFrom);
	}

	/**
	 * @return ����Q
	 */
	public String getCapacityTo() {
		return capacityTo;
	}

	/**
	 * @param capacityTo ����Q
	 */
	public void setCapacityTo(final String capacityTo) {
		this.capacityTo = StringUtil.toHalf(capacityTo);
	}

	/**
	 * @return �K�w�w��
	 */
	public String getFloorAssign() {
		return floorAssign;
	}

	/**
	 * @param floorAssign �K�w�w��
	 */
	public void setFloorAssign(final String floorAssign) {
		this.floorAssign = StringUtil.toHalf(floorAssign);
	}

	/**
	 * @return ����
	 */
	public String getRoomQuan() {
		return roomQuan;
	}

	/**
	 * @param roomQuan ����
	 */
	public void setRoomQuan(final String roomQuan) {
		this.roomQuan = StringUtil.toHalf(roomQuan);
	}

	/**
	 * @return �����^�C�v
	 */
	public Integer getRoomType() {
		return roomType;
	}

	/**
	 * @param roomType �����^�C�v
	 */
	public void setRoomType(final Integer roomType) {
		this.roomType = roomType;
	}

	/**
	 * @return �݌ɋ敪
	 */
	public Integer getStockDiv() {
		return stockDiv;
	}

	/**
	 * @param stockDiv �݌ɋ敪
	 */
	public void setStockDiv(final Integer stockDiv) {
		this.stockDiv = stockDiv;
	}

	/**
	 * @return ���]�R�[�h
	 */
	public Integer getViewCd() {
		return viewCd;
	}

	/**
	 * @param viewCd ���]�R�[�h
	 */
	public void setViewCd(final Integer viewCd) {
		if (viewCd != null && viewCd.intValue() == 0) {
			this.viewCd = null;
		} else {
			this.viewCd = viewCd;
		}
		
	}

	/**
	 * @return ���] 
	 */
	public String getView() {
		return view;
	}

	/**
	 * @param view ���] 
	 */
	public void setView(String view) {
		this.view = view;
	}
	
//start 2010/1/20 d.endo �݌Ƀ^�C�v���͕��ǉ�
	/**
	 * @return �݌Ƀ^�C�v���
	 */
	public String getStockType() {
		return stockType;
	}

	/**
	 * @param view �݌Ƀ^�C�v��� 
	 */
	public void setStockType(final String stockType) {
		this.stockType = stockType;
	}
	
	/**
	 * @return �݌Ƀ^�C�v���̑� 
	 */
	public String getOtherPlanNam() {
		return otherPlanNam;
	}

	/**
	 * @param view �݌Ƀ^�C�v���̑� 
	 */
	public void setOtherPlanNam(final String otherPlanNam) {
		this.otherPlanNam = otherPlanNam;
	}
//end 2010/1/20 d.endo �݌Ƀ^�C�v���͕��ǉ�
}
