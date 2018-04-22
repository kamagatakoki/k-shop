package jp.co.jreast.common.data.ddata;

/**
 * 入湯税マスタ エンティティ
 * 
 * <pre>
 *   機能概要 ： 
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/12/11
 * @author ITG
 */
public class MTaxBath {

    /** 入湯税単価（大人） */
    private String bathTaxAdult;

    /** 入湯税単価（小人） */
    private String bathTaxChild;

    /** 作成年月日 */
    private String createYmd;

    /** 施設コード */
    private String facilityCd;

    /** 担当者ＩＤ */
    private String personInChargeId;

    /** 設定期間ＦＲＯＭ */
    private String termFrom;

    /** 設定期間ＴＯ */
    private String termTo;

    /** 更新年月日 */
    private String upYmd;

    /**
     * 入湯税単価（大人）を取得します。
     * 
     * @return 入湯税単価（大人）
     */
    public String getBathTaxAdult() {
        return bathTaxAdult;
    }

    /**
     * 入湯税単価（小人）を取得します。
     * 
     * @return 入湯税単価（小人）
     */
    public String getBathTaxChild() {
        return bathTaxChild;
    }

    /**
     * 作成年月日を取得します。
     * 
     * @return 作成年月日
     */
    public String getCreateYmd() {
        return createYmd;
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
     * 担当者ＩＤを取得します。
     * 
     * @return 担当者ＩＤ
     */
    public String getPersonInChargeId() {
        return personInChargeId;
    }

    /**
     * 設定期間ＦＲＯＭを取得します。
     * 
     * @return 設定期間ＦＲＯＭ
     */
    public String getTermFrom() {
        return termFrom;
    }

    /**
     * 設定期間ＴＯを取得します。
     * 
     * @return 設定期間ＴＯ
     */
    public String getTermTo() {
        return termTo;
    }

    /**
     * 更新年月日を取得します。
     * 
     * @return 更新年月日
     */
    public String getUpYmd() {
        return upYmd;
    }

    /**
     * 入湯税単価（大人）を設定します。
     * 
     * @param bathTaxAdult
     *            入湯税単価（大人）
     */
    public void setBathTaxAdult(String bathTaxAdult) {
        this.bathTaxAdult = bathTaxAdult;
    }

    /**
     * 入湯税単価（小人）を設定します。
     * 
     * @param bathTaxChild
     *            入湯税単価（小人）
     */
    public void setBathTaxChild(String bathTaxChild) {
        this.bathTaxChild = bathTaxChild;
    }

    /**
     * 作成年月日を設定します。
     * 
     * @param createYmd
     *            作成年月日
     */
    public void setCreateYmd(String createYmd) {
        this.createYmd = createYmd;
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
     * 担当者ＩＤを設定します。
     * 
     * @param personInChargeId
     *            担当者ＩＤ
     */
    public void setPersonInChargeId(String personInChargeId) {
        this.personInChargeId = personInChargeId;
    }

    /**
     * 設定期間ＦＲＯＭを設定します。
     * 
     * @param termFrom
     *            設定期間ＦＲＯＭ
     */
    public void setTermFrom(String termFrom) {
        this.termFrom = termFrom;
    }

    /**
     * 設定期間ＴＯを設定します。
     * 
     * @param termTo
     *            設定期間ＴＯ
     */
    public void setTermTo(String termTo) {
        this.termTo = termTo;
    }

    /**
     * 更新年月日を設定します。
     * 
     * @param upYmd
     *            更新年月日
     */
    public void setUpYmd(String upYmd) {
        this.upYmd = upYmd;
    }
}
