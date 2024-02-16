package com.example.demo.Entities;

import jakarta.persistence.*;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Ensure that the name cannot be null in the database
    private String name;

    @ManyToOne(fetch = FetchType.LAZY) // Many courses can belong to one category
    private Category category;

    public Course() {
        // Default constructor
    }

    public Course(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", category=" + category + "]";
    }
}