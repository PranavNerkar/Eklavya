package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.Role;
import com.example.demo.Entities.Tutor;
import com.example.demo.Service.LoginService;
import com.example.demo.Service.TutorService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TutorController {
	@Autowired
	TutorService ts;
	
	@Autowired
	LoginService ls;
	
	@PostMapping("/tutor_register")	
	public int register(@RequestBody Tutor t) {
		LogIn l = new LogIn(t.getEmail(),t.getPassward(),new Role(2),t.getFirst_name()) ;
		int res = ls.save(l);
		if(res == -1 ) {
			return res ;
		}else {
			t.setLogin(l) ;
		}
		return ts.save(t) ;
	}
}
