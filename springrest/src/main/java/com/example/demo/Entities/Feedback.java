package com.example.demo.Entities;

import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name="feedback")
public class Feedback {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedback_id;

    @Column()
    private String comment;
    
    @Column()
    private double rating;

    @Column()
    private Date feedback_date;
    
    @ManyToOne
    @JoinColumn(name="stu_id")
    private Student student;
    
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name="tut_id", referencedColumnName="tut_id"),
        @JoinColumn(name="course_id", referencedColumnName="course_id")
    })
    private CourseTutor courseTutor;
    
    public Feedback() {
        // Default constructor
    }

	public Feedback(int feedback_id, String comment, double rating, Date feedback_date, Student student,
			CourseTutor courseTutor) {
		super();
		this.feedback_id = feedback_id;
		this.comment = comment;
		this.rating = rating;
		this.feedback_date = feedback_date;
		this.student = student;
		this.courseTutor = courseTutor;
	}

	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Date getFeedback_date() {
		return feedback_date;
	}

	public void setFeedback_date(Date feedback_date) {
		this.feedback_date = feedback_date;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public CourseTutor getCoursetutor() {
		return courseTutor;
	}

	public void setCoursetutor(CourseTutor coursetutor) {
		this.courseTutor = coursetutor;
	}
    
	
}