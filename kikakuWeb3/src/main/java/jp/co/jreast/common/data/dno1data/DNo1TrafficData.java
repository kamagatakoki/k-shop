package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 *  NO1�D�ԃf�[�^�N���X�B.
 *  �@�\�T�v    �F  NO1�D�ԃf�[�^���i�[����B
 *  ���L����    �F  ����
 * </pre>
 */
public class DNo1TrafficData extends PlanAnsBaseData implements IDNo1CommonData {

    /**
     * �G���A�R�[�h
     */
    private String areaCd;

    /**
     * ��z�L�� .
     */
    private String arrangementFlg;

    /**
     * �\��J�n�� .
     */
    private String bookBeginDate;

    /**
     * �\��J�n�� �� .
     */
    private String bookBeginDateD;

    /**
     * �\��J�n�� �� .
     */
    private String bookBeginDateM;

    /**
     * �\��J�n���Γ�
     */
    private String bookBeginRelativeDate;

    /**
     * �\��J�n���΋敪
     */
    private String bookBeginRelativeDiv;

    /**
     * �\��J�n���Ό�
     */
    private String bookBeginRelativeMonth;

    /**
     * �p�r .
     */
    private String bookPurpose;

    /**
     * ����������� .
     */
    private String cancelFeeCmt;

    /**
     * �����P�ʋ敪
     */
    private String chargeDiv;

    /**
     * �q���N��From
     */
    private String childAgeFrom;

    /**
     * �q���N��To
     */
    private String childAgeTo;

    /**
     * ������R�[�X��(�J�i�j .
     */
    private String courseNmKana;

    /**
     * ������R�[�X��(�����j .
     */
    private String courseNmKanji;

    /**
     * �戵�萔�� .
     */
    private String dealFee;

    /**
     * �戵�萔����� .
     */
    private String dealFeeType;

    /**
     * ���O�� .
     */
    private String exceptDate;

    /**
     * �{�ݏZ�� .
     */
    private String facilityAddr;

    /**
     * �{�݃t�@�b�N�X .
     */
    private String facilityFax;

    /**
     * �{�ݗX�֔ԍ� .
     */
    private String facilityPostCd;

    /**
     * �{�ݓd�b .
     */
    private String facilityTel;

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
     * ����
     */
    private String grade;

    /**
     * �ʒm��n�於
     */
    private String informAreaNm;

    /**
     * �ʒm��t�@�b�N�X .
     */
    private String informFax;

    /**
     * �ʒm�於
     */
    private String informNm;

    /**
     * �戵�萔�����݂���t���O .
     */
    private String isDealFeeExist;

    /**
     * ��d���� .
     */
    private String liquidateDay;

    /**
     * ��d���ʒm���@�p�� .
     */
    private String liquidateInformFlg;

    /**
     * ��d�������i�����ݒ莞�j
     */
    private String liquidateTime;

    /**
     * ��d�������i�����ݒ莞�j�i���j
     */
    private String liquidateTimeHour;

    /**
     * ��d�������i�����ݒ莞�j�i���j
     */
    private String liquidateTimeMinute;

    /**
     * �񋟗����l����� .
     */
    private String maxCapaPattern;

    /**
     * ���l .
     */
    private String memo;

    /**
     * ���������p�^�[���t���O
     */
    private String multiFeePatternFlg;

    /**
     * �V�K�敪 .
     */
    private String newDiv;

    /**
     * �L�� .
     */
    private String news;

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
     * ��\�Җ� .
     */
    private String ownerNm;

    /**
     * �D���o�͎w��L�� .
     */
    private String personalTicketPrintFlg;

    /**
     * ���L�� .
     */
    private String planFlg;

    /**
     * �s���{���R�[�h
     */
    private String prefecturesCd;

    /**
     * �n��R�[�h
     */
    private String regionCd;

    /**
     * �\��ʒm���@�p�� .
     */
    private String reserveInformWay;

    /**
     * �V�j�A�N��From
     */
    private String seniorAgeFrom;

    /**
     * ���T .
     */
    private String special;

    /**
     * �Z���i�݌Ɂj
     */
    private String stockAddr;

    /**
     * �݌ɐ����t���O .
     */
    private String stockControlFlg;

    /**
     * �݌ɖ��́i�J�i�j
     */
    private String stockKana;

    /**
     * �݌ɖ��́i�����j
     */
    private String stockKanj;

    /**
     * �䐔�E�g���Ǘ��t���O .
     */
    private String stockManagement;

    /**
     * �݌ɔԍ� .
     */
    private String stockNo;

    /**
     * �X�֔ԍ��i�݌Ɂj
     */
    private String stockPostCd;

    /**
     * �d�b�ԍ��i�݌Ɂj
     */
    private String stockTel;

    /**
     * �݌ɒP��
     */
    private String stockUnit;

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
     * �񋟊��ԏI���N���� .
     */
    private String termEndYmd;

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
     * �񋟊��ԊJ�n�N���� .
     */
    private String termFromYmd;

    /**
     * �^�A�敪 .
     */
    private String trafficDiv;

    /**
     * �L������ .
     */
    private String validPeriod;

    /**
     * �o�E�`���[���X��
     */
    private String voucherFlg;

    /**
     * �G���A�R�[�h���擾���܂��B
     * 
     * @return �G���A�R�[�h
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * @return .
     */
    public String getArrangementFlg() {
        return arrangementFlg;
    }

    /**
     * @return �\��J�n��.
     */
    public String getBookBeginDate() {
        return bookBeginDate;
    }

    /**
     * @return �\��J�n�� ��.
     */
    public String getBookBeginDateD() {
        return bookBeginDateD;
    }

    /**
     * @return �\��J�n�� ��.
     */
    public String getBookBeginDateM() {
        return bookBeginDateM;
    }

    /**
     * �\��J�n���Γ����擾���܂��B
     * 
     * @return �\��J�n���Γ�
     */
    public String getBookBeginRelativeDate() {
        return bookBeginRelativeDate;
    }

    /**
     * �\��J�n���΋敪���擾���܂��B
     * 
     * @return �\��J�n���΋敪
     */
    public String getBookBeginRelativeDiv() {
        return bookBeginRelativeDiv;
    }

    /**
     * �\��J�n���Ό����擾���܂��B
     * 
     * @return �\��J�n���Ό�
     */
    public String getBookBeginRelativeMonth() {
        return bookBeginRelativeMonth;
    }

    /**
     * @return �p�r .
     */
    public String getBookPurpose() {
        return bookPurpose;
    }

    /**
     * @return �����������.
     */
    public String getCancelFeeCmt() {
        return cancelFeeCmt;
    }

    /**
     * �����P�ʋ敪���擾���܂��B
     * 
     * @return �����P�ʋ敪
     */
    public String getChargeDiv() {
        return chargeDiv;
    }

    /**
     * �q���N��From���擾���܂��B
     * 
     * @return �q���N��From
     */
    public String getChildAgeFrom() {
        return childAgeFrom;
    }

    /**
     * �q���N��To���擾���܂��B
     * 
     * @return �q���N��To
     */
    public String getChildAgeTo() {
        return childAgeTo;
    }

    /**
     * @return ������R�[�X��(�J�i�j.
     */
    public String getCourseNmKana() {
        return courseNmKana;
    }

    /**
     * @return ������R�[�X��(�����j.
     */
    public String getCourseNmKanji() {
        return courseNmKanji;
    }

    /**
     * @return �戵�萔��.
     */
    public String getDealFee() {

        // �戵�萔����ʂ͉~�̏ꍇ�A������؂�̂Ă�
        if (JreConstants.EnTypeFlg.equals(getDealFeeType())) {
            //�����ł͂Ȃ��̏ꍇ�A���̂܂ܕԂ�. jinhuashi 720501
            if (!DKikakuWebUtil.isNumber(dealFee)
                    && !DKikakuWebUtil.isFloat(dealFee)) {
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
     * �萔���̕\���������擾.
     * 
     * @return ����ܕt���萔��
     */
    @Override
    public String getDealFeeDisplay() {
        if (!StringUtil.isEmpty(dealFee)
                && !StringUtil.isEmpty(getDealFeeType())
                && JreConstants.DEAL_FEE_YEN_VALUE.equals(getDealFeeType())) {
            return DKikakuWebUtil.formatCharge(dealFee);
        }
        return dealFee;
    }

    /**
     * @return �戵�萔�����.
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * @return ���O�� .
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * @return �{�ݏZ��.
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * @return �{�݃t�@�b�N�X .
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * @return �{�ݗX�֔ԍ� .
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * @return �{�ݓd�b.
     */
    public String getFacilityTel() {
        return facilityTel == null ? "" : facilityTel.trim();
    }

    /**
     * @return ���i�R�[�h.
     */
    public String getGoodsCd() {
        return goodsCd;
    }

    /**
     * ���i�R�[�h8�� .���擾���܂��B
     * 
     * @return ���i�R�[�h8�� .
     */
    public String getGoodsCd1() {
        return goodsCd1;
    }

    /**
     * ���i�R�[�h2�� .���擾���܂��B
     * 
     * @return ���i�R�[�h2�� .
     */
    public String getGoodsCd2() {
        return goodsCd2;
    }

    /**
     * @return ���ރR�[�h.
     */
    public String getGoodsKindCd() {
        return goodsKindCd;
    }

    /**
     * �������擾���܂��B
     * 
     * @return ����
     */
    public String getGrade() {
        return grade;
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
     * @return �ʒm��t�@�b�N�X.
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
     * @return �戵�萔�����݂���t���O.
     */
    public String getIsDealFeeExist() {
        return isDealFeeExist;
    }

    /**
     * @return ��d����.
     */
    public String getLiquidateDay() {
        return liquidateDay;
    }

    /**
     * @return ��d���ʒm���@�p��.
     */
    public String getLiquidateInformFlg() {
        return liquidateInformFlg;
    }

    /**
     * ��d�������i�����ݒ莞�j���擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j
     */
    public String getLiquidateTime() {
        return liquidateTime;
    }

    /**
     * ��d�������i�����ݒ莞�j�i���j���擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j�i���j
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
     * @return .
     */
    public String getMaxCapaPattern() {
        return maxCapaPattern;
    }

    /**
     * @return ���l.
     */
    public String getMemo() {
        return memo;
    }

    /**
     * ���������p�^�[���t���O���擾���܂��B
     * 
     * @return ���������p�^�[���t���O
     */
    public String getMultiFeePatternFlg() {
        return multiFeePatternFlg;
    }

    /**
     * @return �V�K�敪.
     */
    public String getNewDiv() {
        return newDiv;
    }

    /**
     * @return �L��.
     */
    public String getNews() {
        return news;
    }

    /**
     * @return �R�s�[�����i�R�[�h .
     */
    public String getOriginalGoodsCd() {
        return originalGoodsCd;
    }

    /**
     * �R�s�[�����i�R�[�h8�� .���擾���܂��B
     * 
     * @return �R�s�[�����i�R�[�h8�� .
     */
    public String getOriginalGoodsCd1() {
        return originalGoodsCd1;
    }

    /**
     * �R�s�[�����i�R�[�h2�� .���擾���܂��B
     * 
     * @return �R�s�[�����i�R�[�h2�� .
     */
    public String getOriginalGoodsCd2() {
        return originalGoodsCd2;
    }

    /**
     * @return ��\�Җ� .
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * @return �D���o�͎w��L��.
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
    }

    /**
     * @return ���L�� .
     */
    public String getPlanFlg() {
        return planFlg;
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
     * �\��ʒm���@�p�� .���擾���܂��B
     * 
     * @return �\��ʒm���@�p�� .
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * �V�j�A�N��From���擾���܂��B
     * 
     * @return �V�j�A�N��From
     */
    public String getSeniorAgeFrom() {
        return seniorAgeFrom;
    }

    /**
     * @return ���T.
     */
    public String getSpecial() {
        return special;
    }

    /**
     * �Z���i�݌Ɂj���擾���܂��B
     * 
     * @return �Z���i�݌Ɂj
     */
    public String getStockAddr() {
        return stockAddr;
    }

    /**
     * @return �݌ɐ����t���O.
     */
    public String getStockControlFlg() {
        return stockControlFlg;
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
     * @return �䐔�E�g���Ǘ��t���O.
     */
    public String getStockManagement() {
        return stockManagement;
    }

    /**
     * @return �݌ɔԍ�.
     */
    public String getStockNo() {
        return stockNo;
    }

    /**
     * �X�֔ԍ��i�݌Ɂj���擾���܂��B
     * 
     * @return �X�֔ԍ��i�݌Ɂj
     */
    public String getStockPostCd() {
        return stockPostCd;
    }

    /**
     * �d�b�ԍ��i�݌Ɂj���擾���܂��B
     * 
     * @return �d�b�ԍ��i�݌Ɂj
     */
    public String getStockTel() {
        return stockTel;
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
     * @return �񋟊��ԏI���� .
     */
    @Override
    public String getTermEndD() {
        return termEndD;
    }

    /**
     * @return �񋟊��ԏI����.
     */
    @Override
    public String getTermEndM() {
        return termEndM;
    }

    /**
     * @return �񋟊��ԏI���N.
     */
    @Override
    public String getTermEndY() {
        return termEndY;
    }

    /**
     * @return �񋟊��ԏI���N���� .
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * @return �񋟊��ԊJ�n�� .
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * @return �񋟊��ԊJ�n��.
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * @return �񋟊��ԊJ�n�N .
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * @return �񋟊��ԊJ�n�N����.
     */
    public String getTermFromYmd() {
        return termFromYmd;
    }

    /**
     * @return �^�A�敪.
     */
    public String getTrafficDiv() {
        return trafficDiv;
    }

    /**
     * @return �L������.
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * �o�E�`���[���X�ۂ��擾���܂��B
     * 
     * @return �o�E�`���[���X��
     */
    public String getVoucherFlg() {
        return voucherFlg;
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
     * @param arrangementFlg
     *            .
     */
    public void setArrangementFlg(String arrangementFlg) {
        this.arrangementFlg = arrangementFlg;
    }

    /**
     * @param bookBeginDate
     *            .
     */
    public void setBookBeginDate(String bookBeginDate) {
        this.bookBeginDate = bookBeginDate;
    }

    /**
     * @param bookBeginDateD
     *            .
     */
    public void setBookBeginDateD(String bookBeginDateD) {
        this.bookBeginDateD = bookBeginDateD;
    }

    /**
     * @param bookBeginDateM
     *            .
     */
    public void setBookBeginDateM(String bookBeginDateM) {
        this.bookBeginDateM = bookBeginDateM;
    }

    /**
     * �\��J�n���Γ���ݒ肵�܂��B
     * 
     * @param bookBeginRelativeDate
     *            �\��J�n���Γ�
     */
    public void setBookBeginRelativeDate(String bookBeginRelativeDate) {
        this.bookBeginRelativeDate = bookBeginRelativeDate;
    }

    /**
     * �\��J�n���΋敪��ݒ肵�܂��B
     * 
     * @param bookBeginRelativeDiv
     *            �\��J�n���΋敪
     */
    public void setBookBeginRelativeDiv(String bookBeginRelativeDiv) {
        this.bookBeginRelativeDiv = bookBeginRelativeDiv;
    }

    /**
     * �\��J�n���Ό���ݒ肵�܂��B
     * 
     * @param bookBeginRelativeMonth
     *            �\��J�n���Ό�
     */
    public void setBookBeginRelativeMonth(String bookBeginRelativeMonth) {
        this.bookBeginRelativeMonth = bookBeginRelativeMonth;
    }

    /**
     * @param bookPurpose
     *            .
     */
    public void setBookPurpose(String bookPurpose) {
        this.bookPurpose = bookPurpose;
    }

    /**
     * @param cancelFeeCmt
     *            .
     */
    public void setCancelFeeCmt(String cancelFeeCmt) {
        this.cancelFeeCmt = cancelFeeCmt;
    }

    /**
     * �����P�ʋ敪��ݒ肵�܂��B
     * 
     * @param chargeDiv
     *            �����P�ʋ敪
     */
    public void setChargeDiv(String chargeDiv) {
        this.chargeDiv = chargeDiv;
    }

    /**
     * �q���N��From��ݒ肵�܂��B
     * 
     * @param childAgeFrom
     *            �q���N��From
     */
    public void setChildAgeFrom(String childAgeFrom) {
        this.childAgeFrom = childAgeFrom;
    }

    /**
     * �q���N��To��ݒ肵�܂��B
     * 
     * @param childAgeTo
     *            �q���N��To
     */
    public void setChildAgeTo(String childAgeTo) {
        this.childAgeTo = childAgeTo;
    }

    /**
     * @param courseNmKana
     *            .
     */
    public void setCourseNmKana(String courseNmKana) {
        this.courseNmKana = courseNmKana;
    }

    /**
     * @param courseNmKanji
     *            .
     */
    public void setCourseNmKanji(String courseNmKanji) {
        this.courseNmKanji = courseNmKanji;
    }

    /**
     * @param dealFee
     *            .
     */
    public void setDealFee(String dealFee) {
        this.dealFee = StringUtil.toHalf(dealFee);
    }

    /**
     * @param dealFeeType
     *            .
     */
    public void setDealFeeType(String dealFeeType) {
        this.dealFeeType = dealFeeType;
    }

    /**
     * @param exceptDate
     *            .
     */
    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    /**
     * @param facilityAddr
     *            .
     */
    public void setFacilityAddr(String facilityAddr) {
        this.facilityAddr = facilityAddr;
    }

    /**
     * @param facilityFax
     *            .
     */
    public void setFacilityFax(String facilityFax) {
        this.facilityFax = facilityFax;
    }

    /**
     * @param facilityPostCd
     *            .
     */
    public void setFacilityPostCd(String facilityPostCd) {
        this.facilityPostCd = facilityPostCd;
    }

    /**
     * @param facilityTel
     *            .
     */
    public void setFacilityTel(String facilityTel) {
        this.facilityTel = facilityTel;
    }

    /**
     * @param goodsCd
     *            .
     */
    public void setGoodsCd(String goodsCd) {
        this.goodsCd = goodsCd;
    }

    /**
     * ���i�R�[�h8�� .��ݒ肵�܂��B
     * 
     * @param goodsCd1
     *            ���i�R�[�h8�� .
     */
    public void setGoodsCd1(String goodsCd1) {
        this.goodsCd1 = goodsCd1;
    }

    /**
     * ���i�R�[�h2�� .��ݒ肵�܂��B
     * 
     * @param goodsCd2
     *            ���i�R�[�h2�� .
     */
    public void setGoodsCd2(String goodsCd2) {
        this.goodsCd2 = goodsCd2;
    }

    /**
     * @param goodsKindCd
     *            .
     */
    public void setGoodsKindCd(String goodsKindCd) {
        this.goodsKindCd = goodsKindCd;
    }

    /**
     * ������ݒ肵�܂��B
     * 
     * @param grade
     *            ����
     */
    public void setGrade(String grade) {
        this.grade = grade;
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
     * @param informFax
     *            .
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
     * @param isDealFeeExist
     *            .
     */
    public void setIsDealFeeExist(String isDealFeeExist) {
        this.isDealFeeExist = isDealFeeExist;
    }

    /**
     * @param liquidateDay
     *            .
     */
    public void setLiquidateDay(String liquidateDay) {
        this.liquidateDay = StringUtil.toHalf(liquidateDay);
    }

    /**
     * @param liquidateInformFlg
     *            .
     */
    public void setLiquidateInformFlg(String liquidateInformFlg) {
        this.liquidateInformFlg = liquidateInformFlg;
    }

    /**
     * ��d�������i�����ݒ莞�j��ݒ肵�܂��B
     * 
     * @param liquidateTime
     *            ��d�������i�����ݒ莞�j
     */
    public void setLiquidateTime(String liquidateTime) {
        this.liquidateTime = liquidateTime;
    }

    /**
     * ��d�������i�����ݒ莞�j�i���j��ݒ肵�܂��B
     * 
     * @param liquidateTimeHour
     *            ��d�������i�����ݒ莞�j�i���j
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
     * @param maxCapaPattern
     *            .
     */
    public void setMaxCapaPattern(String maxCapaPattern) {
        this.maxCapaPattern = maxCapaPattern;
    }

    /**
     * @param memo
     *            .
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * ���������p�^�[���t���O��ݒ肵�܂��B
     * 
     * @param multiFeePatternFlg
     *            ���������p�^�[���t���O
     */
    public void setMultiFeePatternFlg(String multiFeePatternFlg) {
        this.multiFeePatternFlg = multiFeePatternFlg;
    }

    /**
     * @param newDiv
     *            .
     */
    public void setNewDiv(String newDiv) {
        this.newDiv = newDiv;
    }

    /**
     * @param news
     *            .
     */
    public void setNews(String news) {
        this.news = news;
    }

    /**
     * @param originalGoodsCd
     *            .
     */
    public void setOriginalGoodsCd(String originalGoodsCd) {
        this.originalGoodsCd = originalGoodsCd;
    }

    /**
     * �R�s�[�����i�R�[�h8�� .��ݒ肵�܂��B
     * 
     * @param originalGoodsCd1
     *            �R�s�[�����i�R�[�h8�� .
     */
    public void setOriginalGoodsCd1(String originalGoodsCd1) {
        this.originalGoodsCd1 = originalGoodsCd1;
    }

    /**
     * �R�s�[�����i�R�[�h2�� .��ݒ肵�܂��B
     * 
     * @param originalGoodsCd2
     *            �R�s�[�����i�R�[�h2�� .
     */
    public void setOriginalGoodsCd2(String originalGoodsCd2) {
        this.originalGoodsCd2 = originalGoodsCd2;
    }

    /**
     * @param ownerNm
     *            .
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * @param personalTicketPrintFlg
     *            .
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
    }

    /**
     * @param planFlg
     *            .
     */
    public void setPlanFlg(String planFlg) {
        this.planFlg = planFlg;
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
     * �n��R�[�h��ݒ肵�܂��B
     * 
     * @param regionCd
     *            �n��R�[�h
     */
    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    /**
     * �\��ʒm���@�p�� .��ݒ肵�܂��B
     * 
     * @param reserveInformWay
     *            �\��ʒm���@�p�� .
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * �V�j�A�N��From��ݒ肵�܂��B
     * 
     * @param seniorAgeFrom
     *            �V�j�A�N��From
     */
    public void setSeniorAgeFrom(String seniorAgeFrom) {
        this.seniorAgeFrom = seniorAgeFrom;
    }

    /**
     * @param special
     *            .
     */
    public void setSpecial(String special) {
        this.special = special;
    }

    /**
     * �Z���i�݌Ɂj��ݒ肵�܂��B
     * 
     * @param stockAddr
     *            �Z���i�݌Ɂj
     */
    public void setStockAddr(String stockAddr) {
        this.stockAddr = stockAddr;
    }

    /**
     * @param stockControlFlg
     *            .
     */
    public void setStockControlFlg(String stockControlFlg) {
        this.stockControlFlg = stockControlFlg;
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
     * @param stockManagement
     *            .
     */
    public void setStockManagement(String stockManagement) {
        this.stockManagement = stockManagement;
    }

    /**
     * @param stockNo
     *            .
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    /**
     * �X�֔ԍ��i�݌Ɂj��ݒ肵�܂��B
     * 
     * @param stockPostCd
     *            �X�֔ԍ��i�݌Ɂj
     */
    public void setStockPostCd(String stockPostCd) {
        this.stockPostCd = stockPostCd;
    }

    /**
     * �d�b�ԍ��i�݌Ɂj��ݒ肵�܂��B
     * 
     * @param stockTel
     *            �d�b�ԍ��i�݌Ɂj
     */
    public void setStockTel(String stockTel) {
        this.stockTel = stockTel;
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
     * @param termEndD
     *            .
     */
    @Override
    public void setTermEndD(String termEndD) {
        this.termEndD = StringUtil.toHalf(termEndD);
    }

    /**
     * @param termEndM
     *            .
     */
    @Override
    public void setTermEndM(String termEndM) {
        this.termEndM = StringUtil.toHalf(termEndM);
    }

    /**
     * @param termEndY
     *            .
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = StringUtil.toHalf(termEndY);
    }

    /**
     * @param termEndYmd
     *            .
     */
    public void setTermEndYmd(String termEndYmd) {
        this.termEndYmd = termEndYmd;
    }

    /**
     * @param termFromD
     *            .
     */
    @Override
    public void setTermFromD(String termFromD) {
        this.termFromD = StringUtil.toHalf(termFromD);
    }

    /**
     * @param termFromM
     *            .
     */
    @Override
    public void setTermFromM(String termFromM) {
        this.termFromM = StringUtil.toHalf(termFromM);
    }

    /**
     * @param termFromY
     *            .
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = StringUtil.toHalf(termFromY);
    }

    /**
     * @param termFromYmd
     *            .
     */
    public void setTermFromYmd(String termFromYmd) {
        this.termFromYmd = termFromYmd;
    }

    /**
     * @param trafficDiv
     *            .
     */
    public void setTrafficDiv(String trafficDiv) {
        this.trafficDiv = trafficDiv;
    }

    /**
     * @param validPeriod
     *            .
     */
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = StringUtil.toHalf(validPeriod);
    }

    /**
     * �o�E�`���[���X�ۂ�ݒ肵�܂��B
     * 
     * @param voucherFlg
     *            �o�E�`���[���X��
     */
    public void setVoucherFlg(String voucherFlg) {
        this.voucherFlg = voucherFlg;
    }

}
