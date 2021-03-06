package com.example.demo;

import java.util.Collections;
import java.util.List;

import javax.servlet.SessionTrackingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.domain.entity.maintenance.GenreLgEntity;
import com.example.demo.service.maintenance.GenreLgService;

import jp.co.intage.framework.dao.DaoManagerDelegate;

/**
 * クラスの説明：Bean定義
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
	public AuditorAware<Integer> auditorAware() {
		return new SpringSecurityAuditorAware();
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
	 * メソッドの説明：Cookie定義
	 * @author kamagata
	 * @since 2018/02/02
	 * @return ServletContextInitializer
	 */
	@Bean
	public ServletContextInitializer servletContextInitializer() {

		ServletContextInitializer servletContextInitializer = servletContext -> {
			servletContext.getSessionCookieConfig().setHttpOnly(true);
			servletContext.getSessionCookieConfig().setSecure(false);
			servletContext.setSessionTrackingModes(
					Collections.singleton(SessionTrackingMode.COOKIE));
		};
		DaoManagerDelegate.init("SqlMapConfig3.xml");
		return servletContextInitializer;
	}

	/**
	 * メソッドの説明：全ジャンル情報取得(ヘッダー用)
	 * @author kamagata
	 * @since 2018/02/06
	 * @return List<GenreLgEntity> 大ジャンルエンティティリスト(子・孫要素に中・小ジャンル)
	 */
	@Bean
	@Scope("application")
	public List<GenreLgEntity> getHeaderGenreInfo() {
		return genreLgService.findAll(new Sort("displayOrder"));
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
