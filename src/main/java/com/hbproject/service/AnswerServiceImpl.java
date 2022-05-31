package com.hbproject.service;

import com.hbproject.domain.Answer;
import com.hbproject.repository.AnswerRepository;

public class AnswerServiceImpl implements IAnswerService {

    private static AnswerRepository repo = new AnswerRepository();

    @Override
    public void saveAnswer(Answer answer) {
        repo.saveAnswer(answer);
    }
}
