package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Student;
import com.example.demo.Entities.Tutor;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer> {
	Student findByEmail(String email);
}
