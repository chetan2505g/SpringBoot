package com.chetan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControlller {

	@RequestMapping("/")
	public String jspController() {
		System.out.println("JSP controller started");
		return "home";
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "Hello";
	}
}
