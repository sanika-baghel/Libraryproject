package com.bookStore.entity;

//import javax.persistence.Entity;

//@Entity
public class UserRegistration {

	
	
	private String userId;
	private String userName;
	private String userPassword;
	private String userConfirmPassword;
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}
	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}
	
	
	
}
