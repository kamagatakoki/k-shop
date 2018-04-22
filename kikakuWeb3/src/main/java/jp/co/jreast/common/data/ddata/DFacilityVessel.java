package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.interfaces.FacilityManageBodyKey;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Thu Sep 18 11:09:21 JST 2014
 */

/**
 * D_facility_vesselVo.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/09/18 keiken Generated.
 */
public class DFacilityVessel implements FacilityManageBodyKey {

    /**
     * �ʐ�
     */
    private String area;

    /**
     * �ʐϒP��
     */
    private String areaUnit;

    /**
     * �o�X�L��
     */
    private String bathFlg;

    /**
     * �o�X���[�u�L��
     */
    private String bathrobeFlg;

    /**
     * �o�X�^�I���L��
     */
    private String bathTowelFlg;

    /**
     * �x�b�h��
     */
    private String bedWidth;

    /**
     * �{�f�B�\�[�v�L��
     */
    private String bodySoapFlg;

    /**
     * �����敪
     */
    private String buildingDiv;

    /**
     * �����敪����
     */
    private String buildingDivNm;

    /**
     * �����E�����^�C�v��
     */
    private String buildingRoomNm;

    /**
     * �X���P
     */
    private String capacityFrom;

    /**
     * �X���Q
     */
    private String capacityTo;

    /**
     * �q���p�Q��R�����g
     */
    private String childBeddingCmt;

    /**
     * �q���p�Q��L��
     */
    private String childBeddingFlg;

    /**
     * �����E�u���V�L��
     */
    private String combFlg;

    /**
     * �h���C���[�L��
     */
    private String dryerFlg;

    /**
     * �G�L�X�g���x�b�h�L��
     */
    private String extraBedFlg;

    /**
     * �G�L�X�g���x�b�h�l��
     */
    private String extraBedNum;

    /**
     * �G�L�X�g���x�b�h��
     */
    private String extraBedWidth;

    /**
     * �{�݃R�[�h <Primary Key>
     */
    private String facilityCd;

    /**
     * �{�݃p�^�[�� <Primary Key>
     */
    private String facilityPattern;

    /**
     * �K�w�w��
     */
    private String floorAssign;

    /**
     * ��� <Primary Key>
     */
    private String kindFlg;

    /**
     * ���l
     */
    private String memo;

    /**
     * �i�C�g�E�F�A�L��
     */
    private String nightWearFlg;

    /**
     * �p�W���}�L��
     */
    private String pajamasFlg;

    /**
     * �����^�C�v <Primary Key>
     */
    private Integer roomType;

    /**
     * �Z�[���X�|�C���g
     */
    private String salesPoint;

    /**
     * �V�����v�[�E�����X�L��
     */
    private String shampooRinseFlg;

    /**
     * �V�����[�u�[�X�L��
     */
    private String showerBoothFlg;

    /**
     * �V�����[�L���b�v�L��
     */
    private String showerCapFlg;

    /**
     * �\�t�@�[�x�b�h�L��
     */
    private String sofaBedFlg;

    /**
     * �\�t�@�[�x�b�h�l��
     */
    private String sofaBedNum;

    /**
     * �\�t�@�[�x�b�h��
     */
    private String sofaBedWidth;

    /**
     * �X�^�b�L���O�x�b�h�L��
     */
    private String stackingBedFlg;

    /**
     * �X�^�b�L���O�x�b�h�l��
     */
    private String stackingBedNum;

    /**
     * �X�^�b�L���O�x�b�h��
     */
    private String stackingBedWidth;

    /**
     * �l���敪
     */
    private String styleDiv;

    /**
     * �g�C���L��
     */
    private String toiletFlg;

    /**
     * ���]
     */
    private String viewCd;

    /**
     * �E�H�V�����b�g�L��
     */
    private String washletFlg;

    /**
     * ���ʋ�L��
     */
    private String washToolFlg;

    /**
     * �䂩���L��
     */
    private String yukataFlg;

