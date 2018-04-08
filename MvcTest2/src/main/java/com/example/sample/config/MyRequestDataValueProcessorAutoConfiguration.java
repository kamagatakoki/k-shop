package com.example.sample.config;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.web.servlet.support.csrf.CsrfRequestDataValueProcessor;
import org.springframework.web.servlet.support.RequestDataValueProcessor;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * クラスの説明：
 * @author kamagata
 * @since 2018/03/10
 */
@Configuration
@Import({ WebSecurityConfig.class })
public class MyRequestDataValueProcessorAutoConfiguration {

	@Bean
	RequestDataValueProcessor requestDataValueProcessor() {
		CsrfRequestDataValueProcessor csrfRequestDataValueProcessor = new CsrfRequestDataValueProcessor();
		return new RequestDataValueProcessor() {
			@Override
			public String processAction(HttpServletRequest request, String action, String httpMethod) {
				return addCachePreventQueryParameter(csrfRequestDataValueProcessor.processAction(request, action, httpMethod));
			}

			@Override
			public String processFormFieldValue(HttpServletRequest request, String name, String value, String type) {
				return csrfRequestDataValueProcessor.processFormFieldValue(request, name, value, type);
			}

			@Override
			public Map<String, String> getExtraHiddenFields(HttpServletRequest request) {
				return csrfRequestDataValueProcessor.getExtraHiddenFields(request);
			}

			@Override
			public String processUrl(HttpServletRequest request, String url) {
				return addCachePreventQueryParameter(csrfRequestDataValueProcessor.processUrl(request, url));
			}

			private String addCachePreventQueryParameter(String url) {
				return UriComponentsBuilder.fromUriString(url).queryParam("_s", System.currentTimeMillis()).build().encode()
						.toUriString();
			}
		};
	}
}
