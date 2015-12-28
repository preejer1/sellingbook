package com.maplesyrup.sellingbook.domain.user;

public class User {

	private String user_email;
	private String user_password;
	private String user_nickname;
	
	public User() {
	
	}

	public User(String user_email, String user_password, String user_nickname) {
		super();
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_nickname = user_nickname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	
	
	
}
