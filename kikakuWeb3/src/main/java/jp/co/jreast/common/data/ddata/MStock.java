package jp.co.jreast.common.data.ddata;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * �݌ɊǗ��}�X�^ �G���e�B�e�B
 *
 * <pre>
 *   �@�\�T�v �F
 *   ���L���� �F
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class MStock {

	/** �Z�� */
	private String address;

	/** �G���A�R�[�h */
	private String areaCd;

	/** ���ID */
	private String comId;

	/** �쐬�N���� */
	private String createYmd;

	/** �戵�萔�� */
	private String dealFee;

	/** �{�݃R�[�h */
	private String facilityCd;

	/** �ʒm��n�於 */
	private String informAreaNm;

	/** �ʒm��FAX�ԍ� */
	private String informFax;

	/** �ʒm�於 */
	private String informNm;

	/** �񓚏���� */
	private String kindFlg;

	/** ��d���� */
	private String liquidateDay;

	/** ��d���ʒm���@ */
	private String liquidateInform;

	/** ��d�������i�����ݒ莞�j�i���ԁj */
	private String liquidateTimeHour;

	/** ��d�������i�����ݒ莞�j�i���j */
	private String liquidateTimeMinute;

	/** ���l */
	private String memo;

	/** �V�K�t���O */
	private String newFlg;

	/** �X�֔ԍ� */
	private String postcode;

	/** �s���{���R�[�h */
	private String prefecturesCd;

	/** �n��R�[�h */
	private String regionCd;

	/** �\��ʒm���@ */
	private String reserveInformWay;

	/** �݌ɖ��́i�J�i�j */
	private String stockKana;

	/** �݌ɖ��́i�����j */
	private String stockKanj;

	/** �݌ɊǗ����@ */
	private String stockManagement;

	/** �݌ɔԍ� */
	private String stockNo;

	/** �d���ӏ��R�[�h */
	private String stockPlaceCd;

	/** �݌ɒP�� */
	private String stockUnit;

	/** �d�b�ԍ� */
	private String telephonNo;

	/** �X�V�t���O */
	private String updateFlg;

	/** �X�V�N���� */
	private String upYmd;

	/**
	 * �Z�����擾���܂��B
	 *
	 * @return �Z��
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * �G���A�R�[�h���擾���܂��B
	 *
	 * @return �G���A�R�[�h
	 */
	public String getAreaCd() {
		return areaCd;
	}

	/**
	 * ���ID���擾���܂��B
	 *
	 * @return ���ID
	 */
	public String getComId() {
		return comId;
	}

	/**
	 * �쐬�N�������擾���܂��B
	 *
	 * @return �쐬�N����
	 */
	public String getCreateYmd() {
		return createYmd;
	}

	/**
	 * �戵�萔�����擾���܂��B
	 *
	 * @return �戵�萔��
	 */
	public String getDealFee() {
		return dealFee;
	}

	/**
	 * �{�݃R�[�h���擾���܂��B
	 *
	 * @return �{�݃R�[�h
	 */
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * �ʒm��n�於���擾���܂��B
	 *
	 * @return �ʒm��n�於
	 */
	public String getInformAreaNm() {
		return informAreaNm;
	}

	/**
	 * �ʒm��FAX�ԍ����擾���܂��B
	 *
	 * @return �ʒm��FAX�ԍ�
	 */
	public String getInformFax() {
		return StringUtils.trim(informFax);
	}

	/**
	 * �ʒm�於���擾���܂��B
	 *
	 * @return �ʒm�於
	 */
	public String getInformNm() {
		return informNm;
	}

	/**
	 * �񓚏���ʂ��擾���܂��B
	 *
	 * @return �񓚏����
	 */
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * ��d�������擾���܂��B
	 *
	 * @return ��d����
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}

	/**
	 * ��d���ʒm���@���擾���܂��B
	 *
	 * @return ��d���ʒm���@
	 */
	public String getLiquidateInform() {
		return liquidateInform;
	}

	/**
	 * ��d�������i�����ݒ莞�j���擾���܂��B
	 *
	 * @return ��d�������i�����ݒ莞�j
	 */
	public String getLiquidateTime() {
		return KikakuWebUtil.buildTime(getLiquidateTimeHour(),
				getLiquidateTimeMinute());
	}

	/**
	 * ��d�������i�����ݒ莞�j�i���ԁj���擾���܂��B
	 *
	 * @return ��d�������i�����ݒ莞�j�i���ԁj
	 */
	public String getLiquidateTimeHour() {
		return liquidateTimeHour;
	}

	/**
	 * ��d�������i�����ݒ莞�j�i���j���擾���܂��B
	 *
	 * @return ��d�������i�����ݒ莞�j�i���j
	 */
	public String getLiquidateTimeMinute() {
		return liquidateTimeMinute;
	}

	/**
	 * ���l���擾���܂��B
	 *
	 * @return ���l
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * �V�K�t���O���擾���܂��B
	 *
	 * @return �V�K�t���O
	 */
	public String getNewFlg() {
		return newFlg;
	}

	/**
	 * �X�֔ԍ����擾���܂��B
	 *
	 * @return �X�֔ԍ�
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * �s���{���R�[�h���擾���܂��B
	 *
	 * @return �s���{���R�[�h
	 */
	public String getPrefecturesCd() {
		return prefecturesCd;
	}

	/**
	 * �n��R�[�h���擾���܂��B
	 *
	 * @return �n��R�[�h
	 */
	public String getRegionCd() {
		return regionCd;
	}

	/**
	 * �\��ʒm���@���擾���܂��B
	 *
	 * @return �\��ʒm���@
	 */
	public String getReserveInformWay() {
		return reserveInformWay;
	}

	/**
	 * �݌ɖ��́i�J�i�j���擾���܂��B
	 *
	 * @return �݌ɖ��́i�J�i�j
	 */
	public String getStockKana() {
		return stockKana;
	}

	/**
	 * �݌ɖ��́i�����j���擾���܂��B
	 *
	 * @return �݌ɖ��́i�����j
	 */
	public String getStockKanj() {
		return stockKanj;
	}

	/**
	 * �݌ɊǗ����@���擾���܂��B
	 *
	 * @return �݌ɊǗ����@
	 */
	public String getStockManagement() {
		return stockManagement;
	}

	/**
	 * �݌ɔԍ����擾���܂��B
	 *
	 * @return �݌ɔԍ�
	 */
	public String getStockNo() {
		return stockNo;
	}

	/**
	 * �d���ӏ��R�[�h���擾���܂��B
	 *
	 * @return �d���ӏ��R�[�h
	 */
	public String getStockPlaceCd() {
		return stockPlaceCd;
	}

	/**
	 * �݌ɒP�ʂ��擾���܂��B
	 *
	 * @return �݌ɒP��
	 */
	public String getStockUnit() {
		return stockUnit;
	}

	/**
	 * �d�b�ԍ����擾���܂��B
	 *
	 * @return �d�b�ԍ�
	 */
	public String getTelephonNo() {
		return StringUtils.trim(telephonNo);
	}

	/**
	 * �X�V�t���O���擾���܂��B
	 *
	 * @return �X�V�t���O
	 */
	public String getUpdateFlg() {
		return updateFlg;
	}

	/**
	 * �X�V�N�������擾���܂��B
	 *
	 * @return �X�V�N����
	 */
	public String getUpYmd() {
		return upYmd;
	}

	/**
	 * �Z����ݒ肵�܂��B
	 *
	 * @param address
	 *            �Z��
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * �G���A�R�[�h��ݒ肵�܂��B
	 *
	 * @param areaCd
	 *            �G���A�R�[�h
	 */
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	/**
	 * ���ID��ݒ肵�܂��B
	 *
	 * @param comId
	 *            ���ID
	 */
	public void setComId(String comId) {
		this.comId = comId;
	}

	/**
	 * �쐬�N������ݒ肵�܂��B
	 *
	 * @param createYmd
	 *            �쐬�N����
	 */
	public void setCreateYmd(String createYmd) {
		this.createYmd = createYmd;
	}

	/**
	 * �戵�萔����ݒ肵�܂��B
	 *
	 * @param dealFee
	 *            �戵�萔��
	 */
	public void setDealFee(String dealFee) {
		this.dealFee = dealFee;
	}

	/**
	 * �{�݃R�[�h��ݒ肵�܂��B
	 *
	 * @param facilityCd
	 *            �{�݃R�[�h
	 */
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * �ʒm��n�於��ݒ肵�܂��B
	 *
	 * @param informAreaNm
	 *            �ʒm��n�於
	 */
	public void setInformAreaNm(String informAreaNm) {
		this.informAreaNm = informAreaNm;
	}

	/**
	 * �ʒm��FAX�ԍ���ݒ肵�܂��B
	 *
	 * @param informFax
	 *            �ʒm��FAX�ԍ�
	 */
	public void setInformFax(String informFax) {
		this.informFax = informFax;
	}

	/**
	 * �ʒm�於��ݒ肵�܂��B
	 *
	 * @param informNm
	 *            �ʒm�於
	 */
	public void setInformNm(String informNm) {
		this.informNm = informNm;
	}

	/**
	 * �񓚏���ʂ�ݒ肵�܂��B
	 *
	 * @param kindFlg
	 *            �񓚏����
	 */
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}

	/**
	 * ��d������ݒ肵�܂��B
	 *
	 * @param liquidateDay
	 *            ��d����
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = liquidateDay;
	}

	/**
	 * ��d���ʒm���@��ݒ肵�܂��B
	 *
	 * @param liquidateInform
	 *            ��d���ʒm���@
	 */
	public void setLiquidateInform(String liquidateInform) {
		this.liquidateInform = liquidateInform;
	}

	/**
	 * ��d�������i�����ݒ莞�j��ݒ肵�܂��B
	 *
	 * @param liquidateTime
	 *            ��d�������i�����ݒ莞�j
	 */
	public void setLiquidateTime(String liquidateTime) {
		setLiquidateTimeHour(KikakuWebUtil.getHourFormTime(liquidateTime));
		setLiquidateTimeMinute(KikakuWebUtil.getMinuteFromTime(liquidateTime));
	}

	/**
	 * ��d�������i�����ݒ莞�j�i���ԁj��ݒ肵�܂��B
	 *
	 * @param liquidateTimeHour
	 *            ��d�������i�����ݒ莞�j�i���ԁj
	 */
	public void setLiquidateTimeHour(String liquidateTimeHour) {
		this.liquidateTimeHour = liquidateTimeHour;
	}

	/**
	 * ��d�������i�����ݒ莞�j�i���j��ݒ肵�܂��B
	 *
	 * @param liquidateTimeMinute
	 *            ��d�������i�����ݒ莞�j�i���j
	 */
	public void setLiquidateTimeMinute(String liquidateTimeMinute) {
		this.liquidateTimeMinute = liquidateTimeMinute;
	}

	/**
	 * ���l��ݒ肵�܂��B
	 *
	 * @param memo
	 *            ���l
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * �V�K�t���O��ݒ肵�܂��B
	 *
	 * @param newFlg
	 *            �V�K�t���O
	 */
	public void setNewFlg(String newFlg) {
		this.newFlg = newFlg;
	}

	/**
	 * �X�֔ԍ���ݒ肵�܂��B
	 *
	 * @param postcode
	 *            �X�֔ԍ�
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * �s���{���R�[�h��ݒ肵�܂��B
	 *
	 * @param prefecturesCd
	 *            �s���{���R�[�h
	 */
	public void setPrefecturesCd(String prefecturesCd) {
		this.prefecturesCd = prefecturesCd;
	}

	/**
	 * �G���A�R�[�h��ݒ肵�܂��B
	 *
	 * @param regionCd
	 *            �G���A�R�[�h
	 */
	public void setRegionCd(String regionCd) {
		this.regionCd = regionCd;
	}

	/**
	 * �\��ʒm���@��ݒ肵�܂��B
	 *
	 * @param reserveInformWay
	 *            �\��ʒm���@
	 */
	public void setReserveInformWay(String reserveInformWay) {
		this.reserveInformWay = reserveInformWay;
	}

	/**
	 * �݌ɖ��́i�J�i�j��ݒ肵�܂��B
	 *
	 * @param stockKana
	 *            �݌ɖ��́i�J�i�j
	 */
	public void setStockKana(String stockKana) {
		this.stockKana = stockKana;
	}

	/**
	 * �݌ɖ��́i�����j��ݒ肵�܂��B
	 *
	 * @param stockKanj
	 *            �݌ɖ��́i�����j
	 */
	public void setStockKanj(String stockKanj) {
		this.stockKanj = stockKanj;
	}

	/**
	 * �݌ɊǗ����@��ݒ肵�܂��B
	 *
	 * @param stockManagement
	 *            �݌ɊǗ����@
	 */
	public void setStockManagement(String stockManagement) {
		this.stockManagement = stockManagement;
	}

	/**
	 * �݌ɔԍ���ݒ肵�܂��B
	 *
	 * @param stockNo
	 *            �݌ɔԍ�
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}

	/**
	 * �d���ӏ��R�[�h��ݒ肵�܂��B
	 *
	 * @param stockPlaceCd
	 *            �d���ӏ��R�[�h
	 */
	public void setStockPlaceCd(String stockPlaceCd) {
		this.stockPlaceCd = stockPlaceCd;
	}

	/**
	 * �݌ɒP�ʂ�ݒ肵�܂��B
	 *
	 * @param stockUnit
	 *            �݌ɒP��
	 */
	public void setStockUnit(String stockUnit) {
		this.stockUnit = stockUnit;
	}

	/**
	 * �d�b�ԍ���ݒ肵�܂��B
	 *
	 * @param telephonNo
	 *            �d�b�ԍ�
	 */
	public void setTelephonNo(String telephonNo) {
		this.telephonNo = telephonNo;
	}

	/**
	 * �X�V�t���O��ݒ肵�܂��B
	 *
	 * @param updateFlg
	 *            �X�V�t���O
	 */
	public void setUpdateFlg(String updateFlg) {
		this.updateFlg = updateFlg;
	}

	/**
	 * �X�V�N������ݒ肵�܂��B
	 *
	 * @param upYmd
	 *            �X�V�N����
	 */
	public void setUpYmd(String upYmd) {
		this.upYmd = upYmd;
	}

}
