package main;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import common.MyAppSqlConfig;
import entity.GenreLgEntity;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO 自動生成されたメソッド・スタブ
		SqlMapClient sqlMap = MyAppSqlConfig.getSqlMapInstance();

		GenreLgEntity genreLgEntity = (GenreLgEntity) sqlMap.queryForObject("getGenreLg");

		System.out.println(genreLgEntity.getGenreLgCd());
	}

}
