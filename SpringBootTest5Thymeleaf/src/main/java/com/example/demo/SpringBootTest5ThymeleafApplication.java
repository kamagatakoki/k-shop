package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

/**
 * @author kamagata
 *
 */
@SpringBootApplication
public class SpringBootTest5ThymeleafApplication {

	/**
	 * @param args a
	 */
	public static void main(String[] args) {
		System.out.printf("パス" + new Pbkdf2PasswordEncoder().encode("test").toString());
		SpringApplication.run(SpringBootTest5ThymeleafApplication.class, args);
	}
}
