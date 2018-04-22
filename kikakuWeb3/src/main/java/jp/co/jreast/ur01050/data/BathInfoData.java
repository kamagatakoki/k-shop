package jp.co.jreast.ur01050.data;


/**
 * <pre>
 * �����C���O���v�f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class BathInfoData {
	
	/**
	 * �R���X�g���N�^�[
	 *�@�f�[�^���������� .
	 */
	public BathInfoData() {
		super();
		spaData = new BathData();
		outsideData = new BathGroupData();
		bathHouseData = new BathGroupData();
		saunaData = new BathGroupData();
		rentalSpaData = new BathData();
		rentalOutsideSpaData = new BathData();
	}

	/**
	 * ����f�[�^ .
	 */
	private BathData spaData;

	/**
	 * �I�V���C .
	 */
	private BathGroupData outsideData;

	/**
	 * �嗁�� .
	 */
	private BathGroupData bathHouseData;

	/**
	 * �T�E�i .
	 */
	private BathGroupData saunaData;

	/**
	 * �ݐؕ��C .
	 */
	private BathData rentalSpaData;

	/**
	 * �ݐؘI�V���C .
	 */
	private BathData rentalOutsideSpaData;

	/**
	 * 
	 * @return �嗁��
	 */
	public BathGroupData getBathHouseData() {
		return bathHouseData;
	}

	/**
	 * 
	 * @param bathHouseData �嗁��
	 */
	public void setBathHouseData(BathGroupData bathHouseData) {
		this.bathHouseData = bathHouseData;
	}


	/**
	 * 
	 * @return �I�V���C
	 */
	public BathGroupData getOutsideData() {
		return outsideData;
	}

	/**
	 * 
	 * @param outsideData �I�V���C
	 */
	public void setOutsideData(BathGroupData outsideData) {
		this.outsideData = outsideData;
	}

	/**
	 * 
	 * @return �T�E�i
	 */
	public BathGroupData getSaunaData() {
		return saunaData;
	}

	/**
	 * 
	 * @param saunaData �T�E�i
	 */
	public void setSaunaData(BathGroupData saunaData) {
		this.saunaData = saunaData;
	}

	/**
	 * 
	 * @return ����f�[�^
	 */
	public BathData getSpaData() {
		return spaData;
	}

	/**
	 * 
	 * @param spaData ����f�[�^
	 */
	public void setSpaData(BathData spaData) {
		this.spaData = spaData;
	}

	/**
	 * @return rentalOutsideSpaData �ݐؘI�V���C
	 */
	public BathData getRentalOutsideSpaData() {
		return rentalOutsideSpaData;
	}

	/**
	 * @param rentalOutsideSpaData �ݐؘI�V���C
	 */
	public void setRentalOutsideSpaData(BathData rentalOutsideSpaData) {
		this.rentalOutsideSpaData = rentalOutsideSpaData;
	}

	/**
	 * @return rentalSpaData �ݐؕ��C
	 */
	public BathData getRentalSpaData() {
		return rentalSpaData;
	}

	/**
	 * @param rentalSpaData �ݐؕ��C
	 */
	public void setRentalSpaData(BathData rentalSpaData) {
		this.rentalSpaData = rentalSpaData;
	}

}
