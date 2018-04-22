package jp.co.jreast.common.data.no1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.PlanAnsData;
import jp.co.jreast.ur01050.data.TrafficData;

/**
 * <pre>
 * No1�Ɩ��f�[�^�N���X�B.
 * �@�\�T�v    �F  No1�Ɩ��f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class No1FormBean implements InData, OutData{
	
	/**
	 * �{�ݏ��F���f�[�^.
	 */
	private No1AckInfoData no1AckInfoFacilityData;
	/**
	 * ���[�U�敪.
	 */
	private String userDiv;
	
	/**
	 * ��������.
	 */
	private AnsSearchData ansSearchData;
	
	/**
	 * ���񓚏�.
	 */
	private PlanAnsData planAnsData;
	
	/**
	 * NO1_�h���A�ό��A�D��.
	 */
	private INo1CommonData no1CommonData;
	
	/**
	 * NO1_JR�݌� �U�Ѝ݌�.
	 */
	private No1JrStockData jr6CStockData;
	
	/**
	 * NO1_JR�݌� �����{�݌�
	 * No1JrStockData.
	 * 
	 */
	private List jrEJStockList;
	
	/**
	 * �񋟗��� �ꖼ������̊z 
	 * No1ChargeTblData.
	 */
	private List chargeList;
	/**
	 * NO1_�����\�ڍׁi�S���t�j 
	 * No1ChargeDtlData.
	 */
	private List chargeDtlList;
	
	/**
	 * �����j�����X�g
	 * No1ChargeWeekData.
	 */
	private List chargeWeekList;
	
	/**
	 * �����J�����_�[���X�g
	 * No1ChargeCalendarData.
	 */
	private List chargeCalendarList;
	
	/**
	 * NO5_��ʎ�i .
	 */
	private TrafficData no5TrafficData;
	
	/**
	 * ������� .
	 * No1ChargeInfoData .
	 */
	private List no1ChargeInfoList;
	
	/**
	 * ����_�����E�x���E�x�O�����X�g	�ۑ�NO18�F�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή��@2009/12/02 add by s31109
	 * No1ChargeDayData.
	 */
	private List chargeDayList;

	/**
	 * @return ��������
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData ��������
	 */
	public void setAnsSearchData(final AnsSearchData ansSearchData) {
		this.ansSearchData = ansSearchData;
	}

	/**
	 * @return (No1ChargeTblData) �񋟗����u�ꖼ������̊z 
	 */
	public List getChargeList() {
		return chargeList;
	}

	/**
	 * @param chargeList (No1ChargeTblData) �񋟗����u�ꖼ������̊z 
	 */
	public void setChargeList(final List chargeList) {
		this.chargeList = chargeList;
	}

	/**
	 * @return ���񓚏�
	 */
	public PlanAnsData getPlanAnsData() {
		return planAnsData;
	}

	/**
	 * @param planAnsData ���񓚏�
	 */
	public void setPlanAnsData(final PlanAnsData planAnsData) {
		this.planAnsData = planAnsData;
	}

	/**
	 * @return NO1_JR�݌� �U�Ѝ݌�
	 */
	public No1JrStockData getJr6CStockData() {
		return jr6CStockData;
	}

	/**
	 * @param jr6CStockData NO1_JR�݌� �U�Ѝ݌�
	 */
	public void setJr6CStockData(final No1JrStockData jr6CStockData) {
		this.jr6CStockData = jr6CStockData;
	}

	/**
	 * @return NO1_JR�݌� �����{�݌�
	 */
	public List getJrEJStockList() {
		return jrEJStockList;
	}

	/**
	 * @param jrEJStockList NO1_JR�݌� �����{�݌�
	 */
	public void setJrEJStockList(final List jrEJStockList) {
		this.jrEJStockList = jrEJStockList;
	}
	
	/**
	 * 
	 * @param i index
	 * @return NO1_JR�݌� �����{�݌�
	 */
	public No1JrStockData getNo1JrStockData(int i) {
		return (No1JrStockData) jrEJStockList.get(i);
	}
	
	/**
	 * 
	 * @return �����J�����_�[���X�g
	 */
	public List getChargeCalendarList() {
		return chargeCalendarList;
	}

	/**
	 * 
	 * @param chargeCalendarList �����J�����_�[���X�g
	 */
	public void setChargeCalendarList(List chargeCalendarList) {
		this.chargeCalendarList = chargeCalendarList;
	}

	/**
	 * 
	 * @return �����j�����X�g
	 */
	public List getChargeWeekList() {
		return chargeWeekList;
	}

	/**
	 * 
	 * @param chargeWeekList �����j�����X�g
	 */
	public void setChargeWeekList(List chargeWeekList) {
		this.chargeWeekList = chargeWeekList;
	}

	/**
	 * @return the userDiv
	 */
	public final String getUserDiv() {
		return userDiv;
	}

	/**
	 * @param userDiv the userDiv to set
	 */
	public final void setUserDiv(final String userDiv) {
		this.userDiv = userDiv;
	}

	/**
	 * @return Returns the no1CommonData.
	 */
	public INo1CommonData getNo1CommonData() {
		return no1CommonData;
	}

	/**
	 * @param no1CommonData The no1CommonData to set.
	 */
	public void setNo1CommonData(INo1CommonData no1CommonData) {
		this.no1CommonData = no1CommonData;
	}
	
	/**
	 * 
	 * @return .
	 */
	public TrafficData getNo5TrafficData() {
		return no5TrafficData;
	}

	/**
	 * 
	 * @param no5TrafficData .
	 */
	public void setNo5TrafficData(TrafficData no5TrafficData) {
		this.no5TrafficData = no5TrafficData;
	}
	
	/**
	 * 
	 * @return .
	 */
	public List getNo1ChargeInfoList() {
		return no1ChargeInfoList;
	}

	/**
	 * 
	 * @param no1ChargeInfoList .
	 */
	public void setNo1ChargeInfoList(List no1ChargeInfoList) {
		this.no1ChargeInfoList = no1ChargeInfoList;
	}

	/**
	 * @return Returns the chargeDtlList.
	 */
	public List getChargeDtlList() {
		return chargeDtlList;
	}

	/**
	 * @param chargeDtlList The chargeDtlList to set.
	 */
	public void setChargeDtlList(List chargeDtlList) {
		this.chargeDtlList = chargeDtlList;
	}
	/**
	 * 
	 * @return �{�ݏ��F���f�[�^
	 */
	public No1AckInfoData getNo1AckInfoFacilityData() {
		return no1AckInfoFacilityData;
	}
	/**
	 * 
	 * @param no1AckInfoFacilityData �{�ݏ��F���f�[�^
	 */
	public void setNo1AckInfoFacilityData(No1AckInfoData no1AckInfoFacilityData) {
		this.no1AckInfoFacilityData = no1AckInfoFacilityData;
	}
	
	/**
	 * 
	 * @return ����_�����E�x���E�x�O�����X�g
	 */
	public List getChargeDayList() {
		return chargeDayList;
	}

	/**
	 * 
	 * @param chargeDayList ����_�����E�x���E�x�O�����X�g
	 */
	public void setChargeDayList(List chargeDayList) {
		this.chargeDayList = chargeDayList;
	}
}
