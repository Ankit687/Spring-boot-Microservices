package com.watcix.quizservice.feign;

import com.watcix.quizservice.dto.QuestionDto;
import com.watcix.quizservice.dto.ResponseDto;
import com.watcix.quizservice.dto.ResultDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizFeign {
    @GetMapping("generate")
    ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions);

    @PostMapping("getQuestions")
    ResponseEntity<List<QuestionDto>> getQuestionsFromId(@RequestBody List<Integer> questionIds);

    @PostMapping("getScore")
    ResponseEntity<ResultDto> getScore(@RequestBody List<ResponseDto> responses);
}
