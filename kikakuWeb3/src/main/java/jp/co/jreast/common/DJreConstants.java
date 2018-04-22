package jp.co.jreast.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import jp.co.intage.framework.dao.DaoManagerDelegate;
import jp.co.intage.framework.dao.IDao;
import jp.co.jreast.common.data.BasicMstData;
import jp.co.jreast.common.data.ddata.NestedLabelValueBean;
import jp.co.jreast.common.support.LabelValueBean;
import jp.co.jreast.common.util.DKikakuWebUtil;
import jp.co.jreast.common.util.DaoUtils;

/**
 * D画面用JreConstantsラッパークラス
 *
 * <pre>
 *   機能概要 ：
 *   特記事項 ： D画面により追加となる動作はここに実装する。
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public final class DJreConstants /* extends JreConstants */ {

	/**
	 * event 企画回答書詳細のイベントを列挙
	 */
	public enum event {
		/** FM送信 */
		fmSoushin,
		/** 一時保存（JR） */
		jrIchijihozon,
		/** 承認（JR） */
		jrShounin,
		/** 再編集 */
		saihenshu,
		/** 削除 */
		sakujo,
		/** 差戻 */
		sashimodoshi,
		/** 一時保存（施設） */
		shisetsuIchijihozon,
		/** 承認（施設） */
		shisetsuShounin,
		/** 送信 */
		soushin,
		/** 造成WEB送信 */
		zouseiwebSoushin
	}

	/**
	 * 一括出力ファイル名（レンタカー）
	 */
	public static final String BATCH_PRINT_FILE_NAME_RENTACAR = "Rentacar_All";

	/**
	 * 一括出力ファイル名（TDR）
	 */
	public static final String BATCH_PRINT_FILE_NAME_TDR = "Tdr_All";

	/** 予約開始相対区分：相対日 */
	public static final String BOOK_BEGIN_RELATIVE_DIV_DATE = "1";

	/** 予約開始相対区分：相対月 */
	public static final String BOOK_BEGIN_RELATIVE_DIV_MONTH = "2";

	/** 支社コード：VTS */
	public static final String BRANCH_CD_VTS = "70";

	/** 子供年齢To : 初期値 */
	public static final String CHILD_AGE_TO_DEFAULT = "12";

	/** コード値 （管理外）: 面積単位 : 未選択 */
	public static final String CODE_AREA_UNIT_NOT_SELECTED = "0";

	/** コード値 : 料金単位区分（ゴルフ） : １名あたり料金 */
	public static final String CODE_CHARGE_DIV_GOLF_PER_PERSON = "1";

	/** コード値 : 料金単位区分（ゴルフ） : １組あたり利用人数ごと料金 */
	public static final String CODE_CHARGE_DIV_GOLF_PER_UNIT_USE_PERSON = "3";

	// TODO : 「コード値 : 状態」の定数名は仮で設定しているので、必要であれば修正を行う。
	/** コード値 : 料金単位区分 : １名あたり料金 */
	public static final String CODE_CHARGE_DIV_PER_PERSON = "1";

	/** コード値 : 料金単位区分 : １台あたり料金 */
	public static final String CODE_CHARGE_DIV_PER_UNIT = "2";

	/** コード値 : 料金単位区分 : １台あたり利用人数ごと料金 */
	public static final String CODE_CHARGE_DIV_PER_UNIT_USE_PERSON = "3";

	/** コード値 : 契約種別 : 両方（DP、RM/SP） */
	public static final String CODE_CONTRACT_KIND_BOTH = "3";

	/** コード値 : 契約種別 : DP（ダイレクトパッケージ） */
	public static final String CODE_CONTRACT_KIND_DP = "1";

	/** コード値 : 契約種別 : RM/SP（レディメイド/セレクトパック） */
	public static final String CODE_CONTRACT_KIND_RMSP = "2";

	/** コード値 : 手数料タイプ : 額 */
	public static final String CODE_DEAL_FEE_TYPE_AMOUNT = "2";

	/** コード値 : 手数料タイプ : 率 */
	public static final String CODE_DEAL_FEE_TYPE_PERCENT = "1";

	/** コード値 : 基本マスタ.区分コード=通知方法 : 在庫管理マスタのリスト用フラグ */
	public static final String CODE_DIV_INFORM_FOR_STOCK_MANAGEMENT = "1";

	/** コード値 : 施設付帯情報承認状況ユーザー区分 : 施設 */
	public static final String CODE_FACILITY_ACK_USER_DIV_FACILITY = "2";

	/** コード値 : 施設付帯情報承認状況ユーザー区分 : JR */
	public static final String CODE_FACILITY_ACK_USER_DIV_JR = "1";

	/**
	 * コード値 : 施設確定フラグ : 確定
	 *
	 * @see {@link JreConstants#FAC_DECISION_DIV_CODE_2}
	 */
	public static final String CODE_FACILITY_DECISION_FLG_DECISION = "1";

	/**
	 * コード値 : 施設確定フラグ : 未確定
	 *
	 * @see {@link JreConstants#FAC_DECISION_DIV_CODE_1}
	 */
	public static final String CODE_FACILITY_DECISION_FLG_UNDECIDED = "0";

	/** コード値 : 施設素材種別 : Aコード（旧商品） */
	public static final String CODE_FACILITY_MATERIAL_KIND_ACODE = "1";

	/** コード値 : 施設素材種別 : DP・RM用（新商品） */
	public static final String CODE_FACILITY_MATERIAL_KIND_DPRM = "2";

	/** コード値 : 施設付帯種類 : NO3 */
	public static final String CODE_FACILITY_SORTS_NO3 = JreConstants.FUTAI_FACILITY_PATTERN_NO3;

	/** コード値 : 施設付帯種類 : NO5 */
	public static final String CODE_FACILITY_SORTS_NO5 = JreConstants.FUTAI_FACILITY_PATTERN_NO5;

	/** コード値 : 回答書種別 : 船車レンタカー */
	public static final String CODE_KIND_FLG_TRAFFIC_RENTACAR = "7";

	/** コード値 : 回答書種別 : 観光TDR（東京ディズニーリゾート） */
	public static final String CODE_KIND_FLG_TRAVEL_TDR = "8";

	/** コード値 : 素材種別 : Aコード */
	public static final String CODE_MATERIAL_KIND_ACODE = "0";

	/** コード値 : 素材種別 : DP（ダイレクトパッケージ） */
	public static final String CODE_MATERIAL_KIND_DP = "1";

	/** コード値 : 素材種別 : DP・RM用 */
	public static final String CODE_MATERIAL_KIND_DPRM = "3";

	/** コード値 : 素材種別 : RM/SP（レディメイド/セレクトパック） */
	public static final String CODE_MATERIAL_KIND_RMSP = "2";

	/** コード値 : 食事条件 : 1泊朝食付 */
	public static final String CODE_MEAL_COND_TYPE_INCLUDE_BREAKFAST = "4";

	/** コード値 : 箇所選択 人数により異なる */
	public static final String CODE_PLACE_FLG_NINZUU = "2";

	/** コード値 : 箇所選択 お客様選択可 */
	public static final String CODE_PLACE_FLG_OKYAKUSAMSENTAKUKA = "0";

	/** コード値 : 箇所選択 選択不可 */
	public static final String CODE_PLACE_FLG_SENTAKUFUKA = "1";

	/** コード値 : 箇所選択 その他（フリー入力） */
	public static final String CODE_PLACE_FLG_SONOTA = "3";

	/** コード値 : 目的大分類 : オプション */
	public static final String CODE_PURPOSE_LARGE_OPTION = "9";

	/** コード値 : レンタカークラス : A */
	public static final String CODE_RENTACAR_CLASS_A = "2";

	/** コード値 : レンタカークラス : S */
	public static final String CODE_RENTACAR_CLASS_S = "1";

	/** コード値 : 選択方法 チェックイン時 */
	public static final String CODE_SELECT_FLG_CHECKIN = "2";

	/** コード値 : 選択方法 申込時入力 */
	public static final String CODE_SELECT_FLG_MOUSHIKOMI = "0";

	/** コード値 : 選択方法 要電話予約 */
	public static final String CODE_SELECT_FLG_YOUDENWAYOYAKU = "1";

	/** コード値 : 選択方法 予約不要 */
	public static final String CODE_SELECT_FLG_YOYAKUFUYOU = "3";

	/** コード値 : 連泊割引区分 : ２泊目以降一律 */
	public static final String CODE_STAY_DISCOUNT_ALL = "2";

	/** コード値 : 連泊割引区分 : 泊数に応じて可変 */
	public static final String CODE_STAY_DISCOUNT_CASE = "1";

	/** コード値 : 在庫制限フラグ : 制限あり */
	public static final String CODE_STOCK_CONTROL_FLG_LIMITED = "1";

	/** コード値 : 在庫制限フラグ : 制限無し */
	public static final String CODE_STOCK_CONTROL_FLG_UNLIMITED = "0";

	/** コード値 : 在庫管理方法 : 人数管理 */
	public static final String CODE_STOCK_MANAGEMENT_PERSONS_MANAGED = "0";

	/** コード値 : 在庫管理方法 : 台数組数管理 */
	public static final String CODE_STOCK_MANAGEMENT_UNIT_MANAGED = "1";

	/** コード値 : 在庫タイプ : 他企画と共用 */
	public static final String CODE_STOCK_TYPE_SHARE = "4";

	/** コード値 : 在庫単位（ベース） : 台 */
	private static final String CODE_STOCK_UNIT_DAI = "2";

	/** コード値 : 在庫単位レンタカー : 台 */
	public static final String CODE_STOCK_UNIT_RENTACAR_DAI = CODE_STOCK_UNIT_DAI;

	/** コード値 （管理外）: 様式区分 : 未選択 */
	public static final String CODE_STYLE_DIV_NOT_SELECTED = "0";

	/** 企画回答書.会社ID : JR東 */
	public static final String COM_ID_JRES = "2";

	/** 手数料率・額区分：率 */
	public static final String COMMISSION_RATE_PRICE_PERCENT = "10";

	/** 会社名：JR東日本 */
	public static final String COMPANY_NAME_JREAST = "東日本旅客鉄道株式会社";

	/** 会社名：VTS */
	public static final String COMPANY_NAME_VTS = "VTS";

	/** 日付フォーマット形式 */
	public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

	/** 基本マスタ.区分コード : エリア */
	public static final String DIV_AREA_CD = "0027";

	/** 基本マスタ.区分コード : NGワード */
	public static final String DIV_BAD_WORDS = "0052";

	/** 基本マスタ.区分コード : 設定支社分類 */
	public static final String DIV_BRANCH_CLASS = "0035";

	/**
	 * 基本マスタ.区分コード : 支社コード（CD1） <-> 企画通番用支社コード（CD2）
	 * SQL内で直接コードを使用しているため、変更時は注意
	 */
	public static final String DIV_BRANCH_TO_PLAN_NO = "0048";

	/** 基本マスタ.区分コード : 料金単位区分(船車) */
	public static final String DIV_CHARGE_DIV = "0034";

	/** 基本マスタ.区分コード : 料金単位区分（ゴルフ） */
	public static final String DIV_CHARGE_DIV_GOLF = "0053";

	/** 基本マスタ.区分コード : 料金単位区分(観光) */
	public static final String DIV_CHARGE_DIV_TRAVEL = "0056";

	/** 基本マスタ.区分コード : 施設付帯情報登録上限件数 */
	public static final String DIV_D_FACILITY_MANAGE_LIMIT = "0049";

	/** 基本マスタ.区分コード : 手数料タイプ */
	public static final String DIV_DEAL_FEE_TYPE = "0033";

	/** 基本マスタ.区分コード : 地区大分類 */
	public static final String DIV_DISTRICT_LARGE_CLASS = "0029";

	/** 基本マスタ.区分コード : 地区小分類 */
	public static final String DIV_DISTRICT_SMALL_CLASS = "0030";

	/** 基本マスタ.区分コード : 食事条件（NO1）（新商品用） */
	public static final String DIV_DR_MEAL_COND_TYPE = "0112";

	/** 基本マスタ.区分コード : 施設素材種別 */
	public static final String DIV_FACILITY_MATERIAL_KIND = "0022";

	/** 基本マスタ.区分コード : 状態（施設） */
	public static final String DIV_FP_STATUS = "0023";

	/**
	 * 等級区分コード.
	 */
	public static final String DIV_GRADE = "1112";

	/** 基本マスタ.区分コード : 通知方法 */
	public static final String DIV_INFORM = "0026";

	/** 基本マスタ.区分コード : 回答書紐づけ */
	public static final String DIV_LINKING_ANS_NAME = "0024";

	/** 基本マスタ.区分コード : 素材種別 */
	public static final String DIV_MATERIAL_KIND = "0021";

	/** 基本マスタ.区分コード : 1日当設定可能室タイプ数 */
	public static final String DIV_MAX_ROOM_TYPE = "0050";

	/** 基本マスタ.区分コード : その他分類 */
	public static final String DIV_MISCELLANEOUS_CLASS = "0037";

	/**
	 * DP/RMのみ作れる支社
	 */
	public static final String DIV_NEW_TYPE_CREATE_BRANCH = "0060";

	/**
	 * Aコードのみ作れる支社
	 */
	public static final String DIV_OLD_TYPE_CREATE_BRANCH = "0059";

	/** 基本マスタ.区分コード : 目的大分類 */
	public static final String DIV_PURPOSE_LARGE_CLASS = "0031";

	/** 基本マスタ.区分コード : 目的小分類 */
	public static final String DIV_PURPOSE_SMALL_CLASS = "0032";

	/** 基本マスタ.区分コード : 地域 */
	public static final String DIV_REGION_CD = "0028";

	/** 基本マスタ.区分コード : レンタカークラス */
	public static final String DIV_RENTACAR_CLASS = "1111";

	/** 基本マスタ.区分コード : 特定商品分類 */
	public static final String DIV_SPECIFIC_GOODS_CLASS = "0036";

	/** 基本マスタ.区分コード : 連泊割引区分 */
	public static final String DIV_STAY_DISCOUNT = "0110";

	/** 基本マスタ.区分コード : 在庫単位（ゴルフ） */
	public static final String DIV_STOCK_UNIT_GOLF = "0043";

	/** 基本マスタ.区分コード : 在庫単位（リフト） */
	public static final String DIV_STOCK_UNIT_LIFT = "0044";

	/** 基本マスタ.区分コード : 在庫単位（レンタカー） */
	public static final String DIV_STOCK_UNIT_RENTACAR = "0046";

	/** 基本マスタ.区分コード : 在庫単位（TDR） */
	public static final String DIV_STOCK_UNIT_TDR = "0045";

	/** 基本マスタ.区分コード : 在庫単位（船車（台組無）） */
	public static final String DIV_STOCK_UNIT_TRAFFIC_PERSONS_MANAGED = "0041";

	/** 基本マスタ.区分コード : 在庫単位（船車（台組あり）） */
	public static final String DIV_STOCK_UNIT_TRAFFIC_UNIT_MANAGED = "0042";

	/** 基本マスタ.区分コード : 在庫単位（観光（台組無）） */
	public static final String DIV_STOCK_UNIT_TRAVEL_PERSONS_MANAGED = "0039";

	/** 基本マスタ.区分コード : 在庫単位（観光（台組あり）） */
	public static final String DIV_STOCK_UNIT_TRAVEL_UNIT_MANAGED = "0040";

	/** 基本マスタ.区分コード : 東京都宿泊税 */
	public static final String DIV_TYO_STAY_TAX = "0109";

	/** 基本マスタ.区分コード : 眺望 */
	private static final String DIV_VIEW_CD = "0103";

	/** TODO:定数名の最適化が必要 NO1宿泊 : タイプ(在庫部分の室タイプ).null */
	public static final int DR01010_TYPE_NULL = -1;

	/** 設備種別：加湿器貸し出し */
	public static final int EQUIPMENT_KIND_HUMIDIFIER = 22;

	/** 設備種別：電気スタンド貸し出し */
	public static final int EQUIPMENT_KIND_LAMP = 23;

	/** 設備種別：ランドリーサービス */
	public static final int EQUIPMENT_KIND_LAUNDRY = 19;

	/** 設備種別：マッサージサービス */
	public static final int EQUIPMENT_KIND_MASSAGE = 21;

	/** 設備種別：飲食施設 */
	public static final int EQUIPMENT_KIND_RESTAURANT = 18;

	/** 設備種別：ルームサービス */
	public static final int EQUIPMENT_KIND_ROOM_SERVICE = 20;

	/** 設備種別：館内に売店あり */
	public static final int EQUIPMENT_KIND_STAND = 17;

	/** 状態(施設) 33:JR登録中 */
	public static final int FPSTATUS_JR_TOUROKUCHU = 33;

	/** 状態(施設) 73:JR登録中(再) */
	public static final int FPSTATUS_JR_TOUROKUCHU_SAI = 73;

	/** 状態(施設) 34:JR登録中(保留) */
	public static final int FPSTATUS_JR_TOUROKUCHUU_HORYU = 34;

	/** 状態(施設) 74:JR登録中(保留)(再) */
	public static final int FPSTATUS_JR_TOUROKUCHUU_HORYU_SAI = 74;

	/** 状態(施設) 24:開封 */
	public static final int FPSTATUS_KAIFU = 24;

	/** 状態(施設) 23:未開封 */
	public static final int FPSTATUS_MIKAIFU = 23;

	/** 状態(施設) 51:再編集中(再) */
	public static final int FPSTATUS_SAIHENSHUCHU_SAI = 51;

	/** 状態(施設) 11:作成 */
	public static final int FPSTATUS_SAKUSEI = 11;

	/** 状態(施設) 12:作成(保留) */
	public static final int FPSTATUS_SAKUSEI_HORYU = 12;

	/** 状態(施設) 37:差戻 */
	public static final int FPSTATUS_SASHIMODOSHI = 37;

	/** 状態(施設) 77:差戻(再) */
	public static final int FPSTATUS_SASHIMODOSHI_SAI = 77;

	/** 状態(施設) 0:新規 */
	public static final int FPSTATUS_SHINKI = 0;

	/** 状態(施設) 31:施設登録中 */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU = 31;

	/** 状態(施設) 32:施設登録中(保留) */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU_HORYU = 32;

	/** 状態(施設) 72:施設登録中(保留)(再) */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU_HORYU_SAI = 72;

	/** 状態(施設) 71:施設登録中(再) */
	public static final int FPSTATUS_SHISETSU_TOUROKUCHU_SAI = 71;

	/** 状態(施設) 35:承認待ち */
	public static final int FPSTATUS_SHONINMACHI = 35;

	/** 状態(施設) 75:承認待ち(再) */
	public static final int FPSTATUS_SHONINMACHI_SAI = 75;

	/** 状態(施設) 36:承認済 */
	public static final int FPSTATUS_SHONINZUMI = 36;

	/** 状態(施設) 76:承認済(再) */
	public static final int FPSTATUS_SHONINZUMI_SAI = 76;

	/** 状態(施設) 22:送信エラー */
	public static final int FPSTATUS_SOUSHINERROR = 22;

	/** 状態(施設) 21:送信待ち */
	public static final int FPSTATUS_SOUSHINMACHI = 21;

	/** 状態(施設) 41:造成連携待ち */
	public static final int FPSTATUS_ZOUSEIRENKEIMACHI = 41;

	/** 状態(施設) 81:造成連携待ち(再) */
	public static final int FPSTATUS_ZOUSEIRENKEIMACHI_SAI = 81;

	/** 状態(施設) 42:造成連携済 */
	public static final int FPSTATUS_ZOUSEIRENKEIZUMI = 42;

	/** 状態(施設) 82:造成連携済(再) */
	public static final int FPSTATUS_ZOUSEIRENKEIZUMI_SAI = 82;

	/** 権限制御用ページ番号: 施設付帯情報NO3 */
	public static final int JRIGHT_PAGE_NO3 = 3;

	/** 権限制御用ページ番号: 施設付帯情報NO5 */
	public static final int JRIGHT_PAGE_NO5 = 5;

	/**
	 * No1画面東日本在庫の限定数.
	 */
	public static final int JRSTOCKCAPACITY = 6;

	/** リクエスト属性キー : トップページ : ステータス通知データ */
	public static final String KEY_UR00200_STATUS_NOTICE_DATA = "ur00200statusNoticeOutData";

	/** 回答書連携：あり */
	public static final String LABEL_KAITOUSHO_RENKEI_ARI = "あり";

	/** 回答書連携：なし */
	public static final String LABEL_KAITOUSHO_RENKEI_NASHI = "なし";

	/** 回答書連携：連携済 */
	public static final String LABEL_KAITOUSHO_RENKEI_RENKEIZUMI = "連携済";

	/** 回答書連携：対象外 */
	public static final String LABEL_KAITOUSHO_RENKEI_TAISHOUGAI = "-";

	/** 手仕舞日：当日 */
	public static final Integer LIQUIDATE_DAY_CURRENT = new Integer(0);

	/** リクエスト属性キー : 「NGワード」リスト */
	public static final String LIST_NAME_DIV_BAD_WORDS = "badWordsList";

	/** リクエスト属性キー : 「設定支社分類」リスト */
	public static final String LIST_NAME_DIV_BRANCH_CLASS = "branchClassList";

	/** リクエスト属性キー : 「料金単位区分（船車）」リスト */
	public static final String LIST_NAME_DIV_CHARGE_DIV = "chargeDivList";

	/** リクエスト属性キー : 「料金単位区分（観光）」リスト */
	public static final String LIST_NAME_DIV_CHARGE_DIV_TRAVEL = "chargeDivTravelList";

	/** リクエスト属性キー : 「料金単位区分（ゴルフ）」リスト */
	public static final String LIST_NAME_DIV_CHARGE_GOLF_DIV = "chargeDivGolfList";

	/** リクエスト属性キー：「作成件数」リスト */
	public static final String LIST_NAME_DIV_COUNT_CREATE = "countCreateList";

	/** リクエスト属性キー : 「地区大分類」リスト */
	public static final String LIST_NAME_DIV_DISTRICT_LARGE_CLASS = "districtLargeClassList";

	/** リクエスト属性キー : 「食事条件（NO1）（新商品用）」リスト */
	public static final String LIST_NAME_DIV_DR_MEAL_COND_TYPE = "drMealCondTypeList";

	/** リクエスト属性キー : 「施設素材種別」リスト */
	public static final String LIST_NAME_DIV_FACILITY_MATERIAL_KIND = "facilityMaterialKindList";

	/** リクエスト属性キー : 「等級」リスト */
	public static final String LIST_NAME_DIV_GRADE = "gradeList";

	/** リクエスト属性キー : 「手仕舞通知方法」リスト */
	public static final String LIST_NAME_DIV_LIQUIDATE_INFORM = "liquidateInformList";

	/** リクエスト属性キー : 「素材種別」リスト */
	public static final String LIST_NAME_DIV_MATERIAL_KIND = "materialKindList";

	/** リクエスト属性キー : 「その他分類」リスト */
	public static final String LIST_NAME_DIV_MISCELLANEOUS_CLASS = "miscellaneousClassList";

	/** リクエスト属性キー : 「目的大分類」リスト */
	public static final String LIST_NAME_DIV_PURPOSE_LARGE_CLASS = "purposeLargeClassList";

	/** リクエスト属性キー : 「レンタカークラス」リスト */
	public static final String LIST_NAME_DIV_RENTACAR_CLASS = "rentacarClassList";

	/** リクエスト属性キー : 「予約通知方法」リスト */
	public static final String LIST_NAME_DIV_RESERVE_INFORM_WAY = "reserveInformWayList";

	/** リクエスト属性キー : 「特定商品分類」リスト */
	public static final String LIST_NAME_DIV_SPECIFIC_GOODS_CLASS = "specificGoodsClassList";

	/** リクエスト属性キー : 「在庫単位（ゴルフ）」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_GOLF = "stockUnitGolfList";

	/** リクエスト属性キー : 「在庫単位（リフト）」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_LIFT = "stockUnitLiftList";

	/** リクエスト属性キー : 「在庫単位（レンタカー）」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_RENTACAR = "stockUnitRentacarList";

	/** リクエスト属性キー : 「在庫単位（TDR）」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TDR = "stockUnitTdrList";

	/** リクエスト属性キー : 「在庫単位（船車（台組無））」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAFFIC_PERSONS_MANAGED = "stockUnitTrafficPersonsManagedList";

	/** リクエスト属性キー : 「在庫単位（船車（台組あり））」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAFFIC_UNIT_MANAGED = "stockUnitTrafficUnitManagedList";

	/** リクエスト属性キー : 「在庫単位（観光（台組無））」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAVEL_PERSONS_MANAGED = "stockUnitTravelPersonsManagedList";

	/** リクエスト属性キー : 「在庫単位（観光（台組あり））」リスト */
	public static final String LIST_NAME_DIV_STOCK_UNIT_TRAVEL_UNIT_MANAGED = "stockUnitTravelUnitManagedList";

	/** リクエスト属性キー : 「東京都宿泊税」リスト */
	public static final String LIST_NAME_DIV_TYO_STAY_TAX = "tyoStayTaxList";

	/** リクエスト属性キー : 「眺望」リスト */
	public static final String LIST_NAME_DIV_VIEW_CD = "viewCdList";

	/**
	 * 部屋タイプリスト名（DP/RM用）
	 */
	public static final String LIST_ROOM_TYPE_DR = "roomTypeListDr";

	/**
	 * 部屋タイプリスト名.
	 */
	public static final String LIST_ROOM_TYPE_LABEL_WITH_VALUE_DR = "roomTypeListLabelWithValueDr";

	/** 人員種別：大学生 */
	public static final int MAN_KIND_COLLEGE = 4;

	/** 人員種別：高校生 */
	public static final int MAN_KIND_HIGH = 5;

	/** 人員種別：中学生 */
	public static final int MAN_KIND_JUNIORHIGH = 6;

	/** 人員種別：シニア */
	public static final int MAN_KIND_SENIOR = 3;

	/** リクエスト属性キー : 「エリア／県／地域」マップ */
	public static final String MAP_NAME_DIV_AREA_PREFECTURES_REGION = "areaPrefecturesRegionMap";

	/** リクエスト属性キー : 「支社コード・設定支社分類関連」マップ */
	public static final String MAP_NAME_DIV_BRANCH_CLASS_RELATION = "branchClassRelationMap";

	/** リクエスト属性キー : 「地区小分類」マップ */
	public static final String MAP_NAME_DIV_DISTRICT_SMALL_CLASS = "districtSmallClassMap";

	/** リクエスト属性キー : 「目的小分類」マップ */
	public static final String MAP_NAME_DIV_PURPOSE_SMALL_CLASS = "purposeSmallClassMap";

	/** １名料金フラグ : なし */
	public static final String ONE_PERSON_FLG_NONE = "0";

	/** １名料金フラグ : 1名料金 */
	public static final String ONE_PERSON_FLG_ONE_PERSON_FEE = "1";

	/** 指定パーク : 両パーク利用可 */
	public static final String PARK_FLG_BOTH = "4";

	/** 指定パーク : 1パーク選択 */
	public static final String PARK_FLG_ONESIDE = "3";

	/** 指定パーク : TDL */
	public static final String PARK_FLG_TDL = "1";

	/** 指定パーク : TDS */
	public static final String PARK_FLG_TDS = "2";

	/** プロセスフラグ：エラー表示のみ（ダイアログ表示無） */
	public static final String PROCESS_FLG_NO_ALERT = "1";

	/** プロセスフラグ：通常エラー：初期値（ダイアログ表示有） */
	public static final String PROCESS_FLG_NORMAL_ALERT = "0";

	/** プロセスフラグ：エラー保存（ダイアログ表示有） */
	public static final String PROCESS_FLG_SAVE_ALERT = "2";

	/**
	 * 部屋タイプ区分コード(DP/RM用).
	 */
	public static final String ROOM_TYPE_DIV_DR = "0111";

	/** 画面区分 : 判定不可 */
	public static final String SCREEN_FLG_ERROR = "0";

	/** 画面区分 : NO1 */
	public static final String SCREEN_FLG_NO1 = "1";

	/** 画面区分 : NO2 */
	public static final String SCREEN_FLG_NO2 = "2";

	/** 画面区分 : NO3 */
	public static final String SCREEN_FLG_NO3 = "3";

	/** 画面区分 : NO4 */
	public static final String SCREEN_FLG_NO4 = "4";

	/** 画面区分 : NO5 */
	public static final String SCREEN_FLG_NO5 = "5";

	/** 画面ID : 観光ゴルフ(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_GOLF_NO1 = "dr01013";

	/** 画面ID : 船車リフト(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_LIFT_NO1 = "dr01014";

	/** 画面ID : 船車リフト(DP/RM) : NO2 */
	public static final String SCREEN_ID_D_LIFT_NO2 = "dr01021";

	/** 画面ID : 観光・船車(DP/RM) : NO4 */
	public static final String SCREEN_ID_D_LIFT_NO4 = "dr01042";

	/** 画面ID : 宿泊(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_STAYING_NO1 = "dr01010";

	/** 画面ID : 宿泊(DP/RM) : NO2 */
	public static final String SCREEN_ID_D_STAYING_NO2 = "dr01020";

	/** 画面ID : 宿泊(DP/RM) : NO2（ホテル） */
	public static final String SCREEN_ID_D_STAYING_NO2_HOTEL = "dr01022";

	/** 画面ID : 宿泊(DP/RM) : NO2（スキー） */
	public static final String SCREEN_ID_D_STAYING_NO2_SKI = "dr01023";

	/** 画面ID : 宿泊(DP/RM) : NO3 */
	public static final String SCREEN_ID_D_STAYING_NO3 = "dr05030";

	/** 画面ID : 宿泊(DP/RM) : NO3（スキー） */
	public static final String SCREEN_ID_D_STAYING_NO3_SKI = "dr05032";

	/** 画面ID : 宿泊(DP/RM) : NO4 */
	public static final String SCREEN_ID_D_STAYING_NO4 = "dr01040";

	/** 画面ID : 宿泊(DP/RM) : NO5 */
	public static final String SCREEN_ID_D_STAYING_NO5 = "dr05050";

	/** 画面ID : 宿泊(DP/RM) : NO5（スキー） */
	public static final String SCREEN_ID_D_STAYING_NO5_SKI = "dr05052";

	/** 画面ID : 船車(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_TRAFFIC_NO1 = "dr01012";

	/** 画面ID : 観光(DP/RM) : NO1 */
	public static final String SCREEN_ID_D_TRAVEL_NO1 = "dr01011";

	/** 画面ID : 観光・船車(DP/RM) : NO4 */
	public static final String SCREEN_ID_D_TRAVEL_TRAFFIC_NO4 = "dr01041";

	/** 画面ID : 回答書作成画面 */
	public static final String SCREEN_ID_PLAN_ANS_CREATE = "ur00300";

	/** 帳票作成タイプ.BatchPrint2XlsFile系 */
	public static final int SHEET_TYPE_BATCH2XLS = 1;

	/** 帳票作成タイプ.Print2XlsFile系 */
	public static final int SHEET_TYPE_PRINT2XLS = 2;

	/** コード値 : 状態 : JR登録中（保留）（再） */
	public static final Integer STATUS_JR_TOUROKUCHU_HORYU_SAI = new Integer(54);

	/** コード値 : 状態 : JR登録中（再） */
	public static final Integer STATUS_JR_TOUROKUCHU_SAI = new Integer(53);

	/** コード値 : 状態 : 料金確定（再） */
	public static final Integer STATUS_RYOUKIN_KAKUTEI_SAI = new Integer(60);

	/** コード値 : 状態 : 料金承認（再） */
	public static final Integer STATUS_RYOUKIN_SHONIN_SAI = new Integer(61);

	/** コード値 : 状態 : 再編集中 */
	public static final Integer STATUS_SAIHENSHUCHU = new Integer(50);

	/** コード値 : 状態 : 差戻（再） */
	public static final Integer STATUS_SASHIMODOSHI_SAI = new Integer(62);

	/** コード値 : 状態 : 施設登録中（保留）（再） */
	public static final Integer STATUS_SHISETSU_TOUROKUCHU_HORYU_SAI = new Integer(
			52);

	/** コード値 : 状態 : 施設登録中（再） */
	public static final Integer STATUS_SHISETSU_TOUROKUCHU_SAI = new Integer(51);

	/** コード値 : 状態 : 送信エラー */
	public static final Integer STATUS_SOUSHIN_ERROR = new Integer(3);

	/** コード値 : 状態 : 在庫追加 */
	public static final Integer STATUS_ZAIKO_TSUIKA = new Integer(55);

	/** コード値 : 状態 : 造成WEB送信待ち */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINMACHI = new Integer(24);

	/** コード値 : 状態 : 造成WEB送信待ち（再） */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINMACHI_SAI = new Integer(
			63);

	/** コード値 : 状態 : 造成WEB送信済 */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINZUMI = new Integer(25);

	/** コード値 : 状態 : 造成WEB送信済（再） */
	public static final Integer STATUS_ZOUSEIWEB_SOUSHINZUMI_SAI = new Integer(
			64);

	/** 在庫番号 : 非在庫 */
	public static final String STOCK_NO_NONSTOCKED = "0000";

	/** 在庫番号（人数管理）終了値 */
	public static final String STOCK_NO_PERSONS_MANGED_END = "4999";

	/** 在庫番号（人数管理）開始値 */
	public static final String STOCK_NO_PERSONS_MANGED_START = "0001";

	/** 予約在庫番号リスト */
	public static final String[] STOCK_NO_RESERVED_LIST = new String[] { STOCK_NO_NONSTOCKED };

	/** 在庫番号（台数組数管理）終了値 */
	public static final String STOCK_NO_UNIT_MANAGED_END = "9999";

	/** 在庫番号（台数組数管理）開始値 */
	public static final String STOCK_NO_UNIT_MANAGED_START = "5000";

	/** 料金表詳細.ツーサム対応可能 : 対応しない */
	public static final String TWO_SAM_FLG_IMPOSSIBLE = "";

	/** 料金表詳細.ツーサム対応可能 : 対応可能 */
	public static final String TWO_SAM_FLG_POSSIBLE = "1";

	/** ユーザIDプリフィックス : 長野ユーザ */
	public static final String USER_ID_ITN_PREFIX = "itn";

	/** 企画回答書.造成連携回数 : 未連携 */
	public static final Integer ZOUSEI_RELATE_CNT_NOT_RELATE = new Integer(0);

	/** 付帯情報造成WEB送信時コメント：NO3 */
	public final static String ZOUSEI_WEB_SEND_COMMENT_TEMPLATE_NO3 = "施設付帯情報NO3が確定しました。";

	/** 付帯情報造成WEB送信時コメント：NO5 */
	public final static String ZOUSEI_WEB_SEND_COMMENT_TEMPLATE_NO5 = "施設付帯情報NO5が確定しました。";

	/**
	 * 区分コードを指定し基本マスタデータのリストを取得します。
	 *
	 * <pre></pre>
	 *
	 * @param divisionCd
	 *            区分コード
	 * @return 基本マスタデータのリスト
	 */
	private static List<BasicMstData> fetchBasicMstData(String divisionCd) {
		IDao dao = DaoManagerDelegate.createDao(IDao.class);

		List<?> resultList = dao.queryForList("d_fetchMBasisByDivisionCd",
				divisionCd);

		List<BasicMstData> list = DaoUtils.castList(resultList);

		return list;
	}

	/**
	 * 「エリア／県／地域」ハッシュを取得します。
	 *
	 * <pre>
	 * JSでコンボボックスのoption要素を構築するために使用します。
	 *
	 * 以下の構造のハッシュを作成します。
	 * hash : {
	 *      "(areaCd)" : {
	 *          'label' : "(areaNm)",
	 *          'value' : "(areaCd)",
	 *          'children' : {
	 *              "(prefecturesCd)" : {
	 *                  'label' : "(prefecturesNm)",
	 *                  'value' : "(prefecturesCd)",
	 *                  'children' : {
	 *                      "(regionCd)" : {
	 *                          'label' : "(prefecturesNm)",
	 *                          'value' : "(prefecturesCd)",
	 *                          'children' : {}
	 *                      }
	 *                      ...
	 *                  }
	 *              }
	 *              ...
	 *          }
	 *      },
	 *      ...
	 * }
	 * </pre>
	 *
	 * @return 「エリア／県／地域」マップ
	 */
	public static Map<String, NestedLabelValueBean> getAreaPrefecturesRegionMap() {

		List<BasicMstData> areaList = fetchBasicMstData(DIV_AREA_CD);
		List<BasicMstData> prefecturesList = fetchBasicMstData(JreConstants.DIV_PREFECTURES);
		List<BasicMstData> regionList = fetchBasicMstData(DIV_REGION_CD);

		Map<String, NestedLabelValueBean> areaPrefRegionMap = new HashMap<>();

		// エリアデータをハッシュに追加
		for (BasicMstData area : areaList) {
			NestedLabelValueBean areaItem = new NestedLabelValueBean(area);

			areaPrefRegionMap.put(areaItem.getValue(), areaItem);

			// 都道府県データをハッシュに追加
			for (BasicMstData prefectures : prefecturesList) {
				if (!areaItem.getValue().equals(
						StringUtils.trimToEmpty(prefectures.getBasicCode2()))) {
					continue;
				}

				NestedLabelValueBean prefItem = new NestedLabelValueBean(
						prefectures);

				areaItem.appendChild(prefItem);

				// 地域データをハッシュに追加
				for (BasicMstData region : regionList) {
					if (!prefItem.getValue().equals(
							StringUtils.trimToEmpty(region.getBasicCode2()))) {
						continue;
					}

					NestedLabelValueBean regionItem = new NestedLabelValueBean(
							region);

					prefItem.appendChild(regionItem);
				}
			}
		}

		return areaPrefRegionMap;
	}

	/**
	 * 「NGワード」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「NGワード」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getBadWordsList() {
		return getMstBasicList(DIV_BAD_WORDS);
	}

	/**
	 * 「設定支社分類」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「設定支社分類」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getBranchClassList() {
		return getMstBasicList(DIV_BRANCH_CLASS);
	}

	/**
	 * 「支社コード・設定支社分類関連」ハッシュを取得します。
	 *
	 * <pre></pre>
	 *
	 * @return 「支社コード・設定支社分類関連」ハッシュ
	 */
	public static Map<String, String> getBranchClassRelationMap() {

		Map<String, String> map = new HashMap<>();

		List<BasicMstData> basisList = fetchBasicMstData(DIV_BRANCH_CLASS);

		for (BasicMstData basis : basisList) {
			String branchCd = StringUtils.defaultString(basis.getBasicCode2());
			String branchClass = StringUtils.trimToEmpty(basis.getBasicCode1());

			map.put(branchCd, branchClass);
		}

		return map;
	}

	/**
	 * 「料金単位区分（ゴルフ）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「料金単位区分（ゴルフ）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getChargeDivGolfList() {
		return getMstBasicList(DIV_CHARGE_DIV_GOLF);
	}

	/**
	 * 「料金単位区分」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「料金単位区分」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getChargeDivList() {
		return getMstBasicList(DIV_CHARGE_DIV);
	}

	/**
	 * 「料金単位区分（観光）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「料金単位区分（観光）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getChargeDivTravelList() {
		return getMstBasicList(DIV_CHARGE_DIV_TRAVEL);
	}

	/**
	 * 「作成件数 」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「作成件数 」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getCountCreateList() {
		List<LabelValueBean> list = new ArrayList<LabelValueBean>();

		for (int i = 1; i < 10; i++) {
			String str = String.valueOf(i);
			list.add(new LabelValueBean(str, str));
		}
		return list;
	}

	/**
	 * 「地区大分類」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「地区大分類」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getDistrictLargeClassList() {
		return getMstBasicList(DIV_DISTRICT_LARGE_CLASS);
	}

	/**
	 * 「地区大分類／地区小分類」ハッシュを取得します。
	 *
	 * <pre></pre>
	 *
	 * @return 「地区大分類／地区小分類」ハッシュ
	 */
	public static Map<String, NestedLabelValueBean> getDistrictSmallClassMap() {
		return getMBasisChildrenMap(DIV_DISTRICT_SMALL_CLASS);
	}

	/**
	 * 「食事条件（NO1）（新商品用）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「食事条件（NO1）（新商品用）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getDrMealCondTypeList() {
		return getMstBasicList(DIV_DR_MEAL_COND_TYPE);
	}

	/**
	 * 「施設素材種別」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「施設素材種別」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getFacilityMaterialKindList() {
		return getMstBasicList(DIV_FACILITY_MATERIAL_KIND);
	}

	/**
	 * 「状態（施設）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「状態（施設）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getFpStatusList() {
		return getMstBasicList(DIV_FP_STATUS);
	}

	/**
	 * 「等級」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「等級」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getGradeList() {
		Map map = (Map) JreConstants.getMstBasicMap().get(DIV_GRADE);
		return JreConstants.getLvListLabelWithValue(map);
	}

	/**
	 * 「手仕舞通知方法」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「手仕舞通知方法」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getLiquidateInformList() {
		return makeInformList();
	}

	/**
	 * MapをLabelValueBeanのリストに変換する。
	 *
	 * <pre>
	 * {@link JreConstants#getLvList(Map)} と等価。
	 * JreConstantsに呼び出し元メソッドを移動したり、{@link JreConstants#getLvList(Map)}の可視性を上げる場合、このメソッドは不要。
	 * </pre>
	 *
	 * @param map
	 *            {@link JreConstants#mstBasicMap} の1要素
	 * @return LabelValueBeanのリスト
	 */
	private static List<LabelValueBean> getLvList(Map<String, String> map) {
		List<LabelValueBean> list = new ArrayList<LabelValueBean>();
		for (String key : map.keySet()) {
			String name = StringUtils.defaultString(map.get(key));
			list.add(new LabelValueBean(name, key));
		}
		return list;
	}

	/**
	 * 「素材種別」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「素材種別」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getMaterialKindList() {
		return getMstBasicList(DIV_MATERIAL_KIND);
	}

	/**
	 * 「回答書種別」によって「素材種別」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @param kindFlg
	 *            回答書種別
	 * @param contractKind
	 *            契約種別
	 * @return 「素材種別」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getMaterialKindList(String kindFlg,
			String contractKind) {
		List<LabelValueBean> list = getMaterialKindList();

		// 「回答書種別」が指定されていない場合は絞り込みを行わない
		if (StringUtils.isEmpty(kindFlg)) {
			return list;
		}

		// 逆引きマップを作成
		Map<String, LabelValueBean> reverseMap = new HashMap<String, LabelValueBean>();
		for (LabelValueBean item : list) {
			reverseMap.put(item.getValue(), item);
		}

		List<LabelValueBean> filteredList = new ArrayList<LabelValueBean>();

		// 「観光」「船車」「観光ゴルフ」「船車リフト」
		if (DKikakuWebUtil.isTravel(kindFlg)
				|| DKikakuWebUtil.isTraffic(kindFlg)
				|| DKikakuWebUtil.isGolf(kindFlg)
				|| DKikakuWebUtil.isLift(kindFlg)) {
			filteredList.add(reverseMap
					.get(DJreConstants.CODE_MATERIAL_KIND_ACODE));
			if (StringUtils.isEmpty(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_BOTH
							.equals(contractKind)) {
				filteredList.add(reverseMap
						.get(DJreConstants.CODE_MATERIAL_KIND_DPRM));
			}
		}

		// 「観光TDR」「船車レンタカー」
		if (DKikakuWebUtil.isTravelTdr(kindFlg)
				|| DKikakuWebUtil.isTrafficRentacar(kindFlg)) {
			filteredList.add(reverseMap
					.get(DJreConstants.CODE_MATERIAL_KIND_DPRM));
		}

		// 「宿泊」
		if (DKikakuWebUtil.isShukuhaku(kindFlg)) {
			filteredList.add(reverseMap
					.get(DJreConstants.CODE_MATERIAL_KIND_ACODE));

			if (StringUtils.isEmpty(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_DP.equals(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_BOTH
							.equals(contractKind)) {
				filteredList.add(reverseMap
						.get(DJreConstants.CODE_MATERIAL_KIND_DP));
			}

			if (StringUtils.isEmpty(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_RMSP
							.equals(contractKind)
					|| DJreConstants.CODE_CONTRACT_KIND_BOTH
							.equals(contractKind)) {
				filteredList.add(reverseMap
						.get(DJreConstants.CODE_MATERIAL_KIND_RMSP));
			}

		}

		return filteredList;
	}

	/**
	 * 子要素の基本マスタデータハッシュを取得します。
	 *
	 * <pre>
	 * 親子関係のある区分の子要素のハッシュを取得します。
	 * ハッシュのキーは基本コード2（親要素のコード値）となります。（未設定の場合は格納されません）
	 *
	 * 主にJSでコンボボックスのoption要素を構築するために使用します。
	 *
	 * 以下の構造のハッシュを作成します。
	 * hash : {
	 *      "(parentCd)" : {
	 *          'label' : null,
	 *          'value' : null,
	 *          'children' : {
	 *              "(childCd)" : {
	 *                  'label' : "(childNm)",
	 *                  'value' : "(childCd)",
	 *                  'children' : {}
	 *              }
	 *              ...
	 *          }
	 *      },
	 *      ...
	 * }
	 *
	 * </pre>
	 *
	 * @param childDivisionCd
	 *            子の区分コード
	 * @return 基本マスタデータのハッシュ
	 */
	private static Map<String, NestedLabelValueBean> getMBasisChildrenMap(
			String childDivisionCd) {
		Map<String, NestedLabelValueBean> map = new HashMap<>();

		List<BasicMstData> childList = fetchBasicMstData(childDivisionCd);

		for (BasicMstData basis : childList) {

			String parentCd = basis.getBasicCode2();
			if (StringUtils.isEmpty(parentCd)) {
				continue;
			}

			NestedLabelValueBean parentItem;
			if (map.containsKey(parentCd)) {
				parentItem = map.get(parentCd);
			} else {
				parentItem = new NestedLabelValueBean();
				map.put(parentCd, parentItem);
			}

			parentItem.appendChild(new NestedLabelValueBean(basis));

		}

		return map;
	}

	/**
	 * 「その他分類 」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「その他分類 」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getMiscellaneousClassList() {
		return getMstBasicList(DIV_MISCELLANEOUS_CLASS);
	}

	/**
	 * 「基本マスタ.区分コード」を指定してLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @param div
	 *            基本マスタ.区分コード
	 * @return LabelValueBeanのリスト
	 */
	private static List<LabelValueBean> getMstBasicList(String div) {
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) JreConstants
				.getMstBasicMap().get(div);

		return getLvList(map);
	}

	/**
	 * <pre></pre>
	 *
	 * @return DP/RMの回答書が作成できる支社リスト
	 */
	public static List<LabelValueBean> getNewTypeCreateList() {
		return getMstBasicList(DIV_NEW_TYPE_CREATE_BRANCH);
	}

	/**
	 * <pre></pre>
	 *
	 * @return Aコードの回答書が作成できる支社リスト
	 */
	public static List<LabelValueBean> getOldTypeCreateList() {
		return getMstBasicList(DIV_OLD_TYPE_CREATE_BRANCH);
	}

	/**
	 * 「目的大分類」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「目的大分類」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getPurposeLargeClassList() {
		return getMstBasicList(DIV_PURPOSE_LARGE_CLASS);
	}

	/**
	 * 「目的大分類／目的小分類」ハッシュを取得します。
	 *
	 * <pre></pre>
	 *
	 * @return 「目的大分類／目的小分類」ハッシュ
	 */
	public static Map<String, NestedLabelValueBean> getPurposeSmallClassMap() {
		return getMBasisChildrenMap(DIV_PURPOSE_SMALL_CLASS);
	}

	/**
	 * 「レンタカークラス」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「レンタカークラス」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getRentacarClassList() {
		return getMstBasicList(DIV_RENTACAR_CLASS);
	}

	/**
	 * 「予約通知方法」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「予約通知方法」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getReserveInformWayList() {
		return makeInformList();
	}

	/**
	 * 「室タイプ（DP/RM用）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「室タイプ（DP/RM用）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getRoomTypeDr() {
		return getMstBasicList(ROOM_TYPE_DIV_DR);
	}

	/**
	 * タイプリストを取得する.
	 *
	 * @return List 種別リスト
	 */
	public static List getRoomTypeLabelWithValueDr() {
		Map map = (Map) JreConstants.getMstBasicMap().get(ROOM_TYPE_DIV_DR);
		return JreConstants.getLvListLabelWithValue(map);
	}

	/**
	 * 「特定商品分類」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「特定商品分類」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getSpecificGoodsClassList() {
		return getMstBasicList(DIV_SPECIFIC_GOODS_CLASS);
	}

	/**
	 * 「在庫単位（ゴルフ）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（ゴルフ）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitGolfList() {
		return getMstBasicList(DIV_STOCK_UNIT_GOLF);
	}

	/**
	 * 「在庫単位（リフト）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（リフト）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitLiftList() {
		return getMstBasicList(DIV_STOCK_UNIT_LIFT);
	}

	/**
	 * 「在庫単位（レンタカー）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（レンタカー）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitRentacarList() {
		return getMstBasicList(DIV_STOCK_UNIT_RENTACAR);
	}

	/**
	 * 「在庫単位（TDR）」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（TDR）」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitTdrList() {
		return getMstBasicList(DIV_STOCK_UNIT_TDR);
	}

	/**
	 * 「在庫単位（船車（台組無））」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（船車（台組無））」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitTrafficPersonsManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAFFIC_PERSONS_MANAGED);
	}

	/**
	 * 「在庫単位（船車（台組あり））」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（船車（台組あり））」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitTrafficUnitManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAFFIC_UNIT_MANAGED);
	}

	/**
	 * 「在庫単位（観光（台組無））」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（観光（台組無））」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitTravelPersonsManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAVEL_PERSONS_MANAGED);
	}

	/**
	 * 「在庫単位（観光（台組あり））」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「在庫単位（観光（台組あり））」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getStockUnitTravelUnitManagedList() {
		return getMstBasicList(DIV_STOCK_UNIT_TRAVEL_UNIT_MANAGED);
	}

	/**
	 * 「東京都宿泊税」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「東京都宿泊税」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getTyoStayTaxList() {
		return getMstBasicList(DIV_TYO_STAY_TAX);
	}

	/**
	 * 「眺望」のLabelValueBeanリストを取得する。
	 *
	 * <pre></pre>
	 *
	 * @return 「眺望」LabelValueBeanリスト
	 */
	public static List<LabelValueBean> getViewCdList() {
		return getMstBasicList(DIV_VIEW_CD);
	}

	/**
	 * 「通知方法（在庫管理用）」のLabelValueBeanリストを作成する。
	 *
	 * <pre></pre>
	 *
	 * @return 「通知方法（在庫管理用）」LabelValueBeanリスト
	 */
	private static List<LabelValueBean> makeInformList() {
		List<BasicMstData> list = fetchBasicMstData(DIV_INFORM);
		Map<String, String> map = new LinkedHashMap<>();
		for (BasicMstData inform : list) {
			// 必要なデータを収集する
			if (!CODE_DIV_INFORM_FOR_STOCK_MANAGEMENT.equals(inform
					.getBasicCode2())) {
				continue;
			}
			String key = StringUtils.trimToEmpty(inform.getBasicCode1());
			String value = inform.getBasicName1();
			map.put(key, value);
		}
		return JreConstants.getLvListLabelWithValue(map);
	}

	/**
	 * コンストラクタ
	 */
	private DJreConstants() {
		super();
	}
}
