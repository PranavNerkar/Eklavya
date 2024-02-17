package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="content")
public class Content {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int content_id;
	
	@Column
	String title;
	
	@Column
	String description;

	
	public Content() {
		// TODO Auto-generated constructor stub
	}


	public Content(int content_id, String title, String description) {
		super();
		this.content_id = content_id;
		this.title = title;
		this.description = description;
	}
	
	

}
