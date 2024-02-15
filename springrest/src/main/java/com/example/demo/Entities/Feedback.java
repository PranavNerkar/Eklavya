package com.example.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;



import jakarta.persistence.*;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Long courseId;

    private int rating;

    private String comments;
    
    
    
	public Feedback() {
		super();
	}

	public Feedback(Long id, Long studentId, Long courseId, int rating, String comments) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.courseId = courseId;
		this.rating = rating;
		this.comments = comments;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
