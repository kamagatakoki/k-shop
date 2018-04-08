package dao;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import util.SettingUtil;

public class DaoUtil {
	private DataSource source;

	private static DaoUtil inst = new DaoUtil();

	private static final String JDBC_URL = "jdbc.driver.url";
	private static final String JDBC_USER = "jdbc.driver.user";
	private static final String JDBC_PASS = "jdbc.driver.pass";
	private static final String JDBC_DRIVER = "jdbc.driver.classname";

	private DaoUtil() {
		source = createDataSource();
	}

	public static DataSource getSource() {
		return inst.source;
	}

	private DataSource createDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();

		basicDataSource.setDriverClassName(SettingUtil.getProperty(JDBC_DRIVER));
		basicDataSource.setUsername(SettingUtil.getProperty(JDBC_USER));
		basicDataSource.setPassword(SettingUtil.getProperty(JDBC_PASS));
		basicDataSource.setUrl(SettingUtil.getProperty(JDBC_URL));

		return basicDataSource;
	}
}
