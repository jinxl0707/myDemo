package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.comm.ResultBean;
import com.example.demo.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginservice;
	
	@RequestMapping("/")
	public String index() {
		return  "/admin/login";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public ResultBean<String>  login(String userName,String pwd,String verificationCode) {
		return loginservice.dologin(userName,pwd,verificationCode);
	}
	
}
