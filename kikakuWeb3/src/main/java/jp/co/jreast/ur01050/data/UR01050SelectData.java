package jp.co.jreast.ur01050.data;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.MemoData;
import jp.co.jreast.common.data.PlanAnsData;

/**
 * <pre>
 * �wNO5�x��ʂ̃f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class UR01050SelectData implements OutData, InData {
	
	/**
	 * �R���X�g���N�^�[
	 *�@�f�[�^���������� .
	 */
	public UR01050SelectData() {
		headData = new PlanAnsData();
		generalData = new GeneralInfoData();
		bathInfoData = new BathInfoData();
		facilitiesInfoData = new FacilitiesInfoData();
		trafficData = new TrafficData();
		memoData = new MemoData();
	} 

	/**
	 * �ʐM�����f�[�^ .
	 */
	private MemoData memoData;
	
	/**
	 * �wNO5�x��ʂ̃w�b�h�f�[�^ .
	 */
	private PlanAnsData headData;

	/**
	 * ���ʏ��@�Ɓ@�ڍ׍��ڏ��f�[�^ .
	 */
	private GeneralInfoData generalData;

	/**
	 * �����C���f�[�^ .
	 */
	private BathInfoData bathInfoData;

	/**
	 * �e��ݔ����f�[�^ .
	 */
	private FacilitiesInfoData facilitiesInfoData;
	
	/**
	 * ��ʏ��f�[�^ .
	 */
	private TrafficData trafficData;

	/**
	 * @return bathInfoData �����C���f�[�^
	 */
	public BathInfoData getBathInfoData() {
		return bathInfoData;
	}

	/**
	 * @param bathInfoData �����C���f�[�^
	 */
	public void setBathInfoData(BathInfoData bathInfoData) {
		this.bathInfoData = bathInfoData;
	}

	/**
	 * @return facilitiesInfoData �e��ݔ����f�[�^
	 */
	public FacilitiesInfoData getFacilitiesInfoData() {
		return facilitiesInfoData;
	}

	/**
	 * @param facilitiesInfoData �e��ݔ����f�[�^
	 */
	public void setFacilitiesInfoData(FacilitiesInfoData facilitiesInfoData) {
		this.facilitiesInfoData = facilitiesInfoData;
	}

	/**
	 * @return generalData ���ʏ��@�Ɓ@�ڍ׍��ڏ��f�[�^
	 */
	public GeneralInfoData getGeneralData() {
		return generalData;
	}

	/**
	 * @param generalData ���ʏ��@�Ɓ@�ڍ׍��ڏ��f�[�^
	 */
	public void setGeneralData(GeneralInfoData generalData) {
		this.generalData = generalData;
	}

	/**
	 * @return headData �wNO5�x��ʂ̃w�b�h�f�[�^
	 */
	public PlanAnsData getHeadData() {
		return headData;
	}

	/**
	 * @param headData �wNO5�x��ʂ̃w�b�h�f�[�^
	 */
	public void setHeadData(PlanAnsData headData) {
		this.headData = headData;
	}

	/**
	 * @return trafficData ��ʏ��f�[�^
	 */
	public TrafficData getTrafficData() {
		return trafficData;
	}

	/**
	 * @param trafficData ��ʏ��f�[�^
	 */
	public void setTrafficData(TrafficData trafficData) {
		this.trafficData = trafficData;
	}

	/**
	 * 
	 * @return �ʐM�����f�[�^
	 */
	public MemoData getMemoData() {
		return memoData;
	}

	/**
	 * 
	 * @param memoData �ʐM�����f�[�^
	 */
	public void setMemoData(MemoData memoData) {
		this.memoData = memoData;
	}


}
