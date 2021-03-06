package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.BaseUserService;

@Controller
@ResponseBody
@RequestMapping("/user")
public class BaseUserController {
	@Autowired
	private  BaseUserService baseUserService;
	
	@RequestMapping("/login/{userid}/{username}")
	public String  getUser(@PathVariable("userid")String userid,@PathVariable("username")String username) {
		System.out.println(System.currentTimeMillis());
		baseUserService.queryList();
		System.out.println(userid);
		System.out.println(username);
		return "login";
	}

}
