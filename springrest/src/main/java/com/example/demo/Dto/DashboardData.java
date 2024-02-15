package com.example.demo.Dto;

import java.util.List;

import com.example.demo.Entities.Category;
import com.example.demo.Entities.Course;
import com.example.demo.Entities.Feedback;
import com.example.demo.Entities.Tutor;

public class DashboardData {
    private List<Category> categories;
    private List<Course> courses;
    private List<Tutor> tutors;
    private List<Feedback> feedback;

    public DashboardData(List<Category> categories, List<Course> courses, List<Tutor> tutors, List<Feedback> feedback) {
        this.categories = categories;
        this.courses = courses;
        this.tutors = tutors;
        this.feedback = feedback;
    }

    // Getters and setters for categories, courses, tutors, and feedback
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(List<Tutor> tutors) {
        this.tutors = tutors;
    }

    public List<Feedback> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<Feedback> feedback) {
        this.feedback = feedback;
    }
}
