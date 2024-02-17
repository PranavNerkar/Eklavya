package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Course;
import com.example.demo.Service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

	@Autowired
	CourseService cs;
	
	@PostMapping("/saveCourse")	
	public Course register(@RequestBody Course c) {
		return cs.save(c);
	}

}
