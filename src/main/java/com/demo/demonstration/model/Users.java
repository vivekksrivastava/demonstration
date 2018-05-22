package com.demo.demonstration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String userName;
	String password;
	String email;
	String role;
	int active;
	
	public Users(String userName, String password, String email, String role, int active) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.role = role;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + ", role="
				+ role + ", active=" + active + "]";
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
