package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * クラスの説明：デフォルト
 * @author kamagata
 * @since 2018/01/12
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/** オーバーライドの説明：
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 * @author kamagata
	 * @since 2018/01/12
	 * @param application デフォルト
	 * @return デフォルト
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KShopApplication.class);
	}

}
