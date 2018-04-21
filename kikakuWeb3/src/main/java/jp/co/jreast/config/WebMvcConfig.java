package jp.co.jreast.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * �N���X�̐����F
 * @author kamagata
 * @since 2018/04/22
 */
@Configuration
@EnableWebMvc
@ComponentScan("jp.co.jreast")
public class WebMvcConfig implements WebMvcConfigurer {

	/** �I�[�o�[���C�h�̐����F
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

	/** �I�[�o�[���C�h�̐����F
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
	 * @author kamagata
	 * @since 2018/04/22
	 * @param registry a
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/resources/**")
				.addResourceLocations("classpath:../../resources/");
	}

	/**
	 * ���\�b�h�̐����F
	 * @author kamagata
	 * @since 2018/04/22
	 * @return na
	 */
	@Bean
	public MessageSource MessageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		// �N���X�p�X��Ɋi�[����Ă���v���p�e�B�t�@�C�����w�肷��
		messageSource.setBasename("appresources.properties");
		return messageSource;
	}

	/**
	 * ���\�b�h�̐����FTiles��`�t�@�C���Ǎ�
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
