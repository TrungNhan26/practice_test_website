package com.exam.quiz_online.model;

import jakarta.persistence.*;

@Entity
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    @ManyToOne
    @JoinColumn(name = "resultId")
    private Results result;

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Questions question;

    @ManyToOne
    @JoinColumn(name = "selectedOptionId")
    private Options selectedOption;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public Results getResult() {
        return result;
    }

    public void setResult(Results result) {
        this.result = result;
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    public Options getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(Options selectedOption) {
        this.selectedOption = selectedOption;
    }
}

