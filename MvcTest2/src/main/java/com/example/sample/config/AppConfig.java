package com.example.sample.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * クラスの説明：Webアプリ用コンフィギュレーション
 * @author kamagata
 * @since 2018/02/08
 */
@Configuration
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class AppConfig {

	/**
	 * メソッドの説明：メッセージファイル読み込み
	 * @author kamagata
	 * @since 2018/02/16
	 * @return MessageSource メッセージソース
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("application-messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

}
