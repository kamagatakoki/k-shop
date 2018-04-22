package jp.co.jreast.common.data.ddata;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.co.jreast.common.DJreConstants;

/**
 * <pre>
 * [DP/RM]�{�ݕt�я��_���F�󋵃N���X
 * �@�\�T�v �F[DP/RM]�{�ݕt�я��_���F�󋵂��i�[����
 * ���L���� �F
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class FacilityAckStatusData {

    /**
     * ���F���t
     */
    private Date ackDate;

    /**
     * ����ԍ�
     */
    private Integer careerNo;

    /**
     * �{�݃R�[�h
     */
    private String facilityCd;

    /**
     * �{�݃p�^�[��
     */
    private String facilityPattern;

    /**
     * �{�ݕt�ю��
     */
    private String facilitySorts;

    /**
     * ���
     */
    private String kindFlg;

    /**
     * �ӔC��
     */
    private String responsibler;

    /**
     * �V�[�P���X
     */
    private Integer sequence;

    /**
     * �S����
     */
    private String tantousya;

    /**
     * ���[�U�敪
     */
    private Integer userDiv;

    /**
     * ���F���t���擾���܂��B
     * 
     * @return ���F���t
     */
    public Date getAckDate() {
        return ackDate;
    }

    /**
     * ���F���t���擾���܂��B
     * 
     * @return ���F���t
     */
    public String getAckDateStr() {
        if (ackDate == null) {
            return "";
        }
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return format.format(ackDate);
    }

    /**
     * ����ԍ����擾���܂��B
     * 
     * @return ����ԍ�
     */
    public Integer getCareerNo() {
        return careerNo;
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
     * �{�݃p�^�[�����擾���܂��B
     * 
     * @return �{�݃p�^�[��
     */
    public String getFacilityPattern() {
        return facilityPattern;
    }

    /**
     * �{�ݕt�ю�ނ��擾���܂��B
     * 
     * @return �{�ݕt�ю��
     */
    public String getFacilitySorts() {
        return facilitySorts;
    }

    /**
     * ��ʂ��擾���܂��B
     * 
     * @return ���
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * �ӔC�҂��擾���܂��B
     * 
     * @return �ӔC��
     */
    public String getResponsibler() {
        return responsibler;
    }

    /**
     * �V�[�P���X���擾���܂��B
     * 
     * @return �V�[�P���X
     */
    public Integer getSequence() {
        return sequence;
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
     * ���[�U�敪���擾���܂��B
     * 
     * @return ���[�U�敪
     */
    public Integer getUserDiv() {
        return userDiv;
    }

    /**
     * ���F���t��ݒ肵�܂��B
     * 
     * @param ackDate
     *            ���F���t
     */
    public void setAckDate(Date ackDate) {
        this.ackDate = ackDate;
    }

    /**
     * ���F���t��ݒ肵�܂��B
     * 
     * @param ackDate
     *            ���F���t
     */
    public void setAckDateStr(final String ackDate) {
        DateFormat format = new SimpleDateFormat(
                DJreConstants.DATE_FORMAT_YYYYMMDDHHMMSS);
        try {
            this.ackDate = format.parse(ackDate);
        } catch (ParseException e) {

        }
    }

    /**
     * ����ԍ���ݒ肵�܂��B
     * 
     * @param careerNo
     *            ����ԍ�
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
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
     * �{�݃p�^�[����ݒ肵�܂��B
     * 
     * @param facilityPattern
     *            �{�݃p�^�[��
     */
    public void setFacilityPattern(String facilityPattern) {
        this.facilityPattern = facilityPattern;
    }

    /**
     * �{�ݕt�ю�ނ�ݒ肵�܂��B
     * 
     * @param facilitySorts
     *            �{�ݕt�ю��
     */
    public void setFacilitySorts(String facilitySorts) {
        this.facilitySorts = facilitySorts;
    }

    /**
     * ��ʂ�ݒ肵�܂��B
     * 
     * @param kindFlg
     *            ���
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * �ӔC�҂�ݒ肵�܂��B
     * 
     * @param responsibler
     *            �ӔC��
     */
    public void setResponsibler(String responsibler) {
        this.responsibler = responsibler;
    }

    /**
     * �V�[�P���X��ݒ肵�܂��B
     * 
     * @param sequence
     *            �V�[�P���X
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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
     * ���[�U�敪��ݒ肵�܂��B
     * 
     * @param userDiv
     *            ���[�U�敪
     */
    public void setUserDiv(Integer userDiv) {
        this.userDiv = userDiv;
    }

}
