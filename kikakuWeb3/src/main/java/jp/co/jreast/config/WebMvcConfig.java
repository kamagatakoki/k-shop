package jp.co.jreast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * クラスの説明：
 * @author kamagata
 * @since 2018/04/22
 */
@Configuration
@EnableWebMvc
@ComponentScan("jp.co.jreast")
public class WebMvcConfig implements WebMvcConfigurer {

	/** オーバーライドの説明：
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#configureViewResolvers(org.springframework.web.servlet.config.annotation.ViewResolverRegistry)
	 * @author kamagata
	 * @since 2018/04/22
	 * @param viewResolverRegistry a
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {
		viewResolverRegistry.jsp().prefix("/WEB-INF/jsp/");
		// Tiles ViewResolver
		TilesViewResolver viewResolver = new TilesViewResolver();
		viewResolverRegistry.viewResolver(viewResolver);
	}

	//	/** オーバーライドの説明：
	//	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
	//	 * @author kamagata
	//	 * @since 2018/04/22
	//	 * @param registry a
	//	 */
	//	@Override
	//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	//
	//		registry.addResourceHandler("/resources/**")
	//				.addResourceLocations("classpath:../../resources/");
	//		//
	//		//		registry.addResourceHandler("/jp/**")
	//		//				.addResourceLocations("classpath:jp/");
	//	}

	/**
	 * メソッドの説明：Tiles定義ファイル読込
	 * @author kamagata
	 * @since 2018/04/22
	 * @return a
	 */
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(
				new String[] { "/WEB-INF/conf/tiles-defs.xml" });
		tilesConfigurer.setCheckRefresh(true);

		return tilesConfigurer;
	}

}
