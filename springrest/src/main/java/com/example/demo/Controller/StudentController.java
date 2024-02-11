package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public ResponseEntity<?> registerStudent(@RequestBody Student student) {
        Student registeredStudent = studentService.registerStudent(student);
        if (registeredStudent != null) {
            return ResponseEntity.ok("Student registration successful");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to register student");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginStudent(@RequestParam String email, @RequestParam String password) {
        Student student = studentService.authenticateStudent(email, password);
        if (student != null) {
            return ResponseEntity.ok("Student login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
