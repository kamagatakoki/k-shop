package jp.co.jreast.common.data;

import java.util.Date;

/**
 * <pre>
 * ユーザーマスタデータクラス。.
 * 機能概要    ：  ユーザーマスタデータを格納する。
 * 特記事項    ：  無し
 * </pre>
 * 
 * @author zhou
 * @version 0.1 2006/10/27
 */
public class UserData {

    /**
     * 管理権限.
     */

    private String adminComp;

    /**
     * パスワード有効期限が近づいているので警告する
     */
    private boolean alertChangePassword;

    /**
     * 支社コード.
     */
    private String branchCd;

    /**
     * 造成権限 .
     */
    private String buildComp1;

    /**
     * 履歴参照権限（NO.1）.
     */
    private String careerComp1;

    /**
     * 履歴参照権限（NO.2).
     */

    private String careerComp2;

    /**
     * 履歴参照権限（NO.3）.
     */

    private String careerComp3;

    /**
     * 履歴参照権限（NO.4）.
     */

    private String careerComp4;

    /**
     * 履歴参照権限（NO.5）.
     */
    private String careerComp5;

    /**
     * 通信欄保存権限.
     */
    private String commSaveComp;

    /**
     * コピー権限（NO.1）.
     */
    private String copyComp1;

    /**
     * コピー権限（NO.2）.
     */

    private String copyComp2;

    /**
     * コピー権限（NO.3）.
     */

    private String copyComp3;

    /**
     * コピー権限（NO.4）.
     */

    private String copyComp4;

    /**
     * コピー権限（NO.5）.
     */
    private String copyComp5;

    /**
     * 作成年月日.
     */
    private Date createYmd;

    /**
     * 確定権限（NO.1）.
     */
    private String decideComp1;

    /**
     * 確定権限（NO.2）.
     */

    private String decideComp2;

    /**
     * 確定権限（NO.3）.
     */

    private String decideComp3;

    /**
     * 確定権限（NO.4）.
     */

    private String decideComp4;

    /**
     * 確定権限（NO.5）.
     */
    private String decideComp5;

    /**
     * 削除権限（NO.1）.
     */
    private String delComp1;

    /**
     * 削除権限（NO.3）.
     */

    private String delComp3;

    /**
     * 削除権限（NO.4）.
     */

    private String delComp4;

    /**
     * 削除権限（NO.5）.
     */
    private String delComp5;

    /**
     * 削除フラグ.
     */
    private String delFlg;

    /**
     * 施設付帯情報一覧権限.
     * 課題No3：施設付帯情報一覧リンク追加 2009/12/09 add by s31109
     */
    private String facility_Info_Comp;

    /**
     * FM送信権限(原価)（NO.1）.
     */
    private String fmSendComp1;

    /**
     * FM送信権限(在庫)（NO.4）.
     */
    private String fmSendComp4;

    /**
     * FM担当者ＩＤ.
     */
    private String fmUserId;

    /**
     * 手入力確定権限（NO.1）.
     */
    private String hDecideComp1;

    /**
     * パスワードが期限切れである
     */
    private boolean isExpired;

    /**
     * 種別.
     */
    private String kindFlg;

    /**
     * ログオン.
     */
    private String loginComp;

    /**
     * メール・FAX.
     */
    private String mailFaxComp;

    /**
     * 回答書作成権限.
     */
    private String makeComp;

    /**
     * マルチ権限.
     */
    private String multiComp;

    /**
     * 新パスワード.
     */
    private String newPassword;

    /**
     * 新パスワードの再入力.
     */
    private String newPassword2;

    /**
     * パスワード.
     */
    private String password;

    /**
     * パスワードの有効期限
     */
    private String passwordExpired;

    /**
     * 都道府県コード.
     */
    private String prefecturesCd;

    /**
     * 印刷権限（NO.1）.
     */
    private String printComp1;

    /**
     * 印刷権限（NO.2）.
     */

    private String printComp2;

