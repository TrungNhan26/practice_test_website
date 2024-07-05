package com.exam.quiz_online.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedbackId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "quizId")
    private Quizzes quiz;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String feedbackText;

    private LocalDateTime dateGiven;

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Quizzes getQuiz() {
        return quiz;
    }

    public void setQuiz(Quizzes quiz) {
        this.quiz = quiz;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public LocalDateTime getDateGiven() {
        return dateGiven;
    }

    public void setDateGiven(LocalDateTime dateGiven) {
        this.dateGiven = dateGiven;
    }
}

