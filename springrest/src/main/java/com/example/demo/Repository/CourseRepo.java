package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Course;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
