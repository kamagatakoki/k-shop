package jp.co.jreast.ur00400.data;

import java.util.ArrayList;
import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;

/**
 * ��ʕ\������Ƃ��g���f�[�^�N���X�B.
 * 
 * <pre>
 *  �@�\�T�v�@�F��ʕ\������Ƃ��g���f�[�^�N���X .
 *  ���L�����@�F�Ȃ�
 * </pre>
 * 
 * @author �v���N
 */
public class UR00400ListData implements InData, OutData {

    /**
     * �������ʂ�100��������t���O .
     */
    private boolean exceedFlag = true;

    /**
     * ��ʂ̃��X�g�f�[�^ .
     */
    List list = new ArrayList();

    /**
     * ��ʂ̃��X�g�f�[�^ .
     */
    List listCmt = new ArrayList();

    /**
     * ���M�R�����g�f�[�^ .
     */
    private SendCmtData sendCmtData;

    /**
     * ���M�R�����g�e���v���[�g�f�[�^ .
     */
    private SendCmtTmplData sendCmtTmplData;

    /**
     * ���[�UID .
     */
    private String userId;

    /**
     * �R���X�g���N�^�[
     * �@�f�[�^���������� .
     */
    public UR00400ListData() {
        sendCmtData = new SendCmtData();
        sendCmtTmplData = new SendCmtTmplData();
    }

    /**
     * @return ���M�R�����g
     */
    public String getCmtTmpl() {
        return sendCmtData.getCmtTmpl();
    }

    /**
     * @return �������ʂ�100��������t���O
     */
    public boolean getExceedFlag() {
        return exceedFlag;
    }

    /**
     * @return ��ʂ̃��X�g�f�[�^
     */
    public List getList() {
        return list;
    }

    /**
     * @return ��ʂ̃��X�g�f�[�^ .
     */
    public List getListCmt() {
        return listCmt;
    }

    /**
     * @return ���M�R�����g�f�[�^
     */
    public SendCmtData getSendCmtData() {
        return sendCmtData;
    }

    /**
     * @return ���M�R�����g�e���v���[�g�f�[�^ .
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
     * @return �������ʂ�100��������t���O
     */
    public boolean isExceedFlag() {
        return exceedFlag;
    }

    /**
     * @param planAnsNo
     *            ���񓚘A��
     */
    public void setCmtPlanAnsNo(Long planAnsNo) {
        sendCmtData.setPlanAnsNo(planAnsNo);
    }

    /**
     * @param cmtTmpl
     *            ���M�R�����g
     */
    public void setCmtTmpl(String cmtTmpl) {
        sendCmtData.setCmtTmpl(cmtTmpl);
        sendCmtTmplData.setCmtTmpl(cmtTmpl);
    }

    /**
     * @param exceedFlag
     *            �������ʂ�100��������t���O
     */
    public void setExceedFlag(boolean exceedFlag) {
        this.exceedFlag = exceedFlag;
    }

    /**
     * @param list
     *            ��ʂ̃��X�g�f�[�^
     */
    public void setList(List list) {
        this.list = list;
    }

    /**
     * @param listCmt
     *            ��ʂ̃��X�g�f�[�^ .
     */
    public void setListCmt(List listCmt) {
        this.listCmt = listCmt;
    }

    /**
     * �@
     * 
     * @param sendCmtData
     *            ���M�R�����g�f�[�^
     */
    public void setSendCmtData(SendCmtData sendCmtData) {
        this.sendCmtData = sendCmtData;
    }

    /**
     * @param sendCmtTmplData
     *            ���M�R�����g�e���v���[�g�f�[�^ .
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
