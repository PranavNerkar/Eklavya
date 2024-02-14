package com.example.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;



import jakarta.persistence.*;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@Entity
@AllArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Long courseId;

    private int rating;

    private String comments;
}
