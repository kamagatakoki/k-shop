package com.example.sample.controller.common;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.example.sample.service.common.AsyncTestService;

/**
 * クラスの説明：非同期テストコントローラー
 * @author kamagata
 * @since 2018/02/26
 */
@Controller
@RequestMapping("/async")
public class AsyncTestController {

	@Autowired
	AsyncTestService asyncTestService;

	/**
	 * メソッドの説明：非同期テスト
	 * @author kamagata
	 * @since 2018/02/26
	 * @return SseEmitter エミッター
	 * @throws IOException IO例外
	 * @throws InterruptedException 割込例外
	 */
	@GetMapping
	public SseEmitter greeting() throws IOException, InterruptedException {
		SseEmitter emitter = new SseEmitter();
		asyncTestService.send(emitter);

		return emitter;
	}

}
