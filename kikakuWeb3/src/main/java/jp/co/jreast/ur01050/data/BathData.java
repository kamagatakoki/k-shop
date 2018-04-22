package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 * �����C���f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class BathData {
	
	/**
	 * ���񓚘A�� .
	 */
	private Long planAnsNo;

	/**
	 * ����ԍ� .
	 */
	private Integer careerNo;

	/**
	 * ���C�敪 .
	 */
	private Integer bathDiv;

	/**
	 * ���C��� .
	 */
	private Integer bathKind;

	/**
	 * ���C�L�� .
	 */
	private String bathFlg;

	/**
	 * �V�R����E���̑� .
	 */
	private Integer naturalSpa;

	/**
	 * �� .
	 */
	private String spaQuality;

	/**
	 * ���򉷓x .
	 */
	private String spaTemp;

	/**
	 * ���ƌ���L�� .
	 */
	private String selfSpringFlg;

	/**
	 * ��������L�� .
	 */
	private String shareSpringFlg;

	/**
	 * �������� .
	 */
	private String shareSpringNm;

	/**
	 * ���̑�����R�����g .
	 */
	private String otherSpringCmt;

	/**
	 * �N�o��� .
	 */
	private String pourStatus;

	/**
	 * �N�o��ԃR�����g .
	 */
	private String pourStatusCmt;

	/**
	 * ���򂩂������L�� .
	 */
	private String spaFlowFlg;

	/**
	 * ����z���L�� .
	 */
	private String recircleKindFlg;

	/**
	 * ��������L��L�� .
	 */
	private String warmingFlg;

	/**
	 * ������ŗL��L�� .
	 */
	private String disinfectFlg;

	/**
	 * �����ւ̓��ʃR���g���[���L�� .
	 */
	private String waterControlFlg;

	/**
	 * ���F .
	 */
	private String colour;

	/**
	 * ���F�R�����g .
	 */
	private String colourCmt;

	/**
	 * ���\ .
	 */
	private String effect;

	/**
	 * �j���ӏ����� .
	 */
	private String maleSiteNum;

	/**
	 * �j���ӏ����� .
	 */
	private String maleSiteNm;

	/**
	 * �j�����ԋ敪 .
	 */
	private String maleTimeDiv;

	/**
	 * �j���J�n����1�F���� .
	 */
	private String maleTimeFrom1Hour;
	
	/**
	 * �j���J�n����1�F�� .
	 */
	private String maleTimeFrom1Minute;


	/**
	 * �j���I������1:���� .
	 */
	private String maleTimeTo1Hour;
	
	/**
	 * �j���I������1:�� .
	 */
	private String maleTimeTo1Minute;

	/**
	 * �j���J�n����2�F���� .
	 */
	private String maleTimeFrom2Hour;
	
	/**
	 * �j���J�n����2�F�� .
	 */
	private String maleTimeFrom2Minute;


	/**
	 * �j���I������2:���� .
	 */
	private String maleTimeTo2Hour;
	
	/**
	 * �j���I������2:�� .
	 */
	private String maleTimeTo2Minute;

	/**
	 * �j���J�n����3�F���� .
	 */
	private String maleTimeFrom3Hour;
	
	/**
	 * �j���J�n����3�F�� .
	 */
	private String maleTimeFrom3Minute;


	/**
	 * �j���I������3:���� .
	 */
	private String maleTimeTo3Hour;
	
	/**
	 * �j���I������3:�� .
	 */
	private String maleTimeTo3Minute;

	/**
	 * �����ӏ����� .
	 */
	private String femaleSiteNum;

	/**
	 * �����ӏ����� .
	 */
	private String femaleSiteNm;

	/**
	 * �������ԋ敪 .
	 */
	private String femaleTimeDiv;
	
	/**
	 * �����J�n���ԂP�F���� .
	 */
	private String femaleTimeFrom1Hour;
	
	/**
	 * �����J�n���ԂP�F�� .
	 */
	private String femaleTimeFrom1Minute;

	/**
	 * �����I������1:���� .
	 */
	private String femaleTimeTo1Hour;
	
	/**
	 * �����I������1:�� .
	 */
	private String femaleTimeTo1Minute;	
	
	/**
	 * �����J�n����2�F���� .
	 */
	private String femaleTimeFrom2Hour;
	
	/**
	 * �����J�n����2�F�� .
	 */
	private String femaleTimeFrom2Minute;


	/**
	 * �����I������2:���� .
	 */
	private String femaleTimeTo2Hour;
	
	/**
	 * �����I������2:�� .
	 */
	private String femaleTimeTo2Minute;
	
	/**
	 * �����J�n����3�F���� .
	 */
	private String femaleTimeFrom3Hour;
	
	/**
	 * �����J�n����3�F�� .
	 */
	private String femaleTimeFrom3Minute;


	/**
	 * �����I������3:���� .
	 */
	private String femaleTimeTo3Hour;
	
	/**
	 * �����I������3:�� .
	 */
	private String femaleTimeTo3Minute;
	
	/**
	 * ������p�L�� .
	 */
	private String femaleOnlyFlg;

	/**
	 * ����֐��L�� .
	 */
	private Integer shiftFlg;

	/**
	 * ���؉ӏ����� .
	 */
	private String rentalSiteNum;

	/**
	 * ���ؗL���L�� .
	 */
	private String rentalPayFlg;

	/**
	 * ���؎��� .
	 */
	private String rentalTime;

	/**
	 * ���ؗ��� .
	 */
	private String rentalFees;

	/**
	 * ���ؗ\��敪 .
	 */
	private Integer rentalReserveDiv;

	/**
	 * @return ���C�敪
	 */
	public Integer getBathDiv() {
		return bathDiv;
	}

	/**
	 * @param bathDiv ���C�敪
	 */
	public void setBathDiv(Integer bathDiv) {
		this.bathDiv = bathDiv;
	}

	/**
	 * @return ���C�L��
	 */
	public String getBathFlg() {
		return bathFlg;
	}

	/**
	 * @param bathFlg ���C�L��
	 */
	public void setBathFlg(String bathFlg) {
		this.bathFlg = bathFlg;
	}

	/**
	 * @return ���C���
	 */
	public Integer getBathKind() {
		return bathKind;
	}

	/**
	 * @param bathKind ���C���
	 */
	public void setBathKind(Integer bathKind) {
		this.bathKind = bathKind;
	}

	/**
	 * @return ����ԍ�
	 */
	public Integer getCareerNo() {
		return careerNo;
	}

	/**
	 * @param careerNo ����ԍ�
	 */
	public void setCareerNo(Integer careerNo) {
		this.careerNo = careerNo;
	}

	/**
	 * @return ���F
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour ���F
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return ���F�R�����g
	 */
	public String getColourCmt() {
		return colourCmt;
	}

	/**
	 * @param colourCmt ���F�R�����g
	 */
	public void setColourCmt(String colourCmt) {
		this.colourCmt = colourCmt;
	}

	/**
	 * @return ������ŗL��L��
	 */
	public String getDisinfectFlg() {
		return disinfectFlg;
	}

	/**
	 * @param disinfectFlg ������ŗL��L��
	 */
	public void setDisinfectFlg(String disinfectFlg) {
		this.disinfectFlg = disinfectFlg;
	}

	/**
	 * @return ���\
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * @param effect ���\
	 */
	public void setEffect(String effect) {
		this.effect = effect;
	}

	/**
	 * @return �����ӏ�����
	 */
	public String getFemaleSiteNm() {
		return femaleSiteNm;
	}

	/**
	 * @param femaleSiteNm �����ӏ�����
	 */
	public void setFemaleSiteNm(String femaleSiteNm) {
		this.femaleSiteNm = femaleSiteNm;
	}

	/**
	 * @return �����ӏ�����
	 */
	public String getFemaleSiteNum() {
		return femaleSiteNum;
	}

	/**
	 * @param femaleSiteNum �����ӏ�����
	 */
	public void setFemaleSiteNum(String femaleSiteNum) {
		this.femaleSiteNum = StringUtil.toHalf(femaleSiteNum);
	}

	/**
	 * @return �������ԋ敪
	 */
	public String getFemaleTimeDiv() {
		return femaleTimeDiv;
	}

	/**
	 * @param femaleTimeDiv �������ԋ敪
	 */
	public void setFemaleTimeDiv(String femaleTimeDiv) {
		this.femaleTimeDiv = femaleTimeDiv;
	}

	/**
	 * @return �����J�n���ԂP
	 */
	public String getFemaleTimeFrom1() {
		
		return KikakuWebUtil.buildTime(femaleTimeFrom1Hour, femaleTimeFrom1Minute);
	}

	/**
	 * 
	 * @param femaleTimeFrom1 �����J�n���ԂP
	 */
	public void setFemaleTimeFrom1(String femaleTimeFrom1) {

		setFemaleTimeFrom1Hour(KikakuWebUtil.getHourFormTime(femaleTimeFrom1));
		setFemaleTimeFrom1Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeFrom1));
		
	}

	/**
	 * 
	 * @param femaleTimeFrom2 �����J�n���ԂP
	 */
	public void setFemaleTimeFrom2(String femaleTimeFrom2) {

		setFemaleTimeFrom2Hour(KikakuWebUtil.getHourFormTime(femaleTimeFrom2));
		setFemaleTimeFrom2Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeFrom2));
	}

	/**
	 * 
	 * @param femaleTimeFrom3 �����J�n���ԂP
	 */
	public void setFemaleTimeFrom3(String femaleTimeFrom3) {

		setFemaleTimeFrom3Hour(KikakuWebUtil.getHourFormTime(femaleTimeFrom3));
		setFemaleTimeFrom3Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeFrom3));
	}
	/**
	 * @return �����J�n���ԂQ
	 */
	public String getFemaleTimeFrom2() {
		
		return KikakuWebUtil.buildTime(femaleTimeFrom2Hour, femaleTimeFrom2Minute);
	}

	/**
	 * @return �����J�n���ԂR
	 */
	public String getFemaleTimeFrom3() {
		
		return KikakuWebUtil.buildTime(femaleTimeFrom3Hour, femaleTimeFrom3Minute);
	}

	/**
	 * @return �����I�����ԂP
	 */
	public String getFemaleTimeTo1() {
		
		return KikakuWebUtil.buildTime(femaleTimeTo1Hour, femaleTimeTo1Minute);
	}

	/**
	 * @return �����I�����ԂQ
	 */
	public String getFemaleTimeTo2() {
		
		return KikakuWebUtil.buildTime(femaleTimeTo2Hour, femaleTimeTo2Minute);
	}

	/**
	 * @return �����I�����ԂR
	 */
	public String getFemaleTimeTo3() {
		
		return KikakuWebUtil.buildTime(femaleTimeTo3Hour, femaleTimeTo3Minute);
	}

	/**
	 * 
	 * @param femaleTimeTo1 �����I������1
	 */
	public void setFemaleTimeTo1(String femaleTimeTo1) {

		setFemaleTimeTo1Hour(KikakuWebUtil.getHourFormTime(femaleTimeTo1));
		setFemaleTimeTo1Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeTo1));
	}

	/**
	 * 
	 * @param femaleTimeTo2 �����I������2
	 */
	public void setFemaleTimeTo2(String femaleTimeTo2) {

		setFemaleTimeTo2Hour(KikakuWebUtil.getHourFormTime(femaleTimeTo2));
		setFemaleTimeTo2Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeTo2));
	}

	/**
	 * 
	 * @param femaleTimeTo3 �����I�����ԂR
	 */
	public void setFemaleTimeTo3(String femaleTimeTo3) {

		setFemaleTimeTo3Hour(KikakuWebUtil.getHourFormTime(femaleTimeTo3));
		setFemaleTimeTo3Minute(KikakuWebUtil.getMinuteFromTime(femaleTimeTo3));
	}

	
	/**
	 * @return �j���ӏ�����
	 */
	public String getMaleSiteNm() {
		return maleSiteNm;
	}

	/**
	 * @param maleSiteNm �j���ӏ�����	
	 */
	public void setMaleSiteNm(String maleSiteNm) {
		this.maleSiteNm = maleSiteNm;
	}

	/**
	 * @return �j���ӏ�����
	 */
	public String getMaleSiteNum() {
		return maleSiteNum;
	}

	/**
	 * @param maleSiteNum �j���ӏ�����
	 */
	public void setMaleSiteNum(String maleSiteNum) {
		this.maleSiteNum = StringUtil.toHalf(maleSiteNum);
	}

	/**
	 * @return �j�����ԋ敪
	 */
	public String getMaleTimeDiv() {
		return maleTimeDiv;
	}

	/**
	 * @param maleTimeDiv �j�����ԋ敪
	 */
	public void setMaleTimeDiv(String maleTimeDiv) {
		this.maleTimeDiv = maleTimeDiv;
	}

	/**
	 * @return �j���J�n���ԂP
	 */
	public String getMaleTimeFrom1() {

		return KikakuWebUtil.buildTime(maleTimeFrom1Hour, maleTimeFrom1Minute);
	}
	
	/**
	 * 
	 * @param maleTimeFrom1 �j���J�n���ԂP
	 */
	public void setMaleTimeFrom1(String maleTimeFrom1) {

		setMaleTimeFrom1Hour(KikakuWebUtil.getHourFormTime(maleTimeFrom1));
		setMaleTimeFrom1Minute(KikakuWebUtil.getMinuteFromTime(maleTimeFrom1));
	}

	/**
	 * 
	 * @param maleTimeFrom2 �j���J�n����2
	 */
	public void setMaleTimeFrom2(String maleTimeFrom2) {

		setMaleTimeFrom2Hour(KikakuWebUtil.getHourFormTime(maleTimeFrom2));
		setMaleTimeFrom2Minute(KikakuWebUtil.getMinuteFromTime(maleTimeFrom2));
	}

	/**
	 * 
	 * @param maleTimeFrom3 �j���J�n����3
	 */
	public void setMaleTimeFrom3(String maleTimeFrom3) {

		setMaleTimeFrom3Hour(KikakuWebUtil.getHourFormTime(maleTimeFrom3));
		setMaleTimeFrom3Minute(KikakuWebUtil.getMinuteFromTime(maleTimeFrom3));
	}
	
	/**
	 * @return �j���J�n���ԂQ
	 */
	public String getMaleTimeFrom2() {

		return KikakuWebUtil.buildTime(maleTimeFrom2Hour, maleTimeFrom2Minute);
	}

	/**
	 * @return �j���J�n���ԂR
	 */
	public String getMaleTimeFrom3() {
		
		return KikakuWebUtil.buildTime(maleTimeFrom3Hour, maleTimeFrom3Minute);
	}

	/**
	 * @return �j���I�����ԂP
	 */
	public String getMaleTimeTo1() {
		
		return KikakuWebUtil.buildTime(maleTimeTo1Hour, maleTimeTo1Minute);
	}
	
	/**
	 * @return �j���I�����ԂQ
	 */
	public String getMaleTimeTo2() {
		
		return KikakuWebUtil.buildTime(maleTimeTo2Hour, maleTimeTo2Minute);
	}

	/**
	 * @return �j���I�����ԂR
	 */
	public String getMaleTimeTo3() {
		
		return KikakuWebUtil.buildTime(maleTimeTo3Hour, maleTimeTo3Minute);
	}

	/**
	 * 
	 * @param maleTimeTo1 �j���I������1
	 */
	public void setMaleTimeTo1(String maleTimeTo1) {

		setMaleTimeTo1Hour(KikakuWebUtil.getHourFormTime(maleTimeTo1));
		setMaleTimeTo1Minute(KikakuWebUtil.getMinuteFromTime(maleTimeTo1));
	}
	
	/**
	 * 
	 * @param maleTimeTo2 �j���I������2
	 */
	public void setMaleTimeTo2(String maleTimeTo2) {

		setMaleTimeTo2Hour(KikakuWebUtil.getHourFormTime(maleTimeTo2));
		setMaleTimeTo2Minute(KikakuWebUtil.getMinuteFromTime(maleTimeTo2));
	}

	/**
	 * 
	 * @param maleTimeTo3 �j���I������3
	 */
	public void setMaleTimeTo3(String maleTimeTo3) {

		setMaleTimeTo3Hour(KikakuWebUtil.getHourFormTime(maleTimeTo3));
		setMaleTimeTo3Minute(KikakuWebUtil.getMinuteFromTime(maleTimeTo3));
	}
	
	/**
	 * @return �V�R����E���̑�
	 */
	public Integer getNaturalSpa() {
		return naturalSpa;
	}

	/**
	 * @param naturalSpa �V�R����E���̑�
	 */
	public void setNaturalSpa(Integer naturalSpa) {
		this.naturalSpa = naturalSpa;
	}

	/**
	 * @return ���̑�����R�����g
	 */
	public String getOtherSpringCmt() {
		return otherSpringCmt;
	}

	/**
	 * @param otherSpringCmt ���̑�����R�����g
	 */
	public void setOtherSpringCmt(String otherSpringCmt) {
		this.otherSpringCmt = otherSpringCmt;
	}

	/**
	 * @return ���񓚘A��
	 */
	public Long getPlanAnsNo() {
		return planAnsNo;
	}

	/**
	 * @param planAnsNo ���񓚘A��
	 */
	public void setPlanAnsNo(Long planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

	/**
	 * @return �N�o���
	 */
	public String getPourStatus() {
		return pourStatus;
	}

	/**
	 * @param pourStatus �N�o���
	 */
	public void setPourStatus(String pourStatus) {
		this.pourStatus = pourStatus;
	}

	/**
	 * @return �N�o��ԃR�����g
	 */
	public String getPourStatusCmt() {
		return pourStatusCmt;
	}

	/**
	 * @param pourStatusCmt �N�o��ԃR�����g
	 */
	public void setPourStatusCmt(String pourStatusCmt) {
		this.pourStatusCmt = pourStatusCmt;
	}

	/**
	 * @return ����z���L��
	 */
	public String getRecircleKindFlg() {
		return recircleKindFlg;
	}

	/**
	 * @param recircleKindFlg ����z���L��
	 */
	public void setRecircleKindFlg(String recircleKindFlg) {
		this.recircleKindFlg = recircleKindFlg;
	}

	/**
	 * @return ���ؗ���
	 */
	public String getRentalFees() {
		return rentalFees;
	}

	/**
	 * @param rentalFees ���ؗ���
	 */
	public void setRentalFees(String rentalFees) {
		this.rentalFees = StringUtil.toHalf(rentalFees);
	}

	/**
	 * @return ���ؗL���L��	
	 */
	public String getRentalPayFlg() {
		return rentalPayFlg;
	}

	/**
	 * @param rentalPayFlg ���ؗL���L��	
	 */
	public void setRentalPayFlg(String rentalPayFlg) {
		this.rentalPayFlg = rentalPayFlg;
	}

	/**
	 * @return ���ؗ\��敪
	 */
	public Integer getRentalReserveDiv() {
		return rentalReserveDiv;
	}

	/**
	 * @param rentalReserveDiv ���ؗ\��敪
	 */
	public void setRentalReserveDiv(Integer rentalReserveDiv) {
		this.rentalReserveDiv = rentalReserveDiv;
	}

	/**
	 * @return ���؉ӏ�����
	 */
	public String getRentalSiteNum() {
		return rentalSiteNum;
	}

	/**
	 * @param rentalSiteNum ���؉ӏ�����
	 */
	public void setRentalSiteNum(String rentalSiteNum) {
		this.rentalSiteNum = StringUtil.toHalf(rentalSiteNum);
	}

	/**
	 * @return ���؎���
	 */
	public String getRentalTime() {
		return rentalTime;
	}

	/**
	 * @param rentalTime ���؎���
	 */
	public void setRentalTime(String rentalTime) {
		this.rentalTime = StringUtil.toHalf(rentalTime);
	}

	/**
	 * @return ���ƌ���L��
	 */
	public String getSelfSpringFlg() {
		return selfSpringFlg;
	}

	/**
	 * @param selfSpringFlg ���ƌ���L��
	 */
	public void setSelfSpringFlg(String selfSpringFlg) {
		this.selfSpringFlg = selfSpringFlg;
	}

	/**
	 * @return ��������L��
	 */
	public String getShareSpringFlg() {
		return shareSpringFlg;
	}

	/**
	 * @param shareSpringFlg ��������L��
	 */
	public void setShareSpringFlg(String shareSpringFlg) {
		this.shareSpringFlg = shareSpringFlg;
	}

	/**
	 * @return ��������
	 */
	public String getShareSpringNm() {
		return shareSpringNm;
	}

	/**
	 * @param shareSpringNm ��������
	 */
	public void setShareSpringNm(String shareSpringNm) {
		this.shareSpringNm = shareSpringNm;
	}

	/**
	 * @return ����֐��L��	
	 */
	public Integer getShiftFlg() {
		return shiftFlg;
	}

	/**
	 * @param shiftFlg ����֐��L��	
	 */
	public void setShiftFlg(Integer shiftFlg) {
		this.shiftFlg = shiftFlg;
	}

	/**
	 * @return ���򂩂������L��
	 */
	public String getSpaFlowFlg() {
		return spaFlowFlg;
	}

	/**
	 * @param spaFlowFlg ���򂩂������L��
	 */
	public void setSpaFlowFlg(String spaFlowFlg) {
		this.spaFlowFlg = spaFlowFlg;
	}

	/**
	 * @return ��
	 */
	public String getSpaQuality() {
		return spaQuality;
	}

	/**
	 * @param spaQuality ��
	 */
	public void setSpaQuality(String spaQuality) {
		this.spaQuality = StringUtil.toHalf(spaQuality);
	}

	/**
	 * @return ���򉷓x
	 */
	public String getSpaTemp() {
		return spaTemp;
	}

	/**
	 * @param spaTemp ���򉷓x
	 */
	public void setSpaTemp(String spaTemp) {
		this.spaTemp = StringUtil.toHalf(spaTemp);
	}

	/**
	 * @return ��������L��L��
	 */
	public String getWarmingFlg() {
		return warmingFlg;
	}

	/**
	 * @param warmingFlg ��������L��L��
	 */
	public void setWarmingFlg(String warmingFlg) {
		this.warmingFlg = warmingFlg;
	}

	/**
	 * @return �����ւ̓��ʃR���g���[���L��
	 */
	public String getWaterControlFlg() {
		return waterControlFlg;
	}

	/**
	 * @param waterControlFlg �����ւ̓��ʃR���g���[���L��	
	 */
	public void setWaterControlFlg(String waterControlFlg) {
		this.waterControlFlg = waterControlFlg;
	}

	/**
	 * @return maleTimeFrom1Hour�@�j���J�n����1�F����
	 */
	public String getMaleTimeFrom1Hour() {
		return maleTimeFrom1Hour;
	}

	/**
	 * @param maleTimeFrom1Hour �j���J�n����1�F����
	 */
	public void setMaleTimeFrom1Hour(String maleTimeFrom1Hour) {
		this.maleTimeFrom1Hour = StringUtil.toHalf(maleTimeFrom1Hour);
	}

	/**
	 * @return maleTimeFrom1Minute �j���J�n����1�F��
	 */
	public String getMaleTimeFrom1Minute() {
		return maleTimeFrom1Minute;
	}

	/**
	 * @param maleTimeFrom1Minute �j���J�n����1�F��
	 */
	public void setMaleTimeFrom1Minute(String maleTimeFrom1Minute) {
		this.maleTimeFrom1Minute = StringUtil.toHalf(maleTimeFrom1Minute);
	}

	/**
	 * @return maleTimeTo1Hour �j���I������1:����
	 */
	public String getMaleTimeTo1Hour() {
		return maleTimeTo1Hour;
	}

	/**
	 * @param maleTimeTo1Hour �j���I������1:����
	 */
	public void setMaleTimeTo1Hour(String maleTimeTo1Hour) {
		this.maleTimeTo1Hour = StringUtil.toHalf(maleTimeTo1Hour);
	}

	/**
	 * @return maleTimeTo1Minute �j���I������1:��
	 */
	public String getMaleTimeTo1Minute() {
		return maleTimeTo1Minute;
	}

	/**
	 * @param maleTimeTo1Minute �j���I������1:��
	 */
	public void setMaleTimeTo1Minute(String maleTimeTo1Minute) {
		this.maleTimeTo1Minute = StringUtil.toHalf(maleTimeTo1Minute);
	}

	/**
	 * @return maleTimeFrom2Hour �j���J�n����2�F����
	 */
	public String getMaleTimeFrom2Hour() {
		return maleTimeFrom2Hour;
	}

	/**
	 * @param maleTimeFrom2Hour �j���J�n����2�F����
	 */
	public void setMaleTimeFrom2Hour(String maleTimeFrom2Hour) {
		this.maleTimeFrom2Hour = StringUtil.toHalf(maleTimeFrom2Hour);
	}

	/**
	 * @return maleTimeFrom2Minute �j���J�n����2�F��
	 */
	public String getMaleTimeFrom2Minute() {
		return maleTimeFrom2Minute;
	}

	/**
	 * @param maleTimeFrom2Minute �j���J�n����2�F��
	 */
	public void setMaleTimeFrom2Minute(String maleTimeFrom2Minute) {
		this.maleTimeFrom2Minute = StringUtil.toHalf(maleTimeFrom2Minute);
	}

	/**
	 * @return maleTimeTo2Hour �j���I������2:����
	 */
	public String getMaleTimeTo2Hour() {
		return maleTimeTo2Hour;
	}

	/**
	 * @param maleTimeTo2Hour �j���I������2:����
	 */
	public void setMaleTimeTo2Hour(String maleTimeTo2Hour) {
		this.maleTimeTo2Hour = StringUtil.toHalf(maleTimeTo2Hour);
	}

	/**
	 * @return maleTimeTo2Minute �j���I������2:��
	 */
	public String getMaleTimeTo2Minute() {
		return maleTimeTo2Minute;
	}

	/**
	 * @param maleTimeTo2Minute �j���I������2:��
	 */
	public void setMaleTimeTo2Minute(String maleTimeTo2Minute) {
		this.maleTimeTo2Minute = StringUtil.toHalf(maleTimeTo2Minute);
	}

	/**
	 * @return maleTimeFrom3Hour �j���J�n����3�F����
	 */
	public String getMaleTimeFrom3Hour() {
		return maleTimeFrom3Hour;
	}

	/**
	 * @param maleTimeFrom3Hour �j���J�n����3�F����
	 */
	public void setMaleTimeFrom3Hour(String maleTimeFrom3Hour) {
		this.maleTimeFrom3Hour = StringUtil.toHalf(maleTimeFrom3Hour);
	}

	/**
	 * @return maleTimeFrom3Minute �j���J�n����3�F��
	 */
	public String getMaleTimeFrom3Minute() {
		return maleTimeFrom3Minute;
	}

	/**
	 * @param maleTimeFrom3Minute �j���J�n����3�F��
	 */
	public void setMaleTimeFrom3Minute(String maleTimeFrom3Minute) {
		this.maleTimeFrom3Minute = StringUtil.toHalf(maleTimeFrom3Minute);
	}

	/**
	 * @return maleTimeTo3Hour �j���I������3:����
	 */
	public String getMaleTimeTo3Hour() {
		return maleTimeTo3Hour;
	}

	/**
	 * @param maleTimeTo3Hour �j���I������3:����
	 */
	public void setMaleTimeTo3Hour(String maleTimeTo3Hour) {
		this.maleTimeTo3Hour = StringUtil.toHalf(maleTimeTo3Hour);
	}

	/**
	 * @return maleTimeTo3Minute �j���I������3:��
	 */
	public String getMaleTimeTo3Minute() {
		return maleTimeTo3Minute;
	}

	/**
	 * @param maleTimeTo3Minute �j���I������3:��
	 */
	public void setMaleTimeTo3Minute(String maleTimeTo3Minute) {
		this.maleTimeTo3Minute = StringUtil.toHalf(maleTimeTo3Minute);
	}

	/**
	 * @return femaleTimeFrom1Hour Minute�����J�n����1�F����
	 */
	public String getFemaleTimeFrom1Hour() {
		return femaleTimeFrom1Hour;
	}

	/**
	 * @param femaleTimeFrom1Hour Minute�����J�n����1�F����
	 */
	public void setFemaleTimeFrom1Hour(String femaleTimeFrom1Hour) {
		this.femaleTimeFrom1Hour = StringUtil.toHalf(femaleTimeFrom1Hour);
	}

	/**
	 * @return femaleTimeFrom1Minute Minute�����J�n����1�F��
	 */
	public String getFemaleTimeFrom1Minute() {
		return femaleTimeFrom1Minute;
	}

	/**
	 * @param femaleTimeFrom1Minute Minute�����J�n����1�F��
	 */
	public void setFemaleTimeFrom1Minute(String femaleTimeFrom1Minute) {
		this.femaleTimeFrom1Minute = StringUtil.toHalf(femaleTimeFrom1Minute);
	}

	/**
	 * @return femaleTimeFrom2Hour �����J�n����2�F����
	 */
	public String getFemaleTimeFrom2Hour() {
		return femaleTimeFrom2Hour;
	}

	/**
	 * @param femaleTimeFrom2Hour �����J�n����2�F����
	 */
	public void setFemaleTimeFrom2Hour(String femaleTimeFrom2Hour) {
		this.femaleTimeFrom2Hour = StringUtil.toHalf(femaleTimeFrom2Hour);
	}

	/**
	 * @return femaleTimeFrom2 Minute�����J�n����2�F��
	 */
	public String getFemaleTimeFrom2Minute() {
		return femaleTimeFrom2Minute;
	}

	/**
	 * @param femaleTimeFrom2Minute �����J�n����2�F��
	 */
	public void setFemaleTimeFrom2Minute(String femaleTimeFrom2Minute) {
		this.femaleTimeFrom2Minute = StringUtil.toHalf(femaleTimeFrom2Minute);
	}

	/**
	 * @return femaleTimeFrom3Hour �����J�n����3�F����
	 */
	public String getFemaleTimeFrom3Hour() {
		return femaleTimeFrom3Hour;
	}

	/**
	 * @param femaleTimeFrom3Hour �����J�n����3�F����
	 */
	public void setFemaleTimeFrom3Hour(String femaleTimeFrom3Hour) {
		this.femaleTimeFrom3Hour = StringUtil.toHalf(femaleTimeFrom3Hour);
	}

	/**
	 * @return RfemaleTimeFrom3Minute �����J�n����3�F��
	 */
	public String getFemaleTimeFrom3Minute() {
		return femaleTimeFrom3Minute;
	}

	/**
	 * @param femaleTimeFrom3Minute �����J�n����3�F��
	 */
	public void setFemaleTimeFrom3Minute(String femaleTimeFrom3Minute) {
		this.femaleTimeFrom3Minute = StringUtil.toHalf(femaleTimeFrom3Minute);
	}

	/**
	 * @return femaleTimeTo1Hour �����I������1:����
	 */
	public String getFemaleTimeTo1Hour() {
		return femaleTimeTo1Hour;
	}

	/**
	 * @param femaleTimeTo1Hour �����I������1:����
	 */
	public void setFemaleTimeTo1Hour(String femaleTimeTo1Hour) {
		this.femaleTimeTo1Hour = StringUtil.toHalf(femaleTimeTo1Hour);
	}

	/**
	 * @return femaleTimeTo1Minute �����I������1:��
	 */
	public String getFemaleTimeTo1Minute() {
		return femaleTimeTo1Minute;
	}

	/**
	 * @param femaleTimeTo1Minute �����I������1:��
	 */
	public void setFemaleTimeTo1Minute(String femaleTimeTo1Minute) {
		this.femaleTimeTo1Minute = StringUtil.toHalf(femaleTimeTo1Minute);
	}

	/**
	 * @return femaleTimeTo2Hour �����I������2:����
	 */
	public String getFemaleTimeTo2Hour() {
		return femaleTimeTo2Hour;
	}

	/**
	 * @param femaleTimeTo2Hour �����I������2:����
	 */
	public void setFemaleTimeTo2Hour(String femaleTimeTo2Hour) {
		this.femaleTimeTo2Hour = StringUtil.toHalf(femaleTimeTo2Hour);
	}

	/**
	 * @return femaleTimeTo2Minute �����I������2:��
	 */
	public String getFemaleTimeTo2Minute() {
		return femaleTimeTo2Minute;
	}

	/**
	 * @param femaleTimeTo2Minute �����I������2:��
	 */
	public void setFemaleTimeTo2Minute(String femaleTimeTo2Minute) {
		this.femaleTimeTo2Minute = StringUtil.toHalf(femaleTimeTo2Minute);
	}

	/**
	 * @return femaleTimeTo3Hour �����I������3:����
	 */
	public String getFemaleTimeTo3Hour() {
		return femaleTimeTo3Hour;
	}

	/**
	 * @param femaleTimeTo3Hour �����I������3:����
	 */
	public void setFemaleTimeTo3Hour(String femaleTimeTo3Hour) {
		this.femaleTimeTo3Hour = StringUtil.toHalf(femaleTimeTo3Hour);
	}

	/**
	 * @return femaleTimeTo3Minute�@�����I������3:��
	 */
	public String getFemaleTimeTo3Minute() {
		return femaleTimeTo3Minute;
	}

	/**
	 * @param femaleTimeTo3Minute �����I������3:��
	 */
	public void setFemaleTimeTo3Minute(String femaleTimeTo3Minute) {
		this.femaleTimeTo3Minute = StringUtil.toHalf(femaleTimeTo3Minute);
	}

	/**
	 * @return femaleOnlyFlg ������p�L��
	 */
	public String getFemaleOnlyFlg() {
		return femaleOnlyFlg;
	}

	/**
	 * @param femaleOnlyFlg ������p�L��
	 */
	public void setFemaleOnlyFlg(String femaleOnlyFlg) {
		this.femaleOnlyFlg = femaleOnlyFlg;
	}
}
