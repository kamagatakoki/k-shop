package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * タイプの説明：デフォルト
 * @author kamagata
 * @since 2018/01/06
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/** オーバーライドの説明：デフォルト
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 * @author kamagata
	 * @since 2018/01/06
	 * @param application デフォルト
	 * @return デフォルト
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KShoppingApplication.class);
	}

}
