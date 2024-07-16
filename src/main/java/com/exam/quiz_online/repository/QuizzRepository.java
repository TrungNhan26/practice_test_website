package com.exam.quiz_online.repository;

import com.exam.quiz_online.model.Quizzes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface QuizzRepository extends JpaRepository<Quizzes,Integer> {
    @Query("SELECT q FROM Quizzes q WHERE q.subject.subjectId = :subjectId")
    List<Quizzes> findQuizzesBySubjectId(Integer subjectId);

    @Query("SELECT COUNT(q) FROM Questions q WHERE q.quiz.quizId = :quizzId")
    Integer countQuestionsByQuizzId(Integer quizzId);
}
