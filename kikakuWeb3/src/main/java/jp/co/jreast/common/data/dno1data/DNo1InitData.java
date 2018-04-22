package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.SpoorParamter;

/**
 * <pre>
 * NO1初期化データクラス。.
 * 機能概要    ：  NO1初期化データを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author jinhuashi
 * @version 0.1 2006/11/17
 */
public class DNo1InitData implements InData, SpoorParamter {

    /**
     * 捜索データ.
     */
    private AnsSearchData ansSearchData;

    /**
     * コピするフラグ .
     */
    private Boolean isCopyFlg = Boolean.FALSE;

    /**
     * 誇示するフラグ.
     */
    private Boolean isDisplayFlg = Boolean.FALSE;

    /**
     * JR登録者か.
     */
    private Boolean isJR;

    /**
     * ユーザ区分.
     */
    private String userDiv;

    /**
     * コンストラクタ.
     */
    public DNo1InitData() {
        ansSearchData = new AnsSearchData();
    }

    /**
     * @return searchData
     */
    @Override
    public AnsSearchData getAnsSearchData() {
        return ansSearchData;
    }

    /**
     * @return Returns the isCopyFlg.
     */
    public Boolean getIsCopyFlg() {
        return isCopyFlg;
    }

    /**
     * @return 表示するフラグ
     */
    public Boolean getIsDisplayFlg() {
        return isDisplayFlg;
    }

    /**
     * @return user
     */
    @Override
    public Boolean getIsJR() {
        return isJR;
    }

    /**
     * @return Returns the userDiv.
     */
    public String getUserDiv() {
        return userDiv;
    }

    /**
     * @param searchData
     *            searchData
     */
    @Override
    public void setAnsSearchData(AnsSearchData searchData) {
        this.ansSearchData = searchData;
    }

    /**
     * @param isCopyFlg
     *            The isCopyFlg to set.
     */
    public void setIsCopyFlg(Boolean isCopyFlg) {
        this.isCopyFlg = isCopyFlg;
    }

    /**
     * @param isDisplayFlg
     *            表示するフラグ
     */
    public void setIsDisplayFlg(Boolean isDisplayFlg) {
        this.isDisplayFlg = isDisplayFlg;
    }

    /**
     * @param isJR
     *            isJR
     */
    @Override
    public void setIsJR(boolean isJR) {
        this.isJR = new Boolean(isJR);
    }

    /**
     * @param userDiv
     *            The userDiv to set.
     */
    public void setUserDiv(String userDiv) {
        this.userDiv = userDiv;
    }

}
