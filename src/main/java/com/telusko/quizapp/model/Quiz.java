package com.telusko.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * @author Sam
 * @create 2024-05-05 11:16 PM
 */
@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questions;
}
