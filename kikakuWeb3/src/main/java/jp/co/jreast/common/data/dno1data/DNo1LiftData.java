package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.DKikakuWebUtil;

import org.apache.commons.lang3.StringUtils;

/**
 * <pre>
 *  NO1_���t�g�f�[�^�N���X�B.
 *  �@�\�T�v    �F  NO1_���t�g�f�[�^�N���X
 *  ���L����    �F  ����
 * </pre>
 */
public class DNo1LiftData extends PlanAnsBaseData implements IDNo1CommonData {

    /**
     * �G���A�R�[�h
     */
    private String areaCd;

    /**
     * �{�[�h��p�G���A�L�� .
     */
    private String areaForBoardFlg = JreConstants.FLG_FALSE;

    /**
     * �L�b�Y��p�G���A�L�� .
     */
    private String areaForKidsFlg = JreConstants.FLG_FALSE;

    /**
     * ���[�O����p�G���A�L�� .
     */
    private String areaForMogulFlg = JreConstants.FLG_FALSE;

    /**
     * �n�於�́i�J�i�j
     */
    private String areaKana;

    /**
     * �n�於��
     */
    private String areaNm;

    /**
     * ���ꗿ���L�� .
     */
    private String bathroomFeeFlg;

    /**
     * ����L�� .
     */
    private String bathroomFlg = JreConstants.FLG_FALSE;

    /**
     * �����P�ʋ敪
     */
    private String chargeDiv;

    /**
     * �q���N��from
     */
    private String childAgeFrom;

    /**
     * �q���N��to
     */
    private String childAgeTo;

    /**
     * �����T�[�r�X�����i�L���j.
     */
    private String dayCareChargeEFlg;

    /**
     * �������T�[�r�X�L�� .
     */
    private String dayCareServiceFlg = JreConstants.FLG_FALSE;

    /**
     * �戵�萔�� .
     */
    private String dealFee;

    /**
     * �戵�萔����� .
     */
    private String dealFeeType;

