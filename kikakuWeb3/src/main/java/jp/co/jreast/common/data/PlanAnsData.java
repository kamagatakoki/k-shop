package jp.co.jreast.common.data;

import java.util.Date;

import jp.co.intage.framework.util.StringUtil;
import jp.co.jreast.common.JreConstants;

/**
 * <pre>
 * ���񓚏��f�[�^�N���X�B.
 * �@�\�T�v    �F  ���񓚏��f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/10/27
 */
public class PlanAnsData extends PlanAnsBaseData{
	/**
	 * �{�݃R�[�h.
	 */
	private String facilityCd;

	/**
	 * �{�ݖ���.
	 */
	private String facilityNm;
	
	/**
	 * �{�ݖ��́i�J�i�j.
	 */
	private String facilityNmKana;

	/**
	 * �x�ЃR�[�h.
	 */
	private String branchCd;

	/**
	 * ���.
	 */
	private String kindFlg;

	/**
	 * �N�x.
	 */
	private String year;

	/**
	 * �V�[�Y���敪.
	 */
	private String seasonDiv;

	/**
	 * ���i����.
	 */
	private String goodsNm;

	/**
	 * �݌ɋ敪.
	 */
	private Integer stockDiv;

	/**
	 * ���ʔԁi�����{�j.
	 */
	private String planNoEJp;

	/**
	 * ���ʔԁi�U�Ёj.
	 */
	private String planNo6Off;

	/**
	 * ���t�敪.
	 */
	private Integer sendDiv;

	/**
	 * �񓚏����t��.
	 */
	private String ansSendAddr;
	
	/**
	 * ���M���t.
	 */										
	private String sendYmd;
	
	/**
	 * ���t�S���Җ�.
	 */
	private String senderNm;

	/**
	 * ���t�A����d�b.
	 */
	private String senderTel;

	/**
	 * ���.
	 */
	private Integer status;

	/**
	 * NO1���.
	 */
	private Integer no1Status;

	/**
	 * NO2���.
	 */
	private Integer no2Status;

	/**
	 * NO3���.
	 */
	private Integer no3Status;

	/**
	 * NO4���.
	 */
	private Integer no4Status;

	/**
	 * NO5���.
	 */
	private Integer no5Status;

	/**
	 * NO1����ԍ�.
	 */
	private Integer no1CareerNo;

	/**
	 * NO2����ԍ�.
	 */
	private Integer no2CareerNo;

	/**
	 * NO3����ԍ�.
	 */
	private Integer no3CareerNo;

	/**
	 * NO4����ԍ�.
	 */
	private Integer no4CareerNo;

	/**
	 * NO5����ԍ�.
	 */
	private Integer no5CareerNo;

	/**
	 * �e�l�����A�g.
	 */
	private Integer fmCostRelateDiv;

	/**
	 * �e�l�݌ɘA�g.
	 */
	private Integer fmStockRelateDiv;

	/**
	 * �폜�t���O.
	 */
	private String delFlg = "0";

	/**
	 * �ŐV�t���O.
	 */
	private String newFlg = "1";

	/**
	 * �X�V���t.
	 */
	private String updateYmd;

	/**
	 * �^�C���X�^���v.
	 */
	private Date timestamp;
	
	/**
	 * ���[�UID.
	 */
	private String userId;

	/**
	 * ���[�U����.
	 */
	private String userNm;
	
	/**
	 * ���[�U�敪.
	 */
	private Integer userDiv;
	/**.
	 * �A����Fax
	 */
	private String senderFax;									
										
	/**
	 * ���t���.
	 */
	private String sendStatus;
	
	/**
	 * @return userDiv ���[�U�敪
	 */
	public Integer getUserDiv() {
		return userDiv;
	}

	/**
	 * @param userDiv ���[�U�敪
	 */
	public void setUserDiv(Integer userDiv) {
		this.userDiv = userDiv;
	}

	/**
	 * 
	 * @return String �񓚏����t��
	 */
	public String getAnsSendAddr() {
		return ansSendAddr;
	}

	/**
	 * 
	 * @param ansSendAddr �񓚏����t��
	 */
	public void setAnsSendAddr(String ansSendAddr) {
		this.ansSendAddr = ansSendAddr;
	}

	/**
	 * 
	 * @return �x�ЃR�[�h
	 */
	public String getBranchCd() {
		return branchCd;
	}

