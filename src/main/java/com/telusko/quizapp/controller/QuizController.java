package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.model.QuestionWrapper;
import com.telusko.quizapp.model.Response;
import com.telusko.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sam
 * @create 2024-05-05 11:02 PM
 */

@RestController
@RequestMapping("quiz")
public class QuizController {

  @Autowired
  QuizService quizService;

  @PostMapping("create")
  public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
    return quizService.createQuiz(category, numQ, title);
  }

  @GetMapping("get/{id}")
  public ResponseEntity<List<QuestionWrapper>> getQuizQuestioinx(@PathVariable Integer id){
    return quizService.getQuizQuestions(id);
  }

  @GetMapping("submit/{id}")
  public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
    return quizService.calculateResult(id, responses);
  }
}
