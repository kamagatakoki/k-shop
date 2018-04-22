package jp.co.jreast.common.data;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import jp.co.intage.framework.util.StringUtil;

/**
 * <pre>
 * �{�ݏ��}�X�^�f�[�^�N���X�B.
 * �@�\�T�v    �F  �{�ݏ��}�X�^�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/10/27
 */
public class FacilityData {

	/**
	 * �Z��.
	 */
	private String address;

	/**
	 * �n��R�[�h.
	 */
	private String areaCd;

	/** �n��啪�� */
	private String areaDaiCd;

	/** �n�揬���� */
	private String areaShoCd;

	/**
	 * �g�p��~�t���O.
	 */
	private String closeFlg;

	/**
	 * �_����
	 */
	private String contractKind;

	/**
	 * �쐬�N����.
	 */
	private Date createYmd;

	/**
	 * �{�݃R�[�h.
	 */
	private String facilityCd;

	/**
	 * �{�ݖ���.
	 */
	private String facilityNm;

	/**
	 * �{�ݖ��́i�J�i�j.
	 */
	private String facilityNmKana;

	/**
	 * �{��URL
	 */
	private String facilityUrl;

	/**
	 * FAX�ԍ�.
	 */
	private String faxNo;

	/**
	 * �戵�i�̔��j�萔��.
	 */
	private String handlingTax;

	/**
	 * �戵�i�̔��j�萔���iDP�j
	 */
	private String handlingTaxDp;

	/**
	 * �戵�i�̔��j�萔���iRM/SP�j
	 */
	private String handlingTaxRmsp;

	/**
	 * �萔���^�C�v.
	 */
	private String handlingTaxType;

	/**
	 * ���.
	 */
	private String kind;

	/**
	 * ��\�Җ�.
	 */
	private String ownerNm;

	/**
	 * �X�֔ԍ�.
	 */
	private String postcode;

	/**
	 * �s���{���R�[�h.
	 */
	private String prefecturesCd;

	/**
	 * ���t�敪�R�[�h.
	 */
	private Integer sendDivCd;

	/**
	 * ���t��FAX�ԍ�.
	 */
	private String sendFaxNo;

	/**
	 * ���t�惁�[���A�h���X.
	 */
	private String sendMailAdress;

	/**
	 * �����Łi��l�j.
	 */
	private String spaTaxAdlt;

	/**
	 * �����Łi���l�j.
	 */
	private String spaTaxChild;

	/**
	 * �d���x�ЃR�[�h.
	 */
	private String stockBranchCd;

	/**
	 * �d�b�ԍ�.
	 */
	private String telephonNo;

	/**
	 * �p�\�R��.
	 */
	private String terminalNo;

	/**
	 * �����s�h���Ńt���O
	 */
	private String tyoStayTaxFlg;

	/**
	 * �X�V�N���� .
	 */
	private Date upYmd;

	/**
	 * @return �Z��
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return �n��R�[�h
	 */
	public String getAreaCd() {
		return areaCd;
	}

	/**
	 * �n��啪�ނ��擾���܂��B
	 *
	 * @return �n��啪��
	 */
	public String getAreaDaiCd() {
		return areaDaiCd;
	}

	/**
	 * �n�揬���ނ��擾���܂��B
	 *
	 * @return �n�揬����
	 */
	public String getAreaShoCd() {
		return areaShoCd;
	}

	/**
	 * �w�茅�����̎擾
	 *
	 * @param str
	 *            ������
	 * @param pos
	 *            �w��ʒu
	 * @return ������̎w��ʒu�ɂ��镶���Bnull�̏ꍇ�͋� "" ��ԋp����B
	 */
	private String getCharAt(String str, int pos) {
		if (StringUtils.isEmpty(str)) {
			return StringUtils.EMPTY;
		}
		return StringUtils.mid(str, pos, 1);
	}

	/**
	 * @return �g�p��~�t���O
	 */
	public String getCloseFlg() {
		return closeFlg;
	}

	/**
	 * �_���ʂ��擾���܂��B
	 *
	 * @return �_����
	 */
	public String getContractKind() {
		return contractKind;
	}

	/**
	 * @return �쐬�N����
	 */
	public Date getCreateYmd() {
		return createYmd;
	}

