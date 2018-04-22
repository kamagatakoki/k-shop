package jp.co.jreast.common.data.dno2data;

import java.util.List;

import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.dno1data.DNo1AckInfoData;
import jp.co.jreast.common.data.dno1data.DNo1AdmitBean;
import jp.co.jreast.common.data.dno1data.DNo1InitData;

/**
 * <pre>
 * [DP/RM]NO2共通データクラス。
 * 機能概要    ：  [DP/RM]NO2共通データを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public class BaseDNo2Data {

    /**
     * DNo1AdmitBeanクラス
     */
    private DNo1AdmitBean dNo1AdmitBean;

    /**
     * 項目関連エラー数
     */
    private int errCnt;

    /**
     * 捜索用データ .
     */
    private DNo1InitData initData;

    /**
     * コピー画面
     * 1:コピー一覧画面から遷移 0:それ以外
     */
    private String isCopy;

    /**
     * 通信メモデータクラス .
     */
    private MemoData memoData;

    /**
     * 方法名 .
     */
    private String method;

    /**
     * NO1_承認状況 施設様 データ .
     */
    private DNo1AckInfoData no1AckInfoFacilityData;

    /**
     * NO1_承認状況 施設様 リスト .
     * No1AckInfoData
     */
    private List<DNo1AckInfoData> no1AckInfoFacilityList;

    /**
     * NO1_承認状況 ＪＲ東日本様 データ .
     */
    private DNo1AckInfoData no1AckInfoJrData;

    /**
     * 企画回答書 .
     */
    private DPlanAnsData planAnsData;

    /**
     * ユーザー区分 .
     */
    private String userDiv;

    /**
     * ユーザーID .
     */
    private String userId;

    /**
     * ユーザー名称 .
     */
    private String userNm;

    /**
     * コンストラクタ.
     */
    public BaseDNo2Data() {
        initData = new DNo1InitData();
        planAnsData = new DPlanAnsData();
        no1AckInfoJrData = new DNo1AckInfoData();
        no1AckInfoFacilityData = new DNo1AckInfoData();
        memoData = new MemoData();
    }

    /**
     * @return 支社コード
     */
    public String getBranchCd() {
        return getPlanAnsData().getBranchCd();
    }

    /**
     * @return 支社名称
     */
    public String getBranchName() {
        return getPlanAnsData().getBranchName();
    }

    /**
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return getPlanAnsData().getCareerNo();
    }

    /**
     * DNo1AdmitBeanクラスを取得します。
     * 
     * @return DNo1AdmitBeanクラス
     */
    public DNo1AdmitBean getdNo1AdmitBean() {
        return dNo1AdmitBean;
    }

    /**
     * 項目関連エラー数を取得します。
     * 
     * @return 項目関連エラー数
     */
    public int getErrCnt() {
        return errCnt;
    }

    /**
     * @return 施設コード
     */
    public String getFacilityCd() {
        return getPlanAnsData().getFacilityCd();
    }

    /**
     * @return 施設コード1
     */
    public String getFacilityCd1() {
        return getPlanAnsData().getFacilityCd().substring(0, 1);
    }

    /**
     * @return 施設コード2
     */
    public String getFacilityCd2() {
        return getPlanAnsData().getFacilityCd().substring(1, 2);
    }

    /**
     * @return 施設コード3
     */
    public String getFacilityCd3() {
        return getPlanAnsData().getFacilityCd().substring(2, 3);
    }

    /**
     * @return 施設コード4
     */
    public String getFacilityCd4() {
        return getPlanAnsData().getFacilityCd().substring(3, 4);
    }

    /**
     * @return 施設コード5
     */
    public String getFacilityCd5() {
        return getPlanAnsData().getFacilityCd().substring(4, 5);
    }

    /**
     * @return 施設コード6
     */
    public String getFacilityCd6() {
        return getPlanAnsData().getFacilityCd().substring(5, 6);
    }

    /**
     * @return 施設名称
     */
    public String getFacilityNm() {
        return getPlanAnsData().getFacilityNm();
    }

    /**
     * @return 施設名称カナ
     */
    public String getFacilityNmKana() {
        return getPlanAnsData().getFacilityNmKana();
    }

    /**
     * @return 商品名称
     */
    public String getGoodsNm() {
        return getPlanAnsData().getGoodsNm();
    }

    /**
     * 捜索用データ .を取得します。
     * 
     * @return 捜索用データ .
     */
    public DNo1InitData getInitData() {
        return initData;
    }

    /**
     * @return 種類
     */
    public String getKindFlg() {
        return getPlanAnsData().getKindFlg();
    }

    /**
     * @return 種類名称
     */
    public String getKindName() {
        return getPlanAnsData().getKindName();
    }

    /**
     * 素材種別を取得します。
     * 
     * @return 素材種別
     */
    public String getMaterialKind() {
        return getPlanAnsData().getMaterialKind();
    }

    /***
     * メモを取得します。
     * 
     * <pre></pre>
     * 
     * @return メモ
     */
    public String getMemo() {
        return getMemoData().getMemo();
    }

    /**
     * コピー画面を取得します。
     * @return コピー画面
     */
    public String getIsCopy() {
        return isCopy;
    }

    /**
     * コピー画面を設定します。
     * @param isCopy コピー画面
     */
    public void setIsCopy(String isCopy) {
        this.isCopy = isCopy;
    }

    /**
     * 通信メモデータクラス .を取得します。
     * 
     * @return 通信メモデータクラス .
     */
    public MemoData getMemoData() {
        return memoData;
    }

    /**
     * 方法名 .を取得します。
     * 
     * @return 方法名 .
     */
    public String getMethod() {
        return method;
    }

    /**
     * NO1_承認状況 施設様 データ .を取得します。
     * 
     * @return NO1_承認状況 施設様 データ .
     */
    public DNo1AckInfoData getNo1AckInfoFacilityData() {
        return no1AckInfoFacilityData;
    }

    /**
     * NO1_承認状況 施設様 リスト .を取得します。
     * 
     * @return NO1_承認状況 施設様 リスト .
     */
    public List<DNo1AckInfoData> getNo1AckInfoFacilityList() {
        return no1AckInfoFacilityList;
    }

    /**
     * NO1_承認状況 ＪＲ東日本様 データ .を取得します。
     * 
     * @return NO1_承認状況 ＪＲ東日本様 データ .
     */
    public DNo1AckInfoData getNo1AckInfoJrData() {
        return no1AckInfoJrData;
    }

    /**
     * @return NO2履歴番号
     */
    public Integer getNo2CareerNo() {
        return getPlanAnsData().getNo2CareerNo();
    }

    /**
     * @return No2状態
     */
    public Integer getNo2Status() {
        return getPlanAnsData().getNo2Status();
    }

    /**
     * @return No2状態名称
     */
    public String getNo2StatusName() {
        return getPlanAnsData().getNo2StatusName();
    }

    /**
     * 企画回答書 .を取得します。
     * 
     * @return 企画回答書 .
     */
    public DPlanAnsData getPlanAnsData() {
        return planAnsData;
    }

    /**
     * @return 企画回答連番
     */
    public Long getPlanAnsNo() {
        return getPlanAnsData().getPlanAnsNo();
    }

    /**
     * @return 企画通番（東日本）
     */
    public String getPlanNoEJp() {
        return getPlanAnsData().getPlanNoEJp();
    }

    /**
     * @return 企画通番（東日本）1
     */
    public String getPlanNoEJp1() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(0, 1);
    }

    /**
     * @return 企画通番（東日本）2
     */
    public String getPlanNoEJp2() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(1, 2);
    }

    /**
     * @return 企画通番（東日本）3
     */
    public String getPlanNoEJp3() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(2, 3);
    }

    /**
     * @return 企画通番（東日本）4
     */
    public String getPlanNoEJp4() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(3, 4);
    }

    /**
     * @return 企画通番（東日本）5
     */
    public String getPlanNoEJp5() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(4, 5);
    }

    /**
     * @return 企画通番（東日本）6
     */
    public String getPlanNoEJp6() {
        if (getPlanAnsData().getPlanNoEJp() == null) {
            return null;
        }
        return getPlanAnsData().getPlanNoEJp().substring(5, 6);
    }

    /**
     * @return シーズン区分
     */
    public String getSeasonDiv() {
        return getPlanAnsData().getSeasonDiv();
    }

    /**
     * @return シーズン名称
     */
    public String getSeasonDivName() {
        return getPlanAnsData().getSeasonDivName();
    }

    /**
     * @return 送付区分
     */
    public String getSendDiv() {
        if (getPlanAnsData().getSendDiv() == null) {
            return null;
        } else {
            return getPlanAnsData().getSendDiv().toString();
        }
    }

    /**
     * @return 状態
     */
    public Integer getStatus() {
        return getPlanAnsData().getStatus();
    }

    /**
     * ユーザー区分 .を取得します。
     * 
     * @return ユーザー区分 .
     */
    public String getUserDiv() {
        return userDiv;
    }

    /**
     * ユーザーID .を取得します。
     * 
     * @return ユーザーID .
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザー名称 .を取得します。
     * 
     * @return ユーザー名称 .
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * @return 年度
     */
    public String getYear() {
        return getPlanAnsData().getYear();
    }

    /**
     * @param branchCd
     *            支社コード
     *            The branchCd to set.
     */
    public void setBranchCd(String branchCd) {
        getPlanAnsData().setBranchCd(branchCd);
    }

    /**
     * @param careerNo
     *            履歴番号
     *            The careerNo to set.
     */
    public void setCareerNo(Integer careerNo) {
        getPlanAnsData().setCareerNo(careerNo);
    }

    /**
     * DNo1AdmitBeanクラスを設定します。
     * 
     * @param dNo1AdmitBean
     *            DNo1AdmitBeanクラス
     */
    public void setdNo1AdmitBean(DNo1AdmitBean dNo1AdmitBean) {
        this.dNo1AdmitBean = dNo1AdmitBean;
    }

    /**
     * 項目関連エラー数を設定します。
     * 
     * @param errCnt
     *            項目関連エラー数
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
     *            施設名称カナ
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
     * 捜索用データ .を設定します。
     * 
     * @param initData
     *            捜索用データ .
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
     * 素材種別を設定します。
     * 
     * @param materialKind
     *            素材種別
     */
    public void setMaterialKind(String materialKind) {
        getPlanAnsData().setMaterialKind(materialKind);
    }

    /***
     * メモを設定します。
     * 
     * <pre></pre>
     * 
     * @param memo
     *            メモ
     */
    public void setMemo(String memo) {
        getMemoData().setMemo(memo);
    }

    /**
     * 通信メモデータクラス .を設定します。
     * 
     * @param memoData
     *            通信メモデータクラス .
     */
    public void setMemoData(MemoData memoData) {
        this.memoData = memoData;
    }

    /**
     * 方法名 .を設定します。
     * 
     * @param method
     *            方法名 .
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @param no1AckInfoFacilityData
     *            NO1_承認状況 施設様 データ
     */
    public void setNo1AckInfoFacilityData(DNo1AckInfoData no1AckInfoFacilityData) {
        this.no1AckInfoFacilityData = no1AckInfoFacilityData;
    }

    /**
     * @param no1AckInfoFacilityList
     *            NO1_承認状況 施設様
     */
    public void setNo1AckInfoFacilityList(
            final List<DNo1AckInfoData> no1AckInfoFacilityList) {
        this.no1AckInfoFacilityList = no1AckInfoFacilityList;
    }

    /**
     * @param no1AckInfoJrData
     *            NO1_承認状況 ＪＲ東日本様
     */
    public void setNo1AckInfoJrData(final DNo1AckInfoData no1AckInfoJrData) {
        this.no1AckInfoJrData = no1AckInfoJrData;
    }

    /**
     * @param no2CareerNo
     *            NO2履歴番号
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
     * 企画回答書 .を設定します。
     * 
     * @param planAnsData
     *            企画回答書 .
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
     *            送付区分
     */
    public void setSendDiv(String sendDiv) {
        getPlanAnsData().setSendDiv(new Integer(sendDiv));
    }

    /**
     * @param status
     *            状態
     */
    public void setStatus(Integer status) {
        getPlanAnsData().setStatus(status);
    }

    /**
     * ユーザー区分 .を設定します。
     * 
     * @param userDiv
     *            ユーザー区分 .
     */
    public void setUserDiv(String userDiv) {
        this.userDiv = userDiv;
    }

    /**
     * ユーザーID .を設定します。
     * 
     * @param userId
     *            ユーザーID .
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ユーザー名称 .を設定します。
     * 
     * @param userNm
     *            ユーザー名称 .
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
