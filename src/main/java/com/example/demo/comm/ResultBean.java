package com.example.demo.comm;

import java.io.Serializable;

public class ResultBean<T> implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final public static	String SUCCESS="ok";
	final public static String FAIL="fail";
	
	private  String type;
	private Integer code;
	private T data;
	private T message;
	private Integer count;
	private String msg;

	public ResultBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultBean(T message) {
		super();
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	public ResultBean(String type, T message) {
		super();
		// TODO Auto-generated constructor stub
		this.type = type;
		this.message = message;
	}

	public ResultBean(Integer code, Integer count, T data, String msg) {
		super();
		this.code = code;
		this.count = count;
		this.data = data;
		this.msg = msg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
