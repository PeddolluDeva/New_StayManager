package com.akshay.StayManager.response;

import lombok.Data;

@Data
public class AuthResponse {
	
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String jwt;
	private String message;
//	public void setJwt(String jwt2) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void setMessage(String string) {
//		// TODO Auto-generated method stub
//		
//	}
}
