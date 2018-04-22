package jp.co.jreast.common.data.ddata;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * �{�݃}�X�^ �G���e�B�e�B
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
public class MFacility {

    /** �Z�� */
    private String address;

    /** �n��R�[�h */
    private String areaCd;

    /** �n��啪�� */
    private String areaDaiCd;

    /** �n�揬���� */
    private String areaShoCd;

    /** TODO */
    private String busyo;

    /** �g�p��~�t���O */
    private String closeFlg;

    /** �_��R�[�h���NO1 */
    private String cmnContractCd1;

    /** �_��R�[�h���NO2 */
    private String cmnContractCd2;

    /** �_��R�[�h���NO3 */
    private String cmnContractCd3;

    /** �_��R�[�h���NO4 */
    private String cmnContractCd4;

    /** �_��R�[�h���NO5 */
    private String cmnContractCd5;

    /** ���ID */
    private String comId;

    /** �_���� */
    private String contractKind;

    /** �_��N����FROM */
    private Timestamp contractYmdFrom;

    /** �_��N����FROM�iDP�j */
    private Timestamp contractYmdFromDp;

    /** �_��N����FROM�iRM/SP�j */
    private Timestamp contractYmdFromRmsp;

    /** �_��N����TO */
    private Timestamp contractYmdTo;

    /** �_��N����TO�iDP�j */
    private Timestamp contractYmdToDp;

    /** �_��N����TO�iRM/SP�j */
    private Timestamp contractYmdToRmsp;

    /** �쐬�N���� */
    private Timestamp createYmd;

    /** ���t�惁�[���A�h���X */
    private String eMail;

    /** �{�ݗ��̖��i�J�i�j */
    private String facilityAbbrNmKana;

    /** �{�ݗ��̖��i�����j */
    private String facilityAbbrNmKanji;

    /** �{�݃R�[�h */
    private String facilityCd;

    /** �{�ݖ��� */
    private String facilityNm;

    /** �{�ݖ��́i�J�i�j */
    private String facilityNmKana;

    /** �{��URL */
    private String facilityUrl;

    /** FAX�ԍ� */
    private String faxNo;

    /** TODO */
    private String faxTanto;

    /** �戵�i�̔��j�萔�� */
    private BigDecimal handlingTax;

    /** �戵�i�̔��j�萔���iDP�j */
    private BigDecimal handlingTaxDp;

    /** �戵�i�̔��j�萔���iRM/SP�j */
    private BigDecimal handlingTaxRmsp;

    /** �萔���^�C�v */
    private String handlingTaxType;

    /** �c������ۃt���O */
    private String infantFlg;

    /** �i�q���A����� */
    private String jrMemberFlg;

    /** TODO */
    private String kindCd;

    /** �񓚏���� */
    private String kindFlg;

    /** �ܓx */
    private BigDecimal latitude;

    /** ��{��d���� */
    private Integer liquidateDay;

    /** ��d�������i�����ݒ莞�j */
    private String liquidateTime;

    /** �o�x */
    private BigDecimal longitude;

    /** TODO */
    private String memo;

    /** �V�K�t���O */
    private String newFlg;

    /** ����ӏ� */
    private String operation;

    /** �_��R�[�h���̑�NO1 */
    private String otherContractCd1;

    /** �_��R�[�h���̑�NO2 */
    private String otherContractCd2;

    /** �_��R�[�h���̑�NO3 */
    private String otherContractCd3;

    /** �_��R�[�h���̑�NO4 */
    private String otherContractCd4;

    /** �_��R�[�h���̑�NO5 */
    private String otherContractCd5;

    /** ��\�Җ� */
    private String ownerNm;

    /** TODO */
    private String password;

    /** �X�֔ԍ� */
    private String postcode;

    /** �s���{���R�[�h */
    private String prefecturesCd;

    /** �n��R�[�h */
    private String regionCd;

    /** �\��ʒm���@ */
    private String reserveInformWay;

    /** �Ԏ��s�� */
    private String retRoomFlg;

    /** �x�O���Ԏ��\�� */
    private String retRoomHolidayDd;

    /** �x�O���Ԏ��s�� */
    private String retRoomHolidayFlg;

    /** �x�O���Ԏ��\�� */
    private String retRoomHolidayMm;

