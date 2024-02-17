package com.example.demo.Entities;

import jakarta.persistence.*;


@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;

    @Column()
    private String category_name;

    public Category() {
        // Default constructor
    }

    public Category(String category_name) {
        this.category_name = category_name;
    }

    // Getters and setters
    public int getId() {
        return category_id;
    }

    public void setId(int id) {
        this.category_id = id;
    }

    public String getName() {
        return category_name;
    }

    public void setName(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "Category [id=" + category_id + ", name=" + category_name + "]";
    }
}
