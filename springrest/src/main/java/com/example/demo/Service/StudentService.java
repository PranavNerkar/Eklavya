package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entities.Student;
import com.example.demo.Entities.Category;
import com.example.demo.Entities.Course;
import com.example.demo.Entities.Feedback;
import com.example.demo.Entities.Tutor;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.FeedbackRepository;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Repository.TutorRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo; // Corrected variable name

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TutorRepo tutorRepository; // Corrected repository interface name

    @Autowired
    private FeedbackRepository feedbackRepository;

    public int save(Student s) {
        return studentRepo.save(s).getStu_id(); // Using studentRepo instead of sr
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<Tutor> getAllTutors() {
        return tutorRepository.findAll();
    }

    public List<Feedback> getAllFeedback() {
        // Implement logic to fetch feedback based on student's ID
        return feedbackRepository.findAll();
   }
}