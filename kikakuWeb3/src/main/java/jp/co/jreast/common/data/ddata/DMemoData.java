package jp.co.jreast.common.data.ddata;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * [DP/RM]�ʐM�����f�[�^�N���X�B�D
 * �@�\�T�v    �F  [DP/RM]�ʐM�����f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 */
public class DMemoData extends PlanAnsBaseData {

    /**
     * �񓚏��ڍ׃`�F�b�N���i�ӔC�ҁj
     */
    private String responsibler;
    
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
     * �V�[�P���X.
     */
    private Integer sequence;

    /**
     * �X�V�񓚏��m��.
     */
    private Integer updateAnsNo;

    /**
     * ���[�U�敪.
     */
    private Integer userDiv;

    /**
     * ���[�U�[ID.
     */
    private String userId;

    /**
     * ���[�U�[����.
     */
    private String userNm;

    /**
     * �񓚏��ڍ׃`�F�b�N���i�ӔC�ҁj���擾���܂��B
     * @return �񓚏��ڍ׃`�F�b�N���i�ӔC�ҁj
     */
    public String getResponsibler() {
        return responsibler;
    }

    /**
     * �񓚏��ڍ׃`�F�b�N���i�ӔC�ҁj��ݒ肵�܂��B
     * @param responsibler �񓚏��ڍ׃`�F�b�N���i�ӔC�ҁj
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
     * ���[�U�[ID.���擾���܂��B
     * 
     * @return ���[�U�[ID.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ���[�U�[����.���擾���܂��B
     * 
     * @return ���[�U�[����.
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
     * ���[�U�[ID.��ݒ肵�܂��B
     * 
     * @param userId
     *            ���[�U�[ID.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ���[�U�[����.��ݒ肵�܂��B
     * 
     * @param userNm
     *            ���[�U�[����.
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

}
