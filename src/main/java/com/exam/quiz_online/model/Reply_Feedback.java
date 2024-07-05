package com.exam.quiz_online.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reply_Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int replyId;

    @ManyToOne
    @JoinColumn(name = "feedbackId")
    private Feedback feedback;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String replyText;

    private LocalDateTime dateReplied;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public LocalDateTime getDateReplied() {
        return dateReplied;
    }

    public void setDateReplied(LocalDateTime dateReplied) {
        this.dateReplied = dateReplied;
    }
}

