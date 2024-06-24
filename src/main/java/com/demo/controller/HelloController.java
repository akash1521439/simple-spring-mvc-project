package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	public ModelAndView getHello() {
		String message = "Hello From Akash";
		return new ModelAndView("hello","simpleMsg",message);
	}
}
