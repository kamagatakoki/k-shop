package com.example.sample.service.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * クラスの説明：非同期テストサービス
 * @author kamagata
 * @since 2018/02/26
 */
@Service
public class AsyncTestService {

	/**
	 * メソッドの説明：非同期出力
	 * @author kamagata
	 * @since 2018/02/26
	 * @param emitter エミッター
	 * @throws IOException IO例外
	 * @throws InterruptedException 割込例外
	 */
	@Async
	public void send(SseEmitter emitter) throws IOException, InterruptedException {

		List<String> aaa = new ArrayList<>();
		aaa.add("aaa");
		aaa.add("bbb");

		emitter.send(SseEmitter.event().name("ggg").data(aaa.toString()).id("1").data("Good Morning!"));
		TimeUnit.SECONDS.sleep(1);

		emitter.send(SseEmitter.event().data("Hello!"));
		TimeUnit.SECONDS.sleep(1);

		emitter.send(SseEmitter.event().data("Good Night!"));
		TimeUnit.SECONDS.sleep(1);

		emitter.complete();

	}
}
