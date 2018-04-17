package common;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.DaoManagerBuilder;

/**
* SqlMapClientを返すためのクラス
*/
public class DaoManagerDelegate {
	private static DaoManager daoManager;

	/**
	 * 初期化する。
	 * @param resource 指定リソース
	 */
	public static void init(String resource) {
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			daoManager = DaoManagerBuilder.buildDaoManager(reader);
		} catch (Exception e) {
			throw new RuntimeException("Could not initialize DaoManagerDelegate. Cause: " + e);
		}
	}
	//
	//	static {
	//		try {
	//			String resource = "examples/SqlMapConfig.xml";
	//			Reader reader = Resources.getResourceAsReader(resource);
	//			daoManager = DaoManagerBuilder.buildDaoManager(reader);
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//	}

	/**
	 * DAOクラスでDAOを取得する。
	 *
	 * @param c クラス
	 * @return ベースDAO
	 */
	public static IDao createDao(Class c) {
		return (IDao) daoManager.getDao(c);
	}

	/**
	 * トランザクションをコミットする
	 */
	public static void commitTransaction() {
		daoManager.commitTransaction();
	}

	/**
	 * トランザクションを始める
	 */
	public static void startTransaction() {
		daoManager.startTransaction();
	}

	/**
	 * トランザクションを終了する。
	 */
	public static void endTransaction() {
		daoManager.endTransaction();
	}

	public static DaoManager getSqlMapInstance() {
		//Singletoneとして利用
		return daoManager;
	}
}
