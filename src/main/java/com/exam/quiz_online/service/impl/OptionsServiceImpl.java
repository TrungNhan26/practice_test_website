package com.exam.quiz_online.service.impl;

import com.exam.quiz_online.model.Options;
import com.exam.quiz_online.repository.OptionsRepository;
import com.exam.quiz_online.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionsServiceImpl implements OptionsService {
    @Autowired
    private OptionsRepository optionsRepository;
    @Override
    public List<Options> showOption(Integer Id) {
        return optionsRepository.findByQuestionId(Id);
    }
}