    /** ���E�x���Ԏ��\�� */
    private String retRoomWeekdayDd;

    /** ���E�x���Ԏ��\�� */
    private String retRoomWeekdayMm;

    /** TODO */
    private String riyu;

    /** ���t�敪�R�[�h */
    private String sendDivCd;

    /** ���t��FAX�ԍ� */
    private String sendFaxNo;

    /** �����Łi��l�j */
    private Integer spaTaxAdlt;

    /** �����Łi���l�j */
    private Integer spaTaxChild;

    /** �h���{�݋敪 */
    private String stayFacilityKind;

    /** TODO */
    private String stockBranch;

    /** �d���x�ЃR�[�h */
    private String stockBranchCd;

    /** TODO */
    private String tantou;

    /** �S���� */
    private String tantousya;

    /** �d�b�ԍ� */
    private String telephonNo;

    /** �p�\�R�� */
    private String terminalNo;

    /** �����s�h���Ńt���O */
    private String tyoStayTaxFlg;

    /** �X�V�x�� */
    private String upBranchCd;

    /** �X�V�t���O */
    private String updateFlg;

    /** �X�V�� */
    private String upUserId;

    /** �X�V�N���� */
    private Timestamp upYmd;

    /** �G���A�R�[�h */
    private String zoneCd;

    /** ����WEB���M�t���O */
    private String zouseiSendFlg;

    /**
     * �Z�����擾���܂��B
     * 
     * @return �Z��
     */
    public String getAddress() {
        return address;
    }

    /**
     * �n��R�[�h���擾���܂��B
     * 
     * @return �n��R�[�h
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * �n��啪�ނ��擾���܂��B
     * 
     * @return �n��啪��
     */
    public String getAreaDaiCd() {
        return areaDaiCd;
    }

