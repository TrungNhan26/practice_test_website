package com.exam.quiz_online.controller;

import com.exam.quiz_online.model.Quizzes;
import com.exam.quiz_online.model.Subjects;
import com.exam.quiz_online.service.QuizzService;
import com.exam.quiz_online.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.Subject;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private SubjectsService subjectsService;
    @Autowired
    private QuizzService quizzService;
    @GetMapping
    public String showHome(Model model){
        List<Subjects> subjectsList=subjectsService.listAll();
        model.addAttribute("subjectsList",subjectsList);
        return "index";
    }
    @GetMapping("/{subjectName}")
    public String showDetail(@PathVariable("subjectName") String subjectName, Model model) {
        Subjects subject = subjectsService.findByName(subjectName);
//        if (subject == null) {
//            // Xử lý trường hợp không tìm thấy môn học, ví dụ chuyển hướng đến trang lỗi
//            return "error";
//        }
        Integer subjectId = subject.getSubjectId();
        List<Quizzes> detail = quizzService.listSubjectById(subjectId);
        Map<Integer, Integer> questionsCountMap = quizzService.countQuestionsByQuizzes(detail);

        model.addAttribute("detail", detail);
        model.addAttribute("questionsCountMap", questionsCountMap);
        return "class";
    }
    @GetMapping("/header")
    public String showHeader(){
        return "header";
    }
    @GetMapping("/footer")
    public String showFooter(){
        return "footer";
    }
}
