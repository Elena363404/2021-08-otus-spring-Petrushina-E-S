package ru.otus.elena363404.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Question")
class QuestionTest {
  @DisplayName("корректно создается конструктором")
  @Test
  void shouldHaveCorrectConstructor() {
    Integer num = 1;
    List<Option> options = new ArrayList<Option>();
    options.add(new Option(num, "List"));
    options.add(new Option(num, "Set"));
    options.add(new Option(num, "Map"));
    Answer answer = new Answer(num, "Map");

    Question question = new Question(num, "Which of those doesn't have an index based structure?", options, answer);

    assertEquals(1, question.getNum());
    assertEquals(options, question.getOptions());
    assertEquals(answer, question.getAnswer());
    assertEquals("Which of those doesn't have an index based structure?", question.getQuestion());
  }
}