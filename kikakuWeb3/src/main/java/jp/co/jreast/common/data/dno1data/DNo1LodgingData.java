package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

/**
 * <pre>
 *  NO1_�h���f�[�^�N���X�B
 *  �@�\�T�v    �F  NO1_�h���f�[�^���i�[����B
 *  ���L����    �F  ����
 * </pre>
 */
public class DNo1LodgingData extends PlanAnsBaseData implements IDNo1CommonData {
    //TODO : D�e�[�u�����m�肵�Ă��Ȃ��ׁAInsert���K�v�ȍ��ڂ݂̂�ݒ肵�Ă���

    /**
     * �n�旪�̖��i�J�i�j
     */
    private String areaAbbrNmKana;

    /**
     * �n�旪�̖��i�����j
     */
    private String areaAbbrNmKanji;

    /**
     * �n�於�i�J�i�j
     */
    private String areaNmKana;

    /**
     * �n�於�i�����j
     */
    private String areaNmKanji;

    /**
     * �`�F�b�N�C������from
     */
    private String checkInFrom;

    /**
     * �`�F�b�N�C������From��
     */
    private String checkInFromH;

    /**
     * �`�F�b�N�C������From��
     */
    private String checkInFromM;

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j
     */
    private String checkInNor;

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j��
     */
    private String checkInNorH;

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j��
     */
    private String checkInNorM;

    /**
     * �`�F�b�N�C������to
     */
    private String checkInTo;

    /**
     * �`�F�b�N�C������To��
     */
    private String checkInToH;

    /**
     * �`�F�b�N�C������To��
     */
    private String checkInToM;

    /**
     * �`�F�b�N�A�E�g����
     */
    private String checkOut;

    /**
     * �`�F�b�N�A�E�g���Ԏ�
     */
    private String checkOutH;

    /**
     * �`�F�b�N�A�E�g���ԕ�
     */
    private String checkOutM;

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j
     */
    private String checkOutNor;

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j��
     */
    private String checkOutNorH;

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j��
     */
    private String checkOutNorM;

    /**
     * �ً}�A������l
     */
    private String emenAddrMemo;

    /**
     * �ً}�A�����Ж��́i�����j
     */
    private String emenComOrd;

    /**
     * �ً}�A�����Ж��́i�y���j
     */
    private String emenComWk;

    /**
     * �ً}�A����S���ҁi�����j
     */
    private String emenPersonOrd;

    /**
     * �ً}�A����S���ҁi�y���j
     */
    private String emenPersonWk;

    /**
     * �ً}�A����d�b�ԍ��i�����j
     */
    private String emenTelOrd;

    /**
     * �ً}�A����d�b�ԍ��i�y���j
     */
    private String emenTelWk;

    /**
     * ���O��
     */
    private String exceptDate;

    /**
     * �{�ݏZ��
     */
    private String facilityAddr;

    /**
     * �{�݃t�@�b�N�X
     */
    private String facilityFax;

    /**
     * �{�ݗX�֔ԍ�
     */
    private String facilityPostCd;

    /**
     * �{�ݓd�b
     */
    private String facilityTel;

    /**
     * �{��URL
     */
    private String facilityUrl;

    /**
     * ���������R�[�h
     */
    private Integer feeCondCd;

    /**
     * ���i�敪
     */
    private Integer goodsDiv;

    /**
     * ���ރR�[�h
     */
    private String goodsKindCd;

    /**
     * ��d����
     */
    private String liquidateDay;

    /**
     * ��d�������i�����ݒ莞�j
     */
    private String liquidateTime;

    /**
     * ��d�������i�����ݒ莞�j��
     */
    private String liquidateTimeH;

    /**
     * ��d�������i�����ݒ莞�j��
     */
    private String liquidateTimeM;

    /**
     * �H�������R�[�h
     */
    private Integer mealCondCd;

    /**
     * ���l
     */
    private String memo;

    /**
     * ���}�v�\��I���t���O1
     */
    private String msReserveFlg1;

    /**
     * ���}�v�\��I���t���O2
     */
    private String msReserveFlg2;

    /**
     * �̔��萔��
     */
    private String saleTax;

    /**
     * �̔��萔���敪
     */
    private String saleTaxType;

    /**
     * �����Łi��l�j
     */
    private String spaTaxAdlt;

    /**
     * �����Łi���l�j
     */
    private String spaTaxChild;

    /**
     * �����ŗL��
     */
    private String spaTaxFlg;

    /**
     * �A���������z�Q���ȍ~�ꗥ�i��l�j
     */
    private String stayDiscountAdlt;

    /**
     * �A���������z�P���i��l�j
     */
    private String stayDiscountAdlt1;

    /**
     * �A���������z�Q���i��l�j
     */
    private String stayDiscountAdlt2;

    /**
     * �A���������z�R���i��l�j
     */
    private String stayDiscountAdlt3;

    /**
     * �A���������z�S���i��l�j
     */
    private String stayDiscountAdlt4;

    /**
     * �A���������z�T���ȏ�i��l�j
     */
    private String stayDiscountAdlt5;

