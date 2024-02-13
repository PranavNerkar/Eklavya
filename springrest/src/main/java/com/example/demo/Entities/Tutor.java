package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	String contact_no ;
	
	@Column
	int age;
	
	@Column
	String gender;
	
	@Column
	String passward;
	
	@Column
	String aadhar_no;
	
	@Column
	String country;
	
	@Column
	String State ;
	
	@Column
	String city;
	
	@Column
	int experience;
	
	@Column
	String about_you;

	@ManyToOne
	@JoinColumn(name="sque_id")
	SecurityQuestion sq ;
	
	@Column
<<<<<<< HEAD
	String password;
=======
	String answer;
>>>>>>> main
	
	@OneToOne
	@JoinColumn(name="login_id")
	LogIn login;
	

	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutor(int tut_id, String first_name, String last_name, String email, String contact_no, int age,
			String gender, String passward, String aadhar_no, String country, String state, String city, int experience,
			String about_you, SecurityQuestion sq, String answer, LogIn login) {
		super();
		this.tut_id = tut_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.age = age;
		this.gender = gender;
		this.passward = passward;
		this.aadhar_no = aadhar_no;
		this.country = country;
		State = state;
		this.city = city;
		this.experience = experience;
<<<<<<< HEAD
		this.age = age;
		this.password = password;
=======
		this.about_you = about_you;
		this.sq = sq;
		this.answer = answer;
>>>>>>> main
		this.login = login;
	}

	public Tutor(String first_name, String last_name, String email, String contact_no, int age, String gender,
			String passward, SecurityQuestion sq, String answer,LogIn login) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.age = age;
		this.gender = gender;
		this.passward = passward;
		this.sq = sq;
		this.login = login ;
		this.answer = answer;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getAbout_you() {
		return about_you;
	}

	public void setAbout_you(String about_you) {
		this.about_you = about_you;
	}

	public SecurityQuestion getSq() {
		return sq;
	}

	public void setSq(SecurityQuestion sq) {
		this.sq = sq;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LogIn getLogin() {
		return login;
	}

	public void setLogin(LogIn login) {
		this.login = login;
	}	
	
}