    /**
     * 印刷権限（NO.3）.
     */

    private String printComp3;

    /**
     * 印刷権限（NO.4）.
     */

    private String printComp4;

    /**
     * 印刷権限（NO.5）.
     */
    private String printComp5;

    /**
     * 承認権限（NO.1）.
     */
    private String recognizeComp1;

    /**
     * 承認権限（NO.2）.
     */

    private String recognizeComp2;

    /**
     * 承認権限（NO.3）.
     */

    private String recognizeComp3;

    /**
     * 承認権限（NO.4）.
     */

    private String recognizeComp4;

    /**
     * 承認権限（NO.5）.
     */
    private String recognizeComp5;

    /** 再編集権限（NO.1） */
    private String reeditComp1;

    /** 再編集権限（NO.2） */
    private String reeditComp2;

    /** 再編集権限（NO.3） */
    private String reeditComp3;

    /** 再編集権限（NO.5） */
    private String reeditComp5;

    /**
     * 参照権限（NO.1）.
     */
    private String referComp1;

    /**
     * 参照権限（NO.2）.
     */

    private String referComp2;

    /**
     * 参照権限（NO.3）.
     */

    private String referComp3;

    /**
     * 参照権限（NO.4）.
     */

    private String referComp4;

    /**
     * 参照権限（NO.5）.
     */

    private String referComp5;

    /**
     * 更新権限（NO.1）.
     */
    private String renewComp1;

    /**
     * 更新権限（NO.2）.
     */

    private String renewComp2;

    /**
     * 更新権限（NO.3）.
     */

    private String renewComp3;

    /**
     * 更新権限（NO.4）.
     */

    private String renewComp4;

    /**
     * 更新権限（NO.5）.
     */
    private String renewComp5;

    /**
     * 差戻権限（NO.1）.
     */
    private String sendBackComp1;

    /**
     * 差戻権限（NO.2）.
     */

    private String sendBackComp2;

    /**
     * 差戻権限（NO.3）.
     */

    private String sendBackComp3;

    /**
     * 差戻権限（NO.4）.
     */

    private String sendBackComp4;

    /**
     * 差戻権限（NO.5）.
     */
    private String sendBackComp5;

    /**
     * 送付区分コード.
     */
    private Integer sendDivCd;

    /**
     * 状態変更権限.
     * 課題No52：状態変更リンク追加 2009/12/09 add by s31109
     */
    private String status_Change_Comp;

    /**
     * 在庫管理権限.
     */
    private String stockAdmComp;

    /**
     * 更新年月日.
     */
    private Date upYmd;

    /**
     * ユーザー区分.
     */
    private String userDiv;

    /**
     * ユーザーID.
     */
    private String userId;

    /**
     * ユーザＩＤ1.
     */
    private String userId1;

    /**
     * ユーザＩＤ2.
     */
    private String userId2;

    /**
     * ユーザー名称.
     */
    private String userNm;

    /** 造成WEB連携権限（NO.3） */
    private String zouseiSendComp3;

    /** 造成WEB連携権限（NO.5） */
    private String zouseiSendComp5;

    /**
     * @return Returns the adminComp.
     */
    public String getAdminComp() {
        return adminComp;
    }

    /**
     * @return Returns the alertChangePassword.
     */
    public boolean getAlertChangePassword() {
        return this.alertChangePassword;
    }

    /**
     * @return Returns the branchCd.
     */
    public String getBranchCd() {
        return branchCd;
    }

    /**
     * @return Returns the buildComp.
     */
    public String getBuildComp1() {
        return buildComp1;
    }

    /**
     * @return Returns the careerComp1.
     */
    public String getCareerComp1() {
        return careerComp1;
    }

    /**
     * @return Returns the careerComp2.
     */
    public String getCareerComp2() {
        return careerComp2;
    }

    /**
     * @return Returns the careerComp3.
     */
    public String getCareerComp3() {
        return careerComp3;
    }

    /**
     * @return Returns the careerComp4.
     */
    public String getCareerComp4() {
        return careerComp4;
    }

