package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD

import com.example.demo.Entities.Tutor;
import com.example.demo.Repository.TutorRepo;

@Service
public class TutorService {

    @Autowired
    private TutorRepo tutorRepository;

    public Tutor findByEmail(String email) {
        return tutorRepository.findByEmail(email);
    }

    public Tutor registerTutor(Tutor tutor) {
        // Additional validation logic can be added here
        return tutorRepository.save(tutor);
    }

    public Tutor authenticateTutor(String email, String password) {
        Tutor tutor = findByEmail(email);
        if (tutor != null && tutor.getPassword().equals(password)) {
            return tutor;
        }
        return null;
    }
}
=======

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
>>>>>>> main
