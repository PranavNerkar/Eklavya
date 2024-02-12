package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.Role;
import com.example.demo.Service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@PostMapping("/login")	
	public LogIn getLogin(@RequestBody LogIn l) {
//		return "Success" ;
		return ls.getLoginConformation(l.getUser_id(), l.getPassword()) ;
	}
}