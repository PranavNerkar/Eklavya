package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Registration;
import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.SecurityQuestion;
import com.example.demo.Entities.Tutor;
import com.example.demo.Service.TutorService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TutorController {
	@Autowired
	TutorService ts;
	
	@PostMapping("/saveTutor")	
	public int register(@RequestBody Registration tr) {
		Tutor t = new Tutor(tr.getFirst_name(),tr.getLast_name(),tr.getEmail(),tr.getContact_no(),tr.getAge(),tr.getGender(),tr.getPassward(),new SecurityQuestion(tr.getSque_id()),tr.getAnswer(),new LogIn(tr.getLogin_id()));
		int ret = ts.save(t) ;
		return ret;
	}
}
