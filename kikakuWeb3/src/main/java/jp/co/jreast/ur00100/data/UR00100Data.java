package jp.co.jreast.ur00100.data;

import jp.co.jreast.common.data.UserData;
import jp.co.intage.framework.data.InData;
import jp.co.intage.framework.data.OutData;

/**
 * <pre>
 * ログイン入力データクラス。.
 * 機能概要    ：  ログイン入力データを格納する。
 * 特記事項    ：  無し
 * </pre>
 *
 * @author 周安静
 * @version 0.1 2006/10/11
 */
public class UR00100Data implements InData, OutData {
	/**
	 *  userデータ.
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
