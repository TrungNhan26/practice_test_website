package com.exam.quiz_online.controller;

import com.exam.quiz_online.service.QuizzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quizz")
public class QuizzController {
    @Autowired
private QuizzService quizzService;
@GetMapping
public String index(){
    return "Quizz";
}
@GetMapping("/questions")
public String show(Model model){

    return "Quizz";
}
}
