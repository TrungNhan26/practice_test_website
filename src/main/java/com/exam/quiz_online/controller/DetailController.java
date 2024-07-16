package com.exam.quiz_online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/subject")
public class DetailController {
    @GetMapping
    public String showDetail() {
        return "class.html";
    }
}
