package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.BaseUser;
import com.example.demo.mapper.BaseUserMapper;

@Service
public class BaseUserService {
@Autowired
private BaseUserMapper baseUserMapper;

public List<BaseUser> queryList(){
	return baseUserMapper.queryList();
	
}

}
