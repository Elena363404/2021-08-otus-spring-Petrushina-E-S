package ru.otus.elena363404;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.elena363404.domain.Question;
import ru.otus.elena363404.service.QuestionService;

public class Quiz {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
    QuestionService service = context.getBean(QuestionService.class);
    service.printAllQuestions();

  }
}
