package com.example.demo;

public class StudentRegistraion {

    private String first_name;
    private String last_name;
    private String email;
    private String contact_no;
    private String country;
    private String state;
    private String city;
    private String aadhar_no;
  
    private int age;
    private String address;
    private String gender;
    private String password;
    private int sque_id;
    private int login_id;
    private String answer;
    
    public StudentRegistraion() {
		super();
	}
    
	public StudentRegistraion(String first_name, String last_name, String email, String contact_no, String country,
			String state, String city, String aadhar_no, int age, String address, String gender, String password,
			int sque_id, int login_id, String answer) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.country = country;
		this.state = state;
		this.city = city;
		this.aadhar_no = aadhar_no;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.sque_id = sque_id;
		this.login_id = login_id;
		this.answer = answer;
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
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
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
	public int getSque_id() {
		return sque_id;
	}
	public void setSque_id(int sque_id) {
		this.sque_id = sque_id;
	}
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
    
    
    
}

