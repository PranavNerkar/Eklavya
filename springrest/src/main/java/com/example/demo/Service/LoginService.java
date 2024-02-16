package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.Role;
import com.example.demo.Repository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	LoginRepo lr;
	
	public LogIn getLoginConformation(String user_id , String password)
	{
		LogIn l ;
		Optional<LogIn> ol = lr.getLogin(user_id, password) ;
		try {
			l = ol.get();
		}catch(Exception e) {
			l = null ;
		}
		return l ;
		
	}
	
	public int check(String s)
	{
		int ret = lr.check(s) ;
		return ret ;
	}
	
	public int save(LogIn l)
	{
		LogIn lo = lr.save(l) ;
		return lo.getLogin_id();
	}
}
