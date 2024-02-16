package com.example.demo.Dto;

public class FeedbackDTO {
	private Long id;
    private Long studentId;
    private Long courseId;
    private int rating;
    private String comments;
	public FeedbackDTO(Long id, Long studentId, Long courseId, int rating, String comments) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.courseId = courseId;
		this.rating = rating;
		this.comments = comments;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "FeedbackDTO [id=" + id + ", studentId=" + studentId + ", courseId=" + courseId + ", rating=" + rating
				+ ", comments=" + comments + "]";
	}
    

}
