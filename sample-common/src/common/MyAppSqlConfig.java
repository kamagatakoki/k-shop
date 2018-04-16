package common;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
* SqlMapClientを返すためのクラス
*/
public class MyAppSqlConfig {
	private static SqlMapClient sqlMap;
	static {
		try {
			String resource = "examples/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlMapClient getSqlMapInstance() {
		//Singletoneとして利用
		return sqlMap;
	}
}
