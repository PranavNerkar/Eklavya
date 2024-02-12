package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Tutor;
import com.example.demo.Repository.TutorRepo;

@Service
public class TutorService {
	
	@Autowired
	TutorRepo tr;
	
	public int save(Tutor t)
	{
		Tutor tu = tr.save(t) ;
		return tu.getTut_id();
	}
}
