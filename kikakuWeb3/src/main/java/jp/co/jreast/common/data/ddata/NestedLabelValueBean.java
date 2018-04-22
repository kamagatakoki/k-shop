package jp.co.jreast.common.data.ddata;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.data.BasicMstData;
import jp.co.jreast.common.support.LabelValueBean;

/**
 * 入れ子構造を表現可能なLabelValueBean
 *
 * <pre>
 *   機能概要 ：
 *   特記事項 ：
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class NestedLabelValueBean extends LabelValueBean {

	/** バージョンID */
	private static final long serialVersionUID = 1L;

	/** 子要素ハッシュ */
	private final Map<String, NestedLabelValueBean> children = new HashMap<>();

	/**
	 * コンストラクタ
	 */
	public NestedLabelValueBean() {
		super();
	}

	/**
	 * コンストラクタ
	 *
	 * @param basis
	 *            基本マスタデータ
	 */
	public NestedLabelValueBean(BasicMstData basis) {
		super(basis.getBasicName1(), StringUtils.trimToEmpty(basis
				.getBasicCode1()));
	}

	/**
	 * コンストラクタ
	 *
	 * @param label
	 *            ラベル
	 * @param value
	 *            値
	 */
	public NestedLabelValueBean(String label, String value) {
		super(label, value);
	}

	/**
	 * 子要素を追加します。
	 *
	 * <pre></pre>
	 *
	 * @param child
	 *            子要素
	 */
	public void appendChild(NestedLabelValueBean child) {
		getChildren().put(child.getValue(), child);
	}

	/**
	 * 子要素ハッシュを取得します。
	 *
	 * @return 子要素ハッシュ
	 */
	public Map<String, NestedLabelValueBean> getChildren() {
		return children;
	}
}
