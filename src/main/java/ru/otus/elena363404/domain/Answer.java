package ru.otus.elena363404.domain;

public class Answer {

  private Integer num;
  private String answer;

  public Answer(Integer num, String answer) {
    this.num = num;
    this.answer = answer;
  }

  @Override
  public String toString() {
    return "Answer{" +
      "num=" + num +
      ", answer='" + answer + '\'' + '}';
  }

  public String getAnswer() {
    return answer;
  }

  public Integer getNum() {
    return num;
  }
}
