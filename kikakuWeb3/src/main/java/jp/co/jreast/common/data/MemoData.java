package jp.co.jreast.common.data;

/**
 * <pre>
 * 通信メモデータクラス。.
 * 機能概要    ：  通信メモデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/10/27
 */
public class MemoData extends PlanAnsBaseData{
	
	/**
	 * ユーザ区分.
	 */
	private Integer userDiv;
	
	/**
	 * シーケンス.
	 */
	private Integer sequence;
	
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
	 * 更新回答書Ｎｏ.
	 */
	private Integer updateAnsNo;

	/**
	 * @return Returns the memo.
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo The memo to set.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return Returns the memoRecorder.
	 */
	public String getMemoRecorder() {
		return memoRecorder;
	}

	/**
	 * @param memoRecorder The memoRecorder to set.
	 */
	public void setMemoRecorder(String memoRecorder) {
		this.memoRecorder = memoRecorder;
	}

	/**
	 * @return Returns the memoUpdateYmd.
	 */
	public String getMemoUpdateYmd() {
		return memoUpdateYmd;
	}

	/**
	 * @param memoUpdateYmd The memoUpdateYmd to set.
	 */
	public void setMemoUpdateYmd(String memoUpdateYmd) {
		this.memoUpdateYmd = memoUpdateYmd;
	}

	/**
	 * @return Returns the sequence.
	 */
	public Integer getSequence() {
		return sequence;
	}

	/**
	 * @param sequence The sequence to set.
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return Returns the updateAnsNo.
	 */
	public Integer getUpdateAnsNo() {
		return updateAnsNo;
	}

	/**
	 * @param updateAnsNo The updateAnsNo to set.
	 */
	public void setUpdateAnsNo(Integer updateAnsNo) {
		this.updateAnsNo = updateAnsNo;
	}

	/**
	 * @return Returns the userDiv.
	 */
	public Integer getUserDiv() {
		return userDiv;
	}

	/**
	 * @param userDiv The userDiv to set.
	 */
	public void setUserDiv(Integer userDiv) {
		this.userDiv = userDiv;
	}
	
	
}
