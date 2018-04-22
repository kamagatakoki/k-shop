package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.AnsSearchData;

/**
 * <pre>
 * �wNo5�x��ʓ��̓f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class UR01050SearchInData implements InData {
	
	/**
	 * �R���X�g���N�^�[
	 *�@�f�[�^���������� .
	 */
	public UR01050SearchInData() {
		super();
		ansSearchData = new AnsSearchData();
	}
	
	/**
	 * �wNo5�x��ʓ��̓f�[�^ .
	 */
	private AnsSearchData ansSearchData;
	
	/**
	 * NO5����ԍ� .
	 */
	private Integer no5CareerNo;
	
	/**
	 * @return careerNo ����ԍ�
	 */
	public Integer getCareerNo() {
		return ansSearchData.getCareerNo();
	}

	/**
	 * @param careerNo ����ԍ�
	 */
	public void setCareerNo(Integer careerNo) {
		ansSearchData.setCareerNo(careerNo);
	}

	/**
	 * @return planAnsNo ���񓚘A��
	 */
	public Long getPlanAnsNo() {
		return ansSearchData.getPlanAnsNo();
	}

	/**
	 * @param planAnsNo ���񓚘A��
	 */
	public void setPlanAnsNo(Long planAnsNo) {
		ansSearchData.setPlanAnsNo(planAnsNo);
	}

	/**
	 * @return ansSearchData �wNo5�x��ʓ��̓f�[�^
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData �wNo5�x��ʓ��̓f�[�^
	 */
	public void setAnsSearchData(AnsSearchData ansSearchData) {
		this.ansSearchData = ansSearchData;
	}

	/**
	 * @return no5CareerNo NO5����ԍ�
	 */
	public Integer getNo5CareerNo() {
		return no5CareerNo;
	}

	/**
	 * @param no5CareerNo NO5����ԍ�
	 */
	public void setNo5CareerNo(Integer no5CareerNo) {
		this.no5CareerNo = no5CareerNo;
	}

}