	/**
	 * 
	 * @param branchCd �x�ЃR�[�h
	 */
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}

	/**
	 * 
	 * @return �폜�t���O
	 */
	public String getDelFlg() {
		return delFlg;
	}

	/**
	 * 
	 * @param delFlg �폜�t���O
	 */
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	/**
	 * 
	 * @return �{�݃R�[�h
	 */
	public String getFacilityCd() {
		return facilityCd;
	}

	/**
	 * 
	 * @param facilityCd �{�݃R�[�h
	 */
	public void setFacilityCd(String facilityCd) {
		this.facilityCd = facilityCd;
	}

	/**
	 * 
	 * @return �{�ݖ���
	 */
	public String getFacilityNm() {
		return facilityNm;
	}

	/**
	 * 
	 * @param facilityNm �{�ݖ���
	 */
	public void setFacilityNm(String facilityNm) {
		this.facilityNm = facilityNm;
	}

	/**
	 * 
	 * @return �e�l�����A�g
	 */
	public Integer getFmCostRelateDiv() {
		return fmCostRelateDiv;
	}

	/**
	 * 
	 * @param fmCostRelateDiv �e�l�����A�g
	 */
	public void setFmCostRelateDiv(Integer fmCostRelateDiv) {
		this.fmCostRelateDiv = fmCostRelateDiv;
	}

	/**
	 * 
	 * @return �e�l�݌ɘA�g
	 */
	public Integer getFmStockRelateDiv() {
		return fmStockRelateDiv;
	}

	/**
	 * 
	 * @param fmStockRelateDiv �e�l�݌ɘA�g
	 */
	public void setFmStockRelateDiv(Integer fmStockRelateDiv) {
		this.fmStockRelateDiv = fmStockRelateDiv;
	}

	/**
	 * 
	 * @return ���i����
	 */
	public String getGoodsNm() {
		return goodsNm;
	}

	/**
	 * 
	 * @param goodsNm ���i����
	 */
	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}


	/**
	 * 
	 * @return �ŐV�t���O
	 */
	public String getNewFlg() {
		return newFlg;
	}

	/**
	 * 
	 * @param newFlg �ŐV�t���O
	 */
	public void setNewFlg(String newFlg) {
		this.newFlg = newFlg;
	}

	/**
	 * 
	 * @return NO1����ԍ�
	 */
	public Integer getNo1CareerNo() {
		return no1CareerNo;
	}

	/**
	 * 
	 * @param no1CareerNo NO1����ԍ�
	 */
	public void setNo1CareerNo(Integer no1CareerNo) {
		this.no1CareerNo = no1CareerNo;
	}

	/**
	 * 
	 * @return NO1���
	 */
	public Integer getNo1Status() {
		return no1Status;
	}

	/**
	 * 
	 * @param no1Status NO1���
	 */
	public void setNo1Status(Integer no1Status) {
		this.no1Status = no1Status;
	}

	/**
	 * 
	 * @return NO2����ԍ�
	 */
	public Integer getNo2CareerNo() {
		return no2CareerNo;
	}

	/**
	 * 
	 * @param no2CareerNo NO2����ԍ�
	 */
	public void setNo2CareerNo(Integer no2CareerNo) {
		this.no2CareerNo = no2CareerNo;
	}

	/**
	 * 
	 * @return NO2���
	 */
	public Integer getNo2Status() {
		return no2Status;
	}

	/**
	 * 
	 * @param no2Status NO2���
	 */
	public void setNo2Status(Integer no2Status) {
		this.no2Status = no2Status;
	}

	/**
	 * 
	 * @return NO3����ԍ�
	 */
	public Integer getNo3CareerNo() {
		return no3CareerNo;
	}

	/**
	 * 
	 * @param no3CareerNo NO3����ԍ�
	 */
	public void setNo3CareerNo(Integer no3CareerNo) {
		this.no3CareerNo = no3CareerNo;
	}

	/**
	 * 
	 * @return NO3���
	 */
	public Integer getNo3Status() {
		return no3Status;
	}

	/**
	 * 
	 * @param no3Status NO3���
	 */
	public void setNo3Status(Integer no3Status) {
		this.no3Status = no3Status;
	}

	/**
	 * 
	 * @return NO4����ԍ�
	 */
	public Integer getNo4CareerNo() {
		return no4CareerNo;
	}

	/**
	 * 
	 * @param no4CareerNo NO4����ԍ�
	 */
	public void setNo4CareerNo(Integer no4CareerNo) {
		this.no4CareerNo = no4CareerNo;
	}

	/**
	 * 
	 * @return NO4���
	 */
	public Integer getNo4Status() {
		return no4Status;
	}

	/**
	 * 
	 * @param no4Status NO4���
	 */
	public void setNo4Status(Integer no4Status) {
		this.no4Status = no4Status;
	}

	/**
	 * 
	 * @return NO5����ԍ�
	 */
	public Integer getNo5CareerNo() {
		return no5CareerNo;
	}

	/**
	 * 
	 * @param no5CareerNo NO5����ԍ�
	 */
	public void setNo5CareerNo(Integer no5CareerNo) {
		this.no5CareerNo = no5CareerNo;
	}

	/**
	 * 
	 * @return NO5���
	 */
	public Integer getNo5Status() {
		return no5Status;
	}

	/**
	 * 
	 * @param no5Status NO5���
	 */
	public void setNo5Status(Integer no5Status) {
		this.no5Status = no5Status;
	}

	/**
	 * 
	 * @return ���ʔԁi�U�Ёj
	 */
	public String getPlanNo6Off() {
		return planNo6Off;
	}

	/**
	 * 
	 * @param planNo6Off ���ʔԁi�U�Ёj
	 */
	public void setPlanNo6Off(String planNo6Off) {
		this.planNo6Off = planNo6Off;
	}

	/**
	 * 
	 * @return ���ʔԁi�����{�j
	 */
	public String getPlanNoEJp() {
		return planNoEJp;
	}
	
	/**
	 * 
	 * @param planNoEJp ���ʔԁi�����{�j
	 */
	public void setPlanNoEJp(String planNoEJp) {
		this.planNoEJp = planNoEJp;
	}

	/**
	 * 
	 * @return �V�[�Y���敪
	 */
	public String getSeasonDiv() {
		return seasonDiv;
	}

	/**
	 * 
	 * @param seasonDiv �V�[�Y���敪
	 */
	public void setSeasonDiv(String seasonDiv) {
		this.seasonDiv = seasonDiv;
	}

	/**
	 * 
	 * @return ���t�敪
	 */
	public Integer getSendDiv() {
		return sendDiv;
	}

	/**
	 * 
	 * @param sendDiv ���t�敪
	 */
	public void setSendDiv(Integer sendDiv) {
		this.sendDiv = sendDiv;
	}

	/**
	 * 
	 * @return ���t�S���Җ�
	 */
	public String getSenderNm() {
		return senderNm;
	}

	/**
	 * 
	 * @param senderNm ���t�S���Җ�
	 */
	public void setSenderNm(String senderNm) {
		this.senderNm = senderNm;
	}

	/**
	 * 
	 * @return ���t�A����d�b
	 */
	public String getSenderTel() {
		return senderTel;
	}

	/**
	 * 
	 * @param senderTel ���t�A����d�b
	 */
	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}

	/**
	 * 
	 * @return ���M���t
	 */
	public String getSendYmd() {
		return sendYmd;
	}

	/**
	 * 
	 * @param sendYmd ���M���t
	 */
	public void setSendYmd(String sendYmd) {
		this.sendYmd = sendYmd;
	}

	/**
	 * 
	 * @return ���
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status ���
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 
	 * @return �݌ɋ敪
	 */
	public Integer getStockDiv() {
		return stockDiv;
	}

	/**
	 * 
	 * @param stockDiv �݌ɋ敪
	 */
	public void setStockDiv(Integer stockDiv) {
		this.stockDiv = stockDiv;
	}

	/**
	 * 
	 * @return �X�V���t
	 */
	public String getUpdateYmd() {
		return updateYmd;
	}

	/**
	 * 
	 * @param updateYmd �X�V���t
	 */
	public void setUpdateYmd(String updateYmd) {
		this.updateYmd = updateYmd;
	}

	/**
	 * 
	 * @return �N�x
	 */
	public String getYear() {
		return year;
	}

	/**
	 * 
	 * @param year �N�x
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * 
	 * @return �^�C���X�^���v
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * 
	 * @param timestamp �^�C���X�^���v
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
		
	/**
	 * 
	 * @return ��Ԗ���
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
	 * @return No1��Ԗ���
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
	 * @return No2��Ԗ���
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
	 * @return ��Ԗ���
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
	 * @return ��Ԗ���
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
	 * @return �x�Ж���
	 */
	public String getBranchName() {

		return JreConstants.getListLabel(JreConstants.DIV_BRANCH, branchCd);
	}

	/**
	 * 
	 * @return ��ޖ���
	 */
	public String getKindName() {
		
		return JreConstants.getListLabel(JreConstants.DIV_KIND, kindFlg.toString());
	}
	
	/**
	 * 
	 * @return �V�[�Y������
	 */
	public String getSeasonDivName() {
		
		return JreConstants.getListLabel(JreConstants.DIV_SEASON, seasonDiv.toString());
	}

	/**
	 * 
	 * @return ���
	 */
	public String getKindFlg() {
		return kindFlg;
	}

	/**
	 * 
	 * @param kindFlg ���
	 */
	public void setKindFlg(String kindFlg) {
		this.kindFlg = kindFlg;
	}

	/**
	 * 
	 * @return ���[�UID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId ���[�UID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return ���[�U����
	 */
	public String getUserNm() {
		return userNm;
	}

	/**
	 * 
	 * @param userNm ���[�U����
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	/**
	 * @return ���ʔԁi�U�Ёj�̑�ꖇ����
	 */
	public String getPlanNo6Off1() {

		return getCharAt(planNo6Off, 1);
	}
	
	/**
	 * @return ���ʔԁi�U�Ёj�̑�񖇕���
	 */
	public String getPlanNo6Off2() {

		return getCharAt(planNo6Off, 2);
	}
	
	/**
	 * @return ���ʔԁi�U�Ёj�̑�O������
	 */
	public String getPlanNo6Off3() {

		return getCharAt(planNo6Off, 3);
	}
	
	/**
	 * @return ���ʔԁi�U�Ёj�̑�l������
	 */
	public String getPlanNo6Off4() {

		return getCharAt(planNo6Off, 4);
	}
	
	/**
	 * @return ���ʔԁi�U�Ёj�̑�ܖ�����
	 */
	public String getPlanNo6Off5() {

		return getCharAt(planNo6Off, 5);
	}
	
	/**
	 * @return ���ʔԁi�U�Ёj�̑�Z������
	 */
	public String getPlanNo6Off6() {

		return getCharAt(planNo6Off, 6);
	}
	
	/**
	 * @return ���ʔԁi�����{�j�̑�ꖇ����
	 */
	public String getPlanNoEJp1() {

		return getCharAt(planNoEJp, 1);
	}
	
	/**
	 * @return ���ʔԁi�����{�j�̑�񖇕���
	 */
	public String getPlanNoEJp2() {

		return getCharAt(planNoEJp, 2);
	}
	
	/**
	 * @return ���ʔԁi�����{�j�̑�O������
	 */
	public String getPlanNoEJp3() {

		return getCharAt(planNoEJp, 3);
	}
	
	/**
	 * @return ���ʔԁi�����{�j�̑�l������
	 */
	public String getPlanNoEJp4() {

		return getCharAt(planNoEJp, 4);
	}
	
	/**
	 * @return ���ʔԁi�����{�j�̑�ܖ�����
	 */
	public String getPlanNoEJp5() {

		return getCharAt(planNoEJp, 5);
	}
	
	/**
	 * @return ���ʔԁi�����{�j�̑�Z������
	 */
	public String getPlanNoEJp6() {
		
		return getCharAt(planNoEJp, 6);
	}
	
	/**
	 * 
	 * @return �{�݃R�[�h�̑�ꖇ����
	 */
	public String getFacilityCd1() {

		return getCharAt(facilityCd, 1);
	}
	
	/**
	 * 
	 * @return �{�݃R�[�h�̑�񖇕���
	 */
	public String getFacilityCd2() {

		return getCharAt(facilityCd, 2);
	}
	
	/**
	 * 
	 * @return �{�݃R�[�h�̑�O������
	 */
	public String getFacilityCd3() {

		return getCharAt(facilityCd, 3);
	}
	
	/**
	 * 
	 * @return �{�݃R�[�h�̑�l������
	 */
	public String getFacilityCd4() {

		return getCharAt(facilityCd, 4);
	}
	
	/**
	 * 
	 * @return �{�݃R�[�h�̑�ܖ�����
	 */
	public String getFacilityCd5() {

		return getCharAt(facilityCd, 5);
	}
	
	/**
	 * 
	 * @return �{�݃R�[�h�̑�Z������
	 */
	public String getFacilityCd6() {

		return getCharAt(facilityCd, 6);
	}
	
	/**
	 * �w��ʒu�ɕ������擾����.
	 * @param pos �ʒu
	 * @param str ���͕�����
	 * @return �w�肷�镶��
	 */
	private String getCharAt(String str, int pos) {
		
		if (StringUtil.isEmpty(str)) {
			return "";
		}
		return "" + str.charAt(pos - 1);
	}
	
	/**
	 * �O�S���{�݃R�[�h���擾����.
	 * @return �O�S���{�݃R�[�h
	 */
	public String getFourFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(0, 4);
		}
		return null;
	}
	
	/**
	 * ��Q���{�݃R�[�h���擾����.
	 * @return ��Q���{�݃R�[�h
	 */
	public String getTwoFacilityCd() {
		if (!StringUtil.isEmpty(getFacilityCd())
				&& getFacilityCd().length() == 6) {
			return getFacilityCd().substring(4, 6);
		}
		return null;
	}
	
	/**
	 * ��Ԗ���.
	 * @return ��Ԗ���
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
	 * @return �{�ݖ��́i�J�i�j
	 */
	public String getFacilityNmKana() {
		return facilityNmKana;
	}

	/**
	 * 
	 * @param facilityNmKana �{�ݖ��́i�J�i�j
	 */
	public void setFacilityNmKana(String facilityNmKana) {
		this.facilityNmKana = facilityNmKana;
	}
	/**
	 * 
	 * @return �A����Fax
	 */
	public String getSenderFax() {
		return senderFax;
	}
	/**
	 * 
	 * @param senderFax �A����Fax
	 */
	public void setSenderFax(String senderFax) {
		this.senderFax = senderFax;
	}
	/**
	 * 
	 * @return ���t��Ԗ�
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
	 * @return ���M���
	 */
	public String getSendStatus() {
		return sendStatus;
	}
	/**
	 * 
	 * @param sendStatus ���t���
	 */
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	
	//�{�ݕt�я��f�[�^���i�[����(�ǉ�) 2009/12/14 �� s30873
	
	/**
	 * �{�ݕt�ю�� 
	 */
	private String facilitySorts;
	
	/**
	 * �{�ݕt�уp�^�[��
	 */
	private String facilityPattern;
	private String tempFacilityPattern;
	
	/**
	 * �{�ݕt�я��
	 */
	private String facilityDecisionFlg;
	
	/**
	 * �{�ݕt�уp�^�[������
	 */
	private String facilityPatternNm;
	
	/**
	 * �{�݃^�C�v
	 */
	private String facilityType;

	/**
	 * no2�{�݃^�C�v
	 */
	private String no2Type;
	
	/**
	 * no3�{�݃p�^�[�� 
	 */
	private String no3Pattern;
	
	/**
	 * no5�{�݃p�^�[��
	 */
	private String no5Pattern;
	
	/**
	 * �X�V��
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
	 * @param facilityPattern �ݒ肷�� facilityPattern
	 */
	public void setFacilityPattern(String facilityPattern) {
		this.facilityPattern = facilityPattern;
	}

	/**
	 * @param facilitySorts �ݒ肷�� facilitySorts
	 */
	public void setFacilitySorts(String facilitySorts) {
		this.facilitySorts = facilitySorts;
	}

	/**
	 * @param facStatus �ݒ肷�� facStatus
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
	 * @param facilityPatternNm �ݒ肷�� facilityPatternNm
	 */
	public void setFacilityPatternNm(String facilityPatternNm) {
		this.facilityPatternNm = facilityPatternNm;
	}
	/** 
	 * @return �e�l�����A�g�� .
	 */
	public String getFacilityDecisionName() {
		return JreConstants.getMapValue(JreConstants.DIV_FAC_DECISION_DIV,
				getFacilityDecisionFlg() == null ? null : getFacilityDecisionFlg().toString());
	}
	
	/**
	 * 
	 * @return �{�ݕt�уp�^�[���̑�ꖇ����
	 */
	public String getFacilityPattern1() {

		return getCharAt(facilityPattern, 1);
	}
	
	/**
	 * 
	 * @return �{�ݕt�уp�^�[���̑�񖇕���
	 */
	public String getFacilityPattern2() {

		return getCharAt(facilityPattern, 2);
	}
	
	/**
	 * 
	 * @return �{�ݕt�уp�^�[���̑�O������
	 */
	public String getFacilityPattern3() {

		return getCharAt(facilityPattern, 3);
	}
	
	/**
	 * 
	 * @return �{�ݕt�уp�^�[���̑�l������
	 */
	public String getFacilityPattern4() {

		return getCharAt(facilityPattern, 4);
	}
	
	/**
	 * 
	 * @return �{�ݕt�уp�^�[���̑�ܖ�����
	 */
	public String getFacilityPattern5() {

		return getCharAt(facilityPattern, 5);
	}
	
	/**
	 * 
	 * @return �{�ݕt�уp�^�[���̑�Z������
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
	 * @param tempFacilityPattern �ݒ肷�� tempFacilityPattern
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
	 * @param facilityType �ݒ肷�� facilityType
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
	 * @param no2Type �ݒ肷�� no2Type
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
	 * @param no3Pattern �ݒ肷�� no3Pattern
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
	 * @param no5Pattern �ݒ肷�� no5Pattern
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
	 * @param upYmd �ݒ肷�� upYmd
	 */
	public void setUpYmd(String upYmd) {
		this.upYmd = upYmd;
	}
}
						
