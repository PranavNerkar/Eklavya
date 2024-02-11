package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.Student;
import com.example.demo.Service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
    
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
