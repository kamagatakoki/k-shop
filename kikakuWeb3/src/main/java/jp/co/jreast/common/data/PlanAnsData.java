package jp.co.jreast.common.data;

import java.util.Date;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;

/**
 * <pre>
 * 企画回答書データクラス。.
 * 機能概要    ：  企画回答書データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/10/27
 */
public class PlanAnsData extends PlanAnsBaseData{
	/**
	 * 施設コード.
	 */
	private String facilityCd;

	/**
	 * 施設名称.
	 */
	private String facilityNm;
	
	/**
	 * 施設名称（カナ）.
	 */
	private String facilityNmKana;

	/**
	 * 支社コード.
	 */
	private String branchCd;

	/**
	 * 種別.
	 */
	private String kindFlg;

	/**
	 * 年度.
	 */
	private String year;

	/**
	 * シーズン区分.
	 */
	private String seasonDiv;

	/**
	 * 商品名称.
	 */
	private String goodsNm;

	/**
	 * 在庫区分.
	 */
	private Integer stockDiv;

	/**
	 * 企画通番（東日本）.
	 */
	private String planNoEJp;

	/**
	 * 企画通番（６社）.
	 */
	private String planNo6Off;

	/**
	 * 送付区分.
	 */
	private Integer sendDiv;

	/**
	 * 回答書送付先.
	 */
	private String ansSendAddr;
	
	/**
	 * 送信日付.
	 */										
	private String sendYmd;
	
	/**
	 * 送付担当者名.
	 */
	private String senderNm;

	/**
	 * 送付連絡先電話.
	 */
	private String senderTel;

	/**
	 * 状態.
	 */
	private Integer status;

	/**
	 * NO1状態.
	 */
	private Integer no1Status;

	/**
	 * NO2状態.
	 */
	private Integer no2Status;

	/**
	 * NO3状態.
	 */
	private Integer no3Status;

	/**
	 * NO4状態.
	 */
	private Integer no4Status;

	/**
	 * NO5状態.
	 */
	private Integer no5Status;

	/**
	 * NO1履歴番号.
	 */
	private Integer no1CareerNo;

	/**
	 * NO2履歴番号.
	 */
	private Integer no2CareerNo;

	/**
	 * NO3履歴番号.
	 */
	private Integer no3CareerNo;

	/**
	 * NO4履歴番号.
	 */
	private Integer no4CareerNo;

	/**
	 * NO5履歴番号.
	 */
	private Integer no5CareerNo;

	/**
	 * ＦＭ原価連携.
	 */
	private Integer fmCostRelateDiv;

	/**
	 * ＦＭ在庫連携.
	 */
	private Integer fmStockRelateDiv;

	/**
	 * 削除フラグ.
	 */
	private String delFlg = "0";

	/**
	 * 最新フラグ.
	 */
	private String newFlg = "1";

	/**
	 * 更新日付.
	 */
	private String updateYmd;

	/**
	 * タイムスタンプ.
	 */
	private Date timestamp;
	
	/**
	 * ユーザID.
	 */
	private String userId;

	/**
	 * ユーザ名称.
	 */
	private String userNm;
	
	/**
	 * ユーザ区分.
	 */
	private Integer userDiv;
	/**.
	 * 連絡先Fax
	 */
	private String senderFax;									
										
	/**
	 * 送付状態.
	 */
	private String sendStatus;
	
	/**
	 * @return userDiv ユーザ区分
	 */
	public Integer getUserDiv() {
		return userDiv;
	}

	/**
	 * @param userDiv ユーザ区分
	 */
	public void setUserDiv(Integer userDiv) {
		this.userDiv = userDiv;
	}

	/**
	 * 
	 * @return String 回答書送付先
	 */
	public String getAnsSendAddr() {
		return ansSendAddr;
	}

	/**
	 * 
	 * @param ansSendAddr 回答書送付先
	 */
	public void setAnsSendAddr(String ansSendAddr) {
		this.ansSendAddr = ansSendAddr;
	}

