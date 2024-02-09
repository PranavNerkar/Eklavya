package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Tutor;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface TutorRepo extends JpaRepository<Tutor, Integer> {
//	@Modifying
//	@Query("update Patient set contact = ?2 where pid =?1")
//	public int updateContact(int pid,String contact);
}
