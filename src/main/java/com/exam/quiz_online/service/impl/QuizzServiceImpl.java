package com.exam.quiz_online.service.impl;

import com.exam.quiz_online.model.Quizzes;
import com.exam.quiz_online.repository.QuizzRepository;
import com.exam.quiz_online.service.QuizzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuizzServiceImpl implements QuizzService {
    @Autowired
    private QuizzRepository quizzRepository;

    @Override
    public List<Quizzes> listSubjectById(Integer subjectId) {
        return quizzRepository.findQuizzesBySubjectId(subjectId);
    }
    @Override
    public Map<Integer, Integer> countQuestionsByQuizzes(List<Quizzes> quizzes) {
        Map<Integer, Integer> questionsCountMap = new HashMap<>();
        for (Quizzes quiz : quizzes) {
            Integer questionCount = quizzRepository.countQuestionsByQuizzId(quiz.getQuizId());
            questionsCountMap.put(quiz.getQuizId(), questionCount);
        }
        return questionsCountMap;
    }
}
