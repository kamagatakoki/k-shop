package jp.co.jreast.common.data;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import jp.co.intage.framework.util.StringUtil;

/**
 * <pre>
 * 施設情報マスタデータクラス。.
 * 機能概要    ：  施設情報マスタデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/10/27
 */
public class FacilityData {

	/**
	 * 住所.
	 */
	private String address;

	/**
	 * 地区コード.
	 */
	private String areaCd;

	/** 地区大分類 */
	private String areaDaiCd;

	/** 地区小分類 */
	private String areaShoCd;

	/**
	 * 使用停止フラグ.
	 */
	private String closeFlg;

	/**
	 * 契約種別
	 */
	private String contractKind;

	/**
	 * 作成年月日.
	 */
	private Date createYmd;

	/**
	 * 施設コード.
	 */
	private String facilityCd;

	/**
	 * 施設名称.
	 */
	private String facilityNm;

	/**
	 * 施設名称（カナ）.
	 */
	private String facilityNmKana;

	/**
	 * 施設URL
	 */
	private String facilityUrl;

	/**
	 * FAX番号.
	 */
	private String faxNo;

	/**
	 * 取扱（販売）手数料.
	 */
	private String handlingTax;

	/**
	 * 取扱（販売）手数料（DP）
	 */
	private String handlingTaxDp;

	/**
	 * 取扱（販売）手数料（RM/SP）
	 */
	private String handlingTaxRmsp;

	/**
	 * 手数料タイプ.
	 */
	private String handlingTaxType;

	/**
	 * 種別.
	 */
	private String kind;

	/**
	 * 代表者名.
	 */
	private String ownerNm;

	/**
	 * 郵便番号.
	 */
	private String postcode;

	/**
	 * 都道府県コード.
	 */
	private String prefecturesCd;

	/**
	 * 送付区分コード.
	 */
	private Integer sendDivCd;

	/**
	 * 送付先FAX番号.
	 */
	private String sendFaxNo;

	/**
	 * 送付先メールアドレス.
	 */
	private String sendMailAdress;

	/**
	 * 入湯税（大人）.
	 */
	private String spaTaxAdlt;

	/**
	 * 入湯税（小人）.
	 */
	private String spaTaxChild;

	/**
	 * 仕入支社コード.
	 */
	private String stockBranchCd;

	/**
	 * 電話番号.
	 */
	private String telephonNo;

	/**
	 * パソコン.
	 */
	private String terminalNo;

	/**
	 * 東京都宿泊税フラグ
	 */
	private String tyoStayTaxFlg;

	/**
	 * 更新年月日 .
	 */
	private Date upYmd;

	/**
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
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
	 * 指定桁文字の取得
	 *
	 * @param str
	 *            文字列
	 * @param pos
	 *            指定位置
	 * @return 文字列の指定位置にある文字。nullの場合は空白 "" を返却する。
	 */
	private String getCharAt(String str, int pos) {
		if (StringUtils.isEmpty(str)) {
			return StringUtils.EMPTY;
		}
		return StringUtils.mid(str, pos, 1);
	}