	/**
	 * @return �{�݃R�[�h
	 */
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * @return �{�݃R�[�h��1����
	 */
	public String getFacilityCd1() {
		return getCharAt(facilityCd, 0);
	}

	/**
	 * @return �{�݃R�[�h��2����
	 */
	public String getFacilityCd2() {
		return getCharAt(facilityCd, 1);
	}

	/**
	 * @return �{�݃R�[�h��3����
	 */
	public String getFacilityCd3() {
		return getCharAt(facilityCd, 2);
	}

	/**
	 * @return �{�݃R�[�h��4����
	 */
	public String getFacilityCd4() {
		return getCharAt(facilityCd, 3);
	}

	/**
	 * @return �{�݃R�[�h��5����
	 */
	public String getFacilityCd5() {
		return getCharAt(facilityCd, 4);
	}

	/**
	 * @return �{�݃R�[�h��6����
	 */
	public String getFacilityCd6() {
		return getCharAt(facilityCd, 5);
	}

	/**
	 * @return �{�ݖ���
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
	 * �{��URL���擾���܂��B
	 *
	 * @return �{��URL
	 */
	public String getFacilityUrl() {
		return facilityUrl;
	}

	/**
	 * @return ���t��FAX�ԍ�
	 */
	public String getFaxNo() {
		return faxNo;
	}

	/**
	 * �O�S���{�݃R�[�h���擾����.
	 *
	 * @return �O�S���{�݃R�[�h
	 */
	public String getFourFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(0, 4);
		}
		return null;
	}

	/**
	 * @return �戵�i�̔��j�萔��
	 */
	public String getHandlingTax() {
		return handlingTax;
	}

	/**
	 * �戵�i�̔��j�萔���iDP�j���擾���܂��B
	 *
	 * @return �戵�i�̔��j�萔���iDP�j
	 */
	public String getHandlingTaxDp() {
		return handlingTaxDp;
	}

	/**
	 * �戵�i�̔��j�萔���iRM/SP�j���擾���܂��B
	 *
	 * @return �戵�i�̔��j�萔���iRM/SP�j
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
	 * @return ���
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @return ��\�Җ�
	 */
	public String getOwnerNm() {
		return ownerNm;
	}

	/**
	 * @return �X�֔ԍ�
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @return �s���{���R�[�h
	 */
	public String getPrefecturesCd() {
		return prefecturesCd;
	}

	/**
	 * @return ���t�敪�R�[�h
	 */
	public Integer getSendDivCd() {
		return sendDivCd;
	}

	/**
	 * @return ���t��FAX�ԍ�
	 */
	public String getSendFaxNo() {
		return sendFaxNo;
	}

	/**
	 * @return ���t�惁�[���A�h���X
	 */
	public String getSendMailAdress() {
		return sendMailAdress;
	}

	/**
	 * @return �����Łi��l�j
	 */
	public String getSpaTaxAdlt() {
		return spaTaxAdlt;
	}

	/**
	 * @return �����Łi���l�j
	 */
	public String getSpaTaxChild() {
		return spaTaxChild;
	}

	/**
	 * @return �d���x�ЃR�[�h
	 */
	public String getStockBranchCd() {
		return stockBranchCd;
	}

	/**
	 * @return �d�b�ԍ�
	 */
	public String getTelephonNo() {
		return telephonNo;
	}

	/**
	 * @return �p�\�R��
	 */
	public String getTerminalNo() {
		return terminalNo;
	}

