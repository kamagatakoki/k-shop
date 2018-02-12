package com.example.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * クラスの説明：Webアプリ用コンフィギュレーション
 * @author kamagata
 * @since 2018/02/08
 */
@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

}