    /**
     * Constractor
     */
    public DFacilityVessel() {
    }

    /**
     * Constractor
     * 
     * @param facilityCd
     *            �{�݃R�[�h
     * @param kindFlg
     *            ���
     * @param facilityPattern
     *            �{�݃p�^�[��
     * @param roomType
     *            �����^�C�v
     */
    public DFacilityVessel(String facilityCd, String kindFlg,
            String facilityPattern, Integer roomType) {
        this.facilityCd = facilityCd;
        this.kindFlg = kindFlg;
        this.facilityPattern = facilityPattern;
        this.roomType = roomType;
    }

    /**
     * �ʐς��擾���܂��B
     * 
     * @return �ʐ�
     */
    public String getArea() {
        return area;
    }

    /**
     * �ʐϒP�ʂ��擾���܂��B
     * 
     * @return �ʐϒP��
     */
    public String getAreaUnit() {
        return areaUnit;
    }

    /**
     * �o�X�L�����擾���܂��B
     * 
     * @return �o�X�L��
     */
    public String getBathFlg() {
        return bathFlg;
    }

    /**
     * �o�X���[�u�L�����擾���܂��B
     * 
     * @return �o�X���[�u�L��
     */
    public String getBathrobeFlg() {
        return bathrobeFlg;
    }

    /**
     * �o�X�^�I���L�����擾���܂��B
     * 
     * @return �o�X�^�I���L��
     */
    public String getBathTowelFlg() {
        return bathTowelFlg;
    }

    /**
     * �x�b�h�����擾���܂��B
     * 
     * @return �x�b�h��
     */
    public String getBedWidth() {
        return bedWidth;
    }

    /**
     * �{�f�B�\�[�v�L�����擾���܂��B
     * 
     * @return �{�f�B�\�[�v�L��
     */
    public String getBodySoapFlg() {
        return bodySoapFlg;
    }

    /**
     * �����敪���擾���܂��B
     * 
     * @return �����敪
     */
    public String getBuildingDiv() {
        return buildingDiv;
    }

    /**
     * �����敪���̂��擾���܂��B
     * 
     * @return �����敪����
     */
    public String getBuildingDivNm() {
        return buildingDivNm;
    }

    /**
     * �����E�����^�C�v�����擾���܂��B
     * 
     * @return �����E�����^�C�v��
     */
    public String getBuildingRoomNm() {
        return buildingRoomNm;
    }

    /**
     * �X���P���擾���܂��B
     * 
     * @return �X���P
     */
    public String getCapacityFrom() {
        return capacityFrom;
    }

    /**
     * �X���Q���擾���܂��B
     * 
     * @return �X���Q
     */
    public String getCapacityTo() {
        return capacityTo;
    }

    /**
     * �q���p�Q��R�����g���擾���܂��B
     * 
     * @return �q���p�Q��R�����g
     */
    public String getChildBeddingCmt() {
        return childBeddingCmt;
    }

    /**
     * �q���p�Q��L�����擾���܂��B
     * 
     * @return �q���p�Q��L��
     */
    public String getChildBeddingFlg() {
        return childBeddingFlg;
    }

    /**
     * �����E�u���V�L�����擾���܂��B
     * 
     * @return �����E�u���V�L��
     */
    public String getCombFlg() {
        return combFlg;
    }

    /**
     * �h���C���[�L�����擾���܂��B
     * 
     * @return �h���C���[�L��
     */
    public String getDryerFlg() {
        return dryerFlg;
    }

    /**
     * �G�L�X�g���x�b�h�L�����擾���܂��B
     * 
     * @return �G�L�X�g���x�b�h�L��
     */
    public String getExtraBedFlg() {
        return extraBedFlg;
    }

    /**
     * �G�L�X�g���x�b�h�l�����擾���܂��B
     * 
     * @return �G�L�X�g���x�b�h�l��
     */
    public String getExtraBedNum() {
        return extraBedNum;
    }