    /**
     * @return Returns the careerComp5.
     */
    public String getCareerComp5() {
        return careerComp5;
    }

    /**
     * @return Returns the commSaveComp.
     */
    public String getCommSaveComp() {
        return commSaveComp;
    }

    /**
     * @return Returns the copyComp1.
     */
    public String getCopyComp1() {
        return copyComp1;
    }

    /**
     * @return Returns the copyComp2.
     */
    public String getCopyComp2() {
        return copyComp2;
    }

    /**
     * @return Returns the copyComp3.
     */
    public String getCopyComp3() {
        return copyComp3;
    }

    /**
     * @return Returns the copyComp4.
     */
    public String getCopyComp4() {
        return copyComp4;
    }

    /**
     * @return Returns the copyComp5.
     */
    public String getCopyComp5() {
        return copyComp5;
    }

    /**
     * @return Returns the createYmd.
     */
    public Date getCreateYmd() {
        return createYmd;
    }

    /**
     * @return Returns the decideComp1.
     */
    public String getDecideComp1() {
        return decideComp1;
    }

    /**
     * @return Returns the decideComp2.
     */
    public String getDecideComp2() {
        return decideComp2;
    }

    /**
     * @return Returns the decideComp3.
     */
    public String getDecideComp3() {
        return decideComp3;
    }

    /**
     * @return Returns the decideComp4.
     */
    public String getDecideComp4() {
        return decideComp4;
    }

    /**
     * @return Returns the decideComp5.
     */
    public String getDecideComp5() {
        return decideComp5;
    }

    /**
     * @return Returns the delComp1.
     */
    public String getDelComp1() {
        return delComp1;
    }

    /**
     * @return Returns the delComp3.
     */
    public String getDelComp3() {
        return delComp3;
    }

    /**
     * @return Returns the delComp4.
     */
    public String getDelComp4() {
        return delComp4;
    }

    /**
     * @return Returns the delComp5.
     */
    public String getDelComp5() {
        return delComp5;
    }

    /**
     * @return Returns the delFlg.
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * @return 施設付帯情報権限
     */
    public String getFacility_Info_Comp() {
        return facility_Info_Comp;
    }

    /**
     * @return Returns the fmSendComp1.
     */
    public String getFmSendComp1() {
        return fmSendComp1;
    }

    /**
     * @return Returns the fmSendComp4.
     */
    public String getFmSendComp4() {
        return fmSendComp4;
    }

    /**
     * @return Returns the fmUserId.
     */
    public String getFmUserId() {
        return fmUserId;
    }

    /**
     * @return Returns the hDecideComp1.
     */
    public String getHDecideComp1() {
        return hDecideComp1;
    }

    /**
     * @return Returns the isExpired.
     */
    public boolean getIsExpired() {
        return this.isExpired;
    }

    /**
     * @return 種別
     */
    public String getKindFlg() {
        return kindFlg;
    }

    /**
     * @return Returns the loginComp.
     */
    public String getLoginComp() {
        return loginComp;
    }

    /**
     * @return Returns the mailFaxComp.
     */
    public String getMailFaxComp() {
        return mailFaxComp;
    }

    /**
     * @return Returns the makeComp.
     */
    public String getMakeComp() {
        return makeComp;
    }

    /**
     * @return Returns the multiComp.
     */
    public String getMultiComp() {
        return multiComp;
    }

    /**
     * @return Returns the newPassword.
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * @return Returns the newPassword2.
     */
    public String getNewPassword2() {
        return newPassword2;
    }

    /**
     * @return Returns the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return Returns the passwordExpired.
     */
    public String getPasswordExpired() {
        return this.passwordExpired;
    }

    /**
     * @return Returns the prefecturesCd.
     */
    public String getPrefecturesCd() {
        return prefecturesCd;
    }

    /**
     * @return Returns the printComp1.
     */
    public String getPrintComp1() {
        return printComp1;
    }

