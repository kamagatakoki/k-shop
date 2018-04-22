package jp.co.jreast.ur00400.data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.DPlanAnsData;
import jp.co.jreast.common.data.FacilityData;
import jp.co.jreast.common.data.PlanAnsData;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * 画面検索するとき使うデータクラス。.
 * 
 * <pre>
 *  機能概要　：画面検索するとき使うデータクラス .
 *  特記事項　：なし
 * </pre>
 * 
 * @author 忻兆君
 */
public class UR00400SearchInData implements InData {

    /**
     * 施設コード１の４枚 .
     */
    private String facilityCd1L;

    /**
     * 施設コード１の2枚 .
     */
    private String facilityCd1R;

    /**
     * 施設コード2の４枚 .
     */
    private String facilityCd2L;

    /**
     * 施設コード2の2枚 .
     */
    private String facilityCd2R;

    /**
     * 施設情報データ .
     */
    private FacilityData facilityData;

    /**
     * 送信コメントデータ .
     */
    private List list;

    /**
     * 企画回答書データ .
     */
    private PlanAnsData planAnsData;

    /**
     * 送信コメントテンプレートデータ .
     */
    private SendCmtTmplData sendCmtTmplData;

    /**
     * 送信時間１ .
     */
    private String sendYmd1;

    /**
     * 送信時間２ .
     */
    private String sendYmd2;

    /**
     * コンストラクター
     * 　データ初期化する .
     */
    public UR00400SearchInData() {
        facilityData = new FacilityData();
        planAnsData = new DPlanAnsData();
        sendCmtTmplData = new SendCmtTmplData();
    }

    /**
     * @return String 支社コード
     */
    public String getBranchCd() {

        return planAnsData.getBranchCd();
    }

    /**
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return planAnsData.getCareerNo();
    }

    /**
     * @return 施設コード１
     */
    public String getFacilityCd1() {

        return KikakuWebUtil.appendFacilityCode(facilityCd1L, facilityCd1R,
                JreConstants.FACILITY1_FLAG);
    }

    /**
     * @return 施設コード1の4枚
     */
    public String getFacilityCd1L() {
        return facilityCd1L;
    }

    /**
     * @return 施設コード1の2枚
     */
    public String getFacilityCd1R() {
        return facilityCd1R;
    }

    /**
     * @return 施設コード2
     */
    public String getFacilityCd2() {
        StringBuffer facilityCd1 = new StringBuffer(this.getFacilityCd1L()
                .trim());
        facilityCd1.append(this.getFacilityCd1R());
        if (facilityCd1.toString().length() < 6
                && facilityCd1.toString().length() > 0
                && this.getFacilityCd2L().trim().equals("")
                && this.getFacilityCd2R().trim().equals("")) {
            return KikakuWebUtil.appendFacilityCode(getFacilityCd1L(),
                    this.getFacilityCd1R(), JreConstants.FACILITY2_FLAG);
        } else {

            return KikakuWebUtil.appendFacilityCode(facilityCd2L, facilityCd2R,
                    JreConstants.FACILITY2_FLAG);
        }

    }

    /**
     * @return 施設コード2の4枚
     */
    public String getFacilityCd2L() {
        return facilityCd2L;
    }

    /**
     * @return 施設コード2の2枚
     */
    public String getFacilityCd2R() {
        return facilityCd2R;
    }

    /**
     * @return 商品名称
     */
    public String getGoodsNm() {
        return planAnsData.getGoodsNm();
    }

    /**
     * @return 種別
     */
    public String getKind() {

        return planAnsData.getKindFlg();
    }

    /**
     * @return Returns the list.
     */
    public List getList() {
        return list;
    }

    /**
     * 素材種別を取得します。
     * 
     * @return 素材種別
     */
    public String getMaterialKind() {
        return planAnsData.getMaterialKind();
    }

    /**
     * @return 素材種別名称
     * @see jp.co.jreast.common.data.PlanAnsBaseData#getMaterialKindName()
     */
    public String getMaterialKindName() {
        return planAnsData.getMaterialKindName();
    }

    /**
     * @return no2施設タイプ
     */
    public String getNo2Type() {
        return planAnsData.getNo2Type();
    }

    /**
     * @return no3施設パターン
     */
    public String getNo3Pattern() {
        return planAnsData.getNo3Pattern();
    }

    /**
     * @return no5施設パターン
     */
    public String getNo5Pattern() {
        return planAnsData.getNo5Pattern();
    }

    /**
     * @return 企画回答連番
     */
    public Long getPlanAnsNo() {
        return planAnsData.getPlanAnsNo();
    }

    /**
     * @return 都道府県コード
     */
    public String getPrefecturesCd() {
        return facilityData.getPrefecturesCd();
    }

    /**
     * @return シーズン区分
     */
    public String getSeasonDiv() {
        return planAnsData.getSeasonDiv();
    }

    /**
     * @return Returns the sendCmtTmplData.
     */
    public SendCmtTmplData getSendCmtTmplData() {
        return sendCmtTmplData;
    }

    /**
     * @return 送付区分
     */
    public Integer getSendDiv() {
        return planAnsData.getSendDiv();
    }

