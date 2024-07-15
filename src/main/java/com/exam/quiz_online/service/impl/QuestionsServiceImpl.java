package com.exam.quiz_online.service.impl;

import com.exam.quiz_online.model.Questions;
import com.exam.quiz_online.repository.QuestionsRepository;
import com.exam.quiz_online.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;
    @Override
    public List<Questions> showAll() {
        return questionsRepository.findAll();
    }
}