    /**
     * @return Returns the printComp2.
     */
    public String getPrintComp2() {
        return printComp2;
    }

    /**
     * @return Returns the printComp3.
     */
    public String getPrintComp3() {
        return printComp3;
    }

    /**
     * @return Returns the printComp4.
     */
    public String getPrintComp4() {
        return printComp4;
    }

    /**
     * @return Returns the printComp5.
     */
    public String getPrintComp5() {
        return printComp5;
    }

    /**
     * @return Returns the recognizeComp1.
     */
    public String getRecognizeComp1() {
        return recognizeComp1;
    }

    /**
     * @return Returns the recognizeComp2.
     */
    public String getRecognizeComp2() {
        return recognizeComp2;
    }

    /**
     * @return Returns the recognizeComp3.
     */
    public String getRecognizeComp3() {
        return recognizeComp3;
    }

    /**
     * @return Returns the recognizeComp4.
     */
    public String getRecognizeComp4() {
        return recognizeComp4;
    }

    /**
     * @return Returns the recognizeComp5.
     */
    public String getRecognizeComp5() {
        return recognizeComp5;
    }

    /**
     * 再編集権限（NO.1）を取得します。
     * 
     * @return 再編集権限（NO.1）
     */
    public String getReeditComp1() {
        return reeditComp1;
    }

    /**
     * 再編集権限（NO.2）を取得します。
     * 
     * @return 再編集権限（NO.2）
     */
    public String getReeditComp2() {
        return reeditComp2;
    }

    /**
     * 再編集権限（NO.3）を取得します。
     * 
     * @return 再編集権限（NO.3）
     */
    public String getReeditComp3() {
        return reeditComp3;
    }

    /**
     * 再編集権限（NO.5）を取得します。
     * 
     * @return 再編集権限（NO.5）
     */
    public String getReeditComp5() {
        return reeditComp5;
    }

    /**
     * @return Returns the referComp1.
     */
    public String getReferComp1() {
        return referComp1;
    }

    /**
     * @return Returns the referComp2.
     */
    public String getReferComp2() {
        return referComp2;
    }

    /**
     * @return Returns the referComp3.
     */
    public String getReferComp3() {
        return referComp3;
    }

    /**
     * @return Returns the referComp4.
     */
    public String getReferComp4() {
        return referComp4;
    }

    /**
     * @return Returns the referComp5.
     */
    public String getReferComp5() {
        return referComp5;
    }

    /**
     * @return Returns the renewComp1.
     */
    public String getRenewComp1() {
        return renewComp1;
    }

    /**
     * @return Returns the renewComp2.
     */
    public String getRenewComp2() {
        return renewComp2;
    }

    /**
     * @return Returns the renewComp3.
     */
    public String getRenewComp3() {
        return renewComp3;
    }

    /**
     * @return Returns the renewComp4.
     */
    public String getRenewComp4() {
        return renewComp4;
    }

    /**
     * @return Returns the renewComp5.
     */
    public String getRenewComp5() {
        return renewComp5;
    }

    /**
     * @return Returns the sendBackComp1.
     */
    public String getSendBackComp1() {
        return sendBackComp1;
    }

    /**
     * @return Returns the sendBackComp2.
     */
    public String getSendBackComp2() {
        return sendBackComp2;
    }

    /**
     * @return Returns the sendBackComp3.
     */
    public String getSendBackComp3() {
        return sendBackComp3;
    }

    /**
     * @return Returns the sendBackComp4.
     */
    public String getSendBackComp4() {
        return sendBackComp4;
    }

    /**
     * @return Returns the sendVBackComp5.
     */
    public String getSendBackComp5() {
        return sendBackComp5;
    }

    /**
     * @return Returns the sendDivCd.
     */
    public Integer getSendDivCd() {
        return sendDivCd;
    }

    /**
     * @return 状態変更権限
     */
    public String getStatus_Change_Comp() {
        return status_Change_Comp;
    }

