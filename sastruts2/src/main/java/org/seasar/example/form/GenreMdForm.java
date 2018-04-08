package org.seasar.example.form;

import org.seasar.struts.annotation.IntRange;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;

import validation.Unique;

/**
 * コンストラクタの説明：中ジャンルフォームクラス
 * @author kamagata
 * @since 2018/01/07
 */
public class GenreMdForm {

	/**
	 * フィールドの説明：中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@Required
	@Maxlength(maxlength = 4)
	@Minlength(minlength = 4)
	@IntegerType
	@Unique(tableNm = "GENRE_MD", columnNm = "GENRE_MD_CD", target = "insert")
	public String genreMdCd;

	/**
	 * フィールドの説明：大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@Required
	@Maxlength(maxlength = 2)
	@Minlength(minlength = 2)
	@IntegerType
	public String genreLgCd;

	/**
	 * フィールドの説明：中ジャンル名
	 * @author kamagata
	 * @since 2018/01/07
	 */
	@Required
	@Maxlength(maxlength = 50)
	@Minlength(minlength = 1)
	public String genreMdNm;

	/**
	 * フィールドの説明：表示順
	 * @author kamagata
	 * @since 2018/01/08
	 */
	@Required
	@IntRange(min = 1, max = 99)
	public String displayOrder;

	/**
	 * フィールドの説明：検索条件 大ジャンルコード
	 * @author kamagata
	 * @since 2018/01/10
	 */
	public String searchGenreLgCd;

	/**
	 * フィールドの説明：検索条件 中ジャンルコード
	 * @author kamagata
	 * @since 2018/01/10
	 */
	public String searchGenreMdCd;

	/**
	 * フィールドの説明：検索条件 大ジャンル名
	 * @author kamagata
	 * @since 2018/01/10
	 */
	public String searchGenreLgNm;

	/**
	 * フィールドの説明：検索条件 中ジャンル名
	 * @author kamagata
	 * @since 2018/01/10
	 */
	public String searchGenreMdNm;

	/**
	 * フィールドの説明：画面表示モード(新規or変更)
	 * @author kamagata
	 * @since 2018/04/01
	 */
	public String crud;

}
