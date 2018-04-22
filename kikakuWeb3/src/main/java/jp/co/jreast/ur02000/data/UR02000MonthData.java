package jp.co.jreast.ur02000.data;

import java.util.Iterator;
import java.util.List;

/**
 * <pre>
 * �J�����_�[�̌��̃f�[�^�N���X�B.
 * �@�\�T�v    �F  
 * ���L����    �F  
 * </pre> 
 * @author zangzy
 *
 */
public class UR02000MonthData {
	/**.
	 * ���@yyyyMM
	 */
	String yearMonth;
	
	/**.
	 * ���̃��X�g
	 */
	List dayList;

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
	 * @return ���@yyyyMM
	 */
	public String getYearMonth() {
		return yearMonth;
	}

	/**
	 * @param month ���@yyyyMM
	 */
	public void setYearMonth(String month) {
		this.yearMonth = month;
	}
	
	/**
	 * �w�肳�ꂽ���f�[�^�Ɠ������t�̃f�[�^(�N���A�O�O ����)�����݂��邩�ǂ���.
	 * @param day ���f�[�^
	 * @return ���݂��邩�ǂ���
	 */
	public boolean hasDay(UR02000DayData day) {
		for (Iterator it = getDayList().iterator(); it.hasNext();) {
			UR02000DayData nextDay = (UR02000DayData) it.next();
			if (nextDay.getDay().equals(day.getDay())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * �w�肳�ꂽ���f�[�^�Ɠ������t�̃f�[�^(�N���A�O�O ����)���擾����.
	 * �w�肳�ꂽ���t�̃f�[�^�����݂��Ȃ��ꍇ��null��Ԃ�.
	 * @param day ���f�[�^
	 * @return ���f�[�^ ���݂��Ȃ��ꍇ��null
	 */
	public UR02000DayData getDay(UR02000DayData day) {
		for (Iterator it = getDayList().iterator(); it.hasNext();) {
			UR02000DayData nextDay = (UR02000DayData) it.next();
			if (nextDay.getDay() != null 
					&& nextDay.getDay().equals(day.getDay())) {
				return nextDay;
			}
		}
		return null;
	}
}
