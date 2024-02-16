package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "your_table_name") 
public class Course {

    @Id
    @Column(name = "course_id") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "course_title")
    private String courseTitle;

    @Column(name = "course_description") 
    private String courseDescription;

    @Column(name = "course_active") 
    private Boolean courseActive;

    @Column(name = "category_id") 
    private Long categoryId;

  
    public Course() {
        
    }

    public Course(String courseTitle, String courseDescription, Boolean courseActive, Long categoryId) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseActive = courseActive;
        this.categoryId = categoryId;
    }

    // Getters and setters
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Boolean getCourseActive() {
        return courseActive;
    }

    public void setCourseActive(Boolean courseActive) {
        this.courseActive = courseActive;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseDescription=" + courseDescription + ", courseActive=" + courseActive + ", categoryId=" + categoryId + "]";
    }
}
