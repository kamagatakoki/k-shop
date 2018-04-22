package jp.co.jreast.common;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.LinkedMap;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.data.BasicMstData;
import jp.co.jreast.common.support.LabelValueBean;
import jp.co.jreast.common.util.KikakuWebUtil;

/**
 * <pre>
 *   共通定数クラス。.
 *   機能概要    ：  共通定数をする。
 *   特記事項    ：  無し
 * </pre>
 */
public class JreConstants {

	/**
	 * 全体の状態(料金承認).
	 */
	public static final String ADMINSTATUS_ALL = "料金承認";

	/**
	 * No1以外の状態（承認).
	 */
	public static final String ADMINSTATUS_OTHER = "承認";

	/**
	 * No1以外の状態（確定).
	 */
	public static final String AGREESTATUS_OTHER = "確定";

	//確定状態名前の修正
	/**
	 * 全体の状態(料金確定).
	 */
	public static final String AGREESTATUS_RECORD = "料金確定";

	/**
	 * 面積単位区分コード.
	 */
	public static final String AREA_UNIT_DIV = "0202";

	/**
	 * 一括出力ファイル名（ゴルフ）
	 */
	public static final String BATCH_PRINT_FILE_NAME_GOLF = "Golf_All";

	/**
	 * 一括出力ファイル名（リフト）
	 */
	public static final String BATCH_PRINT_FILE_NAME_LIFT = "Lift_All";

	//-------------------------------------------------------------------------------
	//-------------------一括出力ファイル名称追加 2010/4/12 加藤--------------------
	/**
	 * 一括出力ファイル名（宿泊）
	 */
	public static final String BATCH_PRINT_FILE_NAME_SHUKUHAKU = "Shukuhaku_All";

	/**
	 * 一括出力ファイル名（船車）
	 */
	public static final String BATCH_PRINT_FILE_NAME_TRAFFIC = "Traffic_Al";

	/**
	 * 一括出力ファイル名（観光）
	 */
	public static final String BATCH_PRINT_FILE_NAME_TRAVEL = "Travel_All";

	/**
	 * 風呂区分：大浴場.
	 */
	public static final int BATH_DIV_BATH_HOUSE = 3;

	/**
	 * 風呂区分：露天風呂.
	 */
	public static final int BATH_DIV_OUTSIDE_BATH = 2;

	/**
	 * 風呂区分：賃切露天風呂.
	 */
	public static final int BATH_DIV_RENTAL_OUTSIDE_SPA = 6;

	/**
	 * 風呂区分：賃切風呂.
	 */
	public static final int BATH_DIV_RENTAL_SPA = 5;

	/**
	 * 風呂区分：サウナ.
	 */
	public static final int BATH_DIV_SAUNA = 4;

	/**
	 * 風呂区分：温泉有り.
	 */
	public static final int BATH_DIV_SPA = 1;

	/**
	 * 風呂種類：女性専用.
	 */
	public static final int BATH_KIND_FEMALE_SPECIALTY = 4;

	/**
	 * 風呂種類：男女別.
	 */
	public static final int BATH_KIND_MALE_FEMALE = 2;

	/**
	 * 風呂種類：男性専用.
	 */
	public static final int BATH_KIND_MALE_SPECIALTY = 3;

	/**
	 * 風呂種類：混浴.
	 */
	public static final int BATH_KIND_MIX_BATH = 6;

	/**
	 * 風呂種類：賃切風呂.
	 */
	public static final int BATH_KIND_RENTAL_SPA = 7;

	/**
	 * 風呂種類：温泉有り.
	 */
	public static final int BATH_KIND_SPA = 1;

	/**
	 * 風呂種類：時間交替制.
	 */
	public static final int BATH_KIND_TIME_SHIFT = 5;

	/**
	 * 建物種別コード.
	 */
	public static final String BUILDING_TYPE = "0102";

	/** キャディ料金区分 . */
	public static final String CADDIE_CHARGE_DIV = "caddieChargeDiv";

	/** キャディ料金区分 . */
	public static final String CADDIE_CHARGE_DIV_1 = "1";

	/** キャディ料金区分 . */
	public static final String CADDIE_CHARGE_DIV_1_NM = "キャディ料金のみ";

	/** キャディ料金区分 . */
	public static final String CADDIE_CHARGE_DIV_2 = "2";

	/** キャディ料金区分 . */
	public static final String CADDIE_CHARGE_DIV_2_NM = "キャディ＋乗用カート料金";

	/** キャディ料金区分 . */
	public static final String CADDIE_CHARGE_DIV_3 = "3";

	/** キャディ料金区分 . */
	public static final String CADDIE_CHARGE_DIV_3_NM = "キャディ＋電動カート料金";

	/**
	 * キャディ料金区分 .
	 */
	private static Map caddieChargeDivMap = new LinkedHashMap();

	/**
	 * 履歴番号1.
	 */
	public static final Integer CAREER_NO_1 = new Integer(1);

	/**
	 * SQL主キーエラーコード.
	 */
	public static final String CD_SQL_PK_ERROR = "23000";

	/**
	 * チェックボックスがチェックされるときマーク.
	 */
	public static final String CHECKBOX_CHECK = "■";

	/**
	 * No2ラジオボックスがチェックなされるときマーク.
	 */
	public static final String CHECKBOX_NO2_CHECK = "○";

	/**
	 * No2ラジオボックスがチェックなされるときマーク.
	 */
	public static final String CHECKBOX_NO2_UNCHECK = "×";

	/**
	 * チェックボックスがチェックなされるときマーク.
	 */
	public static final String CHECKBOX_UNCHECK = "□";

	/**
	 * チェックボックスがチェックされるとき値.
	 */
	public static final String CHECKED_VALUE = "1";

	/**
	 * 送信用コメントのリスト名.
	 */
	public static final String COMMENT_LIST = "cmtList";

	/**
	 * 定数データの集合.
	 */
	private static Map constantsMap = new HashMap();

	/**
	 * 消費税率.
	 */
	public static final String CONSUMPTION_TAX_RATE = "0014";

	/**
	 * 船車No.1:船車内容区分コード.
	 */
	public static final String CONTENT_DIV = "1110";

	/**
	 * フォマート.
	 */
	public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";

	/**
	 * 日付データの記号："-".
	 */
	public static final String DATE_SYMBOL1 = "-";

	/**
	 * 日付データの記号："/".
	 */
	public static final String DATE_SYMBOL2 = "/";

	/**
	 * 取扱手数料の単位：パーセント .
	 */
	public static final String DEAL_FEE_PERCENT = "％";

	/**
	 * 取扱手数料単位「％」の値 .
	 */
	public static final String DEAL_FEE_PERCENT_VLAUE = "1";

	/**
	 * 取扱手数料単位リストのフラグ .
	 */
	public static final String DEAL_FEE_UNIT_FLG = "dealFeeUnitFlg";

	/**
	 * 取扱手数料の単位：円 .
	 */
	public static final String DEAL_FEE_YEN = "円";

	/**
	 * 取扱手数料単位「円」の値 .
	 */
	public static final String DEAL_FEE_YEN_VALUE = "2";

	/**
	 * 取扱手数料の単位データの集合 .
	 */
	private static Map dealFeeFlgMap = new HashMap();

	/**
	 * 12月.
	 */
	public static final int DECEMBER = 12;

	/**
	 * 種類のデフォールト値.
	 */
	public static final String DEFAULT_DIV_KIND_VLAUE = "4";

	/**
	 * シーズンのデフォールト値.
	 */
	public static final String DEFAULT_DIV_SEASON_VALUE = "8";

	/**
	 * 支社区分コード.
	 */
	public static final String DIV_BRANCH = "0002";

	/**
	 * 削除コード.
	 */
	public static final String DIV_CODE_DELET = "40";

	/**
	 * 作成状態コード.
	 */
	public static final String DIV_CODE_SAKUSEI = "01";

	/**
	 * 送信エラーコード.
	 */
	public static final String DIV_CODE_SOSINERROR = "03";

	/**
	 * 送信待ち状態コード.
	 */
	public static final String DIV_CODE_SOSINMATU = "02";

	/**
	 * 施設付帯情報 施設確定.
	 */
	public static final String DIV_FAC_DECISION_DIV = "FAC_MANAGE";

	/**
	 * ＦＭ原価連携区分.
	 */
	public static final String DIV_FM_COST_DIV = "JRE002";

	/**
	 * ＦＭ在庫区分.
	 */
	public static final String DIV_FM_STOCK_DIV = "JRE003";

	/**
	 * 種別区分コード.
	 */
	public static final String DIV_KIND = "0001";

	/**
	 * 都道府県区分コード.
	 */
	public static final String DIV_PREFECTURES = "0007";

	/**
	 * シーズン区分コード.
	 */
	public static final String DIV_SEASON = "0004";

