package dev.group.cybershield.quiz.service;

import dev.group.cybershield.quiz.model.QuizDTO;

public interface QuizService {

    QuizDTO generateQuiz(Integer userId) throws Exception;

    QuizDTO getQuiz(QuizDTO reqBody) throws Exception;

    QuizDTO submitQuiz(QuizDTO reqBody) throws Exception;

    QuizDTO findQuizById(Integer quizId, boolean isView);
}