	/**
	 * 
	 * @return 支社コード
	 */
	public String getBranchCd() {
		return branchCd;
	}

	/**
	 * 
	 * @param branchCd 支社コード
	 */
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}

	/**
	 * 
	 * @return 削除フラグ
	 */
	public String getDelFlg() {
		return delFlg;
	}

	/**
	 * 
	 * @param delFlg 削除フラグ
	 */
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	/**
	 * 
	 * @return 施設コード
	 */
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * 
	 * @param facilityCd 施設コード
	 */
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * 
	 * @return 施設名称
	 */
	public String getFacilityNm() {
		return facilityNm;
	}

	/**
	 * 
	 * @param facilityNm 施設名称
	 */
	public void setFacilityNm(String facilityNm) {
		this.facilityNm = facilityNm;
	}

	/**
	 * 
	 * @return ＦＭ原価連携
	 */
	public Integer getFmCostRelateDiv() {
		return fmCostRelateDiv;
	}

	/**
	 * 
	 * @param fmCostRelateDiv ＦＭ原価連携
	 */
	public void setFmCostRelateDiv(Integer fmCostRelateDiv) {
		this.fmCostRelateDiv = fmCostRelateDiv;
	}

	/**
	 * 
	 * @return ＦＭ在庫連携
	 */
	public Integer getFmStockRelateDiv() {
		return fmStockRelateDiv;
	}

	/**
	 * 
	 * @param fmStockRelateDiv ＦＭ在庫連携
	 */
	public void setFmStockRelateDiv(Integer fmStockRelateDiv) {
		this.fmStockRelateDiv = fmStockRelateDiv;
	}

	/**
	 * 
	 * @return 商品名称
	 */
	public String getGoodsNm() {
		return goodsNm;
	}

	/**
	 * 
	 * @param goodsNm 商品名称
	 */
	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}


	/**
	 * 
	 * @return 最新フラグ
	 */
	public String getNewFlg() {
		return newFlg;
	}

	/**
	 * 
	 * @param newFlg 最新フラグ
	 */
	public void setNewFlg(String newFlg) {
		this.newFlg = newFlg;
	}

	/**
	 * 
	 * @return NO1履歴番号
	 */
	public Integer getNo1CareerNo() {
		return no1CareerNo;
	}

	/**
	 * 
	 * @param no1CareerNo NO1履歴番号
	 */
	public void setNo1CareerNo(Integer no1CareerNo) {
		this.no1CareerNo = no1CareerNo;
	}

	/**
	 * 
	 * @return NO1状態
	 */
	public Integer getNo1Status() {
		return no1Status;
	}

	/**
	 * 
	 * @param no1Status NO1状態
	 */
	public void setNo1Status(Integer no1Status) {
		this.no1Status = no1Status;
	}

	/**
	 * 
	 * @return NO2履歴番号
	 */
	public Integer getNo2CareerNo() {
		return no2CareerNo;
	}

	/**
	 * 
	 * @param no2CareerNo NO2履歴番号
	 */
	public void setNo2CareerNo(Integer no2CareerNo) {
		this.no2CareerNo = no2CareerNo;
	}

	/**
	 * 
	 * @return NO2状態
	 */
	public Integer getNo2Status() {
		return no2Status;
	}

	/**
	 * 
	 * @param no2Status NO2状態
	 */
	public void setNo2Status(Integer no2Status) {
		this.no2Status = no2Status;
	}

	/**
	 * 
	 * @return NO3履歴番号
	 */
	public Integer getNo3CareerNo() {
		return no3CareerNo;
	}

	/**
	 * 
	 * @param no3CareerNo NO3履歴番号
	 */
	public void setNo3CareerNo(Integer no3CareerNo) {
		this.no3CareerNo = no3CareerNo;
	}

	/**
	 * 
	 * @return NO3状態
	 */
	public Integer getNo3Status() {
		return no3Status;
	}

	/**
	 * 
	 * @param no3Status NO3状態
	 */
	public void setNo3Status(Integer no3Status) {
		this.no3Status = no3Status;
	}

	/**
	 * 
	 * @return NO4履歴番号
	 */
	public Integer getNo4CareerNo() {
		return no4CareerNo;
	}

	/**
	 * 
	 * @param no4CareerNo NO4履歴番号
	 */
	public void setNo4CareerNo(Integer no4CareerNo) {
		this.no4CareerNo = no4CareerNo;
	}

	/**
	 * 
	 * @return NO4状態
	 */
	public Integer getNo4Status() {
		return no4Status;
	}

	/**
	 * 
	 * @param no4Status NO4状態
	 */
	public void setNo4Status(Integer no4Status) {
		this.no4Status = no4Status;
	}

	/**
	 * 
	 * @return NO5履歴番号
	 */
	public Integer getNo5CareerNo() {
		return no5CareerNo;
	}

	/**
	 * 
	 * @param no5CareerNo NO5履歴番号
	 */
	public void setNo5CareerNo(Integer no5CareerNo) {
		this.no5CareerNo = no5CareerNo;
	}

	/**
	 * 
	 * @return NO5状態
	 */
	public Integer getNo5Status() {
		return no5Status;
	}

	/**
	 * 
	 * @param no5Status NO5状態
	 */
	public void setNo5Status(Integer no5Status) {
		this.no5Status = no5Status;
	}

	/**
	 * 
	 * @return 企画通番（６社）
	 */
	public String getPlanNo6Off() {
		return planNo6Off;
	}

	/**
	 * 
	 * @param planNo6Off 企画通番（６社）
	 */
	public void setPlanNo6Off(String planNo6Off) {
		this.planNo6Off = planNo6Off;
	}

	/**
	 * 
	 * @return 企画通番（東日本）
	 */
	public String getPlanNoEJp() {
		return planNoEJp;
	}
	
	/**
	 * 
	 * @param planNoEJp 企画通番（東日本）
	 */
	public void setPlanNoEJp(String planNoEJp) {
		this.planNoEJp = planNoEJp;
	}

	/**
	 * 
	 * @return シーズン区分
	 */
	public String getSeasonDiv() {
		return seasonDiv;
	}

	/**
	 * 
	 * @param seasonDiv シーズン区分
	 */
	public void setSeasonDiv(String seasonDiv) {
		this.seasonDiv = seasonDiv;
	}

	/**
	 * 
	 * @return 送付区分
	 */
	public Integer getSendDiv() {
		return sendDiv;
	}

	/**
	 * 
	 * @param sendDiv 送付区分
	 */
	public void setSendDiv(Integer sendDiv) {
		this.sendDiv = sendDiv;
	}

	/**
	 * 
	 * @return 送付担当者名
	 */
	public String getSenderNm() {
		return senderNm;
	}

	/**
	 * 
	 * @param senderNm 送付担当者名
	 */
	public void setSenderNm(String senderNm) {
		this.senderNm = senderNm;
	}

	/**
	 * 
	 * @return 送付連絡先電話
	 */
	public String getSenderTel() {
		return senderTel;
	}

	/**
	 * 
	 * @param senderTel 送付連絡先電話
	 */
	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}

	/**
	 * 
	 * @return 送信日付
	 */
	public String getSendYmd() {
		return sendYmd;
	}

	/**
	 * 
	 * @param sendYmd 送信日付
	 */
	public void setSendYmd(String sendYmd) {
		this.sendYmd = sendYmd;
	}

	/**
	 * 
	 * @return 状態
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status 状態
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 
	 * @return 在庫区分
	 */
	public Integer getStockDiv() {
		return stockDiv;
	}

	/**
	 * 
	 * @param stockDiv 在庫区分
	 */
	public void setStockDiv(Integer stockDiv) {
		this.stockDiv = stockDiv;
	}

	/**
	 * 
	 * @return 更新日付
	 */
	public String getUpdateYmd() {
		return updateYmd;
	}

	/**
	 * 
	 * @param updateYmd 更新日付
	 */
	public void setUpdateYmd(String updateYmd) {
		this.updateYmd = updateYmd;
	}

	/**
	 * 
	 * @return 年度
	 */
	public String getYear() {
		return year;
	}

	/**
	 * 
	 * @param year 年度
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * 
	 * @return タイムスタンプ
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * 
	 * @param timestamp タイムスタンプ
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
		
	/**
	 * 
	 * @return 状態名称
	 */
	public String getStatusName() {
		
		if (getStatus() == null) {
			return null;
		}
		String status = StringUtil.lpad(getStatus().toString(), 2,
				JreConstants.FACILITY1_FLAG);
		return JreConstants.getListLabel(JreConstants.DIV_STATUS, status);
	}
	
	/**
	 * 
	 * @return No1状態名称
	 */
	public String getNo1StatusName() {

		if (getNo1Status() == null) {
			return null;
		}		
		String status = StringUtil.lpad(getNo1Status().toString(), 2,
				JreConstants.FACILITY1_FLAG);
		return JreConstants.getListLabel(JreConstants.DIV_STATUS, status);
	}
	
	/**
	 * 
	 * @return No2状態名称
	 */
	public String getNo2StatusName() {
		
		if (getNo2Status() == null) {
			return null;
		}
		String status = StringUtil.lpad(getNo2Status().toString(), 2,
				JreConstants.FACILITY1_FLAG);
		String no2StatusName = JreConstants.getListLabel(JreConstants.DIV_STATUS, status);
		if (!StringUtil.isEmpty(no2StatusName)) {
			if (no2StatusName.trim().equals(JreConstants.AGREESTATUS_RECORD)) {
				return JreConstants.AGREESTATUS_OTHER;
			} else if (no2StatusName.trim().equals(JreConstants.ADMINSTATUS_ALL)) {
				return JreConstants.ADMINSTATUS_OTHER;
			}
		}
		
		return no2StatusName;
	}
	
	/**
	 * 
	 * @return 状態名称
	 */
	public String getNo3StatusName() {
		
		if (getNo3Status() == null) {
			return null;
		}
		String status = StringUtil.lpad(getNo3Status().toString(), 2,
				JreConstants.FACILITY1_FLAG);
		String no3StatusName = JreConstants.getListLabel(JreConstants.DIV_STATUS, status);
		if (!StringUtil.isEmpty(no3StatusName)) {
			if (no3StatusName.trim().equals(JreConstants.AGREESTATUS_RECORD)) {
				return JreConstants.AGREESTATUS_OTHER;
			} else if (no3StatusName.trim().equals(JreConstants.ADMINSTATUS_ALL)) {
				return JreConstants.ADMINSTATUS_OTHER;
			}
		}
		
		return no3StatusName;
	}
	
	/**
	 * 
	 * @return 状態名称
	 */
	public String getNo4StatusName() {
		
		if (getNo4Status() == null) {
			return null;
		}
		String status = StringUtil.lpad(getNo4Status().toString(), 2,
				JreConstants.FACILITY1_FLAG);
		String no4StatusName = JreConstants.getListLabel(JreConstants.DIV_STATUS, status);
		if (!StringUtil.isEmpty(no4StatusName)) {
			if (no4StatusName.trim().equals(JreConstants.AGREESTATUS_RECORD)) {
				return JreConstants.AGREESTATUS_OTHER;
			} else if (no4StatusName.trim().equals(JreConstants.ADMINSTATUS_ALL)) {
				return JreConstants.ADMINSTATUS_OTHER;
			}
		}
		
		return no4StatusName;
	}
	
	/**
	 * 
	 * @return 支社名称
	 */
	public String getBranchName() {

		return JreConstants.getListLabel(JreConstants.DIV_BRANCH, branchCd);
	}

	/**
	 * 
	 * @return 種類名称
	 */
	public String getKindName() {
		
		return JreConstants.getListLabel(JreConstants.DIV_KIND, kindFlg.toString());
	}
	
	/**
	 * 
	 * @return シーズン名称
	 */
	public String getSeasonDivName() {
		
		return JreConstants.getListLabel(JreConstants.DIV_SEASON, seasonDiv.toString());
	}

	/**
	 * 
	 * @return 種類
	 */
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * 
	 * @param kindFlg 種類
	 */
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}

	/**
	 * 
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return ユーザ名称
	 */
	public String getUserNm() {
		return userNm;
	}

	/**
	 * 
	 * @param userNm ユーザ名称
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	/**
	 * @return 企画通番（６社）の第一枚文字
	 */
	public String getPlanNo6Off1() {

		return getCharAt(planNo6Off, 1);
	}
	
	/**
	 * @return 企画通番（６社）の第二枚文字
	 */
	public String getPlanNo6Off2() {

		return getCharAt(planNo6Off, 2);
	}
	
	/**
	 * @return 企画通番（６社）の第三枚文字
	 */
	public String getPlanNo6Off3() {

		return getCharAt(planNo6Off, 3);
	}
	
	/**
	 * @return 企画通番（６社）の第四枚文字
	 */
	public String getPlanNo6Off4() {

		return getCharAt(planNo6Off, 4);
	}
	
	/**
	 * @return 企画通番（６社）の第五枚文字
	 */
	public String getPlanNo6Off5() {

		return getCharAt(planNo6Off, 5);
	}
	
	/**
	 * @return 企画通番（６社）の第六枚文字
	 */
	public String getPlanNo6Off6() {

		return getCharAt(planNo6Off, 6);
	}
	
	/**
	 * @return 企画通番（東日本）の第一枚文字
	 */
	public String getPlanNoEJp1() {

		return getCharAt(planNoEJp, 1);
	}
	
	/**
	 * @return 企画通番（東日本）の第二枚文字
	 */
	public String getPlanNoEJp2() {

		return getCharAt(planNoEJp, 2);
	}
	
	/**
	 * @return 企画通番（東日本）の第三枚文字
	 */
	public String getPlanNoEJp3() {

		return getCharAt(planNoEJp, 3);
	}
	
	/**
	 * @return 企画通番（東日本）の第四枚文字
	 */
	public String getPlanNoEJp4() {

		return getCharAt(planNoEJp, 4);
	}
	
	/**
	 * @return 企画通番（東日本）の第五枚文字
	 */
	public String getPlanNoEJp5() {

		return getCharAt(planNoEJp, 5);
	}
	
	/**
	 * @return 企画通番（東日本）の第六枚文字
	 */
	public String getPlanNoEJp6() {
		
		return getCharAt(planNoEJp, 6);
	}
	
	/**
	 * 
	 * @return 施設コードの第一枚文字
	 */
	public String getFacilityCd1() {

		return getCharAt(facilityCd, 1);
	}
	
	/**
	 * 
	 * @return 施設コードの第二枚文字
	 */
	public String getFacilityCd2() {

		return getCharAt(facilityCd, 2);
	}
	
	/**
	 * 
	 * @return 施設コードの第三枚文字
	 */
	public String getFacilityCd3() {

		return getCharAt(facilityCd, 3);
	}
	
	/**
	 * 
	 * @return 施設コードの第四枚文字
	 */
	public String getFacilityCd4() {

		return getCharAt(facilityCd, 4);
	}
	
	/**
	 * 
	 * @return 施設コードの第五枚文字
	 */
	public String getFacilityCd5() {

		return getCharAt(facilityCd, 5);
	}
	
	/**
	 * 
	 * @return 施設コードの第六枚文字
	 */
	public String getFacilityCd6() {

		return getCharAt(facilityCd, 6);
	}
	
	/**
	 * 指定位置に文字を取得する.
	 * @param pos 位置
	 * @param str 入力文字列
	 * @return 指定する文字
	 */
	private String getCharAt(String str, int pos) {
		
		if (StringUtil.isEmpty(str)) {
			return "";
		}
		return "" + str.charAt(pos - 1);
	}
	
	/**
	 * 前４枚施設コードを取得する.
	 * @return 前４枚施設コード
	 */
	public String getFourFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(0, 4);
		}
		return null;
	}
	
	/**
	 * 後２枚施設コードを取得する.
	 * @return 後２枚施設コード
	 */
	public String getTwoFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(4, 6);
		}
		return null;
	}
	
	/**
	 * 状態名称.
	 * @return 状態名称
	 */
	public String getNo5StatusName() {
		String status = StringUtil.lpad(getNo5Status().toString(), 2,
				JreConstants.FACILITY1_FLAG);
		String no5StatusName = JreConstants.getListLabel(JreConstants.DIV_STATUS, status);
		if (!StringUtil.isEmpty(no5StatusName)) {
			if (no5StatusName.trim().equals(JreConstants.AGREESTATUS_RECORD)) {
				return JreConstants.AGREESTATUS_OTHER;
			} else if (no5StatusName.trim().equals(JreConstants.ADMINSTATUS_ALL)) {
				return JreConstants.ADMINSTATUS_OTHER;
			}
		}
		return no5StatusName;
	}

	/**
	 * 
	 * @return 施設名称（カナ）
	 */
	public String getFacilityNmKana() {
		return facilityNmKana;
	}

	/**
	 * 
	 * @param facilityNmKana 施設名称（カナ）
	 */
	public void setFacilityNmKana(String facilityNmKana) {
		this.facilityNmKana = facilityNmKana;
	}
	/**
	 * 
	 * @return 連絡先Fax
	 */
	public String getSenderFax() {
		return senderFax;
	}
	/**
	 * 
	 * @param senderFax 連絡先Fax
	 */
	public void setSenderFax(String senderFax) {
		this.senderFax = senderFax;
	}
	/**
	 * 
	 * @return 送付状態名
	 */
	public String getSendStatusName() {
		if (StringUtil.isEmpty(sendStatus)) {
			return "";
		} else {
			int status = Integer.valueOf(sendStatus).intValue();
			switch(status){
			case 0:
				return JreConstants.SENDSTATUSNAMES[0];
			case 1:
				return JreConstants.SENDSTATUSNAMES[1];
			case 2:
				return JreConstants.SENDSTATUSNAMES[2];
			default:
				return "";
				
			}
		}
		
	}
	/**
	 * 
	 * @return 送信状態
	 */
	public String getSendStatus() {
		return sendStatus;
	}
	/**
	 * 
	 * @param sendStatus 送付状態
	 */
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	
	//施設付帯情報データを格納する(追加) 2009/12/14 孫 s30873
	
	/**
	 * 施設付帯種類 
	 */
	private String facilitySorts;
	
	/**
	 * 施設付帯パターン
	 */
	private String facilityPattern;
	private String tempFacilityPattern;
	
	/**
	 * 施設付帯状態
	 */
	private String facilityDecisionFlg;
	
	/**
	 * 施設付帯パターン名称
	 */
	private String facilityPatternNm;
	
	/**
	 * 施設タイプ
	 */
	private String facilityType;

	/**
	 * no2施設タイプ
	 */
	private String no2Type;
	
	/**
	 * no3施設パターン 
	 */
	private String no3Pattern;
	
	/**
	 * no5施設パターン
	 */
	private String no5Pattern;
	
	/**
	 * 更新日
	 */
	private String upYmd;
	
	/**
	 * @return facilityPattern
	 */
	public String getFacilityPattern() {
		return facilityPattern;
	}

	/**
	 * @return facilitySorts
	 */
	public String getFacilitySorts() {
		return facilitySorts;
	}

	/**
	 * @return facStatus
	 */
	public String getFacilityDecisionFlg() {
		return facilityDecisionFlg;
	}

	/**
	 * @param facilityPattern 設定する facilityPattern
	 */
	public void setFacilityPattern(String facilityPattern) {
		this.facilityPattern = facilityPattern;
	}

	/**
	 * @param facilitySorts 設定する facilitySorts
	 */
	public void setFacilitySorts(String facilitySorts) {
		this.facilitySorts = facilitySorts;
	}

	/**
	 * @param facStatus 設定する facStatus
	 */
	public void setFacilityDecisionFlg(String facilityDecisionFlg) {
		this.facilityDecisionFlg = facilityDecisionFlg;
	}

	/**
	 * @return facilityPatternNm
	 */
	public String getFacilityPatternNm() {
		return facilityPatternNm;
	}

	/**
	 * @param facilityPatternNm 設定する facilityPatternNm
	 */
	public void setFacilityPatternNm(String facilityPatternNm) {
		this.facilityPatternNm = facilityPatternNm;
	}
	/** 
	 * @return ＦＭ原価連携名 .
	 */
	public String getFacilityDecisionName() {
		return JreConstants.getMapValue(JreConstants.DIV_FAC_DECISION_DIV,
				getFacilityDecisionFlg() == null ? null : getFacilityDecisionFlg().toString());
	}
	
	/**
	 * 
	 * @return 施設付帯パターンの第一枚文字
	 */
	public String getFacilityPattern1() {

		return getCharAt(facilityPattern, 1);
	}
	
	/**
	 * 
	 * @return 施設付帯パターンの第二枚文字
	 */
	public String getFacilityPattern2() {

		return getCharAt(facilityPattern, 2);
	}
	
	/**
	 * 
	 * @return 施設付帯パターンの第三枚文字
	 */
	public String getFacilityPattern3() {

		return getCharAt(facilityPattern, 3);
	}
	
	/**
	 * 
	 * @return 施設付帯パターンの第四枚文字
	 */
	public String getFacilityPattern4() {

		return getCharAt(facilityPattern, 4);
	}
	
	/**
	 * 
	 * @return 施設付帯パターンの第五枚文字
	 */
	public String getFacilityPattern5() {

		return getCharAt(facilityPattern, 5);
	}
	
	/**
	 * 
	 * @return 施設付帯パターンの第六枚文字
	 */
	public String getFacilityPattern6() {

		return getCharAt(facilityPattern, 6);
	}

	/**
	 * @return tempFacilityPattern
	 */
	public String getTempFacilityPattern() {
		return tempFacilityPattern;
	}

	/**
	 * @param tempFacilityPattern 設定する tempFacilityPattern
	 */
	public void setTempFacilityPattern(String tempFacilityPattern) {
		this.tempFacilityPattern = tempFacilityPattern;
	}

	/**
	 * @return facilityType
	 */
	public String getFacilityType() {
		return facilityType;
	}

	/**
	 * @param facilityType 設定する facilityType
	 */
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

	/**
	 * @return no2Type
	 */
	public String getNo2Type() {
		return no2Type;
	}

	/**
	 * @param no2Type 設定する no2Type
	 */
	public void setNo2Type(String no2Type) {
		this.no2Type = no2Type;
	}

	/**
	 * @return no3Pattern
	 */
	public String getNo3Pattern() {
		return no3Pattern;
	}

	/**
	 * @param no3Pattern 設定する no3Pattern
	 */
	public void setNo3Pattern(String no3Pattern) {
		this.no3Pattern = no3Pattern;
	}

	/**
	 * @return no5Pattern
	 */
	public String getNo5Pattern() {
		return no5Pattern;
	}

	/**
	 * @param no5Pattern 設定する no5Pattern
	 */
	public void setNo5Pattern(String no5Pattern) {
		this.no5Pattern = no5Pattern;
	}

	/**
	 * @return upYmd
	 */
	public String getUpYmd() {
		if(!(upYmd==null))
		{
			if(upYmd.length()>10){
				setUpYmd(upYmd.substring(0,10).replace('-', '/'));
			}
		}
		return upYmd;
	}

	/**
	 * @param upYmd 設定する upYmd
	 */
	public void setUpYmd(String upYmd) {
		this.upYmd = upYmd;
	}
}
						
