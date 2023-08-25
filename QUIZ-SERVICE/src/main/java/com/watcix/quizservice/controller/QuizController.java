package com.watcix.quizservice.controller;

import com.watcix.quizservice.dto.QuestionDto;
import com.watcix.quizservice.dto.QuizDto;
import com.watcix.quizservice.dto.ResponseDto;
import com.watcix.quizservice.dto.ResultDto;
import com.watcix.quizservice.service.QuizService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQuestions(), quizDto.getTitle());
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionDto>> getQuizQuestions(@PathVariable Integer id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit")
    public ResponseEntity<ResultDto> submitQuiz(@RequestBody List<ResponseDto> responses){
        return quizService.calculateResult(responses);
    }
}
