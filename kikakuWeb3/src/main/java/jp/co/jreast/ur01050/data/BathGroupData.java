package jp.co.jreast.ur01050.data;


/**
 * <pre>
 * ���C���O���[�v�f�[�^�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class BathGroupData {

	/**
	 * �R���X�g���N�^�[
	 *�@�f�[�^���������� .
	 */
	public BathGroupData() {
		super();
		maleFemaleData = new BathData();
		maleSpecialtyData = new BathData();
		feamleSpecialtyData = new BathData();
		timeShift = new BathData();
		mixBath = new BathData();
	}
	
	/**
	 * �j���� .
	 */
	private BathData maleFemaleData;
	
	/**
	 * �j����p�̂� .
	 */
	private BathData maleSpecialtyData;
	
	/**
	 * ������p�̂� .
	 */
	private BathData feamleSpecialtyData;
	
	/**
	 * ���Ԍ�� .
	 */
	private BathData timeShift;
	
	/**
	 * ���� .
	 */
	private BathData mixBath;

	/**
	 * @return feamleSpecialtyData ������p�̂�
	 */
	public BathData getFeamleSpecialtyData() {
		return feamleSpecialtyData;
	}

	/**
	 * @param feamleSpecialtyData ������p�̂�
	 */
	public void setFeamleSpecialtyData(BathData feamleSpecialtyData) {
		this.feamleSpecialtyData = feamleSpecialtyData;
	}

	/**
	 * @return maleFemaleData�@�j����
	 */
	public BathData getMaleFemaleData() {
		return maleFemaleData;
	}

	/**
	 * @param maleFemaleData �j����
	 */
	public void setMaleFemaleData(BathData maleFemaleData) {
		this.maleFemaleData = maleFemaleData;
	}

	/**
	 * @return maleSpecialtyData�@�j����p�̂�
	 */
	public BathData getMaleSpecialtyData() {
		return maleSpecialtyData;
	}

	/**
	 * @param maleSpecialtyData �j����p�̂�
	 */
	public void setMaleSpecialtyData(BathData maleSpecialtyData) {
		this.maleSpecialtyData = maleSpecialtyData;
	}

	/**
	 * @return mixBath ����
	 */
	public BathData getMixBath() {
		return mixBath;
	}

	/**
	 * @param mixBath ����
	 */
	public void setMixBath(BathData mixBath) {
		this.mixBath = mixBath;
	}

	/**
	 * @return timeShift ���Ԍ��
	 */
	public BathData getTimeShift() {
		return timeShift;
	}

	/**
	 * @param timeShift ���Ԍ��
	 */
	public void setTimeShift(BathData timeShift) {
		this.timeShift = timeShift;
	}
}
