package common2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
* SqlMapClientを返すためのクラス
*/
public class DaoManagerDelegate {
	private static CustomSqlSessionManager daoManager;

	/**
	 * 初期化する。
	 * @param resource 指定リソース
	 */
	public static void init(String resource) {
		try {
			System.out.println(resource);
			InputStream reader = Resources.getResourceAsStream(resource);
			System.out.println(reader.toString());
			daoManager = CustomSqlSessionManager.newInstance(new SqlSessionFactoryBuilder().build(reader));
			System.out.println("gre");
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

	//	/**
	//	 * DAOクラスでDAOを取得する。
	//	 *
	//	 * @param c クラス
	//	 * @return ベースDAO
	//	 */
	//	public static IDao createDao(Class c) {
	//		return (IDao) daoManager.getDao(c);
	//	}
	//
	//	/**
	//	 * トランザクションをコミットする
	//	 */
	//	public static void commitTransaction() {
	//		daoManager.commitTransaction();
	//	}
	//
	//	/**
	//	 * トランザクションを始める
	//	 */
	//	public static void startTransaction() {
	//		daoManager.startTransaction();
	//	}
	//
	//	/**
	//	 * トランザクションを終了する。
	//	 */
	//	public static void endTransaction() {
	//		daoManager.endTransaction();
	//	}

	public static CustomSqlSessionManager getSqlMapInstance() {
		//Singletoneとして利用
		return daoManager;
	}
}
