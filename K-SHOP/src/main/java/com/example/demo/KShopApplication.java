package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.service.maintenance.GenreLgService;

/**
 * クラスの説明：デフォルト
 * @author kamagata
 * @since 2018/01/12
 */
@SpringBootApplication
@EnableJpaAuditing
public class KShopApplication {

	@Autowired
	GenreLgService genreLgService;

	/**
	 * メソッドの説明：共通カラムに登録するログイン者を設定
	 * @author kamagata
	 * @since 2018/01/09
	 * @return ログイン者
	 */
	@Bean
	public AuditorAware<String> auditorAware() {
		return () -> "user";
	}

	/**
	 * メソッドの説明：メッセージファイル読み込み
	 * @author kamagata
	 * @since 2018/01/19
	 * @return MessageSource メッセージソース
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("application-messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

	/**
	 * メソッドの説明：デフォルト
	 * @author kamagata
	 * @since 2018/01/12
	 * @param args なし
	 */
	public static void main(String[] args) {
		SpringApplication.run(KShopApplication.class, args);
	}
}
