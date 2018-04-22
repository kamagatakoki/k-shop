package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * �������f�[�^�N���X�B.
 * �@�\�T�v    �F  �������f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public class DNo1ChargeInfoData extends PlanAnsBaseData {

    /**
     * ��������
     */
    private String arrivalTime;

    /**
     * �������ԁi���j
     */
    private String arrivalTimeH;

    /**
     * �������ԁi���j
     */
    private String arrivalTimeM;

    /**
     * �}��.
     */
    private String branchNo;

    /**
     * �����^�J�[�N���X
     */
    private String carClass;

    /**
     * �����V�[�P���X.
     */
    private Integer chargeSequence;

    /**
     * �D�ԓ��e�敪.
     */
    private String contentDiv;

    /**
     * ���e������i�i�J�i�j.
     */
    private String contentExplain1Kana;

    /**
     * ���e������i�i�����j.
     */
    private String contentExplain1Kanji;

    /**
     * ���e�������i�i�J�i�j.
     */
    private String contentExplain2Kana;

    /**
     * ���e�������i�i�����j.
     */
    private String contentExplain2Kanji;

    /**
     * �ό��R�[�X����(�J�i�j .
     */
    private String courseNmKana;

    /**
     * �ό��R�[�X���́i�����j.
     */
    private String courseNmKanji;

    /**
     * �o������
     */
    private String departureTime;

    /**
     * �o�����ԁi���j
     */
    private String departureTimeH;

    /**
     * �o�����ԁi���j
     */
    private String departureTimeM;

    /**
     * ���̂̊����E�񊈐�
     */
    private Boolean disabledNm;

    /**
     * �єԃt���O .
     */
    private boolean isSaiban;

    /**
     * ���ʔ�.
     */
    private String planNo;

    /**
     * �݌ɔԍ� .
     */
    private String stockNo;

    /**
     * �o�E�`���[���ē����i�����j
     */
    private String voucherIntroKanji;

    /**
     * �������Ԃ��擾���܂��B
     * 
     * @return ��������
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * �������ԁi���j���擾���܂��B
     * 
     * @return �������ԁi���j
     */
    public String getArrivalTimeH() {
        return arrivalTimeH;
    }

    /**
     * �������ԁi���j���擾���܂��B
     * 
     * @return �������ԁi���j
     */
    public String getArrivalTimeM() {
        return arrivalTimeM;
    }

    /**
     * @return Returns the branchNo.
     */
    public String getBranchNo() {
        return branchNo;
    }

    /**
     * �����^�J�[�N���X���擾���܂��B
     * 
     * @return �����^�J�[�N���X
     */
    public String getCarClass() {
        return carClass;
    }

    /**
     * . �w��ʒu�ɕ������擾����B
     * 
     * @param pos
     *            �ʒu
     * @param str
     *            ���͕�����
     * @return �w�肷�镶��
     */
    private String getCharAt(String str, int pos) {

        if (StringUtil.isEmpty(str)) {
            return "";
        }
        return "" + str.charAt(pos - 1);
    }

    /**
     * @return Returns the chargeSequence.
     */
    public Integer getChargeSequence() {
        return chargeSequence;
    }

    /**
     * @param i
     *            .
     * @return ���ʔԁi�����{�j����
     */
    public String getCharOfPlanNo(int i) {
        return getCharAt(planNo, i);
    }

    /**
     * @return Returns the contentDiv.
     */
    public String getContentDiv() {
        return contentDiv;
    }

    /**
     * @return Returns the contentExplain1Kana.
     */
    public String getContentExplain1Kana() {
        if (contentExplain1Kana == null) {
            return "";
        }
        return contentExplain1Kana;
    }

    /**
     * @return Returns the contentExplain1Kanji.
     */
    public String getContentExplain1Kanji() {
        if (contentExplain1Kanji == null) {
            return "";
        }
        return contentExplain1Kanji;
    }

    /**
     * @return Returns the contentExplain2Kana.
     */
    public String getContentExplain2Kana() {
        if (contentExplain2Kana == null) {
            return "";
        }
        return contentExplain2Kana;
    }

    /**
     * @return Returns the contentExplain2Kanji.
     */
    public String getContentExplain2Kanji() {
        if (contentExplain2Kanji == null) {
            return "";
        }
        return contentExplain2Kanji;
    }

    /**
     * @return Returns the courseNmKana.
     */
    public String getCourseNmKana() {
        if (courseNmKana == null) {
            return "";
        }
        return courseNmKana;
    }

    /**
     * @return Returns the courseNmKanji.
     */
    public String getCourseNmKanji() {
        if (courseNmKanji == null) {
            return "";
        }
        return courseNmKanji;
    }

    /**
     * �o�����Ԃ��擾���܂��B
     * 
     * @return �o������
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * �o�����ԁi���j���擾���܂��B
     * 
     * @return �o�����ԁi���j
     */
    public String getDepartureTimeH() {
        return departureTimeH;
    }

    /**
     * �o�����ԁi���j���擾���܂��B
     * 
     * @return �o�����ԁi���j
     */
    public String getDepartureTimeM() {
        return departureTimeM;
    }

    /**
     * ���̂̊����E�񊈐����擾���܂��B
     * 
     * @return ���̂̊����E�񊈐�
     */
    public Boolean getDisabledNm() {
        return disabledNm;
    }

    /**
     * @return Returns the isSaiban.
     */
    public boolean getIsSaiban() {
        return isSaiban;
    }

    /**
     * @return Returns the planNo.
     */
    public String getPlanNo() {
        return planNo;
    }

    /**
     * @return Returns the stockNo.
     */
    public String getStockNo() {
        return stockNo;
    }

    /**
     * �o�E�`���[���ē����i�����j���擾���܂��B
     * 
     * @return �o�E�`���[���ē����i�����j
     */
    public String getVoucherIntroKanji() {
        return voucherIntroKanji;
    }

    /**
     * �������Ԃ�ݒ肵�܂��B
     * 
     * @param arrivalTime
     *            ��������
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * �������ԁi���j��ݒ肵�܂��B
     * 
     * @param arrivalTimeH
     *            �������ԁi���j
     */
    public void setArrivalTimeH(String arrivalTimeH) {
        this.arrivalTimeH = arrivalTimeH;
    }

    /**
     * �������ԁi���j��ݒ肵�܂��B
     * 
     * @param arrivalTimeM
     *            �������ԁi���j
     */
    public void setArrivalTimeM(String arrivalTimeM) {
        this.arrivalTimeM = arrivalTimeM;
    }

    /**
     * @param branchNo
     *            The branchNo to set.
     */
    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    /**
     * �����^�J�[�N���X��ݒ肵�܂��B
     * 
     * @param carClass
     *            �����^�J�[�N���X
     */
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    /**
     * @param chargeSequence
     *            The chargeSequence to set.
     */
    public void setChargeSequence(Integer chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    /**
     * @param contentDiv
     *            The contentDiv to set.
     */
    public void setContentDiv(String contentDiv) {
        this.contentDiv = contentDiv;
    }

    /**
     * @param contentExplain1Kana
     *            The contentExplain1Kana to set.
     */
    public void setContentExplain1Kana(String contentExplain1Kana) {
        this.contentExplain1Kana = contentExplain1Kana;
    }

    /**
     * @param contentExplain1Kanji
     *            The contentExplain1Kanji to set.
     */
    public void setContentExplain1Kanji(String contentExplain1Kanji) {
        this.contentExplain1Kanji = contentExplain1Kanji;
    }

    /**
     * @param contentExplain2Kana
     *            The contentExplain2Kana to set.
     */
    public void setContentExplain2Kana(String contentExplain2Kana) {

        this.contentExplain2Kana = contentExplain2Kana;
    }

    /**
     * @param contentExplain2Kanji
     *            The contentExplain2Kanji to set.
     */
    public void setContentExplain2Kanji(String contentExplain2Kanji) {
        this.contentExplain2Kanji = contentExplain2Kanji;
    }

    /**
     * @param courseNmKana
     *            The courseNmKana to set.
     */
    public void setCourseNmKana(String courseNmKana) {
        this.courseNmKana = courseNmKana;
    }

    /**
     * @param courseNmKanji
     *            The courseNmKanji to set.
     */
    public void setCourseNmKanji(String courseNmKanji) {
        this.courseNmKanji = courseNmKanji;
    }

    /**
     * �o�����Ԃ�ݒ肵�܂��B
     * 
     * @param departureTime
     *            �o������
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * �o�����ԁi���j��ݒ肵�܂��B
     * 
     * @param departureTimeH
     *            �o�����ԁi���j
     */
    public void setDepartureTimeH(String departureTimeH) {
        this.departureTimeH = departureTimeH;
    }

    /**
     * �o�����ԁi���j��ݒ肵�܂��B
     * 
     * @param departureTimeM
     *            �o�����ԁi���j
     */
    public void setDepartureTimeM(String departureTimeM) {
        this.departureTimeM = departureTimeM;
    }

    /**
     * ���̂̊����E�񊈐���ݒ肵�܂��B
     * 
     * @param disabledNm
     *            ���̂̊����E�񊈐�
     */
    public void setDisabledNm(Boolean disabledNm) {
        this.disabledNm = disabledNm;
    }

    /**
     * @param isSaiban
     *            The isSaiban to set.
     */
    public void setIsSaiban(boolean isSaiban) {
        this.isSaiban = isSaiban;
    }

    /**
     * @param planNo
     *            The planNo to set.
     */
    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    /**
     * @param stockNo
     *            The stockNo to set.
     */
    public void setStockNo(String stockNo) {
        this.stockNo = stockNo;
    }

    /**
     * �o�E�`���[���ē����i�����j��ݒ肵�܂��B
     * 
     * @param voucherIntroKanji
     *            �o�E�`���[���ē����i�����j
     */
    public void setVoucherIntroKanji(String voucherIntroKanji) {
        this.voucherIntroKanji = voucherIntroKanji;
    }

}
