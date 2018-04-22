package jp.co.jreast.common.data.ddata;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import jp.co.jreast.common.data.BasicMstData;
import jp.co.jreast.common.support.LabelValueBean;

/**
 * ����q�\����\���\��LabelValueBean
 *
 * <pre>
 *   �@�\�T�v �F
 *   ���L���� �F
 * </pre>
 *
 * @version 4.0.0
 * @since 2015/06/01
 * @author ITG
 */
public class NestedLabelValueBean extends LabelValueBean {

	/** �o�[�W����ID */
	private static final long serialVersionUID = 1L;

	/** �q�v�f�n�b�V�� */
	private final Map<String, NestedLabelValueBean> children = new HashMap<>();

	/**
	 * �R���X�g���N�^
	 */
	public NestedLabelValueBean() {
		super();
	}

	/**
	 * �R���X�g���N�^
	 *
	 * @param basis
	 *            ��{�}�X�^�f�[�^
	 */
	public NestedLabelValueBean(BasicMstData basis) {
		super(basis.getBasicName1(), StringUtils.trimToEmpty(basis
				.getBasicCode1()));
	}

	/**
	 * �R���X�g���N�^
	 *
	 * @param label
	 *            ���x��
	 * @param value
	 *            �l
	 */
	public NestedLabelValueBean(String label, String value) {
		super(label, value);
	}

	/**
	 * �q�v�f��ǉ����܂��B
	 *
	 * <pre></pre>
	 *
	 * @param child
	 *            �q�v�f
	 */
	public void appendChild(NestedLabelValueBean child) {
		getChildren().put(child.getValue(), child);
	}

	/**
	 * �q�v�f�n�b�V�����擾���܂��B
	 *
	 * @return �q�v�f�n�b�V��
	 */
	public Map<String, NestedLabelValueBean> getChildren() {
		return children;
	}
}
