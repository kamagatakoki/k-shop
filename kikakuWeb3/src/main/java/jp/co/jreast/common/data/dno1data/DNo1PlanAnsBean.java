package jp.co.jreast.common.data.dno1data;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * ���񓚏������X�V�p�f�[�^�N���X�B.
 * �@�\�T�v    �F  ���񓚏������X�V�p�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 * 
 * @author hu
 * @version 0.1 2006/10/27
 */
public final class DNo1PlanAnsBean extends PlanAnsBaseData implements InData,
        OutData {

    /**
     * ���i�����ς݃t���O .
     */
    private String createGoodsFlg = JreConstants.FLG_FALSE;

    /**
     * �폜�t���O .
     */
    private String delFlg = JreConstants.FLG_FALSE;

    /**
     * �e�l�����A�g.
     */
    private Integer fmCostRelateDiv;

    /**
     * ����t���O�@.
     */
    private boolean isOverFlow;

    /**
     * JR���F�t���O .
     */
    private String jrAdimtFlg = JreConstants.FLG_FALSE;

    /**
     * ���
     */
    private String kindFlg;

    /**
     * No1���.
     */
    private Integer no1Status;

    /**
     * No2���
     */
    private Integer no2Status;

    /**
     * ���ʔԁi�U�Ёj.
     */
    private String planNo6Off;

    /**
     * ���ʔԁi�����{�j.
     */
    private String planNoEJp;

    /**
     * ���ʔԃ��X�g�@.
     */
    private List planNoList;

    /**
     * ���єԃt���O�@.
     */
    private String planNoPickUpFlg = JreConstants.FLG_FALSE;

    /**
     * .
     * �A����Fax
     */
    private String senderFax;

    /**
     * ���t�S���Җ�.(�`�F�b�N��)
     */
    private String senderNm;

    /**
     * ���t�A����d�b.
     */
    private String senderTel;

    /**
     * ���.
     */
    private Integer status;

    /**
     * �݌ɋ敪 .
     */
    private Integer stockDiv;

    /**
     * ���[�UID.
     */
    private String userId;

    /**
     * ���[�U����.
     */
    private String userNm;

    /**
     * @return .
     */
    public String getCreateGoodsFlg() {
        return createGoodsFlg;
    }

    /**
     * @return �폜�t���O
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * @return the fmCostRelateDiv
     */
    public final Integer getFmCostRelateDiv() {
        return fmCostRelateDiv;
    }

    /**
     * @return .
     */
    public String getJrAdimtFlg() {
        return jrAdimtFlg;
    }

    /**
     * ��ʂ��擾���܂��B
     * 
     * @return ���
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * @return No1���
     */
    public Integer getNo1Status() {
        return no1Status;
    }

    /**
     * No2��Ԃ��擾���܂��B
     * 
     * @return No2���
     */
    public Integer getNo2Status() {
        return no2Status;
    }

    /**
     * @return the planNo6Off
     */
    public final String getPlanNo6Off() {
        return planNo6Off;
    }

    /**
     * @return the planNoEJp
     */
    public final String getPlanNoEJp() {
        return planNoEJp;
    }

    /**
     * @return .
     */
    public List getPlanNoList() {
        return planNoList;
    }

    /**
     * @return .
     */
    public String getPlanNoPickUpFlg() {
        return planNoPickUpFlg;
    }

    /**
     * @return �A����Fax
     */
    public String getSenderFax() {
        return senderFax;
    }

    /**
     * @return ���t�S���Җ�(�`�F�b�N��)
     */
    public String getSenderNm() {
        return senderNm;
    }

    /**
     * @return ���t�A����d�b
     */
    public String getSenderTel() {
        return senderTel;
    }

    /**
     * @return the status
     */
    public final Integer getStatus() {
        return status;
    }

    /**
     * @return .
     */
    public Integer getStockDiv() {
        return stockDiv;
    }

    /**
     * @return ���[�UID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return ���[�U����
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * @return .
     */
    public boolean isOverFlow() {
        return isOverFlow;
    }

    /**
     * @param createGoodsFlg
     *            .
     */
    public void setCreateGoodsFlg(String createGoodsFlg) {
        this.createGoodsFlg = createGoodsFlg;
    }

    /**
     * @param delFlg
     *            �폜�t���O
     */
    public void setDelFlg(final String delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * @param fmCostRelateDiv
     *            the status to set
     */
    public final void setFmCostRelateDiv(final Integer fmCostRelateDiv) {
        this.fmCostRelateDiv = fmCostRelateDiv;
    }

    /**
     * @param jrAdimtFlg
     *            .
     */
    public void setJrAdimtFlg(String jrAdimtFlg) {
        this.jrAdimtFlg = jrAdimtFlg;
    }

    /**
     * ��ʂ�ݒ肵�܂��B
     * 
     * @param kindFlg
     *            ���
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * @param no1Status
     *            No1���
     */
    public void setNo1Status(Integer no1Status) {
        this.no1Status = no1Status;
    }

    /**
     * No2��Ԃ�ݒ肵�܂��B
     * 
     * @param no2Status
     *            No2���
     */
    public void setNo2Status(Integer no2Status) {
        this.no2Status = no2Status;
    }

    /**
     * @param isOverFlow
     *            .
     */
    public void setOverFlow(boolean isOverFlow) {
        this.isOverFlow = isOverFlow;
    }

    /**
     * @param planNo6Off
     *            the planNo6Off to set
     */
    public final void setPlanNo6Off(final String planNo6Off) {
        this.planNo6Off = planNo6Off;
    }

    /**
     * @param planNoEJp
     *            the planNoEJp to set
     */
    public final void setPlanNoEJp(final String planNoEJp) {
        this.planNoEJp = planNoEJp;
    }

    /**
     * @param planNoList
     *            .
     */
    public void setPlanNoList(List planNoList) {
        this.planNoList = planNoList;
    }

    /**
     * @param planNoPickUpFlg
     *            .
     */
    public void setPlanNoPickUpFlg(String planNoPickUpFlg) {
        this.planNoPickUpFlg = planNoPickUpFlg;
    }

    /**
     * @param senderFax
     *            �A����Fax
     */
    public void setSenderFax(String senderFax) {
        this.senderFax = senderFax;
    }

    /**
     * @param senderNm
     *            ���t�S���Җ�(�`�F�b�N��)
     */
    public void setSenderNm(String senderNm) {
        this.senderNm = senderNm;
    }

    /**
     * @param senderTel
     *            ���t�A����d�b
     */
    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    /**
     * @param status
     *            the status to set
     */
    public final void setStatus(final Integer status) {
        this.status = status;
    }

    /**
     * @param stockDiv
     *            .
     */
    public void setStockDiv(Integer stockDiv) {
        this.stockDiv = stockDiv;
    }

    /**
     * @param userId
     *            ���[�UID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @param userNm
     *            ���[�U����
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }
}
