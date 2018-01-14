package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * タイプの説明：デフォルト
 * @author kamagata
 * @since 2018/01/06
 */
@SpringBootApplication
@EnableJpaAuditing
public class KShoppingApplication {

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
	 * メソッドの説明：デフォルト
	 * @author kamagata
	 * @since 2018/01/06
	 * @param args なし
	 */
	public static void main(String[] args) {
		SpringApplication.run(KShoppingApplication.class, args);
	}
}
