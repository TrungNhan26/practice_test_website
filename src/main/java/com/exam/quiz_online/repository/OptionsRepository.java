package com.exam.quiz_online.repository;

import com.exam.quiz_online.model.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionsRepository extends JpaRepository<Options,Integer> {
    @Query("SELECT o FROM Options o WHERE o.question.questionId = :questionId")
    List<Options> findByQuestionId(@Param("questionId") Integer questionId);


}
