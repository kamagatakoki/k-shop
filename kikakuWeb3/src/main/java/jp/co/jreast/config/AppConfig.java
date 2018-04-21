package jp.co.jreast.config;

import org.springframework.context.annotation.Configuration;

/**
 * クラスの説明：
 * @author kamagata
 * @since 2018/04/22
 */
@Configuration
public class AppConfig {
	//
	//	/**
	//	 * メソッドの説明：Tiles用のViewResolver
	//	 * @author kamagata
	//	 * @since 2018/04/22
	//	 * @param urlBasedViewResolver a
	//	 */
	//	@Bean
	//	public void tilesViewResolver(UrlBasedViewResolver urlBasedViewResolver) {
	//		urlBasedViewResolver.setViewClass(TilesView.class);
	//		urlBasedViewResolver.setOrder(0);
	//	}
	//
	//	/**
	//	 * メソッドの説明：元々のViewResolver
	//	 * @author kamagata
	//	 * @since 2018/04/22
	//	 * @param internalResourceViewResolver a
	//	 */
	//	@Bean
	//	public void viewResolver(InternalResourceViewResolver internalResourceViewResolver) {
	//		internalResourceViewResolver.setPrefix("/WEB-INF/views");
	//		internalResourceViewResolver.setSuffix(".jsp");
	//		internalResourceViewResolver.setOrder(1);
	//	}
	//
	//	/**
	//	 * メソッドの説明：Tilesの定義ファイルの指定
	//	 * @author kamagata
	//	 * @since 2018/04/22
	//	 * @param tilesConfigurer a
	//	 */
	//	@Bean
	//	public void tilesConfigurer(TilesConfigurer tilesConfigurer) {
	//		tilesConfigurer.setDefinitions("/WEB-INF/conf/tiles-defs.xml");
	//
	//	}
}
