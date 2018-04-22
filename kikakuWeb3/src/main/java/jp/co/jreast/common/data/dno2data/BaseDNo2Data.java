package jp.co.jreast.common.data.dno2data;

import java.util.List;

import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.dno1data.DNo1AckInfoData;
import jp.co.jreast.common.data.dno1data.DNo1AdmitBean;
import jp.co.jreast.common.data.dno1data.DNo1InitData;

/**
 * <pre>
 * [DP/RM]NO2���ʃf�[�^�N���X�B
 * �@�\�T�v    �F  [DP/RM]NO2���ʃf�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public class BaseDNo2Data {

    /**
     * DNo1AdmitBean�N���X
     */
    private DNo1AdmitBean dNo1AdmitBean;

    /**
     * ���ڊ֘A�G���[��
     */
    private int errCnt;

    /**
     * �{���p�f�[�^ .
     */
    private DNo1InitData initData;

    /**
     * �R�s�[���
     * 1:�R�s�[�ꗗ��ʂ���J�� 0:����ȊO
     */
    private String isCopy;

    /**
     * �ʐM�����f�[�^�N���X .
     */
    private MemoData memoData;

    /**
     * ���@�� .
     */
    private String method;

    /**
     * NO1_���F�� �{�ݗl �f�[�^ .
     */
    private DNo1AckInfoData no1AckInfoFacilityData;

    /**
     * NO1_���F�� �{�ݗl ���X�g .
     * No1AckInfoData
     */
    private List<DNo1AckInfoData> no1AckInfoFacilityList;

    /**
     * NO1_���F�� �i�q�����{�l �f�[�^ .
     */
    private DNo1AckInfoData no1AckInfoJrData;

    /**
     * ���񓚏� .
     */
    private DPlanAnsData planAnsData;

    /**
     * ���[�U�[�敪 .
     */
    private String userDiv;

    /**
     * ���[�U�[ID .
     */
    private String userId;

    /**
     * ���[�U�[���� .
     */
    private String userNm;

    /**
     * �R���X�g���N�^.
     */
    public BaseDNo2Data() {
        initData = new DNo1InitData();
        planAnsData = new DPlanAnsData();
        no1AckInfoJrData = new DNo1AckInfoData();
        no1AckInfoFacilityData = new DNo1AckInfoData();
        memoData = new MemoData();
    }

    /**
     * @return �x�ЃR�[�h
     */
    public String getBranchCd() {
        return getPlanAnsData().getBranchCd();
    }

    /**
     * @return �x�Ж���
     */
    public String getBranchName() {
        return getPlanAnsData().getBranchName();
    }

    /**
     * @return ����ԍ�
     */
    public Integer getCareerNo() {
        return getPlanAnsData().getCareerNo();
    }

    /**
     * DNo1AdmitBean�N���X���擾���܂��B
     * 
     * @return DNo1AdmitBean�N���X
     */
    public DNo1AdmitBean getdNo1AdmitBean() {
        return dNo1AdmitBean;
    }

    /**
     * ���ڊ֘A�G���[�����擾���܂��B
     * 
     * @return ���ڊ֘A�G���[��
     */
    public int getErrCnt() {
        return errCnt;
    }

    /**
     * @return �{�݃R�[�h
     */
    public String getFacilityCd() {
        return getPlanAnsData().getFacilityCd();
    }

    /**
     * @return �{�݃R�[�h1
     */
    public String getFacilityCd1() {
        return getPlanAnsData().getFacilityCd().substring(0, 1);
    }

    /**
     * @return �{�݃R�[�h2
     */
    public String getFacilityCd2() {
        return getPlanAnsData().getFacilityCd().substring(1, 2);
    }

    /**
     * @return �{�݃R�[�h3
     */
    public String getFacilityCd3() {
        return getPlanAnsData().getFacilityCd().substring(2, 3);
    }

    /**
     * @return �{�݃R�[�h4
     */
    public String getFacilityCd4() {
        return getPlanAnsData().getFacilityCd().substring(3, 4);
    }

    /**
     * @return �{�݃R�[�h5
     */
    public String getFacilityCd5() {
        return getPlanAnsData().getFacilityCd().substring(4, 5);
    }

    /**
     * @return �{�݃R�[�h6
     */
    public String getFacilityCd6() {
        return getPlanAnsData().getFacilityCd().substring(5, 6);
    }

    /**
     * @return �{�ݖ���
     */
    public String getFacilityNm() {
        return getPlanAnsData().getFacilityNm();
    }

    /**
     * @return �{�ݖ��̃J�i
     */
    public String getFacilityNmKana() {
        return getPlanAnsData().getFacilityNmKana();
    }

    /**
     * @return ���i����
     */
    public String getGoodsNm() {
        return getPlanAnsData().getGoodsNm();
    }

    /**
     * �{���p�f�[�^ .���擾���܂��B
     * 
     * @return �{���p�f�[�^ .
     */
    public DNo1InitData getInitData() {
        return initData;
    }

    /**
     * @return ���
     */
    public String getKindFlg() {
        return getPlanAnsData().getKindFlg();
    }

    /**
     * @return ��ޖ���
     */
    public String getKindName() {
        return getPlanAnsData().getKindName();
    }

    /**
     * �f�ގ�ʂ��擾���܂��B
     * 
     * @return �f�ގ��
     */
    public String getMaterialKind() {
        return getPlanAnsData().getMaterialKind();
    }

    /***
     * �������擾���܂��B
     * 
     * <pre></pre>
     * 
     * @return ����
     */
    public String getMemo() {
        return getMemoData().getMemo();
    }

    /**
     * �R�s�[��ʂ��擾���܂��B
     * @return �R�s�[���
     */
    public String getIsCopy() {
        return isCopy;
    }

    /**
     * �R�s�[��ʂ�ݒ肵�܂��B
     * @param isCopy �R�s�[���
     */
    public void setIsCopy(String isCopy) {
        this.isCopy = isCopy;
    }

    /**
     * �ʐM�����f�[�^�N���X .���擾���܂��B
     * 
     * @return �ʐM�����f�[�^�N���X .
     */
    public MemoData getMemoData() {
        return memoData;
    }

    /**
     * ���@�� .���擾���܂��B
     * 
     * @return ���@�� .
     */
    public String getMethod() {
        return method;
    }

    /**
     * NO1_���F�� �{�ݗl �f�[�^ .���擾���܂��B
     * 
     * @return NO1_���F�� �{�ݗl �f�[�^ .
     */
    public DNo1AckInfoData getNo1AckInfoFacilityData() {
        return no1AckInfoFacilityData;
    }

    /**
     * NO1_���F�� �{�ݗl ���X�g .���擾���܂��B
     * 
     * @return NO1_���F�� �{�ݗl ���X�g .
     */
    public List<DNo1AckInfoData> getNo1AckInfoFacilityList() {
        return no1AckInfoFacilityList;
    }

    /**
     * NO1_���F�� �i�q�����{�l �f�[�^ .���擾���܂��B
     * 
     * @return NO1_���F�� �i�q�����{�l �f�[�^ .
     */
    public DNo1AckInfoData getNo1AckInfoJrData() {
        return no1AckInfoJrData;
    }

    /**
     * @return NO2����ԍ�
     */
    public Integer getNo2CareerNo() {
        return getPlanAnsData().getNo2CareerNo();
    }

    /**
     * @return No2���
     */
    public Integer getNo2Status() {
        return getPlanAnsData().getNo2Status();
    }

    /**
     * @return No2��Ԗ���
     */
    public String getNo2StatusName() {
        return getPlanAnsData().getNo2StatusName();
    }

    /**
     * ���񓚏� .���擾���܂��B
     * 
     * @return ���񓚏� .
     */
    public DPlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return ���񓚘A��
     */
    public Long getPlanAnsNo() {
        return getPlanAnsData().getPlanAnsNo();
    }

    /**
     * @return ���ʔԁi�����{�j
     */
    public String getPlanNoEJp() {
        return getPlanAnsData().getPlanNoEJp();
    }

    /**
     * @return ���ʔԁi�����{�j1
     */
    public String getPlanNoEJp1() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(0, 1);
    }

    /**
     * @return ���ʔԁi�����{�j2
     */
    public String getPlanNoEJp2() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(1, 2);
    }

    /**
     * @return ���ʔԁi�����{�j3
     */
    public String getPlanNoEJp3() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(2, 3);
    }

    /**
     * @return ���ʔԁi�����{�j4
     */
    public String getPlanNoEJp4() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(3, 4);
    }

    /**
     * @return ���ʔԁi�����{�j5
     */
    public String getPlanNoEJp5() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(4, 5);
    }

    /**
     * @return ���ʔԁi�����{�j6
     */
    public String getPlanNoEJp6() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(5, 6);
    }

    /**
     * @return �V�[�Y���敪
     */
    public String getSeasonDiv() {
        return getPlanAnsData().getSeasonDiv();
    }

    /**
     * @return �V�[�Y������
     */
    public String getSeasonDivName() {
        return getPlanAnsData().getSeasonDivName();
    }

    /**
     * @return ���t�敪
     */
    public String getSendDiv() {
        if (getPlanAnsData().getSendDiv() == null) {
            return null;
        } else {
            return getPlanAnsData().getSendDiv().toString();
        }
    }

    /**
     * @return ���
     */
    public Integer getStatus() {
        return getPlanAnsData().getStatus();
    }

    /**
     * ���[�U�[�敪 .���擾���܂��B
     * 
     * @return ���[�U�[�敪 .
     */
    public String getUserDiv() {
        return userDiv;
    }

    /**
     * ���[�U�[ID .���擾���܂��B
     * 
     * @return ���[�U�[ID .
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�U�[���� .���擾���܂��B
     * 
     * @return ���[�U�[���� .
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * @return �N�x
     */
    public String getYear() {
        return getPlanAnsData().getYear();
    }

    /**
     * @param branchCd
     *            �x�ЃR�[�h
     *            The branchCd to set.
     */
    public void setBranchCd(String branchCd) {
        getPlanAnsData().setBranchCd(branchCd);
    }

    /**
     * @param careerNo
     *            ����ԍ�
     *            The careerNo to set.
     */
    public void setCareerNo(Integer careerNo) {
        getPlanAnsData().setCareerNo(careerNo);
    }

    /**
     * DNo1AdmitBean�N���X��ݒ肵�܂��B
     * 
     * @param dNo1AdmitBean
     *            DNo1AdmitBean�N���X
     */
    public void setdNo1AdmitBean(DNo1AdmitBean dNo1AdmitBean) {
        this.dNo1AdmitBean = dNo1AdmitBean;
    }

    /**
     * ���ڊ֘A�G���[����ݒ肵�܂��B
     * 
     * @param errCnt
     *            ���ڊ֘A�G���[��
     */
    public void setErrCnt(int errCnt) {
        this.errCnt = errCnt;
    }

    /**
     * @param facilityCd
     *            The facilityCd to set.
     */
    public void setFacilityCd(String facilityCd) {
        getPlanAnsData().setFacilityCd(facilityCd);
    }

    /**
     * @param facilityNm
     *            The facilityNm to set.
     */
    public void setFacilityNm(String facilityNm) {
        getPlanAnsData().setFacilityNm(facilityNm);
    }

    /**
     * @param facilityNmKana
     *            �{�ݖ��̃J�i
     */
    public void setFacilityNmKana(String facilityNmKana) {
        getPlanAnsData().setFacilityNmKana(facilityNmKana);
    }

    /**
     * @param goodsNm
     *            The goodsNm to set.
     */
    public void setGoodsNm(String goodsNm) {
        getPlanAnsData().setGoodsNm(goodsNm);
    }

    /**
     * �{���p�f�[�^ .��ݒ肵�܂��B
     * 
     * @param initData
     *            �{���p�f�[�^ .
     */
    public void setInitData(DNo1InitData initData) {
        this.initData = initData;
    }

    /**
     * @param kindFlg
     *            The kindFlg to set.
     */
    public void setKindFlg(String kindFlg) {
        getPlanAnsData().setKindFlg(kindFlg);
    }

    /**
     * �f�ގ�ʂ�ݒ肵�܂��B
     * 
     * @param materialKind
     *            �f�ގ��
     */
    public void setMaterialKind(String materialKind) {
        getPlanAnsData().setMaterialKind(materialKind);
    }

    /***
     * ������ݒ肵�܂��B
     * 
     * <pre></pre>
     * 
     * @param memo
     *            ����
     */
    public void setMemo(String memo) {
        getMemoData().setMemo(memo);
    }

    /**
     * �ʐM�����f�[�^�N���X .��ݒ肵�܂��B
     * 
     * @param memoData
     *            �ʐM�����f�[�^�N���X .
     */
    public void setMemoData(MemoData memoData) {
        this.memoData = memoData;
    }

    /**
     * ���@�� .��ݒ肵�܂��B
     * 
     * @param method
     *            ���@�� .
     */
    public void setMethod(String method) {
        this.method = method;
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
    public void setNo1AckInfoFacilityList(
            final List<DNo1AckInfoData> no1AckInfoFacilityList) {
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
     * @param no2CareerNo
     *            NO2����ԍ�
     */
    public void setNo2CareerNo(Integer no2CareerNo) {
        getPlanAnsData().setNo2CareerNo(no2CareerNo);
    }

    /**
     * @param no2Status
     *            The no2Status to set.
     */
    public void setNo2Status(Integer no2Status) {
        getPlanAnsData().setNo2Status(no2Status);
    }

    /**
     * ���񓚏� .��ݒ肵�܂��B
     * 
     * @param planAnsData
     *            ���񓚏� .
     */
    public void setPlanAnsData(final DPlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param planAnsNo
     *            The planAnsNo to set.
     */
    public void setPlanAnsNo(Long planAnsNo) {
        getPlanAnsData().setPlanAnsNo(planAnsNo);
    }

    /**
     * @param planNoEJp
     *            The planNoEJp to set.
     */
    public void setPlanNoEJp(String planNoEJp) {
        getPlanAnsData().setPlanNoEJp(planNoEJp);
    }

    /**
     * @param seasonDiv
     *            The seasonDiv to set.
     */
    public void setSeasonDiv(String seasonDiv) {
        getPlanAnsData().setSeasonDiv(seasonDiv);
    }

    /**
     * @param sendDiv
     *            ���t�敪
     */
    public void setSendDiv(String sendDiv) {
        getPlanAnsData().setSendDiv(new Integer(sendDiv));
    }

    /**
     * @param status
     *            ���
     */
    public void setStatus(Integer status) {
        getPlanAnsData().setStatus(status);
    }

    /**
     * ���[�U�[�敪 .��ݒ肵�܂��B
     * 
     * @param userDiv
     *            ���[�U�[�敪 .
     */
    public void setUserDiv(String userDiv) {
        this.userDiv = userDiv;
    }

    /**
     * ���[�U�[ID .��ݒ肵�܂��B
     * 
     * @param userId
     *            ���[�U�[ID .
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ���[�U�[���� .��ݒ肵�܂��B
     * 
     * @param userNm
     *            ���[�U�[���� .
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    /**
     * @param year
     *            The year to set.
     */
    public void setYear(String year) {
        getPlanAnsData().setYear(year);
    }
}
