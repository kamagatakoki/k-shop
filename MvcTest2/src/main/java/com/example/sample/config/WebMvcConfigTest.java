package com.example.sample.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.RequestDataValueProcessor;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenInterceptor;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenRequestDataValueProcessor;

/**
 * クラスの説明：DispatcherServlet用コンフィギュレーション
 * @author kamagata
 * @since 2018/02/08
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example.sample")
public class WebMvcConfigTest implements WebMvcConfigurer {

	/**
	 * フィールドの説明：キャッシュ利用(プロパティファイル経由で環境変数から取得)
	 * @author kamagata
	 * @since 2018/02/12
	 */
	@Value("${enableCache}")
	private boolean enableCache;

	/** オーバーライドの説明：ビュー名解決
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#configureViewResolvers(org.springframework.web.servlet.config.annotation.ViewResolverRegistry)
	 * @author kamagata
	 * @since 2018/02/08
	 * @param viewResolverRegistry jsp
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {
		viewResolverRegistry.jsp().prefix("/WEB-INF/views/");
	}

	/**
	 * メソッドの説明：JdbcTemplateのBean定義
	 * @author kamagata
	 * @since 2018/02/10
	 * @param dataSource データソース
	 * @return JdbcTemplate JDBCテンプレート
	 */
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	//	/** オーバーライドの説明：静的リソースアクセス設定(Tomcat機能)
	//	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
	//	 * @author kamagata
	//	 * @since 2018/02/12
	//	 * @param configurer デフォルトサーブレット
	//	 */
	//	@Override
	//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	//		configurer.enable();
	//	}

	/** オーバーライドの説明：非同期設定
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#configureAsyncSupport(org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer)
	 * @author kamagata
	 * @since 2018/02/26
	 * @param configurer 非同期コンフィグ
	 */
	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		configurer.setDefaultTimeout(5000); // タイアウトの設定
	}

	/**
	 * メソッドの説明：トランザクショントークンの生成・チェックの設定(二重送信防止)
	 * @author kamagata
	 * @since 2018/03/10
	 * @return TransactionTokenInterceptor
	 */
	@Bean
	public TransactionTokenInterceptor transactionTokenInterceptor() {
		return new TransactionTokenInterceptor();
	}

	/**
	 * メソッドの説明：トランザクショントークンをformタグに埋め込む(hidden)設定
	 * @author kamagata
	 * @since 2018/03/10
	 * @return RequestDataValueProcessor
	 */
	@Bean
	public RequestDataValueProcessor requestDataValueProcessor() {
		return new TransactionTokenRequestDataValueProcessor();
	}

	/**
	 * メソッドの説明：トランザクショントークン生成適用のマッピング
	 * @author kamagata
	 * @since 2018/03/10
	 * @param registry InterceptorRegistry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(transactionTokenInterceptor())
				.addPathPatterns("/**")
				.excludePathPatterns("/resources/**")
				.excludePathPatterns("/**/*.html");
	}
}
