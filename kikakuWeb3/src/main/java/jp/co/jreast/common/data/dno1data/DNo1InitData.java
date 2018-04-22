package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.SpoorParamter;

/**
 * <pre>
 * NO1�������f�[�^�N���X�B.
 * �@�\�T�v    �F  NO1�������f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author jinhuashi
 * @version 0.1 2006/11/17
 */
public class DNo1InitData implements InData, SpoorParamter {

    /**
     * �{���f�[�^.
     */
    private AnsSearchData ansSearchData;

    /**
     * �R�s����t���O .
     */
    private Boolean isCopyFlg = Boolean.FALSE;

    /**
     * �֎�����t���O.
     */
    private Boolean isDisplayFlg = Boolean.FALSE;

    /**
     * JR�o�^�҂�.
     */
    private Boolean isJR;

    /**
     * ���[�U�敪.
     */
    private String userDiv;

    /**
     * �R���X�g���N�^.
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
     * @return �\������t���O
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
     *            �\������t���O
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
