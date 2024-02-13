package com.example.demo;


public class TutorRegistration {

	private String first_name;
	private String last_name;
	private String email;
	private String contact_no ;
	private int age;
	private String gender;
	private String passward;
	private int sque_id;

	private int login_id;
	private String answer;
	
	public TutorRegistration() {
		// TODO Auto-generated constructor stub
	}
	

	public TutorRegistration(String first_name, String last_name, String email, String contact_no, int age,
			String gender, String passward, int sque_id, int login_id, String answer) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.contact_no = contact_no;
		this.age = age;
		this.gender = gender;
		this.passward = passward;
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

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public int getSque_id() {
		return sque_id;
	}

	public void setSque_id(int sque_id) {
		this.sque_id = sque_id;
	}

	public String getAnswer() {
		return answer;
	}
	
	public int getLogin_id() {
		return login_id;
	}
	
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "TutorRegistration [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", contact_no=" + contact_no + ", age=" + age + ", gender=" + gender + ", passward=" + passward
				+ ", sque_id=" + sque_id + ", login_id=" + login_id + ", answer=" + answer + "]";
	}
	
}
