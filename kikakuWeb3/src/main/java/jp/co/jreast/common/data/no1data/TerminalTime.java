package jp.co.jreast.common.data.no1data;
/**
 * �񋟊������`�F�b�N�N���X.
 * @author Administrator
 *
 */
public  interface TerminalTime {
	
	/**
	 * 
	 * @return �񋟊��ԏI����.
	 */
	abstract String getTerminalEndD();
	/**
	 * 
	 * @param terminalEndD �񋟊��ԏI����.
	 */
	public void setTerminalEndD(String terminalEndD); 
		
	/**
	 * 
	 * @return �񋟊��ԏI����.
	 */
	public String getTerminalEndM();
	/**
	 * 
	 * @param terminalEndM �񋟊��ԏI����.
	 */
	public void setTerminalEndM(String terminalEndM);
	/**
	 * 
	 * @return �񋟊��ԏI���N�x.
	 */
	public String getTerminalEndY();
	/**
	 * 
	 * @param terminalEndY �񋟊��ԏI���N�x�@.
	 */
	public void setTerminalEndY(String terminalEndY);
	/**
	 * 
	 * @return �񋟊��ԊJ�n��.
	 */
	public String getTerminalFromD();
	/**
	 * 
	 * @param terminalFromD �񋟊��ԊJ�n��.
	 */
	public void setTerminalFromD(String terminalFromD);
	/**
	 * 
	 * @return �񋟊��ԊJ�n��.
	 */
	public String getTerminalFromM();
	/**
	 * 
	 * @param terminalFromM �񋟊��ԊJ�n��.
	 */
	public void setTerminalFromM(String terminalFromM);
	/**
	 * 
	 * @return terminalFromY �񋟊��ԊJ�n�N�x.
	 */
	public String getTerminalFromY();
	/**
	 * 
	 * @param terminalFromY �񋟊��ԊJ�n�N�x.
	 */
	public void setTerminalFromY(String terminalFromY);
}
