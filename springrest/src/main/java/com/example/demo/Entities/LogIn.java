package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class LogIn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int login_id;
	
	@Column
	String user_id ;
	
	@Column
	String password;
	
	@Column
	@ManyToOne
	@JoinColumn(name="role_id")
	Role role ;

	public LogIn(int login_id, String user_id, String password, Role role) {
		super();
		this.login_id = login_id;
		this.user_id = user_id;
		this.password = password;
		this.role = role;
	}
		
	public LogIn() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
