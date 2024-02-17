package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Tutor;
import com.example.demo.Repository.TutorRepo;

@Service
public class TutorService {
	
	@Autowired
	TutorRepo tr;
	
	public Tutor save(Tutor t)
	{
		return tr.save(t) ;
	}
}
