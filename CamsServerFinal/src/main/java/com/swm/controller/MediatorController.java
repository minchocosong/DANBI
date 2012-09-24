package com.swm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MediatorController {

	@RequestMapping
	public String getHomePage() {
		return "redirect:/index";
	}
	
	@RequestMapping("index")
	public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping("main")
	public String getMainPage() {
		return "main/main";
	}
}