	/**
	 * 送付区分区分コード.
	 */
	public static final String DIV_SEND = "0003";

	/**
	 * 長野ダミー送信
	 */
	public static final String DIV_SEND_TO_NAGANO = "0020";

	/**
	 * 施設付帯情報一覧機能追加対応 2009/12/04 s30873
	 * 施設付帯種類区分コード.
	 */
	public static final String DIV_SORTS_FAC = "0017";

	/**
	 * 状態区分コード.
	 */
	public static final String DIV_STATUS = "0005";

	/**
	 * 状態変更種類コード.
	 * 課題No52：状態変更機能追加対応　2009/12/10 add by s31109
	 */
	public static final String DIV_STATUS_CHANGE = "0019";

	/**
	 * 在庫区分.
	 */
	public static final String DIV_STOCK_DIV = "JRE001";

	/**
	 * トップページ区分コード.
	 */
	public static final String DIV_TOP_PAGE = "9000";

	/**
	 * 施設付帯情報一覧機能追加対応 2009/12/18 s30873
	 * 施設タイプ区分コード.
	 */
	public static final String DIV_TYPE_FAC = "0018";

	/**
	 * ダウンロードファイル名.
	 */
	public static final String DOWNLOAD_FILE_NAME = "downloadFileName";

	/**
	 * ダウンロード用キー.
	 */
	public static final String DOWNLOAD_KEY = "filePath";

	/**
	 * 手数料の円のタイプ.
	 */
	public static final String EnTypeFlg = "2";

	/**
	 * 入浴料別料金有り 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_BATH = 16;

	/**
	 * 設備種別：館内にコンビニ有.
	 */
	public static final int EQUIPMENT_KIND_CONVENIENCE = 11;

	/**
	 * 設備種別：フィットネス施設有り.
	 */
	public static final int EQUIPMENT_KIND_FITNESS = 7;

	/**
	 * 設備種別：ゲームコーナー有り.
	 */
	public static final int EQUIPMENT_KIND_GAME_CORNER = 2;

	/**
	 * 設備種別：カラオケＢＯＸ有り.
	 */
	public static final int EQUIPMENT_KIND_KARAOKE_BOX = 1;

	/**
	 * 設備種別：最寄のコンビニ有 2009/11/13 add by s31109.
	 */
	public static final int EQUIPMENT_KIND_NEARSTORE = 12;

	//	施設付帯情報 施設確定. 2009/12/07 S30873 END

	/**
	 * インターネット接続ｻｰﾋﾞｽ有り 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_NET = 15;

	/**
	 * 設備種別：部屋に新聞サービス有り.
	 */
	public static final int EQUIPMENT_KIND_NEWS = 8;

	/**
	 * 設備種別：駐車場（無料）有り.
	 */
	public static final int EQUIPMENT_KIND_PARK_FREE = 9;

	/**
	 * 設備種別：駐車場（有料）有り.
	 */
	public static final int EQUIPMENT_KIND_PARK_PAY = 10;

	/**
	 * 設備種別：プール有り（屋内）.
	 */
	public static final int EQUIPMENT_KIND_POOL_INDOOR = 6;

	/**
	 * 設備種別：プール有り（屋外）.
	 */
	public static final int EQUIPMENT_KIND_POOL_OUTSIDE = 5;

	/**
	 * SUICA利用可能施設有り 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_SUICA = 14;

	/**
	 * 設備種別：卓球台有り.
	 */
	public static final int EQUIPMENT_KIND_TABLE_TENNIS = 4;

	/**
	 * 設備種別：貴館専用テニスコート有り.
	 */
	public static final int EQUIPMENT_KIND_TENNIS_COURT = 3;

	/**
	 * ズボンプレッサー有り 2009/12/14 s30873
	 */
	public static final int EQUIPMENT_KIND_TROUSERPRESS = 13;

	//	施設付帯情報 施設確定. 2009/12/07 S30873 START
	/**
	 * 施設付帯情報 施設確定.
	 */
	private static final String FAC_DECISION_DIV_CODE_1 = "0";

	/**
	 * 施設付帯情報 施設確定.
	 */
	private static final String FAC_DECISION_DIV_CODE_2 = "1";

	/**
	 * 施設付帯情報 施設確定.
	 */
	private static final String FAC_DECISION_DIV_NAME_1 = "-";

	/**
	 * 施設付帯情報 施設確定.
	 */
	private static final String FAC_DECISION_DIV_NAME_2 = "済み";

	/**
	 * s30873 2009/12/15 回答書：0、付帯情報：1、新規：2
	 * 詳細画面の区別ため、追加
	 */
	public static final String FAC_DECISION_FUTAIINFO_CALL = "1";

	/**
	 * s30873 2009/12/15 回答書：0、付帯情報：1、新規：2
	 * 詳細画面の区別ため、追加
	 */
	public static final String FAC_DECISION_FUTAIMAKE_CALL = "2";

	/**
	 * s30873 2009/12/15 回答書：0、付帯情報：1、新規：2
	 * 詳細画面の区別ため、追加
	 */
	public static final String FAC_DECISION_KAITOUSYO_CALL = "0";

	/**
	 * 施設付帯情報 施設確定.
	 */
	private static Map facDecisionDivMap = new HashMap();

	/**
	 * デフォルト表示「-」
	 */
	public static final String FACILITY_INFO_SET_FALSE = "-";

	/**
	 * 施設情報設定を行った場合、画面上に「済」を表示する
	 */
	public static final String FACILITY_INFO_SET_TURE = "済";

	/**
	 * 施設パターン新規表示用
	 */
	public static final String FACILITY_PATTERN_INIT_SIX = "******";

	/**
	 * 施設パターン初期値
	 */
	public static final String FACILITY_PATTERN_INIT_VAL = "001";

	/**
	 * 施設タイプ(デフォルトは1：旅館)
	 */
	public static final String FACILITY_PATTERN_INIT_VALUE = "1";

	//-------------------ur00300 & ur02006---------------------
	/**
	 * 施設パターン長さ
	 */
	public static final int FACILITY_PATTERN_LEN = 6;

	/**
	 * 施設コード１のデフォールト値.
	 */
	public static final char FACILITY1_FLAG = '0';

	/**
	 * 施設コード2のデフォールト値.
	 */
	public static final char FACILITY2_FLAG = 'z';

	/**
	 * 料金条件コード.
	 */
	public static final String FEE_COND_TYPE = "0106";

	/**
	 * 金額状況：無料 .
	 */
	public static final String FEE_FREE_FLG = "無料";

	/**
	 * 金額状況：有料 .
	 */
	public static final String FEE_PAY_FLG = "有料";

	/**
	 * 一ヶ月の最小の日付.
	 */
	public static final int FIRSEDAY = 1;

	/**
	 * disbaledフラグ 2.
	 */
	public static final String FLG_DISABLED = "2";

	/**
	 * Flag 0.
	 */
	public static final String FLG_FALSE = "0";

	/**
	 * Flag 1.
	 */
	public static final String FLG_TRUE = "1";

	/**
	 * 非選択状態.
	 */
	public static final String FLG_UNSELECTED = null;

	/**
	 * ＦＭ原価連携コード.
	 */
	private static final String FM_COST_DIV_CODE_1 = "1";

	/**
	 * ＦＭ原価連携コード.
	 */
	private static final String FM_COST_DIV_CODE_2 = "2";

	/**
	 * ＦＭ原価連携コード.
	 */
	private static final String FM_COST_DIV_CODE_3 = "3";

	/**
	 * ＦＭ原価連携名.
	 */
	private static final String FM_COST_DIV_NAME_1 = "待ち";

	/**
	 * ＦＭ原価連携名.
	 */
	private static final String FM_COST_DIV_NAME_2 = "手入力";

	/**
	 * ＦＭ原価連携名.
	 */
	private static final String FM_COST_DIV_NAME_3 = "済み";

	/**
	 * ＦＭ原価手入力 .
	 */
	public static final int FM_COST_RELATE_DIV_HAND_INPUT = 2;

	/**
	 * ＦＭ原価送信済み .
	 */
	public static final int FM_COST_RELATE_DIV_SEND_FINSIH = 3;

	/**
	 * ＦＭ原価送信待ち .
	 */
	public static final int FM_COST_RELATE_DIV_SEND_WAIT = 1;

	/**
	 * ＦＭ在庫連携.
	 */
	private static final String FM_STOCK_DIV_CODE_1 = "1";

	/**
	 * ＦＭ在庫連携.
	 */
	private static final String FM_STOCK_DIV_CODE_2 = "2";

	/**
	 * ＦＭ在庫連携.
	 */
	private static final String FM_STOCK_DIV_NAME_1 = "待ち";

	/**
	 * ＦＭ在庫連携.
	 */
	private static final String FM_STOCK_DIV_NAME_2 = "済み";

	/**
	 * ＦＭ在庫送信済み .
	 */
	public static final int FM_STOCK_RELATE_DIV_SEND_FINSIH = 2;

