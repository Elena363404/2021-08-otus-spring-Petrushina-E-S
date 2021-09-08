package ru.otus.elena363404.domain;

public class Option {

  private Integer num;
  private String option;

  public Option(Integer num, String option) {
    this.num = num;
    this.option = option;
  }

  @Override
  public String toString() {
    return "Option{" +
      "num=" + num +
      ", option='" + option + '\'' +
      '}';
  }

  public String getOption() {
    return option;
  }

  public Integer getNum() {
    return num;
  }
}
