package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sam
 * @create 2024-05-04 12:53 PM
 */

@RestController
@RequestMapping("question")
public class QuestionController {

  @Autowired
  QuestionService questionService;
  @GetMapping("allQuestions")
  public ResponseEntity<List<Question>> getAllQuestions(){
    return questionService.getAllQuestions();
  }

  @GetMapping("category/{cat}")  // 大括号里的变量，通过下面的@PathVariable注解，传递给后面的形参category
  public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("cat") String category){
    return questionService.getQuestionsByCategory(category);
  }

  @PostMapping("add")
  public ResponseEntity<String> addQuestion(@RequestBody Question question){
    return questionService.addQuestion(question);
  }
}
