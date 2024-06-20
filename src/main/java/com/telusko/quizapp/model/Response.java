package com.telusko.quizapp.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author Sam
 * @create 2024-05-06 1:05 AM
 */

@Data
@RequiredArgsConstructor
public class Response {
  private Integer id;
  private String response;
}
