package jp.co.jreast.common.data.no1data;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;
import jp.co.jreast.common.data.PlanAnsBaseData;
import jp.co.jreast.common.util.KikakuWebUtil;
/**
 * <pre>
 * NO1_ゴルフデータクラス。.
 * 機能概要    ：   NO1_ゴルフデータを格納する。
 *　特記事項    ：  無し
 * </pre>
 * @author 周安静
 * @version 0.1 2006/11/24
 */

public class No1GolfData  extends PlanAnsBaseData implements INo1CommonData{
	/**在庫番号 . */
	private String  stockNo;
	/**代表者名 . */
	private String  ownerNm;
	/**郵便番号 . */
	private String  postcode;
	/**施設住所 . */
	private String  facilityAddr;
	/**施設電話 . */
	private String  facilityTel;
	/**施設ファックス . */
	private String  facilityFax;
	/**提供期間開始年月日 . */
	private String  termFromYmd;
	/**提供期間開始日 . */
	private String termFromD;
	/**提供期間開始月 . */
	private String termFromM;
	/**提供期間開始年 . */
	private String termFromY;
	/**提供期間終了年月日 . */
	private String  termEndYmd;
	/**提供期間終了日 . */
	private String termEndD;
	/**提供期間終了月 . */
	private String termEndM;
	/**提供期間終了年 . */
	private String termEndY;
	/**手仕舞日 . */
	private String  liquidateDay;
	/**有効期間 . */
	private String  validPeriod;
	/**手仕舞通知方法用否 . */
	private String  liquidateInformFlg = JreConstants.FLG_TRUE;
	/**予約通知方法用否 . */
	private String  bookInformWayFlg = JreConstants.FLG_TRUE;
	/**通知先ファックス . */
	private String  informFax;
	/**予約種別 . */
	private String  bookKind = "61";
	/**用途 . */
	private String  bookPurpose = "3";
	/**スタート時間 . */
	private String  startTime;
	/**スタート時 . */
	private String  startTimeH;
	/**スタート分　. */
	private String  startTimeM;
	/**スタートコース . */
	private String  startCourse;
	/**取扱手数料Flag .*/
	private String dealFeeFlg;
	/**取扱手数料 . */
	private String  dealFee;
	/**取扱手数料種別 . */
	private String  dealFeeType;
	/**除外日 . */
	private String  exceptDate;
	/**キャディ付プレー可否 . */
	private String  playWithCaddieFlg = JreConstants.FLG_TRUE;
	/**キャディ料金４B . */
	private String  caddieCharge4b;
	/**キャディ料金３B . */
	private String  caddieCharge3b;
	/**キャディ料金２B . */
	private String  caddieCharge2b;
	/**キャディ料金区分 . */
	private String  caddieChargeDiv = JreConstants.CADDIE_CHARGE_DIV_1;
	/**カート料金４B . */
	private String  kartCharge4b;
	/**カート料金３B . */
	private String  kartCharge3b;
	/**カート料金２B . */
	private String  kartCharge2b;
	/**カート料金区分 . */
	private String  kartChargeDiv = JreConstants.CADDIE_CHARGE_DIV_1;
	/**セルフプレー可否 . */
	private String  selfPlayFlg = JreConstants.FLG_TRUE;
	/**セルフプレー４B . */
	private String  selfPlay4b;
	/**セルフプレー３B . */
	private String  selfPlay3b;
	/**セルフプレー２B . */
	private String  selfPlay2b;
	/**セルフプレー区分 . */
	private String  selfPlayDiv = JreConstants.CADDIE_CHARGE_DIV_1;
	/**コース名１ . */
	private String  courseName1;
	/**コースホール１ . */
	private String  courseHole1;
	/**コースバー１ . */
	private String  coursePar1;
	/**コース距離（ヤード）１ . */
	private String  courseDistance1;
	/**コース名２ . */
	private String  courseName2;
	/**コースホール２ . */
	private String  courseHole2;
	/**コースバー２ . */
	private String  coursePar2;
	/**コース距離（ヤード）２ . */
	private String  courseDistance2;
	/**コース名３ . */
	private String  courseName3;
	/**コースホール３ . */
	private String  courseHole3;
	/**コースバー３ . */
	private String  coursePar3;
	/**コース距離（ヤード）３ . */
	private String  courseDistance3;
	/**コース名４ . */
	private String  courseName4;
	/**コースホール４ . */
	private String  courseHole4;
	/**コースバー４ . */
	private String  coursePar4;
	/**コース距離（ヤード）４ . */
	private String  courseDistance4;
	/**セールスポイント . */
	private String  salesPoint;
	/**送迎有無 . */
	private String  msFlg = JreConstants.FLG_TRUE; 
	/**送迎区分 . */
	private String  msDiv = JreConstants.CADDIE_CHARGE_DIV_1;
	/**送迎の条件 . */
	private String  msTerm;
	/**客送迎有無 . */
	private String  customerMsFlg = JreConstants.FLG_FALSE;
	/**駅到着要連絡有無 . */
	private String  contactFlg = JreConstants.FLG_FALSE;
	/**要予約有無 . */
	private String  reserveFlg = JreConstants.FLG_FALSE;
	/**要予約コメント . */
	private String  reserveCmt;
	/**迎え可能時間有無 . */
	private String  meetTimeFlg = JreConstants.FLG_FALSE;
	/**迎え可能時間開始 . */
	private String  meetTimeBegin;
	/**迎え可能時間開始 . */
	private String  meetTimeBeginH;
	/**迎え可能時間開始時 . */
	private String  meetTimeBeginM;
	/**迎え可能時間終了分 . */
	private String  meetTimeEnd;
	/**迎え可能時間終了時 . */
	private String  meetTimeEndH;
	/**迎え可能時間終了分 . */
	private String  meetTimeEndM;
	/**送り可能時間有無 . */
	private String  sendTimeFlg = JreConstants.FLG_FALSE;
	/**送り可能時間開始 . */
	private String  sendTimeBegin;
	/**送り可能時間開始時 . */
	private String  sendTimeBeginH;
	/**送り可能時間開始分 . */
	private String  sendTimeBeginM;
	/**送り可能時間終了 . */
	private String  sendTimeEnd;
	/**送り可能時間終了時 . */
	private String  sendTimeEndH;
	/**送り可能時間終了分 . */
	private String  sendTimeEndM;
	/**送迎備考 . */
	private String  msMemo;
	/**シャトルバス有無 . */
	private String  shuttleBusFlg = JreConstants.FLG_FALSE;
	/**シャトルバス予約有無 . */
	private String  shuttleBusBookFlg = JreConstants.FLG_FALSE;
	/**シャトルバス予約コメント . */
	private String  shuttleBusBookCmt;
	/**シャトルバス最寄駅発時刻１ . */
	private String  nearestStationDepart1;
	/**シャトルバス最寄駅発時刻２ . */
	private String  nearestStationDepart2;
	/**シャトルバス最寄駅発時刻３ . */
	private String  nearestStationDepart3;
	/**シャトルバス最寄駅発時刻1 . */
	private String  nearestStationDepartH1;
	/**シャトルバス最寄駅発時刻２ . */
	private String  nearestStationDepartH2;
	/**シャトルバス最寄駅発時刻３ . */
	private String  nearestStationDepartH3;
	/**シャトルバス最寄駅発時刻１ . */
	private String  nearestStationDepartM1;
	/**シャトルバス最寄駅発時刻２ . */
	private String  nearestStationDepartM2;
	/**シャトルバス最寄駅発時刻３ . */
	private String  nearestStationDepartM3;
	/**シャトルバスゴルフ場発時刻１ . */
	private String  golfSpotDepart1;
	/**シャトルバスゴルフ場発時刻２ . */
	private String  golfSpotDepart2;
	/**シャトルバスゴルフ場発時刻３ . */
	private String  golfSpotDepart3;
	/**シャトルバスゴルフ場発時刻１ . */
	private String  golfSpotDepartH1;
	/**シャトルバスゴルフ場発時刻２ . */
	private String  golfSpotDepartH2;
	/**シャトルバスゴルフ場発時刻３ . */
	private String  golfSpotDepartH3;
	/**シャトルバスゴルフ場発時刻１ . */
	private String  golfSpotDepartM1;
	/**シャトルバスゴルフ場発時刻２ . */
	private String  golfSpotDepartM2;
	/**シャトルバスゴルフ場発時刻３ . */
	private String  golfSpotDepartM3;
	/**シャトルバス運行備考 . */
	private String  shuttleBusMemo;
	/**ＪＲ・私鉄再寄線路 . */
	private String  nearestRoute;
	/**ＪＲ・私鉄再寄駅 . */
	private String  nearestStation;
	/**駅より徒歩時間 . */
	private String  toStationWalktime;
	/**タクシー時間 . */
	private String  taxiTime;
	/**バス行き先 . */
	private String  busDestination;
	/**バス利用時間 . */
	private String  busTimetable;
	/**バス停名称 . */
	private String  busStation;	
	/**バス停より徒歩時間 . */
	private String  toBusStaTime;
	/**車利用高速道路 . */
	private String  highway;
	/**車利用高速道路IC . */
	private String  accessIc;
	/**車利用自動車道 . */
	private String  autoRoadway;
	/**車利用普通道路 . */
	private String  genreralRoadway;
	/**車利用国道 . */
	private String  nationalRoadway;
	/**車利用県道 . */
	private String  countyRoadway;
	/**車利用距離 . */
	private String  availableDistance;
	/**車利用時間 . */
	private String  accessTime;
	/**自由入力欄 . */
	private String  freelyColumn;
	/**
	 * 1名料金フラグ.
	 */
	private String onePersonFlg;
	/**
	 * JRと私鉄の区分.
	 */
	private String stationDiv;
	/**
	 * @return Returns the accessIc.
	 */
	public String getAccessIc() {
		return accessIc;
	}
	/**
	 * @param accessIc The accessIc to set.
	 */
	public void setAccessIc(String accessIc) {
		this.accessIc = accessIc;
	}
	/**
	 * @return Returns the accessTime.
	 */
	public String getAccessTime() {
		return accessTime;
	}
	/**
	 * @param accessTime The accessTime to set.
	 */
	public void setAccessTime(String accessTime) {
		this.accessTime = accessTime;
	}
	/**
	 * @return Returns the autoRoadway.
	 */
	public String getAutoRoadway() {
		return autoRoadway;
	}
	/**
	 * @param autoRoadway The autoRoadway to set.
	 */
	public void setAutoRoadway(String autoRoadway) {
		this.autoRoadway = autoRoadway;
	}
	/**
	 * @return Returns the availableDistance.
	 */
	public String getAvailableDistance() {
		return availableDistance;
	}
	/**
	 * @param availableDistance The availableDistance to set.
	 */
	public void setAvailableDistance(String availableDistance) {
		this.availableDistance = availableDistance;
	}
	/**
	 * @return Returns the bookInformWayFlg.
	 */
	public String getBookInformWayFlg() {
		return bookInformWayFlg;
	}
	/**
	 * @param bookInformWayFlg The bookInformWayFlg to set.
	 */
	public void setBookInformWayFlg(String bookInformWayFlg) {
		this.bookInformWayFlg = bookInformWayFlg;
	}
	/**
	 * @return Returns the bookKind.
	 */
	public String getBookKind() {
		return bookKind;
	}
	/**
	 * @param bookKind The bookKind to set.
	 */
	public void setBookKind(String bookKind) {
		this.bookKind = bookKind;
	}
	/**
	 * @return Returns the bookPurpose.
	 */
	public String getBookPurpose() {
		return bookPurpose;
	}
	/**
	 * @param bookPurpose The bookPurpose to set.
	 */
	public void setBookPurpose(String bookPurpose) {
		this.bookPurpose = bookPurpose;
	}
	/**
	 * @return Returns the busDestination.
	 */
	public String getBusDestination() {
		return busDestination;
	}
	/**
	 * @param busDestination The busDestination to set.
	 */
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	/**
	 * @return Returns the busTimetable.
	 */
	public String getBusTimetable() {
		return busTimetable;
	}
	/**
	 * @param busTimetable The busTimetable to set.
	 */
	public void setBusTimetable(String busTimetable) {
		this.busTimetable = busTimetable;
	}
	/**
	 * @return Returns the busStation.
	 */
	public String getBusStation() {
		return busStation;
	}
	/**
	 * @param bs The busStation to set.
	 */
	public void setBusStation(String bs) {
		this.busStation = bs;
	}	
	/**
	 * @return Returns the caddieCharge2b.
	 */
	public String getCaddieCharge2b() {
		return caddieCharge2b;
	}
	/**
	 * @param caddieCharge2b The caddieCharge2b to set.
	 */
	public void setCaddieCharge2b(String caddieCharge2b) {
		this.caddieCharge2b = caddieCharge2b;
	}
	/**
	 * @return Returns the caddieCharge3b.
	 */
	public String getCaddieCharge3b() {
		return caddieCharge3b;
	}
	/**
	 * @param caddieCharge3b The caddieCharge3b to set.
	 */
	public void setCaddieCharge3b(String caddieCharge3b) {
		this.caddieCharge3b = caddieCharge3b;
	}
	/**
	 * @return Returns the caddieCharge4b.
	 */
	public String getCaddieCharge4b() {
		return caddieCharge4b;
	}
	/**
	 * @param caddieCharge4b The caddieCharge4b to set.
	 */
	public void setCaddieCharge4b(String caddieCharge4b) {
		this.caddieCharge4b = caddieCharge4b;
	}
	/**
	 * @return Returns the caddieChargeDiv.
	 */
	public String getCaddieChargeDiv() {
		return caddieChargeDiv;
	}
	/**
	 * @param caddieChargeDiv The caddieChargeDiv to set.
	 */
	public void setCaddieChargeDiv(String caddieChargeDiv) {
		this.caddieChargeDiv = caddieChargeDiv;
	}
	/**
	 * @return Returns the contactFlg.
	 */
	public String getContactFlg() {
		return contactFlg;
	}
	/**
	 * @param contactFlg The contactFlg to set.
	 */
	public void setContactFlg(String contactFlg) {
		this.contactFlg = contactFlg;
	}
	/**
	 * @return Returns the countyRoadway.
	 */
	public String getCountyRoadway() {
		return countyRoadway;
	}
	/**
	 * @param countyRoadway The countyRoadway to set.
	 */
	public void setCountyRoadway(String countyRoadway) {
		this.countyRoadway = countyRoadway;
	}
	/**
	 * @return Returns the courseDistance1.
	 */
	public String getCourseDistance1() {
		return courseDistance1;
	}
	/**
	 * @param courseDistance1 The courseDistance1 to set.
	 */
	public void setCourseDistance1(String courseDistance1) {
		this.courseDistance1 = courseDistance1;
	}
	/**
	 * @return Returns the courseDistance2.
	 */
	public String getCourseDistance2() {
		return courseDistance2;
	}
	/**
	 * @param courseDistance2 The courseDistance2 to set.
	 */
	public void setCourseDistance2(String courseDistance2) {
		this.courseDistance2 = courseDistance2;
	}
	/**
	 * @return Returns the courseDistance3.
	 */
	public String getCourseDistance3() {
		return courseDistance3;
	}
	/**
	 * @param courseDistance3 The courseDistance3 to set.
	 */
	public void setCourseDistance3(String courseDistance3) {
		this.courseDistance3 = courseDistance3;
	}
	/**
	 * @return Returns the courseDistance4.
	 */
	public String getCourseDistance4() {
		return courseDistance4;
	}
	/**
	 * @param courseDistance4 The courseDistance4 to set.
	 */
	public void setCourseDistance4(String courseDistance4) {
		this.courseDistance4 = courseDistance4;
	}
	/**
	 * @return Returns the courseHole1.
	 */
	public String getCourseHole1() {
		return courseHole1;
	}
	/**
	 * @param courseHole1 The courseHole1 to set.
	 */
	public void setCourseHole1(String courseHole1) {
		this.courseHole1 = courseHole1;
	}
	/**
	 * @return Returns the courseHole2.
	 */
	public String getCourseHole2() {
		return courseHole2;
	}
	/**
	 * @param courseHole2 The courseHole2 to set.
	 */
	public void setCourseHole2(String courseHole2) {
		this.courseHole2 = courseHole2;
	}
	/**
	 * @return Returns the courseHole3.
	 */
	public String getCourseHole3() {
		return courseHole3;
	}
	/**
	 * @param courseHole3 The courseHole3 to set.
	 */
	public void setCourseHole3(String courseHole3) {
		this.courseHole3 = courseHole3;
	}
	/**
	 * @return Returns the courseHole4.
	 */
	public String getCourseHole4() {
		return courseHole4;
	}
	/**
	 * @param courseHole4 The courseHole4 to set.
	 */
	public void setCourseHole4(String courseHole4) {
		this.courseHole4 = courseHole4;
	}
	/**
	 * @return Returns the courseName1.
	 */
	public String getCourseName1() {
		return courseName1;
	}
	/**
	 * @param courseName1 The courseName1 to set.
	 */
	public void setCourseName1(String courseName1) {
		this.courseName1 = courseName1;
	}
	/**
	 * @return Returns the courseName2.
	 */
	public String getCourseName2() {
		return courseName2;
	}
	/**
	 * @param courseName2 The courseName2 to set.
	 */
	public void setCourseName2(String courseName2) {
		this.courseName2 = courseName2;
	}
	/**
	 * @return Returns the courseName3.
	 */
	public String getCourseName3() {
		return courseName3;
	}
	/**
	 * @param courseName3 The courseName3 to set.
	 */
	public void setCourseName3(String courseName3) {
		this.courseName3 = courseName3;
	}
	/**
	 * @return Returns the courseName4.
	 */
	public String getCourseName4() {
		return courseName4;
	}
	/**
	 * @param courseName4 The courseName4 to set.
	 */
	public void setCourseName4(String courseName4) {
		this.courseName4 = courseName4;
	}
	/**
	 * @return Returns the coursePar1.
	 */
	public String getCoursePar1() {
		return coursePar1;
	}
	/**
	 * @param coursePar1 The coursePar1 to set.
	 */
	public void setCoursePar1(String coursePar1) {
		this.coursePar1 = coursePar1;
	}
	/**
	 * @return Returns the coursePar2.
	 */
	public String getCoursePar2() {
		return coursePar2;
	}
	/**
	 * @param coursePar2 The coursePar2 to set.
	 */
	public void setCoursePar2(String coursePar2) {
		this.coursePar2 = coursePar2;
	}
	/**
	 * @return Returns the coursePar3.
	 */
	public String getCoursePar3() {
		return coursePar3;
	}
	/**
	 * @param coursePar3 The coursePar3 to set.
	 */
	public void setCoursePar3(String coursePar3) {
		this.coursePar3 = coursePar3;
	}
	/**
	 * @return Returns the coursePar4.
	 */
	public String getCoursePar4() {
		return coursePar4;
	}
	/**
	 * @param coursePar4 The coursePar4 to set.
	 */
	public void setCoursePar4(String coursePar4) {
		this.coursePar4 = coursePar4;
	}
	/**
	 * @return Returns the customerMsFlg.
	 */
	public String getCustomerMsFlg() {
		return customerMsFlg;
	}
	/**
	 * @param customerMsFlg The customerMsFlg to set.
	 */
	public void setCustomerMsFlg(String customerMsFlg) {
		this.customerMsFlg = customerMsFlg;
	}
	/**
	 * @return Returns the dealFee.
	 */
	public String getDealFee() {
		
		//取扱手数料種別は円の場合、小数を切り捨てる
		if (JreConstants.EnTypeFlg.equals(getDealFeeType())) {
			//数字ではないの場合、そのまま返す. jinhuashi 720501
			if (!KikakuWebUtil.isNumber(dealFee) && !KikakuWebUtil.isFloat(dealFee)) {
				return dealFee;
			}
			if (!StringUtil.isEmpty(dealFee) && dealFee.length() > 0) {
				int dealFeeValue = Float.valueOf(dealFee).intValue();
				dealFee = String.valueOf(dealFeeValue);
			}
			
			return dealFee;
		} else {
			return dealFee;
		}
		
	}
	/**
	 * @param dealFee The dealFee to set.
	 */
	public void setDealFee(String dealFee) {
		this.dealFee = dealFee;
	}
	/**
	 * @return Returns the dealFeeType.
	 */
	public String getDealFeeType() {
		return dealFeeType;
	}
	/**
	 * @param dealFeeType The dealFeeType to set.
	 */
	public void setDealFeeType(String dealFeeType) {
		this.dealFeeType = dealFeeType;
	}
	/**
	 * @return Returns the exceptDate.
	 */
	public String getExceptDate() {
		return exceptDate;
	}
	/**
	 * @param exceptDate The exceptDate to set.
	 */
	public void setExceptDate(String exceptDate) {
		this.exceptDate = exceptDate;
	}
	/**
	 * @return Returns the facilityAddr.
	 */
	public String getFacilityAddr() {
		return facilityAddr;
	}
	/**
	 * @param facilityAddr The facilityAddr to set.
	 */
	public void setFacilityAddr(String facilityAddr) {
		this.facilityAddr = facilityAddr;
	}
	/**
	 * @return Returns the facilityFax.
	 */
	public String getFacilityFax() {
		return facilityFax == null ? "" : facilityFax.trim();
	}
	/**
	 * @param facilityFax The facilityFax to set.
	 */
	public void setFacilityFax(String facilityFax) {
		this.facilityFax = facilityFax;
	}
	/**
	 * @return Returns the facilityTel.
	 */
	public String getFacilityTel() {
		return facilityTel == null ? "" : facilityTel.trim();
	}
	/**
	 * @param facilityTel The facilityTel to set.
	 */
	public void setFacilityTel(String facilityTel) {
		this.facilityTel = facilityTel;
	}
	/**
	 * @return Returns the freelyColumn.
	 */
	public String getFreelyColumn() {
		return freelyColumn;
	}
	/**
	 * @param freelyColumn The freelyColumn to set.
	 */
	public void setFreelyColumn(String freelyColumn) {
		this.freelyColumn = freelyColumn;
	}
	/**
	 * @return Returns the genreralRoadway.
	 */
	public String getGenreralRoadway() {
		return genreralRoadway;
	}
	/**
	 * @param genreralRoadway The genreralRoadway to set.
	 */
	public void setGenreralRoadway(String genreralRoadway) {
		this.genreralRoadway = genreralRoadway;
	}
	/**
	 * @return Returns the golfSpotDepart1.
	 */
	public String getGolfSpotDepart1() {
		return golfSpotDepart1;
	}
	/**
	 * @param golfSpotDepart1 The golfSpotDepart1 to set.
	 */
	public void setGolfSpotDepart1(String golfSpotDepart1) {
		this.golfSpotDepart1 = golfSpotDepart1;
		if (!StringUtil.isEmpty(this.golfSpotDepart1)) {
			this.golfSpotDepartH1 = golfSpotDepart1.substring(0, 2);
			this.golfSpotDepartM1 = golfSpotDepart1.substring(2, 4);
		} else {
			this.golfSpotDepartH1 = "";
			this.golfSpotDepartM1 = "";
		}
	}
	/**
	 * @return Returns the golfSpotDepart2.
	 */
	public String getGolfSpotDepart2() {
		return golfSpotDepart2;
	}
	/**
	 * @param golfSpotDepart2 The golfSpotDepart2 to set.
	 */
	public void setGolfSpotDepart2(String golfSpotDepart2) {
		this.golfSpotDepart2 = golfSpotDepart2;
		if (!StringUtil.isEmpty(this.golfSpotDepart2)) {
			this.golfSpotDepartH2 = golfSpotDepart2.substring(0, 2);
			this.golfSpotDepartM2 = golfSpotDepart2.substring(2, 4);
		} else {
			this.golfSpotDepartH2 = "";
			this.golfSpotDepartM2 = "";
		}
	}
	/**
	 * @return Returns the golfSpotDepart3.
	 */
	public String getGolfSpotDepart3() {
		return golfSpotDepart3;
	}
	/**
	 * @param golfSpotDepart3 The golfSpotDepart3 to set.
	 */
	public void setGolfSpotDepart3(String golfSpotDepart3) {
		this.golfSpotDepart3 = golfSpotDepart3;
		if (!StringUtil.isEmpty(this.golfSpotDepart3)) {
			this.golfSpotDepartH3 = golfSpotDepart3.substring(0, 2);
			this.golfSpotDepartM3 = golfSpotDepart3.substring(2, 4);
		} else {
			this.golfSpotDepartH3 = "";
			this.golfSpotDepartM3 = "";
		}
	}
	/**
	 * @return Returns the golfSpotDepartH1.
	 */
	public String getGolfSpotDepartH1() {
		return golfSpotDepartH1;
	}
	/**
	 * @param golfSpotDepartH1 The golfSpotDepartH1 to set.
	 */
	public void setGolfSpotDepartH1(String golfSpotDepartH1) {
		if (KikakuWebUtil.isNumber(golfSpotDepartH1)) {
			this.golfSpotDepartH1 = StringUtil.lpad(StringUtil.toHalf(golfSpotDepartH1).trim(),
					2, '0');
		} else {
			this.golfSpotDepartH1 = golfSpotDepartH1;
		}
		
	}
	/**
	 * @return Returns the golfSpotDepartH2.
	 */
	public String getGolfSpotDepartH2() {
		return golfSpotDepartH2;
	}
	/**
	 * @param golfSpotDepartH2 The golfSpotDepartH2 to set.
	 */
	public void setGolfSpotDepartH2(String golfSpotDepartH2) {
		if (KikakuWebUtil.isNumber(golfSpotDepartH2)) {
			this.golfSpotDepartH2 = StringUtil.lpad(StringUtil.toHalf(
					golfSpotDepartH2).trim(), 2, '0');
		} else {
			this.golfSpotDepartH2 = golfSpotDepartH2;
		}
	}
	/**
	 * @return Returns the golfSpotDepartH3.
	 */
	public String getGolfSpotDepartH3() {
		return golfSpotDepartH3;
	}
	/**
	 * @param golfSpotDepartH3 The golfSpotDepartH3 to set.
	 */
	public void setGolfSpotDepartH3(String golfSpotDepartH3) {
		if (KikakuWebUtil.isNumber(golfSpotDepartH3)) {
			this.golfSpotDepartH3 = StringUtil.lpad(StringUtil.toHalf(golfSpotDepartH3).trim(),
					2, '0');
		} else {
			this.golfSpotDepartH3 = golfSpotDepartH3;
		}
		
	}
	/**
	 * @return Returns the golfSpotDepartM1.
	 */
	public String getGolfSpotDepartM1() {
		return golfSpotDepartM1;
	}
	/**
	 * @param golfSpotDepartM1 The golfSpotDepartM1 to set.
	 */
	public void setGolfSpotDepartM1(String golfSpotDepartM1) {
		if (KikakuWebUtil.isNumber(golfSpotDepartM1)) {
			this.golfSpotDepartM1 = StringUtil.lpad(StringUtil.toHalf(golfSpotDepartM1).trim(),
					2, '0');
		} else {
			this.golfSpotDepartM1 = golfSpotDepartM1;
		}
		
	}
	/**
	 * @return Returns the golfSpotDepartM2.
	 */
	public String getGolfSpotDepartM2() {
		return golfSpotDepartM2;
	}
	/**
	 * @param golfSpotDepartM2 The golfSpotDepartM2 to set.
	 */
	public void setGolfSpotDepartM2(String golfSpotDepartM2) {
		if (KikakuWebUtil.isNumber(golfSpotDepartM2)) {
			this.golfSpotDepartM2 = StringUtil.lpad(StringUtil.toHalf(golfSpotDepartM2).trim(),
					2, '0');
		} else {
			this.golfSpotDepartM2 = golfSpotDepartM2;
		}
		
	}
	/**
	 * @return Returns the golfSpotDepartM3.
	 */
	public String getGolfSpotDepartM3() {
		return golfSpotDepartM3;
	}
	/**
	 * @param golfSpotDepartM3 The golfSpotDepartM3 to set.
	 */
	public void setGolfSpotDepartM3(String golfSpotDepartM3) {
		if (KikakuWebUtil.isNumber(golfSpotDepartM3)) {
			this.golfSpotDepartM3 = StringUtil.lpad(StringUtil.toHalf(golfSpotDepartM3).trim(),
					2, '0');
		} else {
			this.golfSpotDepartM3 = golfSpotDepartM3;
		}
		
	}
	/**
	 * @return Returns the highway.
	 */
	public String getHighway() {
		return highway;
	}
	/**
	 * @param highway The highway to set.
	 */
	public void setHighway(String highway) {
		this.highway = highway;
	}
	/**
	 * @return Returns the informFax.
	 */
	public String getInformFax() {
		return informFax;
	}
	/**
	 * @param informFax The informFax to set.
	 */
	public void setInformFax(String informFax) {
		this.informFax = informFax;
	}
	/**
	 * @return Returns the kartCharge2b.
	 */
	public String getKartCharge2b() {
		return kartCharge2b;
	}
	/**
	 * @param kartCharge2b The kartCharge2b to set.
	 */
	public void setKartCharge2b(String kartCharge2b) {
		this.kartCharge2b = kartCharge2b;
	}
	/**
	 * @return Returns the kartCharge3b.
	 */
	public String getKartCharge3b() {
		return kartCharge3b;
	}
	/**
	 * @param kartCharge3b The kartCharge3b to set.
	 */
	public void setKartCharge3b(String kartCharge3b) {
		this.kartCharge3b = kartCharge3b;
	}
	/**
	 * @return Returns the kartCharge4b.
	 */
	public String getKartCharge4b() {
		return kartCharge4b;
	}
	/**
	 * @param kartCharge4b The kartCharge4b to set.
	 */
	public void setKartCharge4b(String kartCharge4b) {
		this.kartCharge4b = kartCharge4b;
	}
	/**
	 * @return Returns the kartChargeDiv.
	 */
	public String getKartChargeDiv() {
		return kartChargeDiv;
	}
	/**
	 * @param kartChargeDiv The kartChargeDiv to set.
	 */
	public void setKartChargeDiv(String kartChargeDiv) {
		this.kartChargeDiv = kartChargeDiv;
	}
	/**
	 * @return Returns the liquidateDay.
	 */
	public String getLiquidateDay() {
		return liquidateDay;
	}
	/**
	 * @param liquidateDay The liquidateDay to set.
	 */
	public void setLiquidateDay(String liquidateDay) {
		this.liquidateDay = liquidateDay;
	}
	/**
	 * @return Returns the liquidateInformFlg.
	 */
	public String getLiquidateInformFlg() {
		return liquidateInformFlg;
	}
	/**
	 * @param liquidateInformFlg The liquidateInformFlg to set.
	 */
	public void setLiquidateInformFlg(String liquidateInformFlg) {
		this.liquidateInformFlg = liquidateInformFlg;
	}
	/**
	 * @return Returns the meetTimeBegin.
	 */
	public String getMeetTimeBegin() {
		return meetTimeBegin;
	}
	/**
	 * @param meetTimeBegin The meetTimeBegin to set.
	 */
	public void setMeetTimeBegin(String meetTimeBegin) {
		this.meetTimeBegin = meetTimeBegin;
		if (!StringUtil.isEmpty(this.meetTimeBegin)) {
			this.meetTimeBeginH = meetTimeBegin.substring(0, 2);
			this.meetTimeBeginM = meetTimeBegin.substring(2, 4);
		} else {
			this.meetTimeBeginH = "";
			this.meetTimeBeginM = "";
		}
	}
	/**
	 * @return Returns the meetTimeBeginH.
	 */
	public String getMeetTimeBeginH() {
		return meetTimeBeginH;
	}
	/**
	 * @param meetTimeBeginH The meetTimeBeginH to set.
	 */
	public void setMeetTimeBeginH(String meetTimeBeginH) {
		if (KikakuWebUtil.isNumber(meetTimeBeginH)) {
			this.meetTimeBeginH = StringUtil.lpad(StringUtil.toHalf(meetTimeBeginH).trim(),
					2, '0');
		} else {
			this.meetTimeBeginH = meetTimeBeginH;
		}
		
	}
	/**
	 * @return Returns the meetTimeBeginM.
	 */
	public String getMeetTimeBeginM() {
		return meetTimeBeginM;
	}
	/**
	 * @param meetTimeBeginM The meetTimeBeginM to set.
	 */
	public void setMeetTimeBeginM(String meetTimeBeginM) {
		if (KikakuWebUtil.isNumber(meetTimeBeginM)) {
			this.meetTimeBeginM = StringUtil.lpad(StringUtil.toHalf(meetTimeBeginM).trim(),
					2, '0');
		} else {
			this.meetTimeBeginM = meetTimeBeginM;
		}
		
	}
	/**
	 * @return Returns the meetTimeEnd.
	 */
	public String getMeetTimeEnd() {
		return meetTimeEnd;
		
	}
	/**
	 * @param meetTimeEnd The meetTimeEnd to set.
	 */
	public void setMeetTimeEnd(String meetTimeEnd) {
		this.meetTimeEnd = meetTimeEnd;
		if (!StringUtil.isEmpty(this.meetTimeEnd)) {
			this.meetTimeEndH = meetTimeEnd.substring(0, 2);
			this.meetTimeEndM = meetTimeEnd.substring(2, 4);
		} else {
			this.meetTimeEndH = "";
			this.meetTimeEndM = "";
		}
	}
	/**
	 * @return Returns the meetTimeEndH.
	 */
	public String getMeetTimeEndH() {
		return meetTimeEndH;
	}
	/**
	 * @param meetTimeEndH The meetTimeEndH to set.
	 */
	public void setMeetTimeEndH(String meetTimeEndH) {
		if (KikakuWebUtil.isNumber(meetTimeEndH)) {
			this.meetTimeEndH = StringUtil.lpad(StringUtil.toHalf(meetTimeEndH).trim(),
					2, '0');
		} else {
			this.meetTimeEndH = meetTimeEndH;
		}
		
	}
	/**
	 * @return Returns the meetTimeEndM.
	 */
	public String getMeetTimeEndM() {
		return meetTimeEndM;
	}
	/**
	 * @param meetTimeEndM The meetTimeEndM to set.
	 */
	public void setMeetTimeEndM(String meetTimeEndM) {
		if (KikakuWebUtil.isNumber(meetTimeEndM)) {
			this.meetTimeEndM =  StringUtil.lpad(StringUtil.toHalf(meetTimeEndM).trim(),
					2, '0');
		} else {
			this.meetTimeEndM = meetTimeEndM;
		}
		
	}
	/**
	 * @return Returns the meetTimeFlg.
	 */
	public String getMeetTimeFlg() {
		return meetTimeFlg;
	}
	/**
	 * @param meetTimeFlg The meetTimeFlg to set.
	 */
	public void setMeetTimeFlg(String meetTimeFlg) {
		this.meetTimeFlg = meetTimeFlg;
	}
	/**
	 * @return Returns the msDiv.
	 */
	public String getMsDiv() {
		return msDiv;
	}
	/**
	 * @param msDiv The msDiv to set.
	 */
	public void setMsDiv(String msDiv) {
		this.msDiv = msDiv;
	}
	/**
	 * @return Returns the msFlg.
	 */
	public String getMsFlg() {
		return msFlg;
	}
	/**
	 * @param msFlg The msFlg to set.
	 */
	public void setMsFlg(String msFlg) {
		this.msFlg = msFlg;
	}
	/**
	 * @return Returns the msMemo.
	 */
	public String getMsMemo() {
		return msMemo;
	}
	/**
	 * @param msMemo The msMemo to set.
	 */
	public void setMsMemo(String msMemo) {
		this.msMemo = msMemo;
	}
	/**
	 * @return Returns the msTerm.
	 */
	public String getMsTerm() {
		return msTerm;
	}
	/**
	 * @param msTerm The msTerm to set.
	 */
	public void setMsTerm(String msTerm) {
		this.msTerm = msTerm;
	}
	/**
	 * @return Returns the nationalRoadway.
	 */
	public String getNationalRoadway() {
		return nationalRoadway;
	}
	/**
	 * @param nationalRoadway The nationalRoadway to set.
	 */
	public void setNationalRoadway(String nationalRoadway) {
		this.nationalRoadway = nationalRoadway;
	}
	/**
	 * @return Returns the nearestRoute.
	 */
	public String getNearestRoute() {
		return nearestRoute;
	}
	/**
	 * @param nearestRoute The nearestRoute to set.
	 */
	public void setNearestRoute(String nearestRoute) {
		this.nearestRoute = nearestRoute;
	}
	/**
	 * @return Returns the nearestStation.
	 */
	public String getNearestStation() {
		return nearestStation;
	}
	/**
	 * @param nearestStation The nearestStation to set.
	 */
	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}
	/**
	 * @return Returns the nearestStationDepart1.
	 */
	public String getNearestStationDepart1() {
		return nearestStationDepart1;
	}
	/**
	 * @param nearestStationDepart1 The nearestStationDepart1 to set.
	 */
	public void setNearestStationDepart1(String nearestStationDepart1) {
		this.nearestStationDepart1 = nearestStationDepart1;
		if (!StringUtil.isEmpty(this.nearestStationDepart1)) {
			this.nearestStationDepartH1 = nearestStationDepart1.substring(0, 2);
			this.nearestStationDepartM1 = nearestStationDepart1.substring(2, 4);
		} else {
			this.nearestStationDepartH1 = "";
			this.nearestStationDepartM1 = "";
		}
	}
	/**
	 * @return Returns the nearestStationDepart2.
	 */
	public String getNearestStationDepart2() {
		return nearestStationDepart2;
	}
	/**
	 * @param nearestStationDepart2 The nearestStationDepart2 to set.
	 */
	public void setNearestStationDepart2(String nearestStationDepart2) {
		this.nearestStationDepart2 = nearestStationDepart2;
		if (!StringUtil.isEmpty(this.nearestStationDepart2)) {
			this.nearestStationDepartH2 = nearestStationDepart2.substring(0, 2);
			this.nearestStationDepartM2 = nearestStationDepart2.substring(2, 4);
		} else {
			this.nearestStationDepartH2 = "";
			this.nearestStationDepartM2 = "";
		}
	}
	/**
	 * @return Returns the nearestStationDepart3.
	 */
	public String getNearestStationDepart3() {
		return nearestStationDepart3;
		
	}
	/**
	 * @param nearestStationDepart3 The nearestStationDepart3 to set.
	 */
	public void setNearestStationDepart3(String nearestStationDepart3) {
		this.nearestStationDepart3 = nearestStationDepart3;
		if (!StringUtil.isEmpty(this.nearestStationDepart3)) {
			this.nearestStationDepartH3 = nearestStationDepart3.substring(0, 2);
			this.nearestStationDepartM3 = nearestStationDepart3.substring(2, 4);
		} else {
			this.nearestStationDepartH3 = "";
			this.nearestStationDepartM3 = "";
		}
	}
	/**
	 * @return Returns the nearestStationDepartH1.
	 */
	public String getNearestStationDepartH1() {
		return nearestStationDepartH1;
	}
	/**
	 * @param nearestStationDepartH1 The nearestStationDepartH1 to set.
	 */
	public void setNearestStationDepartH1(String nearestStationDepartH1) {
		if (KikakuWebUtil.isNumber(nearestStationDepartH1)) {
			this.nearestStationDepartH1 = StringUtil.lpad(StringUtil.toHalf(nearestStationDepartH1).trim(),
					2, '0');
		} else {
			this.nearestStationDepartH1 = nearestStationDepartH1;
		}
		
	}
	/**
	 * @return Returns the nearestStationDepartH2.
	 */
	public String getNearestStationDepartH2() {
		return nearestStationDepartH2;
	}
	/**
	 * @param nearestStationDepartH2 The nearestStationDepartH2 to set.
	 */
	public void setNearestStationDepartH2(String nearestStationDepartH2) {
		if (KikakuWebUtil.isNumber(nearestStationDepartH2)) {
			this.nearestStationDepartH2 = StringUtil.lpad(StringUtil.toHalf(nearestStationDepartH2).trim(),
					2, '0');
		} else {
			this.nearestStationDepartH2 = nearestStationDepartH2;
		}
	}
	/**
	 * @return Returns the nearestStationDepartH3.
	 */
	public String getNearestStationDepartH3() {
		return nearestStationDepartH3;
		
	}
	/**
	 * @param nearestStationDepartH3 The nearestStationDepartH3 to set.
	 */
	public void setNearestStationDepartH3(String nearestStationDepartH3) {
		if (KikakuWebUtil.isNumber(nearestStationDepartH3)) {
			this.nearestStationDepartH3 = StringUtil.lpad(StringUtil.toHalf(nearestStationDepartH3).trim(),
					2, '0');	
		} else {
			this.nearestStationDepartH3 = nearestStationDepartH3;
		}
		
	}
	/**
	 * @return Returns the nearestStationDepartM1.
	 */
	public String getNearestStationDepartM1() {
		return nearestStationDepartM1;
	}
	/**
	 * @param nearestStationDepartM1 The nearestStationDepartM1 to set.
	 */
	public void setNearestStationDepartM1(String nearestStationDepartM1) {
		if (KikakuWebUtil.isNumber(nearestStationDepartM1)) {
			this.nearestStationDepartM1 = StringUtil.lpad(StringUtil.toHalf(nearestStationDepartM1).trim(),
					2, '0');
		} else {
			this.nearestStationDepartM1 = nearestStationDepartM1;
		}
	}
	/**
	 * @return Returns the nearestStationDepartM2.
	 */
	public String getNearestStationDepartM2() {
		return nearestStationDepartM2;
	}
	/**
	 * @param nearestStationDepartM2 The nearestStationDepartM2 to set.
	 */
	public void setNearestStationDepartM2(String nearestStationDepartM2) {
		if (KikakuWebUtil.isNumber(nearestStationDepartM2)) {
			this.nearestStationDepartM2 = StringUtil.lpad(StringUtil.toHalf(nearestStationDepartM2).trim(),
					2, '0');	
		} else {
			this.nearestStationDepartM2 = nearestStationDepartM2;
		}
		
	}
	/**
	 * @return Returns the nearestStationDepartM3.
	 */
	public String getNearestStationDepartM3() {
		return nearestStationDepartM3;
	}
	/**
	 * @param nearestStationDepartM3 The nearestStationDepartM3 to set.
	 */
	public void setNearestStationDepartM3(String nearestStationDepartM3) {
		if (KikakuWebUtil.isNumber(nearestStationDepartM3)) {
			this.nearestStationDepartM3 = StringUtil.lpad(StringUtil.toHalf(nearestStationDepartM3).trim(),
					2, '0');
		} else {
			this.nearestStationDepartM3 = nearestStationDepartM3;
		}
		
	}
	/**
	 * @return Returns the ownerNm.
	 */
	public String getOwnerNm() {
		return ownerNm;
	}
	/**
	 * @param ownerNm The ownerNm to set.
	 */
	public void setOwnerNm(String ownerNm) {
		this.ownerNm = ownerNm;
	}
	/**
	 * @return Returns the playWithCaddieFlg.
	 */
	public String getPlayWithCaddieFlg() {
		return playWithCaddieFlg;
	}
	/**
	 * @param playWithCaddieFlg The playWithCaddieFlg to set.
	 */
	public void setPlayWithCaddieFlg(String playWithCaddieFlg) {
		this.playWithCaddieFlg = playWithCaddieFlg;
	}
	/**
	 * @return Returns the postcode.
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode The postcode to set.
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * @return Returns the reserveCmt.
	 */
	public String getReserveCmt() {
		return reserveCmt;
	}
	/**
	 * @param reserveCmt The reserveCmt to set.
	 */
	public void setReserveCmt(String reserveCmt) {
		this.reserveCmt = reserveCmt;
	}
	/**
	 * @return Returns the reserveFlg.
	 */
	public String getReserveFlg() {
		return reserveFlg;
	}
	/**
	 * @param reserveFlg The reserveFlg to set.
	 */
	public void setReserveFlg(String reserveFlg) {
		this.reserveFlg = reserveFlg;
	}
	/**
	 * @return Returns the salesPoint.
	 */
	public String getSalesPoint() {
		return salesPoint;
	}
	/**
	 * @param salesPoint The salesPoint to set.
	 */
	public void setSalesPoint(String salesPoint) {
		this.salesPoint = salesPoint;
	}
	/**
	 * @return Returns the selfPlay2b.
	 */
	public String getSelfPlay2b() {
		return selfPlay2b;
	}
	/**
	 * @param selfPlay2b The selfPlay2b to set.
	 */
	public void setSelfPlay2b(String selfPlay2b) {
		this.selfPlay2b = selfPlay2b;
	}
	/**
	 * @return Returns the selfPlay3b.
	 */
	public String getSelfPlay3b() {
		return selfPlay3b;
	}
	/**
	 * @param selfPlay3b The selfPlay3b to set.
	 */
	public void setSelfPlay3b(String selfPlay3b) {
		this.selfPlay3b = selfPlay3b;
	}
	/**
	 * @return Returns the selfPlay4b.
	 */
	public String getSelfPlay4b() {
		return selfPlay4b;
	}
	/**
	 * @param selfPlay4b The selfPlay4b to set.
	 */
	public void setSelfPlay4b(String selfPlay4b) {
		this.selfPlay4b = selfPlay4b;
	}
	/**
	 * @return Returns the selfPlayDiv.
	 */
	public String getSelfPlayDiv() {
		return selfPlayDiv;
	}
	/**
	 * @param selfPlayDiv The selfPlayDiv to set.
	 */
	public void setSelfPlayDiv(String selfPlayDiv) {
		this.selfPlayDiv = selfPlayDiv;
	}
	/**
	 * @return Returns the selfPlayFlg.
	 */
	public String getSelfPlayFlg() {
		return selfPlayFlg;
	}
	/**
	 * @param selfPlayFlg The selfPlayFlg to set.
	 */
	public void setSelfPlayFlg(String selfPlayFlg) {
		this.selfPlayFlg = selfPlayFlg;
	}
	/**
	 * @return Returns the sendTimeBegin.
	 */
	public String getSendTimeBegin() {
		return sendTimeBegin;
	}
	/**
	 * @param sendTimeBegin The sendTimeBegin to set.
	 */
	public void setSendTimeBegin(String sendTimeBegin) {
		this.sendTimeBegin = sendTimeBegin;
		if (!StringUtil.isEmpty(this.sendTimeBegin)) {
			this.sendTimeBeginH = sendTimeBegin.substring(0, 2);
			this.sendTimeBeginM = sendTimeBegin.substring(2, 4);
		} else {
			this.sendTimeBeginH = "";
			this.sendTimeBeginM = "";
		}
	}
	/**
	 * @return Returns the sendTimeBeginH.
	 */
	public String getSendTimeBeginH() {
		return sendTimeBeginH;
	}
	/**
	 * @param sendTimeBeginH The sendTimeBeginH to set.
	 */
	public void setSendTimeBeginH(String sendTimeBeginH) {
		if (KikakuWebUtil.isNumber(sendTimeBeginH)) {
			this.sendTimeBeginH = StringUtil.lpad(StringUtil.toHalf(sendTimeBeginH).trim(),
					2, '0');
		} else {
			this.sendTimeBeginH = sendTimeBeginH;
		}
		
		
	}
	/**
	 * @return Returns the sendTimeBeginM.
	 */
	public String getSendTimeBeginM() {
		return sendTimeBeginM;
		
	}
	/**
	 * @param sendTimeBeginM The sendTimeBeginM to set.
	 */
	public void setSendTimeBeginM(String sendTimeBeginM) {
		if (KikakuWebUtil.isNumber(sendTimeBeginM)) {
			this.sendTimeBeginM = StringUtil.lpad(StringUtil.toHalf(sendTimeBeginM).trim(),
					2, '0');
		} else {
			this.sendTimeBeginM = sendTimeBeginM;
		}
		
	}
	/**
	 * @return Returns the sendTimeEnd.
	 */
	public String getSendTimeEnd() {
		return sendTimeEnd;
	}
	/**
	 * @param sendTimeEnd The sendTimeEnd to set.
	 */
	public void setSendTimeEnd(String sendTimeEnd) {
		this.sendTimeEnd = sendTimeEnd;
		if (!StringUtil.isEmpty(this.sendTimeEnd)) {
			this.sendTimeEndH = sendTimeEnd.substring(0, 2);
			this.sendTimeEndM = sendTimeEnd.substring(2, 4);
		} else {
			this.sendTimeEndH = "";
			this.sendTimeEndM = "";
		}
	}
	/**
	 * @return Returns the sendTimeEndH.
	 */
	public String getSendTimeEndH() {
		return sendTimeEndH;
	}
	/**
	 * @param sendTimeEndH The sendTimeEndH to set.
	 */
	public void setSendTimeEndH(String sendTimeEndH) {
		if (KikakuWebUtil.isNumber(sendTimeEndH)) {
			this.sendTimeEndH = StringUtil.lpad(StringUtil.toHalf(sendTimeEndH).trim(),
					2, '0');
		} else {
			this.sendTimeEndH = sendTimeEndH;
		}
		
	}
	/**
	 * @return Returns the sendTimeEndM.
	 */
	public String getSendTimeEndM() {
		return sendTimeEndM;
	}
	/**
	 * @param sendTimeEndM The sendTimeEndM to set.
	 */
	public void setSendTimeEndM(String sendTimeEndM) {
		if (KikakuWebUtil.isNumber(sendTimeEndM)) {
			this.sendTimeEndM = StringUtil.lpad(StringUtil.toHalf(sendTimeEndM).trim(),
					2, '0');
		} else {
			this.sendTimeEndM = sendTimeEndM;
		}
		
	}
	/**
	 * @return Returns the sendTimeFlg.
	 */
	public String getSendTimeFlg() {
		return sendTimeFlg;
	}
	/**
	 * @param sendTimeFlg The sendTimeFlg to set.
	 */
	public void setSendTimeFlg(String sendTimeFlg) {
		this.sendTimeFlg = sendTimeFlg;
	}
	/**
	 * @return Returns the shuttleBusBookCmt.
	 */
	public String getShuttleBusBookCmt() {
		return shuttleBusBookCmt;
	}
	/**
	 * @param shuttleBusBookCmt The shuttleBusBookCmt to set.
	 */
	public void setShuttleBusBookCmt(String shuttleBusBookCmt) {
		this.shuttleBusBookCmt = shuttleBusBookCmt;
	}
	/**
	 * @return Returns the shuttleBusBookFlg.
	 */
	public String getShuttleBusBookFlg() {
		return shuttleBusBookFlg;
	}
	/**
	 * @param shuttleBusBookFlg The shuttleBusBookFlg to set.
	 */
	public void setShuttleBusBookFlg(String shuttleBusBookFlg) {
		this.shuttleBusBookFlg = shuttleBusBookFlg;
	}
	/**
	 * @return Returns the shuttleBusFlg.
	 */
	public String getShuttleBusFlg() {
		return shuttleBusFlg;
	}
	/**
	 * @param shuttleBusFlg The shuttleBusFlg to set.
	 */
	public void setShuttleBusFlg(String shuttleBusFlg) {
		this.shuttleBusFlg = shuttleBusFlg;
	}
	/**
	 * @return Returns the shuttleBusMemo.
	 */
	public String getShuttleBusMemo() {
		return shuttleBusMemo;
	}
	/**
	 * @param shuttleBusMemo The shuttleBusMemo to set.
	 */
	public void setShuttleBusMemo(String shuttleBusMemo) {
		this.shuttleBusMemo = shuttleBusMemo;
	}
	/**
	 * @return Returns the startCourse.
	 */
	public String getStartCourse() {
		return startCourse;
	}
	/**
	 * @param startCourse The startCourse to set.
	 */
	public void setStartCourse(String startCourse) {
		this.startCourse = startCourse;
	}
	/**
	 * @return Returns the startTime.
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime The startTime to set.
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if (!StringUtil.isEmpty(this.startTime)) {
			this.startTimeH = startTime.substring(0, 2);
			this.startTimeM = startTime.substring(2, 4);
		} else {
			this.startTimeH = "";
			this.startTimeM = "";
		}
	}
	/**
	 * @return Returns the startTimeH.
	 */
	public String getStartTimeH() {
		return startTimeH;
	}
	/**
	 * @param startTimeH The startTimeH to set.
	 */
	public void setStartTimeH(String startTimeH) {
		if (KikakuWebUtil.isNumber(startTimeH)) {
		this.startTimeH = StringUtil.lpad(StringUtil.toHalf(startTimeH).trim(),
				2, '0');
		} else {
			this.startTimeH = startTimeH;
		}
	}
	/**
	 * @return Returns the startTimeM.
	 */
	public String getStartTimeM() {
		return startTimeM;
	}
	/**
	 * @param startTimeM The startTimeM to set.
	 */
	public void setStartTimeM(String startTimeM) {
		if (KikakuWebUtil.isNumber(startTimeM)) {
		this.startTimeM = StringUtil.lpad(StringUtil.toHalf(startTimeM).trim(),
				2, '0');
		} else {
			this.startTimeM = startTimeM;
		}
	}
	/**
	 * @return Returns the stockNo.
	 */
	public String getStockNo() {
		return stockNo;
	}
	/**
	 * @param stockNo The stockNo to set.
	 */
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}
	/**
	 * @return Returns the taxiTime.
	 */
	public String getTaxiTime() {
		return taxiTime;
	}
	/**
	 * @param taxiTime The taxiTime to set.
	 */
	public void setTaxiTime(String taxiTime) {
		this.taxiTime = taxiTime;
	}
	/**
	 * @return Returns the termEndD.
	 */
	public String getTermEndD() {
		return termEndD;
	}
	/**
	 * @param termEndD The termEndD to set.
	 */
	public void setTermEndD(String termEndD) {
		if (KikakuWebUtil.isNumber(termEndD)) {
			this.termEndD = StringUtil.lpad(StringUtil.toHalf(termEndD).trim(), 2,
			'0');
		} else {
			this.termEndD = termEndD;
		}
		
	}
	/**
	 * @return Returns the termEndM.
	 */
	public String getTermEndM() {
		return termEndM;
	}
	/**
	 * @param termEndM The termEndM to set.
	 */
	public void setTermEndM(String termEndM) {
		if (KikakuWebUtil.isNumber(termEndM)) {
		this.termEndM = StringUtil.lpad(StringUtil.toHalf(termEndM).trim(), 2,
		'0');
		} else {
			this.termEndM = termEndM;
		}
	}
	/**
	 * @return Returns the termEndY.
	 */
	public String getTermEndY() {
		return termEndY;
	}
	/**
	 * @param termEndY The termEndY to set.
	 */
	public void setTermEndY(String termEndY) {
		this.termEndY = StringUtil.toHalf(termEndY);
	}
	/**
	 * @return Returns the termEndYmd.
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}
	/**
	 * @param termEndYmd The termEndYmd to set.
	 */
	public void setTermEndYmd(String termEndYmd) {
		this.termEndYmd = termEndYmd;
		if (!StringUtil.isEmpty(this.termEndYmd)) {
			this.termEndY = termEndYmd.substring(0, 4);
			this.termEndM = termEndYmd.substring(4, 6);
			this.termEndD = termEndYmd.substring(6, 8);
		} else {
			this.termEndY = "";
			this.termEndM = "";
			this.termEndD = "";
		}
	}
	/**
	 * @return Returns the termFromD.
	 */
	public String getTermFromD() {
		return termFromD;
	}
	/**
	 * @param termFromD The termFromD to set.
	 */
	public void setTermFromD(String termFromD) {
		if (KikakuWebUtil.isNumber(termFromD)) {
			this.termFromD = StringUtil.lpad(StringUtil.toHalf(termFromD)
					.trim(), 2, '0');
		} else {
			this.termFromD = termFromD;
		}
	}
	/**
	 * @return Returns the termFromM.
	 */
	public String getTermFromM() {
		return termFromM;
	}
	/**
	 * @param termFromM The termFromM to set.
	 */
	public void setTermFromM(String termFromM) {
		if (KikakuWebUtil.isNumber(termFromM)) {
		this.termFromM = StringUtil.lpad(StringUtil.toHalf(termFromM).trim(),
				2, '0');
		} else {
			this.termFromM = termFromM;
		}
	}
	/**
	 * @return Returns the termFromY.
	 */
	public String getTermFromY() {
		return termFromY;
	}
	/**
	 * @param termFromY The termFromY to set.
	 */
	public void setTermFromY(String termFromY) {
		this.termFromY = StringUtil.toHalf(termFromY);
	}
	/**
	 * @return Returns the termFromYmd.
	 */
	public String getTermFromYmd() {
		return termFromYmd;
	}
	/**
	 * @param termFromYmd The termFromYmd to set.
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
		
		if (!StringUtil.isEmpty(this.termFromYmd)) {
			this.termFromY = termFromYmd.substring(0, 4);
			this.termFromM = termFromYmd.substring(4, 6);
			this.termFromD = termFromYmd.substring(6, 8);
		} else {
			this.termFromY = "";
			this.termFromM = "";
			this.termFromD = "";
		}
	}
	/**
	 * @return Returns the toBusStaTime.
	 */
	public String getToBusStaTime() {
		return toBusStaTime;
	}
	/**
	 * @param toBusStaTime The toBusStaTime to set.
	 */
	public void setToBusStaTime(String toBusStaTime) {
		this.toBusStaTime = toBusStaTime;
	}
	/**
	 * @return Returns the toStationWalktime.
	 */
	public String getToStationWalktime() {
		return toStationWalktime;
	}
	/**
	 * @param toStationWalktime The toStationWalktime to set.
	 */
	public void setToStationWalktime(String toStationWalktime) {
		this.toStationWalktime = toStationWalktime;
	}
	/**
	 * @return Returns the validPeriod.
	 */
	public String getValidPeriod() {
		return validPeriod;
	}
	/**
	 * @param validPeriod The validPeriod to set.
	 */
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}
	/**
	 * @return Returns the dealFeeFlg.
	 */
	public String getDealFeeFlg() {
		return dealFeeFlg;
	}
	/**
	 * @param dealFeeFlg The dealFeeFlg to set.
	 */
	public void setDealFeeFlg(String dealFeeFlg) {
		this.dealFeeFlg = dealFeeFlg;
	}
	/**
	 * 
	 * @return 1名料金フラグ.
	 */
	public String getOnePersonFlg() {
		return onePersonFlg;
	}
	/**
	 * 
	 * @param onePersonFlg 1名料金フラグ.
	 */
	public void setOnePersonFlg(String onePersonFlg) {
		this.onePersonFlg = onePersonFlg;
	}
	/**
	 * 
	 * @return JRと私鉄の区分
	 */
	public String getStationDiv() {
		return stationDiv;
	}
	/**
	 * 
	 * @param stationDiv JRと私鉄の区分
	 */
	public void setStationDiv(String stationDiv) {
		this.stationDiv = stationDiv;
	}
	/**
	 * 手数料の表示数字を取得.
	 * 
	 *  @return 手数料(カンマ付き）
	 */
	public String getDealFeeDisplay() {
		if (!StringUtil.isEmpty(dealFee) 
				&& !StringUtil.isEmpty(getDealFeeType())
				&& JreConstants.DEAL_FEE_YEN_VALUE.equals(getDealFeeType())) {
			return KikakuWebUtil.formatCharge(dealFee);
		}
		return dealFee;
	}
	
}
