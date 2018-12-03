package com.sqq.model;

public class User extends BaseModel {
	private Integer id;

	private String username;

	private String userpassword;

	private String account;

	public User(Integer id, String username, String userpassword, String account) {
		this.id = id;
		this.username = username;
		this.userpassword = userpassword;
		this.account = account;
	}

	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword == null ? null : userpassword.trim();
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account == null ? null : account.trim();
	}
}