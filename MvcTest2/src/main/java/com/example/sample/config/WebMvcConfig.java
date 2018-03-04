package com.example.sample.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.VersionResourceResolver;

/**
 * クラスの説明：DispatcherServlet用コンフィギュレーション
 * @author kamagata
 * @since 2018/02/08
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.example.sample")
public class WebMvcConfig implements WebMvcConfigurer {

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

	/** オーバーライドの説明：静的リソースアクセス設定(SpringMVC機能)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
	 * @author kamagata
	 * @since 2018/02/12
	 * @param registry リソースハンドラー
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/resources/**")
				.addResourceLocations("classpath:../../resources/")
				.resourceChain(enableCache) // キャッシュ
				// コンテンツデータのMD5ハッシュ値によるバージョニング機能の有効化
				.addResolver(new VersionResourceResolver()
						.addContentVersionStrategy("/**"));
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
}
