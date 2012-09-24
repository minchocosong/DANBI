package com.swm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.swm.domain.RealGroup;
import com.swm.domain.RealUser;
import com.swm.domain.Role;
import com.swm.service.RealUserService;

@Controller
@RequestMapping("/account")
public class CreateAccountController {
	
	@Autowired
	private RealUserService userService;
	
	@RequestMapping(value="/user" , method = RequestMethod.GET)
	public String userForm() {
		return "account/realUserCreationForm";
	}

	@RequestMapping(value="/group" , method = RequestMethod.GET)
	public String groupForm() {
		return "account/realGroupCreationForm";
	}
	
	@RequestMapping(value="/userCreate" , method = RequestMethod.POST)
	public @ResponseBody RealUser create(
			@RequestParam String userId,
			@RequestParam String userName,
			@RequestParam String passwd,
			@RequestParam String email,
			@RequestParam String introduction,
			@RequestParam String image,
			@RequestParam Integer group,
			@RequestParam Integer role){
		
		Role newRole = new Role();
		newRole.setRole(role);
		
		RealGroup newGroup = new RealGroup();
		newGroup.setGroup(group);
		
		RealUser newUser = new RealUser();
		newUser.setUserName(userName);
		newUser.setPasswd(passwd);
		newUser.setEmail(email);
		newUser.setImage(image);
		newUser.setRole(newRole);
		newUser.setGroup(newGroup);
		System.out.println("Create Real User ! ");
		return userService.create(newUser);
	}
	
	/*
	@ModelAttribute("command")
	@RequestMapping("/userCreate")
	public RealUser userFormBacking(HttpServletRequest request) {
		return new RealUser();
	}
	
	@ModelAttribute("command")
	@RequestMapping("/groupCreate")
	public RealGroup groupFormBacking(HttpServletRequest request) {
		return new RealGroup();
	}
	
	@RequestMapping(value="/userCreate" , method = RequestMethod.GET)
	public String userForm() {
		return "account/realUserCreationForm";
	}

	@RequestMapping(value="/groupCreate" , method = RequestMethod.GET)
	public String groupForm() {
		return "account/realGroupCreationForm";
	}
	
	@RequestMapping(value="/userCreate" , method = RequestMethod.POST)
	public String submit(@ModelAttribute("command") RealUser user,
			BindingResult result) {
		new UserValidator().validate(user, result);
		if (result.hasErrors()) {
			return "account/realUserCreationForm";
		}
		return "account/userCreated";
	}
	@RequestMapping(value="/groupCreate" , method = RequestMethod.POST)
	public String submit(@ModelAttribute("command") RealGroup group,
			BindingResult result) {
		new GroupValidator().validate(group, result);
		if (result.hasErrors()) {
			return "account/realGroupCreationForm";
		}
		return "account/groupCreated";
	}
*/
}