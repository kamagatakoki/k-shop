package jp.co.jreast.common.data.dno1data;

/**
 * <pre>
 *  ���ʔԍ̔ԃf�[�^�N���X�B.
 *  �@�\�T�v    �F  ���ʔԍ̔ԃf�[�^���i�[����B
 *  ���L����    �F  ����
 * </pre>
 * 
 * @author hu
 * @version 0.1 2006/10/27
 */
public class DNo1PlanNoData {

	/**
	�@* ���.
	 */
	private String kind;

	/**
	 * �{�݃R�[�h.
	 */
	private String facilityCd;

	/**
   	�@* �x�ЃR�[�h.
	 */
	private String branchCd;

	/**
	 * �N�ԍ�.
	 */
	private String yearNo;

	/**
	 * �V�[�Y���敪.
	 */
	private String seasonDiv;

	/**
	 * ���ʔԘA��.
	 */
	private String planNo;

	/**
	 * ���񓚘A��.
	 */
	private Long planAnsNo;

	/**
	 * ���ʔԘA��.
	 */
	private String plansNoStr;

	/**
	 * ����t���O .
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
