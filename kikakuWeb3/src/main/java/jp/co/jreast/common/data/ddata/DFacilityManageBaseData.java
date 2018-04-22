package jp.co.jreast.common.data.ddata;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.interfaces.DFacilityManageData;
import jp.co.jreast.common.interfaces.DFacilityManageSearchData;
import jp.co.jreast.common.support.LabelValueBean;
import jp.co.jreast.common.util.DCollectionUtil;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * 施設付帯情報画面基本データ
 *
 * <pre>
 *   機能概要 ： 施設付帯情報画面の基本項目を保持するBeanです。
 *   特記事項 ： D_FACILITY_MANAGE エンティティの基底クラスではありません。
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class DFacilityManageBaseData implements DFacilityManageData {

	/** 支社コード */
	private String branchCd;

	/** 履歴番号 */
	private Integer careerNo;

	/** 送信コメント */
	private String cmtTmpl;

	/** 相違項目リスト */
	private final List<String> differentProperties;

	/** 施設側承認情報リスト */
	private List<FacilityAckStatusData> facilityAckStatusList;

	/** 施設コード */
	private String facilityCd;

	/** 施設素材種別 */
	private String facilityMaterialKind;

	/** 施設名称 */
	private String facilityNm;

	/** 施設パターン */
	private String facilityPattern;

	/** 施設パターン名称 */
	private String facilityPatternNm;

	/** 送付先（回答書/付帯情報） */
	private String facilitySendAddr;

	/** 施設付帯種類 */
	private String facilitySorts;

	/** 施設タイプ */
	private String facilityType;

	/** 状態 （NO3状態 または NO5状態） */
	private Integer fpStatus;

	/** 商品名称 */
	private String goodsNm;

	/** JR側承認情報リスト */
	private List<FacilityAckStatusData> jrAckStatusList;

	/** 回答書種別 */
	private String kindFlg;

	/** 素材種別 */
	private String materialKind;

	/** 状態 （企画回答書） */
	private Integer paStatus;

	/** 企画回答連番 */
	private Long planAnsNo;

	/** 企画通番（東日本） */
	private String planNoEJp;

	/** 責任者 */
	private String responsibler;

	/** 初期処理検索条件データ */
	private DFacilityManageSearchData searchData;

	/** シーズン区分 */
	private String seasonDiv;

	/** 送信コメントテンプレート（セレクトタグ表示用ダミー） */
	private String sendCmtTmpl;

	/** 送信コメントテンプレートリスト */
	private List<LabelValueBean> sendCmtTmplList;

	/** 送付区分 */
	private Integer sendDiv;

	/** 送付連絡先ＦＡＸ */
	private String senderFax;

	/** 送付担当者名 */
	private String senderNm;

	/** 送付連絡先電話 */
	private String senderTel;

	/** メッセージ（Mail/Fax）送信失敗（送信失敗した場合true） */
	private boolean sendFailuer;

	/** 送信状態 */
	private String sendStatus;

	/** 担当者 */
	private String tantousya;

	/** 更新年月日 */
	private String upYmd;

	/** 入力検証成否（エラーが無い場合true） */
	private boolean valid;

	/** 年度 */
	private String year;

	/**
	 * コンストラクタ
	 */
	public DFacilityManageBaseData() {
		super();
		this.facilityAckStatusList = new ArrayList<>();
		this.jrAckStatusList = new ArrayList<>();
		this.sendCmtTmplList = new ArrayList<LabelValueBean>();
		this.differentProperties = new ArrayList<>();
		this.valid = true;
		this.sendFailuer = false;
	}

	@Override
	public String getBranchCd() {
		return branchCd;
	}

	@Override
	public String getBranchNm() {
		return JreConstants
				.getListLabel(JreConstants.DIV_BRANCH, getBranchCd());
	}

	@Override
	public Integer getCareerNo() {
		return careerNo;
	}

	@Override
	public String getCmtTmpl() {
		return cmtTmpl;
	}

	@Override
	public List<String> getDifferentProperties() {
		return differentProperties;
	}

	@Override
	public List<FacilityAckStatusData> getFacilityAckStatusList() {
		return facilityAckStatusList;
	}

	@Override
	public String getFacilityCd() {
		return facilityCd;
	}

	@Override
	public String getFacilityCd1() {
		return DKikakuWebUtil.charAt(getFacilityCd(), 1);
	}

	@Override
	public String getFacilityCd2() {
		return DKikakuWebUtil.charAt(getFacilityCd(), 2);
	}

	@Override
	public String getFacilityCd3() {
		return DKikakuWebUtil.charAt(getFacilityCd(), 3);
	}

	@Override
	public String getFacilityCd4() {
		return DKikakuWebUtil.charAt(getFacilityCd(), 4);
	}

	@Override
	public String getFacilityCd5() {
		return DKikakuWebUtil.charAt(getFacilityCd(), 5);
	}

	@Override
	public String getFacilityCd6() {
		return DKikakuWebUtil.charAt(getFacilityCd(), 6);
	}

	@Override
	public String getFacilityMaterialKind() {
		return facilityMaterialKind;
	}

	@Override
	public String getFacilityNm() {
		return facilityNm;
	}

	@Override
	public String getFacilityPattern() {
		return facilityPattern;
	}

	@Override
	public String getFacilityPattern1() {
		return DKikakuWebUtil.charAt(getFacilityPattern(), 1);
	}

	@Override
	public String getFacilityPattern2() {
		return DKikakuWebUtil.charAt(getFacilityPattern(), 2);
	}

	@Override
	public String getFacilityPattern3() {
		return DKikakuWebUtil.charAt(getFacilityPattern(), 3);
	}

	@Override
	public String getFacilityPattern4() {
		return DKikakuWebUtil.charAt(getFacilityPattern(), 4);
	}

	@Override
	public String getFacilityPattern5() {
		return DKikakuWebUtil.charAt(getFacilityPattern(), 5);
	}

	@Override
	public String getFacilityPattern6() {
		return DKikakuWebUtil.charAt(getFacilityPattern(), 6);
	}

	@Override
	public String getFacilityPatternNm() {
		return facilityPatternNm;
	}

	@Override
	public String getFacilitySendAddr() {
		return facilitySendAddr;
	}

	@Override
	public String getFacilitySorts() {
		return facilitySorts;
	}

	@Override
	public String getFacilityType() {
		return facilityType;
	}

	@Override
	public Integer getFpStatus() {
		return fpStatus;
	}

	@Override
	public String getFpStatusNm() {

		if (DJreConstants.FPSTATUS_SHINKI == getFpStatus()) {
			return JreConstants.getMapValue(null, null);
		}

		String status = String.valueOf(getFpStatus());

		return JreConstants.getListLabel(DJreConstants.DIV_FP_STATUS, status);
	}

	@Override
	public String getGoodsNm() {
		return goodsNm;
	}

	@Override
	public List<FacilityAckStatusData> getJrAckStatusList() {
		return jrAckStatusList;
	}

	@Override
	public String getKindFlg() {
		return kindFlg;
	}

	@Override
	public String getKindNm() {
		return JreConstants.getListLabel(JreConstants.DIV_KIND, getKindFlg());
	}

	@Override
	public FacilityAckStatusData getLatestFacilityAckStatus() {
		// 承認日の昇順でソートするため最後の要素が最新
		return DCollectionUtil.getLast(getFacilityAckStatusList());
	}

	@Override
	public FacilityAckStatusData getLatestJrAckStatus() {
		// 承認日の昇順でソートするため最後の要素が最新
		return DCollectionUtil.getLast(getJrAckStatusList());
	}

	@Override
	public String getMaterialKind() {
		return materialKind;
	}

	@Override
	public Integer getPaStatus() {
		return paStatus;
	}

	@Override
	public String getPaStatusNm() {
		String status = StringUtils.leftPad(String.valueOf(getPaStatus()), 2,
				JreConstants.FACILITY1_FLAG);

		return JreConstants.getListLabel(JreConstants.DIV_STATUS, status);
	}

	@Override
	public Long getPlanAnsNo() {
		return planAnsNo;
	}

	@Override
	public String getPlanNoEJp() {
		return planNoEJp;
	}

	@Override
	public String getPlanNoEJp1() {
		return DKikakuWebUtil.charAt(getPlanNoEJp(), 1);
	}

	@Override
	public String getPlanNoEJp2() {
		return DKikakuWebUtil.charAt(getPlanNoEJp(), 2);
	}

	@Override
	public String getPlanNoEJp3() {
		return DKikakuWebUtil.charAt(getPlanNoEJp(), 3);
	}

	@Override
	public String getPlanNoEJp4() {
		return DKikakuWebUtil.charAt(getPlanNoEJp(), 4);
	}

	@Override
	public String getPlanNoEJp5() {
		return DKikakuWebUtil.charAt(getPlanNoEJp(), 5);
	}

	@Override
	public String getPlanNoEJp6() {
		return DKikakuWebUtil.charAt(getPlanNoEJp(), 6);
	}

	@Override
	public String getResponsibler() {
		return responsibler;
	}

	@Override
	public DFacilityManageSearchData getSearchData() {
		return searchData;
	}

	@Override
	public String getSeasonDiv() {
		return seasonDiv;
	}

	@Override
	public String getSeasonNm() {
		return JreConstants.getListLabel(JreConstants.DIV_SEASON,
				getSeasonDiv());
	}

	@Override
	public String getSendCmtTmpl() {
		return sendCmtTmpl;
	}

	@Override
	public List<LabelValueBean> getSendCmtTmplList() {
		return sendCmtTmplList;
	}

	@Override
	public Integer getSendDiv() {
		return sendDiv;
	}

	@Override
	public String getSenderFax() {
		return senderFax;
	}

	@Override
	public String getSenderNm() {
		return senderNm;
	}

	@Override
	public String getSenderTel() {
		return senderTel;
	}

	@Override
	public String getSendStatus() {
		return sendStatus;
	}

	/**
	 * 送信状態を設定します。
	 * @param sendStatus 送信状態
	 */
	@Override
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}

	@Override
	public String getTantousya() {
		return tantousya;
	}

	@Override
	public String getUpYmd() {
		return upYmd;
	}

	@Override
	public String getUpYmdDisp() {
		return DKikakuWebUtil.formatDate(upYmd);
	}

	@Override
	public UserData getUserData() {
		return getSearchData().getUserData();
	}

	@Override
	public String getYear() {
		return year;
	}

	@Override
	public boolean isSendFailuer() {
		return sendFailuer;
	}

	@Override
	public boolean isValid() {
		return valid;
	}

	@Override
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}

	@Override
	public void setCareerNo(Integer careerNo) {
		this.careerNo = careerNo;

	}

	@Override
	public void setCmtTmpl(String cmtTmpl) {
		this.cmtTmpl = cmtTmpl;
	}

	@Override
	public void setFacilityAckStatusList(
			List<FacilityAckStatusData> facilityAckStatusList) {
		this.facilityAckStatusList = facilityAckStatusList;
	}

	@Override
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	@Override
	public void setFacilityMaterialKind(String facilityMaterialKind) {
		this.facilityMaterialKind = facilityMaterialKind;
	}

	@Override
	public void setFacilityNm(String facilityNm) {
		this.facilityNm = facilityNm;
	}

	@Override
	public void setFacilityPattern(String facilityPattern) {
		this.facilityPattern = facilityPattern;
	}

	@Override
	public void setFacilityPatternNm(String facilityPatternNm) {
		this.facilityPatternNm = facilityPatternNm;
	}

	@Override
	public void setFacilitySendAddr(String facilitySendAddr) {
		this.facilitySendAddr = facilitySendAddr;
	}

	@Override
	public void setFacilitySorts(String facilitySorts) {
		this.facilitySorts = facilitySorts;
	}

	@Override
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

	@Override
	public void setFpStatus(Integer fpStatus) {
		this.fpStatus = fpStatus;
	}

	@Override
	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}

	@Override
	public void setJrAckStatusList(List<FacilityAckStatusData> jrAckStatusList) {
		this.jrAckStatusList = jrAckStatusList;
	}

	@Override
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}

	@Override
	public void setMaterialKind(String materialKind) {
		this.materialKind = materialKind;
	}

	@Override
	public void setPaStatus(Integer paStatus) {
		this.paStatus = paStatus;
	}

	@Override
	public void setPlanAnsNo(Long planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

	@Override
	public void setPlanNoEJp(String planNoEJp) {
		this.planNoEJp = planNoEJp;
	}

	@Override
	public void setResponsibler(String responsibler) {
		this.responsibler = responsibler;
	}

	@Override
	public void setSearchData(DFacilityManageSearchData searchData) {
		this.searchData = searchData;
	}

	@Override
	public void setSeasonDiv(String seasonDiv) {
		this.seasonDiv = seasonDiv;
	}

	@Override
	public void setSendCmtTmpl(String sendCmtTmpl) {
		this.sendCmtTmpl = sendCmtTmpl;
	}

	@Override
	public void setSendCmtTmplList(List<LabelValueBean> sendCmtTmplList) {
		this.sendCmtTmplList = sendCmtTmplList;
	}

	@Override
	public void setSendDiv(Integer sendDiv) {
		this.sendDiv = sendDiv;
	}

	@Override
	public void setSenderFax(String senderFax) {
		this.senderFax = senderFax;
	}

	@Override
	public void setSenderNm(String senderNm) {
		this.senderNm = senderNm;
	}

	@Override
	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}

	@Override
	public void setSendFailuer(boolean sendFailuer) {
		this.sendFailuer = sendFailuer;
	}

	@Override
	public void setTantousya(String tantousya) {
		this.tantousya = tantousya;
	}

	@Override
	public void setUpYmd(String upYmd) {
		this.upYmd = upYmd;
	}

	@Override
	public void setUserData(UserData userData) {
		this.getSearchData().setUserData(userData);
	}

	@Override
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public void setYear(String year) {
		this.year = year;
	}

}
