package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.BaseUser;

@Mapper
public interface BaseUserMapper {
	List<BaseUser> queryList();
}
