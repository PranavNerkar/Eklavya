package com.example.demo.Entities;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "course") 
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;

    @Column()
    private String course_title;

    @Column() 
    private String course_description;

    @Column()
    private int course_active;

    @ManyToOne()
	@JoinColumn(name="category_id")
    private Category category;
    
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(name="course_tutor",
    			joinColumns = @JoinColumn(name="course_id") ,
    			inverseJoinColumns = @JoinColumn(name="tut_id")
    )
    private Set<Tutor> tutors ;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String course_title, String course_description, int course_active, Category category,
			Set<Tutor> tutors) {
		super();
		this.course_title = course_title;
		this.course_description = course_description;
		this.course_active = course_active;
		this.category = category;
		this.tutors = tutors;
	}

	public Course(String course_title) {
		super();
		this.course_title = course_title;
	}

	public Course(int course_id) {
		super();
		this.course_id = course_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_title() {
		return course_title;
	}

	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public int getCourse_active() {
		return course_active;
	}

	public void setCourse_active(int course_active) {
		this.course_active = course_active;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Tutor> getTutors() {
		return tutors;
	}

	public void setTutors(Set<Tutor> tutors) {
		this.tutors = tutors;
	}
}
