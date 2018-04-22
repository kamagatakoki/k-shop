package jp.co.jreast.common.data.dno1data;

import java.util.List;

import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.FacilityData;

/**
 * <pre>
 * [DP/RM]NO1���ʃf�[�^�N���X�B
 * �@�\�T�v    �F  [DP/RM]NO1���ʃf�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public class BaseDNo1Data {

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
     * �����j�����X�g
     * No1ChargeWeekData .
     */
    private List chargeWeekList;

    /**
     * �{�ݏ��}�X�^�f�[�^�N���X
     */
    private FacilityData facilityData;

    /**
     * �{���p�f�[�^ .
     */
    private DNo1InitData initData;

    /**
     * Fax���M�t���O.
     */
    private boolean isSendFax = false;

    /**
     * ���[�� .
     */
    private String memo;

    /**
     * NO1_���F�� �{�ݗl �f�[�^ .
     */
    private DNo1AckInfoData no1AckInfoFacilityData;

    /**
     * NO1_���F�� �{�ݗl ���X�g .
     * No1AckInfoData
     */
    private List no1AckInfoFacilityList;

    /**
     * NO1_���F�� �i�q�����{�l �f�[�^ .
     */
    private DNo1AckInfoData no1AckInfoJrData;

    /**
     * �񋟗��� /NO1_�����\�ڍׁi�S���t�j���X
     * No1PageChargeData//NO1ChargeDtlData.
     */
    private List pageChargeList;

    /**
     * �p�X���[�h .
     */
    private String password;

    /**
     * ���񓚏� .
     */
    private DPlanAnsData planAnsData;

    /**
     * ���[�UID .
     */
    private String userId;

    /**
     * ���[�U�� .
     */
    private String userNm;

    /**
     * �R���X�g���N�^.
     */
    public BaseDNo1Data() {
        planAnsData = new DPlanAnsData();
        no1AckInfoJrData = new DNo1AckInfoData();
        no1AckInfoFacilityData = new DNo1AckInfoData();
        initData = new DNo1InitData();
    }

    /**
     * @return ����_�����E�x���E�x�O�����X�g
     */
    public List getChargeDayList() {
        return chargeDayList;
    }

    /**
     * @return Returns the chargeInfoList.
     */
    public List getChargeInfoList() {
        return chargeInfoList;
    }

    /**
     * @return �����j�����X�g
     */
    public List getChargeWeekList() {
        return chargeWeekList;
    }

    /**
     * �{�ݏ��}�X�^�f�[�^�N���X���擾���܂��B
     * 
     * @return �{�ݏ��}�X�^�f�[�^�N���X
     */
    public FacilityData getFacilityData() {
        return facilityData;
    }

    /**
     * @return initData .
     */
    public DNo1InitData getInitData() {
        return initData;
    }

    /**
     * @return ���[��
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @return NO1_���F�� �{�ݗl �f�[�^
     */
    public DNo1AckInfoData getNo1AckInfoFacilityData() {
        return no1AckInfoFacilityData;
    }

    /**
     * @return NO1_���F�� �{�ݗl
     */
    public List getNo1AckInfoFacilityList() {
        return no1AckInfoFacilityList;
    }

    /**
     * @return NO1_���F�� �i�q�����{�l
     */
    public DNo1AckInfoData getNo1AckInfoJrData() {
        return no1AckInfoJrData;
    }

    /**
     * @return �񋟗���
     */
    public List getPageChargeList() {
        return pageChargeList;
    }

    /**
     * @return �p�X���[�h
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return ���񓚏�
     */
    public DPlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return Returns the userId.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return Returns the userNm.
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * @return Fax���M�t���O
     */
    public boolean isSendFax() {
        return isSendFax;
    }

    /**
     * @param chargeDayList
     *            ����_�����E�x���E�x�O�����X�g
     */
    public void setChargeDayList(List chargeDayList) {
        this.chargeDayList = chargeDayList;
    }

    /**
     * @param chargeInfoList
     *            The chargeInfoList to set.
     */
    public void setChargeInfoList(List chargeInfoList) {
        this.chargeInfoList = chargeInfoList;
    }

    /**
     * @param chargeWeekList
     *            �����j�����X�g
     */
    public void setChargeWeekList(List chargeWeekList) {
        this.chargeWeekList = chargeWeekList;
    }

    /**
     * �{�ݏ��}�X�^�f�[�^�N���X��ݒ肵�܂��B
     * 
     * @param facilityData
     *            �{�ݏ��}�X�^�f�[�^�N���X
     */
    public void setFacilityData(FacilityData facilityData) {
        this.facilityData = facilityData;
    }

    /**
     * @param initData
     *            .
     */
    public void setInitData(DNo1InitData initData) {
        this.initData = initData;
    }

    /**
     * @param memo
     *            ���[��
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @param no1AckInfoFacilityData
     *            NO1_���F�� �{�ݗl �f�[�^
     */
    public void setNo1AckInfoFacilityData(DNo1AckInfoData no1AckInfoFacilityData) {
        this.no1AckInfoFacilityData = no1AckInfoFacilityData;
    }

    /**
     * @param no1AckInfoFacilityList
     *            NO1_���F�� �{�ݗl
     */
    public void setNo1AckInfoFacilityList(final List no1AckInfoFacilityList) {
        this.no1AckInfoFacilityList = no1AckInfoFacilityList;
    }

    /**
     * @param no1AckInfoJrData
     *            NO1_���F�� �i�q�����{�l
     */
    public void setNo1AckInfoJrData(final DNo1AckInfoData no1AckInfoJrData) {
        this.no1AckInfoJrData = no1AckInfoJrData;
    }

    /**
     * @param pageChargeList
     *            �񋟗���
     */
    public void setPageChargeList(final List pageChargeList) {
        this.pageChargeList = pageChargeList;
    }

    /**
     * @param password
     *            �p�X���[�h
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param planAnsData
     *            ���񓚏�
     */
    public void setPlanAnsData(final DPlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param isSendFax
     *            Fax���M�t���O
     */
    public void setSendFax(boolean isSendFax) {
        this.isSendFax = isSendFax;
    }

    /**
     * @param userId
     *            The userId to set.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @param userNm
     *            The userNm to set.
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

}
