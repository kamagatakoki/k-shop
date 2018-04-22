package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 *  NO1�ό��f�[�^�N���X�B.
 *  �@�\�T�v    �F  NO1�ό��f�[�^���i�[����B
 *  ���L����    �F  ����
 * </pre>
 * 
 * @author zzy
 * @version 0.1 2006/11/17
 */
public class No1TravelData extends PlanAnsBaseData implements INo1CommonData {
	/**
	 * @return �萔���̕\���`���̎擾.
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
	 * ��z .
	 */
	private String arrangementFlg;

	/**
	 * ��� .
	 */
	private String planFlg;

	/**
	 * �V�K�敪 .
	 */
	private String newDiv;

	/**
	 * �R�s�[�����i�R�[�h .
	 */
	private String originalGoodsCd;

	/**
	 * �R�s�[�����i�R�[�h1 .
	 */
	private String originalGoodsCd1;

	/**
	 * �R�s�[�����i�R�[�h2 .
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
	 * ���i�R�[�h1 .
	 */
	private String goodsCd1;

	/**
	 * ���i�R�[�h2 .
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
	 * �n�於�i�J�i�j .
	 */
	private String areaNmKana;

	/**
	 * �n�於�i�����j .
	 */
	private String areaNmKanji;

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
	 * �ʒm��t�@�b�N�X .
	 */
	private String informFax;

	/**
	 * �\���� .
	 */
	private String bookKind;

	/**
	 * �p�r .
	 */
	private String bookPurpose;

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
	 * �H���ꏊ .
	 */
	private String mealSite;

	/**
	 * �x�e�ꏊ .
	 */
	private String restSite;

	/**
	 * �������|�J�n .
	 */
	private String bathCleanBegin;

	/**
	 * �������|�I�� .
	 */
	private String bathCleanEnd;

	/**
	 * �������|�J�n �� .
	 */
	private String bathCleanBeginH;

	/**
	 * �������|�J�n �� .
	 */
	private String bathCleanBeginM;

	/**
	 * �������|�I�� �� .
	 */
	private String bathCleanEndH;

	/**
	 * �������|�I�� �� .
	 */
	private String bathCleanEndM;

	/**
	 * �\�����ڂP .
	 */
	private String otherItem1;

	/**
	 * �\�����ڂP�J�n .
	 */
	private String otherItem1Begin;

	/**
	 * �\�����ڂP�I�� .
	 */
	private String otherItem1End;

	/**
	 * �\�����ڂQ .
	 */
	private String otherItem2;

	/**
	 * �\�����ڂQ�J�n .
	 */
	private String otherItem2Begin;

	/**
	 * �\�����ڂQ�I�� .
	 */
	private String otherItem2End;

	/**
	 * �\�����ڂR .
	 */
	private String otherItem3;

	/**
	 * �\�����ڂR�J�n .
	 */
	private String otherItem3Begin;

	/**
	 * �\�����ڂR�I�� .
	 */
	private String otherItem3End;

	/**
	 * �\�����ڂP�J�n �� .
	 */
	private String otherItem1BeginH;

	/**
	 * �\�����ڂP�J�n �� .
	 */
	private String otherItem1BeginM;

	/**
	 * �\�����ڂQ�J�n �� .
	 */
	private String otherItem2BeginH;

	/**
	 * �\�����ڂQ�J�n �� .
	 */
	private String otherItem2BeginM;

	/**
	 * �\�����ڂR�J�n �� .
	 */
	private String otherItem3BeginH;

	/**
	 * �\�����ڂR�J�n �� .
	 */
	private String otherItem3BeginM;

	/**
	 * �\�����ڂP�I�� �� .
	 */
	private String otherItem1EndH;

	/**
	 * �\�����ڂP�I�� �� .
	 */
	private String otherItem1EndM;

	/**
	 * �\�����ڂQ�I�� �� .
	 */
	private String otherItem2EndH;

	/**
	 * �\�����ڂQ�I�� �� .
	 */
	private String otherItem2EndM;

	/**
	 * �\�����ڂR�I�� �� .
	 */
	private String otherItem3EndH;

	/**
	 * �\�����ڂR�I�� �� .
	 */
	private String otherItem3EndM;

	/**
	 * �t���T�[�r�X�P .
	 */
	private String additionalService1;

	/**
	 * �t���T�[�r�X�Q .
	 */
	private String additionalService2;

	/**
	 * �t���T�[�r�X�R .
	 */
	private String additionalService3;

	/**
	 * ���R���͗� .
	 */
	private String freelyColumn;

	/**
	 * �񋟗����l����� .
	 */
	private String maxCapaPattern;

	/**
	 * @return .
	 */
	public String getAdditionalService1() {
		return additionalService1;
	}

	/**
	 * @param additionalService1 .
	 */
	public void setAdditionalService1(String additionalService1) {
		this.additionalService1 = additionalService1;
	}

	/**
	 * @return �t���T�[�r�X�Q .
	 */
	public String getAdditionalService2() {
		return additionalService2;
	}

	/**
	 * @param additionalService2 .
	 */
	public void setAdditionalService2(String additionalService2) {
		this.additionalService2 = additionalService2;
	}

	/**
	 * @return �t���T�[�r�X�R.
	 */
	public String getAdditionalService3() {
		return additionalService3;
	}

	/**
	 * @param additionalService3 .
	 */
	public void setAdditionalService3(String additionalService3) {
		this.additionalService3 = additionalService3;
	}

	/**
	 * @return �n�於�i�J�i�j.
	 */
	public String getAreaNmKana() {
		return areaNmKana;
	}

	/**
	 * @param areaNmKana .
	 */
	public void setAreaNmKana(String areaNmKana) {
		this.areaNmKana = areaNmKana;
	}

	/**
	 * @return �n�於�i�����j.
	 */
	public String getAreaNmKanji() {
		return areaNmKanji;
	}

	/**
	 * @param areaNmKanji .
	 */
	public void setAreaNmKanji(String areaNmKanji) {
		this.areaNmKanji = areaNmKanji;
	}

	/**
	 * @return �������|�J�n .
	 */
	public String getBathCleanBegin() {
		return bathCleanBegin;
	}

	/**
	 * @param bathCleanBegin .
	 */
	public void setBathCleanBegin(String bathCleanBegin) {
		this.bathCleanBegin = bathCleanBegin;
	}

	/**
	 * @return �������|�I��.
	 */
	public String getBathCleanEnd() {
		return bathCleanEnd;
	}

	/**
	 * @param bathCleanEnd .
	 */
	public void setBathCleanEnd(String bathCleanEnd) {
		this.bathCleanEnd = bathCleanEnd;
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
	 * @return �\����.
	 */
	public String getBookKind() {
		return bookKind;
	}

	/**
	 * @param bookKind .
	 */
	public void setBookKind(String bookKind) {
		this.bookKind = bookKind;
	}

	/**
	 * @return �p�r.
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
	 * @return �戵�萔����� .
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
	 * @return ���O��.
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
	 * @return �{�݃t�@�b�N�X.
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
	 * @return �{�ݗX�֔ԍ�.
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
	 * @return ���R���͗�.
	 */
	public String getFreelyColumn() {
		return freelyColumn;
	}

	/**
	 * @param freelyColumn .
	 */
	public void setFreelyColumn(String freelyColumn) {
		this.freelyColumn = freelyColumn;
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
	 * @return �H���ꏊ.
	 */
	public String getMealSite() {
		return mealSite;
	}

	/**
	 * @param mealSite .
	 */
	public void setMealSite(String mealSite) {
		this.mealSite = mealSite;
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
	 * @return �R�s�[�����i�R�[�h.
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
	 * @return �\�����ڂP .
	 */
	public String getOtherItem1() {
		return otherItem1;
	}

	/**
	 * @param otherItem1 .
	 */
	public void setOtherItem1(String otherItem1) {
		this.otherItem1 = otherItem1;
	}

	/**
	 * @return �\�����ڂP�J�n.
	 */
	public String getOtherItem1Begin() {
		return otherItem1Begin;
	}

	/**
	 * @param otherItem1Begin .
	 */
	public void setOtherItem1Begin(String otherItem1Begin) {
		this.otherItem1Begin = otherItem1Begin;
	}

	/**
	 * @return �\�����ڂP�I��.
	 */
	public String getOtherItem1End() {
		return otherItem1End;
	}

	/**
	 * @param otherItem1End .
	 */
	public void setOtherItem1End(String otherItem1End) {
		this.otherItem1End = otherItem1End;
	}

	/**
	 * @return �\�����ڂQ .
	 */
	public String getOtherItem2() {
		return otherItem2;
	}

	/**
	 * @param otherItem2 .
	 */
	public void setOtherItem2(String otherItem2) {
		this.otherItem2 = otherItem2;
	}

	/**
	 * @return �\�����ڂQ�J�n.
	 */
	public String getOtherItem2Begin() {
		return otherItem2Begin;
	}

	/**
	 * @param otherItem2Begin .
	 */
	public void setOtherItem2Begin(String otherItem2Begin) {
		this.otherItem2Begin = otherItem2Begin;
	}

	/**
	 * @return �\�����ڂQ�I��.
	 */
	public String getOtherItem2End() {
		return otherItem2End;
	}

	/**
	 * @param otherItem2End .
	 */
	public void setOtherItem2End(String otherItem2End) {
		this.otherItem2End = otherItem2End;
	}

	/**
	 * @return �\�����ڂR.
	 */
	public String getOtherItem3() {
		return otherItem3;
	}

	/**
	 * @param otherItem3 .
	 */
	public void setOtherItem3(String otherItem3) {
		this.otherItem3 = otherItem3;
	}

	/**
	 * @return �\�����ڂR�J�n.
	 */
	public String getOtherItem3Begin() {
		return otherItem3Begin;
	}

	/**
	 * @param otherItem3Begin .
	 */
	public void setOtherItem3Begin(String otherItem3Begin) {
		this.otherItem3Begin = otherItem3Begin;
	}

	/**
	 * @return �\�����ڂR�I��.
	 */
	public String getOtherItem3End() {
		return otherItem3End;
	}

	/**
	 * @param otherItem3End .
	 */
	public void setOtherItem3End(String otherItem3End) {
		this.otherItem3End = otherItem3End;
	}

	/**
	 * @return ��\�Җ�.
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
	 * @return �x�e�ꏊ.
	 */
	public String getRestSite() {
		return restSite;
	}

	/**
	 * @param restSite .
	 */
	public void setRestSite(String restSite) {
		this.restSite = restSite;
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
	 * @return �݌ɔԍ� .
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
	 * @return �񋟊��ԏI���N����.
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}

	/**
	 * @param termEndYmd .
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
	 * @param termFromYmd .
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
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
	 * @return �R�s�[�����i�R�[�h1.
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
	 * @return �R�s�[�����i�R�[�h2.
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
	 * 
	 * @return ���i�R�[�h1.
	 */
	public String getGoodsCd1() {
		return goodsCd1;
	}

	/**
	 * 
	 * @param goodsCd1 .
	 */
	public void setGoodsCd1(String goodsCd1) {
		this.goodsCd1 = goodsCd1;
	}

	/**
	 * 
	 * @return ���i�R�[�h2.
	 */
	public String getGoodsCd2() {
		return goodsCd2;
	}

	/**
	 * 
	 * @param goodsCd2 .
	 */
	public void setGoodsCd2(String goodsCd2) {
		this.goodsCd2 = goodsCd2;
	}

	/**
	 * 
	 * @return �\��J�n�� �� .
	 */
	public String getBookBeginDateM() {
		return bookBeginDateM;
	}

	/**
	 * 
	 * @param bookBeginDateM .
	 */
	public void setBookBeginDateM(String bookBeginDateM) {
		this.bookBeginDateM = bookBeginDateM;
	}

	/**
	 * 
	 * @return �\��J�n�� ��.
	 */
	public String getBookBeginDateD() {
		return bookBeginDateD;
	}

	/**
	 * 
	 * @param bookBeginDateD .
	 */
	public void setBookBeginDateD(String bookBeginDateD) {
		this.bookBeginDateD = bookBeginDateD;
	}

	/**
	 * @return �񋟊��ԏI����.
	 */
	public String getTermEndD() {
		return termEndD;
	}

	/**
	 * @return �񋟊��ԏI����.
	 */
	public String getTermEndM() {
		return termEndM;
	}

	/**
	 * @return �񋟊��ԏI���N.
	 */
	public String getTermEndY() {
		return termEndY;
	}

	/**
	 * @return �񋟊��ԊJ�n��.
	 */
	public String getTermFromD() {
		return termFromD;
	}

	/**
	 * @return �񋟊��ԊJ�n�� .
	 */
	public String getTermFromM() {
		return termFromM;
	}

	/**
	 * @return �񋟊��ԊJ�n�N.
	 */
	public String getTermFromY() {
		return termFromY;
	}

	/**
	 * @param termEndD .
	 */
	public void setTermEndD(String termEndD) {
		this.termEndD = StringUtil.toHalf(termEndD);
	}

	/**
	 * @param termEndM .
	 */
	public void setTermEndM(String termEndM) {
		this.termEndM = StringUtil.toHalf(termEndM);
	}

	/**
	 * @param termEndY .
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = StringUtil.toHalf(termEndY);
	}

	/**
	 * @param termFromD .
	 */
	public void setTermFromD(String termFromD) {
		this.termFromD = StringUtil.toHalf(termFromD);
	}

	/**
	 * @param termFromM .
	 */
	public void setTermFromM(String termFromM) {
		this.termFromM = StringUtil.toHalf(termFromM);
	}

	/**
	 * @param termFromY .
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = StringUtil.toHalf(termFromY);
	}

	/**
	 * @return �������|�J�n ��.
	 */
	public String getBathCleanBeginH() {
		return bathCleanBeginH;
	}

	/**
	 * @param bathCleanBeginH .
	 */
	public void setBathCleanBeginH(String bathCleanBeginH) {
		this.bathCleanBeginH = bathCleanBeginH;
	}

	/**
	 * @return �������|�J�n ��.
	 */
	public String getBathCleanBeginM() {
		return bathCleanBeginM;
	}

	/**
	 * @param bathCleanBeginM .
	 */
	public void setBathCleanBeginM(String bathCleanBeginM) {
		this.bathCleanBeginM = bathCleanBeginM;
	}

	/**
	 * @return �������|�I�� �� .
	 */
	public String getBathCleanEndH() {
		return bathCleanEndH;
	}

	/**
	 * @param bathCleanEndH .
	 */
	public void setBathCleanEndH(String bathCleanEndH) {
		this.bathCleanEndH = bathCleanEndH;
	}

	/**
	 * @return �������|�I�� ��.
	 */
	public String getBathCleanEndM() {
		return bathCleanEndM;
	}

	/**
	 * @param bathCleanEndM .
	 */
	public void setBathCleanEndM(String bathCleanEndM) {
		this.bathCleanEndM = bathCleanEndM;
	}

	/**
	 * @return �\�����ڂP�J�n ��.
	 */
	public String getOtherItem1BeginH() {
		return otherItem1BeginH;
	}

	/**
	 * @param otherItem1BeginH .
	 */
	public void setOtherItem1BeginH(String otherItem1BeginH) {
		this.otherItem1BeginH = otherItem1BeginH;
	}

	/**
	 * @return �\�����ڂP�J�n ��.
	 */
	public String getOtherItem1BeginM() {
		return otherItem1BeginM;
	}

	/**
	 * @param otherItem1BeginM .
	 */
	public void setOtherItem1BeginM(String otherItem1BeginM) {
		this.otherItem1BeginM = otherItem1BeginM;
	}

	/**
	 * @return �\�����ڂP�I�� ��.
	 */
	public String getOtherItem1EndH() {
		return otherItem1EndH;
	}

	/**
	 * @param otherItem1EndH .
	 */
	public void setOtherItem1EndH(String otherItem1EndH) {
		this.otherItem1EndH = otherItem1EndH;
	}

	/**
	 * @return �\�����ڂP�I�� ��.
	 */
	public String getOtherItem1EndM() {
		return otherItem1EndM;
	}

	/**
	 * @param otherItem1EndM .
	 */
	public void setOtherItem1EndM(String otherItem1EndM) {
		this.otherItem1EndM = otherItem1EndM;
	}

	/**
	 * @return �\�����ڂQ�J�n �� .
	 */
	public String getOtherItem2BeginH() {
		return otherItem2BeginH;
	}

	/**
	 * @param otherItem2BeginH .
	 */
	public void setOtherItem2BeginH(String otherItem2BeginH) {
		this.otherItem2BeginH = otherItem2BeginH;
	}

	/**
	 * @return �\�����ڂQ�J�n ��.
	 */
	public String getOtherItem2BeginM() {
		return otherItem2BeginM;
	}

	/**
	 * @param otherItem2BeginM .
	 */
	public void setOtherItem2BeginM(String otherItem2BeginM) {
		this.otherItem2BeginM = otherItem2BeginM;
	}

	/**
	 * @return �\�����ڂQ�I�� ��.
	 */
	public String getOtherItem2EndH() {
		return otherItem2EndH;
	}

	/**
	 * @param otherItem2EndH .
	 */
	public void setOtherItem2EndH(String otherItem2EndH) {
		this.otherItem2EndH = otherItem2EndH;
	}

	/**
	 * @return �\�����ڂQ�I�� ��.
	 */
	public String getOtherItem2EndM() {
		return otherItem2EndM;
	}

	/**
	 * @param otherItem2EndM .
	 */
	public void setOtherItem2EndM(String otherItem2EndM) {
		this.otherItem2EndM = otherItem2EndM;
	}

	/**
	 * @return �\�����ڂR�J�n ��.
	 */
	public String getOtherItem3BeginH() {
		return otherItem3BeginH;
	}

	/**
	 * @param otherItem3BeginH .
	 */
	public void setOtherItem3BeginH(String otherItem3BeginH) {
		this.otherItem3BeginH = otherItem3BeginH;
	}

	/**
	 * @return �\�����ڂR�J�n ��.
	 */
	public String getOtherItem3BeginM() {
		return otherItem3BeginM;
	}

	/**
	 * @param otherItem3BeginM .
	 */
	public void setOtherItem3BeginM(String otherItem3BeginM) {
		this.otherItem3BeginM = otherItem3BeginM;
	}

	/**
	 * @return �\�����ڂR�I�� �� .
	 */
	public String getOtherItem3EndH() {
		return otherItem3EndH;
	}

	/**
	 * @param otherItem3EndH .
	 */
	public void setOtherItem3EndH(String otherItem3EndH) {
		this.otherItem3EndH = otherItem3EndH;
	}

	/**
	 * @return �\�����ڂR�I�� ��.
	 */
	public String getOtherItem3EndM() {
		return otherItem3EndM;
	}

	/**
	 * @param otherItem3EndM .
	 */
	public void setOtherItem3EndM(String otherItem3EndM) {
		this.otherItem3EndM = otherItem3EndM;
	}

	/**
	 * 
	 * @return arrangementFlg
	 */
	public String getArrangementFlg() {
		return arrangementFlg;
	}

	/**
	 * 
	 * @param arrangementFlg
	 *            arrangementFlg
	 */
	public void setArrangementFlg(String arrangementFlg) {
		this.arrangementFlg = arrangementFlg;
	}

	/**
	 * 
	 * @return planFlg
	 */
	public String getPlanFlg() {
		return planFlg;
	}

	/**
	 * 
	 * @param planFlg
	 *            planFlg
	 */
	public void setPlanFlg(String planFlg) {
		this.planFlg = planFlg;
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
