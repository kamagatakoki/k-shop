package jp.co.jreast.common.data;

/**
 * <pre>
 * No4FM���M�p�B.
 * �@�\�T�v    �F  �݌ɓ��t�ƍ݌ɔԍ����i�[�B
 * ���L����    �F  ����
 * </pre>
 *
 * @author ���@����	
 * @version 0.1 2007/06/17
 */
public class No4FMCheckData {
	/**
	 * No4���^�C�v������̓��̃��X�g.
	 */
	private String dayList;
	/**
	 * ���^�C�v.
	 */
	private String stockNo;
	/**
	 * @return dayList
	 */
	/**
	 * �������񓚏��ԍ�.
	 */
	private String planAnsNo;
	public String getDayList() {
		return dayList;
	}
	public String[] getDayListArr() {
		return dayList.split(",");
	}
	/**
	 * @param dayList �ݒ肷�� dayList
	 */
	public void setDayList(String dayList) {
		this.dayList = dayList;
	}
	/**
	 * @return stockNo
	 */
	public String getStockNo() {
		return stockNo;
	}
	/**
	 * @param stockNo �ݒ肷�� stockNo
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}
	/**
	 * @return planAnsNo
	 */
	public String getPlanAnsNo() {
		return planAnsNo;
	}
	/**
	 * @param planAnsNo �ݒ肷�� planAnsNo
	 */
	public void setPlanAnsNo(String planAnsNo) {
		this.planAnsNo = planAnsNo;
	}

}
