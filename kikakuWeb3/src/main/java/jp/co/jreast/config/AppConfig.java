package jp.co.jreast.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import jp.co.intage.framework.util.MessageUtil;

/**
 * �N���X�̐����F
 * @author kamagata
 * @since 2018/04/22
 */
@Configuration
public class AppConfig {

	/**
	 * ���\�b�h�̐����F
	 * @author kamagata
	 * @since 2018/04/22
	 * @return na
	 */
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		// �N���X�p�X��Ɋi�[����Ă���v���p�e�B�t�@�C�����w�肷��
		messageSource.setBasename("/WEB-INF/classes/jp/co/jreast/common/properties/appresources");
		//messageSource.setDefaultEncoding("MS932");
		MessageUtil.setMessages(messageSource);
		return messageSource;
	}

}
