package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tutor")
public class Tutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int tut_id;
	
	@Column
	String first_name;
	
	@Column
	String last_name;
	
	@Column
	String email;
	
	@Column
	String country;
	
	@Column
	String contact_no ;
	
	@Column
	String State ;
	
	@Column
	String city;
	
	@Column
	String experience;
	
	@Column
	int age;
	
	@Column
	String passward;
	
	@OneToOne
	@JoinColumn(name="login_id")
	LogIn login;

	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutor(int tut_id, String first_name, String last_name, String email, String country, String contact_no,
			String state, String city, String experience, int age, String passward, LogIn login) {
		super();
		this.tut_id = tut_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.country = country;
		this.contact_no = contact_no;
		State = state;
		this.city = city;
		this.experience = experience;
		this.age = age;
		this.passward = passward;
		this.login = login;
	}

	public int getTut_id() {
		return tut_id;
	}

	public void setTut_id(int tut_id) {
		this.tut_id = tut_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public LogIn getLogin() {
		return login;
	}

	public void setLogin(LogIn login) {
		this.login = login;
	}
	
	
}
