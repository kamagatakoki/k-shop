package Main;

import common2.CustomSqlSessionManager;
import common2.DaoManagerDelegate;
import entity.GenreLgEntity;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		DaoManagerDelegate.init("common2/SqlMapConfig2.xml");
		CustomSqlSessionManager sqlSessionManager = DaoManagerDelegate.getSqlMapInstance();
		sqlSessionManager.startManagedSession();
		GenreLgEntity genreLgEntity = (GenreLgEntity) sqlSessionManager.queryForObject("GenreLgEntity.getGenreLg");
		System.out.println(genreLgEntity.getGenreLgCd());
	}

}
