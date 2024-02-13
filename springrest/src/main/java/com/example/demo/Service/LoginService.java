package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.Role;
import com.example.demo.Repository.LoginRepo;

@Service
public class LoginService {
<<<<<<< HEAD
    
    @Autowired
    private LoginRepo loginRepo;
    
    public LogIn authenticate(String userId, String password) {
        return loginRepo.getLogin(userId, password);
    }
=======
	@Autowired
	LoginRepo lr;
	
	public LogIn getLoginConformation(String user_id , String password)
	{
		LogIn l = lr.getLogin(user_id, password) ;
		System.out.println(l);
		if(l != null) {
			return l ;
		}
		return null ;
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
>>>>>>> main
}