    /**
     * @return Returns the stockAdmComp
     */
    public String getStockAdmComp() {
        return stockAdmComp;
    }

    /**
     * @return Returns the upYmd.
     */
    public Date getUpYmd() {
        return upYmd;
    }

    /**
     * @return Returns the userDiv.
     */
    public String getUserDiv() {
        return userDiv;
    }

    /**
     * @return Returns the userId.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return Returns the userId1.
     */
    public String getUserId1() {
        return userId1;
    }

    /**
     * @return Returns the userId2.
     */
    public String getUserId2() {
        return userId2;
    }

    /**
     * @return Returns the userIdLeft.
     */
    public String getUserIdLeft() {
        if (userId != null) {
            return userId.substring(0, 4);
        }
        return null;
    }

    /**
     * @return Returns the userIdRight.
     */
    public String getUserIdRight() {
        if (userId != null) {
            return userId.substring(4, 6);
        }
        return null;
    }

    /**
     * @return Returns the userNm.
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * 造成WEB連携権限（NO.3）を取得します。
     * 
     * @return 造成WEB連携権限（NO.3）
     */
    public String getZouseiSendComp3() {
        return zouseiSendComp3;
    }

    /**
     * 造成WEB連携権限（NO.5）を取得します。
     * 
     * @return 造成WEB連携権限（NO.5）
     */
    public String getZouseiSendComp5() {
        return zouseiSendComp5;
    }

    /**
     * @param adminComp
     *            The adminComp to set.
     */
    public void setAdminComp(String adminComp) {
        this.adminComp = adminComp;
    }

    /**
     * @param alertChangePassword
     *            The alertChangePassword to set.
     */
    public void setAlertChangePassword(boolean alertChangePassword) {
        this.alertChangePassword = alertChangePassword;
    }

