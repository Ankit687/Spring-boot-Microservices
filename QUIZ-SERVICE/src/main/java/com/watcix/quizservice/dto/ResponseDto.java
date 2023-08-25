package com.watcix.quizservice.dto;

public class ResponseDto {
    private Integer id;
    private String option;
    private boolean answer;

    public ResponseDto() {
    }

    public ResponseDto(Integer id, String option, boolean answer) {
        this.id = id;
        this.option = option;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "id=" + id +
                ", option='" + option + '\'' +
                ", answer=" + answer +
                '}';
    }
}
