package jp.co.jreast.common.data.no1data;
/**
 * 提供期限をチェッククラス.
 * @author Administrator
 *
 */
public  interface TerminalTime {
	
	/**
	 * 
	 * @return 提供期間終了日.
	 */
	abstract String getTerminalEndD();
	/**
	 * 
	 * @param terminalEndD 提供期間終了日.
	 */
	public void setTerminalEndD(String terminalEndD); 
		
	/**
	 * 
	 * @return 提供期間終了月.
	 */
	public String getTerminalEndM();
	/**
	 * 
	 * @param terminalEndM 提供期間終了月.
	 */
	public void setTerminalEndM(String terminalEndM);
	/**
	 * 
	 * @return 提供期間終了年度.
	 */
	public String getTerminalEndY();
	/**
	 * 
	 * @param terminalEndY 提供期間終了年度　.
	 */
	public void setTerminalEndY(String terminalEndY);
	/**
	 * 
	 * @return 提供期間開始日.
	 */
	public String getTerminalFromD();
	/**
	 * 
	 * @param terminalFromD 提供期間開始日.
	 */
	public void setTerminalFromD(String terminalFromD);
	/**
	 * 
	 * @return 提供期間開始月.
	 */
	public String getTerminalFromM();
	/**
	 * 
	 * @param terminalFromM 提供期間開始月.
	 */
	public void setTerminalFromM(String terminalFromM);
	/**
	 * 
	 * @return terminalFromY 提供期間開始年度.
	 */
	public String getTerminalFromY();
	/**
	 * 
	 * @param terminalFromY 提供期間開始年度.
	 */
	public void setTerminalFromY(String terminalFromY);
}
