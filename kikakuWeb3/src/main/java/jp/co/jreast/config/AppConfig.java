package jp.co.jreast.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import jp.co.intage.framework.util.MessageUtil;

/**
 * クラスの説明：
 * @author kamagata
 * @since 2018/04/22
 */
@Configuration
public class AppConfig {

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/04/22
	 * @return na
	 */
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		// クラスパス上に格納されているプロパティファイルを指定する
		messageSource.setBasename("/WEB-INF/classes/jp/co/jreast/common/properties/appresources");
		//messageSource.setDefaultEncoding("MS932");
		MessageUtil.setMessages(messageSource);
		return messageSource;
	}

}
