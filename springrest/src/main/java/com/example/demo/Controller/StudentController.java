package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Registration;
import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.SecurityQuestion;
import com.example.demo.Entities.Student;
import com.example.demo.Service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping("/saveStudent")
	public int savePatient(@RequestBody Registration r) {
		Student s = new Student(r.getFirst_name(),r.getLast_name(),r.getEmail(),r.getContact_no(),r.getAge(),r.getGender(),new SecurityQuestion(r.getSque_id()),r.getAnswer(),new LogIn(r.getLogin_id()));
		int ret = ss.save(s) ;
		return ret;
	}
}
