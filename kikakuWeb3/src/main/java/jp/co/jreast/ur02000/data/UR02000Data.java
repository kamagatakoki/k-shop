package jp.co.jreast.ur02000.data;

import java.util.List;
import java.util.Map;

import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;
import jp.co.jreast.common.data.AnsSearchData;
import jp.co.jreast.common.data.no1data.No1InitData;

/**
 * <pre>
 * �J�����_�[�̃f�[�^�N���X.
 * �@�\�T�v    �F  
 * ���L����    �F  
 * </pre>  
 * @author zangzy
 *
 */
public class UR02000Data implements InData, OutData{

	/**.
	 * ���������̃f�[�^
	 */
	private AnsSearchData ansSearchData;
	
	/**.
	 * ��ʏ����̃f�[�^
	 */
	private UR02000ConditionInData conditionData;
	
	/**.
	 * ���ԁi�J�n�j
	 */
	private String periodStart;

	/**.
	 * ���ԁi�I���j
	 */
	private String periodEnd;
	
	/**.
	 * ���݂̃y�[�W
	 */
	private int currentPage;
	
	/**.
	 * ���y�[�W
	 */
	private int totalPage;
	
	/**.
	 * ���փ{�^���̖����t���O
	 */
	private String isNextBtnDisabled;
	
	/**.
	 * �O�փ{�^���̖����t���O
	 */
	private String isPreviousBtnDisabled;
	
	/**.
	 * ���O��
	 */
	private String exceptDate;
	
	/**.
	 * ���f�[�^�̃}�b�v
	 */
	private Map yearMonthMap;

	/**.
	 * �y�[�W�̌����X�g
	 */
	private List pageYearMonthList;
	
	/**.
	 * �����p�^���̃��X�g
	 */
	private List patternLVList;
	
	/**.
	 * ���ԃ��X�g
	 */
	private List periodLVList;
	
	/**.
	 * ���̃��X�g
	 */
	private List dayList;
	
	/**.
	 * ���̔z��
	 */
	private int[] yearMonthArr;
	
	/**.
	 * �����j�����X�g
	 */
	private List chargeWeekList;
	
	/**.
	 * �����J�����_�[���X�g
	 */
	private List chargeCalendarList;
	
	/**.
	 * NO1���
	 */
	private Integer no1Status;
	
	/**
	 * �֎�����t���O�@.
	 */
	private boolean isDisplay;
	
	/**
	 * NO1�������f�[�^ .
	 */
	private No1InitData no1InitData;
	
	/**.
	 * ����_�����E�x���E�x�O�����X�g
	 * �ۑ�NO18�F�J�����_�[�ݒ�i�����E�x���E�x�O���j�ǉ��Ή��@2009/12/02 add by s31109
	 */
	private List chargeDayList;
	
	/**
	 * 
	 * @return .
	 */
	public boolean isDisplay() {
		return isDisplay;
	}

	/**
	 * 
	 * @param isDisplay .
	 */
	public void setDisplay(boolean isDisplay) {
		this.isDisplay = isDisplay;
	}

	/**
	 * 
	 * @return NO1���
	 */
	public Integer getNo1Status() {
		return no1Status;
	}
	
	/**
	 * ���t�敪 .
	 */
	private Integer sendDiv;
	
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
	 * @param no1Status NO1���
	 */
	public void setNo1Status(Integer no1Status) {
		this.no1Status = no1Status;
	}

	/**
	 * @return ���ԁi�J�n�j
	 */
	public String getPeriodStart() {
		return periodStart;
	}

	/**
	 * @param periodStart ���ԁi�J�n�j
	 */
	public void setPeriodStart(String periodStart) {
		this.periodStart = periodStart;
	}

	/**
	 * @return ���ԁi�I���j
	 */
	public String getPeriodEnd() {
		return periodEnd;
	}

	/**
	 * @param peroidEnd ���ԁi�I���j
	 */
	public void setPeriodEnd(String peroidEnd) {
		this.periodEnd = peroidEnd;
	}
	
	/**
	 * @return ���f�[�^�̃}�b�v
	 */
	public Map getYearMonthMap() {
		return yearMonthMap;
	}

	/**
	 * @param yearMonthMap ���f�[�^�̃}�b�v
	 */
	public void setYearMonthMap(Map yearMonthMap) {
		this.yearMonthMap = yearMonthMap;
	}

	/**
	 * @return �y�[�W�̌����X�g
	 */
	public List getPageYearMonthList() {
		return pageYearMonthList;
	}

	/**
	 * @param pageYearMonthList �y�[�W�̌����X�g
	 */
	public void setPageYearMonthList(List pageYearMonthList) {
		this.pageYearMonthList = pageYearMonthList;
	}
	
