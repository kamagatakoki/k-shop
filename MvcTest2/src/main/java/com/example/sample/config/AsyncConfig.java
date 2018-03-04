package com.example.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * クラスの説明：非同期コンフィグ
 * @author kamagata
 * @since 2018/02/26
 */
@Configuration
@EnableAsync // @Asyncの利用を有効化
public class AsyncConfig {

	/**
	 * メソッドの説明：@Asyncが使用するスレッド(TaskExecutor)のカスタマイズ
	 * @author kamagata
	 * @since 2018/02/26
	 * @return TaskExecutor スレッド
	 */
	@Bean
	public TaskExecutor taskExecutor() {

		// スレッドプールを利用するようにカスタマイズ
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor(); // TaskExecutorの実装クラス
		executor.setCorePoolSize(5);
		executor.setMaxPoolSize(5);
		executor.setQueueCapacity(25);

		return executor;
	}
}
