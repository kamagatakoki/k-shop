package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SettingUtil {

	private static SettingUtil settingUtil = new SettingUtil();
	private static final String PRPFNAME = "jdbc.properties";

	private Properties properties;

	private SettingUtil() {
		properties = new Properties();

		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(PRPFNAME);

		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return settingUtil.properties.getProperty(key);
	}
}