	/**
	 * ＦＭ在庫送信待ち .
	 */
	public static final int FM_STOCK_RELATE_DIV_SEND_WAIT = 1;

	/**
	 * ＦＭ原価連携.
	 */
	private static Map fmCostDivMap = new HashMap();

	/**
	 * ＦＭ在庫連携.
	 */
	private static Map fmStockDivMap = new HashMap();

	/**
	 * 施設付帯種類 NO3
	 */
	public static final String FUTAI_FACILITY_PATTERN_NO3 = "1";

	/**
	 * 施設付帯種類 NO5
	 */
	public static final String FUTAI_FACILITY_PATTERN_NO5 = "2";

	/**
	 * 業務開始月.
	 */
	public static final String GYOMU_MONTH = "04";

	/**
	 * 祝日の印.
	 */
	public static final String HolidayMark = "★";

	/** 手仕舞通知方法用否/予約通知方法用否リスト . */
	public static final String INFORM_WAY_FLG = "InformWayFlg";

	/**
	 * 手仕舞通知方法用否/予約通知方法用否 要 .
	 **/
	public static final String INFORM_WAY_FLG_HAVA = "要";

	/**
	 * 手仕舞通知方法用否/予約通知方法用否 不要 .
	 **/
	public static final String INFORM_WAY_FLG_NOT = "不要";

	/**
	 * 手仕舞通知方法用否/予約通知方法用否 .
	 */
	private static Map informWayFlgMap = new LinkedHashMap();

	/**
	 * Flag 0.
	 */
	public static final int INT_FALSE = 0;

	/**
	 * Flag 1.
	 */
	public static final int INT_TRUE = 1;

	/**
	 * 正月.
	 */
	public static final int JANUARY = 1;

	/**
	 * No1画面東日本在庫の限定数.
	 */
	public static final int JRSTOCKCAPACITY = 3;

	/** カート料金区分 . */
	public static final String KART_CHARGE_DIV = "kartChargeDiv";

	/** カート料金区分 . */
	public static final String KART_CHARGE_DIV_1_NM = "乗用カート料金";

	/** カート料金区分 . */
	public static final String KART_CHARGE_DIV_2_NM = "電動カート料金";

	/** カート料金区分 . */
	private static Map kartChargeDivMap = new LinkedHashMap();

	/**
	 * AnsSearchDataのリストデータ.
	 */
	public static final String KEY_ANSSEARCHDATA_DATA = "ansSearchData";

	/**
	 * 回答書画面に詳細回答書画面へ遷移するパラメータ：履歴番号.
	 */
	public static final String KEY_CAREER_NO = "careerNo";

	/**
	 * キー コピーフォーム.
	 */
	public static final String KEY_COPYFORM = "UR02001CopyForm";

	/**
	 * 回答書画面に詳細回答書画面へ遷移するパラメータ：企画回答連番.
	 */
	public static final String KEY_PLAN_ANS_NO = "planAnsNo";

	// ------------------------ur00200--------------------------
	/**
	 * トップページ情報.
	 */
	public static final String KEY_UR00200_DATA = "ur00200OutData";

	/**
	 * UR00300画面のリストデータ.
	 */
	public static final String KEY_UR00300_DATA = "ur00300OutData";

	/**
	 * UR00400画面のリストデータ.
	 */
	public static final String KEY_UR00400_DATA = "ur00400OutData";

	/**
	 * キー UR02000データ.
	 */
	public static final String KEY_UR02000_COPY_CALENDAR_DATA = "UR02000CopyCalendarData";

	/**
	 * キー UR02000データ.
	 */
	public static final String KEY_UR02000_COPY_DATA = "UR02000CopyData";

	/**
	 * キー UR02000データ.
	 */
	public static final String KEY_UR02000_CURRENT_DATA = "UR02000Data";

	/**
	 * キー UR02000データ.
	 */
	public static final String KEY_UR02000_HISTORY_DATA = "UR02000HistoryData";

	/**
	 * キー UR02000データ.
	 */
	public static final String KEY_UR02000_INIT_DATA = "UR02000InitData";

	/**
	 * キー UR02000データ.
	 */
	public static final String KEY_UR02000_SAVED_DATA = "UR02000SavedData";

	/**
	 * 商品参照リストデータ.
	 */
	public static final String KEY_UR02003_DATA = "ur02003OutData";

	/**
	 * カレンダーコピーOutData.
	 */
	public static final String KEY_UR02004_DATA = "UR02004OutData";

	// ------------------------ur02004--------------------------
	/**
	 * カレンダーコピーForm.
	 */
	public static final String KEY_UR02004_FORM = "UR02004Form";

	/**
	 * カレンダーコピー検索Form.
	 */
	public static final String KEY_UR02004_SEARCH_FORM = "UR02004SearchForm";

	/**
	 * 検索データ.
	 */
	public static final String KEY_UR05000SEARCH_DATA = "ur05000SearchData";

	/**
	 * 企画定義ファイル.
	 */
	private static InputStream kikakuWebPropertiesStream;

	/**
	 * 種別:ゴルフ.
	 */
	public static final String KIND_FLG_GOLF = "5";

	/**
	 * 施設タイプ:ホテル.
	 */
	public static final String KIND_FLG_HOTEL = "2";

	//---------------------------------------------------------
	//-------------------施設タイプ用定数追加--------------------
	// add by s30873 2010/01/28
	/**
	 * 施設タイプ:旅館.
	 */
	public static final String KIND_FLG_INN = "1";

	/**
	 * 種別:リフト.
	 */
	public static final String KIND_FLG_LIFT = "6";

	/**
	 * 施設タイプ:スキー. 2010年4月追加予定
	 */
	public static final String KIND_FLG_SKI = "3";

	//-----------------------------------------------------------

	/**
	 * 種別:宿泊.
	 */
	public static final String KIND_FLG_STAYING = "4";

	/**
	 * 種別:宿泊.
	 */
	public static final String KIND_FLG_STAYING_HOTEL = "2";

	// kimu end

	//kimu start add by 2010/02/28 宿泊ホテル、旅館区分
	/**
	 * 種別:宿泊.
	 */
	public static final String KIND_FLG_STAYING_RYOKAN = "1";

	//---- 2010/4/9スキー区分追加　加藤 ---------------------
	/**
	 * 種別:宿泊（スキー）.
	 */
	public static final String KIND_FLG_STAYING_SKI = "3";

	//--------------------------------------------------------

	/**
	 * 種別:船車.
	 */
	public static final String KIND_FLG_TRAFFIC = "2";

	/**
	 * 種別:観光.
	 */
	public static final String KIND_FLG_TRAVEL = "3";

	/**
	 * 一ヶ月の最大の日付.
	 */
	public static final int LASTDAT = 31;

	/**
	 * 面積単位リスト名.
	 */
	public static final String LIST_AREA_UNIT = "areaUnitlist";

	/**
	 * 建物種別リスト名.
	 */
	public static final String LIST_BUILDING_TYPE = "buildingTypeList";

	/**
	 * 消費税率.
	 */
	public static final String LIST_CONSUMPTION_TAX_RATE = "consumptionTaxRateList";

	/**
	 * 船車No.1:船車内容区分名.
	 */
	public static final String LIST_CONTENT_DIV = "contentList";

	/**
	 * 料金条件リスト名.
	 */
	public static final String LIST_FEE_COND_TYPE = "feeCondTypeList";

	/**
	 * No.1 提供料金人数上限 .
	 */
	public static final String LIST_MAX_CAPA_PATTERN = "maxCapaPatternList";

	/**
	 * 食事条件リスト名.
	 */
	public static final String LIST_MEAL_COND_TYPE = "mealCondTypeList";

	/**
	 * 食事箇所リスト名.
	 */
	public static final String LIST_MEAL_PLACE_CD = "mealPlaceList";

	/**
	 * 支社区分リスト名.
	 */
	public static final String LIST_NAME_DIV_BRANCH = "branchlist";

	/**
	 * 支社区分リスト名(支社向け).
	 */
	public static final String LIST_NAME_DIV_BRANCH1 = "branchlist1";

	/**
	 * 種別区分リスト名.
	 */
	public static final String LIST_NAME_DIV_KIND = "kindlist";

	/**
	 * 施設付帯情報一覧機能追加対応 2009/12/04 s30873
	 * 種別区分固定リスト名.
	 */
	public static final String LIST_NAME_DIV_KIND_LOCKED = "kindlistlocked";

	/**
	 * 都道府県区分リスト名.
	 */
	public static final String LIST_NAME_DIV_PREFECTURES = "prefectureslist";

	/**
	 * シーズン区分リスト名.
	 */
	public static final String LIST_NAME_DIV_SEASON = "seasonlist";

	/**
	 * 送付区分区分リスト名.
	 */
	public static final String LIST_NAME_DIV_SEND = "sendlist";

