package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="course_tutor")
public class CourseTutor {
	 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coursetutor_id")
    private int coursetutorId;
	
	 @ManyToOne
	 @JoinColumn(name="course_id")
	 private Course course;
	 
	 @ManyToOne
	 @JoinColumn(name="tut_id")
	 private Tutor tutor;

	 @Column()
	 private double course_price;

	 @Column() 
	 private double course_duration;

	 @Column()
	 private String other_course_details;

	 @Column()
	 private int flag;
	
	 public CourseTutor() {
		// TODO Auto-generated constructor stub
	 }
}