    /**
     * �A���������z�Q���ȍ~�ꗥ�i���l�j
     */
    private String stayDiscountChild;

    /**
     * �A���������z�P���i���l�j
     */
    private String stayDiscountChild1;

    /**
     * �A���������z�Q���i���l�j
     */
    private String stayDiscountChild2;

    /**
     * �A���������z�R���i���l�j
     */
    private String stayDiscountChild3;

    /**
     * �A���������z�S���i���l�j
     */
    private String stayDiscountChild4;

    /**
     * �A���������z�T���ȏ�i���l�j
     */
    private String stayDiscountChild5;

    /**
     * �A�������敪
     */
    private String stayDiscountDiv;

    /**
     * �A�������L��
     */
    private String stayDiscountFlg;

    /**
     * �񋟊��ԏI����
     */
    private String termEndD;

    /**
     * �񋟊��ԏI����
     */
    private String termEndM;

    /**
     * �񋟊��ԏI���N
     */
    private String termEndY;

    /**
     * �񋟊��ԏI���N����
     */
    private String termEndYmd;

    /**
     * �񋟊��ԊJ�n��
     */
    private String termFromD;

    /**
     * �񋟊��ԊJ�n��
     */
    private String termFromM;

    /**
     * �񋟊��ԊJ�n�N
     */
    private String termFromY;

    /**
     * �񋟊��ԊJ�n�N����
     */
    private String termFromYmd;

    /**
     * �p�\�R��
     */
    private String terminalNo;

    /**
     * �����s�h���ŗL��
     */
    private Integer tyoStayTaxFlg;

    /**
     * �n�旪�̖��i�J�i�j���擾���܂��B
     * 
     * @return �n�旪�̖��i�J�i�j
     */
    public String getAreaAbbrNmKana() {
        return areaAbbrNmKana;
    }

    /**
     * �n�旪�̖��i�����j���擾���܂��B
     * 
     * @return �n�旪�̖��i�����j
     */
    public String getAreaAbbrNmKanji() {
        return areaAbbrNmKanji;
    }

    /**
     * �n�於�i�J�i�j���擾���܂��B
     * 
     * @return �n�於�i�J�i�j
     */
    public String getAreaNmKana() {
        return areaNmKana;
    }

    /**
     * �n�於�i�����j���擾���܂��B
     * 
     * @return �n�於�i�����j
     */
    public String getAreaNmKanji() {
        return areaNmKanji;
    }

    /**
     * �`�F�b�N�C������from���擾���܂��B
     * 
     * @return �`�F�b�N�C������from
     */
    public String getCheckInFrom() {
        return checkInFrom;
    }

    /**
     * �`�F�b�N�C������From�����擾���܂��B
     * 
     * @return �`�F�b�N�C������From��
     */
    public String getCheckInFromH() {
        return checkInFromH;
    }

    /**
     * �`�F�b�N�C������From�����擾���܂��B
     * 
     * @return �`�F�b�N�C������From��
     */
    public String getCheckInFromM() {
        return checkInFromM;
    }

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j���擾���܂��B
     * 
     * @return �`�F�b�N�C�����ԁi�ʏ�j
     */
    public String getCheckInNor() {
        return checkInNor;
    }

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j�����擾���܂��B
     * 
     * @return �`�F�b�N�C�����ԁi�ʏ�j��
     */
    public String getCheckInNorH() {
        return checkInNorH;
    }

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j�����擾���܂��B
     * 
     * @return �`�F�b�N�C�����ԁi�ʏ�j��
     */
    public String getCheckInNorM() {
        return checkInNorM;
    }

    /**
     * �`�F�b�N�C������to���擾���܂��B
     * 
     * @return �`�F�b�N�C������to
     */
    public String getCheckInTo() {
        return checkInTo;
    }

    /**
     * �`�F�b�N�C������To�����擾���܂��B
     * 
     * @return �`�F�b�N�C������To��
     */
    public String getCheckInToH() {
        return checkInToH;
    }

    /**
     * �`�F�b�N�C������To�����擾���܂��B
     * 
     * @return �`�F�b�N�C������To��
     */
    public String getCheckInToM() {
        return checkInToM;
    }

    /**
     * �`�F�b�N�A�E�g���Ԃ��擾���܂��B
     * 
     * @return �`�F�b�N�A�E�g����
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * �`�F�b�N�A�E�g���Ԏ����擾���܂��B
     * 
     * @return �`�F�b�N�A�E�g���Ԏ�
     */
    public String getCheckOutH() {
        return checkOutH;
    }

    /**
     * �`�F�b�N�A�E�g���ԕ����擾���܂��B
     * 
     * @return �`�F�b�N�A�E�g���ԕ�
     */
    public String getCheckOutM() {
        return checkOutM;
    }

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j���擾���܂��B
     * 
     * @return �`�F�b�N�A�E�g���ԁi�ʏ�j
     */
    public String getCheckOutNor() {
        return checkOutNor;
    }

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j�����擾���܂��B
     * 
     * @return �`�F�b�N�A�E�g���ԁi�ʏ�j��
     */
    public String getCheckOutNorH() {
        return checkOutNorH;
    }

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j�����擾���܂��B
     * 
     * @return �`�F�b�N�A�E�g���ԁi�ʏ�j��
     */
    public String getCheckOutNorM() {
        return checkOutNorM;
    }

