package jp.co.jreast.common.data.dno1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_JR�݌Ƀf�[�^�N���X�B.
 * �@�\�T�v    �F  NO1_JR�݌Ƀf�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public final class DNo1JrStockData extends PlanAnsBaseData {
    /**
     * �������.
     */
    private String buildKind;

    /**
     * ����P.
     */
    private String capacityFrom;

    /**
     * ����Q.
     */
    private String capacityTo;

    /**
     * ���^�C�v���������ۂ�
     */
    private boolean existRoomType;

    /**
     * ����於��
     */
    private String otherPlanNam;

    /**
     * �����^�C�v.
     */
    private Integer roomType;

    /**
     * �݌ɋ敪.
     */
    private Integer stockDiv;

    /**
     * �݌Ƀ^�C�v���.
     */
    private String stockType;

    /**
     * ���]�R�[�h.
     */
    private String viewCd;

    /**
     * �������.���擾���܂��B
     * 
     * @return �������.
     */
    public String getBuildKind() {
        return buildKind;
    }

    /**
     * ����P.���擾���܂��B
     * 
     * @return ����P.
     */
    public String getCapacityFrom() {
        return capacityFrom;
    }

    /**
     * ����Q.���擾���܂��B
     * 
     * @return ����Q.
     */
    public String getCapacityTo() {
        return capacityTo;
    }

    /**
     * ���^�C�v���������ۂ����擾���܂��B
     * @return ���^�C�v���������ۂ�
     */
    public boolean isExistRoomType() {
        return existRoomType;
    }

    /**
     * ���^�C�v���������ۂ���ݒ肵�܂��B
     * @param existRoomType ���^�C�v���������ۂ�
     */
    public void setExistRoomType(boolean existRoomType) {
        this.existRoomType = existRoomType;
    }

    /**
     * ����於�̂��擾���܂��B
     * 
     * @return ����於��
     */
    public String getOtherPlanNam() {
        return otherPlanNam;
    }

    /**
     * �����^�C�v.���擾���܂��B
     * 
     * @return �����^�C�v.
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * �݌ɋ敪.���擾���܂��B
     * 
     * @return �݌ɋ敪.
     */
    public Integer getStockDiv() {
        return stockDiv;
    }

    /**
     * �݌Ƀ^�C�v���.���擾���܂��B
     * 
     * @return �݌Ƀ^�C�v���.
     */
    public String getStockType() {
        return stockType;
    }

    /**
     * ���]�R�[�h.���擾���܂��B
     * 
     * @return ���]�R�[�h.
     */
    public String getViewCd() {
        return viewCd;
    }

    /**
     * �������.��ݒ肵�܂��B
     * 
     * @param buildKind
     *            �������.
     */
    public void setBuildKind(String buildKind) {
        this.buildKind = buildKind;
    }

    /**
     * ����P.��ݒ肵�܂��B
     * 
     * @param capacityFrom
     *            ����P.
     */
    public void setCapacityFrom(String capacityFrom) {
        this.capacityFrom = capacityFrom;
    }

    /**
     * ����Q.��ݒ肵�܂��B
     * 
     * @param capacityTo
     *            ����Q.
     */
    public void setCapacityTo(String capacityTo) {
        this.capacityTo = capacityTo;
    }

    /**
     * ����於�̂�ݒ肵�܂��B
     * 
     * @param otherPlanNam
     *            ����於��
     */
    public void setOtherPlanNam(String otherPlanNam) {
        this.otherPlanNam = otherPlanNam;
    }

    /**
     * �����^�C�v.��ݒ肵�܂��B
     * 
     * @param roomType
     *            �����^�C�v.
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    /**
     * �݌ɋ敪.��ݒ肵�܂��B
     * 
     * @param stockDiv
     *            �݌ɋ敪.
     */
    public void setStockDiv(Integer stockDiv) {
        this.stockDiv = stockDiv;
    }

    /**
     * �݌Ƀ^�C�v���.��ݒ肵�܂��B
     * 
     * @param stockType
     *            �݌Ƀ^�C�v���.
     */
    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    /**
     * ���]�R�[�h.��ݒ肵�܂��B
     * 
     * @param viewCd
     *            ���]�R�[�h.
     */
    public void setViewCd(String viewCd) {
        this.viewCd = viewCd;
    }

}
