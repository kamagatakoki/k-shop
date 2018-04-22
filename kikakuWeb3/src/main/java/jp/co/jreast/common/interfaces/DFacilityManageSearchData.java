package jp.co.jreast.common.interfaces;

import jp.co.intage.framework.data.InData;
import jp.co.jreast.common.data.UserData;

/**
 * 初期処理検索条件データ インターフェース
 * 
 * <pre>
 *   機能概要 ： 呼び出し元やユーザデータに加え、施設付帯情報管理キー項目、企画回答書キー項目を保持するデータのインターフェースです。
 *   特記事項 ：
 * </pre>
 * 
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public interface DFacilityManageSearchData extends InData, PlanAnsKey,
        FacilityManageKey {

    /**
     * 呼び出し元区分を取得します。
     * 
     * @return 呼び出し元区分
     */
    String getCallFlg();

    /**
     * 施設タイプを取得します。
     * 
     * @return 施設タイプ
     */
    String getFacilityType();

    /**
     * 呼び出し元区分を取得します。
     * 
     * @return 呼び出し元区分
     */
    UserData getUserData();

    /**
     * 呼び出し元区分を設定します。
     * 
     * @param callFlg
     *            呼び出し元区分
     */
    void setCallFlg(String callFlg);

    /**
     * 施設タイプを設定します。
     * 
     * @param facilityType
     *            施設タイプ
     */
    void setFacilityType(String facilityType);

    /**
     * 呼び出し元区分を設定します。
     * 
     * @param userData
     *            呼び出し元区分
     */
    void setUserData(UserData userData);

}
