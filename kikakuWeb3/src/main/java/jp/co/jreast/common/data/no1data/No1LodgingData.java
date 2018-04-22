package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;

import jp.co.jreast.common.data.PlanAnsBaseData;


/**
 * <pre>
 *  NO1_�h���f�[�^�N���X�B.
 *  �@�\�T�v    �F  NO1_�h���f�[�^���i�[����B
 *  ���L����    �F  ����
 * </pre>
 * 
 * @author hu
 * @version 0.1 2006/10/27
 */
public class No1LodgingData extends PlanAnsBaseData implements INo1CommonData {
	
	/**
	 * @return �萔���̕\���`�����擾.
	 */
	public String getDealFeeDisplay() {
		
		return null;
	}
	/**
	 * ���i�敪 .
	 */
	private Integer goodsDiv;

	/**
	 * �{�ݗX�֔ԍ� .
	 */
	private String facilityPostCd;

	/**
	 * �{�ݏZ�� .
	 */
	private String facilityAddr;

	/**
	 * �{�ݓd�b .
	 */
	private String facilityTel;

	/**
	 * �{�݃t�@�b�N�X .
	 */
	private String facilityFax;

	/**
	 * �p�\�R�� .
	 */
	private String terminalNo;

	/**
	 * �񋟊��ԊJ�n�N���� .
	 */
	private String termFromYmd;

	/**
	 * �񋟊��ԏI���N���� .
	 */
	private String termEndYmd;

	/**
	 * ��d���� .
	 */
	private String liquidateDay;

	/**
	 * �A���������z�i��l�j .
	 */
	private String stayDisCountAdlt;

	/**
	 * �A���������z�i���l�j .
	 */
	private String stayDisCountChild;

	/**
	 * �����s�h���ŗL�� .
	 */
	private Integer tyoStayTaxFlg;

	/**
	 * ���������R�[�h .
	 */
	private Integer feeCondCd;

	/**
	 * �H�������R�[�h .
	 */
	private Integer mealCondCd;

	/**
	 * �����ŗL�� .
	 */
	private String spaTaxFlg;

	/**
	 * �����Łi��l�j .
	 */
	private String spaTaxAdlt;

	/**
	 * �����Łi���l�j .
	 */
	private String spaTaxChild;

	/**
	 * �̔��萔�� .
	 */
	private String saleTax;

	/**
	 * ���l .
	 */
	private String memo;

	/**
	 * ���O�� .
	 */
	private String exceptDate;

	/**
	 * �`�F�b�N�C������ .
	 */
	private String checkIn;

	/**
	 * �`�F�b�N�A�E�g���� .
	 */
	private String checkOut;

	/**
	 * �`�F�b�N�C�����ԁi�ʏ�j .
	 */
	private String checkInNor;

	/**
	 * �`�F�b�N�A�E�g���ԁi�ʏ�j .
	 */
	private String checkOutNor;

	/**
	 * �ً}�A�����Ж��́i�����j .
	 */
	private String emenComOrd;

	/**
	 * �ً}�A����S���ҁi�����j .
	 */
	private String emenPersonOrd;

	/**
	 * �ً}�A����d�b�ԍ��i�����j .
	 */
	private String emenTelOrd;

	/**
	 * �ً}�A�����Ж��́i�y���j .
	 */
	private String emenComWk;

	/**
	 * �ً}�A����S���ҁi�y���j .
	 */
	private String emenPersonWk;

	/**
	 * �ً}�A����d�b�ԍ��i�y���j .
	 */
	private String emenTelWk;

	/**
	 * �ً}�A������l .
	 */
	private String emenAddrMemo;

	/**
	 * �`�F�b�N�C������ �� .
	 */
	private String checkInH;

	/**
	 * �`�F�b�N�C������ �� .
	 */
	private String checkInM;

	/**
	 * �`�F�b�N�C�����ԁi�ʏ�j �� .
	 */
	private String checkInNorH;

	/**
	 * �`�F�b�N�C�����ԁi�ʏ�j �� .
	 */
	private String checkInNorM;

