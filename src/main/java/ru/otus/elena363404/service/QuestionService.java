package ru.otus.elena363404.service;

import ru.otus.elena363404.dao.QuestionDao;
import ru.otus.elena363404.domain.Question;

import java.util.List;

public class QuestionService {

  private final QuestionDao dao;

  public QuestionService(QuestionDao dao) {
    this.dao = dao;
  }

  public void printAllQuestions() {

    List<Question> questionList = dao.getAllQuestions();

    for (int i = 0; i < questionList.size(); i++) {
      System.out.println(questionList.get(i));
    }
  }

}
