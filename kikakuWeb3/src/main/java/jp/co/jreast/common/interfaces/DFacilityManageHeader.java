package jp.co.jreast.common.interfaces;

/**
 * 施設付帯情報ヘッダ インターフェース
 * 
 * <pre>
 *   機能概要 ： 施設付帯情報ヘッダ項目（および連絡先情報）データのインターフェースです。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public interface DFacilityManageHeader extends PlanAnsKey, FacilityManageKey {

    /**
     * 支社コードを取得します。
     * 
     * @return 支社コード
     */
    String getBranchCd();

    /**
     * 支社名称を取得します。（※基本マスタ参照）
     * 
     * @return 支社名称
     */
    String getBranchNm();

    /**
     * 施設コードの先頭1桁目を取得します。
     * 
     * @return 施設コードの先頭1桁目
     */
    String getFacilityCd1();

    /**
     * 施設コードの先頭2桁目を取得します。
     * 
     * @return 施設コードの先頭2桁目
     */
    String getFacilityCd2();

    /**
     * 施設コードの先頭3桁目を取得します。
     * 
     * @return 施設コードの先頭3桁目
     */
    String getFacilityCd3();

    /**
     * 施設コードの先頭4桁目を取得します。
     * 
     * @return 施設コードの先頭4桁目
     */
    String getFacilityCd4();

    /**
     * 施設コードの先頭5桁目を取得します。
     * 
     * @return 施設コードの先頭5桁目
     */
    String getFacilityCd5();

    /**
     * 施設コードの先頭6桁目を取得します。
     * 
     * @return 施設コードの先頭6桁目
     */
    String getFacilityCd6();

    /**
     * 施設名称を取得します。
     * 
     * @return 施設名称
     */
    String getFacilityNm();

    /**
     * 施設パターンの先頭1桁目を取得します。
     * 
     * @return 施設パターンの先頭1桁目
     */
    String getFacilityPattern1();

    /**
     * 施設パターンの先頭2桁目を取得します。
     * 
     * @return 施設パターンの先頭2桁目
     */
    String getFacilityPattern2();

    /**
     * 施設パターンの先頭3桁目を取得します。
     * 
     * @return 施設パターンの先頭3桁目
     */
    String getFacilityPattern3();

    /**
     * 施設パターンの先頭4桁目を取得します。
     * 
     * @return 施設パターンの先頭4桁目
     */
    String getFacilityPattern4();

    /**
     * 施設パターンの先頭5桁目を取得します。
     * 
     * @return 施設パターンの先頭5桁目
     */
    String getFacilityPattern5();

    /**
     * 施設パターンの先頭6桁目を取得します。
     * 
     * @return 施設パターンの先頭6桁目
     */
    String getFacilityPattern6();

    /**
     * 施設パターン名称を取得します。
     * 
     * @return 施設パターン名称
     */
    String getFacilityPatternNm();

    /**
     * 送付先（回答書/付帯情報）を取得します。
     * 
     * @return 送付先（回答書/付帯情報）
     */
    String getFacilitySendAddr();

    /**
     * 状態 （NO3状態 または NO5状態）を取得します。
     * 
     * @return 状態 （NO3状態 または NO5状態）
     */
    Integer getFpStatus();

    /**
     * 状態名称（NO3状態 または NO5状態）を取得します。（※基本マスタ参照）
     * 
     * @return 状態名称
     */
    String getFpStatusNm();

    /**
     * 商品名称を取得します。
     * 
     * @return 商品名称
     */
    String getGoodsNm();

    /**
     * 回答書種別名称を取得します。（※基本マスタ参照）
     * 
     * @return 回答書種別名称
     */
    String getKindNm();

    /**
     * 状態 （企画回答書）を取得します。
     * 
     * @return 状態 （企画回答書）
     */
    Integer getPaStatus();

    /**
     * 状態名称（企画回答書）を取得します。（※基本マスタ参照）
     * 
     * @return 状態名称
     */
    String getPaStatusNm();

    /**
     * 企画通番（東日本）を取得します。
     * 
     * @return 企画通番（東日本）
     */
    String getPlanNoEJp();

    /**
     * 企画通番（東日本）の先頭1桁目を取得します。
     * 
     * @return 企画通番（東日本）の先頭1桁目
     */
    String getPlanNoEJp1();

    /**
     * 企画通番（東日本）の先頭2桁目を取得します。
     * 
     * @return 企画通番（東日本）の先頭2桁目
     */
    String getPlanNoEJp2();

    /**
     * 企画通番（東日本）の先頭3桁目を取得します。
     * 
     * @return 企画通番（東日本）の先頭3桁目
     */
    String getPlanNoEJp3();

    /**
     * 企画通番（東日本）の先頭4桁目を取得します。
     * 
     * @return 企画通番（東日本）の先頭4桁目
     */
    String getPlanNoEJp4();

    /**
     * 企画通番（東日本）の先頭5桁目を取得します。
     * 
     * @return 企画通番（東日本）の先頭5桁目
     */
    String getPlanNoEJp5();

    /**
     * 企画通番（東日本）の先頭6桁目を取得します。
     * 
     * @return 企画通番（東日本）の先頭6桁目
     */
    String getPlanNoEJp6();

    /**
     * シーズン区分を取得します。
     * 
     * @return シーズン区分
     */
    String getSeasonDiv();

    /**
     * シーズン名称を取得します。（※基本マスタ参照）
     * 
     * @return シーズン名称
     */
    String getSeasonNm();

    /**
     * 送付区分を取得します。
     * 
     * @return 送付区分
     */
    Integer getSendDiv();

    /**
     * 送付連絡先ＦＡＸを取得します。
     * 
     * @return 送付連絡先ＦＡＸ
     */
    String getSenderFax();

    /**
     * 送付担当者名を取得します。
     * 
     * @return 送付担当者名
     */
    String getSenderNm();

    /**
     * 送付連絡先電話を取得します。
     * 
     * @return 送付連絡先電話
     */
    String getSenderTel();

    /**
     * 送付状態を取得します。
     * 
     * @return 送付状態
     */
    String getSendStatus();

    /**
     * 更新年月日を取得します。
     * 
     * @return 更新年月日
     */
    String getUpYmd();

    /**
     * 更新年月日（yyyy/MM/dd）を取得します。
     * 
     * @return 更新年月日（yyyy/MM/dd）
     */
    String getUpYmdDisp();

    /**
     * 年度を取得します。
     * 
     * @return 年度
     */
    String getYear();

    /**
     * 支社コードを設定します。
     * 
     * @param branchCd
     *            支社コード
     */
    void setBranchCd(String branchCd);

    /**
     * 施設名称を設定します。
     * 
     * @param facilityNm
     *            施設名称
     */
    void setFacilityNm(String facilityNm);

    /**
     * 施設パターン名称を設定します。
     * 
     * @param facilityPatternNm
     *            施設パターン名称
     */
    void setFacilityPatternNm(String facilityPatternNm);

    /**
     * 送付先（回答書/付帯情報）を設定します。
     * 
     * @param facilitySendAddr
     *            送付先（回答書/付帯情報）
     */
    void setFacilitySendAddr(String facilitySendAddr);

    /**
     * 状態 （NO3状態 または NO5状態）を設定します。
     * 
     * @param fpStatus
     *            状態 （NO3状態 または NO5状態）
     */
    void setFpStatus(Integer fpStatus);

    /**
     * 商品名称を設定します。
     * 
     * @param goodsNm
     *            商品名称
     */
    void setGoodsNm(String goodsNm);

    /**
     * 状態 （企画回答書）を設定します。
     * 
     * @param paStatus
     *            状態 （企画回答書）
     */
    void setPaStatus(Integer paStatus);

    /**
     * 企画通番（東日本）を設定します。
     * 
     * @param planNoEJp
     *            企画通番（東日本）
     */
    void setPlanNoEJp(String planNoEJp);

    /**
     * シーズン区分を設定します。
     * 
     * @param seasonDiv
     *            シーズン区分
     */
    void setSeasonDiv(String seasonDiv);

    /**
     * 送付区分を設定します。
     * 
     * @param sendDiv
     *            送付区分
     */
    void setSendDiv(Integer sendDiv);

    /**
     * 送付連絡先ＦＡＸを設定します。
     * 
     * @param senderFax
     *            送付連絡先ＦＡＸ
     */
    void setSenderFax(String senderFax);

    /**
     * 送付担当者名を設定します。
     * 
     * @param senderNm
     *            送付担当者名
     */
    void setSenderNm(String senderNm);

    /**
     * 送付連絡先電話を設定します。
     * 
     * @param senderTel
     *            送付連絡先電話
     */
    void setSenderTel(String senderTel);

    /**
     * 送付状態を設定します。
     * 
     * @param sendStatus
     *            送付状態
     */
    void setSendStatus(String sendStatus);

    /**
     * 更新年月日を設定します。
     * 
     * @param upYmd
     *            更新年月日
     */
    void setUpYmd(String upYmd);

    /**
     * 年度を設定します。
     * 
     * @param year
     *            年度
     */
    void setYear(String year);

}
