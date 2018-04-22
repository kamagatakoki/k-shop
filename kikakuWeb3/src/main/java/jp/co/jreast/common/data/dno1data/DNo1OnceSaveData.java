package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;

/**
 * <pre>
 * [DP/RM]NO1_セーブデータクラス。
 * 機能概要    ：  [DP/RM]NO1_セーブデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author hu hua
 * @version 0.1 2006/11/17
 */
public class DNo1OnceSaveData implements InData {

    /**
     * 関連チェックフラグ.
     */
    private int errorFlg;

    /**
     * No1業務データ.
     */
    private DNo1FormBean formBean;

    /**
     * No2画面コピーフラグ.
     */
    private AnsSearchData no2CopyData;

    /**
     * No3画面コピーフラグ.
     */
    private AnsSearchData no3CopyData;

    /**
     * No4画面コピーフラグ.
     */
    private AnsSearchData no4CopyData;

    /**
     * No5画面コピーフラグ.
     */
    private AnsSearchData no5CopyData;

    /**
     * @return errorFlg
     */
    public int getErrorFlg() {
        return errorFlg;
    }

    /**
     * @return the formBean
     */
    public final DNo1FormBean getFormBean() {
        return formBean;
    }

    /**
     * 種別を取得します。
     * 
     * @return 種別
     */
    public String getKindFlg() {
        return this.getFormBean().getAnsSearchData().getKindFlg();
    }

    /**
     * @return the no2CopyData
     */
    public final AnsSearchData getNo2CopyData() {
        return no2CopyData;
    }

    /**
     * @return the no3CopyData
     */
    public final AnsSearchData getNo3CopyData() {
        return no3CopyData;
    }

    /**
     * @return the no4CopyData
     */
    public final AnsSearchData getNo4CopyData() {
        return no4CopyData;
    }

    /**
     * @return the no5CopyData
     */
    public final AnsSearchData getNo5CopyData() {
        return no5CopyData;
    }

    /**
     * @param errorFlg
     *            the errorFlg to set
     */
    public void setErrorFlg(int errorFlg) {
        this.errorFlg = errorFlg;
    }

    /**
     * @param formBean
     *            the formBean to set
     */
    public final void setFormBean(final DNo1FormBean formBean) {
        this.formBean = formBean;
    }

    /**
     * @param no2CopyData
     *            the no2CopyData to set
     */
    public final void setNo2CopyData(final AnsSearchData no2CopyData) {
        this.no2CopyData = no2CopyData;
    }

    /**
     * @param no3CopyData
     *            the no3CopyData to set
     */
    public final void setNo3CopyData(final AnsSearchData no3CopyData) {
        this.no3CopyData = no3CopyData;
    }

    /**
     * @param no4CopyData
     *            the no4CopyData to set
     */
    public final void setNo4CopyData(final AnsSearchData no4CopyData) {
        this.no4CopyData = no4CopyData;
    }

    /**
     * @param no5CopyData
     *            the no5CopyData to set
     */
    public final void setNo5CopyData(final AnsSearchData no5CopyData) {
        this.no5CopyData = no5CopyData;
    }

}
