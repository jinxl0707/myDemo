package com.example.demo.bean;


public class BaseUser {
	private Integer id;
	private String account;
	private String user_name;
	private String phone;
	private String email;
	private String login_pwd;
	private String pay_pwd;
	private String user_logo;
	private String parent_id;
	private String invite_code;
	private Integer status	;
	private Integer is_auth;
	private String nickname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin_pwd() {
		return login_pwd;
	}
	public void setLogin_pwd(String login_pwd) {
		this.login_pwd = login_pwd;
	}
	public String getPay_pwd() {
		return pay_pwd;
	}
	public void setPay_pwd(String pay_pwd) {
		this.pay_pwd = pay_pwd;
	}
	public String getUser_logo() {
		return user_logo;
	}
	public void setUser_logo(String user_logo) {
		this.user_logo = user_logo;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getInvite_code() {
		return invite_code;
	}
	public void setInvite_code(String invite_code) {
		this.invite_code = invite_code;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIs_auth() {
		return is_auth;
	}
	public void setIs_auth(Integer is_auth) {
		this.is_auth = is_auth;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "BaseUser [id=" + id + ", account=" + account + ", user_name=" + user_name + ", phone=" + phone
				+ ", email=" + email + ", login_pwd=" + login_pwd + ", pay_pwd=" + pay_pwd + ", user_logo=" + user_logo
				+ ", parent_id=" + parent_id + ", invite_code=" + invite_code + ", status=" + status + ", is_auth="
				+ is_auth + ", nickname=" + nickname + "]";
	}




}
