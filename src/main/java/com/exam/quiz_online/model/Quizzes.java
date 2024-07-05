package com.exam.quiz_online.model;

import jakarta.persistence.*;

@Entity
public class Quizzes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizId;

    @Column(nullable = false, length = 100)
    private String quizName;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subjects subject;

    @Column(columnDefinition = "TEXT")
    private String description;

    private int totalMarks;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    private Users createdBy;

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Users getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Users createdBy) {
        this.createdBy = createdBy;
    }
}

