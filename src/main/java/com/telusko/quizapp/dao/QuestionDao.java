package com.telusko.quizapp.dao;

import com.telusko.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sam
 * @create 2024-05-04 8:15 PM
 */

//JpaRepository需要两个参数，数据库中表格名，Primary key类型
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    //因为Category是表格中的column名，用以下方式来写方法名，Jpa能自动识别出按Category类型来分类
    List<Question> findByCategory(String category);


    @Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);
}
