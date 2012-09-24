package com.swm.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swm.command.LoginCommand;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	 private String formViewName = "login/form";
		
		@RequestMapping(method = RequestMethod.GET)
		public String form() {
			return formViewName;
		}

		@ModelAttribute
		public LoginCommand formBacking() {
			return new LoginCommand();
		}

		@RequestMapping(method = RequestMethod.POST)
		public String submit(@Valid LoginCommand loginCommand, 
				BindingResult result) {
			if (result.hasErrors()) {
				return formViewName;
			}
				return "/main";
		}


}
