package com.example.demo.Dto;

public class TutorDTO {
	 private int tutId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String contactNo;
	    private int age;
	    private String gender;
	    private String password;
	    private String aadharNo;
	    private String country;
	    private String state;
	    private String city;
	    private int experience;
	    private String aboutYou;
	    private int active;
	    private String securityQuestion;
	    private String answer;
	    private String loginUsername;
		public TutorDTO(int tutId, String firstName, String lastName, String email, String contactNo, int age,
				String gender, String password, String aadharNo, String country, String state, String city,
				int experience, String aboutYou, int active, String securityQuestion, String answer,
				String loginUsername) {
			super();
			this.tutId = tutId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.contactNo = contactNo;
			this.age = age;
			this.gender = gender;
			this.password = password;
			this.aadharNo = aadharNo;
			this.country = country;
			this.state = state;
			this.city = city;
			this.experience = experience;
			this.aboutYou = aboutYou;
			this.active = active;
			this.securityQuestion = securityQuestion;
			this.answer = answer;
			this.loginUsername = loginUsername;
		}
		public int getTutId() {
			return tutId;
		}
		public void setTutId(int tutId) {
			this.tutId = tutId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContactNo() {
			return contactNo;
		}
		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(String aadharNo) {
			this.aadharNo = aadharNo;
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
		public String getAboutYou() {
			return aboutYou;
		}
		public void setAboutYou(String aboutYou) {
			this.aboutYou = aboutYou;
		}
		public int getActive() {
			return active;
		}
		public void setActive(int active) {
			this.active = active;
		}
		public String getSecurityQuestion() {
			return securityQuestion;
		}
		public void setSecurityQuestion(String securityQuestion) {
			this.securityQuestion = securityQuestion;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public String getLoginUsername() {
			return loginUsername;
		}
		public void setLoginUsername(String loginUsername) {
			this.loginUsername = loginUsername;
		}
		@Override
		public String toString() {
			return "TutorDTO [tutId=" + tutId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
					+ email + ", contactNo=" + contactNo + ", age=" + age + ", gender=" + gender + ", password="
					+ password + ", aadharNo=" + aadharNo + ", country=" + country + ", state=" + state + ", city="
					+ city + ", experience=" + experience + ", aboutYou=" + aboutYou + ", active=" + active
					+ ", securityQuestion=" + securityQuestion + ", answer=" + answer + ", loginUsername="
					+ loginUsername + "]";
		}
		

	    
	    
	    
}

