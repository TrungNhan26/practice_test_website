package com.exam.quiz_online.controller;

import com.exam.quiz_online.model.Options;
import com.exam.quiz_online.model.Questions;
import com.exam.quiz_online.service.OptionsService;
import com.exam.quiz_online.service.QuestionsService;
import com.exam.quiz_online.service.QuizzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/quizz")
public class QuizzController {
    @Autowired
    private QuestionsService questionsService;

    @Autowired
    private OptionsService optionsService;

    @GetMapping
    public String show(Model model) {
        List<Questions> questionsList = questionsService.showAll();
        Map<Integer, List<Options>> questionOptionsMap = new HashMap<>();

        for (Questions question : questionsList) {
            Integer questionId = question.getQuestionId();
            List<Options> optionsList = optionsService.showOption(questionId);
            questionOptionsMap.put(questionId, optionsList);
        }

        model.addAttribute("questions", questionsList);
        model.addAttribute("questionOptionsMap", questionOptionsMap);
        return "Quizz.html";
    }
}

