package com.swm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {

	@RequestMapping("/main")
	public String form(){
		return "main/main";
	}
	
	@RequestMapping("/window")
	public String formtest3(){
		return "main/chartwindows";
	}
	
	@RequestMapping("/list")
	public String formtest4(){
		return "main/dataList";
	}
	
	@RequestMapping("/admin")
	public String formtest5(){
		return "main/admin";
	}
	
	@RequestMapping("/record")
	public String formtest6(){
		return "main/record";
	}
}