	/**
	 * 施設付帯情報一覧機能追加対応 2009/12/04 s30873
	 * 施設付帯種類リスト名.
	 */
	public static final String LIST_NAME_DIV_SORTS_FAC = "facsortslist";

	/**
	 * 状態区分リスト名.
	 */
	public static final String LIST_NAME_DIV_STATUS = "statuslist";

	/**
	 * 状態変更種類コード.
	 * 課題No52：状態変更機能追加対応　2009/12/10 add by s31109
	 */
	public static final String LIST_NAME_DIV_STATUS_CHANGE = "statusChangeList";

	// --------------------業務部分スタット---------------------------------

	/**
	 * 施設付帯情報一覧機能追加対応 2009/12/18 s30873
	 * 施設タイプリスト名.
	 */
	public static final String LIST_NAME_DIV_TYPE_FAC = "faclityTypeList";

	/**
	 * 業務年度リスト名.
	 */
	public static final String LIST_NAME_GYOMU_YEAR = "gyomulist";

	/**
	 * 業務年度リスト名.
	 */
	public static final String LIST_NAME_GYOMU_YEAR_SP = "gyomulistsp";

	/**
	 * 様式区分リスト名.
	 */
	public static final String LIST_NAME_STYLE_DIV = "styleDivlist";

	/**
	 * 船車No.1:用途リスト名.
	 */
	public static final String LIST_PUPORSE = "bookPurposeList";

	/**
	 * 部屋タイプリスト名..
	 */
	public static final String LIST_ROOM_TYPE = "roomTypeList";

	/**
	 * 部屋タイプリスト名.
	 */
	public static final String LIST_ROOM_TYPE_LABEL_WITH_VALUE = "roomTypeListLabelWithValue";

	/**
	 * 部屋備品有無リスト名.
	 */
	public static final String LIST_ROOM_VESSEL_FLG = "roomVesselFlgList";

	/**
	 * 在庫区分 .
	 */
	public static final String LIST_STOCK_DIV = "stockDivList";

	/**
	 * No.1（観光） 予約種別リスト名 .
	 */
	public static final String LIST_TRAVEL_BOOK_KIND = "travelBookKindList";

	/**
	 * No.1（観光） 用途 リスト名.
	 */
	public static final String LIST_TRAVEL_BOOK_PURPOSE = "travelBookPurposeList";

	/**
	 * 眺望リスト名.
	 */
	public static final String LIST_VIEW_TYPE = "viewTypeList";

	/**
	 * バイキング制限リスト名.
	 */
	public static final String LIST_VK_LIT_FLG = "vkLitFlglist";

	/**
	 * メール配置.
	 */
	private static InputStream mailInputStream;

	/**
	 * メンテナンスフラグ.
	 */
	public static final String MAINTENANCE = "2";

	/**
	 * 人員種別 大人.
	 */
	public static final int MAN_KIND_ADLT = 1;

	/**
	 * 人員種別 小人.
	 */
	public static final int MAN_KIND_CHILD = 2;

	/**
	 * 提供料金人数上限 .
	 */
	public static final String MAX_CAPA_PATTERN_DEFAULT_VALUE = "5";

	/**
	 * 除外日の最大長さ　.
	 */
	public static final int MAX_EXCEPT_DAY_LENGTH = 4500;

	/**
	 * 施設パターン最大値
	 */
	public static final String MAX_FACILITY_PATTERN_NUM = "999";

	//-------------------------施設付帯画面ID追加 s30873 2010/01/22 END-------------------------

	/**
	 * 食事条件コード.
	 */
	public static final String MEAL_COND_TYPE = "0105";

	/**
	 * 食事種別 昼食.
	 */
	public static final String MEAL_KIND_A = "2";

	/**
	 * 食事種別 夕食食.
	 */
	public static final String MEAL_KIND_D = "3";

	/**
	 * 食事種別 朝食.
	 */
	public static final String MEAL_KIND_M = "1";

	/**
	 * 食事箇所区分コード.
	 */
	public static final String MEAL_PLACE_CD_DIV = "0203";

	/**
	 * ボタン操作 0一時保存,1確定,2差し戻し,3承認, 4完了.
	 */
	public static final String[] METHOD_DIV = { "0", "1", "2", "3", "4" };

	/**
	 * 金額状況フラグ .
	 */
	public static final String MONEY_STATUS_FLG = "moneyStatusFlg";

	/**
	 * 金額状況 .
	 */
	private static Map moneyStatus = new HashMap();

	/** 送迎区分 . */
	public static final String MS_DIV = "msDiv";

	/** 送迎区分 . */
	public static final String MS_DIV_1 = "送り迎えともあり";

	/** 送迎区分 . */
	public static final String MS_DIV_2 = "迎えのみあり";

	/** 送迎区分 . */
	public static final String MS_DIV_3 = "送りのみあり";

	/** 送迎区分 . */
	private static Map msDivMap = new LinkedHashMap();

	/**
	 * マスタデータの集合.
	 */
	private static Map mstBasicMap = new HashMap();

	/**
	 * 新規区分 1：新規 .
	 */
	public static final String NEW_DIV_1 = "1";

	/**
	 * 新規区分 2：継続 .
	 */
	public static final String NEW_DIV_2 = "2";

	/**
	 * 設定 期間指定.
	 */
	public static final String NO4_APPLY_BY_SPECIFY = "applyBySpecify";

	/* NO4関連 */
	/**
	 * 設定 曜日ごと.
	 */
	public static final String NO4_APPLY_BY_WEEK = "applyByWeek";

	/**
	 * ボタンの無効状態 有効.
	 */
	public static final String NO4_BUTTON_DISABLED_FALSE = "false";

	/**
	 * ボタンの無効状態 無効.
	 */
	public static final String NO4_BUTTON_DISABLED_TRUE = "true";

	/**
	 * 日のデフォルト背景色.
	 */
	public static final String NO4_DAY_BGCOLOR_DEFAULT = "#FFFFFF";

	/**
	 * 除外日の背景色.
	 */
	public static final String NO4_DAY_BGCOLOR_EXCEPTDATE = "#FFFF00";

	/**
	 * 土曜日の背景色.
	 */
	public static final String NO4_DAY_BGCOLOR_SATURDAY = "#E1EDFE";

	/**
	 * No4のroomDataの背景色.
	 */
	public static final String NO4_DAY_BGCOLOR_STOCK = "#808080";

	/**
	 * 日曜日の背景色.
	 */
	public static final String NO4_DAY_BGCOLOR_SUNDAY = "#FFD9D9";

	/**
	 * 開始月.
	 */
	public static final int NO4_FIRST_MONTH = 10;

	/**
	 * 終了月.
	 */
	public static final int NO4_LAST_MONTH = 1;

	/**
	 * 中間の月.
	 */
	public static final int NO4_MIDDLE_MONTH = 0;

	/**
	 * ほんの1カ月.
	 */
	public static final int NO4_ONLY_ONE_MONTH = 11;

	/**
	 * ページの月の記録数.
	 */
	public static final int NO4_PAGE_RECORD = 6;

	// 月のページ数追加（印刷時は1ページ4ヶ月） 2010/4/9
	/**
	 * ページの月の記録数（リフト）.
	 */
	public static final int NO4_PAGE_RECORD_PRINT = 4;

	/**
	 * NO4フラグ.
	 */
	public static final int NO4PAGE = 4;

	/**
	 * No4画面特用statusList.
	 */
	public static final String NO4STATUSLIST = "no4StatusList";

	/**
	 * No4に存在しない在庫番号.
	 */
	public static final String NotNo4StockNo = "0000";

	/**
	 * パタン"-".
	 */
	public static final String PATTERN_EXCEPT_DAY = "-";

	/**
	 * パタン"○".
	 */
	public static final String PATTERN_EXIST_KEY = "○";

	/**
	 * パタン"A".
	 */
	public static final String PATTERN_EXIST_VALUE = "A";

	/** キャディ付プレー可 . */
	public static final String PLAY_WITH_CADDIE_CAN = "可";

	/** キャディ付プレー不可 . */
	public static final String PLAY_WITH_CADDIE_CANNOT = "不可";

	/** キャディ付プレー可否リスト . */
	public static final String PLAY_WITH_CADDIE_FLG = "playWithCaddieFlg";

	/**
	 * キャディ付プレー可否 .
	 */
	private static Map playWithCaddieMap = new LinkedHashMap();

	/**
	 * ソース文件のアドレス.
	 */
	public static final String PROPERTIES_FILE_PATH = "/jp/co/jreast/common/properties/kikakuweb.properties";

	// ---------------------------------------------------------

	// ------------------------ur00100--------------------------

	// ---------------------------------------------------------

	/**
	 * 船車No.1:用途コード.
	 */
	public static final String PUPORSE_CD_DIV = "1109";

