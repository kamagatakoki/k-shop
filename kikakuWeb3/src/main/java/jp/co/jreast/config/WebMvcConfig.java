package jp.co.jreast.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
}
