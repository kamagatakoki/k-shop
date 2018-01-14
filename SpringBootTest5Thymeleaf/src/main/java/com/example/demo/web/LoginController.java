package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kamagata
 *
 */
@Controller
public class LoginController {
	@GetMapping(path = "loginForm")
	String loginForm() {
		return "loginForm";
	}
}
