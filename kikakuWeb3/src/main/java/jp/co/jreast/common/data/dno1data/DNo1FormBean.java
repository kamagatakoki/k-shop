package jp.co.jreast.common.data.dno1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.ddata.DNo5TrafficData;
import jp.co.jreast.common.data.ddata.DPlanAnsFacility;
import jp.co.jreast.common.data.ddata.MStock;

/**
 * <pre>
 * [DP/RM]No1�Ɩ��f�[�^�N���X�B.
 * �@�\�T�v    �F  [DP/RM]No1�Ɩ��f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public final class DNo1FormBean implements InData, OutData {

    /**
     * ��������.
     */
    private AnsSearchData ansSearchData;

    /**
     * �����J�����_�[���X�g
     * No1ChargeCalendarData.
     */
    private List<DNo1ChargeCalendarData> chargeCalendarList;

    /**
     * ����_�����E�x���E�x�O�����X�g
     * No1ChargeDayData.
     */
    private List<DNo1ChargeDayData> chargeDayList;

    /**
     * NO1_�����\�ڍׁi�S���t�j
     * No1ChargeDtlData.
     */
    private List<DNo1ChargeDtlData> chargeDtlList;

    /**
     * �񋟗��� �ꖼ������̊z
     * No1ChargeTblData.
     */
    private List<DNo1ChargeTblData> chargeList;

    /**
     * �����j�����X�g
     * No1ChargeWeekData.
     */
    private List<DNo1ChargeWeekData> chargeWeekList;

    /**
     * ���񓚏�_�{�ݏ��
     */
    private DPlanAnsFacility dPlanAnsFacility;

    /**
     * NO1_JR�݌� �U�Ѝ݌�.
     */
    private DNo1JrStockData jr6CStockData;

    /**
     * NO1_JR�݌� �����{�݌�
     * No1JrStockData.
     */
    private List<DNo1JrStockData> jrEJStockList;

    /** �݌ɊǗ��}�X�^�G���e�B�e�B */
    private MStock mStock;

    /**
     * �{�ݏ��F���f�[�^.
     */
    private DNo1AckInfoData no1AckInfoFacilityData;

    /**
     * ������� .
     * No1ChargeInfoData .
     */
    private List<DNo1ChargeInfoData> no1ChargeInfoList;

    /**
     * NO1_�h���A�ό��A�D��.
     */
    private IDNo1CommonData no1CommonData;

    /**
     * NO2���X�V���锻��t���O
     */
    private String no2Flg = JreConstants.FLG_FALSE;

    /**
     * NO5_��ʎ�i .
     */
    private DNo5TrafficData no5TrafficData;

    /**
     * ���񓚏�.
     */
    private DPlanAnsData planAnsData;

    /**
     * ���[�U�敪.
     */
    private String userDiv;

    /**
     * @return ��������
     */
    public AnsSearchData getAnsSearchData() {
        return ansSearchData;
    }

    /**
     * @return �����J�����_�[���X�g
     */
    public List<DNo1ChargeCalendarData> getChargeCalendarList() {
        return chargeCalendarList;
    }

    /**
     * @return ����_�����E�x���E�x�O�����X�g
     */
    public List<DNo1ChargeDayData> getChargeDayList() {
        return chargeDayList;
    }

    /**
     * @return Returns the chargeDtlList.
     */
    public List<DNo1ChargeDtlData> getChargeDtlList() {
        return chargeDtlList;
    }

    /**
     * @return (No1ChargeTblData) �񋟗����u�ꖼ������̊z
     */
    public List<DNo1ChargeTblData> getChargeList() {
        return chargeList;
    }

    /**
     * @return �����j�����X�g
     */
    public List<DNo1ChargeWeekData> getChargeWeekList() {
        return chargeWeekList;
    }

    /**
     * ���񓚏�_�{�ݏ����擾���܂��B
     * @return ���񓚏�_�{�ݏ��
     */
    public DPlanAnsFacility getDPlanAnsFacility() {
        return dPlanAnsFacility;
    }

    /**
     * ���񓚏�_�{�ݏ���ݒ肵�܂��B
     * @param dPlanAnsFacility ���񓚏�_�{�ݏ��
     */
    public void setdPlanAnsFacility(DPlanAnsFacility dPlanAnsFacility) {
        this.dPlanAnsFacility = dPlanAnsFacility;
    }

    /**
     * @return NO1_JR�݌� �U�Ѝ݌�
     */
    public DNo1JrStockData getJr6CStockData() {
        return jr6CStockData;
    }

    /**
     * @return NO1_JR�݌� �����{�݌�
     */
    public List<DNo1JrStockData> getJrEJStockList() {
        return jrEJStockList;
    }

    /**
     * �݌ɊǗ��}�X�^�G���e�B�e�B���擾���܂��B
     * 
     * @return �݌ɊǗ��}�X�^�G���e�B�e�B
     */
    public MStock getMStock() {
        return mStock;
    }

    /**
     * @return �{�ݏ��F���f�[�^
     */
    public DNo1AckInfoData getNo1AckInfoFacilityData() {
        return no1AckInfoFacilityData;
    }

    /**
     * @return .
     */
    public List<DNo1ChargeInfoData> getNo1ChargeInfoList() {
        return no1ChargeInfoList;
    }

    /**
     * @return Returns the no1CommonData.
     */
    public IDNo1CommonData getNo1CommonData() {
        return no1CommonData;
    }

    /**
     * @param i
     *            index
     * @return NO1_JR�݌� �����{�݌�
     */
    public DNo1JrStockData getNo1JrStockData(int i) {
        return jrEJStockList.get(i);
    }

    /**
     * NO2���X�V���锻��t���O���擾���܂��B
     * 
     * @return NO2���X�V���锻��t���O
     */
    public String getNo2Flg() {
        return no2Flg;
    }

    /**
     * @return .
     */
    public DNo5TrafficData getNo5TrafficData() {
        return no5TrafficData;
    }

    /**
     * @return ���񓚏�
     */
    public DPlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return the userDiv
     */
    public final String getUserDiv() {
        return userDiv;
    }

    /**
     * @param ansSearchData
     *            ��������
     */
    public void setAnsSearchData(final AnsSearchData ansSearchData) {
        this.ansSearchData = ansSearchData;
    }

    /**
     * @param chargeCalendarList
     *            �����J�����_�[���X�g
     */
    public void setChargeCalendarList(List chargeCalendarList) {
        this.chargeCalendarList = chargeCalendarList;
    }

    /**
     * @param chargeDayList
     *            ����_�����E�x���E�x�O�����X�g
     */
    public void setChargeDayList(List chargeDayList) {
        this.chargeDayList = chargeDayList;
    }

    /**
     * @param chargeDtlList
     *            The chargeDtlList to set.
     */
    public void setChargeDtlList(List chargeDtlList) {
        this.chargeDtlList = chargeDtlList;
    }

    /**
     * @param chargeList
     *            (No1ChargeTblData) �񋟗����u�ꖼ������̊z
     */
    public void setChargeList(final List chargeList) {
        this.chargeList = chargeList;
    }

    /**
     * @param chargeWeekList
     *            �����j�����X�g
     */
    public void setChargeWeekList(List chargeWeekList) {
        this.chargeWeekList = chargeWeekList;
    }

    /**
     * @param jr6CStockData
     *            NO1_JR�݌� �U�Ѝ݌�
     */
    public void setJr6CStockData(final DNo1JrStockData jr6CStockData) {
        this.jr6CStockData = jr6CStockData;
    }

    /**
     * @param jrEJStockList
     *            NO1_JR�݌� �����{�݌�
     */
    public void setJrEJStockList(final List jrEJStockList) {
        this.jrEJStockList = jrEJStockList;
    }

    /**
     * �݌ɊǗ��}�X�^�G���e�B�e�B��ݒ肵�܂��B
     * 
     * @param mStock
     *            �݌ɊǗ��}�X�^�G���e�B�e�B
     */
    public void setMStock(MStock mStock) {
        this.mStock = mStock;
    }

    /**
     * @param no1AckInfoFacilityData
     *            �{�ݏ��F���f�[�^
     */
    public void setNo1AckInfoFacilityData(DNo1AckInfoData no1AckInfoFacilityData) {
        this.no1AckInfoFacilityData = no1AckInfoFacilityData;
    }

    /**
     * @param no1ChargeInfoList
     *            .
     */
    public void setNo1ChargeInfoList(List no1ChargeInfoList) {
        this.no1ChargeInfoList = no1ChargeInfoList;
    }

    /**
     * @param no1CommonData
     *            The no1CommonData to set.
     */
    public void setNo1CommonData(IDNo1CommonData no1CommonData) {
        this.no1CommonData = no1CommonData;
    }

    /**
     * no2Flg��ݒ肵�܂��B
     * 
     * @param no2Flg
     *            no2Flg
     */
    public void setNo2Flg(String no2Flg) {
        this.no2Flg = no2Flg;
    }

    /**
     * @param no5TrafficData
     *            .
     */
    public void setNo5TrafficData(DNo5TrafficData no5TrafficData) {
        this.no5TrafficData = no5TrafficData;
    }

    /**
     * @param planAnsData
     *            ���񓚏�
     */
    public void setPlanAnsData(final DPlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param userDiv
     *            the userDiv to set
     */
    public final void setUserDiv(final String userDiv) {
        this.userDiv = userDiv;
    }
}
