package com.example.demo.Entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	String country;
	
	@Column
	String contact_no;
	
	@Column
	String state;
	
	@Column
	String city;
	
	@Column
	String aadhar_no;
	
	@Column
	Date dob;
	
	@Column
	int age;
	
	@Column
	String address;
	
	@Column
	String gender;
	
	@Column
	String password;
	
	@OneToOne
	@JoinColumn(name="login_id")
	LogIn login;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stu_id, String first_name, String last_name, String email, String country, String contact_no,
			String state, String city, String aadhar_no, Date dob, int age, String address, String gender,
			String password, LogIn login) {
		super();
		this.stu_id = stu_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.country = country;
		this.contact_no = contact_no;
		this.state = state;
		this.city = city;
		this.aadhar_no = aadhar_no;
		this.dob = dob;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.password = password;
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

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LogIn getLogin_id() {
		return login;
	}

	public void setLogin_id(LogIn login) {
		this.login = login;
	}
	
	
}