	/**
	 * ラジオボタンの値.
	 */
	public static final String[] RADIO_BUTTON_VALUE = { "1", "2", "3", "4" };

	// ---------------------------------------------------------

	// ------------------------ur00300--------------------------

	/**
	 * ラジオボックスがチェックされるときマーク.
	 */
	public static final String RADIOBOX_CHECK = "●";

	/**
	 * ラジオボックスがチェックなされるときマーク.
	 */
	public static final String RADIOBOX_UNCHECK = "○";

	/**
	 * 部屋タイプ区分コード.
	 */
	public static final String ROOM_TYPE_DIV = "0101";

	/**
	 * 部屋備品有.
	 */
	public static final String ROOM_VESSEL_FLG_HAVE = "有り";

	// ---------------------------------------------------------

	/**
	 * 部屋備品無.
	 **/
	public static final String ROOM_VESSEL_FLG_NOT = "無し";

	/**
	 * 部屋備品有無データの集合.
	 */
	private static Map roomVesselFlgMap = new LinkedHashMap();

	/**
	 * リフトNo2画面ID.
	 */
	public static final String SCREEN_ID_LIFT_NO2 = "ur01021";

	/**
	 * NO1画面ID.
	 */
	public static final String SCREEN_ID_NO1 = "ur01010";

	/**
	 * NO1ゴルフ画面ID .
	 */
	public static final String SCREEN_ID_NO1_GOLF = "ur01013";

	// ---------------------------------------------------------

	// ------------------------ur00500--------------------------

	/**
	 * NO1リフト画面ID .
	 */
	public static final String SCREEN_ID_NO1_LIFT = "ur01014";

	/**
	 * NO1船車画面ID .
	 */
	public static final String SCREEN_ID_NO1_TRAFFIC = "ur01012";

	// ---------------------------------------------------------

	/**
	 * NO1観光画面ID .
	 */
	public static final String SCREEN_ID_NO1_TRAVEL = "ur01011";

	/**
	 * NO2画面ID.
	 */
	public static final String SCREEN_ID_NO2 = "ur01020";

	//---------------------------------------------------------
	//-------------------ur00300 & ur02006---------------------
	/**
	 * NO2画面ID 施設タイプ⇒ホテル(2)
	 *
	 * @auther s32395 キム add by 2010/01/26
	 */
	public static final String SCREEN_ID_NO2_HOTEL = "ur01022";

	public static final String SCREEN_ID_NO2_SKI = "ur01023";

	// ---------------------------------------------------------

	/**
	 * NO3画面ID.
	 */
	public static final String SCREEN_ID_NO3 = "ur01030";

	/**
	 * 付帯情報NO3画面IDホテル
	 */
	public static final String SCREEN_ID_NO3_FUTAI_HOTEL = "ur05031";

	//-------------------------施設付帯画面ID追加 s30873 2010/01/22 START-------------------------
	/**
	 * 付帯情報NO3画面ID旅館
	 */
	public static final String SCREEN_ID_NO3_FUTAI_RYOKAN = "ur05030";

	/**
	 * 付帯情報NO3画面IDスキー
	 */
	public static final String SCREEN_ID_NO3_FUTAI_SKI = "ur05032";

	/**
	 * NO4画面ID.
	 */
	public static final String SCREEN_ID_NO4 = "ur01040";

	/**
	 * NO4観光・船車画面ID.
	 */
	public static final String SCREEN_ID_NO4_1 = "ur01041";

	/**
	 * NO4ゴルフ・リフト画面ID.
	 */
	public static final String SCREEN_ID_NO4_2 = "ur01042";

	/**
	 * NO5画面ID.
	 */
	public static final String SCREEN_ID_NO5 = "ur01050";

	// ---------------------------------------------------------

	/**
	 * 付帯情報NO5画面ID
	 */
	public static final String SCREEN_ID_NO5_FUTAI = "ur05050";

	//追加 s32472 No5.スキー画面ID START
	/**
	 * 付帯情報NO5.SKI画面ID
	 */
	public static final String SCREEN_ID_NO5_FUTAI_SKI = "ur05052";

	//追加 s32472 No5.スキー画面ID END
	/**
	 * 送信区分：FAX.
	 */
	public static final String SEND_DIV_FLAG_FAX = "2";

	/**
	 * 送信区分：メール.
	 */
	public static final String SEND_DIV_FLAG_MAIL = "1";

	// ---------------------------------------------------------

	/**
	 * 送信状態.
	 */
	public static final String[] SENDSTATUSNAMES = new String[] { "成功", "ｴﾗｰ",
			"待ち" };

	/**
	 * サービス有る.
	 */
	public static final String SERVICECHECKE = "有";

	/**
	 * サービスない.
	 */
	public static final String SERVICEUNCHECK = "無";

	/**
	 * ユーザー情報.
	 */
	public static final String SESSION_KEY_USERDATA = "userData";

	/** シャトルバス予約有無 . */
	public static final String SHUTTLE_BUS_BOOK_FLG = "shuttleBusBookFlg";

	/** シャトルバス予約有無 . */
	public static final String SHUTTLE_BUS_BOOK_FLG_NO = "予約不要";

	/** シャトルバス予約有無 . */
	public static final String SHUTTLE_BUS_BOOK_FLG_YES = "要予約";

	/** シャトルバス予約有無 . */
	private static Map shuttleBusBookMap = new LinkedHashMap();

	/**
	 * ソート昇順.
	 */
	public static final String SORT_ASC = "asc";

	/**
	 * ソート降順.
	 */
	public static final String SORT_DESC = "desc";

	/**
	 * 料金承認.
	 */
	public static final Integer STATUS_APPROVE = new Integer(21);

	/**
	 * 回答状態：完了.
	 */
	public static final Integer STATUS_COMPLETE = new Integer(30);

	/**
	 * 料金確定.
	 */
	public static final Integer STATUS_CONFIRM = new Integer(20);

	/**
	 * 回答状態：削除.
	 */
	public static final Integer STATUS_DELETE = new Integer(40);

	/**
	 * 施設登録中.
	 */
	public static final Integer STATUS_FACILITIES = new Integer(11);

	/**
	 * 施設登録中（エラー保存）.
	 */
	public static final Integer STATUS_FACILITIES_ERR = new Integer(13);

	/**
	 * 回答書状態：FM済.
	 */
	public static final Integer STATUS_FM_FINISH = new Integer(23);

	/**
	 * JR登録中.
	 */
	public static final Integer STATUS_JR = new Integer(12);

	/**
	 * JR登録中（エラー保存）.
	 */
	public static final Integer STATUS_JR_ERR = new Integer(14);

	// ---------------------状態--------------------------------
	/**
	 * 状態 作成.
	 */
	public static final Integer STATUS_MAKING = new Integer(1);

	/**
	 * 状態 作成（エラー保存）.
	 */
	public static final Integer STATUS_MAKING_ERR = new Integer(5);

	/**
	 * 状態 開封.
	 */
	public static final Integer STATUS_OPEN = new Integer(10);

	/**
	 * 差戻.
	 */
	public static final Integer STATUS_SEND_BACK = new Integer(22);

	/**
	 * 状態 未開封.
	 */
	public static final Integer STATUS_UNOPEN = new Integer(4);

	/**
	 * 在庫区分コード.
	 */
	private static final String STOCK_DIV_CODE_1 = "1";

	/**
	 * 在庫区分コード.
	 */
	private static final String STOCK_DIV_CODE_2 = "2";

	/**
	 * 在庫区分コード.
	 */
	private static final String STOCK_DIV_CODE_3 = "3";

	/**
	 * 在庫区分コード.
	 */
	public static final String STOCK_DIV_CODE_4 = "4";

	/**
	 * 在庫区分 6社在庫 .
	 */
	public static final String STOCK_DIV_CODE_6C = "2";

	/**
	 * 在庫区分 東在庫 .
	 */
	public static final String STOCK_DIV_CODE_EJ = "1";

	/**
	 * 在庫区分名.
	 */
	private static final String STOCK_DIV_NAME_1 = "びゅう";

	/**
	 * 在庫区分名.
	 */
	private static final String STOCK_DIV_NAME_2 = "併用";

	/**
	 * 在庫区分名.
	 */
	private static final String STOCK_DIV_NAME_3 = "未造成";

	/**
	 * 在庫区分名.
	 */
	private static final String STOCK_DIV_NAME_4 = "造成済み";

	/**
	 * 在庫番号 .
	 */
	public static final String STOCK_NO_DEFAULT_VALUE = "0000";

	/**
	 * 在庫区分.
	 */
	private static Map stockDivMap = new LinkedMap();

	/**
	 * dotのマーク.
	 */
	public static final String STRING_DOT = ".";

	/**
	 * 空く文字列.
	 */
	public static final String STRING_NULL = "";

	/**
	 * 様式区分コード.
	 */
	public static final String STYLE_DIV = "0201";

