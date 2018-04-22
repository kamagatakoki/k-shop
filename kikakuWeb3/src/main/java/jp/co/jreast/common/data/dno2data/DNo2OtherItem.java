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
     * 特典特記事項1
     */
    private String specialRecoItem1;

    /**
     * 特典特記事項2
     */
    private String specialRecoItem2;

    /**
     * 特典特記事項3
     */
    private String specialRecoItem3;

    /**
     * 特典特記事項4
     */
    private String specialRecoItem4;

    /**
     * 特典特記事項5
     */
    private String specialRecoItem5;

    /**
     * 特典特記事項1を取得します。
     * 
     * @return 特典特記事項1
     */
    public String getSpecialRecoItem1() {
        return specialRecoItem1;
    }

    /**
     * 特典特記事項2を取得します。
     * 
     * @return 特典特記事項2
     */
    public String getSpecialRecoItem2() {
        return specialRecoItem2;
    }

    /**
     * 特典特記事項3を取得します。
     * 
     * @return 特典特記事項3
     */
    public String getSpecialRecoItem3() {
        return specialRecoItem3;
    }

    /**
     * 特典特記事項4を取得します。
     * 
     * @return 特典特記事項4
     */
    public String getSpecialRecoItem4() {
        return specialRecoItem4;
    }

    /**
     * 特典特記事項5を取得します。
     * 
     * @return 特典特記事項5
     */
    public String getSpecialRecoItem5() {
        return specialRecoItem5;
    }

    /**
     * 特典特記事項を設定します。
     * 
     * @param specialRecoItem
     *            特典特記事項
     */
    @Override
    public void setSpecialRecoItem(String specialRecoItem) {
        super.setSpecialRecoItem(specialRecoItem);

        if (!StringUtils.isBlank(specialRecoItem)) {
            // 特記事項は5行に分割され、改行で登録されている。
            // 本来はエンティティで行うべき?
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
     * 特典特記事項1を設定します。
     * 
     * @param specialRecoItem1
     *            特典特記事項1
     */
    public void setSpecialRecoItem1(String specialRecoItem1) {
        this.specialRecoItem1 = specialRecoItem1;
    }

    /**
     * 特典特記事項2を設定します。
     * 
     * @param specialRecoItem2
     *            特典特記事項2
     */
    public void setSpecialRecoItem2(String specialRecoItem2) {
        this.specialRecoItem2 = specialRecoItem2;
    }

    /**
     * 特典特記事項3を設定します。
     * 
     * @param specialRecoItem3
     *            特典特記事項3
     */
    public void setSpecialRecoItem3(String specialRecoItem3) {
        this.specialRecoItem3 = specialRecoItem3;
    }

    /**
     * 特典特記事項4を設定します。
     * 
     * @param specialRecoItem4
     *            特典特記事項4
     */
    public void setSpecialRecoItem4(String specialRecoItem4) {
        this.specialRecoItem4 = specialRecoItem4;
    }

    /**
     * 特典特記事項5を設定します。
     * 
     * @param specialRecoItem5
     *            特典特記事項5
     */
    public void setSpecialRecoItem5(String specialRecoItem5) {
        this.specialRecoItem5 = specialRecoItem5;
    }

}
