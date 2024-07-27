package com.railway.models;

public class User {
	
	private String id;
	private String username;
	private String password;
	private String email;
	private String mobile_number;
	private String aadhar;
	
	public String getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", mobile_number=" + mobile_number + ", aadhar=" + aadhar + "]";
	}
	

}
