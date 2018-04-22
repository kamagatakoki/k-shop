package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 *  NO1�D�ԃf�[�^�N���X�B.
 *  �@�\�T�v    �F  NO1�D�ԃf�[�^���i�[����B
 *  ���L����    �F  ����
 * </pre>
 * 
 * @author zhouch
 * @version 0.1 2006/11/17
 */
public class No1TrafficData extends PlanAnsBaseData implements INo1CommonData {
	/**
	 * �萔���̕\���������擾.
	 * @return ����ܕt���萔��
	 */
	public String getDealFeeDisplay() {
		if (!StringUtil.isEmpty(dealFee)
				&& !StringUtil.isEmpty(getDealFeeType())
				&& JreConstants.DEAL_FEE_YEN_VALUE.equals(getDealFeeType())) {
			return KikakuWebUtil.formatCharge(dealFee);
		}
		return dealFee;
	}

	/**
	 * ��z�L�� .
	 */
	private String arrangementFlg;

	/**
	 * ���L�� .
	 */
	private String planFlg;

	/**
	 * �^�A�敪 .
	 */
	private String trafficDiv;

	/**
	 * �V�K�敪 .
	 */
	private String newDiv;

	/**
	 * �R�s�[�����i�R�[�h .
	 */
	private String originalGoodsCd;

	/**
	 * �R�s�[�����i�R�[�h8�� .
	 */
	private String originalGoodsCd1;

	/**
	 * �R�s�[�����i�R�[�h2�� .
	 */
	private String originalGoodsCd2;

	/**
	 * �\��J�n�� .
	 */
	private String bookBeginDate;

	/**
	 * �\��J�n�� �� .
	 */
	private String bookBeginDateM;

	/**
	 * �\��J�n�� �� .
	 */
	private String bookBeginDateD;

	/**
	 * ���i�R�[�h .
	 */
	private String goodsCd;

	/**
	 * ���i�R�[�h8�� .
	 */
	private String goodsCd1;

	/**
	 * ���i�R�[�h2�� .
	 */
	private String goodsCd2;

	/**
	 * ���ރR�[�h .
	 */
	private String goodsKindCd;

	/**
	 * ������R�[�X��(�J�i�j .
	 */
	private String courseNmKana;

	/**
	 * ������R�[�X��(�����j .
	 */
	private String courseNmKanji;

	/**
	 * ��\�Җ� .
	 */
	private String ownerNm;

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
	 * �񋟊��ԊJ�n�N���� .
	 */
	private String termFromYmd;

	/**
	 * �񋟊��ԏI���N���� .
	 */
	private String termEndYmd;

	/**
	 * �񋟊��ԊJ�n�N .
	 */
	private String termFromY;

	/**
	 * �񋟊��ԊJ�n�� .
	 */
	private String termFromM;

	/**
	 * �񋟊��ԊJ�n�� .
	 */
	private String termFromD;

	/**
	 * �񋟊��ԏI���N .
	 */
	private String termEndY;

	/**
	 * �񋟊��ԏI���� .
	 */
	private String termEndM;

	/**
	 * �񋟊��ԏI���� .
	 */
	private String termEndD;

	/**
	 * ��d���� .
	 */
	private String liquidateDay;

	/**
	 * �L������ .
	 */
	private String validPeriod;

	/**
	 * ��d���ʒm���@�p�� .
	 */
	private String liquidateInformFlg;

	/**
	 * �\��ʒm���@�p�� .
	 */
	private String bookInformWayFlg;

	/**
	 * �D���o�͎w��L�� .
	 */
	private String personalTicketPrintFlg;

	/**
	 * �ʒm��t�@�b�N�X .
	 */
	private String informFax;

	/**
	 * �p�r .
	 */
	private String bookPurpose;

	/**
	 * �o������ .
	 */
	private String departureTime;

	/**
	 * �o�����Ԃ̎� .
	 */
	private String departureTimeH;

	/**
	 * �o�����Ԃ̕� .
	 */
	private String departureTimeM;

	/**
	 * �戵�萔�����݂���t���O .
	 */
	private String isDealFeeExist;

	/**
	 * �戵�萔�� .
	 */
	private String dealFee;

	/**
	 * �戵�萔����� .
	 */
	private String dealFeeType;

	/**
	 * �݌ɐ����t���O .
	 */
	private String stockControlFlg;

	/**
	 * �䐔�E�g���Ǘ��t���O .
	 */
	private String unitManageFlg;

	/**
	 * �݌ɔԍ� .
	 */
	private String stockNo;

	/**
	 * ���l .
	 */
	private String memo;

	/**
	 * �o�E�`���[���ē���(�J�i�j .
	 */
	private String voucherIntroKana;

	/**
	 * �o�E�`���[���ē����i�����j .
	 */
	private String voucherIntroKanji;

	/**
	 * ���O�� .
	 */
	private String exceptDate;

	/**
	 * �L�� .
	 */
	private String news;

	/**
	 * ����������� .
	 */
	private String cancelFeeCmt;

	/**
	 * ���T .
	 */
	private String special;

	/**
	 * �񋟗����l����� .
	 */
	private String maxCapaPattern;

	/**
	 * @return .
	 */
	public String getArrangementFlg() {
		return arrangementFlg;
	}

	/**
	 * @param arrangementFlg .
	 */
	public void setArrangementFlg(String arrangementFlg) {
		this.arrangementFlg = arrangementFlg;
	}

	/**
	 * @return �\��J�n��.
	 */
	public String getBookBeginDate() {
		return bookBeginDate;
	}

	/**
	 * @param bookBeginDate .
	 */
	public void setBookBeginDate(String bookBeginDate) {
		this.bookBeginDate = bookBeginDate;
	}

	/**
	 * @return �\��J�n�� ��.
	 */
	public String getBookBeginDateD() {
		return bookBeginDateD;
	}

	/**
	 * @param bookBeginDateD .
	 */
	public void setBookBeginDateD(String bookBeginDateD) {
		this.bookBeginDateD = bookBeginDateD;
	}

	/**
	 * @return �\��J�n�� ��.
	 */
	public String getBookBeginDateM() {
		return bookBeginDateM;
	}

	/**
	 * @param bookBeginDateM .
	 */
	public void setBookBeginDateM(String bookBeginDateM) {
		this.bookBeginDateM = bookBeginDateM;
	}

	/**
	 * @return �\��ʒm���@�p�� .
	 */
	public String getBookInformWayFlg() {
		return bookInformWayFlg;
	}

	/**
	 * @param bookInformWayFlg .
	 */
	public void setBookInformWayFlg(String bookInformWayFlg) {
		this.bookInformWayFlg = bookInformWayFlg;
	}

	/**
	 * @return �p�r .
	 */
	public String getBookPurpose() {
		return bookPurpose;
	}

	/**
	 * @param bookPurpose .
	 */
	public void setBookPurpose(String bookPurpose) {
		this.bookPurpose = bookPurpose;
	}

	/**
	 * @return �����������.
	 */
	public String getCancelFeeCmt() {
		return cancelFeeCmt;
	}

	/**
	 * @param cancelFeeCmt .
	 */
	public void setCancelFeeCmt(String cancelFeeCmt) {
		this.cancelFeeCmt = cancelFeeCmt;
	}

	/**
	 * @return ������R�[�X��(�J�i�j.
	 */
	public String getCourseNmKana() {
		return courseNmKana;
	}

	/**
	 * @param courseNmKana .
	 */
	public void setCourseNmKana(String courseNmKana) {
		this.courseNmKana = courseNmKana;
	}

	/**
	 * @return ������R�[�X��(�����j.
	 */
	public String getCourseNmKanji() {
		return courseNmKanji;
	}

	/**
	 * @param courseNmKanji .
	 */
	public void setCourseNmKanji(String courseNmKanji) {
		this.courseNmKanji = courseNmKanji;
	}

	/**
	 * @return �戵�萔��.
	 */
	public String getDealFee() {

		// �戵�萔����ʂ͉~�̏ꍇ�A������؂�̂Ă�
		if (JreConstants.EnTypeFlg.equals(getDealFeeType())) {
			//�����ł͂Ȃ��̏ꍇ�A���̂܂ܕԂ�. jinhuashi 720501
			if (!KikakuWebUtil.isNumber(dealFee) && !KikakuWebUtil.isFloat(dealFee)) {
				return dealFee;
			}
			if (!StringUtil.isEmpty(dealFee) && dealFee.length() > 0) {
				int dealFeeValue = Float.valueOf(dealFee).intValue();
				dealFee = String.valueOf(dealFeeValue);
			}

			return dealFee;
		} else {
			return dealFee;
		}
	}

	/**
	 * @param dealFee .
	 */
	public void setDealFee(String dealFee) {
		this.dealFee = StringUtil.toHalf(dealFee);
	}

	/**
	 * @return �戵�萔�����.
	 */
	public String getDealFeeType() {
		return dealFeeType;
	}

	/**
	 * @param dealFeeType .
	 */
	public void setDealFeeType(String dealFeeType) {
		this.dealFeeType = dealFeeType;
	}

	/**
	 * @return �o������.
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime .
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return �o�����Ԃ̎�.
	 */
	public String getDepartureTimeH() {
		return departureTimeH;
	}

	/**
	 * @param departureTimeH .
	 */
	public void setDepartureTimeH(String departureTimeH) {
		this.departureTimeH = departureTimeH;
	}

	/**
	 * @return �o�����Ԃ̕�.
	 */
	public String getDepartureTimeM() {
		return departureTimeM;
	}

	/**
	 * @param departureTimeM .
	 */
	public void setDepartureTimeM(String departureTimeM) {
		this.departureTimeM = departureTimeM;
	}

	/**
	 * @return ���O�� .
	 */
	public String getExceptDate() {
		return exceptDate;
	}

	/**
	 * @param exceptDate .
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
	 * @param facilityAddr .
	 */
	public void setFacilityAddr(String facilityAddr) {
		this.facilityAddr = facilityAddr;
	}

	/**
	 * @return �{�݃t�@�b�N�X .
	 */
	public String getFacilityFax() {
		return facilityFax == null ? "" : facilityFax.trim();
	}

	/**
	 * @param facilityFax .
	 */
	public void setFacilityFax(String facilityFax) {
		this.facilityFax = facilityFax;
	}

	/**
	 * @return �{�ݗX�֔ԍ� .
	 */
	public String getFacilityPostCd() {
		return facilityPostCd;
	}

	/**
	 * @param facilityPostCd .
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
	 * @param facilityTel .
	 */
	public void setFacilityTel(String facilityTel) {
		this.facilityTel = facilityTel;
	}

	/**
	 * @return ���i�R�[�h.
	 */
	public String getGoodsCd() {
		return goodsCd;
	}

	/**
	 * @param goodsCd .
	 */
	public void setGoodsCd(String goodsCd) {
		this.goodsCd = goodsCd;
	}

	/**
	 * @return ���i�R�[�h8bit.
	 */
	public String getGoodsCd1() {
		return goodsCd1;
	}

	/**
	 * @param goodsCd1 .
	 */
	public void setGoodsCd1(String goodsCd1) {
		this.goodsCd1 = goodsCd1;
	}

	/**
	 * @return ���i�R�[�h2bit.
	 */
	public String getGoodsCd2() {
		return goodsCd2;
	}

	/**
	 * @param goodsCd2 .
	 */
	public void setGoodsCd2(String goodsCd2) {
		this.goodsCd2 = goodsCd2;
	}

	/**
	 * @return ���ރR�[�h.
	 */
	public String getGoodsKindCd() {
		return goodsKindCd;
	}

	/**
	 * @param goodsKindCd .
	 */
	public void setGoodsKindCd(String goodsKindCd) {
		this.goodsKindCd = goodsKindCd;
	}

	/**
	 * @return �ʒm��t�@�b�N�X.
	 */
	public String getInformFax() {
		return informFax;
	}

	/**
	 * @param informFax .
	 */
	public void setInformFax(String informFax) {
		this.informFax = informFax;
	}

	/**
	 * @return ��d����.
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}

	/**
	 * @param liquidateDay .
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = StringUtil.toHalf(liquidateDay);
	}

	/**
	 * @return ��d���ʒm���@�p��.
	 */
	public String getLiquidateInformFlg() {
		return liquidateInformFlg;
	}

	/**
	 * @param liquidateInformFlg .
	 */
	public void setLiquidateInformFlg(String liquidateInformFlg) {
		this.liquidateInformFlg = liquidateInformFlg;
	}

	/**
	 * @return ���l.
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo .
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return �V�K�敪.
	 */
	public String getNewDiv() {
		return newDiv;
	}

	/**
	 * @param newDiv .
	 */
	public void setNewDiv(String newDiv) {
		this.newDiv = newDiv;
	}

	/**
	 * @return �L��.
	 */
	public String getNews() {
		return news;
	}

	/**
	 * @param news .
	 */
	public void setNews(String news) {
		this.news = news;
	}

	/**
	 * @return �R�s�[�����i�R�[�h .
	 */
	public String getOriginalGoodsCd() {
		return originalGoodsCd;
	}

	/**
	 * @param originalGoodsCd .
	 */
	public void setOriginalGoodsCd(String originalGoodsCd) {
		this.originalGoodsCd = originalGoodsCd;
	}

	/**
	 * @return �R�s�[�����i�R�[�h8bit.
	 */
	public String getOriginalGoodsCd1() {
		return originalGoodsCd1;
	}

	/**
	 * @param originalGoodsCd1 .
	 */
	public void setOriginalGoodsCd1(String originalGoodsCd1) {
		this.originalGoodsCd1 = originalGoodsCd1;
	}

	/**
	 * @return �R�s�[�����i�R�[�h2bit.
	 */
	public String getOriginalGoodsCd2() {
		return originalGoodsCd2;
	}

	/**
	 * @param originalGoodsCd2 .
	 */
	public void setOriginalGoodsCd2(String originalGoodsCd2) {
		this.originalGoodsCd2 = originalGoodsCd2;
	}

	/**
	 * @return ��\�Җ� .
	 */
	public String getOwnerNm() {
		return ownerNm;
	}

	/**
	 * @param ownerNm .
	 */
	public void setOwnerNm(String ownerNm) {
		this.ownerNm = ownerNm;
	}

	/**
	 * @return �D���o�͎w��L��.
	 */
	public String getPersonalTicketPrintFlg() {
		return personalTicketPrintFlg;
	}

	/**
	 * @param personalTicketPrintFlg .
	 */
	public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
		this.personalTicketPrintFlg = personalTicketPrintFlg;
	}

	/**
	 * @return ���L�� .
	 */
	public String getPlanFlg() {
		return planFlg;
	}

	/**
	 * @param planFlg .
	 */
	public void setPlanFlg(String planFlg) {
		this.planFlg = planFlg;
	}

	/**
	 * @return ���T.
	 */
	public String getSpecial() {
		return special;
	}

	/**
	 * @param special .
	 */
	public void setSpecial(String special) {
		this.special = special;
	}

	/**
	 * @return �݌ɐ����t���O.
	 */
	public String getStockControlFlg() {
		return stockControlFlg;
	}

	/**
	 * @param stockControlFlg .
	 */
	public void setStockControlFlg(String stockControlFlg) {
		this.stockControlFlg = stockControlFlg;
	}

	/**
	 * @return �݌ɔԍ�.
	 */
	public String getStockNo() {
		return stockNo;
	}

	/**
	 * @param stockNo .
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}

	/**
	 * @return �񋟊��ԏI���� .
	 */
	public String getTermEndD() {
		return termEndD;
	}

	/**
	 * @param termEndD .
	 */
	public void setTermEndD(String termEndD) {
		this.termEndD = StringUtil.toHalf(termEndD);
	}

	/**
	 * @return �񋟊��ԏI����.
	 */
	public String getTermEndM() {
		return termEndM;
	}

	/**
	 * @param termEndM .
	 */
	public void setTermEndM(String termEndM) {
		this.termEndM = StringUtil.toHalf(termEndM);
	}

	/**
	 * @return �񋟊��ԏI���N.
	 */
	public String getTermEndY() {
		return termEndY;
	}

	/**
	 * @param termEndY .
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = StringUtil.toHalf(termEndY);
	}

	/**
	 * @return �񋟊��ԊJ�n�� .
	 */
	public String getTermFromD() {
		return termFromD;
	}

	/**
	 * @param termFromD .
	 */
	public void setTermFromD(String termFromD) {
		this.termFromD = StringUtil.toHalf(termFromD);
	}

	/**
	 * @return �񋟊��ԊJ�n��.
	 */
	public String getTermFromM() {
		return termFromM;
	}

	/**
	 * @param termFromM .
	 */
	public void setTermFromM(String termFromM) {
		this.termFromM = StringUtil.toHalf(termFromM);
	}

	/**
	 * @return �񋟊��ԊJ�n�N .
	 */
	public String getTermFromY() {
		return termFromY;
	}

	/**
	 * @param termFromY .
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = StringUtil.toHalf(termFromY);
	}

	/**
	 * @return �^�A�敪.
	 */
	public String getTrafficDiv() {
		return trafficDiv;
	}

	/**
	 * @param trafficDiv .
	 */
	public void setTrafficDiv(String trafficDiv) {
		this.trafficDiv = trafficDiv;
	}

	/**
	 * @return �䐔�E�g���Ǘ��t���O.
	 */
	public String getUnitManageFlg() {
		return unitManageFlg;
	}

	/**
	 * @param unitManageFlg .
	 */
	public void setUnitManageFlg(String unitManageFlg) {
		this.unitManageFlg = unitManageFlg;
	}

	/**
	 * @return �L������.
	 */
	public String getValidPeriod() {
		return validPeriod;
	}

	/**
	 * @param validPeriod .
	 */
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = StringUtil.toHalf(validPeriod);
	}

	/**
	 * @return �o�E�`���[���ē���(�J�i�j.
	 */
	public String getVoucherIntroKana() {
		return voucherIntroKana;
	}

	/**
	 * @param voucherIntroKana .
	 */
	public void setVoucherIntroKana(String voucherIntroKana) {
		this.voucherIntroKana = voucherIntroKana;
	}

	/**
	 * @return �o�E�`���[���ē����i�����j.
	 */
	public String getVoucherIntroKanji() {
		return voucherIntroKanji;
	}

	/**
	 * @param voucherIntroKanji .
	 */
	public void setVoucherIntroKanji(String voucherIntroKanji) {
		this.voucherIntroKanji = voucherIntroKanji;
	}

	/**
	 * 
	 * @return �񋟊��ԏI���N���� .
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}

	/**
	 * 
	 * @param termEndYmd .
	 */
	public void setTermEndYmd(String termEndYmd) {
		this.termEndYmd = termEndYmd;
	}

	/**
	 * 
	 * @return �񋟊��ԊJ�n�N����.
	 */
	public String getTermFromYmd() {
		return termFromYmd;
	}

	/**
	 * 
	 * @param termFromYmd .
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
	}

	/**
	 * 
	 * @return �戵�萔�����݂���t���O.
	 */
	public String getIsDealFeeExist() {
		return isDealFeeExist;
	}

	/**
	 * 
	 * @param isDealFeeExist .
	 */
	public void setIsDealFeeExist(String isDealFeeExist) {
		this.isDealFeeExist = isDealFeeExist;
	}

	/**
	 * 
	 * @return .
	 */
	public String getMaxCapaPattern() {
		return maxCapaPattern;
	}

	/**
	 * 
	 * @param maxCapaPattern .
	 */
	public void setMaxCapaPattern(String maxCapaPattern) {
		this.maxCapaPattern = maxCapaPattern;
	}

}
