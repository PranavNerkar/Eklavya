package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
=======
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> main
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.LoginRequest;
import com.example.demo.Entities.LogIn;
<<<<<<< HEAD
import com.example.demo.Entities.Student;
=======
import com.example.demo.Entities.Role;
>>>>>>> main
import com.example.demo.Service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
<<<<<<< HEAD
    
    @Autowired
    private LoginService loginService;
    
    @PostMapping("/login")  
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
        LogIn student = loginService.authenticate(email, password);
        if (student != null) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
=======
	
	@Autowired
	LoginService ls;
	
	@PostMapping("/login")	
	public LogIn getLogin(@RequestBody LogIn l) {
//		return "Success" ;
		LogIn log = ls.getLoginConformation(l.getUser_id(), l.getPassword()) ;
		if(log == null) {
			log = new LogIn(-1) ;
		}
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
>>>>>>> main
