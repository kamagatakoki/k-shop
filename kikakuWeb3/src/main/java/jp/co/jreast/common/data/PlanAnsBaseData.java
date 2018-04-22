package jp.co.jreast.common.data;

import jp.co.jreast.common.DJreConstants;
import jp.co.jreast.common.JreConstants;

/**
 * <pre>
 * 企画書ベースデータクラス。.
 * 機能概要    ：  企画書ベースデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author zhu
 * @version 0.1 2006/10/27
 */
public class PlanAnsBaseData {

    /**
     * 履歴番号.
     */
    private Integer careerNo;

    /** 素材種別 */
    private String materialKind;

    /**
     * 企画回答連番.
     */
    private Long planAnsNo;

    /**
     * @return Returns the careerNo.
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 素材種別を取得します。
     * 
     * @return 素材種別
     */
    public String getMaterialKind() {
        return materialKind;
    }

    /**
     * 素材種別名称を取得します。
     * 
     * <pre></pre>
     * 
     * @return 素材種別名称
     */
    public String getMaterialKindName() {
        return JreConstants.getListLabel(DJreConstants.DIV_MATERIAL_KIND,
                materialKind);
    }

    /**
     * @return Returns the planAnsNo.
     */
    public Long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * @param careerNo
     *            The careerNo to set.
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * 素材種別を設定します。
     * 
     * @param materialKind
     *            素材種別
     */
    public void setMaterialKind(String materialKind) {
        this.materialKind = materialKind;
    }

    /**
     * @param planAnsNo
     *            The planAnsNo to set.
     */
    public void setPlanAnsNo(Long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * 企画回答連番と履歴番号をセットする.
     * 
     * @param from
     *            fromデータ
     */
    public void setPlanNoAndCareerNo(PlanAnsBaseData from) {
        setPlanAnsNo(from.getPlanAnsNo());
        setCareerNo(from.getCareerNo());
    }

}
