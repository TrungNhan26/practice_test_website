package com.exam.quiz_online.service;

import com.exam.quiz_online.model.Questions;

import java.util.List;

public interface QuestionsService {
    List<Questions> showAll(Integer quizzId);
}
