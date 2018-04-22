package jp.co.jreast.common.data.dno1data;

import jp.co.intage.framework.util.StringUtil;

/**
 * <pre>
 * �񋟊��ԃf�[�^�N���X�B.
 * �@�\�T�v    �F  �񋟊��ԃf�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu	
 * @version 0.1 2006/12/05
 */
public class DNo1TermDateData {
	
	/**�񋟊��ԏI���N���� . */
	private String  termEndYmd;
	/**�񋟊��ԊJ�n�N���� . */
	private String  termFromYmd;
	
	/**
	 * @return Returns the termFromYmd.
	 */
	public String getTermFromYmd() {
		return termFromYmd;
	}
	/**
	 * @param termFromYmd The termFromYmd to set.
	 */
	public void setTermFromYmd(String termFromYmd) {
		this.termFromYmd = termFromYmd;
	}
	/**
	 * @return Returns the termEndYmd.
	 */
	public String getTermEndYmd() {
		return termEndYmd;
	}
	/**
	 * @param termEndYmd The termEndYmd to set.
	 */
	public void setTermEndYmd(String termEndYmd) {
		this.termEndYmd = termEndYmd;
	}
	
	/**
	 * �񋟊��Ԃ�NULL���ǂ���.
	 * 
	 * @return boolean
	 */
	public boolean isBlankDate() {
		return StringUtil.isEmpty(getTermEndYmd())
				&& StringUtil.isEmpty(getTermFromYmd());
	}
}
