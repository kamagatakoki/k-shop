package jp.co.jreast.common.data.dno2data;

import jp.co.jreast.common.data.ddata.DNo3OtherItem;

import org.apache.commons.lang3.StringUtils;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 29 17:36:29 JST 2014
 */

/**
 * DNo2OtherItem.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/29 keiken Generated.
 */
public class DNo2OtherItem extends DNo3OtherItem {

    /**
     * ���T���L����1
     */
    private String specialRecoItem1;

    /**
     * ���T���L����2
     */
    private String specialRecoItem2;

    /**
     * ���T���L����3
     */
    private String specialRecoItem3;

    /**
     * ���T���L����4
     */
    private String specialRecoItem4;

    /**
     * ���T���L����5
     */
    private String specialRecoItem5;

    /**
     * ���T���L����1���擾���܂��B
     * 
     * @return ���T���L����1
     */
    public String getSpecialRecoItem1() {
        return specialRecoItem1;
    }

    /**
     * ���T���L����2���擾���܂��B
     * 
     * @return ���T���L����2
     */
    public String getSpecialRecoItem2() {
        return specialRecoItem2;
    }

    /**
     * ���T���L����3���擾���܂��B
     * 
     * @return ���T���L����3
     */
    public String getSpecialRecoItem3() {
        return specialRecoItem3;
    }

    /**
     * ���T���L����4���擾���܂��B
     * 
     * @return ���T���L����4
     */
    public String getSpecialRecoItem4() {
        return specialRecoItem4;
    }

    /**
     * ���T���L����5���擾���܂��B
     * 
     * @return ���T���L����5
     */
    public String getSpecialRecoItem5() {
        return specialRecoItem5;
    }

    /**
     * ���T���L������ݒ肵�܂��B
     * 
     * @param specialRecoItem
     *            ���T���L����
     */
    @Override
    public void setSpecialRecoItem(String specialRecoItem) {
        super.setSpecialRecoItem(specialRecoItem);

        if (!StringUtils.isBlank(specialRecoItem)) {
            // ���L������5�s�ɕ�������A���s�œo�^����Ă���B
            // �{���̓G���e�B�e�B�ōs���ׂ�?
            String[] strArr = new String[5];
            if (!StringUtils.isBlank(specialRecoItem)) {
                strArr = specialRecoItem.replaceAll("\n", " ").split("\r");
            } else {
                for (int i = 0; i < strArr.length - 1; i++) {
                    strArr[i + 1] = "";
                }
            }

            this.specialRecoItem1 = strArr[0];
            this.specialRecoItem2 = strArr[1].replaceFirst(" ", "");
            this.specialRecoItem3 = strArr[2].replaceFirst(" ", "");
            this.specialRecoItem4 = strArr[3].replaceFirst(" ", "");
            this.specialRecoItem5 = strArr[4].replaceFirst(" ", "");
        }
    }

    /**
     * ���T���L����1��ݒ肵�܂��B
     * 
     * @param specialRecoItem1
     *            ���T���L����1
     */
    public void setSpecialRecoItem1(String specialRecoItem1) {
        this.specialRecoItem1 = specialRecoItem1;
    }

    /**
     * ���T���L����2��ݒ肵�܂��B
     * 
     * @param specialRecoItem2
     *            ���T���L����2
     */
    public void setSpecialRecoItem2(String specialRecoItem2) {
        this.specialRecoItem2 = specialRecoItem2;
    }

    /**
     * ���T���L����3��ݒ肵�܂��B
     * 
     * @param specialRecoItem3
     *            ���T���L����3
     */
    public void setSpecialRecoItem3(String specialRecoItem3) {
        this.specialRecoItem3 = specialRecoItem3;
    }

    /**
     * ���T���L����4��ݒ肵�܂��B
     * 
     * @param specialRecoItem4
     *            ���T���L����4
     */
    public void setSpecialRecoItem4(String specialRecoItem4) {
        this.specialRecoItem4 = specialRecoItem4;
    }

    /**
     * ���T���L����5��ݒ肵�܂��B
     * 
     * @param specialRecoItem5
     *            ���T���L����5
     */
    public void setSpecialRecoItem5(String specialRecoItem5) {
        this.specialRecoItem5 = specialRecoItem5;
    }

}
