package dev.group.cybershield.common.utils;

import dev.group.cybershield.common.constants.CommonConstants;
import dev.group.cybershield.common.global.ErrorData;
import dev.group.cybershield.common.global.ResponseDTO;
import dev.group.cybershield.common.global.ResponseMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ResponseUtil {

    public static ResponseEntity<ResponseDTO> sendResponse(Object object, Timestamp landingTime, HttpStatus status, String endpoint) {
        ResponseDTO response = new ResponseDTO();
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setLandingTime(landingTime);
        responseMessage.setResponseTime(Timestamp.valueOf(LocalDateTime.now()));
        responseMessage.setStatus(CommonConstants.SUCCESS);
        responseMessage.setHttpStatus(status);
        responseMessage.setEndpoint(endpoint);
        response.setResponseData(object);
        response.setResponseMessage(responseMessage);
        return new ResponseEntity<ResponseDTO>(response, status);
    }

    public static ResponseEntity<ResponseDTO> sendResponse(HttpHeaders headers, Object object, Timestamp landingTime, HttpStatus status, String endpoint) {
        ResponseDTO response = new ResponseDTO();
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setLandingTime(landingTime);
        responseMessage.setResponseTime(Timestamp.valueOf(LocalDateTime.now()));
        responseMessage.setStatus(CommonConstants.SUCCESS);
        responseMessage.setHttpStatus(status);
        responseMessage.setEndpoint(endpoint);
        response.setResponseData(object);
        response.setResponseMessage(responseMessage);
        return new ResponseEntity<ResponseDTO>(response, headers, status);
    }

    public static ResponseEntity<ResponseDTO> sendErrorResponse(String errorCode, Object errorMessage, HttpStatus status, String endpoint) {
        ResponseDTO errorResponse = new ResponseDTO();
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setLandingTime(Timestamp.valueOf(LocalDateTime.now()));
        responseMessage.setResponseTime(Timestamp.valueOf(LocalDateTime.now()));
        responseMessage.setStatus(CommonConstants.FAILURE);
        responseMessage.setHttpStatus(status);
        responseMessage.setEndpoint(endpoint);
        errorResponse.setResponseMessage(responseMessage);
        ErrorData errorData = new ErrorData();
        errorData.setErrorCode(errorCode);
        errorData.setErrorMessage(errorMessage);
        errorResponse.setErrorData(errorData);
        return new ResponseEntity<ResponseDTO>(errorResponse, status);
    }

}
