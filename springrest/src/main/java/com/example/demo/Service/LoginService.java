package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.LogIn;
import com.example.demo.Repository.LoginRepo;

@Service
public class LoginService {
    
    @Autowired
    private LoginRepo loginRepo;
    
    public LogIn authenticate(String userId, String password) {
        return loginRepo.getLogin(userId, password);
    }
}
