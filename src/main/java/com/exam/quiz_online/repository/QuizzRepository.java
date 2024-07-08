package com.exam.quiz_online.repository;

import com.exam.quiz_online.model.Quizzes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizzRepository extends JpaRepository<Quizzes,Integer> {
}
