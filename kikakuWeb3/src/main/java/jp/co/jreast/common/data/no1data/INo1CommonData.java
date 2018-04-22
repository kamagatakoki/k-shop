package jp.co.jreast.common.data.no1data;

import jp.co.jreast.common.data.PlanAnsBaseData;

/**
 * <pre>
 * NO1_�h���A�ό��A�D�ԃf�[�^�C���^�t�F�[�X�N���X�B.
 * �@�\�T�v    �F  NO1_�h���A�ό��A�D�ԃf�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhu
 * @version 0.1 2006/11/17
 */
public interface INo1CommonData {
	/**
	 * ���񓚘A�ԂƗ���ԍ����Z�b�g���� .
	 * 
	 * @param from from�f�[�^
	 */
	public void setPlanNoAndCareerNo(PlanAnsBaseData from);	
	/**
	 * 
	 * @return �񋟊��ԏI����.
	 */
	abstract String getTermEndD();
	/**
	 * 
	 * @param termEndD �񋟊��ԏI����.
	 */
	public void setTermEndD(String termEndD); 
		
	/**
	 * 
	 * @return �񋟊��ԏI����.
	 */
	public String getTermEndM();
	/**
	 * 
	 * @param termEndM �񋟊��ԏI����.
	 */
	public void setTermEndM(String termEndM);
	/**
	 * 
	 * @return �񋟊��ԏI���N�x.
	 */
	public String getTermEndY();
	/**
	 * 
	 * @param termEndY �񋟊��ԏI���N�x�@.
	 */
	public void setTermEndY(String termEndY);
	/**
	 * 
	 * @return �񋟊��ԊJ�n��.
	 */
	public String getTermFromD();
	/**
	 * 
	 * @param termFromD �񋟊��ԊJ�n��.
	 */
	public void setTermFromD(String termFromD);
	/**
	 * 
	 * @return �񋟊��ԊJ�n��.
	 */
	public String getTermFromM();
	/**
	 * 
	 * @param termFromM �񋟊��ԊJ�n��.
	 */
	public void setTermFromM(String termFromM);
	/**
	 * 
	 * @return termFromY �񋟊��ԊJ�n�N�x.
	 */
	public String getTermFromY();
	/**
	 * 
	 * @param termFromY �񋟊��ԊJ�n�N�x.
	 */
	public void setTermFromY(String termFromY);
	/**
	 * @return ����ܕt���萔���̎擾
	 */
	public String getDealFeeDisplay();
}
