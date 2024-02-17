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
	String user_name;
	
	@Column
	String user_id ;
	
	@Column
	String password;

	@Column
	int flag;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	Role role ;
	
	public LogIn(String user_name ,String user_id, String password,int flag, Role role) {
		super();
		this.user_name = user_name;
		this.user_id = user_id;
		this.password = password;
		this.flag = flag;
		this.role = role;
	}
	
	public LogIn(String user_name ,String user_id, String password, Role role) {
		super();
		this.user_name = user_name;
		this.user_id = user_id;
		this.password = password;
		this.role = role;
	}
	
	public LogIn(String user_id) {
		super();
		this.user_id = user_id;
	}

	public LogIn(int login_id) {
		super();
		this.login_id = login_id;
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

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "LogIn [login_id=" + login_id + ", user_id=" + user_id + ", password=" + password + ", role=" + role
				+ ", user_name=" + user_name + "]";
	}
	
}
