package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="securty_que")
public class SecurityQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int sque_id;
	
	@Column
	String securty_que;
	
	public SecurityQuestion() {
		// TODO Auto-generated constructor stub
	}

	public SecurityQuestion(int sque_id) {
		super();
		this.sque_id = sque_id;
	}

	public int getSque_id() {
		return sque_id;
	}

	public void setSque_id(int sque_id) {
		this.sque_id = sque_id;
	}

	public String getSecurty_que() {
		return securty_que;
	}

	public void setSecurty_que(String securty_que) {
		this.securty_que = securty_que;
	}
}
