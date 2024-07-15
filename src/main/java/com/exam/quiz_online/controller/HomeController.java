package com.exam.quiz_online.controller;

import com.exam.quiz_online.model.Subjects;
import com.exam.quiz_online.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private SubjectsService subjectsService;
    @GetMapping
    public String showHome(Model model){
        List<Subjects> subjectsList =subjectsService.listAll();
        model.addAttribute("subjectsList",subjectsList);
        return "index.html";
    }
}
