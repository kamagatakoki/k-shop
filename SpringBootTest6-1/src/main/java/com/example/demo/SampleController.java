package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kamagata
 *
 */
@Controller
public class SampleController {
	/**
	 * @return a
	 */
	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "Hello Spring Boota!!";
	}

}