package dev.group.cybershield.quiz.controller;

import dev.group.cybershield.common.global.ResponseDTO;
import dev.group.cybershield.common.utils.ResponseUtil;
import dev.group.cybershield.entity.Questions;
import dev.group.cybershield.quiz.model.QuizReq;
import dev.group.cybershield.quiz.model.TestResponseDTO;
import dev.group.cybershield.quiz.service.QuizService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("/v1.0/getTest")
    public ResponseEntity<ResponseDTO> getTest(@RequestBody QuizReq reqBody) throws Exception {
        try{
            String endPoint = "getTest";
            Timestamp landingTime = Timestamp.valueOf(LocalDateTime.now());
            TestResponseDTO response = quizService.getTestData(reqBody);
            log.info("fetched data from database " + response);
            return ResponseUtil.sendResponse(response, landingTime, HttpStatus.OK, 200, "Successfully" , endPoint);
        } catch (Exception e) {
            log.error("unable to load test questions by getTest_API: {}", e.getMessage());
            throw e;
        }
    }

}