	/**
	 * 税区分 消費税.
	 */
	public static final String TAX_DIVSION_CONSUMPTION = "1";

	/**
	 * 年月日位数 .
	 */
	public static final int TERM_YMD = 8;

	/**
	 * 運輸区分 1：船車 .
	 */
	public static final String TRAFFIC_DIV_1 = "1";

	/**
	 * No.1（観光） 予約種別コード .
	 */
	public static final String TRAVEL_BOOK_KIND = "2109";

	/**
	 * No.1（観光） 用途 .
	 */
	public static final String TRAVEL_BOOK_PURPOSE = "2110";

	/**
	 * フォーム名.
	 */
	public static final String UR00300_INSERTFORM = "UR00300InsertForm";

	/**
	 * maxcount.
	 */
	public static final String UR00300_MAXCOUNT = "ur00300.maxcount";

	/**
	 * moveフラグ.
	 */
	public static final String UR00300_MOVE = "move";

	/**
	 * 結果が100件を超える場合のフラグ.
	 */
	public static final String UR00400_EXCEED_FLAG = "ur00400ExceedFlag";

	/**
	 * 結果が100件を超える場合の値.
	 */
	public static final String UR00400_EXCEED_VLAUE = "1";

	// ------------------------ur00400--------------------------
	/**
	 * フォーム名.
	 */
	public static final String UR00400_FORM = "UR00400Form";

	/**
	 * フォーム名.
	 */
	public static final String UR00400_FORMLIST = "UR00400FormList";

	/**
	 * フォーム名.
	 */
	public static final String UR00400_INITFORM = "UR00400InitForm";

	/**
	 * maxcount.
	 */
	public static final String UR00400_MAXCOUNT = "ur00400.maxcount";

	/**
	 * UR00400結果画面に表示するデータのキー.
	 */
	public static final String UR00400_SEND_FILE_OUTDATA = "sendOutData";

	/**
	 * maxcount.
	 */
	public static final String UR00500_MAXCOUNT = "ur00500.maxcount";

	/**
	 * 出力データ名.
	 */
	public static final String UR00500OUTDATA = "UR00500OutData";

	/**
	 * 記入状況一覧画面特用statusList.
	 */
	public static final String UR00500STATUSLIST = "ur00500StatusList";

	/**
	 * タイプ null.
	 */
	public static final int UR01010_TYPE_NULL = -1;

	/**
	 * 設定 平日・休日・休前日 2009/12/02 add by s31109.
	 */
	public static final String UR02000_APPLY_BY_DAY = "applyByDay";

	/**
	 * 設定 期間指定.
	 */
	public static final String UR02000_APPLY_BY_SPECIFY = "applyBySpecify";

	/**
	 * 設定 曜日ごと.
	 */
	public static final String UR02000_APPLY_BY_WEEK = "applyByWeek";

	/**
	 * ボタンの無効状態 無効.
	 */
	public static final String UR02000_BUTTON_DISABLED = "disabled";

	/**
	 * ボタンの無効状態 有効.
	 */
	public static final String UR02000_BUTTON_DISABLED_FALSE = "false";

	/**
	 * ボタンの無効状態 無効.
	 */
	public static final String UR02000_BUTTON_DISABLED_TRUE = "true";

	/**
	 * ボタンの無効状態 有効.
	 */
	public static final String UR02000_BUTTON_ENABLED = "";

	/**
	 * 承認した時間点で前に承認されたデータと比較して、違う点の背景色.
	 */
	public static final String UR02000_DAY_BGCOLOR_CHANGED = "#00FFFF";

	/**
	 * 日のデフォルト背景色.
	 */
	public static final String UR02000_DAY_BGCOLOR_DEFAULT = "#FFFFFF";

	/**
	 * コピー先にコピー元がない場合.
	 */
	public static final String UR02000_DAY_BGCOLOR_ERROR = "#FF0000";

	/**
	 * 土曜日の背景色.
	 */
	public static final String UR02000_DAY_BGCOLOR_SATURDAY = "#E1EDFE";

	/**
	 * 日曜日の背景色.
	 */
	public static final String UR02000_DAY_BGCOLOR_SUNDAY = "#FFD9D9";

	/**
	 * 開始月.
	 */
	public static final int UR02000_FIRST_MONTH = 10;

	/**
	 * 終了月.
	 */
	public static final int UR02000_LAST_MONTH = 1;

	/**
	 * 中間の月.
	 */
	public static final int UR02000_MIDDLE_MONTH = 0;

	/**
	 * ほんの1カ月.
	 */
	public static final int UR02000_ONLY_ONE_MONTH = 11;

	/**
	 * ページの月の記録数.
	 */
	public static final int UR02000_PAGE_RECORD = 6;

	/**
	 * maxcount.
	 */
	public static final String UR02001_MAXCOUNT = "ur02001.maxcount";

	// ---------------------------------------------------------
	// ---------------------------------------------------------
	// ------------------------ur02001--------------------------
	//企画回答書過去データコピー機能(最大表示件数設定)
	/**
	 * 出力データ名.
	 */
	public static final String UR02001OUTDATA = "UR02001OutData";

	/**
	 * カレンダーコピー検索最大件数プロパティ名.
	 */
	public static final String UR02004_MAXCOUNT = "ur02004.maxcount";

	/**
	 * maxcount.
	 */
	public static final String UR02007_MAXCOUNT = "ur02007.maxcount";

	// ------------------------ur02007--------------------------
	// 施設付帯情報一覧機能追加 2009/12/25 s30873
	/**
	 * 出力データ名.
	 */
	public static final String UR02007OUTDATA = "UR02007OutData";

	/**
	 * maxcount.
	 */
	public static final String UR04000_MAXCOUNT = "ur04000.maxcount";

	/**
	 * 出力データ名.
	 */
	public static final String UR04000OUTDATA = "UR04000OutData";

	/**
	 * maxcount.
	 */
	public static final String UR05000_MAXCOUNT = "ur05000.maxcount";

	public static final String UR05000_RESULTCONTROLFORM = "UR05000ResultControlForm";

	// ------------------------ur05000--------------------------
	// 施設付帯情報一覧機能追加 2009/12/04 s30873
	/**
	 * 出力データ名.
	 */
	//public static final String UR05000OUTDATA = "UR05000OutData";
	public static final String UR05000FORM = "UR05000Form";

	/**
	 * maxcount.
	 */
	public static final String UR05100_MAXCOUNT = "ur05100.maxcount";

	// ------------------------ur05100--------------------------
	// 施設付帯情報詳細画面コピー機能追加 2009/12/28 s30873
	/**
	 * 出力データ名.
	 */
	public static final String UR05100OUTDATA = "UR05100OutData";

	// ---------------------------------------------------------
	// ------------------------ur06000--------------------------
	public static final String UR06000_MAXCOUNT = "ur06000.maxcount";

	//------------------------ur06000--------------------------
	// 課題No52：状態変更機能追加 2009/12/10 s31109
	/**
	 * 出力データ名.
	 */
	public static final String UR06000OUTDATA = "UR06000OutData";

	/**
	 * JR利用.
	 */
	public static final String USEJR = "1";

	/**
	 * ユーザ区分：施設側.
	 */
	public static final String[] USER_DIV_FACILITIES_RANG = { "2" };

	/**
	 * ユーザ区分：ＪＲ側.
	 */
	public static final String[] USER_DIV_JR_RANG = { "0", "1" };

	/**
	 * ユーザ区分：管理側.
	 */
	public static final String[] USER_DIV_MANAGER_RANG = { "9" };

	/**
	 * ユーザー区分、施設ユーザー.
	 */
	public static final String USER_KUBUN_SINSETU = "2";

	/**
	 * 私鉄利用.
	 */
	public static final String USESITETU = "2";

	/**
	 * 眺望コード.
	 */
	public static final String VIEW_TYPE = "0103";

	/**
	 * バイキング制限有.
	 */
	public static final String VK_LIT_FLG_HAVE = "あり";

	/**
	 * バイキング制限無.
	 */
	public static final String VK_LIT_FLG_NOT = "なし";

	/**
	 * バイキング制限有無データの集合.
	 */
	private static Map vkLitFlgMap = new LinkedHashMap();

	/**
	 * 面積単位リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getAreaUnit() {
		Map map = (Map) getMstBasicMap().get(AREA_UNIT_DIV);
		return getLvList(map);
	}

	/**
	 * 船車No.1:用途を取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getBookPurposeList() {
		Map map = (Map) getMstBasicMap().get(PUPORSE_CD_DIV);
		return getLvListLabelWithValue(map);

	}

	/**
	 * 支社リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getBranchLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_BRANCH);
		return getLvList(map);

	}

	/**
	 * 建物種別リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getBuildingType() {
		Map map = (Map) getMstBasicMap().get(BUILDING_TYPE);
		return getLvList(map);
	}

	/**
	 * キャディ料金区分 .
	 *
	 * @return List
	 */
	public static List getcaddieChargeDiv() {
		List list = new ArrayList();
		list = getLvList(caddieChargeDivMap);
		return list;
	}

