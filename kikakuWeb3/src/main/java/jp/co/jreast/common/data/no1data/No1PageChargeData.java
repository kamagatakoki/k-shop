package jp.co.jreast.common.data.no1data;


/**
 * <pre>
 * No1画面料金データクラス。.
 * 機能概要    ：  NO1画面料金データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author zang
 * @version 0.1 2006/11/17
 */
public final class No1PageChargeData {
	
	/**
     * コンストラクタ.
     */
	public No1PageChargeData() {
		
	}
	
	/**
	 * @param key パターン種別	 or 料金シーケンス
	 * @param capaPatternCount .
	 */
	public No1PageChargeData(String key, int capaPatternCount) {
		this.key = key;
		adltAmount = new String[capaPatternCount];
		for (int i = 0; i < capaPatternCount; i++) {
			adltAmount[i] = "";
		}
		
		adltAmountHanbai = new String[capaPatternCount];
		for (int i = 0; i < capaPatternCount; i++) {
			adltAmountHanbai[i] = "";
		}

		childAmount = new String[capaPatternCount];
		for (int i = 0; i < capaPatternCount; i++) {
			childAmount[i] = "";
		}

		childAmountHanbai = new String[capaPatternCount];
		for (int i = 0; i < capaPatternCount; i++) {
			childAmountHanbai[i] = "";
		}
		
		maxAdltCapaPattern = new Integer(capaPatternCount);
		maxChildCapaPattern = new Integer(capaPatternCount);
	}
	/**
	 * パターン種別 or 料金シーケンス .
	 */
	private String key;
	
	/**
	 * 大人金額（仕入額）.
	 */
	private String[] adltAmount;	

	//------- 販売額追加 2010/4/14 加藤 -----
	/**
	 * 大人金額（販売額）.
	 */
	private String[] adltAmountHanbai;
	//---------------------------------------
	
	/**
	 * 小人金額（仕入額） .
	 */
	private String[] childAmount;
	
	//------- 販売額追加 2010/4/14 加藤 -----
	/**
	 * 小人金額（販売額） .
	 */
	private String[] childAmountHanbai;
	//---------------------------------------
	
	/**
	 * 一番大人パターン定員 .
	 */
	private Integer maxAdltCapaPattern;
	
	/**
	 * 一番小人パターン定員 .
	 */
	private Integer maxChildCapaPattern;

	/**
	 * @return 大人料金配列.
	 */
	public String[] getAdltAmount() {
		return adltAmount;
	}

	/**
	 * @param adltAmount .
	 */
	public void setAdltAmount(final String[] adltAmount) {
		this.adltAmount = adltAmount;
	}

	/**
	 * @return 小人料金配列.
	 */
	public String[] getChildAmount() {
		return childAmount;
	}

	/**
	 * @param childAmount .
	 */
	public void setChildAmount(final String[] childAmount) {
		this.childAmount = childAmount;
	}

	/**
	 * @return key.
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key .
	 */
	public void setKey(final String key) {
		this.key = key;
	}
	
	/**
	 * 
	 * @param i .
	 * @return .
	 */
	public String getAdltAmount(int i) {
		return adltAmount[i];
	}
	
	/**
	 * 
	 * @param i .
	 * @return .
	 */
	public String getAdltAmountHanbai(int i) {
		return adltAmountHanbai[i];
	}

	/**
	 * 
	 * @param i .
	 * @return .
	 */
	public String getChildAmount(int i) {
		return childAmount[i];
	}
	
	/**
	 * 
	 * @param i .
	 * @return .
	 */
	public String getChildAmountHanbai(int i) {
		return childAmountHanbai[i];
	}
	
	/**
	 * @param index .
	 * @param childAmount .
	 */
	public void setChildAmount(final int index, final String childAmount) {
		this.childAmount[index] = childAmount;
	}
	
	/**
	 * @param index .
	 * @param adltAmount .
	 */
	public void setAdltAmount(final int index, final String adltAmount) {
		this.adltAmount[index] = adltAmount;
	}
	
	/**
	 * @param index .
	 * @param adltAmount .
	 */
	public void setAdltAmountHanbai(final int index, final String adltAmountHanbai) {
		this.adltAmountHanbai[index] = adltAmountHanbai;
	}
	
	/**
	 * @param index .
	 * @param childAmount .
	 */
	public void setChildAmountHanbai(final int index, final String childAmountHanbai) {
		this.childAmountHanbai[index] = childAmountHanbai;
	}

	/**
	 * @return .
	 */
	public Integer getMaxAdltCapaPattern() {
		return maxAdltCapaPattern;
	}

	/**
	 * @param maxAdltCapaPattern .
	 */
	public void setMaxAdltCapaPattern(Integer maxAdltCapaPattern) {
		this.maxAdltCapaPattern = maxAdltCapaPattern;
	}

	/**
	 * @return .
	 */
	public Integer getMaxChildCapaPattern() {
		return maxChildCapaPattern;
	}

	/**
	 * @param maxChildCapaPattern .
	 */
	public void setMaxChildCapaPattern(Integer maxChildCapaPattern) {
		this.maxChildCapaPattern = maxChildCapaPattern;
	}

	// -----販売額追加 2010/4/14 加藤 -----------------------------------
	/**
	 * @return
	 */
	public String[] getAdltAmountHanbai() {
		return adltAmountHanbai;
	}

	/**
	 * @param adltAmountHanbai
	 */
	public void setAdltAmountHanbai(String[] adltAmountHanbai) {
		this.adltAmountHanbai = adltAmountHanbai;
	}

	/**
	 * @return
	 */
	public String[] getChildAmountHanbai() {
		return childAmountHanbai;
	}

	/**
	 * @param childAmountHanbai
	 */
	public void setChildAmountHanbai(String[] childAmountHanbai) {
		this.childAmountHanbai = childAmountHanbai;
	}
	// -------------------------------------------------------------------

}
