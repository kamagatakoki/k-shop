package entity;

public class GenreLgEntity {

	/**
	 * フィールドの説明：大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/07
	 */
	private String genreLgCd;

	/**
	 * フィールドの説明：大ジャンル名
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private String genreLgNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/06
	 */
	private Integer displayOrder;

	public String getGenreLgCd() {
		return genreLgCd;
	}

	public void setGenreLgCd(String genreLgCd) {
		this.genreLgCd = genreLgCd;
	}

	public String getGenreLgNm() {
		return genreLgNm;
	}

	public void setGenreLgNm(String genreLgNm) {
		this.genreLgNm = genreLgNm;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
}
