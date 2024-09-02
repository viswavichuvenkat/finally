package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
public class DemoController {
	@GetMapping ("/welcome")
	public String welcome() {
		return "welcome";
	}
	@GetMapping ("/hello")
	public String hwllo() {
		return "hello";
	}
	@GetMapping ("/greeeting")
	public String greetings() {
		return "greeting";
	}

}
