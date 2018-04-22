package jp.co.jreast.common.data.dno1data;

/**
 * <pre>
 *  企画通番採番データクラス。.
 *  機能概要    ：  企画通番採番データを格納する。
 *  特記事項    ：  無し
 * </pre>
 * 
 * @author hu
 * @version 0.1 2006/10/27
 */
public class DNo1PlanNoData {

	/**
	　* 種別.
	 */
	private String kind;

	/**
	 * 施設コード.
	 */
	private String facilityCd;

	/**
   	　* 支社コード.
	 */
	private String branchCd;

	/**
	 * 年番号.
	 */
	private String yearNo;

	/**
	 * シーズン区分.
	 */
	private String seasonDiv;

	/**
	 * 企画通番連番.
	 */
	private String planNo;

	/**
	 * 企画回答連番.
	 */
	private Long planAnsNo;

	/**
	 * 企画通番連番.
	 */
	private String plansNoStr;

	/**
	 * 溢れるフラグ .
	 */
	private boolean isOverFlow;

	/**
	 * @return the branchCd
	 */
	public final String getBranchCd() {
		return branchCd;
	}

	/**
	 * @param branchCd
	 *            the branchCd to set
	 */
	public final void setBranchCd(final String branchCd) {
		this.branchCd = branchCd;
	}

	/**
	 * @return the facilityCd
	 */
	public final String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * @param facilityCd
	 *            the facilityCd to set
	 */
	public final void setFacilityCd(final String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * @return the kind
	 */
	public final String getKind() {
		return kind;
	}

	/**
	 * @param kind
	 *            the kind to set
	 */
	public final void setKind(final String kind) {
		this.kind = kind;
	}

	/**
	 * @return the planAnsNo
	 */
	public final Long getPlanAnsNo() {
		return planAnsNo;
	}

	/**
	 * @param planAnsNo
	 *            the planAnsNo to set
	 */
	public final void setPlanAnsNo(final Long planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

	/**
	 * @return the planNo
	 */
	public final String getPlanNo() {
		return planNo;
	}

	/**
	 * @param planNo
	 *            the planNo to set
	 */
	public final void setPlanNo(final String planNo) {
		this.planNo = planNo;
	}

	/**
	 * @return the seasonDiv
	 */
	public final String getSeasonDiv() {
		return seasonDiv;
	}

	/**
	 * @param seasonDiv
	 *            the seasonDiv to set
	 */
	public final void setSeasonDiv(final String seasonDiv) {
		this.seasonDiv = seasonDiv;
	}

	/**
	 * @return the yearNo
	 */
	public final String getYearNo() {
		return yearNo;
	}

	/**
	 * @param yearNo
	 *            the yearNo to set
	 */
	public final void setYearNo(final String yearNo) {
		this.yearNo = yearNo;
	}

	/**
	 * @return the plansNoStr
	 */
	public final String getPlansNoStr() {
		return plansNoStr;
	}

	/**
	 * @param plansNoStr
	 *            the plansNoStr to set
	 */
	public final void setPlansNoStr(String plansNoStr) {
		this.plansNoStr = plansNoStr;
	}

	/**
	 * 
	 * @return .
	 */
	public boolean isOverFlow() {
		return isOverFlow;
	}

	/**
	 * 
	 * @param isOverFlow .
	 */
	public void setOverFlow(boolean isOverFlow) {
		this.isOverFlow = isOverFlow;
	}
}
