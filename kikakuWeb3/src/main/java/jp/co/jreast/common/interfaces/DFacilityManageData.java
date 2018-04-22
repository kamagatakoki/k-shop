package jp.co.jreast.common.interfaces;

import java.util.List;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.UserData;
import jp.co.jreast.common.data.ddata.FacilityAckStatusData;
import jp.co.jreast.common.support.LabelValueBean;

/**
 * 施設付帯情報データ インターフェース
 *
 * <pre>
 *   機能概要 ： 施設付帯情報の共通項目を保持するデータのインターフェースです。
 *   特記事項 ：
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public interface DFacilityManageData extends InData, OutData,
		DFacilityManageHeader {

	/**
	 * 送信コメントを取得します。
	 *
	 * @return 送信コメント
	 */
	String getCmtTmpl();

	/**
	 * 相違項目リストを取得します。
	 *
	 * @return 相違項目リスト
	 */
	List<String> getDifferentProperties();

	/**
	 * 施設側承認情報リストを取得します。
	 *
	 * @return 施設側承認情報リスト
	 */
	List<FacilityAckStatusData> getFacilityAckStatusList();

	/**
	 * 施設タイプを取得します。
	 *
	 * @return 施設タイプ
	 */
	String getFacilityType();

	/**
	 * JR側承認情報リストを取得します。
	 *
	 * @return JR側承認情報リスト
	 */
	List<FacilityAckStatusData> getJrAckStatusList();

	/**
	 * 最新の施設側承認情報を取得します。
	 *
	 * @return 最新の施設側承認情報
	 */
	FacilityAckStatusData getLatestFacilityAckStatus();

	/**
	 * 最新のJR側承認情報を取得します。
	 *
	 * @return 最新のJR側承認情報
	 */
	FacilityAckStatusData getLatestJrAckStatus();

	/**
	 * 責任者を取得します。
	 *
	 * @return 責任者
	 */
	String getResponsibler();

	/**
	 * 初期処理検索条件データを取得します。
	 *
	 * @return 初期処理検索条件データ
	 */
	DFacilityManageSearchData getSearchData();

	/**
	 * 送信コメントテンプレート（セレクトタグ表示用ダミー）を取得します。
	 *
	 * @return 送信コメントテンプレート（セレクトタグ表示用ダミー）
	 */
	String getSendCmtTmpl();

	/**
	 * 送信コメントテンプレートリストを取得します。
	 *
	 * @return 送信コメントテンプレートリスト
	 */
	List<LabelValueBean> getSendCmtTmplList();

	/**
	 * 担当者を取得します。
	 *
	 * @return 担当者
	 */
	String getTantousya();

	/**
	 * ユーザ情報を取得します。
	 *
	 * @return ユーザ情報
	 */
	UserData getUserData();

	/**
	 * メッセージ（Mail/Fax）送信失敗（送信失敗した場合true）を取得します。
	 *
	 * @return メッセージ（Mail/Fax）送信失敗（送信失敗した場合true）
	 */
	boolean isSendFailuer();

	/**
	 * 入力検証成否（エラーが無い場合true）を取得します。
	 *
	 * @return 入力検証成否（エラーが無い場合true）
	 */
	boolean isValid();

	/**
	 * 送信コメントを設定します。
	 *
	 * @param cmtTmpl
	 *            送信コメント
	 */
	void setCmtTmpl(String cmtTmpl);

	/**
	 * 施設側承認情報リストを設定します。
	 *
	 * @param facilityAckStatusList
	 *            施設側承認情報リスト
	 */
	void setFacilityAckStatusList(
			List<FacilityAckStatusData> facilityAckStatusList);

	/**
	 * 施設タイプを設定します。
	 *
	 * @param facilityType
	 *            施設タイプ
	 */
	void setFacilityType(String facilityType);

	/**
	 * JR側承認情報リストを設定します。
	 *
	 * @param jrAckStatusList
	 *            JR側承認情報リスト
	 */
	void setJrAckStatusList(List<FacilityAckStatusData> jrAckStatusList);

	/**
	 * 責任者を設定します。
	 *
	 * @param responsibler
	 *            責任者
	 */
	void setResponsibler(String responsibler);

	/**
	 * 初期処理検索条件データを設定します。
	 *
	 * @param searchData
	 *            初期処理検索条件データ
	 */
	void setSearchData(DFacilityManageSearchData searchData);

	/**
	 * 送信コメントテンプレート（セレクトタグ表示用ダミー）を設定します。
	 *
	 * @param sendCmtTmpl
	 *            送信コメントテンプレート（セレクトタグ表示用ダミー）
	 */
	void setSendCmtTmpl(String sendCmtTmpl);

	/**
	 * 送信コメントテンプレートリストを設定します。
	 *
	 * @param sendCmtTmplList
	 *            送信コメントテンプレートリスト
	 */
	void setSendCmtTmplList(List<LabelValueBean> sendCmtTmplList);

	/**
	 * メッセージ（Mail/Fax）送信失敗（送信失敗した場合true）を設定します。
	 *
	 * @param sendFailuer
	 *            メッセージ（Mail/Fax）送信失敗（送信失敗した場合true）
	 */
	void setSendFailuer(boolean sendFailuer);

	/**
	 * 担当者を設定します。
	 *
	 * @param tantousya
	 *            担当者
	 */
	void setTantousya(String tantousya);

	/**
	 * ユーザ情報を設定します。
	 *
	 * @param userData
	 *            ユーザ情報
	 */
	void setUserData(UserData userData);

	/**
	 * 入力検証成否（エラーが無い場合true）を設定します。
	 *
	 * @param valid
	 *            入力検証成否（エラーが無い場合true）
	 */
	void setValid(boolean valid);

}
