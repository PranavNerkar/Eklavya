package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Course;
import com.example.demo.Repository.CourseRepo;

@Service
public class CourseService {

	@Autowired
	CourseRepo cr;

	public Course save(Course c)
	{
		return cr.save(c) ;
	}
}