	/**
	 * �`�F�b�N�A�E�g���� �� .
	 */
	private String checkOutH;

	/**
	 * �`�F�b�N�A�E�g���� �� .
	 */
	private String checkOutM;

	/**
	 * �`�F�b�N�A�E�g���ԁi�ʏ�j �� .
	 */
	private String checkOutNorH;

	/**
	 * �`�F�b�N�A�E�g���ԁi�ʏ�j �� .
	 */
	private String checkOutNorM;

	/**
	 * �񋟊��ԏI���� .
	 */
	private String termEndD;

	/**
	 * �񋟊��ԏI���� .
	 */
	private String termEndM;

	/**
	 * �񋟊��ԏI���N .
	 */
	private String termEndY;

	/**
	 * �񋟊��ԊJ�n�� .
	 */
	private String termFromD;

	/**
	 * �񋟊��ԊJ�n�� .
	 */
	private String termFromM;

	/**
	 * �񋟊��ԊJ�n�N .
	 */
	private String termFromY;

	/**
	 * @return �`�F�b�N�C������.
	 */
	public String getCheckIn() {
		return checkIn;
	}

	/**
	 * @param checkIn
	 *            �`�F�b�N�C������.
	 */
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	/**
	 * @return �`�F�b�N�C�����ԁi�ʏ�j.
	 */
	public String getCheckInNor() {
		return checkInNor;
	}

	/**
	 * @param checkInNor
	 *            �`�F�b�N�C�����ԁi�ʏ�j.
	 */
	public void setCheckInNor(String checkInNor) {
		this.checkInNor = checkInNor;
	}

	/**
	 * @return �`�F�b�N�A�E�g����.
	 */
	public String getCheckOut() {
		return checkOut;
	}

	/**
	 * @param checkOut
	 *            �`�F�b�N�A�E�g����.
	 */
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	/**
	 * @return �`�F�b�N�A�E�g���ԁi�ʏ�j.
	 */
	public String getCheckOutNor() {
		return checkOutNor;
	}

	/**
	 * @param checkOutNor
	 *            �`�F�b�N�A�E�g���ԁi�ʏ�j.
	 */
	public void setCheckOutNor(String checkOutNor) {
		this.checkOutNor = checkOutNor;
	}

	/**
	 * @return �ً}�A������l.
	 */
	public String getEmenAddrMemo() {
		return emenAddrMemo;
	}

	/**
	 * @param emenAddrMemo
	 *            �ً}�A������l.
	 */
	public void setEmenAddrMemo(String emenAddrMemo) {
		this.emenAddrMemo = emenAddrMemo;
	}

	/**
	 * @return �ً}�A�����Ж��́i�����j.
	 */
	public String getEmenComOrd() {
		return emenComOrd;
	}

	/**
	 * @param emenComOrd
	 *            �ً}�A�����Ж��́i�����j.
	 */
	public void setEmenComOrd(String emenComOrd) {
		this.emenComOrd = emenComOrd;
	}

	/**
	 * @return �ً}�A�����Ж��́i�y���j.
	 */
	public String getEmenComWk() {
		return emenComWk;
	}

	/**
	 * @param emenComWk
	 *            �ً}�A�����Ж��́i�y���j.
	 */
	public void setEmenComWk(String emenComWk) {
		this.emenComWk = emenComWk;
	}

	/**
	 * @return �ً}�A����S���ҁi�����j.
	 */
	public String getEmenPersonOrd() {
		return emenPersonOrd;
	}

	/**
	 * @param emenPersonOrd
	 *            �ً}�A����S���ҁi�����j.
	 */
	public void setEmenPersonOrd(String emenPersonOrd) {
		this.emenPersonOrd = emenPersonOrd;
	}

	/**
	 * @return �ً}�A����S���ҁi�y���j.
	 */
	public String getEmenPersonWk() {
		return emenPersonWk;
	}

	/**
	 * @param emenPersonWk
	 *            �ً}�A����S���ҁi�y���j.
	 */
	public void setEmenPersonWk(String emenPersonWk) {
		this.emenPersonWk = emenPersonWk;
	}