    /**
     * �G�L�X�g���x�b�h�����擾���܂��B
     * 
     * @return �G�L�X�g���x�b�h��
     */
    public String getExtraBedWidth() {
        return extraBedWidth;
    }

    /**
     * �{�݃R�[�h <Primary Key>���擾���܂��B
     * 
     * @return �{�݃R�[�h <Primary Key>
     */
    @Override
    public String getFacilityCd() {
        return facilityCd;
    }

    /**
     * �{�݃p�^�[�� <Primary Key>���擾���܂��B
     * 
     * @return �{�݃p�^�[�� <Primary Key>
     */
    @Override
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * �K�w�w����擾���܂��B
     * 
     * @return �K�w�w��
     */
    public String getFloorAssign() {
        return floorAssign;
    }

    /**
     * ��� <Primary Key>���擾���܂��B
     * 
     * @return ��� <Primary Key>
     */
    @Override
    public String getKindFlg() {
        return kindFlg;
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
     * �i�C�g�E�F�A�L�����擾���܂��B
     * 
     * @return �i�C�g�E�F�A�L��
     */
    public String getNightWearFlg() {
        return nightWearFlg;
    }

    /**
     * �p�W���}�L�����擾���܂��B
     * 
     * @return �p�W���}�L��
     */
    public String getPajamasFlg() {
        return pajamasFlg;
    }

    /**
     * �����^�C�v <Primary Key>���擾���܂��B
     * 
     * @return �����^�C�v <Primary Key>
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * �����^�C�v�����擾���܂��B
     * 
     * @return �����^�C�v��
     */
    public String getRoomTypeNm() {
        return JreConstants.getListLabel(DJreConstants.ROOM_TYPE_DIV_DR,
                String.valueOf(getRoomType()));
    }

    /**
     * �Z�[���X�|�C���g���擾���܂��B
     * 
     * @return �Z�[���X�|�C���g
     */
    public String getSalesPoint() {
        return salesPoint;
    }

    /**
     * �V�����v�[�E�����X�L�����擾���܂��B
     * 
     * @return �V�����v�[�E�����X�L��
     */
    public String getShampooRinseFlg() {
        return shampooRinseFlg;
    }

    /**
     * �V�����[�u�[�X�L�����擾���܂��B
     * 
     * @return �V�����[�u�[�X�L��
     */
    public String getShowerBoothFlg() {
        return showerBoothFlg;
    }

    /**
     * �V�����[�L���b�v�L�����擾���܂��B
     * 
     * @return �V�����[�L���b�v�L��
     */
    public String getShowerCapFlg() {
        return showerCapFlg;
    }

    /**
     * �\�t�@�[�x�b�h�L�����擾���܂��B
     * 
     * @return �\�t�@�[�x�b�h�L��
     */
    public String getSofaBedFlg() {
        return sofaBedFlg;
    }

    /**
     * �\�t�@�[�x�b�h�l�����擾���܂��B
     * 
     * @return �\�t�@�[�x�b�h�l��
     */
    public String getSofaBedNum() {
        return sofaBedNum;
    }

    /**
     * �\�t�@�[�x�b�h�����擾���܂��B
     * 
     * @return �\�t�@�[�x�b�h��
     */
    public String getSofaBedWidth() {
        return sofaBedWidth;
    }

    /**
     * �X�^�b�L���O�x�b�h�L�����擾���܂��B
     * 
     * @return �X�^�b�L���O�x�b�h�L��
     */
    public String getStackingBedFlg() {
        return stackingBedFlg;
    }

    /**
     * �X�^�b�L���O�x�b�h�l�����擾���܂��B
     * 
     * @return �X�^�b�L���O�x�b�h�l��
     */
    public String getStackingBedNum() {
        return stackingBedNum;
    }

    /**
     * �X�^�b�L���O�x�b�h�����擾���܂��B
     * 
     * @return �X�^�b�L���O�x�b�h��
     */
    public String getStackingBedWidth() {
        return stackingBedWidth;
    }

    /**
     * �l���敪���擾���܂��B
     * 
     * @return �l���敪
     */
    public String getStyleDiv() {
        return styleDiv;
    }

    /**
     * �g�C���L�����擾���܂��B
     * 
     * @return �g�C���L��
     */
    public String getToiletFlg() {
        return toiletFlg;
    }

    /**
     * ���]���擾���܂��B
     * 
     * @return ���]
     */
    public String getViewCd() {
        return viewCd;
    }

    /**
     * �E�H�V�����b�g�L�����擾���܂��B
     * 
     * @return �E�H�V�����b�g�L��
     */
    public String getWashletFlg() {
        return washletFlg;
    }

    /**
     * ���ʋ�L�����擾���܂��B
     * 
     * @return ���ʋ�L��
     */
    public String getWashToolFlg() {
        return washToolFlg;
    }

    /**
     * �䂩���L�����擾���܂��B
     * 
     * @return �䂩���L��
     */
    public String getYukataFlg() {
        return yukataFlg;
    }

    /**
     * �ʐς�ݒ肵�܂��B
     * 
     * @param area
     *            �ʐ�
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * �ʐϒP�ʂ�ݒ肵�܂��B
     * 
     * @param areaUnit
     *            �ʐϒP��
     */
    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    /**
     * �o�X�L����ݒ肵�܂��B
     * 
     * @param bathFlg
     *            �o�X�L��
     */
    public void setBathFlg(String bathFlg) {
        this.bathFlg = bathFlg;
    }

    /**
     * �o�X���[�u�L����ݒ肵�܂��B
     * 
     * @param bathrobeFlg
     *            �o�X���[�u�L��
     */
    public void setBathrobeFlg(String bathrobeFlg) {
        this.bathrobeFlg = bathrobeFlg;
    }

    /**
     * �o�X�^�I���L����ݒ肵�܂��B
     * 
     * @param bathTowelFlg
     *            �o�X�^�I���L��
     */
    public void setBathTowelFlg(String bathTowelFlg) {
        this.bathTowelFlg = bathTowelFlg;
    }

    /**
     * �x�b�h����ݒ肵�܂��B
     * 
     * @param bedWidth
     *            �x�b�h��
     */
    public void setBedWidth(String bedWidth) {
        this.bedWidth = bedWidth;
    }

    /**
     * �{�f�B�\�[�v�L����ݒ肵�܂��B
     * 
     * @param bodySoapFlg
     *            �{�f�B�\�[�v�L��
     */
    public void setBodySoapFlg(String bodySoapFlg) {
        this.bodySoapFlg = bodySoapFlg;
    }

    /**
     * �����敪��ݒ肵�܂��B
     * 
     * @param buildingDiv
     *            �����敪
     */
    public void setBuildingDiv(String buildingDiv) {
        this.buildingDiv = buildingDiv;
    }

    /**
     * �����敪���̂�ݒ肵�܂��B
     * 
     * @param buildingDivNm
     *            �����敪����
     */
    public void setBuildingDivNm(String buildingDivNm) {
        this.buildingDivNm = buildingDivNm;
    }

    /**
     * �����E�����^�C�v����ݒ肵�܂��B
     * 
     * @param buildingRoomNm
     *            �����E�����^�C�v��
     */
    public void setBuildingRoomNm(String buildingRoomNm) {
        this.buildingRoomNm = buildingRoomNm;
    }

    /**
     * �X���P��ݒ肵�܂��B
     * 
     * @param capacityFrom
     *            �X���P
     */
    public void setCapacityFrom(String capacityFrom) {
        this.capacityFrom = capacityFrom;
    }

    /**
     * �X���Q��ݒ肵�܂��B
     * 
     * @param capacityTo
     *            �X���Q
     */
    public void setCapacityTo(String capacityTo) {
        this.capacityTo = capacityTo;
    }

    /**
     * �q���p�Q��R�����g��ݒ肵�܂��B
     * 
     * @param childBeddingCmt
     *            �q���p�Q��R�����g
     */
    public void setChildBeddingCmt(String childBeddingCmt) {
        this.childBeddingCmt = childBeddingCmt;
    }

    /**
     * �q���p�Q��L����ݒ肵�܂��B
     * 
     * @param childBeddingFlg
     *            �q���p�Q��L��
     */
    public void setChildBeddingFlg(String childBeddingFlg) {
        this.childBeddingFlg = childBeddingFlg;
    }

    /**
     * �����E�u���V�L����ݒ肵�܂��B
     * 
     * @param combFlg
     *            �����E�u���V�L��
     */
    public void setCombFlg(String combFlg) {
        this.combFlg = combFlg;
    }

    /**
     * �h���C���[�L����ݒ肵�܂��B
     * 
     * @param dryerFlg
     *            �h���C���[�L��
     */
    public void setDryerFlg(String dryerFlg) {
        this.dryerFlg = dryerFlg;
    }

    /**
     * �G�L�X�g���x�b�h�L����ݒ肵�܂��B
     * 
     * @param extraBedFlg
     *            �G�L�X�g���x�b�h�L��
     */
    public void setExtraBedFlg(String extraBedFlg) {
        this.extraBedFlg = extraBedFlg;
    }

    /**
     * �G�L�X�g���x�b�h�l����ݒ肵�܂��B
     * 
     * @param extraBedNum
     *            �G�L�X�g���x�b�h�l��
     */
    public void setExtraBedNum(String extraBedNum) {
        this.extraBedNum = extraBedNum;
    }

    /**
     * �G�L�X�g���x�b�h����ݒ肵�܂��B
     * 
     * @param extraBedWidth
     *            �G�L�X�g���x�b�h��
     */
    public void setExtraBedWidth(String extraBedWidth) {
        this.extraBedWidth = extraBedWidth;
    }

    /**
     * �{�݃R�[�h <Primary Key>��ݒ肵�܂��B
     * 
     * @param facilityCd
     *            �{�݃R�[�h <Primary Key>
     */
    @Override
    public void setFacilityCd(String facilityCd) {
        this.facilityCd = facilityCd;
    }

    /**
     * �{�݃p�^�[�� <Primary Key>��ݒ肵�܂��B
     * 
     * @param facilityPattern
     *            �{�݃p�^�[�� <Primary Key>
     */
    @Override
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * �K�w�w���ݒ肵�܂��B
     * 
     * @param floorAssign
     *            �K�w�w��
     */
    public void setFloorAssign(String floorAssign) {
        this.floorAssign = floorAssign;
    }

    /**
     * ��� <Primary Key>��ݒ肵�܂��B
     * 
     * @param kindFlg
     *            ��� <Primary Key>
     */
    @Override
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
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
     * �i�C�g�E�F�A�L����ݒ肵�܂��B
     * 
     * @param nightWearFlg
     *            �i�C�g�E�F�A�L��
     */
    public void setNightWearFlg(String nightWearFlg) {
        this.nightWearFlg = nightWearFlg;
    }

    /**
     * �p�W���}�L����ݒ肵�܂��B
     * 
     * @param pajamasFlg
     *            �p�W���}�L��
     */
    public void setPajamasFlg(String pajamasFlg) {
        this.pajamasFlg = pajamasFlg;
    }

    /**
     * �����^�C�v <Primary Key>��ݒ肵�܂��B
     * 
     * @param roomType
     *            �����^�C�v <Primary Key>
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    /**
     * �Z�[���X�|�C���g��ݒ肵�܂��B
     * 
     * @param salesPoint
     *            �Z�[���X�|�C���g
     */
    public void setSalesPoint(String salesPoint) {
        this.salesPoint = salesPoint;
    }

    /**
     * �V�����v�[�E�����X�L����ݒ肵�܂��B
     * 
     * @param shampooRinseFlg
     *            �V�����v�[�E�����X�L��
     */
    public void setShampooRinseFlg(String shampooRinseFlg) {
        this.shampooRinseFlg = shampooRinseFlg;
    }

    /**
     * �V�����[�u�[�X�L����ݒ肵�܂��B
     * 
     * @param showerBoothFlg
     *            �V�����[�u�[�X�L��
     */
    public void setShowerBoothFlg(String showerBoothFlg) {
        this.showerBoothFlg = showerBoothFlg;
    }

    /**
     * �V�����[�L���b�v�L����ݒ肵�܂��B
     * 
     * @param showerCapFlg
     *            �V�����[�L���b�v�L��
     */
    public void setShowerCapFlg(String showerCapFlg) {
        this.showerCapFlg = showerCapFlg;
    }

    /**
     * �\�t�@�[�x�b�h�L����ݒ肵�܂��B
     * 
     * @param sofaBedFlg
     *            �\�t�@�[�x�b�h�L��
     */
    public void setSofaBedFlg(String sofaBedFlg) {
        this.sofaBedFlg = sofaBedFlg;
    }

    /**
     * �\�t�@�[�x�b�h�l����ݒ肵�܂��B
     * 
     * @param sofaBedNum
     *            �\�t�@�[�x�b�h�l��
     */
    public void setSofaBedNum(String sofaBedNum) {
        this.sofaBedNum = sofaBedNum;
    }

    /**
     * �\�t�@�[�x�b�h����ݒ肵�܂��B
     * 
     * @param sofaBedWidth
     *            �\�t�@�[�x�b�h��
     */
    public void setSofaBedWidth(String sofaBedWidth) {
        this.sofaBedWidth = sofaBedWidth;
    }

    /**
     * �X�^�b�L���O�x�b�h�L����ݒ肵�܂��B
     * 
     * @param stackingBedFlg
     *            �X�^�b�L���O�x�b�h�L��
     */
    public void setStackingBedFlg(String stackingBedFlg) {
        this.stackingBedFlg = stackingBedFlg;
    }

    /**
     * �X�^�b�L���O�x�b�h�l����ݒ肵�܂��B
     * 
     * @param stackingBedNum
     *            �X�^�b�L���O�x�b�h�l��
     */
    public void setStackingBedNum(String stackingBedNum) {
        this.stackingBedNum = stackingBedNum;
    }

    /**
     * �X�^�b�L���O�x�b�h����ݒ肵�܂��B
     * 
     * @param stackingBedWidth
     *            �X�^�b�L���O�x�b�h��
     */
    public void setStackingBedWidth(String stackingBedWidth) {
        this.stackingBedWidth = stackingBedWidth;
    }

    /**
     * �l���敪��ݒ肵�܂��B
     * 
     * @param styleDiv
     *            �l���敪
     */
    public void setStyleDiv(String styleDiv) {
        this.styleDiv = styleDiv;
    }

    /**
     * �g�C���L����ݒ肵�܂��B
     * 
     * @param toiletFlg
     *            �g�C���L��
     */
    public void setToiletFlg(String toiletFlg) {
        this.toiletFlg = toiletFlg;
    }

    /**
     * ���]��ݒ肵�܂��B
     * 
     * @param viewCd
     *            ���]
     */
    public void setViewCd(String viewCd) {
        this.viewCd = viewCd;
    }

    /**
     * �E�H�V�����b�g�L����ݒ肵�܂��B
     * 
     * @param washletFlg
     *            �E�H�V�����b�g�L��
     */
    public void setWashletFlg(String washletFlg) {
        this.washletFlg = washletFlg;
    }

    /**
     * ���ʋ�L����ݒ肵�܂��B
     * 
     * @param washToolFlg
     *            ���ʋ�L��
     */
    public void setWashToolFlg(String washToolFlg) {
        this.washToolFlg = washToolFlg;
    }

    /**
     * �䂩���L����ݒ肵�܂��B
     * 
     * @param yukataFlg
     *            �䂩���L��
     */
    public void setYukataFlg(String yukataFlg) {
        this.yukataFlg = yukataFlg;
    }

}
