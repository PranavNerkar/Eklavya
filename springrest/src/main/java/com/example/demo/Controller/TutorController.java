package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Tutor;
import com.example.demo.Service.TutorService;

@RestController
@RequestMapping("/tutor")
@CrossOrigin(origins = "http://localhost:3000")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @PostMapping("/register")
    public ResponseEntity<?> registerTutor(@RequestBody Tutor tutor) {
        Tutor registeredTutor = tutorService.registerTutor(tutor);
        if (registeredTutor != null) {
            return ResponseEntity.ok("Tutor registration successful");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to register tutor");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginTutor(@RequestParam String email, @RequestParam String password) {
        Tutor tutor = tutorService.authenticateTutor(email, password);
        if (tutor != null) {
            return ResponseEntity.ok("Tutor login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
