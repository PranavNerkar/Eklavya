package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Tutor;

public interface TutorRepo extends JpaRepository<Tutor, Integer> {
    Tutor findByEmail(String email);
}