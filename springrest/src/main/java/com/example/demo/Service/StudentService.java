package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepository;

    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    public Student registerStudent(Student student) {
        // Additional validation logic can be added here
        return studentRepository.save(student);
    }

    public Student authenticateStudent(String email, String password) {
        Student student = findByEmail(email);
        if (student != null && student.getPassword().equals(password)) {
            return student;
        }
        return null;
    }
}