	/**
	 * ��Q���{�݃R�[�h���擾����.
	 *
	 * @return ��Q���{�݃R�[�h
	 */
	public String getTwoFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(4, 6);
		}
		return null;
	}

	/**
	 * �����s�h���Ńt���O���擾���܂��B
	 *
	 * @return �����s�h���Ńt���O
	 */
	public String getTyoStayTaxFlg() {
		return tyoStayTaxFlg;
	}

	/**
	 * @return �X�V�N����
	 */
	public Date getUpYmd() {
		return upYmd;
	}

	/**
	 * @param address
	 *            �Z��
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param areaCd
	 *            �n��R�[�h
	 */
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	/**
	 * �n��啪�ނ�ݒ肵�܂��B
	 *
	 * @param areaDaiCd
	 *            �n��啪��
	 */
	public void setAreaDaiCd(String areaDaiCd) {
		this.areaDaiCd = areaDaiCd;
	}

	/**
	 * �n�揬���ނ�ݒ肵�܂��B
	 *
	 * @param areaShoCd
	 *            �n�揬����
	 */
	public void setAreaShoCd(String areaShoCd) {
		this.areaShoCd = areaShoCd;
	}

	/**
	 * @param closeFlg
	 *            �g�p��~�t���O
	 */
	public void setCloseFlg(String closeFlg) {
		this.closeFlg = closeFlg;
	}

	/**
	 * �_���ʂ�ݒ肵�܂��B
	 *
	 * @param contractKind
	 *            �_����
	 */
	public void setContractKind(String contractKind) {
		this.contractKind = contractKind;
	}

	/**
	 * @param createYmd
	 *            �쐬�N����
	 */
	public void setCreateYmd(Date createYmd) {
		this.createYmd = createYmd;
	}

	/**
	 * @param facilityCd
	 *            �{�݃R�[�h
	 */
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * @param facilityNm
	 *            �{�ݖ���
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
	 * �{��URL��ݒ肵�܂��B
	 *
	 * @param facilityUrl
	 *            �{��URL
	 */
	public void setFacilityUrl(String facilityUrl) {
		this.facilityUrl = facilityUrl;
	}

	/**
	 * @param faxNo
	 *            ���t��FAX�ԍ�
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * @param handlingTax
	 *            �戵�i�̔��j�萔��
	 */
	public void setHandlingTax(String handlingTax) {
		this.handlingTax = handlingTax;
	}

	/**
	 * �戵�i�̔��j�萔���iDP�j��ݒ肵�܂��B
	 *
	 * @param handlingTaxDp
	 *            �戵�i�̔��j�萔���iDP�j
	 */
	public void setHandlingTaxDp(String handlingTaxDp) {
		this.handlingTaxDp = handlingTaxDp;
	}

	/**
	 * �戵�i�̔��j�萔���iRM/SP�j��ݒ肵�܂��B
	 *
	 * @param handlingTaxRmSp
	 *            �戵�i�̔��j�萔���iRM/SP�j
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
	 *            ���
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @param ownerNm
	 *            ��\�Җ�
	 */
	public void setOwnerNm(String ownerNm) {
		this.ownerNm = ownerNm;
	}

	/**
	 * @param postcode
	 *            �X�֔ԍ�
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * @param prefecturesCd
	 *            �s���{���R�[�h
	 */
	public void setPrefecturesCd(String prefecturesCd) {
		this.prefecturesCd = prefecturesCd;
	}

	/**
	 * @param sendDivCd
	 *            ���t�敪�R�[�h
	 */
	public void setSendDivCd(Integer sendDivCd) {
		this.sendDivCd = sendDivCd;
	}

	/**
	 * @param sendFaxNo
	 *            ���t��FAX�ԍ�
	 */
	public void setSendFaxNo(String sendFaxNo) {
		this.sendFaxNo = sendFaxNo;
	}

	/**
	 * @param sendMailAdress
	 *            ���t�惁�[���A�h���X
	 */
	public void setSendMailAdress(String sendMailAdress) {
		this.sendMailAdress = sendMailAdress;
	}

	/**
	 * @param spaTaxAdlt
	 *            �����Łi��l�j
	 */
	public void setSpaTaxAdlt(String spaTaxAdlt) {
		this.spaTaxAdlt = spaTaxAdlt;
	}

	/**
	 * @param spaTaxChild
	 *            �����Łi���l�j
	 */
	public void setSpaTaxChild(String spaTaxChild) {
		this.spaTaxChild = spaTaxChild;
	}

	/**
	 * @param stockBranchCd
	 *            �d���x�ЃR�[�h
	 */
	public void setStockBranchCd(String stockBranchCd) {
		this.stockBranchCd = stockBranchCd;
	}

	/**
	 * @param telephonNo
	 *            �d�b�ԍ�
	 */
	public void setTelephonNo(String telephonNo) {
		this.telephonNo = telephonNo;
	}

	/**
	 * @param terminalNo
	 *            �p�\�R��
	 */
	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
	}

	/**
	 * �����s�h���Ńt���O��ݒ肵�܂��B
	 *
	 * @param tyoStayTaxFlg
	 *            �����s�h���Ńt���O
	 */
	public void setTyoStayTaxFlg(String tyoStayTaxFlg) {
		this.tyoStayTaxFlg = tyoStayTaxFlg;
	}

	/**
	 * @param upYmd
	 *            �X�V�N����
	 */
	public void setUpYmd(Date upYmd) {
		this.upYmd = upYmd;
	}
}