    /**
     * �萔���̕\���������擾.
     * 
     * @return �萔��(�J���}�t��)
     */
    @Override
    public String getDealFeeDisplay() {
        if (!StringUtil.isEmpty(saleTax)
                && !StringUtil.isEmpty(getSaleTaxType())
                && JreConstants.DEAL_FEE_YEN_VALUE.equals(getSaleTaxType())) {
            return DKikakuWebUtil.formatCharge(saleTax);
        }
        return saleTax;
    }

    /**
     * �ً}�A������l���擾���܂��B
     * 
     * @return �ً}�A������l
     */
    public String getEmenAddrMemo() {
        return emenAddrMemo;
    }

    /**
     * �ً}�A�����Ж��́i�����j���擾���܂��B
     * 
     * @return �ً}�A�����Ж��́i�����j
     */
    public String getEmenComOrd() {
        return emenComOrd;
    }

    /**
     * �ً}�A�����Ж��́i�y���j���擾���܂��B
     * 
     * @return �ً}�A�����Ж��́i�y���j
     */
    public String getEmenComWk() {
        return emenComWk;
    }

    /**
     * �ً}�A����S���ҁi�����j���擾���܂��B
     * 
     * @return �ً}�A����S���ҁi�����j
     */
    public String getEmenPersonOrd() {
        return emenPersonOrd;
    }

    /**
     * �ً}�A����S���ҁi�y���j���擾���܂��B
     * 
     * @return �ً}�A����S���ҁi�y���j
     */
    public String getEmenPersonWk() {
        return emenPersonWk;
    }

    /**
     * �ً}�A����d�b�ԍ��i�����j���擾���܂��B
     * 
     * @return �ً}�A����d�b�ԍ��i�����j
     */
    public String getEmenTelOrd() {
        return emenTelOrd;
    }

    /**
     * �ً}�A����d�b�ԍ��i�y���j���擾���܂��B
     * 
     * @return �ً}�A����d�b�ԍ��i�y���j
     */
    public String getEmenTelWk() {
        return emenTelWk;
    }

    /**
     * ���O�����擾���܂��B
     * 
     * @return ���O��
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * �{�ݏZ�����擾���܂��B
     * 
     * @return �{�ݏZ��
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * �{�݃t�@�b�N�X���擾���܂��B
     * 
     * @return �{�݃t�@�b�N�X
     */
    public String getFacilityFax() {
        return facilityFax;
    }

