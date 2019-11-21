package com.example.demo.bean;

import java.util.Date;

public class BaseUserToken {
	Integer id;
	Integer user_id;
	String token;
	Date login_time;
	Date time_out;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public Date getTime_out() {
		return time_out;
	}

	public void setTime_out(Date time_out) {
		this.time_out = time_out;
	}

	@Override
	public String toString() {
		return "BaseUserToken [id=" + id + ", user_id=" + user_id + ", token=" + token + ", login_time=" + login_time
				+ ", time_out=" + time_out + "]";
	}




}
