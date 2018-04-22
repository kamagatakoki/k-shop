package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * 料金情報データクラス。.
 * 機能概要    ：  料金情報データを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public class DNo1ChargeInfoData extends PlanAnsBaseData {

    /**
     * 到着時間
     */
    private String arrivalTime;

    /**
     * 到着時間（時）
     */
    private String arrivalTimeH;

    /**
     * 到着時間（分）
     */
    private String arrivalTimeM;

    /**
     * 枝番.
     */
    private String branchNo;

    /**
     * レンタカークラス
     */
    private String carClass;

    /**
     * 料金シーケンス.
     */
    private Integer chargeSequence;

    /**
     * 船車内容区分.
     */
    private String contentDiv;

    /**
     * 内容説明上段（カナ）.
     */
    private String contentExplain1Kana;

    /**
     * 内容説明上段（漢字）.
     */
    private String contentExplain1Kanji;

    /**
     * 内容説明下段（カナ）.
     */
    private String contentExplain2Kana;

    /**
     * 内容説明下段（漢字）.
     */
    private String contentExplain2Kanji;

    /**
     * 観光コース名称(カナ） .
     */
    private String courseNmKana;

    /**
     * 観光コース名称（漢字）.
     */
    private String courseNmKanji;

    /**
     * 出発時間
     */
    private String departureTime;

    /**
     * 出発時間（時）
     */
    private String departureTimeH;

    /**
     * 出発時間（分）
     */
    private String departureTimeM;

    /**
     * 名称の活性・非活性
     */
    private Boolean disabledNm;

    /**
     * 采番フラグ .
     */
    private boolean isSaiban;

    /**
     * 企画通番.
     */
    private String planNo;

    /**
     * 在庫番号 .
     */
    private String stockNo;

    /**
     * バウチャー券案内文（漢字）
     */
    private String voucherIntroKanji;

    /**
     * 到着時間を取得します。
     * 
     * @return 到着時間
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 到着時間（時）を取得します。
     * 
     * @return 到着時間（時）
     */
    public String getArrivalTimeH() {
        return arrivalTimeH;
    }

    /**
     * 到着時間（分）を取得します。
     * 
     * @return 到着時間（分）
     */
    public String getArrivalTimeM() {
        return arrivalTimeM;
    }

    /**
     * @return Returns the branchNo.
     */
    public String getBranchNo() {
        return branchNo;
    }

    /**
     * レンタカークラスを取得します。
     * 
     * @return レンタカークラス
     */
    public String getCarClass() {
        return carClass;
    }

    /**
     * . 指定位置に文字を取得する。
     * 
     * @param pos
     *            位置
     * @param str
     *            入力文字列
     * @return 指定する文字
     */
    private String getCharAt(String str, int pos) {

        if (StringUtil.isEmpty(str)) {
            return "";
        }
        return "" + str.charAt(pos - 1);
    }

    /**
     * @return Returns the chargeSequence.
     */
    public Integer getChargeSequence() {
        return chargeSequence;
    }

    /**
     * @param i
     *            .
     * @return 企画通番（東日本）文字
     */
    public String getCharOfPlanNo(int i) {
        return getCharAt(planNo, i);
    }

    /**
     * @return Returns the contentDiv.
     */
    public String getContentDiv() {
        return contentDiv;
    }

    /**
     * @return Returns the contentExplain1Kana.
     */
    public String getContentExplain1Kana() {
        if (contentExplain1Kana == null) {
            return "";
        }
        return contentExplain1Kana;
    }

    /**
     * @return Returns the contentExplain1Kanji.
     */
    public String getContentExplain1Kanji() {
        if (contentExplain1Kanji == null) {
            return "";
        }
        return contentExplain1Kanji;
    }

    /**
     * @return Returns the contentExplain2Kana.
     */
    public String getContentExplain2Kana() {
        if (contentExplain2Kana == null) {
            return "";
        }
        return contentExplain2Kana;
    }

    /**
     * @return Returns the contentExplain2Kanji.
     */
    public String getContentExplain2Kanji() {
        if (contentExplain2Kanji == null) {
            return "";
        }
        return contentExplain2Kanji;
    }

    /**
     * @return Returns the courseNmKana.
     */
    public String getCourseNmKana() {
        if (courseNmKana == null) {
            return "";
        }
        return courseNmKana;
    }

    /**
     * @return Returns the courseNmKanji.
     */
    public String getCourseNmKanji() {
        if (courseNmKanji == null) {
            return "";
        }
        return courseNmKanji;
    }

    /**
     * 出発時間を取得します。
     * 
     * @return 出発時間
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * 出発時間（時）を取得します。
     * 
     * @return 出発時間（時）
     */
    public String getDepartureTimeH() {
        return departureTimeH;
    }

    /**
     * 出発時間（分）を取得します。
     * 
     * @return 出発時間（分）
     */
    public String getDepartureTimeM() {
        return departureTimeM;
    }

    /**
     * 名称の活性・非活性を取得します。
     * 
     * @return 名称の活性・非活性
     */
    public Boolean getDisabledNm() {
        return disabledNm;
    }

    /**
     * @return Returns the isSaiban.
     */
    public boolean getIsSaiban() {
        return isSaiban;
    }

    /**
     * @return Returns the planNo.
     */
    public String getPlanNo() {
        return planNo;
    }

    /**
     * @return Returns the stockNo.
     */
    public String getStockNo() {
        return stockNo;
    }

    /**
     * バウチャー券案内文（漢字）を取得します。
     * 
     * @return バウチャー券案内文（漢字）
     */
    public String getVoucherIntroKanji() {
        return voucherIntroKanji;
    }

    /**
     * 到着時間を設定します。
     * 
     * @param arrivalTime
     *            到着時間
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 到着時間（時）を設定します。
     * 
     * @param arrivalTimeH
     *            到着時間（時）
     */
    public void setArrivalTimeH(String arrivalTimeH) {
        this.arrivalTimeH = arrivalTimeH;
    }

    /**
     * 到着時間（分）を設定します。
     * 
     * @param arrivalTimeM
     *            到着時間（分）
     */
    public void setArrivalTimeM(String arrivalTimeM) {
        this.arrivalTimeM = arrivalTimeM;
    }

    /**
     * @param branchNo
     *            The branchNo to set.
     */
    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    /**
     * レンタカークラスを設定します。
     * 
     * @param carClass
     *            レンタカークラス
     */
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    /**
     * @param chargeSequence
     *            The chargeSequence to set.
     */
    public void setChargeSequence(Integer chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    /**
     * @param contentDiv
     *            The contentDiv to set.
     */
    public void setContentDiv(String contentDiv) {
        this.contentDiv = contentDiv;
    }

    /**
     * @param contentExplain1Kana
     *            The contentExplain1Kana to set.
     */
    public void setContentExplain1Kana(String contentExplain1Kana) {
        this.contentExplain1Kana = contentExplain1Kana;
    }

    /**
     * @param contentExplain1Kanji
     *            The contentExplain1Kanji to set.
     */
    public void setContentExplain1Kanji(String contentExplain1Kanji) {
        this.contentExplain1Kanji = contentExplain1Kanji;
    }

    /**
     * @param contentExplain2Kana
     *            The contentExplain2Kana to set.
     */
    public void setContentExplain2Kana(String contentExplain2Kana) {

        this.contentExplain2Kana = contentExplain2Kana;
    }

    /**
     * @param contentExplain2Kanji
     *            The contentExplain2Kanji to set.
     */
    public void setContentExplain2Kanji(String contentExplain2Kanji) {
        this.contentExplain2Kanji = contentExplain2Kanji;
    }

    /**
     * @param courseNmKana
     *            The courseNmKana to set.
     */
    public void setCourseNmKana(String courseNmKana) {
        this.courseNmKana = courseNmKana;
    }

    /**
     * @param courseNmKanji
     *            The courseNmKanji to set.
     */
    public void setCourseNmKanji(String courseNmKanji) {
        this.courseNmKanji = courseNmKanji;
    }

    /**
     * 出発時間を設定します。
     * 
     * @param departureTime
     *            出発時間
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 出発時間（時）を設定します。
     * 
     * @param departureTimeH
     *            出発時間（時）
     */
    public void setDepartureTimeH(String departureTimeH) {
        this.departureTimeH = departureTimeH;
    }

    /**
     * 出発時間（分）を設定します。
     * 
     * @param departureTimeM
     *            出発時間（分）
     */
    public void setDepartureTimeM(String departureTimeM) {
        this.departureTimeM = departureTimeM;
    }

    /**
     * 名称の活性・非活性を設定します。
     * 
     * @param disabledNm
     *            名称の活性・非活性
     */
    public void setDisabledNm(Boolean disabledNm) {
        this.disabledNm = disabledNm;
    }

    /**
     * @param isSaiban
     *            The isSaiban to set.
     */
    public void setIsSaiban(boolean isSaiban) {
        this.isSaiban = isSaiban;
    }

    /**
     * @param planNo
     *            The planNo to set.
     */
    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    /**
     * @param stockNo
     *            The stockNo to set.
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    /**
     * バウチャー券案内文（漢字）を設定します。
     * 
     * @param voucherIntroKanji
     *            バウチャー券案内文（漢字）
     */
    public void setVoucherIntroKanji(String voucherIntroKanji) {
        this.voucherIntroKanji = voucherIntroKanji;
    }

}
