package com.example.demo.Service;

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
		LogIn l = lr.getLogin(user_id, password) ;
		if(l != null) {
			return l ;
		}
		return null ;
	}
	
	public int save(LogIn l)
	{
		int c = lr.checkLogin(l.getUser_id());
		if(c == 1) {
			return -1 ;
		}else {
			lr.saveTutor(l.getUser_id(),l.getPassword(),l.getRole(),l.getUser_name()) ;
			c = lr.getLogin(l.getUser_id(), l.getPassword()).getLogin_id() ;
		}
		return c;
	}
}
