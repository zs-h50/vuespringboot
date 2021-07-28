package com.example.demo.pojo;

public class User {
	private Long id;
	private String account;
	private String password;
	private String identity;
	
	public User() {}
	
	public User(Long id, String account, String password, String identity) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.identity = identity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + ", identity=" + identity + "]";
	}
	
	
}