	/**
	 * @return 使用停止フラグ
	 */
	public String getCloseFlg() {
		return closeFlg;
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
	 * @return 作成年月日
	 */
	public Date getCreateYmd() {
		return createYmd;
	}

	/**
	 * @return 施設コード
	 */
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * @return 施設コードの1桁目
	 */
	public String getFacilityCd1() {
		return getCharAt(facilityCd, 0);
	}

	/**
	 * @return 施設コードの2桁目
	 */
	public String getFacilityCd2() {
		return getCharAt(facilityCd, 1);
	}

	/**
	 * @return 施設コードの3桁目
	 */
	public String getFacilityCd3() {
		return getCharAt(facilityCd, 2);
	}

	/**
	 * @return 施設コードの4桁目
	 */
	public String getFacilityCd4() {
		return getCharAt(facilityCd, 3);
	}

	/**
	 * @return 施設コードの5桁目
	 */
	public String getFacilityCd5() {
		return getCharAt(facilityCd, 4);
	}

	/**
	 * @return 施設コードの6桁目
	 */
	public String getFacilityCd6() {
		return getCharAt(facilityCd, 5);
	}

	/**
	 * @return 施設名称
	 */
	public String getFacilityNm() {
		return facilityNm;
	}

	/**
	 * @return Returns the facilityNmKana.
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
	 * @return 送付先FAX番号
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * 前４枚施設コードを取得する.
	 *
	 * @return 前４枚施設コード
	 */
	public String getFourFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(0, 4);
		}
		return null;
	}

	/**
	 * @return 取扱（販売）手数料
	 */
	public String getHandlingTax() {
		return handlingTax;
	}

	/**
	 * 取扱（販売）手数料（DP）を取得します。
	 *
	 * @return 取扱（販売）手数料（DP）
	 */
	public String getHandlingTaxDp() {
		return handlingTaxDp;
	}

	/**
	 * 取扱（販売）手数料（RM/SP）を取得します。
	 *
	 * @return 取扱（販売）手数料（RM/SP）
	 */
	public String getHandlingTaxRmsp() {
		return handlingTaxRmsp;
	}

	/**
	 * @return Returns the handlingTaxType.
	 */
	public String getHandlingTaxType() {
		return handlingTaxType;
	}

	/**
	 * @return 種別
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @return 代表者名
	 */
	public String getOwnerNm() {
		return ownerNm;
	}

	/**
	 * @return 郵便番号
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @return 都道府県コード
	 */
	public String getPrefecturesCd() {
		return prefecturesCd;
	}

	/**
	 * @return 送付区分コード
	 */
	public Integer getSendDivCd() {
		return sendDivCd;
	}

	/**
	 * @return 送付先FAX番号
	 */
	public String getSendFaxNo() {
		return sendFaxNo;
	}

	/**
	 * @return 送付先メールアドレス
	 */
	public String getSendMailAdress() {
		return sendMailAdress;
	}

	/**
	 * @return 入湯税（大人）
	 */
	public String getSpaTaxAdlt() {
		return spaTaxAdlt;
	}

	/**
	 * @return 入湯税（小人）
	 */
	public String getSpaTaxChild() {
		return spaTaxChild;
	}

	/**
	 * @return 仕入支社コード
	 */
	public String getStockBranchCd() {
		return stockBranchCd;
	}

	/**
	 * @return 電話番号
	 */
	public String getTelephonNo() {
		return telephonNo;
	}

	/**
	 * @return パソコン
	 */
	public String getTerminalNo() {
		return terminalNo;
	}

	/**
	 * 後２枚施設コードを取得する.
	 *
	 * @return 後２枚施設コード
	 */
	public String getTwoFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(4, 6);
		}
		return null;
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
	 * @return 更新年月日
	 */
	public Date getUpYmd() {
		return upYmd;
	}

	/**
	 * @param address
	 *            住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
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
	 * @param closeFlg
	 *            使用停止フラグ
	 */
	public void setCloseFlg(String closeFlg) {
		this.closeFlg = closeFlg;
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
	 * @param createYmd
	 *            作成年月日
	 */
	public void setCreateYmd(Date createYmd) {
		this.createYmd = createYmd;
	}

	/**
	 * @param facilityCd
	 *            施設コード
	 */
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * @param facilityNm
	 *            施設名称
	 */
	public void setFacilityNm(String facilityNm) {
		this.facilityNm = facilityNm;
	}

	/**
	 * @param facilityNmKana
	 *            The facilityNmKana to set.
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
	 * @param faxNo
	 *            送付先FAX番号
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @param handlingTax
	 *            取扱（販売）手数料
	 */
	public void setHandlingTax(String handlingTax) {
		this.handlingTax = handlingTax;
	}

	/**
	 * 取扱（販売）手数料（DP）を設定します。
	 *
	 * @param handlingTaxDp
	 *            取扱（販売）手数料（DP）
	 */
	public void setHandlingTaxDp(String handlingTaxDp) {
		this.handlingTaxDp = handlingTaxDp;
	}

	/**
	 * 取扱（販売）手数料（RM/SP）を設定します。
	 *
	 * @param handlingTaxRmSp
	 *            取扱（販売）手数料（RM/SP）
	 */
	public void setHandlingTaxRmsp(String handlingTaxRmSp) {
		this.handlingTaxRmsp = handlingTaxRmSp;
	}

	/**
	 * @param handlingTaxType
	 *            The handlingTaxType to set.
	 */
	public void setHandlingTaxType(String handlingTaxType) {
		this.handlingTaxType = handlingTaxType;
	}

	/**
	 * @param kind
	 *            種別
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @param ownerNm
	 *            代表者名
	 */
	public void setOwnerNm(String ownerNm) {
		this.ownerNm = ownerNm;
	}

	/**
	 * @param postcode
	 *            郵便番号
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * @param prefecturesCd
	 *            都道府県コード
	 */
	public void setPrefecturesCd(String prefecturesCd) {
		this.prefecturesCd = prefecturesCd;
	}

	/**
	 * @param sendDivCd
	 *            送付区分コード
	 */
	public void setSendDivCd(Integer sendDivCd) {
		this.sendDivCd = sendDivCd;
	}

	/**
	 * @param sendFaxNo
	 *            送付先FAX番号
	 */
	public void setSendFaxNo(String sendFaxNo) {
		this.sendFaxNo = sendFaxNo;
	}

	/**
	 * @param sendMailAdress
	 *            送付先メールアドレス
	 */
	public void setSendMailAdress(String sendMailAdress) {
		this.sendMailAdress = sendMailAdress;
	}

	/**
	 * @param spaTaxAdlt
	 *            入湯税（大人）
	 */
	public void setSpaTaxAdlt(String spaTaxAdlt) {
		this.spaTaxAdlt = spaTaxAdlt;
	}

	/**
	 * @param spaTaxChild
	 *            入湯税（小人）
	 */
	public void setSpaTaxChild(String spaTaxChild) {
		this.spaTaxChild = spaTaxChild;
	}

	/**
	 * @param stockBranchCd
	 *            仕入支社コード
	 */
	public void setStockBranchCd(String stockBranchCd) {
		this.stockBranchCd = stockBranchCd;
	}

	/**
	 * @param telephonNo
	 *            電話番号
	 */
	public void setTelephonNo(String telephonNo) {
		this.telephonNo = telephonNo;
	}

	/**
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
	 * @param upYmd
	 *            更新年月日
	 */
	public void setUpYmd(Date upYmd) {
		this.upYmd = upYmd;
	}
}
