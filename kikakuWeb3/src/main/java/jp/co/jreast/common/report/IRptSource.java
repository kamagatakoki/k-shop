package jp.co.jreast.common.report;

/**
 * <pre>
 *  IReport�̃\�[�X�N���X�B.
 *  �@�\�T�v�@�F
 *  �@IReport�̕K�v�\�[�X.
 *  ���L�����@�F
 * </pre>
 * @author Xbl
 *
 */
public interface IRptSource {

	/**
	 * No1�y�[�W�̑��report.
	 */
	String RPT_NO1_KEY_RPT1 = "No1.Rpt1";
	/**
	 * No1�y�[�W�̑��report.
	 */
	String RPT_NO1_KEY_RPT2 = "No1.Rpt2";
	
	/**
	 * No1�y�[�W�̑�Oreport.
	 */
	String RPT_NO1_KEY_RPT3 = "No1.Rpt3";
	/**
	 * No2�y�[�W��report.
	 */
	String RPT_NO2_KEY = "No2";
	
	//�h���z�e��no2 add by s32395 2010/01/26
	/**
	 * No2�y�[�W��report.
	 */
	String RPT_NO2_1_KEY = "No2_1";
	/**
	 * No2�y�[�W��report.
	 */
	String RPT_NO2_2_KEY = "No2_2";
	
	// �h��NO2�X�L�[�ǉ� 2010/05/18
	/**
	 * No2�y�[�W��report.
	 */
	String RPT_NO2_3_KEY_RPT1 = "No2_3.Rpt1";
	/**
	 * No2�y�[�W��report.
	 */
	String RPT_NO2_3_KEY_RPT2 = "No2_3.Rpt2";
	/////////////////////////////////////////
	
	/**
	 * No3�y�[�W��report.
	 */
	String RPT_NO3_KEY = "No3";
	
	/**
	 * No4�y�[�W��report.
	 */
	String RPT_NO4_KEY = "No4";
	
	/**
	 * No5�y�[�W�̑��report.
	 */
	String RPT_NO5_KEY_RPT1 = "No5.Rpt1";
	
	/**
	 * No5�y�[�W�̑��report.
	 */
	String RPT_NO5_KEY_RPT2 = "No5.Rpt2";
	//�{�ݕt�щ�ʗp�@�L�[�ǉ� START
	/**
	 * No3�y�[�W��report����. add by s30873 2010/1
	 */
	String RPT_NO3FUTAI_KEY = "No3Futai";
	/**
	 * No3�y�[�W��report�z�e��. add by s30873 2010/2/1
	 */
	String RPT_NO3FUTAIHOTEL_KEY = "No3FutaiHotel";
	/**
	 * No3�y�[�W��report�z�e��. add by s30873 2010/2/1
	 */
	String RPT_NO3FUTAISKI_KEY = "No3FutaiSki";
	/**
	 * No5�t�їp�y�[�W��report. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT1 = "No5Futai.Rpt1";
		
	/**
	 * No5�t�їp�y�[�W��report. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT2 = "No5Futai.Rpt2";
	//�{�ݕt�щ�ʗp�@�L�[�ǉ� END
	
	//�ǉ� �{�ݕt�щ��No.5�X�L�[�p�@�L�[ START
	
	/**
	 * No5�t�їp�y�[�W��report. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT1_3 = "No5Futai.Rpt1_3";
		
	/**
	 * No5�t�їp�y�[�W��report. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT2_3 = "No5Futai.Rpt2_3";
	
	//	//�ǉ� �{�ݕt�щ��No.5�X�L�[�p�@�L�[ END
	/**
	 * No21�y�[�W�̑��report.
	 */
	String RPT_LIFT_NO2_KEY_RPT1 = "No2.Rpt1";
	/**
	 * No21�y�[�W�̑��report.
	 */
	String RPT_LIFT_NO2_KEY_RPT2 = "No2.Rpt2";
	
	/**
	 * IReport�̔z�u����.
	 */
	String RPT_CONFIG = "/jp/co/jreast/common/properties/report.properties";
	
	/**
	 * No1_1sheetName.
	 */
	String RPT_NO1_1_NAME_RPT1 = "No1_1";

	/**
	 * No1_2sheetName.
	 */
	String RPT_NO1_2_NAME_RPT1 = "No1_2";

	/**
	 * No1_3sheetName.
	 */
	String RPT_NO1_3_NAME_RPT1 = "No1_3";

	/**
	 * No2sheetName .
	 */
	String RPT_NO2_NAME_RPT1 = "No2";
	/**
	 * No21_1sheetName .
	 */
	String RPT_NO2_1_NAME_RPT = "No2_1";

	/**
	 * No21_2sheetName .
	 */
	String RPT_NO2_2_NAME_RPT = "No2_2";

	/**
	 * No3sheetName .
	 */
	String RPT_NO3_NAME_RPT1 = "No3";
	
	/**
	 * �t�їpNo3sheetName .
	 */
	String RPT_NO3FUTAI_NAME_RPT1 = "No3Ryokan";
	
	String RPT_NO3FUTAIHOTEL_NAME_RPT1 = "No3Hotel";

	/**
	 * No4sheetName .
	 */
	String RPT_NO4_NAME_RPT1 = "No4";

	/**
	 * No5_1sheetName .
	 */
	String RPT_NO5_1_NAME_RPT = "No5_1";

	/**
	 * No5_2sheetName .
	 */
	String RPT_NO5_2_NAME_RPT = "No5_2";
	/**
	 * �D��No1��templete��.
	 */
	String RPT_UR01012_RPT1 = "UR01012.Rpt1";
	/**
	 * �D��No2��templete��.
	 */
	String RPT_UR01012_RPT2 = "UR01012.Rpt2";
	/**
	 * �D��No3��templete��.
	 */
	String RPT_UR01012_RPT3 = "UR01012.Rpt3";
	
	/**
	 * Golf�y�[�W�̑��report.
	 */
	String RPT_UR01013_RPT1 = "Golf.Rpt1";
	/**
	 * Golf�y�[�W�̑��report.
	 */
	String RPT_UR01013_RPT2 = "Golf.Rpt2";
	
	/**
	 * Golf�y�[�W�̑�Oreport.
	 */
	String RPT_UR01013_RPT3 = "Golf.Rpt3";
	/**
	 * �ό��y�[�W�̑��report.
	 */
	String RPT_UR01011_RPT1 = "Travel.Rpt1";
	/**
	 * �ό��y�[�W�̑��report.
	 */
	String RPT_UR01011_RPT2 = "Travel.Rpt2";
	
	/**
	 * �ό��y�[�W�̑�Oreport.
	 */
	String RPT_UR01011_RPT3 = "Travel.Rpt3";
	
	/**
	 * ���t�g�̑��report.
	 */
	String RPT_UR01014_RPT1 = "UR01014.Rpt1";
	/**
	 * ���t�g�̑�jreport.
	 */
	String RPT_UR01014_RPT2 = "UR01014.Rpt2";
	/**
	 * ���t�g�̑�Oreport.
	 */
	String RPT_UR01014_RPT3 = "UR01014.Rpt3";
	
	/**
	 * �D��No4��report.
	 */
	String RPT_NO4_1_1KEY = "No4_1_1";
	
	/**
	 * �ό�No4��report.
	 */
	String RPT_NO4_1_2KEY = "No4_1_2";
	
	/**
	 * ���t�gNo4��report.
	 */
	String RPT_NO4_2_1KEY = "No4_2_1";
	
	/**
	 * �S���tNo4��report.
	 */
	String RPT_NO4_2_2KEY = "No4_2_2";
}