	/**
	 * @return �ً}�A����d�b�ԍ��i�����j.
	 */
	public String getEmenTelOrd() {
		return emenTelOrd;
	}

	/**
	 * @param emenTelOrd
	 *            �ً}�A����d�b�ԍ��i�����j.
	 */
	public void setEmenTelOrd(String emenTelOrd) {
		this.emenTelOrd = emenTelOrd;
	}

	/**
	 * @return �ً}�A����d�b�ԍ��i�y���j.
	 */
	public String getEmenTelWk() {
		return emenTelWk;
	}

	/**
	 * @param emenTelWk
	 *            �ً}�A����d�b�ԍ��i�y���j.
	 */
	public void setEmenTelWk(String emenTelWk) {
		this.emenTelWk = emenTelWk;
	}

	/**
	 * @return ���O��.
	 */
	public String getExceptDate() {
		return exceptDate;
	}

	/**
	 * @param exceptDate
	 *            ���O��.
	 */
	public void setExceptDate(String exceptDate) {
		this.exceptDate = exceptDate;
	}

	/**
	 * @return �{�ݏZ��.
	 */
	public String getFacilityAddr() {
		return facilityAddr;
	}

	/**
	 * @param facilityAddr
	 *            �{�ݏZ��.
	 */
	public void setFacilityAddr(String facilityAddr) {
		this.facilityAddr = facilityAddr;
	}

	/**
	 * @return �{�݃t�@�b�N�X.
	 */
	public String getFacilityFax() {
		return facilityFax == null ? "" : facilityFax.trim();
	}

	/**
	 * @param facilityFax
	 *            �{�݃t�@�b�N�X.
	 */
	public void setFacilityFax(String facilityFax) {
		this.facilityFax = facilityFax;
	}

	/**
	 * @return �{�ݗX�֔ԍ�.
	 */
	public String getFacilityPostCd() {
		return facilityPostCd;
	}

	/**
	 * @param facilityPostCd
	 *            �{�ݗX�֔ԍ�.
	 */
	public void setFacilityPostCd(String facilityPostCd) {
		this.facilityPostCd = facilityPostCd;
	}

	/**
	 * @return �{�ݓd�b.
	 */
	public String getFacilityTel() {
		return facilityTel == null ? "" : facilityTel.trim();
	}

	/**
	 * @param facilityTel
	 *            �{�ݓd�b.
	 */
	public void setFacilityTel(String facilityTel) {
		this.facilityTel = facilityTel;
	}

	/**
	 * @return ���������R�[�h.
	 */
	public Integer getFeeCondCd() {
		return feeCondCd;
	}

	/**
	 * @param feeCondCd
	 *            ���������R�[�h.
	 */
	public void setFeeCondCd(Integer feeCondCd) {
		this.feeCondCd = feeCondCd;
	}

	/**
	 * @return ���i�敪.
	 */
	public Integer getGoodsDiv() {
		return goodsDiv;
	}

	/**
	 * @param goodsDiv
	 *            ���i�敪.
	 */
	public void setGoodsDiv(Integer goodsDiv) {
		this.goodsDiv = goodsDiv;
	}

	/**
	 * @return ��d����.
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}

	/**
	 * @param liquidateDay
	 *            ��d����.
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = StringUtil.toHalf(liquidateDay);
	}

	/**
	 * @return �H�������R�[�h.
	 */
	public Integer getMealCondCd() {
		return mealCondCd;
	}

	/**
	 * @param mealCondCd
	 *            �H�������R�[�h.
	 */
	public void setMealCondCd(Integer mealCondCd) {
		this.mealCondCd = mealCondCd;
	}

	/**
	 * @return ���l.
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo
	 *            ���l.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return �̔��萔��.
	 */
	public String getSaleTax() {
		return saleTax;
	}

	/**
	 * @param saleTax
	 *            �̔��萔��.
	 */
	public void setSaleTax(String saleTax) {
		this.saleTax = saleTax;
	}