    /**
     * �X�ߎ��L�� .
     */
    private String dressingRoomFlg = JreConstants.FLG_FALSE;

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
     * �t�@�~���[�Q�����f�L�� .
     */
    private String familyGelandeFlg = JreConstants.FLG_FALSE;

    /**
     * ���R���͗� .
     */
    private String freelyColumn;

    /**
     * ���ރR�[�h
     */
    private String goodsKindCd;

    /**
     * �n�[�t�p�C�v�L�� .
     */
    private String halfpipeFlg = JreConstants.FLG_FALSE;

    /**
     * ��z���T�[�r�X�L�� .
     */
    private String homeDeliveryServiceFlg;

    /**
     * �ʒm��t�@�b�N�X .
     */
    private String informFax;

    /**
     * �ʒm�於��
     */
    private String informNm;

    /**
     * �戵�萔�����݂���t���O .
     */
    private String isDealFeeExist;

    /**
     * ���t�g�����p�J�n���ԁi�x���j ���� .
     */
    private String liftTicketBeginHolHour;

    /**
     * ���t�g�����p�J�n���ԁi�x���j�@�� .
     */
    private String liftTicketBeginHolMinutes;

    /**
     * ���t�g�����p�J�n���ԁi�����j ���� .
     */
    private String liftTicketBeginOdrHour;

    /**
     * ���t�g�����p�J�n���ԁi�����j�@�� .
     */
    private String liftTicketBeginOdrMinutes;

    /**
     * ���t�g�����p�I�����ԁi�x���j ���� .
     */
    private String liftTicketEndHolHour;

    /**
     * ���t�g�����p�I�����ԁi�x���j�@�� .
     */
    private String liftTicketEndHolMinutes;

    /**
     * ���t�g�����p�I�����ԁi�����j ���� .
     */
    private String liftTicketEndOdrHour;

    /**
     * ���t�g�����p�I�����ԁi�����j�@�� .
     */
    private String liftTicketEndOdrMinutes;

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
     * ��d�������i�����ݒ莞�j�F��
     */
    private String liquidateTimeHour;

    /**
     * ��d�������i�����ݒ莞�j�F��
     */
    private String liquidateTimeMinute;

    /**
     * ���b�J�[�����L�� .
     */
    private String lockerFeeFlg;

    /**
     * ���b�J�[�L�� .
     */
    private String lockerFlg = JreConstants.FLG_FALSE;

    /**
     * ���l .
     */
    private String memo;

    /**
     * �������C�N�L�� .
     */
    private String oneMakeFlg = JreConstants.FLG_FALSE;

    /**
     * ��\�Җ� .
     */
    private String ownerNm;

    /**
     * �D���o�͎w��L�� .
     */
    private String personalTicketPrintFlg;

    /**
     * �s���{���R�[�h
     */
    private String prefecturesCd;

    /**
     * ���ӏ� .
     */
    private String receiptPart;

    /**
     * �n��R�[�h
     */
    private String regionCd;

    /**
     * �\��ʒm���@�v�� .
     */
    // private String bookInformWayFlg;
    private String reserveInformWay;

    /**
     * �c�Ǝ��ԊJ�n�i�i�C�^�[�j���� .
     */
    private String salesTimeBeginNightHour;

    /**
     * �c�Ǝ��ԊJ�n�i�i�C�^�[�j�� .
     */
    private String salesTimeBeginNightMinutes;

    /**
     * �c�Ǝ��ԊJ�n�i�ʏ�j���� .
     */
    private String salesTimeBeginNorHour;

    /**
     * �c�Ǝ��ԊJ�n�i�ʏ�j�� .
     */
    private String salesTimeBeginNorMinutes;

    /**
     * �c�Ǝ��ԏI���i�i�C�^�[�j���� .
     */
    private String salesTimeEndNightHour;

    /**
     * �c�Ǝ��ԏI���i�i�C�^�[�j�� .
     */
    private String salesTimeEndNightMinutes;

    /**
     * �c�Ǝ��ԏI���i�ʏ�j���� .
     */
    private String salesTimeEndNorHour;

    /**
     * �c�Ǝ��ԏI���i�ʏ�j�� .
     */
    private String salesTimeEndNorMinutes;

    /**
     * �c�Ǝ��Ԕ��l�i�i�C�^�[�j .
     */
    private String salesTimeMemoNight;

    /**
     * �c�Ǝ��Ԕ��l�i�ʏ�j .
     */
    private String salesTimeMemoNor;

    /**
     * �c�Ǝ��Ԃ��̑� .
     */
    private String salesTimeOthers;

    /**
     * ���t��R�����g .
     */
    private String sendAddrCmt;

    /**
     * ���t�悻�̑��L�� .
     */
    private String sendAddrOthersFlg = JreConstants.FLG_FALSE;

    /**
     * ���t��X�L�[��L�� .
     */
    private String sendAddrSkiAreasFlg = JreConstants.FLG_FALSE;

    /**
     * �V�j�A�N��From
     */

    private String seniorAgeFrom;

    /**
     * �V�����[�����L�� .
     */
    private String showerFeeFlg;

    /**
     * �V�����[�L�� .
     */
    private String showerFlg = JreConstants.FLG_FALSE;

    /**
     * ���L�����i�r�V���j
     */
    private String specialItem;

    /**
     * ���L�����i�ݔ��E��z�T�[�r�X�j
     */
    private String specialItem2;

    /**
     * �Z���i�݌Ɂj
     */
    private String stockAddr;

    /**
     * �݌ɊǗ����@ ��������/�����Ȃ�
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
     * ���ʃ^�C�g��(�J�i�j .
     */
    private String ticketTitleKana;

    /**
     * ���ʃ^�C�g���i�����j .
     */
    private String ticketTitleKanji;

    /**
     * �L������ .
     */
    private String validPeriod;

    /**
     * �o�E�`���[���X��
     */
    private String voucherFlg = JreConstants.FLG_FALSE;

    /**
     * �o�E�`���[���ē����i�����j .
     */
    private String voucherIntroKanji;

    /**
     * �G���A�R�[�h���擾���܂��B
     * 
     * @return �G���A�R�[�h
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * @return Returns the areaForBoardFlg.
     */
    public String getAreaForBoardFlg() {
        return areaForBoardFlg;
    }

    /**
     * @return Returns the areaForKidsFlg.
     */
    public String getAreaForKidsFlg() {
        return areaForKidsFlg;
    }

    /**
     * @return Returns the areaForMogulFlg.
     */
    public String getAreaForMogulFlg() {
        return areaForMogulFlg;
    }

    /**
     * �n�於�́i�J�i�j���擾���܂��B
     * 
     * @return �n�於�́i�J�i�j
     */
    public String getAreaKana() {
        return areaKana;
    }

    /**
     * �n�於�̂��擾���܂��B
     * 
     * @return �n�於��
     */
    public String getAreaNm() {
        return areaNm;
    }

    /**
     * @return Returns the bathroomFeeFlg.
     */
    public String getBathroomFeeFlg() {
        return bathroomFeeFlg;
    }

    /**
     * @return Returns the bathroomFlg.
     */
    public String getBathroomFlg() {
        return bathroomFlg;
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
     * @return Returns the bookInformWayFlg.
     */
    //    public String getBookInformWayFlg() {
    //        return bookInformWayFlg;
    //    }

    /**
     * �q���N��from���擾���܂��B
     * 
     * @return �q���N��from
     */
    public String getChildAgeFrom() {
        return childAgeFrom;
    }

    /**
     * �q���N��to���擾���܂��B
     * 
     * @return �q���N��to
     */
    public String getChildAgeTo() {
        return childAgeTo;
    }

    /**
     * @return �����T�[�r�X����
     */
    public String getDayCareChargeEFlg() {
        return dayCareChargeEFlg;
    }

    /**
     * @return Returns the dayCareServiceFlg.
     */
    public String getDayCareServiceFlg() {
        return dayCareServiceFlg;
    }

    /**
     * @return Returns the dealFee.
     */
    public String getDealFee() {
        //�戵�萔����ʂ͉~�̏ꍇ�A������؂�̂Ă�
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
     * @return �萔��(����܂�)
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
     * @return Returns the dealFeeType.
     */
    public String getDealFeeType() {
        return dealFeeType;
    }

    /**
     * @return Returns the dressingRoomFlg.
     */
    public String getDressingRoomFlg() {
        return dressingRoomFlg;
    }

    /**
     * @return Returns the exceptDate.
     */
    public String getExceptDate() {
        return exceptDate;
    }

    /**
     * @return Returns the facilityAddr.
     */
    public String getFacilityAddr() {
        return facilityAddr;
    }

    /**
     * @return Returns the facilityFax.
     */
    public String getFacilityFax() {
        return facilityFax == null ? "" : facilityFax.trim();
    }

    /**
     * @return Returns the facilityPostCd.
     */
    public String getFacilityPostCd() {
        return facilityPostCd;
    }

    /**
     * @return Returns the facilityTel.
     */
    public String getFacilityTel() {
        return facilityTel == null ? "" : facilityTel.trim();
    }

    /**
     * @return Returns the familyGelandeFlg.
     */
    public String getFamilyGelandeFlg() {
        return familyGelandeFlg;
    }

    /**
     * @return Returns the freelyColumn.
     */
    public String getFreelyColumn() {
        return freelyColumn;
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
     * @return Returns the halfpipeFlg.
     */
    public String getHalfpipeFlg() {
        return halfpipeFlg;
    }

    /**
     * @return Returns the homeDeliveryServiceFlg.
     */
    public String getHomeDeliveryServiceFlg() {
        return homeDeliveryServiceFlg;
    }

    /**
     * @return Returns the informFax.
     */
    public String getInformFax() {
        return StringUtils.trim(informFax);
    }

    /**
     * �ʒm�於�̂��擾���܂��B
     * 
     * @return �ʒm�於��
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
     * @return Returns the liftTicketBeginHol.
     */
    public String getLiftTicketBeginHol() {

        return DKikakuWebUtil.buildTime(getLiftTicketBeginHolHour(),
                getLiftTicketBeginHolMinutes());

    }

    /**
     * @return Returns the liftTicketBeginHolHour.
     */
    public String getLiftTicketBeginHolHour() {
        return liftTicketBeginHolHour;
    }

    /**
     * @return Returns the liftTicketBeginHolMinutes.
     */
    public String getLiftTicketBeginHolMinutes() {
        return liftTicketBeginHolMinutes;
    }

    /**
     * @return Returns the liftTicketBeginOdr.
     */
    public String getLiftTicketBeginOdr() {

        return DKikakuWebUtil.buildTime(getLiftTicketBeginOdrHour(),
                getLiftTicketBeginOdrMinutes());
    }

    /**
     * @return Returns the liftTicketBeginOdrHour.
     */
    public String getLiftTicketBeginOdrHour() {
        return liftTicketBeginOdrHour;
    }

    /**
     * @return Returns the liftTicketBeginOdrMinutes.
     */
    public String getLiftTicketBeginOdrMinutes() {
        return liftTicketBeginOdrMinutes;
    }

    /**
     * @return Returns the liftTicketEndHol.
     */
    public String getLiftTicketEndHol() {

        return DKikakuWebUtil.buildTime(getLiftTicketEndHolHour(),
                getLiftTicketEndHolMinutes());
    }

    /**
     * @return Returns the liftTicketEndHolHour.
     */
    public String getLiftTicketEndHolHour() {
        return liftTicketEndHolHour;
    }

    /**
     * @return Returns the liftTicketEndHolMinutes.
     */
    public String getLiftTicketEndHolMinutes() {
        return liftTicketEndHolMinutes;
    }

    /**
     * @return Returns the liftTicketEndOdr.
     */
    public String getLiftTicketEndOdr() {

        return DKikakuWebUtil.buildTime(getLiftTicketEndOdrHour(),
                getLiftTicketEndOdrMinutes());
    }

    /**
     * @return Returns the liftTicketEndOdrHour.
     */
    public String getLiftTicketEndOdrHour() {
        return liftTicketEndOdrHour;
    }

    /**
     * @return Returns the liftTicketEndOdrMinutes.
     */
    public String getLiftTicketEndOdrMinutes() {
        return liftTicketEndOdrMinutes;
    }

    /**
     * @return Returns the liquidateDay.
     */
    public String getLiquidateDay() {
        return liquidateDay;
    }

    /**
     * @return Returns the liquidateInformFlg.
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
     * ��d�������i�����ݒ莞�j�F�����擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j�F��
     */
    public String getLiquidateTimeHour() {
        return liquidateTimeHour;
    }

    /**
     * ��d�������i�����ݒ莞�j�F�����擾���܂��B
     * 
     * @return ��d�������i�����ݒ莞�j�F��
     */
    public String getLiquidateTimeMinute() {
        return liquidateTimeMinute;
    }

    /**
     * @return Returns the lockerFeeFlg.
     */
    public String getLockerFeeFlg() {
        return lockerFeeFlg;
    }

    /**
     * @return Returns the lockerFlg.
     */
    public String getLockerFlg() {
        return lockerFlg;
    }

    /**
     * @return Returns the memo.
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @return Returns the oneMakeFlg.
     */
    public String getOneMakeFlg() {
        return oneMakeFlg;
    }

    /**
     * @return Returns the ownerNm.
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * @return Returns the personalTicketPrintFlg.
     */
    public String getPersonalTicketPrintFlg() {
        return personalTicketPrintFlg;
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
     * @return Returns the receiptPart.
     */
    public String getReceiptPart() {
        return receiptPart;
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
     * �\��ʒm���@�v�� .���擾���܂��B
     * 
     * @return �\��ʒm���@�v�� .
     */
    public String getReserveInformWay() {
        return reserveInformWay;
    }

    /**
     * @return Returns the salesTimeBeginNight.
     */
    public String getSalesTimeBeginNight() {

        return DKikakuWebUtil.buildTime(getSalesTimeBeginNightHour(),
                getSalesTimeBeginNightMinutes());
    }

    /**
     * @return Returns the salesTimeBeginNightHour.
     */
    public String getSalesTimeBeginNightHour() {
        return salesTimeBeginNightHour;
    }

    /**
     * @return Returns the salesTimeBeginNightMinutes.
     */
    public String getSalesTimeBeginNightMinutes() {
        return salesTimeBeginNightMinutes;
    }

    /**
     * @return Returns the salesTimeBeginNor.
     */
    public String getSalesTimeBeginNor() {

        return DKikakuWebUtil.buildTime(getSalesTimeBeginNorHour(),
                getSalesTimeBeginNorMinutes());
    }

    /**
     * @return Returns the salesTimeBeginNorHour.
     */
    public String getSalesTimeBeginNorHour() {
        return salesTimeBeginNorHour;
    }

    /**
     * @return Returns the salesTimeBeginNorMinutes.
     */
    public String getSalesTimeBeginNorMinutes() {
        return salesTimeBeginNorMinutes;
    }

    /**
     * @return Returns the salesTimeEndNight.
     */
    public String getSalesTimeEndNight() {

        return DKikakuWebUtil.buildTime(getSalesTimeEndNightHour(),
                getSalesTimeEndNightMinutes());
    }

    /**
     * @return Returns the salesTimeEndNightHour.
     */
    public String getSalesTimeEndNightHour() {
        return salesTimeEndNightHour;
    }

    /**
     * @return Returns the salesTimeEndNightMinutes.
     */
    public String getSalesTimeEndNightMinutes() {
        return salesTimeEndNightMinutes;
    }

    /**
     * @return Returns the salesTimeEndNor.
     */
    public String getSalesTimeEndNor() {

        return DKikakuWebUtil.buildTime(getSalesTimeEndNorHour(),
                getSalesTimeEndNorMinutes());
    }

    /**
     * @return Returns the salesTimeEndNorHour.
     */
    public String getSalesTimeEndNorHour() {
        return salesTimeEndNorHour;
    }

    /**
     * @return Returns the salesTimeEndNorMinutes.
     */
    public String getSalesTimeEndNorMinutes() {
        return salesTimeEndNorMinutes;
    }

    /**
     * @return Returns the salesTimeMemoNight.
     */
    public String getSalesTimeMemoNight() {
        return salesTimeMemoNight;
    }

    /**
     * @return Returns the salesTimeMemoNor.
     */
    public String getSalesTimeMemoNor() {
        return salesTimeMemoNor;
    }

    /**
     * @return Returns the salesTimeOthers.
     */
    public String getSalesTimeOthers() {
        return salesTimeOthers;
    }

    /**
     * @return Returns the sendAddrCmt.
     */
    public String getSendAddrCmt() {
        return sendAddrCmt;
    }

    /**
     * @return Returns the sendAddrOthersFlg.
     */
    public String getSendAddrOthersFlg() {
        return sendAddrOthersFlg;
    }

    /**
     * @return Returns the sendAddrSkiAreasFlg.
     */
    public String getSendAddrSkiAreasFlg() {
        return sendAddrSkiAreasFlg;
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
     * @return Returns the showerFeeFlg.
     */
    public String getShowerFeeFlg() {
        return showerFeeFlg;
    }

    /**
     * @return Returns the showerFlg.
     */
    public String getShowerFlg() {
        return showerFlg;
    }

    /**
     * @return Returns the specialItem.
     */
    public String getSpecialItem() {
        return specialItem;
    }

    /**
     * ���L�����i�ݔ��E��z�T�[�r�X�j���擾���܂��B
     * 
     * @return ���L�����i�ݔ��E��z�T�[�r�X�j
     */
    public String getSpecialItem2() {
        return specialItem2;
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
     * �݌ɊǗ����@ ��������/�����Ȃ����擾���܂��B
     * 
     * @return �݌ɊǗ����@ ��������/�����Ȃ�
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
     * @return Returns the stockNo.
     */
    public String getStockNo() {

        return StringUtil.trim(stockNo);
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
        return StringUtil.trim(stockTel);
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
     * @return Returns the termEndD.
     */
    @Override
    public String getTermEndD() {
        if (termEndD != null && DKikakuWebUtil.isNumber(termEndD)) {
            if (termEndD.length() == 1) {
                termEndD = "0" + termEndD;
            }

        }
        return termEndD;
    }

    /**
     * @return Returns the termEndM.
     */
    @Override
    public String getTermEndM() {
        if (termEndM != null && DKikakuWebUtil.isNumber(termEndD)) {
            if (termEndM.length() == 1) {
                termEndM = "0" + termEndM;
            }
        }
        return termEndM;
    }

    /**
     * @return Returns the termEndY.
     */
    @Override
    public String getTermEndY() {
        return termEndY;
    }

    /**
     * @return Returns the termEndYmd.
     */
    public String getTermEndYmd() {
        if (StringUtil.isEmpty(getTermEndY())
                || StringUtil.isEmpty(getTermEndM())
                || StringUtil.isEmpty(getTermEndD())) {
            return "";
        }
        return getTermEndY() + getTermEndM() + getTermEndD();
    }

    /**
     * @return Returns the termFromD.
     */
    @Override
    public String getTermFromD() {

        if (termFromD != null && DKikakuWebUtil.isNumber(termFromD)) {
            if (termFromD.length() == 1) {
                termFromD = "0" + termFromD;
            }
        }
        return termFromD;
    }

    /**
     * @return Returns the termFromM.
     */
    @Override
    public String getTermFromM() {
        if (termFromM != null && DKikakuWebUtil.isNumber(termFromM)) {
            if (termFromM.length() == 1) {
                termFromM = "0" + termFromM;
            }
        }
        return termFromM;
    }

    /**
     * @return Returns the termFromY.
     */
    @Override
    public String getTermFromY() {
        return termFromY;
    }

    /**
     * @return termFromYmd �񋟊��ԊJ�n�N����
     */
    public String getTermFromYmd() {
        if (StringUtil.isEmpty(termFromY) || StringUtil.isEmpty(termFromM)
                || StringUtil.isEmpty(termFromD)) {
            return "";
        }
        return getTermFromY() + getTermFromM() + getTermFromD();
    }

    /**
     * @return Returns the ticketTitleKana.
     */
    public String getTicketTitleKana() {
        return ticketTitleKana;
    }

    /**
     * @return Returns the ticketTitleKanji.
     */
    public String getTicketTitleKanji() {
        return ticketTitleKanji;
    }

    /**
     * @return Returns the validPeriod.
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
     * @return Returns the voucherIntroIanji.
     */
    public String getVoucherIntroKanji() {
        return voucherIntroKanji;
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
     * @param areaForBoardFlg
     *            The areaForBoardFlg to set.
     */
    public void setAreaForBoardFlg(String areaForBoardFlg) {
        this.areaForBoardFlg = areaForBoardFlg;
    }

    /**
     * @param areaForKidsFlg
     *            The areaForKidsFlg to set.
     */
    public void setAreaForKidsFlg(String areaForKidsFlg) {
        this.areaForKidsFlg = areaForKidsFlg;
    }

    /**
     * @param areaForMogulFlg
     *            The areaForMogulFlg to set.
     */
    public void setAreaForMogulFlg(String areaForMogulFlg) {
        this.areaForMogulFlg = areaForMogulFlg;
    }

    /**
     * �n�於�́i�J�i�j��ݒ肵�܂��B
     * 
     * @param areaKana
     *            �n�於�́i�J�i�j
     */
    public void setAreaKana(String areaKana) {
        this.areaKana = areaKana;
    }

    /**
     * �n�於�̂�ݒ肵�܂��B
     * 
     * @param areaNm
     *            �n�於��
     */
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    /**
     * @param bathroomFeeFlg
     *            The bathroomFeeFlg to set.
     */
    public void setBathroomFeeFlg(String bathroomFeeFlg) {
        this.bathroomFeeFlg = bathroomFeeFlg;
    }

    /**
     * @param bathroomFlg
     *            The bathroomFlg to set.
     */
    public void setBathroomFlg(String bathroomFlg) {
        this.bathroomFlg = bathroomFlg;
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
     * �q���N��from��ݒ肵�܂��B
     * 
     * @param childAgeFrom
     *            �q���N��from
     */
    public void setChildAgeFrom(String childAgeFrom) {
        this.childAgeFrom = childAgeFrom;
    }

    /**
     * �q���N��to��ݒ肵�܂��B
     * 
     * @param childAgeTo
     *            �q���N��to
     */
    public void setChildAgeTo(String childAgeTo) {
        this.childAgeTo = childAgeTo;
    }

    /**
     * @param dayCareChargeEFlg
     *            �����T�[�r�X����
     */
    public void setDayCareChargeEFlg(String dayCareChargeEFlg) {
        this.dayCareChargeEFlg = dayCareChargeEFlg;
    }

    /**
     * @param dayCareServiceFlg
     *            The dayCareServiceFlg to set.
     */
    public void setDayCareServiceFlg(String dayCareServiceFlg) {
        this.dayCareServiceFlg = dayCareServiceFlg;
    }

    /**
     * @param dealFee
     *            The dealFee to set.
     */
    public void setDealFee(String dealFee) {
        this.dealFee = dealFee;
    }

    /**
     * @param bookInformWayFlg
     *            The bookInformWayFlg to set.
     */
    //    public void setBookInformWayFlg(String bookInformWayFlg) {
    //        this.bookInformWayFlg = bookInformWayFlg;
    //    }

    /**
     * @param dealFeeType
     *            The dealFeeType to set.
     */
    public void setDealFeeType(String dealFeeType) {
        this.dealFeeType = dealFeeType;
    }

    /**
     * @param dressingRoomFlg
     *            The dressingRoomFlg to set.
     */
    public void setDressingRoomFlg(String dressingRoomFlg) {
        this.dressingRoomFlg = dressingRoomFlg;
    }

    /**
     * @param exceptDate
     *            The exceptDate to set.
     */
    public void setExceptDate(String exceptDate) {
        this.exceptDate = exceptDate;
    }

    /**
     * @param facilityAddr
     *            The facilityAddr to set.
     */
    public void setFacilityAddr(String facilityAddr) {
        this.facilityAddr = facilityAddr;
    }

    /**
     * @param facilityFax
     *            The facilityFax to set.
     */
    public void setFacilityFax(String facilityFax) {
        this.facilityFax = facilityFax;
    }

    /**
     * @param facilityPostCd
     *            The facilityPostCd to set.
     */
    public void setFacilityPostCd(String facilityPostCd) {
        this.facilityPostCd = facilityPostCd;
    }

    /**
     * @param facilityTel
     *            The facilityTel to set.
     */
    public void setFacilityTel(String facilityTel) {
        this.facilityTel = facilityTel;
    }

    /**
     * @param familyGelandeFlg
     *            The familyGelandeFlg to set.
     */
    public void setFamilyGelandeFlg(String familyGelandeFlg) {
        this.familyGelandeFlg = familyGelandeFlg;
    }

    /**
     * @param freelyColumn
     *            The freelyColumn to set.
     */
    public void setFreelyColumn(String freelyColumn) {
        this.freelyColumn = freelyColumn;
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
     * @param halfpipeFlg
     *            The halfpipeFlg to set.
     */
    public void setHalfpipeFlg(String halfpipeFlg) {
        this.halfpipeFlg = halfpipeFlg;
    }

    /**
     * @param homeDeliveryServiceFlg
     *            The homeDeliveryServiceFlg to set.
     */
    public void setHomeDeliveryServiceFlg(String homeDeliveryServiceFlg) {
        this.homeDeliveryServiceFlg = homeDeliveryServiceFlg;
    }

    /**
     * @param informFax
     *            The informFax to set.
     */
    public void setInformFax(String informFax) {
        this.informFax = informFax;
    }

    /**
     * �ʒm�於�̂�ݒ肵�܂��B
     * 
     * @param informNm
     *            �ʒm�於��
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
     * @param liftTicketBeginHol
     *            the liftTicketBeginHol to set.
     */
    public void setLiftTicketBeginHol(String liftTicketBeginHol) {
        if (!StringUtil.isEmpty(liftTicketBeginHol)) {
            this.liftTicketBeginHolHour = liftTicketBeginHol.substring(0, 2);
            this.liftTicketBeginHolMinutes = liftTicketBeginHol.substring(2, 4);
        } else {
            this.liftTicketBeginHolHour = "";
            this.liftTicketBeginHolMinutes = "";
        }
    }

    /**
     * @param liftTicketBeginHolHour
     *            The liftTicketBeginHolHour to set.
     */
    public void setLiftTicketBeginHolHour(String liftTicketBeginHolHour) {
        this.liftTicketBeginHolHour = liftTicketBeginHolHour;
    }

    /**
     * @param liftTicketBeginHolMinutes
     *            The liftTicketBeginHolMinutes to set.
     */
    public void setLiftTicketBeginHolMinutes(String liftTicketBeginHolMinutes) {
        this.liftTicketBeginHolMinutes = liftTicketBeginHolMinutes;
    }

    /**
     * @param liftTicketBeginOdr
     *            the liftTicketBeginOdr to set.
     */
    public void setLiftTicketBeginOdr(String liftTicketBeginOdr) {
        if (!StringUtil.isEmpty(liftTicketBeginOdr)) {
            this.liftTicketBeginOdrHour = liftTicketBeginOdr.substring(0, 2);
            this.liftTicketBeginOdrMinutes = liftTicketBeginOdr.substring(2, 4);
        } else {
            this.liftTicketBeginOdrHour = "";
            this.liftTicketBeginOdrMinutes = "";
        }
    }

    /**
     * @param liftTicketBeginOdrHour
     *            The liftTicketBeginOdrHour to set.
     */
    public void setLiftTicketBeginOdrHour(String liftTicketBeginOdrHour) {
        this.liftTicketBeginOdrHour = liftTicketBeginOdrHour;
    }

    /**
     * @param liftTicketBeginOdrMinutes
     *            The liftTicketBeginOdrMinutes to set.
     */
    public void setLiftTicketBeginOdrMinutes(String liftTicketBeginOdrMinutes) {
        this.liftTicketBeginOdrMinutes = liftTicketBeginOdrMinutes;
    }

    /**
     * @param liftTicketEndHol
     *            the liftTicketEndHol to set.
     */
    public void setLiftTicketEndHol(String liftTicketEndHol) {
        if (!StringUtil.isEmpty(liftTicketEndHol)) {
            this.liftTicketEndHolHour = liftTicketEndHol.substring(0, 2);
            this.liftTicketEndHolMinutes = liftTicketEndHol.substring(2, 4);
        } else {
            this.liftTicketEndHolHour = "";
            this.liftTicketEndHolMinutes = "";
        }
    }

    /**
     * @param liftTicketEndHolHour
     *            The liftTicketEndHolHour to set.
     */
    public void setLiftTicketEndHolHour(String liftTicketEndHolHour) {
        this.liftTicketEndHolHour = liftTicketEndHolHour;
    }

    /**
     * @param liftTicketEndHolMinutes
     *            The liftTicketEndHolMinutes to set.
     */
    public void setLiftTicketEndHolMinutes(String liftTicketEndHolMinutes) {
        this.liftTicketEndHolMinutes = liftTicketEndHolMinutes;
    }

    /**
     * @param liftTicketEndOdr
     *            the liftTicketEndOdr to set.
     */
    public void setLiftTicketEndOdr(String liftTicketEndOdr) {
        if (!StringUtil.isEmpty(liftTicketEndOdr)) {
            this.liftTicketEndOdrHour = liftTicketEndOdr.substring(0, 2);
            this.liftTicketEndOdrMinutes = liftTicketEndOdr.substring(2, 4);
        } else {
            this.liftTicketEndOdrHour = "";
            this.liftTicketEndOdrMinutes = "";
        }
    }

    /**
     * @param liftTicketEndOdrHour
     *            The liftTicketEndOdrHour to set.
     */
    public void setLiftTicketEndOdrHour(String liftTicketEndOdrHour) {
        this.liftTicketEndOdrHour = liftTicketEndOdrHour;
    }

    /**
     * @param liftTicketEndOdrMinutes
     *            The liftTicketEndOdrMinutes to set.
     */
    public void setLiftTicketEndOdrMinutes(String liftTicketEndOdrMinutes) {
        this.liftTicketEndOdrMinutes = liftTicketEndOdrMinutes;
    }

    /**
     * @param liquidateDay
     *            The liquidateDay to set.
     */
    public void setLiquidateDay(String liquidateDay) {
        this.liquidateDay = StringUtil.toHalf(liquidateDay);
    }

    /**
     * @param liquidateInformFlg
     *            The liquidateInformFlg to set.
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
     * ��d�������i�����ݒ莞�j�F����ݒ肵�܂��B
     * 
     * @param liquidateTimeHour
     *            ��d�������i�����ݒ莞�j�F��
     */
    public void setLiquidateTimeHour(String liquidateTimeHour) {
        this.liquidateTimeHour = liquidateTimeHour;
    }

    /**
     * ��d�������i�����ݒ莞�j�F����ݒ肵�܂��B
     * 
     * @param liquidateTimeMinute
     *            ��d�������i�����ݒ莞�j�F��
     */
    public void setLiquidateTimeMinute(String liquidateTimeMinute) {
        this.liquidateTimeMinute = liquidateTimeMinute;
    }

    /**
     * @param lockerFeeFlg
     *            The lockerFeeFlg to set.
     */
    public void setLockerFeeFlg(String lockerFeeFlg) {
        this.lockerFeeFlg = lockerFeeFlg;
    }

    /**
     * @param lockerFlg
     *            The lockerFlg to set.
     */
    public void setLockerFlg(String lockerFlg) {
        this.lockerFlg = lockerFlg;
    }

    /**
     * @param memo
     *            The memo to set.
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @param oneMakeFlg
     *            The oneMakeFlg to set.
     */
    public void setOneMakeFlg(String oneMakeFlg) {
        this.oneMakeFlg = oneMakeFlg;
    }

    /**
     * @param ownerNm
     *            The ownerNm to set.
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * @param personalTicketPrintFlg
     *            The personalTicketPrintFlg to set.
     */
    public void setPersonalTicketPrintFlg(String personalTicketPrintFlg) {
        this.personalTicketPrintFlg = personalTicketPrintFlg;
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
     * @param receiptPart
     *            The receiptPart to set.
     */
    public void setReceiptPart(String receiptPart) {
        this.receiptPart = receiptPart;
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
     * �\��ʒm���@�v�� .��ݒ肵�܂��B
     * 
     * @param reserveInformWay
     *            �\��ʒm���@�v�� .
     */
    public void setReserveInformWay(String reserveInformWay) {
        this.reserveInformWay = reserveInformWay;
    }

    /**
     * @param salesTimeBeginNight
     *            the salesTimeBeginNight to set.
     */
    public void setSalesTimeBeginNight(String salesTimeBeginNight) {
        if (!StringUtil.isEmpty(salesTimeBeginNight)) {
            this.salesTimeBeginNightHour = salesTimeBeginNight.substring(0, 2);
            this.salesTimeBeginNightMinutes = salesTimeBeginNight.substring(2,
                    4);
        } else {
            this.salesTimeBeginNightHour = "";
            this.salesTimeBeginNightMinutes = "";
        }
    }

    /**
     * @param salesTimeBeginNightHour
     *            The salesTimeBeginNightHour to set.
     */
    public void setSalesTimeBeginNightHour(String salesTimeBeginNightHour) {
        this.salesTimeBeginNightHour = salesTimeBeginNightHour;
    }

    /**
     * @param salesTimeBeginNightMinutes
     *            The salesTimeBeginNightMinutes to set.
     */
    public void setSalesTimeBeginNightMinutes(String salesTimeBeginNightMinutes) {
        this.salesTimeBeginNightMinutes = salesTimeBeginNightMinutes;
    }

    /**
     * @param salesTimeBeginNor
     *            the salesTimeBeginNor to set.
     */
    public void setSalesTimeBeginNor(String salesTimeBeginNor) {
        if (!StringUtil.isEmpty(salesTimeBeginNor)) {
            this.salesTimeBeginNorHour = salesTimeBeginNor.substring(0, 2);
            this.salesTimeBeginNorMinutes = salesTimeBeginNor.substring(2, 4);
        } else {
            this.salesTimeBeginNorHour = "";
            this.salesTimeBeginNorMinutes = "";
        }
    }

    /**
     * @param salesTimeBeginNorHour
     *            The salesTimeBeginNorHour to set.
     */
    public void setSalesTimeBeginNorHour(String salesTimeBeginNorHour) {
        this.salesTimeBeginNorHour = salesTimeBeginNorHour;
    }

    /**
     * @param salesTimeBeginNorMinutes
     *            The salesTimeBeginNorMinutes to set.
     */
    public void setSalesTimeBeginNorMinutes(String salesTimeBeginNorMinutes) {
        this.salesTimeBeginNorMinutes = salesTimeBeginNorMinutes;
    }

    /**
     * @param salesTimeEndNight
     *            the salesTimeEndNight to set.
     */
    public void setSalesTimeEndNight(String salesTimeEndNight) {
        if (!StringUtil.isEmpty(salesTimeEndNight)) {
            this.salesTimeEndNightHour = salesTimeEndNight.substring(0, 2);
            this.salesTimeEndNightMinutes = salesTimeEndNight.substring(2, 4);
        } else {
            this.salesTimeEndNightHour = "";
            this.salesTimeEndNightMinutes = "";
        }
    }

    /**
     * @param salesTimeEndNightHour
     *            The salesTimeEndNightHour to set.
     */
    public void setSalesTimeEndNightHour(String salesTimeEndNightHour) {
        this.salesTimeEndNightHour = salesTimeEndNightHour;
    }

    /**
     * @param salesTimeEndNightMinutes
     *            The salesTimeEndNightMinutes to set.
     */
    public void setSalesTimeEndNightMinutes(String salesTimeEndNightMinutes) {
        this.salesTimeEndNightMinutes = salesTimeEndNightMinutes;
    }

    /**
     * @param salesTimeEndNor
     *            the salesTimeEndNor to set.
     */
    public void setSalesTimeEndNor(String salesTimeEndNor) {
        if (!StringUtil.isEmpty(salesTimeEndNor)) {
            this.salesTimeEndNorHour = salesTimeEndNor.substring(0, 2);
            this.salesTimeEndNorMinutes = salesTimeEndNor.substring(2, 4);
        } else {
            this.salesTimeEndNorHour = "";
            this.salesTimeEndNorMinutes = "";
        }
    }

    /**
     * @param salesTimeEndNorHour
     *            The salesTimeEndNorHour to set.
     */
    public void setSalesTimeEndNorHour(String salesTimeEndNorHour) {
        this.salesTimeEndNorHour = salesTimeEndNorHour;
    }

    /**
     * @param salesTimeEndNorMinutes
     *            The salesTimeEndNorMinutes to set.
     */
    public void setSalesTimeEndNorMinutes(String salesTimeEndNorMinutes) {
        this.salesTimeEndNorMinutes = salesTimeEndNorMinutes;
    }

    /**
     * @param salesTimeMemoNight
     *            The salesTimeMemoNight to set.
     */
    public void setSalesTimeMemoNight(String salesTimeMemoNight) {
        this.salesTimeMemoNight = salesTimeMemoNight;
    }

    /**
     * @param salesTimeMemoNor
     *            The salesTimeMemoNor to set.
     */
    public void setSalesTimeMemoNor(String salesTimeMemoNor) {
        this.salesTimeMemoNor = salesTimeMemoNor;
    }

    /**
     * @param salesTimeOthers
     *            The salesTimeOthers to set.
     */
    public void setSalesTimeOthers(String salesTimeOthers) {
        this.salesTimeOthers = salesTimeOthers;
    }

    /**
     * @param sendAddrCmt
     *            The sendAddrCmt to set.
     */
    public void setSendAddrCmt(String sendAddrCmt) {
        this.sendAddrCmt = sendAddrCmt;
    }

    /**
     * @param sendAddrOthersFlg
     *            The sendAddrOthersFlg to set.
     */
    public void setSendAddrOthersFlg(String sendAddrOthersFlg) {
        this.sendAddrOthersFlg = sendAddrOthersFlg;
    }

    /**
     * @param sendAddrSkiAreasFlg
     *            The sendAddrSkiAreasFlg to set.
     */
    public void setSendAddrSkiAreasFlg(String sendAddrSkiAreasFlg) {
        this.sendAddrSkiAreasFlg = sendAddrSkiAreasFlg;
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
     * @param showerFeeFlg
     *            The showerFeeFlg to set.
     */
    public void setShowerFeeFlg(String showerFeeFlg) {
        this.showerFeeFlg = showerFeeFlg;
    }

    /**
     * @param showerFlg
     *            The showerFlg to set.
     */
    public void setShowerFlg(String showerFlg) {
        this.showerFlg = showerFlg;
    }

    /**
     * @param specialItem
     *            The specialItem to set.
     */
    public void setSpecialItem(String specialItem) {
        this.specialItem = specialItem;
    }

    /**
     * ���L�����i�ݔ��E��z�T�[�r�X�j��ݒ肵�܂��B
     * 
     * @param specialItem2
     *            ���L�����i�ݔ��E��z�T�[�r�X�j
     */
    public void setSpecialItem2(String specialItem2) {
        this.specialItem2 = specialItem2;
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
     * �݌ɊǗ����@ ��������/�����Ȃ���ݒ肵�܂��B
     * 
     * @param stockControlFlg
     *            �݌ɊǗ����@ ��������/�����Ȃ�
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
     * @param stockNo
     *            The stockNo to set.
     */
    public void setStockNo(String stockNo) {
        this.stockNo = StringUtil.toHalf(stockNo);
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
     *            The termEndD to set.
     */
    @Override
    public void setTermEndD(String termEndD) {
        this.termEndD = termEndD;
    }

    /**
     * @param termEndM
     *            The termEndM to set.
     */
    @Override
    public void setTermEndM(String termEndM) {
        this.termEndM = termEndM;
    }

    /**
     * @param termEndY
     *            The termEndY to set.
     */
    @Override
    public void setTermEndY(String termEndY) {
        this.termEndY = termEndY;
    }

    /**
     * @param termEndYmd
     *            the termEndYmd to set.
     */
    public void setTermEndYmd(String termEndYmd) {
        if (!StringUtil.isEmpty(termEndYmd)) {
            if (termEndYmd.length() == JreConstants.TERM_YMD) {
                this.termEndY = termEndYmd.substring(0, 4);
                this.termEndM = termEndYmd.substring(4, 6);
                this.termEndD = termEndYmd.substring(6, 8);
            } else {
                this.termEndY = "";
                this.termEndM = "";
                this.termEndD = "";
            }
        } else {
            this.termEndY = "";
            this.termEndM = "";
            this.termEndD = "";
        }
    }

    /**
     * @param termFromD
     *            The termFromD to set.
     */
    @Override
    public void setTermFromD(String termFromD) {
        this.termFromD = termFromD;
    }

    /**
     * @param termFromM
     *            The termFromM to set.
     */
    @Override
    public void setTermFromM(String termFromM) {
        this.termFromM = termFromM;
    }

    /**
     * @param termFromY
     *            The termFromY to set.
     */
    @Override
    public void setTermFromY(String termFromY) {
        this.termFromY = termFromY;
    }

    /**
     * @param termFromYmd
     *            the termFromYmd to set.
     */
    public void setTermFromYmd(String termFromYmd) {
        if (!StringUtil.isEmpty(termFromYmd)) {
            if (termFromYmd.length() == JreConstants.TERM_YMD) {
                this.termFromY = termFromYmd.substring(0, 4);
                this.termFromM = termFromYmd.substring(4, 6);
                this.termFromD = termFromYmd.substring(6, 8);
            } else {
                this.termFromY = "";
                this.termFromM = "";
                this.termFromD = "";
            }
        } else {
            this.termFromY = "";
            this.termFromM = "";
            this.termFromD = "";
        }
    }

    /**
     * @param ticketTitleKana
     *            The ticketTitleKana to set.
     */
    public void setTicketTitleKana(String ticketTitleKana) {
        this.ticketTitleKana = ticketTitleKana;
    }

    /**
     * @param ticketTitleKanji
     *            The ticketTitleKanji to set.
     */
    public void setTicketTitleKanji(String ticketTitleKanji) {
        this.ticketTitleKanji = ticketTitleKanji;
    }

    /**
     * @param validPeriod
     *            The validPeriod to set.
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

    /**
     * @param voucherIntroKanji
     *            The voucherIntroKanji to set.
     */
    public void setVoucherIntroKanji(String voucherIntroKanji) {
        this.voucherIntroKanji = voucherIntroKanji;
    }
}
