package com.watcix.quizservice.service;

import com.watcix.quizservice.dto.QuestionDto;
import com.watcix.quizservice.dto.ResponseDto;
import com.watcix.quizservice.dto.ResultDto;
import com.watcix.quizservice.entity.Quiz;
import com.watcix.quizservice.feign.QuizFeign;
import com.watcix.quizservice.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;


    @Autowired
    private QuizFeign quizFeign;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Integer> questions = quizFeign.getQuestionsForQuiz(category, numQ).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizRepository.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionDto>> getQuizQuestions(Integer id) {
        Quiz quiz = quizRepository.findById(id).get();
        List<Integer> questionIds = quiz.getQuestionIds();
        ResponseEntity<List<QuestionDto>> questions = quizFeign.getQuestionsFromId(questionIds);
        return questions;

    }

    public ResponseEntity<ResultDto> calculateResult(List<ResponseDto> responses) {
        ResponseEntity<ResultDto> score = quizFeign.getScore(responses);
        return score;
    }
}
