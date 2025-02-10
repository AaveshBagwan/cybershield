package dev.group.cybershield.common.utils;

import dev.group.cybershield.common.constants.CommonConstants;
import dev.group.cybershield.common.global.ResponseDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ResponseUtil {

    public static ResponseEntity<ResponseDTO> sendResponse(Object object, Timestamp landingTime, HttpStatus status, String endpoint) {
        ResponseDTO response = new ResponseDTO();
        response.getResponseMessage().setLandingTime(landingTime);
        response.getResponseMessage().setResponseTime(Timestamp.valueOf(LocalDateTime.now()));
        response.getResponseMessage().setStatus(CommonConstants.SUCCESS);
        response.getResponseMessage().setHttpStatus(status);
        response.getResponseMessage().setEndpoint(endpoint);
        response.setResponseData(object);
        return new ResponseEntity<ResponseDTO>(response, status);
    }

    public static ResponseEntity<ResponseDTO> sendResponse(HttpHeaders headers, Object object, Timestamp landingTime, HttpStatus status, String endpoint) {
        ResponseDTO response = new ResponseDTO();
        response.getResponseMessage().setLandingTime(landingTime);
        response.getResponseMessage().setResponseTime(Timestamp.valueOf(LocalDateTime.now()));
        response.getResponseMessage().setStatus(CommonConstants.SUCCESS);
        response.getResponseMessage().setHttpStatus(status);
        response.getResponseMessage().setEndpoint(endpoint);
        response.setResponseData(object);
        return new ResponseEntity<ResponseDTO>(response, headers, status);
    }

    public static ResponseEntity<ResponseDTO> sendErrorResponse(String errorCode, Object errorMessage, HttpStatus status, String endpoint) {
        ResponseDTO errorResponse = new ResponseDTO();
        errorResponse.getResponseMessage().setLandingTime(Timestamp.valueOf(LocalDateTime.now()));
        errorResponse.getResponseMessage().setResponseTime(Timestamp.valueOf(LocalDateTime.now()));
        errorResponse.getResponseMessage().setStatus(CommonConstants.FAILURE);
        errorResponse.getResponseMessage().setHttpStatus(status);
        errorResponse.getResponseMessage().setEndpoint(endpoint);
        errorResponse.getErrorData().setErrorCode(errorCode);
        errorResponse.getErrorData().setErrorMessage(errorMessage);
        return new ResponseEntity<ResponseDTO>(errorResponse, status);
    }

}
