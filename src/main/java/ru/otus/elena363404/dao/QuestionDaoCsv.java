package ru.otus.elena363404.dao;

import ru.otus.elena363404.domain.Answer;
import ru.otus.elena363404.domain.Option;
import ru.otus.elena363404.domain.Question;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.sql.Date;
import java.util.*;

public class QuestionDaoCsv implements QuestionDao {

  private final String quizPath;

  public QuestionDaoCsv(String quizPath) throws SQLException {
    this.quizPath = quizPath;
  }

  public List<Question> getAllQuestions() {

    List<Question> listQuestion = new ArrayList<Question>();

    try (InputStream is = getClass().getClassLoader().getResourceAsStream(quizPath)) {

      Scanner scanner = new Scanner(is);
      scanner.useDelimiter(",|\\r\\n");
      scanner.nextLine();
      while (scanner.hasNext()) {
        Integer num = scanner.nextInt();
        String question = scanner.next();
        List<String> options = Arrays.asList(scanner.next().split("/"));
        List<Option> listOptions = new ArrayList<Option>();

        for (String option: options) {
          listOptions.add(new Option(num, option));
        }

        listQuestion.add(new Question(num, question, listOptions, new Answer(num, scanner.next())));
      }

    } catch (IOException err) {
      System.out.println("Error while reading file");
    }

    return listQuestion;
  }
}
