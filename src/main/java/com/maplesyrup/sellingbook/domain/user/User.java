package com.maplesyrup.sellingbook.domain.user;

public class User {

	private int user_id;
	private String user_email;
	private String user_password;
	private String user_nickname;
	
	public User() {
		System.out.println(this.getClass());
	}

	public User(int user_id, String user_email, String user_password, String user_nickname) {
		this.user_id = user_id;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_nickname = user_nickname;
	}

	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_email=" + user_email + ", user_password=" + user_password
				+ ", user_nickname=" + user_nickname + "]";
	}
	
}
