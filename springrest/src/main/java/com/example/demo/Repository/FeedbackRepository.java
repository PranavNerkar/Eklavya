package com.example.demo.Repository;

import com.example.demo.Entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllByStudentId(int studentId);
}
