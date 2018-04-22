package jp.co.jreast.common.data.ddata;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.co.jreast.common.DJreConstants;

/**
 * <pre>
 * [DP/RM]施設付帯情報_承認状況クラス
 * 機能概要 ：[DP/RM]施設付帯情報_承認状況を格納する
 * 特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class FacilityAckStatusData {

    /**
     * 承認日付
     */
    private Date ackDate;

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 施設コード
     */
    private String facilityCd;

    /**
     * 施設パターン
     */
    private String facilityPattern;

    /**
     * 施設付帯種類
     */
    private String facilitySorts;

    /**
     * 種別
     */
    private String kindFlg;

    /**
     * 責任者
     */
    private String responsibler;

    /**
     * シーケンス
     */
    private Integer sequence;

    /**
     * 担当者
     */
    private String tantousya;

    /**
     * ユーザ区分
     */
    private Integer userDiv;

    /**
     * 承認日付を取得します。
     * 
     * @return 承認日付
     */
    public Date getAckDate() {
        return ackDate;
    }

    /**
     * 承認日付を取得します。
     * 
     * @return 承認日付
     */
    public String getAckDateStr() {
        if (ackDate == null) {
            return "";
        }
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return format.format(ackDate);
    }

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 施設コードを取得します。
     * 
     * @return 施設コード
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設パターンを取得します。
     * 
     * @return 施設パターン
     */
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * 施設付帯種類を取得します。
     * 
     * @return 施設付帯種類
     */
    public String getFacilitySorts() {
        return facilitySorts;
    }

    /**
     * 種別を取得します。
     * 
     * @return 種別
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * 責任者を取得します。
     * 
     * @return 責任者
     */
    public String getResponsibler() {
        return responsibler;
    }

    /**
     * シーケンスを取得します。
     * 
     * @return シーケンス
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 担当者を取得します。
     * 
     * @return 担当者
     */
    public String getTantousya() {
        return tantousya;
    }

    /**
     * ユーザ区分を取得します。
     * 
     * @return ユーザ区分
     */
    public Integer getUserDiv() {
        return userDiv;
    }

    /**
     * 承認日付を設定します。
     * 
     * @param ackDate
     *            承認日付
     */
    public void setAckDate(Date ackDate) {
        this.ackDate = ackDate;
    }

    /**
     * 承認日付を設定します。
     * 
     * @param ackDate
     *            承認日付
     */
    public void setAckDateStr(final String ackDate) {
        DateFormat format = new SimpleDateFormat(
                DJreConstants.DATE_FORMAT_YYYYMMDDHHMMSS);
        try {
            this.ackDate = format.parse(ackDate);
        } catch (ParseException e) {

        }
    }

    /**
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * 施設コードを設定します。
     * 
     * @param facilityCd
     *            施設コード
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 施設パターンを設定します。
     * 
     * @param facilityPattern
     *            施設パターン
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * 施設付帯種類を設定します。
     * 
     * @param facilitySorts
     *            施設付帯種類
     */
    public void setFacilitySorts(String facilitySorts) {
        this.facilitySorts = facilitySorts;
    }

    /**
     * 種別を設定します。
     * 
     * @param kindFlg
     *            種別
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * 責任者を設定します。
     * 
     * @param responsibler
     *            責任者
     */
    public void setResponsibler(String responsibler) {
        this.responsibler = responsibler;
    }

    /**
     * シーケンスを設定します。
     * 
     * @param sequence
     *            シーケンス
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 担当者を設定します。
     * 
     * @param tantousya
     *            担当者
     */
    public void setTantousya(String tantousya) {
        this.tantousya = tantousya;
    }

    /**
     * ユーザ区分を設定します。
     * 
     * @param userDiv
     *            ユーザ区分
     */
    public void setUserDiv(Integer userDiv) {
        this.userDiv = userDiv;
    }

}
