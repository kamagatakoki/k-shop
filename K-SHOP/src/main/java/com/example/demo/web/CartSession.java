package com.example.demo.web;

import java.io.Serializable;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

/**
 * クラスの説明：セッションで管理するカート情報クラス
 * @author kamagata
 * @since 2018/02/04
 */
@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Data
public class CartSession implements Serializable {

	private Integer cartHeadCd;
}
