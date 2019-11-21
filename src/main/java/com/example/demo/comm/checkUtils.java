package com.example.demo.comm;

public class checkUtils {
	public static  boolean isNull(String str) {
		if(null==str||"".equals(str)) {
			return true;
		}
		return false;
	}

}
