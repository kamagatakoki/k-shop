package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 *  [DP/RM]NO1_�ό��f�[�^�N���X�B
 *  �@�\�T�v    �F  [DP/RM]NO1_�ό��f�[�^���i�[����B
 *  ���L����    �F  ����
 * </pre>
 */
public class DNo1TravelData extends PlanAnsBaseData implements IDNo1CommonData {

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
     * �G���A�R�[�h
     */
    private String areaCd;

    /**
     * �n�於�i�J�i�j .
     */
    private String areaNmKana;

    /**
     * �n�於�i�����j .
     */
    private String areaNmKanji;

    /**
     * ��z .
     */
    private String arrangementFlg;

    /**
     * �������|�J�n .
     */
    private String bathCleanBegin;

    /**
     * �������|�J�n �� .
     */
    private String bathCleanBeginH;

    /**
     * �������|�J�n �� .
     */
    private String bathCleanBeginM;

    /**
     * �������|�I�� .
     */
    private String bathCleanEnd;

    /**
     * �������|�I�� �� .
     */
    private String bathCleanEndH;

    /**
     * �������|�I�� �� .
     */
    private String bathCleanEndM;

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
     * �\���� .
     */
    private String bookKind;

    /**
     * �p�r .
     */
    private String bookPurpose;

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
     * ���R���͗� .
     */
    private String freelyColumn;

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
     * �H���ꏊ .
     */
    private String mealSite;

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
     * �\�����ڂP .
     */
    private String otherItem1;

    /**
     * �\�����ڂP�J�n .
     */
    private String otherItem1Begin;

    /**
     * �\�����ڂP�J�n �� .
     */
    private String otherItem1BeginH;

    /**
     * �\�����ڂP�J�n �� .
     */
    private String otherItem1BeginM;

    /**
     * �\�����ڂP�I�� .
     */
    private String otherItem1End;

    /**
     * �\�����ڂP�I�� �� .
     */
    private String otherItem1EndH;

    /**
     * �\�����ڂP�I�� �� .
     */
    private String otherItem1EndM;

    /**
     * �\�����ڂQ .
     */
    private String otherItem2;

    /**
     * �\�����ڂQ�J�n .
     */
    private String otherItem2Begin;

    /**
     * �\�����ڂQ�J�n �� .
     */
    private String otherItem2BeginH;

    /**
     * �\�����ڂQ�J�n �� .
     */
    private String otherItem2BeginM;

    /**
     * �\�����ڂQ�I�� .
     */
    private String otherItem2End;

    /**
     * �\�����ڂQ�I�� �� .
     */
    private String otherItem2EndH;

    /**
     * �\�����ڂQ�I�� �� .
     */
    private String otherItem2EndM;

    /**
     * �\�����ڂR .
     */
    private String otherItem3;

    /**
     * �\�����ڂR�J�n .
     */
    private String otherItem3Begin;

    /**
     * �\�����ڂR�J�n �� .
     */
    private String otherItem3BeginH;

    /**
     * �\�����ڂR�J�n �� .
     */
    private String otherItem3BeginM;

    /**
     * �\�����ڂR�I�� .
     */
    private String otherItem3End;

    /**
     * �\�����ڂR�I�� �� .
     */
    private String otherItem3EndH;

    /**
     * �\�����ڂR�I�� �� .
     */
    private String otherItem3EndM;

    /**
     * ��\�Җ� .
     */
    private String ownerNm;

    /**
     * �w��p�[�N��
     */
    private String parkFlg;

    /**
     * �D���o�͎w��L��
     */
    private String personalTicketPrintFlg;

    /**
     * ��� .
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
     * �x�e�ꏊ .
     */
    private String restSite;

    /**
     * �V�j�A�N��From
     */
    private String seniorAgeFrom;

    /**
     * �Z��
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
     * �݌ɊǗ����@
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
     * �䐔�E�g���Ǘ��t���O .
     */
    private String unitManageFlg;

    /**
     * �L������ .
     */
    private String validPeriod;

    /**
     * �o�E�`���[���X��
     */
    private String voucherFlg;

    /**
     * @return .
     */
    public String getAdditionalService1() {
        return additionalService1;
    }

    /**
     * @return �t���T�[�r�X�Q .
     */
    public String getAdditionalService2() {
        return additionalService2;
    }

    /**
     * @return �t���T�[�r�X�R.
     */
    public String getAdditionalService3() {
        return additionalService3;
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
     * @return �n�於�i�J�i�j.
     */
    public String getAreaNmKana() {
        return areaNmKana;
    }

    /**
     * @return �n�於�i�����j.
     */
    public String getAreaNmKanji() {
        return areaNmKanji;
    }

    /**
     * @return arrangementFlg
     */
    public String getArrangementFlg() {
        return arrangementFlg;
    }

    /**
     * @return �������|�J�n .
     */
    public String getBathCleanBegin() {
        return bathCleanBegin;
    }

    /**
     * @return �������|�J�n ��.
     */
    public String getBathCleanBeginH() {
        return bathCleanBeginH;
    }

    /**
     * @return �������|�J�n ��.
     */
    public String getBathCleanBeginM() {
        return bathCleanBeginM;
    }

    /**
     * @return �������|�I��.
     */
    public String getBathCleanEnd() {
        return bathCleanEnd;
    }

    /**
     * @return �������|�I�� �� .
     */
    public String getBathCleanEndH() {
        return bathCleanEndH;
    }

    /**
     * @return �������|�I�� ��.
     */
    public String getBathCleanEndM() {
        return bathCleanEndM;
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
     * @return �\��J�n�� �� .
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
     * @return �\����.
     */
    public String getBookKind() {
        return bookKind;
    }

    /**
     * @return �p�r.
     */
    public String getBookPurpose() {
        return bookPurpose;
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
     * @return �萔���̕\���`���̎擾.
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
     * @return �戵�萔����� .
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * @return ���O��.
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
     * @return �{�݃t�@�b�N�X.
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * @return �{�ݗX�֔ԍ�.
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
     * @return ���R���͗�.
     */
    public String getFreelyColumn() {
        return freelyColumn;
    }

    /**
     * @return ���i�R�[�h.
     */
    public String getGoodsCd() {
        return goodsCd;
    }

    /**
     * @return ���i�R�[�h1.
     */
    public String getGoodsCd1() {
        return goodsCd1;
    }

    /**
     * @return ���i�R�[�h2.
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
     * @return �H���ꏊ.
     */
    public String getMealSite() {
        return mealSite;
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
     * @return �R�s�[�����i�R�[�h.
     */
    public String getOriginalGoodsCd() {
        return originalGoodsCd;
    }

    /**
     * @return �R�s�[�����i�R�[�h1.
     */
    public String getOriginalGoodsCd1() {
        return originalGoodsCd1;
    }

    /**
     * @return �R�s�[�����i�R�[�h2.
     */
    public String getOriginalGoodsCd2() {
        return originalGoodsCd2;
    }

    /**
     * @return �\�����ڂP .
     */
    public String getOtherItem1() {
        return otherItem1;
    }

    /**
     * @return �\�����ڂP�J�n.
     */
    public String getOtherItem1Begin() {
        return otherItem1Begin;
    }

    /**
     * @return �\�����ڂP�J�n ��.
     */
    public String getOtherItem1BeginH() {
        return otherItem1BeginH;
    }

    /**
     * @return �\�����ڂP�J�n ��.
     */
    public String getOtherItem1BeginM() {
        return otherItem1BeginM;
    }

    /**
     * @return �\�����ڂP�I��.
     */
    public String getOtherItem1End() {
        return otherItem1End;
    }

    /**
     * @return �\�����ڂP�I�� ��.
     */
    public String getOtherItem1EndH() {
        return otherItem1EndH;
    }

    /**
     * @return �\�����ڂP�I�� ��.
     */
    public String getOtherItem1EndM() {
        return otherItem1EndM;
    }

    /**
     * @return �\�����ڂQ .
     */
    public String getOtherItem2() {
        return otherItem2;
    }

    /**
     * @return �\�����ڂQ�J�n.
     */
    public String getOtherItem2Begin() {
        return otherItem2Begin;
    }

    /**
     * @return �\�����ڂQ�J�n �� .
     */
    public String getOtherItem2BeginH() {
        return otherItem2BeginH;
    }

    /**
     * @return �\�����ڂQ�J�n ��.
     */
    public String getOtherItem2BeginM() {
        return otherItem2BeginM;
    }

    /**
     * @return �\�����ڂQ�I��.
     */
    public String getOtherItem2End() {
        return otherItem2End;
    }

    /**
     * @return �\�����ڂQ�I�� ��.
     */
    public String getOtherItem2EndH() {
        return otherItem2EndH;
    }

    /**
     * @return �\�����ڂQ�I�� ��.
     */
    public String getOtherItem2EndM() {
        return otherItem2EndM;
    }

    /**
     * @return �\�����ڂR.
     */
    public String getOtherItem3() {
        return otherItem3;
    }

    /**
     * @return �\�����ڂR�J�n.
     */
    public String getOtherItem3Begin() {
        return otherItem3Begin;
    }

    /**
     * @return �\�����ڂR�J�n ��.
     */
    public String getOtherItem3BeginH() {
        return otherItem3BeginH;
    }

    /**
     * @return �\�����ڂR�J�n ��.
     */
    public String getOtherItem3BeginM() {
        return otherItem3BeginM;
    }

    /**
     * @return �\�����ڂR�I��.
     */
    public String getOtherItem3End() {
        return otherItem3End;
    }

    /**
     * @return �\�����ڂR�I�� �� .
     */
    public String getOtherItem3EndH() {
        return otherItem3EndH;
    }

    /**
     * @return �\�����ڂR�I�� ��.
     */
    public String getOtherItem3EndM() {
        return otherItem3EndM;
    }

    /**
     * @return ��\�Җ�.
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * �w��p�[�N�����擾���܂��B
     * 
     * @return �w��p�[�N��
     */
    public String getParkFlg() {
        return parkFlg;
    }

    /**
     * �D���o�͎w��L�����擾���܂��B
     * 
     * @return �D���o�͎w��L��
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
    }

    /**
     * @return planFlg
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
     * @return �\��ʒm���@�p�� .
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * @return �x�e�ꏊ.
     */
    public String getRestSite() {
        return restSite;
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
     * �Z�����擾���܂��B
     * 
     * @return �Z��
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
     * �݌ɊǗ����@���擾���܂��B
     * 
     * @return �݌ɊǗ����@
     */
    public String getStockManagement() {
        return stockManagement;
    }

    /**
     * @return �݌ɔԍ� .
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
     * @return �񋟊��ԏI����.
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
     * @return �񋟊��ԏI���N����.
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * @return �񋟊��ԊJ�n��.
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * @return �񋟊��ԊJ�n�� .
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * @return �񋟊��ԊJ�n�N.
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
     * @return �䐔�E�g���Ǘ��t���O.
     */
    public String getUnitManageFlg() {
        return unitManageFlg;
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
     * @param additionalService1
     *            .
     */
    public void setAdditionalService1(String additionalService1) {
        this.additionalService1 = additionalService1;
    }

    /**
     * @param additionalService2
     *            .
     */
    public void setAdditionalService2(String additionalService2) {
        this.additionalService2 = additionalService2;
    }

    /**
     * @param additionalService3
     *            .
     */
    public void setAdditionalService3(String additionalService3) {
        this.additionalService3 = additionalService3;
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
     * @param areaNmKana
     *            .
     */
    public void setAreaNmKana(String areaNmKana) {
        this.areaNmKana = areaNmKana;
    }

    /**
     * @param areaNmKanji
     *            .
     */
    public void setAreaNmKanji(String areaNmKanji) {
        this.areaNmKanji = areaNmKanji;
    }

    /**
     * @param arrangementFlg
     *            arrangementFlg
     */
    public void setArrangementFlg(String arrangementFlg) {
        this.arrangementFlg = arrangementFlg;
    }

    /**
     * @param bathCleanBegin
     *            .
     */
    public void setBathCleanBegin(String bathCleanBegin) {
        this.bathCleanBegin = bathCleanBegin;
    }

    /**
     * @param bathCleanBeginH
     *            .
     */
    public void setBathCleanBeginH(String bathCleanBeginH) {
        this.bathCleanBeginH = bathCleanBeginH;
    }

    /**
     * @param bathCleanBeginM
     *            .
     */
    public void setBathCleanBeginM(String bathCleanBeginM) {
        this.bathCleanBeginM = bathCleanBeginM;
    }

    /**
     * @param bathCleanEnd
     *            .
     */
    public void setBathCleanEnd(String bathCleanEnd) {
        this.bathCleanEnd = bathCleanEnd;
    }

    /**
     * @param bathCleanEndH
     *            .
     */
    public void setBathCleanEndH(String bathCleanEndH) {
        this.bathCleanEndH = bathCleanEndH;
    }

    /**
     * @param bathCleanEndM
     *            .
     */
    public void setBathCleanEndM(String bathCleanEndM) {
        this.bathCleanEndM = bathCleanEndM;
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
     * @param bookKind
     *            .
     */
    public void setBookKind(String bookKind) {
        this.bookKind = bookKind;
    }

    /**
     * @param bookPurpose
     *            .
     */
    public void setBookPurpose(String bookPurpose) {
        this.bookPurpose = bookPurpose;
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
     * @param freelyColumn
     *            .
     */
    public void setFreelyColumn(String freelyColumn) {
        this.freelyColumn = freelyColumn;
    }

    /**
     * @param goodsCd
     *            .
     */
    public void setGoodsCd(String goodsCd) {
        this.goodsCd = goodsCd;
    }

    /**
     * @param goodsCd1
     *            .
     */
    public void setGoodsCd1(String goodsCd1) {
        this.goodsCd1 = goodsCd1;
    }

    /**
     * @param goodsCd2
     *            .
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
     * @param mealSite
     *            .
     */
    public void setMealSite(String mealSite) {
        this.mealSite = mealSite;
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
     * @param originalGoodsCd
     *            .
     */
    public void setOriginalGoodsCd(String originalGoodsCd) {
        this.originalGoodsCd = originalGoodsCd;
    }

    /**
     * @param originalGoodsCd1
     *            .
     */
    public void setOriginalGoodsCd1(String originalGoodsCd1) {
        this.originalGoodsCd1 = originalGoodsCd1;
    }

    /**
     * @param originalGoodsCd2
     *            .
     */
    public void setOriginalGoodsCd2(String originalGoodsCd2) {
        this.originalGoodsCd2 = originalGoodsCd2;
    }

    /**
     * @param otherItem1
     *            .
     */
    public void setOtherItem1(String otherItem1) {
        this.otherItem1 = otherItem1;
    }

    /**
     * @param otherItem1Begin
     *            .
     */
    public void setOtherItem1Begin(String otherItem1Begin) {
        this.otherItem1Begin = otherItem1Begin;
    }

    /**
     * @param otherItem1BeginH
     *            .
     */
    public void setOtherItem1BeginH(String otherItem1BeginH) {
        this.otherItem1BeginH = otherItem1BeginH;
    }

    /**
     * @param otherItem1BeginM
     *            .
     */
    public void setOtherItem1BeginM(String otherItem1BeginM) {
        this.otherItem1BeginM = otherItem1BeginM;
    }

    /**
     * @param otherItem1End
     *            .
     */
    public void setOtherItem1End(String otherItem1End) {
        this.otherItem1End = otherItem1End;
    }

    /**
     * @param otherItem1EndH
     *            .
     */
    public void setOtherItem1EndH(String otherItem1EndH) {
        this.otherItem1EndH = otherItem1EndH;
    }

    /**
     * @param otherItem1EndM
     *            .
     */
    public void setOtherItem1EndM(String otherItem1EndM) {
        this.otherItem1EndM = otherItem1EndM;
    }

    /**
     * @param otherItem2
     *            .
     */
    public void setOtherItem2(String otherItem2) {
        this.otherItem2 = otherItem2;
    }

    /**
     * @param otherItem2Begin
     *            .
     */
    public void setOtherItem2Begin(String otherItem2Begin) {
        this.otherItem2Begin = otherItem2Begin;
    }

    /**
     * @param otherItem2BeginH
     *            .
     */
    public void setOtherItem2BeginH(String otherItem2BeginH) {
        this.otherItem2BeginH = otherItem2BeginH;
    }

    /**
     * @param otherItem2BeginM
     *            .
     */
    public void setOtherItem2BeginM(String otherItem2BeginM) {
        this.otherItem2BeginM = otherItem2BeginM;
    }

    /**
     * @param otherItem2End
     *            .
     */
    public void setOtherItem2End(String otherItem2End) {
        this.otherItem2End = otherItem2End;
    }

    /**
     * @param otherItem2EndH
     *            .
     */
    public void setOtherItem2EndH(String otherItem2EndH) {
        this.otherItem2EndH = otherItem2EndH;
    }

    /**
     * @param otherItem2EndM
     *            .
     */
    public void setOtherItem2EndM(String otherItem2EndM) {
        this.otherItem2EndM = otherItem2EndM;
    }

    /**
     * @param otherItem3
     *            .
     */
    public void setOtherItem3(String otherItem3) {
        this.otherItem3 = otherItem3;
    }

    /**
     * @param otherItem3Begin
     *            .
     */
    public void setOtherItem3Begin(String otherItem3Begin) {
        this.otherItem3Begin = otherItem3Begin;
    }

    /**
     * @param otherItem3BeginH
     *            .
     */
    public void setOtherItem3BeginH(String otherItem3BeginH) {
        this.otherItem3BeginH = otherItem3BeginH;
    }

    /**
     * @param otherItem3BeginM
     *            .
     */
    public void setOtherItem3BeginM(String otherItem3BeginM) {
        this.otherItem3BeginM = otherItem3BeginM;
    }

    /**
     * @param otherItem3End
     *            .
     */
    public void setOtherItem3End(String otherItem3End) {
        this.otherItem3End = otherItem3End;
    }

    /**
     * @param otherItem3EndH
     *            .
     */
    public void setOtherItem3EndH(String otherItem3EndH) {
        this.otherItem3EndH = otherItem3EndH;
    }

    /**
     * @param otherItem3EndM
     *            .
     */
    public void setOtherItem3EndM(String otherItem3EndM) {
        this.otherItem3EndM = otherItem3EndM;
    }

    /**
     * @param ownerNm
     *            .
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * �w��p�[�N����ݒ肵�܂��B
     * 
     * @param parkFlg
     *            �w��p�[�N��
     */
    public void setParkFlg(String parkFlg) {
        this.parkFlg = parkFlg;
    }

    /**
     * �D���o�͎w��L����ݒ肵�܂��B
     * 
     * @param personalTicketPrintFlg
     *            �D���o�͎w��L��
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
    }

    /**
     * @param planFlg
     *            planFlg
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
     * @param reserveInformWay
     *            .
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * @param restSite
     *            .
     */
    public void setRestSite(String restSite) {
        this.restSite = restSite;
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
     * �Z����ݒ肵�܂��B
     * 
     * @param address
     *            �Z��
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
     * �݌ɊǗ����@��ݒ肵�܂��B
     * 
     * @param stockManagement
     *            �݌ɊǗ����@
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
     * �X�֔ԍ���ݒ肵�܂��B
     * 
     * @param stockPostCd
     *            �X�֔ԍ�
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
     * @param unitManageFlg
     *            .
     */
    public void setUnitManageFlg(String unitManageFlg) {
        this.unitManageFlg = unitManageFlg;
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
