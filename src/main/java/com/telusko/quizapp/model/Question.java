package com.telusko.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Sam
 * @create 2024-05-04 5:42 PM
 */
@Data
@Entity
public class Question {

  @Id  //使下方的id为主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String questionTitle;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private String rightAnswer;
  private String difficultylevel;
  private String category;
}