	/**
	 * @return �����Łi��l�j.
	 */
	public String getSpaTaxAdlt() {
		return spaTaxAdlt;
	}

	/**
	 * @param spaTaxAdlt
	 *            �����Łi��l�j.
	 */
	public void setSpaTaxAdlt(String spaTaxAdlt) {
		this.spaTaxAdlt = spaTaxAdlt;
	}

	/**
	 * @return �����Łi���l�j.
	 */
	public String getSpaTaxChild() {
		return spaTaxChild;
	}

	/**
	 * @param spaTaxChild
	 *            �����Łi���l�j.
	 */
	public void setSpaTaxChild(String spaTaxChild) {
		this.spaTaxChild = spaTaxChild;
	}

	/**
	 * @return �����ŗL��.
	 */
	public String getSpaTaxFlg() {
		return spaTaxFlg;
	}

	/**
	 * @param spaTaxFlg
	 *            �����ŗL��.
	 */
	public void setSpaTaxFlg(String spaTaxFlg) {
		this.spaTaxFlg = spaTaxFlg;
	}

	/**
	 * @return �A���������z�i��l�j.
	 */
	public String getStayDisCountAdlt() {
		return stayDisCountAdlt;
	}

	/**
	 * @param stayDisCountAdlt
	 *            �A���������z�i��l�j.
	 */
	public void setStayDisCountAdlt(String stayDisCountAdlt) {
		this.stayDisCountAdlt = StringUtil.toHalf(stayDisCountAdlt);
	}

	/**
	 * @return �A���������z�i���l�j.
	 */
	public String getStayDisCountChild() {
		return stayDisCountChild;
	}

	/**
	 * @param stayDisCountChild
	 *            �A���������z�i���l�j.
	 */
	public void setStayDisCountChild(String stayDisCountChild) {
		this.stayDisCountChild = StringUtil.toHalf(stayDisCountChild);
	}

	/**
	 * @return �񋟊��ԏI���N����.
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}

	/**
	 * @param termEndYmd
	 *            �񋟊��ԏI���N����.
	 */
	public void setTermEndYmd(String termEndYmd) {
		this.termEndYmd = termEndYmd;
	}

	/**
	 * @return �񋟊��ԊJ�n�N����.
	 */
	public String getTermFromYmd() {
		return termFromYmd;
	}

	/**
	 * @param termFromYmd
	 *            �񋟊��ԊJ�n�N����.
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
	}

	/**
	 * @return �p�\�R��.
	 */
	public String getTerminalNo() {
		return terminalNo;
	}

