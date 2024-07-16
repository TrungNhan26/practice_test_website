package com.exam.quiz_online.repository;

import com.exam.quiz_online.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Integer> {
    @Query("SELECT q FROM Questions q WHERE q.quiz.quizId = :quizzId")
    List<Questions> findQuestionsByQuiz(@Param("quizzId") Integer quizzId);
}
