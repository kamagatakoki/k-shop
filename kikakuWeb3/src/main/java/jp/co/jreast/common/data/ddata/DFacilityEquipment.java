package jp.co.jreast.common.data.ddata;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.interfaces.FacilityManageBodyKey;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * [DP/RM]�{��_�ݔ� �G���e�B�e�B
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
public class DFacilityEquipment implements FacilityManageBodyKey {

	/** �����L�� */
	private String chargeFlg;

	/** �ݔ��L�� */
	private String equipmentFlg;

	/** �ݔ���� */
	private Integer equipmentKind;

	/** �{�݃R�[�h */
	private String facilityCd;

	/** �ݔ����� */
	private String facilityNum;

	/** �{�݃p�^�[�� */
	private String facilityPattern;

	/** �W������1 */
	private String genre1;

	/** �W������2 */
	private String genre2;

	/** �W������3 */
	private String genre3;

	/** �W������4 */
	private String genre4;

	/** �W������5 */
	private String genre5;

	/** �W���������̑����e1 */
	private String genreOthers1;

	/** �W���������̑����e2 */
	private String genreOthers2;

	/** �W���������̑����e3 */
	private String genreOthers3;

	/** �W���������̑����e4 */
	private String genreOthers4;

	/** �W���������̑����e5 */
	private String genreOthers5;

	/** �񓚏���� */
	private String kindFlg;

	/** LAN���p���� */
	private String lanFee;

	/** LAN�����L�� */
	private String lanFlg;

	/** LAN���p���� */
	private String lanTime;

	/** �C���^�[�l�b�g���l */
	private String netNote;

	/** �V���T�[�r�X�敪 */
	private String newspaperServiceDiv;

	/** ���ԏꗘ�p�䐔 */
	private String parkAvailableNum;

	/** ���ԏ�ꔑ���z */
	private String parkCharge;

	/** ���ԏ���l */
	private String parkNote;

	/** �R���r�j�c�ƊJ�n���ԁi���ԁj */
	private String storeBeginHour;

	/** �R���r�j�c�ƊJ�n���ԁi���j */
	private String storeBeginMinute;

	/** �R���r�j�c�ƏI�����ԁi���ԁj */
	private String storeEndHour;

	/** �R���r�j�c�ƏI�����ԁi���j */
	private String storeEndMinute;

	/** �X��1 */
	private String storeNm1;

	/** �X��2 */
	private String storeNm2;

	/** �X��3 */
	private String storeNm3;

	/** �X��4 */
	private String storeNm4;

	/** �X��5 */
	private String storeNm5;

	/** SUICA_���H�{�ݗL�� */
	private String suicaFooddrinkFlg;

	/** SUICA_���H�{�ݖ� */
	private String suicaFooddrinkNm;

	/** SUICA_�t�����g�L�� */
	private String suicaFrontFlg;

	/** SUICA_���̑��L�� */
	private String suicaOtherFlg;

	/** SUICA_���̑����l */
	private String suicaOtherNote;

	/** �Y�{���v���b�T�[�敪 */
	private String trouserPressDiv;

	/** �Y�{���v���b�T�[���l */
	private String trouserPressNote;

	/** ���p���� */
	private String useFee;

	/** ���p�\���� */
	private String usePeriod;

	/** ���p���� */
	private String useTime;

	/** WIFI���p���� */
	private String wifiFee;

	/** WIFI�����L�� */
	private String wifiFlg;

	/** WIFI���p���� */
	private String wifiTime;

	/**
	 * �R���X�g���N�^
	 */
	public DFacilityEquipment() {
		super();
	}

	/**
	 * �R���X�g���N�^
	 *
	 * @param equipmentKind
	 *            �ݔ����
	 */
	public DFacilityEquipment(Integer equipmentKind) {
		super();
		this.equipmentKind = equipmentKind;
	}

	/**
	 * �����L�����擾���܂��B
	 *
	 * @return �����L��
	 */
	public String getChargeFlg() {
		return chargeFlg;
	}

	/**
	 * �ݔ��L�����擾���܂��B
	 *
	 * @return �ݔ��L��
	 */
	public String getEquipmentFlg() {
		return equipmentFlg;
	}

	/**
	 * �ݔ���ʂ��擾���܂��B
	 *
	 * @return �ݔ����
	 */
	public Integer getEquipmentKind() {
		return equipmentKind;
	}

	/**
	 * �{�݃R�[�h���擾���܂��B
	 *
	 * @return �{�݃R�[�h
	 */
	@Override
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * �ݔ����ʂ��擾���܂��B
	 *
	 * @return �ݔ�����
	 */
	public String getFacilityNum() {
		return facilityNum;
	}

	/**
	 * �{�݃p�^�[�����擾���܂��B
	 *
	 * @return �{�݃p�^�[��
	 */
	@Override
	public String getFacilityPattern() {
		return facilityPattern;
	}

	/**
	 * �W������1���擾���܂��B
	 *
	 * @return �W������1
	 */
	public String getGenre1() {
		return genre1;
	}

	/**
	 * �W������2���擾���܂��B
	 *
	 * @return �W������2
	 */
	public String getGenre2() {
		return genre2;
	}

	/**
	 * �W������3���擾���܂��B
	 *
	 * @return �W������3
	 */
	public String getGenre3() {
		return genre3;
	}

	/**
	 * �W������4���擾���܂��B
	 *
	 * @return �W������4
	 */
	public String getGenre4() {
		return genre4;
	}

	/**
	 * �W������5���擾���܂��B
	 *
	 * @return �W������5
	 */
	public String getGenre5() {
		return genre5;
	}

	/**
	 * �W���������̑����e1���擾���܂��B
	 *
	 * @return �W���������̑����e1
	 */
	public String getGenreOthers1() {
		return genreOthers1;
	}

	/**
	 * �W���������̑����e2���擾���܂��B
	 *
	 * @return �W���������̑����e2
	 */
	public String getGenreOthers2() {
		return genreOthers2;
	}

	/**
	 * �W���������̑����e3���擾���܂��B
	 *
	 * @return �W���������̑����e3
	 */
	public String getGenreOthers3() {
		return genreOthers3;
	}

	/**
	 * �W���������̑����e4���擾���܂��B
	 *
	 * @return �W���������̑����e4
	 */
	public String getGenreOthers4() {
		return genreOthers4;
	}

	/**
	 * �W���������̑����e5���擾���܂��B
	 *
	 * @return �W���������̑����e5
	 */
	public String getGenreOthers5() {
		return genreOthers5;
	}

	/**
	 * �񓚏���ʂ��擾���܂��B
	 *
	 * @return �񓚏����
	 */
	@Override
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * LAN���p�������擾���܂��B
	 *
	 * @return LAN���p����
	 */
	public String getLanFee() {
		return lanFee;
	}

	/**
	 * LAN�����L�����擾���܂��B
	 *
	 * @return LAN�����L��
	 */
	public String getLanFlg() {
		return lanFlg;
	}

	/**
	 * LAN���p���Ԃ��擾���܂��B
	 *
	 * @return LAN���p����
	 */
	public String getLanTime() {
		return lanTime;
	}

	/**
	 * �C���^�[�l�b�g���l���擾���܂��B
	 *
	 * @return �C���^�[�l�b�g���l
	 */
	public String getNetNote() {
		return netNote;
	}

	/**
	 * �V���T�[�r�X�敪���擾���܂��B
	 *
	 * @return �V���T�[�r�X�敪
	 */
	public String getNewspaperServiceDiv() {
		return newspaperServiceDiv;
	}

	/**
	 * ���ԏꗘ�p�䐔���擾���܂��B
	 *
	 * @return ���ԏꗘ�p�䐔
	 */
	public String getParkAvailableNum() {
		return parkAvailableNum;
	}

	/**
	 * ���ԏ�ꔑ���z���擾���܂��B
	 *
	 * @return ���ԏ�ꔑ���z
	 */
	public String getParkCharge() {
		return parkCharge;
	}

	/**
	 * ���ԏ���l���擾���܂��B
	 *
	 * @return ���ԏ���l
	 */
	public String getParkNote() {
		return parkNote;
	}

	/**
	 * �R���r�j�c�ƊJ�n���Ԃ��擾���܂��B
	 *
	 * @return �R���r�j�c�ƊJ�n����
	 */
	public String getStoreBegin() {
		return KikakuWebUtil.buildTime(getStoreBeginHour(),
				getStoreBeginMinute());
	}

	/**
	 * �R���r�j�c�ƊJ�n���ԁi���ԁj���擾���܂��B
	 *
	 * @return �R���r�j�c�ƊJ�n���ԁi���ԁj
	 */
	public String getStoreBeginHour() {
		return storeBeginHour;
	}

	/**
	 * �R���r�j�c�ƊJ�n���ԁi���j���擾���܂��B
	 *
	 * @return �R���r�j�c�ƊJ�n���ԁi���j
	 */
	public String getStoreBeginMinute() {
		return storeBeginMinute;
	}

	/**
	 * �R���r�j�c�ƏI�����Ԃ��擾���܂��B
	 *
	 * @return �R���r�j�c�ƏI������
	 */
	public String getStoreEnd() {
		return KikakuWebUtil.buildTime(getStoreEndHour(), getStoreEndMinute());
	}

	/**
	 * �R���r�j�c�ƏI�����ԁi���ԁj���擾���܂��B
	 *
	 * @return �R���r�j�c�ƏI�����ԁi���ԁj
	 */
	public String getStoreEndHour() {
		return storeEndHour;
	}

	/**
	 * �R���r�j�c�ƏI�����ԁi���j���擾���܂��B
	 *
	 * @return �R���r�j�c�ƏI�����ԁi���j
	 */
	public String getStoreEndMinute() {
		return storeEndMinute;
	}

	/**
	 * �X��1���擾���܂��B
	 *
	 * @return �X��1
	 */
	public String getStoreNm1() {
		return storeNm1;
	}

	/**
	 * �X��2���擾���܂��B
	 *
	 * @return �X��2
	 */
	public String getStoreNm2() {
		return storeNm2;
	}

	/**
	 * �X��3���擾���܂��B
	 *
	 * @return �X��3
	 */
	public String getStoreNm3() {
		return storeNm3;
	}

	/**
	 * �X��4���擾���܂��B
	 *
	 * @return �X��4
	 */
	public String getStoreNm4() {
		return storeNm4;
	}

	/**
	 * �X��5���擾���܂��B
	 *
	 * @return �X��5
	 */
	public String getStoreNm5() {
		return storeNm5;
	}

	/**
	 * SUICA_���H�{�ݗL����擾���܂��B
	 *
	 * @return SUICA_���H�{�ݗL��
	 */
	public String getSuicaFooddrinkFlg() {
		return suicaFooddrinkFlg;
	}

	/**
	 * SUICA_���H�{�ݖ����擾���܂��B
	 *
	 * @return SUICA_���H�{�ݖ�
	 */
	public String getSuicaFooddrinkNm() {
		return suicaFooddrinkNm;
	}

	/**
	 * SUICA_�t�����g�L����擾���܂��B
	 *
	 * @return SUICA_�t�����g�L��
	 */
	public String getSuicaFrontFlg() {
		return suicaFrontFlg;
	}

	/**
	 * SUICA_���̑��L����擾���܂��B
	 *
	 * @return SUICA_���̑��L��
	 */
	public String getSuicaOtherFlg() {
		return suicaOtherFlg;
	}

	/**
	 * SUICA_���̑����l���擾���܂��B
	 *
	 * @return SUICA_���̑����l
	 */
	public String getSuicaOtherNote() {
		return suicaOtherNote;
	}

	/**
	 * �Y�{���v���b�T�[�敪���擾���܂��B
	 *
	 * @return �Y�{���v���b�T�[�敪
	 */
	public String getTrouserPressDiv() {
		return trouserPressDiv;
	}

	/**
	 * �Y�{���v���b�T�[���l���擾���܂��B
	 *
	 * @return �Y�{���v���b�T�[���l
	 */
	public String getTrouserPressNote() {
		return trouserPressNote;
	}

	/**
	 * ���p�������擾���܂��B
	 *
	 * @return ���p����
	 */
	public String getUseFee() {
		return useFee;
	}

	/**
	 * ���p�\���Ԃ��擾���܂��B
	 *
	 * @return ���p�\����
	 */
	public String getUsePeriod() {
		return usePeriod;
	}

	/**
	 * ���p���Ԃ��擾���܂��B
	 *
	 * @return ���p����
	 */
	public String getUseTime() {
		return useTime;
	}

	/**
	 * WIFI���p�������擾���܂��B
	 *
	 * @return WIFI���p����
	 */
	public String getWifiFee() {
		return wifiFee;
	}

	/**
	 * WIFI�����L�����擾���܂��B
	 *
	 * @return WIFI�����L��
	 */
	public String getWifiFlg() {
		return wifiFlg;
	}

	/**
	 * WIFI���p���Ԃ��擾���܂��B
	 *
	 * @return WIFI���p����
	 */
	public String getWifiTime() {
		return wifiTime;
	}

	/**
	 * �����L����ݒ肵�܂��B
	 *
	 * @param chargeFlg
	 *            �����L��
	 */
	public void setChargeFlg(String chargeFlg) {
		this.chargeFlg = chargeFlg;
	}

	/**
	 * �ݔ��L����ݒ肵�܂��B
	 *
	 * @param equipmentFlg
	 *            �ݔ��L��
	 */
	public void setEquipmentFlg(String equipmentFlg) {
		this.equipmentFlg = equipmentFlg;
	}

	/**
	 * �ݔ���ʂ�ݒ肵�܂��B
	 *
	 * @param equipmentKind
	 *            �ݔ����
	 */
	public void setEquipmentKind(Integer equipmentKind) {
		this.equipmentKind = equipmentKind;
	}

	/**
	 * �{�݃R�[�h��ݒ肵�܂��B
	 *
	 * @param facilityCd
	 *            �{�݃R�[�h
	 */
	@Override
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * �ݔ����ʂ�ݒ肵�܂��B
	 *
	 * @param facilityNum
	 *            �ݔ�����
	 */
	public void setFacilityNum(String facilityNum) {
		this.facilityNum = facilityNum;
	}

	/**
	 * �{�݃p�^�[����ݒ肵�܂��B
	 *
	 * @param facilityPattern
	 *            �{�݃p�^�[��
	 */
	@Override
	public void setFacilityPattern(String facilityPattern) {
		this.facilityPattern = facilityPattern;
	}

	/**
	 * �W������1��ݒ肵�܂��B
	 *
	 * @param genre1
	 *            �W������1
	 */
	public void setGenre1(String genre1) {
		this.genre1 = StringUtils.trim(genre1);
	}

	/**
	 * �W������2��ݒ肵�܂��B
	 *
	 * @param genre2
	 *            �W������2
	 */
	public void setGenre2(String genre2) {
		this.genre2 = StringUtils.trim(genre2);
	}

	/**
	 * �W������3��ݒ肵�܂��B
	 *
	 * @param genre3
	 *            �W������3
	 */
	public void setGenre3(String genre3) {
		this.genre3 = StringUtils.trim(genre3);
	}

	/**
	 * �W������4��ݒ肵�܂��B
	 *
	 * @param genre4
	 *            �W������4
	 */
	public void setGenre4(String genre4) {
		this.genre4 = StringUtils.trim(genre4);
	}

	/**
	 * �W������5��ݒ肵�܂��B
	 *
	 * @param genre5
	 *            �W������5
	 */
	public void setGenre5(String genre5) {
		this.genre5 = StringUtils.trim(genre5);
	}

	/**
	 * �W���������̑����e1��ݒ肵�܂��B
	 *
	 * @param genreOthers1
	 *            �W���������̑����e1
	 */
	public void setGenreOthers1(String genreOthers1) {
		this.genreOthers1 = genreOthers1;
	}

	/**
	 * �W���������̑����e2��ݒ肵�܂��B
	 *
	 * @param genreOthers2
	 *            �W���������̑����e2
	 */
	public void setGenreOthers2(String genreOthers2) {
		this.genreOthers2 = genreOthers2;
	}

	/**
	 * �W���������̑����e3��ݒ肵�܂��B
	 *
	 * @param genreOthers3
	 *            �W���������̑����e3
	 */
	public void setGenreOthers3(String genreOthers3) {
		this.genreOthers3 = genreOthers3;
	}

	/**
	 * �W���������̑����e4��ݒ肵�܂��B
	 *
	 * @param genreOthers4
	 *            �W���������̑����e4
	 */
	public void setGenreOthers4(String genreOthers4) {
		this.genreOthers4 = genreOthers4;
	}

	/**
	 * �W���������̑����e5��ݒ肵�܂��B
	 *
	 * @param genreOthers5
	 *            �W���������̑����e5
	 */
	public void setGenreOthers5(String genreOthers5) {
		this.genreOthers5 = genreOthers5;
	}

	/**
	 * �񓚏���ʂ�ݒ肵�܂��B
	 *
	 * @param kindFlg
	 *            �񓚏����
	 */
	@Override
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}

	/**
	 * LAN���p������ݒ肵�܂��B
	 *
	 * @param lanFee
	 *            LAN���p����
	 */
	public void setLanFee(String lanFee) {
		this.lanFee = lanFee;
	}

	/**
	 * LAN�����L����ݒ肵�܂��B
	 *
	 * @param lanFlg
	 *            LAN�����L��
	 */
	public void setLanFlg(String lanFlg) {
		this.lanFlg = lanFlg;
	}

	/**
	 * LAN���p���Ԃ�ݒ肵�܂��B
	 *
	 * @param lanTime
	 *            LAN���p����
	 */
	public void setLanTime(String lanTime) {
		this.lanTime = lanTime;
	}

	/**
	 * �C���^�[�l�b�g���l��ݒ肵�܂��B
	 *
	 * @param netNote
	 *            �C���^�[�l�b�g���l
	 */
	public void setNetNote(String netNote) {
		this.netNote = netNote;
	}

	/**
	 * �V���T�[�r�X�敪��ݒ肵�܂��B
	 *
	 * @param newspaperServiceDiv
	 *            �V���T�[�r�X�敪
	 */
	public void setNewspaperServiceDiv(String newspaperServiceDiv) {
		this.newspaperServiceDiv = newspaperServiceDiv;
	}

	/**
	 * ���ԏꗘ�p�䐔��ݒ肵�܂��B
	 *
	 * @param parkAvailableNum
	 *            ���ԏꗘ�p�䐔
	 */
	public void setParkAvailableNum(String parkAvailableNum) {
		this.parkAvailableNum = parkAvailableNum;
	}

	/**
	 * ���ԏ�ꔑ���z��ݒ肵�܂��B
	 *
	 * @param parkCharge
	 *            ���ԏ�ꔑ���z
	 */
	public void setParkCharge(String parkCharge) {
		this.parkCharge = parkCharge;
	}

	/**
	 * ���ԏ���l��ݒ肵�܂��B
	 *
	 * @param parkNote
	 *            ���ԏ���l
	 */
	public void setParkNote(String parkNote) {
		this.parkNote = parkNote;
	}

	/**
	 * �R���r�j�c�ƊJ�n���Ԃ�ݒ肵�܂��B
	 *
	 * @param storeBegin
	 *            �R���r�j�c�ƊJ�n����
	 */
	public void setStoreBegin(String storeBegin) {
		setStoreBeginHour(KikakuWebUtil.getHourFormTime(storeBegin));
		setStoreBeginMinute(KikakuWebUtil.getMinuteFromTime(storeBegin));
	}

	/**
	 * �R���r�j�c�ƊJ�n���ԁi���ԁj��ݒ肵�܂��B
	 *
	 * @param storeBeginHour
	 *            �R���r�j�c�ƊJ�n���ԁi���ԁj
	 */
	public void setStoreBeginHour(String storeBeginHour) {
		this.storeBeginHour = storeBeginHour;
	}

	/**
	 * �R���r�j�c�ƊJ�n���ԁi���j��ݒ肵�܂��B
	 *
	 * @param storeBeginMinute
	 *            �R���r�j�c�ƊJ�n���ԁi���j
	 */
	public void setStoreBeginMinute(String storeBeginMinute) {
		this.storeBeginMinute = storeBeginMinute;
	}

	/**
	 * �R���r�j�c�ƏI�����Ԃ�ݒ肵�܂��B
	 *
	 * @param storeEnd
	 *            �R���r�j�c�ƏI������
	 */
	public void setStoreEnd(String storeEnd) {
		setStoreEndHour(KikakuWebUtil.getHourFormTime(storeEnd));
		setStoreEndMinute(KikakuWebUtil.getMinuteFromTime(storeEnd));
	}

	/**
	 * �R���r�j�c�ƏI�����ԁi���ԁj��ݒ肵�܂��B
	 *
	 * @param storeEndHour
	 *            �R���r�j�c�ƏI�����ԁi���ԁj
	 */
	public void setStoreEndHour(String storeEndHour) {
		this.storeEndHour = storeEndHour;
	}

	/**
	 * �R���r�j�c�ƏI�����ԁi���j��ݒ肵�܂��B
	 *
	 * @param storeEndMinute
	 *            �R���r�j�c�ƏI�����ԁi���j
	 */
	public void setStoreEndMinute(String storeEndMinute) {
		this.storeEndMinute = storeEndMinute;
	}

	/**
	 * �X��1��ݒ肵�܂��B
	 *
	 * @param storeNm1
	 *            �X��1
	 */
	public void setStoreNm1(String storeNm1) {
		this.storeNm1 = storeNm1;
	}

	/**
	 * �X��2��ݒ肵�܂��B
	 *
	 * @param storeNm2
	 *            �X��2
	 */
	public void setStoreNm2(String storeNm2) {
		this.storeNm2 = storeNm2;
	}

	/**
	 * �X��3��ݒ肵�܂��B
	 *
	 * @param storeNm3
	 *            �X��3
	 */
	public void setStoreNm3(String storeNm3) {
		this.storeNm3 = storeNm3;
	}

	/**
	 * �X��4��ݒ肵�܂��B
	 *
	 * @param storeNm4
	 *            �X��4
	 */
	public void setStoreNm4(String storeNm4) {
		this.storeNm4 = storeNm4;
	}

	/**
	 * �X��5��ݒ肵�܂��B
	 *
	 * @param storeNm5
	 *            �X��5
	 */
	public void setStoreNm5(String storeNm5) {
		this.storeNm5 = storeNm5;
	}

	/**
	 * SUICA_���H�{�ݗL���ݒ肵�܂��B
	 *
	 * @param suicaFooddrinkFlg
	 *            SUICA_���H�{�ݗL��
	 */
	public void setSuicaFooddrinkFlg(String suicaFooddrinkFlg) {
		this.suicaFooddrinkFlg = suicaFooddrinkFlg;
	}

	/**
	 * SUICA_���H�{�ݖ���ݒ肵�܂��B
	 *
	 * @param suicaFooddrinkNm
	 *            SUICA_���H�{�ݖ�
	 */
	public void setSuicaFooddrinkNm(String suicaFooddrinkNm) {
		this.suicaFooddrinkNm = suicaFooddrinkNm;
	}

	/**
	 * SUICA_�t�����g�L���ݒ肵�܂��B
	 *
	 * @param suicaFrontFlg
	 *            SUICA_�t�����g�L��
	 */
	public void setSuicaFrontFlg(String suicaFrontFlg) {
		this.suicaFrontFlg = suicaFrontFlg;
	}

	/**
	 * SUICA_���̑��L���ݒ肵�܂��B
	 *
	 * @param suicaOtherFlg
	 *            SUICA_���̑��L��
	 */
	public void setSuicaOtherFlg(String suicaOtherFlg) {
		this.suicaOtherFlg = suicaOtherFlg;
	}

	/**
	 * SUICA_���̑����l��ݒ肵�܂��B
	 *
	 * @param suicaOtherNote
	 *            SUICA_���̑����l
	 */
	public void setSuicaOtherNote(String suicaOtherNote) {
		this.suicaOtherNote = suicaOtherNote;
	}

	/**
	 * �Y�{���v���b�T�[�敪��ݒ肵�܂��B
	 *
	 * @param trouserPressDiv
	 *            �Y�{���v���b�T�[�敪
	 */
	public void setTrouserPressDiv(String trouserPressDiv) {
		this.trouserPressDiv = trouserPressDiv;
	}

	/**
	 * �Y�{���v���b�T�[���l��ݒ肵�܂��B
	 *
	 * @param trouserPressNote
	 *            �Y�{���v���b�T�[���l
	 */
	public void setTrouserPressNote(String trouserPressNote) {
		this.trouserPressNote = trouserPressNote;
	}

	/**
	 * ���p������ݒ肵�܂��B
	 *
	 * @param useFee
	 *            ���p����
	 */
	public void setUseFee(String useFee) {
		this.useFee = useFee;
	}

	/**
	 * ���p�\���Ԃ�ݒ肵�܂��B
	 *
	 * @param usePeriod
	 *            ���p�\����
	 */
	public void setUsePeriod(String usePeriod) {
		this.usePeriod = usePeriod;
	}

	/**
	 * ���p���Ԃ�ݒ肵�܂��B
	 *
	 * @param useTime
	 *            ���p����
	 */
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	/**
	 * WIFI���p������ݒ肵�܂��B
	 *
	 * @param wifiFee
	 *            WIFI���p����
	 */
	public void setWifiFee(String wifiFee) {
		this.wifiFee = wifiFee;
	}

	/**
	 * WIFI�����L����ݒ肵�܂��B
	 *
	 * @param wifiFlg
	 *            WIFI�����L��
	 */
	public void setWifiFlg(String wifiFlg) {
		this.wifiFlg = wifiFlg;
	}

	/**
	 * WIFI���p���Ԃ�ݒ肵�܂��B
	 *
	 * @param wifiTime
	 *            WIFI���p����
	 */
	public void setWifiTime(String wifiTime) {
		this.wifiTime = wifiTime;
	}

}
