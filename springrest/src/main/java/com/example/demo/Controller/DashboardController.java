/*
 * package com.example.demo.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.demo.Dto.*;
 * 
 * import com.example.demo.Entities.*; import
 * com.example.demo.Service.StudentService;
 * 
 * import java.util.List; import java.util.stream.Collectors;
 * 
 * @RestController public class DashboardController {
 * 
 * private final StudentService studentService;
 * 
 * public DashboardController(StudentService studentService) {
 * this.studentService = studentService; }
 * 
 * @GetMapping("/student/{studentId}") public DashboardData
 * getDashboard(@PathVariable int studentId) { // Fetch dashboard data based on
 * the student's ID List<CourseDTO> allCourses =
 * studentService.getAllCourses().stream() .map(this::convertToDTO)
 * .collect(Collectors.toList());
 * 
 * List<TutorDTO> allTutors = studentService.getAllTutors().stream()
 * .map(this::convertToDTO) .collect(Collectors.toList());
 * 
 * List<CategoryDTO> allCategories = studentService.getAllCategories().stream()
 * .map(this::convertToDTO) .collect(Collectors.toList());
 * 
 * List<FeedbackDTO> feedback =
 * studentService.getAllFeedbackByStudentId(studentId).stream()
 * .map(this::convertToDTO) .collect(Collectors.toList());
 * 
 * // Assemble the dashboard data into a DashboardDataDTO object DashboardData
 * dashboardData = new DashboardData(allCategories, allCourses, allTutors,
 * feedback);
 * 
 * // Return the dashboard data in the response return dashboardData; }
 * 
 * 
 * // Mapping methods to convert entities to DTOs private CourseDTO
 * convertToDTO(Course course) { CourseDTO courseDTO = new CourseDTO();
 * courseDTO.setId(course.getId()); courseDTO.setName(course.getName()); //
 * Assuming CategoryDTO is available and has similar fields as Category
 * courseDTO.setCategory(convertToDTO(course.getCategory())); return courseDTO;
 * }
 * 
 * private TutorDTO convertToDTO(Tutor tutor) { TutorDTO tutorDTO = new
 * TutorDTO(); tutorDTO.setId(tutor.getTut_id());
 * tutorDTO.setFirstName(tutor.getFirst_name());
 * tutorDTO.setLastName(tutor.getLast_name());
 * tutorDTO.setEmail(tutor.getEmail());
 * tutorDTO.setContactNo(tutor.getContact_no());
 * tutorDTO.setAge(tutor.getAge()); tutorDTO.setGender(tutor.getGender());
 * tutorDTO.setAadharNo(tutor.getAadhar_no());
 * tutorDTO.setCountry(tutor.getCountry()); tutorDTO.setState(tutor.getState());
 * tutorDTO.setCity(tutor.getCity());
 * tutorDTO.setExperience(tutor.getExperience());
 * tutorDTO.setAboutYou(tutor.getAbout_you());
 * tutorDTO.setActive(tutor.getActive());
 * tutorDTO.setSecurityQuestion(convertToDTO(tutor.getSq()));
 * tutorDTO.setAnswer(tutor.getAnswer()); // Assuming LoginDTO is available and
 * has similar fields as Login
 * tutorDTO.setLogin(convertToDTO(tutor.getLogin())); return tutorDTO; }
 * 
 * private CategoryDTO convertToDTO(Category category) { CategoryDTO categoryDTO
 * = new CategoryDTO(); categoryDTO.setId(category.getId());
 * categoryDTO.setName(category.getName()); return categoryDTO; }
 * 
 * private FeedbackDTO convertToDTO(Feedback feedback) { FeedbackDTO feedbackDTO
 * = new FeedbackDTO(); feedbackDTO.setId(feedback.getId());
 * feedbackDTO.setStudentId(feedback.getStudentId());
 * feedbackDTO.setCourseId(feedback.getCourseId());
 * feedbackDTO.setRating(feedback.getRating());
 * feedbackDTO.setComments(feedback.getComments()); return feedbackDTO; } }
 */