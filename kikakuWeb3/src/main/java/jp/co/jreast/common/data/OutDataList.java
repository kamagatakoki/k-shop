package jp.co.jreast.common.data;

import java.util.List;

import jp.co.intage.framework.data.OutData;

/**
 * <pre>
 * ���X�g�f�[�^�N���X�B.
 * �@�\�T�v    �F  ���X�g�f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author zhou
 * @version 0.1 2006/10/27
 */
public class OutDataList implements OutData{
	/**
	 * �������X�g.
	 */
	private List list;

	/**
	 * �������擾����.
	 * 
	 * @return �����B
	 */
	public int getCount() {

		if (list == null) {
			return 0;
		}
		return list.size();
	}

	/**
	 * @return Returns the list.
	 */
	public List getList() {
		return list;
	}

	/**
	 * @param list The list to set.
	 */
	public void setList(List list) {
		this.list = list;
	}
}
