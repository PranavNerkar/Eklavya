package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.LogIn;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface LoginRepo extends JpaRepository<LogIn, Integer> {
	
	@Query("SELECT l FROM LogIn l WHERE user_id=?1 and password=?2")
	public LogIn getLogin(String user_id,String password);
	
}
	