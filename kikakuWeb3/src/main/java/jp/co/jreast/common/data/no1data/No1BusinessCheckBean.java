package jp.co.jreast.common.data.no1data;

import java.util.List;
import java.util.Map;

/**
 * <pre>
 * �r�W�l�X�`�F�b�N�f�[�^�N���X�B.
 * �@�\�T�v    �F  �r�W�l�X�`�F�b�N�f�[�^���i�[����B
 * ���L����    �F  �J�����_�[�ƃy�[�W�̒񋟊����͈�v�����`�F�b�N����p
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/11/17
 */
public class No1BusinessCheckBean {
	/**
	 * �����J�����_�[ �񋟊��ԊJ�n�N����.
	 */
	private String calendarTermFromYmd;
	
	/**
	 * �����J�����_�[ �񋟊��ԏI���N����.
	 */
	private String calendarTermEndYmd;
	
	/**
	 * �����J�����_�[ �p�^�����.
	 */
	private List calendarPatternKindList;
	
	/**
	 * No1 �񋟊��ԊJ�n�N����.
	 */
	private String no1TermFromYmd;
	
	/**
	 * No1 �񋟊��ԏI���N����.
	 */
	private String no1TermEndYmd;
	
	/**
	 * No1 �p�^�����.
	 */
	private Map no1PatternKindMap;

	/**
	 * @return �����J�����_�[ �p�^�����.
	 */
	public List getCalendarPatternKindList() {
		return calendarPatternKindList;
	}

	/**
	 * @param calendarPatternKindList �����J�����_�[ �p�^�����
	 */
	public void setCalendarPatternKindList(List calendarPatternKindList) {
		this.calendarPatternKindList = calendarPatternKindList;
	}

	/**
	 * @return �����J�����_�[ �񋟊��ԏI���N����.
	 */
	public String getCalendarTermEndYmd() {
		return calendarTermEndYmd;
	}

	/**
	 * @param calendarTermEndYmd �����J�����_�[ �񋟊��ԏI���N����.
	 */
	public void setCalendarTermEndYmd(String calendarTermEndYmd) {
		this.calendarTermEndYmd = calendarTermEndYmd;
	}

	/**
	 * @return �����J�����_�[ �񋟊��ԊJ�n�N����.
	 */
	public String getCalendarTermFromYmd() {
		return calendarTermFromYmd;
	}

	/**
	 * @param calendarTermFromYmd �����J�����_�[ �񋟊��ԊJ�n�N����.
	 */
	public void setCalendarTermFromYmd(String calendarTermFromYmd) {
		this.calendarTermFromYmd = calendarTermFromYmd;
	}

	/**
	 * @return No1 �p�^�����
	 */
	public Map getNo1PatternKindMap() {
		return no1PatternKindMap;
	}

	/**
	 * @param no1PatternKindMap No1 �p�^�����
	 */
	public void setNo1PatternKindMap(Map no1PatternKindMap) {
		this.no1PatternKindMap = no1PatternKindMap;
	}

	/**
	 * @return No1 �񋟊��ԏI���N����.
	 */
	public String getNo1TermEndYmd() {
		return no1TermEndYmd;
	}

	/**
	 * @param no1TermEndYmd No1 �񋟊��ԏI���N����.
	 */
	public void setNo1TermEndYmd(String no1TermEndYmd) {
		this.no1TermEndYmd = no1TermEndYmd;
	}

	/**
	 * @return No1 �񋟊��ԊJ�n�N����.
	 */
	public String getNo1TermFromYmd() {
		return no1TermFromYmd;
	}

	/**
	 * @param no1TermFromYmd No1 �񋟊��ԊJ�n�N����.
	 */
	public void setNo1TermFromYmd(String no1TermFromYmd) {
		this.no1TermFromYmd = no1TermFromYmd;
	}

	
}
