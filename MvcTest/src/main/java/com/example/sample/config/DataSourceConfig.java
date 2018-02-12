package com.example.sample.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * クラスの説明：JNDIデータソースコンフィグ
 * @author kamagata
 * @since 2018/02/10
 */
@Configuration
@ComponentScan("com.example.sample")
@EnableTransactionManagement
@MapperScan("com.example.sample.domain.mapper")
public class DataSourceConfig {

	/**
	 * メソッドの説明：データソースBean定義
	 * @author kamagata
	 * @since 2018/02/10
	 * @return DataSource データソース
	 * @throws NamingException ネーミングエラー
	 */
	@Bean
	public DataSource dataSource() throws NamingException {
		JndiTemplate jndiTemplate = new JndiTemplate();
		return jndiTemplate.lookup("java:comp/env/jdbc/oracle1", DataSource.class);
	}

	/**
	 * メソッドの説明：トランザクションマネージャBean定義
	 * @author kamagata
	 * @since 2018/02/11
	 * @return PlatformTransactionManager
	 * @throws NamingException ネーミングエラー
	 */
	@Bean
	public PlatformTransactionManager transactionManager() throws NamingException {
		return new DataSourceTransactionManager(dataSource());
	}

	/**
	 * メソッドの説明：SQLセッションファクトリーBean定義
	 * @author kamagata
	 * @since 2018/02/11
	 * @return SqlSessionFactoryBean
	 * @throws NamingException ネーミングエラー
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws NamingException {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setConfigLocation(new ClassPathResource("/mybatis-config.xml"));

		return sessionFactoryBean;
	}

	//	/**
	//	 * メソッドの説明：
	//	 * @author kamagata
	//	 * @since 2018/02/10
	//	 * @param driverClassName
	//	 * @param url
	//	 * @param username
	//	 * @param password
	//	 * @return
	//	 * @throws Exception
	//	 */
	/*	@Bean(destroyMethod = "close")
		public DataSource dataSource(
				@Value("${datasource.driver-class-name}") String driverClassName,
				@Value("${datasource.url}") String url,
				@Value("${datasource.username}") String username,
				@Value("${datasource.password}") String password) {
	
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName(driverClassName);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setDefaultAutoCommit(false);
	
			return dataSource;
	
		}*/

}
