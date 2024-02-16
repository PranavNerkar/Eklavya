package com.example.demo.Entities;

import java.util.Date;

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
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int stu_id;
	
	@Column
	String first_name;
	
	@Column
	String last_name;
	
	@Column
	String email;
	
	@Column
	String contact_no;
	
	@Column
	int age;
	
	@Column
	String gender;
	
	
	
	@Column
	String aadhar_no;
	
	@Column
	String country;
	
	@Column
	String state;
	
	@Column
	String city;

	@Column
	String stream;
	
	@Column
	String address;
	
	@Column
	int active;
	
	@Column
	Date dob;
	
	@ManyToOne
	@JoinColumn(name="sque_id")
	SecurityQuestion sq ;

	@Column
	String answer;
	
	@OneToOne
	@JoinColumn(name="login_id")
	LogIn login;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stu_id, String first_name, String last_name, String email, String contact_no, int age,
			String gender, String aadhar_no, String country, String state, String city, String stream,
			String address, int active, Date dob, SecurityQuestion sq, String answer, LogIn login) {
		super();
		this.stu_id = stu_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.age = age;
		this.gender = gender;
		
		this.aadhar_no = aadhar_no;
		this.country = country;
		this.state = state;
		this.city = city;
		this.stream = stream;
		this.address = address;
		this.active = active;
		this.dob = dob;
		this.sq = sq;
		this.answer = answer;
		this.login = login;
	}

	public Student(String first_name, String last_name, String email, String contact_no, int age, String gender,
			SecurityQuestion sq,String answer, LogIn login) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.age = age;
		this.gender = gender;
	
		this.sq = sq;
		this.answer = answer;
		this.login = login;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
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

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public LogIn getLogin() {
		return login;
	}

	public void setLogin(LogIn login) {
		this.login = login;
	}

}
