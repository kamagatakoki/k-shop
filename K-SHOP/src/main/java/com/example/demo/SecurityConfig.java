package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

/**
 * クラスの説明：
 * @author kamagata
 * @since 2018/01/29
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/** オーバーライドの説明：configure
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.WebSecurity)
	 * @author kamagata
	 * @since 2018/01/29
	 * @param web WebSecurity
	 * @throws Exception 例外
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/webjars/**", "/css/**", "/image/**", "/js/**", "/assets/**");
	}

	/** オーバーライドの説明：configure
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 * @author kamagata
	 * @since 2018/01/29
	 * @param http http
	 * @throws Exception 例外
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.sessionManagement()
				.sessionFixation()
				.none()
				.and()
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
				.and()
				.authorizeRequests()
				.antMatchers("/", "/shop/**", "/common/**").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginProcessingUrl("/login")
				.loginPage("/common/login")
				.failureUrl("/common/login?error")
				.defaultSuccessUrl("/", false)
				.usernameParameter("email").passwordParameter("password")
				.and()
				.logout()
				.logoutSuccessUrl("/");
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new Pbkdf2PasswordEncoder();
	}
}
