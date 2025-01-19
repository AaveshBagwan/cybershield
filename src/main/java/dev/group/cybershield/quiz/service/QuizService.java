package dev.group.cybershield.quiz.service;

import dev.group.cybershield.quiz.model.*;

import java.util.List;

public interface QuizService {

    //getTest Services:
    public GetTestResponseDTO findUnattemptedTestByTestId(Integer userId) throws Exception;

    public GetTestResponseDTO fetchNewQuestionData(Integer userId) throws Exception;

    public GetTestResponseDTO getTestData(QuizReq reqBody) throws Exception;

    //submit Test Services:
    public SubmitTestRes getScore(SubmitTestReq reqBody) throws Exception;


    //view Test Services:
    List<ViewTestResponseDTO> viewTest(QuizReq reqBody);
}
