package jp.co.jreast.common.data.no1data;

import java.util.List;

import jp.co.jreast.common.data.PlanAnsData;

/**
 * <pre>
 * NO1���ʃf�[�^�N���X�B.
 * �@�\�T�v    �F  NO1���ʃf�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/11/17
 */
public class BaseNo1Data {

	/**
     * �R���X�g���N�^.
     */
	public BaseNo1Data() {
		planAnsData = new PlanAnsData();
		no1AckInfoJrData = new No1AckInfoData();
		no1AckInfoFacilityData = new No1AckInfoData();
		initData = new No1InitData(); 
	}

	/**
	 * �{���p�f�[�^ .
	 */
	private No1InitData initData;

	/**
	 * �p�X���[�h .
	 */
	private String password;

	/**
	 * ���[�� .
	 */
	private String memo;
	
	/**
	 * ���[�UID .
	 */
	private String userId;
	/**
	 * ���[�U�� .
	 */
	private String userNm;
	/**
	 * ���񓚏� .
	 */
	private PlanAnsData planAnsData;

	/**
	 * NO1_���F�� �{�ݗl ���X�g .
	 * No1AckInfoData
	 */
	private List no1AckInfoFacilityList;

	/**
	 * NO1_���F�� �i�q�����{�l	�f�[�^ .
	 */
	private No1AckInfoData no1AckInfoJrData;

	/**
	 * NO1_���F�� �{�ݗl	�f�[�^ .
	 */
	private No1AckInfoData no1AckInfoFacilityData;
	
	/**
	 * �񋟗��� /NO1_�����\�ڍׁi�S���t�j���X
	 * No1PageChargeData//NO1ChargeDtlData.
	 */
	private List pageChargeList;

	/**
	 * �����j�����X�g
	 * No1ChargeWeekData .
	 */
	private List chargeWeekList;
	
	/**
	 * ����_�����E�x���E�x�O�����X�g
	 * �ۑ�NO18�F�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή��@2009/12/02 add by s31109
	 * No1ChargeWeekData .
	 */
	private List chargeDayList;

	/**
	 * �������f�[�^ .
	 */
	private List chargeInfoList;
	
	/**
	 * @return �񋟗���
	 */
	public List getPageChargeList() {
		return pageChargeList;
	}

	/**
	 * @param pageChargeList �񋟗���
	 */
	public void setPageChargeList(final List pageChargeList) {
		this.pageChargeList = pageChargeList;
	}
	
	/**
	 * @return NO1_���F�� �{�ݗl
	 */
	public List getNo1AckInfoFacilityList() {
		return no1AckInfoFacilityList;
	}

	/**
	 * @param no1AckInfoFacilityList NO1_���F�� �{�ݗl
	 */
	public void setNo1AckInfoFacilityList(final List no1AckInfoFacilityList) {
		this.no1AckInfoFacilityList = no1AckInfoFacilityList;
	}

	/**
	 * @return NO1_���F�� �i�q�����{�l
	 */
	public No1AckInfoData getNo1AckInfoJrData() {
		return no1AckInfoJrData;
	}

	/**
	 * @param no1AckInfoJrData NO1_���F�� �i�q�����{�l
	 */
	public void setNo1AckInfoJrData(final No1AckInfoData no1AckInfoJrData) {
		this.no1AckInfoJrData = no1AckInfoJrData;
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
	 * 
	 * @return NO1_���F�� �{�ݗl	�f�[�^
	 */
	public No1AckInfoData getNo1AckInfoFacilityData() {
		return no1AckInfoFacilityData;
	}

	/**
	 * 
	 * @param no1AckInfoFacilityData NO1_���F�� �{�ݗl	�f�[�^
	 */
	public void setNo1AckInfoFacilityData(No1AckInfoData no1AckInfoFacilityData) {
		this.no1AckInfoFacilityData = no1AckInfoFacilityData;
	}

	/**
	 * 
	 * @return ���[��
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * 
	 * @param memo ���[��
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * 
	 * @return �p�X���[�h
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password �p�X���[�h
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Returns the userId.
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId The userId to set.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return Returns the userNm.
	 */
	public String getUserNm() {
		return userNm;
	}

	/**
	 * @param userNm The userNm to set.
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	
	/**
	 * 
	 * @return initData .
	 */
	public No1InitData getInitData() {
		return initData;
	}

	/**
	 * 
	 * @param initData .
	 */
	public void setInitData(No1InitData initData) {
		this.initData = initData;
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
	
	/**
	 * @return Returns the chargeInfoList.
	 */
	public List getChargeInfoList() {
		return chargeInfoList;
	}

	/**
	 * @param chargeInfoList The chargeInfoList to set.
	 */
	public void setChargeInfoList(List chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}
	/**
	 * Fax���M�t���O.
	 */
	private boolean isSendFax = false;
	/**
	 * 
	 * @return Fax���M�t���O
	 */
	public boolean isSendFax() {
		return isSendFax;
	}
	/**
	 * 
	 * @param isSendFax Fax���M�t���O
	 */
	public void setSendFax(boolean isSendFax) {
		this.isSendFax = isSendFax;
	}
	
}
