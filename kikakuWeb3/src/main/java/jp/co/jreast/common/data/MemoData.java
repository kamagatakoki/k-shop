package jp.co.jreast.common.data;

/**
 * <pre>
 * �ʐM�����f�[�^�N���X�B.
 * �@�\�T�v    �F  �ʐM�����f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/10/27
 */
public class MemoData extends PlanAnsBaseData{
	
	/**
	 * ���[�U�敪.
	 */
	private Integer userDiv;
	
	/**
	 * �V�[�P���X.
	 */
	private Integer sequence;
	
	/**
	 * ����.
	 */
	private String memo;
	
	/**
	 * �����L����.
	 */
	private String memoRecorder;
	
	/**
	 * �����L����.
	 */
	private String memoUpdateYmd;
	
	/**
	 * �X�V�񓚏��m��.
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
