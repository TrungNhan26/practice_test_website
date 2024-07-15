package com.exam.quiz_online.service.impl;

import com.exam.quiz_online.model.Subjects;
import com.exam.quiz_online.repository.SubjectsRepository;
import com.exam.quiz_online.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsServiceImpl implements SubjectsService {
    @Autowired
    private SubjectsRepository subjectsRepository;
    @Override
    public List<Subjects> listAll() {
        return subjectsRepository.findAll();
    }



}
