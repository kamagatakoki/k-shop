package com.example.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

/**
 * クラスの説明：Spring Security Config
 * @author kamagata
 * @since 2018/02/24
 */
@EnableWebSecurity
@Import({ WebMvcConfig.class }) // UserDetailsServiceを先にDIコンテナに登録させる
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService userDetailsService;

	/**
	 * メソッドの説明：DaoAuthenticationProviderを有効化
	 * @author kamagata
	 * @since 2018/02/25
	 * @param auth 権限
	 * @throws Exception 例外
	 */
	@Autowired
	void configureAuthenticationManager(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	/**
	 * メソッドの説明：パスワード暗号化方式(PBKDF2)
	 * @author kamagata
	 * @since 2018/02/25
	 * @return PasswordEncoder
	 */
	@Bean
	PasswordEncoder passwordEncoder() {
		return new Pbkdf2PasswordEncoder();
	}

	/** オーバーライドの説明：configure
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.WebSecurity)
	 * @author kamagata
	 * @since 2018/02/24
	 * @param web WebSecurity
	 * @throws Exception 例外
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	/** オーバーライドの説明：configure
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 * @author kamagata
	 * @since 2018/02/24
	 * @param http http
	 * @throws Exception 例外
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//*********** jspのinputを"form:"にする *************

		// ログイン制御
		http.formLogin()
				.loginPage("/login").permitAll() // 自作ログインページの場合は必須
				.usernameParameter("email") // デフォルト(username)以外の画面項目名の場合に指定
				//.passwordParameter("password") // デフォルト(password)以外の画面項目名の場合に指定
				//.loginProcessingUrl("/login") // デフォルト(/login)以外のaction属性の値の場合に指定
				//.failureUrl("/login") // デフォルト(/login?error)以外に遷移させたい場合に指定
				.defaultSuccessUrl("/maintenance"); // デフォルト(/)以外に遷移させたい場合に指定

		// 認可制御
		http.authorizeRequests()
				.antMatchers("/maintenance/").permitAll() // 除外対象がある場合は指定
				.antMatchers("/maintenance/**").hasRole("ADMIN") // ADMIN権限を保持しているユーザーのみmaintenance配下にアクセス可能
				.anyRequest().authenticated(); // 全てのリクエストで認可チェックの対象

		// ログアウト制御
		http.logout()
				.logoutSuccessUrl("/maintenance")
				.permitAll();
	}

}
