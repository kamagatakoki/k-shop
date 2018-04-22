package jp.co.jreast.ur00400.data;

import java.util.ArrayList;
import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;

/**
 * 画面表示するとき使うデータクラス。.
 * 
 * <pre>
 *  機能概要　：画面表示するとき使うデータクラス .
 *  特記事項　：なし
 * </pre>
 * 
 * @author 忻兆君
 */
public class UR00400ListData implements InData, OutData {

    /**
     * 検索結果が100件超えるフラグ .
     */
    private boolean exceedFlag = true;

    /**
     * 画面のリストデータ .
     */
    List list = new ArrayList();

    /**
     * 画面のリストデータ .
     */
    List listCmt = new ArrayList();

    /**
     * 送信コメントデータ .
     */
    private SendCmtData sendCmtData;

    /**
     * 送信コメントテンプレートデータ .
     */
    private SendCmtTmplData sendCmtTmplData;

    /**
     * ユーザID .
     */
    private String userId;

    /**
     * コンストラクター
     * 　データ初期化する .
     */
    public UR00400ListData() {
        sendCmtData = new SendCmtData();
        sendCmtTmplData = new SendCmtTmplData();
    }

    /**
     * @return 送信コメント
     */
    public String getCmtTmpl() {
        return sendCmtData.getCmtTmpl();
    }

    /**
     * @return 検索結果が100件超えるフラグ
     */
    public boolean getExceedFlag() {
        return exceedFlag;
    }

    /**
     * @return 画面のリストデータ
     */
    public List getList() {
        return list;
    }

    /**
     * @return 画面のリストデータ .
     */
    public List getListCmt() {
        return listCmt;
    }

    /**
     * @return 送信コメントデータ
     */
    public SendCmtData getSendCmtData() {
        return sendCmtData;
    }

    /**
     * @return 送信コメントテンプレートデータ .
     */
    public SendCmtTmplData getSendCmtTmplData() {
        return sendCmtTmplData;
    }

    /**
     * @return Returns the userId.
     */
    public String getUserId() {
        return userId.toLowerCase();
    }

    /**
     * @return 検索結果が100件超えるフラグ
     */
    public boolean isExceedFlag() {
        return exceedFlag;
    }

    /**
     * @param planAnsNo
     *            企画回答連番
     */
    public void setCmtPlanAnsNo(Long planAnsNo) {
        sendCmtData.setPlanAnsNo(planAnsNo);
    }

    /**
     * @param cmtTmpl
     *            送信コメント
     */
    public void setCmtTmpl(String cmtTmpl) {
        sendCmtData.setCmtTmpl(cmtTmpl);
        sendCmtTmplData.setCmtTmpl(cmtTmpl);
    }

    /**
     * @param exceedFlag
     *            検索結果が100件超えるフラグ
     */
    public void setExceedFlag(boolean exceedFlag) {
        this.exceedFlag = exceedFlag;
    }

    /**
     * @param list
     *            画面のリストデータ
     */
    public void setList(List list) {
        this.list = list;
    }

    /**
     * @param listCmt
     *            画面のリストデータ .
     */
    public void setListCmt(List listCmt) {
        this.listCmt = listCmt;
    }

    /**
     * 　
     * 
     * @param sendCmtData
     *            送信コメントデータ
     */
    public void setSendCmtData(SendCmtData sendCmtData) {
        this.sendCmtData = sendCmtData;
    }

    /**
     * @param sendCmtTmplData
     *            送信コメントテンプレートデータ .
     */
    public void setSendCmtTmplData(SendCmtTmplData sendCmtTmplData) {
        this.sendCmtTmplData = sendCmtTmplData;
    }

    /**
     * @param userId
     *            The userId to set.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
