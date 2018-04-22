package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * [DP/RM]通信メモデータクラス。．
 * 機能概要    ：  [DP/RM]通信メモデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public class DMemoData extends PlanAnsBaseData {

    /**
     * 回答書詳細チェック欄（責任者）
     */
    private String responsibler;
    
    /**
     * メモ.
     */
    private String memo;

    /**
     * メモ記入者.
     */
    private String memoRecorder;

    /**
     * メモ記入日.
     */
    private String memoUpdateYmd;

    /**
     * シーケンス.
     */
    private Integer sequence;

    /**
     * 更新回答書Ｎｏ.
     */
    private Integer updateAnsNo;

    /**
     * ユーザ区分.
     */
    private Integer userDiv;

    /**
     * ユーザーID.
     */
    private String userId;

    /**
     * ユーザー名称.
     */
    private String userNm;

    /**
     * 回答書詳細チェック欄（責任者）を取得します。
     * @return 回答書詳細チェック欄（責任者）
     */
    public String getResponsibler() {
        return responsibler;
    }

    /**
     * 回答書詳細チェック欄（責任者）を設定します。
     * @param responsibler 回答書詳細チェック欄（責任者）
     */
    public void setResponsibler(String responsibler) {
        this.responsibler = responsibler;
    }

    /**
     * @return Returns the memo.
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @return Returns the memoRecorder.
     */
    public String getMemoRecorder() {
        return memoRecorder;
    }

    /**
     * @return Returns the memoUpdateYmd.
     */
    public String getMemoUpdateYmd() {
        return memoUpdateYmd;
    }

    /**
     * @return Returns the sequence.
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * @return Returns the updateAnsNo.
     */
    public Integer getUpdateAnsNo() {
        return updateAnsNo;
    }

    /**
     * @return Returns the userDiv.
     */
    public Integer getUserDiv() {
        return userDiv;
    }

    /**
     * ユーザーID.を取得します。
     * 
     * @return ユーザーID.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザー名称.を取得します。
     * 
     * @return ユーザー名称.
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * @param memo
     *            The memo to set.
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @param memoRecorder
     *            The memoRecorder to set.
     */
    public void setMemoRecorder(String memoRecorder) {
        this.memoRecorder = memoRecorder;
    }

    /**
     * @param memoUpdateYmd
     *            The memoUpdateYmd to set.
     */
    public void setMemoUpdateYmd(String memoUpdateYmd) {
        this.memoUpdateYmd = memoUpdateYmd;
    }

    /**
     * @param sequence
     *            The sequence to set.
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * @param updateAnsNo
     *            The updateAnsNo to set.
     */
    public void setUpdateAnsNo(Integer updateAnsNo) {
        this.updateAnsNo = updateAnsNo;
    }

    /**
     * @param userDiv
     *            The userDiv to set.
     */
    public void setUserDiv(Integer userDiv) {
        this.userDiv = userDiv;
    }

    /**
     * ユーザーID.を設定します。
     * 
     * @param userId
     *            ユーザーID.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ユーザー名称.を設定します。
     * 
     * @param userNm
     *            ユーザー名称.
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

}
