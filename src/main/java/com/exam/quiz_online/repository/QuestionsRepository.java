package com.exam.quiz_online.repository;

import com.exam.quiz_online.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Integer> {
}
