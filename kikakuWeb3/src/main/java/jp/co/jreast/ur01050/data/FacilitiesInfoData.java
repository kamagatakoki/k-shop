package jp.co.jreast.ur01050.data;


/**
 * <pre>
 * �e��ݔ����f�[�^�B.
 * �@�\�T�v    �F  
 * ���L����    �F  ����
 * </pre>
 *
 * @author �v���N
 * @version 0.1 2006/10/24
 */
public class FacilitiesInfoData {

	/**
	 * �R���X�g���N�^�[
	 *�@�f�[�^���������� .
	 */
	public FacilitiesInfoData() {
		super();
		karaokeBoxData = new EquipmentData();
		gameCornerData = new EquipmentData();
		tennisCourtData = new EquipmentData();
		tableTennisData = new EquipmentData();
		poolIndoorData = new EquipmentData();
		poolOutsideData = new EquipmentData();
		fitnessData = new EquipmentData();
		newsData = new EquipmentData();
		parkFreeData = new EquipmentData();
		parkPayData = new EquipmentData();
		convenienceData = new EquipmentData();
		infantData = new GeneralInfoData();
		
		// �Ŋ�R���r�j�܂œk���ǉ� 2009/11/13 add by s31109
		nearStoreData = new EquipmentData();
	}
		
	/**
	 * �J���I�P�a�n�w .
	 */
	private EquipmentData karaokeBoxData;
	
	/**
	 * �Q�[���R�[�i�[�L�� .
	 */
	private EquipmentData gameCornerData;
	
	/**
	 * �M�ِ�p�e�j�X�R�[�g�L�� .
	 */
	private EquipmentData tennisCourtData;
	
	/**
	 * �싅��L�� .
	 */
	private EquipmentData tableTennisData;
	
	/**
	 * �v�[���L��i�����j .
	 */
	private EquipmentData poolIndoorData;
	
	/**
	 * �v�[���L��i���O�j .
	 */
	private EquipmentData poolOutsideData;
	
	/**
	 * �t�B�b�g�l�X�{�ݗL�� .
	 */
	private EquipmentData fitnessData;
	
	/**
	 * �����ɐV���T�[�r�X�L�� .
	 */
	private EquipmentData newsData;
	
	/**
	 * ���ԏ�i�����j�L�� .
	 */
	private EquipmentData parkFreeData;
	
	/**
	 * ���ԏ�i�L���j�L�� .
	 */
	private EquipmentData parkPayData;
	
	/**
	 * �ٓ��ɃR���r�j�L .
	 */
	private EquipmentData convenienceData;
	
	/**
	 * ���c�� .
	 */
	private GeneralInfoData infantData;
	
	/**
	 * �Ŋ�R���r�j�L .
	 */
	private EquipmentData nearStoreData;

	/**
	 * 
	 * @return �ٓ��ɃR���r�j�L
	 */
	public EquipmentData getConvenienceData() {
		return convenienceData;
	}

	/**
	 * 
	 * @param convenienceData �ٓ��ɃR���r�j�L
	 */
	public void setConvenienceData(EquipmentData convenienceData) {
		this.convenienceData = convenienceData;
	}

	/**
	 * 
	 * @return �t�B�b�g�l�X�{�ݗL��
	 */
	public EquipmentData getFitnessData() {
		return fitnessData;
	}

	/**
	 * 
	 * @param fitnessData �t�B�b�g�l�X�{�ݗL��
	 */
	public void setFitnessData(EquipmentData fitnessData) {
		this.fitnessData = fitnessData;
	}
	
	/**
	 * 
	 * @return �Q�[���R�[�i�[�L��
	 */
	public EquipmentData getGameCornerData() {
		return gameCornerData;
	}

	/**
	 * 
	 * @param gameCornerData �Q�[���R�[�i�[�L��
	 */
	public void setGameCornerData(EquipmentData gameCornerData) {
		this.gameCornerData = gameCornerData;
	}

	/**
	 * 
	 * @return �J���I�P�a�n�w
	 */
	public EquipmentData getKaraokeBoxData() {
		return karaokeBoxData;
	}

	/**
	 * 
	 * @param karaokeBoxData �J���I�P�a�n�w
	 */
	public void setKaraokeBoxData(EquipmentData karaokeBoxData) {
		this.karaokeBoxData = karaokeBoxData;
	}

	/**
	 * 
	 * @return �����ɐV���T�[�r�X�L��
	 */
	public EquipmentData getNewsData() {
		return newsData;
	}

	/**
	 * 
	 * @param newsData �����ɐV���T�[�r�X�L��
	 */
	public void setNewsData(EquipmentData newsData) {
		this.newsData = newsData;
	}

	/**
	 * 
	 * @return ���ԏ�i�����j�L��
	 */
	public EquipmentData getParkFreeData() {
		return parkFreeData;
	}
	
	/**
	 * 
	 * @param parkFreeData ���ԏ�i�����j�L��
	 */
	public void setParkFreeData(EquipmentData parkFreeData) {
		this.parkFreeData = parkFreeData;
	}

	/**
	 * 
	 * @return ���ԏ�i�L���j�L��
	 */
	public EquipmentData getParkPayData() {
		return parkPayData;
	}

	/**
	 * 
	 * @param parkPayData ���ԏ�i�L���j�L��
	 */
	public void setParkPayData(EquipmentData parkPayData) {
		this.parkPayData = parkPayData;
	}

	/**
	 * 
	 * @return �v�[���L��i���O�j
	 */
	public EquipmentData getPoolOutsideData() {
		return poolOutsideData;
	}

	/**

	 * @param poolOutsideData �v�[���L��i���O�j
	 */
	public void setPoolOutsideData(EquipmentData poolOutsideData) {
		this.poolOutsideData = poolOutsideData;
	}

	/**
	 * 
	 * @return �v�[���L��i�����j
	 */
	public EquipmentData getPoolIndoorData() {
		return poolIndoorData;
	}

	/**
	 * 
	 * @param poolIndoorData �v�[���L��i�����j
	 */
	public void setPoolIndoorData(EquipmentData poolIndoorData) {
		this.poolIndoorData = poolIndoorData;
	}

	/**
	 * 
	 * @return  �싅��L��
	 */
	public EquipmentData getTableTennisData() {
		return tableTennisData;
	}

	/**
	 * 
	 * @param tableTennisData �싅��L��
	 */
	public void setTableTennisData(EquipmentData tableTennisData) {
		this.tableTennisData = tableTennisData;
	}

	/**
	 * 
	 * @return �M�ِ�p�e�j�X�R�[�g�L��
	 */
	public EquipmentData getTennisCourtData() {
		return tennisCourtData;
	}

	/**
	 * 
	 * @param tennisCourtData �M�ِ�p�e�j�X�R�[�g�L��
	 */
	public void setTennisCourtData(EquipmentData tennisCourtData) {
		this.tennisCourtData = tennisCourtData;
	}

	/**
	 * @return infantData ���c��
	 */
	public GeneralInfoData getInfantData() {
		return infantData;
	}

	/**
	 * @param infantData ���c��
	 */
	public void setInfantData(GeneralInfoData infantData) {
		this.infantData = infantData;
	}

	/**
	 * @return infantData �Ŋ�R���r�j�L
	 */
	public EquipmentData getNearStoreData() {
		return nearStoreData;
	}

	/**
	 * @param infantData �Ŋ�R���r�j�L
	 */
	public void setNearStoreData(EquipmentData nearStoreData) {
		this.nearStoreData = nearStoreData;
	}
}
