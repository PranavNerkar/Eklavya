package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.LoginRequest;
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
		LogIn log = ls.getLoginConformation(l.getUser_id(), l.getPassword()) ;
		return log ;
	}
	
	@PostMapping("/userIdCheck")
	public int userIdCheck(@RequestBody LogIn l) {
//		return "Success" ;
		int ret = ls.check(l.getUser_id()) ;
		return ret ;
	}
	
	@PostMapping("/saveLogIn")
	public int saveLogin(@RequestBody LoginRequest lReq) {
		LogIn l = new LogIn(lReq.getUser_name(),lReq.getUser_id(),lReq.getPassword(),new Role(lReq.getRole_id())) ;
		int s = ls.save(l) ;
		return s ;
	}
}