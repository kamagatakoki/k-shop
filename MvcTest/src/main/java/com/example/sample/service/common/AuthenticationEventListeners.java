package com.example.sample.service.common;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationFailureExpiredEvent;
import org.springframework.security.authentication.event.AuthenticationFailureServiceExceptionEvent;
import org.springframework.stereotype.Component;

/**
 * クラスの説明：
 * @author kamagata
 * @since 2018/02/25
 */
@Component
public class AuthenticationEventListeners {

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/02/25
	 * @param event a
	 */
	@EventListener
	public void handleBadCredentials(AuthenticationFailureBadCredentialsEvent event) {
		System.out.println("aaa");
	}

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/02/25
	 * @param event a
	 */
	@EventListener
	public void handleBadExpired(AuthenticationFailureExpiredEvent event) {
		System.out.println("bbb");
	}

	/**
	 * メソッドの説明：
	 * @author kamagata
	 * @since 2018/02/25
	 * @param event a
	 */
	@EventListener
	public void handleBadFailure(AuthenticationEventListeners event) {
		System.out.println("ccc");
	}

	@EventListener
	public void handleBadService(AuthenticationFailureServiceExceptionEvent event) {
		System.out.println("ddd");
	}
}
