package jp.co.jreast.common.data.ddata;

/**
 * 手数料マスタ エンティティ
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
public class MComm {

    /** 手数料率・額（大人） */
    private String commissionAdult;

    /** 手数料率・額区分 */
    private String commissionRatePrice;

    /** 手数料設定期間ＦＲＯＭ */
    private String commissionTermFrom;

    /** 設定期間枝番 */
    private String commissionTermItemNo;

    /** 手数料設定期間ＴＯ */
    private String commissionTermTo;

    /** 登録日 */
    private String dateOfRegistration;

    /** 更新日 */
    private String dateOfRenewal;

    /** 施設コード */
    private String facilityCd;

    /** 券種コード（大分類） */
    private String largeCuponCode;

    /** 素材種別 */
    private String materialKind;

    /** 担当者ＩＤ */
    private String personInChargeId;

    /**
     * 手数料率・額（大人）を取得します。
     * @return 手数料率・額（大人）
     */
    public String getCommissionAdult() {
        return commissionAdult;
    }

    /**
     * 手数料率・額（大人）を設定します。
     * @param commissionAdult 手数料率・額（大人）
     */
    public void setCommissionAdult(String commissionAdult) {
        this.commissionAdult = commissionAdult;
    }

    /**
     * 手数料率・額区分を取得します。
     * @return 手数料率・額区分
     */
    public String getCommissionRatePrice() {
        return commissionRatePrice;
    }

    /**
     * 手数料率・額区分を設定します。
     * @param commissionRatePrice 手数料率・額区分
     */
    public void setCommissionRatePrice(String commissionRatePrice) {
        this.commissionRatePrice = commissionRatePrice;
    }

    /**
     * 手数料設定期間ＦＲＯＭを取得します。
     * @return 手数料設定期間ＦＲＯＭ
     */
    public String getCommissionTermFrom() {
        return commissionTermFrom;
    }

    /**
     * 手数料設定期間ＦＲＯＭを設定します。
     * @param commissionTermFrom 手数料設定期間ＦＲＯＭ
     */
    public void setCommissionTermFrom(String commissionTermFrom) {
        this.commissionTermFrom = commissionTermFrom;
    }

    /**
     * 設定期間枝番を取得します。
     * @return 設定期間枝番
     */
    public String getCommissionTermItemNo() {
        return commissionTermItemNo;
    }

    /**
     * 設定期間枝番を設定します。
     * @param commissionTermItemNo 設定期間枝番
     */
    public void setCommissionTermItemNo(String commissionTermItemNo) {
        this.commissionTermItemNo = commissionTermItemNo;
    }

    /**
     * 手数料設定期間ＴＯを取得します。
     * @return 手数料設定期間ＴＯ
     */
    public String getCommissionTermTo() {
        return commissionTermTo;
    }

    /**
     * 手数料設定期間ＴＯを設定します。
     * @param commissionTermTo 手数料設定期間ＴＯ
     */
    public void setCommissionTermTo(String commissionTermTo) {
        this.commissionTermTo = commissionTermTo;
    }

    /**
     * 登録日を取得します。
     * @return 登録日
     */
    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    /**
     * 登録日を設定します。
     * @param dateOfRegistration 登録日
     */
    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    /**
     * 更新日を取得します。
     * @return 更新日
     */
    public String getDateOfRenewal() {
        return dateOfRenewal;
    }

    /**
     * 更新日を設定します。
     * @param dateOfRenewal 更新日
     */
    public void setDateOfRenewal(String dateOfRenewal) {
        this.dateOfRenewal = dateOfRenewal;
    }

    /**
     * 施設コードを取得します。
     * @return 施設コード
     */
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * 施設コードを設定します。
     * @param facilityCd 施設コード
     */
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * 券種コード（大分類）を取得します。
     * @return 券種コード（大分類）
     */
    public String getLargeCuponCode() {
        return largeCuponCode;
    }

    /**
     * 券種コード（大分類）を設定します。
     * @param largeCuponCode 券種コード（大分類）
     */
    public void setLargeCuponCode(String largeCuponCode) {
        this.largeCuponCode = largeCuponCode;
    }

    /**
     * 素材種別を取得します。
     * @return 素材種別
     */
    public String getMaterialKind() {
        return materialKind;
    }

    /**
     * 素材種別を設定します。
     * @param materialKind 素材種別
     */
    public void setMaterialKind(String materialKind) {
        this.materialKind = materialKind;
    }

    /**
     * 担当者ＩＤを取得します。
     * @return 担当者ＩＤ
     */
    public String getPersonInChargeId() {
        return personInChargeId;
    }

    /**
     * 担当者ＩＤを設定します。
     * @param personInChargeId 担当者ＩＤ
     */
    public void setPersonInChargeId(String personInChargeId) {
        this.personInChargeId = personInChargeId;
    }

}