    /**
     * �{�ݗX�֔ԍ����擾���܂��B
     * 
     * @return �{�ݗX�֔ԍ�
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * �{�ݓd�b���擾���܂��B
     * 
     * @return �{�ݓd�b
     */
    public String getFacilityTel() {
        return facilityTel;
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
     * ���������R�[�h���擾���܂��B
     * 
     * @return ���������R�[�h
     */
    public Integer getFeeCondCd() {
        return feeCondCd;
    }

    /**
     * ���i�敪���擾���܂��B
     * 
     * @return ���i�敪
     */
    public Integer getGoodsDiv() {
        return goodsDiv;
    }

    /**
     * ���ރR�[�h���擾���܂��B
     * 
     * @return ���ރR�[�h
     */
    public String getGoodsKindCd() {
        return goodsKindCd;
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
     * ��d�������i�����ݒ莞�j���擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j
     */
    public String getLiquidateTime() {
        return liquidateTime;
    }

    /**
     * ��d�������i�����ݒ莞�j�����擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j��
     */
    public String getLiquidateTimeH() {
        return liquidateTimeH;
    }

    /**
     * ��d�������i�����ݒ莞�j�����擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j��
     */
    public String getLiquidateTimeM() {
        return liquidateTimeM;
    }

    /**
     * �H�������R�[�h���擾���܂��B
     * 
     * @return �H�������R�[�h
     */
    public Integer getMealCondCd() {
        return mealCondCd;
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
     * ���}�v�\��I���t���O1���擾���܂��B
     * 
     * @return ���}�v�\��I���t���O1
     */
    public String getMsReserveFlg1() {
        return msReserveFlg1;
    }

    /**
     * ���}�v�\��I���t���O2���擾���܂��B
     * 
     * @return ���}�v�\��I���t���O2
     */
    public String getMsReserveFlg2() {
        return msReserveFlg2;
    }

    /**
     * �̔��萔�����擾���܂��B
     * 
     * @return �̔��萔��
     */
    public String getSaleTax() {

        //�戵�萔����ʂ͉~�̏ꍇ�A������؂�̂Ă�
        if (JreConstants.EnTypeFlg.equals(getSaleTaxType())) {
            //�����ł͂Ȃ��̏ꍇ�A���̂܂ܕԂ�. jinhuashi 720501
            if (!DKikakuWebUtil.isNumber(saleTax)
                    && !DKikakuWebUtil.isFloat(saleTax)) {
                return saleTax;
            }
            if (!StringUtil.isEmpty(saleTax) && saleTax.length() > 0) {
                int dealFeeValue = Float.valueOf(saleTax).intValue();
                saleTax = String.valueOf(dealFeeValue);
            }
            return saleTax;
        } else {
            return saleTax;
        }
    }

    /**
     * �̔��萔���敪���擾���܂��B
     * 
     * @return �̔��萔���敪
     */
    public String getSaleTaxType() {
        return saleTaxType;
    }

    /**
     * �����Łi��l�j���擾���܂��B
     * 
     * @return �����Łi��l�j
     */
    public String getSpaTaxAdlt() {
        return spaTaxAdlt;
    }

    /**
     * �����Łi���l�j���擾���܂��B
     * 
     * @return �����Łi���l�j
     */
    public String getSpaTaxChild() {
        return spaTaxChild;
    }

    /**
     * �����ŗL�����擾���܂��B
     * 
     * @return �����ŗL��
     */
    public String getSpaTaxFlg() {
        return spaTaxFlg;
    }

    /**
     * �A���������z�Q���ȍ~�ꗥ�i��l�j���擾���܂��B
     * 
     * @return �A���������z�Q���ȍ~�ꗥ�i��l�j
     */
    public String getStayDiscountAdlt() {
        return stayDiscountAdlt;
    }

    /**
     * �A���������z�P���i��l�j���擾���܂��B
     * 
     * @return �A���������z�P���i��l�j
     */
    public String getStayDiscountAdlt1() {
        return stayDiscountAdlt1;
    }

    /**
     * �A���������z�Q���i��l�j���擾���܂��B
     * 
     * @return �A���������z�Q���i��l�j
     */
    public String getStayDiscountAdlt2() {
        return stayDiscountAdlt2;
    }

    /**
     * �A���������z�R���i��l�j���擾���܂��B
     * 
     * @return �A���������z�R���i��l�j
     */
    public String getStayDiscountAdlt3() {
        return stayDiscountAdlt3;
    }

    /**
     * �A���������z�S���i��l�j���擾���܂��B
     * 
     * @return �A���������z�S���i��l�j
     */
    public String getStayDiscountAdlt4() {
        return stayDiscountAdlt4;
    }

    /**
     * �A���������z�T���ȏ�i��l�j���擾���܂��B
     * 
     * @return �A���������z�T���ȏ�i��l�j
     */
    public String getStayDiscountAdlt5() {
        return stayDiscountAdlt5;
    }

    /**
     * �A���������z�Q���ȍ~�ꗥ�i���l�j���擾���܂��B
     * 
     * @return �A���������z�Q���ȍ~�ꗥ�i���l�j
     */
    public String getStayDiscountChild() {
        return stayDiscountChild;
    }

    /**
     * �A���������z�P���i���l�j���擾���܂��B
     * 
     * @return �A���������z�P���i���l�j
     */
    public String getStayDiscountChild1() {
        return stayDiscountChild1;
    }

    /**
     * �A���������z�Q���i���l�j���擾���܂��B
     * 
     * @return �A���������z�Q���i���l�j
     */
    public String getStayDiscountChild2() {
        return stayDiscountChild2;
    }

    /**
     * �A���������z�R���i���l�j���擾���܂��B
     * 
     * @return �A���������z�R���i���l�j
     */
    public String getStayDiscountChild3() {
        return stayDiscountChild3;
    }

    /**
     * �A���������z�S���i���l�j���擾���܂��B
     * 
     * @return �A���������z�S���i���l�j
     */
    public String getStayDiscountChild4() {
        return stayDiscountChild4;
    }

    /**
     * �A���������z�T���ȏ�i���l�j���擾���܂��B
     * 
     * @return �A���������z�T���ȏ�i���l�j
     */
    public String getStayDiscountChild5() {
        return stayDiscountChild5;
    }

    /**
     * �A�������敪���擾���܂��B
     * 
     * @return �A�������敪
     */
    public String getStayDiscountDiv() {
        return stayDiscountDiv;
    }

    /**
     * �A�������L�����擾���܂��B
     * 
     * @return �A�������L��
     */
    public String getStayDiscountFlg() {
        return stayDiscountFlg;
    }

    /**
     * �񋟊��ԏI�������擾���܂��B
     * 
     * @return �񋟊��ԏI����
     */
    @Override
    public String getTermEndD() {
        return termEndD;
    }

    /**
     * �񋟊��ԏI�������擾���܂��B
     * 
     * @return �񋟊��ԏI����
     */
    @Override
    public String getTermEndM() {
        return termEndM;
    }

    /**
     * �񋟊��ԏI���N���擾���܂��B
     * 
     * @return �񋟊��ԏI���N
     */
    @Override
    public String getTermEndY() {
        return termEndY;
    }

    /**
     * �񋟊��ԏI���N�������擾���܂��B
     * 
     * @return �񋟊��ԏI���N����
     */
    public String getTermEndYmd() {
        return termEndYmd;
    }

    /**
     * �񋟊��ԊJ�n�����擾���܂��B
     * 
     * @return �񋟊��ԊJ�n��
     */
    @Override
    public String getTermFromD() {
        return termFromD;
    }

    /**
     * �񋟊��ԊJ�n�����擾���܂��B
     * 
     * @return �񋟊��ԊJ�n��
     */
    @Override
    public String getTermFromM() {
        return termFromM;
    }

    /**
     * �񋟊��ԊJ�n�N���擾���܂��B
     * 
     * @return �񋟊��ԊJ�n�N
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * �񋟊��ԊJ�n�N�������擾���܂��B
     * 
     * @return �񋟊��ԊJ�n�N����
     */
    public String getTermFromYmd() {
        return termFromYmd;
    }

    /**
     * �p�\�R�����擾���܂��B
     * 
     * @return �p�\�R��
     */
    public String getTerminalNo() {
        return terminalNo;
    }

    /**
     * �����s�h���ŗL�����擾���܂��B
     * 
     * @return �����s�h���ŗL��
     */
    public Integer getTyoStayTaxFlg() {
        return tyoStayTaxFlg;
    }

    /**
     * �n�旪�̖��i�J�i�j��ݒ肵�܂��B
     * 
     * @param areaAbbrNmKana
     *            �n�旪�̖��i�J�i�j
     */
    public void setAreaAbbrNmKana(String areaAbbrNmKana) {
        this.areaAbbrNmKana = areaAbbrNmKana;
    }

    /**
     * �n�旪�̖��i�����j��ݒ肵�܂��B
     * 
     * @param areaAbbrNmKanji
     *            �n�旪�̖��i�����j
     */
    public void setAreaAbbrNmKanji(String areaAbbrNmKanji) {
        this.areaAbbrNmKanji = areaAbbrNmKanji;
    }

    /**
     * �n�於�i�J�i�j��ݒ肵�܂��B
     * 
     * @param areaNmKana
     *            �n�於�i�J�i�j
     */
    public void setAreaNmKana(String areaNmKana) {
        this.areaNmKana = areaNmKana;
    }

    /**
     * �n�於�i�����j��ݒ肵�܂��B
     * 
     * @param areaNmKanji
     *            �n�於�i�����j
     */
    public void setAreaNmKanji(String areaNmKanji) {
        this.areaNmKanji = areaNmKanji;
    }

    /**
     * �`�F�b�N�C������from��ݒ肵�܂��B
     * 
     * @param checkInFrom
     *            �`�F�b�N�C������from
     */
    public void setCheckInFrom(String checkInFrom) {
        this.checkInFrom = checkInFrom;
    }

    /**
     * �`�F�b�N�C������fromH��ݒ肵�܂��B
     * 
     * @param checkInFromH
     *            �`�F�b�N�C������from
     */
    public void setCheckInFromH(String checkInFromH) {
        this.checkInFromH = checkInFromH;
    }

    /**
     * �`�F�b�N�C������fromM��ݒ肵�܂��B
     * 
     * @param checkInFromM
     *            �`�F�b�N�C������from
     */
    public void setCheckInFromM(String checkInFromM) {
        this.checkInFromM = checkInFromM;
    }

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j��ݒ肵�܂��B
     * 
     * @param checkInNor
     *            �`�F�b�N�C�����ԁi�ʏ�j
     */
    public void setCheckInNor(String checkInNor) {
        this.checkInNor = checkInNor;
    }

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j����ݒ肵�܂��B
     * 
     * @param checkInNorH
     *            �`�F�b�N�C�����ԁi�ʏ�j��
     */
    public void setCheckInNorH(String checkInNorH) {
        this.checkInNorH = checkInNorH;
    }

    /**
     * �`�F�b�N�C�����ԁi�ʏ�j����ݒ肵�܂��B
     * 
     * @param checkInNorM
     *            �`�F�b�N�C�����ԁi�ʏ�j��
     */
    public void setCheckInNorM(String checkInNorM) {
        this.checkInNorM = checkInNorM;
    }

    /**
     * �`�F�b�N�C������to��ݒ肵�܂��B
     * 
     * @param checkInTo
     *            �`�F�b�N�C������to
     */
    public void setCheckInTo(String checkInTo) {
        this.checkInTo = checkInTo;
    }

    /**
     * �`�F�b�N�C������toH��ݒ肵�܂��B
     * 
     * @param checkInToH
     *            �`�F�b�N�C������toH
     */
    public void setCheckInToH(String checkInToH) {
        this.checkInToH = checkInToH;
    }

    /**
     * �`�F�b�N�C������toM��ݒ肵�܂��B
     * 
     * @param checkInToM
     *            �`�F�b�N�C������toM
     */
    public void setCheckInToM(String checkInToM) {
        this.checkInToM = checkInToM;
    }

    /**
     * �`�F�b�N�A�E�g���Ԃ�ݒ肵�܂��B
     * 
     * @param checkOut
     *            �`�F�b�N�A�E�g����
     */
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    /**
     * �`�F�b�N�A�E�g���Ԏ���ݒ肵�܂��B
     * 
     * @param checkOutH
     *            �`�F�b�N�A�E�g���Ԏ�
     */
    public void setCheckOutH(String checkOutH) {
        this.checkOutH = checkOutH;
    }

    /**
     * �`�F�b�N�A�E�g���ԕ���ݒ肵�܂��B
     * 
     * @param checkOutM
     *            �`�F�b�N�A�E�g���ԕ�
     */
    public void setCheckOutM(String checkOutM) {
        this.checkOutM = checkOutM;
    }

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j��ݒ肵�܂��B
     * 
     * @param checkOutNor
     *            �`�F�b�N�A�E�g���ԁi�ʏ�j
     */
    public void setCheckOutNor(String checkOutNor) {
        this.checkOutNor = checkOutNor;
    }

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j����ݒ肵�܂��B
     * 
     * @param checkOutNorH
     *            �`�F�b�N�A�E�g���ԁi�ʏ�j��
     */
    public void setCheckOutNorH(String checkOutNorH) {
        this.checkOutNorH = checkOutNorH;
    }

    /**
     * �`�F�b�N�A�E�g���ԁi�ʏ�j����ݒ肵�܂��B
     * 
     * @param checkOutNorM
     *            �`�F�b�N�A�E�g���ԁi�ʏ�j��
     */
    public void setCheckOutNorM(String checkOutNorM) {
        this.checkOutNorM = checkOutNorM;
    }

    /**
     * �ً}�A������l��ݒ肵�܂��B
     * 
     * @param emenAddrMemo
     *            �ً}�A������l
     */
    public void setEmenAddrMemo(String emenAddrMemo) {
        this.emenAddrMemo = emenAddrMemo;
    }

    /**
     * �ً}�A�����Ж��́i�����j��ݒ肵�܂��B
     * 
     * @param emenComOrd
     *            �ً}�A�����Ж��́i�����j
     */
    public void setEmenComOrd(String emenComOrd) {
        this.emenComOrd = emenComOrd;
    }

    /**
     * �ً}�A�����Ж��́i�y���j��ݒ肵�܂��B
     * 
     * @param emenComWk
     *            �ً}�A�����Ж��́i�y���j
     */
    public void setEmenComWk(String emenComWk) {
        this.emenComWk = emenComWk;
    }

    /**
     * �ً}�A����S���ҁi�����j��ݒ肵�܂��B
     * 
     * @param emenPersonOrd
     *            �ً}�A����S���ҁi�����j
     */
    public void setEmenPersonOrd(String emenPersonOrd) {
        this.emenPersonOrd = emenPersonOrd;
    }

    /**
     * �ً}�A����S���ҁi�y���j��ݒ肵�܂��B
     * 
     * @param emenPersonWk
     *            �ً}�A����S���ҁi�y���j
     */
    public void setEmenPersonWk(String emenPersonWk) {
        this.emenPersonWk = emenPersonWk;
    }

    /**
     * �ً}�A����d�b�ԍ��i�����j��ݒ肵�܂��B
     * 
     * @param emenTelOrd
     *            �ً}�A����d�b�ԍ��i�����j
     */
    public void setEmenTelOrd(String emenTelOrd) {
        this.emenTelOrd = emenTelOrd;
    }

    /**
     * �ً}�A����d�b�ԍ��i�y���j��ݒ肵�܂��B
     * 
     * @param emenTelWk
     *            �ً}�A����d�b�ԍ��i�y���j
     */
    public void setEmenTelWk(String emenTelWk) {
        this.emenTelWk = emenTelWk;
    }

    /**
     * ���O����ݒ肵�܂��B
     * 
     * @param exceptDate
     *            ���O��
     */
    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    /**
     * �{�ݏZ����ݒ肵�܂��B
     * 
     * @param facilityAddr
     *            �{�ݏZ��
     */
    public void setFacilityAddr(String facilityAddr) {
        this.facilityAddr = facilityAddr;
    }

    /**
     * �{�݃t�@�b�N�X��ݒ肵�܂��B
     * 
     * @param facilityFax
     *            �{�݃t�@�b�N�X
     */
    public void setFacilityFax(String facilityFax) {
        this.facilityFax = facilityFax;
    }

    /**
     * �{�ݗX�֔ԍ���ݒ肵�܂��B
     * 
     * @param facilityPostCd
     *            �{�ݗX�֔ԍ�
     */
    public void setFacilityPostCd(String facilityPostCd) {
        this.facilityPostCd = facilityPostCd;
    }

    /**
     * �{�ݓd�b��ݒ肵�܂��B
     * 
     * @param facilityTel
     *            �{�ݓd�b
     */
    public void setFacilityTel(String facilityTel) {
        this.facilityTel = facilityTel;
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
     * ���������R�[�h��ݒ肵�܂��B
     * 
     * @param feeCondCd
     *            ���������R�[�h
     */
    public void setFeeCondCd(Integer feeCondCd) {
        this.feeCondCd = feeCondCd;
    }

    /**
     * ���i�敪��ݒ肵�܂��B
     * 
     * @param goodsDiv
     *            ���i�敪
     */
    public void setGoodsDiv(Integer goodsDiv) {
        this.goodsDiv = goodsDiv;
    }

    /**
     * ���ރR�[�h��ݒ肵�܂��B
     * 
     * @param goodsKindCd
     *            ���ރR�[�h
     */
    public void setGoodsKindCd(String goodsKindCd) {
        this.goodsKindCd = goodsKindCd;
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
     * ��d�������i�����ݒ莞�j��ݒ肵�܂��B
     * 
     * @param liquidateTime
     *            ��d�������i�����ݒ莞�j
     */
    public void setLiquidateTime(String liquidateTime) {
        this.liquidateTime = liquidateTime;
    }

    /**
     * ��d�������i�����ݒ莞�j����ݒ肵�܂��B
     * 
     * @param liquidateTimeH
     *            ��d�������i�����ݒ莞�j��
     */
    public void setLiquidateTimeH(String liquidateTimeH) {
        this.liquidateTimeH = liquidateTimeH;
    }

    /**
     * ��d�������i�����ݒ莞�j����ݒ肵�܂��B
     * 
     * @param liquidateTimeM
     *            ��d�������i�����ݒ莞�j��
     */
    public void setLiquidateTimeM(String liquidateTimeM) {
        this.liquidateTimeM = liquidateTimeM;
    }

    /**
     * �H�������R�[�h��ݒ肵�܂��B
     * 
     * @param mealCondCd
     *            �H�������R�[�h
     */
    public void setMealCondCd(Integer mealCondCd) {
        this.mealCondCd = mealCondCd;
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
     * ���}�v�\��I���t���O1��ݒ肵�܂��B
     * 
     * @param msReserveFlg1
     *            ���}�v�\��I���t���O1
     */
    public void setMsReserveFlg1(String msReserveFlg1) {
        this.msReserveFlg1 = msReserveFlg1;
    }

    /**
     * ���}�v�\��I���t���O2��ݒ肵�܂��B
     * 
     * @param msReserveFlg2
     *            ���}�v�\��I���t���O2
     */
    public void setMsReserveFlg2(String msReserveFlg2) {
        this.msReserveFlg2 = msReserveFlg2;
    }

    /**
     * �̔��萔����ݒ肵�܂��B
     * 
     * @param saleTax
     *            �̔��萔��
     */
    public void setSaleTax(String saleTax) {
        this.saleTax = saleTax;
    }

    /**
     * �̔��萔���敪��ݒ肵�܂��B
     * 
     * @param saleTaxType
     *            �̔��萔���敪
     */
    public void setSaleTaxType(String saleTaxType) {
        this.saleTaxType = saleTaxType;
    }

    /**
     * �����Łi��l�j��ݒ肵�܂��B
     * 
     * @param spaTaxAdlt
     *            �����Łi��l�j
     */
    public void setSpaTaxAdlt(String spaTaxAdlt) {
        this.spaTaxAdlt = spaTaxAdlt;
    }

    /**
     * �����Łi���l�j��ݒ肵�܂��B
     * 
     * @param spaTaxChild
     *            �����Łi���l�j
     */
    public void setSpaTaxChild(String spaTaxChild) {
        this.spaTaxChild = spaTaxChild;
    }

    /**
     * �����ŗL����ݒ肵�܂��B
     * 
     * @param spaTaxFlg
     *            �����ŗL��
     */
    public void setSpaTaxFlg(String spaTaxFlg) {
        this.spaTaxFlg = spaTaxFlg;
    }

    /**
     * �A���������z�Q���ȍ~�ꗥ�i��l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountAdlt
     *            �A���������z�Q���ȍ~�ꗥ�i��l�j
     */
    public void setStayDiscountAdlt(String stayDiscountAdlt) {
        this.stayDiscountAdlt = stayDiscountAdlt;
    }

    /**
     * �A���������z�P���i��l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountAdlt1
     *            �A���������z�P���i��l�j
     */
    public void setStayDiscountAdlt1(String stayDiscountAdlt1) {
        this.stayDiscountAdlt1 = stayDiscountAdlt1;
    }

    /**
     * �A���������z�Q���i��l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountAdlt2
     *            �A���������z�Q���i��l�j
     */
    public void setStayDiscountAdlt2(String stayDiscountAdlt2) {
        this.stayDiscountAdlt2 = stayDiscountAdlt2;
    }

    /**
     * �A���������z�R���i��l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountAdlt3
     *            �A���������z�R���i��l�j
     */
    public void setStayDiscountAdlt3(String stayDiscountAdlt3) {
        this.stayDiscountAdlt3 = stayDiscountAdlt3;
    }

    /**
     * �A���������z�S���i��l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountAdlt4
     *            �A���������z�S���i��l�j
     */
    public void setStayDiscountAdlt4(String stayDiscountAdlt4) {
        this.stayDiscountAdlt4 = stayDiscountAdlt4;
    }

    /**
     * �A���������z�T���ȏ�i��l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountAdlt5
     *            �A���������z�T���ȏ�i��l�j
     */
    public void setStayDiscountAdlt5(String stayDiscountAdlt5) {
        this.stayDiscountAdlt5 = stayDiscountAdlt5;
    }

    /**
     * �A���������z�Q���ȍ~�ꗥ�i���l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountChild
     *            �A���������z�Q���ȍ~�ꗥ�i���l�j
     */
    public void setStayDiscountChild(String stayDiscountChild) {
        this.stayDiscountChild = stayDiscountChild;
    }

    /**
     * �A���������z�P���i���l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountChild1
     *            �A���������z�P���i���l�j
     */
    public void setStayDiscountChild1(String stayDiscountChild1) {
        this.stayDiscountChild1 = stayDiscountChild1;
    }

    /**
     * �A���������z�Q���i���l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountChild2
     *            �A���������z�Q���i���l�j
     */
    public void setStayDiscountChild2(String stayDiscountChild2) {
        this.stayDiscountChild2 = stayDiscountChild2;
    }

    /**
     * �A���������z�R���i���l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountChild3
     *            �A���������z�R���i���l�j
     */
    public void setStayDiscountChild3(String stayDiscountChild3) {
        this.stayDiscountChild3 = stayDiscountChild3;
    }

    /**
     * �A���������z�S���i���l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountChild4
     *            �A���������z�S���i���l�j
     */
    public void setStayDiscountChild4(String stayDiscountChild4) {
        this.stayDiscountChild4 = stayDiscountChild4;
    }

    /**
     * �A���������z�T���ȏ�i���l�j��ݒ肵�܂��B
     * 
     * @param stayDiscountChild5
     *            �A���������z�T���ȏ�i���l�j
     */
    public void setStayDiscountChild5(String stayDiscountChild5) {
        this.stayDiscountChild5 = stayDiscountChild5;
    }

    /**
     * �A�������敪��ݒ肵�܂��B
     * 
     * @param stayDiscountDiv
     *            �A�������敪
     */
    public void setStayDiscountDiv(String stayDiscountDiv) {
        this.stayDiscountDiv = stayDiscountDiv;
    }

    /**
     * �A�������L����ݒ肵�܂��B
     * 
     * @param stayDiscountFlg
     *            �A�������L��
     */
    public void setStayDiscountFlg(String stayDiscountFlg) {
        this.stayDiscountFlg = stayDiscountFlg;
    }

    /**
     * �񋟊��ԏI������ݒ肵�܂��B
     * 
     * @param termEndD
     *            �񋟊��ԏI����
     */
    @Override
    public void setTermEndD(String termEndD) {
        this.termEndD = StringUtil.toHalf(termEndD);
    }

    /**
     * �񋟊��ԏI������ݒ肵�܂��B
     * 
     * @param termEndM
     *            �񋟊��ԏI����
     */
    @Override
    public void setTermEndM(String termEndM) {
        this.termEndM = StringUtil.toHalf(termEndM);
    }

    /**
     * �񋟊��ԏI���N��ݒ肵�܂��B
     * 
     * @param termEndY
     *            �񋟊��ԏI���N
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = StringUtil.toHalf(termEndY);
    }

    /**
     * �񋟊��ԏI���N������ݒ肵�܂��B
     * 
     * @param termEndYmd
     *            �񋟊��ԏI���N����
     */
    public void setTermEndYmd(String termEndYmd) {
        this.termEndYmd = termEndYmd;
    }

    /**
     * �񋟊��ԊJ�n����ݒ肵�܂��B
     * 
     * @param termFromD
     *            �񋟊��ԊJ�n��
     */
    @Override
    public void setTermFromD(String termFromD) {
        this.termFromD = StringUtil.toHalf(termFromD);
    }

    /**
     * �񋟊��ԊJ�n����ݒ肵�܂��B
     * 
     * @param termFromM
     *            �񋟊��ԊJ�n��
     */
    @Override
    public void setTermFromM(String termFromM) {
        this.termFromM = StringUtil.toHalf(termFromM);
    }

    /**
     * �񋟊��ԊJ�n�N��ݒ肵�܂��B
     * 
     * @param termFromY
     *            �񋟊��ԊJ�n�N
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = StringUtil.toHalf(termFromY);
    }

    /**
     * �񋟊��ԊJ�n�N������ݒ肵�܂��B
     * 
     * @param termFromYmd
     *            �񋟊��ԊJ�n�N����
     */
    public void setTermFromYmd(String termFromYmd) {
        this.termFromYmd = termFromYmd;
    }

    /**
     * �p�\�R����ݒ肵�܂��B
     * 
     * @param terminalNo
     *            �p�\�R��
     */
    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    /**
     * �����s�h���ŗL����ݒ肵�܂��B
     * 
     * @param tyoStayTaxFlg
     *            �����s�h���ŗL��
     */
    public void setTyoStayTaxFlg(Integer tyoStayTaxFlg) {
        this.tyoStayTaxFlg = tyoStayTaxFlg;
    }

}
