package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.LogIn;
import com.example.demo.Entities.Role;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface LoginRepo extends JpaRepository<LogIn, Integer> {
	
	@Query("SELECT l FROM LogIn l WHERE user_id=?1 and password=?2")
	public LogIn getLogin(String user_id,String password);
	
	@Query("SELECT COUNT(*) FROM LogIn l WHERE user_id=?1")
	public int check(String user_id);
	
//	@Modifying
//	@Query(value = "INSERT INTO LogIn (user_id, password, role, user_name) VALUES (:userId, :password, :role, :userName)", nativeQuery = true)
//	public int saveTutor(@Param("userId") String userId, @Param("password") String password, @Param("role") Role role, @Param("userName") String userName);
}