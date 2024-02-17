package com.example.demo.Dto;

public class CourseDTO {

    private int courseId;
    private String courseTitle;
    private String courseDescription;
    private Boolean courseActive;
    private int categoryId;
    
    public CourseDTO() {
        // Default constructor
    }

    public CourseDTO(String courseTitle, String courseDescription, int categoryId) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.categoryId = categoryId;
    }

    // Getters and setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "CourseDTO [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseDescription=" + courseDescription + ", courseActive=" + courseActive + ", categoryId=" + categoryId + "]";
    }
}
