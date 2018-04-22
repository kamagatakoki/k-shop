package jp.co.jreast.common.data;

/**
 * <pre>
 * DP/RM企画回答書データクラス
 * 機能概要    ：  DP/RM企画回答書データを格納する。
 * 特記事項    ：  無し
 * </pre>
 */
public class DPlanAnsData extends PlanAnsData {

    /**
     * 会社ID
     */
    private String comId;

    /**
     * 造成WEB連携回数
     */
    private Integer zouseiRelateCnt;

    /**
     * 会社IDを取得します。
     * 
     * @return 会社ID
     */
    public String getComId() {
        return comId;
    }

    /**
     * 造成WEB連携回数を取得します。
     * 
     * @return 造成WEB連携回数
     */
    public Integer getZouseiRelateCnt() {
        return zouseiRelateCnt;
    }

    /**
     * 会社IDを設定します。
     * 
     * @param comId
     *            会社ID
     */
    public void setComId(String comId) {
        this.comId = comId;
    }

    /**
     * 造成WEB連携回数を設定します。
     * 
     * @param zouseiRelateCnt
     *            造成WEB連携回数
     */
    public void setZouseiRelateCnt(Integer zouseiRelateCnt) {
        this.zouseiRelateCnt = zouseiRelateCnt;
    }

}
