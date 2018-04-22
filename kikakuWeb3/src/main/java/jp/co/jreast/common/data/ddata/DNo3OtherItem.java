package jp.co.jreast.common.data.ddata;

/*
 * Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Oct 29 17:36:29 JST 2014
 */

/**
 * DNo3OtherItem.
 * 
 * @author keiken
 * @version 1.0
 *          history
 *          Symbol Date Person Note
 *          [1] 2014/10/29 keiken Generated.
 */
public class DNo3OtherItem {

    /** テーブル名：[DP/RM]NO3_その他特典 */
    public static final String TABLE = "D_NO3_OTHER_ITEM";

    /**
     * 履歴番号
     */
    private Integer careerNo;

    /**
     * 企画回答連番
     */
    private long planAnsNo;

    /**
     * シーケンス
     */
    private Integer sequence;

    /**
     * サービス内容
     */
    private String serviceContent;

    /**
     * 特典内容
     */
    private String specialContent;

    /**
     * 特典特記事項
     */
    private String specialRecoItem;

    /**
     * 履歴番号を取得します。
     * 
     * @return 履歴番号
     */
    public Integer getCareerNo() {
        return careerNo;
    }

    /**
     * 企画回答連番を取得します。
     * 
     * @return 企画回答連番
     */
    public long getPlanAnsNo() {
        return planAnsNo;
    }

    /**
     * シーケンスを取得します。
     * 
     * @return シーケンス
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * サービス内容を取得します。
     * 
     * @return サービス内容
     */
    public String getServiceContent() {
        return serviceContent;
    }

    /**
     * 特典内容を取得します。
     * 
     * @return 特典内容
     */
    public String getSpecialContent() {
        return specialContent;
    }

    /**
     * 特典特記事項を取得します。
     * 
     * @return 特典特記事項
     */
    public String getSpecialRecoItem() {
        return specialRecoItem;
    }

    /**
     * 履歴番号を設定します。
     * 
     * @param careerNo
     *            履歴番号
     */
    public void setCareerNo(Integer careerNo) {
        this.careerNo = careerNo;
    }

    /**
     * 企画回答連番を設定します。
     * 
     * @param planAnsNo
     *            企画回答連番
     */
    public void setPlanAnsNo(long planAnsNo) {
        this.planAnsNo = planAnsNo;
    }

    /**
     * シーケンスを設定します。
     * 
     * @param sequence
     *            シーケンス
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * サービス内容を設定します。
     * 
     * @param serviceContent
     *            サービス内容
     */
    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent;
    }

    /**
     * 特典内容を設定します。
     * 
     * @param specialContent
     *            特典内容
     */
    public void setSpecialContent(String specialContent) {
        this.specialContent = specialContent;
    }

    /**
     * 特典特記事項を設定します。
     * 
     * @param specialRecoItem
     *            特典特記事項
     */
    public void setSpecialRecoItem(String specialRecoItem) {
        this.specialRecoItem = specialRecoItem;
    }

}
