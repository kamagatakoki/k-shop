package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;

/**
 * <pre>
 * 『No5』画面入力データクラス。.
 * 機能概要    ：  
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 忻兆君
 * @version 0.1 2006/10/24
 */
public class UR01050SearchInData implements InData {
	
	/**
	 * コンストラクター
	 *　データ初期化する .
	 */
	public UR01050SearchInData() {
		super();
		ansSearchData = new AnsSearchData();
	}
	
	/**
	 * 『No5』画面入力データ .
	 */
	private AnsSearchData ansSearchData;
	
	/**
	 * NO5履歴番号 .
	 */
	private Integer no5CareerNo;
	
	/**
	 * @return careerNo 履歴番号
	 */
	public Integer getCareerNo() {
		return ansSearchData.getCareerNo();
	}

	/**
	 * @param careerNo 履歴番号
	 */
	public void setCareerNo(Integer careerNo) {
		ansSearchData.setCareerNo(careerNo);
	}

	/**
	 * @return planAnsNo 企画回答連番
	 */
	public Long getPlanAnsNo() {
		return ansSearchData.getPlanAnsNo();
	}

	/**
	 * @param planAnsNo 企画回答連番
	 */
	public void setPlanAnsNo(Long planAnsNo) {
		ansSearchData.setPlanAnsNo(planAnsNo);
	}

	/**
	 * @return ansSearchData 『No5』画面入力データ
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData 『No5』画面入力データ
	 */
	public void setAnsSearchData(AnsSearchData ansSearchData) {
		this.ansSearchData = ansSearchData;
	}

	/**
	 * @return no5CareerNo NO5履歴番号
	 */
	public Integer getNo5CareerNo() {
		return no5CareerNo;
	}

	/**
	 * @param no5CareerNo NO5履歴番号
	 */
	public void setNo5CareerNo(Integer no5CareerNo) {
		this.no5CareerNo = no5CareerNo;
	}

}