    /**
     * �n�揬���ނ��擾���܂��B
     * 
     * @return �n�揬����
     */
    public String getAreaShoCd() {
        return areaShoCd;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
     */
    public String getBusyo() {
        return busyo;
    }

    /**
     * �g�p��~�t���O���擾���܂��B
     * 
     * @return �g�p��~�t���O
     */
    public String getCloseFlg() {
        return closeFlg;
    }

    /**
     * �_��R�[�h���NO1���擾���܂��B
     * 
     * @return �_��R�[�h���NO1
     */
    public String getCmnContractCd1() {
        return cmnContractCd1;
    }

    /**
     * �_��R�[�h���NO2���擾���܂��B
     * 
     * @return �_��R�[�h���NO2
     */
    public String getCmnContractCd2() {
        return cmnContractCd2;
    }

    /**
     * �_��R�[�h���NO3���擾���܂��B
     * 
     * @return �_��R�[�h���NO3
     */
    public String getCmnContractCd3() {
        return cmnContractCd3;
    }

    /**
     * �_��R�[�h���NO4���擾���܂��B
     * 
     * @return �_��R�[�h���NO4
     */
    public String getCmnContractCd4() {
        return cmnContractCd4;
    }

    /**
     * �_��R�[�h���NO5���擾���܂��B
     * 
     * @return �_��R�[�h���NO5
     */
    public String getCmnContractCd5() {
        return cmnContractCd5;
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
     * �_���ʂ��擾���܂��B
     * 
     * @return �_����
     */
    public String getContractKind() {
        return contractKind;
    }

    /**
     * �_��N����FROM���擾���܂��B
     * 
     * @return �_��N����FROM
     */
    public Timestamp getContractYmdFrom() {
        return contractYmdFrom;
    }

    /**
     * �_��N����FROM�iDP�j���擾���܂��B
     * 
     * @return �_��N����FROM�iDP�j
     */
    public Timestamp getContractYmdFromDp() {
        return contractYmdFromDp;
    }

    /**
     * �_��N����FROM�iRM/SP�j���擾���܂��B
     * 
     * @return �_��N����FROM�iRM/SP�j
     */
    public Timestamp getContractYmdFromRmsp() {
        return contractYmdFromRmsp;
    }

    /**
     * �_��N����TO���擾���܂��B
     * 
     * @return �_��N����TO
     */
    public Timestamp getContractYmdTo() {
        return contractYmdTo;
    }

    /**
     * �_��N����TO�iDP�j���擾���܂��B
     * 
     * @return �_��N����TO�iDP�j
     */
    public Timestamp getContractYmdToDp() {
        return contractYmdToDp;
    }

    /**
     * �_��N����TO�iRM/SP�j���擾���܂��B
     * 
     * @return �_��N����TO�iRM/SP�j
     */
    public Timestamp getContractYmdToRmsp() {
        return contractYmdToRmsp;
    }

    /**
     * �쐬�N�������擾���܂��B
     * 
     * @return �쐬�N����
     */
    public Timestamp getCreateYmd() {
        return createYmd;
    }

    /**
     * ���t�惁�[���A�h���X���擾���܂��B
     * 
     * @return ���t�惁�[���A�h���X
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * �{�ݗ��̖��i�J�i�j���擾���܂��B
     * 
     * @return �{�ݗ��̖��i�J�i�j
     */
    public String getFacilityAbbrNmKana() {
        return facilityAbbrNmKana;
    }

    /**
     * �{�ݗ��̖��i�����j���擾���܂��B
     * 
     * @return �{�ݗ��̖��i�����j
     */
    public String getFacilityAbbrNmKanji() {
        return facilityAbbrNmKanji;
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
     * �{�ݖ��̂��擾���܂��B
     * 
     * @return �{�ݖ���
     */
    public String getFacilityNm() {
        return facilityNm;
    }

    /**
     * �{�ݖ��́i�J�i�j���擾���܂��B
     * 
     * @return �{�ݖ��́i�J�i�j
     */
    public String getFacilityNmKana() {
        return facilityNmKana;
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
     * FAX�ԍ����擾���܂��B
     * 
     * @return FAX�ԍ�
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
     */
    public String getFaxTanto() {
        return faxTanto;
    }

    /**
     * �戵�i�̔��j�萔�����擾���܂��B
     * 
     * @return �戵�i�̔��j�萔��
     */
    public BigDecimal getHandlingTax() {
        return handlingTax;
    }

    /**
     * �戵�i�̔��j�萔���iDP�j���擾���܂��B
     * 
     * @return �戵�i�̔��j�萔���iDP�j
     */
    public BigDecimal getHandlingTaxDp() {
        return handlingTaxDp;
    }

    /**
     * �戵�i�̔��j�萔���iRM/SP�j���擾���܂��B
     * 
     * @return �戵�i�̔��j�萔���iRM/SP�j
     */
    public BigDecimal getHandlingTaxRmsp() {
        return handlingTaxRmsp;
    }

    /**
     * �萔���^�C�v���擾���܂��B
     * 
     * @return �萔���^�C�v
     */
    public String getHandlingTaxType() {
        return handlingTaxType;
    }

    /**
     * �c������ۃt���O���擾���܂��B
     * 
     * @return �c������ۃt���O
     */
    public String getInfantFlg() {
        return infantFlg;
    }

    /**
     * �i�q���A��������擾���܂��B
     * 
     * @return �i�q���A�����
     */
    public String getJrMemberFlg() {
        return jrMemberFlg;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
     */
    public String getKindCd() {
        return kindCd;
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
     * �ܓx���擾���܂��B
     * 
     * @return �ܓx
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * ��{��d�������擾���܂��B
     * 
     * @return ��{��d����
     */
    public Integer getLiquidateDay() {
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
     * �o�x���擾���܂��B
     * 
     * @return �o�x
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
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
     * ����ӏ����擾���܂��B
     * 
     * @return ����ӏ�
     */
    public String getOperation() {
        return operation;
    }

    /**
     * �_��R�[�h���̑�NO1���擾���܂��B
     * 
     * @return �_��R�[�h���̑�NO1
     */
    public String getOtherContractCd1() {
        return otherContractCd1;
    }

    /**
     * �_��R�[�h���̑�NO2���擾���܂��B
     * 
     * @return �_��R�[�h���̑�NO2
     */
    public String getOtherContractCd2() {
        return otherContractCd2;
    }

    /**
     * �_��R�[�h���̑�NO3���擾���܂��B
     * 
     * @return �_��R�[�h���̑�NO3
     */
    public String getOtherContractCd3() {
        return otherContractCd3;
    }

    /**
     * �_��R�[�h���̑�NO4���擾���܂��B
     * 
     * @return �_��R�[�h���̑�NO4
     */
    public String getOtherContractCd4() {
        return otherContractCd4;
    }

    /**
     * �_��R�[�h���̑�NO5���擾���܂��B
     * 
     * @return �_��R�[�h���̑�NO5
     */
    public String getOtherContractCd5() {
        return otherContractCd5;
    }

    /**
     * ��\�Җ����擾���܂��B
     * 
     * @return ��\�Җ�
     */
    public String getOwnerNm() {
        return ownerNm;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
     */
    public String getPassword() {
        return password;
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
     * �Ԏ��s���擾���܂��B
     * 
     * @return �Ԏ��s��
     */
    public String getRetRoomFlg() {
        return retRoomFlg;
    }

    /**
     * �x�O���Ԏ��\�����擾���܂��B
     * 
     * @return �x�O���Ԏ��\��
     */
    public String getRetRoomHolidayDd() {
        return retRoomHolidayDd;
    }

    /**
     * �x�O���Ԏ��s���擾���܂��B
     * 
     * @return �x�O���Ԏ��s��
     */
    public String getRetRoomHolidayFlg() {
        return retRoomHolidayFlg;
    }

    /**
     * �x�O���Ԏ��\�����擾���܂��B
     * 
     * @return �x�O���Ԏ��\��
     */
    public String getRetRoomHolidayMm() {
        return retRoomHolidayMm;
    }

    /**
     * ���E�x���Ԏ��\�����擾���܂��B
     * 
     * @return ���E�x���Ԏ��\��
     */
    public String getRetRoomWeekdayDd() {
        return retRoomWeekdayDd;
    }

    /**
     * ���E�x���Ԏ��\�����擾���܂��B
     * 
     * @return ���E�x���Ԏ��\��
     */
    public String getRetRoomWeekdayMm() {
        return retRoomWeekdayMm;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
     */
    public String getRiyu() {
        return riyu;
    }

    /**
     * ���t�敪�R�[�h���擾���܂��B
     * 
     * @return ���t�敪�R�[�h
     */
    public String getSendDivCd() {
        return sendDivCd;
    }

    /**
     * ���t��FAX�ԍ����擾���܂��B
     * 
     * @return ���t��FAX�ԍ�
     */
    public String getSendFaxNo() {
        return sendFaxNo;
    }

    /**
     * �����Łi��l�j���擾���܂��B
     * 
     * @return �����Łi��l�j
     */
    public Integer getSpaTaxAdlt() {
        return spaTaxAdlt;
    }

    /**
     * �����Łi���l�j���擾���܂��B
     * 
     * @return �����Łi���l�j
     */
    public Integer getSpaTaxChild() {
        return spaTaxChild;
    }

    /**
     * �h���{�݋敪���擾���܂��B
     * 
     * @return �h���{�݋敪
     */
    public String getStayFacilityKind() {
        return stayFacilityKind;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
     */
    public String getStockBranch() {
        return stockBranch;
    }

    /**
     * �d���x�ЃR�[�h���擾���܂��B
     * 
     * @return �d���x�ЃR�[�h
     */
    public String getStockBranchCd() {
        return stockBranchCd;
    }

    /**
     * TODO���擾���܂��B
     * 
     * @return TODO
     */
    public String getTantou() {
        return tantou;
    }

    /**
     * �S���҂��擾���܂��B
     * 
     * @return �S����
     */
    public String getTantousya() {
        return tantousya;
    }

    /**
     * �d�b�ԍ����擾���܂��B
     * 
     * @return �d�b�ԍ�
     */
    public String getTelephonNo() {
        return telephonNo;
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
     * �����s�h���Ńt���O���擾���܂��B
     * 
     * @return �����s�h���Ńt���O
     */
    public String getTyoStayTaxFlg() {
        return tyoStayTaxFlg;
    }

    /**
     * �X�V�x�Ђ��擾���܂��B
     * 
     * @return �X�V�x��
     */
    public String getUpBranchCd() {
        return upBranchCd;
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
     * �X�V�҂��擾���܂��B
     * 
     * @return �X�V��
     */
    public String getUpUserId() {
        return upUserId;
    }

    /**
     * �X�V�N�������擾���܂��B
     * 
     * @return �X�V�N����
     */
    public Timestamp getUpYmd() {
        return upYmd;
    }

    /**
     * �G���A�R�[�h���擾���܂��B
     * 
     * @return �G���A�R�[�h
     */
    public String getZoneCd() {
        return zoneCd;
    }

    /**
     * ����WEB���M�t���O���擾���܂��B
     * 
     * @return ����WEB���M�t���O
     */
    public String getZouseiSendFlg() {
        return zouseiSendFlg;
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
     * �n��R�[�h��ݒ肵�܂��B
     * 
     * @param areaCd
     *            �n��R�[�h
     */
    public void setAreaCd(String areaCd) {
        this.areaCd = areaCd;
    }

    /**
     * �n��啪�ނ�ݒ肵�܂��B
     * 
     * @param areaDaiCd
     *            �n��啪��
     */
    public void setAreaDaiCd(String areaDaiCd) {
        this.areaDaiCd = areaDaiCd;
    }

    /**
     * �n�揬���ނ�ݒ肵�܂��B
     * 
     * @param areaShoCd
     *            �n�揬����
     */
    public void setAreaShoCd(String areaShoCd) {
        this.areaShoCd = areaShoCd;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param busyo
     *            TODO
     */
    public void setBusyo(String busyo) {
        this.busyo = busyo;
    }

    /**
     * �g�p��~�t���O��ݒ肵�܂��B
     * 
     * @param closeFlg
     *            �g�p��~�t���O
     */
    public void setCloseFlg(String closeFlg) {
        this.closeFlg = closeFlg;
    }

    /**
     * �_��R�[�h���NO1��ݒ肵�܂��B
     * 
     * @param cmnContractCd1
     *            �_��R�[�h���NO1
     */
    public void setCmnContractCd1(String cmnContractCd1) {
        this.cmnContractCd1 = cmnContractCd1;
    }

    /**
     * �_��R�[�h���NO2��ݒ肵�܂��B
     * 
     * @param cmnContractCd2
     *            �_��R�[�h���NO2
     */
    public void setCmnContractCd2(String cmnContractCd2) {
        this.cmnContractCd2 = cmnContractCd2;
    }

    /**
     * �_��R�[�h���NO3��ݒ肵�܂��B
     * 
     * @param cmnContractCd3
     *            �_��R�[�h���NO3
     */
    public void setCmnContractCd3(String cmnContractCd3) {
        this.cmnContractCd3 = cmnContractCd3;
    }

    /**
     * �_��R�[�h���NO4��ݒ肵�܂��B
     * 
     * @param cmnContractCd4
     *            �_��R�[�h���NO4
     */
    public void setCmnContractCd4(String cmnContractCd4) {
        this.cmnContractCd4 = cmnContractCd4;
    }

    /**
     * �_��R�[�h���NO5��ݒ肵�܂��B
     * 
     * @param cmnContractCd5
     *            �_��R�[�h���NO5
     */
    public void setCmnContractCd5(String cmnContractCd5) {
        this.cmnContractCd5 = cmnContractCd5;
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
     * �_���ʂ�ݒ肵�܂��B
     * 
     * @param contractKind
     *            �_����
     */
    public void setContractKind(String contractKind) {
        this.contractKind = contractKind;
    }

    /**
     * �_��N����FROM��ݒ肵�܂��B
     * 
     * @param contractYmdFrom
     *            �_��N����FROM
     */
    public void setContractYmdFrom(Timestamp contractYmdFrom) {
        this.contractYmdFrom = contractYmdFrom;
    }

    /**
     * �_��N����FROM�iDP�j��ݒ肵�܂��B
     * 
     * @param contractYmdFromDp
     *            �_��N����FROM�iDP�j
     */
    public void setContractYmdFromDp(Timestamp contractYmdFromDp) {
        this.contractYmdFromDp = contractYmdFromDp;
    }

    /**
     * �_��N����FROM�iRM/SP�j��ݒ肵�܂��B
     * 
     * @param contractYmdFromRmsp
     *            �_��N����FROM�iRM/SP�j
     */
    public void setContractYmdFromRmsp(Timestamp contractYmdFromRmsp) {
        this.contractYmdFromRmsp = contractYmdFromRmsp;
    }

    /**
     * �_��N����TO��ݒ肵�܂��B
     * 
     * @param contractYmdTo
     *            �_��N����TO
     */
    public void setContractYmdTo(Timestamp contractYmdTo) {
        this.contractYmdTo = contractYmdTo;
    }

    /**
     * �_��N����TO�iDP�j��ݒ肵�܂��B
     * 
     * @param contractYmdToDp
     *            �_��N����TO�iDP�j
     */
    public void setContractYmdToDp(Timestamp contractYmdToDp) {
        this.contractYmdToDp = contractYmdToDp;
    }

    /**
     * �_��N����TO�iRM/SP�j��ݒ肵�܂��B
     * 
     * @param contractYmdToRmsp
     *            �_��N����TO�iRM/SP�j
     */
    public void setContractYmdToRmsp(Timestamp contractYmdToRmsp) {
        this.contractYmdToRmsp = contractYmdToRmsp;
    }

    /**
     * �쐬�N������ݒ肵�܂��B
     * 
     * @param createYmd
     *            �쐬�N����
     */
    public void setCreateYmd(Timestamp createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * ���t�惁�[���A�h���X��ݒ肵�܂��B
     * 
     * @param eMail
     *            ���t�惁�[���A�h���X
     */
    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * �{�ݗ��̖��i�J�i�j��ݒ肵�܂��B
     * 
     * @param facilityAbbrNmKana
     *            �{�ݗ��̖��i�J�i�j
     */
    public void setFacilityAbbrNmKana(String facilityAbbrNmKana) {
        this.facilityAbbrNmKana = facilityAbbrNmKana;
    }

    /**
     * �{�ݗ��̖��i�����j��ݒ肵�܂��B
     * 
     * @param facilityAbbrNmKanji
     *            �{�ݗ��̖��i�����j
     */
    public void setFacilityAbbrNmKanji(String facilityAbbrNmKanji) {
        this.facilityAbbrNmKanji = facilityAbbrNmKanji;
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
     * �{�ݖ��̂�ݒ肵�܂��B
     * 
     * @param facilityNm
     *            �{�ݖ���
     */
    public void setFacilityNm(String facilityNm) {
        this.facilityNm = facilityNm;
    }

    /**
     * �{�ݖ��́i�J�i�j��ݒ肵�܂��B
     * 
     * @param facilityNmKana
     *            �{�ݖ��́i�J�i�j
     */
    public void setFacilityNmKana(String facilityNmKana) {
        this.facilityNmKana = facilityNmKana;
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
     * FAX�ԍ���ݒ肵�܂��B
     * 
     * @param faxNo
     *            FAX�ԍ�
     */
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param faxTanto
     *            TODO
     */
    public void setFaxTanto(String faxTanto) {
        this.faxTanto = faxTanto;
    }

    /**
     * �戵�i�̔��j�萔����ݒ肵�܂��B
     * 
     * @param handlingTax
     *            �戵�i�̔��j�萔��
     */
    public void setHandlingTax(BigDecimal handlingTax) {
        this.handlingTax = handlingTax;
    }

    /**
     * �戵�i�̔��j�萔���iDP�j��ݒ肵�܂��B
     * 
     * @param handlingTaxDp
     *            �戵�i�̔��j�萔���iDP�j
     */
    public void setHandlingTaxDp(BigDecimal handlingTaxDp) {
        this.handlingTaxDp = handlingTaxDp;
    }

    /**
     * �戵�i�̔��j�萔���iRM/SP�j��ݒ肵�܂��B
     * 
     * @param handlingTaxRmsp
     *            �戵�i�̔��j�萔���iRM/SP�j
     */
    public void setHandlingTaxRmsp(BigDecimal handlingTaxRmsp) {
        this.handlingTaxRmsp = handlingTaxRmsp;
    }

    /**
     * �萔���^�C�v��ݒ肵�܂��B
     * 
     * @param handlingTaxType
     *            �萔���^�C�v
     */
    public void setHandlingTaxType(String handlingTaxType) {
        this.handlingTaxType = handlingTaxType;
    }

    /**
     * �c������ۃt���O��ݒ肵�܂��B
     * 
     * @param infantFlg
     *            �c������ۃt���O
     */
    public void setInfantFlg(String infantFlg) {
        this.infantFlg = infantFlg;
    }

    /**
     * �i�q���A�������ݒ肵�܂��B
     * 
     * @param jrMemberFlg
     *            �i�q���A�����
     */
    public void setJrMemberFlg(String jrMemberFlg) {
        this.jrMemberFlg = jrMemberFlg;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param kindCd
     *            TODO
     */
    public void setKindCd(String kindCd) {
        this.kindCd = kindCd;
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
     * �ܓx��ݒ肵�܂��B
     * 
     * @param latitude
     *            �ܓx
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * ��{��d������ݒ肵�܂��B
     * 
     * @param liquidateDay
     *            ��{��d����
     */
    public void setLiquidateDay(Integer liquidateDay) {
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
     * �o�x��ݒ肵�܂��B
     * 
     * @param longitude
     *            �o�x
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param memo
     *            TODO
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
     * ����ӏ���ݒ肵�܂��B
     * 
     * @param operation
     *            ����ӏ�
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * �_��R�[�h���̑�NO1��ݒ肵�܂��B
     * 
     * @param otherContractCd1
     *            �_��R�[�h���̑�NO1
     */
    public void setOtherContractCd1(String otherContractCd1) {
        this.otherContractCd1 = otherContractCd1;
    }

    /**
     * �_��R�[�h���̑�NO2��ݒ肵�܂��B
     * 
     * @param otherContractCd2
     *            �_��R�[�h���̑�NO2
     */
    public void setOtherContractCd2(String otherContractCd2) {
        this.otherContractCd2 = otherContractCd2;
    }

    /**
     * �_��R�[�h���̑�NO3��ݒ肵�܂��B
     * 
     * @param otherContractCd3
     *            �_��R�[�h���̑�NO3
     */
    public void setOtherContractCd3(String otherContractCd3) {
        this.otherContractCd3 = otherContractCd3;
    }

    /**
     * �_��R�[�h���̑�NO4��ݒ肵�܂��B
     * 
     * @param otherContractCd4
     *            �_��R�[�h���̑�NO4
     */
    public void setOtherContractCd4(String otherContractCd4) {
        this.otherContractCd4 = otherContractCd4;
    }

    /**
     * �_��R�[�h���̑�NO5��ݒ肵�܂��B
     * 
     * @param otherContractCd5
     *            �_��R�[�h���̑�NO5
     */
    public void setOtherContractCd5(String otherContractCd5) {
        this.otherContractCd5 = otherContractCd5;
    }

    /**
     * ��\�Җ���ݒ肵�܂��B
     * 
     * @param ownerNm
     *            ��\�Җ�
     */
    public void setOwnerNm(String ownerNm) {
        this.ownerNm = ownerNm;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param password
     *            TODO
     */
    public void setPassword(String password) {
        this.password = password;
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
     * �n��R�[�h��ݒ肵�܂��B
     * 
     * @param regionCd
     *            �n��R�[�h
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
     * �Ԏ��s��ݒ肵�܂��B
     * 
     * @param retRoomFlg
     *            �Ԏ��s��
     */
    public void setRetRoomFlg(String retRoomFlg) {
        this.retRoomFlg = retRoomFlg;
    }

    /**
     * �x�O���Ԏ��\����ݒ肵�܂��B
     * 
     * @param retRoomHolidayDd
     *            �x�O���Ԏ��\��
     */
    public void setRetRoomHolidayDd(String retRoomHolidayDd) {
        this.retRoomHolidayDd = retRoomHolidayDd;
    }

    /**
     * �x�O���Ԏ��s��ݒ肵�܂��B
     * 
     * @param retRoomHolidayFlg
     *            �x�O���Ԏ��s��
     */
    public void setRetRoomHolidayFlg(String retRoomHolidayFlg) {
        this.retRoomHolidayFlg = retRoomHolidayFlg;
    }

    /**
     * �x�O���Ԏ��\����ݒ肵�܂��B
     * 
     * @param retRoomHolidayMm
     *            �x�O���Ԏ��\��
     */
    public void setRetRoomHolidayMm(String retRoomHolidayMm) {
        this.retRoomHolidayMm = retRoomHolidayMm;
    }

    /**
     * ���E�x���Ԏ��\����ݒ肵�܂��B
     * 
     * @param retRoomWeekdayDd
     *            ���E�x���Ԏ��\��
     */
    public void setRetRoomWeekdayDd(String retRoomWeekdayDd) {
        this.retRoomWeekdayDd = retRoomWeekdayDd;
    }

    /**
     * ���E�x���Ԏ��\����ݒ肵�܂��B
     * 
     * @param retRoomWeekdayMm
     *            ���E�x���Ԏ��\��
     */
    public void setRetRoomWeekdayMm(String retRoomWeekdayMm) {
        this.retRoomWeekdayMm = retRoomWeekdayMm;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param riyu
     *            TODO
     */
    public void setRiyu(String riyu) {
        this.riyu = riyu;
    }

    /**
     * ���t�敪�R�[�h��ݒ肵�܂��B
     * 
     * @param sendDivCd
     *            ���t�敪�R�[�h
     */
    public void setSendDivCd(String sendDivCd) {
        this.sendDivCd = sendDivCd;
    }

    /**
     * ���t��FAX�ԍ���ݒ肵�܂��B
     * 
     * @param sendFaxNo
     *            ���t��FAX�ԍ�
     */
    public void setSendFaxNo(String sendFaxNo) {
        this.sendFaxNo = sendFaxNo;
    }

    /**
     * �����Łi��l�j��ݒ肵�܂��B
     * 
     * @param spaTaxAdlt
     *            �����Łi��l�j
     */
    public void setSpaTaxAdlt(Integer spaTaxAdlt) {
        this.spaTaxAdlt = spaTaxAdlt;
    }

    /**
     * �����Łi���l�j��ݒ肵�܂��B
     * 
     * @param spaTaxChild
     *            �����Łi���l�j
     */
    public void setSpaTaxChild(Integer spaTaxChild) {
        this.spaTaxChild = spaTaxChild;
    }

    /**
     * �h���{�݋敪��ݒ肵�܂��B
     * 
     * @param stayFacilityKind
     *            �h���{�݋敪
     */
    public void setStayFacilityKind(String stayFacilityKind) {
        this.stayFacilityKind = stayFacilityKind;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param stockBranch
     *            TODO
     */
    public void setStockBranch(String stockBranch) {
        this.stockBranch = stockBranch;
    }

    /**
     * �d���x�ЃR�[�h��ݒ肵�܂��B
     * 
     * @param stockBranchCd
     *            �d���x�ЃR�[�h
     */
    public void setStockBranchCd(String stockBranchCd) {
        this.stockBranchCd = stockBranchCd;
    }

    /**
     * TODO��ݒ肵�܂��B
     * 
     * @param tantou
     *            TODO
     */
    public void setTantou(String tantou) {
        this.tantou = tantou;
    }

    /**
     * �S���҂�ݒ肵�܂��B
     * 
     * @param tantousya
     *            �S����
     */
    public void setTantousya(String tantousya) {
        this.tantousya = tantousya;
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
     * �p�\�R����ݒ肵�܂��B
     * 
     * @param terminalNo
     *            �p�\�R��
     */
    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }

    /**
     * �����s�h���Ńt���O��ݒ肵�܂��B
     * 
     * @param tyoStayTaxFlg
     *            �����s�h���Ńt���O
     */
    public void setTyoStayTaxFlg(String tyoStayTaxFlg) {
        this.tyoStayTaxFlg = tyoStayTaxFlg;
    }

    /**
     * �X�V�x�Ђ�ݒ肵�܂��B
     * 
     * @param upBranchCd
     *            �X�V�x��
     */
    public void setUpBranchCd(String upBranchCd) {
        this.upBranchCd = upBranchCd;
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
     * �X�V�҂�ݒ肵�܂��B
     * 
     * @param upUserId
     *            �X�V��
     */
    public void setUpUserId(String upUserId) {
        this.upUserId = upUserId;
    }

    /**
     * �X�V�N������ݒ肵�܂��B
     * 
     * @param upYmd
     *            �X�V�N����
     */
    public void setUpYmd(Timestamp upYmd) {
        this.upYmd = upYmd;
    }

    /**
     * �G���A�R�[�h��ݒ肵�܂��B
     * 
     * @param zoneCd
     *            �G���A�R�[�h
     */
    public void setZoneCd(String zoneCd) {
        this.zoneCd = zoneCd;
    }

    /**
     * ����WEB���M�t���O��ݒ肵�܂��B
     * 
     * @param zouseiSendFlg
     *            ����WEB���M�t���O
     */
    public void setZouseiSendFlg(String zouseiSendFlg) {
        this.zouseiSendFlg = zouseiSendFlg;
    }

}