	/**
	 * @param month ��
	 * @return ���f�[�^
	 */
	public UR02000MonthData getMonth(int month) {
		return (UR02000MonthData) yearMonthMap.get(month + "");
	}

	/**
	 * @return �����p�^���̃��X�g
	 */
	public List getPatternLVList() {
		return patternLVList;
	}

	/**
	 * @param patternLVList �����p�^���̃��X�g
	 */
	public void setPatternLVList(List patternLVList) {
		this.patternLVList = patternLVList;
	}
	
	/**
	 * @return ���ԃ��X�g
	 */
	public List getPeriodLVList() {
		return periodLVList;
	}

	/**
	 * @param periodLVList ���ԃ��X�g
	 */
	public void setPeriodLVList(List periodLVList) {
		this.periodLVList = periodLVList;
	}

	/**
	 * @return ���݂̃y�[�W
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage ���݂̃y�[�W
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return �O�փ{�^���̖����t���O
	 */
	public String getIsPreviousBtnDisabled() {
		return isPreviousBtnDisabled;
	}

	/**
	 * @param inPreviousBtnEnable �O�փ{�^���̖����t���O
	 */
	public void setIsPreviousBtnDisabled(String inPreviousBtnEnable) {
		this.isPreviousBtnDisabled = inPreviousBtnEnable;
	}

	/**
	 * @return ���փ{�^���̖����t���O
	 */
	public String getIsNextBtnDisabled() {
		return isNextBtnDisabled;
	}

	/**
	 * @param isNextBtnEnable ���փ{�^���̖����t���O
	 */
	public void setIsNextBtnDisabled(String isNextBtnEnable) {
		this.isNextBtnDisabled = isNextBtnEnable;
	}

	/**
	 * @return ���̔z��
	 */
	public int[] getYearMonthArr() {
		return yearMonthArr;
	}

	/**
	 * @param yearMonthArr ���̔z��
	 */
	public void setYearMonthArr(int[] yearMonthArr) {
		this.yearMonthArr = yearMonthArr;
	}

	/**
	 * @return ��ʏ����̃f�[�^
	 */
	public UR02000ConditionInData getConditionData() {
		return conditionData;
	}

	/**
	 * @param inData ��ʏ����̃f�[�^
	 */
	public void setConditionData(UR02000ConditionInData inData) {
		this.conditionData = inData;
	}

	/**
	 * @return ���y�[�W
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage ���y�[�W
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return ���������̃f�[�^
	 */
	public AnsSearchData getAnsSearchData() {
		return ansSearchData;
	}

	/**
	 * @param ansSearchData ���������̃f�[�^
	 */
	public void setAnsSearchData(AnsSearchData ansSearchData) {
		this.ansSearchData = ansSearchData;
	}

	/**
	 * @return ���̃��X�g
	 */
	public List getDayList() {
		return dayList;
	}

	/**
	 * @param dayList ���̃��X�g
	 */
	public void setDayList(List dayList) {
		this.dayList = dayList;
	}

	/**
	 * 
	 * @return ���O��
	 */
	public String getExceptDate() {
		return exceptDate;
	}

	/**
	 * 
	 * @param exceptDate ���O��
	 */
	public void setExceptDate(String exceptDate) {
		this.exceptDate = exceptDate;
	}

	/**
	 * 
	 * @return �����J�����_�[���X�g
	 */
	public List getChargeCalendarList() {
		return chargeCalendarList;
	}

	/**
	 * 
	 * @param chargeCalendarList �����J�����_�[���X�g
	 */
	public void setChargeCalendarList(List chargeCalendarList) {
		this.chargeCalendarList = chargeCalendarList;
	}

	/**
	 * 
	 * @return �����j�����X�g
	 */
	public List getChargeWeekList() {
		return chargeWeekList;
	}

	/**
	 * 
	 * @param chargeWeekList �����j�����X�g
	 */
	public void setChargeWeekList(List chargeWeekList) {
		this.chargeWeekList = chargeWeekList;
	}

	/**
	 * 
	 * @return .
	 */
	public No1InitData getNo1InitData() {
		return no1InitData;
	}

	/**
	 * 
	 * @param no1InitData .
	 */ 
	public void setNo1InitData(No1InitData no1InitData) {
		this.no1InitData = no1InitData;
	}
	
	/**
	 * 
	 * @return ����_�����E�x���E�x�O�����X�g
	 */
	public List getChargeDayList() {
		return chargeDayList;
	}

	/**
	 * 
	 * @param chargeDayList ����_�����E�x���E�x�O�����X�g
	 */
	public void setChargeDayList(List chargeDayList) {
		this.chargeDayList = chargeDayList;
	}
}
