package com.watcix.quizservice.dto;

import java.util.List;

public class ResultDto {
    private int totalScore;
    private List<ResponseDto> responseDtoList;

    public ResultDto() {
    }

    public ResultDto(int totalScore, List<ResponseDto> responseDtoList) {
        this.totalScore = totalScore;
        this.responseDtoList = responseDtoList;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public List<ResponseDto> getResponseDtoList() {
        return responseDtoList;
    }

    public void setResponseDtoList(List<ResponseDto> responseDtoList) {
        this.responseDtoList = responseDtoList;
    }

    @Override
    public String toString() {
        return "ResultDto{" +
                "totalScore=" + totalScore +
                ", responseDtoList=" + responseDtoList +
                '}';
    }
}