	/**
	 * 船車No.1:船車内容区分を取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getContentList() {
		Map map = (Map) getMstBasicMap().get(CONTENT_DIV);
		return getLvList(map);

	}

	/**
	 * 取扱手数料単位円／％ .
	 *
	 * @return List 円／％
	 */
	public static List getDealFeeFlg() {
		List list = new ArrayList();
		List listOrg = getLvList(dealFeeFlgMap);
		list.add(0, listOrg.get(1));
		list.add(1, listOrg.get(0));
		return list;
	}

	/**
	 * 料金条件リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getFeeCondType() {
		Map map = (Map) getMstBasicMap().get(FEE_COND_TYPE);
		return getLvList(map);
	}

	/**
	 * 業務年度リストを取得する.
	 *
	 * @return List 業務年度リスト
	 */
	public static List getGyomuYearList() {
		/*
		 * SimpleDateFormat df = new SimpleDateFormat("yyyy");
		 * String year = df.format(new Date());
		 */
		String year = KikakuWebUtil.getGyomuYear(); //業務年度を取得jinhuashi 2007.1.22
		String lastYear = Integer.toString(Integer.parseInt(year) - 1);
		String comeingYear = Integer.toString(Integer.parseInt(year) + 1);
		List list = new ArrayList();
		list.add(new LabelValueBean(lastYear, lastYear));
		list.add(new LabelValueBean(year, year));
		list.add(new LabelValueBean(comeingYear, comeingYear));
		return list;
	}

	/**
	 * 業務年度リストを取得する.
	 *
	 * @return List 業務年度リスト
	 */
	public static List getGyomuYearListSp() {
		String year = KikakuWebUtil.getGyomuYear(); //業務年度を取得jinhuashi 2007.1.22
		String comeingYear = Integer.toString(Integer.parseInt(year) + 1);
		List list = new ArrayList();
		list.add(new LabelValueBean(year, year));
		list.add(new LabelValueBean(comeingYear, comeingYear));
		return list;
	}

	/**
	 * 手仕舞通知方法用否/予約通知方法用否 .
	 *
	 * @return List 要 不要
	 */
	public static List getInformWayFlg() {
		List list = new ArrayList();
		list = getLvList(informWayFlgMap);
		return list;
	}

	/**
	 * カート料金区分 .
	 *
	 * @return List
	 */
	public static List getkartChargeDiv() {
		List list = new ArrayList();
		list = getLvList(kartChargeDivMap);
		return list;
	}

	/**
	 * @return Returns the kikakuWebPropertiesStream.
	 */
	public static InputStream getKikakuWebPropertiesStream() {
		return kikakuWebPropertiesStream;
	}

	/**
	 * 種別リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getKindLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_KIND);
		return getLvList(map);

	}

	/**
	 * リストのLABELを取得する.
	 *
	 * @param divCode
	 *            区分コード
	 * @param listValue
	 *            リストのVALUE
	 * @return String リストのLABEL
	 */
	public static String getListLabel(String divCode, String listValue) {
		Map map = (Map) getMstBasicMap().get(divCode);

		if (StringUtil.isEmpty(listValue)) {
			return null;
		}
		for (Iterator i = map.keySet().iterator(); i.hasNext();) {
			String key = (String) i.next();
			if (key.equals(listValue)) {
				return (String) map.get(key);
			}
		}

		return null;
	}

	// --------------------業務部分スタット---------------------------------

	// ------------------------ur04000--------------------------

	/**
	 * LabelValueBeanリストを取得する.
	 *
	 * @param map
	 *            定数の集合
	 * @return returnList LabelValueBeanリスト
	 */
	private static List getLvList(Map map) {
		List returnList = new ArrayList();
		for (Iterator i = map.keySet().iterator(); i.hasNext();) {
			LabelValueBean lv = new LabelValueBean();
			String key = i.next().toString();
			Object obj = map.get(key);
			//nullデータに対して、修正　jinhuashi 2007/4/24
			if (obj == null) {
				lv.setLabel("");
			} else {
				lv.setLabel(obj.toString());
			}

			lv.setValue(key);
			returnList.add(lv);
		}

		return returnList;
	}

	/**
	 * LabelValueBeanリストを取得する.
	 *
	 * @param map
	 *            定数の集合
	 * @return returnList LabelValueBeanリスト
	 */
	protected static List getLvListLabelWithValue(Map map) {
		List returnList = new ArrayList();
		for (Iterator i = map.keySet().iterator(); i.hasNext();) {
			LabelValueBean lv = new LabelValueBean();
			String key = i.next().toString();
			String label = map.get(key).toString();
			lv.setLabel(key + "：" + label);
			lv.setValue(key);
			returnList.add(lv);
		}

		return returnList;
	}

	/**
	 * @return Returns the mailInputStream.
	 */
	public static InputStream getMailInputStream() {
		return mailInputStream;
	}

	/**
	 * 定数を取得する.
	 *
	 * @param dicCode
	 *            区分コード
	 * @param key
	 *            マップのキー
	 * @return String 定数
	 */
	public static String getMapValue(String dicCode, String key) {
		if (StringUtil.isEmpty(key)) {
			return "-";
		}

		return (String) ((Map) constantsMap.get(dicCode)).get(key);

	}

	/**
	 * 食事条件リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getMealCondType() {
		Map map = (Map) getMstBasicMap().get(MEAL_COND_TYPE);
		return getLvList(map);
	}

	/**
	 * 食事箇所リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getMealPlaceCd() {
		Map map = (Map) getMstBasicMap().get(MEAL_PLACE_CD_DIV);
		return getLvList(map);
	}

	/**
	 * 金額状況:有料／無料 .
	 *
	 * @return List 有料／無料
	 */
	public static List getMoneyStatus() {
		List list = new ArrayList();
		List listOrg = getLvList(moneyStatus);
		list.add(0, listOrg.get(1));
		list.add(1, listOrg.get(0));
		return list;
	}

	/**
	 * 送迎区分 .
	 *
	 * @return List
	 */
	public static List getmsDiv() {
		List list = new ArrayList();
		list = getLvList(msDivMap);
		return list;
	}

	/**
	 * @return Returns the mstBasicMap.
	 */
	public static Map getMstBasicMap() {
		return mstBasicMap;
	}

	/**
	 * No.1 提供料金人数上限.
	 *
	 * @return List リスト
	 */
	public static List getNo1MaxCapaPattern() {
		List maxCapaPatternList = new ArrayList();
		for (int i = 5; i <= 14; i++) {
			LabelValueBean lv = new LabelValueBean();
			lv.setLabel(i + "名");
			lv.setValue(i + "");
			maxCapaPatternList.add(lv);
		}
		return maxCapaPatternList;
	}

	/**
	 * キャディ付プレー可否 .
	 *
	 * @return List 可 不可
	 */
	public static List getplayWithCaddieFlg() {
		List list = new ArrayList();
		list = getLvList(playWithCaddieMap);
		return list;
	}

	/**
	 * 都道府県リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getPrefecturesLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_PREFECTURES);
		return getLvList(map);

	}

	/**
	 * タイプリストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getRoomType() {
		Map map = (Map) getMstBasicMap().get(ROOM_TYPE_DIV);
		return getLvList(map);
	}

	/**
	 * タイプリストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getRoomTypeLabelWithValue() {
		Map map = (Map) getMstBasicMap().get(ROOM_TYPE_DIV);
		return getLvListLabelWithValue(map);
	}

	/**
	 * 部屋備品有無リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getRoomVesselFlg() {
		List list = new ArrayList();
		list = getLvList(roomVesselFlgMap);
		return list;
	}

	/**
	 * シーズンリストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getSeasonLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_SEASON);

		List returnList = new ArrayList();

		List list = getLvList(map);

		if (list.size() != 10) {
			return getLvList(map);
		}

		returnList.add(list.get(8));
		returnList.add(list.get(1));
		returnList.add(list.get(2));
		returnList.add(list.get(3));
		returnList.add(list.get(4));
		returnList.add(list.get(5));
		returnList.add(list.get(6));
		returnList.add(list.get(7));
		returnList.add(list.get(9));
		returnList.add(list.get(0));

		return returnList;

	}

	/**
	 * 送付区分リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getSendLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_SEND);
		return getLvList(map);

	}

	/**
	 * シャトルバス予約有無 .
	 *
	 * @return List
	 */
	public static List getshuttleBusBookFlg() {
		List list = new ArrayList();
		list = getLvList(shuttleBusBookMap);
		return list;
	}

