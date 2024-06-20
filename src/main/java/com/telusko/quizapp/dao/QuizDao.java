package com.telusko.quizapp.dao;

import com.telusko.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sam
 * @create 2024-05-05 11:15 PM
 */
public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
