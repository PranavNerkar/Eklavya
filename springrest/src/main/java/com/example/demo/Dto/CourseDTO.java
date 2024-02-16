package com.example.demo.Dto;

public class CourseDTO {

    private Long courseId;
    private String courseTitle;
    private String courseDescription;
    private Boolean courseActive;
    private Long categoryId;
    
    public CourseDTO() {
        // Default constructor
    }

    public CourseDTO(Long courseId, String courseTitle, String courseDescription, Boolean courseActive, Long categoryId) {
        this.courseId = courseId;
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
        return "CourseDTO [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseDescription=" + courseDescription + ", courseActive=" + courseActive + ", categoryId=" + categoryId + "]";
    }
}
