package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.LogIn;
import com.example.demo.Repository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	LoginRepo lr;
	
	public LogIn getLoginConformation(String user_id , String password)
	{
		LogIn l = lr.getLogin(user_id, password) ;
		if(l != null) {
			return l ;
		}
		return null ;
	}
}
