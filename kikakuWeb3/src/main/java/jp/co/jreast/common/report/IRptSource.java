package jp.co.jreast.common.report;

/**
 * <pre>
 *  IReportのソースクラス。.
 *  機能概要　：
 *  　IReportの必要ソース.
 *  特記事項　：
 * </pre>
 * @author Xbl
 *
 */
public interface IRptSource {

	/**
	 * No1ページの第一report.
	 */
	String RPT_NO1_KEY_RPT1 = "No1.Rpt1";
	/**
	 * No1ページの第二report.
	 */
	String RPT_NO1_KEY_RPT2 = "No1.Rpt2";
	
	/**
	 * No1ページの第三report.
	 */
	String RPT_NO1_KEY_RPT3 = "No1.Rpt3";
	/**
	 * No2ページのreport.
	 */
	String RPT_NO2_KEY = "No2";
	
	//宿泊ホテルno2 add by s32395 2010/01/26
	/**
	 * No2ページのreport.
	 */
	String RPT_NO2_1_KEY = "No2_1";
	/**
	 * No2ページのreport.
	 */
	String RPT_NO2_2_KEY = "No2_2";
	
	// 宿泊NO2スキー追加 2010/05/18
	/**
	 * No2ページのreport.
	 */
	String RPT_NO2_3_KEY_RPT1 = "No2_3.Rpt1";
	/**
	 * No2ページのreport.
	 */
	String RPT_NO2_3_KEY_RPT2 = "No2_3.Rpt2";
	/////////////////////////////////////////
	
	/**
	 * No3ページのreport.
	 */
	String RPT_NO3_KEY = "No3";
	
	/**
	 * No4ページのreport.
	 */
	String RPT_NO4_KEY = "No4";
	
	/**
	 * No5ページの第一report.
	 */
	String RPT_NO5_KEY_RPT1 = "No5.Rpt1";
	
	/**
	 * No5ページの第二report.
	 */
	String RPT_NO5_KEY_RPT2 = "No5.Rpt2";
	//施設付帯画面用　キー追加 START
	/**
	 * No3ページのreport旅館. add by s30873 2010/1
	 */
	String RPT_NO3FUTAI_KEY = "No3Futai";
	/**
	 * No3ページのreportホテル. add by s30873 2010/2/1
	 */
	String RPT_NO3FUTAIHOTEL_KEY = "No3FutaiHotel";
	/**
	 * No3ページのreportホテル. add by s30873 2010/2/1
	 */
	String RPT_NO3FUTAISKI_KEY = "No3FutaiSki";
	/**
	 * No5付帯用ページのreport. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT1 = "No5Futai.Rpt1";
		
	/**
	 * No5付帯用ページのreport. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT2 = "No5Futai.Rpt2";
	//施設付帯画面用　キー追加 END
	
	//追加 施設付帯画面No.5スキー用　キー START
	
	/**
	 * No5付帯用ページのreport. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT1_3 = "No5Futai.Rpt1_3";
		
	/**
	 * No5付帯用ページのreport. add by s30873 2010/1/21
	 */
	String RPT_NO5FUTAI_KEY_RPT2_3 = "No5Futai.Rpt2_3";
	
	//	//追加 施設付帯画面No.5スキー用　キー END
	/**
	 * No21ページの第一report.
	 */
	String RPT_LIFT_NO2_KEY_RPT1 = "No2.Rpt1";
	/**
	 * No21ページの第二report.
	 */
	String RPT_LIFT_NO2_KEY_RPT2 = "No2.Rpt2";
	
	/**
	 * IReportの配置文書.
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
	 * 付帯用No3sheetName .
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
	 * 船車No1のtemplete名.
	 */
	String RPT_UR01012_RPT1 = "UR01012.Rpt1";
	/**
	 * 船車No2のtemplete名.
	 */
	String RPT_UR01012_RPT2 = "UR01012.Rpt2";
	/**
	 * 船車No3のtemplete名.
	 */
	String RPT_UR01012_RPT3 = "UR01012.Rpt3";
	
	/**
	 * Golfページの第一report.
	 */
	String RPT_UR01013_RPT1 = "Golf.Rpt1";
	/**
	 * Golfページの第二report.
	 */
	String RPT_UR01013_RPT2 = "Golf.Rpt2";
	
	/**
	 * Golfページの第三report.
	 */
	String RPT_UR01013_RPT3 = "Golf.Rpt3";
	/**
	 * 観光ページの第一report.
	 */
	String RPT_UR01011_RPT1 = "Travel.Rpt1";
	/**
	 * 観光ページの第二report.
	 */
	String RPT_UR01011_RPT2 = "Travel.Rpt2";
	
	/**
	 * 観光ページの第三report.
	 */
	String RPT_UR01011_RPT3 = "Travel.Rpt3";
	
	/**
	 * リフトの第一report.
	 */
	String RPT_UR01014_RPT1 = "UR01014.Rpt1";
	/**
	 * リフトの第ニreport.
	 */
	String RPT_UR01014_RPT2 = "UR01014.Rpt2";
	/**
	 * リフトの第三report.
	 */
	String RPT_UR01014_RPT3 = "UR01014.Rpt3";
	
	/**
	 * 船車No4のreport.
	 */
	String RPT_NO4_1_1KEY = "No4_1_1";
	
	/**
	 * 観光No4のreport.
	 */
	String RPT_NO4_1_2KEY = "No4_1_2";
	
	/**
	 * リフトNo4のreport.
	 */
	String RPT_NO4_2_1KEY = "No4_2_1";
	
	/**
	 * ゴルフNo4のreport.
	 */
	String RPT_NO4_2_2KEY = "No4_2_2";
}
