package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.Registration;
import com.example.demo.Entities.*;

import com.example.demo.Service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Integer> saveStudent(@RequestBody Registration r) {
        Student s = new Student(r.getFirst_name(),r.getLast_name(),r.getEmail(),r.getContact_no(),r.getAge(),r.getGender(),r.getPassward(),new SecurityQuestion(r.getSque_id()),r.getAnswer(),new LogIn(r.getLogin_id()));
        int studentId = studentService.save(s);
        return ResponseEntity.ok(studentId); // Return the student ID    
    }
    @GetMapping("/student/{studentId}/dashboard")
    public ResponseEntity<DashboardData> getDashboard(@PathVariable int studentId) {
        // Fetch dashboard data based on the student's ID
    	List<Course> allCourses = studentService.getAllCourses();
        List<Tutor> allTutors = studentService.getAllTutors();
        List<Category> allCategories = studentService.getAllCategories();
       
        List<Feedback> feedback = studentService.getAllFeedbackByStudentId(studentId);

        // Assemble the dashboard data into a DashboardData object
        DashboardData dashboardData = new DashboardData(allCategories, allCourses, allTutors, feedback);

        // Return the dashboard data in the response
        return ResponseEntity.ok(dashboardData);
    }
}
