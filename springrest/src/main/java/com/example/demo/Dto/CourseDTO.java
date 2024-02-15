package com.example.demo.Dto;

public class CourseDTO {

	private Long id;
    private String name;
    private Long categoryId;
    
    
	public CourseDTO() {
		super();
	}


	public CourseDTO(Long id, String name, Long categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
	}


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


	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}


	@Override
	public String toString() {
		return "CourseDTO [id=" + id + ", name=" + name + ", categoryId=" + categoryId + "]";
	}

    
    

}
