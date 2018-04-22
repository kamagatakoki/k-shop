package jp.co.jreast.common.data.ddata;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 施設マスタ エンティティ
 * 
 * <pre>
 *   機能概要 ： 
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class MFacility {

    /** 住所 */
    private String address;

    /** 地区コード */
    private String areaCd;

    /** 地区大分類 */
    private String areaDaiCd;

    /** 地区小分類 */
    private String areaShoCd;

    /** TODO */
    private String busyo;

    /** 使用停止フラグ */
    private String closeFlg;

    /** 契約コード一般NO1 */
    private String cmnContractCd1;

    /** 契約コード一般NO2 */
    private String cmnContractCd2;

    /** 契約コード一般NO3 */
    private String cmnContractCd3;

    /** 契約コード一般NO4 */
    private String cmnContractCd4;

    /** 契約コード一般NO5 */
    private String cmnContractCd5;

    /** 会社ID */
    private String comId;

    /** 契約種別 */
    private String contractKind;

    /** 契約年月日FROM */
    private Timestamp contractYmdFrom;

    /** 契約年月日FROM（DP） */
    private Timestamp contractYmdFromDp;

    /** 契約年月日FROM（RM/SP） */
    private Timestamp contractYmdFromRmsp;

    /** 契約年月日TO */
    private Timestamp contractYmdTo;

    /** 契約年月日TO（DP） */
    private Timestamp contractYmdToDp;

    /** 契約年月日TO（RM/SP） */
    private Timestamp contractYmdToRmsp;

    /** 作成年月日 */
    private Timestamp createYmd;

    /** 送付先メールアドレス */
    private String eMail;

    /** 施設略称名（カナ） */
    private String facilityAbbrNmKana;

    /** 施設略称名（漢字） */
    private String facilityAbbrNmKanji;

    /** 施設コード */
    private String facilityCd;

    /** 施設名称 */
    private String facilityNm;

    /** 施設名称（カナ） */
    private String facilityNmKana;

    /** 施設URL */
    private String facilityUrl;

    /** FAX番号 */
    private String faxNo;

    /** TODO */
    private String faxTanto;

    /** 取扱（販売）手数料 */
    private BigDecimal handlingTax;

    /** 取扱（販売）手数料（DP） */
    private BigDecimal handlingTaxDp;

    /** 取扱（販売）手数料（RM/SP） */
    private BigDecimal handlingTaxRmsp;

    /** 手数料タイプ */
    private String handlingTaxType;

    /** 幼児受入可否フラグ */
    private String infantFlg;

    /** ＪＲ旅連非加盟 */
    private String jrMemberFlg;

    /** TODO */
    private String kindCd;

    /** 回答書種別 */
    private String kindFlg;

    /** 緯度 */
    private BigDecimal latitude;

    /** 基本手仕舞日 */
    private Integer liquidateDay;

    /** 手仕舞時刻（当日設定時） */
    private String liquidateTime;

    /** 経度 */
    private BigDecimal longitude;

    /** TODO */
    private String memo;

    /** 新規フラグ */
    private String newFlg;

    /** 操作箇所 */
    private String operation;

    /** 契約コードその他NO1 */
    private String otherContractCd1;

    /** 契約コードその他NO2 */
    private String otherContractCd2;

    /** 契約コードその他NO3 */
    private String otherContractCd3;

    /** 契約コードその他NO4 */
    private String otherContractCd4;

    /** 契約コードその他NO5 */
    private String otherContractCd5;

    /** 代表者名 */
    private String ownerNm;

    /** TODO */
    private String password;

    /** 郵便番号 */
    private String postcode;

    /** 都道府県コード */
    private String prefecturesCd;

    /** 地域コード */
    private String regionCd;

    /** 予約通知方法 */
    private String reserveInformWay;

    /** 返室不可 */
    private String retRoomFlg;

    /** 休前日返室可能日 */
    private String retRoomHolidayDd;

    /** 休前日返室不可 */
    private String retRoomHolidayFlg;

    /** 休前日返室可能月 */
    private String retRoomHolidayMm;

    /** 平・休日返室可能日 */
    private String retRoomWeekdayDd;

    /** 平・休日返室可能月 */
    private String retRoomWeekdayMm;

    /** TODO */
    private String riyu;

    /** 送付区分コード */
    private String sendDivCd;

    /** 送付先FAX番号 */
    private String sendFaxNo;

    /** 入湯税（大人） */
    private Integer spaTaxAdlt;

    /** 入湯税（小人） */
    private Integer spaTaxChild;

    /** 宿泊施設区分 */
    private String stayFacilityKind;

    /** TODO */
    private String stockBranch;

    /** 仕入支社コード */
    private String stockBranchCd;

    /** TODO */
    private String tantou;

    /** 担当者 */
    private String tantousya;

    /** 電話番号 */
    private String telephonNo;

    /** パソコン */
    private String terminalNo;

    /** 東京都宿泊税フラグ */
    private String tyoStayTaxFlg;

    /** 更新支社 */
    private String upBranchCd;

    /** 更新フラグ */
    private String updateFlg;

    /** 更新者 */
    private String upUserId;

    /** 更新年月日 */
    private Timestamp upYmd;

    /** エリアコード */
    private String zoneCd;

    /** 造成WEB送信フラグ */
    private String zouseiSendFlg;

    /**
     * 住所を取得します。
     * 
     * @return 住所
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地区コードを取得します。
     * 
     * @return 地区コード
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * 地区大分類を取得します。
     * 
     * @return 地区大分類
     */
    public String getAreaDaiCd() {
        return areaDaiCd;
    }

    /**
     * 地区小分類を取得します。
     * 
     * @return 地区小分類
     */
    public String getAreaShoCd() {
        return areaShoCd;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getBusyo() {
        return busyo;
    }

    /**
     * 使用停止フラグを取得します。
     * 
     * @return 使用停止フラグ
     */
    public String getCloseFlg() {
        return closeFlg;
    }

    /**
     * 契約コード一般NO1を取得します。
     * 
     * @return 契約コード一般NO1
     */
    public String getCmnContractCd1() {
        return cmnContractCd1;
    }

    /**
     * 契約コード一般NO2を取得します。
     * 
     * @return 契約コード一般NO2
     */
    public String getCmnContractCd2() {
        return cmnContractCd2;
    }

    /**
     * 契約コード一般NO3を取得します。
     * 
     * @return 契約コード一般NO3
     */
    public String getCmnContractCd3() {
        return cmnContractCd3;
    }

    /**
     * 契約コード一般NO4を取得します。
     * 
     * @return 契約コード一般NO4
     */
    public String getCmnContractCd4() {
        return cmnContractCd4;
    }

    /**
     * 契約コード一般NO5を取得します。
     * 
     * @return 契約コード一般NO5
     */
    public String getCmnContractCd5() {
        return cmnContractCd5;
    }

    /**
     * 会社IDを取得します。
     * 
     * @return 会社ID
     */
    public String getComId() {
        return comId;
    }

    /**
     * 契約種別を取得します。
     * 
     * @return 契約種別
     */
    public String getContractKind() {
        return contractKind;
    }

    /**
     * 契約年月日FROMを取得します。
     * 
     * @return 契約年月日FROM
     */
    public Timestamp getContractYmdFrom() {
        return contractYmdFrom;
    }

    /**
     * 契約年月日FROM（DP）を取得します。
     * 
     * @return 契約年月日FROM（DP）
     */
    public Timestamp getContractYmdFromDp() {
        return contractYmdFromDp;
    }

    /**
     * 契約年月日FROM（RM/SP）を取得します。
     * 
     * @return 契約年月日FROM（RM/SP）
     */
    public Timestamp getContractYmdFromRmsp() {
        return contractYmdFromRmsp;
    }

    /**
     * 契約年月日TOを取得します。
     * 
     * @return 契約年月日TO
     */
    public Timestamp getContractYmdTo() {
        return contractYmdTo;
    }

    /**
     * 契約年月日TO（DP）を取得します。
     * 
     * @return 契約年月日TO（DP）
     */
    public Timestamp getContractYmdToDp() {
        return contractYmdToDp;
    }

    /**
     * 契約年月日TO（RM/SP）を取得します。
     * 
     * @return 契約年月日TO（RM/SP）
     */
    public Timestamp getContractYmdToRmsp() {
        return contractYmdToRmsp;
    }

    /**
     * 作成年月日を取得します。
     * 
     * @return 作成年月日
     */
    public Timestamp getCreateYmd() {
        return createYmd;
    }

    /**
     * 送付先メールアドレスを取得します。
     * 
     * @return 送付先メールアドレス
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * 施設略称名（カナ）を取得します。
     * 
     * @return 施設略称名（カナ）
     */
    public String getFacilityAbbrNmKana() {
        return facilityAbbrNmKana;
    }

    /**
     * 施設略称名（漢字）を取得します。
     * 
     * @return 施設略称名（漢字）
     */
    public String getFacilityAbbrNmKanji() {
        return facilityAbbrNmKanji;
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
     * 施設名称を取得します。
     * 
     * @return 施設名称
     */
    public String getFacilityNm() {
        return facilityNm;
    }

    /**
     * 施設名称（カナ）を取得します。
     * 
     * @return 施設名称（カナ）
     */
    public String getFacilityNmKana() {
        return facilityNmKana;
    }

    /**
     * 施設URLを取得します。
     * 
     * @return 施設URL
     */
    public String getFacilityUrl() {
        return facilityUrl;
    }

    /**
     * FAX番号を取得します。
     * 
     * @return FAX番号
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getFaxTanto() {
        return faxTanto;
    }

    /**
     * 取扱（販売）手数料を取得します。
     * 
     * @return 取扱（販売）手数料
     */
    public BigDecimal getHandlingTax() {
        return handlingTax;
    }

    /**
     * 取扱（販売）手数料（DP）を取得します。
     * 
     * @return 取扱（販売）手数料（DP）
     */
    public BigDecimal getHandlingTaxDp() {
        return handlingTaxDp;
    }

    /**
     * 取扱（販売）手数料（RM/SP）を取得します。
     * 
     * @return 取扱（販売）手数料（RM/SP）
     */
    public BigDecimal getHandlingTaxRmsp() {
        return handlingTaxRmsp;
    }

    /**
     * 手数料タイプを取得します。
     * 
     * @return 手数料タイプ
     */
    public String getHandlingTaxType() {
        return handlingTaxType;
    }

    /**
     * 幼児受入可否フラグを取得します。
     * 
     * @return 幼児受入可否フラグ
     */
    public String getInfantFlg() {
        return infantFlg;
    }

    /**
     * ＪＲ旅連非加盟を取得します。
     * 
     * @return ＪＲ旅連非加盟
     */
    public String getJrMemberFlg() {
        return jrMemberFlg;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getKindCd() {
        return kindCd;
    }

    /**
     * 回答書種別を取得します。
     * 
     * @return 回答書種別
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * 緯度を取得します。
     * 
     * @return 緯度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 基本手仕舞日を取得します。
     * 
     * @return 基本手仕舞日
     */
    public Integer getLiquidateDay() {
        return liquidateDay;
    }

    /**
     * 手仕舞時刻（当日設定時）を取得します。
     * 
     * @return 手仕舞時刻（当日設定時）
     */
    public String getLiquidateTime() {
        return liquidateTime;
    }

    /**
     * 経度を取得します。
     * 
     * @return 経度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 新規フラグを取得します。
     * 
     * @return 新規フラグ
     */
    public String getNewFlg() {
        return newFlg;
    }

    /**
     * 操作箇所を取得します。
     * 
     * @return 操作箇所
     */
    public String getOperation() {
        return operation;
    }

    /**
     * 契約コードその他NO1を取得します。
     * 
     * @return 契約コードその他NO1
     */
    public String getOtherContractCd1() {
        return otherContractCd1;
    }

    /**
     * 契約コードその他NO2を取得します。
     * 
     * @return 契約コードその他NO2
     */
    public String getOtherContractCd2() {
        return otherContractCd2;
    }

    /**
     * 契約コードその他NO3を取得します。
     * 
     * @return 契約コードその他NO3
     */
    public String getOtherContractCd3() {
        return otherContractCd3;
    }

    /**
     * 契約コードその他NO4を取得します。
     * 
     * @return 契約コードその他NO4
     */
    public String getOtherContractCd4() {
        return otherContractCd4;
    }

    /**
     * 契約コードその他NO5を取得します。
     * 
     * @return 契約コードその他NO5
     */
    public String getOtherContractCd5() {
        return otherContractCd5;
    }

    /**
     * 代表者名を取得します。
     * 
     * @return 代表者名
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getPassword() {
        return password;
    }

    /**
     * 郵便番号を取得します。
     * 
     * @return 郵便番号
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 都道府県コードを取得します。
     * 
     * @return 都道府県コード
     */
    public String getPrefecturesCd() {
        return prefecturesCd;
    }

    /**
     * 地域コードを取得します。
     * 
     * @return 地域コード
     */
    public String getRegionCd() {
        return regionCd;
    }

    /**
     * 予約通知方法を取得します。
     * 
     * @return 予約通知方法
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * 返室不可を取得します。
     * 
     * @return 返室不可
     */
    public String getRetRoomFlg() {
        return retRoomFlg;
    }

    /**
     * 休前日返室可能日を取得します。
     * 
     * @return 休前日返室可能日
     */
    public String getRetRoomHolidayDd() {
        return retRoomHolidayDd;
    }

    /**
     * 休前日返室不可を取得します。
     * 
     * @return 休前日返室不可
     */
    public String getRetRoomHolidayFlg() {
        return retRoomHolidayFlg;
    }

    /**
     * 休前日返室可能月を取得します。
     * 
     * @return 休前日返室可能月
     */
    public String getRetRoomHolidayMm() {
        return retRoomHolidayMm;
    }

    /**
     * 平・休日返室可能日を取得します。
     * 
     * @return 平・休日返室可能日
     */
    public String getRetRoomWeekdayDd() {
        return retRoomWeekdayDd;
    }

    /**
     * 平・休日返室可能月を取得します。
     * 
     * @return 平・休日返室可能月
     */
    public String getRetRoomWeekdayMm() {
        return retRoomWeekdayMm;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getRiyu() {
        return riyu;
    }

    /**
     * 送付区分コードを取得します。
     * 
     * @return 送付区分コード
     */
    public String getSendDivCd() {
        return sendDivCd;
    }

    /**
     * 送付先FAX番号を取得します。
     * 
     * @return 送付先FAX番号
     */
    public String getSendFaxNo() {
        return sendFaxNo;
    }

    /**
     * 入湯税（大人）を取得します。
     * 
     * @return 入湯税（大人）
     */
    public Integer getSpaTaxAdlt() {
        return spaTaxAdlt;
    }

    /**
     * 入湯税（小人）を取得します。
     * 
     * @return 入湯税（小人）
     */
    public Integer getSpaTaxChild() {
        return spaTaxChild;
    }

    /**
     * 宿泊施設区分を取得します。
     * 
     * @return 宿泊施設区分
     */
    public String getStayFacilityKind() {
        return stayFacilityKind;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getStockBranch() {
        return stockBranch;
    }

    /**
     * 仕入支社コードを取得します。
     * 
     * @return 仕入支社コード
     */
    public String getStockBranchCd() {
        return stockBranchCd;
    }

    /**
     * TODOを取得します。
     * 
     * @return TODO
     */
    public String getTantou() {
        return tantou;
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
     * 電話番号を取得します。
     * 
     * @return 電話番号
     */
    public String getTelephonNo() {
        return telephonNo;
    }

    /**
     * パソコンを取得します。
     * 
     * @return パソコン
     */
    public String getTerminalNo() {
        return terminalNo;
    }

    /**
     * 東京都宿泊税フラグを取得します。
     * 
     * @return 東京都宿泊税フラグ
     */
    public String getTyoStayTaxFlg() {
        return tyoStayTaxFlg;
    }

    /**
     * 更新支社を取得します。
     * 
     * @return 更新支社
     */
    public String getUpBranchCd() {
        return upBranchCd;
    }

    /**
     * 更新フラグを取得します。
     * 
     * @return 更新フラグ
     */
    public String getUpdateFlg() {
        return updateFlg;
    }

    /**
     * 更新者を取得します。
     * 
     * @return 更新者
     */
    public String getUpUserId() {
        return upUserId;
    }

    /**
     * 更新年月日を取得します。
     * 
     * @return 更新年月日
     */
    public Timestamp getUpYmd() {
        return upYmd;
    }

    /**
     * エリアコードを取得します。
     * 
     * @return エリアコード
     */
    public String getZoneCd() {
        return zoneCd;
    }

    /**
     * 造成WEB送信フラグを取得します。
     * 
     * @return 造成WEB送信フラグ
     */
    public String getZouseiSendFlg() {
        return zouseiSendFlg;
    }

    /**
     * 住所を設定します。
     * 
     * @param address
     *            住所
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 地区コードを設定します。
     * 
     * @param areaCd
     *            地区コード
     */
    public void setAreaCd(String areaCd) {
        this.areaCd = areaCd;
    }

    /**
     * 地区大分類を設定します。
     * 
     * @param areaDaiCd
     *            地区大分類
     */
    public void setAreaDaiCd(String areaDaiCd) {
        this.areaDaiCd = areaDaiCd;
    }

    /**
     * 地区小分類を設定します。
     * 
     * @param areaShoCd
     *            地区小分類
     */
    public void setAreaShoCd(String areaShoCd) {
        this.areaShoCd = areaShoCd;
    }

    /**
     * TODOを設定します。
     * 
     * @param busyo
     *            TODO
     */
    public void setBusyo(String busyo) {
        this.busyo = busyo;
    }

    /**
     * 使用停止フラグを設定します。
     * 
     * @param closeFlg
     *            使用停止フラグ
     */
    public void setCloseFlg(String closeFlg) {
        this.closeFlg = closeFlg;
    }

    /**
     * 契約コード一般NO1を設定します。
     * 
     * @param cmnContractCd1
     *            契約コード一般NO1
     */
    public void setCmnContractCd1(String cmnContractCd1) {
        this.cmnContractCd1 = cmnContractCd1;
    }

    /**
     * 契約コード一般NO2を設定します。
     * 
     * @param cmnContractCd2
     *            契約コード一般NO2
     */
    public void setCmnContractCd2(String cmnContractCd2) {
        this.cmnContractCd2 = cmnContractCd2;
    }

    /**
     * 契約コード一般NO3を設定します。
     * 
     * @param cmnContractCd3
     *            契約コード一般NO3
     */
    public void setCmnContractCd3(String cmnContractCd3) {
        this.cmnContractCd3 = cmnContractCd3;
    }

    /**
     * 契約コード一般NO4を設定します。
     * 
     * @param cmnContractCd4
     *            契約コード一般NO4
     */
    public void setCmnContractCd4(String cmnContractCd4) {
        this.cmnContractCd4 = cmnContractCd4;
    }

    /**
     * 契約コード一般NO5を設定します。
     * 
     * @param cmnContractCd5
     *            契約コード一般NO5
     */
    public void setCmnContractCd5(String cmnContractCd5) {
        this.cmnContractCd5 = cmnContractCd5;
    }

    /**
     * 会社IDを設定します。
     * 
     * @param comId
     *            会社ID
     */
    public void setComId(String comId) {
        this.comId = comId;
    }

    /**
     * 契約種別を設定します。
     * 
     * @param contractKind
     *            契約種別
     */
    public void setContractKind(String contractKind) {
        this.contractKind = contractKind;
    }

    /**
     * 契約年月日FROMを設定します。
     * 
     * @param contractYmdFrom
     *            契約年月日FROM
     */
    public void setContractYmdFrom(Timestamp contractYmdFrom) {
        this.contractYmdFrom = contractYmdFrom;
    }

    /**
     * 契約年月日FROM（DP）を設定します。
     * 
     * @param contractYmdFromDp
     *            契約年月日FROM（DP）
     */
    public void setContractYmdFromDp(Timestamp contractYmdFromDp) {
        this.contractYmdFromDp = contractYmdFromDp;
    }

    /**
     * 契約年月日FROM（RM/SP）を設定します。
     * 
     * @param contractYmdFromRmsp
     *            契約年月日FROM（RM/SP）
     */
    public void setContractYmdFromRmsp(Timestamp contractYmdFromRmsp) {
        this.contractYmdFromRmsp = contractYmdFromRmsp;
    }

    /**
     * 契約年月日TOを設定します。
     * 
     * @param contractYmdTo
     *            契約年月日TO
     */
    public void setContractYmdTo(Timestamp contractYmdTo) {
        this.contractYmdTo = contractYmdTo;
    }

    /**
     * 契約年月日TO（DP）を設定します。
     * 
     * @param contractYmdToDp
     *            契約年月日TO（DP）
     */
    public void setContractYmdToDp(Timestamp contractYmdToDp) {
        this.contractYmdToDp = contractYmdToDp;
    }

    /**
     * 契約年月日TO（RM/SP）を設定します。
     * 
     * @param contractYmdToRmsp
     *            契約年月日TO（RM/SP）
     */
    public void setContractYmdToRmsp(Timestamp contractYmdToRmsp) {
        this.contractYmdToRmsp = contractYmdToRmsp;
    }

    /**
     * 作成年月日を設定します。
     * 
     * @param createYmd
     *            作成年月日
     */
    public void setCreateYmd(Timestamp createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * 送付先メールアドレスを設定します。
     * 
     * @param eMail
     *            送付先メールアドレス
     */
    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 施設略称名（カナ）を設定します。
     * 
     * @param facilityAbbrNmKana
     *            施設略称名（カナ）
     */
    public void setFacilityAbbrNmKana(String facilityAbbrNmKana) {
        this.facilityAbbrNmKana = facilityAbbrNmKana;
    }

    /**
     * 施設略称名（漢字）を設定します。
     * 
     * @param facilityAbbrNmKanji
     *            施設略称名（漢字）
     */
    public void setFacilityAbbrNmKanji(String facilityAbbrNmKanji) {
        this.facilityAbbrNmKanji = facilityAbbrNmKanji;
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
     * 施設名称を設定します。
     * 
     * @param facilityNm
     *            施設名称
     */
    public void setFacilityNm(String facilityNm) {
        this.facilityNm = facilityNm;
    }

    /**
     * 施設名称（カナ）を設定します。
     * 
     * @param facilityNmKana
     *            施設名称（カナ）
     */
    public void setFacilityNmKana(String facilityNmKana) {
        this.facilityNmKana = facilityNmKana;
    }

    /**
     * 施設URLを設定します。
     * 
     * @param facilityUrl
     *            施設URL
     */
    public void setFacilityUrl(String facilityUrl) {
        this.facilityUrl = facilityUrl;
    }

    /**
     * FAX番号を設定します。
     * 
     * @param faxNo
     *            FAX番号
     */
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    /**
     * TODOを設定します。
     * 
     * @param faxTanto
     *            TODO
     */
    public void setFaxTanto(String faxTanto) {
        this.faxTanto = faxTanto;
    }

    /**
     * 取扱（販売）手数料を設定します。
     * 
     * @param handlingTax
     *            取扱（販売）手数料
     */
    public void setHandlingTax(BigDecimal handlingTax) {
        this.handlingTax = handlingTax;
    }

    /**
     * 取扱（販売）手数料（DP）を設定します。
     * 
     * @param handlingTaxDp
     *            取扱（販売）手数料（DP）
     */
    public void setHandlingTaxDp(BigDecimal handlingTaxDp) {
        this.handlingTaxDp = handlingTaxDp;
    }

    /**
     * 取扱（販売）手数料（RM/SP）を設定します。
     * 
     * @param handlingTaxRmsp
     *            取扱（販売）手数料（RM/SP）
     */
    public void setHandlingTaxRmsp(BigDecimal handlingTaxRmsp) {
        this.handlingTaxRmsp = handlingTaxRmsp;
    }

    /**
     * 手数料タイプを設定します。
     * 
     * @param handlingTaxType
     *            手数料タイプ
     */
    public void setHandlingTaxType(String handlingTaxType) {
        this.handlingTaxType = handlingTaxType;
    }

    /**
     * 幼児受入可否フラグを設定します。
     * 
     * @param infantFlg
     *            幼児受入可否フラグ
     */
    public void setInfantFlg(String infantFlg) {
        this.infantFlg = infantFlg;
    }

    /**
     * ＪＲ旅連非加盟を設定します。
     * 
     * @param jrMemberFlg
     *            ＪＲ旅連非加盟
     */
    public void setJrMemberFlg(String jrMemberFlg) {
        this.jrMemberFlg = jrMemberFlg;
    }

    /**
     * TODOを設定します。
     * 
     * @param kindCd
     *            TODO
     */
    public void setKindCd(String kindCd) {
        this.kindCd = kindCd;
    }

    /**
     * 回答書種別を設定します。
     * 
     * @param kindFlg
     *            回答書種別
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * 緯度を設定します。
     * 
     * @param latitude
     *            緯度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 基本手仕舞日を設定します。
     * 
     * @param liquidateDay
     *            基本手仕舞日
     */
    public void setLiquidateDay(Integer liquidateDay) {
        this.liquidateDay = liquidateDay;
    }

    /**
     * 手仕舞時刻（当日設定時）を設定します。
     * 
     * @param liquidateTime
     *            手仕舞時刻（当日設定時）
     */
    public void setLiquidateTime(String liquidateTime) {
        this.liquidateTime = liquidateTime;
    }

    /**
     * 経度を設定します。
     * 
     * @param longitude
     *            経度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * TODOを設定します。
     * 
     * @param memo
     *            TODO
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 新規フラグを設定します。
     * 
     * @param newFlg
     *            新規フラグ
     */
    public void setNewFlg(String newFlg) {
        this.newFlg = newFlg;
    }

    /**
     * 操作箇所を設定します。
     * 
     * @param operation
     *            操作箇所
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * 契約コードその他NO1を設定します。
     * 
     * @param otherContractCd1
     *            契約コードその他NO1
     */
    public void setOtherContractCd1(String otherContractCd1) {
        this.otherContractCd1 = otherContractCd1;
    }

    /**
     * 契約コードその他NO2を設定します。
     * 
     * @param otherContractCd2
     *            契約コードその他NO2
     */
    public void setOtherContractCd2(String otherContractCd2) {
        this.otherContractCd2 = otherContractCd2;
    }

    /**
     * 契約コードその他NO3を設定します。
     * 
     * @param otherContractCd3
     *            契約コードその他NO3
     */
    public void setOtherContractCd3(String otherContractCd3) {
        this.otherContractCd3 = otherContractCd3;
    }

    /**
     * 契約コードその他NO4を設定します。
     * 
     * @param otherContractCd4
     *            契約コードその他NO4
     */
    public void setOtherContractCd4(String otherContractCd4) {
        this.otherContractCd4 = otherContractCd4;
    }

    /**
     * 契約コードその他NO5を設定します。
     * 
     * @param otherContractCd5
     *            契約コードその他NO5
     */
    public void setOtherContractCd5(String otherContractCd5) {
        this.otherContractCd5 = otherContractCd5;
    }

    /**
     * 代表者名を設定します。
     * 
     * @param ownerNm
     *            代表者名
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * TODOを設定します。
     * 
     * @param password
     *            TODO
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 郵便番号を設定します。
     * 
     * @param postcode
     *            郵便番号
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 都道府県コードを設定します。
     * 
     * @param prefecturesCd
     *            都道府県コード
     */
    public void setPrefecturesCd(String prefecturesCd) {
        this.prefecturesCd = prefecturesCd;
    }

    /**
     * 地域コードを設定します。
     * 
     * @param regionCd
     *            地域コード
     */
    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    /**
     * 予約通知方法を設定します。
     * 
     * @param reserveInformWay
     *            予約通知方法
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * 返室不可を設定します。
     * 
     * @param retRoomFlg
     *            返室不可
     */
    public void setRetRoomFlg(String retRoomFlg) {
        this.retRoomFlg = retRoomFlg;
    }

    /**
     * 休前日返室可能日を設定します。
     * 
     * @param retRoomHolidayDd
     *            休前日返室可能日
     */
    public void setRetRoomHolidayDd(String retRoomHolidayDd) {
        this.retRoomHolidayDd = retRoomHolidayDd;
    }

    /**
     * 休前日返室不可を設定します。
     * 
     * @param retRoomHolidayFlg
     *            休前日返室不可
     */
    public void setRetRoomHolidayFlg(String retRoomHolidayFlg) {
        this.retRoomHolidayFlg = retRoomHolidayFlg;
    }

    /**
     * 休前日返室可能月を設定します。
     * 
     * @param retRoomHolidayMm
     *            休前日返室可能月
     */
    public void setRetRoomHolidayMm(String retRoomHolidayMm) {
        this.retRoomHolidayMm = retRoomHolidayMm;
    }

    /**
     * 平・休日返室可能日を設定します。
     * 
     * @param retRoomWeekdayDd
     *            平・休日返室可能日
     */
    public void setRetRoomWeekdayDd(String retRoomWeekdayDd) {
        this.retRoomWeekdayDd = retRoomWeekdayDd;
    }

    /**
     * 平・休日返室可能月を設定します。
     * 
     * @param retRoomWeekdayMm
     *            平・休日返室可能月
     */
    public void setRetRoomWeekdayMm(String retRoomWeekdayMm) {
        this.retRoomWeekdayMm = retRoomWeekdayMm;
    }

    /**
     * TODOを設定します。
     * 
     * @param riyu
     *            TODO
     */
    public void setRiyu(String riyu) {
        this.riyu = riyu;
    }

    /**
     * 送付区分コードを設定します。
     * 
     * @param sendDivCd
     *            送付区分コード
     */
    public void setSendDivCd(String sendDivCd) {
        this.sendDivCd = sendDivCd;
    }

    /**
     * 送付先FAX番号を設定します。
     * 
     * @param sendFaxNo
     *            送付先FAX番号
     */
    public void setSendFaxNo(String sendFaxNo) {
        this.sendFaxNo = sendFaxNo;
    }

    /**
     * 入湯税（大人）を設定します。
     * 
     * @param spaTaxAdlt
     *            入湯税（大人）
     */
    public void setSpaTaxAdlt(Integer spaTaxAdlt) {
        this.spaTaxAdlt = spaTaxAdlt;
    }

    /**
     * 入湯税（小人）を設定します。
     * 
     * @param spaTaxChild
     *            入湯税（小人）
     */
    public void setSpaTaxChild(Integer spaTaxChild) {
        this.spaTaxChild = spaTaxChild;
    }

    /**
     * 宿泊施設区分を設定します。
     * 
     * @param stayFacilityKind
     *            宿泊施設区分
     */
    public void setStayFacilityKind(String stayFacilityKind) {
        this.stayFacilityKind = stayFacilityKind;
    }

    /**
     * TODOを設定します。
     * 
     * @param stockBranch
     *            TODO
     */
    public void setStockBranch(String stockBranch) {
        this.stockBranch = stockBranch;
    }

    /**
     * 仕入支社コードを設定します。
     * 
     * @param stockBranchCd
     *            仕入支社コード
     */
    public void setStockBranchCd(String stockBranchCd) {
        this.stockBranchCd = stockBranchCd;
    }

    /**
     * TODOを設定します。
     * 
     * @param tantou
     *            TODO
     */
    public void setTantou(String tantou) {
        this.tantou = tantou;
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
     * 電話番号を設定します。
     * 
     * @param telephonNo
     *            電話番号
     */
    public void setTelephonNo(String telephonNo) {
        this.telephonNo = telephonNo;
    }

    /**
     * パソコンを設定します。
     * 
     * @param terminalNo
     *            パソコン
     */
    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    /**
     * 東京都宿泊税フラグを設定します。
     * 
     * @param tyoStayTaxFlg
     *            東京都宿泊税フラグ
     */
    public void setTyoStayTaxFlg(String tyoStayTaxFlg) {
        this.tyoStayTaxFlg = tyoStayTaxFlg;
    }

    /**
     * 更新支社を設定します。
     * 
     * @param upBranchCd
     *            更新支社
     */
    public void setUpBranchCd(String upBranchCd) {
        this.upBranchCd = upBranchCd;
    }

    /**
     * 更新フラグを設定します。
     * 
     * @param updateFlg
     *            更新フラグ
     */
    public void setUpdateFlg(String updateFlg) {
        this.updateFlg = updateFlg;
    }

    /**
     * 更新者を設定します。
     * 
     * @param upUserId
     *            更新者
     */
    public void setUpUserId(String upUserId) {
        this.upUserId = upUserId;
    }

    /**
     * 更新年月日を設定します。
     * 
     * @param upYmd
     *            更新年月日
     */
    public void setUpYmd(Timestamp upYmd) {
        this.upYmd = upYmd;
    }

    /**
     * エリアコードを設定します。
     * 
     * @param zoneCd
     *            エリアコード
     */
    public void setZoneCd(String zoneCd) {
        this.zoneCd = zoneCd;
    }

    /**
     * 造成WEB送信フラグを設定します。
     * 
     * @param zouseiSendFlg
     *            造成WEB送信フラグ
     */
    public void setZouseiSendFlg(String zouseiSendFlg) {
        this.zouseiSendFlg = zouseiSendFlg;
    }

}
