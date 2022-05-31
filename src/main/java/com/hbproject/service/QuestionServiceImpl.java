package com.hbproject.service;

import com.hbproject.domain.Question;
import com.hbproject.repository.QuestionRepository;

public class QuestionServiceImpl implements IQuestionService {

    private final static QuestionRepository repo = new QuestionRepository();


    @Override
    public void saveQuestion(Question question) {
        repo.saveQuestion(question);
    }

    @Override
    public Question findById(Integer id) {
        return repo.getQuestion(id);

    }
}
