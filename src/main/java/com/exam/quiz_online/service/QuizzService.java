package com.exam.quiz_online.service;

import com.exam.quiz_online.model.Quizzes;

import java.util.List;
import java.util.Map;

public interface QuizzService {
    List<Quizzes> listSubjectById(Integer subjectId);



    Map<Integer, Integer> countQuestionsByQuizzes(List<Quizzes> detail);
}
