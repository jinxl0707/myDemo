package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.bean.BaseUser;

@Mapper
public interface BaseUserMapper {
	List<BaseUser> queryList();
	BaseUser getUser(@Param("userName")String userName,@Param("pwd")String pwd);
}