    /**
     * @param branchCd
     *            The branchCd to set.
     */
    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }

    /**
     * @param buildComp1
     *            the buildComp to set.
     */
    public void setBuildComp1(String buildComp1) {
        this.buildComp1 = buildComp1;
    }

    /**
     * @param careerComp1
     *            The careerComp1 to set.
     */
    public void setCareerComp1(String careerComp1) {
        this.careerComp1 = careerComp1;
    }

    /**
     * @param careerComp2
     *            The careerComp2 to set.
     */
    public void setCareerComp2(String careerComp2) {
        this.careerComp2 = careerComp2;
    }

    /**
     * @param careerComp3
     *            The careerComp3 to set.
     */
    public void setCareerComp3(String careerComp3) {
        this.careerComp3 = careerComp3;
    }

    /**
     * @param careerComp4
     *            The careerComp4 to set.
     */
    public void setCareerComp4(String careerComp4) {
        this.careerComp4 = careerComp4;
    }

    /**
     * @param careerComp5
     *            The careerComp5 to set.
     */
    public void setCareerComp5(String careerComp5) {
        this.careerComp5 = careerComp5;
    }

    /**
     * @param commSaveComp
     *            The commSaveComp to Set.
     */
    public void setCommSaveComp(String commSaveComp) {
        this.commSaveComp = commSaveComp;
    }

    /**
     * @param copyComp1
     *            The copyComp1 to set.
     */
    public void setCopyComp1(String copyComp1) {
        this.copyComp1 = copyComp1;
    }

    /**
     * @param copyComp2
     *            The copyComp2 to set.
     */
    public void setCopyComp2(String copyComp2) {
        this.copyComp2 = copyComp2;
    }

    /**
     * @param copyComp3
     *            The copyComp3 to set.
     */
    public void setCopyComp3(String copyComp3) {
        this.copyComp3 = copyComp3;
    }

    /**
     * @param copyComp4
     *            The copyComp4 to set.
     */
    public void setCopyComp4(String copyComp4) {
        this.copyComp4 = copyComp4;
    }

    /**
     * @param copyComp5
     *            The copyComp5 to set.
     */
    public void setCopyComp5(String copyComp5) {
        this.copyComp5 = copyComp5;
    }

    /**
     * @param createYmd
     *            The createYmd to set.
     */
    public void setCreateYmd(Date createYmd) {
        this.createYmd = createYmd;
    }

    /**
     * @param decideComp1
     *            The decideComp1 to set.
     */
    public void setDecideComp1(String decideComp1) {
        this.decideComp1 = decideComp1;
    }

    /**
     * @param decideComp2
     *            The decideComp2 to set.
     */
    public void setDecideComp2(String decideComp2) {
        this.decideComp2 = decideComp2;
    }

    /**
     * @param decideComp3
     *            The decideComp3 to set.
     */
    public void setDecideComp3(String decideComp3) {
        this.decideComp3 = decideComp3;
    }

    /**
     * @param decideComp4
     *            The decideComp4 to set.
     */
    public void setDecideComp4(String decideComp4) {
        this.decideComp4 = decideComp4;
    }

    /**
     * @param decideComp5
     *            The decideComp5 to set.
     */
    public void setDecideComp5(String decideComp5) {
        this.decideComp5 = decideComp5;
    }

    /**
     * @param delComp1
     *            The delComp1 to set.
     */
    public void setDelComp1(String delComp1) {
        this.delComp1 = delComp1;
    }

    /**
     * @param delComp3
     *            The delComp3 to set.
     */
    public void setDelComp3(String delComp3) {
        this.delComp3 = delComp3;
    }

    /**
     * @param delComp4
     *            The delComp4 to set.
     */
    public void setDelComp4(String delComp4) {
        this.delComp4 = delComp4;
    }

    /**
     * @param delComp5
     *            The delComp5 to set.
     */
    public void setDelComp5(String delComp5) {
        this.delComp5 = delComp5;
    }

    /**
     * @param delFlg
     *            The delFlg to set.
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    /**
     * @param facility_Info_Comp
     *            種別
     */
    public void setFacility_Info_Comp(String facility_Info_Comp) {
        this.facility_Info_Comp = facility_Info_Comp;
    }

    /**
     * @param fmSendComp1
     *            The fmSendComp1 to set.
     */
    public void setFmSendComp1(String fmSendComp1) {
        this.fmSendComp1 = fmSendComp1;
    }

    /**
     * @param fmSendComp4
     *            The fmSendComp4 to set.
     */
    public void setFmSendComp4(String fmSendComp4) {
        this.fmSendComp4 = fmSendComp4;
    }

    /**
     * @param fmUserId
     *            The fmUserId to set.
     */
    public void setFmUserId(String fmUserId) {
        this.fmUserId = fmUserId;
    }

    /**
     * @param hDecideComp1
     *            The hDecideComp1 to set.
     */
    public void setHDecideComp1(String hDecideComp1) {
        this.hDecideComp1 = hDecideComp1;
    }

    /**
     * @param isExpired
     *            The isExpired to set.
     */
    public void setIsExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }

    /**
     * @param kindFlg
     *            種別
     */
    public void setKindFlg(String kindFlg) {
        this.kindFlg = kindFlg;
    }

    /**
     * @param loginComp
     *            The loginComp to set.
     */
    public void setLoginComp(String loginComp) {
        this.loginComp = loginComp;
    }

    /**
     * @param mailFaxComp
     *            The mailFaxComp to set.
     */
    public void setMailFaxComp(String mailFaxComp) {
        this.mailFaxComp = mailFaxComp;
    }

    /**
     * @param makeComp
     *            The makeComp to set.
     */
    public void setMakeComp(String makeComp) {
        this.makeComp = makeComp;
    }

    /**
     * @param multiComp
     *            The multiComp to set.
     */
    public void setMultiComp(String multiComp) {
        this.multiComp = multiComp;
    }

    /**
     * @param newPassword
     *            The newPassword to set.
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * @param newPassword2
     *            The newPassword2 to set.
     */
    public void setNewPassword2(String newPassword2) {
        this.newPassword2 = newPassword2;
    }

    /**
     * @param password
     *            The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param passwordExpired
     *            The passwordExpired to set.
     */
    public void setPasswordExpired(String passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    /**
     * @param prefecturesCd
     *            The prefecturesCd to set.
     */
    public void setPrefecturesCd(String prefecturesCd) {
        this.prefecturesCd = prefecturesCd;
    }

    /**
     * @param printComp1
     *            The printComp1 to set.
     */
    public void setPrintComp1(String printComp1) {
        this.printComp1 = printComp1;
    }

    /**
     * @param printComp2
     *            The printComp2 to set.
     */
    public void setPrintComp2(String printComp2) {
        this.printComp2 = printComp2;
    }

    /**
     * @param printComp3
     *            The printComp3 to set.
     */
    public void setPrintComp3(String printComp3) {
        this.printComp3 = printComp3;
    }

    /**
     * @param printComp4
     *            The printComp4 to set.
     */
    public void setPrintComp4(String printComp4) {
        this.printComp4 = printComp4;
    }

    /**
     * @param printComp5
     *            The printComp5 to set.
     */
    public void setPrintComp5(String printComp5) {
        this.printComp5 = printComp5;
    }

    /**
     * @param recognizeComp1
     *            The recognizeComp1 to set.
     */
    public void setRecognizeComp1(String recognizeComp1) {
        this.recognizeComp1 = recognizeComp1;
    }

    /**
     * @param recognizeComp2
     *            The recognizeComp2 to set.
     */
    public void setRecognizeComp2(String recognizeComp2) {
        this.recognizeComp2 = recognizeComp2;
    }

    /**
     * @param recognizeComp3
     *            The recognizeComp3 to set.
     */
    public void setRecognizeComp3(String recognizeComp3) {
        this.recognizeComp3 = recognizeComp3;
    }

    /**
     * @param recognizeComp4
     *            The recognizeComp4 to set.
     */
    public void setRecognizeComp4(String recognizeComp4) {
        this.recognizeComp4 = recognizeComp4;
    }

    /**
     * @param recognizeComp5
     *            The recognizeComp5 to set.
     */
    public void setRecognizeComp5(String recognizeComp5) {
        this.recognizeComp5 = recognizeComp5;
    }

    /**
     * 再編集権限（NO.1）を設定します。
     * 
     * @param reeditComp1
     *            再編集権限（NO.1）
     */
    public void setReeditComp1(String reeditComp1) {
        this.reeditComp1 = reeditComp1;
    }

    /**
     * 再編集権限（NO.2）を設定します。
     * 
     * @param reeditComp2
     *            再編集権限（NO.2）
     */
    public void setReeditComp2(String reeditComp2) {
        this.reeditComp2 = reeditComp2;
    }

    /**
     * 再編集権限（NO.3）を設定します。
     * 
     * @param reeditComp3
     *            再編集権限（NO.3）
     */
    public void setReeditComp3(String reeditComp3) {
        this.reeditComp3 = reeditComp3;
    }

    /**
     * 再編集権限（NO.5）を設定します。
     * 
     * @param reeditComp5
     *            再編集権限（NO.5）
     */
    public void setReeditComp5(String reeditComp5) {
        this.reeditComp5 = reeditComp5;
    }

    /**
     * @param referComp1
     *            The referComp1 to set.
     */
    public void setReferComp1(String referComp1) {
        this.referComp1 = referComp1;
    }

    /**
     * @param referComp2
     *            The referComp2 to set.
     */
    public void setReferComp2(String referComp2) {
        this.referComp2 = referComp2;
    }

    /**
     * @param referComp3
     *            The referComp3 to set.
     */
    public void setReferComp3(String referComp3) {
        this.referComp3 = referComp3;
    }

    /**
     * @param referComp4
     *            The referComp4 to set.
     */
    public void setReferComp4(String referComp4) {
        this.referComp4 = referComp4;
    }

    /**
     * @param referComp5
     *            The referComp5 to set.
     */
    public void setReferComp5(String referComp5) {
        this.referComp5 = referComp5;
    }

    /**
     * @param renewComp1
     *            The renewComp1 to set.
     */
    public void setRenewComp1(String renewComp1) {
        this.renewComp1 = renewComp1;
    }

    /**
     * @param renewComp2
     *            The renewComp2 to set.
     */
    public void setRenewComp2(String renewComp2) {
        this.renewComp2 = renewComp2;
    }

    /**
     * @param renewComp3
     *            The renewComp3 to set.
     */
    public void setRenewComp3(String renewComp3) {
        this.renewComp3 = renewComp3;
    }

    /**
     * @param renewComp4
     *            The renewComp4 to set.
     */
    public void setRenewComp4(String renewComp4) {
        this.renewComp4 = renewComp4;
    }

    /**
     * @param renewComp5
     *            The renewComp5 to set.
     */
    public void setRenewComp5(String renewComp5) {
        this.renewComp5 = renewComp5;
    }

    /**
     * @param sendBackComp1
     *            The sendBackComp1 to set.
     */
    public void setSendBackComp1(String sendBackComp1) {
        this.sendBackComp1 = sendBackComp1;
    }

    /**
     * @param sendBackComp2
     *            The sendBackComp2 to set.
     */
    public void setSendBackComp2(String sendBackComp2) {
        this.sendBackComp2 = sendBackComp2;
    }

    /**
     * @param sendBackComp3
     *            The sendBackComp3 to set.
     */
    public void setSendBackComp3(String sendBackComp3) {
        this.sendBackComp3 = sendBackComp3;
    }

    /**
     * @param sendBackComp4
     *            The sendBackComp4 to set.
     */
    public void setSendBackComp4(String sendBackComp4) {
        this.sendBackComp4 = sendBackComp4;
    }

    /**
     * @param sendBackComp5
     *            The sendVBackComp5 to set.
     */
    public void setSendBackComp5(String sendBackComp5) {
        this.sendBackComp5 = sendBackComp5;
    }

    /**
     * @param sendDivCd
     *            The sendDivCd to set.
     */
    public void setSendDivCd(Integer sendDivCd) {
        this.sendDivCd = sendDivCd;
    }

    /**
     * @param status_Change_Comp
     *            状態変更権限
     */
    public void setStatus_Change_Comp(String status_Change_Comp) {
        this.status_Change_Comp = status_Change_Comp;
    }

    /**
     * @param stockAdmComp
     *            The stockAdmComp to set.
     */
    public void setStockAdmComp(String stockAdmComp) {
        this.stockAdmComp = stockAdmComp;
    }

    /**
     * @param upYmd
     *            The upYmd to set.
     */
    public void setUpYmd(Date upYmd) {
        this.upYmd = upYmd;
    }

    /**
     * @param userDiv
     *            The userDiv to set.
     */
    public void setUserDiv(String userDiv) {
        this.userDiv = userDiv;
    }

    /**
     * @param userId
     *            The userId to set.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @param userId1
     *            The userId1 to set.
     */
    public void setUserId1(String userId1) {
        this.userId1 = userId1;
    }

    /**
     * @param userId2
     *            The userId2 to set.
     */
    public void setUserId2(String userId2) {
        this.userId2 = userId2;
    }

    /**
     * @param userNm
     *            The userNm to set.
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    /**
     * 造成WEB連携権限（NO.3）を設定します。
     * 
     * @param zouseiSendComp3
     *            造成WEB連携権限（NO.3）
     */
    public void setZouseiSendComp3(String zouseiSendComp3) {
        this.zouseiSendComp3 = zouseiSendComp3;
    }

    /**
     * 造成WEB連携権限（NO.5）を設定します。
     * 
     * @param zouseiSendComp5
     *            造成WEB連携権限（NO.5）
     */
    public void setZouseiSendComp5(String zouseiSendComp5) {
        this.zouseiSendComp5 = zouseiSendComp5;
    }
}
