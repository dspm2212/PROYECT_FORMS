package com.app.models;

import java.util.List;

/**
 * Represents a form with a title, description, and questions.
 */
public class Form {
    private int id;
    private String title;
    private String description;
    private List<Question> questions;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<Question> getQuestions() { return questions; }
    public void setQuestions(List<Question> questions) { this.questions = questions; }
}