	/**
	 * @param terminalNo
	 *            �p�\�R��.
	 */
	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
	}

	/**
	 * @return �����s�h���ŗL��.
	 */
	public Integer getTyoStayTaxFlg() {
		return tyoStayTaxFlg;
	}

	/**
	 * @param tyoStayTaxFlg
	 *            �����s�h���ŗL��.
	 */
	public void setTyoStayTaxFlg(Integer tyoStayTaxFlg) {
		this.tyoStayTaxFlg = tyoStayTaxFlg;
	}

	/**
	 * @return �`�F�b�N�C������ ��
	 */
	public String getCheckInH() {
		return checkInH;
	}

	/**
	 * @return �`�F�b�N�C������ ��
	 */
	public String getCheckInM() {
		return checkInM;
	}

	/**
	 * @return �`�F�b�N�C�����ԁi�ʏ�j ��
	 */
	public String getCheckInNorH() {
		return checkInNorH;
	}

	/**
	 * @return �`�F�b�N�C�����ԁi�ʏ�j ��
	 */
	public String getCheckInNorM() {
		return checkInNorM;
	}

	/**
	 * @return �`�F�b�N�A�E�g���� ��
	 */
	public String getCheckOutH() {
		return checkOutH;
	}

	/**
	 * @return �`�F�b�N�A�E�g���� ��
	 */
	public String getCheckOutM() {
		return checkOutM;
	}

	/**
	 * @return �`�F�b�N�A�E�g���ԁi�ʏ�j ��
	 */
	public String getCheckOutNorH() {
		return checkOutNorH;
	}

	/**
	 * @return �`�F�b�N�A�E�g���ԁi�ʏ�j ��
	 */
	public String getCheckOutNorM() {
		return checkOutNorM;
	}

	/**
	 * @return �񋟊��ԏI����
	 */
	public String getTermEndD() {
		return termEndD;
	}

	/**
	 * @return �񋟊��ԏI����
	 */
	public String getTermEndM() {
		return termEndM;
	}

	/**
	 * @return �񋟊��ԏI���N
	 */
	public String getTermEndY() {
		return termEndY;
	}

	/**
	 * @return �񋟊��ԊJ�n��
	 */
	public String getTermFromD() {
		return termFromD;
	}

	/**
	 * @return �񋟊��ԊJ�n��
	 */
	public String getTermFromM() {
		return termFromM;
	}

	/**
	 * @return �񋟊��ԊJ�n�N
	 */
	public String getTermFromY() {
		return termFromY;
	}

	/**
	 * @param checkInH
	 *            �`�F�b�N�C������ ��
	 */
	public void setCheckInH(String checkInH) {
		this.checkInH = StringUtil.toHalf(checkInH);
	}

	/**
	 * @param checkInM
	 *            �`�F�b�N�C������ ��
	 */
	public void setCheckInM(String checkInM) {
		this.checkInM = StringUtil.toHalf(checkInM);
	}

	/**
	 * @param checkInNorH
	 *            �`�F�b�N�C�����ԁi�ʏ�j ��
	 */
	public void setCheckInNorH(String checkInNorH) {
		this.checkInNorH = StringUtil.toHalf(checkInNorH);
	}

	/**
	 * @param checkInNorM
	 *            �`�F�b�N�C�����ԁi�ʏ�j ��
	 */
	public void setCheckInNorM(String checkInNorM) {
		this.checkInNorM = StringUtil.toHalf(checkInNorM);
	}

	/**
	 * @param checkOutH
	 *            �`�F�b�N�A�E�g���� ��
	 */
	public void setCheckOutH(String checkOutH) {
		this.checkOutH = StringUtil.toHalf(checkOutH);
	}

	/**
	 * @param checkOutM
	 *            �`�F�b�N�A�E�g���� ��
	 */
	public void setCheckOutM(String checkOutM) {
		this.checkOutM = StringUtil.toHalf(checkOutM);
	}

	/**
	 * @param checkOutNorH
	 *            �`�F�b�N�A�E�g���ԁi�ʏ�j ��
	 */
	public void setCheckOutNorH(String checkOutNorH) {
		this.checkOutNorH = StringUtil.toHalf(checkOutNorH);
	}

	/**
	 * @param checkOutNorM
	 *            �`�F�b�N�A�E�g���ԁi�ʏ�j ��
	 */
	public void setCheckOutNorM(String checkOutNorM) {
		this.checkOutNorM = StringUtil.toHalf(checkOutNorM);
	}

	/**
	 * @param termEndD
	 *            �񋟊��ԏI����
	 */
	public void setTermEndD(String termEndD) {
		this.termEndD = StringUtil.toHalf(termEndD);
	}

	/**
	 * @param termEndM
	 *            �񋟊��ԏI����
	 */
	public void setTermEndM(String termEndM) {
		this.termEndM = StringUtil.toHalf(termEndM);
	}

	/**
	 * @param termEndY
	 *            �񋟊��ԏI���N
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = StringUtil.toHalf(termEndY);
	}

	/**
	 * @param termFromD
	 *            �񋟊��ԊJ�n��
	 */
	public void setTermFromD(String termFromD) {
		this.termFromD = StringUtil.toHalf(termFromD);
	}

	/**
	 * @param termFromM
	 *            �񋟊��ԊJ�n��
	 */
	public void setTermFromM(String termFromM) {
		this.termFromM = StringUtil.toHalf(termFromM);
	}

	/**
	 * @param termFromY
	 *            �񋟊��ԊJ�n�N
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = StringUtil.toHalf(termFromY);
	}

}
