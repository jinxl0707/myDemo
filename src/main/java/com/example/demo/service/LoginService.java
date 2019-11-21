package com.example.demo.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.BaseUser;
import com.example.demo.comm.ResultBean;
import com.example.demo.comm.checkUtils;
import com.example.demo.mapper.BaseUserMapper;

@Service
public class LoginService {
	@Autowired
	HttpSession session;
	@Resource
	BaseUserMapper baseUserMapper;
	public ResultBean<String> dologin(String userName, String pwd, String verificationCode) {
		// TODO Auto-generated method stub
		if(checkUtils.isNull(userName)) {
			return new ResultBean<String>(ResultBean.FAIL,"账号不能为空");
		}
		if(checkUtils.isNull(pwd)) {
			return new ResultBean<String>(ResultBean.FAIL,"密码不能为空");
		}
		if(checkUtils.isNull(verificationCode)) {
			return new ResultBean<String>(ResultBean.FAIL,"验证码不能为空");
		}
		
		BaseUser   baseUser=baseUserMapper.getUser(userName, pwd);
		if(baseUser==null) {
			return new ResultBean<String>(ResultBean.FAIL,"用户不存在！");
		}
		System.out.println(userName+"====>"+pwd+"====>"+verificationCode);
		return new ResultBean<String>(ResultBean.SUCCESS,"登陆成功！");
	}
}
