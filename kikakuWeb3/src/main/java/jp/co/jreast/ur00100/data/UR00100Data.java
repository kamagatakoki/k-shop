package jp.co.jreast.ur00100.data;

import jp.co.jreast.common.data.UserData;
import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;

/**
 * <pre>
 * ���O�C�����̓f�[�^�N���X�B.
 * �@�\�T�v    �F  ���O�C�����̓f�[�^���i�[����B
 * ���L����    �F  ����
 * </pre>
 *
 * @author ������
 * @version 0.1 2006/10/11
 */
public class UR00100Data implements InData, OutData {
	/**
	 *  user�f�[�^.
	 */
	private UserData user = new UserData();

	/**
	 * @return Returns the user.
	 */
	public UserData getUser() {
		return user;
	}

	/**
	 * @param user
	 *            The user to set.
	 */
	public void setUser(UserData user) {
		this.user = user;
	}

}
