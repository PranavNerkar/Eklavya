package com.example.demo.Repository;

import com.example.demo.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // No need to define findAllByStudentId() method
}