	/**
	 * 施設付帯情報一覧機能追加対応 2009/12/04 s30873
	 * 施設付帯種類リストを取得する.
	 *
	 * @return List 施設付帯種類リスト
	 */
	public static List getSortsFacLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_SORTS_FAC);
		return getLvList(map);

	}

	/**
	 * 状態変更種類リストを取得する.
	 * 課題No52：状態変更機能追加対応　2009/12/10 add by s31109
	 *
	 * @return List 種別リスト
	 */
	public static List getStatusChangeList() {
		Map map = (Map) getMstBasicMap().get(DIV_STATUS_CHANGE);
		return getLvList(map);

	}

	/**
	 * 状態リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getStatusLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_STATUS);
		return getLvList(map);

	}

	/**
	 * 在庫区分リストを取得する .
	 *
	 * @return List 在庫区分リスト
	 */
	public static List getStockDivList() {
		Map map = (Map) constantsMap.get(DIV_STOCK_DIV);
		List list = getLvList(map);
		return list;
	}

	/**
	 * 様式区分リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getStyleDivList() {
		Map map = (Map) getMstBasicMap().get(STYLE_DIV);
		return getLvList(map);
	}

	/**
	 * No.1（観光） 予約種別リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getTravelBookKind() {
		Map map = (Map) getMstBasicMap().get(TRAVEL_BOOK_KIND);
		return getLvListLabelWithValue(map);
	}

	/**
	 * No.1（観光） 用途リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getTravelBookPurpose() {
		Map map = (Map) getMstBasicMap().get(TRAVEL_BOOK_PURPOSE);
		return getLvListLabelWithValue(map);
	}

	//消費税対応に伴い、削除
	//	/**
	//	 *   消費税率を取得する.
	//	 *
	//	 * @return List 種別リスト
	//	 */
	//	public static List getConsumptionTaxRateList() {
	//		Map map = (Map) getMstBasicMap().get(CONSUMPTION_TAX_RATE);
	//		return getLvList(map);
	//	}
	/**
	 * 施設付帯情報一覧機能追加対応 2009/12/18 s30873
	 * 施設タイプ名称リストを取得する.
	 *
	 * @return List 施設付帯種類リスト
	 */
	public static List getTypeFaclityLvList() {
		Map map = (Map) getMstBasicMap().get(DIV_TYPE_FAC);
		return getLvList(map);

	}

	//---------------------------------------------------------
	/**
	 * 眺望リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getViewType() {
		Map map = (Map) getMstBasicMap().get(VIEW_TYPE);
		return getLvList(map);
	}

	/**
	 * バイキング制限リストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getVKLitFlg() {
		List list = new ArrayList();
		list = getLvList(vkLitFlgMap);
		return list;
	}

	/**
	 * 定数データの集合の初期化.
	 */
	private static void initConstantsMap() {

		stockDivMap.put(STOCK_DIV_CODE_1, STOCK_DIV_NAME_1);
		stockDivMap.put(STOCK_DIV_CODE_2, STOCK_DIV_NAME_2);
		stockDivMap.put(STOCK_DIV_CODE_3, STOCK_DIV_NAME_3);
		stockDivMap.put(STOCK_DIV_CODE_4, STOCK_DIV_NAME_4);
		constantsMap.put(DIV_STOCK_DIV, stockDivMap);

		fmCostDivMap.put(FM_COST_DIV_CODE_1, FM_COST_DIV_NAME_1);
		fmCostDivMap.put(FM_COST_DIV_CODE_2, FM_COST_DIV_NAME_2);
		fmCostDivMap.put(FM_COST_DIV_CODE_3, FM_COST_DIV_NAME_3);
		constantsMap.put(DIV_FM_COST_DIV, fmCostDivMap);

		fmStockDivMap.put(FM_STOCK_DIV_CODE_1, FM_STOCK_DIV_NAME_1);
		fmStockDivMap.put(FM_STOCK_DIV_CODE_2, FM_STOCK_DIV_NAME_2);
		constantsMap.put(DIV_FM_STOCK_DIV, fmStockDivMap);

		roomVesselFlgMap.put(FLG_TRUE, ROOM_VESSEL_FLG_HAVE);
		roomVesselFlgMap.put(FLG_FALSE, ROOM_VESSEL_FLG_NOT);
		vkLitFlgMap.put(FLG_TRUE, VK_LIT_FLG_HAVE);
		vkLitFlgMap.put(FLG_FALSE, VK_LIT_FLG_NOT);

		informWayFlgMap.put(FLG_TRUE, INFORM_WAY_FLG_HAVA);
		informWayFlgMap.put(FLG_FALSE, INFORM_WAY_FLG_NOT);

		playWithCaddieMap.put(FLG_TRUE, PLAY_WITH_CADDIE_CAN);
		playWithCaddieMap.put(FLG_FALSE, PLAY_WITH_CADDIE_CANNOT);

		dealFeeFlgMap.put(DEAL_FEE_PERCENT_VLAUE, DEAL_FEE_PERCENT);
		dealFeeFlgMap.put(DEAL_FEE_YEN_VALUE, DEAL_FEE_YEN);

		moneyStatus.put(FLG_TRUE, FEE_PAY_FLG);
		moneyStatus.put(FLG_FALSE, FEE_FREE_FLG);

		caddieChargeDivMap.put(CADDIE_CHARGE_DIV_1, CADDIE_CHARGE_DIV_1_NM);
		caddieChargeDivMap.put(CADDIE_CHARGE_DIV_2, CADDIE_CHARGE_DIV_2_NM);
		caddieChargeDivMap.put(CADDIE_CHARGE_DIV_3, CADDIE_CHARGE_DIV_3_NM);

		kartChargeDivMap.put(CADDIE_CHARGE_DIV_1, KART_CHARGE_DIV_1_NM);
		kartChargeDivMap.put(CADDIE_CHARGE_DIV_2, KART_CHARGE_DIV_2_NM);

		msDivMap.put(CADDIE_CHARGE_DIV_1, MS_DIV_1);
		msDivMap.put(CADDIE_CHARGE_DIV_2, MS_DIV_2);
		msDivMap.put(CADDIE_CHARGE_DIV_3, MS_DIV_3);

		shuttleBusBookMap.put(FLG_FALSE, SHUTTLE_BUS_BOOK_FLG_NO);
		shuttleBusBookMap.put(FLG_TRUE, SHUTTLE_BUS_BOOK_FLG_YES);

		//施設付帯情報 施設確定. 2009/12/07 S30873 START
		facDecisionDivMap.put(FAC_DECISION_DIV_CODE_1, FAC_DECISION_DIV_NAME_1);
		facDecisionDivMap.put(FAC_DECISION_DIV_CODE_2, FAC_DECISION_DIV_NAME_2);
		constantsMap.put(DIV_FAC_DECISION_DIV, facDecisionDivMap);
		//		施設付帯情報 施設確定. 2009/12/07 S30873 END
	}

	/**
	 * 企画定義ファイルの初期化.
	 */
	public static void initKikakuProperties() {
		InputStream inFile = JreConstants.class
				.getResourceAsStream("/jp/co/jreast/common/properties/kikakuweb.properties");

		setKikakuWebPropertiesStream(inFile);
	}

	/**
	 * メールの初期化.
	 */
	public static void initMail() {
		InputStream inFile = JreConstants.class
				.getResourceAsStream("/jp/co/jreast/common/properties/mail.properties");

		setMailInputStream(inFile);
	}

	/**
	 * マスタデータの集合の初期化.
	 */
	public static void initMstBasicMap() {
		IDao dao = DaoManagerDelegate.createDao(IDao.class);

		List list = dao.queryForList("BasicMstSearch", null);

		list.addAll(dao.queryForList("BasicMstSearch2", null));

		String tempDiv = null;

		for (Iterator i = list.iterator(); i.hasNext();) {
			BasicMstData one = (BasicMstData) i.next();
			String divCode = one.getDivCode();

			if (!divCode.equals(tempDiv)) {
				getMstBasicMap().put(divCode, new LinkedHashMap());
				tempDiv = divCode;
			}

			((Map) getMstBasicMap().get(divCode)).put(one.getBasicCode1()
					.trim(), one.getBasicName1());

		}

		initConstantsMap();

	}

	/**
	 * @param kikakuWebPropertiesStream
	 *            The kikakuWebPropertiesStream to set.
	 */
	public static void setKikakuWebPropertiesStream(
			InputStream kikakuWebPropertiesStream) {
		JreConstants.kikakuWebPropertiesStream = kikakuWebPropertiesStream;
	}

	/**
	 * @param mailInputStream
	 *            The mailInputStream to set.
	 */
	public static void setMailInputStream(InputStream mailInputStream) {
		JreConstants.mailInputStream = mailInputStream;
	}

	/**
	 * @param mstBasicMap
	 *            The mstBasicMap to set.
	 */
	public static void setMstBasicMap(Map mstBasicMap) {
		JreConstants.mstBasicMap = mstBasicMap;
	}

}