    /**
     * @return 送信日付１
     */
    public String getSendYmd1() {
        return KikakuWebUtil.getDisplayDate(this.sendYmd1,
                getSendYmd1Validate());
    }

    /**
     * @return 送信日付１
     */
    public String getSendYmd1Validate() {

        return KikakuWebUtil.replaceSpecialSymbolInDate(sendYmd1);
    }

    /**
     * @return 送信日付２
     */
    public String getSendYmd2() {
        return KikakuWebUtil.getDisplayDate(this.sendYmd2,
                getSendYmd2Validate());
    }

    /**
     * @return 送信日付2
     */
    public String getSendYmd2Validate() {

        return KikakuWebUtil.replaceSpecialSymbolInDate(sendYmd2);
    }

    /**
     * @return 状態
     */
    public String getStatus() {
        return planAnsData.getStatus() == null ? null : StringUtil.lpad(
                planAnsData.getStatus().toString(), 2, '0');
    }

    /**
     * @return 年度
     */
    public String getYear() {
        return planAnsData.getYear();
    }

    /**
     * @param branchCd
     *            支社コード
     */
    public void setBranchCd(String branchCd) {

        planAnsData.setBranchCd(branchCd);
    }

    /**
     * @param careerNo
     *            履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        planAnsData.setCareerNo(careerNo);
    }

    /**
     * @param facilityCd1L
     *            施設コード2の4枚
     */
    public void setFacilityCd1L(String facilityCd1L) {
        this.facilityCd1L = facilityCd1L;
    }

    /**
     * @param facilityCd1R
     *            施設コード1の2枚
     */
    public void setFacilityCd1R(String facilityCd1R) {
        this.facilityCd1R = facilityCd1R;
    }

    /**
     * @param facilityCd2L
     *            施設コード2の4枚
     */
    public void setFacilityCd2L(String facilityCd2L) {
        this.facilityCd2L = facilityCd2L;
    }

    /**
     * @param facilityCd2R
     *            施設コード2の2枚
     */
    public void setFacilityCd2R(String facilityCd2R) {
        this.facilityCd2R = facilityCd2R;
    }

    /**
     * @param facilityData
     *            施設情報
     */
    public void setFacilityData(FacilityData facilityData) {
        this.facilityData = facilityData;
    }

    /**
     * @param goodsNm
     *            商品名称
     */
    public void setGoodsNm(String goodsNm) {
        planAnsData.setGoodsNm(goodsNm);
    }

    /**
     * @param kind
     *            種別
     */
    public void setKind(String kind) {

        planAnsData.setKindFlg(kind);
    }

    /**
     * @param list
     *            The list to set.
     */
    public void setList(List list) {
        this.list = list;
    }

    /**
     * 素材種別を設定します。
     * 
     * @param materialKind
     *            素材種別
     */
    public void setMaterialKind(String materialKind) {
        planAnsData.setMaterialKind(materialKind);
    }

    /**
     * @param no2Type
     *            no2施設タイプ
     */
    public void setNo2Type(String no2Type) {
        planAnsData.setNo2Type(no2Type);
    }

    /**
     * @param no3Pattern
     *            no3パターン
     */
    public void setNo3Pattern(String no3Pattern) {
        planAnsData.setNo3Pattern(no3Pattern);
    }

    /**
     * @param no5Pattern
     *            no5パターン
     */
    public void setNo5Pattern(String no5Pattern) {
        planAnsData.setNo5Pattern(no5Pattern);
    }

    /**
     * @param planAnsData
     *            企画回答書
     */
    public void setPlanAnsData(PlanAnsData planAnsData) {
        this.planAnsData = planAnsData;
    }

    /**
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(Long planAnsNo) {
        planAnsData.setPlanAnsNo(planAnsNo);
    }

    /**
     * @param prefecturesCd
     *            都道府県コード
     */
    public void setPrefecturesCd(String prefecturesCd) {
        facilityData.setPrefecturesCd(prefecturesCd);
    }

    /**
     * @param seasonDiv
     *            シーズン区分
     */
    public void setSeasonDiv(String seasonDiv) {
        planAnsData.setSeasonDiv(seasonDiv);
    }

    /**
     * @param sendCmtTmplData
     *            The sendCmtTmplData to set.
     */
    public void setSendCmtTmplData(SendCmtTmplData sendCmtTmplData) {
        this.sendCmtTmplData = sendCmtTmplData;
    }

    /**
     * @param sendDiv
     *            送付区分
     */
    public void setSendDiv(Integer sendDiv) {
        planAnsData.setSendDiv(sendDiv);
    }

    /**
     * @param sendYmd1
     *            送信日付１
     */
    public void setSendYmd1(String sendYmd1) {
        this.sendYmd1 = sendYmd1;
    }

    /**
     * @param sendYmd2
     *            送信日付２
     */
    public void setSendYmd2(String sendYmd2) {
        this.sendYmd2 = sendYmd2;
    }

    /**
     * @param status
     *            状態
     */
    public void setStatus(String status) {
        planAnsData.setStatus(new Integer(status));
    }

    /**
     * @param year
     *            年度
     */
    public void setYear(String year) {
        planAnsData.setYear(year);
    }
}
