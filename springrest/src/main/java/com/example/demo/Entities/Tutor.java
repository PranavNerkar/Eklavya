package com.example.demo.Entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	String aadhar_no;
	
	@Column
	String country;
	
	@Column
	String state ;
	
	@Column
	String city;
	
	@Column
	int experience;
	
	@Column
	String about_you;

	@Column
	int active;
	
	@Column
	String answer;
	
	@ManyToOne
	@JoinColumn(name="sque_id")
	SecurityQuestion sq ;
	
	@OneToOne
	@JoinColumn(name="login_id")
	LogIn login;

	@ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name="course_tutor",
    			joinColumns = @JoinColumn(name="tut_id") ,
    			inverseJoinColumns = @JoinColumn(name="course_id")
    )
    private Set<Course> courses ;
	
	public Tutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tutor(int tut_id, String first_name, String last_name, String email, String contact_no, int age,
			String gender, String aadhar_no, String country, String state, String city, int experience,
			String about_you, int active, String answer, SecurityQuestion sq, LogIn login, Set<Course> courses) {
		super();
		this.tut_id = tut_id;
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
		this.experience = experience;
		this.about_you = about_you;
		this.active = active;
		this.answer = answer;
		this.sq = sq;
		this.login = login;
		this.courses = courses;
	}

	public Tutor(String first_name, String last_name, String email, String contact_no, int age, String gender,
			 SecurityQuestion sq, String answer, LogIn login) {
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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
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

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Tutor [tut_id=" + tut_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", contact_no=" + contact_no + ", age=" + age + ", gender=" + gender + ", passward="
				+ ", aadhar_no=" + aadhar_no + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", experience=" + experience + ", about_you=" + about_you + ", active=" + active + ", sq=" + sq
				+ ", answer=" + answer + ", login=" + login + "]";
	}
	
}
