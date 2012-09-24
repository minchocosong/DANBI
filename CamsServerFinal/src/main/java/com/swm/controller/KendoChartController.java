package com.swm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/data")
public class KendoChartController {
	
	@RequestMapping
	public String getPage() {
		return "charts/kendoTest";
	}
	
}
